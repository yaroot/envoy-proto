// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/timeseriesinsights/v1/timeseries_insights.proto

package com.google.cloud.timeseriesinsights.v1;

public interface EventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.timeseriesinsights.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event dimensions.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.EventDimension dimensions = 1;</code>
   */
  java.util.List<com.google.cloud.timeseriesinsights.v1.EventDimension> 
      getDimensionsList();
  /**
   * <pre>
   * Event dimensions.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.EventDimension dimensions = 1;</code>
   */
  com.google.cloud.timeseriesinsights.v1.EventDimension getDimensions(int index);
  /**
   * <pre>
   * Event dimensions.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.EventDimension dimensions = 1;</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Event dimensions.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.EventDimension dimensions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.timeseriesinsights.v1.EventDimensionOrBuilder> 
      getDimensionsOrBuilderList();
  /**
   * <pre>
   * Event dimensions.
   * </pre>
   *
   * <code>repeated .google.cloud.timeseriesinsights.v1.EventDimension dimensions = 1;</code>
   */
  com.google.cloud.timeseriesinsights.v1.EventDimensionOrBuilder getDimensionsOrBuilder(
      int index);

  /**
   * <pre>
   * Event group ID.
   * **NOTE**: JSON encoding should use a string to hold a 64-bit integer value,
   * because a native JSON number holds only 53 binary bits for an integer.
   * </pre>
   *
   * <code>int64 group_id = 2;</code>
   * @return The groupId.
   */
  long getGroupId();

  /**
   * <pre>
   * Event timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * Event timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * Event timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();
}