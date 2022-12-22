// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface LinkedRouterApplianceInstancesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.LinkedRouterApplianceInstances)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  java.util.List<com.google.cloud.networkconnectivity.v1.RouterApplianceInstance> 
      getInstancesList();
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  com.google.cloud.networkconnectivity.v1.RouterApplianceInstance getInstances(int index);
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  int getInstancesCount();
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  java.util.List<? extends com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder> 
      getInstancesOrBuilderList();
  /**
   * <pre>
   * The list of router appliance instances.
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.RouterApplianceInstance instances = 1;</code>
   */
  com.google.cloud.networkconnectivity.v1.RouterApplianceInstanceOrBuilder getInstancesOrBuilder(
      int index);

  /**
   * <pre>
   * A value that controls whether site-to-site data transfer is enabled for
   * these resources. Data transfer is available only in [supported
   * locations](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/locations).
   * </pre>
   *
   * <code>bool site_to_site_data_transfer = 2;</code>
   * @return The siteToSiteDataTransfer.
   */
  boolean getSiteToSiteDataTransfer();

  /**
   * <pre>
   * Output only. The VPC network where these router appliance instances are
   * located.
   * </pre>
   *
   * <code>string vpc_network = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The vpcNetwork.
   */
  java.lang.String getVpcNetwork();
  /**
   * <pre>
   * Output only. The VPC network where these router appliance instances are
   * located.
   * </pre>
   *
   * <code>string vpc_network = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for vpcNetwork.
   */
  com.google.protobuf.ByteString
      getVpcNetworkBytes();
}