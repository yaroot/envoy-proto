# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/click_view.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import click_location_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_click__location__pb2
from google.ads.googleads.v11.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_criteria__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/ads/googleads/v11/resources/click_view.proto\x12\"google.ads.googleads.v11.resources\x1a\x34google/ads/googleads/v11/common/click_location.proto\x1a.google/ads/googleads/v11/common/criteria.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xca\x06\n\tClickView\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"googleads.googleapis.com/ClickView\x12\x17\n\x05gclid\x18\x08 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12M\n\x10\x61rea_of_interest\x18\x03 \x01(\x0b\x32..google.ads.googleads.v11.common.ClickLocationB\x03\xe0\x41\x03\x12Q\n\x14location_of_presence\x18\x04 \x01(\x0b\x32..google.ads.googleads.v11.common.ClickLocationB\x03\xe0\x41\x03\x12\x1d\n\x0bpage_number\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x44\n\x0b\x61\x64_group_ad\x18\n \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"googleads.googleapis.com/AdGroupAdH\x02\x88\x01\x01\x12Y\n\x18\x63\x61mpaign_location_target\x18\x0b \x01(\tB2\xe0\x41\x03\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstantH\x03\x88\x01\x01\x12\x41\n\tuser_list\x18\x0c \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/UserListH\x04\x88\x01\x01\x12\x42\n\x07keyword\x18\r \x01(\tB1\xe0\x41\x03\xfa\x41+\n)googleads.googleapis.com/AdGroupCriterion\x12G\n\x0ckeyword_info\x18\x0e \x01(\x0b\x32,.google.ads.googleads.v11.common.KeywordInfoB\x03\xe0\x41\x03:Z\xea\x41W\n\"googleads.googleapis.com/ClickView\x12\x31\x63ustomers/{customer_id}/clickViews/{date}~{gclid}B\x08\n\x06_gclidB\x0e\n\x0c_page_numberB\x0e\n\x0c_ad_group_adB\x1b\n\x19_campaign_location_targetB\x0c\n\n_user_listB\x80\x02\n&com.google.ads.googleads.v11.resourcesB\x0e\x43lickViewProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.click_view_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\016ClickViewProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _CLICKVIEW.fields_by_name['resource_name']._options = None
  _CLICKVIEW.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A$\n\"googleads.googleapis.com/ClickView'
  _CLICKVIEW.fields_by_name['gclid']._options = None
  _CLICKVIEW.fields_by_name['gclid']._serialized_options = b'\340A\003'
  _CLICKVIEW.fields_by_name['area_of_interest']._options = None
  _CLICKVIEW.fields_by_name['area_of_interest']._serialized_options = b'\340A\003'
  _CLICKVIEW.fields_by_name['location_of_presence']._options = None
  _CLICKVIEW.fields_by_name['location_of_presence']._serialized_options = b'\340A\003'
  _CLICKVIEW.fields_by_name['page_number']._options = None
  _CLICKVIEW.fields_by_name['page_number']._serialized_options = b'\340A\003'
  _CLICKVIEW.fields_by_name['ad_group_ad']._options = None
  _CLICKVIEW.fields_by_name['ad_group_ad']._serialized_options = b'\340A\003\372A$\n\"googleads.googleapis.com/AdGroupAd'
  _CLICKVIEW.fields_by_name['campaign_location_target']._options = None
  _CLICKVIEW.fields_by_name['campaign_location_target']._serialized_options = b'\340A\003\372A,\n*googleads.googleapis.com/GeoTargetConstant'
  _CLICKVIEW.fields_by_name['user_list']._options = None
  _CLICKVIEW.fields_by_name['user_list']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/UserList'
  _CLICKVIEW.fields_by_name['keyword']._options = None
  _CLICKVIEW.fields_by_name['keyword']._serialized_options = b'\340A\003\372A+\n)googleads.googleapis.com/AdGroupCriterion'
  _CLICKVIEW.fields_by_name['keyword_info']._options = None
  _CLICKVIEW.fields_by_name['keyword_info']._serialized_options = b'\340A\003'
  _CLICKVIEW._options = None
  _CLICKVIEW._serialized_options = b'\352AW\n\"googleads.googleapis.com/ClickView\0221customers/{customer_id}/clickViews/{date}~{gclid}'
  _CLICKVIEW._serialized_start=254
  _CLICKVIEW._serialized_end=1096
# @@protoc_insertion_point(module_scope)
