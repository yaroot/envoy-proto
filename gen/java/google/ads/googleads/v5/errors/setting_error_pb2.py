# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/errors/setting_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/errors/setting_error.proto',
  package='google.ads.googleads.v5.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v5.errorsB\021SettingErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v5/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V5.Errors\312\002\036Google\\Ads\\GoogleAds\\V5\\Errors\352\002\"Google::Ads::GoogleAds::V5::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/ads/googleads/v5/errors/setting_error.proto\x12\x1egoogle.ads.googleads.v5.errors\x1a\x1cgoogle/api/annotations.proto\"\xed\x05\n\x10SettingErrorEnum\"\xd8\x05\n\x0cSettingError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12!\n\x1dSETTING_TYPE_IS_NOT_AVAILABLE\x10\x03\x12\x30\n,SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN\x10\x04\x12;\n7TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP\x10\x05\x12Q\nMTARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL\x10\x06\x12\\\nXTARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP\x10\x07\x12\x43\n?DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT\x10\x08\x12;\n7DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME\x10\t\x12\x36\n2DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME\x10\n\x12=\n9DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE\x10\x0b\x12>\n:TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN\x10\x0c\x12.\n*SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN\x10\x14\x42\xec\x01\n\"com.google.ads.googleads.v5.errorsB\x11SettingErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v5/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V5.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V5\\Errors\xea\x02\"Google::Ads::GoogleAds::V5::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_SETTINGERRORENUM_SETTINGERROR = _descriptor.EnumDescriptor(
  name='SettingError',
  full_name='google.ads.googleads.v5.errors.SettingErrorEnum.SettingError',
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
      name='SETTING_TYPE_IS_NOT_AVAILABLE', index=2, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN', index=3, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP', index=4, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL', index=5, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP', index=6, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT', index=7, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME', index=8, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME', index=9, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE', index=10, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN', index=11, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SETTING_VALUE_NOT_COMPATIBLE_WITH_CAMPAIGN', index=12, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=138,
  serialized_end=866,
)
_sym_db.RegisterEnumDescriptor(_SETTINGERRORENUM_SETTINGERROR)


_SETTINGERRORENUM = _descriptor.Descriptor(
  name='SettingErrorEnum',
  full_name='google.ads.googleads.v5.errors.SettingErrorEnum',
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
    _SETTINGERRORENUM_SETTINGERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=117,
  serialized_end=866,
)

_SETTINGERRORENUM_SETTINGERROR.containing_type = _SETTINGERRORENUM
DESCRIPTOR.message_types_by_name['SettingErrorEnum'] = _SETTINGERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SettingErrorEnum = _reflection.GeneratedProtocolMessageType('SettingErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _SETTINGERRORENUM,
  '__module__' : 'google.ads.googleads.v5.errors.setting_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.errors.SettingErrorEnum)
  })
_sym_db.RegisterMessage(SettingErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
