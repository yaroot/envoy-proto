// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/dubbo_proxy/v2alpha1/route.proto

package io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1;

public interface RouteConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the route configuration. Reserved for future use in asynchronous route discovery.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the route configuration. Reserved for future use in asynchronous route discovery.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The interface name of the service.
   * </pre>
   *
   * <code>string interface = 2;</code>
   * @return The interface.
   */
  java.lang.String getInterface();
  /**
   * <pre>
   * The interface name of the service.
   * </pre>
   *
   * <code>string interface = 2;</code>
   * @return The bytes for interface.
   */
  com.google.protobuf.ByteString
      getInterfaceBytes();

  /**
   * <pre>
   * Which group does the interface belong to.
   * </pre>
   *
   * <code>string group = 3;</code>
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   * <pre>
   * Which group does the interface belong to.
   * </pre>
   *
   * <code>string group = 3;</code>
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString
      getGroupBytes();

  /**
   * <pre>
   * The version number of the interface.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * The version number of the interface.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.dubbo_proxy.v2alpha1.Route routes = 5;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1.Route> 
      getRoutesList();
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.dubbo_proxy.v2alpha1.Route routes = 5;</code>
   */
  io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1.Route getRoutes(int index);
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.dubbo_proxy.v2alpha1.Route routes = 5;</code>
   */
  int getRoutesCount();
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.dubbo_proxy.v2alpha1.Route routes = 5;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteOrBuilder> 
      getRoutesOrBuilderList();
  /**
   * <pre>
   * The list of routes that will be matched, in order, against incoming requests. The first route
   * that matches will be used.
   * </pre>
   *
   * <code>repeated .envoy.config.filter.network.dubbo_proxy.v2alpha1.Route routes = 5;</code>
   */
  io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteOrBuilder getRoutesOrBuilder(
      int index);
}