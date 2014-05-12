/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package emInterfaces;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Debug struct
 */
public class emDebugInfo implements org.apache.thrift.TBase<emDebugInfo, emDebugInfo._Fields>, java.io.Serializable, Cloneable, Comparable<emDebugInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("emDebugInfo");

  private static final org.apache.thrift.protocol.TField STATE_BLOB_FIELD_DESC = new org.apache.thrift.protocol.TField("stateBlob", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_BLOB_LENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("stateBlobLength", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new emDebugInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new emDebugInfoTupleSchemeFactory());
  }

  public ByteBuffer stateBlob; // required
  public int stateBlobLength; // required
  public Map<String,String> values; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATE_BLOB((short)1, "stateBlob"),
    STATE_BLOB_LENGTH((short)2, "stateBlobLength"),
    VALUES((short)3, "values");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATE_BLOB
          return STATE_BLOB;
        case 2: // STATE_BLOB_LENGTH
          return STATE_BLOB_LENGTH;
        case 3: // VALUES
          return VALUES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STATEBLOBLENGTH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE_BLOB, new org.apache.thrift.meta_data.FieldMetaData("stateBlob", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.STATE_BLOB_LENGTH, new org.apache.thrift.meta_data.FieldMetaData("stateBlobLength", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(emDebugInfo.class, metaDataMap);
  }

  public emDebugInfo() {
  }

  public emDebugInfo(
    ByteBuffer stateBlob,
    int stateBlobLength,
    Map<String,String> values)
  {
    this();
    this.stateBlob = stateBlob;
    this.stateBlobLength = stateBlobLength;
    setStateBlobLengthIsSet(true);
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public emDebugInfo(emDebugInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStateBlob()) {
      this.stateBlob = org.apache.thrift.TBaseHelper.copyBinary(other.stateBlob);
;
    }
    this.stateBlobLength = other.stateBlobLength;
    if (other.isSetValues()) {
      Map<String,String> __this__values = new HashMap<String,String>(other.values);
      this.values = __this__values;
    }
  }

  public emDebugInfo deepCopy() {
    return new emDebugInfo(this);
  }

  @Override
  public void clear() {
    this.stateBlob = null;
    setStateBlobLengthIsSet(false);
    this.stateBlobLength = 0;
    this.values = null;
  }

  public byte[] getStateBlob() {
    setStateBlob(org.apache.thrift.TBaseHelper.rightSize(stateBlob));
    return stateBlob == null ? null : stateBlob.array();
  }

  public ByteBuffer bufferForStateBlob() {
    return stateBlob;
  }

  public emDebugInfo setStateBlob(byte[] stateBlob) {
    setStateBlob(stateBlob == null ? (ByteBuffer)null : ByteBuffer.wrap(stateBlob));
    return this;
  }

  public emDebugInfo setStateBlob(ByteBuffer stateBlob) {
    this.stateBlob = stateBlob;
    return this;
  }

  public void unsetStateBlob() {
    this.stateBlob = null;
  }

  /** Returns true if field stateBlob is set (has been assigned a value) and false otherwise */
  public boolean isSetStateBlob() {
    return this.stateBlob != null;
  }

  public void setStateBlobIsSet(boolean value) {
    if (!value) {
      this.stateBlob = null;
    }
  }

  public int getStateBlobLength() {
    return this.stateBlobLength;
  }

  public emDebugInfo setStateBlobLength(int stateBlobLength) {
    this.stateBlobLength = stateBlobLength;
    setStateBlobLengthIsSet(true);
    return this;
  }

  public void unsetStateBlobLength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATEBLOBLENGTH_ISSET_ID);
  }

  /** Returns true if field stateBlobLength is set (has been assigned a value) and false otherwise */
  public boolean isSetStateBlobLength() {
    return EncodingUtils.testBit(__isset_bitfield, __STATEBLOBLENGTH_ISSET_ID);
  }

  public void setStateBlobLengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATEBLOBLENGTH_ISSET_ID, value);
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public void putToValues(String key, String val) {
    if (this.values == null) {
      this.values = new HashMap<String,String>();
    }
    this.values.put(key, val);
  }

  public Map<String,String> getValues() {
    return this.values;
  }

  public emDebugInfo setValues(Map<String,String> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE_BLOB:
      if (value == null) {
        unsetStateBlob();
      } else {
        setStateBlob((ByteBuffer)value);
      }
      break;

    case STATE_BLOB_LENGTH:
      if (value == null) {
        unsetStateBlobLength();
      } else {
        setStateBlobLength((Integer)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE_BLOB:
      return getStateBlob();

    case STATE_BLOB_LENGTH:
      return Integer.valueOf(getStateBlobLength());

    case VALUES:
      return getValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE_BLOB:
      return isSetStateBlob();
    case STATE_BLOB_LENGTH:
      return isSetStateBlobLength();
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof emDebugInfo)
      return this.equals((emDebugInfo)that);
    return false;
  }

  public boolean equals(emDebugInfo that) {
    if (that == null)
      return false;

    boolean this_present_stateBlob = true && this.isSetStateBlob();
    boolean that_present_stateBlob = true && that.isSetStateBlob();
    if (this_present_stateBlob || that_present_stateBlob) {
      if (!(this_present_stateBlob && that_present_stateBlob))
        return false;
      if (!this.stateBlob.equals(that.stateBlob))
        return false;
    }

    boolean this_present_stateBlobLength = true;
    boolean that_present_stateBlobLength = true;
    if (this_present_stateBlobLength || that_present_stateBlobLength) {
      if (!(this_present_stateBlobLength && that_present_stateBlobLength))
        return false;
      if (this.stateBlobLength != that.stateBlobLength)
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(emDebugInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStateBlob()).compareTo(other.isSetStateBlob());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateBlob()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stateBlob, other.stateBlob);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStateBlobLength()).compareTo(other.isSetStateBlobLength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateBlobLength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stateBlobLength, other.stateBlobLength);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("emDebugInfo(");
    boolean first = true;

    sb.append("stateBlob:");
    if (this.stateBlob == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.stateBlob, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stateBlobLength:");
    sb.append(this.stateBlobLength);
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      sb.append(this.values);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class emDebugInfoStandardSchemeFactory implements SchemeFactory {
    public emDebugInfoStandardScheme getScheme() {
      return new emDebugInfoStandardScheme();
    }
  }

  private static class emDebugInfoStandardScheme extends StandardScheme<emDebugInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, emDebugInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE_BLOB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stateBlob = iprot.readBinary();
              struct.setStateBlobIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATE_BLOB_LENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stateBlobLength = iprot.readI32();
              struct.setStateBlobLengthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.values = new HashMap<String,String>(2*_map8.size);
                for (int _i9 = 0; _i9 < _map8.size; ++_i9)
                {
                  String _key10;
                  String _val11;
                  _key10 = iprot.readString();
                  _val11 = iprot.readString();
                  struct.values.put(_key10, _val11);
                }
                iprot.readMapEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, emDebugInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stateBlob != null) {
        oprot.writeFieldBegin(STATE_BLOB_FIELD_DESC);
        oprot.writeBinary(struct.stateBlob);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATE_BLOB_LENGTH_FIELD_DESC);
      oprot.writeI32(struct.stateBlobLength);
      oprot.writeFieldEnd();
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.values.size()));
          for (Map.Entry<String, String> _iter12 : struct.values.entrySet())
          {
            oprot.writeString(_iter12.getKey());
            oprot.writeString(_iter12.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class emDebugInfoTupleSchemeFactory implements SchemeFactory {
    public emDebugInfoTupleScheme getScheme() {
      return new emDebugInfoTupleScheme();
    }
  }

  private static class emDebugInfoTupleScheme extends TupleScheme<emDebugInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, emDebugInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStateBlob()) {
        optionals.set(0);
      }
      if (struct.isSetStateBlobLength()) {
        optionals.set(1);
      }
      if (struct.isSetValues()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStateBlob()) {
        oprot.writeBinary(struct.stateBlob);
      }
      if (struct.isSetStateBlobLength()) {
        oprot.writeI32(struct.stateBlobLength);
      }
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (Map.Entry<String, String> _iter13 : struct.values.entrySet())
          {
            oprot.writeString(_iter13.getKey());
            oprot.writeString(_iter13.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, emDebugInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stateBlob = iprot.readBinary();
        struct.setStateBlobIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stateBlobLength = iprot.readI32();
        struct.setStateBlobLengthIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new HashMap<String,String>(2*_map14.size);
          for (int _i15 = 0; _i15 < _map14.size; ++_i15)
          {
            String _key16;
            String _val17;
            _key16 = iprot.readString();
            _val17 = iprot.readString();
            struct.values.put(_key16, _val17);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

}
