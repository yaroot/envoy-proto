# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/enums/conversion_lag_bucket.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/enums/conversion_lag_bucket.proto',
  package='google.ads.googleads.v7.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v7.enumsB\030ConversionLagBucketProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V7.Enums\312\002\035Google\\Ads\\GoogleAds\\V7\\Enums\352\002!Google::Ads::GoogleAds::V7::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/ads/googleads/v7/enums/conversion_lag_bucket.proto\x12\x1dgoogle.ads.googleads.v7.enums\x1a\x1cgoogle/api/annotations.proto\"\xbb\x04\n\x17\x43onversionLagBucketEnum\"\x9f\x04\n\x13\x43onversionLagBucket\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x15\n\x11LESS_THAN_ONE_DAY\x10\x02\x12\x13\n\x0fONE_TO_TWO_DAYS\x10\x03\x12\x15\n\x11TWO_TO_THREE_DAYS\x10\x04\x12\x16\n\x12THREE_TO_FOUR_DAYS\x10\x05\x12\x15\n\x11\x46OUR_TO_FIVE_DAYS\x10\x06\x12\x14\n\x10\x46IVE_TO_SIX_DAYS\x10\x07\x12\x15\n\x11SIX_TO_SEVEN_DAYS\x10\x08\x12\x17\n\x13SEVEN_TO_EIGHT_DAYS\x10\t\x12\x16\n\x12\x45IGHT_TO_NINE_DAYS\x10\n\x12\x14\n\x10NINE_TO_TEN_DAYS\x10\x0b\x12\x16\n\x12TEN_TO_ELEVEN_DAYS\x10\x0c\x12\x19\n\x15\x45LEVEN_TO_TWELVE_DAYS\x10\r\x12\x1b\n\x17TWELVE_TO_THIRTEEN_DAYS\x10\x0e\x12\x1d\n\x19THIRTEEN_TO_FOURTEEN_DAYS\x10\x0f\x12\x1f\n\x1b\x46OURTEEN_TO_TWENTY_ONE_DAYS\x10\x10\x12\x1d\n\x19TWENTY_ONE_TO_THIRTY_DAYS\x10\x11\x12\x1d\n\x19THIRTY_TO_FORTY_FIVE_DAYS\x10\x12\x12\x1c\n\x18\x46ORTY_FIVE_TO_SIXTY_DAYS\x10\x13\x12\x18\n\x14SIXTY_TO_NINETY_DAYS\x10\x14\x42\xed\x01\n!com.google.ads.googleads.v7.enumsB\x18\x43onversionLagBucketProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v7/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V7.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V7\\Enums\xea\x02!Google::Ads::GoogleAds::V7::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CONVERSIONLAGBUCKETENUM_CONVERSIONLAGBUCKET = _descriptor.EnumDescriptor(
  name='ConversionLagBucket',
  full_name='google.ads.googleads.v7.enums.ConversionLagBucketEnum.ConversionLagBucket',
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
      name='LESS_THAN_ONE_DAY', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ONE_TO_TWO_DAYS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TWO_TO_THREE_DAYS', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='THREE_TO_FOUR_DAYS', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FOUR_TO_FIVE_DAYS', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FIVE_TO_SIX_DAYS', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SIX_TO_SEVEN_DAYS', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SEVEN_TO_EIGHT_DAYS', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EIGHT_TO_NINE_DAYS', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NINE_TO_TEN_DAYS', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TEN_TO_ELEVEN_DAYS', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ELEVEN_TO_TWELVE_DAYS', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TWELVE_TO_THIRTEEN_DAYS', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='THIRTEEN_TO_FOURTEEN_DAYS', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FOURTEEN_TO_TWENTY_ONE_DAYS', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TWENTY_ONE_TO_THIRTY_DAYS', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='THIRTY_TO_FORTY_FIVE_DAYS', index=18, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FORTY_FIVE_TO_SIXTY_DAYS', index=19, number=19,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SIXTY_TO_NINETY_DAYS', index=20, number=20,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=151,
  serialized_end=694,
)
_sym_db.RegisterEnumDescriptor(_CONVERSIONLAGBUCKETENUM_CONVERSIONLAGBUCKET)


_CONVERSIONLAGBUCKETENUM = _descriptor.Descriptor(
  name='ConversionLagBucketEnum',
  full_name='google.ads.googleads.v7.enums.ConversionLagBucketEnum',
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
    _CONVERSIONLAGBUCKETENUM_CONVERSIONLAGBUCKET,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=123,
  serialized_end=694,
)

_CONVERSIONLAGBUCKETENUM_CONVERSIONLAGBUCKET.containing_type = _CONVERSIONLAGBUCKETENUM
DESCRIPTOR.message_types_by_name['ConversionLagBucketEnum'] = _CONVERSIONLAGBUCKETENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ConversionLagBucketEnum = _reflection.GeneratedProtocolMessageType('ConversionLagBucketEnum', (_message.Message,), {
  'DESCRIPTOR' : _CONVERSIONLAGBUCKETENUM,
  '__module__' : 'google.ads.googleads.v7.enums.conversion_lag_bucket_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.enums.ConversionLagBucketEnum)
  })
_sym_db.RegisterMessage(ConversionLagBucketEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
