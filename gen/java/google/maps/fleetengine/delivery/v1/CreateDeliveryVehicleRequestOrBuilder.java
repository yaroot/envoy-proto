// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

package google.maps.fleetengine.delivery.v1;

public interface CreateDeliveryVehicleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.CreateDeliveryVehicleRequest)
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
   * Required. Must be in the format `providers/{provider}`. The provider must be the
   * Google Cloud Project ID. For example, `sample-cloud-project`.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Must be in the format `providers/{provider}`. The provider must be the
   * Google Cloud Project ID. For example, `sample-cloud-project`.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Delivery Vehicle ID must be unique and subject to the following
   * restrictions:
   * * Must be a valid Unicode string.
   * * Limited to a maximum length of 64 characters.
   * * Normalized according to [Unicode Normalization Form C]
   * (http://www.unicode.org/reports/tr15/).
   * * May not contain any of the following ASCII characters: '/', ':', '?',
   * ',', or '#'.
   * </pre>
   *
   * <code>string delivery_vehicle_id = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deliveryVehicleId.
   */
  java.lang.String getDeliveryVehicleId();
  /**
   * <pre>
   * Required. The Delivery Vehicle ID must be unique and subject to the following
   * restrictions:
   * * Must be a valid Unicode string.
   * * Limited to a maximum length of 64 characters.
   * * Normalized according to [Unicode Normalization Form C]
   * (http://www.unicode.org/reports/tr15/).
   * * May not contain any of the following ASCII characters: '/', ':', '?',
   * ',', or '#'.
   * </pre>
   *
   * <code>string delivery_vehicle_id = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for deliveryVehicleId.
   */
  com.google.protobuf.ByteString
      getDeliveryVehicleIdBytes();

  /**
   * <pre>
   * Required. The `DeliveryVehicle` entity to create. When creating a new delivery
   * vehicle, you may set the following optional fields:
   * * last_location
   * * attributes
   * Note: The DeliveryVehicle's `name` field is ignored. All other
   * DeliveryVehicle fields must not be set; otherwise, an error is returned.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicle = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the deliveryVehicle field is set.
   */
  boolean hasDeliveryVehicle();
  /**
   * <pre>
   * Required. The `DeliveryVehicle` entity to create. When creating a new delivery
   * vehicle, you may set the following optional fields:
   * * last_location
   * * attributes
   * Note: The DeliveryVehicle's `name` field is ignored. All other
   * DeliveryVehicle fields must not be set; otherwise, an error is returned.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicle = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The deliveryVehicle.
   */
  google.maps.fleetengine.delivery.v1.DeliveryVehicle getDeliveryVehicle();
  /**
   * <pre>
   * Required. The `DeliveryVehicle` entity to create. When creating a new delivery
   * vehicle, you may set the following optional fields:
   * * last_location
   * * attributes
   * Note: The DeliveryVehicle's `name` field is ignored. All other
   * DeliveryVehicle fields must not be set; otherwise, an error is returned.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.DeliveryVehicle delivery_vehicle = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  google.maps.fleetengine.delivery.v1.DeliveryVehicleOrBuilder getDeliveryVehicleOrBuilder();
}