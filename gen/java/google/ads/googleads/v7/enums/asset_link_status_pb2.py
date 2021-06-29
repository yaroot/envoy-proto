# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/asset_link_status.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/asset_link_status.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\024AssetLinkStatusProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v7/enums/asset_link_status.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"l\n\x13\x41ssetLinkStatusEnum\"U\n\x0f\x41ssetLinkStatus\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0b\n\x07\x45NABLED\x10\x02\x12\x0b\n\x07REMOVED\x10\x03\x12\n\n\x06PAUSED\x10\x04\x42\xe9\x01\n!com.google.ads.googleads.v7.enumsB\x14\x41ssetLinkStatusProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ASSETLINKSTATUSENUM_ASSETLINKSTATUS = _descriptor.EnumDescriptor(
  name='AssetLinkStatus',
  full_name='google.ads.googleads.v7.enums.AssetLinkStatusEnum.AssetLinkStatus',
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
      name='ENABLED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REMOVED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PAUSED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=141,
  serialized_end=226,
)
_sym_db.RegisterEnumDescriptor(_ASSETLINKSTATUSENUM_ASSETLINKSTATUS)


_ASSETLINKSTATUSENUM = _descriptor.Descriptor(
  name='AssetLinkStatusEnum',
  full_name='google.ads.googleads.v7.enums.AssetLinkStatusEnum',
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
    _ASSETLINKSTATUSENUM_ASSETLINKSTATUS,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=226,
)

_ASSETLINKSTATUSENUM_ASSETLINKSTATUS.containing_type = _ASSETLINKSTATUSENUM
DESCRIPTOR.message_types_by_name['AssetLinkStatusEnum'] = _ASSETLINKSTATUSENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AssetLinkStatusEnum = _reflection.GeneratedProtocolMessageType('AssetLinkStatusEnum', (_message.Message,), {
  'DESCRIPTOR' : _ASSETLINKSTATUSENUM,
  '__module__' : 'google.ads.googleads.v7.enums.asset_link_status_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.AssetLinkStatusEnum)
  })
_sym_db.RegisterMessage(AssetLinkStatusEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)