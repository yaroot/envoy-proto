// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/platform.proto

package com.google.cloud.visionai.v1;

public interface ApplicationInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ApplicationInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Id of the requesting object.
   * </pre>
   *
   * <code>string instance_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <pre>
   * Required. Id of the requesting object.
   * </pre>
   *
   * <code>string instance_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Instance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Instance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  com.google.cloud.visionai.v1.Instance getInstance();
  /**
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Instance instance = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.visionai.v1.InstanceOrBuilder getInstanceOrBuilder();
}