// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/smart_campaign_search_term_view.proto

package com.google.ads.googleads.v12.resources;

public interface SmartCampaignSearchTermViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.SmartCampaignSearchTermView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the Smart campaign search term view.
   * Smart campaign search term view resource names have the form:
   * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the Smart campaign search term view.
   * Smart campaign search term view resource names have the form:
   * `customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{URL-base64_search_term}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The searchTerm.
   */
  java.lang.String getSearchTerm();
  /**
   * <pre>
   * Output only. The search term.
   * </pre>
   *
   * <code>string search_term = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for searchTerm.
   */
  com.google.protobuf.ByteString
      getSearchTermBytes();

  /**
   * <pre>
   * Output only. The Smart campaign the search term served in.
   * </pre>
   *
   * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Output only. The Smart campaign the search term served in.
   * </pre>
   *
   * <code>string campaign = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();
}