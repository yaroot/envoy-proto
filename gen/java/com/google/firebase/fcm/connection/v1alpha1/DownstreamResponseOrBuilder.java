// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firebase/fcm/connection/v1alpha1/connection_api.proto

package com.google.firebase.fcm.connection.v1alpha1;

public interface DownstreamResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firebase.fcm.connection.v1alpha1.DownstreamResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Message sent to FCM via the [Send
   * API](https://firebase.google.com/docs/cloud-messaging/send-message)
   * targeting this client.
   * </pre>
   *
   * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * Message sent to FCM via the [Send
   * API](https://firebase.google.com/docs/cloud-messaging/send-message)
   * targeting this client.
   * </pre>
   *
   * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
   * @return The message.
   */
  com.google.firebase.fcm.connection.v1alpha1.Message getMessage();
  /**
   * <pre>
   * Message sent to FCM via the [Send
   * API](https://firebase.google.com/docs/cloud-messaging/send-message)
   * targeting this client.
   * </pre>
   *
   * <code>.google.firebase.fcm.connection.v1alpha1.Message message = 1;</code>
   */
  com.google.firebase.fcm.connection.v1alpha1.MessageOrBuilder getMessageOrBuilder();

  public com.google.firebase.fcm.connection.v1alpha1.DownstreamResponse.ResponseTypeCase getResponseTypeCase();
}