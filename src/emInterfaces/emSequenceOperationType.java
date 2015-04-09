/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package emInterfaces;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * The EM controller plays back a set of operations. Think of it as a multitrack audio editing software. Logcally, each PIN has its own queue of operations. Each of these operations has a start and end time, and a set of parameters to define what each pin will be doing during that time. Operations are one of a few basic types:
 */
public enum emSequenceOperationType implements org.apache.thrift.TEnum {
  /**
   * Undefined, but here just to make sure there is a null type
   */
  emNULL(0),
  /**
   * Play back from buffer
   */
  ARBITRARY(1),
  /**
   * record from a pin and store into a buffer.
   */
  RECORD(2),
  /**
   * does nothing for a period of time. Used to pad operations
   */
  WAIT(3),
  /**
   * Use the waveFormType for signal generation
   */
  PREDEFINED(4),
  /**
   * Outputs a value of amplitude
   */
  CONSTANT(5),
  /**
   * Outputs a Binary value on based on amplitude. Amplitude=0, output 0, else 1
   */
  DIGITAL(6),
  /**
   * Outputs a value based on contents of register
   */
  CONSTANT_FROM_REGISTER(7);

  private final int value;

  private emSequenceOperationType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static emSequenceOperationType findByValue(int value) { 
    switch (value) {
      case 0:
        return emNULL;
      case 1:
        return ARBITRARY;
      case 2:
        return RECORD;
      case 3:
        return WAIT;
      case 4:
        return PREDEFINED;
      case 5:
        return CONSTANT;
      case 6:
        return DIGITAL;
      case 7:
        return CONSTANT_FROM_REGISTER;
      default:
        return null;
    }
  }
}