# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: udpa/type/v1/typed_struct.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from validate import validate_pb2 as validate_dot_validate__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='udpa/type/v1/typed_struct.proto',
  package='udpa.type.v1',
  syntax='proto3',
  serialized_options=b'\n\034com.github.udpa.udpa.type.v1B\020TypedStructProtoP\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1fudpa/type/v1/typed_struct.proto\x12\x0cudpa.type.v1\x1a\x17validate/validate.proto\x1a\x1cgoogle/protobuf/struct.proto\"G\n\x0bTypedStruct\x12\x10\n\x08type_url\x18\x01 \x01(\t\x12&\n\x05value\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructB2\n\x1c\x63om.github.udpa.udpa.type.v1B\x10TypedStructProtoP\x01\x62\x06proto3'
  ,
  dependencies=[validate_dot_validate__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,])




_TYPEDSTRUCT = _descriptor.Descriptor(
  name='TypedStruct',
  full_name='udpa.type.v1.TypedStruct',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type_url', full_name='udpa.type.v1.TypedStruct.type_url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='udpa.type.v1.TypedStruct.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=104,
  serialized_end=175,
)

_TYPEDSTRUCT.fields_by_name['value'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
DESCRIPTOR.message_types_by_name['TypedStruct'] = _TYPEDSTRUCT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TypedStruct = _reflection.GeneratedProtocolMessageType('TypedStruct', (_message.Message,), {
  'DESCRIPTOR' : _TYPEDSTRUCT,
  '__module__' : 'udpa.type.v1.typed_struct_pb2'
  # @@protoc_insertion_point(class_scope:udpa.type.v1.TypedStruct)
  })
_sym_db.RegisterMessage(TypedStruct)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
