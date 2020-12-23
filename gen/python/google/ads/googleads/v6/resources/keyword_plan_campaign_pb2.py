# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/resources/keyword_plan_campaign.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.enums import keyword_plan_network_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_keyword__plan__network__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/resources/keyword_plan_campaign.proto',
  package='google.ads.googleads.v6.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v6.resourcesB\030KeywordPlanCampaignProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v6/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V6.Resources\312\002!Google\\Ads\\GoogleAds\\V6\\Resources\352\002%Google::Ads::GoogleAds::V6::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v6/resources/keyword_plan_campaign.proto\x12!google.ads.googleads.v6.resources\x1a\x38google/ads/googleads/v6/enums/keyword_plan_network.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xa0\x05\n\x13KeywordPlanCampaign\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x05\xfa\x41.\n,googleads.googleapis.com/KeywordPlanCampaign\x12\x44\n\x0ckeyword_plan\x18\t \x01(\tB)\xfa\x41&\n$googleads.googleapis.com/KeywordPlanH\x00\x88\x01\x01\x12\x14\n\x02id\x18\n \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x11\n\x04name\x18\x0b \x01(\tH\x02\x88\x01\x01\x12J\n\x12language_constants\x18\x0c \x03(\tB.\xfa\x41+\n)googleads.googleapis.com/LanguageConstant\x12\x66\n\x14keyword_plan_network\x18\x06 \x01(\x0e\x32H.google.ads.googleads.v6.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork\x12\x1b\n\x0e\x63pc_bid_micros\x18\r \x01(\x03H\x03\x88\x01\x01\x12L\n\x0bgeo_targets\x18\x08 \x03(\x0b\x32\x37.google.ads.googleads.v6.resources.KeywordPlanGeoTarget:z\xea\x41w\n,googleads.googleapis.com/KeywordPlanCampaign\x12Gcustomers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}B\x0f\n\r_keyword_planB\x05\n\x03_idB\x07\n\x05_nameB\x11\n\x0f_cpc_bid_micros\"\x81\x01\n\x14KeywordPlanGeoTarget\x12Q\n\x13geo_target_constant\x18\x02 \x01(\tB/\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstantH\x00\x88\x01\x01\x42\x16\n\x14_geo_target_constantB\x85\x02\n%com.google.ads.googleads.v6.resourcesB\x18KeywordPlanCampaignProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v6/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V6.Resources\xca\x02!Google\\Ads\\GoogleAds\\V6\\Resources\xea\x02%Google::Ads::GoogleAds::V6::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_keyword__plan__network__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_KEYWORDPLANCAMPAIGN = _descriptor.Descriptor(
  name='KeywordPlanCampaign',
  full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A.\n,googleads.googleapis.com/KeywordPlanCampaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_plan', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.keyword_plan', index=1,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A&\n$googleads.googleapis.com/KeywordPlan', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.id', index=2,
      number=10, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.name', index=3,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_constants', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.language_constants', index=4,
      number=12, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A+\n)googleads.googleapis.com/LanguageConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_plan_network', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.keyword_plan_network', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_micros', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.cpc_bid_micros', index=6,
      number=13, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_targets', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign.geo_targets', index=7,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352Aw\n,googleads.googleapis.com/KeywordPlanCampaign\022Gcustomers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_keyword_plan', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign._keyword_plan',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign._id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_name', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign._name',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_micros', full_name='google.ads.googleads.v6.resources.KeywordPlanCampaign._cpc_bid_micros',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=249,
  serialized_end=921,
)


_KEYWORDPLANGEOTARGET = _descriptor.Descriptor(
  name='KeywordPlanGeoTarget',
  full_name='google.ads.googleads.v6.resources.KeywordPlanGeoTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='geo_target_constant', full_name='google.ads.googleads.v6.resources.KeywordPlanGeoTarget.geo_target_constant', index=0,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A,\n*googleads.googleapis.com/GeoTargetConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_geo_target_constant', full_name='google.ads.googleads.v6.resources.KeywordPlanGeoTarget._geo_target_constant',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=924,
  serialized_end=1053,
)

