# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/storage/v1/table.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/bigquery/storage/v1/table.proto\x12 google.cloud.bigquery.storage.v1\x1a\x1fgoogle/api/field_behavior.proto\"Q\n\x0bTableSchema\x12\x42\n\x06\x66ields\x18\x01 \x03(\x0b\x32\x32.google.cloud.bigquery.storage.v1.TableFieldSchema\"\x85\x05\n\x10TableFieldSchema\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12J\n\x04type\x18\x02 \x01(\x0e\x32\x37.google.cloud.bigquery.storage.v1.TableFieldSchema.TypeB\x03\xe0\x41\x02\x12J\n\x04mode\x18\x03 \x01(\x0e\x32\x37.google.cloud.bigquery.storage.v1.TableFieldSchema.ModeB\x03\xe0\x41\x01\x12G\n\x06\x66ields\x18\x04 \x03(\x0b\x32\x32.google.cloud.bigquery.storage.v1.TableFieldSchemaB\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12\x17\n\nmax_length\x18\x07 \x01(\x03\x42\x03\xe0\x41\x01\x12\x16\n\tprecision\x18\x08 \x01(\x03\x42\x03\xe0\x41\x01\x12\x12\n\x05scale\x18\t \x01(\x03\x42\x03\xe0\x41\x01\"\xd5\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06STRING\x10\x01\x12\t\n\x05INT64\x10\x02\x12\n\n\x06\x44OUBLE\x10\x03\x12\n\n\x06STRUCT\x10\x04\x12\t\n\x05\x42YTES\x10\x05\x12\x08\n\x04\x42OOL\x10\x06\x12\r\n\tTIMESTAMP\x10\x07\x12\x08\n\x04\x44\x41TE\x10\x08\x12\x08\n\x04TIME\x10\t\x12\x0c\n\x08\x44\x41TETIME\x10\n\x12\r\n\tGEOGRAPHY\x10\x0b\x12\x0b\n\x07NUMERIC\x10\x0c\x12\x0e\n\nBIGNUMERIC\x10\r\x12\x0c\n\x08INTERVAL\x10\x0e\x12\x08\n\x04JSON\x10\x0f\"F\n\x04Mode\x12\x14\n\x10MODE_UNSPECIFIED\x10\x00\x12\x0c\n\x08NULLABLE\x10\x01\x12\x0c\n\x08REQUIRED\x10\x02\x12\x0c\n\x08REPEATED\x10\x03\x42\xc3\x01\n$com.google.cloud.bigquery.storage.v1B\nTableProtoP\x01ZGgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1;storage\xaa\x02 Google.Cloud.BigQuery.Storage.V1\xca\x02 Google\\Cloud\\BigQuery\\Storage\\V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.storage.v1.table_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.bigquery.storage.v1B\nTableProtoP\001ZGgoogle.golang.org/genproto/googleapis/cloud/bigquery/storage/v1;storage\252\002 Google.Cloud.BigQuery.Storage.V1\312\002 Google\\Cloud\\BigQuery\\Storage\\V1'
  _TABLEFIELDSCHEMA.fields_by_name['name']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['name']._serialized_options = b'\340A\002'
  _TABLEFIELDSCHEMA.fields_by_name['type']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['type']._serialized_options = b'\340A\002'
  _TABLEFIELDSCHEMA.fields_by_name['mode']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['mode']._serialized_options = b'\340A\001'
  _TABLEFIELDSCHEMA.fields_by_name['fields']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['fields']._serialized_options = b'\340A\001'
  _TABLEFIELDSCHEMA.fields_by_name['description']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['description']._serialized_options = b'\340A\001'
  _TABLEFIELDSCHEMA.fields_by_name['max_length']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['max_length']._serialized_options = b'\340A\001'
  _TABLEFIELDSCHEMA.fields_by_name['precision']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['precision']._serialized_options = b'\340A\001'
  _TABLEFIELDSCHEMA.fields_by_name['scale']._options = None
  _TABLEFIELDSCHEMA.fields_by_name['scale']._serialized_options = b'\340A\001'
  _TABLESCHEMA._serialized_start=115
  _TABLESCHEMA._serialized_end=196
  _TABLEFIELDSCHEMA._serialized_start=199
  _TABLEFIELDSCHEMA._serialized_end=844
  _TABLEFIELDSCHEMA_TYPE._serialized_start=559
  _TABLEFIELDSCHEMA_TYPE._serialized_end=772
  _TABLEFIELDSCHEMA_MODE._serialized_start=774
  _TABLEFIELDSCHEMA_MODE._serialized_end=844
# @@protoc_insertion_point(module_scope)
