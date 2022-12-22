// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/rate_limit_quota/v3/rate_limit_quota.proto

package io.envoyproxy.envoy.extensions.filters.http.rate_limit_quota.v3;

public interface RateLimitQuotaFilterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaFilterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configures the gRPC Rate Limit Quota Service (RLQS) RateLimitQuotaService.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService rlqs_server = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the rlqsServer field is set.
   */
  boolean hasRlqsServer();
  /**
   * <pre>
   * Configures the gRPC Rate Limit Quota Service (RLQS) RateLimitQuotaService.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService rlqs_server = 1 [(.validate.rules) = { ... }</code>
   * @return The rlqsServer.
   */
  io.envoyproxy.envoy.config.core.v3.GrpcService getRlqsServer();
  /**
   * <pre>
   * Configures the gRPC Rate Limit Quota Service (RLQS) RateLimitQuotaService.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService rlqs_server = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getRlqsServerOrBuilder();

  /**
   * <pre>
   * The application domain to use when calling the service. This enables sharing the quota
   * server between different applications without fear of overlap.
   * E.g., "envoy".
   * </pre>
   *
   * <code>string domain = 2 [(.validate.rules) = { ... }</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * The application domain to use when calling the service. This enables sharing the quota
   * server between different applications without fear of overlap.
   * E.g., "envoy".
   * </pre>
   *
   * <code>string domain = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * The match tree to use for grouping incoming requests into buckets.
   * Example:
   * .. validated-code-block:: yaml
   *   :type-name: xds.type.matcher.v3.Matcher
   *   matcher_list:
   *     matchers:
   *     # Assign requests with header['env'] set to 'staging' to the bucket { name: 'staging' }
   *     - predicate:
   *         single_predicate:
   *           input:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/envoy.type.matcher.v3.HttpRequestHeaderMatchInput
   *               header_name: env
   *           value_match:
   *             exact: staging
   *       on_match:
   *         action:
   *           typed_config:
   *             '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *             bucket_id_builder:
   *               bucket_id_builder:
   *                 name:
   *                   string_value: staging
   *     # Assign requests with header['user_group'] set to 'admin' to the bucket { acl: 'admin_users' }
   *     - predicate:
   *         single_predicate:
   *           input:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/xds.type.matcher.v3.HttpAttributesCelMatchInput
   *           custom_match:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/xds.type.matcher.v3.CelMatcher
   *               expr_match:
   *                 # Shortened for illustration purposes. Here should be parsed CEL expression:
   *                 # request.headers['user_group'] == 'admin'
   *                 parsed_expr: {}
   *       on_match:
   *         action:
   *           typed_config:
   *             '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *             bucket_id_builder:
   *               bucket_id_builder:
   *                 acl:
   *                   string_value: admin_users
   *   # Catch-all clause for the requests not matched by any of the matchers.
   *   # In this example, deny all requests.
   *   on_no_match:
   *     action:
   *       typed_config:
   *         '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *         no_assignment_behavior:
   *           fallback_rate_limit:
   *             blanket_rule: DENY_ALL
   * .. attention::
   *  The first matched group wins. Once the request is matched into a bucket, matcher
   *  evaluation ends.
   * Use ``on_no_match`` field to assign the catch-all bucket. If a request is not matched
   * into any bucket, and there's no  ``on_no_match`` field configured, the request will be
   * ALLOWED by default. It will NOT be reported to the RLQS server.
   * Refer to :ref:`Unified Matcher API &lt;envoy_v3_api_msg_.xds.type.matcher.v3.Matcher&gt;`
   * documentation for more information on the matcher trees.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.Matcher bucket_matchers = 3 [(.validate.rules) = { ... }</code>
   * @return Whether the bucketMatchers field is set.
   */
  boolean hasBucketMatchers();
  /**
   * <pre>
   * The match tree to use for grouping incoming requests into buckets.
   * Example:
   * .. validated-code-block:: yaml
   *   :type-name: xds.type.matcher.v3.Matcher
   *   matcher_list:
   *     matchers:
   *     # Assign requests with header['env'] set to 'staging' to the bucket { name: 'staging' }
   *     - predicate:
   *         single_predicate:
   *           input:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/envoy.type.matcher.v3.HttpRequestHeaderMatchInput
   *               header_name: env
   *           value_match:
   *             exact: staging
   *       on_match:
   *         action:
   *           typed_config:
   *             '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *             bucket_id_builder:
   *               bucket_id_builder:
   *                 name:
   *                   string_value: staging
   *     # Assign requests with header['user_group'] set to 'admin' to the bucket { acl: 'admin_users' }
   *     - predicate:
   *         single_predicate:
   *           input:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/xds.type.matcher.v3.HttpAttributesCelMatchInput
   *           custom_match:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/xds.type.matcher.v3.CelMatcher
   *               expr_match:
   *                 # Shortened for illustration purposes. Here should be parsed CEL expression:
   *                 # request.headers['user_group'] == 'admin'
   *                 parsed_expr: {}
   *       on_match:
   *         action:
   *           typed_config:
   *             '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *             bucket_id_builder:
   *               bucket_id_builder:
   *                 acl:
   *                   string_value: admin_users
   *   # Catch-all clause for the requests not matched by any of the matchers.
   *   # In this example, deny all requests.
   *   on_no_match:
   *     action:
   *       typed_config:
   *         '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *         no_assignment_behavior:
   *           fallback_rate_limit:
   *             blanket_rule: DENY_ALL
   * .. attention::
   *  The first matched group wins. Once the request is matched into a bucket, matcher
   *  evaluation ends.
   * Use ``on_no_match`` field to assign the catch-all bucket. If a request is not matched
   * into any bucket, and there's no  ``on_no_match`` field configured, the request will be
   * ALLOWED by default. It will NOT be reported to the RLQS server.
   * Refer to :ref:`Unified Matcher API &lt;envoy_v3_api_msg_.xds.type.matcher.v3.Matcher&gt;`
   * documentation for more information on the matcher trees.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.Matcher bucket_matchers = 3 [(.validate.rules) = { ... }</code>
   * @return The bucketMatchers.
   */
  com.github.xds.type.matcher.v3.Matcher getBucketMatchers();
  /**
   * <pre>
   * The match tree to use for grouping incoming requests into buckets.
   * Example:
   * .. validated-code-block:: yaml
   *   :type-name: xds.type.matcher.v3.Matcher
   *   matcher_list:
   *     matchers:
   *     # Assign requests with header['env'] set to 'staging' to the bucket { name: 'staging' }
   *     - predicate:
   *         single_predicate:
   *           input:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/envoy.type.matcher.v3.HttpRequestHeaderMatchInput
   *               header_name: env
   *           value_match:
   *             exact: staging
   *       on_match:
   *         action:
   *           typed_config:
   *             '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *             bucket_id_builder:
   *               bucket_id_builder:
   *                 name:
   *                   string_value: staging
   *     # Assign requests with header['user_group'] set to 'admin' to the bucket { acl: 'admin_users' }
   *     - predicate:
   *         single_predicate:
   *           input:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/xds.type.matcher.v3.HttpAttributesCelMatchInput
   *           custom_match:
   *             typed_config:
   *               '&#64;type': type.googleapis.com/xds.type.matcher.v3.CelMatcher
   *               expr_match:
   *                 # Shortened for illustration purposes. Here should be parsed CEL expression:
   *                 # request.headers['user_group'] == 'admin'
   *                 parsed_expr: {}
   *       on_match:
   *         action:
   *           typed_config:
   *             '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *             bucket_id_builder:
   *               bucket_id_builder:
   *                 acl:
   *                   string_value: admin_users
   *   # Catch-all clause for the requests not matched by any of the matchers.
   *   # In this example, deny all requests.
   *   on_no_match:
   *     action:
   *       typed_config:
   *         '&#64;type': type.googleapis.com/envoy.extensions.filters.http.rate_limit_quota.v3.RateLimitQuotaBucketSettings
   *         no_assignment_behavior:
   *           fallback_rate_limit:
   *             blanket_rule: DENY_ALL
   * .. attention::
   *  The first matched group wins. Once the request is matched into a bucket, matcher
   *  evaluation ends.
   * Use ``on_no_match`` field to assign the catch-all bucket. If a request is not matched
   * into any bucket, and there's no  ``on_no_match`` field configured, the request will be
   * ALLOWED by default. It will NOT be reported to the RLQS server.
   * Refer to :ref:`Unified Matcher API &lt;envoy_v3_api_msg_.xds.type.matcher.v3.Matcher&gt;`
   * documentation for more information on the matcher trees.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.Matcher bucket_matchers = 3 [(.validate.rules) = { ... }</code>
   */
  com.github.xds.type.matcher.v3.MatcherOrBuilder getBucketMatchersOrBuilder();

  /**
   * <pre>
   * If set, this will enable -- but not necessarily enforce -- the rate limit for the given
   * fraction of requests.
   * Defaults to 100% of requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enabled = 4;</code>
   * @return Whether the filterEnabled field is set.
   */
  boolean hasFilterEnabled();
  /**
   * <pre>
   * If set, this will enable -- but not necessarily enforce -- the rate limit for the given
   * fraction of requests.
   * Defaults to 100% of requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enabled = 4;</code>
   * @return The filterEnabled.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getFilterEnabled();
  /**
   * <pre>
   * If set, this will enable -- but not necessarily enforce -- the rate limit for the given
   * fraction of requests.
   * Defaults to 100% of requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enabled = 4;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercentOrBuilder getFilterEnabledOrBuilder();

  /**
   * <pre>
   * If set, this will enforce the rate limit decisions for the given fraction of requests.
   * For requests that are not enforced the filter will still obtain the quota and include it
   * in the load computation, however the request will always be allowed regardless of the outcome
   * of quota application. This allows validation or testing of the rate limiting service
   * infrastructure without disrupting existing traffic.
   * Note: this only applies to the fraction of enabled requests.
   * Defaults to 100% of requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enforced = 5;</code>
   * @return Whether the filterEnforced field is set.
   */
  boolean hasFilterEnforced();
  /**
   * <pre>
   * If set, this will enforce the rate limit decisions for the given fraction of requests.
   * For requests that are not enforced the filter will still obtain the quota and include it
   * in the load computation, however the request will always be allowed regardless of the outcome
   * of quota application. This allows validation or testing of the rate limiting service
   * infrastructure without disrupting existing traffic.
   * Note: this only applies to the fraction of enabled requests.
   * Defaults to 100% of requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enforced = 5;</code>
   * @return The filterEnforced.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getFilterEnforced();
  /**
   * <pre>
   * If set, this will enforce the rate limit decisions for the given fraction of requests.
   * For requests that are not enforced the filter will still obtain the quota and include it
   * in the load computation, however the request will always be allowed regardless of the outcome
   * of quota application. This allows validation or testing of the rate limiting service
   * infrastructure without disrupting existing traffic.
   * Note: this only applies to the fraction of enabled requests.
   * Defaults to 100% of requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enforced = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercentOrBuilder getFilterEnforcedOrBuilder();

  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request that
   * has been rate limited and is also forwarded upstream. This can only occur when the
   * filter is enabled but not enforced.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption request_headers_to_add_when_not_enforced = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.HeaderValueOption> 
      getRequestHeadersToAddWhenNotEnforcedList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request that
   * has been rate limited and is also forwarded upstream. This can only occur when the
   * filter is enabled but not enforced.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption request_headers_to_add_when_not_enforced = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOption getRequestHeadersToAddWhenNotEnforced(int index);
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request that
   * has been rate limited and is also forwarded upstream. This can only occur when the
   * filter is enabled but not enforced.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption request_headers_to_add_when_not_enforced = 6 [(.validate.rules) = { ... }</code>
   */
  int getRequestHeadersToAddWhenNotEnforcedCount();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request that
   * has been rate limited and is also forwarded upstream. This can only occur when the
   * filter is enabled but not enforced.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption request_headers_to_add_when_not_enforced = 6 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.HeaderValueOptionOrBuilder> 
      getRequestHeadersToAddWhenNotEnforcedOrBuilderList();
  /**
   * <pre>
   * Specifies a list of HTTP headers that should be added to each request that
   * has been rate limited and is also forwarded upstream. This can only occur when the
   * filter is enabled but not enforced.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.HeaderValueOption request_headers_to_add_when_not_enforced = 6 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.core.v3.HeaderValueOptionOrBuilder getRequestHeadersToAddWhenNotEnforcedOrBuilder(
      int index);
}