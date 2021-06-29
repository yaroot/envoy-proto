# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/click_view.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.common import click_location_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_common_dot_click__location__pb2
from google.ads.googleads.v7.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_common_dot_criteria__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/click_view.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\016ClickViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/ads/googleads/v7/resources/click_view.proto\x12!google.ads.googleads.v7.resources\x1a\x33google/ads/googleads/v7/common/click_location.proto\x1a-google/ads/googleads/v7/common/criteria.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xc7\x06\n\tClickView\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"googleads.googleapis.com/ClickView\x12\x17\n\x05gclid\x18\x08 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12L\n\x10\x61rea_of_interest\x18\x03 \x01(\x0b\x32-.google.ads.googleads.v7.common.ClickLocationB\x03\xe0\x41\x03\x12P\n\x14location_of_presence\x18\x04 \x01(\x0b\x32-.google.ads.googleads.v7.common.ClickLocationB\x03\xe0\x41\x03\x12\x1d\n\x0bpage_number\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x44\n\x0b\x61\x64_group_ad\x18\n \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"googleads.googleapis.com/AdGroupAdH\x02\x88\x01\x01\x12Y\n\x18\x63\x61mpaign_location_target\x18\x0b \x01(\tB2\xe0\x41\x03\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstantH\x03\x88\x01\x01\x12\x41\n\tuser_list\x18\x0c \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/UserListH\x04\x88\x01\x01\x12\x42\n\x07keyword\x18\r \x01(\tB1\xe0\x41\x03\xfa\x41+\n)googleads.googleapis.com/AdGroupCriterion\x12\x46\n\x0ckeyword_info\x18\x0e \x01(\x0b\x32+.google.ads.googleads.v7.common.KeywordInfoB\x03\xe0\x41\x03:Z\xea\x41W\n\"googleads.googleapis.com/ClickView\x12\x31\x63ustomers/{customer_id}/clickViews/{date}~{gclid}B\x08\n\x06_gclidB\x0e\n\x0c_page_numberB\x0e\n\x0c_ad_group_adB\x1b\n\x19_campaign_location_targetB\x0c\n\n_user_listB\xfb\x01\n%com.google.ads.googleads.v7.resourcesB\x0e\x43lickViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_common_dot_click__location__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_common_dot_criteria__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CLICKVIEW = _descriptor.Descriptor(
  name='ClickView',
  full_name='google.ads.googleads.v7.resources.ClickView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.ClickView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A$\n\"googleads.googleapis.com/ClickView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='gclid', full_name='google.ads.googleads.v7.resources.ClickView.gclid', index=1,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='area_of_interest', full_name='google.ads.googleads.v7.resources.ClickView.area_of_interest', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location_of_presence', full_name='google.ads.googleads.v7.resources.ClickView.location_of_presence', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_number', full_name='google.ads.googleads.v7.resources.ClickView.page_number', index=4,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group_ad', full_name='google.ads.googleads.v7.resources.ClickView.ad_group_ad', index=5,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A$\n\"googleads.googleapis.com/AdGroupAd', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign_location_target', full_name='google.ads.googleads.v7.resources.ClickView.campaign_location_target', index=6,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A,\n*googleads.googleapis.com/GeoTargetConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_list', full_name='google.ads.googleads.v7.resources.ClickView.user_list', index=7,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A#\n!googleads.googleapis.com/UserList', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword', full_name='google.ads.googleads.v7.resources.ClickView.keyword', index=8,
      number=13, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A+\n)googleads.googleapis.com/AdGroupCriterion', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_info', full_name='google.ads.googleads.v7.resources.ClickView.keyword_info', index=9,
      number=14, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AW\n\"googleads.googleapis.com/ClickView\0221customers/{customer_id}/clickViews/{date}~{gclid}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_gclid', full_name='google.ads.googleads.v7.resources.ClickView._gclid',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_page_number', full_name='google.ads.googleads.v7.resources.ClickView._page_number',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_ad_group_ad', full_name='google.ads.googleads.v7.resources.ClickView._ad_group_ad',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_campaign_location_target', full_name='google.ads.googleads.v7.resources.ClickView._campaign_location_target',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_user_list', full_name='google.ads.googleads.v7.resources.ClickView._user_list',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=280,
  serialized_end=1119,
)

_CLICKVIEW.fields_by_name['area_of_interest'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_click__location__pb2._CLICKLOCATION
_CLICKVIEW.fields_by_name['location_of_presence'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_click__location__pb2._CLICKLOCATION
_CLICKVIEW.fields_by_name['keyword_info'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_criteria__pb2._KEYWORDINFO
_CLICKVIEW.oneofs_by_name['_gclid'].fields.append(
  _CLICKVIEW.fields_by_name['gclid'])
_CLICKVIEW.fields_by_name['gclid'].containing_oneof = _CLICKVIEW.oneofs_by_name['_gclid']
_CLICKVIEW.oneofs_by_name['_page_number'].fields.append(
  _CLICKVIEW.fields_by_name['page_number'])
_CLICKVIEW.fields_by_name['page_number'].containing_oneof = _CLICKVIEW.oneofs_by_name['_page_number']
_CLICKVIEW.oneofs_by_name['_ad_group_ad'].fields.append(
  _CLICKVIEW.fields_by_name['ad_group_ad'])
_CLICKVIEW.fields_by_name['ad_group_ad'].containing_oneof = _CLICKVIEW.oneofs_by_name['_ad_group_ad']
_CLICKVIEW.oneofs_by_name['_campaign_location_target'].fields.append(
  _CLICKVIEW.fields_by_name['campaign_location_target'])
_CLICKVIEW.fields_by_name['campaign_location_target'].containing_oneof = _CLICKVIEW.oneofs_by_name['_campaign_location_target']
_CLICKVIEW.oneofs_by_name['_user_list'].fields.append(
  _CLICKVIEW.fields_by_name['user_list'])
_CLICKVIEW.fields_by_name['user_list'].containing_oneof = _CLICKVIEW.oneofs_by_name['_user_list']
DESCRIPTOR.message_types_by_name['ClickView'] = _CLICKVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ClickView = _reflection.GeneratedProtocolMessageType('ClickView', (_message.Message,), {
  'DESCRIPTOR' : _CLICKVIEW,
  '__module__' : 'google.ads.googleads.v7.resources.click_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.ClickView)
  })
_sym_db.RegisterMessage(ClickView)


DESCRIPTOR._options = None
_CLICKVIEW.fields_by_name['resource_name']._options = None
_CLICKVIEW.fields_by_name['gclid']._options = None
_CLICKVIEW.fields_by_name['area_of_interest']._options = None
_CLICKVIEW.fields_by_name['location_of_presence']._options = None
_CLICKVIEW.fields_by_name['page_number']._options = None
_CLICKVIEW.fields_by_name['ad_group_ad']._options = None
_CLICKVIEW.fields_by_name['campaign_location_target']._options = None
_CLICKVIEW.fields_by_name['user_list']._options = None
_CLICKVIEW.fields_by_name['keyword']._options = None
_CLICKVIEW.fields_by_name['keyword_info']._options = None
_CLICKVIEW._options = None
# @@protoc_insertion_point(module_scope)
