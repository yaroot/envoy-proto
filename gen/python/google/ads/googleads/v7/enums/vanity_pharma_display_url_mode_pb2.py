# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/vanity_pharma_display_url_mode.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/vanity_pharma_display_url_mode.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\037VanityPharmaDisplayUrlModeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v7/enums/vanity_pharma_display_url_mode.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\x93\x01\n\x1eVanityPharmaDisplayUrlModeEnum\"q\n\x1aVanityPharmaDisplayUrlMode\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1c\n\x18MANUFACTURER_WEBSITE_URL\x10\x02\x12\x17\n\x13WEBSITE_DESCRIPTION\x10\x03\x42\xf4\x01\n!com.google.ads.googleads.v7.enumsB\x1fVanityPharmaDisplayUrlModeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_VANITYPHARMADISPLAYURLMODEENUM_VANITYPHARMADISPLAYURLMODE = _descriptor.EnumDescriptor(
  name='VanityPharmaDisplayUrlMode',
  full_name='google.ads.googleads.v7.enums.VanityPharmaDisplayUrlModeEnum.VanityPharmaDisplayUrlMode',
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
      name='MANUFACTURER_WEBSITE_URL', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBSITE_DESCRIPTION', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=166,
  serialized_end=279,
)
_sym_db.RegisterEnumDescriptor(_VANITYPHARMADISPLAYURLMODEENUM_VANITYPHARMADISPLAYURLMODE)


_VANITYPHARMADISPLAYURLMODEENUM = _descriptor.Descriptor(
  name='VanityPharmaDisplayUrlModeEnum',
  full_name='google.ads.googleads.v7.enums.VanityPharmaDisplayUrlModeEnum',
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
    _VANITYPHARMADISPLAYURLMODEENUM_VANITYPHARMADISPLAYURLMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=132,
  serialized_end=279,
)

_VANITYPHARMADISPLAYURLMODEENUM_VANITYPHARMADISPLAYURLMODE.containing_type = _VANITYPHARMADISPLAYURLMODEENUM
DESCRIPTOR.message_types_by_name['VanityPharmaDisplayUrlModeEnum'] = _VANITYPHARMADISPLAYURLMODEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

VanityPharmaDisplayUrlModeEnum = _reflection.GeneratedProtocolMessageType('VanityPharmaDisplayUrlModeEnum', (_message.Message,), {
  'DESCRIPTOR' : _VANITYPHARMADISPLAYURLMODEENUM,
  '__module__' : 'google.ads.googleads.v7.enums.vanity_pharma_display_url_mode_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.VanityPharmaDisplayUrlModeEnum)
  })
_sym_db.RegisterMessage(VanityPharmaDisplayUrlModeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
