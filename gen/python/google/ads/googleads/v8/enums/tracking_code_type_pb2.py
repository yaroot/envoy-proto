# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/tracking_code_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/tracking_code_type.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\025TrackingCodeTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/ads/googleads/v8/enums/tracking_code_type.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\x8f\x01\n\x14TrackingCodeTypeEnum\"w\n\x10TrackingCodeType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0b\n\x07WEBPAGE\x10\x02\x12\x13\n\x0fWEBPAGE_ONCLICK\x10\x03\x12\x11\n\rCLICK_TO_CALL\x10\x04\x12\x10\n\x0cWEBSITE_CALL\x10\x05\x42\xea\x01\n!com.google.ads.googleads.v8.enumsB\x15TrackingCodeTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_TRACKINGCODETYPEENUM_TRACKINGCODETYPE = _descriptor.EnumDescriptor(
  name='TrackingCodeType',
  full_name='google.ads.googleads.v8.enums.TrackingCodeTypeEnum.TrackingCodeType',
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
      name='WEBPAGE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBPAGE_ONCLICK', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLICK_TO_CALL', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEBSITE_CALL', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=144,
  serialized_end=263,
)
_sym_db.RegisterEnumDescriptor(_TRACKINGCODETYPEENUM_TRACKINGCODETYPE)


_TRACKINGCODETYPEENUM = _descriptor.Descriptor(
  name='TrackingCodeTypeEnum',
  full_name='google.ads.googleads.v8.enums.TrackingCodeTypeEnum',
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
    _TRACKINGCODETYPEENUM_TRACKINGCODETYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=120,
  serialized_end=263,
)

_TRACKINGCODETYPEENUM_TRACKINGCODETYPE.containing_type = _TRACKINGCODETYPEENUM
DESCRIPTOR.message_types_by_name['TrackingCodeTypeEnum'] = _TRACKINGCODETYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TrackingCodeTypeEnum = _reflection.GeneratedProtocolMessageType('TrackingCodeTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _TRACKINGCODETYPEENUM,
  '__module__' : 'google.ads.googleads.v8.enums.tracking_code_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.TrackingCodeTypeEnum)
  })
_sym_db.RegisterMessage(TrackingCodeTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
