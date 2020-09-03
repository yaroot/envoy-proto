# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/errors/campaign_budget_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/errors/campaign_budget_error.proto',
  package='google.ads.googleads.v5.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v5.errorsB\030CampaignBudgetErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v5/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V5.Errors\312\002\036Google\\Ads\\GoogleAds\\V5\\Errors\352\002\"Google::Ads::GoogleAds::V5::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v5/errors/campaign_budget_error.proto\x12\x1egoogle.ads.googleads.v5.errors\x1a\x1cgoogle/api/annotations.proto\"\x9f\x06\n\x17\x43\x61mpaignBudgetErrorEnum\"\x83\x06\n\x13\x43\x61mpaignBudgetError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12$\n CAMPAIGN_BUDGET_CANNOT_BE_SHARED\x10\x11\x12\x1b\n\x17\x43\x41MPAIGN_BUDGET_REMOVED\x10\x02\x12\x1a\n\x16\x43\x41MPAIGN_BUDGET_IN_USE\x10\x03\x12(\n$CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE\x10\x04\x12<\n8CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET\x10\x06\x12\x36\n2CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED\x10\x07\x12\x43\n?CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME\x10\x08\x12\x36\n2CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED\x10\t\x12H\nDCANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS\x10\n\x12\x12\n\x0e\x44UPLICATE_NAME\x10\x0b\x12\"\n\x1eMONEY_AMOUNT_IN_WRONG_CURRENCY\x10\x0c\x12/\n+MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC\x10\r\x12\x1a\n\x16MONEY_AMOUNT_TOO_LARGE\x10\x0e\x12\x19\n\x15NEGATIVE_MONEY_AMOUNT\x10\x0f\x12)\n%NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT\x10\x10\x12=\n9TOTAL_BUDGET_AMOUNT_MUST_BE_UNSET_FOR_BUDGET_PERIOD_DAILY\x10\x12\x42\xf3\x01\n\"com.google.ads.googleads.v5.errorsB\x18\x43\x61mpaignBudgetErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v5/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V5.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V5\\Errors\xea\x02\"Google::Ads::GoogleAds::V5::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CAMPAIGNBUDGETERRORENUM_CAMPAIGNBUDGETERROR = _descriptor.EnumDescriptor(
  name='CampaignBudgetError',
  full_name='google.ads.googleads.v5.errors.CampaignBudgetErrorEnum.CampaignBudgetError',
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
      name='CAMPAIGN_BUDGET_CANNOT_BE_SHARED', index=2, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_BUDGET_REMOVED', index=3, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_BUDGET_IN_USE', index=4, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_BUDGET_PERIOD_NOT_AVAILABLE', index=5, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CAMPAIGN_BUDGET', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_IMPLICITLY_SHARED', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED_WITHOUT_NAME', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_SHARED', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BUDGET_WITH_MULTIPLE_CAMPAIGNS', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_NAME', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MONEY_AMOUNT_IN_WRONG_CURRENCY', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MONEY_AMOUNT_TOO_LARGE', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NEGATIVE_MONEY_AMOUNT', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOTAL_BUDGET_AMOUNT_MUST_BE_UNSET_FOR_BUDGET_PERIOD_DAILY', index=17, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=153,
  serialized_end=924,
)
_sym_db.RegisterEnumDescriptor(_CAMPAIGNBUDGETERRORENUM_CAMPAIGNBUDGETERROR)


_CAMPAIGNBUDGETERRORENUM = _descriptor.Descriptor(
  name='CampaignBudgetErrorEnum',
  full_name='google.ads.googleads.v5.errors.CampaignBudgetErrorEnum',
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
    _CAMPAIGNBUDGETERRORENUM_CAMPAIGNBUDGETERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=125,
  serialized_end=924,
)

_CAMPAIGNBUDGETERRORENUM_CAMPAIGNBUDGETERROR.containing_type = _CAMPAIGNBUDGETERRORENUM
DESCRIPTOR.message_types_by_name['CampaignBudgetErrorEnum'] = _CAMPAIGNBUDGETERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CampaignBudgetErrorEnum = _reflection.GeneratedProtocolMessageType('CampaignBudgetErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNBUDGETERRORENUM,
  '__module__' : 'google.ads.googleads.v5.errors.campaign_budget_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.errors.CampaignBudgetErrorEnum)
  })
_sym_db.RegisterMessage(CampaignBudgetErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
