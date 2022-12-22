// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/common.proto

package com.google.devtools.resultstore.v2;

public interface TimingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.Timing)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time the resource started running. This is in UTC Epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * The time the resource started running. This is in UTC Epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * The time the resource started running. This is in UTC Epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * The duration for which the resource ran.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <pre>
   * The duration for which the resource ran.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <pre>
   * The duration for which the resource ran.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();
}