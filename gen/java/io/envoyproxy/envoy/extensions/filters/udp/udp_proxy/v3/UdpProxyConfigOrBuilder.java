// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto

package io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3;

public interface UdpProxyConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The stat prefix used when emitting UDP proxy filter stats.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The stat prefix used when emitting UDP proxy filter stats.
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
   * This field is deprecated in favor of
   * :ref:`matcher &lt;envoy_v3_api_field_extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.matcher&gt;`.
   * </pre>
   *
   * <code>string cluster = 2 [deprecated = true, (.validate.rules) = { ... }</code>
   * @deprecated envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.cluster is deprecated.
   *     See envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto;l=60
   * @return Whether the cluster field is set.
   */
  @java.lang.Deprecated boolean hasCluster();
  /**
   * <pre>
   * The upstream cluster to connect to.
   * This field is deprecated in favor of
   * :ref:`matcher &lt;envoy_v3_api_field_extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.matcher&gt;`.
   * </pre>
   *
   * <code>string cluster = 2 [deprecated = true, (.validate.rules) = { ... }</code>
   * @deprecated envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.cluster is deprecated.
   *     See envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto;l=60
   * @return The cluster.
   */
  @java.lang.Deprecated java.lang.String getCluster();
  /**
   * <pre>
   * The upstream cluster to connect to.
   * This field is deprecated in favor of
   * :ref:`matcher &lt;envoy_v3_api_field_extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.matcher&gt;`.
   * </pre>
   *
   * <code>string cluster = 2 [deprecated = true, (.validate.rules) = { ... }</code>
   * @deprecated envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.cluster is deprecated.
   *     See envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto;l=60
   * @return The bytes for cluster.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * The match tree to use when resolving route actions for incoming requests.
   * See :ref:`Routing &lt;config_udp_listener_filters_udp_proxy_routing&gt;` for more information.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.Matcher matcher = 9 [(.xds.annotations.v3.field_status) = { ... }</code>
   * @return Whether the matcher field is set.
   */
  boolean hasMatcher();
  /**
   * <pre>
   * The match tree to use when resolving route actions for incoming requests.
   * See :ref:`Routing &lt;config_udp_listener_filters_udp_proxy_routing&gt;` for more information.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.Matcher matcher = 9 [(.xds.annotations.v3.field_status) = { ... }</code>
   * @return The matcher.
   */
  com.github.xds.type.matcher.v3.Matcher getMatcher();
  /**
   * <pre>
   * The match tree to use when resolving route actions for incoming requests.
   * See :ref:`Routing &lt;config_udp_listener_filters_udp_proxy_routing&gt;` for more information.
   * </pre>
   *
   * <code>.xds.type.matcher.v3.Matcher matcher = 9 [(.xds.annotations.v3.field_status) = { ... }</code>
   */
  com.github.xds.type.matcher.v3.MatcherOrBuilder getMatcherOrBuilder();

  /**
   * <pre>
   * The idle timeout for sessions. Idle is defined as no datagrams between received or sent by
   * the session. The default if not specified is 1 minute.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 3;</code>
   * @return Whether the idleTimeout field is set.
   */
  boolean hasIdleTimeout();
  /**
   * <pre>
   * The idle timeout for sessions. Idle is defined as no datagrams between received or sent by
   * the session. The default if not specified is 1 minute.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 3;</code>
   * @return The idleTimeout.
   */
  com.google.protobuf.Duration getIdleTimeout();
  /**
   * <pre>
   * The idle timeout for sessions. Idle is defined as no datagrams between received or sent by
   * the session. The default if not specified is 1 minute.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder();

  /**
   * <pre>
   * Use the remote downstream IP address as the sender IP address when sending packets to upstream hosts.
   * This option requires Envoy to be run with the ``CAP_NET_ADMIN`` capability on Linux.
   * And the IPv6 stack must be enabled on Linux kernel.
   * This option does not preserve the remote downstream port.
   * If this option is enabled, the IP address of sent datagrams will be changed to the remote downstream IP address.
   * This means that Envoy will not receive packets that are sent by upstream hosts because the upstream hosts
   * will send the packets with the remote downstream IP address as the destination. All packets will be routed
   * to the remote downstream directly if there are route rules on the upstream host side.
   * There are two options to return the packets back to the remote downstream.
   * The first one is to use DSR (Direct Server Return).
   * The other one is to configure routing rules on the upstream hosts to forward
   * all packets back to Envoy and configure iptables rules on the host running Envoy to
   * forward all packets from upstream hosts to the Envoy process so that Envoy can forward the packets to the downstream.
   * If the platform does not support this option, Envoy will raise a configuration error.
   * </pre>
   *
   * <code>bool use_original_src_ip = 4;</code>
   * @return The useOriginalSrcIp.
   */
  boolean getUseOriginalSrcIp();

  /**
   * <pre>
   * Optional configuration for UDP proxy hash policies. If hash_policies is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy hash_policies = 5 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy> 
      getHashPoliciesList();
  /**
   * <pre>
   * Optional configuration for UDP proxy hash policies. If hash_policies is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy hash_policies = 5 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy getHashPolicies(int index);
  /**
   * <pre>
   * Optional configuration for UDP proxy hash policies. If hash_policies is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy hash_policies = 5 [(.validate.rules) = { ... }</code>
   */
  int getHashPoliciesCount();
  /**
   * <pre>
   * Optional configuration for UDP proxy hash policies. If hash_policies is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy hash_policies = 5 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicyOrBuilder> 
      getHashPoliciesOrBuilderList();
  /**
   * <pre>
   * Optional configuration for UDP proxy hash policies. If hash_policies is not set, the hash-based
   * load balancing algorithms will select a host randomly. Currently the number of hash policies is
   * limited to 1.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy hash_policies = 5 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicyOrBuilder getHashPoliciesOrBuilder(
      int index);

  /**
   * <pre>
   * UDP socket configuration for upstream sockets. The default for
   * :ref:`prefer_gro &lt;envoy_v3_api_field_config.core.v3.UdpSocketConfig.prefer_gro&gt;` is true for upstream
   * sockets as the assumption is datagrams will be received from a single source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.UdpSocketConfig upstream_socket_config = 6;</code>
   * @return Whether the upstreamSocketConfig field is set.
   */
  boolean hasUpstreamSocketConfig();
  /**
   * <pre>
   * UDP socket configuration for upstream sockets. The default for
   * :ref:`prefer_gro &lt;envoy_v3_api_field_config.core.v3.UdpSocketConfig.prefer_gro&gt;` is true for upstream
   * sockets as the assumption is datagrams will be received from a single source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.UdpSocketConfig upstream_socket_config = 6;</code>
   * @return The upstreamSocketConfig.
   */
  io.envoyproxy.envoy.config.core.v3.UdpSocketConfig getUpstreamSocketConfig();
  /**
   * <pre>
   * UDP socket configuration for upstream sockets. The default for
   * :ref:`prefer_gro &lt;envoy_v3_api_field_config.core.v3.UdpSocketConfig.prefer_gro&gt;` is true for upstream
   * sockets as the assumption is datagrams will be received from a single source.
   * </pre>
   *
   * <code>.envoy.config.core.v3.UdpSocketConfig upstream_socket_config = 6;</code>
   */
  io.envoyproxy.envoy.config.core.v3.UdpSocketConfigOrBuilder getUpstreamSocketConfigOrBuilder();

  /**
   * <pre>
   * Perform per packet load balancing (upstream host selection) on each received data chunk.
   * The default if not specified is false, that means each data chunk is forwarded
   * to upstream host selected on first chunk receival for that "session" (identified by source IP/port and local IP/port).
   * </pre>
   *
   * <code>bool use_per_packet_load_balancing = 7;</code>
   * @return The usePerPacketLoadBalancing.
   */
  boolean getUsePerPacketLoadBalancing();

  /**
   * <pre>
   * Configuration for session access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 8;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLog> 
      getAccessLogList();
  /**
   * <pre>
   * Configuration for session access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 8;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AccessLog getAccessLog(int index);
  /**
   * <pre>
   * Configuration for session access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 8;</code>
   */
  int getAccessLogCount();
  /**
   * <pre>
   * Configuration for session access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 8;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.accesslog.v3.AccessLogOrBuilder> 
      getAccessLogOrBuilderList();
  /**
   * <pre>
   * Configuration for session access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog access_log = 8;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AccessLogOrBuilder getAccessLogOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration for proxy access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog proxy_access_log = 10;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLog> 
      getProxyAccessLogList();
  /**
   * <pre>
   * Configuration for proxy access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog proxy_access_log = 10;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AccessLog getProxyAccessLog(int index);
  /**
   * <pre>
   * Configuration for proxy access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog proxy_access_log = 10;</code>
   */
  int getProxyAccessLogCount();
  /**
   * <pre>
   * Configuration for proxy access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog proxy_access_log = 10;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.accesslog.v3.AccessLogOrBuilder> 
      getProxyAccessLogOrBuilderList();
  /**
   * <pre>
   * Configuration for proxy access logs emitted by the UDP proxy. Note that certain UDP specific data is emitted as :ref:`Dynamic Metadata &lt;config_access_log_format_dynamic_metadata&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.accesslog.v3.AccessLog proxy_access_log = 10;</code>
   */
  io.envoyproxy.envoy.config.accesslog.v3.AccessLogOrBuilder getProxyAccessLogOrBuilder(
      int index);

  public io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.RouteSpecifierCase getRouteSpecifierCase();
}
