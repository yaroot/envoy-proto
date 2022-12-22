// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

public interface IPAllocationPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether or not to enable Alias IPs in the GKE cluster.
   * If `true`, a VPC-native cluster is created.
   * This field is only supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*. Environments in newer versions always use
   * VPC-native GKE clusters.
   * </pre>
   *
   * <code>bool use_ip_aliases = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The useIpAliases.
   */
  boolean getUseIpAliases();

  /**
   * <pre>
   * Optional. The name of the GKE cluster's secondary range used to allocate
   * IP addresses to pods.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the clusterSecondaryRangeName field is set.
   */
  boolean hasClusterSecondaryRangeName();
  /**
   * <pre>
   * Optional. The name of the GKE cluster's secondary range used to allocate
   * IP addresses to pods.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The clusterSecondaryRangeName.
   */
  java.lang.String getClusterSecondaryRangeName();
  /**
   * <pre>
   * Optional. The name of the GKE cluster's secondary range used to allocate
   * IP addresses to pods.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string cluster_secondary_range_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for clusterSecondaryRangeName.
   */
  com.google.protobuf.ByteString
      getClusterSecondaryRangeNameBytes();

  /**
   * <pre>
   * Optional. The IP address range used to allocate IP addresses to pods in
   * the GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * Set to blank to have GKE choose a range with the default size.
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the clusterIpv4CidrBlock field is set.
   */
  boolean hasClusterIpv4CidrBlock();
  /**
   * <pre>
   * Optional. The IP address range used to allocate IP addresses to pods in
   * the GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * Set to blank to have GKE choose a range with the default size.
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The clusterIpv4CidrBlock.
   */
  java.lang.String getClusterIpv4CidrBlock();
  /**
   * <pre>
   * Optional. The IP address range used to allocate IP addresses to pods in
   * the GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * Set to blank to have GKE choose a range with the default size.
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string cluster_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for clusterIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getClusterIpv4CidrBlockBytes();

  /**
   * <pre>
   * Optional. The name of the services' secondary range used to allocate
   * IP addresses to the GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string services_secondary_range_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the servicesSecondaryRangeName field is set.
   */
  boolean hasServicesSecondaryRangeName();
  /**
   * <pre>
   * Optional. The name of the services' secondary range used to allocate
   * IP addresses to the GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string services_secondary_range_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The servicesSecondaryRangeName.
   */
  java.lang.String getServicesSecondaryRangeName();
  /**
   * <pre>
   * Optional. The name of the services' secondary range used to allocate
   * IP addresses to the GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * </pre>
   *
   * <code>string services_secondary_range_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for servicesSecondaryRangeName.
   */
  com.google.protobuf.ByteString
      getServicesSecondaryRangeNameBytes();

  /**
   * <pre>
   * Optional. The IP address range of the services IP addresses in this
   * GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * Set to blank to have GKE choose a range with the default size.
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the servicesIpv4CidrBlock field is set.
   */
  boolean hasServicesIpv4CidrBlock();
  /**
   * <pre>
   * Optional. The IP address range of the services IP addresses in this
   * GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * Set to blank to have GKE choose a range with the default size.
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The servicesIpv4CidrBlock.
   */
  java.lang.String getServicesIpv4CidrBlock();
  /**
   * <pre>
   * Optional. The IP address range of the services IP addresses in this
   * GKE cluster.
   * For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*,
   * this field is applicable only when `use_ip_aliases` is true.
   * Set to blank to have GKE choose a range with the default size.
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific
   * netmask.
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g.
   * `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range
   * to use.
   * </pre>
   *
   * <code>string services_ipv4_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for servicesIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getServicesIpv4CidrBlockBytes();

  public com.google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy.ClusterIpAllocationCase getClusterIpAllocationCase();

  public com.google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy.ServicesIpAllocationCase getServicesIpAllocationCase();
}
