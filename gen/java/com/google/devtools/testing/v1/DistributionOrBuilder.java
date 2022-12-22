// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_environment_discovery.proto

package com.google.devtools.testing.v1;

public interface DistributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The time this distribution was measured.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp measurement_time = 1;</code>
   * @return Whether the measurementTime field is set.
   */
  boolean hasMeasurementTime();
  /**
   * <pre>
   * Output only. The time this distribution was measured.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp measurement_time = 1;</code>
   * @return The measurementTime.
   */
  com.google.protobuf.Timestamp getMeasurementTime();
  /**
   * <pre>
   * Output only. The time this distribution was measured.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp measurement_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMeasurementTimeOrBuilder();

  /**
   * <pre>
   * Output only. The estimated fraction (0-1) of the total market with this
   * configuration.
   * </pre>
   *
   * <code>double market_share = 2;</code>
   * @return The marketShare.
   */
  double getMarketShare();
}