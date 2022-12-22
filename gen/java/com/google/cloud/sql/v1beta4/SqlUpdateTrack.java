// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

/**
 * Protobuf enum {@code google.cloud.sql.v1beta4.SqlUpdateTrack}
 */
public enum SqlUpdateTrack
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * This is an unknown maintenance timing preference.
   * </pre>
   *
   * <code>SQL_UPDATE_TRACK_UNSPECIFIED = 0;</code>
   */
  SQL_UPDATE_TRACK_UNSPECIFIED(0),
  /**
   * <pre>
   * For instance update that requires a restart, this update track indicates
   * your instance prefer to restart for new version early in maintenance
   * window.
   * </pre>
   *
   * <code>canary = 1;</code>
   */
  canary(1),
  /**
   * <pre>
   * For instance update that requires a restart, this update track indicates
   * your instance prefer to let Cloud SQL choose the timing of restart (within
   * its Maintenance window, if applicable).
   * </pre>
   *
   * <code>stable = 2;</code>
   */
  stable(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * This is an unknown maintenance timing preference.
   * </pre>
   *
   * <code>SQL_UPDATE_TRACK_UNSPECIFIED = 0;</code>
   */
  public static final int SQL_UPDATE_TRACK_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * For instance update that requires a restart, this update track indicates
   * your instance prefer to restart for new version early in maintenance
   * window.
   * </pre>
   *
   * <code>canary = 1;</code>
   */
  public static final int canary_VALUE = 1;
  /**
   * <pre>
   * For instance update that requires a restart, this update track indicates
   * your instance prefer to let Cloud SQL choose the timing of restart (within
   * its Maintenance window, if applicable).
   * </pre>
   *
   * <code>stable = 2;</code>
   */
  public static final int stable_VALUE = 2;


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
  public static SqlUpdateTrack valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SqlUpdateTrack forNumber(int value) {
    switch (value) {
      case 0: return SQL_UPDATE_TRACK_UNSPECIFIED;
      case 1: return canary;
      case 2: return stable;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SqlUpdateTrack>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SqlUpdateTrack> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SqlUpdateTrack>() {
          public SqlUpdateTrack findValueByNumber(int number) {
            return SqlUpdateTrack.forNumber(number);
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
    return com.google.cloud.sql.v1beta4.CloudSqlResourcesProto.getDescriptor().getEnumTypes().get(13);
  }

  private static final SqlUpdateTrack[] VALUES = values();

  public static SqlUpdateTrack valueOf(
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

  private SqlUpdateTrack(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.sql.v1beta4.SqlUpdateTrack)
}
