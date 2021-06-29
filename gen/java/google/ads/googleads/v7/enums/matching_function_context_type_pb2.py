# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/matching_function_context_type.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/matching_function_context_type.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB MatchingFunctionContextTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v7/enums/matching_function_context_type.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\x97\x01\n\x1fMatchingFunctionContextTypeEnum\"t\n\x1bMatchingFunctionContextType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x10\n\x0c\x46\x45\x45\x44_ITEM_ID\x10\x02\x12\x0f\n\x0b\x44\x45VICE_NAME\x10\x03\x12\x14\n\x10\x46\x45\x45\x44_ITEM_SET_ID\x10\x04\x42\xf5\x01\n!com.google.ads.googleads.v7.enumsB MatchingFunctionContextTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_MATCHINGFUNCTIONCONTEXTTYPEENUM_MATCHINGFUNCTIONCONTEXTTYPE = _descriptor.EnumDescriptor(
  name='MatchingFunctionContextType',
  full_name='google.ads.googleads.v7.enums.MatchingFunctionContextTypeEnum.MatchingFunctionContextType',
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
      name='FEED_ITEM_ID', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DEVICE_NAME', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEED_ITEM_SET_ID', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=167,
  serialized_end=283,
)
_sym_db.RegisterEnumDescriptor(_MATCHINGFUNCTIONCONTEXTTYPEENUM_MATCHINGFUNCTIONCONTEXTTYPE)


_MATCHINGFUNCTIONCONTEXTTYPEENUM = _descriptor.Descriptor(
  name='MatchingFunctionContextTypeEnum',
  full_name='google.ads.googleads.v7.enums.MatchingFunctionContextTypeEnum',
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
    _MATCHINGFUNCTIONCONTEXTTYPEENUM_MATCHINGFUNCTIONCONTEXTTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=132,
  serialized_end=283,
)

_MATCHINGFUNCTIONCONTEXTTYPEENUM_MATCHINGFUNCTIONCONTEXTTYPE.containing_type = _MATCHINGFUNCTIONCONTEXTTYPEENUM
DESCRIPTOR.message_types_by_name['MatchingFunctionContextTypeEnum'] = _MATCHINGFUNCTIONCONTEXTTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MatchingFunctionContextTypeEnum = _reflection.GeneratedProtocolMessageType('MatchingFunctionContextTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _MATCHINGFUNCTIONCONTEXTTYPEENUM,
  '__module__' : 'google.ads.googleads.v7.enums.matching_function_context_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.MatchingFunctionContextTypeEnum)
  })
_sym_db.RegisterMessage(MatchingFunctionContextTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)