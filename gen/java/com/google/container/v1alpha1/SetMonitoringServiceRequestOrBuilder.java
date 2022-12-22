// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface SetMonitoringServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.SetMonitoringServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string zone = 2;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The name of the cluster to upgrade.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   * @return The clusterId.
   */
  java.lang.String getClusterId();
  /**
   * <pre>
   * The name of the cluster to upgrade.
   * This field is deprecated, use name instead.
   * </pre>
   *
   * <code>string cluster_id = 3;</code>
   * @return The bytes for clusterId.
   */
  com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * The monitoring service the cluster should use to write metrics.
   * Currently available options:
   * * "monitoring.googleapis.com" - the Google Cloud Monitoring service
   * * "none" - no metrics will be exported from the cluster
   * </pre>
   *
   * <code>string monitoring_service = 4;</code>
   * @return The monitoringService.
   */
  java.lang.String getMonitoringService();
  /**
   * <pre>
   * The monitoring service the cluster should use to write metrics.
   * Currently available options:
   * * "monitoring.googleapis.com" - the Google Cloud Monitoring service
   * * "none" - no metrics will be exported from the cluster
   * </pre>
   *
   * <code>string monitoring_service = 4;</code>
   * @return The bytes for monitoringService.
   */
  com.google.protobuf.ByteString
      getMonitoringServiceBytes();

  /**
   * <pre>
   * The name (project, location, cluster) of the cluster to set monitoring.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster) of the cluster to set monitoring.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}