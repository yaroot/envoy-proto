# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/errors/time_zone_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/errors/time_zone_error.proto',
  package='google.ads.googleads.v7.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.errorsB\022TimeZoneErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Errors\352\002\"Google::Ads::GoogleAds::V7::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v7/errors/time_zone_error.proto\x12\x1egoogle.ads.googleads.v7.errors\x1a\x1cgoogle/api/annotations.proto\"Y\n\x11TimeZoneErrorEnum\"D\n\rTimeZoneError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x15\n\x11INVALID_TIME_ZONE\x10\x05\x42\xed\x01\n\"com.google.ads.googleads.v7.errorsB\x12TimeZoneErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Errors\xea\x02\"Google::Ads::GoogleAds::V7::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_TIMEZONEERRORENUM_TIMEZONEERROR = _descriptor.EnumDescriptor(
  name='TimeZoneError',
  full_name='google.ads.googleads.v7.errors.TimeZoneErrorEnum.TimeZoneError',
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
      name='INVALID_TIME_ZONE', index=2, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=139,
  serialized_end=207,
)
_sym_db.RegisterEnumDescriptor(_TIMEZONEERRORENUM_TIMEZONEERROR)


_TIMEZONEERRORENUM = _descriptor.Descriptor(
  name='TimeZoneErrorEnum',
  full_name='google.ads.googleads.v7.errors.TimeZoneErrorEnum',
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
    _TIMEZONEERRORENUM_TIMEZONEERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=207,
)

_TIMEZONEERRORENUM_TIMEZONEERROR.containing_type = _TIMEZONEERRORENUM
DESCRIPTOR.message_types_by_name['TimeZoneErrorEnum'] = _TIMEZONEERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TimeZoneErrorEnum = _reflection.GeneratedProtocolMessageType('TimeZoneErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _TIMEZONEERRORENUM,
  '__module__' : 'google.ads.googleads.v7.errors.time_zone_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.TimeZoneErrorEnum)
  })
_sym_db.RegisterMessage(TimeZoneErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
