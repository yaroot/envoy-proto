# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/database_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/database_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\022DatabaseErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/ads/googleads/v4/errors/database_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\x96\x01\n\x11\x44\x61tabaseErrorEnum\"\x80\x01\n\rDatabaseError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1b\n\x17\x43ONCURRENT_MODIFICATION\x10\x02\x12\x1d\n\x19\x44\x41TA_CONSTRAINT_VIOLATION\x10\x03\x12\x15\n\x11REQUEST_TOO_LARGE\x10\x04\x42\xed\x01\n\"com.google.ads.googleads.v4.errorsB\x12\x44\x61tabaseErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_DATABASEERRORENUM_DATABASEERROR = _descriptor.EnumDescriptor(
  name='DatabaseError',
  full_name='google.ads.googleads.v4.errors.DatabaseErrorEnum.DatabaseError',
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
      name='CONCURRENT_MODIFICATION', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DATA_CONSTRAINT_VIOLATION', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REQUEST_TOO_LARGE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=140,
  serialized_end=268,
)
_sym_db.RegisterEnumDescriptor(_DATABASEERRORENUM_DATABASEERROR)


_DATABASEERRORENUM = _descriptor.Descriptor(
  name='DatabaseErrorEnum',
  full_name='google.ads.googleads.v4.errors.DatabaseErrorEnum',
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
    _DATABASEERRORENUM_DATABASEERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=268,
)

_DATABASEERRORENUM_DATABASEERROR.containing_type = _DATABASEERRORENUM
DESCRIPTOR.message_types_by_name['DatabaseErrorEnum'] = _DATABASEERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DatabaseErrorEnum = _reflection.GeneratedProtocolMessageType('DatabaseErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _DATABASEERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.database_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.DatabaseErrorEnum)
  })
_sym_db.RegisterMessage(DatabaseErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
