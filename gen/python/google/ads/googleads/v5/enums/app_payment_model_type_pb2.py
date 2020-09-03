# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v5/enums/app_payment_model_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v5/enums/app_payment_model_type.proto',
  package='google.ads.googleads.v5.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v5.enumsB\030AppPaymentModelTypeProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v5/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V5.Enums\312\002\035Google\\Ads\\GoogleAds\\V5\\Enums\352\002!Google::Ads::GoogleAds::V5::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v5/enums/app_payment_model_type.proto\x12\x1dgoogle.ads.googleads.v5.enums\x1a\x1cgoogle/api/annotations.proto\"X\n\x17\x41ppPaymentModelTypeEnum\"=\n\x13\x41ppPaymentModelType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x08\n\x04PAID\x10\x1e\x42\xed\x01\n!com.google.ads.googleads.v5.enumsB\x18\x41ppPaymentModelTypeProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v5/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V5.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V5\\Enums\xea\x02!Google::Ads::GoogleAds::V5::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_APPPAYMENTMODELTYPEENUM_APPPAYMENTMODELTYPE = _descriptor.EnumDescriptor(
  name='AppPaymentModelType',
  full_name='google.ads.googleads.v5.enums.AppPaymentModelTypeEnum.AppPaymentModelType',
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
      name='PAID', index=2, number=30,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=150,
  serialized_end=211,
)
_sym_db.RegisterEnumDescriptor(_APPPAYMENTMODELTYPEENUM_APPPAYMENTMODELTYPE)


_APPPAYMENTMODELTYPEENUM = _descriptor.Descriptor(
  name='AppPaymentModelTypeEnum',
  full_name='google.ads.googleads.v5.enums.AppPaymentModelTypeEnum',
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
    _APPPAYMENTMODELTYPEENUM_APPPAYMENTMODELTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=123,
  serialized_end=211,
)

_APPPAYMENTMODELTYPEENUM_APPPAYMENTMODELTYPE.containing_type = _APPPAYMENTMODELTYPEENUM
DESCRIPTOR.message_types_by_name['AppPaymentModelTypeEnum'] = _APPPAYMENTMODELTYPEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AppPaymentModelTypeEnum = _reflection.GeneratedProtocolMessageType('AppPaymentModelTypeEnum', (_message.Message,), {
  'DESCRIPTOR' : _APPPAYMENTMODELTYPEENUM,
  '__module__' : 'google.ads.googleads.v5.enums.app_payment_model_type_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v5.enums.AppPaymentModelTypeEnum)
  })
_sym_db.RegisterMessage(AppPaymentModelTypeEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
