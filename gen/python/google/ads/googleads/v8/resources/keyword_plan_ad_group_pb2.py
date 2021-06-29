# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/keyword_plan_ad_group.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/keyword_plan_ad_group.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\027KeywordPlanAdGroupProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v8/resources/keyword_plan_ad_group.proto\x12!google.ads.googleads.v8.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xb4\x03\n\x12KeywordPlanAdGroup\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x05\xfa\x41-\n+googleads.googleapis.com/KeywordPlanAdGroup\x12U\n\x15keyword_plan_campaign\x18\x06 \x01(\tB1\xfa\x41.\n,googleads.googleapis.com/KeywordPlanCampaignH\x00\x88\x01\x01\x12\x14\n\x02id\x18\x07 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x11\n\x04name\x18\x08 \x01(\tH\x02\x88\x01\x01\x12\x1b\n\x0e\x63pc_bid_micros\x18\t \x01(\x03H\x03\x88\x01\x01:x\xea\x41u\n+googleads.googleapis.com/KeywordPlanAdGroup\x12\x46\x63ustomers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}B\x18\n\x16_keyword_plan_campaignB\x05\n\x03_idB\x07\n\x05_nameB\x11\n\x0f_cpc_bid_microsB\x84\x02\n%com.google.ads.googleads.v8.resourcesB\x17KeywordPlanAdGroupProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_KEYWORDPLANADGROUP = _descriptor.Descriptor(
  name='KeywordPlanAdGroup',
  full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A-\n+googleads.googleapis.com/KeywordPlanAdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_plan_campaign', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup.keyword_plan_campaign', index=1,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A.\n,googleads.googleapis.com/KeywordPlanCampaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup.id', index=2,
      number=7, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup.name', index=3,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_micros', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup.cpc_bid_micros', index=4,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352Au\n+googleads.googleapis.com/KeywordPlanAdGroup\022Fcustomers/{customer_id}/keywordPlanAdGroups/{keyword_plan_ad_group_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_keyword_plan_campaign', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup._keyword_plan_campaign',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup._id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_name', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup._name',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_micros', full_name='google.ads.googleads.v8.resources.KeywordPlanAdGroup._cpc_bid_micros',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=191,
  serialized_end=627,
)

_KEYWORDPLANADGROUP.oneofs_by_name['_keyword_plan_campaign'].fields.append(
  _KEYWORDPLANADGROUP.fields_by_name['keyword_plan_campaign'])
_KEYWORDPLANADGROUP.fields_by_name['keyword_plan_campaign'].containing_oneof = _KEYWORDPLANADGROUP.oneofs_by_name['_keyword_plan_campaign']
_KEYWORDPLANADGROUP.oneofs_by_name['_id'].fields.append(
  _KEYWORDPLANADGROUP.fields_by_name['id'])
_KEYWORDPLANADGROUP.fields_by_name['id'].containing_oneof = _KEYWORDPLANADGROUP.oneofs_by_name['_id']
_KEYWORDPLANADGROUP.oneofs_by_name['_name'].fields.append(
  _KEYWORDPLANADGROUP.fields_by_name['name'])
_KEYWORDPLANADGROUP.fields_by_name['name'].containing_oneof = _KEYWORDPLANADGROUP.oneofs_by_name['_name']
_KEYWORDPLANADGROUP.oneofs_by_name['_cpc_bid_micros'].fields.append(
  _KEYWORDPLANADGROUP.fields_by_name['cpc_bid_micros'])
_KEYWORDPLANADGROUP.fields_by_name['cpc_bid_micros'].containing_oneof = _KEYWORDPLANADGROUP.oneofs_by_name['_cpc_bid_micros']
DESCRIPTOR.message_types_by_name['KeywordPlanAdGroup'] = _KEYWORDPLANADGROUP
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanAdGroup = _reflection.GeneratedProtocolMessageType('KeywordPlanAdGroup', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANADGROUP,
  '__module__' : 'google.ads.googleads.v8.resources.keyword_plan_ad_group_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.KeywordPlanAdGroup)
  })
_sym_db.RegisterMessage(KeywordPlanAdGroup)


DESCRIPTOR._options = None
_KEYWORDPLANADGROUP.fields_by_name['resource_name']._options = None
_KEYWORDPLANADGROUP.fields_by_name['keyword_plan_campaign']._options = None
_KEYWORDPLANADGROUP.fields_by_name['id']._options = None
_KEYWORDPLANADGROUP._options = None
# @@protoc_insertion_point(module_scope)
