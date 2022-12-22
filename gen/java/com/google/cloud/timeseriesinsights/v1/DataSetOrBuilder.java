// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/timeseriesinsights/v1/timeseries_insights.proto

package com.google.cloud.timeseriesinsights.v1;

public interface DataSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.timeseriesinsights.v1.DataSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The dataset name, which will be used for querying, status and unload
   * requests. This must be unique within a project.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The dataset name, which will be used for querying, status and unload
   * requests. This must be unique within a project.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [Data dimension names][google.cloud.timeseriesinsights.v1.EventDimension.name] allowed for this `DataSet`.
   * If left empty, all dimension names are included. This field works as a
   * filter to avoid regenerating the data.
   * </pre>
   *
   * <code>repeated string data_names = 2;</code>
   * @return A list containing the dataNames.
   */
  java.util.List<java.lang.String>
      getDataNamesList();
  /**
   * <pre>
   * [Data dimension names][google.cloud.timeseriesinsights.v1.EventDimension.name] allowed for this `DataSet`.
   * If left empty, all dimension names are included. This field works as a
   * filter to avoid regenerating the data.
   * </pre>
   *
   * <code>repeated string data_names = 2;</code>
   * @return The count of dataNames.
   */
  int getDataNamesCount();
  /**
   * <pre>
   * [Data dimension names][google.cloud.timeseriesinsights.v1.EventDimension.name] allowed for this `DataSet`.
   * If left empty, all dimension names are included. This field works as a
   * filter to avoid regenerating the data.
   * </pre>
   *
   * <code>repeated string data_names = 2;</code>
   * @param index The index of the element to return.
   * @return The dataNames at the given index.
   */
  java.lang.String getDataNames(int index);
  /**
   * <pre>
   * [Data dimension names][google.cloud.timeseriesinsights.v1.EventDimension.name] allowed for this `DataSet`.
   * If left empty, all dimension names are included. This field works as a
   * filter to avoid regenerating the data.
   * </pre>
   *
   * <code>repeated string data_names = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataNames at the given index.
   */
  com.google.protobuf.ByteString
      getDataNamesBytes(int index);

  /**
   * <pre>
   * Input data.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.DataSource data_sources = 3;</code>
   */
  java.util.List<com.google.cloud.timeseriesinsights.v1.DataSource> 
      getDataSourcesList();
  /**
   * <pre>
   * Input data.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.DataSource data_sources = 3;</code>
   */
  com.google.cloud.timeseriesinsights.v1.DataSource getDataSources(int index);
  /**
   * <pre>
   * Input data.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.DataSource data_sources = 3;</code>
   */
  int getDataSourcesCount();
  /**
   * <pre>
   * Input data.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.DataSource data_sources = 3;</code>
   */
  java.util.List<? extends com.google.cloud.timeseriesinsights.v1.DataSourceOrBuilder> 
      getDataSourcesOrBuilderList();
  /**
   * <pre>
   * Input data.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.DataSource data_sources = 3;</code>
   */
  com.google.cloud.timeseriesinsights.v1.DataSourceOrBuilder getDataSourcesOrBuilder(
      int index);

  /**
   * <pre>
   * Dataset state in the system.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet.State state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Dataset state in the system.
   * </pre>
   *
   * <code>.google.cloud.timeseriesinsights.v1.DataSet.State state = 4;</code>
   * @return The state.
   */
  com.google.cloud.timeseriesinsights.v1.DataSet.State getState();

  /**
   * <pre>
   * Dataset processing status.
   * </pre>
   *
   * <code>.google.rpc.Status status = 5;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Dataset processing status.
   * </pre>
   *
   * <code>.google.rpc.Status status = 5;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Dataset processing status.
   * </pre>
   *
   * <code>.google.rpc.Status status = 5;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Periodically we discard dataset [Event][google.cloud.timeseriesinsights.v1.Event] objects that have
   * timestamps older than 'ttl'.  Omitting this field or a zero value means no
   * events are discarded.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 6;</code>
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   * <pre>
   * Periodically we discard dataset [Event][google.cloud.timeseriesinsights.v1.Event] objects that have
   * timestamps older than 'ttl'.  Omitting this field or a zero value means no
   * events are discarded.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 6;</code>
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   * <pre>
   * Periodically we discard dataset [Event][google.cloud.timeseriesinsights.v1.Event] objects that have
   * timestamps older than 'ttl'.  Omitting this field or a zero value means no
   * events are discarded.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 6;</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();
}