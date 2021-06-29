# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/change_event_resource_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/change_event_resource_type.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\034ChangeEventResourceTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v8/enums/change_event_resource_type.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\xab\x02\n\x1b\x43hangeEventResourceTypeEnum\"\x8b\x02\n\x17\x43hangeEventResourceType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x06\n\x02\x41\x44\x10\x02\x12\x0c\n\x08\x41\x44_GROUP\x10\x03\x12\x16\n\x12\x41\x44_GROUP_CRITERION\x10\x04\x12\x0c\n\x08\x43\x41MPAIGN\x10\x05\x12\x13\n\x0f\x43\x41MPAIGN_BUDGET\x10\x06\x12\x19\n\x15\x41\x44_GROUP_BID_MODIFIER\x10\x07\x12\x16\n\x12\x43\x41MPAIGN_CRITERION\x10\x08\x12\x08\n\x04\x46\x45\x45\x44\x10\t\x12\r\n\tFEED_ITEM\x10\n\x12\x11\n\rCAMPAIGN_FEED\x10\x0b\x12\x11\n\rAD_GROUP_FEED\x10\x0c\x12\x0f\n\x0b\x41\x44_GROUP_AD\x10\rB\xf1\x01\n!com.google.ads.googleads.v8.enumsB\x1c\x43hangeEventResourceTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CHANGEEVENTRESOURCETYPEENUM_CHANGEEVENTRESOURCETYPE = _descriptor.EnumDescriptor(
  name='ChangeEventResourceType',
  full_name='google.ads.googleads.v8.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType',
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
      name='AD', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_CRITERION', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_BUDGET', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_BID_MODIFIER', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_CRITERION', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED_ITEM', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_FEED', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_FEED', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_AD', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=160,
  serialized_end=427,
)
_sym_db.RegisterEnumDescriptor(_CHANGEEVENTRESOURCETYPEENUM_CHANGEEVENTRESOURCETYPE)


_CHANGEEVENTRESOURCETYPEENUM = _descriptor.Descriptor(
  name='ChangeEventResourceTypeEnum',
  full_name='google.ads.googleads.v8.enums.ChangeEventResourceTypeEnum',
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
    _CHANGEEVENTRESOURCETYPEENUM_CHANGEEVENTRESOURCETYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=128,
  serialized_end=427,
)

_CHANGEEVENTRESOURCETYPEENUM_CHANGEEVENTRESOURCETYPE.containing_type = _CHANGEEVENTRESOURCETYPEENUM
DESCRIPTOR.message_types_by_name['ChangeEventResourceTypeEnum'] = _CHANGEEVENTRESOURCETYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ChangeEventResourceTypeEnum = _reflection.GeneratedProtocolMessageType('ChangeEventResourceTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _CHANGEEVENTRESOURCETYPEENUM,
  '__module__' : 'google.ads.googleads.v8.enums.change_event_resource_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.ChangeEventResourceTypeEnum)
  })
_sym_db.RegisterMessage(ChangeEventResourceTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
