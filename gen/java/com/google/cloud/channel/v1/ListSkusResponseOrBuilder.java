// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListSkusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListSkusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.Sku> 
      getSkusList();
  /**
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  com.google.cloud.channel.v1.Sku getSkus(int index);
  /**
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  int getSkusCount();
  /**
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.SkuOrBuilder> 
      getSkusOrBuilderList();
  /**
   * <pre>
   * The list of SKUs requested.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.Sku skus = 1;</code>
   */
  com.google.cloud.channel.v1.SkuOrBuilder getSkusOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}