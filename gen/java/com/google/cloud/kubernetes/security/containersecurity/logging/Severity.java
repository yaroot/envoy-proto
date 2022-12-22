// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kubernetes/security/containersecurity_logging/logging.proto

package com.google.cloud.kubernetes.security.containersecurity.logging;

/**
 * <pre>
 * Severity is an enumeration of all the possible severities of a violation.
 * </pre>
 *
 * Protobuf enum {@code cloud.kubernetes.security.containersecurity_logging.Severity}
 */
public enum Severity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default value, only used to determine that nothing was specified.
   * </pre>
   *
   * <code>SEVERITY_UNSPECIFIED = 0;</code>
   */
  SEVERITY_UNSPECIFIED(0),
  /**
   * <pre>
   * SEVERITY_CRITICAL recommends taking action immediately.
   * </pre>
   *
   * <code>SEVERITY_CRITICAL = 1;</code>
   */
  SEVERITY_CRITICAL(1),
  /**
   * <pre>
   * SEVERITY_HIGH recommends taking action if possible.
   * </pre>
   *
   * <code>SEVERITY_HIGH = 2;</code>
   */
  SEVERITY_HIGH(2),
  /**
   * <pre>
   * SEVERITY_MEDIUM recommends investigation.
   * </pre>
   *
   * <code>SEVERITY_MEDIUM = 3;</code>
   */
  SEVERITY_MEDIUM(3),
  /**
   * <pre>
   * SEVERITY_LOW recommends being aware of the problem.
   * </pre>
   *
   * <code>SEVERITY_LOW = 4;</code>
   */
  SEVERITY_LOW(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default value, only used to determine that nothing was specified.
   * </pre>
   *
   * <code>SEVERITY_UNSPECIFIED = 0;</code>
   */
  public static final int SEVERITY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * SEVERITY_CRITICAL recommends taking action immediately.
   * </pre>
   *
   * <code>SEVERITY_CRITICAL = 1;</code>
   */
  public static final int SEVERITY_CRITICAL_VALUE = 1;
  /**
   * <pre>
   * SEVERITY_HIGH recommends taking action if possible.
   * </pre>
   *
   * <code>SEVERITY_HIGH = 2;</code>
   */
  public static final int SEVERITY_HIGH_VALUE = 2;
  /**
   * <pre>
   * SEVERITY_MEDIUM recommends investigation.
   * </pre>
   *
   * <code>SEVERITY_MEDIUM = 3;</code>
   */
  public static final int SEVERITY_MEDIUM_VALUE = 3;
  /**
   * <pre>
   * SEVERITY_LOW recommends being aware of the problem.
   * </pre>
   *
   * <code>SEVERITY_LOW = 4;</code>
   */
  public static final int SEVERITY_LOW_VALUE = 4;


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
  public static Severity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Severity forNumber(int value) {
    switch (value) {
      case 0: return SEVERITY_UNSPECIFIED;
      case 1: return SEVERITY_CRITICAL;
      case 2: return SEVERITY_HIGH;
      case 3: return SEVERITY_MEDIUM;
      case 4: return SEVERITY_LOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Severity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Severity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
          public Severity findValueByNumber(int number) {
            return Severity.forNumber(number);
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
    return com.google.cloud.kubernetes.security.containersecurity.logging.ContainerSecurityLoggingProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final Severity[] VALUES = values();

  public static Severity valueOf(
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

  private Severity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:cloud.kubernetes.security.containersecurity_logging.Severity)
}
