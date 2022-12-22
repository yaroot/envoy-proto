// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

/**
 * Protobuf enum {@code google.cloud.sql.v1beta4.SqlInstanceType}
 */
public enum SqlInstanceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * This is an unknown Cloud SQL instance type.
   * </pre>
   *
   * <code>SQL_INSTANCE_TYPE_UNSPECIFIED = 0;</code>
   */
  SQL_INSTANCE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * A regular Cloud SQL instance that is not replicating from a primary
   * instance.
   * </pre>
   *
   * <code>CLOUD_SQL_INSTANCE = 1;</code>
   */
  CLOUD_SQL_INSTANCE(1),
  /**
   * <pre>
   * An instance running on the customer's premises that is not managed by
   * Cloud SQL.
   * </pre>
   *
   * <code>ON_PREMISES_INSTANCE = 2;</code>
   */
  ON_PREMISES_INSTANCE(2),
  /**
   * <pre>
   * A Cloud SQL instance acting as a read-replica.
   * </pre>
   *
   * <code>READ_REPLICA_INSTANCE = 3;</code>
   */
  READ_REPLICA_INSTANCE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * This is an unknown Cloud SQL instance type.
   * </pre>
   *
   * <code>SQL_INSTANCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int SQL_INSTANCE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A regular Cloud SQL instance that is not replicating from a primary
   * instance.
   * </pre>
   *
   * <code>CLOUD_SQL_INSTANCE = 1;</code>
   */
  public static final int CLOUD_SQL_INSTANCE_VALUE = 1;
  /**
   * <pre>
   * An instance running on the customer's premises that is not managed by
   * Cloud SQL.
   * </pre>
   *
   * <code>ON_PREMISES_INSTANCE = 2;</code>
   */
  public static final int ON_PREMISES_INSTANCE_VALUE = 2;
  /**
   * <pre>
   * A Cloud SQL instance acting as a read-replica.
   * </pre>
   *
   * <code>READ_REPLICA_INSTANCE = 3;</code>
   */
  public static final int READ_REPLICA_INSTANCE_VALUE = 3;


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
  public static SqlInstanceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SqlInstanceType forNumber(int value) {
    switch (value) {
      case 0: return SQL_INSTANCE_TYPE_UNSPECIFIED;
      case 1: return CLOUD_SQL_INSTANCE;
      case 2: return ON_PREMISES_INSTANCE;
      case 3: return READ_REPLICA_INSTANCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SqlInstanceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SqlInstanceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SqlInstanceType>() {
          public SqlInstanceType findValueByNumber(int number) {
            return SqlInstanceType.forNumber(number);
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
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final SqlInstanceType[] VALUES = values();

  public static SqlInstanceType valueOf(
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

  private SqlInstanceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.sql.v1beta4.SqlInstanceType)
}
