# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/ad.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import ad_type_infos_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_ad__type__infos__pb2
from google.ads.googleads.v11.common import custom_parameter_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_custom__parameter__pb2
from google.ads.googleads.v11.common import final_app_url_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_final__app__url__pb2
from google.ads.googleads.v11.common import url_collection_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_url__collection__pb2
from google.ads.googleads.v11.enums import ad_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_ad__type__pb2
from google.ads.googleads.v11.enums import device_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_device__pb2
from google.ads.googleads.v11.enums import system_managed_entity_source_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_system__managed__entity__source__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/ads/googleads/v11/resources/ad.proto\x12\"google.ads.googleads.v11.resources\x1a\x33google/ads/googleads/v11/common/ad_type_infos.proto\x1a\x36google/ads/googleads/v11/common/custom_parameter.proto\x1a\x33google/ads/googleads/v11/common/final_app_url.proto\x1a\x34google/ads/googleads/v11/common/url_collection.proto\x1a,google/ads/googleads/v11/enums/ad_type.proto\x1a+google/ads/googleads/v11/enums/device.proto\x1a\x41google/ads/googleads/v11/enums/system_managed_entity_source.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xa4\x17\n\x02\x41\x64\x12:\n\rresource_name\x18% \x01(\tB#\xe0\x41\x05\xfa\x41\x1d\n\x1bgoogleads.googleapis.com/Ad\x12\x14\n\x02id\x18( \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x12\n\nfinal_urls\x18) \x03(\t\x12\x44\n\x0e\x66inal_app_urls\x18# \x03(\x0b\x32,.google.ads.googleads.v11.common.FinalAppUrl\x12\x19\n\x11\x66inal_mobile_urls\x18* \x03(\t\x12\"\n\x15tracking_url_template\x18+ \x01(\tH\x02\x88\x01\x01\x12\x1d\n\x10\x66inal_url_suffix\x18, \x01(\tH\x03\x88\x01\x01\x12O\n\x15url_custom_parameters\x18\n \x03(\x0b\x32\x30.google.ads.googleads.v11.common.CustomParameter\x12\x18\n\x0b\x64isplay_url\x18- \x01(\tH\x04\x88\x01\x01\x12\x44\n\x04type\x18\x05 \x01(\x0e\x32\x31.google.ads.googleads.v11.enums.AdTypeEnum.AdTypeB\x03\xe0\x41\x03\x12%\n\x13\x61\x64\x64\x65\x64_by_google_ads\x18. \x01(\x08\x42\x03\xe0\x41\x03H\x05\x88\x01\x01\x12L\n\x11\x64\x65vice_preference\x18\x14 \x01(\x0e\x32\x31.google.ads.googleads.v11.enums.DeviceEnum.Device\x12G\n\x0furl_collections\x18\x1a \x03(\x0b\x32..google.ads.googleads.v11.common.UrlCollection\x12\x16\n\x04name\x18/ \x01(\tB\x03\xe0\x41\x05H\x06\x88\x01\x01\x12\x88\x01\n\x1esystem_managed_resource_source\x18\x1b \x01(\x0e\x32[.google.ads.googleads.v11.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSourceB\x03\xe0\x41\x03\x12\x43\n\x07text_ad\x18\x06 \x01(\x0b\x32+.google.ads.googleads.v11.common.TextAdInfoB\x03\xe0\x41\x05H\x00\x12O\n\x10\x65xpanded_text_ad\x18\x07 \x01(\x0b\x32\x33.google.ads.googleads.v11.common.ExpandedTextAdInfoH\x00\x12>\n\x07\x63\x61ll_ad\x18\x31 \x01(\x0b\x32+.google.ads.googleads.v11.common.CallAdInfoH\x00\x12g\n\x1a\x65xpanded_dynamic_search_ad\x18\x0e \x01(\x0b\x32<.google.ads.googleads.v11.common.ExpandedDynamicSearchAdInfoB\x03\xe0\x41\x05H\x00\x12@\n\x08hotel_ad\x18\x0f \x01(\x0b\x32,.google.ads.googleads.v11.common.HotelAdInfoH\x00\x12Q\n\x11shopping_smart_ad\x18\x11 \x01(\x0b\x32\x34.google.ads.googleads.v11.common.ShoppingSmartAdInfoH\x00\x12U\n\x13shopping_product_ad\x18\x12 \x01(\x0b\x32\x36.google.ads.googleads.v11.common.ShoppingProductAdInfoH\x00\x12\x45\n\x08gmail_ad\x18\x15 \x01(\x0b\x32,.google.ads.googleads.v11.common.GmailAdInfoB\x03\xe0\x41\x05H\x00\x12\x45\n\x08image_ad\x18\x16 \x01(\x0b\x32,.google.ads.googleads.v11.common.ImageAdInfoB\x03\xe0\x41\x05H\x00\x12@\n\x08video_ad\x18\x18 \x01(\x0b\x32,.google.ads.googleads.v11.common.VideoAdInfoH\x00\x12U\n\x13video_responsive_ad\x18\' \x01(\x0b\x32\x36.google.ads.googleads.v11.common.VideoResponsiveAdInfoH\x00\x12W\n\x14responsive_search_ad\x18\x19 \x01(\x0b\x32\x37.google.ads.googleads.v11.common.ResponsiveSearchAdInfoH\x00\x12\x66\n\x1clegacy_responsive_display_ad\x18\x1c \x01(\x0b\x32>.google.ads.googleads.v11.common.LegacyResponsiveDisplayAdInfoH\x00\x12<\n\x06\x61pp_ad\x18\x1d \x01(\x0b\x32*.google.ads.googleads.v11.common.AppAdInfoH\x00\x12]\n\x15legacy_app_install_ad\x18\x1e \x01(\x0b\x32\x37.google.ads.googleads.v11.common.LegacyAppInstallAdInfoB\x03\xe0\x41\x05H\x00\x12Y\n\x15responsive_display_ad\x18\x1f \x01(\x0b\x32\x38.google.ads.googleads.v11.common.ResponsiveDisplayAdInfoH\x00\x12@\n\x08local_ad\x18  \x01(\x0b\x32,.google.ads.googleads.v11.common.LocalAdInfoH\x00\x12Q\n\x11\x64isplay_upload_ad\x18! \x01(\x0b\x32\x34.google.ads.googleads.v11.common.DisplayUploadAdInfoH\x00\x12Q\n\x11\x61pp_engagement_ad\x18\" \x01(\x0b\x32\x34.google.ads.googleads.v11.common.AppEngagementAdInfoH\x00\x12j\n\x1eshopping_comparison_listing_ad\x18$ \x01(\x0b\x32@.google.ads.googleads.v11.common.ShoppingComparisonListingAdInfoH\x00\x12Q\n\x11smart_campaign_ad\x18\x30 \x01(\x0b\x32\x34.google.ads.googleads.v11.common.SmartCampaignAdInfoH\x00\x12\\\n\x17\x61pp_pre_registration_ad\x18\x32 \x01(\x0b\x32\x39.google.ads.googleads.v11.common.AppPreRegistrationAdInfoH\x00\x12^\n\x18\x64iscovery_multi_asset_ad\x18\x33 \x01(\x0b\x32:.google.ads.googleads.v11.common.DiscoveryMultiAssetAdInfoH\x00\x12Y\n\x15\x64iscovery_carousel_ad\x18\x34 \x01(\x0b\x32\x38.google.ads.googleads.v11.common.DiscoveryCarouselAdInfoH\x00:E\xea\x41\x42\n\x1bgoogleads.googleapis.com/Ad\x12#customers/{customer_id}/ads/{ad_id}B\t\n\x07\x61\x64_dataB\x05\n\x03_idB\x18\n\x16_tracking_url_templateB\x13\n\x11_final_url_suffixB\x0e\n\x0c_display_urlB\x16\n\x14_added_by_google_adsB\x07\n\x05_nameB\xf9\x01\n&com.google.ads.googleads.v11.resourcesB\x07\x41\x64ProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.ad_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\007AdProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _AD.fields_by_name['resource_name']._options = None
  _AD.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A\035\n\033googleads.googleapis.com/Ad'
  _AD.fields_by_name['id']._options = None
  _AD.fields_by_name['id']._serialized_options = b'\340A\003'
  _AD.fields_by_name['type']._options = None
  _AD.fields_by_name['type']._serialized_options = b'\340A\003'
  _AD.fields_by_name['added_by_google_ads']._options = None
  _AD.fields_by_name['added_by_google_ads']._serialized_options = b'\340A\003'
  _AD.fields_by_name['name']._options = None
  _AD.fields_by_name['name']._serialized_options = b'\340A\005'
  _AD.fields_by_name['system_managed_resource_source']._options = None
  _AD.fields_by_name['system_managed_resource_source']._serialized_options = b'\340A\003'
  _AD.fields_by_name['text_ad']._options = None
  _AD.fields_by_name['text_ad']._serialized_options = b'\340A\005'
  _AD.fields_by_name['expanded_dynamic_search_ad']._options = None
  _AD.fields_by_name['expanded_dynamic_search_ad']._serialized_options = b'\340A\005'
  _AD.fields_by_name['gmail_ad']._options = None
  _AD.fields_by_name['gmail_ad']._serialized_options = b'\340A\005'
  _AD.fields_by_name['image_ad']._options = None
  _AD.fields_by_name['image_ad']._serialized_options = b'\340A\005'
  _AD.fields_by_name['legacy_app_install_ad']._options = None
  _AD.fields_by_name['legacy_app_install_ad']._serialized_options = b'\340A\005'
  _AD._options = None
  _AD._serialized_options = b'\352AB\n\033googleads.googleapis.com/Ad\022#customers/{customer_id}/ads/{ad_id}'
  _AD._serialized_start=518
  _AD._serialized_end=3498
# @@protoc_insertion_point(module_scope)
