# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/errors/keyword_plan_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/errors/keyword_plan_error.proto',
  package='google.ads.googleads.v7.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.errorsB\025KeywordPlanErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Errors\352\002\"Google::Ads::GoogleAds::V7::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/ads/googleads/v7/errors/keyword_plan_error.proto\x12\x1egoogle.ads.googleads.v7.errors\x1a\x1cgoogle/api/annotations.proto\"\xc8\x03\n\x14KeywordPlanErrorEnum\"\xaf\x03\n\x10KeywordPlanError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1f\n\x1b\x42ID_MULTIPLIER_OUT_OF_RANGE\x10\x02\x12\x10\n\x0c\x42ID_TOO_HIGH\x10\x03\x12\x0f\n\x0b\x42ID_TOO_LOW\x10\x04\x12\"\n\x1e\x42ID_TOO_MANY_FRACTIONAL_DIGITS\x10\x05\x12\x18\n\x14\x44\x41ILY_BUDGET_TOO_LOW\x10\x06\x12+\n\'DAILY_BUDGET_TOO_MANY_FRACTIONAL_DIGITS\x10\x07\x12\x11\n\rINVALID_VALUE\x10\x08\x12 \n\x1cKEYWORD_PLAN_HAS_NO_KEYWORDS\x10\t\x12\x1c\n\x18KEYWORD_PLAN_NOT_ENABLED\x10\n\x12\x1a\n\x16KEYWORD_PLAN_NOT_FOUND\x10\x0b\x12\x0f\n\x0bMISSING_BID\x10\r\x12\x1b\n\x17MISSING_FORECAST_PERIOD\x10\x0e\x12\x1f\n\x1bINVALID_FORECAST_DATE_RANGE\x10\x0f\x12\x10\n\x0cINVALID_NAME\x10\x10\x42\xf0\x01\n\"com.google.ads.googleads.v7.errorsB\x15KeywordPlanErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Errors\xea\x02\"Google::Ads::GoogleAds::V7::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_KEYWORDPLANERRORENUM_KEYWORDPLANERROR = _descriptor.EnumDescriptor(
  name='KeywordPlanError',
  full_name='google.ads.googleads.v7.errors.KeywordPlanErrorEnum.KeywordPlanError',
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
      name='BID_MULTIPLIER_OUT_OF_RANGE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_TOO_HIGH', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_TOO_LOW', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_TOO_MANY_FRACTIONAL_DIGITS', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DAILY_BUDGET_TOO_LOW', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DAILY_BUDGET_TOO_MANY_FRACTIONAL_DIGITS', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_VALUE', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_PLAN_HAS_NO_KEYWORDS', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_PLAN_NOT_ENABLED', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_PLAN_NOT_FOUND', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_BID', index=12, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_FORECAST_PERIOD', index=13, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FORECAST_DATE_RANGE', index=14, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_NAME', index=15, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=147,
  serialized_end=578,
)
_sym_db.RegisterEnumDescriptor(_KEYWORDPLANERRORENUM_KEYWORDPLANERROR)


_KEYWORDPLANERRORENUM = _descriptor.Descriptor(
  name='KeywordPlanErrorEnum',
  full_name='google.ads.googleads.v7.errors.KeywordPlanErrorEnum',
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
    _KEYWORDPLANERRORENUM_KEYWORDPLANERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=122,
  serialized_end=578,
)

_KEYWORDPLANERRORENUM_KEYWORDPLANERROR.containing_type = _KEYWORDPLANERRORENUM
DESCRIPTOR.message_types_by_name['KeywordPlanErrorEnum'] = _KEYWORDPLANERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanErrorEnum = _reflection.GeneratedProtocolMessageType('KeywordPlanErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANERRORENUM,
  '__module__' : 'google.ads.googleads.v7.errors.keyword_plan_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.KeywordPlanErrorEnum)
  })
_sym_db.RegisterMessage(KeywordPlanErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)