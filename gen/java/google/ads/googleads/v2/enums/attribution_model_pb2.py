# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/attribution_model.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/attribution_model.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB\025AttributionModelProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v2/enums/attribution_model.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"\xc6\x02\n\x14\x41ttributionModelEnum\"\xad\x02\n\x10\x41ttributionModel\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08\x45XTERNAL\x10\x64\x12\x19\n\x15GOOGLE_ADS_LAST_CLICK\x10\x65\x12)\n%GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK\x10\x66\x12$\n GOOGLE_SEARCH_ATTRIBUTION_LINEAR\x10g\x12(\n$GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY\x10h\x12,\n(GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED\x10i\x12)\n%GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN\x10jB\xea\x01\n!com.google.ads.googleads.v2.enumsB\x15\x41ttributionModelProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ATTRIBUTIONMODELENUM_ATTRIBUTIONMODEL = _descriptor.EnumDescriptor(
  name='AttributionModel',
  full_name='google.ads.googleads.v2.enums.AttributionModelEnum.AttributionModel',
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
      name='EXTERNAL', index=2, number=100,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_ADS_LAST_CLICK', index=3, number=101,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_SEARCH_ATTRIBUTION_FIRST_CLICK', index=4, number=102,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_SEARCH_ATTRIBUTION_LINEAR', index=5, number=103,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_SEARCH_ATTRIBUTION_TIME_DECAY', index=6, number=104,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_SEARCH_ATTRIBUTION_POSITION_BASED', index=7, number=105,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_SEARCH_ATTRIBUTION_DATA_DRIVEN', index=8, number=106,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=144,
  serialized_end=445,
)
_sym_db.RegisterEnumDescriptor(_ATTRIBUTIONMODELENUM_ATTRIBUTIONMODEL)


_ATTRIBUTIONMODELENUM = _descriptor.Descriptor(
  name='AttributionModelEnum',
  full_name='google.ads.googleads.v2.enums.AttributionModelEnum',
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
    _ATTRIBUTIONMODELENUM_ATTRIBUTIONMODEL,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=119,
  serialized_end=445,
)

_ATTRIBUTIONMODELENUM_ATTRIBUTIONMODEL.containing_type = _ATTRIBUTIONMODELENUM
DESCRIPTOR.message_types_by_name['AttributionModelEnum'] = _ATTRIBUTIONMODELENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AttributionModelEnum = _reflection.GeneratedProtocolMessageType('AttributionModelEnum', (_message.Message,), {
  'DESCRIPTOR' : _ATTRIBUTIONMODELENUM,
  '__module__' : 'google.ads.googleads.v2.enums.attribution_model_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.AttributionModelEnum)
  })
_sym_db.RegisterMessage(AttributionModelEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
