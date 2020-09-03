# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/ad_group_criterion_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/ad_group_criterion_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\032AdGroupCriterionErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v4/errors/ad_group_criterion_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\xe0\t\n\x19\x41\x64GroupCriterionErrorEnum\"\xc2\t\n\x15\x41\x64GroupCriterionError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12+\n\'AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST\x10\x02\x12+\n\'AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS\x10\x03\x12*\n&CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION\x10\x04\x12\x17\n\x13TOO_MANY_OPERATIONS\x10\x05\x12\x18\n\x14\x43\x41NT_UPDATE_NEGATIVE\x10\x06\x12\x1a\n\x16\x43ONCRETE_TYPE_REQUIRED\x10\x07\x12!\n\x1d\x42ID_INCOMPATIBLE_WITH_ADGROUP\x10\x08\x12\x1d\n\x19\x43\x41NNOT_TARGET_AND_EXCLUDE\x10\t\x12\x0f\n\x0bILLEGAL_URL\x10\n\x12\x18\n\x14INVALID_KEYWORD_TEXT\x10\x0b\x12\x1b\n\x17INVALID_DESTINATION_URL\x10\x0c\x12\x1f\n\x1bMISSING_DESTINATION_URL_TAG\x10\r\x12\x31\n-KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM\x10\x0e\x12\x17\n\x13INVALID_USER_STATUS\x10\x0f\x12\x1c\n\x18\x43\x41NNOT_ADD_CRITERIA_TYPE\x10\x10\x12 \n\x1c\x43\x41NNOT_EXCLUDE_CRITERIA_TYPE\x10\x11\x12\x35\n1CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE\x10\x1b\x12-\n)OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS\x10\x1c\x12\x34\n0CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS\x10\x1d\x12!\n\x1d\x43\x41NNOT_SET_WITHOUT_FINAL_URLS\x10\x1e\x12\x36\n2CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST\x10\x1f\x12\x33\n/CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST\x10 \x12;\n7CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS\x10!\x12:\n6CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST\x10\"\x12\x32\n.CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS\x10#\x12=\n9CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE\x10$\x12/\n+FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE\x10%\x12\x36\n2FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE\x10&B\xf5\x01\n\"com.google.ads.googleads.v4.errorsB\x1a\x41\x64GroupCriterionErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADGROUPCRITERIONERRORENUM_ADGROUPCRITERIONERROR = _descriptor.EnumDescriptor(
  name='AdGroupCriterionError',
  full_name='google.ads.googleads.v4.errors.AdGroupCriterionErrorEnum.AdGroupCriterionError',
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
      name='AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_OPERATIONS', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANT_UPDATE_NEGATIVE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CONCRETE_TYPE_REQUIRED', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_INCOMPATIBLE_WITH_ADGROUP', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_TARGET_AND_EXCLUDE', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ILLEGAL_URL', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_KEYWORD_TEXT', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_DESTINATION_URL', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_DESTINATION_URL_TAG', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_USER_STATUS', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_CRITERIA_TYPE', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_EXCLUDE_CRITERIA_TYPE', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE', index=18, number=27,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS', index=19, number=28,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS', index=20, number=29,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_SET_WITHOUT_FINAL_URLS', index=21, number=30,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST', index=22, number=31,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST', index=23, number=32,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS', index=24, number=33,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST', index=25, number=34,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS', index=26, number=35,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE', index=27, number=36,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE', index=28, number=37,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE', index=29, number=38,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=158,
  serialized_end=1376,
)
_sym_db.RegisterEnumDescriptor(_ADGROUPCRITERIONERRORENUM_ADGROUPCRITERIONERROR)


_ADGROUPCRITERIONERRORENUM = _descriptor.Descriptor(
  name='AdGroupCriterionErrorEnum',
  full_name='google.ads.googleads.v4.errors.AdGroupCriterionErrorEnum',
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
    _ADGROUPCRITERIONERRORENUM_ADGROUPCRITERIONERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=128,
  serialized_end=1376,
)

_ADGROUPCRITERIONERRORENUM_ADGROUPCRITERIONERROR.containing_type = _ADGROUPCRITERIONERRORENUM
DESCRIPTOR.message_types_by_name['AdGroupCriterionErrorEnum'] = _ADGROUPCRITERIONERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupCriterionErrorEnum = _reflection.GeneratedProtocolMessageType('AdGroupCriterionErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPCRITERIONERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.ad_group_criterion_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.AdGroupCriterionErrorEnum)
  })
_sym_db.RegisterMessage(AdGroupCriterionErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
