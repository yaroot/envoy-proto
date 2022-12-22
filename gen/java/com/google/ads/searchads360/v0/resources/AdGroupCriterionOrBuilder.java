// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/searchads360/v0/resources/ad_group_criterion.proto

package com.google.ads.searchads360.v0.resources;

public interface AdGroupCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.searchads360.v0.resources.AdGroupCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group criterion.
   * Ad group criterion resource names have the form:
   * `customers/{customer_id}/adGroupCriteria/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group criterion.
   * Ad group criterion resource names have the form:
   * `customers/{customer_id}/adGroupCriteria/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the criterion.
   * </pre>
   *
   * <code>optional int64 criterion_id = 56 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the criterionId field is set.
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion.
   * </pre>
   *
   * <code>optional int64 criterion_id = 56 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The criterionId.
   */
  long getCriterionId();

  /**
   * <pre>
   * The status of the criterion.
   * This is the status of the ad group criterion entity, set by the client.
   * Note: UI reports may incorporate additional information that affects
   * whether a criterion is eligible to run. In some cases a criterion that's
   * REMOVED in the API can still show as enabled in the UI.
   * For example, campaigns by default show to users of all age ranges unless
   * excluded. The UI will show each age range as "enabled", since they're
   * eligible to see the ads; but AdGroupCriterion.status will show "removed",
   * since no positive criterion was added.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the criterion.
   * This is the status of the ad group criterion entity, set by the client.
   * Note: UI reports may incorporate additional information that affects
   * whether a criterion is eligible to run. In some cases a criterion that's
   * REMOVED in the API can still show as enabled in the UI.
   * For example, campaigns by default show to users of all age ranges unless
   * excluded. The UI will show each age range as "enabled", since they're
   * eligible to see the ads; but AdGroupCriterion.status will show "removed",
   * since no positive criterion was added.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus status = 3;</code>
   * @return The status.
   */
  com.google.ads.searchads360.v0.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus getStatus();

  /**
   * <pre>
   * Output only. Information regarding the quality of the criterion.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.resources.AdGroupCriterion.QualityInfo quality_info = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the qualityInfo field is set.
   */
  boolean hasQualityInfo();
  /**
   * <pre>
   * Output only. Information regarding the quality of the criterion.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.resources.AdGroupCriterion.QualityInfo quality_info = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The qualityInfo.
   */
  com.google.ads.searchads360.v0.resources.AdGroupCriterion.QualityInfo getQualityInfo();
  /**
   * <pre>
   * Output only. Information regarding the quality of the criterion.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.resources.AdGroupCriterion.QualityInfo quality_info = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.searchads360.v0.resources.AdGroupCriterion.QualityInfoOrBuilder getQualityInfoOrBuilder();

  /**
   * <pre>
   * Immutable. The ad group to which the criterion belongs.
   * </pre>
   *
   * <code>optional string ad_group = 57 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroup field is set.
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which the criterion belongs.
   * </pre>
   *
   * <code>optional string ad_group = 57 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Immutable. The ad group to which the criterion belongs.
   * </pre>
   *
   * <code>optional string ad_group = 57 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.enums.CriterionTypeEnum.CriterionType type = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.enums.CriterionTypeEnum.CriterionType type = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.searchads360.v0.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * The modifier for the bid when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * </pre>
   *
   * <code>optional double bid_modifier = 61;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches. The modifier must be
   * in the range: 0.1 - 10.0. Most targetable criteria types support modifiers.
   * </pre>
   *
   * <code>optional double bid_modifier = 61;</code>
   * @return The bidModifier.
   */
  double getBidModifier();

  /**
   * <pre>
   * The CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>optional int64 cpc_bid_micros = 62;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * The CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>optional int64 cpc_bid_micros = 62;</code>
   * @return The cpcBidMicros.
   */
  long getCpcBidMicros();

  /**
   * <pre>
   * Output only. The effective CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>optional int64 effective_cpc_bid_micros = 66 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the effectiveCpcBidMicros field is set.
   */
  boolean hasEffectiveCpcBidMicros();
  /**
   * <pre>
   * Output only. The effective CPC (cost-per-click) bid.
   * </pre>
   *
   * <code>optional int64 effective_cpc_bid_micros = 66 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The effectiveCpcBidMicros.
   */
  long getEffectiveCpcBidMicros();

  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 70;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 70;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 70;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated string final_urls = 70;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * Output only. The Engine Status for ad group criterion.
   * </pre>
   *
   * <code>optional .google.ads.searchads360.v0.enums.AdGroupCriterionEngineStatusEnum.AdGroupCriterionEngineStatus engine_status = 80 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the engineStatus field is set.
   */
  boolean hasEngineStatus();
  /**
   * <pre>
   * Output only. The Engine Status for ad group criterion.
   * </pre>
   *
   * <code>optional .google.ads.searchads360.v0.enums.AdGroupCriterionEngineStatusEnum.AdGroupCriterionEngineStatus engine_status = 80 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for engineStatus.
   */
  int getEngineStatusValue();
  /**
   * <pre>
   * Output only. The Engine Status for ad group criterion.
   * </pre>
   *
   * <code>optional .google.ads.searchads360.v0.enums.AdGroupCriterionEngineStatusEnum.AdGroupCriterionEngineStatus engine_status = 80 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The engineStatus.
   */
  com.google.ads.searchads360.v0.enums.AdGroupCriterionEngineStatusEnum.AdGroupCriterionEngineStatus getEngineStatus();

  /**
   * <pre>
   * URL template for appending params to final URL.
   * </pre>
   *
   * <code>optional string final_url_suffix = 72;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to final URL.
   * </pre>
   *
   * <code>optional string final_url_suffix = 72;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * URL template for appending params to final URL.
   * </pre>
   *
   * <code>optional string final_url_suffix = 72;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 73;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 73;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>optional string tracking_url_template = 73;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * Output only. The datetime when this ad group criterion was last modified. The datetime
   * is in the customer's time zone and in "yyyy-MM-dd HH:mm:ss.ssssss" format.
   * </pre>
   *
   * <code>string last_modified_time = 78 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The lastModifiedTime.
   */
  java.lang.String getLastModifiedTime();
  /**
   * <pre>
   * Output only. The datetime when this ad group criterion was last modified. The datetime
   * is in the customer's time zone and in "yyyy-MM-dd HH:mm:ss.ssssss" format.
   * </pre>
   *
   * <code>string last_modified_time = 78 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for lastModifiedTime.
   */
  com.google.protobuf.ByteString
      getLastModifiedTimeBytes();

  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.KeywordInfo keyword = 27 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.KeywordInfo keyword = 27 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The keyword.
   */
  com.google.ads.searchads360.v0.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.KeywordInfo keyword = 27 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.searchads360.v0.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Immutable. Listing group.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.ListingGroupInfo listing_group = 32 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the listingGroup field is set.
   */
  boolean hasListingGroup();
  /**
   * <pre>
   * Immutable. Listing group.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.ListingGroupInfo listing_group = 32 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The listingGroup.
   */
  com.google.ads.searchads360.v0.common.ListingGroupInfo getListingGroup();
  /**
   * <pre>
   * Immutable. Listing group.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.ListingGroupInfo listing_group = 32 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.searchads360.v0.common.ListingGroupInfoOrBuilder getListingGroupOrBuilder();

  /**
   * <pre>
   * Immutable. Age range.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.AgeRangeInfo age_range = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the ageRange field is set.
   */
  boolean hasAgeRange();
  /**
   * <pre>
   * Immutable. Age range.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.AgeRangeInfo age_range = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The ageRange.
   */
  com.google.ads.searchads360.v0.common.AgeRangeInfo getAgeRange();
  /**
   * <pre>
   * Immutable. Age range.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.AgeRangeInfo age_range = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.searchads360.v0.common.AgeRangeInfoOrBuilder getAgeRangeOrBuilder();

  /**
   * <pre>
   * Immutable. Gender.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.GenderInfo gender = 37 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Immutable. Gender.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.GenderInfo gender = 37 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The gender.
   */
  com.google.ads.searchads360.v0.common.GenderInfo getGender();
  /**
   * <pre>
   * Immutable. Gender.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.GenderInfo gender = 37 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.searchads360.v0.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Immutable. Webpage
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.WebpageInfo webpage = 46 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the webpage field is set.
   */
  boolean hasWebpage();
  /**
   * <pre>
   * Immutable. Webpage
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.WebpageInfo webpage = 46 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The webpage.
   */
  com.google.ads.searchads360.v0.common.WebpageInfo getWebpage();
  /**
   * <pre>
   * Immutable. Webpage
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.common.WebpageInfo webpage = 46 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.searchads360.v0.common.WebpageInfoOrBuilder getWebpageOrBuilder();

  public com.google.ads.searchads360.v0.resources.AdGroupCriterion.CriterionCase getCriterionCase();
}