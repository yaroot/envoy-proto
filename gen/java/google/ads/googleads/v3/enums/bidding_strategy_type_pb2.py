# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/enums/bidding_strategy_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/enums/bidding_strategy_type.proto',
  package='google.ads.googleads.v3.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v3.enumsB\030BiddingStrategyTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v3/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V3.Enums\312\002\035Google\\Ads\\GoogleAds\\V3\\Enums\352\002!Google::Ads::GoogleAds::V3::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/ads/googleads/v3/enums/bidding_strategy_type.proto\x12\x1dgoogle.ads.googleads.v3.enums\x1a\x1cgoogle/api/annotations.proto\"\xfc\x02\n\x17\x42iddingStrategyTypeEnum\"\xe0\x02\n\x13\x42iddingStrategyType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0e\n\nCOMMISSION\x10\x10\x12\x10\n\x0c\x45NHANCED_CPC\x10\x02\x12\x0e\n\nMANUAL_CPC\x10\x03\x12\x0e\n\nMANUAL_CPM\x10\x04\x12\x0e\n\nMANUAL_CPV\x10\r\x12\x18\n\x14MAXIMIZE_CONVERSIONS\x10\n\x12\x1d\n\x19MAXIMIZE_CONVERSION_VALUE\x10\x0b\x12\x15\n\x11PAGE_ONE_PROMOTED\x10\x05\x12\x0f\n\x0bPERCENT_CPC\x10\x0c\x12\x0e\n\nTARGET_CPA\x10\x06\x12\x0e\n\nTARGET_CPM\x10\x0e\x12\x1b\n\x17TARGET_IMPRESSION_SHARE\x10\x0f\x12\x18\n\x14TARGET_OUTRANK_SHARE\x10\x07\x12\x0f\n\x0bTARGET_ROAS\x10\x08\x12\x10\n\x0cTARGET_SPEND\x10\tB\xed\x01\n!com.google.ads.googleads.v3.enumsB\x18\x42iddingStrategyTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v3/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V3.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V3\\Enums\xea\x02!Google::Ads::GoogleAds::V3::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_BIDDINGSTRATEGYTYPEENUM_BIDDINGSTRATEGYTYPE = _descriptor.EnumDescriptor(
  name='BiddingStrategyType',
  full_name='google.ads.googleads.v3.enums.BiddingStrategyTypeEnum.BiddingStrategyType',
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
      name='COMMISSION', index=2, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENHANCED_CPC', index=3, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MANUAL_CPC', index=4, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MANUAL_CPM', index=5, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MANUAL_CPV', index=6, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MAXIMIZE_CONVERSIONS', index=7, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MAXIMIZE_CONVERSION_VALUE', index=8, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PAGE_ONE_PROMOTED', index=9, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PERCENT_CPC', index=10, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_CPA', index=11, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_CPM', index=12, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_IMPRESSION_SHARE', index=13, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_OUTRANK_SHARE', index=14, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_ROAS', index=15, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_SPEND', index=16, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=151,
  serialized_end=503,
)
_sym_db.RegisterEnumDescriptor(_BIDDINGSTRATEGYTYPEENUM_BIDDINGSTRATEGYTYPE)


_BIDDINGSTRATEGYTYPEENUM = _descriptor.Descriptor(
  name='BiddingStrategyTypeEnum',
  full_name='google.ads.googleads.v3.enums.BiddingStrategyTypeEnum',
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
    _BIDDINGSTRATEGYTYPEENUM_BIDDINGSTRATEGYTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=123,
  serialized_end=503,
)

_BIDDINGSTRATEGYTYPEENUM_BIDDINGSTRATEGYTYPE.containing_type = _BIDDINGSTRATEGYTYPEENUM
DESCRIPTOR.message_types_by_name['BiddingStrategyTypeEnum'] = _BIDDINGSTRATEGYTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BiddingStrategyTypeEnum = _reflection.GeneratedProtocolMessageType('BiddingStrategyTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _BIDDINGSTRATEGYTYPEENUM,
  '__module__' : 'google.ads.googleads.v3.enums.bidding_strategy_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.BiddingStrategyTypeEnum)
  })
_sym_db.RegisterMessage(BiddingStrategyTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
