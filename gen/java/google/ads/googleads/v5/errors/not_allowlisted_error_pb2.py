# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/errors/not_allowlisted_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/errors/not_allowlisted_error.proto',
  package='google.ads.googleads.v5.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v5.errorsB\030NotAllowlistedErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v5/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V5.Errors\312\002\036Google\\Ads\\GoogleAds\\V5\\Errors\352\002\"Google::Ads::GoogleAds::V5::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v5/errors/not_allowlisted_error.proto\x12\x1egoogle.ads.googleads.v5.errors\x1a\x1cgoogle/api/annotations.proto\"}\n\x17NotAllowlistedErrorEnum\"b\n\x13NotAllowlistedError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12-\n)CUSTOMER_NOT_ALLOWLISTED_FOR_THIS_FEATURE\x10\x02\x42\xf3\x01\n\"com.google.ads.googleads.v5.errorsB\x18NotAllowlistedErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v5/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V5.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V5\\Errors\xea\x02\"Google::Ads::GoogleAds::V5::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_NOTALLOWLISTEDERRORENUM_NOTALLOWLISTEDERROR = _descriptor.EnumDescriptor(
  name='NotAllowlistedError',
  full_name='google.ads.googleads.v5.errors.NotAllowlistedErrorEnum.NotAllowlistedError',
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
      name='CUSTOMER_NOT_ALLOWLISTED_FOR_THIS_FEATURE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=151,
  serialized_end=249,
)
_sym_db.RegisterEnumDescriptor(_NOTALLOWLISTEDERRORENUM_NOTALLOWLISTEDERROR)


_NOTALLOWLISTEDERRORENUM = _descriptor.Descriptor(
  name='NotAllowlistedErrorEnum',
  full_name='google.ads.googleads.v5.errors.NotAllowlistedErrorEnum',
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
    _NOTALLOWLISTEDERRORENUM_NOTALLOWLISTEDERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=249,
)

_NOTALLOWLISTEDERRORENUM_NOTALLOWLISTEDERROR.containing_type = _NOTALLOWLISTEDERRORENUM
DESCRIPTOR.message_types_by_name['NotAllowlistedErrorEnum'] = _NOTALLOWLISTEDERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

NotAllowlistedErrorEnum = _reflection.GeneratedProtocolMessageType('NotAllowlistedErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _NOTALLOWLISTEDERRORENUM,
  '__module__' : 'google.ads.googleads.v5.errors.not_allowlisted_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.errors.NotAllowlistedErrorEnum)
  })
_sym_db.RegisterMessage(NotAllowlistedErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
