# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/ad_serving_optimization_status.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/ad_serving_optimization_status.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB AdServingOptimizationStatusProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v2/enums/ad_serving_optimization_status.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"\xbc\x01\n\x1f\x41\x64ServingOptimizationStatusEnum\"\x98\x01\n\x1b\x41\x64ServingOptimizationStatus\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08OPTIMIZE\x10\x02\x12\x17\n\x13\x43ONVERSION_OPTIMIZE\x10\x03\x12\n\n\x06ROTATE\x10\x04\x12\x17\n\x13ROTATE_INDEFINITELY\x10\x05\x12\x0f\n\x0bUNAVAILABLE\x10\x06\x42\xf5\x01\n!com.google.ads.googleads.v2.enumsB AdServingOptimizationStatusProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADSERVINGOPTIMIZATIONSTATUSENUM_ADSERVINGOPTIMIZATIONSTATUS = _descriptor.EnumDescriptor(
  name='AdServingOptimizationStatus',
  full_name='google.ads.googleads.v2.enums.AdServingOptimizationStatusEnum.AdServingOptimizationStatus',
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
      name='CONVERSION_OPTIMIZE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ROTATE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ROTATE_INDEFINITELY', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNAVAILABLE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=168,
  serialized_end=320,
)
_sym_db.RegisterEnumDescriptor(_ADSERVINGOPTIMIZATIONSTATUSENUM_ADSERVINGOPTIMIZATIONSTATUS)


_ADSERVINGOPTIMIZATIONSTATUSENUM = _descriptor.Descriptor(
  name='AdServingOptimizationStatusEnum',
  full_name='google.ads.googleads.v2.enums.AdServingOptimizationStatusEnum',
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
    _ADSERVINGOPTIMIZATIONSTATUSENUM_ADSERVINGOPTIMIZATIONSTATUS,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=132,
  serialized_end=320,
)

_ADSERVINGOPTIMIZATIONSTATUSENUM_ADSERVINGOPTIMIZATIONSTATUS.containing_type = _ADSERVINGOPTIMIZATIONSTATUSENUM
DESCRIPTOR.message_types_by_name['AdServingOptimizationStatusEnum'] = _ADSERVINGOPTIMIZATIONSTATUSENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdServingOptimizationStatusEnum = _reflection.GeneratedProtocolMessageType('AdServingOptimizationStatusEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADSERVINGOPTIMIZATIONSTATUSENUM,
  '__module__' : 'google.ads.googleads.v2.enums.ad_serving_optimization_status_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.AdServingOptimizationStatusEnum)
  })
_sym_db.RegisterMessage(AdServingOptimizationStatusEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
