# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/resources/keyword_plan_campaign_keyword.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.enums import keyword_match_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_keyword__match__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/resources/keyword_plan_campaign_keyword.proto',
  package='google.ads.googleads.v4.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v4.resourcesB\037KeywordPlanCampaignKeywordProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ads::GoogleAds::V4::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v4/resources/keyword_plan_campaign_keyword.proto\x12!google.ads.googleads.v4.resources\x1a\x36google/ads/googleads/v4/enums/keyword_match_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xd5\x04\n\x1aKeywordPlanCampaignKeyword\x12R\n\rresource_name\x18\x01 \x01(\tB;\xe0\x41\x05\xfa\x41\x35\n3googleads.googleapis.com/KeywordPlanCampaignKeyword\x12n\n\x15keyword_plan_campaign\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB1\xfa\x41.\n,googleads.googleapis.com/KeywordPlanCampaign\x12,\n\x02id\x18\x03 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12*\n\x04text\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12X\n\nmatch_type\x18\x05 \x01(\x0e\x32\x44.google.ads.googleads.v4.enums.KeywordMatchTypeEnum.KeywordMatchType\x12\x31\n\x08negative\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.BoolValueB\x03\xe0\x41\x05:\x8b\x01\xea\x41\x87\x01\n3googleads.googleapis.com/KeywordPlanCampaignKeyword\x12Pcustomers/{customer}/keywordPlanCampaignKeywords/{keyword_plan_campaign_keyword}B\x8c\x02\n%com.google.ads.googleads.v4.resourcesB\x1fKeywordPlanCampaignKeywordProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V4.Resources\xca\x02!Google\\Ads\\GoogleAds\\V4\\Resources\xea\x02%Google::Ads::GoogleAds::V4::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_keyword__match__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_KEYWORDPLANCAMPAIGNKEYWORD = _descriptor.Descriptor(
  name='KeywordPlanCampaignKeyword',
  full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A5\n3googleads.googleapis.com/KeywordPlanCampaignKeyword', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword_plan_campaign', full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword.keyword_plan_campaign', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A.\n,googleads.googleapis.com/KeywordPlanCampaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword.id', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text', full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword.text', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='match_type', full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword.match_type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='negative', full_name='google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword.negative', index=5,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\207\001\n3googleads.googleapis.com/KeywordPlanCampaignKeyword\022Pcustomers/{customer}/keywordPlanCampaignKeywords/{keyword_plan_campaign_keyword}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=287,
  serialized_end=884,
)

_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['keyword_plan_campaign'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['text'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['match_type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_keyword__match__type__pb2._KEYWORDMATCHTYPEENUM_KEYWORDMATCHTYPE
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['negative'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
DESCRIPTOR.message_types_by_name['KeywordPlanCampaignKeyword'] = _KEYWORDPLANCAMPAIGNKEYWORD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanCampaignKeyword = _reflection.GeneratedProtocolMessageType('KeywordPlanCampaignKeyword', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANCAMPAIGNKEYWORD,
  '__module__' : 'google.ads.googleads.v4.resources.keyword_plan_campaign_keyword_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword)
  })
_sym_db.RegisterMessage(KeywordPlanCampaignKeyword)


DESCRIPTOR._options = None
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['resource_name']._options = None
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['keyword_plan_campaign']._options = None
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['id']._options = None
_KEYWORDPLANCAMPAIGNKEYWORD.fields_by_name['negative']._options = None
_KEYWORDPLANCAMPAIGNKEYWORD._options = None
# @@protoc_insertion_point(module_scope)
