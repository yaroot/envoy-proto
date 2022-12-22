// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/connectors/v1/connection.proto

package com.google.cloud.connectors.v1;

/**
 * <pre>
 * All possible data types of a entity or action field.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.connectors.v1.DataType}
 */
public enum DataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Data type is not specified.
   * </pre>
   *
   * <code>DATA_TYPE_UNSPECIFIED = 0;</code>
   */
  DATA_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_INTEGER.
   * </pre>
   *
   * <code>DATA_TYPE_INT = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  DATA_TYPE_INT(1),
  /**
   * <pre>
   * Short integer(int16) data type.
   * </pre>
   *
   * <code>DATA_TYPE_SMALLINT = 2;</code>
   */
  DATA_TYPE_SMALLINT(2),
  /**
   * <pre>
   * Double data type.
   * </pre>
   *
   * <code>DATA_TYPE_DOUBLE = 3;</code>
   */
  DATA_TYPE_DOUBLE(3),
  /**
   * <pre>
   * Date data type.
   * </pre>
   *
   * <code>DATA_TYPE_DATE = 4;</code>
   */
  DATA_TYPE_DATE(4),
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_TIMESTAMP.
   * </pre>
   *
   * <code>DATA_TYPE_DATETIME = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  DATA_TYPE_DATETIME(5),
  /**
   * <pre>
   * Time data type.
   * </pre>
   *
   * <code>DATA_TYPE_TIME = 6;</code>
   */
  DATA_TYPE_TIME(6),
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_VARCHAR.
   * </pre>
   *
   * <code>DATA_TYPE_STRING = 7 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  DATA_TYPE_STRING(7),
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_BIGINT.
   * </pre>
   *
   * <code>DATA_TYPE_LONG = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  DATA_TYPE_LONG(8),
  /**
   * <pre>
   * Boolean data type.
   * </pre>
   *
   * <code>DATA_TYPE_BOOLEAN = 9;</code>
   */
  DATA_TYPE_BOOLEAN(9),
  /**
   * <pre>
   * Decimal data type.
   * </pre>
   *
   * <code>DATA_TYPE_DECIMAL = 10;</code>
   */
  DATA_TYPE_DECIMAL(10),
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_VARCHAR.
   * </pre>
   *
   * <code>DATA_TYPE_UUID = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  DATA_TYPE_UUID(11),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_BLOB = 12;</code>
   */
  DATA_TYPE_BLOB(12),
  /**
   * <pre>
   * Bit data type.
   * </pre>
   *
   * <code>DATA_TYPE_BIT = 13;</code>
   */
  DATA_TYPE_BIT(13),
  /**
   * <pre>
   * Small integer(int8) data type.
   * </pre>
   *
   * <code>DATA_TYPE_TINYINT = 14;</code>
   */
  DATA_TYPE_TINYINT(14),
  /**
   * <pre>
   * Integer(int32) data type.
   * </pre>
   *
   * <code>DATA_TYPE_INTEGER = 15;</code>
   */
  DATA_TYPE_INTEGER(15),
  /**
   * <pre>
   * Long integer(int64) data type.
   * </pre>
   *
   * <code>DATA_TYPE_BIGINT = 16;</code>
   */
  DATA_TYPE_BIGINT(16),
  /**
   * <pre>
   * Float data type.
   * </pre>
   *
   * <code>DATA_TYPE_FLOAT = 17;</code>
   */
  DATA_TYPE_FLOAT(17),
  /**
   * <pre>
   * Real data type.
   * </pre>
   *
   * <code>DATA_TYPE_REAL = 18;</code>
   */
  DATA_TYPE_REAL(18),
  /**
   * <pre>
   * Numeric data type.
   * </pre>
   *
   * <code>DATA_TYPE_NUMERIC = 19;</code>
   */
  DATA_TYPE_NUMERIC(19),
  /**
   * <pre>
   * Char data type.
   * </pre>
   *
   * <code>DATA_TYPE_CHAR = 20;</code>
   */
  DATA_TYPE_CHAR(20),
  /**
   * <pre>
   * Varchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_VARCHAR = 21;</code>
   */
  DATA_TYPE_VARCHAR(21),
  /**
   * <pre>
   * Longvarchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_LONGVARCHAR = 22;</code>
   */
  DATA_TYPE_LONGVARCHAR(22),
  /**
   * <pre>
   * Timestamp data type.
   * </pre>
   *
   * <code>DATA_TYPE_TIMESTAMP = 23;</code>
   */
  DATA_TYPE_TIMESTAMP(23),
  /**
   * <pre>
   * Nchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_NCHAR = 24;</code>
   */
  DATA_TYPE_NCHAR(24),
  /**
   * <pre>
   * Nvarchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_NVARCHAR = 25;</code>
   */
  DATA_TYPE_NVARCHAR(25),
  /**
   * <pre>
   * Longnvarchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_LONGNVARCHAR = 26;</code>
   */
  DATA_TYPE_LONGNVARCHAR(26),
  /**
   * <pre>
   * Null data type.
   * </pre>
   *
   * <code>DATA_TYPE_NULL = 27;</code>
   */
  DATA_TYPE_NULL(27),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_OTHER = 28;</code>
   */
  DATA_TYPE_OTHER(28),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_JAVA_OBJECT = 29;</code>
   */
  DATA_TYPE_JAVA_OBJECT(29),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_DISTINCT = 30;</code>
   */
  DATA_TYPE_DISTINCT(30),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_STRUCT = 31;</code>
   */
  DATA_TYPE_STRUCT(31),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_ARRAY = 32;</code>
   */
  DATA_TYPE_ARRAY(32),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_CLOB = 33;</code>
   */
  DATA_TYPE_CLOB(33),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_REF = 34;</code>
   */
  DATA_TYPE_REF(34),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_DATALINK = 35;</code>
   */
  DATA_TYPE_DATALINK(35),
  /**
   * <pre>
   * UNSUPPORTED! Row id data type.
   * </pre>
   *
   * <code>DATA_TYPE_ROWID = 36;</code>
   */
  DATA_TYPE_ROWID(36),
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_BINARY = 37;</code>
   */
  DATA_TYPE_BINARY(37),
  /**
   * <pre>
   * UNSUPPORTED! Variable binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_VARBINARY = 38;</code>
   */
  DATA_TYPE_VARBINARY(38),
  /**
   * <pre>
   * UNSUPPORTED! Long variable binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_LONGVARBINARY = 39;</code>
   */
  DATA_TYPE_LONGVARBINARY(39),
  /**
   * <pre>
   * UNSUPPORTED! NCLOB data type.
   * </pre>
   *
   * <code>DATA_TYPE_NCLOB = 40;</code>
   */
  DATA_TYPE_NCLOB(40),
  /**
   * <pre>
   * UNSUPPORTED! SQL XML data type is not supported.
   * </pre>
   *
   * <code>DATA_TYPE_SQLXML = 41;</code>
   */
  DATA_TYPE_SQLXML(41),
  /**
   * <pre>
   * UNSUPPORTED! Cursor reference type is not supported.
   * </pre>
   *
   * <code>DATA_TYPE_REF_CURSOR = 42;</code>
   */
  DATA_TYPE_REF_CURSOR(42),
  /**
   * <pre>
   * UNSUPPORTED! Use TIME or TIMESTAMP instead.
   * </pre>
   *
   * <code>DATA_TYPE_TIME_WITH_TIMEZONE = 43;</code>
   */
  DATA_TYPE_TIME_WITH_TIMEZONE(43),
  /**
   * <pre>
   * UNSUPPORTED! Use TIMESTAMP instead.
   * </pre>
   *
   * <code>DATA_TYPE_TIMESTAMP_WITH_TIMEZONE = 44;</code>
   */
  DATA_TYPE_TIMESTAMP_WITH_TIMEZONE(44),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Data type is not specified.
   * </pre>
   *
   * <code>DATA_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DATA_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_INTEGER.
   * </pre>
   *
   * <code>DATA_TYPE_INT = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int DATA_TYPE_INT_VALUE = 1;
  /**
   * <pre>
   * Short integer(int16) data type.
   * </pre>
   *
   * <code>DATA_TYPE_SMALLINT = 2;</code>
   */
  public static final int DATA_TYPE_SMALLINT_VALUE = 2;
  /**
   * <pre>
   * Double data type.
   * </pre>
   *
   * <code>DATA_TYPE_DOUBLE = 3;</code>
   */
  public static final int DATA_TYPE_DOUBLE_VALUE = 3;
  /**
   * <pre>
   * Date data type.
   * </pre>
   *
   * <code>DATA_TYPE_DATE = 4;</code>
   */
  public static final int DATA_TYPE_DATE_VALUE = 4;
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_TIMESTAMP.
   * </pre>
   *
   * <code>DATA_TYPE_DATETIME = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int DATA_TYPE_DATETIME_VALUE = 5;
  /**
   * <pre>
   * Time data type.
   * </pre>
   *
   * <code>DATA_TYPE_TIME = 6;</code>
   */
  public static final int DATA_TYPE_TIME_VALUE = 6;
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_VARCHAR.
   * </pre>
   *
   * <code>DATA_TYPE_STRING = 7 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int DATA_TYPE_STRING_VALUE = 7;
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_BIGINT.
   * </pre>
   *
   * <code>DATA_TYPE_LONG = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int DATA_TYPE_LONG_VALUE = 8;
  /**
   * <pre>
   * Boolean data type.
   * </pre>
   *
   * <code>DATA_TYPE_BOOLEAN = 9;</code>
   */
  public static final int DATA_TYPE_BOOLEAN_VALUE = 9;
  /**
   * <pre>
   * Decimal data type.
   * </pre>
   *
   * <code>DATA_TYPE_DECIMAL = 10;</code>
   */
  public static final int DATA_TYPE_DECIMAL_VALUE = 10;
  /**
   * <pre>
   * DEPRECATED! Use DATA_TYPE_VARCHAR.
   * </pre>
   *
   * <code>DATA_TYPE_UUID = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int DATA_TYPE_UUID_VALUE = 11;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_BLOB = 12;</code>
   */
  public static final int DATA_TYPE_BLOB_VALUE = 12;
  /**
   * <pre>
   * Bit data type.
   * </pre>
   *
   * <code>DATA_TYPE_BIT = 13;</code>
   */
  public static final int DATA_TYPE_BIT_VALUE = 13;
  /**
   * <pre>
   * Small integer(int8) data type.
   * </pre>
   *
   * <code>DATA_TYPE_TINYINT = 14;</code>
   */
  public static final int DATA_TYPE_TINYINT_VALUE = 14;
  /**
   * <pre>
   * Integer(int32) data type.
   * </pre>
   *
   * <code>DATA_TYPE_INTEGER = 15;</code>
   */
  public static final int DATA_TYPE_INTEGER_VALUE = 15;
  /**
   * <pre>
   * Long integer(int64) data type.
   * </pre>
   *
   * <code>DATA_TYPE_BIGINT = 16;</code>
   */
  public static final int DATA_TYPE_BIGINT_VALUE = 16;
  /**
   * <pre>
   * Float data type.
   * </pre>
   *
   * <code>DATA_TYPE_FLOAT = 17;</code>
   */
  public static final int DATA_TYPE_FLOAT_VALUE = 17;
  /**
   * <pre>
   * Real data type.
   * </pre>
   *
   * <code>DATA_TYPE_REAL = 18;</code>
   */
  public static final int DATA_TYPE_REAL_VALUE = 18;
  /**
   * <pre>
   * Numeric data type.
   * </pre>
   *
   * <code>DATA_TYPE_NUMERIC = 19;</code>
   */
  public static final int DATA_TYPE_NUMERIC_VALUE = 19;
  /**
   * <pre>
   * Char data type.
   * </pre>
   *
   * <code>DATA_TYPE_CHAR = 20;</code>
   */
  public static final int DATA_TYPE_CHAR_VALUE = 20;
  /**
   * <pre>
   * Varchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_VARCHAR = 21;</code>
   */
  public static final int DATA_TYPE_VARCHAR_VALUE = 21;
  /**
   * <pre>
   * Longvarchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_LONGVARCHAR = 22;</code>
   */
  public static final int DATA_TYPE_LONGVARCHAR_VALUE = 22;
  /**
   * <pre>
   * Timestamp data type.
   * </pre>
   *
   * <code>DATA_TYPE_TIMESTAMP = 23;</code>
   */
  public static final int DATA_TYPE_TIMESTAMP_VALUE = 23;
  /**
   * <pre>
   * Nchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_NCHAR = 24;</code>
   */
  public static final int DATA_TYPE_NCHAR_VALUE = 24;
  /**
   * <pre>
   * Nvarchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_NVARCHAR = 25;</code>
   */
  public static final int DATA_TYPE_NVARCHAR_VALUE = 25;
  /**
   * <pre>
   * Longnvarchar data type.
   * </pre>
   *
   * <code>DATA_TYPE_LONGNVARCHAR = 26;</code>
   */
  public static final int DATA_TYPE_LONGNVARCHAR_VALUE = 26;
  /**
   * <pre>
   * Null data type.
   * </pre>
   *
   * <code>DATA_TYPE_NULL = 27;</code>
   */
  public static final int DATA_TYPE_NULL_VALUE = 27;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_OTHER = 28;</code>
   */
  public static final int DATA_TYPE_OTHER_VALUE = 28;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_JAVA_OBJECT = 29;</code>
   */
  public static final int DATA_TYPE_JAVA_OBJECT_VALUE = 29;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_DISTINCT = 30;</code>
   */
  public static final int DATA_TYPE_DISTINCT_VALUE = 30;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_STRUCT = 31;</code>
   */
  public static final int DATA_TYPE_STRUCT_VALUE = 31;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_ARRAY = 32;</code>
   */
  public static final int DATA_TYPE_ARRAY_VALUE = 32;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_CLOB = 33;</code>
   */
  public static final int DATA_TYPE_CLOB_VALUE = 33;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_REF = 34;</code>
   */
  public static final int DATA_TYPE_REF_VALUE = 34;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_DATALINK = 35;</code>
   */
  public static final int DATA_TYPE_DATALINK_VALUE = 35;
  /**
   * <pre>
   * UNSUPPORTED! Row id data type.
   * </pre>
   *
   * <code>DATA_TYPE_ROWID = 36;</code>
   */
  public static final int DATA_TYPE_ROWID_VALUE = 36;
  /**
   * <pre>
   * UNSUPPORTED! Binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_BINARY = 37;</code>
   */
  public static final int DATA_TYPE_BINARY_VALUE = 37;
  /**
   * <pre>
   * UNSUPPORTED! Variable binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_VARBINARY = 38;</code>
   */
  public static final int DATA_TYPE_VARBINARY_VALUE = 38;
  /**
   * <pre>
   * UNSUPPORTED! Long variable binary data type.
   * </pre>
   *
   * <code>DATA_TYPE_LONGVARBINARY = 39;</code>
   */
  public static final int DATA_TYPE_LONGVARBINARY_VALUE = 39;
  /**
   * <pre>
   * UNSUPPORTED! NCLOB data type.
   * </pre>
   *
   * <code>DATA_TYPE_NCLOB = 40;</code>
   */
  public static final int DATA_TYPE_NCLOB_VALUE = 40;
  /**
   * <pre>
   * UNSUPPORTED! SQL XML data type is not supported.
   * </pre>
   *
   * <code>DATA_TYPE_SQLXML = 41;</code>
   */
  public static final int DATA_TYPE_SQLXML_VALUE = 41;
  /**
   * <pre>
   * UNSUPPORTED! Cursor reference type is not supported.
   * </pre>
   *
   * <code>DATA_TYPE_REF_CURSOR = 42;</code>
   */
  public static final int DATA_TYPE_REF_CURSOR_VALUE = 42;
  /**
   * <pre>
   * UNSUPPORTED! Use TIME or TIMESTAMP instead.
   * </pre>
   *
   * <code>DATA_TYPE_TIME_WITH_TIMEZONE = 43;</code>
   */
  public static final int DATA_TYPE_TIME_WITH_TIMEZONE_VALUE = 43;
  /**
   * <pre>
   * UNSUPPORTED! Use TIMESTAMP instead.
   * </pre>
   *
   * <code>DATA_TYPE_TIMESTAMP_WITH_TIMEZONE = 44;</code>
   */
  public static final int DATA_TYPE_TIMESTAMP_WITH_TIMEZONE_VALUE = 44;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0: return DATA_TYPE_UNSPECIFIED;
      case 1: return DATA_TYPE_INT;
      case 2: return DATA_TYPE_SMALLINT;
      case 3: return DATA_TYPE_DOUBLE;
      case 4: return DATA_TYPE_DATE;
      case 5: return DATA_TYPE_DATETIME;
      case 6: return DATA_TYPE_TIME;
      case 7: return DATA_TYPE_STRING;
      case 8: return DATA_TYPE_LONG;
      case 9: return DATA_TYPE_BOOLEAN;
      case 10: return DATA_TYPE_DECIMAL;
      case 11: return DATA_TYPE_UUID;
      case 12: return DATA_TYPE_BLOB;
      case 13: return DATA_TYPE_BIT;
      case 14: return DATA_TYPE_TINYINT;
      case 15: return DATA_TYPE_INTEGER;
      case 16: return DATA_TYPE_BIGINT;
      case 17: return DATA_TYPE_FLOAT;
      case 18: return DATA_TYPE_REAL;
      case 19: return DATA_TYPE_NUMERIC;
      case 20: return DATA_TYPE_CHAR;
      case 21: return DATA_TYPE_VARCHAR;
      case 22: return DATA_TYPE_LONGVARCHAR;
      case 23: return DATA_TYPE_TIMESTAMP;
      case 24: return DATA_TYPE_NCHAR;
      case 25: return DATA_TYPE_NVARCHAR;
      case 26: return DATA_TYPE_LONGNVARCHAR;
      case 27: return DATA_TYPE_NULL;
      case 28: return DATA_TYPE_OTHER;
      case 29: return DATA_TYPE_JAVA_OBJECT;
      case 30: return DATA_TYPE_DISTINCT;
      case 31: return DATA_TYPE_STRUCT;
      case 32: return DATA_TYPE_ARRAY;
      case 33: return DATA_TYPE_CLOB;
      case 34: return DATA_TYPE_REF;
      case 35: return DATA_TYPE_DATALINK;
      case 36: return DATA_TYPE_ROWID;
      case 37: return DATA_TYPE_BINARY;
      case 38: return DATA_TYPE_VARBINARY;
      case 39: return DATA_TYPE_LONGVARBINARY;
      case 40: return DATA_TYPE_NCLOB;
      case 41: return DATA_TYPE_SQLXML;
      case 42: return DATA_TYPE_REF_CURSOR;
      case 43: return DATA_TYPE_TIME_WITH_TIMEZONE;
      case 44: return DATA_TYPE_TIMESTAMP_WITH_TIMEZONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.connectors.v1.ConnectionProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.connectors.v1.DataType)
}
