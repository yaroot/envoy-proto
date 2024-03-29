// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/uidetection/v1/ui_detection.proto

package com.google.chromeos.uidetection.v1;

public interface DetectionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.chromeos.uidetection.v1.DetectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Detection type for word detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.WordDetectionRequest word_detection_request = 1;</code>
   * @return Whether the wordDetectionRequest field is set.
   */
  boolean hasWordDetectionRequest();
  /**
   * <pre>
   * Detection type for word detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.WordDetectionRequest word_detection_request = 1;</code>
   * @return The wordDetectionRequest.
   */
  com.google.chromeos.uidetection.v1.WordDetectionRequest getWordDetectionRequest();
  /**
   * <pre>
   * Detection type for word detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.WordDetectionRequest word_detection_request = 1;</code>
   */
  com.google.chromeos.uidetection.v1.WordDetectionRequestOrBuilder getWordDetectionRequestOrBuilder();

  /**
   * <pre>
   * Detection type for text block detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.TextBlockDetectionRequest text_block_detection_request = 2;</code>
   * @return Whether the textBlockDetectionRequest field is set.
   */
  boolean hasTextBlockDetectionRequest();
  /**
   * <pre>
   * Detection type for text block detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.TextBlockDetectionRequest text_block_detection_request = 2;</code>
   * @return The textBlockDetectionRequest.
   */
  com.google.chromeos.uidetection.v1.TextBlockDetectionRequest getTextBlockDetectionRequest();
  /**
   * <pre>
   * Detection type for text block detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.TextBlockDetectionRequest text_block_detection_request = 2;</code>
   */
  com.google.chromeos.uidetection.v1.TextBlockDetectionRequestOrBuilder getTextBlockDetectionRequestOrBuilder();

  /**
   * <pre>
   * Detection type for custom icon detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.CustomIconDetectionRequest custom_icon_detection_request = 3;</code>
   * @return Whether the customIconDetectionRequest field is set.
   */
  boolean hasCustomIconDetectionRequest();
  /**
   * <pre>
   * Detection type for custom icon detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.CustomIconDetectionRequest custom_icon_detection_request = 3;</code>
   * @return The customIconDetectionRequest.
   */
  com.google.chromeos.uidetection.v1.CustomIconDetectionRequest getCustomIconDetectionRequest();
  /**
   * <pre>
   * Detection type for custom icon detection.
   * </pre>
   *
   * <code>.google.chromeos.uidetection.v1.CustomIconDetectionRequest custom_icon_detection_request = 3;</code>
   */
  com.google.chromeos.uidetection.v1.CustomIconDetectionRequestOrBuilder getCustomIconDetectionRequestOrBuilder();

  public com.google.chromeos.uidetection.v1.DetectionRequest.DetectionRequestTypeCase getDetectionRequestTypeCase();
}
