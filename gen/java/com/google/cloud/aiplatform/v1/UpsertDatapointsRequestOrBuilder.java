// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/index_service.proto

package com.google.cloud.aiplatform.v1;

public interface UpsertDatapointsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.UpsertDatapointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The index.
   */
  java.lang.String getIndex();
  /**
   * <pre>
   * Required. The name of the Index resource to be updated.
   * Format:
   * `projects/{project}/locations/{location}/indexes/{index}`
   * </pre>
   *
   * <code>string index = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for index.
   */
  com.google.protobuf.ByteString
      getIndexBytes();

  /**
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.IndexDatapoint datapoints = 2;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.IndexDatapoint> 
      getDatapointsList();
  /**
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.IndexDatapoint datapoints = 2;</code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapoint getDatapoints(int index);
  /**
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.IndexDatapoint datapoints = 2;</code>
   */
  int getDatapointsCount();
  /**
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.IndexDatapoint datapoints = 2;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.IndexDatapointOrBuilder> 
      getDatapointsOrBuilderList();
  /**
   * <pre>
   * A list of datapoints to be created/updated.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.IndexDatapoint datapoints = 2;</code>
   */
  com.google.cloud.aiplatform.v1.IndexDatapointOrBuilder getDatapointsOrBuilder(
      int index);
}
