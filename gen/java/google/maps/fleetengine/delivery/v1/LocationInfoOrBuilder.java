// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/delivery/v1/delivery_vehicles.proto

package google.maps.fleetengine.delivery.v1;

public interface LocationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.LocationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location's coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng point = 1;</code>
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   * <pre>
   * The location's coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng point = 1;</code>
   * @return The point.
   */
  com.google.type.LatLng getPoint();
  /**
   * <pre>
   * The location's coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng point = 1;</code>
   */
  com.google.type.LatLngOrBuilder getPointOrBuilder();
}