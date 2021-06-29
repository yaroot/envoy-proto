# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/criterion_category_channel_availability_mode.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/criterion_category_channel_availability_mode.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB-CriterionCategoryChannelAvailabilityModeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nPgoogle/ads/googleads/v7/enums/criterion_category_channel_availability_mode.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\xd4\x01\n,CriterionCategoryChannelAvailabilityModeEnum\"\xa3\x01\n(CriterionCategoryChannelAvailabilityMode\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x10\n\x0c\x41LL_CHANNELS\x10\x02\x12!\n\x1d\x43HANNEL_TYPE_AND_ALL_SUBTYPES\x10\x03\x12$\n CHANNEL_TYPE_AND_SUBSET_SUBTYPES\x10\x04\x42\x82\x02\n!com.google.ads.googleads.v7.enumsB-CriterionCategoryChannelAvailabilityModeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM_CRITERIONCATEGORYCHANNELAVAILABILITYMODE = _descriptor.EnumDescriptor(
  name='CriterionCategoryChannelAvailabilityMode',
  full_name='google.ads.googleads.v7.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode',
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
      name='ALL_CHANNELS', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CHANNEL_TYPE_AND_ALL_SUBTYPES', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CHANNEL_TYPE_AND_SUBSET_SUBTYPES', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=195,
  serialized_end=358,
)
_sym_db.RegisterEnumDescriptor(_CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM_CRITERIONCATEGORYCHANNELAVAILABILITYMODE)


_CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM = _descriptor.Descriptor(
  name='CriterionCategoryChannelAvailabilityModeEnum',
  full_name='google.ads.googleads.v7.enums.CriterionCategoryChannelAvailabilityModeEnum',
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
    _CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM_CRITERIONCATEGORYCHANNELAVAILABILITYMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=146,
  serialized_end=358,
)

_CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM_CRITERIONCATEGORYCHANNELAVAILABILITYMODE.containing_type = _CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM
DESCRIPTOR.message_types_by_name['CriterionCategoryChannelAvailabilityModeEnum'] = _CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CriterionCategoryChannelAvailabilityModeEnum = _reflection.GeneratedProtocolMessageType('CriterionCategoryChannelAvailabilityModeEnum', (_message.Message,), {
  'DESCRIPTOR' : _CRITERIONCATEGORYCHANNELAVAILABILITYMODEENUM,
  '__module__' : 'google.ads.googleads.v7.enums.criterion_category_channel_availability_mode_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.CriterionCategoryChannelAvailabilityModeEnum)
  })
_sym_db.RegisterMessage(CriterionCategoryChannelAvailabilityModeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
