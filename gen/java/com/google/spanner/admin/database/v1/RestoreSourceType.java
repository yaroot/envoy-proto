// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/**
 * <pre>
 * Indicates the type of the restore source.
 * </pre>
 *
 * Protobuf enum {@code google.spanner.admin.database.v1.RestoreSourceType}
 */
public enum RestoreSourceType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No restore associated.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * A backup was used as the source of the restore.
   * </pre>
   *
   * <code>BACKUP = 1;</code>
   */
  BACKUP(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No restore associated.
   * </pre>
   *
   * <code>TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A backup was used as the source of the restore.
   * </pre>
   *
   * <code>BACKUP = 1;</code>
   */
  public static final int BACKUP_VALUE = 1;


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
  public static RestoreSourceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RestoreSourceType forNumber(int value) {
    switch (value) {
      case 0: return TYPE_UNSPECIFIED;
      case 1: return BACKUP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RestoreSourceType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RestoreSourceType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RestoreSourceType>() {
          public RestoreSourceType findValueByNumber(int number) {
            return RestoreSourceType.forNumber(number);
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
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RestoreSourceType[] VALUES = values();

  public static RestoreSourceType valueOf(
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

  private RestoreSourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.spanner.admin.database.v1.RestoreSourceType)
}
