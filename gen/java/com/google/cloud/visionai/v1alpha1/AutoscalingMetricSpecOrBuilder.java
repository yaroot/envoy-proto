// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/platform.proto

package com.google.cloud.visionai.v1alpha1;

public interface AutoscalingMetricSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1alpha1.AutoscalingMetricSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource metric name.
   * Supported metrics:
   * * For Online Prediction:
   * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
   * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
   * </pre>
   *
   * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   * <pre>
   * Required. The resource metric name.
   * Supported metrics:
   * * For Online Prediction:
   * * `aiplatform.googleapis.com/prediction/online/accelerator/duty_cycle`
   * * `aiplatform.googleapis.com/prediction/online/cpu/utilization`
   * </pre>
   *
   * <code>string metric_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString
      getMetricNameBytes();

  /**
   * <pre>
   * The target resource utilization in percentage (1% - 100%) for the given
   * metric; once the real usage deviates from the target by a certain
   * percentage, the machine replicas change. The default value is 60
   * (representing 60%) if not provided.
   * </pre>
   *
   * <code>int32 target = 2;</code>
   * @return The target.
   */
  int getTarget();
}