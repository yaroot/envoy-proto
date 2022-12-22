// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface UpdateSpokeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.UpdateSpokeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. In the case of an update to an existing spoke, field mask is used
   * to specify the fields to be overwritten. The fields specified in the
   * update_mask are relative to the resource, not the full request. A field is
   * overwritten if it is in the mask. If the user does not provide a mask, then
   * all fields are overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. In the case of an update to an existing spoke, field mask is used
   * to specify the fields to be overwritten. The fields specified in the
   * update_mask are relative to the resource, not the full request. A field is
   * overwritten if it is in the mask. If the user does not provide a mask, then
   * all fields are overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. In the case of an update to an existing spoke, field mask is used
   * to specify the fields to be overwritten. The fields specified in the
   * update_mask are relative to the resource, not the full request. A field is
   * overwritten if it is in the mask. If the user does not provide a mask, then
   * all fields are overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. The state that the spoke should be in after the update.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the spoke field is set.
   */
  boolean hasSpoke();
  /**
   * <pre>
   * Required. The state that the spoke should be in after the update.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spoke.
   */
  com.google.cloud.networkconnectivity.v1.Spoke getSpoke();
  /**
   * <pre>
   * Required. The state that the spoke should be in after the update.
   * </pre>
   *
   * <code>.google.cloud.networkconnectivity.v1.Spoke spoke = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeOrBuilder getSpokeOrBuilder();

  /**
   * <pre>
   * Optional. A unique request ID (optional). If you specify this ID, you can
   * use it in cases when you need to retry your request. When you need to
   * retry, this ID lets the server know that it can ignore the request if it
   * has already been completed. The server guarantees that for at least 60
   * minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check to see whether the original operation
   * was received. If it was, the server ignores the second request. This
   * behavior prevents clients from mistakenly creating duplicate commitments.
   * The request ID must be a valid UUID, with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A unique request ID (optional). If you specify this ID, you can
   * use it in cases when you need to retry your request. When you need to
   * retry, this ID lets the server know that it can ignore the request if it
   * has already been completed. The server guarantees that for at least 60
   * minutes after the first request.
   * For example, consider a situation where you make an initial request and
   * the request times out. If you make the request again with the same request
   * ID, the server can check to see whether the original operation
   * was received. If it was, the server ignores the second request. This
   * behavior prevents clients from mistakenly creating duplicate commitments.
   * The request ID must be a valid UUID, with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}