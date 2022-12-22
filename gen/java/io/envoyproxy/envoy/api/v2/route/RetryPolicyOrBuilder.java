// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/route/route_components.proto

package io.envoyproxy.envoy.api.v2.route;

public interface RetryPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.route.RetryPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the conditions under which retry takes place. These are the same
   * conditions documented for :ref:`config_http_filters_router_x-envoy-retry-on` and
   * :ref:`config_http_filters_router_x-envoy-retry-grpc-on`.
   * </pre>
   *
   * <code>string retry_on = 1;</code>
   * @return The retryOn.
   */
  java.lang.String getRetryOn();
  /**
   * <pre>
   * Specifies the conditions under which retry takes place. These are the same
   * conditions documented for :ref:`config_http_filters_router_x-envoy-retry-on` and
   * :ref:`config_http_filters_router_x-envoy-retry-grpc-on`.
   * </pre>
   *
   * <code>string retry_on = 1;</code>
   * @return The bytes for retryOn.
   */
  com.google.protobuf.ByteString
      getRetryOnBytes();

  /**
   * <pre>
   * Specifies the allowed number of retries. This parameter is optional and
   * defaults to 1. These are the same conditions documented for
   * :ref:`config_http_filters_router_x-envoy-max-retries`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_retries = 2;</code>
   * @return Whether the numRetries field is set.
   */
  boolean hasNumRetries();
  /**
   * <pre>
   * Specifies the allowed number of retries. This parameter is optional and
   * defaults to 1. These are the same conditions documented for
   * :ref:`config_http_filters_router_x-envoy-max-retries`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_retries = 2;</code>
   * @return The numRetries.
   */
  com.google.protobuf.UInt32Value getNumRetries();
  /**
   * <pre>
   * Specifies the allowed number of retries. This parameter is optional and
   * defaults to 1. These are the same conditions documented for
   * :ref:`config_http_filters_router_x-envoy-max-retries`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value num_retries = 2;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getNumRetriesOrBuilder();

  /**
   * <pre>
   * Specifies a non-zero upstream timeout per retry attempt. This parameter is optional. The
   * same conditions documented for
   * :ref:`config_http_filters_router_x-envoy-upstream-rq-per-try-timeout-ms` apply.
   * .. note::
   *   If left unspecified, Envoy will use the global
   *   :ref:`route timeout &lt;envoy_api_field_route.RouteAction.timeout&gt;` for the request.
   *   Consequently, when using a :ref:`5xx &lt;config_http_filters_router_x-envoy-retry-on&gt;` based
   *   retry policy, a request that times out will not be retried as the total timeout budget
   *   would have been exhausted.
   * </pre>
   *
   * <code>.google.protobuf.Duration per_try_timeout = 3;</code>
   * @return Whether the perTryTimeout field is set.
   */
  boolean hasPerTryTimeout();
  /**
   * <pre>
   * Specifies a non-zero upstream timeout per retry attempt. This parameter is optional. The
   * same conditions documented for
   * :ref:`config_http_filters_router_x-envoy-upstream-rq-per-try-timeout-ms` apply.
   * .. note::
   *   If left unspecified, Envoy will use the global
   *   :ref:`route timeout &lt;envoy_api_field_route.RouteAction.timeout&gt;` for the request.
   *   Consequently, when using a :ref:`5xx &lt;config_http_filters_router_x-envoy-retry-on&gt;` based
   *   retry policy, a request that times out will not be retried as the total timeout budget
   *   would have been exhausted.
   * </pre>
   *
   * <code>.google.protobuf.Duration per_try_timeout = 3;</code>
   * @return The perTryTimeout.
   */
  com.google.protobuf.Duration getPerTryTimeout();
  /**
   * <pre>
   * Specifies a non-zero upstream timeout per retry attempt. This parameter is optional. The
   * same conditions documented for
   * :ref:`config_http_filters_router_x-envoy-upstream-rq-per-try-timeout-ms` apply.
   * .. note::
   *   If left unspecified, Envoy will use the global
   *   :ref:`route timeout &lt;envoy_api_field_route.RouteAction.timeout&gt;` for the request.
   *   Consequently, when using a :ref:`5xx &lt;config_http_filters_router_x-envoy-retry-on&gt;` based
   *   retry policy, a request that times out will not be retried as the total timeout budget
   *   would have been exhausted.
   * </pre>
   *
   * <code>.google.protobuf.Duration per_try_timeout = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getPerTryTimeoutOrBuilder();

  /**
   * <pre>
   * Specifies an implementation of a RetryPriority which is used to determine the
   * distribution of load across priorities used for retries. Refer to
   * :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more details.
   * </pre>
   *
   * <code>.envoy.api.v2.route.RetryPolicy.RetryPriority retry_priority = 4;</code>
   * @return Whether the retryPriority field is set.
   */
  boolean hasRetryPriority();
  /**
   * <pre>
   * Specifies an implementation of a RetryPriority which is used to determine the
   * distribution of load across priorities used for retries. Refer to
   * :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more details.
   * </pre>
   *
   * <code>.envoy.api.v2.route.RetryPolicy.RetryPriority retry_priority = 4;</code>
   * @return The retryPriority.
   */
  io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryPriority getRetryPriority();
  /**
   * <pre>
   * Specifies an implementation of a RetryPriority which is used to determine the
   * distribution of load across priorities used for retries. Refer to
   * :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more details.
   * </pre>
   *
   * <code>.envoy.api.v2.route.RetryPolicy.RetryPriority retry_priority = 4;</code>
   */
  io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryPriorityOrBuilder getRetryPriorityOrBuilder();

  /**
   * <pre>
   * Specifies a collection of RetryHostPredicates that will be consulted when selecting a host
   * for retries. If any of the predicates reject the host, host selection will be reattempted.
   * Refer to :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more
   * details.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.RetryPolicy.RetryHostPredicate retry_host_predicate = 5;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryHostPredicate> 
      getRetryHostPredicateList();
  /**
   * <pre>
   * Specifies a collection of RetryHostPredicates that will be consulted when selecting a host
   * for retries. If any of the predicates reject the host, host selection will be reattempted.
   * Refer to :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more
   * details.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.RetryPolicy.RetryHostPredicate retry_host_predicate = 5;</code>
   */
  io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryHostPredicate getRetryHostPredicate(int index);
  /**
   * <pre>
   * Specifies a collection of RetryHostPredicates that will be consulted when selecting a host
   * for retries. If any of the predicates reject the host, host selection will be reattempted.
   * Refer to :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more
   * details.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.RetryPolicy.RetryHostPredicate retry_host_predicate = 5;</code>
   */
  int getRetryHostPredicateCount();
  /**
   * <pre>
   * Specifies a collection of RetryHostPredicates that will be consulted when selecting a host
   * for retries. If any of the predicates reject the host, host selection will be reattempted.
   * Refer to :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more
   * details.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.RetryPolicy.RetryHostPredicate retry_host_predicate = 5;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryHostPredicateOrBuilder> 
      getRetryHostPredicateOrBuilderList();
  /**
   * <pre>
   * Specifies a collection of RetryHostPredicates that will be consulted when selecting a host
   * for retries. If any of the predicates reject the host, host selection will be reattempted.
   * Refer to :ref:`retry plugin configuration &lt;arch_overview_http_retry_plugins&gt;` for more
   * details.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.RetryPolicy.RetryHostPredicate retry_host_predicate = 5;</code>
   */
  io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryHostPredicateOrBuilder getRetryHostPredicateOrBuilder(
      int index);

  /**
   * <pre>
   * The maximum number of times host selection will be reattempted before giving up, at which
   * point the host that was last selected will be routed to. If unspecified, this will default to
   * retrying once.
   * </pre>
   *
   * <code>int64 host_selection_retry_max_attempts = 6;</code>
   * @return The hostSelectionRetryMaxAttempts.
   */
  long getHostSelectionRetryMaxAttempts();

  /**
   * <pre>
   * HTTP status codes that should trigger a retry in addition to those specified by retry_on.
   * </pre>
   *
   * <code>repeated uint32 retriable_status_codes = 7;</code>
   * @return A list containing the retriableStatusCodes.
   */
  java.util.List<java.lang.Integer> getRetriableStatusCodesList();
  /**
   * <pre>
   * HTTP status codes that should trigger a retry in addition to those specified by retry_on.
   * </pre>
   *
   * <code>repeated uint32 retriable_status_codes = 7;</code>
   * @return The count of retriableStatusCodes.
   */
  int getRetriableStatusCodesCount();
  /**
   * <pre>
   * HTTP status codes that should trigger a retry in addition to those specified by retry_on.
   * </pre>
   *
   * <code>repeated uint32 retriable_status_codes = 7;</code>
   * @param index The index of the element to return.
   * @return The retriableStatusCodes at the given index.
   */
  int getRetriableStatusCodes(int index);

  /**
   * <pre>
   * Specifies parameters that control retry back off. This parameter is optional, in which case the
   * default base interval is 25 milliseconds or, if set, the current value of the
   * `upstream.base_retry_backoff_ms` runtime parameter. The default maximum interval is 10 times
   * the base interval. The documentation for :ref:`config_http_filters_router_x-envoy-max-retries`
   * describes Envoy's back-off algorithm.
   * </pre>
   *
   * <code>.envoy.api.v2.route.RetryPolicy.RetryBackOff retry_back_off = 8;</code>
   * @return Whether the retryBackOff field is set.
   */
  boolean hasRetryBackOff();
  /**
   * <pre>
   * Specifies parameters that control retry back off. This parameter is optional, in which case the
   * default base interval is 25 milliseconds or, if set, the current value of the
   * `upstream.base_retry_backoff_ms` runtime parameter. The default maximum interval is 10 times
   * the base interval. The documentation for :ref:`config_http_filters_router_x-envoy-max-retries`
   * describes Envoy's back-off algorithm.
   * </pre>
   *
   * <code>.envoy.api.v2.route.RetryPolicy.RetryBackOff retry_back_off = 8;</code>
   * @return The retryBackOff.
   */
  io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryBackOff getRetryBackOff();
  /**
   * <pre>
   * Specifies parameters that control retry back off. This parameter is optional, in which case the
   * default base interval is 25 milliseconds or, if set, the current value of the
   * `upstream.base_retry_backoff_ms` runtime parameter. The default maximum interval is 10 times
   * the base interval. The documentation for :ref:`config_http_filters_router_x-envoy-max-retries`
   * describes Envoy's back-off algorithm.
   * </pre>
   *
   * <code>.envoy.api.v2.route.RetryPolicy.RetryBackOff retry_back_off = 8;</code>
   */
  io.envoyproxy.envoy.api.v2.route.RetryPolicy.RetryBackOffOrBuilder getRetryBackOffOrBuilder();

  /**
   * <pre>
   * HTTP response headers that trigger a retry if present in the response. A retry will be
   * triggered if any of the header matches match the upstream response headers.
   * The field is only consulted if 'retriable-headers' retry policy is active.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_headers = 9;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.route.HeaderMatcher> 
      getRetriableHeadersList();
  /**
   * <pre>
   * HTTP response headers that trigger a retry if present in the response. A retry will be
   * triggered if any of the header matches match the upstream response headers.
   * The field is only consulted if 'retriable-headers' retry policy is active.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_headers = 9;</code>
   */
  io.envoyproxy.envoy.api.v2.route.HeaderMatcher getRetriableHeaders(int index);
  /**
   * <pre>
   * HTTP response headers that trigger a retry if present in the response. A retry will be
   * triggered if any of the header matches match the upstream response headers.
   * The field is only consulted if 'retriable-headers' retry policy is active.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_headers = 9;</code>
   */
  int getRetriableHeadersCount();
  /**
   * <pre>
   * HTTP response headers that trigger a retry if present in the response. A retry will be
   * triggered if any of the header matches match the upstream response headers.
   * The field is only consulted if 'retriable-headers' retry policy is active.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_headers = 9;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.route.HeaderMatcherOrBuilder> 
      getRetriableHeadersOrBuilderList();
  /**
   * <pre>
   * HTTP response headers that trigger a retry if present in the response. A retry will be
   * triggered if any of the header matches match the upstream response headers.
   * The field is only consulted if 'retriable-headers' retry policy is active.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_headers = 9;</code>
   */
  io.envoyproxy.envoy.api.v2.route.HeaderMatcherOrBuilder getRetriableHeadersOrBuilder(
      int index);

  /**
   * <pre>
   * HTTP headers which must be present in the request for retries to be attempted.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_request_headers = 10;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.route.HeaderMatcher> 
      getRetriableRequestHeadersList();
  /**
   * <pre>
   * HTTP headers which must be present in the request for retries to be attempted.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_request_headers = 10;</code>
   */
  io.envoyproxy.envoy.api.v2.route.HeaderMatcher getRetriableRequestHeaders(int index);
  /**
   * <pre>
   * HTTP headers which must be present in the request for retries to be attempted.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_request_headers = 10;</code>
   */
  int getRetriableRequestHeadersCount();
  /**
   * <pre>
   * HTTP headers which must be present in the request for retries to be attempted.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_request_headers = 10;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.route.HeaderMatcherOrBuilder> 
      getRetriableRequestHeadersOrBuilderList();
  /**
   * <pre>
   * HTTP headers which must be present in the request for retries to be attempted.
   * </pre>
   *
   * <code>repeated .envoy.api.v2.route.HeaderMatcher retriable_request_headers = 10;</code>
   */
  io.envoyproxy.envoy.api.v2.route.HeaderMatcherOrBuilder getRetriableRequestHeadersOrBuilder(
      int index);
}