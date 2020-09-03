# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/enums/budget_period.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/enums/budget_period.proto',
  package='google.ads.googleads.v3.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v3.enumsB\021BudgetPeriodProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v3/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V3.Enums\312\002\035Google\\Ads\\GoogleAds\\V3\\Enums\352\002!Google::Ads::GoogleAds::V3::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/ads/googleads/v3/enums/budget_period.proto\x12\x1dgoogle.ads.googleads.v3.enums\x1a\x1cgoogle/api/annotations.proto\"K\n\x10\x42udgetPeriodEnum\"7\n\x0c\x42udgetPeriod\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\t\n\x05\x44\x41ILY\x10\x02\x42\xe6\x01\n!com.google.ads.googleads.v3.enumsB\x11\x42udgetPeriodProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v3/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V3.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V3\\Enums\xea\x02!Google::Ads::GoogleAds::V3::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_BUDGETPERIODENUM_BUDGETPERIOD = _descriptor.EnumDescriptor(
  name='BudgetPeriod',
  full_name='google.ads.googleads.v3.enums.BudgetPeriodEnum.BudgetPeriod',
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
      name='DAILY', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=134,
  serialized_end=189,
)
_sym_db.RegisterEnumDescriptor(_BUDGETPERIODENUM_BUDGETPERIOD)


_BUDGETPERIODENUM = _descriptor.Descriptor(
  name='BudgetPeriodEnum',
  full_name='google.ads.googleads.v3.enums.BudgetPeriodEnum',
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
    _BUDGETPERIODENUM_BUDGETPERIOD,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=114,
  serialized_end=189,
)

_BUDGETPERIODENUM_BUDGETPERIOD.containing_type = _BUDGETPERIODENUM
DESCRIPTOR.message_types_by_name['BudgetPeriodEnum'] = _BUDGETPERIODENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BudgetPeriodEnum = _reflection.GeneratedProtocolMessageType('BudgetPeriodEnum', (_message.Message,), {
  'DESCRIPTOR' : _BUDGETPERIODENUM,
  '__module__' : 'google.ads.googleads.v3.enums.budget_period_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.enums.BudgetPeriodEnum)
  })
_sym_db.RegisterMessage(BudgetPeriodEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
