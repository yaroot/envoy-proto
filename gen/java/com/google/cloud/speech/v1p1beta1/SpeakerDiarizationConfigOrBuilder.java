// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1p1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface SpeakerDiarizationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If 'true', enables speaker detection for each recognized word in
   * the top alternative of the recognition result using a speaker_tag provided
   * in the WordInfo.
   * </pre>
   *
   * <code>bool enable_speaker_diarization = 1;</code>
   * @return The enableSpeakerDiarization.
   */
  boolean getEnableSpeakerDiarization();

  /**
   * <pre>
   * Minimum number of speakers in the conversation. This range gives you more
   * flexibility by allowing the system to automatically determine the correct
   * number of speakers. If not set, the default value is 2.
   * </pre>
   *
   * <code>int32 min_speaker_count = 2;</code>
   * @return The minSpeakerCount.
   */
  int getMinSpeakerCount();

  /**
   * <pre>
   * Maximum number of speakers in the conversation. This range gives you more
   * flexibility by allowing the system to automatically determine the correct
   * number of speakers. If not set, the default value is 6.
   * </pre>
   *
   * <code>int32 max_speaker_count = 3;</code>
   * @return The maxSpeakerCount.
   */
  int getMaxSpeakerCount();

  /**
   * <pre>
   * Output only. Unused.
   * </pre>
   *
   * <code>int32 speaker_tag = 5 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @deprecated google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig.speaker_tag is deprecated.
   *     See google/cloud/speech/v1p1beta1/cloud_speech.proto;l=479
   * @return The speakerTag.
   */
  @java.lang.Deprecated int getSpeakerTag();
}
