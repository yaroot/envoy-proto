// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

public interface CreateNotificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.CreateNotificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The bucket to which this notification belongs.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The bucket to which this notification belongs.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Properties of the notification to be inserted.
   * </pre>
   *
   * <code>.google.storage.v2.Notification notification = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the notification field is set.
   */
  boolean hasNotification();
  /**
   * <pre>
   * Required. Properties of the notification to be inserted.
   * </pre>
   *
   * <code>.google.storage.v2.Notification notification = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The notification.
   */
  com.google.storage.v2.Notification getNotification();
  /**
   * <pre>
   * Required. Properties of the notification to be inserted.
   * </pre>
   *
   * <code>.google.storage.v2.Notification notification = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.storage.v2.NotificationOrBuilder getNotificationOrBuilder();
}