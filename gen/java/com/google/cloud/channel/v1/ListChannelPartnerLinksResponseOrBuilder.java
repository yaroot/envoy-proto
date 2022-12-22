// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListChannelPartnerLinksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListChannelPartnerLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink> 
      getChannelPartnerLinksList();
  /**
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLinks(int index);
  /**
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  int getChannelPartnerLinksCount();
  /**
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder> 
      getChannelPartnerLinksOrBuilderList();
  /**
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder getChannelPartnerLinksOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
