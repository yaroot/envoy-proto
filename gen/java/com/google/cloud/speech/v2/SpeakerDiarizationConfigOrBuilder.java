// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface SpeakerDiarizationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.SpeakerDiarizationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Minimum number of speakers in the conversation. This range gives
   * you more flexibility by allowing the system to automatically determine the
   * correct number of speakers. If not set, the default value is 2.
   * To fix the number of speakers detected in the audio, set
   * `min_speaker_count` = `max_speaker_count`.
   * </pre>
   *
   * <code>int32 min_speaker_count = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The minSpeakerCount.
   */
  int getMinSpeakerCount();

  /**
   * <pre>
   * Required. Maximum number of speakers in the conversation. Valid values are:
   * 1-6. Must be &gt;= `min_speaker_count`. This range gives you more flexibility
   * by allowing the system to automatically determine the correct number of
   * speakers.
   * </pre>
   *
   * <code>int32 max_speaker_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The maxSpeakerCount.
   */
  int getMaxSpeakerCount();
}