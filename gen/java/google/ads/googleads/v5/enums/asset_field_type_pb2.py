# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/enums/asset_field_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/enums/asset_field_type.proto',
  package='google.ads.googleads.v5.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v5.enumsB\023AssetFieldTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v5/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V5.Enums\312\002\035Google\\Ads\\GoogleAds\\V5\\Enums\352\002!Google::Ads::GoogleAds::V5::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v5/enums/asset_field_type.proto\x12\x1dgoogle.ads.googleads.v5.enums\x1a\x1cgoogle/api/annotations.proto\"\xc9\x01\n\x12\x41ssetFieldTypeEnum\"\xb2\x01\n\x0e\x41ssetFieldType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08HEADLINE\x10\x02\x12\x0f\n\x0b\x44\x45SCRIPTION\x10\x03\x12\x15\n\x11MANDATORY_AD_TEXT\x10\x04\x12\x13\n\x0fMARKETING_IMAGE\x10\x05\x12\x10\n\x0cMEDIA_BUNDLE\x10\x06\x12\x11\n\rYOUTUBE_VIDEO\x10\x07\x12\x12\n\x0e\x42OOK_ON_GOOGLE\x10\x08\x42\xe8\x01\n!com.google.ads.googleads.v5.enumsB\x13\x41ssetFieldTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v5/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V5.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V5\\Enums\xea\x02!Google::Ads::GoogleAds::V5::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ASSETFIELDTYPEENUM_ASSETFIELDTYPE = _descriptor.EnumDescriptor(
  name='AssetFieldType',
  full_name='google.ads.googleads.v5.enums.AssetFieldTypeEnum.AssetFieldType',
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
      name='HEADLINE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESCRIPTION', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MANDATORY_AD_TEXT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MARKETING_IMAGE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEDIA_BUNDLE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='YOUTUBE_VIDEO', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BOOK_ON_GOOGLE', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=141,
  serialized_end=319,
)
_sym_db.RegisterEnumDescriptor(_ASSETFIELDTYPEENUM_ASSETFIELDTYPE)


_ASSETFIELDTYPEENUM = _descriptor.Descriptor(
  name='AssetFieldTypeEnum',
  full_name='google.ads.googleads.v5.enums.AssetFieldTypeEnum',
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
    _ASSETFIELDTYPEENUM_ASSETFIELDTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=319,
)

_ASSETFIELDTYPEENUM_ASSETFIELDTYPE.containing_type = _ASSETFIELDTYPEENUM
DESCRIPTOR.message_types_by_name['AssetFieldTypeEnum'] = _ASSETFIELDTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AssetFieldTypeEnum = _reflection.GeneratedProtocolMessageType('AssetFieldTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _ASSETFIELDTYPEENUM,
  '__module__' : 'google.ads.googleads.v5.enums.asset_field_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.enums.AssetFieldTypeEnum)
  })
_sym_db.RegisterMessage(AssetFieldTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
