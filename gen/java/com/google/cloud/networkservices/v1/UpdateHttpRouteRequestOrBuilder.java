// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1/http_route.proto

package com.google.cloud.networkservices.v1;

public interface UpdateHttpRouteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.UpdateHttpRouteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * HttpRoute resource by the update.
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
   * HttpRoute resource by the update.
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
   * HttpRoute resource by the update.
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
   * Required. Updated HttpRoute resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.HttpRoute http_route = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the httpRoute field is set.
   */
  boolean hasHttpRoute();
  /**
   * <pre>
   * Required. Updated HttpRoute resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.HttpRoute http_route = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The httpRoute.
   */
  com.google.cloud.networkservices.v1.HttpRoute getHttpRoute();
  /**
   * <pre>
   * Required. Updated HttpRoute resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.HttpRoute http_route = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networkservices.v1.HttpRouteOrBuilder getHttpRouteOrBuilder();
}