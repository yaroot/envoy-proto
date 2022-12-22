// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/searchads360/v0/resources/conversion_action.proto

package com.google.ads.searchads360.v0.resources;

public final class ConversionActionProto {
  private ConversionActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_AttributionModelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_ValueSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_ValueSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_FloodlightSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_FloodlightSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/searchads360/v0/resources/c" +
      "onversion_action.proto\022$google.ads.searc" +
      "hads360.v0.resources\0328google/ads/searcha" +
      "ds360/v0/enums/attribution_model.proto\032A" +
      "google/ads/searchads360/v0/enums/convers" +
      "ion_action_category.proto\032?google/ads/se" +
      "archads360/v0/enums/conversion_action_st" +
      "atus.proto\032=google/ads/searchads360/v0/e" +
      "nums/conversion_action_type.proto\032?googl" +
      "e/ads/searchads360/v0/enums/data_driven_" +
      "model_status.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\"\215" +
      "\017\n\020ConversionAction\022K\n\rresource_name\030\001 \001" +
      "(\tB4\340A\005\372A.\n,searchads360.googleapis.com/" +
      "ConversionAction\022\024\n\002id\030\025 \001(\003B\003\340A\003H\000\210\001\001\022\021" +
      "\n\004name\030\026 \001(\tH\001\210\001\001\022\032\n\rcreation_time\030! \001(\t" +
      "B\003\340A\003\022c\n\006status\030\004 \001(\0162S.google.ads.searc" +
      "hads360.v0.enums.ConversionActionStatusE" +
      "num.ConversionActionStatus\022b\n\004type\030\005 \001(\016" +
      "2O.google.ads.searchads360.v0.enums.Conv" +
      "ersionActionTypeEnum.ConversionActionTyp" +
      "eB\003\340A\005\022\035\n\020primary_for_goal\030\037 \001(\010H\002\210\001\001\022i\n" +
      "\010category\030\006 \001(\0162W.google.ads.searchads36" +
      "0.v0.enums.ConversionActionCategoryEnum." +
      "ConversionActionCategory\022I\n\016owner_custom" +
      "er\030\027 \001(\tB,\340A\003\372A&\n$searchads360.googleapi" +
      "s.com/CustomerH\003\210\001\001\0229\n,include_in_client" +
      "_account_conversions_metric\030\030 \001(\010H\004\210\001\001\022/" +
      "\n\035include_in_conversions_metric\030  \001(\010B\003\340" +
      "A\003H\005\210\001\001\022/\n\"click_through_lookback_window" +
      "_days\030\031 \001(\003H\006\210\001\001\022\\\n\016value_settings\030\013 \001(\013" +
      "2D.google.ads.searchads360.v0.resources." +
      "ConversionAction.ValueSettings\022s\n\032attrib" +
      "ution_model_settings\030\r \001(\0132O.google.ads." +
      "searchads360.v0.resources.ConversionActi" +
      "on.AttributionModelSettings\022\023\n\006app_id\030\034 " +
      "\001(\tH\007\210\001\001\022k\n\023floodlight_settings\030\035 \001(\0132I." +
      "google.ads.searchads360.v0.resources.Con" +
      "versionAction.FloodlightSettingsB\003\340A\003\032\370\001" +
      "\n\030AttributionModelSettings\022b\n\021attributio" +
      "n_model\030\001 \001(\0162G.google.ads.searchads360." +
      "v0.enums.AttributionModelEnum.Attributio" +
      "nModel\022x\n\030data_driven_model_status\030\002 \001(\016" +
      "2Q.google.ads.searchads360.v0.enums.Data" +
      "DrivenModelStatusEnum.DataDrivenModelSta" +
      "tusB\003\340A\003\032\277\001\n\rValueSettings\022\032\n\rdefault_va" +
      "lue\030\004 \001(\001H\000\210\001\001\022\"\n\025default_currency_code\030" +
      "\005 \001(\tH\001\210\001\001\022%\n\030always_use_default_value\030\006" +
      " \001(\010H\002\210\001\001B\020\n\016_default_valueB\030\n\026_default_" +
      "currency_codeB\033\n\031_always_use_default_val" +
      "ue\032j\n\022FloodlightSettings\022\037\n\022activity_gro" +
      "up_tag\030\001 \001(\tB\003\340A\003\022\031\n\014activity_tag\030\002 \001(\tB" +
      "\003\340A\003\022\030\n\013activity_id\030\003 \001(\003B\003\340A\003:q\352An\n,sea" +
      "rchads360.googleapis.com/ConversionActio" +
      "n\022>customers/{customer_id}/conversionAct" +
      "ions/{conversion_type_id}B\005\n\003_idB\007\n\005_nam" +
      "eB\023\n\021_primary_for_goalB\021\n\017_owner_custome" +
      "rB/\n-_include_in_client_account_conversi" +
      "ons_metricB \n\036_include_in_conversions_me" +
      "tricB%\n#_click_through_lookback_window_d" +
      "aysB\t\n\007_app_idB\225\002\n(com.google.ads.search" +
      "ads360.v0.resourcesB\025ConversionActionPro" +
      "toP\001ZMgoogle.golang.org/genproto/googlea" +
      "pis/ads/searchads360/v0/resources;resour" +
      "ces\242\002\007GASA360\252\002$Google.Ads.SearchAds360." +
      "V0.Resources\312\002$Google\\Ads\\SearchAds360\\V" +
      "0\\Resources\352\002(Google::Ads::SearchAds360:" +
      ":V0::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.searchads360.v0.enums.AttributionModelProto.getDescriptor(),
          com.google.ads.searchads360.v0.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.searchads360.v0.enums.ConversionActionStatusProto.getDescriptor(),
          com.google.ads.searchads360.v0.enums.ConversionActionTypeProto.getDescriptor(),
          com.google.ads.searchads360.v0.enums.DataDrivenModelStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_searchads360_v0_resources_ConversionAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CreationTime", "Status", "Type", "PrimaryForGoal", "Category", "OwnerCustomer", "IncludeInClientAccountConversionsMetric", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ValueSettings", "AttributionModelSettings", "AppId", "FloodlightSettings", "Id", "Name", "PrimaryForGoal", "OwnerCustomer", "IncludeInClientAccountConversionsMetric", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "AppId", });
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_AttributionModelSettings_descriptor =
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_searchads360_v0_resources_ConversionAction_AttributionModelSettings_descriptor,
        new java.lang.String[] { "AttributionModel", "DataDrivenModelStatus", });
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_ValueSettings_descriptor =
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_ValueSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_searchads360_v0_resources_ConversionAction_ValueSettings_descriptor,
        new java.lang.String[] { "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", });
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_FloodlightSettings_descriptor =
      internal_static_google_ads_searchads360_v0_resources_ConversionAction_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_searchads360_v0_resources_ConversionAction_FloodlightSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_searchads360_v0_resources_ConversionAction_FloodlightSettings_descriptor,
        new java.lang.String[] { "ActivityGroupTag", "ActivityTag", "ActivityId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.searchads360.v0.enums.AttributionModelProto.getDescriptor();
    com.google.ads.searchads360.v0.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.searchads360.v0.enums.ConversionActionStatusProto.getDescriptor();
    com.google.ads.searchads360.v0.enums.ConversionActionTypeProto.getDescriptor();
    com.google.ads.searchads360.v0.enums.DataDrivenModelStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}