_KEYWORDPLANCAMPAIGN.fields_by_name['keyword_plan_network'].enum_type = google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_keyword__plan__network__pb2._KEYWORDPLANNETWORKENUM_KEYWORDPLANNETWORK
_KEYWORDPLANCAMPAIGN.fields_by_name['geo_targets'].message_type = _KEYWORDPLANGEOTARGET
_KEYWORDPLANCAMPAIGN.oneofs_by_name['_keyword_plan'].fields.append(
  _KEYWORDPLANCAMPAIGN.fields_by_name['keyword_plan'])
_KEYWORDPLANCAMPAIGN.fields_by_name['keyword_plan'].containing_oneof = _KEYWORDPLANCAMPAIGN.oneofs_by_name['_keyword_plan']
_KEYWORDPLANCAMPAIGN.oneofs_by_name['_id'].fields.append(
  _KEYWORDPLANCAMPAIGN.fields_by_name['id'])
_KEYWORDPLANCAMPAIGN.fields_by_name['id'].containing_oneof = _KEYWORDPLANCAMPAIGN.oneofs_by_name['_id']
_KEYWORDPLANCAMPAIGN.oneofs_by_name['_name'].fields.append(
  _KEYWORDPLANCAMPAIGN.fields_by_name['name'])
_KEYWORDPLANCAMPAIGN.fields_by_name['name'].containing_oneof = _KEYWORDPLANCAMPAIGN.oneofs_by_name['_name']
_KEYWORDPLANCAMPAIGN.oneofs_by_name['_cpc_bid_micros'].fields.append(
  _KEYWORDPLANCAMPAIGN.fields_by_name['cpc_bid_micros'])
_KEYWORDPLANCAMPAIGN.fields_by_name['cpc_bid_micros'].containing_oneof = _KEYWORDPLANCAMPAIGN.oneofs_by_name['_cpc_bid_micros']
_KEYWORDPLANGEOTARGET.oneofs_by_name['_geo_target_constant'].fields.append(
  _KEYWORDPLANGEOTARGET.fields_by_name['geo_target_constant'])
_KEYWORDPLANGEOTARGET.fields_by_name['geo_target_constant'].containing_oneof = _KEYWORDPLANGEOTARGET.oneofs_by_name['_geo_target_constant']
DESCRIPTOR.message_types_by_name['KeywordPlanCampaign'] = _KEYWORDPLANCAMPAIGN
DESCRIPTOR.message_types_by_name['KeywordPlanGeoTarget'] = _KEYWORDPLANGEOTARGET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanCampaign = _reflection.GeneratedProtocolMessageType('KeywordPlanCampaign', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANCAMPAIGN,
  '__module__' : 'google.ads.googleads.v6.resources.keyword_plan_campaign_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.resources.KeywordPlanCampaign)
  })
_sym_db.RegisterMessage(KeywordPlanCampaign)

KeywordPlanGeoTarget = _reflection.GeneratedProtocolMessageType('KeywordPlanGeoTarget', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANGEOTARGET,
  '__module__' : 'google.ads.googleads.v6.resources.keyword_plan_campaign_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.resources.KeywordPlanGeoTarget)
  })
_sym_db.RegisterMessage(KeywordPlanGeoTarget)


DESCRIPTOR._options = None
_KEYWORDPLANCAMPAIGN.fields_by_name['resource_name']._options = None
_KEYWORDPLANCAMPAIGN.fields_by_name['keyword_plan']._options = None
_KEYWORDPLANCAMPAIGN.fields_by_name['id']._options = None
_KEYWORDPLANCAMPAIGN.fields_by_name['language_constants']._options = None
_KEYWORDPLANCAMPAIGN._options = None
_KEYWORDPLANGEOTARGET.fields_by_name['geo_target_constant']._options = None
# @@protoc_insertion_point(module_scope)
