// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/ratelimit_strategy.proto

package io.envoyproxy.envoy.type.v3;

public interface RateLimitStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.type.v3.RateLimitStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Allow or Deny the requests.
   * If unset, allow all.
   * </pre>
   *
   * <code>.envoy.type.v3.RateLimitStrategy.BlanketRule blanket_rule = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the blanketRule field is set.
   */
  boolean hasBlanketRule();
  /**
   * <pre>
   * Allow or Deny the requests.
   * If unset, allow all.
   * </pre>
   *
   * <code>.envoy.type.v3.RateLimitStrategy.BlanketRule blanket_rule = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for blanketRule.
   */
  int getBlanketRuleValue();
  /**
   * <pre>
   * Allow or Deny the requests.
   * If unset, allow all.
   * </pre>
   *
   * <code>.envoy.type.v3.RateLimitStrategy.BlanketRule blanket_rule = 1 [(.validate.rules) = { ... }</code>
   * @return The blanketRule.
   */
  io.envoyproxy.envoy.type.v3.RateLimitStrategy.BlanketRule getBlanketRule();

  /**
   * <pre>
   * Best-effort limit of the number of requests per time unit, f.e. requests per second.
   * Does not prescribe any specific rate limiting algorithm, see :ref:`RequestsPerTimeUnit
   * &lt;envoy_v3_api_msg_type.v3.RateLimitStrategy.RequestsPerTimeUnit&gt;` for details.
   * </pre>
   *
   * <code>.envoy.type.v3.RateLimitStrategy.RequestsPerTimeUnit requests_per_time_unit = 2;</code>
   * @return Whether the requestsPerTimeUnit field is set.
   */
  boolean hasRequestsPerTimeUnit();
  /**
   * <pre>
   * Best-effort limit of the number of requests per time unit, f.e. requests per second.
   * Does not prescribe any specific rate limiting algorithm, see :ref:`RequestsPerTimeUnit
   * &lt;envoy_v3_api_msg_type.v3.RateLimitStrategy.RequestsPerTimeUnit&gt;` for details.
   * </pre>
   *
   * <code>.envoy.type.v3.RateLimitStrategy.RequestsPerTimeUnit requests_per_time_unit = 2;</code>
   * @return The requestsPerTimeUnit.
   */
  io.envoyproxy.envoy.type.v3.RateLimitStrategy.RequestsPerTimeUnit getRequestsPerTimeUnit();
  /**
   * <pre>
   * Best-effort limit of the number of requests per time unit, f.e. requests per second.
   * Does not prescribe any specific rate limiting algorithm, see :ref:`RequestsPerTimeUnit
   * &lt;envoy_v3_api_msg_type.v3.RateLimitStrategy.RequestsPerTimeUnit&gt;` for details.
   * </pre>
   *
   * <code>.envoy.type.v3.RateLimitStrategy.RequestsPerTimeUnit requests_per_time_unit = 2;</code>
   */
  io.envoyproxy.envoy.type.v3.RateLimitStrategy.RequestsPerTimeUnitOrBuilder getRequestsPerTimeUnitOrBuilder();

  /**
   * <pre>
   * Limit the requests by consuming tokens from the Token Bucket.
   * Allow the same number of requests as the number of tokens available in
   * the token bucket.
   * </pre>
   *
   * <code>.envoy.type.v3.TokenBucket token_bucket = 3;</code>
   * @return Whether the tokenBucket field is set.
   */
  boolean hasTokenBucket();
  /**
   * <pre>
   * Limit the requests by consuming tokens from the Token Bucket.
   * Allow the same number of requests as the number of tokens available in
   * the token bucket.
   * </pre>
   *
   * <code>.envoy.type.v3.TokenBucket token_bucket = 3;</code>
   * @return The tokenBucket.
   */
  io.envoyproxy.envoy.type.v3.TokenBucket getTokenBucket();
  /**
   * <pre>
   * Limit the requests by consuming tokens from the Token Bucket.
   * Allow the same number of requests as the number of tokens available in
   * the token bucket.
   * </pre>
   *
   * <code>.envoy.type.v3.TokenBucket token_bucket = 3;</code>
   */
  io.envoyproxy.envoy.type.v3.TokenBucketOrBuilder getTokenBucketOrBuilder();

  public io.envoyproxy.envoy.type.v3.RateLimitStrategy.StrategyCase getStrategyCase();
}