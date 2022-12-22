// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface DeleteNodePoolRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.DeleteNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.project_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2748
   * @return The projectId.
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://cloud.google.com/resource-manager/docs/creating-managing-projects).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.project_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2748
   * @return The bytes for projectId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.zone is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2754
   * @return The zone.
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the
   * cluster resides. This field has been deprecated and replaced by the name
   * field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.zone is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2754
   * @return The bytes for zone.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.cluster_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2758
   * @return The clusterId.
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Deprecated. The name of the cluster.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.cluster_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2758
   * @return The bytes for clusterId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the node pool to delete.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.node_pool_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2762
   * @return The nodePoolId.
   */
  @java.lang.Deprecated java.lang.String getNodePoolId();
  /**
   * <pre>
   * Deprecated. The name of the node pool to delete.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   * @deprecated google.container.v1.DeleteNodePoolRequest.node_pool_id is deprecated.
   *     See google/container/v1/cluster_service.proto;l=2762
   * @return The bytes for nodePoolId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNodePoolIdBytes();

  /**
   * <pre>
   * The name (project, location, cluster, node pool id) of the node pool to
   * delete. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster, node pool id) of the node pool to
   * delete. Specified in the format
   * `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;`.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
