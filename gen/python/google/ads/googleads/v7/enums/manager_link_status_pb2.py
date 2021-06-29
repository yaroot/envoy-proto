# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/manager_link_status.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/manager_link_status.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\026ManagerLinkStatusProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/ads/googleads/v7/enums/manager_link_status.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\x8c\x01\n\x15ManagerLinkStatusEnum\"s\n\x11ManagerLinkStatus\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\n\n\x06\x41\x43TIVE\x10\x02\x12\x0c\n\x08INACTIVE\x10\x03\x12\x0b\n\x07PENDING\x10\x04\x12\x0b\n\x07REFUSED\x10\x05\x12\x0c\n\x08\x43\x41NCELED\x10\x06\x42\xeb\x01\n!com.google.ads.googleads.v7.enumsB\x16ManagerLinkStatusProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_MANAGERLINKSTATUSENUM_MANAGERLINKSTATUS = _descriptor.EnumDescriptor(
  name='ManagerLinkStatus',
  full_name='google.ads.googleads.v7.enums.ManagerLinkStatusEnum.ManagerLinkStatus',
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
      name='ACTIVE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INACTIVE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PENDING', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REFUSED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANCELED', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=146,
  serialized_end=261,
)
_sym_db.RegisterEnumDescriptor(_MANAGERLINKSTATUSENUM_MANAGERLINKSTATUS)


_MANAGERLINKSTATUSENUM = _descriptor.Descriptor(
  name='ManagerLinkStatusEnum',
  full_name='google.ads.googleads.v7.enums.ManagerLinkStatusEnum',
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
    _MANAGERLINKSTATUSENUM_MANAGERLINKSTATUS,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=121,
  serialized_end=261,
)

_MANAGERLINKSTATUSENUM_MANAGERLINKSTATUS.containing_type = _MANAGERLINKSTATUSENUM
DESCRIPTOR.message_types_by_name['ManagerLinkStatusEnum'] = _MANAGERLINKSTATUSENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ManagerLinkStatusEnum = _reflection.GeneratedProtocolMessageType('ManagerLinkStatusEnum', (_message.Message,), {
  'DESCRIPTOR' : _MANAGERLINKSTATUSENUM,
  '__module__' : 'google.ads.googleads.v7.enums.manager_link_status_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.ManagerLinkStatusEnum)
  })
_sym_db.RegisterMessage(ManagerLinkStatusEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
