// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

public interface GetNotificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.GetNotificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent bucket of the notification.
   * Format:
   * `projects/{project}/buckets/{bucket}/notificationConfigs/{notification}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The parent bucket of the notification.
   * Format:
   * `projects/{project}/buckets/{bucket}/notificationConfigs/{notification}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}