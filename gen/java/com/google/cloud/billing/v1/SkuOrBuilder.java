// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

public interface SkuOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.Sku)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name for the SKU.
   * Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE"
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name for the SKU.
   * Example: "services/DA34-426B-A397/skus/AA95-CD31-42FE"
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The identifier for the SKU.
   * Example: "AA95-CD31-42FE"
   * </pre>
   *
   * <code>string sku_id = 2;</code>
   * @return The skuId.
   */
  java.lang.String getSkuId();
  /**
   * <pre>
   * The identifier for the SKU.
   * Example: "AA95-CD31-42FE"
   * </pre>
   *
   * <code>string sku_id = 2;</code>
   * @return The bytes for skuId.
   */
  com.google.protobuf.ByteString
      getSkuIdBytes();

  /**
   * <pre>
   * A human readable description of the SKU, has a maximum length of 256
   * characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A human readable description of the SKU, has a maximum length of 256
   * characters.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * The category hierarchy of this SKU, purely for organizational purpose.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.Category category = 4;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * The category hierarchy of this SKU, purely for organizational purpose.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.Category category = 4;</code>
   * @return The category.
   */
  com.google.cloud.billing.v1.Category getCategory();
  /**
   * <pre>
   * The category hierarchy of this SKU, purely for organizational purpose.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.Category category = 4;</code>
   */
  com.google.cloud.billing.v1.CategoryOrBuilder getCategoryOrBuilder();

  /**
   * <pre>
   * List of service regions this SKU is offered at.
   * Example: "asia-east1"
   * Service regions can be found at https://cloud.google.com/about/locations/
   * </pre>
   *
   * <code>repeated string service_regions = 5;</code>
   * @return A list containing the serviceRegions.
   */
  java.util.List<java.lang.String>
      getServiceRegionsList();
  /**
   * <pre>
   * List of service regions this SKU is offered at.
   * Example: "asia-east1"
   * Service regions can be found at https://cloud.google.com/about/locations/
   * </pre>
   *
   * <code>repeated string service_regions = 5;</code>
   * @return The count of serviceRegions.
   */
  int getServiceRegionsCount();
  /**
   * <pre>
   * List of service regions this SKU is offered at.
   * Example: "asia-east1"
   * Service regions can be found at https://cloud.google.com/about/locations/
   * </pre>
   *
   * <code>repeated string service_regions = 5;</code>
   * @param index The index of the element to return.
   * @return The serviceRegions at the given index.
   */
  java.lang.String getServiceRegions(int index);
  /**
   * <pre>
   * List of service regions this SKU is offered at.
   * Example: "asia-east1"
   * Service regions can be found at https://cloud.google.com/about/locations/
   * </pre>
   *
   * <code>repeated string service_regions = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the serviceRegions at the given index.
   */
  com.google.protobuf.ByteString
      getServiceRegionsBytes(int index);

  /**
   * <pre>
   * A timeline of pricing info for this SKU in chronological order.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingInfo pricing_info = 6;</code>
   */
  java.util.List<com.google.cloud.billing.v1.PricingInfo> 
      getPricingInfoList();
  /**
   * <pre>
   * A timeline of pricing info for this SKU in chronological order.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingInfo pricing_info = 6;</code>
   */
  com.google.cloud.billing.v1.PricingInfo getPricingInfo(int index);
  /**
   * <pre>
   * A timeline of pricing info for this SKU in chronological order.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingInfo pricing_info = 6;</code>
   */
  int getPricingInfoCount();
  /**
   * <pre>
   * A timeline of pricing info for this SKU in chronological order.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingInfo pricing_info = 6;</code>
   */
  java.util.List<? extends com.google.cloud.billing.v1.PricingInfoOrBuilder> 
      getPricingInfoOrBuilderList();
  /**
   * <pre>
   * A timeline of pricing info for this SKU in chronological order.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.PricingInfo pricing_info = 6;</code>
   */
  com.google.cloud.billing.v1.PricingInfoOrBuilder getPricingInfoOrBuilder(
      int index);

  /**
   * <pre>
   * Identifies the service provider.
   * This is 'Google' for first party services in Google Cloud Platform.
   * </pre>
   *
   * <code>string service_provider_name = 7;</code>
   * @return The serviceProviderName.
   */
  java.lang.String getServiceProviderName();
  /**
   * <pre>
   * Identifies the service provider.
   * This is 'Google' for first party services in Google Cloud Platform.
   * </pre>
   *
   * <code>string service_provider_name = 7;</code>
   * @return The bytes for serviceProviderName.
   */
  com.google.protobuf.ByteString
      getServiceProviderNameBytes();

  /**
   * <pre>
   * The geographic taxonomy for this sku.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.GeoTaxonomy geo_taxonomy = 8;</code>
   * @return Whether the geoTaxonomy field is set.
   */
  boolean hasGeoTaxonomy();
  /**
   * <pre>
   * The geographic taxonomy for this sku.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.GeoTaxonomy geo_taxonomy = 8;</code>
   * @return The geoTaxonomy.
   */
  com.google.cloud.billing.v1.GeoTaxonomy getGeoTaxonomy();
  /**
   * <pre>
   * The geographic taxonomy for this sku.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.GeoTaxonomy geo_taxonomy = 8;</code>
   */
  com.google.cloud.billing.v1.GeoTaxonomyOrBuilder getGeoTaxonomyOrBuilder();
}
