# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/operation_access_denied_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/operation_access_denied_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\037OperationAccessDeniedErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v4/errors/operation_access_denied_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\xeb\x03\n\x1eOperationAccessDeniedErrorEnum\"\xc8\x03\n\x1aOperationAccessDeniedError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x18\n\x14\x41\x43TION_NOT_PERMITTED\x10\x02\x12\"\n\x1e\x43REATE_OPERATION_NOT_PERMITTED\x10\x03\x12\"\n\x1eREMOVE_OPERATION_NOT_PERMITTED\x10\x04\x12\"\n\x1eUPDATE_OPERATION_NOT_PERMITTED\x10\x05\x12*\n&MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT\x10\x06\x12-\n)OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE\x10\x07\x12#\n\x1f\x43REATE_AS_REMOVED_NOT_PERMITTED\x10\x08\x12\x30\n,OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE\x10\t\x12-\n)OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE\x10\n\x12%\n!MUTATE_NOT_PERMITTED_FOR_CUSTOMER\x10\x0b\x42\xfa\x01\n\"com.google.ads.googleads.v4.errorsB\x1fOperationAccessDeniedErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_OPERATIONACCESSDENIEDERRORENUM_OPERATIONACCESSDENIEDERROR = _descriptor.EnumDescriptor(
  name='OperationAccessDeniedError',
  full_name='google.ads.googleads.v4.errors.OperationAccessDeniedErrorEnum.OperationAccessDeniedError',
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
      name='ACTION_NOT_PERMITTED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CREATE_OPERATION_NOT_PERMITTED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REMOVE_OPERATION_NOT_PERMITTED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UPDATE_OPERATION_NOT_PERMITTED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MUTATE_ACTION_NOT_PERMITTED_FOR_CLIENT', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OPERATION_NOT_PERMITTED_FOR_CAMPAIGN_TYPE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CREATE_AS_REMOVED_NOT_PERMITTED', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OPERATION_NOT_PERMITTED_FOR_REMOVED_RESOURCE', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OPERATION_NOT_PERMITTED_FOR_AD_GROUP_TYPE', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MUTATE_NOT_PERMITTED_FOR_CUSTOMER', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=168,
  serialized_end=624,
)
_sym_db.RegisterEnumDescriptor(_OPERATIONACCESSDENIEDERRORENUM_OPERATIONACCESSDENIEDERROR)


_OPERATIONACCESSDENIEDERRORENUM = _descriptor.Descriptor(
  name='OperationAccessDeniedErrorEnum',
  full_name='google.ads.googleads.v4.errors.OperationAccessDeniedErrorEnum',
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
    _OPERATIONACCESSDENIEDERRORENUM_OPERATIONACCESSDENIEDERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=133,
  serialized_end=624,
)

_OPERATIONACCESSDENIEDERRORENUM_OPERATIONACCESSDENIEDERROR.containing_type = _OPERATIONACCESSDENIEDERRORENUM
DESCRIPTOR.message_types_by_name['OperationAccessDeniedErrorEnum'] = _OPERATIONACCESSDENIEDERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OperationAccessDeniedErrorEnum = _reflection.GeneratedProtocolMessageType('OperationAccessDeniedErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _OPERATIONACCESSDENIEDERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.operation_access_denied_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.OperationAccessDeniedErrorEnum)
  })
_sym_db.RegisterMessage(OperationAccessDeniedErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
