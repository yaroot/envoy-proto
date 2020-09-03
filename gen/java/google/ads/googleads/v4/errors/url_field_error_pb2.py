# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/errors/url_field_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/errors/url_field_error.proto',
  package='google.ads.googleads.v4.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v4.errorsB\022UrlFieldErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Errors\312\002\036Google\\Ads\\GoogleAds\\V4\\Errors\352\002\"Google::Ads::GoogleAds::V4::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v4/errors/url_field_error.proto\x12\x1egoogle.ads.googleads.v4.errors\x1a\x1cgoogle/api/annotations.proto\"\xb6\x0e\n\x11UrlFieldErrorEnum\"\xa0\x0e\n\rUrlFieldError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12!\n\x1dINVALID_TRACKING_URL_TEMPLATE\x10\x02\x12(\n$INVALID_TAG_IN_TRACKING_URL_TEMPLATE\x10\x03\x12%\n!MISSING_TRACKING_URL_TEMPLATE_TAG\x10\x04\x12-\n)MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE\x10\x05\x12-\n)INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE\x10\x06\x12#\n\x1fMALFORMED_TRACKING_URL_TEMPLATE\x10\x07\x12)\n%MISSING_HOST_IN_TRACKING_URL_TEMPLATE\x10\x08\x12(\n$INVALID_TLD_IN_TRACKING_URL_TEMPLATE\x10\t\x12.\n*REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG\x10\n\x12\x15\n\x11INVALID_FINAL_URL\x10\x0b\x12\x1c\n\x18INVALID_TAG_IN_FINAL_URL\x10\x0c\x12\"\n\x1eREDUNDANT_NESTED_FINAL_URL_TAG\x10\r\x12!\n\x1dMISSING_PROTOCOL_IN_FINAL_URL\x10\x0e\x12!\n\x1dINVALID_PROTOCOL_IN_FINAL_URL\x10\x0f\x12\x17\n\x13MALFORMED_FINAL_URL\x10\x10\x12\x1d\n\x19MISSING_HOST_IN_FINAL_URL\x10\x11\x12\x1c\n\x18INVALID_TLD_IN_FINAL_URL\x10\x12\x12\x1c\n\x18INVALID_FINAL_MOBILE_URL\x10\x13\x12#\n\x1fINVALID_TAG_IN_FINAL_MOBILE_URL\x10\x14\x12)\n%REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG\x10\x15\x12(\n$MISSING_PROTOCOL_IN_FINAL_MOBILE_URL\x10\x16\x12(\n$INVALID_PROTOCOL_IN_FINAL_MOBILE_URL\x10\x17\x12\x1e\n\x1aMALFORMED_FINAL_MOBILE_URL\x10\x18\x12$\n MISSING_HOST_IN_FINAL_MOBILE_URL\x10\x19\x12#\n\x1fINVALID_TLD_IN_FINAL_MOBILE_URL\x10\x1a\x12\x19\n\x15INVALID_FINAL_APP_URL\x10\x1b\x12 \n\x1cINVALID_TAG_IN_FINAL_APP_URL\x10\x1c\x12&\n\"REDUNDANT_NESTED_FINAL_APP_URL_TAG\x10\x1d\x12 \n\x1cMULTIPLE_APP_URLS_FOR_OSTYPE\x10\x1e\x12\x12\n\x0eINVALID_OSTYPE\x10\x1f\x12 \n\x1cINVALID_PROTOCOL_FOR_APP_URL\x10 \x12\"\n\x1eINVALID_PACKAGE_ID_FOR_APP_URL\x10!\x12-\n)URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT\x10\"\x12\x32\n.INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY\x10\'\x12\x34\n0INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE\x10(\x12-\n)INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE\x10)\x12-\n)REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG\x10*\x12\x14\n\x10MISSING_PROTOCOL\x10+\x12\x14\n\x10INVALID_PROTOCOL\x10\x34\x12\x0f\n\x0bINVALID_URL\x10,\x12\x1e\n\x1a\x44\x45STINATION_URL_DEPRECATED\x10-\x12\x16\n\x12INVALID_TAG_IN_URL\x10.\x12\x13\n\x0fMISSING_URL_TAG\x10/\x12\x14\n\x10\x44UPLICATE_URL_ID\x10\x30\x12\x12\n\x0eINVALID_URL_ID\x10\x31\x12\x1e\n\x1a\x46INAL_URL_SUFFIX_MALFORMED\x10\x32\x12#\n\x1fINVALID_TAG_IN_FINAL_URL_SUFFIX\x10\x33\x12\x1c\n\x18INVALID_TOP_LEVEL_DOMAIN\x10\x35\x12\x1e\n\x1aMALFORMED_TOP_LEVEL_DOMAIN\x10\x36\x12\x11\n\rMALFORMED_URL\x10\x37\x12\x10\n\x0cMISSING_HOST\x10\x38\x12\x1f\n\x1bNULL_CUSTOM_PARAMETER_VALUE\x10\x39\x42\xed\x01\n\"com.google.ads.googleads.v4.errorsB\x12UrlFieldErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v4/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V4.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V4\\Errors\xea\x02\"Google::Ads::GoogleAds::V4::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_URLFIELDERRORENUM_URLFIELDERROR = _descriptor.EnumDescriptor(
  name='UrlFieldError',
  full_name='google.ads.googleads.v4.errors.UrlFieldErrorEnum.UrlFieldError',
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
      name='INVALID_TRACKING_URL_TEMPLATE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_TRACKING_URL_TEMPLATE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_TRACKING_URL_TEMPLATE_TAG', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_PROTOCOL_IN_TRACKING_URL_TEMPLATE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROTOCOL_IN_TRACKING_URL_TEMPLATE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MALFORMED_TRACKING_URL_TEMPLATE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_HOST_IN_TRACKING_URL_TEMPLATE', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TLD_IN_TRACKING_URL_TEMPLATE', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDUNDANT_NESTED_TRACKING_URL_TEMPLATE_TAG', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FINAL_URL', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_FINAL_URL', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDUNDANT_NESTED_FINAL_URL_TAG', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_PROTOCOL_IN_FINAL_URL', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROTOCOL_IN_FINAL_URL', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MALFORMED_FINAL_URL', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_HOST_IN_FINAL_URL', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TLD_IN_FINAL_URL', index=18, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FINAL_MOBILE_URL', index=19, number=19,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_FINAL_MOBILE_URL', index=20, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDUNDANT_NESTED_FINAL_MOBILE_URL_TAG', index=21, number=21,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_PROTOCOL_IN_FINAL_MOBILE_URL', index=22, number=22,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROTOCOL_IN_FINAL_MOBILE_URL', index=23, number=23,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MALFORMED_FINAL_MOBILE_URL', index=24, number=24,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_HOST_IN_FINAL_MOBILE_URL', index=25, number=25,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TLD_IN_FINAL_MOBILE_URL', index=26, number=26,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_FINAL_APP_URL', index=27, number=27,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_FINAL_APP_URL', index=28, number=28,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDUNDANT_NESTED_FINAL_APP_URL_TAG', index=29, number=29,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MULTIPLE_APP_URLS_FOR_OSTYPE', index=30, number=30,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_OSTYPE', index=31, number=31,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROTOCOL_FOR_APP_URL', index=32, number=32,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PACKAGE_ID_FOR_APP_URL', index=33, number=33,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='URL_CUSTOM_PARAMETERS_COUNT_EXCEEDS_LIMIT', index=34, number=34,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_KEY', index=35, number=39,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CHARACTERS_IN_URL_CUSTOM_PARAMETER_VALUE', index=36, number=40,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_URL_CUSTOM_PARAMETER_VALUE', index=37, number=41,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDUNDANT_NESTED_URL_CUSTOM_PARAMETER_TAG', index=38, number=42,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_PROTOCOL', index=39, number=43,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_PROTOCOL', index=40, number=52,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_URL', index=41, number=44,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESTINATION_URL_DEPRECATED', index=42, number=45,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_URL', index=43, number=46,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_URL_TAG', index=44, number=47,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_URL_ID', index=45, number=48,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_URL_ID', index=46, number=49,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FINAL_URL_SUFFIX_MALFORMED', index=47, number=50,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TAG_IN_FINAL_URL_SUFFIX', index=48, number=51,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_TOP_LEVEL_DOMAIN', index=49, number=53,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MALFORMED_TOP_LEVEL_DOMAIN', index=50, number=54,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MALFORMED_URL', index=51, number=55,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MISSING_HOST', index=52, number=56,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NULL_CUSTOM_PARAMETER_VALUE', index=53, number=57,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=141,
  serialized_end=1965,
)
_sym_db.RegisterEnumDescriptor(_URLFIELDERRORENUM_URLFIELDERROR)


_URLFIELDERRORENUM = _descriptor.Descriptor(
  name='UrlFieldErrorEnum',
  full_name='google.ads.googleads.v4.errors.UrlFieldErrorEnum',
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
    _URLFIELDERRORENUM_URLFIELDERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=119,
  serialized_end=1965,
)

_URLFIELDERRORENUM_URLFIELDERROR.containing_type = _URLFIELDERRORENUM
DESCRIPTOR.message_types_by_name['UrlFieldErrorEnum'] = _URLFIELDERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UrlFieldErrorEnum = _reflection.GeneratedProtocolMessageType('UrlFieldErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _URLFIELDERRORENUM,
  '__module__' : 'google.ads.googleads.v4.errors.url_field_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.errors.UrlFieldErrorEnum)
  })
_sym_db.RegisterMessage(UrlFieldErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
