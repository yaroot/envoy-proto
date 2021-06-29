# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/product_type_level.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/product_type_level.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\025ProductTypeLevelProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v8/enums/product_type_level.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\x84\x01\n\x14ProductTypeLevelEnum\"l\n\x10ProductTypeLevel\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\n\n\x06LEVEL1\x10\x07\x12\n\n\x06LEVEL2\x10\x08\x12\n\n\x06LEVEL3\x10\t\x12\n\n\x06LEVEL4\x10\n\x12\n\n\x06LEVEL5\x10\x0b\x42\xea\x01\n!com.google.ads.googleads.v8.enumsB\x15ProductTypeLevelProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_PRODUCTTYPELEVELENUM_PRODUCTTYPELEVEL = _descriptor.EnumDescriptor(
  name='ProductTypeLevel',
  full_name='google.ads.googleads.v8.enums.ProductTypeLevelEnum.ProductTypeLevel',
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
      name='LEVEL1', index=2, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEVEL2', index=3, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEVEL3', index=4, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEVEL4', index=5, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEVEL5', index=6, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=144,
  serialized_end=252,
)
_sym_db.RegisterEnumDescriptor(_PRODUCTTYPELEVELENUM_PRODUCTTYPELEVEL)


_PRODUCTTYPELEVELENUM = _descriptor.Descriptor(
  name='ProductTypeLevelEnum',
  full_name='google.ads.googleads.v8.enums.ProductTypeLevelEnum',
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
    _PRODUCTTYPELEVELENUM_PRODUCTTYPELEVEL,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=120,
  serialized_end=252,
)

_PRODUCTTYPELEVELENUM_PRODUCTTYPELEVEL.containing_type = _PRODUCTTYPELEVELENUM
DESCRIPTOR.message_types_by_name['ProductTypeLevelEnum'] = _PRODUCTTYPELEVELENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ProductTypeLevelEnum = _reflection.GeneratedProtocolMessageType('ProductTypeLevelEnum', (_message.Message,), {
  'DESCRIPTOR' : _PRODUCTTYPELEVELENUM,
  '__module__' : 'google.ads.googleads.v8.enums.product_type_level_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.ProductTypeLevelEnum)
  })
_sym_db.RegisterMessage(ProductTypeLevelEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
