// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_service.proto

package com.google.cloud.aiplatform.v1;

public interface BatchCreateTensorboardRunsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.BatchCreateTensorboardRunsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TensorboardRun> 
      getTensorboardRunsList();
  /**
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardRun getTensorboardRuns(int index);
  /**
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  int getTensorboardRunsCount();
  /**
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder> 
      getTensorboardRunsOrBuilderList();
  /**
   * <pre>
   * The created TensorboardRuns.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardRun tensorboard_runs = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardRunOrBuilder getTensorboardRunsOrBuilder(
      int index);
}
