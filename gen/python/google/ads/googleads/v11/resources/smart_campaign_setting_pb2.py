# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/smart_campaign_setting.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/ads/googleads/v11/resources/smart_campaign_setting.proto\x12\"google.ads.googleads.v11.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xbd\x06\n\x14SmartCampaignSetting\x12L\n\rresource_name\x18\x01 \x01(\tB5\xe0\x41\x05\xfa\x41/\n-googleads.googleapis.com/SmartCampaignSetting\x12;\n\x08\x63\x61mpaign\x18\x02 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/Campaign\x12Z\n\x0cphone_number\x18\x03 \x01(\x0b\x32\x44.google.ads.googleads.v11.resources.SmartCampaignSetting.PhoneNumber\x12!\n\x19\x61\x64vertising_language_code\x18\x07 \x01(\t\x12\x13\n\tfinal_url\x18\x08 \x01(\tH\x00\x12\x8b\x01\n%ad_optimized_business_profile_setting\x18\t \x01(\x0b\x32Z.google.ads.googleads.v11.resources.SmartCampaignSetting.AdOptimizedBusinessProfileSettingH\x00\x12\x17\n\rbusiness_name\x18\x05 \x01(\tH\x01\x12#\n\x19\x62usiness_profile_location\x18\n \x01(\tH\x01\x1a\x65\n\x0bPhoneNumber\x12\x19\n\x0cphone_number\x18\x01 \x01(\tH\x00\x88\x01\x01\x12\x19\n\x0c\x63ountry_code\x18\x02 \x01(\tH\x01\x88\x01\x01\x42\x0f\n\r_phone_numberB\x0f\n\r_country_code\x1a>\n!AdOptimizedBusinessProfileSetting\x12\x19\n\x11include_lead_form\x18\x01 \x01(\x08:o\xea\x41l\n-googleads.googleapis.com/SmartCampaignSetting\x12;customers/{customer_id}/smartCampaignSettings/{campaign_id}B\x0e\n\x0clanding_pageB\x12\n\x10\x62usiness_settingB\x8b\x02\n&com.google.ads.googleads.v11.resourcesB\x19SmartCampaignSettingProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.smart_campaign_setting_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\031SmartCampaignSettingProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _SMARTCAMPAIGNSETTING.fields_by_name['resource_name']._options = None
  _SMARTCAMPAIGNSETTING.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A/\n-googleads.googleapis.com/SmartCampaignSetting'
  _SMARTCAMPAIGNSETTING.fields_by_name['campaign']._options = None
  _SMARTCAMPAIGNSETTING.fields_by_name['campaign']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Campaign'
  _SMARTCAMPAIGNSETTING._options = None
  _SMARTCAMPAIGNSETTING._serialized_options = b'\352Al\n-googleads.googleapis.com/SmartCampaignSetting\022;customers/{customer_id}/smartCampaignSettings/{campaign_id}'
  _SMARTCAMPAIGNSETTING._serialized_start=164
  _SMARTCAMPAIGNSETTING._serialized_end=993
  _SMARTCAMPAIGNSETTING_PHONENUMBER._serialized_start=679
  _SMARTCAMPAIGNSETTING_PHONENUMBER._serialized_end=780
  _SMARTCAMPAIGNSETTING_ADOPTIMIZEDBUSINESSPROFILESETTING._serialized_start=782
  _SMARTCAMPAIGNSETTING_ADOPTIMIZEDBUSINESSPROFILESETTING._serialized_end=844
# @@protoc_insertion_point(module_scope)
