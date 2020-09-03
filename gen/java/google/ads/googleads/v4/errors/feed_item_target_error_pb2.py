# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/feed_item_target_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/feed_item_target_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\030FeedItemTargetErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v4/errors/feed_item_target_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\xfc\x02\n\x17\x46\x65\x65\x64ItemTargetErrorEnum\"\xe0\x02\n\x13\x46\x65\x65\x64ItemTargetError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12#\n\x1fMUST_SET_TARGET_ONEOF_ON_CREATE\x10\x02\x12#\n\x1f\x46\x45\x45\x44_ITEM_TARGET_ALREADY_EXISTS\x10\x03\x12&\n\"FEED_ITEM_SCHEDULES_CANNOT_OVERLAP\x10\x04\x12(\n$TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE\x10\x05\x12\x1e\n\x1aTOO_MANY_SCHEDULES_PER_DAY\x10\x06\x12=\n9CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS\x10\x07\x12\x19\n\x15\x44UPLICATE_AD_SCHEDULE\x10\x08\x12\x15\n\x11\x44UPLICATE_KEYWORD\x10\tB\xf3\x01\n\"com.google.ads.googleads.v4.errorsB\x18\x46\x65\x65\x64ItemTargetErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FEEDITEMTARGETERRORENUM_FEEDITEMTARGETERROR = _descriptor.EnumDescriptor(
  name='FeedItemTargetError',
  full_name='google.ads.googleads.v4.errors.FeedItemTargetErrorEnum.FeedItemTargetError',
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
      name='MUST_SET_TARGET_ONEOF_ON_CREATE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED_ITEM_TARGET_ALREADY_EXISTS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED_ITEM_SCHEDULES_CANNOT_OVERLAP', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TARGET_LIMIT_EXCEEDED_FOR_GIVEN_TYPE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_SCHEDULES_PER_DAY', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANNOT_HAVE_ENABLED_CAMPAIGN_AND_ENABLED_AD_GROUP_TARGETS', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_AD_SCHEDULE', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_KEYWORD', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=154,
  serialized_end=506,
)
_sym_db.RegisterEnumDescriptor(_FEEDITEMTARGETERRORENUM_FEEDITEMTARGETERROR)


_FEEDITEMTARGETERRORENUM = _descriptor.Descriptor(
  name='FeedItemTargetErrorEnum',
  full_name='google.ads.googleads.v4.errors.FeedItemTargetErrorEnum',
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
    _FEEDITEMTARGETERRORENUM_FEEDITEMTARGETERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=126,
  serialized_end=506,
)

_FEEDITEMTARGETERRORENUM_FEEDITEMTARGETERROR.containing_type = _FEEDITEMTARGETERRORENUM
DESCRIPTOR.message_types_by_name['FeedItemTargetErrorEnum'] = _FEEDITEMTARGETERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedItemTargetErrorEnum = _reflection.GeneratedProtocolMessageType('FeedItemTargetErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMTARGETERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.feed_item_target_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.FeedItemTargetErrorEnum)
  })
_sym_db.RegisterMessage(FeedItemTargetErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
