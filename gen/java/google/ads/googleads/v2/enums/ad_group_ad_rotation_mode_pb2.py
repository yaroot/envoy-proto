# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/ad_group_ad_rotation_mode.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/ad_group_ad_rotation_mode.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB\032AdGroupAdRotationModeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v2/enums/ad_group_ad_rotation_mode.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"t\n\x19\x41\x64GroupAdRotationModeEnum\"W\n\x15\x41\x64GroupAdRotationMode\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08OPTIMIZE\x10\x02\x12\x12\n\x0eROTATE_FOREVER\x10\x03\x42\xef\x01\n!com.google.ads.googleads.v2.enumsB\x1a\x41\x64GroupAdRotationModeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADGROUPADROTATIONMODEENUM_ADGROUPADROTATIONMODE = _descriptor.EnumDescriptor(
  name='AdGroupAdRotationMode',
  full_name='google.ads.googleads.v2.enums.AdGroupAdRotationModeEnum.AdGroupAdRotationMode',
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
      name='OPTIMIZE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ROTATE_FOREVER', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=155,
  serialized_end=242,
)
_sym_db.RegisterEnumDescriptor(_ADGROUPADROTATIONMODEENUM_ADGROUPADROTATIONMODE)


_ADGROUPADROTATIONMODEENUM = _descriptor.Descriptor(
  name='AdGroupAdRotationModeEnum',
  full_name='google.ads.googleads.v2.enums.AdGroupAdRotationModeEnum',
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
    _ADGROUPADROTATIONMODEENUM_ADGROUPADROTATIONMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=126,
  serialized_end=242,
)

_ADGROUPADROTATIONMODEENUM_ADGROUPADROTATIONMODE.containing_type = _ADGROUPADROTATIONMODEENUM
DESCRIPTOR.message_types_by_name['AdGroupAdRotationModeEnum'] = _ADGROUPADROTATIONMODEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupAdRotationModeEnum = _reflection.GeneratedProtocolMessageType('AdGroupAdRotationModeEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPADROTATIONMODEENUM,
  '__module__' : 'google.ads.googleads.v2.enums.ad_group_ad_rotation_mode_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.AdGroupAdRotationModeEnum)
  })
_sym_db.RegisterMessage(AdGroupAdRotationModeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
