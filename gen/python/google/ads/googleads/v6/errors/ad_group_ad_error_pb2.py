# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/errors/ad_group_ad_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/errors/ad_group_ad_error.proto',
  package='google.ads.googleads.v6.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v6.errorsB\023AdGroupAdErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V6.Errors\312\002\036Google\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::Ads::GoogleAds::V6::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v6/errors/ad_group_ad_error.proto\x12\x1egoogle.ads.googleads.v6.errors\x1a\x1cgoogle/api/annotations.proto\"\x89\x03\n\x12\x41\x64GroupAdErrorEnum\"\xf2\x02\n\x0e\x41\x64GroupAdError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12$\n AD_GROUP_AD_LABEL_DOES_NOT_EXIST\x10\x02\x12$\n AD_GROUP_AD_LABEL_ALREADY_EXISTS\x10\x03\x12\x18\n\x14\x41\x44_NOT_UNDER_ADGROUP\x10\x04\x12\'\n#CANNOT_OPERATE_ON_REMOVED_ADGROUPAD\x10\x05\x12 \n\x1c\x43\x41NNOT_CREATE_DEPRECATED_ADS\x10\x06\x12\x1a\n\x16\x43\x41NNOT_CREATE_TEXT_ADS\x10\x07\x12\x0f\n\x0b\x45MPTY_FIELD\x10\x08\x12\'\n#RESOURCE_REFERENCED_IN_MULTIPLE_OPS\x10\t\x12\x1c\n\x18\x41\x44_TYPE_CANNOT_BE_PAUSED\x10\n\x12\x1d\n\x19\x41\x44_TYPE_CANNOT_BE_REMOVED\x10\x0b\x42\xee\x01\n\"com.google.ads.googleads.v6.errorsB\x13\x41\x64GroupAdErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v6/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V6.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V6\\Errors\xea\x02\"Google::Ads::GoogleAds::V6::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADGROUPADERRORENUM_ADGROUPADERROR = _descriptor.EnumDescriptor(
  name='AdGroupAdError',
  full_name='google.ads.googleads.v6.errors.AdGroupAdErrorEnum.AdGroupAdError',
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
      name='AD_GROUP_AD_LABEL_DOES_NOT_EXIST', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_GROUP_AD_LABEL_ALREADY_EXISTS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_NOT_UNDER_ADGROUP', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_OPERATE_ON_REMOVED_ADGROUPAD', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_CREATE_DEPRECATED_ADS', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_CREATE_TEXT_ADS', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EMPTY_FIELD', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESOURCE_REFERENCED_IN_MULTIPLE_OPS', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_TYPE_CANNOT_BE_PAUSED', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_TYPE_CANNOT_BE_REMOVED', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=144,
  serialized_end=514,
)
_sym_db.RegisterEnumDescriptor(_ADGROUPADERRORENUM_ADGROUPADERROR)


_ADGROUPADERRORENUM = _descriptor.Descriptor(
  name='AdGroupAdErrorEnum',
  full_name='google.ads.googleads.v6.errors.AdGroupAdErrorEnum',
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
    _ADGROUPADERRORENUM_ADGROUPADERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=121,
  serialized_end=514,
)

_ADGROUPADERRORENUM_ADGROUPADERROR.containing_type = _ADGROUPADERRORENUM
DESCRIPTOR.message_types_by_name['AdGroupAdErrorEnum'] = _ADGROUPADERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupAdErrorEnum = _reflection.GeneratedProtocolMessageType('AdGroupAdErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPADERRORENUM,
  '__module__' : 'google.ads.googleads.v6.errors.ad_group_ad_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.errors.AdGroupAdErrorEnum)
  })
_sym_db.RegisterMessage(AdGroupAdErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)