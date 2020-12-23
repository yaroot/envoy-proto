# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/errors/ad_group_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/errors/ad_group_error.proto',
  package='google.ads.googleads.v6.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v6.errorsB\021AdGroupErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6.Errors\312\002\036Google\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::Ads::GoogleAds::V6::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/ads/googleads/v6/errors/ad_group_error.proto\x12\x1egoogle.ads.googleads.v6.errors\x1a\x1cgoogle/api/annotations.proto\"\xd9\x04\n\x10\x41\x64GroupErrorEnum\"\xc4\x04\n\x0c\x41\x64GroupError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x1a\n\x16\x44UPLICATE_ADGROUP_NAME\x10\x02\x12\x18\n\x14INVALID_ADGROUP_NAME\x10\x03\x12%\n!ADVERTISER_NOT_ON_CONTENT_NETWORK\x10\x05\x12\x0f\n\x0b\x42ID_TOO_BIG\x10\x06\x12*\n&BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH\x10\x07\x12\x18\n\x14MISSING_ADGROUP_NAME\x10\x08\x12 \n\x1c\x41\x44GROUP_LABEL_DOES_NOT_EXIST\x10\t\x12 \n\x1c\x41\x44GROUP_LABEL_ALREADY_EXISTS\x10\n\x12,\n(INVALID_CONTENT_BID_CRITERION_TYPE_GROUP\x10\x0b\x12\x38\n4AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE\x10\x0c\x12\x39\n5ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY\x10\r\x12\x42\n>CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING\x10\x0e\x12\x37\n3PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER\x10\x0f\x42\xec\x01\n\"com.google.ads.googleads.v6.errorsB\x11\x41\x64GroupErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V6.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V6\\Errors\xea\x02\"Google::Ads::GoogleAds::V6::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADGROUPERRORENUM_ADGROUPERROR = _descriptor.EnumDescriptor(
  name='AdGroupError',
  full_name='google.ads.googleads.v6.errors.AdGroupErrorEnum.AdGroupError',
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
      name='DUPLICATE_ADGROUP_NAME', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_ADGROUP_NAME', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADVERTISER_NOT_ON_CONTENT_NETWORK', index=4, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_TOO_BIG', index=5, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH', index=6, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_ADGROUP_NAME', index=7, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADGROUP_LABEL_DOES_NOT_EXIST', index=8, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADGROUP_LABEL_ALREADY_EXISTS', index=9, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CONTENT_BID_CRITERION_TYPE_GROUP', index=10, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE', index=11, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY', index=12, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING', index=13, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER', index=14, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=139,
  serialized_end=719,
)
_sym_db.RegisterEnumDescriptor(_ADGROUPERRORENUM_ADGROUPERROR)


_ADGROUPERRORENUM = _descriptor.Descriptor(
  name='AdGroupErrorEnum',
  full_name='google.ads.googleads.v6.errors.AdGroupErrorEnum',
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
    _ADGROUPERRORENUM_ADGROUPERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=719,
)

_ADGROUPERRORENUM_ADGROUPERROR.containing_type = _ADGROUPERRORENUM
DESCRIPTOR.message_types_by_name['AdGroupErrorEnum'] = _ADGROUPERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupErrorEnum = _reflection.GeneratedProtocolMessageType('AdGroupErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPERRORENUM,
  '__module__' : 'google.ads.googleads.v6.errors.ad_group_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.errors.AdGroupErrorEnum)
  })
_sym_db.RegisterMessage(AdGroupErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
