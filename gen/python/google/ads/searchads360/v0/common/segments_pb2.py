# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/searchads360/v0/common/segments.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.searchads360.v0.enums import conversion_action_category_pb2 as google_dot_ads_dot_searchads360_dot_v0_dot_enums_dot_conversion__action__category__pb2
from google.ads.searchads360.v0.enums import day_of_week_pb2 as google_dot_ads_dot_searchads360_dot_v0_dot_enums_dot_day__of__week__pb2
from google.ads.searchads360.v0.enums import device_pb2 as google_dot_ads_dot_searchads360_dot_v0_dot_enums_dot_device__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/ads/searchads360/v0/common/segments.proto\x12!google.ads.searchads360.v0.common\x1a\x41google/ads/searchads360/v0/enums/conversion_action_category.proto\x1a\x32google/ads/searchads360/v0/enums/day_of_week.proto\x1a-google/ads/searchads360/v0/enums/device.proto\x1a\x19google/api/resource.proto\"\xdd\x04\n\x08Segments\x12R\n\x11\x63onversion_action\x18\x92\x01 \x01(\tB1\xfa\x41.\n,searchads360.googleapis.com/ConversionActionH\x00\x88\x01\x01\x12{\n\x1a\x63onversion_action_category\x18\x35 \x01(\x0e\x32W.google.ads.searchads360.v0.enums.ConversionActionCategoryEnum.ConversionActionCategory\x12#\n\x16\x63onversion_action_name\x18r \x01(\tH\x01\x88\x01\x01\x12\x11\n\x04\x64\x61te\x18O \x01(\tH\x02\x88\x01\x01\x12N\n\x0b\x64\x61y_of_week\x18\x05 \x01(\x0e\x32\x39.google.ads.searchads360.v0.enums.DayOfWeekEnum.DayOfWeek\x12\x43\n\x06\x64\x65vice\x18\x01 \x01(\x0e\x32\x33.google.ads.searchads360.v0.enums.DeviceEnum.Device\x12\x12\n\x05month\x18Z \x01(\tH\x03\x88\x01\x01\x12\x15\n\x07quarter\x18\x80\x01 \x01(\tH\x04\x88\x01\x01\x12\x12\n\x04week\x18\x82\x01 \x01(\tH\x05\x88\x01\x01\x12\x12\n\x04year\x18\x83\x01 \x01(\x05H\x06\x88\x01\x01\x42\x14\n\x12_conversion_actionB\x19\n\x17_conversion_action_nameB\x07\n\x05_dateB\x08\n\x06_monthB\n\n\x08_quarterB\x07\n\x05_weekB\x07\n\x05_yearB\xfb\x01\n%com.google.ads.searchads360.v0.commonB\rSegmentsProtoP\x01ZGgoogle.golang.org/genproto/googleapis/ads/searchads360/v0/common;common\xa2\x02\x07GASA360\xaa\x02!Google.Ads.SearchAds360.V0.Common\xca\x02!Google\\Ads\\SearchAds360\\V0\\Common\xea\x02%Google::Ads::SearchAds360::V0::Commonb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.searchads360.v0.common.segments_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.searchads360.v0.commonB\rSegmentsProtoP\001ZGgoogle.golang.org/genproto/googleapis/ads/searchads360/v0/common;common\242\002\007GASA360\252\002!Google.Ads.SearchAds360.V0.Common\312\002!Google\\Ads\\SearchAds360\\V0\\Common\352\002%Google::Ads::SearchAds360::V0::Common'
  _SEGMENTS.fields_by_name['conversion_action']._options = None
  _SEGMENTS.fields_by_name['conversion_action']._serialized_options = b'\372A.\n,searchads360.googleapis.com/ConversionAction'
  _SEGMENTS._serialized_start=281
  _SEGMENTS._serialized_end=886
# @@protoc_insertion_point(module_scope)