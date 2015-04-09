package nascence.vm.thrift;

import nascence.vm.VarElman;
import nascence.vm.VirtualMaterial;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
//import org.apache.thrift.server.TThreadPoolServer;
//import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
//import org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters;
import java.nio.file.Files;
import java.nio.file.FileSystems;


import emInterfaces.emEvolvableMotherboard;

public class VirtualMaterialServer {

	public static VirtualMaterialHandler handler;

	public static emEvolvableMotherboard.Processor processor;

        public static int portNumber;

	public static void main(String[] args) {
			VirtualMaterial vm = new VarElman(); // let's test with Elman RNN
            //((VarElman) vm).genVarElmanRandom(8, 32, 8, 5.0, 0.5, false, true); // at random
            /*
            byte[] ar = local.serializeToByteArray(); // get the weights
            */

            String[] weightsAsString = new String[0];
            try {
                weightsAsString = new String(Files.readAllBytes(FileSystems.getDefault().getPath("", "weights.txt"))).split(", ");
            } catch(Exception e) {
                e.printStackTrace();
            }
            byte[] weights = new byte[weightsAsString.length];
            for(int i = 0; i < weights.length; i++) { 
                weights[i] = Byte.parseByte(weightsAsString[i].trim());
            }

            vm.programme(weights); // prg. the VM
			
		try {
			handler = new VirtualMaterialHandler(vm);
			processor = new emEvolvableMotherboard.Processor(handler);

			portNumber = 9090; //default port
			if(args.length > 0){
			    portNumber = Integer.parseInt(args[0]);
			}

			Runnable simple = new Runnable() {
				public void run() {
				    simple(processor, portNumber);
				}
			};

			new Thread(simple).start();
		} catch (Exception x) {
			x.printStackTrace();
		}
	}

    public static void simple(emEvolvableMotherboard.Processor processor, int portNumber) {
		try {
			TServerTransport serverTransport = new TServerSocket(portNumber);
			TServer server = new TSimpleServer(
					new Args(serverTransport).processor(processor));

			System.out.println("Starting the VirtualMaterial server...");
			System.out.println(java.net.InetAddress.getLocalHost().getHostAddress()+":"+portNumber);

			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
