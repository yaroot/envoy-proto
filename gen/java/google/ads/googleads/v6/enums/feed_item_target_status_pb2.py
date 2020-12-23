# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/enums/feed_item_target_status.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/enums/feed_item_target_status.proto',
  package='google.ads.googleads.v6.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v6.enumsB\031FeedItemTargetStatusProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V6.Enums\312\002\035Google\\Ads\\GoogleAds\\V6\\Enums\352\002!Google::Ads::GoogleAds::V6::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v6/enums/feed_item_target_status.proto\x12\x1dgoogle.ads.googleads.v6.enums\x1a\x1cgoogle/api/annotations.proto\"j\n\x18\x46\x65\x65\x64ItemTargetStatusEnum\"N\n\x14\x46\x65\x65\x64ItemTargetStatus\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0b\n\x07\x45NABLED\x10\x02\x12\x0b\n\x07REMOVED\x10\x03\x42\xee\x01\n!com.google.ads.googleads.v6.enumsB\x19\x46\x65\x65\x64ItemTargetStatusProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V6.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V6\\Enums\xea\x02!Google::Ads::GoogleAds::V6::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FEEDITEMTARGETSTATUSENUM_FEEDITEMTARGETSTATUS = _descriptor.EnumDescriptor(
  name='FeedItemTargetStatus',
  full_name='google.ads.googleads.v6.enums.FeedItemTargetStatusEnum.FeedItemTargetStatus',
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
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=152,
  serialized_end=230,
)
_sym_db.RegisterEnumDescriptor(_FEEDITEMTARGETSTATUSENUM_FEEDITEMTARGETSTATUS)


_FEEDITEMTARGETSTATUSENUM = _descriptor.Descriptor(
  name='FeedItemTargetStatusEnum',
  full_name='google.ads.googleads.v6.enums.FeedItemTargetStatusEnum',
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
    _FEEDITEMTARGETSTATUSENUM_FEEDITEMTARGETSTATUS,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=230,
)

_FEEDITEMTARGETSTATUSENUM_FEEDITEMTARGETSTATUS.containing_type = _FEEDITEMTARGETSTATUSENUM
DESCRIPTOR.message_types_by_name['FeedItemTargetStatusEnum'] = _FEEDITEMTARGETSTATUSENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedItemTargetStatusEnum = _reflection.GeneratedProtocolMessageType('FeedItemTargetStatusEnum', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMTARGETSTATUSENUM,
  '__module__' : 'google.ads.googleads.v6.enums.feed_item_target_status_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.enums.FeedItemTargetStatusEnum)
  })
_sym_db.RegisterMessage(FeedItemTargetStatusEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
