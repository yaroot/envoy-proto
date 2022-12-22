// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

package com.google.cloud.datafusion.v1beta1;

public interface ListDnsPeeringsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.ListDnsPeeringsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of dns peering configs.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.DnsPeering dns_peerings = 1;</code>
   */
  java.util.List<com.google.cloud.datafusion.v1beta1.DnsPeering> 
      getDnsPeeringsList();
  /**
   * <pre>
   * List of dns peering configs.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.DnsPeering dns_peerings = 1;</code>
   */
  com.google.cloud.datafusion.v1beta1.DnsPeering getDnsPeerings(int index);
  /**
   * <pre>
   * List of dns peering configs.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.DnsPeering dns_peerings = 1;</code>
   */
  int getDnsPeeringsCount();
  /**
   * <pre>
   * List of dns peering configs.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.DnsPeering dns_peerings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datafusion.v1beta1.DnsPeeringOrBuilder> 
      getDnsPeeringsOrBuilderList();
  /**
   * <pre>
   * List of dns peering configs.
   * </pre>
   *
   * <code>repeated .google.cloud.datafusion.v1beta1.DnsPeering dns_peerings = 1;</code>
   */
  com.google.cloud.datafusion.v1beta1.DnsPeeringOrBuilder getDnsPeeringsOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}