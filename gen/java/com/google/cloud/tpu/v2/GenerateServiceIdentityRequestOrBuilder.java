// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

public interface GenerateServiceIdentityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.GenerateServiceIdentityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}