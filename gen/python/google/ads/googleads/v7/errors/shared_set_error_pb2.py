# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/errors/shared_set_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/errors/shared_set_error.proto',
  package='google.ads.googleads.v7.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.errorsB\023SharedSetErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Errors\352\002\"Google::Ads::GoogleAds::V7::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v7/errors/shared_set_error.proto\x12\x1egoogle.ads.googleads.v7.errors\x1a\x1cgoogle/api/annotations.proto\"\xbc\x01\n\x12SharedSetErrorEnum\"\xa5\x01\n\x0eSharedSetError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x32\n.CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE\x10\x02\x12\x12\n\x0e\x44UPLICATE_NAME\x10\x03\x12\x16\n\x12SHARED_SET_REMOVED\x10\x04\x12\x15\n\x11SHARED_SET_IN_USE\x10\x05\x42\xee\x01\n\"com.google.ads.googleads.v7.errorsB\x13SharedSetErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Errors\xea\x02\"Google::Ads::GoogleAds::V7::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_SHAREDSETERRORENUM_SHAREDSETERROR = _descriptor.EnumDescriptor(
  name='SharedSetError',
  full_name='google.ads.googleads.v7.errors.SharedSetErrorEnum.SharedSetError',
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
      name='CUSTOMER_CANNOT_CREATE_SHARED_SET_OF_THIS_TYPE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_NAME', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SHARED_SET_REMOVED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SHARED_SET_IN_USE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=143,
  serialized_end=308,
)
_sym_db.RegisterEnumDescriptor(_SHAREDSETERRORENUM_SHAREDSETERROR)


_SHAREDSETERRORENUM = _descriptor.Descriptor(
  name='SharedSetErrorEnum',
  full_name='google.ads.googleads.v7.errors.SharedSetErrorEnum',
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
    _SHAREDSETERRORENUM_SHAREDSETERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=120,
  serialized_end=308,
)

_SHAREDSETERRORENUM_SHAREDSETERROR.containing_type = _SHAREDSETERRORENUM
DESCRIPTOR.message_types_by_name['SharedSetErrorEnum'] = _SHAREDSETERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SharedSetErrorEnum = _reflection.GeneratedProtocolMessageType('SharedSetErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _SHAREDSETERRORENUM,
  '__module__' : 'google.ads.googleads.v7.errors.shared_set_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.SharedSetErrorEnum)
  })
_sym_db.RegisterMessage(SharedSetErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
