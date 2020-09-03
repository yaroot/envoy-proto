# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/feed_attribute_reference_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/feed_attribute_reference_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB FeedAttributeReferenceErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v4/errors/feed_attribute_reference_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\xba\x01\n\x1f\x46\x65\x65\x64\x41ttributeReferenceErrorEnum\"\x96\x01\n\x1b\x46\x65\x65\x64\x41ttributeReferenceError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12!\n\x1d\x43\x41NNOT_REFERENCE_REMOVED_FEED\x10\x02\x12\x15\n\x11INVALID_FEED_NAME\x10\x03\x12\x1f\n\x1bINVALID_FEED_ATTRIBUTE_NAME\x10\x04\x42\xfb\x01\n\"com.google.ads.googleads.v4.errorsB FeedAttributeReferenceErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_FEEDATTRIBUTEREFERENCEERRORENUM_FEEDATTRIBUTEREFERENCEERROR = _descriptor.EnumDescriptor(
  name='FeedAttributeReferenceError',
  full_name='google.ads.googleads.v4.errors.FeedAttributeReferenceErrorEnum.FeedAttributeReferenceError',
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
      name='CANNOT_REFERENCE_REMOVED_FEED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FEED_NAME', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FEED_ATTRIBUTE_NAME', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=170,
  serialized_end=320,
)
_sym_db.RegisterEnumDescriptor(_FEEDATTRIBUTEREFERENCEERRORENUM_FEEDATTRIBUTEREFERENCEERROR)


_FEEDATTRIBUTEREFERENCEERRORENUM = _descriptor.Descriptor(
  name='FeedAttributeReferenceErrorEnum',
  full_name='google.ads.googleads.v4.errors.FeedAttributeReferenceErrorEnum',
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
    _FEEDATTRIBUTEREFERENCEERRORENUM_FEEDATTRIBUTEREFERENCEERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=134,
  serialized_end=320,
)

_FEEDATTRIBUTEREFERENCEERRORENUM_FEEDATTRIBUTEREFERENCEERROR.containing_type = _FEEDATTRIBUTEREFERENCEERRORENUM
DESCRIPTOR.message_types_by_name['FeedAttributeReferenceErrorEnum'] = _FEEDATTRIBUTEREFERENCEERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedAttributeReferenceErrorEnum = _reflection.GeneratedProtocolMessageType('FeedAttributeReferenceErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _FEEDATTRIBUTEREFERENCEERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.feed_attribute_reference_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.FeedAttributeReferenceErrorEnum)
  })
_sym_db.RegisterMessage(FeedAttributeReferenceErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
