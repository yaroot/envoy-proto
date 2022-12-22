// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts_lrs.proto

package com.google.cloud.texttospeech.v1;

public interface SynthesizeLongAudioMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.SynthesizeLongAudioMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
   * @return Whether the lastUpdateTime field is set.
   */
  boolean hasLastUpdateTime();
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
   * @return The lastUpdateTime.
   */
  com.google.protobuf.Timestamp getLastUpdateTime();
  /**
   * <pre>
   * Time of the most recent processing update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder();

  /**
   * <pre>
   * The progress of the most recent processing update in percentage, ie. 70.0%.
   * </pre>
   *
   * <code>double progress_percentage = 3;</code>
   * @return The progressPercentage.
   */
  double getProgressPercentage();
}