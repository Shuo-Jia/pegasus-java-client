// Copyright (c) 2017, Xiaomi, Inc.  All rights reserved.
// This source code is licensed under the Apache License Version 2.0, which
// can be found in the LICENSE file in the root directory of this source tree.
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.pegasus.apps;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-03-19")
public class mutate implements com.xiaomi.infra.pegasus.thrift.TBase<mutate, mutate._Fields>, java.io.Serializable, Cloneable, Comparable<mutate> {
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TStruct STRUCT_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TStruct("mutate");

  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField OPERATION_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("operation", com.xiaomi.infra.pegasus.thrift.protocol.TType.I32, (short)1);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField SORT_KEY_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("sort_key", com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, (short)2);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField VALUE_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("value", com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, (short)3);
  private static final com.xiaomi.infra.pegasus.thrift.protocol.TField SET_EXPIRE_TS_SECONDS_FIELD_DESC = new com.xiaomi.infra.pegasus.thrift.protocol.TField("set_expire_ts_seconds", com.xiaomi.infra.pegasus.thrift.protocol.TType.I32, (short)4);

  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new mutateStandardSchemeFactory();
  private static final com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new mutateTupleSchemeFactory();

  /**
   * 
   * @see mutate_operation
   */
  public mutate_operation operation; // required
  public com.xiaomi.infra.pegasus.base.blob sort_key; // required
  public com.xiaomi.infra.pegasus.base.blob value; // required
  public int set_expire_ts_seconds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements com.xiaomi.infra.pegasus.thrift.TFieldIdEnum {
    /**
     * 
     * @see mutate_operation
     */
    OPERATION((short)1, "operation"),
    SORT_KEY((short)2, "sort_key"),
    VALUE((short)3, "value"),
    SET_EXPIRE_TS_SECONDS((short)4, "set_expire_ts_seconds");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OPERATION
          return OPERATION;
        case 2: // SORT_KEY
          return SORT_KEY;
        case 3: // VALUE
          return VALUE;
        case 4: // SET_EXPIRE_TS_SECONDS
          return SET_EXPIRE_TS_SECONDS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SET_EXPIRE_TS_SECONDS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATION, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("operation", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.EnumMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.ENUM, mutate_operation.class)));
    tmpMap.put(_Fields.SORT_KEY, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("sort_key", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    tmpMap.put(_Fields.VALUE, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("value", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.StructMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    tmpMap.put(_Fields.SET_EXPIRE_TS_SECONDS, new com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData("set_expire_ts_seconds", com.xiaomi.infra.pegasus.thrift.TFieldRequirementType.DEFAULT, 
        new com.xiaomi.infra.pegasus.thrift.meta_data.FieldValueMetaData(com.xiaomi.infra.pegasus.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    com.xiaomi.infra.pegasus.thrift.meta_data.FieldMetaData.addStructMetaDataMap(mutate.class, metaDataMap);
  }

  public mutate() {
  }

  public mutate(
    mutate_operation operation,
    com.xiaomi.infra.pegasus.base.blob sort_key,
    com.xiaomi.infra.pegasus.base.blob value,
    int set_expire_ts_seconds)
  {
    this();
    this.operation = operation;
    this.sort_key = sort_key;
    this.value = value;
    this.set_expire_ts_seconds = set_expire_ts_seconds;
    setSet_expire_ts_secondsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public mutate(mutate other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOperation()) {
      this.operation = other.operation;
    }
    if (other.isSetSort_key()) {
      this.sort_key = new com.xiaomi.infra.pegasus.base.blob(other.sort_key);
    }
    if (other.isSetValue()) {
      this.value = new com.xiaomi.infra.pegasus.base.blob(other.value);
    }
    this.set_expire_ts_seconds = other.set_expire_ts_seconds;
  }

  public mutate deepCopy() {
    return new mutate(this);
  }

  @Override
  public void clear() {
    this.operation = null;
    this.sort_key = null;
    this.value = null;
    setSet_expire_ts_secondsIsSet(false);
    this.set_expire_ts_seconds = 0;
  }

  /**
   * 
   * @see mutate_operation
   */
  public mutate_operation getOperation() {
    return this.operation;
  }

  /**
   * 
   * @see mutate_operation
   */
  public mutate setOperation(mutate_operation operation) {
    this.operation = operation;
    return this;
  }

  public void unsetOperation() {
    this.operation = null;
  }

  /** Returns true if field operation is set (has been assigned a value) and false otherwise */
  public boolean isSetOperation() {
    return this.operation != null;
  }

  public void setOperationIsSet(boolean value) {
    if (!value) {
      this.operation = null;
    }
  }

  public com.xiaomi.infra.pegasus.base.blob getSort_key() {
    return this.sort_key;
  }

  public mutate setSort_key(com.xiaomi.infra.pegasus.base.blob sort_key) {
    this.sort_key = sort_key;
    return this;
  }

  public void unsetSort_key() {
    this.sort_key = null;
  }

  /** Returns true if field sort_key is set (has been assigned a value) and false otherwise */
  public boolean isSetSort_key() {
    return this.sort_key != null;
  }

  public void setSort_keyIsSet(boolean value) {
    if (!value) {
      this.sort_key = null;
    }
  }

  public com.xiaomi.infra.pegasus.base.blob getValue() {
    return this.value;
  }

  public mutate setValue(com.xiaomi.infra.pegasus.base.blob value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  public int getSet_expire_ts_seconds() {
    return this.set_expire_ts_seconds;
  }

  public mutate setSet_expire_ts_seconds(int set_expire_ts_seconds) {
    this.set_expire_ts_seconds = set_expire_ts_seconds;
    setSet_expire_ts_secondsIsSet(true);
    return this;
  }

  public void unsetSet_expire_ts_seconds() {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.clearBit(__isset_bitfield, __SET_EXPIRE_TS_SECONDS_ISSET_ID);
  }

  /** Returns true if field set_expire_ts_seconds is set (has been assigned a value) and false otherwise */
  public boolean isSetSet_expire_ts_seconds() {
    return com.xiaomi.infra.pegasus.thrift.EncodingUtils.testBit(__isset_bitfield, __SET_EXPIRE_TS_SECONDS_ISSET_ID);
  }

  public void setSet_expire_ts_secondsIsSet(boolean value) {
    __isset_bitfield = com.xiaomi.infra.pegasus.thrift.EncodingUtils.setBit(__isset_bitfield, __SET_EXPIRE_TS_SECONDS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OPERATION:
      if (value == null) {
        unsetOperation();
      } else {
        setOperation((mutate_operation)value);
      }
      break;

    case SORT_KEY:
      if (value == null) {
        unsetSort_key();
      } else {
        setSort_key((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    case SET_EXPIRE_TS_SECONDS:
      if (value == null) {
        unsetSet_expire_ts_seconds();
      } else {
        setSet_expire_ts_seconds((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATION:
      return getOperation();

    case SORT_KEY:
      return getSort_key();

    case VALUE:
      return getValue();

    case SET_EXPIRE_TS_SECONDS:
      return getSet_expire_ts_seconds();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OPERATION:
      return isSetOperation();
    case SORT_KEY:
      return isSetSort_key();
    case VALUE:
      return isSetValue();
    case SET_EXPIRE_TS_SECONDS:
      return isSetSet_expire_ts_seconds();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof mutate)
      return this.equals((mutate)that);
    return false;
  }

  public boolean equals(mutate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_operation = true && this.isSetOperation();
    boolean that_present_operation = true && that.isSetOperation();
    if (this_present_operation || that_present_operation) {
      if (!(this_present_operation && that_present_operation))
        return false;
      if (!this.operation.equals(that.operation))
        return false;
    }

    boolean this_present_sort_key = true && this.isSetSort_key();
    boolean that_present_sort_key = true && that.isSetSort_key();
    if (this_present_sort_key || that_present_sort_key) {
      if (!(this_present_sort_key && that_present_sort_key))
        return false;
      if (!this.sort_key.equals(that.sort_key))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_set_expire_ts_seconds = true;
    boolean that_present_set_expire_ts_seconds = true;
    if (this_present_set_expire_ts_seconds || that_present_set_expire_ts_seconds) {
      if (!(this_present_set_expire_ts_seconds && that_present_set_expire_ts_seconds))
        return false;
      if (this.set_expire_ts_seconds != that.set_expire_ts_seconds)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOperation()) ? 131071 : 524287);
    if (isSetOperation())
      hashCode = hashCode * 8191 + operation.getValue();

    hashCode = hashCode * 8191 + ((isSetSort_key()) ? 131071 : 524287);
    if (isSetSort_key())
      hashCode = hashCode * 8191 + sort_key.hashCode();

    hashCode = hashCode * 8191 + ((isSetValue()) ? 131071 : 524287);
    if (isSetValue())
      hashCode = hashCode * 8191 + value.hashCode();

    hashCode = hashCode * 8191 + set_expire_ts_seconds;

    return hashCode;
  }

  @Override
  public int compareTo(mutate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOperation()).compareTo(other.isSetOperation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperation()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.operation, other.operation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSort_key()).compareTo(other.isSetSort_key());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSort_key()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.sort_key, other.sort_key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSet_expire_ts_seconds()).compareTo(other.isSetSet_expire_ts_seconds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSet_expire_ts_seconds()) {
      lastComparison = com.xiaomi.infra.pegasus.thrift.TBaseHelper.compareTo(this.set_expire_ts_seconds, other.set_expire_ts_seconds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot) throws com.xiaomi.infra.pegasus.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("mutate(");
    boolean first = true;

    sb.append("operation:");
    if (this.operation == null) {
      sb.append("null");
    } else {
      sb.append(this.operation);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sort_key:");
    if (this.sort_key == null) {
      sb.append("null");
    } else {
      sb.append(this.sort_key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("set_expire_ts_seconds:");
    sb.append(this.set_expire_ts_seconds);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws com.xiaomi.infra.pegasus.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sort_key != null) {
      sort_key.validate();
    }
    if (value != null) {
      value.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(out)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new com.xiaomi.infra.pegasus.thrift.protocol.TCompactProtocol(new com.xiaomi.infra.pegasus.thrift.transport.TIOStreamTransport(in)));
    } catch (com.xiaomi.infra.pegasus.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class mutateStandardSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public mutateStandardScheme getScheme() {
      return new mutateStandardScheme();
    }
  }

  private static class mutateStandardScheme extends com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme<mutate> {

    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol iprot, mutate struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATION
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.I32) {
              struct.operation = com.xiaomi.infra.pegasus.apps.mutate_operation.findByValue(iprot.readI32());
              struct.setOperationIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SORT_KEY
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT) {
              struct.sort_key = new com.xiaomi.infra.pegasus.base.blob();
              struct.sort_key.read(iprot);
              struct.setSort_keyIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.STRUCT) {
              struct.value = new com.xiaomi.infra.pegasus.base.blob();
              struct.value.read(iprot);
              struct.setValueIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SET_EXPIRE_TS_SECONDS
            if (schemeField.type == com.xiaomi.infra.pegasus.thrift.protocol.TType.I32) {
              struct.set_expire_ts_seconds = iprot.readI32();
              struct.setSet_expire_ts_secondsIsSet(true);
            } else { 
              com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            com.xiaomi.infra.pegasus.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol oprot, mutate struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operation != null) {
        oprot.writeFieldBegin(OPERATION_FIELD_DESC);
        oprot.writeI32(struct.operation.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.sort_key != null) {
        oprot.writeFieldBegin(SORT_KEY_FIELD_DESC);
        struct.sort_key.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        struct.value.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SET_EXPIRE_TS_SECONDS_FIELD_DESC);
      oprot.writeI32(struct.set_expire_ts_seconds);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class mutateTupleSchemeFactory implements com.xiaomi.infra.pegasus.thrift.scheme.SchemeFactory {
    public mutateTupleScheme getScheme() {
      return new mutateTupleScheme();
    }
  }

  private static class mutateTupleScheme extends com.xiaomi.infra.pegasus.thrift.scheme.TupleScheme<mutate> {

    @Override
    public void write(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, mutate struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol oprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOperation()) {
        optionals.set(0);
      }
      if (struct.isSetSort_key()) {
        optionals.set(1);
      }
      if (struct.isSetValue()) {
        optionals.set(2);
      }
      if (struct.isSetSet_expire_ts_seconds()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetOperation()) {
        oprot.writeI32(struct.operation.getValue());
      }
      if (struct.isSetSort_key()) {
        struct.sort_key.write(oprot);
      }
      if (struct.isSetValue()) {
        struct.value.write(oprot);
      }
      if (struct.isSetSet_expire_ts_seconds()) {
        oprot.writeI32(struct.set_expire_ts_seconds);
      }
    }

    @Override
    public void read(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol prot, mutate struct) throws com.xiaomi.infra.pegasus.thrift.TException {
      com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol iprot = (com.xiaomi.infra.pegasus.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.operation = com.xiaomi.infra.pegasus.apps.mutate_operation.findByValue(iprot.readI32());
        struct.setOperationIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sort_key = new com.xiaomi.infra.pegasus.base.blob();
        struct.sort_key.read(iprot);
        struct.setSort_keyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.value = new com.xiaomi.infra.pegasus.base.blob();
        struct.value.read(iprot);
        struct.setValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.set_expire_ts_seconds = iprot.readI32();
        struct.setSet_expire_ts_secondsIsSet(true);
      }
    }
  }

  private static <S extends com.xiaomi.infra.pegasus.thrift.scheme.IScheme> S scheme(com.xiaomi.infra.pegasus.thrift.protocol.TProtocol proto) {
    return (com.xiaomi.infra.pegasus.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

