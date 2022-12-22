// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/grpc_stats/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.grpc_stats.v3;

public interface FilterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.grpc_stats.v3.FilterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, the filter maintains a filter state object with the request and response message
   * counts.
   * </pre>
   *
   * <code>bool emit_filter_state = 1;</code>
   * @return The emitFilterState.
   */
  boolean getEmitFilterState();

  /**
   * <pre>
   * If set, specifies an allowlist of service/methods that will have individual stats
   * emitted for them. Any call that does not match the allowlist will be counted
   * in a stat with no method specifier: ``cluster.&lt;name&gt;.grpc.*``.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcMethodList individual_method_stats_allowlist = 2;</code>
   * @return Whether the individualMethodStatsAllowlist field is set.
   */
  boolean hasIndividualMethodStatsAllowlist();
  /**
   * <pre>
   * If set, specifies an allowlist of service/methods that will have individual stats
   * emitted for them. Any call that does not match the allowlist will be counted
   * in a stat with no method specifier: ``cluster.&lt;name&gt;.grpc.*``.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcMethodList individual_method_stats_allowlist = 2;</code>
   * @return The individualMethodStatsAllowlist.
   */
  io.envoyproxy.envoy.config.core.v3.GrpcMethodList getIndividualMethodStatsAllowlist();
  /**
   * <pre>
   * If set, specifies an allowlist of service/methods that will have individual stats
   * emitted for them. Any call that does not match the allowlist will be counted
   * in a stat with no method specifier: ``cluster.&lt;name&gt;.grpc.*``.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcMethodList individual_method_stats_allowlist = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.GrpcMethodListOrBuilder getIndividualMethodStatsAllowlistOrBuilder();

  /**
   * <pre>
   * If set to true, emit stats for all service/method names.
   * If set to false, emit stats for all service/message types to the same stats without including
   * the service/method in the name, with prefix ``cluster.&lt;name&gt;.grpc``. This can be useful if
   * service/method granularity is not needed, or if each cluster only receives a single method.
   * .. attention::
   *   This option is only safe if all clients are trusted. If this option is enabled
   *   with untrusted clients, the clients could cause unbounded growth in the number of stats in
   *   Envoy, using unbounded memory and potentially slowing down stats pipelines.
   * .. attention::
   *   If neither ``individual_method_stats_allowlist`` nor ``stats_for_all_methods`` is set, the
   *   behavior will default to ``stats_for_all_methods=false``. This default value is changed due
   *   to the previous value being deprecated. This behavior can be changed with runtime override
   *   ``envoy.deprecated_features.grpc_stats_filter_enable_stats_for_all_methods_by_default``.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue stats_for_all_methods = 3;</code>
   * @return Whether the statsForAllMethods field is set.
   */
  boolean hasStatsForAllMethods();
  /**
   * <pre>
   * If set to true, emit stats for all service/method names.
   * If set to false, emit stats for all service/message types to the same stats without including
   * the service/method in the name, with prefix ``cluster.&lt;name&gt;.grpc``. This can be useful if
   * service/method granularity is not needed, or if each cluster only receives a single method.
   * .. attention::
   *   This option is only safe if all clients are trusted. If this option is enabled
   *   with untrusted clients, the clients could cause unbounded growth in the number of stats in
   *   Envoy, using unbounded memory and potentially slowing down stats pipelines.
   * .. attention::
   *   If neither ``individual_method_stats_allowlist`` nor ``stats_for_all_methods`` is set, the
   *   behavior will default to ``stats_for_all_methods=false``. This default value is changed due
   *   to the previous value being deprecated. This behavior can be changed with runtime override
   *   ``envoy.deprecated_features.grpc_stats_filter_enable_stats_for_all_methods_by_default``.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue stats_for_all_methods = 3;</code>
   * @return The statsForAllMethods.
   */
  com.google.protobuf.BoolValue getStatsForAllMethods();
  /**
   * <pre>
   * If set to true, emit stats for all service/method names.
   * If set to false, emit stats for all service/message types to the same stats without including
   * the service/method in the name, with prefix ``cluster.&lt;name&gt;.grpc``. This can be useful if
   * service/method granularity is not needed, or if each cluster only receives a single method.
   * .. attention::
   *   This option is only safe if all clients are trusted. If this option is enabled
   *   with untrusted clients, the clients could cause unbounded growth in the number of stats in
   *   Envoy, using unbounded memory and potentially slowing down stats pipelines.
   * .. attention::
   *   If neither ``individual_method_stats_allowlist`` nor ``stats_for_all_methods`` is set, the
   *   behavior will default to ``stats_for_all_methods=false``. This default value is changed due
   *   to the previous value being deprecated. This behavior can be changed with runtime override
   *   ``envoy.deprecated_features.grpc_stats_filter_enable_stats_for_all_methods_by_default``.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue stats_for_all_methods = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getStatsForAllMethodsOrBuilder();

  /**
   * <pre>
   * If true, the filter will gather a histogram for the request time of the upstream.
   * It works with :ref:`stats_for_all_methods
   * &lt;envoy_v3_api_field_extensions.filters.http.grpc_stats.v3.FilterConfig.stats_for_all_methods&gt;`
   * and :ref:`individual_method_stats_allowlist
   * &lt;envoy_v3_api_field_extensions.filters.http.grpc_stats.v3.FilterConfig.individual_method_stats_allowlist&gt;` the same way
   * request_message_count and response_message_count works.
   * </pre>
   *
   * <code>bool enable_upstream_stats = 4;</code>
   * @return The enableUpstreamStats.
   */
  boolean getEnableUpstreamStats();

  /**
   * <pre>
   * If true, the filter will replace dots in the grpc_service_name with underscores before emitting
   * the metrics. Only works when :ref:`stats_for_all_methods
   * &lt;envoy_v3_api_field_extensions.filters.http.grpc_stats.v3.FilterConfig.stats_for_all_methods&gt;`
   * is set to true. It could cause metrics to be merged if the edited service name conflicts with
   * an existing service. For example there are both service "foo.bar" &amp; "foo_bar" running.
   * This config can fix incorrect gRPC metrics with dots because the existing stats tag extractor
   * assumes no dots in the gRPC service name. By default this is set as false.
   * </pre>
   *
   * <code>bool replace_dots_in_grpc_service_name = 5;</code>
   * @return The replaceDotsInGrpcServiceName.
   */
  boolean getReplaceDotsInGrpcServiceName();

  public io.envoyproxy.envoy.extensions.filters.http.grpc_stats.v3.FilterConfig.PerMethodStatSpecifierCase getPerMethodStatSpecifierCase();
}