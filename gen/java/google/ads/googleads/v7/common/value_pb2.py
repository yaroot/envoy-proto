# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/common/value.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/common/value.proto',
  package='google.ads.googleads.v7.common',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v7.commonB\nValueProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V7.Common\312\002\036Google\\Ads\\GoogleAds\\V7\\Common\352\002\"Google::Ads::GoogleAds::V7::Common',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n*google/ads/googleads/v7/common/value.proto\x12\x1egoogle.ads.googleads.v7.common\x1a\x1cgoogle/api/annotations.proto\"\x87\x01\n\x05Value\x12\x17\n\rboolean_value\x18\x01 \x01(\x08H\x00\x12\x15\n\x0bint64_value\x18\x02 \x01(\x03H\x00\x12\x15\n\x0b\x66loat_value\x18\x03 \x01(\x02H\x00\x12\x16\n\x0c\x64ouble_value\x18\x04 \x01(\x01H\x00\x12\x16\n\x0cstring_value\x18\x05 \x01(\tH\x00\x42\x07\n\x05valueB\xe5\x01\n\"com.google.ads.googleads.v7.commonB\nValueProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v7/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V7.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V7\\Common\xea\x02\"Google::Ads::GoogleAds::V7::Commonb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_VALUE = _descriptor.Descriptor(
  name='Value',
  full_name='google.ads.googleads.v7.common.Value',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='boolean_value', full_name='google.ads.googleads.v7.common.Value.boolean_value', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='int64_value', full_name='google.ads.googleads.v7.common.Value.int64_value', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='float_value', full_name='google.ads.googleads.v7.common.Value.float_value', index=2,
      number=3, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='double_value', full_name='google.ads.googleads.v7.common.Value.double_value', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='string_value', full_name='google.ads.googleads.v7.common.Value.string_value', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='value', full_name='google.ads.googleads.v7.common.Value.value',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=109,
  serialized_end=244,
)

_VALUE.oneofs_by_name['value'].fields.append(
  _VALUE.fields_by_name['boolean_value'])
_VALUE.fields_by_name['boolean_value'].containing_oneof = _VALUE.oneofs_by_name['value']
_VALUE.oneofs_by_name['value'].fields.append(
  _VALUE.fields_by_name['int64_value'])
_VALUE.fields_by_name['int64_value'].containing_oneof = _VALUE.oneofs_by_name['value']
_VALUE.oneofs_by_name['value'].fields.append(
  _VALUE.fields_by_name['float_value'])
_VALUE.fields_by_name['float_value'].containing_oneof = _VALUE.oneofs_by_name['value']
_VALUE.oneofs_by_name['value'].fields.append(
  _VALUE.fields_by_name['double_value'])
_VALUE.fields_by_name['double_value'].containing_oneof = _VALUE.oneofs_by_name['value']
_VALUE.oneofs_by_name['value'].fields.append(
  _VALUE.fields_by_name['string_value'])
_VALUE.fields_by_name['string_value'].containing_oneof = _VALUE.oneofs_by_name['value']
DESCRIPTOR.message_types_by_name['Value'] = _VALUE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Value = _reflection.GeneratedProtocolMessageType('Value', (_message.Message,), {
  'DESCRIPTOR' : _VALUE,
  '__module__' : 'google.ads.googleads.v7.common.value_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.common.Value)
  })
_sym_db.RegisterMessage(Value)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
