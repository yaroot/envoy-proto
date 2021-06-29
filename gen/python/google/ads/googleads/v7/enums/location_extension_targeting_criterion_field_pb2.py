# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/location_extension_targeting_criterion_field.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/location_extension_targeting_criterion_field.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB-LocationExtensionTargetingCriterionFieldProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nPgoogle/ads/googleads/v7/enums/location_extension_targeting_criterion_field.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\xdc\x01\n,LocationExtensionTargetingCriterionFieldEnum\"\xab\x01\n(LocationExtensionTargetingCriterionField\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x12\n\x0e\x41\x44\x44RESS_LINE_1\x10\x02\x12\x12\n\x0e\x41\x44\x44RESS_LINE_2\x10\x03\x12\x08\n\x04\x43ITY\x10\x04\x12\x0c\n\x08PROVINCE\x10\x05\x12\x0f\n\x0bPOSTAL_CODE\x10\x06\x12\x10\n\x0c\x43OUNTRY_CODE\x10\x07\x42\x82\x02\n!com.google.ads.googleads.v7.enumsB-LocationExtensionTargetingCriterionFieldProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM_LOCATIONEXTENSIONTARGETINGCRITERIONFIELD = _descriptor.EnumDescriptor(
  name='LocationExtensionTargetingCriterionField',
  full_name='google.ads.googleads.v7.enums.LocationExtensionTargetingCriterionFieldEnum.LocationExtensionTargetingCriterionField',
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
      name='ADDRESS_LINE_1', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ADDRESS_LINE_2', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CITY', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PROVINCE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='POSTAL_CODE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COUNTRY_CODE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=195,
  serialized_end=366,
)
_sym_db.RegisterEnumDescriptor(_LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM_LOCATIONEXTENSIONTARGETINGCRITERIONFIELD)


_LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM = _descriptor.Descriptor(
  name='LocationExtensionTargetingCriterionFieldEnum',
  full_name='google.ads.googleads.v7.enums.LocationExtensionTargetingCriterionFieldEnum',
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
    _LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM_LOCATIONEXTENSIONTARGETINGCRITERIONFIELD,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=146,
  serialized_end=366,
)

_LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM_LOCATIONEXTENSIONTARGETINGCRITERIONFIELD.containing_type = _LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM
DESCRIPTOR.message_types_by_name['LocationExtensionTargetingCriterionFieldEnum'] = _LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LocationExtensionTargetingCriterionFieldEnum = _reflection.GeneratedProtocolMessageType('LocationExtensionTargetingCriterionFieldEnum', (_message.Message,), {
  'DESCRIPTOR' : _LOCATIONEXTENSIONTARGETINGCRITERIONFIELDENUM,
  '__module__' : 'google.ads.googleads.v7.enums.location_extension_targeting_criterion_field_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.LocationExtensionTargetingCriterionFieldEnum)
  })
_sym_db.RegisterMessage(LocationExtensionTargetingCriterionFieldEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
