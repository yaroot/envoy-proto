// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/maneuver.proto

package com.google.maps.routing.v2;

/**
 * <pre>
 * A set of values that specify the navigation action to take for the current
 * step (e.g., turn left, merge, straight, etc.).
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.Maneuver}
 */
public enum Maneuver
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>MANEUVER_UNSPECIFIED = 0;</code>
   */
  MANEUVER_UNSPECIFIED(0),
  /**
   * <pre>
   * Turn slightly to the left.
   * </pre>
   *
   * <code>TURN_SLIGHT_LEFT = 1;</code>
   */
  TURN_SLIGHT_LEFT(1),
  /**
   * <pre>
   * Turn sharply to the left.
   * </pre>
   *
   * <code>TURN_SHARP_LEFT = 2;</code>
   */
  TURN_SHARP_LEFT(2),
  /**
   * <pre>
   * Make a left u-turn.
   * </pre>
   *
   * <code>UTURN_LEFT = 3;</code>
   */
  UTURN_LEFT(3),
  /**
   * <pre>
   * Turn left.
   * </pre>
   *
   * <code>TURN_LEFT = 4;</code>
   */
  TURN_LEFT(4),
  /**
   * <pre>
   * Turn slightly to the right.
   * </pre>
   *
   * <code>TURN_SLIGHT_RIGHT = 5;</code>
   */
  TURN_SLIGHT_RIGHT(5),
  /**
   * <pre>
   * Turn sharply to the right.
   * </pre>
   *
   * <code>TURN_SHARP_RIGHT = 6;</code>
   */
  TURN_SHARP_RIGHT(6),
  /**
   * <pre>
   * Make a right u-turn.
   * </pre>
   *
   * <code>UTURN_RIGHT = 7;</code>
   */
  UTURN_RIGHT(7),
  /**
   * <pre>
   * Turn right.
   * </pre>
   *
   * <code>TURN_RIGHT = 8;</code>
   */
  TURN_RIGHT(8),
  /**
   * <pre>
   * Go straight.
   * </pre>
   *
   * <code>STRAIGHT = 9;</code>
   */
  STRAIGHT(9),
  /**
   * <pre>
   * Take the left ramp.
   * </pre>
   *
   * <code>RAMP_LEFT = 10;</code>
   */
  RAMP_LEFT(10),
  /**
   * <pre>
   * Take the right ramp.
   * </pre>
   *
   * <code>RAMP_RIGHT = 11;</code>
   */
  RAMP_RIGHT(11),
  /**
   * <pre>
   * Merge into traffic.
   * </pre>
   *
   * <code>MERGE = 12;</code>
   */
  MERGE(12),
  /**
   * <pre>
   * Take the left fork.
   * </pre>
   *
   * <code>FORK_LEFT = 13;</code>
   */
  FORK_LEFT(13),
  /**
   * <pre>
   * Take the right fork.
   * </pre>
   *
   * <code>FORK_RIGHT = 14;</code>
   */
  FORK_RIGHT(14),
  /**
   * <pre>
   * Take the ferry.
   * </pre>
   *
   * <code>FERRY = 15;</code>
   */
  FERRY(15),
  /**
   * <pre>
   * Take the train leading onto the ferry.
   * </pre>
   *
   * <code>FERRY_TRAIN = 16;</code>
   */
  FERRY_TRAIN(16),
  /**
   * <pre>
   * Turn left at the roundabout.
   * </pre>
   *
   * <code>ROUNDABOUT_LEFT = 17;</code>
   */
  ROUNDABOUT_LEFT(17),
  /**
   * <pre>
   * Turn right at the roundabout.
   * </pre>
   *
   * <code>ROUNDABOUT_RIGHT = 18;</code>
   */
  ROUNDABOUT_RIGHT(18),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>MANEUVER_UNSPECIFIED = 0;</code>
   */
  public static final int MANEUVER_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Turn slightly to the left.
   * </pre>
   *
   * <code>TURN_SLIGHT_LEFT = 1;</code>
   */
  public static final int TURN_SLIGHT_LEFT_VALUE = 1;
  /**
   * <pre>
   * Turn sharply to the left.
   * </pre>
   *
   * <code>TURN_SHARP_LEFT = 2;</code>
   */
  public static final int TURN_SHARP_LEFT_VALUE = 2;
  /**
   * <pre>
   * Make a left u-turn.
   * </pre>
   *
   * <code>UTURN_LEFT = 3;</code>
   */
  public static final int UTURN_LEFT_VALUE = 3;
  /**
   * <pre>
   * Turn left.
   * </pre>
   *
   * <code>TURN_LEFT = 4;</code>
   */
  public static final int TURN_LEFT_VALUE = 4;
  /**
   * <pre>
   * Turn slightly to the right.
   * </pre>
   *
   * <code>TURN_SLIGHT_RIGHT = 5;</code>
   */
  public static final int TURN_SLIGHT_RIGHT_VALUE = 5;
  /**
   * <pre>
   * Turn sharply to the right.
   * </pre>
   *
   * <code>TURN_SHARP_RIGHT = 6;</code>
   */
  public static final int TURN_SHARP_RIGHT_VALUE = 6;
  /**
   * <pre>
   * Make a right u-turn.
   * </pre>
   *
   * <code>UTURN_RIGHT = 7;</code>
   */
  public static final int UTURN_RIGHT_VALUE = 7;
  /**
   * <pre>
   * Turn right.
   * </pre>
   *
   * <code>TURN_RIGHT = 8;</code>
   */
  public static final int TURN_RIGHT_VALUE = 8;
  /**
   * <pre>
   * Go straight.
   * </pre>
   *
   * <code>STRAIGHT = 9;</code>
   */
  public static final int STRAIGHT_VALUE = 9;
  /**
   * <pre>
   * Take the left ramp.
   * </pre>
   *
   * <code>RAMP_LEFT = 10;</code>
   */
  public static final int RAMP_LEFT_VALUE = 10;
  /**
   * <pre>
   * Take the right ramp.
   * </pre>
   *
   * <code>RAMP_RIGHT = 11;</code>
   */
  public static final int RAMP_RIGHT_VALUE = 11;
  /**
   * <pre>
   * Merge into traffic.
   * </pre>
   *
   * <code>MERGE = 12;</code>
   */
  public static final int MERGE_VALUE = 12;
  /**
   * <pre>
   * Take the left fork.
   * </pre>
   *
   * <code>FORK_LEFT = 13;</code>
   */
  public static final int FORK_LEFT_VALUE = 13;
  /**
   * <pre>
   * Take the right fork.
   * </pre>
   *
   * <code>FORK_RIGHT = 14;</code>
   */
  public static final int FORK_RIGHT_VALUE = 14;
  /**
   * <pre>
   * Take the ferry.
   * </pre>
   *
   * <code>FERRY = 15;</code>
   */
  public static final int FERRY_VALUE = 15;
  /**
   * <pre>
   * Take the train leading onto the ferry.
   * </pre>
   *
   * <code>FERRY_TRAIN = 16;</code>
   */
  public static final int FERRY_TRAIN_VALUE = 16;
  /**
   * <pre>
   * Turn left at the roundabout.
   * </pre>
   *
   * <code>ROUNDABOUT_LEFT = 17;</code>
   */
  public static final int ROUNDABOUT_LEFT_VALUE = 17;
  /**
   * <pre>
   * Turn right at the roundabout.
   * </pre>
   *
   * <code>ROUNDABOUT_RIGHT = 18;</code>
   */
  public static final int ROUNDABOUT_RIGHT_VALUE = 18;


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
  public static Maneuver valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Maneuver forNumber(int value) {
    switch (value) {
      case 0: return MANEUVER_UNSPECIFIED;
      case 1: return TURN_SLIGHT_LEFT;
      case 2: return TURN_SHARP_LEFT;
      case 3: return UTURN_LEFT;
      case 4: return TURN_LEFT;
      case 5: return TURN_SLIGHT_RIGHT;
      case 6: return TURN_SHARP_RIGHT;
      case 7: return UTURN_RIGHT;
      case 8: return TURN_RIGHT;
      case 9: return STRAIGHT;
      case 10: return RAMP_LEFT;
      case 11: return RAMP_RIGHT;
      case 12: return MERGE;
      case 13: return FORK_LEFT;
      case 14: return FORK_RIGHT;
      case 15: return FERRY;
      case 16: return FERRY_TRAIN;
      case 17: return ROUNDABOUT_LEFT;
      case 18: return ROUNDABOUT_RIGHT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Maneuver>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Maneuver> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Maneuver>() {
          public Maneuver findValueByNumber(int number) {
            return Maneuver.forNumber(number);
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
    return com.google.maps.routing.v2.ManeuverProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Maneuver[] VALUES = values();

  public static Maneuver valueOf(
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

  private Maneuver(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.Maneuver)
}
