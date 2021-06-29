# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/served_asset_field_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/served_asset_field_type.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\031ServedAssetFieldTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v7/enums/served_asset_field_type.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\xa7\x01\n\x18ServedAssetFieldTypeEnum\"\x8a\x01\n\x14ServedAssetFieldType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0e\n\nHEADLINE_1\x10\x02\x12\x0e\n\nHEADLINE_2\x10\x03\x12\x0e\n\nHEADLINE_3\x10\x04\x12\x11\n\rDESCRIPTION_1\x10\x05\x12\x11\n\rDESCRIPTION_2\x10\x06\x42\xee\x01\n!com.google.ads.googleads.v7.enumsB\x19ServedAssetFieldTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_SERVEDASSETFIELDTYPEENUM_SERVEDASSETFIELDTYPE = _descriptor.EnumDescriptor(
  name='ServedAssetFieldType',
  full_name='google.ads.googleads.v7.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType',
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
      name='HEADLINE_1', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HEADLINE_2', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HEADLINE_3', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESCRIPTION_1', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESCRIPTION_2', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=154,
  serialized_end=292,
)
_sym_db.RegisterEnumDescriptor(_SERVEDASSETFIELDTYPEENUM_SERVEDASSETFIELDTYPE)


_SERVEDASSETFIELDTYPEENUM = _descriptor.Descriptor(
  name='ServedAssetFieldTypeEnum',
  full_name='google.ads.googleads.v7.enums.ServedAssetFieldTypeEnum',
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
    _SERVEDASSETFIELDTYPEENUM_SERVEDASSETFIELDTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=125,
  serialized_end=292,
)

_SERVEDASSETFIELDTYPEENUM_SERVEDASSETFIELDTYPE.containing_type = _SERVEDASSETFIELDTYPEENUM
DESCRIPTOR.message_types_by_name['ServedAssetFieldTypeEnum'] = _SERVEDASSETFIELDTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ServedAssetFieldTypeEnum = _reflection.GeneratedProtocolMessageType('ServedAssetFieldTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _SERVEDASSETFIELDTYPEENUM,
  '__module__' : 'google.ads.googleads.v7.enums.served_asset_field_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.ServedAssetFieldTypeEnum)
  })
_sym_db.RegisterMessage(ServedAssetFieldTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
