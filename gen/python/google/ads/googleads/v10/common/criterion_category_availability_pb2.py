# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/common/criterion_category_availability.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import advertising_channel_sub_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_advertising__channel__sub__type__pb2
from google.ads.googleads.v10.enums import advertising_channel_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_advertising__channel__type__pb2
from google.ads.googleads.v10.enums import criterion_category_channel_availability_mode_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_criterion__category__channel__availability__mode__pb2
from google.ads.googleads.v10.enums import criterion_category_locale_availability_mode_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_criterion__category__locale__availability__mode__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nEgoogle/ads/googleads/v10/common/criterion_category_availability.proto\x12\x1fgoogle.ads.googleads.v10.common\x1a\x41google/ads/googleads/v10/enums/advertising_channel_sub_type.proto\x1a=google/ads/googleads/v10/enums/advertising_channel_type.proto\x1aQgoogle/ads/googleads/v10/enums/criterion_category_channel_availability_mode.proto\x1aPgoogle/ads/googleads/v10/enums/criterion_category_locale_availability_mode.proto\"\xcd\x01\n\x1d\x43riterionCategoryAvailability\x12V\n\x07\x63hannel\x18\x01 \x01(\x0b\x32\x45.google.ads.googleads.v10.common.CriterionCategoryChannelAvailability\x12T\n\x06locale\x18\x02 \x03(\x0b\x32\x44.google.ads.googleads.v10.common.CriterionCategoryLocaleAvailability\"\x81\x04\n$CriterionCategoryChannelAvailability\x12\x90\x01\n\x11\x61vailability_mode\x18\x01 \x01(\x0e\x32u.google.ads.googleads.v10.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode\x12s\n\x18\x61\x64vertising_channel_type\x18\x02 \x01(\x0e\x32Q.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType\x12}\n\x1c\x61\x64vertising_channel_sub_type\x18\x03 \x03(\x0e\x32W.google.ads.googleads.v10.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType\x12-\n include_default_channel_sub_type\x18\x05 \x01(\x08H\x00\x88\x01\x01\x42#\n!_include_default_channel_sub_type\"\x90\x02\n#CriterionCategoryLocaleAvailability\x12\x8e\x01\n\x11\x61vailability_mode\x18\x01 \x01(\x0e\x32s.google.ads.googleads.v10.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode\x12\x19\n\x0c\x63ountry_code\x18\x04 \x01(\tH\x00\x88\x01\x01\x12\x1a\n\rlanguage_code\x18\x05 \x01(\tH\x01\x88\x01\x01\x42\x0f\n\r_country_codeB\x10\n\x0e_language_codeB\x82\x02\n#com.google.ads.googleads.v10.commonB\"CriterionCategoryAvailabilityProtoP\x01ZEgoogle.golang.org/genproto/googleapis/ads/googleads/v10/common;common\xa2\x02\x03GAA\xaa\x02\x1fGoogle.Ads.GoogleAds.V10.Common\xca\x02\x1fGoogle\\Ads\\GoogleAds\\V10\\Common\xea\x02#Google::Ads::GoogleAds::V10::Commonb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.common.criterion_category_availability_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.ads.googleads.v10.commonB\"CriterionCategoryAvailabilityProtoP\001ZEgoogle.golang.org/genproto/googleapis/ads/googleads/v10/common;common\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10.Common\312\002\037Google\\Ads\\GoogleAds\\V10\\Common\352\002#Google::Ads::GoogleAds::V10::Common'
  _CRITERIONCATEGORYAVAILABILITY._serialized_start=402
  _CRITERIONCATEGORYAVAILABILITY._serialized_end=607
  _CRITERIONCATEGORYCHANNELAVAILABILITY._serialized_start=610
  _CRITERIONCATEGORYCHANNELAVAILABILITY._serialized_end=1123
  _CRITERIONCATEGORYLOCALEAVAILABILITY._serialized_start=1126
  _CRITERIONCATEGORYLOCALEAVAILABILITY._serialized_end=1398
# @@protoc_insertion_point(module_scope)