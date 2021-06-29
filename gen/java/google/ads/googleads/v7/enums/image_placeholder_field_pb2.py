# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/image_placeholder_field.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/image_placeholder_field.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\032ImagePlaceholderFieldProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;google/ads/googleads/v7/enums/image_placeholder_field.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"`\n\x19ImagePlaceholderFieldEnum\"C\n\x15ImagePlaceholderField\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08\x41SSET_ID\x10\x02\x42\xef\x01\n!com.google.ads.googleads.v7.enumsB\x1aImagePlaceholderFieldProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_IMAGEPLACEHOLDERFIELDENUM_IMAGEPLACEHOLDERFIELD = _descriptor.EnumDescriptor(
  name='ImagePlaceholderField',
  full_name='google.ads.googleads.v7.enums.ImagePlaceholderFieldEnum.ImagePlaceholderField',
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
      name='ASSET_ID', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=153,
  serialized_end=220,
)
_sym_db.RegisterEnumDescriptor(_IMAGEPLACEHOLDERFIELDENUM_IMAGEPLACEHOLDERFIELD)


_IMAGEPLACEHOLDERFIELDENUM = _descriptor.Descriptor(
  name='ImagePlaceholderFieldEnum',
  full_name='google.ads.googleads.v7.enums.ImagePlaceholderFieldEnum',
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
    _IMAGEPLACEHOLDERFIELDENUM_IMAGEPLACEHOLDERFIELD,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=220,
)

_IMAGEPLACEHOLDERFIELDENUM_IMAGEPLACEHOLDERFIELD.containing_type = _IMAGEPLACEHOLDERFIELDENUM
DESCRIPTOR.message_types_by_name['ImagePlaceholderFieldEnum'] = _IMAGEPLACEHOLDERFIELDENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ImagePlaceholderFieldEnum = _reflection.GeneratedProtocolMessageType('ImagePlaceholderFieldEnum', (_message.Message,), {
  'DESCRIPTOR' : _IMAGEPLACEHOLDERFIELDENUM,
  '__module__' : 'google.ads.googleads.v7.enums.image_placeholder_field_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.ImagePlaceholderFieldEnum)
  })
_sym_db.RegisterMessage(ImagePlaceholderFieldEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
