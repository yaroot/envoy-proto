// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/asset_group_product_group_view.proto

package com.google.ads.googleads.v11.resources;

public final class AssetGroupProductGroupViewProto {
  private AssetGroupProductGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v11_resources_AssetGroupProductGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v11_resources_AssetGroupProductGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v11/resources/ass" +
      "et_group_product_group_view.proto\022\"googl" +
      "e.ads.googleads.v11.resources\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\267\003\n\032AssetGroupProductGroupView" +
      "\022R\n\rresource_name\030\001 \001(\tB;\340A\003\372A5\n3googlea" +
      "ds.googleapis.com/AssetGroupProductGroup" +
      "View\022@\n\013asset_group\030\002 \001(\tB+\340A\003\372A%\n#googl" +
      "eads.googleapis.com/AssetGroup\022g\n asset_" +
      "group_listing_group_filter\030\004 \001(\tB=\340A\003\372A7" +
      "\n5googleads.googleapis.com/AssetGroupLis" +
      "tingGroupFilter:\231\001\352A\225\001\n3googleads.google" +
      "apis.com/AssetGroupProductGroupView\022^cus" +
      "tomers/{customer_id}/assetGroupProductGr" +
      "oupViews/{asset_group_id}~{listing_group" +
      "_filter_id}B\221\002\n&com.google.ads.googleads" +
      ".v11.resourcesB\037AssetGroupProductGroupVi" +
      "ewProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v11/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V11::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v11_resources_AssetGroupProductGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v11_resources_AssetGroupProductGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v11_resources_AssetGroupProductGroupView_descriptor,
        new java.lang.String[] { "ResourceName", "AssetGroup", "AssetGroupListingGroupFilter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}