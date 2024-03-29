// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/health/v3/hds.proto

package io.envoyproxy.envoy.service.health.v3;

public interface ClusterHealthCheckOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.health.v3.ClusterHealthCheck)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cluster_name = 1;</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <code>string cluster_name = 1;</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>repeated .envoy.config.core.v3.HealthCheck health_checks = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.HealthCheck> 
      getHealthChecksList();
  /**
   * <code>repeated .envoy.config.core.v3.HealthCheck health_checks = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheck getHealthChecks(int index);
  /**
   * <code>repeated .envoy.config.core.v3.HealthCheck health_checks = 2;</code>
   */
  int getHealthChecksCount();
  /**
   * <code>repeated .envoy.config.core.v3.HealthCheck health_checks = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.HealthCheckOrBuilder> 
      getHealthChecksOrBuilderList();
  /**
   * <code>repeated .envoy.config.core.v3.HealthCheck health_checks = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.HealthCheckOrBuilder getHealthChecksOrBuilder(
      int index);

  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpoints locality_endpoints = 3;</code>
   */
  java.util.List<io.envoyproxy.envoy.service.health.v3.LocalityEndpoints> 
      getLocalityEndpointsList();
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpoints locality_endpoints = 3;</code>
   */
  io.envoyproxy.envoy.service.health.v3.LocalityEndpoints getLocalityEndpoints(int index);
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpoints locality_endpoints = 3;</code>
   */
  int getLocalityEndpointsCount();
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpoints locality_endpoints = 3;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.service.health.v3.LocalityEndpointsOrBuilder> 
      getLocalityEndpointsOrBuilderList();
  /**
   * <code>repeated .envoy.service.health.v3.LocalityEndpoints locality_endpoints = 3;</code>
   */
  io.envoyproxy.envoy.service.health.v3.LocalityEndpointsOrBuilder getLocalityEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional map that gets filtered by :ref:`health_checks.transport_socket_match_criteria &lt;envoy_v3_api_field_config.core.v3.HealthCheck.transport_socket_match_criteria&gt;`
   * on connection when health checking. For more details, see
   * :ref:`config.cluster.v3.Cluster.transport_socket_matches &lt;envoy_v3_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.cluster.v3.Cluster.TransportSocketMatch transport_socket_matches = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.cluster.v3.Cluster.TransportSocketMatch> 
      getTransportSocketMatchesList();
  /**
   * <pre>
   * Optional map that gets filtered by :ref:`health_checks.transport_socket_match_criteria &lt;envoy_v3_api_field_config.core.v3.HealthCheck.transport_socket_match_criteria&gt;`
   * on connection when health checking. For more details, see
   * :ref:`config.cluster.v3.Cluster.transport_socket_matches &lt;envoy_v3_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.cluster.v3.Cluster.TransportSocketMatch transport_socket_matches = 4;</code>
   */
  io.envoyproxy.envoy.config.cluster.v3.Cluster.TransportSocketMatch getTransportSocketMatches(int index);
  /**
   * <pre>
   * Optional map that gets filtered by :ref:`health_checks.transport_socket_match_criteria &lt;envoy_v3_api_field_config.core.v3.HealthCheck.transport_socket_match_criteria&gt;`
   * on connection when health checking. For more details, see
   * :ref:`config.cluster.v3.Cluster.transport_socket_matches &lt;envoy_v3_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.cluster.v3.Cluster.TransportSocketMatch transport_socket_matches = 4;</code>
   */
  int getTransportSocketMatchesCount();
  /**
   * <pre>
   * Optional map that gets filtered by :ref:`health_checks.transport_socket_match_criteria &lt;envoy_v3_api_field_config.core.v3.HealthCheck.transport_socket_match_criteria&gt;`
   * on connection when health checking. For more details, see
   * :ref:`config.cluster.v3.Cluster.transport_socket_matches &lt;envoy_v3_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.cluster.v3.Cluster.TransportSocketMatch transport_socket_matches = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.cluster.v3.Cluster.TransportSocketMatchOrBuilder> 
      getTransportSocketMatchesOrBuilderList();
  /**
   * <pre>
   * Optional map that gets filtered by :ref:`health_checks.transport_socket_match_criteria &lt;envoy_v3_api_field_config.core.v3.HealthCheck.transport_socket_match_criteria&gt;`
   * on connection when health checking. For more details, see
   * :ref:`config.cluster.v3.Cluster.transport_socket_matches &lt;envoy_v3_api_field_config.cluster.v3.Cluster.transport_socket_matches&gt;`.
   * </pre>
   *
   * <code>repeated .envoy.config.cluster.v3.Cluster.TransportSocketMatch transport_socket_matches = 4;</code>
   */
  io.envoyproxy.envoy.config.cluster.v3.Cluster.TransportSocketMatchOrBuilder getTransportSocketMatchesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional configuration used to bind newly established upstream connections.
   * If the address and port are empty, no bind will be performed.
   * </pre>
   *
   * <code>.envoy.config.core.v3.BindConfig upstream_bind_config = 5;</code>
   * @return Whether the upstreamBindConfig field is set.
   */
  boolean hasUpstreamBindConfig();
  /**
   * <pre>
   * Optional configuration used to bind newly established upstream connections.
   * If the address and port are empty, no bind will be performed.
   * </pre>
   *
   * <code>.envoy.config.core.v3.BindConfig upstream_bind_config = 5;</code>
   * @return The upstreamBindConfig.
   */
  io.envoyproxy.envoy.config.core.v3.BindConfig getUpstreamBindConfig();
  /**
   * <pre>
   * Optional configuration used to bind newly established upstream connections.
   * If the address and port are empty, no bind will be performed.
   * </pre>
   *
   * <code>.envoy.config.core.v3.BindConfig upstream_bind_config = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.BindConfigOrBuilder getUpstreamBindConfigOrBuilder();
}
