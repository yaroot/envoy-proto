// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/adaptive_concurrency/v3/adaptive_concurrency.proto

package io.envoyproxy.envoy.extensions.filters.http.adaptive_concurrency.v3;

public interface AdaptiveConcurrencyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.adaptive_concurrency.v3.AdaptiveConcurrency)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Gradient concurrency control will be used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.adaptive_concurrency.v3.GradientControllerConfig gradient_controller_config = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the gradientControllerConfig field is set.
   */
  boolean hasGradientControllerConfig();
  /**
   * <pre>
   * Gradient concurrency control will be used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.adaptive_concurrency.v3.GradientControllerConfig gradient_controller_config = 1 [(.validate.rules) = { ... }</code>
   * @return The gradientControllerConfig.
   */
  io.envoyproxy.envoy.extensions.filters.http.adaptive_concurrency.v3.GradientControllerConfig getGradientControllerConfig();
  /**
   * <pre>
   * Gradient concurrency control will be used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.adaptive_concurrency.v3.GradientControllerConfig gradient_controller_config = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.adaptive_concurrency.v3.GradientControllerConfigOrBuilder getGradientControllerConfigOrBuilder();

  /**
   * <pre>
   * If set to false, the adaptive concurrency filter will operate as a pass-through filter. If the
   * message is unspecified, the filter will be enabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag enabled = 2;</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * If set to false, the adaptive concurrency filter will operate as a pass-through filter. If the
   * message is unspecified, the filter will be enabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag enabled = 2;</code>
   * @return The enabled.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFeatureFlag getEnabled();
  /**
   * <pre>
   * If set to false, the adaptive concurrency filter will operate as a pass-through filter. If the
   * message is unspecified, the filter will be enabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag enabled = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFeatureFlagOrBuilder getEnabledOrBuilder();

  /**
   * <pre>
   * This field allows for a custom HTTP response status code to the downstream client when
   * the concurrency limit has been exceeded.
   * Defaults to 503 (Service Unavailable).
   * .. note::
   *   If this is set to &lt; 400, 503 will be used instead.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus concurrency_limit_exceeded_status = 3;</code>
   * @return Whether the concurrencyLimitExceededStatus field is set.
   */
  boolean hasConcurrencyLimitExceededStatus();
  /**
   * <pre>
   * This field allows for a custom HTTP response status code to the downstream client when
   * the concurrency limit has been exceeded.
   * Defaults to 503 (Service Unavailable).
   * .. note::
   *   If this is set to &lt; 400, 503 will be used instead.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus concurrency_limit_exceeded_status = 3;</code>
   * @return The concurrencyLimitExceededStatus.
   */
  io.envoyproxy.envoy.type.v3.HttpStatus getConcurrencyLimitExceededStatus();
  /**
   * <pre>
   * This field allows for a custom HTTP response status code to the downstream client when
   * the concurrency limit has been exceeded.
   * Defaults to 503 (Service Unavailable).
   * .. note::
   *   If this is set to &lt; 400, 503 will be used instead.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus concurrency_limit_exceeded_status = 3;</code>
   */
  io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder getConcurrencyLimitExceededStatusOrBuilder();

  public io.envoyproxy.envoy.extensions.filters.http.adaptive_concurrency.v3.AdaptiveConcurrency.ConcurrencyControllerConfigCase getConcurrencyControllerConfigCase();
}
