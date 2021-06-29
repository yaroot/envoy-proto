# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/errors/field_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/errors/field_error.proto',
  package='google.ads.googleads.v7.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.errorsB\017FieldErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Errors\352\002\"Google::Ads::GoogleAds::V7::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0google/ads/googleads/v7/errors/field_error.proto\x12\x1egoogle.ads.googleads.v7.errors\x1a\x1cgoogle/api/annotations.proto\"\xd8\x01\n\x0e\x46ieldErrorEnum\"\xc5\x01\n\nFieldError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08REQUIRED\x10\x02\x12\x13\n\x0fIMMUTABLE_FIELD\x10\x03\x12\x11\n\rINVALID_VALUE\x10\x04\x12\x17\n\x13VALUE_MUST_BE_UNSET\x10\x05\x12\x1a\n\x16REQUIRED_NONEMPTY_LIST\x10\x06\x12\x1b\n\x17\x46IELD_CANNOT_BE_CLEARED\x10\x07\x12\x11\n\rBLOCKED_VALUE\x10\tB\xea\x01\n\"com.google.ads.googleads.v7.errorsB\x0f\x46ieldErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Errors\xea\x02\"Google::Ads::GoogleAds::V7::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FIELDERRORENUM_FIELDERROR = _descriptor.EnumDescriptor(
  name='FieldError',
  full_name='google.ads.googleads.v7.errors.FieldErrorEnum.FieldError',
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
      name='REQUIRED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='IMMUTABLE_FIELD', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_VALUE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VALUE_MUST_BE_UNSET', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REQUIRED_NONEMPTY_LIST', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FIELD_CANNOT_BE_CLEARED', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BLOCKED_VALUE', index=8, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=134,
  serialized_end=331,
)
_sym_db.RegisterEnumDescriptor(_FIELDERRORENUM_FIELDERROR)


_FIELDERRORENUM = _descriptor.Descriptor(
  name='FieldErrorEnum',
  full_name='google.ads.googleads.v7.errors.FieldErrorEnum',
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
    _FIELDERRORENUM_FIELDERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=115,
  serialized_end=331,
)

_FIELDERRORENUM_FIELDERROR.containing_type = _FIELDERRORENUM
DESCRIPTOR.message_types_by_name['FieldErrorEnum'] = _FIELDERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FieldErrorEnum = _reflection.GeneratedProtocolMessageType('FieldErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _FIELDERRORENUM,
  '__module__' : 'google.ads.googleads.v7.errors.field_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.FieldErrorEnum)
  })
_sym_db.RegisterMessage(FieldErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
