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
 * Standard types of waveform that the signal generator can produce
 */
public enum emLogEventType implements org.apache.thrift.TEnum {
  /**
   * Undefined, here for consistency
   */
  emNULL(0),
  CONFIG(1),
  emERROR(2),
  MISC(3),
  COMMAND(4),
  RESPONSE(5),
  DONOTLOG(6),
  DISPLAYASMESSAGEBOX(7);

  private final int value;

  private emLogEventType(int value) {
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
  public static emLogEventType findByValue(int value) { 
    switch (value) {
      case 0:
        return emNULL;
      case 1:
        return CONFIG;
      case 2:
        return emERROR;
      case 3:
        return MISC;
      case 4:
        return COMMAND;
      case 5:
        return RESPONSE;
      case 6:
        return DONOTLOG;
      case 7:
        return DISPLAYASMESSAGEBOX;
      default:
        return null;
    }
  }
}
