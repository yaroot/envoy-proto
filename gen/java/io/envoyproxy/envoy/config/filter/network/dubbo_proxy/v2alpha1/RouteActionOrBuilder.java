// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/filter/network/dubbo_proxy/v2alpha1/route.proto

package io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1;

public interface RouteActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates the upstream cluster to which the request should be routed.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   * <pre>
   * Indicates the upstream cluster to which the request should be routed.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <pre>
   * Indicates the upstream cluster to which the request should be routed.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * Currently ClusterWeight only supports the name and weight fields.
   * </pre>
   *
   * <code>.envoy.api.v2.route.WeightedCluster weighted_clusters = 2;</code>
   * @return Whether the weightedClusters field is set.
   */
  boolean hasWeightedClusters();
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * Currently ClusterWeight only supports the name and weight fields.
   * </pre>
   *
   * <code>.envoy.api.v2.route.WeightedCluster weighted_clusters = 2;</code>
   * @return The weightedClusters.
   */
  io.envoyproxy.envoy.api.v2.route.WeightedCluster getWeightedClusters();
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * Currently ClusterWeight only supports the name and weight fields.
   * </pre>
   *
   * <code>.envoy.api.v2.route.WeightedCluster weighted_clusters = 2;</code>
   */
  io.envoyproxy.envoy.api.v2.route.WeightedClusterOrBuilder getWeightedClustersOrBuilder();

  public io.envoyproxy.envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteAction.ClusterSpecifierCase getClusterSpecifierCase();
}