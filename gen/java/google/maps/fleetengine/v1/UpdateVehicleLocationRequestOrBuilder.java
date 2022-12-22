// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/v1/vehicle_api.proto

package google.maps.fleetengine.v1;

@java.lang.Deprecated public interface UpdateVehicleLocationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.UpdateVehicleLocationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   * @return The header.
   */
  google.maps.fleetengine.v1.RequestHeader getHeader();
  /**
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   */
  google.maps.fleetengine.v1.RequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/vehicles/{vehicle}`.
   * The {provider} must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Must be in the format
   * `providers/{provider}/vehicles/{vehicle}`.
   * The {provider} must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The vehicle's most recent location.  The `location` and
   * `update_time` subfields are required.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleLocation current_location = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the currentLocation field is set.
   */
  boolean hasCurrentLocation();
  /**
   * <pre>
   * Required. The vehicle's most recent location.  The `location` and
   * `update_time` subfields are required.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleLocation current_location = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The currentLocation.
   */
  google.maps.fleetengine.v1.VehicleLocation getCurrentLocation();
  /**
   * <pre>
   * Required. The vehicle's most recent location.  The `location` and
   * `update_time` subfields are required.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleLocation current_location = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.v1.VehicleLocationOrBuilder getCurrentLocationOrBuilder();

  /**
   * <pre>
   * Set the vehicle's state to either `ONLINE` or `OFFLINE`.
   * If set to `UNKNOWN_VEHICLE_STATE`, the vehicle's state will not be altered.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleState current_state = 5;</code>
   * @return The enum numeric value on the wire for currentState.
   */
  int getCurrentStateValue();
  /**
   * <pre>
   * Set the vehicle's state to either `ONLINE` or `OFFLINE`.
   * If set to `UNKNOWN_VEHICLE_STATE`, the vehicle's state will not be altered.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.VehicleState current_state = 5;</code>
   * @return The currentState.
   */
  google.maps.fleetengine.v1.VehicleState getCurrentState();
}
