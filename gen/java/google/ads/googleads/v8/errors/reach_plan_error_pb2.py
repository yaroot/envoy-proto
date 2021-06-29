# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/errors/reach_plan_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/errors/reach_plan_error.proto',
  package='google.ads.googleads.v8.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v8.errorsB\023ReachPlanErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V8.Errors\312\002\036Google\\Ads\\GoogleAds\\V8\\Errors\352\002\"Google::Ads::GoogleAds::V8::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v8/errors/reach_plan_error.proto\x12\x1egoogle.ads.googleads.v8.errors\x1a\x1cgoogle/api/annotations.proto\"g\n\x12ReachPlanErrorEnum\"Q\n\x0eReachPlanError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12!\n\x1dNOT_FORECASTABLE_MISSING_RATE\x10\x02\x42\xee\x01\n\"com.google.ads.googleads.v8.errorsB\x13ReachPlanErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V8.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V8\\Errors\xea\x02\"Google::Ads::GoogleAds::V8::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_REACHPLANERRORENUM_REACHPLANERROR = _descriptor.EnumDescriptor(
  name='ReachPlanError',
  full_name='google.ads.googleads.v8.errors.ReachPlanErrorEnum.ReachPlanError',
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
      name='NOT_FORECASTABLE_MISSING_RATE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=141,
  serialized_end=222,
)
_sym_db.RegisterEnumDescriptor(_REACHPLANERRORENUM_REACHPLANERROR)


_REACHPLANERRORENUM = _descriptor.Descriptor(
  name='ReachPlanErrorEnum',
  full_name='google.ads.googleads.v8.errors.ReachPlanErrorEnum',
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
    _REACHPLANERRORENUM_REACHPLANERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=119,
  serialized_end=222,
)

_REACHPLANERRORENUM_REACHPLANERROR.containing_type = _REACHPLANERRORENUM
DESCRIPTOR.message_types_by_name['ReachPlanErrorEnum'] = _REACHPLANERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ReachPlanErrorEnum = _reflection.GeneratedProtocolMessageType('ReachPlanErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _REACHPLANERRORENUM,
  '__module__' : 'google.ads.googleads.v8.errors.reach_plan_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.errors.ReachPlanErrorEnum)
  })
_sym_db.RegisterMessage(ReachPlanErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
