// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/http/dynamic_forward_proxy/v2alpha/dynamic_forward_proxy.proto

package io.envoyproxy.envoy.config.filter.http.dynamic_forward_proxy.v2alpha;

public interface FilterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.http.dynamic_forward_proxy.v2alpha.FilterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The DNS cache configuration that the filter will attach to. Note this configuration must
   * match that of associated :ref:`dynamic forward proxy cluster configuration
   * &lt;envoy_api_field_config.cluster.dynamic_forward_proxy.v2alpha.ClusterConfig.dns_cache_config&gt;`.
   * </pre>
   *
   * <code>.envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig dns_cache_config = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the dnsCacheConfig field is set.
   */
  boolean hasDnsCacheConfig();
  /**
   * <pre>
   * The DNS cache configuration that the filter will attach to. Note this configuration must
   * match that of associated :ref:`dynamic forward proxy cluster configuration
   * &lt;envoy_api_field_config.cluster.dynamic_forward_proxy.v2alpha.ClusterConfig.dns_cache_config&gt;`.
   * </pre>
   *
   * <code>.envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig dns_cache_config = 1 [(.validate.rules) = { ... }</code>
   * @return The dnsCacheConfig.
   */
  io.envoyproxy.envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig getDnsCacheConfig();
  /**
   * <pre>
   * The DNS cache configuration that the filter will attach to. Note this configuration must
   * match that of associated :ref:`dynamic forward proxy cluster configuration
   * &lt;envoy_api_field_config.cluster.dynamic_forward_proxy.v2alpha.ClusterConfig.dns_cache_config&gt;`.
   * </pre>
   *
   * <code>.envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig dns_cache_config = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfigOrBuilder getDnsCacheConfigOrBuilder();
}