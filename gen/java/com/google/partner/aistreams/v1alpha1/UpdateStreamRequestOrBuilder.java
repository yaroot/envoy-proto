// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/partner/aistreams/v1alpha1/aistreams.proto

package com.google.partner.aistreams.v1alpha1;

public interface UpdateStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.partner.aistreams.v1alpha1.UpdateStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Stream resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Stream resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Stream resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. The stream resource to update.
   * </pre>
   *
   * <code>.google.partner.aistreams.v1alpha1.Stream stream = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the stream field is set.
   */
  boolean hasStream();
  /**
   * <pre>
   * Required. The stream resource to update.
   * </pre>
   *
   * <code>.google.partner.aistreams.v1alpha1.Stream stream = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The stream.
   */
  com.google.partner.aistreams.v1alpha1.Stream getStream();
  /**
   * <pre>
   * Required. The stream resource to update.
   * </pre>
   *
   * <code>.google.partner.aistreams.v1alpha1.Stream stream = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.partner.aistreams.v1alpha1.StreamOrBuilder getStreamOrBuilder();

  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. An optional request ID to identify requests. Specify a unique
   * request ID so that if you must retry your request, the server will know to
   * ignore the request if it has already been completed. The server will
   * guarantee that for at least 60 minutes since the first request.
   * For example, consider a situation where you make an initial request and t
   * he request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}