# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/errors/feed_item_set_link_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/errors/feed_item_set_link_error.proto',
  package='google.ads.googleads.v7.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.errorsB\031FeedItemSetLinkErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Errors\312\002\036Google\\Ads\\GoogleAds\\V7\\Errors\352\002\"Google::Ads::GoogleAds::V7::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v7/errors/feed_item_set_link_error.proto\x12\x1egoogle.ads.googleads.v7.errors\x1a\x1cgoogle/api/annotations.proto\"\x8d\x01\n\x18\x46\x65\x65\x64ItemSetLinkErrorEnum\"q\n\x14\x46\x65\x65\x64ItemSetLinkError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x14\n\x10\x46\x45\x45\x44_ID_MISMATCH\x10\x02\x12%\n!NO_MUTATE_ALLOWED_FOR_DYNAMIC_SET\x10\x03\x42\xf4\x01\n\"com.google.ads.googleads.v7.errorsB\x19\x46\x65\x65\x64ItemSetLinkErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Errors\xea\x02\"Google::Ads::GoogleAds::V7::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FEEDITEMSETLINKERRORENUM_FEEDITEMSETLINKERROR = _descriptor.EnumDescriptor(
  name='FeedItemSetLinkError',
  full_name='google.ads.googleads.v7.errors.FeedItemSetLinkErrorEnum.FeedItemSetLinkError',
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
      name='FEED_ID_MISMATCH', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NO_MUTATE_ALLOWED_FOR_DYNAMIC_SET', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=156,
  serialized_end=269,
)
_sym_db.RegisterEnumDescriptor(_FEEDITEMSETLINKERRORENUM_FEEDITEMSETLINKERROR)


_FEEDITEMSETLINKERRORENUM = _descriptor.Descriptor(
  name='FeedItemSetLinkErrorEnum',
  full_name='google.ads.googleads.v7.errors.FeedItemSetLinkErrorEnum',
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
    _FEEDITEMSETLINKERRORENUM_FEEDITEMSETLINKERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=128,
  serialized_end=269,
)

_FEEDITEMSETLINKERRORENUM_FEEDITEMSETLINKERROR.containing_type = _FEEDITEMSETLINKERRORENUM
DESCRIPTOR.message_types_by_name['FeedItemSetLinkErrorEnum'] = _FEEDITEMSETLINKERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedItemSetLinkErrorEnum = _reflection.GeneratedProtocolMessageType('FeedItemSetLinkErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMSETLINKERRORENUM,
  '__module__' : 'google.ads.googleads.v7.errors.feed_item_set_link_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.errors.FeedItemSetLinkErrorEnum)
  })
_sym_db.RegisterMessage(FeedItemSetLinkErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
