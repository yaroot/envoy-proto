// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v1/functions.proto

package com.google.cloud.functions.v1;

public interface UpdateFunctionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v1.UpdateFunctionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The function.
   */
  com.google.cloud.functions.v1.CloudFunction getFunction();
  /**
   * <pre>
   * Required. New version of the function.
   * </pre>
   *
   * <code>.google.cloud.functions.v1.CloudFunction function = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.functions.v1.CloudFunctionOrBuilder getFunctionOrBuilder();

  /**
   * <pre>
   * Required. The list of fields in `CloudFunction` that have to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The list of fields in `CloudFunction` that have to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The list of fields in `CloudFunction` that have to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}