# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/keyword_plan_aggregate_metric_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/keyword_plan_aggregate_metric_type.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB#KeywordPlanAggregateMetricTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nFgoogle/ads/googleads/v8/enums/keyword_plan_aggregate_metric_type.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"p\n\"KeywordPlanAggregateMetricTypeEnum\"J\n\x1eKeywordPlanAggregateMetricType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\n\n\x06\x44\x45VICE\x10\x02\x42\xf8\x01\n!com.google.ads.googleads.v8.enumsB#KeywordPlanAggregateMetricTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_KEYWORDPLANAGGREGATEMETRICTYPEENUM_KEYWORDPLANAGGREGATEMETRICTYPE = _descriptor.EnumDescriptor(
  name='KeywordPlanAggregateMetricType',
  full_name='google.ads.googleads.v8.enums.KeywordPlanAggregateMetricTypeEnum.KeywordPlanAggregateMetricType',
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
      name='DEVICE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=173,
  serialized_end=247,
)
_sym_db.RegisterEnumDescriptor(_KEYWORDPLANAGGREGATEMETRICTYPEENUM_KEYWORDPLANAGGREGATEMETRICTYPE)


_KEYWORDPLANAGGREGATEMETRICTYPEENUM = _descriptor.Descriptor(
  name='KeywordPlanAggregateMetricTypeEnum',
  full_name='google.ads.googleads.v8.enums.KeywordPlanAggregateMetricTypeEnum',
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
    _KEYWORDPLANAGGREGATEMETRICTYPEENUM_KEYWORDPLANAGGREGATEMETRICTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=135,
  serialized_end=247,
)

_KEYWORDPLANAGGREGATEMETRICTYPEENUM_KEYWORDPLANAGGREGATEMETRICTYPE.containing_type = _KEYWORDPLANAGGREGATEMETRICTYPEENUM
DESCRIPTOR.message_types_by_name['KeywordPlanAggregateMetricTypeEnum'] = _KEYWORDPLANAGGREGATEMETRICTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlanAggregateMetricTypeEnum = _reflection.GeneratedProtocolMessageType('KeywordPlanAggregateMetricTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANAGGREGATEMETRICTYPEENUM,
  '__module__' : 'google.ads.googleads.v8.enums.keyword_plan_aggregate_metric_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.KeywordPlanAggregateMetricTypeEnum)
  })
_sym_db.RegisterMessage(KeywordPlanAggregateMetricTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
