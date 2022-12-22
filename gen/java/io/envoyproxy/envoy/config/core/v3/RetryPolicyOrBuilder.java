// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

public interface RetryPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.RetryPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies parameters that control :ref:`retry backoff strategy &lt;envoy_v3_api_msg_config.core.v3.BackoffStrategy&gt;`.
   * This parameter is optional, in which case the default base interval is 1000 milliseconds. The
   * default maximum interval is 10 times the base interval.
   * </pre>
   *
   * <code>.envoy.config.core.v3.BackoffStrategy retry_back_off = 1;</code>
   * @return Whether the retryBackOff field is set.
   */
  boolean hasRetryBackOff();
  /**
   * <pre>
   * Specifies parameters that control :ref:`retry backoff strategy &lt;envoy_v3_api_msg_config.core.v3.BackoffStrategy&gt;`.
   * This parameter is optional, in which case the default base interval is 1000 milliseconds. The
   * default maximum interval is 10 times the base interval.
   * </pre>
   *
   * <code>.envoy.config.core.v3.BackoffStrategy retry_back_off = 1;</code>
   * @return The retryBackOff.
   */
  io.envoyproxy.envoy.config.core.v3.BackoffStrategy getRetryBackOff();
  /**
   * <pre>
   * Specifies parameters that control :ref:`retry backoff strategy &lt;envoy_v3_api_msg_config.core.v3.BackoffStrategy&gt;`.
   * This parameter is optional, in which case the default base interval is 1000 milliseconds. The
   * default maximum interval is 10 times the base interval.
   * </pre>
   *
   * <code>.envoy.config.core.v3.BackoffStrategy retry_back_off = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.BackoffStrategyOrBuilder getRetryBackOffOrBuilder();

  /**
   * <pre>
   * Specifies the allowed number of retries. This parameter is optional and
   * defaults to 1.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_retries = 2 [(.udpa.annotations.field_migrate) = { ... }</code>
   * @return Whether the numRetries field is set.
   */
  boolean hasNumRetries();
  /**
   * <pre>
   * Specifies the allowed number of retries. This parameter is optional and
   * defaults to 1.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_retries = 2 [(.udpa.annotations.field_migrate) = { ... }</code>
   * @return The numRetries.
   */
  com.google.protobuf.UInt32Value getNumRetries();
  /**
   * <pre>
   * Specifies the allowed number of retries. This parameter is optional and
   * defaults to 1.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_retries = 2 [(.udpa.annotations.field_migrate) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getNumRetriesOrBuilder();
}