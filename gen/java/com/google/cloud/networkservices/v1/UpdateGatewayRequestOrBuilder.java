// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1/gateway.proto

package com.google.cloud.networkservices.v1;

public interface UpdateGatewayRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.UpdateGatewayRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * Gateway resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * Gateway resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * Gateway resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. Updated Gateway resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.Gateway gateway = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gateway field is set.
   */
  boolean hasGateway();
  /**
   * <pre>
   * Required. Updated Gateway resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.Gateway gateway = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gateway.
   */
  com.google.cloud.networkservices.v1.Gateway getGateway();
  /**
   * <pre>
   * Required. Updated Gateway resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.Gateway gateway = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networkservices.v1.GatewayOrBuilder getGatewayOrBuilder();
}