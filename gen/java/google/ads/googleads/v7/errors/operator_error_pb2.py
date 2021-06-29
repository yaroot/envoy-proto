# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/errors/operator_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/errors/operator_error.proto',
  package='google.ads.googleads.v7.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.errorsB\022OperatorErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Errors\352\002\"Google::Ads::GoogleAds::V7::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/ads/googleads/v7/errors/operator_error.proto\x12\x1egoogle.ads.googleads.v7.errors\x1a\x1cgoogle/api/annotations.proto\"^\n\x11OperatorErrorEnum\"I\n\rOperatorError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1a\n\x16OPERATOR_NOT_SUPPORTED\x10\x02\x42\xed\x01\n\"com.google.ads.googleads.v7.errorsB\x12OperatorErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Errors\xea\x02\"Google::Ads::GoogleAds::V7::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_OPERATORERRORENUM_OPERATORERROR = _descriptor.EnumDescriptor(
  name='OperatorError',
  full_name='google.ads.googleads.v7.errors.OperatorErrorEnum.OperatorError',
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
      name='OPERATOR_NOT_SUPPORTED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=138,
  serialized_end=211,
)
_sym_db.RegisterEnumDescriptor(_OPERATORERRORENUM_OPERATORERROR)


_OPERATORERRORENUM = _descriptor.Descriptor(
  name='OperatorErrorEnum',
  full_name='google.ads.googleads.v7.errors.OperatorErrorEnum',
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
    _OPERATORERRORENUM_OPERATORERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=117,
  serialized_end=211,
)

_OPERATORERRORENUM_OPERATORERROR.containing_type = _OPERATORERRORENUM
DESCRIPTOR.message_types_by_name['OperatorErrorEnum'] = _OPERATORERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OperatorErrorEnum = _reflection.GeneratedProtocolMessageType('OperatorErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _OPERATORERRORENUM,
  '__module__' : 'google.ads.googleads.v7.errors.operator_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.OperatorErrorEnum)
  })
_sym_db.RegisterMessage(OperatorErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
