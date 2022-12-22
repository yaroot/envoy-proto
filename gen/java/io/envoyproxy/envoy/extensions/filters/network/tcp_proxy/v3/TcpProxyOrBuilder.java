// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/tcp_proxy/v3/tcp_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3;

public interface TcpProxyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_tcp_proxy_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_tcp_proxy_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * The upstream cluster to connect to.
   * </pre>
   *
   * <code>string cluster = 2;</code>
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   * <pre>
   * The upstream cluster to connect to.
   * </pre>
   *
   * <code>string cluster = 2;</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <pre>
   * The upstream cluster to connect to.
   * </pre>
   *
   * <code>string cluster = 2;</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster weighted_clusters = 10;</code>
   * @return Whether the weightedClusters field is set.
   */
  boolean hasWeightedClusters();
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster weighted_clusters = 10;</code>
   * @return The weightedClusters.
   */
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster getWeightedClusters();
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster weighted_clusters = 10;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedClusterOrBuilder getWeightedClustersOrBuilder();

  /**
   * <pre>
   * The on demand policy for the upstream cluster.
   * It applies to both
   * :ref:`TcpProxy.cluster &lt;envoy_v3_api_field_extensions.filters.network.tcp_proxy.v3.TcpProxy.cluster&gt;`
   * and
   * :ref:`TcpProxy.weighted_clusters &lt;envoy_v3_api_field_extensions.filters.network.tcp_proxy.v3.TcpProxy.weighted_clusters&gt;`.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.OnDemand on_demand = 14;</code>
   * @return Whether the onDemand field is set.
   */
  boolean hasOnDemand();
  /**
   * <pre>
   * The on demand policy for the upstream cluster.
   * It applies to both
   * :ref:`TcpProxy.cluster &lt;envoy_v3_api_field_extensions.filters.network.tcp_proxy.v3.TcpProxy.cluster&gt;`
   * and
   * :ref:`TcpProxy.weighted_clusters &lt;envoy_v3_api_field_extensions.filters.network.tcp_proxy.v3.TcpProxy.weighted_clusters&gt;`.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.OnDemand on_demand = 14;</code>
   * @return The onDemand.
   */
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.OnDemand getOnDemand();
  /**
   * <pre>
   * The on demand policy for the upstream cluster.
   * It applies to both
   * :ref:`TcpProxy.cluster &lt;envoy_v3_api_field_extensions.filters.network.tcp_proxy.v3.TcpProxy.cluster&gt;`
   * and
   * :ref:`TcpProxy.weighted_clusters &lt;envoy_v3_api_field_extensions.filters.network.tcp_proxy.v3.TcpProxy.weighted_clusters&gt;`.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.OnDemand on_demand = 14;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.OnDemandOrBuilder getOnDemandOrBuilder();

  /**
   * <pre>
   * Optional endpoint metadata match criteria. Only endpoints in the upstream
   * cluster with metadata matching that set in metadata_match will be
   * considered. The filter name should be specified as ``envoy.lb``.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 9;</code>
   * @return Whether the metadataMatch field is set.
   */
  boolean hasMetadataMatch();
  /**
   * <pre>
   * Optional endpoint metadata match criteria. Only endpoints in the upstream
   * cluster with metadata matching that set in metadata_match will be
   * considered. The filter name should be specified as ``envoy.lb``.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 9;</code>
   * @return The metadataMatch.
   */
  io.envoyproxy.envoy.config.core.v3.Metadata getMetadataMatch();
  /**
   * <pre>
   * Optional endpoint metadata match criteria. Only endpoints in the upstream
   * cluster with metadata matching that set in metadata_match will be
   * considered. The filter name should be specified as ``envoy.lb``.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 9;</code>
   */
  io.envoyproxy.envoy.config.core.v3.MetadataOrBuilder getMetadataMatchOrBuilder();

  /**
   * <pre>
   * The idle timeout for connections managed by the TCP proxy filter. The idle timeout
   * is defined as the period in which there are no bytes sent or received on either
   * the upstream or downstream connection. If not set, the default idle timeout is 1 hour. If set
   * to 0s, the timeout will be disabled.
   * .. warning::
   *   Disabling this timeout has a highly likelihood of yielding connection leaks due to lost TCP
   *   FIN packets, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 8;</code>
   * @return Whether the idleTimeout field is set.
   */
  boolean hasIdleTimeout();
  /**
   * <pre>
   * The idle timeout for connections managed by the TCP proxy filter. The idle timeout
   * is defined as the period in which there are no bytes sent or received on either
   * the upstream or downstream connection. If not set, the default idle timeout is 1 hour. If set
   * to 0s, the timeout will be disabled.
   * .. warning::
   *   Disabling this timeout has a highly likelihood of yielding connection leaks due to lost TCP
   *   FIN packets, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 8;</code>
   * @return The idleTimeout.
   */
  com.google.protobuf.Duration getIdleTimeout();
  /**
   * <pre>
   * The idle timeout for connections managed by the TCP proxy filter. The idle timeout
   * is defined as the period in which there are no bytes sent or received on either
   * the upstream or downstream connection. If not set, the default idle timeout is 1 hour. If set
   * to 0s, the timeout will be disabled.
   * .. warning::
   *   Disabling this timeout has a highly likelihood of yielding connection leaks due to lost TCP
   *   FIN packets, etc.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:] The idle timeout for connections managed by the TCP proxy
   * filter. The idle timeout is defined as the period in which there is no
   * active traffic. If not set, there is no idle timeout. When the idle timeout
   * is reached the connection will be closed. The distinction between
   * downstream_idle_timeout/upstream_idle_timeout provides a means to set
   * timeout based on the last byte sent on the downstream/upstream connection.
   * </pre>
   *
   * <code>.google.protobuf.Duration downstream_idle_timeout = 3;</code>
   * @return Whether the downstreamIdleTimeout field is set.
   */
  boolean hasDownstreamIdleTimeout();
  /**
   * <pre>
   * [#not-implemented-hide:] The idle timeout for connections managed by the TCP proxy
   * filter. The idle timeout is defined as the period in which there is no
   * active traffic. If not set, there is no idle timeout. When the idle timeout
   * is reached the connection will be closed. The distinction between
   * downstream_idle_timeout/upstream_idle_timeout provides a means to set
   * timeout based on the last byte sent on the downstream/upstream connection.
   * </pre>
   *
   * <code>.google.protobuf.Duration downstream_idle_timeout = 3;</code>
   * @return The downstreamIdleTimeout.
   */
  com.google.protobuf.Duration getDownstreamIdleTimeout();
  /**
   * <pre>
   * [#not-implemented-hide:] The idle timeout for connections managed by the TCP proxy
   * filter. The idle timeout is defined as the period in which there is no
   * active traffic. If not set, there is no idle timeout. When the idle timeout
   * is reached the connection will be closed. The distinction between
   * downstream_idle_timeout/upstream_idle_timeout provides a means to set
   * timeout based on the last byte sent on the downstream/upstream connection.
   * </pre>
   *
   * <code>.google.protobuf.Duration downstream_idle_timeout = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getDownstreamIdleTimeoutOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.google.protobuf.Duration upstream_idle_timeout = 4;</code>
   * @return Whether the upstreamIdleTimeout field is set.
   */
  boolean hasUpstreamIdleTimeout();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.google.protobuf.Duration upstream_idle_timeout = 4;</code>
   * @return The upstreamIdleTimeout.
   */
  com.google.protobuf.Duration getUpstreamIdleTimeout();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.google.protobuf.Duration upstream_idle_timeout = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getUpstreamIdleTimeoutOrBuilder();

  /**
   * <pre>
   * Configuration for :ref:`access logs &lt;arch_overview_access_logs&gt;`
   * emitted by the this tcp_proxy.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 5;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLog> 
      getAccessLogList();
  /**
   * <pre>
   * Configuration for :ref:`access logs &lt;arch_overview_access_logs&gt;`
   * emitted by the this tcp_proxy.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 5;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AccessLog getAccessLog(int index);
  /**
   * <pre>
   * Configuration for :ref:`access logs &lt;arch_overview_access_logs&gt;`
   * emitted by the this tcp_proxy.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 5;</code>
   */
  int getAccessLogCount();
  /**
   * <pre>
   * Configuration for :ref:`access logs &lt;arch_overview_access_logs&gt;`
   * emitted by the this tcp_proxy.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 5;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.accesslog.v3.AccessLogOrBuilder> 
      getAccessLogOrBuilderList();
  /**
   * <pre>
   * Configuration for :ref:`access logs &lt;arch_overview_access_logs&gt;`
   * emitted by the this tcp_proxy.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 5;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AccessLogOrBuilder getAccessLogOrBuilder(
      int index);

  /**
   * <pre>
   * The maximum number of unsuccessful connection attempts that will be made before
   * giving up. If the parameter is not specified, 1 connection attempt will be made.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_connect_attempts = 7 [(.validate.rules) = { ... }</code>
   * @return Whether the maxConnectAttempts field is set.
   */
  boolean hasMaxConnectAttempts();
  /**
   * <pre>
   * The maximum number of unsuccessful connection attempts that will be made before
   * giving up. If the parameter is not specified, 1 connection attempt will be made.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_connect_attempts = 7 [(.validate.rules) = { ... }</code>
   * @return The maxConnectAttempts.
   */
  com.google.protobuf.UInt32Value getMaxConnectAttempts();
  /**
   * <pre>
   * The maximum number of unsuccessful connection attempts that will be made before
   * giving up. If the parameter is not specified, 1 connection attempt will be made.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_connect_attempts = 7 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getMaxConnectAttemptsOrBuilder();

  /**
   * <pre>
   * Optional configuration for TCP proxy hash policy. If hash_policy is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.type.v3.HashPolicy hash_policy = 11 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.type.v3.HashPolicy> 
      getHashPolicyList();
  /**
   * <pre>
   * Optional configuration for TCP proxy hash policy. If hash_policy is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.type.v3.HashPolicy hash_policy = 11 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.type.v3.HashPolicy getHashPolicy(int index);
  /**
   * <pre>
   * Optional configuration for TCP proxy hash policy. If hash_policy is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.type.v3.HashPolicy hash_policy = 11 [(.validate.rules) = { ... }</code>
   */
  int getHashPolicyCount();
  /**
   * <pre>
   * Optional configuration for TCP proxy hash policy. If hash_policy is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.type.v3.HashPolicy hash_policy = 11 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.type.v3.HashPolicyOrBuilder> 
      getHashPolicyOrBuilderList();
  /**
   * <pre>
   * Optional configuration for TCP proxy hash policy. If hash_policy is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.type.v3.HashPolicy hash_policy = 11 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.type.v3.HashPolicyOrBuilder getHashPolicyOrBuilder(
      int index);

  /**
   * <pre>
   * If set, this configures tunneling, e.g. configuration options to tunnel TCP payload over
   * HTTP CONNECT. If this message is absent, the payload will be proxied upstream as per usual.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig tunneling_config = 12;</code>
   * @return Whether the tunnelingConfig field is set.
   */
  boolean hasTunnelingConfig();
  /**
   * <pre>
   * If set, this configures tunneling, e.g. configuration options to tunnel TCP payload over
   * HTTP CONNECT. If this message is absent, the payload will be proxied upstream as per usual.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig tunneling_config = 12;</code>
   * @return The tunnelingConfig.
   */
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig getTunnelingConfig();
  /**
   * <pre>
   * If set, this configures tunneling, e.g. configuration options to tunnel TCP payload over
   * HTTP CONNECT. If this message is absent, the payload will be proxied upstream as per usual.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig tunneling_config = 12;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfigOrBuilder getTunnelingConfigOrBuilder();

  /**
   * <pre>
   * The maximum duration of a connection. The duration is defined as the period since a connection
   * was established. If not set, there is no max duration. When max_downstream_connection_duration
   * is reached the connection will be closed. Duration must be at least 1ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_downstream_connection_duration = 13 [(.validate.rules) = { ... }</code>
   * @return Whether the maxDownstreamConnectionDuration field is set.
   */
  boolean hasMaxDownstreamConnectionDuration();
  /**
   * <pre>
   * The maximum duration of a connection. The duration is defined as the period since a connection
   * was established. If not set, there is no max duration. When max_downstream_connection_duration
   * is reached the connection will be closed. Duration must be at least 1ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_downstream_connection_duration = 13 [(.validate.rules) = { ... }</code>
   * @return The maxDownstreamConnectionDuration.
   */
  com.google.protobuf.Duration getMaxDownstreamConnectionDuration();
  /**
   * <pre>
   * The maximum duration of a connection. The duration is defined as the period since a connection
   * was established. If not set, there is no max duration. When max_downstream_connection_duration
   * is reached the connection will be closed. Duration must be at least 1ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_downstream_connection_duration = 13 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxDownstreamConnectionDurationOrBuilder();

  /**
   * <pre>
   * The interval to flush access log. The TCP proxy will flush only one access log when the connection
   * is closed by default. If this field is set, the TCP proxy will flush access log periodically with
   * the specified interval.
   * The interval must be at least 1ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration access_log_flush_interval = 15 [(.validate.rules) = { ... }</code>
   * @return Whether the accessLogFlushInterval field is set.
   */
  boolean hasAccessLogFlushInterval();
  /**
   * <pre>
   * The interval to flush access log. The TCP proxy will flush only one access log when the connection
   * is closed by default. If this field is set, the TCP proxy will flush access log periodically with
   * the specified interval.
   * The interval must be at least 1ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration access_log_flush_interval = 15 [(.validate.rules) = { ... }</code>
   * @return The accessLogFlushInterval.
   */
  com.google.protobuf.Duration getAccessLogFlushInterval();
  /**
   * <pre>
   * The interval to flush access log. The TCP proxy will flush only one access log when the connection
   * is closed by default. If this field is set, the TCP proxy will flush access log periodically with
   * the specified interval.
   * The interval must be at least 1ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration access_log_flush_interval = 15 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getAccessLogFlushIntervalOrBuilder();

  public io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.ClusterSpecifierCase getClusterSpecifierCase();
}