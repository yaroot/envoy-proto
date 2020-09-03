# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/enums/criterion_category_locale_availability_mode.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/enums/criterion_category_locale_availability_mode.proto',
  package='google.ads.googleads.v2.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v2.enumsB,CriterionCategoryLocaleAvailabilityModeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V2.Enums\312\002\035Google\\Ads\\GoogleAds\\V2\\Enums\352\002!Google::Ads::GoogleAds::V2::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nOgoogle/ads/googleads/v2/enums/criterion_category_locale_availability_mode.proto\x12\x1dgoogle.ads.googleads.v2.enums\x1a\x1cgoogle/api/annotations.proto\"\xe1\x01\n+CriterionCategoryLocaleAvailabilityModeEnum\"\xb1\x01\n\'CriterionCategoryLocaleAvailabilityMode\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x0f\n\x0b\x41LL_LOCALES\x10\x02\x12\x1d\n\x19\x43OUNTRY_AND_ALL_LANGUAGES\x10\x03\x12\x1e\n\x1aLANGUAGE_AND_ALL_COUNTRIES\x10\x04\x12\x18\n\x14\x43OUNTRY_AND_LANGUAGE\x10\x05\x42\x81\x02\n!com.google.ads.googleads.v2.enumsB,CriterionCategoryLocaleAvailabilityModeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v2/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V2.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V2\\Enums\xea\x02!Google::Ads::GoogleAds::V2::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM_CRITERIONCATEGORYLOCALEAVAILABILITYMODE = _descriptor.EnumDescriptor(
  name='CriterionCategoryLocaleAvailabilityMode',
  full_name='google.ads.googleads.v2.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode',
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
      name='ALL_LOCALES', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COUNTRY_AND_ALL_LANGUAGES', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LANGUAGE_AND_ALL_COUNTRIES', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COUNTRY_AND_LANGUAGE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=193,
  serialized_end=370,
)
_sym_db.RegisterEnumDescriptor(_CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM_CRITERIONCATEGORYLOCALEAVAILABILITYMODE)


_CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM = _descriptor.Descriptor(
  name='CriterionCategoryLocaleAvailabilityModeEnum',
  full_name='google.ads.googleads.v2.enums.CriterionCategoryLocaleAvailabilityModeEnum',
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
    _CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM_CRITERIONCATEGORYLOCALEAVAILABILITYMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=145,
  serialized_end=370,
)

_CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM_CRITERIONCATEGORYLOCALEAVAILABILITYMODE.containing_type = _CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM
DESCRIPTOR.message_types_by_name['CriterionCategoryLocaleAvailabilityModeEnum'] = _CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CriterionCategoryLocaleAvailabilityModeEnum = _reflection.GeneratedProtocolMessageType('CriterionCategoryLocaleAvailabilityModeEnum', (_message.Message,), {
  'DESCRIPTOR' : _CRITERIONCATEGORYLOCALEAVAILABILITYMODEENUM,
  '__module__' : 'google.ads.googleads.v2.enums.criterion_category_locale_availability_mode_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.enums.CriterionCategoryLocaleAvailabilityModeEnum)
  })
_sym_db.RegisterMessage(CriterionCategoryLocaleAvailabilityModeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
