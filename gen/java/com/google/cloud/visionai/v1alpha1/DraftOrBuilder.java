// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/platform.proto

package com.google.cloud.visionai.v1alpha1;

public interface DraftOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1alpha1.Draft)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name of resource
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of resource
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. [Output only] Create timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
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
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Labels as key value pairs
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 3;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. A user friendly display name for the solution.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. A user friendly display name for the solution.
   * </pre>
   *
   * <code>string display_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A description for this application.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A description for this application.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The draft application configs which haven't been updated to an application.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1alpha1.ApplicationConfigs draft_application_configs = 6;</code>
   * @return Whether the draftApplicationConfigs field is set.
   */
  boolean hasDraftApplicationConfigs();
  /**
   * <pre>
   * The draft application configs which haven't been updated to an application.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1alpha1.ApplicationConfigs draft_application_configs = 6;</code>
   * @return The draftApplicationConfigs.
   */
  com.google.cloud.visionai.v1alpha1.ApplicationConfigs getDraftApplicationConfigs();
  /**
   * <pre>
   * The draft application configs which haven't been updated to an application.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1alpha1.ApplicationConfigs draft_application_configs = 6;</code>
   */
  com.google.cloud.visionai.v1alpha1.ApplicationConfigsOrBuilder getDraftApplicationConfigsOrBuilder();
}