# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/custom_audience_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/custom_audience_type.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\027CustomAudienceTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8google/ads/googleads/v7/enums/custom_audience_type.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\x85\x01\n\x16\x43ustomAudienceTypeEnum\"k\n\x12\x43ustomAudienceType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x08\n\x04\x41UTO\x10\x02\x12\x0c\n\x08INTEREST\x10\x03\x12\x13\n\x0fPURCHASE_INTENT\x10\x04\x12\n\n\x06SEARCH\x10\x05\x42\xec\x01\n!com.google.ads.googleads.v7.enumsB\x17\x43ustomAudienceTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CUSTOMAUDIENCETYPEENUM_CUSTOMAUDIENCETYPE = _descriptor.EnumDescriptor(
  name='CustomAudienceType',
  full_name='google.ads.googleads.v7.enums.CustomAudienceTypeEnum.CustomAudienceType',
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
      name='AUTO', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INTEREST', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PURCHASE_INTENT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SEARCH', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=148,
  serialized_end=255,
)
_sym_db.RegisterEnumDescriptor(_CUSTOMAUDIENCETYPEENUM_CUSTOMAUDIENCETYPE)


_CUSTOMAUDIENCETYPEENUM = _descriptor.Descriptor(
  name='CustomAudienceTypeEnum',
  full_name='google.ads.googleads.v7.enums.CustomAudienceTypeEnum',
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
    _CUSTOMAUDIENCETYPEENUM_CUSTOMAUDIENCETYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=122,
  serialized_end=255,
)

_CUSTOMAUDIENCETYPEENUM_CUSTOMAUDIENCETYPE.containing_type = _CUSTOMAUDIENCETYPEENUM
DESCRIPTOR.message_types_by_name['CustomAudienceTypeEnum'] = _CUSTOMAUDIENCETYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CustomAudienceTypeEnum = _reflection.GeneratedProtocolMessageType('CustomAudienceTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMAUDIENCETYPEENUM,
  '__module__' : 'google.ads.googleads.v7.enums.custom_audience_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.CustomAudienceTypeEnum)
  })
_sym_db.RegisterMessage(CustomAudienceTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
