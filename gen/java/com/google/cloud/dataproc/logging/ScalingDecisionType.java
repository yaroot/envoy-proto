// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/logging/autoscaler_log.proto

package com.google.cloud.dataproc.logging;

/**
 * <pre>
 * The Autoscaling decision type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dataproc.logging.ScalingDecisionType}
 */
public enum ScalingDecisionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SCALING_DECISION_TYPE_UNSPECIFIED = 0;</code>
   */
  SCALING_DECISION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Increase the number of primary and/or secondary workers.
   * </pre>
   *
   * <code>SCALE_UP = 1;</code>
   */
  SCALE_UP(1),
  /**
   * <pre>
   * Decrease the number of primary and/or secondary workers.
   * </pre>
   *
   * <code>SCALE_DOWN = 2;</code>
   */
  SCALE_DOWN(2),
  /**
   * <pre>
   * Not changing the number of primary or secondary workers.
   * </pre>
   *
   * <code>NO_SCALE = 3;</code>
   */
  NO_SCALE(3),
  /**
   * <pre>
   * Scale the primary and secondary worker groups in different directions.
   * </pre>
   *
   * <code>MIXED = 4;</code>
   */
  MIXED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SCALING_DECISION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int SCALING_DECISION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Increase the number of primary and/or secondary workers.
   * </pre>
   *
   * <code>SCALE_UP = 1;</code>
   */
  public static final int SCALE_UP_VALUE = 1;
  /**
   * <pre>
   * Decrease the number of primary and/or secondary workers.
   * </pre>
   *
   * <code>SCALE_DOWN = 2;</code>
   */
  public static final int SCALE_DOWN_VALUE = 2;
  /**
   * <pre>
   * Not changing the number of primary or secondary workers.
   * </pre>
   *
   * <code>NO_SCALE = 3;</code>
   */
  public static final int NO_SCALE_VALUE = 3;
  /**
   * <pre>
   * Scale the primary and secondary worker groups in different directions.
   * </pre>
   *
   * <code>MIXED = 4;</code>
   */
  public static final int MIXED_VALUE = 4;


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
  public static ScalingDecisionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ScalingDecisionType forNumber(int value) {
    switch (value) {
      case 0: return SCALING_DECISION_TYPE_UNSPECIFIED;
      case 1: return SCALE_UP;
      case 2: return SCALE_DOWN;
      case 3: return NO_SCALE;
      case 4: return MIXED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ScalingDecisionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ScalingDecisionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ScalingDecisionType>() {
          public ScalingDecisionType findValueByNumber(int number) {
            return ScalingDecisionType.forNumber(number);
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
    return com.google.cloud.dataproc.logging.AutoscalerLogOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final ScalingDecisionType[] VALUES = values();

  public static ScalingDecisionType valueOf(
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

  private ScalingDecisionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.logging.ScalingDecisionType)
}
