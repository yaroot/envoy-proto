// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface ListChannelPartnerRepricingConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListChannelPartnerRepricingConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The repricing configs for this channel partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_configs = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.ChannelPartnerRepricingConfig> 
      getChannelPartnerRepricingConfigsList();
  /**
   * <pre>
   * The repricing configs for this channel partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_configs = 1;</code>
   */
  com.google.cloud.channel.v1.ChannelPartnerRepricingConfig getChannelPartnerRepricingConfigs(int index);
  /**
   * <pre>
   * The repricing configs for this channel partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_configs = 1;</code>
   */
  int getChannelPartnerRepricingConfigsCount();
  /**
   * <pre>
   * The repricing configs for this channel partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_configs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder> 
      getChannelPartnerRepricingConfigsOrBuilderList();
  /**
   * <pre>
   * The repricing configs for this channel partner.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_configs = 1;</code>
   */
  com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder getChannelPartnerRepricingConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerRepricingConfigsRequest.page_token][google.cloud.channel.v1.ListChannelPartnerRepricingConfigsRequest.page_token]
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
   * [ListChannelPartnerRepricingConfigsRequest.page_token][google.cloud.channel.v1.ListChannelPartnerRepricingConfigsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
