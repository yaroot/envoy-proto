// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/video/livestream/logging/v1/logs.proto

package com.google.cloud.video.livestream.logging.v1;

public interface ChannelActivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.logging.v1.ChannelActivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Message is for more details of the log and instructions to users.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * Message is for more details of the log and instructions to users.
   * </pre>
   *
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * The channel streaming state changes.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.StreamingStateChange streaming_state_change = 2;</code>
   * @return Whether the streamingStateChange field is set.
   */
  boolean hasStreamingStateChange();
  /**
   * <pre>
   * The channel streaming state changes.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.StreamingStateChange streaming_state_change = 2;</code>
   * @return The streamingStateChange.
   */
  com.google.cloud.video.livestream.logging.v1.StreamingStateChange getStreamingStateChange();
  /**
   * <pre>
   * The channel streaming state changes.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.StreamingStateChange streaming_state_change = 2;</code>
   */
  com.google.cloud.video.livestream.logging.v1.StreamingStateChangeOrBuilder getStreamingStateChangeOrBuilder();

  /**
   * <pre>
   * An error happens with the video pipeline.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.StreamingError streaming_error = 3;</code>
   * @return Whether the streamingError field is set.
   */
  boolean hasStreamingError();
  /**
   * <pre>
   * An error happens with the video pipeline.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.StreamingError streaming_error = 3;</code>
   * @return The streamingError.
   */
  com.google.cloud.video.livestream.logging.v1.StreamingError getStreamingError();
  /**
   * <pre>
   * An error happens with the video pipeline.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.StreamingError streaming_error = 3;</code>
   */
  com.google.cloud.video.livestream.logging.v1.StreamingErrorOrBuilder getStreamingErrorOrBuilder();

  /**
   * <pre>
   * The channel has accepted an input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputAccept input_accept = 4;</code>
   * @return Whether the inputAccept field is set.
   */
  boolean hasInputAccept();
  /**
   * <pre>
   * The channel has accepted an input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputAccept input_accept = 4;</code>
   * @return The inputAccept.
   */
  com.google.cloud.video.livestream.logging.v1.InputAccept getInputAccept();
  /**
   * <pre>
   * The channel has accepted an input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputAccept input_accept = 4;</code>
   */
  com.google.cloud.video.livestream.logging.v1.InputAcceptOrBuilder getInputAcceptOrBuilder();

  /**
   * <pre>
   * An error happens with the input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputError input_error = 5;</code>
   * @return Whether the inputError field is set.
   */
  boolean hasInputError();
  /**
   * <pre>
   * An error happens with the input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputError input_error = 5;</code>
   * @return The inputError.
   */
  com.google.cloud.video.livestream.logging.v1.InputError getInputError();
  /**
   * <pre>
   * An error happens with the input stream.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputError input_error = 5;</code>
   */
  com.google.cloud.video.livestream.logging.v1.InputErrorOrBuilder getInputErrorOrBuilder();

  /**
   * <pre>
   * An input stream disconnects.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputDisconnect input_disconnect = 6;</code>
   * @return Whether the inputDisconnect field is set.
   */
  boolean hasInputDisconnect();
  /**
   * <pre>
   * An input stream disconnects.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputDisconnect input_disconnect = 6;</code>
   * @return The inputDisconnect.
   */
  com.google.cloud.video.livestream.logging.v1.InputDisconnect getInputDisconnect();
  /**
   * <pre>
   * An input stream disconnects.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.logging.v1.InputDisconnect input_disconnect = 6;</code>
   */
  com.google.cloud.video.livestream.logging.v1.InputDisconnectOrBuilder getInputDisconnectOrBuilder();

  public com.google.cloud.video.livestream.logging.v1.ChannelActivity.ActivityTypeCase getActivityTypeCase();
}