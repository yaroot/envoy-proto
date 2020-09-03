# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/callout_placeholder_field.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/callout_placeholder_field.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB\034CalloutPlaceholderFieldProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=google/ads/googleads/v2/enums/callout_placeholder_field.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"h\n\x1b\x43\x61lloutPlaceholderFieldEnum\"I\n\x17\x43\x61lloutPlaceholderField\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x10\n\x0c\x43\x41LLOUT_TEXT\x10\x02\x42\xf1\x01\n!com.google.ads.googleads.v2.enumsB\x1c\x43\x61lloutPlaceholderFieldProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CALLOUTPLACEHOLDERFIELDENUM_CALLOUTPLACEHOLDERFIELD = _descriptor.EnumDescriptor(
  name='CalloutPlaceholderField',
  full_name='google.ads.googleads.v2.enums.CalloutPlaceholderFieldEnum.CalloutPlaceholderField',
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
      name='CALLOUT_TEXT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=157,
  serialized_end=230,
)
_sym_db.RegisterEnumDescriptor(_CALLOUTPLACEHOLDERFIELDENUM_CALLOUTPLACEHOLDERFIELD)


_CALLOUTPLACEHOLDERFIELDENUM = _descriptor.Descriptor(
  name='CalloutPlaceholderFieldEnum',
  full_name='google.ads.googleads.v2.enums.CalloutPlaceholderFieldEnum',
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
    _CALLOUTPLACEHOLDERFIELDENUM_CALLOUTPLACEHOLDERFIELD,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=126,
  serialized_end=230,
)

_CALLOUTPLACEHOLDERFIELDENUM_CALLOUTPLACEHOLDERFIELD.containing_type = _CALLOUTPLACEHOLDERFIELDENUM
DESCRIPTOR.message_types_by_name['CalloutPlaceholderFieldEnum'] = _CALLOUTPLACEHOLDERFIELDENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CalloutPlaceholderFieldEnum = _reflection.GeneratedProtocolMessageType('CalloutPlaceholderFieldEnum', (_message.Message,), {
  'DESCRIPTOR' : _CALLOUTPLACEHOLDERFIELDENUM,
  '__module__' : 'google.ads.googleads.v2.enums.callout_placeholder_field_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.CalloutPlaceholderFieldEnum)
  })
_sym_db.RegisterMessage(CalloutPlaceholderFieldEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
