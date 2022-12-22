// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface ListNodePoolsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.ListNodePoolsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  java.util.List<com.google.container.v1alpha1.NodePool> 
      getNodePoolsList();
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  com.google.container.v1alpha1.NodePool getNodePools(int index);
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  int getNodePoolsCount();
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  java.util.List<? extends com.google.container.v1alpha1.NodePoolOrBuilder> 
      getNodePoolsOrBuilderList();
  /**
   * <pre>
   * A list of node pools for a cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.NodePool node_pools = 1;</code>
   */
  com.google.container.v1alpha1.NodePoolOrBuilder getNodePoolsOrBuilder(
      int index);
}