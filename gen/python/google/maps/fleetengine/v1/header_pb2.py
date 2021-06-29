# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/fleetengine/v1/header.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/maps/fleetengine/v1/header.proto',
  package='maps.fleetengine.v1',
  syntax='proto3',
  serialized_options=b'\n\032google.maps.fleetengine.v1B\007HeadersP\001ZEgoogle.golang.org/genproto/googleapis/maps/fleetengine/v1;fleetengine\242\002\003CFE',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'google/maps/fleetengine/v1/header.proto\x12\x13maps.fleetengine.v1\x1a\x1fgoogle/api/field_behavior.proto\"\x7f\n\rRequestHeader\x12\x15\n\rlanguage_code\x18\x01 \x01(\t\x12\x18\n\x0bregion_code\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0bsdk_version\x18\x03 \x01(\t\x12\x12\n\nos_version\x18\x04 \x01(\t\x12\x14\n\x0c\x64\x65vice_model\x18\x05 \x01(\tBt\n\x1agoogle.maps.fleetengine.v1B\x07HeadersP\x01ZEgoogle.golang.org/genproto/googleapis/maps/fleetengine/v1;fleetengine\xa2\x02\x03\x43\x46\x45\x62\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_REQUESTHEADER = _descriptor.Descriptor(
  name='RequestHeader',
  full_name='maps.fleetengine.v1.RequestHeader',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='language_code', full_name='maps.fleetengine.v1.RequestHeader.language_code', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='region_code', full_name='maps.fleetengine.v1.RequestHeader.region_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sdk_version', full_name='maps.fleetengine.v1.RequestHeader.sdk_version', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='os_version', full_name='maps.fleetengine.v1.RequestHeader.os_version', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='device_model', full_name='maps.fleetengine.v1.RequestHeader.device_model', index=4,
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
  ],
  serialized_start=97,
  serialized_end=224,
)

DESCRIPTOR.message_types_by_name['RequestHeader'] = _REQUESTHEADER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RequestHeader = _reflection.GeneratedProtocolMessageType('RequestHeader', (_message.Message,), {
  'DESCRIPTOR' : _REQUESTHEADER,
  '__module__' : 'google.maps.fleetengine.v1.header_pb2'
  # @@protoc_insertion_point(class_scope:maps.fleetengine.v1.RequestHeader)
  })
_sym_db.RegisterMessage(RequestHeader)


DESCRIPTOR._options = None
_REQUESTHEADER.fields_by_name['region_code']._options = None
# @@protoc_insertion_point(module_scope)