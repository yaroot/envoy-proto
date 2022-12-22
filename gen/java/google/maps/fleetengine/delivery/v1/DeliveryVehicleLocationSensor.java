// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/delivery/v1/common.proto

package google.maps.fleetengine.delivery.v1;

/**
 * <pre>
 * The sensor or methodology used to determine the location.
 * </pre>
 *
 * Protobuf enum {@code maps.fleetengine.delivery.v1.DeliveryVehicleLocationSensor}
 */
public enum DeliveryVehicleLocationSensor
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The sensor is unspecified or unknown.
   * </pre>
   *
   * <code>UNKNOWN_SENSOR = 0;</code>
   */
  UNKNOWN_SENSOR(0),
  /**
   * <pre>
   * GPS or Assisted GPS.
   * </pre>
   *
   * <code>GPS = 1;</code>
   */
  GPS(1),
  /**
   * <pre>
   * Assisted GPS, cell tower ID, or WiFi access point.
   * </pre>
   *
   * <code>NETWORK = 2;</code>
   */
  NETWORK(2),
  /**
   * <pre>
   * Cell tower ID or WiFi access point.
   * </pre>
   *
   * <code>PASSIVE = 3;</code>
   */
  PASSIVE(3),
  /**
   * <pre>
   * A location signal snapped to the best road position.
   * </pre>
   *
   * <code>ROAD_SNAPPED_LOCATION_PROVIDER = 4;</code>
   */
  ROAD_SNAPPED_LOCATION_PROVIDER(4),
  /**
   * <pre>
   * The fused location provider in Google Play services.
   * </pre>
   *
   * <code>FUSED_LOCATION_PROVIDER = 100;</code>
   */
  FUSED_LOCATION_PROVIDER(100),
  /**
   * <pre>
   * The location provider on Apple operating systems.
   * </pre>
   *
   * <code>CORE_LOCATION = 200;</code>
   */
  CORE_LOCATION(200),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The sensor is unspecified or unknown.
   * </pre>
   *
   * <code>UNKNOWN_SENSOR = 0;</code>
   */
  public static final int UNKNOWN_SENSOR_VALUE = 0;
  /**
   * <pre>
   * GPS or Assisted GPS.
   * </pre>
   *
   * <code>GPS = 1;</code>
   */
  public static final int GPS_VALUE = 1;
  /**
   * <pre>
   * Assisted GPS, cell tower ID, or WiFi access point.
   * </pre>
   *
   * <code>NETWORK = 2;</code>
   */
  public static final int NETWORK_VALUE = 2;
  /**
   * <pre>
   * Cell tower ID or WiFi access point.
   * </pre>
   *
   * <code>PASSIVE = 3;</code>
   */
  public static final int PASSIVE_VALUE = 3;
  /**
   * <pre>
   * A location signal snapped to the best road position.
   * </pre>
   *
   * <code>ROAD_SNAPPED_LOCATION_PROVIDER = 4;</code>
   */
  public static final int ROAD_SNAPPED_LOCATION_PROVIDER_VALUE = 4;
  /**
   * <pre>
   * The fused location provider in Google Play services.
   * </pre>
   *
   * <code>FUSED_LOCATION_PROVIDER = 100;</code>
   */
  public static final int FUSED_LOCATION_PROVIDER_VALUE = 100;
  /**
   * <pre>
   * The location provider on Apple operating systems.
   * </pre>
   *
   * <code>CORE_LOCATION = 200;</code>
   */
  public static final int CORE_LOCATION_VALUE = 200;


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
  public static DeliveryVehicleLocationSensor valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeliveryVehicleLocationSensor forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_SENSOR;
      case 1: return GPS;
      case 2: return NETWORK;
      case 3: return PASSIVE;
      case 4: return ROAD_SNAPPED_LOCATION_PROVIDER;
      case 100: return FUSED_LOCATION_PROVIDER;
      case 200: return CORE_LOCATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeliveryVehicleLocationSensor>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DeliveryVehicleLocationSensor> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DeliveryVehicleLocationSensor>() {
          public DeliveryVehicleLocationSensor findValueByNumber(int number) {
            return DeliveryVehicleLocationSensor.forNumber(number);
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
    return google.maps.fleetengine.delivery.v1.Common.getDescriptor().getEnumTypes().get(0);
  }

  private static final DeliveryVehicleLocationSensor[] VALUES = values();

  public static DeliveryVehicleLocationSensor valueOf(
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

  private DeliveryVehicleLocationSensor(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maps.fleetengine.delivery.v1.DeliveryVehicleLocationSensor)
}

