# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/call_tracking_display_location.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/call_tracking_display_location.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB CallTrackingDisplayLocationProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v8/enums/call_tracking_display_location.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"x\n\x1f\x43\x61llTrackingDisplayLocationEnum\"U\n\x1b\x43\x61llTrackingDisplayLocation\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x06\n\x02\x41\x44\x10\x02\x12\x10\n\x0cLANDING_PAGE\x10\x03\x42\xf5\x01\n!com.google.ads.googleads.v8.enumsB CallTrackingDisplayLocationProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CALLTRACKINGDISPLAYLOCATIONENUM_CALLTRACKINGDISPLAYLOCATION = _descriptor.EnumDescriptor(
  name='CallTrackingDisplayLocation',
  full_name='google.ads.googleads.v8.enums.CallTrackingDisplayLocationEnum.CallTrackingDisplayLocation',
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
      name='AD', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LANDING_PAGE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=166,
  serialized_end=251,
)
_sym_db.RegisterEnumDescriptor(_CALLTRACKINGDISPLAYLOCATIONENUM_CALLTRACKINGDISPLAYLOCATION)


_CALLTRACKINGDISPLAYLOCATIONENUM = _descriptor.Descriptor(
  name='CallTrackingDisplayLocationEnum',
  full_name='google.ads.googleads.v8.enums.CallTrackingDisplayLocationEnum',
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
    _CALLTRACKINGDISPLAYLOCATIONENUM_CALLTRACKINGDISPLAYLOCATION,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=131,
  serialized_end=251,
)

_CALLTRACKINGDISPLAYLOCATIONENUM_CALLTRACKINGDISPLAYLOCATION.containing_type = _CALLTRACKINGDISPLAYLOCATIONENUM
DESCRIPTOR.message_types_by_name['CallTrackingDisplayLocationEnum'] = _CALLTRACKINGDISPLAYLOCATIONENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CallTrackingDisplayLocationEnum = _reflection.GeneratedProtocolMessageType('CallTrackingDisplayLocationEnum', (_message.Message,), {
  'DESCRIPTOR' : _CALLTRACKINGDISPLAYLOCATIONENUM,
  '__module__' : 'google.ads.googleads.v8.enums.call_tracking_display_location_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.CallTrackingDisplayLocationEnum)
  })
_sym_db.RegisterMessage(CallTrackingDisplayLocationEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
