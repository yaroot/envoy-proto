// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/type/v3/range.proto

package com.github.xds.type.v3;

public interface DoubleRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xds.type.v3.DoubleRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * start of the range (inclusive)
   * </pre>
   *
   * <code>double start = 1;</code>
   * @return The start.
   */
  double getStart();

  /**
   * <pre>
   * end of the range (exclusive)
   * </pre>
   *
   * <code>double end = 2;</code>
   * @return The end.
   */
  double getEnd();
}