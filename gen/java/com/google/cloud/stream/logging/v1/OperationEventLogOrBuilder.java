// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/stream/logging/v1/logging.proto

package com.google.cloud.stream.logging.v1;

public interface OperationEventLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.stream.logging.v1.OperationEventLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Enum for type of event being logged.
   * </pre>
   *
   * <code>.google.cloud.stream.logging.v1.OperationEventType event_type = 1;</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * Enum for type of event being logged.
   * </pre>
   *
   * <code>.google.cloud.stream.logging.v1.OperationEventType event_type = 1;</code>
   * @return The eventType.
   */
  com.google.cloud.stream.logging.v1.OperationEventType getEventType();

  /**
   * <pre>
   * Timestamp when the event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Timestamp when the event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * Timestamp when the event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * Operation resource identifier.
   * </pre>
   *
   * <code>string operation = 3;</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   * Operation resource identifier.
   * </pre>
   *
   * <code>string operation = 3;</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <pre>
   * Artifact created as a result of the operation.
   * </pre>
   *
   * <code>repeated .google.cloud.stream.logging.v1.OperationArtifact operation_artifacts = 4;</code>
   */
  java.util.List<com.google.cloud.stream.logging.v1.OperationArtifact> 
      getOperationArtifactsList();
  /**
   * <pre>
   * Artifact created as a result of the operation.
   * </pre>
   *
   * <code>repeated .google.cloud.stream.logging.v1.OperationArtifact operation_artifacts = 4;</code>
   */
  com.google.cloud.stream.logging.v1.OperationArtifact getOperationArtifacts(int index);
  /**
   * <pre>
   * Artifact created as a result of the operation.
   * </pre>
   *
   * <code>repeated .google.cloud.stream.logging.v1.OperationArtifact operation_artifacts = 4;</code>
   */
  int getOperationArtifactsCount();
  /**
   * <pre>
   * Artifact created as a result of the operation.
   * </pre>
   *
   * <code>repeated .google.cloud.stream.logging.v1.OperationArtifact operation_artifacts = 4;</code>
   */
  java.util.List<? extends com.google.cloud.stream.logging.v1.OperationArtifactOrBuilder> 
      getOperationArtifactsOrBuilderList();
  /**
   * <pre>
   * Artifact created as a result of the operation.
   * </pre>
   *
   * <code>repeated .google.cloud.stream.logging.v1.OperationArtifact operation_artifacts = 4;</code>
   */
  com.google.cloud.stream.logging.v1.OperationArtifactOrBuilder getOperationArtifactsOrBuilder(
      int index);
}