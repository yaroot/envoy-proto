// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storagetransfer/logging/transfer_activity_log.proto

package com.google.storagetransfer.logging;

public interface TransferActivityLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storagetransfer.logging.TransferActivityLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the transfer operation.
   * </pre>
   *
   * <code>string operation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <pre>
   * Required. Name of the transfer operation.
   * </pre>
   *
   * <code>string operation = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();

  /**
   * <pre>
   * Required. The action which the transfer operation made.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.TransferActivityLog.Action action = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   * <pre>
   * Required. The action which the transfer operation made.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.TransferActivityLog.Action action = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The action.
   */
  com.google.storagetransfer.logging.TransferActivityLog.Action getAction();

  /**
   * <pre>
   * Required. Status of the action.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.TransferActivityLog.Status status = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Required. Status of the action.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.TransferActivityLog.Status status = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The status.
   */
  com.google.storagetransfer.logging.TransferActivityLog.Status getStatus();
  /**
   * <pre>
   * Required. Status of the action.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.TransferActivityLog.Status status = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.storagetransfer.logging.TransferActivityLog.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Metadata of source bucket/container/directory. Only set if the action is
   * FIND.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ContainerMetadata source_container = 4;</code>
   * @return Whether the sourceContainer field is set.
   */
  boolean hasSourceContainer();
  /**
   * <pre>
   * Metadata of source bucket/container/directory. Only set if the action is
   * FIND.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ContainerMetadata source_container = 4;</code>
   * @return The sourceContainer.
   */
  com.google.storagetransfer.logging.ContainerMetadata getSourceContainer();
  /**
   * <pre>
   * Metadata of source bucket/container/directory. Only set if the action is
   * FIND.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ContainerMetadata source_container = 4;</code>
   */
  com.google.storagetransfer.logging.ContainerMetadataOrBuilder getSourceContainerOrBuilder();

  /**
   * <pre>
   * Metadata of destination bucket/container/directory. Only set if the action
   * is FIND.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ContainerMetadata destination_container = 5;</code>
   * @return Whether the destinationContainer field is set.
   */
  boolean hasDestinationContainer();
  /**
   * <pre>
   * Metadata of destination bucket/container/directory. Only set if the action
   * is FIND.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ContainerMetadata destination_container = 5;</code>
   * @return The destinationContainer.
   */
  com.google.storagetransfer.logging.ContainerMetadata getDestinationContainer();
  /**
   * <pre>
   * Metadata of destination bucket/container/directory. Only set if the action
   * is FIND.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ContainerMetadata destination_container = 5;</code>
   */
  com.google.storagetransfer.logging.ContainerMetadataOrBuilder getDestinationContainerOrBuilder();

  /**
   * <pre>
   * Metadata of the source blob/file/object. Only set if the action is COPY or
   * DELETE when deletion is applied to source.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ObjectMetadata source_object = 6;</code>
   * @return Whether the sourceObject field is set.
   */
  boolean hasSourceObject();
  /**
   * <pre>
   * Metadata of the source blob/file/object. Only set if the action is COPY or
   * DELETE when deletion is applied to source.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ObjectMetadata source_object = 6;</code>
   * @return The sourceObject.
   */
  com.google.storagetransfer.logging.ObjectMetadata getSourceObject();
  /**
   * <pre>
   * Metadata of the source blob/file/object. Only set if the action is COPY or
   * DELETE when deletion is applied to source.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ObjectMetadata source_object = 6;</code>
   */
  com.google.storagetransfer.logging.ObjectMetadataOrBuilder getSourceObjectOrBuilder();

  /**
   * <pre>
   * Metadata of the destination blob/file/object. Only set if the action is
   * or DELETE when deletion is applied to destination.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ObjectMetadata destination_object = 7;</code>
   * @return Whether the destinationObject field is set.
   */
  boolean hasDestinationObject();
  /**
   * <pre>
   * Metadata of the destination blob/file/object. Only set if the action is
   * or DELETE when deletion is applied to destination.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ObjectMetadata destination_object = 7;</code>
   * @return The destinationObject.
   */
  com.google.storagetransfer.logging.ObjectMetadata getDestinationObject();
  /**
   * <pre>
   * Metadata of the destination blob/file/object. Only set if the action is
   * or DELETE when deletion is applied to destination.
   * </pre>
   *
   * <code>.google.storagetransfer.logging.ObjectMetadata destination_object = 7;</code>
   */
  com.google.storagetransfer.logging.ObjectMetadataOrBuilder getDestinationObjectOrBuilder();

  /**
   * <pre>
   * Required. Completion time of the action.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   * <pre>
   * Required. Completion time of the action.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   * <pre>
   * Required. Completion time of the action.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp complete_time = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();
}