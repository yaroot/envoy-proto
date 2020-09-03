# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/change_status_operation.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/change_status_operation.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB\032ChangeStatusOperationProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v2/enums/change_status_operation.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"w\n\x19\x43hangeStatusOperationEnum\"Z\n\x15\x43hangeStatusOperation\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\t\n\x05\x41\x44\x44\x45\x44\x10\x02\x12\x0b\n\x07\x43HANGED\x10\x03\x12\x0b\n\x07REMOVED\x10\x04\x42\xef\x01\n!com.google.ads.googleads.v2.enumsB\x1a\x43hangeStatusOperationProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CHANGESTATUSOPERATIONENUM_CHANGESTATUSOPERATION = _descriptor.EnumDescriptor(
  name='ChangeStatusOperation',
  full_name='google.ads.googleads.v2.enums.ChangeStatusOperationEnum.ChangeStatusOperation',
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
      name='ADDED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CHANGED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REMOVED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=153,
  serialized_end=243,
)
_sym_db.RegisterEnumDescriptor(_CHANGESTATUSOPERATIONENUM_CHANGESTATUSOPERATION)


_CHANGESTATUSOPERATIONENUM = _descriptor.Descriptor(
  name='ChangeStatusOperationEnum',
  full_name='google.ads.googleads.v2.enums.ChangeStatusOperationEnum',
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
    _CHANGESTATUSOPERATIONENUM_CHANGESTATUSOPERATION,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=243,
)

_CHANGESTATUSOPERATIONENUM_CHANGESTATUSOPERATION.containing_type = _CHANGESTATUSOPERATIONENUM
DESCRIPTOR.message_types_by_name['ChangeStatusOperationEnum'] = _CHANGESTATUSOPERATIONENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ChangeStatusOperationEnum = _reflection.GeneratedProtocolMessageType('ChangeStatusOperationEnum', (_message.Message,), {
  'DESCRIPTOR' : _CHANGESTATUSOPERATIONENUM,
  '__module__' : 'google.ads.googleads.v2.enums.change_status_operation_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.ChangeStatusOperationEnum)
  })
_sym_db.RegisterMessage(ChangeStatusOperationEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
