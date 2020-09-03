# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/enums/time_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/enums/time_type.proto',
  package='google.ads.googleads.v5.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v5.enumsB\rTimeTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v5/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V5.Enums\312\002\035Google\\Ads\\GoogleAds\\V5\\Enums\352\002!Google::Ads::GoogleAds::V5::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-google/ads/googleads/v5/enums/time_type.proto\x12\x1dgoogle.ads.googleads.v5.enums\x1a\x1cgoogle/api/annotations.proto\"N\n\x0cTimeTypeEnum\">\n\x08TimeType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x07\n\x03NOW\x10\x02\x12\x0b\n\x07\x46OREVER\x10\x03\x42\xe2\x01\n!com.google.ads.googleads.v5.enumsB\rTimeTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v5/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V5.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V5\\Enums\xea\x02!Google::Ads::GoogleAds::V5::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_TIMETYPEENUM_TIMETYPE = _descriptor.EnumDescriptor(
  name='TimeType',
  full_name='google.ads.googleads.v5.enums.TimeTypeEnum.TimeType',
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
      name='NOW', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FOREVER', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=126,
  serialized_end=188,
)
_sym_db.RegisterEnumDescriptor(_TIMETYPEENUM_TIMETYPE)


_TIMETYPEENUM = _descriptor.Descriptor(
  name='TimeTypeEnum',
  full_name='google.ads.googleads.v5.enums.TimeTypeEnum',
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
    _TIMETYPEENUM_TIMETYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=110,
  serialized_end=188,
)

_TIMETYPEENUM_TIMETYPE.containing_type = _TIMETYPEENUM
DESCRIPTOR.message_types_by_name['TimeTypeEnum'] = _TIMETYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TimeTypeEnum = _reflection.GeneratedProtocolMessageType('TimeTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _TIMETYPEENUM,
  '__module__' : 'google.ads.googleads.v5.enums.time_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.enums.TimeTypeEnum)
  })
_sym_db.RegisterMessage(TimeTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
