// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/platform.proto

package com.google.cloud.visionai.v1alpha1;

public interface VertexAutoMLVideoConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1alpha1.VertexAutoMLVideoConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Only entities with higher score than the threshold will be returned.
   * Value 0.0 means returns all the detected entities.
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   * @return The confidenceThreshold.
   */
  float getConfidenceThreshold();

  /**
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   * @return A list containing the blockedLabels.
   */
  java.util.List<java.lang.String>
      getBlockedLabelsList();
  /**
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   * @return The count of blockedLabels.
   */
  int getBlockedLabelsCount();
  /**
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   * @param index The index of the element to return.
   * @return The blockedLabels at the given index.
   */
  java.lang.String getBlockedLabels(int index);
  /**
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the blockedLabels at the given index.
   */
  com.google.protobuf.ByteString
      getBlockedLabelsBytes(int index);

  /**
   * <pre>
   * At most this many predictions will be returned per output frame.
   * Value 0 means to return all the detected entities.
   * </pre>
   *
   * <code>int32 max_predictions = 3;</code>
   * @return The maxPredictions.
   */
  int getMaxPredictions();

  /**
   * <pre>
   * Only Bounding Box whose size is larger than this limit will be returned.
   * Object Tracking only.
   * Value 0.0 means to return all the detected entities.
   * </pre>
   *
   * <code>float bounding_box_size_limit = 4;</code>
   * @return The boundingBoxSizeLimit.
   */
  float getBoundingBoxSizeLimit();
}