# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/asset_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/asset_type.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\016AssetTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.google/ads/googleads/v7/enums/asset_type.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\xda\x01\n\rAssetTypeEnum\"\xc8\x01\n\tAssetType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x11\n\rYOUTUBE_VIDEO\x10\x02\x12\x10\n\x0cMEDIA_BUNDLE\x10\x03\x12\t\n\x05IMAGE\x10\x04\x12\x08\n\x04TEXT\x10\x05\x12\r\n\tLEAD_FORM\x10\x06\x12\x12\n\x0e\x42OOK_ON_GOOGLE\x10\x07\x12\r\n\tPROMOTION\x10\x08\x12\x0b\n\x07\x43\x41LLOUT\x10\t\x12\x16\n\x12STRUCTURED_SNIPPET\x10\n\x12\x0c\n\x08SITELINK\x10\x0b\x42\xe3\x01\n!com.google.ads.googleads.v7.enumsB\x0e\x41ssetTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ASSETTYPEENUM_ASSETTYPE = _descriptor.EnumDescriptor(
  name='AssetType',
  full_name='google.ads.googleads.v7.enums.AssetTypeEnum.AssetType',
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
      name='YOUTUBE_VIDEO', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEDIA_BUNDLE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='IMAGE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TEXT', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEAD_FORM', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BOOK_ON_GOOGLE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROMOTION', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CALLOUT', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STRUCTURED_SNIPPET', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SITELINK', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=130,
  serialized_end=330,
)
_sym_db.RegisterEnumDescriptor(_ASSETTYPEENUM_ASSETTYPE)


_ASSETTYPEENUM = _descriptor.Descriptor(
  name='AssetTypeEnum',
  full_name='google.ads.googleads.v7.enums.AssetTypeEnum',
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
    _ASSETTYPEENUM_ASSETTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=112,
  serialized_end=330,
)

_ASSETTYPEENUM_ASSETTYPE.containing_type = _ASSETTYPEENUM
DESCRIPTOR.message_types_by_name['AssetTypeEnum'] = _ASSETTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AssetTypeEnum = _reflection.GeneratedProtocolMessageType('AssetTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _ASSETTYPEENUM,
  '__module__' : 'google.ads.googleads.v7.enums.asset_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.AssetTypeEnum)
  })
_sym_db.RegisterMessage(AssetTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
