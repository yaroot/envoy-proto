# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/enums/display_ad_format_setting.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/enums/display_ad_format_setting.proto',
  package='google.ads.googleads.v6.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v6.enumsB\033DisplayAdFormatSettingProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V6.Enums\312\002\035Google\\Ads\\GoogleAds\\V6\\Enums\352\002!Google::Ads::GoogleAds::V6::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v6/enums/display_ad_format_setting.proto\x12\x1dgoogle.ads.googleads.v6.enums\x1a\x1cgoogle/api/annotations.proto\"\x81\x01\n\x1a\x44isplayAdFormatSettingEnum\"c\n\x16\x44isplayAdFormatSetting\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0f\n\x0b\x41LL_FORMATS\x10\x02\x12\x0e\n\nNON_NATIVE\x10\x03\x12\n\n\x06NATIVE\x10\x04\x42\xf0\x01\n!com.google.ads.googleads.v6.enumsB\x1b\x44isplayAdFormatSettingProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V6.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V6\\Enums\xea\x02!Google::Ads::GoogleAds::V6::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_DISPLAYADFORMATSETTINGENUM_DISPLAYADFORMATSETTING = _descriptor.EnumDescriptor(
  name='DisplayAdFormatSetting',
  full_name='google.ads.googleads.v6.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting',
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
      name='ALL_FORMATS', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NON_NATIVE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NATIVE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=157,
  serialized_end=256,
)
_sym_db.RegisterEnumDescriptor(_DISPLAYADFORMATSETTINGENUM_DISPLAYADFORMATSETTING)


_DISPLAYADFORMATSETTINGENUM = _descriptor.Descriptor(
  name='DisplayAdFormatSettingEnum',
  full_name='google.ads.googleads.v6.enums.DisplayAdFormatSettingEnum',
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
    _DISPLAYADFORMATSETTINGENUM_DISPLAYADFORMATSETTING,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=127,
  serialized_end=256,
)

_DISPLAYADFORMATSETTINGENUM_DISPLAYADFORMATSETTING.containing_type = _DISPLAYADFORMATSETTINGENUM
DESCRIPTOR.message_types_by_name['DisplayAdFormatSettingEnum'] = _DISPLAYADFORMATSETTINGENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DisplayAdFormatSettingEnum = _reflection.GeneratedProtocolMessageType('DisplayAdFormatSettingEnum', (_message.Message,), {
  'DESCRIPTOR' : _DISPLAYADFORMATSETTINGENUM,
  '__module__' : 'google.ads.googleads.v6.enums.display_ad_format_setting_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.enums.DisplayAdFormatSettingEnum)
  })
_sym_db.RegisterMessage(DisplayAdFormatSettingEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
