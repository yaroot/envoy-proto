// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/annotations.proto

package com.google.cloud.visionai.v1;

public interface StreamAnnotationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.StreamAnnotations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation stream_annotations = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.StreamAnnotation> 
      getStreamAnnotationsList();
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation stream_annotations = 1;</code>
   */
  com.google.cloud.visionai.v1.StreamAnnotation getStreamAnnotations(int index);
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation stream_annotations = 1;</code>
   */
  int getStreamAnnotationsCount();
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation stream_annotations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.StreamAnnotationOrBuilder> 
      getStreamAnnotationsOrBuilderList();
  /**
   * <pre>
   * Multiple annotations.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation stream_annotations = 1;</code>
   */
  com.google.cloud.visionai.v1.StreamAnnotationOrBuilder getStreamAnnotationsOrBuilder(
      int index);
}