// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/status/v2/csds.proto

package io.envoyproxy.envoy.service.status.v2;

public interface ClientConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.status.v2.ClientConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node for a particular client.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Node node = 1;</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <pre>
   * Node for a particular client.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Node node = 1;</code>
   * @return The node.
   */
  io.envoyproxy.envoy.api.v2.core.Node getNode();
  /**
   * <pre>
   * Node for a particular client.
   * </pre>
   *
   * <code>.envoy.api.v2.core.Node node = 1;</code>
   */
  io.envoyproxy.envoy.api.v2.core.NodeOrBuilder getNodeOrBuilder();

  /**
   * <code>repeated .envoy.service.status.v2.PerXdsConfig xds_config = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.service.status.v2.PerXdsConfig> 
      getXdsConfigList();
  /**
   * <code>repeated .envoy.service.status.v2.PerXdsConfig xds_config = 2;</code>
   */
  io.envoyproxy.envoy.service.status.v2.PerXdsConfig getXdsConfig(int index);
  /**
   * <code>repeated .envoy.service.status.v2.PerXdsConfig xds_config = 2;</code>
   */
  int getXdsConfigCount();
  /**
   * <code>repeated .envoy.service.status.v2.PerXdsConfig xds_config = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.service.status.v2.PerXdsConfigOrBuilder> 
      getXdsConfigOrBuilderList();
  /**
   * <code>repeated .envoy.service.status.v2.PerXdsConfig xds_config = 2;</code>
   */
  io.envoyproxy.envoy.service.status.v2.PerXdsConfigOrBuilder getXdsConfigOrBuilder(
      int index);
}