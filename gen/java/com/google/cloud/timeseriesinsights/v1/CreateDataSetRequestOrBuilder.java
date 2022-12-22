// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/timeseriesinsights/v1/timeseries_insights.proto

package com.google.cloud.timeseriesinsights.v1;

public interface CreateDataSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.timeseriesinsights.v1.CreateDataSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Client project name which will own this DataSet in the format of
   * 'projects/{project}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Client project name which will own this DataSet in the format of
   * 'projects/{project}'.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Dataset to be loaded.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * Required. Dataset to be loaded.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataset.
   */
  com.google.cloud.timeseriesinsights.v1.DataSet getDataset();
  /**
   * <pre>
   * Required. Dataset to be loaded.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.timeseriesinsights.v1.DataSetOrBuilder getDatasetOrBuilder();
}