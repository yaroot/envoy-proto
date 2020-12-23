# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/errors/keyword_plan_ad_group_keyword_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/errors/keyword_plan_ad_group_keyword_error.proto',
  package='google.ads.googleads.v6.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v6.errorsB#KeywordPlanAdGroupKeywordErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6.Errors\312\002\036Google\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::Ads::GoogleAds::V6::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nHgoogle/ads/googleads/v6/errors/keyword_plan_ad_group_keyword_error.proto\x12\x1egoogle.ads.googleads.v6.errors\x1a\x1cgoogle/api/annotations.proto\"\xb2\x02\n\"KeywordPlanAdGroupKeywordErrorEnum\"\x8b\x02\n\x1eKeywordPlanAdGroupKeywordError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1e\n\x1aINVALID_KEYWORD_MATCH_TYPE\x10\x02\x12\x15\n\x11\x44UPLICATE_KEYWORD\x10\x03\x12\x19\n\x15KEYWORD_TEXT_TOO_LONG\x10\x04\x12\x1d\n\x19KEYWORD_HAS_INVALID_CHARS\x10\x05\x12\x1e\n\x1aKEYWORD_HAS_TOO_MANY_WORDS\x10\x06\x12\x18\n\x14INVALID_KEYWORD_TEXT\x10\x07\x12 \n\x1cNEGATIVE_KEYWORD_HAS_CPC_BID\x10\x08\x42\xfe\x01\n\"com.google.ads.googleads.v6.errorsB#KeywordPlanAdGroupKeywordErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V6.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V6\\Errors\xea\x02\"Google::Ads::GoogleAds::V6::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_KEYWORDPLANADGROUPKEYWORDERRORENUM_KEYWORDPLANADGROUPKEYWORDERROR = _descriptor.EnumDescriptor(
  name='KeywordPlanAdGroupKeywordError',
  full_name='google.ads.googleads.v6.errors.KeywordPlanAdGroupKeywordErrorEnum.KeywordPlanAdGroupKeywordError',
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
      name='INVALID_KEYWORD_MATCH_TYPE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_KEYWORD', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_TEXT_TOO_LONG', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_HAS_INVALID_CHARS', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_HAS_TOO_MANY_WORDS', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_KEYWORD_TEXT', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NEGATIVE_KEYWORD_HAS_CPC_BID', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=178,
  serialized_end=445,
)
_sym_db.RegisterEnumDescriptor(_KEYWORDPLANADGROUPKEYWORDERRORENUM_KEYWORDPLANADGROUPKEYWORDERROR)


_KEYWORDPLANADGROUPKEYWORDERRORENUM = _descriptor.Descriptor(
  name='KeywordPlanAdGroupKeywordErrorEnum',
  full_name='google.ads.googleads.v6.errors.KeywordPlanAdGroupKeywordErrorEnum',
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
    _KEYWORDPLANADGROUPKEYWORDERRORENUM_KEYWORDPLANADGROUPKEYWORDERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=139,
  serialized_end=445,
)

_KEYWORDPLANADGROUPKEYWORDERRORENUM_KEYWORDPLANADGROUPKEYWORDERROR.containing_type = _KEYWORDPLANADGROUPKEYWORDERRORENUM
DESCRIPTOR.message_types_by_name['KeywordPlanAdGroupKeywordErrorEnum'] = _KEYWORDPLANADGROUPKEYWORDERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanAdGroupKeywordErrorEnum = _reflection.GeneratedProtocolMessageType('KeywordPlanAdGroupKeywordErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANADGROUPKEYWORDERRORENUM,
  '__module__' : 'google.ads.googleads.v6.errors.keyword_plan_ad_group_keyword_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.errors.KeywordPlanAdGroupKeywordErrorEnum)
  })
_sym_db.RegisterMessage(KeywordPlanAdGroupKeywordErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
