// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/integrations/v1alpha/log_entries.proto

package com.google.cloud.integrations.v1alpha;

public interface EventExecutionSnapshotOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.integrations.v1alpha.EventExecutionSnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates "right after which checkpoint task's execution" this snapshot
   * is taken.
   * </pre>
   *
   * <code>string checkpoint_task_number = 1;</code>
   * @return The checkpointTaskNumber.
   */
  java.lang.String getCheckpointTaskNumber();
  /**
   * <pre>
   * Indicates "right after which checkpoint task's execution" this snapshot
   * is taken.
   * </pre>
   *
   * <code>string checkpoint_task_number = 1;</code>
   * @return The bytes for checkpointTaskNumber.
   */
  com.google.protobuf.ByteString
      getCheckpointTaskNumberBytes();

  /**
   * <pre>
   * Indicates when this snapshot is taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp snapshot_time = 2;</code>
   * @return Whether the snapshotTime field is set.
   */
  boolean hasSnapshotTime();
  /**
   * <pre>
   * Indicates when this snapshot is taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp snapshot_time = 2;</code>
   * @return The snapshotTime.
   */
  com.google.protobuf.Timestamp getSnapshotTime();
  /**
   * <pre>
   * Indicates when this snapshot is taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp snapshot_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSnapshotTimeOrBuilder();

  /**
   * <pre>
   * Snapshot metadata.
   * </pre>
   *
   * <code>.google.cloud.integrations.v1alpha.EventExecutionSnapshot.EventExecutionSnapshotMetadata event_execution_snapshot_metadata = 3;</code>
   * @return Whether the eventExecutionSnapshotMetadata field is set.
   */
  boolean hasEventExecutionSnapshotMetadata();
  /**
   * <pre>
   * Snapshot metadata.
   * </pre>
   *
   * <code>.google.cloud.integrations.v1alpha.EventExecutionSnapshot.EventExecutionSnapshotMetadata event_execution_snapshot_metadata = 3;</code>
   * @return The eventExecutionSnapshotMetadata.
   */
  com.google.cloud.integrations.v1alpha.EventExecutionSnapshot.EventExecutionSnapshotMetadata getEventExecutionSnapshotMetadata();
  /**
   * <pre>
   * Snapshot metadata.
   * </pre>
   *
   * <code>.google.cloud.integrations.v1alpha.EventExecutionSnapshot.EventExecutionSnapshotMetadata event_execution_snapshot_metadata = 3;</code>
   */
  com.google.cloud.integrations.v1alpha.EventExecutionSnapshot.EventExecutionSnapshotMetadataOrBuilder getEventExecutionSnapshotMetadataOrBuilder();

  /**
   * <pre>
   * All of the task execution details at the given point of time.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.TaskExecutionDetails task_execution_details = 4;</code>
   */
  java.util.List<com.google.cloud.integrations.v1alpha.TaskExecutionDetails> 
      getTaskExecutionDetailsList();
  /**
   * <pre>
   * All of the task execution details at the given point of time.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.TaskExecutionDetails task_execution_details = 4;</code>
   */
  com.google.cloud.integrations.v1alpha.TaskExecutionDetails getTaskExecutionDetails(int index);
  /**
   * <pre>
   * All of the task execution details at the given point of time.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.TaskExecutionDetails task_execution_details = 4;</code>
   */
  int getTaskExecutionDetailsCount();
  /**
   * <pre>
   * All of the task execution details at the given point of time.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.TaskExecutionDetails task_execution_details = 4;</code>
   */
  java.util.List<? extends com.google.cloud.integrations.v1alpha.TaskExecutionDetailsOrBuilder> 
      getTaskExecutionDetailsOrBuilderList();
  /**
   * <pre>
   * All of the task execution details at the given point of time.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.TaskExecutionDetails task_execution_details = 4;</code>
   */
  com.google.cloud.integrations.v1alpha.TaskExecutionDetailsOrBuilder getTaskExecutionDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * All of the computed conditions that been calculated.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.ConditionResult condition_results = 5;</code>
   */
  java.util.List<com.google.cloud.integrations.v1alpha.ConditionResult> 
      getConditionResultsList();
  /**
   * <pre>
   * All of the computed conditions that been calculated.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.ConditionResult condition_results = 5;</code>
   */
  com.google.cloud.integrations.v1alpha.ConditionResult getConditionResults(int index);
  /**
   * <pre>
   * All of the computed conditions that been calculated.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.ConditionResult condition_results = 5;</code>
   */
  int getConditionResultsCount();
  /**
   * <pre>
   * All of the computed conditions that been calculated.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.ConditionResult condition_results = 5;</code>
   */
  java.util.List<? extends com.google.cloud.integrations.v1alpha.ConditionResultOrBuilder> 
      getConditionResultsOrBuilderList();
  /**
   * <pre>
   * All of the computed conditions that been calculated.
   * </pre>
   *
   * <code>repeated .google.cloud.integrations.v1alpha.ConditionResult condition_results = 5;</code>
   */
  com.google.cloud.integrations.v1alpha.ConditionResultOrBuilder getConditionResultsOrBuilder(
      int index);

  /**
   * <pre>
   * The parameters in Event object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; event_params = 6;</code>
   */
  int getEventParamsCount();
  /**
   * <pre>
   * The parameters in Event object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; event_params = 6;</code>
   */
  boolean containsEventParams(
      java.lang.String key);
  /**
   * Use {@link #getEventParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.integrations.v1alpha.EventParameter>
  getEventParams();
  /**
   * <pre>
   * The parameters in Event object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; event_params = 6;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.integrations.v1alpha.EventParameter>
  getEventParamsMap();
  /**
   * <pre>
   * The parameters in Event object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; event_params = 6;</code>
   */
  /* nullable */
com.google.cloud.integrations.v1alpha.EventParameter getEventParamsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.integrations.v1alpha.EventParameter defaultValue);
  /**
   * <pre>
   * The parameters in Event object.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; event_params = 6;</code>
   */
  com.google.cloud.integrations.v1alpha.EventParameter getEventParamsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The parameters in Event object that differs from last snapshot.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; diff_params = 7;</code>
   */
  int getDiffParamsCount();
  /**
   * <pre>
   * The parameters in Event object that differs from last snapshot.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; diff_params = 7;</code>
   */
  boolean containsDiffParams(
      java.lang.String key);
  /**
   * Use {@link #getDiffParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.integrations.v1alpha.EventParameter>
  getDiffParams();
  /**
   * <pre>
   * The parameters in Event object that differs from last snapshot.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; diff_params = 7;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.integrations.v1alpha.EventParameter>
  getDiffParamsMap();
  /**
   * <pre>
   * The parameters in Event object that differs from last snapshot.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; diff_params = 7;</code>
   */
  /* nullable */
com.google.cloud.integrations.v1alpha.EventParameter getDiffParamsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.integrations.v1alpha.EventParameter defaultValue);
  /**
   * <pre>
   * The parameters in Event object that differs from last snapshot.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.integrations.v1alpha.EventParameter&gt; diff_params = 7;</code>
   */
  com.google.cloud.integrations.v1alpha.EventParameter getDiffParamsOrThrow(
      java.lang.String key);
}