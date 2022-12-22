// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/status/v2/csds.proto

package io.envoyproxy.envoy.service.status.v2;

public interface PerXdsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.status.v2.PerXdsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.envoy.service.status.v2.ConfigStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.envoy.service.status.v2.ConfigStatus status = 1;</code>
   * @return The status.
   */
  io.envoyproxy.envoy.service.status.v2.ConfigStatus getStatus();

  /**
   * <code>.envoy.admin.v2alpha.ListenersConfigDump listener_config = 2;</code>
   * @return Whether the listenerConfig field is set.
   */
  boolean hasListenerConfig();
  /**
   * <code>.envoy.admin.v2alpha.ListenersConfigDump listener_config = 2;</code>
   * @return The listenerConfig.
   */
  io.envoyproxy.envoy.admin.v2alpha.ListenersConfigDump getListenerConfig();
  /**
   * <code>.envoy.admin.v2alpha.ListenersConfigDump listener_config = 2;</code>
   */
  io.envoyproxy.envoy.admin.v2alpha.ListenersConfigDumpOrBuilder getListenerConfigOrBuilder();

  /**
   * <code>.envoy.admin.v2alpha.ClustersConfigDump cluster_config = 3;</code>
   * @return Whether the clusterConfig field is set.
   */
  boolean hasClusterConfig();
  /**
   * <code>.envoy.admin.v2alpha.ClustersConfigDump cluster_config = 3;</code>
   * @return The clusterConfig.
   */
  io.envoyproxy.envoy.admin.v2alpha.ClustersConfigDump getClusterConfig();
  /**
   * <code>.envoy.admin.v2alpha.ClustersConfigDump cluster_config = 3;</code>
   */
  io.envoyproxy.envoy.admin.v2alpha.ClustersConfigDumpOrBuilder getClusterConfigOrBuilder();

  /**
   * <code>.envoy.admin.v2alpha.RoutesConfigDump route_config = 4;</code>
   * @return Whether the routeConfig field is set.
   */
  boolean hasRouteConfig();
  /**
   * <code>.envoy.admin.v2alpha.RoutesConfigDump route_config = 4;</code>
   * @return The routeConfig.
   */
  io.envoyproxy.envoy.admin.v2alpha.RoutesConfigDump getRouteConfig();
  /**
   * <code>.envoy.admin.v2alpha.RoutesConfigDump route_config = 4;</code>
   */
  io.envoyproxy.envoy.admin.v2alpha.RoutesConfigDumpOrBuilder getRouteConfigOrBuilder();

  /**
   * <code>.envoy.admin.v2alpha.ScopedRoutesConfigDump scoped_route_config = 5;</code>
   * @return Whether the scopedRouteConfig field is set.
   */
  boolean hasScopedRouteConfig();
  /**
   * <code>.envoy.admin.v2alpha.ScopedRoutesConfigDump scoped_route_config = 5;</code>
   * @return The scopedRouteConfig.
   */
  io.envoyproxy.envoy.admin.v2alpha.ScopedRoutesConfigDump getScopedRouteConfig();
  /**
   * <code>.envoy.admin.v2alpha.ScopedRoutesConfigDump scoped_route_config = 5;</code>
   */
  io.envoyproxy.envoy.admin.v2alpha.ScopedRoutesConfigDumpOrBuilder getScopedRouteConfigOrBuilder();

  public io.envoyproxy.envoy.service.status.v2.PerXdsConfig.PerXdsConfigCase getPerXdsConfigCase();
}