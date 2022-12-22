// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1alpha1/cluster_service.proto

package com.google.container.v1alpha1;

public interface MasterAuthorizedNetworksConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1alpha1.MasterAuthorizedNetworksConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether or not master authorized networks is enabled.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  java.util.List<com.google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock> 
      getCidrBlocksList();
  /**
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  com.google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock getCidrBlocks(int index);
  /**
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  int getCidrBlocksCount();
  /**
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  java.util.List<? extends com.google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlockOrBuilder> 
      getCidrBlocksOrBuilderList();
  /**
   * <pre>
   * cidr_blocks define up to 10 external networks that could access
   * Kubernetes master through HTTPS.
   * </pre>
   *
   * <code>repeated .google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  com.google.container.v1alpha1.MasterAuthorizedNetworksConfig.CidrBlockOrBuilder getCidrBlocksOrBuilder(
      int index);
}