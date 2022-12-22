// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

package google.maps.fleetengine.delivery.v1;

public interface UpdateDeliveryVehicleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.UpdateDeliveryVehicleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The header.
   */
  google.maps.fleetengine.delivery.v1.DeliveryRequestHeader getHeader();
  /**
   * <pre>
   * Optional. The standard Delivery API request header.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Required. The `DeliveryVehicle` entity update to apply.
   * Note: You cannot update the name of the `DeliveryVehicle`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicle = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the deliveryVehicle field is set.
   */
  boolean hasDeliveryVehicle();
  /**
   * <pre>
   * Required. The `DeliveryVehicle` entity update to apply.
   * Note: You cannot update the name of the `DeliveryVehicle`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicle = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deliveryVehicle.
   */
  google.maps.fleetengine.delivery.v1.DeliveryVehicle getDeliveryVehicle();
  /**
   * <pre>
   * Required. The `DeliveryVehicle` entity update to apply.
   * Note: You cannot update the name of the `DeliveryVehicle`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicle = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.delivery.v1.DeliveryVehicleOrBuilder getDeliveryVehicleOrBuilder();

  /**
   * <pre>
   * Required. A field mask that indicates which `DeliveryVehicle` fields to
   * update. Note that the update_mask must contain at least one field.
   * This is a comma-separated list of fully qualified names of fields. Example:
   * `"remaining_vehicle_journey_segments"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. A field mask that indicates which `DeliveryVehicle` fields to
   * update. Note that the update_mask must contain at least one field.
   * This is a comma-separated list of fully qualified names of fields. Example:
   * `"remaining_vehicle_journey_segments"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. A field mask that indicates which `DeliveryVehicle` fields to
   * update. Note that the update_mask must contain at least one field.
   * This is a comma-separated list of fully qualified names of fields. Example:
   * `"remaining_vehicle_journey_segments"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}