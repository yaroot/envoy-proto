// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/appengine.proto

package com.google.appengine.v1beta;

/**
 * <pre>
 * Fields that should be returned when [Version][google.appengine.v1beta.Version] resources
 * are retrieved.
 * </pre>
 *
 * Protobuf enum {@code google.appengine.v1beta.VersionView}
 */
public enum VersionView
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Basic version information including scaling and inbound services,
   * but not detailed deployment information.
   * </pre>
   *
   * <code>BASIC = 0;</code>
   */
  BASIC(0),
  /**
   * <pre>
   * The information from `BASIC`, plus detailed information about the
   * deployment. This format is required when creating resources, but
   * is not returned in `Get` or `List` by default.
   * </pre>
   *
   * <code>FULL = 1;</code>
   */
  FULL(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Basic version information including scaling and inbound services,
   * but not detailed deployment information.
   * </pre>
   *
   * <code>BASIC = 0;</code>
   */
  public static final int BASIC_VALUE = 0;
  /**
   * <pre>
   * The information from `BASIC`, plus detailed information about the
   * deployment. This format is required when creating resources, but
   * is not returned in `Get` or `List` by default.
   * </pre>
   *
   * <code>FULL = 1;</code>
   */
  public static final int FULL_VALUE = 1;


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
  public static VersionView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VersionView forNumber(int value) {
    switch (value) {
      case 0: return BASIC;
      case 1: return FULL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VersionView>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VersionView> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VersionView>() {
          public VersionView findValueByNumber(int number) {
            return VersionView.forNumber(number);
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
    return com.google.appengine.v1beta.AppengineProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final VersionView[] VALUES = values();

  public static VersionView valueOf(
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

  private VersionView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.appengine.v1beta.VersionView)
}
