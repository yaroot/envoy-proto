# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/resources/currency_constant.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/resources/currency_constant.proto',
  package='google.ads.googleads.v3.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v3.resourcesB\025CurrencyConstantProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V3.Resources\312\002!Google\\Ads\\GoogleAds\\V3\\Resources\352\002%Google::Ads::GoogleAds::V3::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/ads/googleads/v3/resources/currency_constant.proto\x12!google.ads.googleads.v3.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\x88\x03\n\x10\x43urrencyConstant\x12H\n\rresource_name\x18\x01 \x01(\tB1\xe0\x41\x03\xfa\x41+\n)googleads.googleapis.com/CurrencyConstant\x12/\n\x04\x63ode\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12/\n\x04name\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12\x31\n\x06symbol\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x03\x12>\n\x14\x62illable_unit_micros\x18\x05 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03:U\xea\x41R\n)googleads.googleapis.com/CurrencyConstant\x12%currencyConstants/{currency_constant}B\x82\x02\n%com.google.ads.googleads.v3.resourcesB\x15\x43urrencyConstantProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v3/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V3.Resources\xca\x02!Google\\Ads\\GoogleAds\\V3\\Resources\xea\x02%Google::Ads::GoogleAds::V3::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CURRENCYCONSTANT = _descriptor.Descriptor(
  name='CurrencyConstant',
  full_name='google.ads.googleads.v3.resources.CurrencyConstant',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.resources.CurrencyConstant.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A+\n)googleads.googleapis.com/CurrencyConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='code', full_name='google.ads.googleads.v3.resources.CurrencyConstant.code', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v3.resources.CurrencyConstant.name', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='symbol', full_name='google.ads.googleads.v3.resources.CurrencyConstant.symbol', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='billable_unit_micros', full_name='google.ads.googleads.v3.resources.CurrencyConstant.billable_unit_micros', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AR\n)googleads.googleapis.com/CurrencyConstant\022%currencyConstants/{currency_constant}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=219,
  serialized_end=611,
)

_CURRENCYCONSTANT.fields_by_name['code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CURRENCYCONSTANT.fields_by_name['name'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CURRENCYCONSTANT.fields_by_name['symbol'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CURRENCYCONSTANT.fields_by_name['billable_unit_micros'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
DESCRIPTOR.message_types_by_name['CurrencyConstant'] = _CURRENCYCONSTANT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CurrencyConstant = _reflection.GeneratedProtocolMessageType('CurrencyConstant', (_message.Message,), {
  'DESCRIPTOR' : _CURRENCYCONSTANT,
  '__module__' : 'google.ads.googleads.v3.resources.currency_constant_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.resources.CurrencyConstant)
  })
_sym_db.RegisterMessage(CurrencyConstant)


DESCRIPTOR._options = None
_CURRENCYCONSTANT.fields_by_name['resource_name']._options = None
_CURRENCYCONSTANT.fields_by_name['code']._options = None
_CURRENCYCONSTANT.fields_by_name['name']._options = None
_CURRENCYCONSTANT.fields_by_name['symbol']._options = None
_CURRENCYCONSTANT.fields_by_name['billable_unit_micros']._options = None
_CURRENCYCONSTANT._options = None
# @@protoc_insertion_point(module_scope)
