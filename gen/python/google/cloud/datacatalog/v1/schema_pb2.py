# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datacatalog/v1/schema.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/datacatalog/v1/schema.proto',
  package='google.cloud.datacatalog.v1',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.datacatalog.v1P\001ZFgoogle.golang.org/genproto/googleapis/cloud/datacatalog/v1;datacatalog\370\001\001\252\002\033Google.Cloud.DataCatalog.V1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Google::Cloud::DataCatalog::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(google/cloud/datacatalog/v1/schema.proto\x12\x1bgoogle.cloud.datacatalog.v1\x1a\x1fgoogle/api/field_behavior.proto\"I\n\x06Schema\x12?\n\x07\x63olumns\x18\x02 \x03(\x0b\x32).google.cloud.datacatalog.v1.ColumnSchemaB\x03\xe0\x41\x02\"\xa7\x01\n\x0c\x43olumnSchema\x12\x13\n\x06\x63olumn\x18\x06 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\x04type\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x11\n\x04mode\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x42\n\nsubcolumns\x18\x07 \x03(\x0b\x32).google.cloud.datacatalog.v1.ColumnSchemaB\x03\xe0\x41\x01\x42\xcb\x01\n\x1f\x63om.google.cloud.datacatalog.v1P\x01ZFgoogle.golang.org/genproto/googleapis/cloud/datacatalog/v1;datacatalog\xf8\x01\x01\xaa\x02\x1bGoogle.Cloud.DataCatalog.V1\xca\x02\x1bGoogle\\Cloud\\DataCatalog\\V1\xea\x02\x1eGoogle::Cloud::DataCatalog::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_SCHEMA = _descriptor.Descriptor(
  name='Schema',
  full_name='google.cloud.datacatalog.v1.Schema',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='columns', full_name='google.cloud.datacatalog.v1.Schema.columns', index=0,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=106,
  serialized_end=179,
)


_COLUMNSCHEMA = _descriptor.Descriptor(
  name='ColumnSchema',
  full_name='google.cloud.datacatalog.v1.ColumnSchema',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='column', full_name='google.cloud.datacatalog.v1.ColumnSchema.column', index=0,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.datacatalog.v1.ColumnSchema.type', index=1,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.datacatalog.v1.ColumnSchema.description', index=2,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mode', full_name='google.cloud.datacatalog.v1.ColumnSchema.mode', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='subcolumns', full_name='google.cloud.datacatalog.v1.ColumnSchema.subcolumns', index=4,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=182,
  serialized_end=349,
)

_SCHEMA.fields_by_name['columns'].message_type = _COLUMNSCHEMA
_COLUMNSCHEMA.fields_by_name['subcolumns'].message_type = _COLUMNSCHEMA
DESCRIPTOR.message_types_by_name['Schema'] = _SCHEMA
DESCRIPTOR.message_types_by_name['ColumnSchema'] = _COLUMNSCHEMA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Schema = _reflection.GeneratedProtocolMessageType('Schema', (_message.Message,), {
  'DESCRIPTOR' : _SCHEMA,
  '__module__' : 'google.cloud.datacatalog.v1.schema_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.Schema)
  })
_sym_db.RegisterMessage(Schema)

ColumnSchema = _reflection.GeneratedProtocolMessageType('ColumnSchema', (_message.Message,), {
  'DESCRIPTOR' : _COLUMNSCHEMA,
  '__module__' : 'google.cloud.datacatalog.v1.schema_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.ColumnSchema)
  })
_sym_db.RegisterMessage(ColumnSchema)


DESCRIPTOR._options = None
_SCHEMA.fields_by_name['columns']._options = None
_COLUMNSCHEMA.fields_by_name['column']._options = None
_COLUMNSCHEMA.fields_by_name['type']._options = None
_COLUMNSCHEMA.fields_by_name['description']._options = None
_COLUMNSCHEMA.fields_by_name['mode']._options = None
_COLUMNSCHEMA.fields_by_name['subcolumns']._options = None
# @@protoc_insertion_point(module_scope)
