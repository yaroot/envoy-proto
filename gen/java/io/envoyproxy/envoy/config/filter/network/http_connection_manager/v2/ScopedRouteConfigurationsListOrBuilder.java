// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/http_connection_manager/v2/http_connection_manager.proto

package io.envoyproxy.envoy.config.filter.network.http_connection_manager.v2;

public interface ScopedRouteConfigurationsListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.network.http_connection_manager.v2.ScopedRouteConfigurationsList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .envoy.api.v2.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.ScopedRouteConfiguration> 
      getScopedRouteConfigurationsList();
  /**
   * <code>repeated .envoy.api.v2.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.ScopedRouteConfiguration getScopedRouteConfigurations(int index);
  /**
   * <code>repeated .envoy.api.v2.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  int getScopedRouteConfigurationsCount();
  /**
   * <code>repeated .envoy.api.v2.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.ScopedRouteConfigurationOrBuilder> 
      getScopedRouteConfigurationsOrBuilderList();
  /**
   * <code>repeated .envoy.api.v2.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.api.v2.ScopedRouteConfigurationOrBuilder getScopedRouteConfigurationsOrBuilder(
      int index);
}