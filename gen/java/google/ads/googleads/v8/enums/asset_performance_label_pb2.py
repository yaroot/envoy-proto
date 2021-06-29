# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/asset_performance_label.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/asset_performance_label.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\032AssetPerformanceLabelProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v8/enums/asset_performance_label.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\x8a\x01\n\x19\x41ssetPerformanceLabelEnum\"m\n\x15\x41ssetPerformanceLabel\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0b\n\x07PENDING\x10\x02\x12\x0c\n\x08LEARNING\x10\x03\x12\x07\n\x03LOW\x10\x04\x12\x08\n\x04GOOD\x10\x05\x12\x08\n\x04\x42\x45ST\x10\x06\x42\xef\x01\n!com.google.ads.googleads.v8.enumsB\x1a\x41ssetPerformanceLabelProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ASSETPERFORMANCELABELENUM_ASSETPERFORMANCELABEL = _descriptor.EnumDescriptor(
  name='AssetPerformanceLabel',
  full_name='google.ads.googleads.v8.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel',
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
      name='PENDING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LEARNING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOW', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOD', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BEST', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=154,
  serialized_end=263,
)
_sym_db.RegisterEnumDescriptor(_ASSETPERFORMANCELABELENUM_ASSETPERFORMANCELABEL)


_ASSETPERFORMANCELABELENUM = _descriptor.Descriptor(
  name='AssetPerformanceLabelEnum',
  full_name='google.ads.googleads.v8.enums.AssetPerformanceLabelEnum',
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
    _ASSETPERFORMANCELABELENUM_ASSETPERFORMANCELABEL,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=125,
  serialized_end=263,
)

_ASSETPERFORMANCELABELENUM_ASSETPERFORMANCELABEL.containing_type = _ASSETPERFORMANCELABELENUM
DESCRIPTOR.message_types_by_name['AssetPerformanceLabelEnum'] = _ASSETPERFORMANCELABELENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AssetPerformanceLabelEnum = _reflection.GeneratedProtocolMessageType('AssetPerformanceLabelEnum', (_message.Message,), {
  'DESCRIPTOR' : _ASSETPERFORMANCELABELENUM,
  '__module__' : 'google.ads.googleads.v8.enums.asset_performance_label_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.AssetPerformanceLabelEnum)
  })
_sym_db.RegisterMessage(AssetPerformanceLabelEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
