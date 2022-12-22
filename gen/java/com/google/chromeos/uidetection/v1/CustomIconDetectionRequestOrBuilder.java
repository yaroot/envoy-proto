// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/chromeos/uidetection/v1/ui_detection.proto

package com.google.chromeos.uidetection.v1;

public interface CustomIconDetectionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.chromeos.uidetection.v1.CustomIconDetectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Required field that represents an icon in PNG format.
   * </pre>
   *
   * <code>bytes icon_png = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The iconPng.
   */
  com.google.protobuf.ByteString getIconPng();

  /**
   * <pre>
   * Set match_count to -1 to not limit the number of matches.
   * </pre>
   *
   * <code>int32 match_count = 2;</code>
   * @return The matchCount.
   */
  int getMatchCount();

  /**
   * <pre>
   * Confidence threshold in the range [0.0, 1.0] below which the matches will
   * be considered as non-existent.
   * </pre>
   *
   * <code>double min_confidence_threshold = 3;</code>
   * @return The minConfidenceThreshold.
   */
  double getMinConfidenceThreshold();
}