// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkservices/v1/endpoint_policy.proto

package com.google.cloud.networkservices.v1;

public interface UpdateEndpointPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.UpdateEndpointPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * EndpointPolicy resource by the update.
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
   * EndpointPolicy resource by the update.
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
   * EndpointPolicy resource by the update.
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
   * Required. Updated EndpointPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the endpointPolicy field is set.
   */
  boolean hasEndpointPolicy();
  /**
   * <pre>
   * Required. Updated EndpointPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endpointPolicy.
   */
  com.google.cloud.networkservices.v1.EndpointPolicy getEndpointPolicy();
  /**
   * <pre>
   * Required. Updated EndpointPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networkservices.v1.EndpointPolicy endpoint_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networkservices.v1.EndpointPolicyOrBuilder getEndpointPolicyOrBuilder();
}