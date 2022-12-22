// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/status/v3/csds.proto

package io.envoyproxy.envoy.service.status.v3;

public interface PerXdsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.status.v3.PerXdsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Config status generated by management servers. Will not be present if the
   * CSDS server is an xDS client.
   * </pre>
   *
   * <code>.envoy.service.status.v3.ConfigStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Config status generated by management servers. Will not be present if the
   * CSDS server is an xDS client.
   * </pre>
   *
   * <code>.envoy.service.status.v3.ConfigStatus status = 1;</code>
   * @return The status.
   */
  io.envoyproxy.envoy.service.status.v3.ConfigStatus getStatus();

  /**
   * <pre>
   * Client config status is populated by xDS clients. Will not be present if
   * the CSDS server is an xDS server. No matter what the client config status
   * is, xDS clients should always dump the most recent accepted xDS config.
   * .. attention::
   *   This field is deprecated. Use :ref:`ClientResourceStatus
   *   &lt;envoy_v3_api_enum_admin.v3.ClientResourceStatus&gt;` for per-resource
   *   config status instead.
   * </pre>
   *
   * <code>.envoy.service.status.v3.ClientConfigStatus client_status = 7 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.service.status.v3.PerXdsConfig.client_status is deprecated.
   *     See envoy/service/status/v3/csds.proto;l=108
   * @return The enum numeric value on the wire for clientStatus.
   */
  @java.lang.Deprecated int getClientStatusValue();
  /**
   * <pre>
   * Client config status is populated by xDS clients. Will not be present if
   * the CSDS server is an xDS server. No matter what the client config status
   * is, xDS clients should always dump the most recent accepted xDS config.
   * .. attention::
   *   This field is deprecated. Use :ref:`ClientResourceStatus
   *   &lt;envoy_v3_api_enum_admin.v3.ClientResourceStatus&gt;` for per-resource
   *   config status instead.
   * </pre>
   *
   * <code>.envoy.service.status.v3.ClientConfigStatus client_status = 7 [deprecated = true, (.envoy.annotations.deprecated_at_minor_version) = "3.0"];</code>
   * @deprecated envoy.service.status.v3.PerXdsConfig.client_status is deprecated.
   *     See envoy/service/status/v3/csds.proto;l=108
   * @return The clientStatus.
   */
  @java.lang.Deprecated io.envoyproxy.envoy.service.status.v3.ClientConfigStatus getClientStatus();

  /**
   * <code>.envoy.admin.v3.ListenersConfigDump listener_config = 2;</code>
   * @return Whether the listenerConfig field is set.
   */
  boolean hasListenerConfig();
  /**
   * <code>.envoy.admin.v3.ListenersConfigDump listener_config = 2;</code>
   * @return The listenerConfig.
   */
  io.envoyproxy.envoy.admin.v3.ListenersConfigDump getListenerConfig();
  /**
   * <code>.envoy.admin.v3.ListenersConfigDump listener_config = 2;</code>
   */
  io.envoyproxy.envoy.admin.v3.ListenersConfigDumpOrBuilder getListenerConfigOrBuilder();

  /**
   * <code>.envoy.admin.v3.ClustersConfigDump cluster_config = 3;</code>
   * @return Whether the clusterConfig field is set.
   */
  boolean hasClusterConfig();
  /**
   * <code>.envoy.admin.v3.ClustersConfigDump cluster_config = 3;</code>
   * @return The clusterConfig.
   */
  io.envoyproxy.envoy.admin.v3.ClustersConfigDump getClusterConfig();
  /**
   * <code>.envoy.admin.v3.ClustersConfigDump cluster_config = 3;</code>
   */
  io.envoyproxy.envoy.admin.v3.ClustersConfigDumpOrBuilder getClusterConfigOrBuilder();

  /**
   * <code>.envoy.admin.v3.RoutesConfigDump route_config = 4;</code>
   * @return Whether the routeConfig field is set.
   */
  boolean hasRouteConfig();
  /**
   * <code>.envoy.admin.v3.RoutesConfigDump route_config = 4;</code>
   * @return The routeConfig.
   */
  io.envoyproxy.envoy.admin.v3.RoutesConfigDump getRouteConfig();
  /**
   * <code>.envoy.admin.v3.RoutesConfigDump route_config = 4;</code>
   */
  io.envoyproxy.envoy.admin.v3.RoutesConfigDumpOrBuilder getRouteConfigOrBuilder();

  /**
   * <code>.envoy.admin.v3.ScopedRoutesConfigDump scoped_route_config = 5;</code>
   * @return Whether the scopedRouteConfig field is set.
   */
  boolean hasScopedRouteConfig();
  /**
   * <code>.envoy.admin.v3.ScopedRoutesConfigDump scoped_route_config = 5;</code>
   * @return The scopedRouteConfig.
   */
  io.envoyproxy.envoy.admin.v3.ScopedRoutesConfigDump getScopedRouteConfig();
  /**
   * <code>.envoy.admin.v3.ScopedRoutesConfigDump scoped_route_config = 5;</code>
   */
  io.envoyproxy.envoy.admin.v3.ScopedRoutesConfigDumpOrBuilder getScopedRouteConfigOrBuilder();

  /**
   * <code>.envoy.admin.v3.EndpointsConfigDump endpoint_config = 6;</code>
   * @return Whether the endpointConfig field is set.
   */
  boolean hasEndpointConfig();
  /**
   * <code>.envoy.admin.v3.EndpointsConfigDump endpoint_config = 6;</code>
   * @return The endpointConfig.
   */
  io.envoyproxy.envoy.admin.v3.EndpointsConfigDump getEndpointConfig();
  /**
   * <code>.envoy.admin.v3.EndpointsConfigDump endpoint_config = 6;</code>
   */
  io.envoyproxy.envoy.admin.v3.EndpointsConfigDumpOrBuilder getEndpointConfigOrBuilder();

  public io.envoyproxy.envoy.service.status.v3.PerXdsConfig.PerXdsConfigCase getPerXdsConfigCase();
}