# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/enums/target_cpa_opt_in_recommendation_goal.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/enums/target_cpa_opt_in_recommendation_goal.proto',
  package='google.ads.googleads.v6.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v6.enumsB%TargetCpaOptInRecommendationGoalProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V6.Enums\312\002\035Google\\Ads\\GoogleAds\\V6\\Enums\352\002!Google::Ads::GoogleAds::V6::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nIgoogle/ads/googleads/v6/enums/target_cpa_opt_in_recommendation_goal.proto\x12\x1dgoogle.ads.googleads.v6.enums\x1a\x1cgoogle/api/annotations.proto\"\xad\x01\n$TargetCpaOptInRecommendationGoalEnum\"\x84\x01\n TargetCpaOptInRecommendationGoal\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\r\n\tSAME_COST\x10\x02\x12\x14\n\x10SAME_CONVERSIONS\x10\x03\x12\x0c\n\x08SAME_CPA\x10\x04\x12\x0f\n\x0b\x43LOSEST_CPA\x10\x05\x42\xfa\x01\n!com.google.ads.googleads.v6.enumsB%TargetCpaOptInRecommendationGoalProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V6.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V6\\Enums\xea\x02!Google::Ads::GoogleAds::V6::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_TARGETCPAOPTINRECOMMENDATIONGOALENUM_TARGETCPAOPTINRECOMMENDATIONGOAL = _descriptor.EnumDescriptor(
  name='TargetCpaOptInRecommendationGoal',
  full_name='google.ads.googleads.v6.enums.TargetCpaOptInRecommendationGoalEnum.TargetCpaOptInRecommendationGoal',
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
      name='SAME_COST', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SAME_CONVERSIONS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SAME_CPA', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOSEST_CPA', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=180,
  serialized_end=312,
)
_sym_db.RegisterEnumDescriptor(_TARGETCPAOPTINRECOMMENDATIONGOALENUM_TARGETCPAOPTINRECOMMENDATIONGOAL)


_TARGETCPAOPTINRECOMMENDATIONGOALENUM = _descriptor.Descriptor(
  name='TargetCpaOptInRecommendationGoalEnum',
  full_name='google.ads.googleads.v6.enums.TargetCpaOptInRecommendationGoalEnum',
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
    _TARGETCPAOPTINRECOMMENDATIONGOALENUM_TARGETCPAOPTINRECOMMENDATIONGOAL,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=139,
  serialized_end=312,
)

_TARGETCPAOPTINRECOMMENDATIONGOALENUM_TARGETCPAOPTINRECOMMENDATIONGOAL.containing_type = _TARGETCPAOPTINRECOMMENDATIONGOALENUM
DESCRIPTOR.message_types_by_name['TargetCpaOptInRecommendationGoalEnum'] = _TARGETCPAOPTINRECOMMENDATIONGOALENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TargetCpaOptInRecommendationGoalEnum = _reflection.GeneratedProtocolMessageType('TargetCpaOptInRecommendationGoalEnum', (_message.Message,), {
  'DESCRIPTOR' : _TARGETCPAOPTINRECOMMENDATIONGOALENUM,
  '__module__' : 'google.ads.googleads.v6.enums.target_cpa_opt_in_recommendation_goal_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.enums.TargetCpaOptInRecommendationGoalEnum)
  })
_sym_db.RegisterMessage(TargetCpaOptInRecommendationGoalEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
