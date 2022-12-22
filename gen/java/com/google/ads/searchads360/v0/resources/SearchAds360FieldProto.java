// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/searchads360/v0/resources/search_ads360_field.proto

package com.google.ads.searchads360.v0.resources;

public final class SearchAds360FieldProto {
  private SearchAds360FieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_searchads360_v0_resources_SearchAds360Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_searchads360_v0_resources_SearchAds360Field_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/searchads360/v0/resources/s" +
      "earch_ads360_field.proto\022$google.ads.sea" +
      "rchads360.v0.resources\032Cgoogle/ads/searc" +
      "hads360/v0/enums/search_ads360_field_cat" +
      "egory.proto\032Dgoogle/ads/searchads360/v0/" +
      "enums/search_ads360_field_data_type.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\"\250\006\n\021SearchAds360Fi" +
      "eld\022L\n\rresource_name\030\001 \001(\tB5\340A\003\372A/\n-sear" +
      "chads360.googleapis.com/SearchAds360Fiel" +
      "d\022\026\n\004name\030\025 \001(\tB\003\340A\003H\000\210\001\001\022p\n\010category\030\003 " +
      "\001(\0162Y.google.ads.searchads360.v0.enums.S" +
      "earchAds360FieldCategoryEnum.SearchAds36" +
      "0FieldCategoryB\003\340A\003\022\034\n\nselectable\030\026 \001(\010B" +
      "\003\340A\003H\001\210\001\001\022\034\n\nfilterable\030\027 \001(\010B\003\340A\003H\002\210\001\001\022" +
      "\032\n\010sortable\030\030 \001(\010B\003\340A\003H\003\210\001\001\022\034\n\017selectabl" +
      "e_with\030\031 \003(\tB\003\340A\003\022 \n\023attribute_resources" +
      "\030\032 \003(\tB\003\340A\003\022\024\n\007metrics\030\033 \003(\tB\003\340A\003\022\025\n\010seg" +
      "ments\030\034 \003(\tB\003\340A\003\022\030\n\013enum_values\030\035 \003(\tB\003\340" +
      "A\003\022q\n\tdata_type\030\014 \001(\0162Y.google.ads.searc" +
      "hads360.v0.enums.SearchAds360FieldDataTy" +
      "peEnum.SearchAds360FieldDataTypeB\003\340A\003\022\032\n" +
      "\010type_url\030\036 \001(\tB\003\340A\003H\004\210\001\001\022\035\n\013is_repeated" +
      "\030\037 \001(\010B\003\340A\003H\005\210\001\001:]\352AZ\n-searchads360.goog" +
      "leapis.com/SearchAds360Field\022)searchAds3" +
      "60Fields/{search_ads_360_field}B\007\n\005_name" +
      "B\r\n\013_selectableB\r\n\013_filterableB\013\n\t_sorta" +
      "bleB\013\n\t_type_urlB\016\n\014_is_repeatedB\226\002\n(com" +
      ".google.ads.searchads360.v0.resourcesB\026S" +
      "earchAds360FieldProtoP\001ZMgoogle.golang.o" +
      "rg/genproto/googleapis/ads/searchads360/" +
      "v0/resources;resources\242\002\007GASA360\252\002$Googl" +
      "e.Ads.SearchAds360.V0.Resources\312\002$Google" +
      "\\Ads\\SearchAds360\\V0\\Resources\352\002(Google:" +
      ":Ads::SearchAds360::V0::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.searchads360.v0.enums.SearchAds360FieldCategoryProto.getDescriptor(),
          com.google.ads.searchads360.v0.enums.SearchAds360FieldDataTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_searchads360_v0_resources_SearchAds360Field_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_searchads360_v0_resources_SearchAds360Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_searchads360_v0_resources_SearchAds360Field_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Category", "Selectable", "Filterable", "Sortable", "SelectableWith", "AttributeResources", "Metrics", "Segments", "EnumValues", "DataType", "TypeUrl", "IsRepeated", "Name", "Selectable", "Filterable", "Sortable", "TypeUrl", "IsRepeated", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.searchads360.v0.enums.SearchAds360FieldCategoryProto.getDescriptor();
    com.google.ads.searchads360.v0.enums.SearchAds360FieldDataTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}