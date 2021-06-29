# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/placeholder_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/placeholder_type.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\024PlaceholderTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v8/enums/placeholder_type.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\x9b\x03\n\x13PlaceholderTypeEnum\"\x83\x03\n\x0fPlaceholderType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0c\n\x08SITELINK\x10\x02\x12\x08\n\x04\x43\x41LL\x10\x03\x12\x07\n\x03\x41PP\x10\x04\x12\x0c\n\x08LOCATION\x10\x05\x12\x16\n\x12\x41\x46\x46ILIATE_LOCATION\x10\x06\x12\x0b\n\x07\x43\x41LLOUT\x10\x07\x12\x16\n\x12STRUCTURED_SNIPPET\x10\x08\x12\x0b\n\x07MESSAGE\x10\t\x12\t\n\x05PRICE\x10\n\x12\r\n\tPROMOTION\x10\x0b\x12\x11\n\rAD_CUSTOMIZER\x10\x0c\x12\x15\n\x11\x44YNAMIC_EDUCATION\x10\r\x12\x12\n\x0e\x44YNAMIC_FLIGHT\x10\x0e\x12\x12\n\x0e\x44YNAMIC_CUSTOM\x10\x0f\x12\x11\n\rDYNAMIC_HOTEL\x10\x10\x12\x17\n\x13\x44YNAMIC_REAL_ESTATE\x10\x11\x12\x12\n\x0e\x44YNAMIC_TRAVEL\x10\x12\x12\x11\n\rDYNAMIC_LOCAL\x10\x13\x12\x0f\n\x0b\x44YNAMIC_JOB\x10\x14\x12\t\n\x05IMAGE\x10\x15\x42\xe9\x01\n!com.google.ads.googleads.v8.enumsB\x14PlaceholderTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE = _descriptor.EnumDescriptor(
  name='PlaceholderType',
  full_name='google.ads.googleads.v8.enums.PlaceholderTypeEnum.PlaceholderType',
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
      name='SITELINK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CALL', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='APP', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOCATION', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AFFILIATE_LOCATION', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CALLOUT', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STRUCTURED_SNIPPET', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MESSAGE', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PRICE', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROMOTION', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AD_CUSTOMIZER', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_EDUCATION', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_FLIGHT', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_CUSTOM', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_HOTEL', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_REAL_ESTATE', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_TRAVEL', index=18, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_LOCAL', index=19, number=19,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC_JOB', index=20, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='IMAGE', index=21, number=21,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=142,
  serialized_end=529,
)
_sym_db.RegisterEnumDescriptor(_PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE)


_PLACEHOLDERTYPEENUM = _descriptor.Descriptor(
  name='PlaceholderTypeEnum',
  full_name='google.ads.googleads.v8.enums.PlaceholderTypeEnum',
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
    _PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=118,
  serialized_end=529,
)

_PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE.containing_type = _PLACEHOLDERTYPEENUM
DESCRIPTOR.message_types_by_name['PlaceholderTypeEnum'] = _PLACEHOLDERTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PlaceholderTypeEnum = _reflection.GeneratedProtocolMessageType('PlaceholderTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _PLACEHOLDERTYPEENUM,
  '__module__' : 'google.ads.googleads.v8.enums.placeholder_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.PlaceholderTypeEnum)
  })
_sym_db.RegisterMessage(PlaceholderTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
