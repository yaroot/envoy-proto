# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/campaign.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import bidding_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_bidding__pb2
from google.ads.googleads.v10.common import custom_parameter_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_custom__parameter__pb2
from google.ads.googleads.v10.common import frequency_cap_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_frequency__cap__pb2
from google.ads.googleads.v10.common import real_time_bidding_setting_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_real__time__bidding__setting__pb2
from google.ads.googleads.v10.common import targeting_setting_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_targeting__setting__pb2
from google.ads.googleads.v10.enums import ad_serving_optimization_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_ad__serving__optimization__status__pb2
from google.ads.googleads.v10.enums import advertising_channel_sub_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_advertising__channel__sub__type__pb2
from google.ads.googleads.v10.enums import advertising_channel_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_advertising__channel__type__pb2
from google.ads.googleads.v10.enums import app_campaign_app_store_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_app__campaign__app__store__pb2
from google.ads.googleads.v10.enums import app_campaign_bidding_strategy_goal_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_app__campaign__bidding__strategy__goal__type__pb2
from google.ads.googleads.v10.enums import asset_field_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_asset__field__type__pb2
from google.ads.googleads.v10.enums import bidding_strategy_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_bidding__strategy__type__pb2
from google.ads.googleads.v10.enums import brand_safety_suitability_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_brand__safety__suitability__pb2
from google.ads.googleads.v10.enums import campaign_experiment_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_campaign__experiment__type__pb2
from google.ads.googleads.v10.enums import campaign_serving_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_campaign__serving__status__pb2
from google.ads.googleads.v10.enums import campaign_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_campaign__status__pb2
from google.ads.googleads.v10.enums import location_source_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_location__source__type__pb2
from google.ads.googleads.v10.enums import negative_geo_target_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_negative__geo__target__type__pb2
from google.ads.googleads.v10.enums import optimization_goal_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_optimization__goal__type__pb2
from google.ads.googleads.v10.enums import payment_mode_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_payment__mode__pb2
from google.ads.googleads.v10.enums import positive_geo_target_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_positive__geo__target__type__pb2
from google.ads.googleads.v10.enums import vanity_pharma_display_url_mode_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_vanity__pharma__display__url__mode__pb2
from google.ads.googleads.v10.enums import vanity_pharma_text_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_vanity__pharma__text__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/ads/googleads/v10/resources/campaign.proto\x12\"google.ads.googleads.v10.resources\x1a-google/ads/googleads/v10/common/bidding.proto\x1a\x36google/ads/googleads/v10/common/custom_parameter.proto\x1a\x33google/ads/googleads/v10/common/frequency_cap.proto\x1a?google/ads/googleads/v10/common/real_time_bidding_setting.proto\x1a\x37google/ads/googleads/v10/common/targeting_setting.proto\x1a\x43google/ads/googleads/v10/enums/ad_serving_optimization_status.proto\x1a\x41google/ads/googleads/v10/enums/advertising_channel_sub_type.proto\x1a=google/ads/googleads/v10/enums/advertising_channel_type.proto\x1a;google/ads/googleads/v10/enums/app_campaign_app_store.proto\x1aLgoogle/ads/googleads/v10/enums/app_campaign_bidding_strategy_goal_type.proto\x1a\x35google/ads/googleads/v10/enums/asset_field_type.proto\x1a:google/ads/googleads/v10/enums/bidding_strategy_type.proto\x1a=google/ads/googleads/v10/enums/brand_safety_suitability.proto\x1a=google/ads/googleads/v10/enums/campaign_experiment_type.proto\x1a<google/ads/googleads/v10/enums/campaign_serving_status.proto\x1a\x34google/ads/googleads/v10/enums/campaign_status.proto\x1a\x39google/ads/googleads/v10/enums/location_source_type.proto\x1a=google/ads/googleads/v10/enums/negative_geo_target_type.proto\x1a;google/ads/googleads/v10/enums/optimization_goal_type.proto\x1a\x31google/ads/googleads/v10/enums/payment_mode.proto\x1a=google/ads/googleads/v10/enums/positive_geo_target_type.proto\x1a\x43google/ads/googleads/v10/enums/vanity_pharma_display_url_mode.proto\x1a\x37google/ads/googleads/v10/enums/vanity_pharma_text.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xb9\x34\n\x08\x43\x61mpaign\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/Campaign\x12\x14\n\x02id\x18; \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x11\n\x04name\x18: \x01(\tH\x02\x88\x01\x01\x12Q\n\x06status\x18\x05 \x01(\x0e\x32\x41.google.ads.googleads.v10.enums.CampaignStatusEnum.CampaignStatus\x12l\n\x0eserving_status\x18\x15 \x01(\x0e\x32O.google.ads.googleads.v10.enums.CampaignServingStatusEnum.CampaignServingStatusB\x03\xe0\x41\x03\x12\x83\x01\n\x1e\x61\x64_serving_optimization_status\x18\x08 \x01(\x0e\x32[.google.ads.googleads.v10.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus\x12x\n\x18\x61\x64vertising_channel_type\x18\t \x01(\x0e\x32Q.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.AdvertisingChannelTypeB\x03\xe0\x41\x05\x12\x82\x01\n\x1c\x61\x64vertising_channel_sub_type\x18\n \x01(\x0e\x32W.google.ads.googleads.v10.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubTypeB\x03\xe0\x41\x05\x12\"\n\x15tracking_url_template\x18< \x01(\tH\x03\x88\x01\x01\x12O\n\x15url_custom_parameters\x18\x0c \x03(\x0b\x32\x30.google.ads.googleads.v10.common.CustomParameter\x12Z\n\x19real_time_bidding_setting\x18\' \x01(\x0b\x32\x37.google.ads.googleads.v10.common.RealTimeBiddingSetting\x12V\n\x10network_settings\x18\x0e \x01(\x0b\x32<.google.ads.googleads.v10.resources.Campaign.NetworkSettings\x12Y\n\rhotel_setting\x18  \x01(\x0b\x32=.google.ads.googleads.v10.resources.Campaign.HotelSettingInfoB\x03\xe0\x41\x05\x12h\n\x1a\x64ynamic_search_ads_setting\x18! \x01(\x0b\x32\x44.google.ads.googleads.v10.resources.Campaign.DynamicSearchAdsSetting\x12V\n\x10shopping_setting\x18$ \x01(\x0b\x32<.google.ads.googleads.v10.resources.Campaign.ShoppingSetting\x12L\n\x11targeting_setting\x18+ \x01(\x0b\x32\x31.google.ads.googleads.v10.common.TargetingSetting\x12`\n\x10\x61udience_setting\x18I \x01(\x0b\x32<.google.ads.googleads.v10.resources.Campaign.AudienceSettingB\x03\xe0\x41\x05H\x04\x88\x01\x01\x12\x62\n\x17geo_target_type_setting\x18/ \x01(\x0b\x32\x41.google.ads.googleads.v10.resources.Campaign.GeoTargetTypeSetting\x12\x61\n\x16local_campaign_setting\x18\x32 \x01(\x0b\x32\x41.google.ads.googleads.v10.resources.Campaign.LocalCampaignSetting\x12]\n\x14\x61pp_campaign_setting\x18\x33 \x01(\x0b\x32?.google.ads.googleads.v10.resources.Campaign.AppCampaignSetting\x12>\n\x06labels\x18= \x03(\tB.\xe0\x41\x03\xfa\x41(\n&googleads.googleapis.com/CampaignLabel\x12o\n\x0f\x65xperiment_type\x18\x11 \x01(\x0e\x32Q.google.ads.googleads.v10.enums.CampaignExperimentTypeEnum.CampaignExperimentTypeB\x03\xe0\x41\x03\x12\x45\n\rbase_campaign\x18\x38 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CampaignH\x05\x88\x01\x01\x12J\n\x0f\x63\x61mpaign_budget\x18> \x01(\tB,\xfa\x41)\n\'googleads.googleapis.com/CampaignBudgetH\x06\x88\x01\x01\x12o\n\x15\x62idding_strategy_type\x18\x16 \x01(\x0e\x32K.google.ads.googleads.v10.enums.BiddingStrategyTypeEnum.BiddingStrategyTypeB\x03\xe0\x41\x03\x12_\n\x1b\x61\x63\x63\x65ssible_bidding_strategy\x18G \x01(\tB:\xe0\x41\x03\xfa\x41\x34\n2googleads.googleapis.com/AccessibleBiddingStrategy\x12\x17\n\nstart_date\x18? \x01(\tH\x07\x88\x01\x01\x12H\n\x0e\x63\x61mpaign_group\x18L \x01(\tB+\xfa\x41(\n&googleads.googleapis.com/CampaignGroupH\x08\x88\x01\x01\x12\x15\n\x08\x65nd_date\x18@ \x01(\tH\t\x88\x01\x01\x12\x1d\n\x10\x66inal_url_suffix\x18\x41 \x01(\tH\n\x88\x01\x01\x12J\n\x0e\x66requency_caps\x18( \x03(\x0b\x32\x32.google.ads.googleads.v10.common.FrequencyCapEntry\x12~\n\x1evideo_brand_safety_suitability\x18* \x01(\x0e\x32Q.google.ads.googleads.v10.enums.BrandSafetySuitabilityEnum.BrandSafetySuitabilityB\x03\xe0\x41\x03\x12P\n\rvanity_pharma\x18, \x01(\x0b\x32\x39.google.ads.googleads.v10.resources.Campaign.VanityPharma\x12\x62\n\x16selective_optimization\x18- \x01(\x0b\x32\x42.google.ads.googleads.v10.resources.Campaign.SelectiveOptimization\x12g\n\x19optimization_goal_setting\x18\x36 \x01(\x0b\x32\x44.google.ads.googleads.v10.resources.Campaign.OptimizationGoalSetting\x12[\n\x10tracking_setting\x18. \x01(\x0b\x32<.google.ads.googleads.v10.resources.Campaign.TrackingSettingB\x03\xe0\x41\x03\x12Q\n\x0cpayment_mode\x18\x34 \x01(\x0e\x32;.google.ads.googleads.v10.enums.PaymentModeEnum.PaymentMode\x12$\n\x12optimization_score\x18\x42 \x01(\x01\x42\x03\xe0\x41\x03H\x0b\x88\x01\x01\x12l\n!excluded_parent_asset_field_types\x18\x45 \x03(\x0e\x32\x41.google.ads.googleads.v10.enums.AssetFieldTypeEnum.AssetFieldType\x12\"\n\x15url_expansion_opt_out\x18H \x01(\x08H\x0c\x88\x01\x01\x12I\n\x10\x62idding_strategy\x18\x43 \x01(\tB-\xfa\x41*\n(googleads.googleapis.com/BiddingStrategyH\x00\x12\x41\n\ncommission\x18\x31 \x01(\x0b\x32+.google.ads.googleads.v10.common.CommissionH\x00\x12@\n\nmanual_cpc\x18\x18 \x01(\x0b\x32*.google.ads.googleads.v10.common.ManualCpcH\x00\x12@\n\nmanual_cpm\x18\x19 \x01(\x0b\x32*.google.ads.googleads.v10.common.ManualCpmH\x00\x12\x45\n\nmanual_cpv\x18% \x01(\x0b\x32*.google.ads.googleads.v10.common.ManualCpvB\x03\xe0\x41\x03H\x00\x12T\n\x14maximize_conversions\x18\x1e \x01(\x0b\x32\x34.google.ads.googleads.v10.common.MaximizeConversionsH\x00\x12]\n\x19maximize_conversion_value\x18\x1f \x01(\x0b\x32\x38.google.ads.googleads.v10.common.MaximizeConversionValueH\x00\x12@\n\ntarget_cpa\x18\x1a \x01(\x0b\x32*.google.ads.googleads.v10.common.TargetCpaH\x00\x12Y\n\x17target_impression_share\x18\x30 \x01(\x0b\x32\x36.google.ads.googleads.v10.common.TargetImpressionShareH\x00\x12\x42\n\x0btarget_roas\x18\x1d \x01(\x0b\x32+.google.ads.googleads.v10.common.TargetRoasH\x00\x12\x44\n\x0ctarget_spend\x18\x1b \x01(\x0b\x32,.google.ads.googleads.v10.common.TargetSpendH\x00\x12\x42\n\x0bpercent_cpc\x18\" \x01(\x0b\x32+.google.ads.googleads.v10.common.PercentCpcH\x00\x12@\n\ntarget_cpm\x18) \x01(\x0b\x32*.google.ads.googleads.v10.common.TargetCpmH\x00\x1a\x99\x02\n\x0fNetworkSettings\x12!\n\x14target_google_search\x18\x05 \x01(\x08H\x00\x88\x01\x01\x12\"\n\x15target_search_network\x18\x06 \x01(\x08H\x01\x88\x01\x01\x12#\n\x16target_content_network\x18\x07 \x01(\x08H\x02\x88\x01\x01\x12*\n\x1dtarget_partner_search_network\x18\x08 \x01(\x08H\x03\x88\x01\x01\x42\x17\n\x15_target_google_searchB\x18\n\x16_target_search_networkB\x19\n\x17_target_content_networkB \n\x1e_target_partner_search_network\x1aI\n\x10HotelSettingInfo\x12!\n\x0fhotel_center_id\x18\x02 \x01(\x03\x42\x03\xe0\x41\x05H\x00\x88\x01\x01\x42\x12\n\x10_hotel_center_id\x1a\xc2\x01\n\x17\x44ynamicSearchAdsSetting\x12\x18\n\x0b\x64omain_name\x18\x06 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x07 \x01(\tB\x03\xe0\x41\x02\x12#\n\x16use_supplied_urls_only\x18\x08 \x01(\x08H\x00\x88\x01\x01\x12\x31\n\x05\x66\x65\x65\x64s\x18\t \x03(\tB\"\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/FeedB\x19\n\x17_use_supplied_urls_only\x1a\xf4\x01\n\x0fShoppingSetting\x12\x1d\n\x0bmerchant_id\x18\x05 \x01(\x03\x42\x03\xe0\x41\x05H\x00\x88\x01\x01\x12\x1a\n\rsales_country\x18\x06 \x01(\tH\x01\x88\x01\x01\x12\x1e\n\x11\x63\x61mpaign_priority\x18\x07 \x01(\x05H\x02\x88\x01\x01\x12\x19\n\x0c\x65nable_local\x18\x08 \x01(\x08H\x03\x88\x01\x01\x12\"\n\x15use_vehicle_inventory\x18\t \x01(\x08\x42\x03\xe0\x41\x05\x42\x0e\n\x0c_merchant_idB\x10\n\x0e_sales_countryB\x14\n\x12_campaign_priorityB\x0f\n\r_enable_local\x1a\x42\n\x0fTrackingSetting\x12\x1e\n\x0ctracking_url\x18\x02 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x42\x0f\n\r_tracking_url\x1a\xfc\x01\n\x14GeoTargetTypeSetting\x12q\n\x18positive_geo_target_type\x18\x01 \x01(\x0e\x32O.google.ads.googleads.v10.enums.PositiveGeoTargetTypeEnum.PositiveGeoTargetType\x12q\n\x18negative_geo_target_type\x18\x02 \x01(\x0e\x32O.google.ads.googleads.v10.enums.NegativeGeoTargetTypeEnum.NegativeGeoTargetType\x1a\x7f\n\x14LocalCampaignSetting\x12g\n\x14location_source_type\x18\x01 \x01(\x0e\x32I.google.ads.googleads.v10.enums.LocationSourceTypeEnum.LocationSourceType\x1a\xae\x02\n\x12\x41ppCampaignSetting\x12\x8d\x01\n\x1a\x62idding_strategy_goal_type\x18\x01 \x01(\x0e\x32i.google.ads.googleads.v10.enums.AppCampaignBiddingStrategyGoalTypeEnum.AppCampaignBiddingStrategyGoalType\x12\x18\n\x06\x61pp_id\x18\x04 \x01(\tB\x03\xe0\x41\x05H\x00\x88\x01\x01\x12\x63\n\tapp_store\x18\x03 \x01(\x0e\x32K.google.ads.googleads.v10.enums.AppCampaignAppStoreEnum.AppCampaignAppStoreB\x03\xe0\x41\x05\x42\t\n\x07_app_id\x1a\xf5\x01\n\x0cVanityPharma\x12\x81\x01\n\x1evanity_pharma_display_url_mode\x18\x01 \x01(\x0e\x32Y.google.ads.googleads.v10.enums.VanityPharmaDisplayUrlModeEnum.VanityPharmaDisplayUrlMode\x12\x61\n\x12vanity_pharma_text\x18\x02 \x01(\x0e\x32\x45.google.ads.googleads.v10.enums.VanityPharmaTextEnum.VanityPharmaText\x1a\x63\n\x15SelectiveOptimization\x12J\n\x12\x63onversion_actions\x18\x02 \x03(\tB.\xfa\x41+\n)googleads.googleapis.com/ConversionAction\x1a\x89\x01\n\x17OptimizationGoalSetting\x12n\n\x17optimization_goal_types\x18\x01 \x03(\x0e\x32M.google.ads.googleads.v10.enums.OptimizationGoalTypeEnum.OptimizationGoalType\x1aR\n\x0f\x41udienceSetting\x12&\n\x14use_audience_grouped\x18\x01 \x01(\x08\x42\x03\xe0\x41\x05H\x00\x88\x01\x01\x42\x17\n\x15_use_audience_grouped:W\xea\x41T\n!googleads.googleapis.com/Campaign\x12/customers/{customer_id}/campaigns/{campaign_id}B\x1b\n\x19\x63\x61mpaign_bidding_strategyB\x05\n\x03_idB\x07\n\x05_nameB\x18\n\x16_tracking_url_templateB\x13\n\x11_audience_settingB\x10\n\x0e_base_campaignB\x12\n\x10_campaign_budgetB\r\n\x0b_start_dateB\x11\n\x0f_campaign_groupB\x0b\n\t_end_dateB\x13\n\x11_final_url_suffixB\x15\n\x13_optimization_scoreB\x18\n\x16_url_expansion_opt_outB\xff\x01\n&com.google.ads.googleads.v10.resourcesB\rCampaignProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.campaign_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\rCampaignProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CAMPAIGN_HOTELSETTINGINFO.fields_by_name['hotel_center_id']._options = None
  _CAMPAIGN_HOTELSETTINGINFO.fields_by_name['hotel_center_id']._serialized_options = b'\340A\005'
  _CAMPAIGN_DYNAMICSEARCHADSSETTING.fields_by_name['domain_name']._options = None
  _CAMPAIGN_DYNAMICSEARCHADSSETTING.fields_by_name['domain_name']._serialized_options = b'\340A\002'
  _CAMPAIGN_DYNAMICSEARCHADSSETTING.fields_by_name['language_code']._options = None
  _CAMPAIGN_DYNAMICSEARCHADSSETTING.fields_by_name['language_code']._serialized_options = b'\340A\002'
  _CAMPAIGN_DYNAMICSEARCHADSSETTING.fields_by_name['feeds']._options = None
  _CAMPAIGN_DYNAMICSEARCHADSSETTING.fields_by_name['feeds']._serialized_options = b'\372A\037\n\035googleads.googleapis.com/Feed'
  _CAMPAIGN_SHOPPINGSETTING.fields_by_name['merchant_id']._options = None
  _CAMPAIGN_SHOPPINGSETTING.fields_by_name['merchant_id']._serialized_options = b'\340A\005'
  _CAMPAIGN_SHOPPINGSETTING.fields_by_name['use_vehicle_inventory']._options = None
  _CAMPAIGN_SHOPPINGSETTING.fields_by_name['use_vehicle_inventory']._serialized_options = b'\340A\005'
  _CAMPAIGN_TRACKINGSETTING.fields_by_name['tracking_url']._options = None
  _CAMPAIGN_TRACKINGSETTING.fields_by_name['tracking_url']._serialized_options = b'\340A\003'
  _CAMPAIGN_APPCAMPAIGNSETTING.fields_by_name['app_id']._options = None
  _CAMPAIGN_APPCAMPAIGNSETTING.fields_by_name['app_id']._serialized_options = b'\340A\005'
  _CAMPAIGN_APPCAMPAIGNSETTING.fields_by_name['app_store']._options = None
  _CAMPAIGN_APPCAMPAIGNSETTING.fields_by_name['app_store']._serialized_options = b'\340A\005'
  _CAMPAIGN_SELECTIVEOPTIMIZATION.fields_by_name['conversion_actions']._options = None
  _CAMPAIGN_SELECTIVEOPTIMIZATION.fields_by_name['conversion_actions']._serialized_options = b'\372A+\n)googleads.googleapis.com/ConversionAction'
  _CAMPAIGN_AUDIENCESETTING.fields_by_name['use_audience_grouped']._options = None
  _CAMPAIGN_AUDIENCESETTING.fields_by_name['use_audience_grouped']._serialized_options = b'\340A\005'
  _CAMPAIGN.fields_by_name['resource_name']._options = None
  _CAMPAIGN.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGN.fields_by_name['id']._options = None
  _CAMPAIGN.fields_by_name['id']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['serving_status']._options = None
  _CAMPAIGN.fields_by_name['serving_status']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['advertising_channel_type']._options = None
  _CAMPAIGN.fields_by_name['advertising_channel_type']._serialized_options = b'\340A\005'
  _CAMPAIGN.fields_by_name['advertising_channel_sub_type']._options = None
  _CAMPAIGN.fields_by_name['advertising_channel_sub_type']._serialized_options = b'\340A\005'
  _CAMPAIGN.fields_by_name['hotel_setting']._options = None
  _CAMPAIGN.fields_by_name['hotel_setting']._serialized_options = b'\340A\005'
  _CAMPAIGN.fields_by_name['audience_setting']._options = None
  _CAMPAIGN.fields_by_name['audience_setting']._serialized_options = b'\340A\005'
  _CAMPAIGN.fields_by_name['labels']._options = None
  _CAMPAIGN.fields_by_name['labels']._serialized_options = b'\340A\003\372A(\n&googleads.googleapis.com/CampaignLabel'
  _CAMPAIGN.fields_by_name['experiment_type']._options = None
  _CAMPAIGN.fields_by_name['experiment_type']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['base_campaign']._options = None
  _CAMPAIGN.fields_by_name['base_campaign']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGN.fields_by_name['campaign_budget']._options = None
  _CAMPAIGN.fields_by_name['campaign_budget']._serialized_options = b'\372A)\n\'googleads.googleapis.com/CampaignBudget'
  _CAMPAIGN.fields_by_name['bidding_strategy_type']._options = None
  _CAMPAIGN.fields_by_name['bidding_strategy_type']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['accessible_bidding_strategy']._options = None
  _CAMPAIGN.fields_by_name['accessible_bidding_strategy']._serialized_options = b'\340A\003\372A4\n2googleads.googleapis.com/AccessibleBiddingStrategy'
  _CAMPAIGN.fields_by_name['campaign_group']._options = None
  _CAMPAIGN.fields_by_name['campaign_group']._serialized_options = b'\372A(\n&googleads.googleapis.com/CampaignGroup'
  _CAMPAIGN.fields_by_name['video_brand_safety_suitability']._options = None
  _CAMPAIGN.fields_by_name['video_brand_safety_suitability']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['tracking_setting']._options = None
  _CAMPAIGN.fields_by_name['tracking_setting']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['optimization_score']._options = None
  _CAMPAIGN.fields_by_name['optimization_score']._serialized_options = b'\340A\003'
  _CAMPAIGN.fields_by_name['bidding_strategy']._options = None
  _CAMPAIGN.fields_by_name['bidding_strategy']._serialized_options = b'\372A*\n(googleads.googleapis.com/BiddingStrategy'
  _CAMPAIGN.fields_by_name['manual_cpv']._options = None
  _CAMPAIGN.fields_by_name['manual_cpv']._serialized_options = b'\340A\003'
  _CAMPAIGN._options = None
  _CAMPAIGN._serialized_options = b'\352AT\n!googleads.googleapis.com/Campaign\022/customers/{customer_id}/campaigns/{campaign_id}'
  _CAMPAIGN._serialized_start=1546
  _CAMPAIGN._serialized_end=8259
  _CAMPAIGN_NETWORKSETTINGS._serialized_start=5793
  _CAMPAIGN_NETWORKSETTINGS._serialized_end=6074
  _CAMPAIGN_HOTELSETTINGINFO._serialized_start=6076
  _CAMPAIGN_HOTELSETTINGINFO._serialized_end=6149
  _CAMPAIGN_DYNAMICSEARCHADSSETTING._serialized_start=6152
  _CAMPAIGN_DYNAMICSEARCHADSSETTING._serialized_end=6346
  _CAMPAIGN_SHOPPINGSETTING._serialized_start=6349
  _CAMPAIGN_SHOPPINGSETTING._serialized_end=6593
  _CAMPAIGN_TRACKINGSETTING._serialized_start=6595
  _CAMPAIGN_TRACKINGSETTING._serialized_end=6661
  _CAMPAIGN_GEOTARGETTYPESETTING._serialized_start=6664
  _CAMPAIGN_GEOTARGETTYPESETTING._serialized_end=6916
  _CAMPAIGN_LOCALCAMPAIGNSETTING._serialized_start=6918
  _CAMPAIGN_LOCALCAMPAIGNSETTING._serialized_end=7045
  _CAMPAIGN_APPCAMPAIGNSETTING._serialized_start=7048
  _CAMPAIGN_APPCAMPAIGNSETTING._serialized_end=7350
  _CAMPAIGN_VANITYPHARMA._serialized_start=7353
  _CAMPAIGN_VANITYPHARMA._serialized_end=7598
  _CAMPAIGN_SELECTIVEOPTIMIZATION._serialized_start=7600
  _CAMPAIGN_SELECTIVEOPTIMIZATION._serialized_end=7699
  _CAMPAIGN_OPTIMIZATIONGOALSETTING._serialized_start=7702
  _CAMPAIGN_OPTIMIZATIONGOALSETTING._serialized_end=7839
  _CAMPAIGN_AUDIENCESETTING._serialized_start=7841
  _CAMPAIGN_AUDIENCESETTING._serialized_end=7923
# @@protoc_insertion_point(module_scope)
