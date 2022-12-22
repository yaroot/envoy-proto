// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_run.proto

package com.google.cloud.aiplatform.v1;

public interface TensorboardRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TensorboardRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Name of the TensorboardRun.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Name of the TensorboardRun.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. User provided name of this TensorboardRun.
   * This value must be unique among all TensorboardRuns
   * belonging to the same parent TensorboardExperiment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. User provided name of this TensorboardRun.
   * This value must be unique among all TensorboardRuns
   * belonging to the same parent TensorboardExperiment.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Description of this TensorboardRun.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of this TensorboardRun.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. Timestamp when this TensorboardRun was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this TensorboardRun was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. Timestamp when this TensorboardRun was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Timestamp when this TensorboardRun was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this TensorboardRun was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Timestamp when this TensorboardRun was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * The labels with user-defined metadata to organize your TensorboardRuns.
   * This field will be used to filter and visualize Runs in the Tensorboard UI.
   * For example, a Vertex AI training job can set a label
   * aiplatform.googleapis.com/training_job_id=xxxxx to all the runs created
   * within that job. An end user can set a label experiment_id=xxxxx for all
   * the runs produced in a Jupyter notebook. These runs can be grouped by a
   * label value and visualized together in the Tensorboard UI.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one TensorboardRun
   * (System labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * The labels with user-defined metadata to organize your TensorboardRuns.
   * This field will be used to filter and visualize Runs in the Tensorboard UI.
   * For example, a Vertex AI training job can set a label
   * aiplatform.googleapis.com/training_job_id=xxxxx to all the runs created
   * within that job. An end user can set a label experiment_id=xxxxx for all
   * the runs produced in a Jupyter notebook. These runs can be grouped by a
   * label value and visualized together in the Tensorboard UI.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one TensorboardRun
   * (System labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * The labels with user-defined metadata to organize your TensorboardRuns.
   * This field will be used to filter and visualize Runs in the Tensorboard UI.
   * For example, a Vertex AI training job can set a label
   * aiplatform.googleapis.com/training_job_id=xxxxx to all the runs created
   * within that job. An end user can set a label experiment_id=xxxxx for all
   * the runs produced in a Jupyter notebook. These runs can be grouped by a
   * label value and visualized together in the Tensorboard UI.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one TensorboardRun
   * (System labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * The labels with user-defined metadata to organize your TensorboardRuns.
   * This field will be used to filter and visualize Runs in the Tensorboard UI.
   * For example, a Vertex AI training job can set a label
   * aiplatform.googleapis.com/training_job_id=xxxxx to all the runs created
   * within that job. An end user can set a label experiment_id=xxxxx for all
   * the runs produced in a Jupyter notebook. These runs can be grouped by a
   * label value and visualized together in the Tensorboard UI.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one TensorboardRun
   * (System labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The labels with user-defined metadata to organize your TensorboardRuns.
   * This field will be used to filter and visualize Runs in the Tensorboard UI.
   * For example, a Vertex AI training job can set a label
   * aiplatform.googleapis.com/training_job_id=xxxxx to all the runs created
   * within that job. An end user can set a label experiment_id=xxxxx for all
   * the runs produced in a Jupyter notebook. These runs can be grouped by a
   * label value and visualized together in the Tensorboard UI.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * No more than 64 user labels can be associated with one TensorboardRun
   * (System labels are excluded).
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * System reserved label keys are prefixed with "aiplatform.googleapis.com/"
   * and are immutable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Used to perform a consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 9;</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Used to perform a consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 9;</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}
