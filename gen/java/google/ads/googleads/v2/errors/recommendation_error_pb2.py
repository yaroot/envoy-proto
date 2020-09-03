# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/errors/recommendation_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/errors/recommendation_error.proto',
  package='google.ads.googleads.v2.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v2.errorsB\030RecommendationErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v2/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V2.Errors\312\002\036Google\\Ads\\GoogleAds\\V2\\Errors\352\002\"Google::Ads::GoogleAds::V2::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/ads/googleads/v2/errors/recommendation_error.proto\x12\x1egoogle.ads.googleads.v2.errors\x1a\x1cgoogle/api/annotations.proto\"\xda\x03\n\x17RecommendationErrorEnum\"\xbe\x03\n\x13RecommendationError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1b\n\x17\x42UDGET_AMOUNT_TOO_SMALL\x10\x02\x12\x1b\n\x17\x42UDGET_AMOUNT_TOO_LARGE\x10\x03\x12\x19\n\x15INVALID_BUDGET_AMOUNT\x10\x04\x12\x10\n\x0cPOLICY_ERROR\x10\x05\x12\x16\n\x12INVALID_BID_AMOUNT\x10\x06\x12\x19\n\x15\x41\x44GROUP_KEYWORD_LIMIT\x10\x07\x12\"\n\x1eRECOMMENDATION_ALREADY_APPLIED\x10\x08\x12\x1e\n\x1aRECOMMENDATION_INVALIDATED\x10\t\x12\x17\n\x13TOO_MANY_OPERATIONS\x10\n\x12\x11\n\rNO_OPERATIONS\x10\x0b\x12!\n\x1d\x44IFFERENT_TYPES_NOT_SUPPORTED\x10\x0c\x12\x1b\n\x17\x44UPLICATE_RESOURCE_NAME\x10\r\x12$\n RECOMMENDATION_ALREADY_DISMISSED\x10\x0e\x12\x19\n\x15INVALID_APPLY_REQUEST\x10\x0f\x42\xf3\x01\n\"com.google.ads.googleads.v2.errorsB\x18RecommendationErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v2/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V2.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V2\\Errors\xea\x02\"Google::Ads::GoogleAds::V2::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_RECOMMENDATIONERRORENUM_RECOMMENDATIONERROR = _descriptor.EnumDescriptor(
  name='RecommendationError',
  full_name='google.ads.googleads.v2.errors.RecommendationErrorEnum.RecommendationError',
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
      name='BUDGET_AMOUNT_TOO_SMALL', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BUDGET_AMOUNT_TOO_LARGE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_BUDGET_AMOUNT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POLICY_ERROR', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_BID_AMOUNT', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADGROUP_KEYWORD_LIMIT', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RECOMMENDATION_ALREADY_APPLIED', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RECOMMENDATION_INVALIDATED', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_OPERATIONS', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NO_OPERATIONS', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DIFFERENT_TYPES_NOT_SUPPORTED', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_RESOURCE_NAME', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RECOMMENDATION_ALREADY_DISMISSED', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_APPLY_REQUEST', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=152,
  serialized_end=598,
)
_sym_db.RegisterEnumDescriptor(_RECOMMENDATIONERRORENUM_RECOMMENDATIONERROR)


_RECOMMENDATIONERRORENUM = _descriptor.Descriptor(
  name='RecommendationErrorEnum',
  full_name='google.ads.googleads.v2.errors.RecommendationErrorEnum',
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
    _RECOMMENDATIONERRORENUM_RECOMMENDATIONERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=598,
)

_RECOMMENDATIONERRORENUM_RECOMMENDATIONERROR.containing_type = _RECOMMENDATIONERRORENUM
DESCRIPTOR.message_types_by_name['RecommendationErrorEnum'] = _RECOMMENDATIONERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RecommendationErrorEnum = _reflection.GeneratedProtocolMessageType('RecommendationErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _RECOMMENDATIONERRORENUM,
  '__module__' : 'google.ads.googleads.v2.errors.recommendation_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.RecommendationErrorEnum)
  })
_sym_db.RegisterMessage(RecommendationErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
