// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/customer_asset_set.proto

package com.google.ads.googleads.v12.resources;

public final class CustomerAssetSetProto {
  private CustomerAssetSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CustomerAssetSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CustomerAssetSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v12/resources/cus" +
      "tomer_asset_set.proto\022\"google.ads.google" +
      "ads.v12.resources\032:google/ads/googleads/" +
      "v12/enums/asset_set_link_status.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\241\003\n\020CustomerAssetSet\022H" +
      "\n\rresource_name\030\001 \001(\tB1\340A\005\372A+\n)googleads" +
      ".googleapis.com/CustomerAssetSet\022<\n\tasse" +
      "t_set\030\002 \001(\tB)\340A\005\372A#\n!googleads.googleapi" +
      "s.com/AssetSet\022;\n\010customer\030\003 \001(\tB)\340A\005\372A#" +
      "\n!googleads.googleapis.com/Customer\022^\n\006s" +
      "tatus\030\004 \001(\0162I.google.ads.googleads.v12.e" +
      "nums.AssetSetLinkStatusEnum.AssetSetLink" +
      "StatusB\003\340A\003:h\352Ae\n)googleads.googleapis.c" +
      "om/CustomerAssetSet\0228customers/{customer" +
      "_id}/customerAssetSets/{asset_set_id}B\207\002" +
      "\n&com.google.ads.googleads.v12.resources" +
      "B\025CustomerAssetSetProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "12/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V12.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V12\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.AssetSetLinkStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_CustomerAssetSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_CustomerAssetSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CustomerAssetSet_descriptor,
        new java.lang.String[] { "ResourceName", "AssetSet", "Customer", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.AssetSetLinkStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}