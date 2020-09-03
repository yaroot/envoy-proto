# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/storage/v1alpha2/table.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/bigquery/storage/v1alpha2/table.proto',
  package='google.cloud.bigquery.storage.v1alpha2',
  syntax='proto3',
  serialized_options=b'\n*com.google.cloud.bigquery.storage.v1alpha2ZMgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1alpha2;storage',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/cloud/bigquery/storage/v1alpha2/table.proto\x12&google.cloud.bigquery.storage.v1alpha2\x1a\x1fgoogle/api/field_behavior.proto\"W\n\x0bTableSchema\x12H\n\x06\x66ields\x18\x01 \x03(\x0b\x32\x38.google.cloud.bigquery.storage.v1alpha2.TableFieldSchema\"\xaa\x04\n\x10TableFieldSchema\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12P\n\x04type\x18\x02 \x01(\x0e\x32=.google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.TypeB\x03\xe0\x41\x02\x12P\n\x04mode\x18\x03 \x01(\x0e\x32=.google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.ModeB\x03\xe0\x41\x01\x12M\n\x06\x66ields\x18\x04 \x03(\x0b\x32\x38.google.cloud.bigquery.storage.v1alpha2.TableFieldSchemaB\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x06 \x01(\tB\x03\xe0\x41\x01\"\xad\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06STRING\x10\x01\x12\t\n\x05INT64\x10\x02\x12\n\n\x06\x44OUBLE\x10\x03\x12\n\n\x06STRUCT\x10\x04\x12\t\n\x05\x42YTES\x10\x05\x12\x08\n\x04\x42OOL\x10\x06\x12\r\n\tTIMESTAMP\x10\x07\x12\x08\n\x04\x44\x41TE\x10\x08\x12\x08\n\x04TIME\x10\t\x12\x0c\n\x08\x44\x41TETIME\x10\n\x12\r\n\tGEOGRAPHY\x10\x0b\x12\x0b\n\x07NUMERIC\x10\x0c\"F\n\x04Mode\x12\x14\n\x10MODE_UNSPECIFIED\x10\x00\x12\x0c\n\x08NULLABLE\x10\x01\x12\x0c\n\x08REQUIRED\x10\x02\x12\x0c\n\x08REPEATED\x10\x03\x42{\n*com.google.cloud.bigquery.storage.v1alpha2ZMgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1alpha2;storageb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])



_TABLEFIELDSCHEMA_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.Type',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STRING', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INT64', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DOUBLE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STRUCT', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BYTES', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BOOL', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TIMESTAMP', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DATE', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TIME', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DATETIME', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GEOGRAPHY', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NUMERIC', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=526,
  serialized_end=699,
)
_sym_db.RegisterEnumDescriptor(_TABLEFIELDSCHEMA_TYPE)

_TABLEFIELDSCHEMA_MODE = _descriptor.EnumDescriptor(
  name='Mode',
  full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.Mode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='MODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NULLABLE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REQUIRED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REPEATED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=701,
  serialized_end=771,
)
_sym_db.RegisterEnumDescriptor(_TABLEFIELDSCHEMA_MODE)


_TABLESCHEMA = _descriptor.Descriptor(
  name='TableSchema',
  full_name='google.cloud.bigquery.storage.v1alpha2.TableSchema',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='fields', full_name='google.cloud.bigquery.storage.v1alpha2.TableSchema.fields', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=127,
  serialized_end=214,
)


_TABLEFIELDSCHEMA = _descriptor.Descriptor(
  name='TableFieldSchema',
  full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mode', full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.mode', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='fields', full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.fields', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.bigquery.storage.v1alpha2.TableFieldSchema.description', index=4,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _TABLEFIELDSCHEMA_TYPE,
    _TABLEFIELDSCHEMA_MODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=217,
  serialized_end=771,
)

_TABLESCHEMA.fields_by_name['fields'].message_type = _TABLEFIELDSCHEMA
_TABLEFIELDSCHEMA.fields_by_name['type'].enum_type = _TABLEFIELDSCHEMA_TYPE
_TABLEFIELDSCHEMA.fields_by_name['mode'].enum_type = _TABLEFIELDSCHEMA_MODE
_TABLEFIELDSCHEMA.fields_by_name['fields'].message_type = _TABLEFIELDSCHEMA
_TABLEFIELDSCHEMA_TYPE.containing_type = _TABLEFIELDSCHEMA
_TABLEFIELDSCHEMA_MODE.containing_type = _TABLEFIELDSCHEMA
DESCRIPTOR.message_types_by_name['TableSchema'] = _TABLESCHEMA
DESCRIPTOR.message_types_by_name['TableFieldSchema'] = _TABLEFIELDSCHEMA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TableSchema = _reflection.GeneratedProtocolMessageType('TableSchema', (_message.Message,), {
  'DESCRIPTOR' : _TABLESCHEMA,
  '__module__' : 'google.cloud.bigquery.storage.v1alpha2.table_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1alpha2.TableSchema)
  })
_sym_db.RegisterMessage(TableSchema)

TableFieldSchema = _reflection.GeneratedProtocolMessageType('TableFieldSchema', (_message.Message,), {
  'DESCRIPTOR' : _TABLEFIELDSCHEMA,
  '__module__' : 'google.cloud.bigquery.storage.v1alpha2.table_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1alpha2.TableFieldSchema)
  })
_sym_db.RegisterMessage(TableFieldSchema)


DESCRIPTOR._options = None
_TABLEFIELDSCHEMA.fields_by_name['name']._options = None
_TABLEFIELDSCHEMA.fields_by_name['type']._options = None
_TABLEFIELDSCHEMA.fields_by_name['mode']._options = None
_TABLEFIELDSCHEMA.fields_by_name['fields']._options = None
_TABLEFIELDSCHEMA.fields_by_name['description']._options = None
# @@protoc_insertion_point(module_scope)
