// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListEntitlementsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListEntitlementsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.Entitlement> 
      getEntitlementsList();
  /**
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  com.google.cloud.channel.v1.Entitlement getEntitlements(int index);
  /**
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  int getEntitlementsCount();
  /**
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.EntitlementOrBuilder> 
      getEntitlementsOrBuilderList();
  /**
   * <pre>
   * The reseller customer's entitlements.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Entitlement entitlements = 1;</code>
   */
  com.google.cloud.channel.v1.EntitlementOrBuilder getEntitlementsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to list the next page of results.
   * Pass to
   * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to list the next page of results.
   * Pass to
   * [ListEntitlementsRequest.page_token][google.cloud.channel.v1.ListEntitlementsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}