# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/ad_sharing_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/ad_sharing_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\023AdSharingErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v4/errors/ad_sharing_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\xa9\x01\n\x12\x41\x64SharingErrorEnum\"\x92\x01\n\x0e\x41\x64SharingError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12 \n\x1c\x41\x44_GROUP_ALREADY_CONTAINS_AD\x10\x02\x12\"\n\x1eINCOMPATIBLE_AD_UNDER_AD_GROUP\x10\x03\x12\x1c\n\x18\x43\x41NNOT_SHARE_INACTIVE_AD\x10\x04\x42\xee\x01\n\"com.google.ads.googleads.v4.errorsB\x13\x41\x64SharingErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_ADSHARINGERRORENUM_ADSHARINGERROR = _descriptor.EnumDescriptor(
  name='AdSharingError',
  full_name='google.ads.googleads.v4.errors.AdSharingErrorEnum.AdSharingError',
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
      name='AD_GROUP_ALREADY_CONTAINS_AD', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INCOMPATIBLE_AD_UNDER_AD_GROUP', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_SHARE_INACTIVE_AD', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=143,
  serialized_end=289,
)
_sym_db.RegisterEnumDescriptor(_ADSHARINGERRORENUM_ADSHARINGERROR)


_ADSHARINGERRORENUM = _descriptor.Descriptor(
  name='AdSharingErrorEnum',
  full_name='google.ads.googleads.v4.errors.AdSharingErrorEnum',
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
    _ADSHARINGERRORENUM_ADSHARINGERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=120,
  serialized_end=289,
)

_ADSHARINGERRORENUM_ADSHARINGERROR.containing_type = _ADSHARINGERRORENUM
DESCRIPTOR.message_types_by_name['AdSharingErrorEnum'] = _ADSHARINGERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdSharingErrorEnum = _reflection.GeneratedProtocolMessageType('AdSharingErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _ADSHARINGERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.ad_sharing_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.AdSharingErrorEnum)
  })
_sym_db.RegisterMessage(AdSharingErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
