# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/errors/custom_audience_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/errors/custom_audience_error.proto',
  package='google.ads.googleads.v6.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v6.errorsB\030CustomAudienceErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6.Errors\312\002\036Google\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::Ads::GoogleAds::V6::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v6/errors/custom_audience_error.proto\x12\x1egoogle.ads.googleads.v6.errors\x1a\x1cgoogle/api/annotations.proto\"\xc5\x02\n\x17\x43ustomAudienceErrorEnum\"\xa9\x02\n\x13\x43ustomAudienceError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x15\n\x11NAME_ALREADY_USED\x10\x02\x12\x1e\n\x1a\x43\x41NNOT_REMOVE_WHILE_IN_USE\x10\x03\x12\x1c\n\x18RESOURCE_ALREADY_REMOVED\x10\x04\x12-\n)MEMBER_TYPE_AND_PARAMETER_ALREADY_EXISTED\x10\x05\x12\x17\n\x13INVALID_MEMBER_TYPE\x10\x06\x12(\n$MEMBER_TYPE_AND_VALUE_DOES_NOT_MATCH\x10\x07\x12\x14\n\x10POLICY_VIOLATION\x10\x08\x12\x17\n\x13INVALID_TYPE_CHANGE\x10\tB\xf3\x01\n\"com.google.ads.googleads.v6.errorsB\x18\x43ustomAudienceErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V6.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V6\\Errors\xea\x02\"Google::Ads::GoogleAds::V6::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CUSTOMAUDIENCEERRORENUM_CUSTOMAUDIENCEERROR = _descriptor.EnumDescriptor(
  name='CustomAudienceError',
  full_name='google.ads.googleads.v6.errors.CustomAudienceErrorEnum.CustomAudienceError',
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
      name='NAME_ALREADY_USED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_REMOVE_WHILE_IN_USE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESOURCE_ALREADY_REMOVED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEMBER_TYPE_AND_PARAMETER_ALREADY_EXISTED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_MEMBER_TYPE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEMBER_TYPE_AND_VALUE_DOES_NOT_MATCH', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POLICY_VIOLATION', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TYPE_CHANGE', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=153,
  serialized_end=450,
)
_sym_db.RegisterEnumDescriptor(_CUSTOMAUDIENCEERRORENUM_CUSTOMAUDIENCEERROR)


_CUSTOMAUDIENCEERRORENUM = _descriptor.Descriptor(
  name='CustomAudienceErrorEnum',
  full_name='google.ads.googleads.v6.errors.CustomAudienceErrorEnum',
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
    _CUSTOMAUDIENCEERRORENUM_CUSTOMAUDIENCEERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=125,
  serialized_end=450,
)

_CUSTOMAUDIENCEERRORENUM_CUSTOMAUDIENCEERROR.containing_type = _CUSTOMAUDIENCEERRORENUM
DESCRIPTOR.message_types_by_name['CustomAudienceErrorEnum'] = _CUSTOMAUDIENCEERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CustomAudienceErrorEnum = _reflection.GeneratedProtocolMessageType('CustomAudienceErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMAUDIENCEERRORENUM,
  '__module__' : 'google.ads.googleads.v6.errors.custom_audience_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.errors.CustomAudienceErrorEnum)
  })
_sym_db.RegisterMessage(CustomAudienceErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
