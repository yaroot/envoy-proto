# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/gender_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/gender_type.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB\017GenderTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/google/ads/googleads/v2/enums/gender_type.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"d\n\x0eGenderTypeEnum\"R\n\nGenderType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x08\n\x04MALE\x10\n\x12\n\n\x06\x46\x45MALE\x10\x0b\x12\x10\n\x0cUNDETERMINED\x10\x14\x42\xe4\x01\n!com.google.ads.googleads.v2.enumsB\x0fGenderTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_GENDERTYPEENUM_GENDERTYPE = _descriptor.EnumDescriptor(
  name='GenderType',
  full_name='google.ads.googleads.v2.enums.GenderTypeEnum.GenderType',
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
      name='MALE', index=2, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FEMALE', index=3, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNDETERMINED', index=4, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=130,
  serialized_end=212,
)
_sym_db.RegisterEnumDescriptor(_GENDERTYPEENUM_GENDERTYPE)


_GENDERTYPEENUM = _descriptor.Descriptor(
  name='GenderTypeEnum',
  full_name='google.ads.googleads.v2.enums.GenderTypeEnum',
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
    _GENDERTYPEENUM_GENDERTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=112,
  serialized_end=212,
)

_GENDERTYPEENUM_GENDERTYPE.containing_type = _GENDERTYPEENUM
DESCRIPTOR.message_types_by_name['GenderTypeEnum'] = _GENDERTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GenderTypeEnum = _reflection.GeneratedProtocolMessageType('GenderTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _GENDERTYPEENUM,
  '__module__' : 'google.ads.googleads.v2.enums.gender_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.GenderTypeEnum)
  })
_sym_db.RegisterMessage(GenderTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
