# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/errors/keyword_plan_campaign_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/errors/keyword_plan_campaign_error.proto',
  package='google.ads.googleads.v2.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v2.errorsB\035KeywordPlanCampaignErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v2/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V2.Errors\312\002\036Google\\Ads\\GoogleAds\\V2\\Errors\352\002\"Google::Ads::GoogleAds::V2::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@google/ads/googleads/v2/errors/keyword_plan_campaign_error.proto\x12\x1egoogle.ads.googleads.v2.errors\x1a\x1cgoogle/api/annotations.proto\"\xbf\x01\n\x1cKeywordPlanCampaignErrorEnum\"\x9e\x01\n\x18KeywordPlanCampaignError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x10\n\x0cINVALID_NAME\x10\x02\x12\x15\n\x11INVALID_LANGUAGES\x10\x03\x12\x10\n\x0cINVALID_GEOS\x10\x04\x12\x12\n\x0e\x44UPLICATE_NAME\x10\x05\x12\x15\n\x11MAX_GEOS_EXCEEDED\x10\x06\x42\xf8\x01\n\"com.google.ads.googleads.v2.errorsB\x1dKeywordPlanCampaignErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v2/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V2.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V2\\Errors\xea\x02\"Google::Ads::GoogleAds::V2::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_KEYWORDPLANCAMPAIGNERRORENUM_KEYWORDPLANCAMPAIGNERROR = _descriptor.EnumDescriptor(
  name='KeywordPlanCampaignError',
  full_name='google.ads.googleads.v2.errors.KeywordPlanCampaignErrorEnum.KeywordPlanCampaignError',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_NAME', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_LANGUAGES', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_GEOS', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_NAME', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MAX_GEOS_EXCEEDED', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=164,
  serialized_end=322,
)
_sym_db.RegisterEnumDescriptor(_KEYWORDPLANCAMPAIGNERRORENUM_KEYWORDPLANCAMPAIGNERROR)


_KEYWORDPLANCAMPAIGNERRORENUM = _descriptor.Descriptor(
  name='KeywordPlanCampaignErrorEnum',
  full_name='google.ads.googleads.v2.errors.KeywordPlanCampaignErrorEnum',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _KEYWORDPLANCAMPAIGNERRORENUM_KEYWORDPLANCAMPAIGNERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=131,
  serialized_end=322,
)

_KEYWORDPLANCAMPAIGNERRORENUM_KEYWORDPLANCAMPAIGNERROR.containing_type = _KEYWORDPLANCAMPAIGNERRORENUM
DESCRIPTOR.message_types_by_name['KeywordPlanCampaignErrorEnum'] = _KEYWORDPLANCAMPAIGNERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanCampaignErrorEnum = _reflection.GeneratedProtocolMessageType('KeywordPlanCampaignErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANCAMPAIGNERRORENUM,
  '__module__' : 'google.ads.googleads.v2.errors.keyword_plan_campaign_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.KeywordPlanCampaignErrorEnum)
  })
_sym_db.RegisterMessage(KeywordPlanCampaignErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
