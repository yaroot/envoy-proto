# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/advertising_channel_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/advertising_channel_type.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\033AdvertisingChannelTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/ads/googleads/v8/enums/advertising_channel_type.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\xbb\x01\n\x1a\x41\x64vertisingChannelTypeEnum\"\x9c\x01\n\x16\x41\x64vertisingChannelType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\n\n\x06SEARCH\x10\x02\x12\x0b\n\x07\x44ISPLAY\x10\x03\x12\x0c\n\x08SHOPPING\x10\x04\x12\t\n\x05HOTEL\x10\x05\x12\t\n\x05VIDEO\x10\x06\x12\x11\n\rMULTI_CHANNEL\x10\x07\x12\t\n\x05LOCAL\x10\x08\x12\t\n\x05SMART\x10\tB\xf0\x01\n!com.google.ads.googleads.v8.enumsB\x1b\x41\x64vertisingChannelTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADVERTISINGCHANNELTYPEENUM_ADVERTISINGCHANNELTYPE = _descriptor.EnumDescriptor(
  name='AdvertisingChannelType',
  full_name='google.ads.googleads.v8.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType',
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
      name='SEARCH', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DISPLAY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SHOPPING', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HOTEL', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='VIDEO', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MULTI_CHANNEL', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOCAL', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SMART', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=157,
  serialized_end=313,
)
_sym_db.RegisterEnumDescriptor(_ADVERTISINGCHANNELTYPEENUM_ADVERTISINGCHANNELTYPE)


_ADVERTISINGCHANNELTYPEENUM = _descriptor.Descriptor(
  name='AdvertisingChannelTypeEnum',
  full_name='google.ads.googleads.v8.enums.AdvertisingChannelTypeEnum',
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
    _ADVERTISINGCHANNELTYPEENUM_ADVERTISINGCHANNELTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=126,
  serialized_end=313,
)

_ADVERTISINGCHANNELTYPEENUM_ADVERTISINGCHANNELTYPE.containing_type = _ADVERTISINGCHANNELTYPEENUM
DESCRIPTOR.message_types_by_name['AdvertisingChannelTypeEnum'] = _ADVERTISINGCHANNELTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdvertisingChannelTypeEnum = _reflection.GeneratedProtocolMessageType('AdvertisingChannelTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADVERTISINGCHANNELTYPEENUM,
  '__module__' : 'google.ads.googleads.v8.enums.advertising_channel_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.AdvertisingChannelTypeEnum)
  })
_sym_db.RegisterMessage(AdvertisingChannelTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
