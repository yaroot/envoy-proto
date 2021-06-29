# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/keyword_plan_ad_group_keyword.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.enums import keyword_match_type_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_keyword__match__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/keyword_plan_ad_group_keyword.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\036KeywordPlanAdGroupKeywordProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v7/resources/keyword_plan_ad_group_keyword.proto\x12!google.ads.googleads.v7.resources\x1a\x36google/ads/googleads/v7/enums/keyword_match_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xdc\x04\n\x19KeywordPlanAdGroupKeyword\x12Q\n\rresource_name\x18\x01 \x01(\tB:\xe0\x41\x05\xfa\x41\x34\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword\x12T\n\x15keyword_plan_ad_group\x18\x08 \x01(\tB0\xfa\x41-\n+googleads.googleapis.com/KeywordPlanAdGroupH\x00\x88\x01\x01\x12\x14\n\x02id\x18\t \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x11\n\x04text\x18\n \x01(\tH\x02\x88\x01\x01\x12X\n\nmatch_type\x18\x05 \x01(\x0e\x32\x44.google.ads.googleads.v7.enums.KeywordMatchTypeEnum.KeywordMatchType\x12\x1b\n\x0e\x63pc_bid_micros\x18\x0b \x01(\x03H\x03\x88\x01\x01\x12\x1a\n\x08negative\x18\x0c \x01(\x08\x42\x03\xe0\x41\x05H\x04\x88\x01\x01:\x8f\x01\xea\x41\x8b\x01\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword\x12Ucustomers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}B\x18\n\x16_keyword_plan_ad_groupB\x05\n\x03_idB\x07\n\x05_textB\x11\n\x0f_cpc_bid_microsB\x0b\n\t_negativeB\x8b\x02\n%com.google.ads.googleads.v7.resourcesB\x1eKeywordPlanAdGroupKeywordProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_keyword__match__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_KEYWORDPLANADGROUPKEYWORD = _descriptor.Descriptor(
  name='KeywordPlanAdGroupKeyword',
  full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A4\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_plan_ad_group', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.keyword_plan_ad_group', index=1,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A-\n+googleads.googleapis.com/KeywordPlanAdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.id', index=2,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.text', index=3,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='match_type', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.match_type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cpc_bid_micros', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.cpc_bid_micros', index=5,
      number=11, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='negative', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword.negative', index=6,
      number=12, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\213\001\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword\022Ucustomers/{customer_id}/keywordPlanAdGroupKeywords/{keyword_plan_ad_group_keyword_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_keyword_plan_ad_group', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword._keyword_plan_ad_group',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword._id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_text', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword._text',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_cpc_bid_micros', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword._cpc_bid_micros',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_negative', full_name='google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword._negative',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=255,
  serialized_end=859,
)

_KEYWORDPLANADGROUPKEYWORD.fields_by_name['match_type'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_keyword__match__type__pb2._KEYWORDMATCHTYPEENUM_KEYWORDMATCHTYPE
_KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_keyword_plan_ad_group'].fields.append(
  _KEYWORDPLANADGROUPKEYWORD.fields_by_name['keyword_plan_ad_group'])
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['keyword_plan_ad_group'].containing_oneof = _KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_keyword_plan_ad_group']
_KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_id'].fields.append(
  _KEYWORDPLANADGROUPKEYWORD.fields_by_name['id'])
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['id'].containing_oneof = _KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_id']
_KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_text'].fields.append(
  _KEYWORDPLANADGROUPKEYWORD.fields_by_name['text'])
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['text'].containing_oneof = _KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_text']
_KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_cpc_bid_micros'].fields.append(
  _KEYWORDPLANADGROUPKEYWORD.fields_by_name['cpc_bid_micros'])
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['cpc_bid_micros'].containing_oneof = _KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_cpc_bid_micros']
_KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_negative'].fields.append(
  _KEYWORDPLANADGROUPKEYWORD.fields_by_name['negative'])
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['negative'].containing_oneof = _KEYWORDPLANADGROUPKEYWORD.oneofs_by_name['_negative']
DESCRIPTOR.message_types_by_name['KeywordPlanAdGroupKeyword'] = _KEYWORDPLANADGROUPKEYWORD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanAdGroupKeyword = _reflection.GeneratedProtocolMessageType('KeywordPlanAdGroupKeyword', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANADGROUPKEYWORD,
  '__module__' : 'google.ads.googleads.v7.resources.keyword_plan_ad_group_keyword_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.KeywordPlanAdGroupKeyword)
  })
_sym_db.RegisterMessage(KeywordPlanAdGroupKeyword)


DESCRIPTOR._options = None
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['resource_name']._options = None
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['keyword_plan_ad_group']._options = None
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['id']._options = None
_KEYWORDPLANADGROUPKEYWORD.fields_by_name['negative']._options = None
_KEYWORDPLANADGROUPKEYWORD._options = None
# @@protoc_insertion_point(module_scope)
