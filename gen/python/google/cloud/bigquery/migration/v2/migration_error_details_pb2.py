# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/migration/v2/migration_error_details.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.rpc import error_details_pb2 as google_dot_rpc_dot_error__details__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/cloud/bigquery/migration/v2/migration_error_details.proto\x12\"google.cloud.bigquery.migration.v2\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1egoogle/rpc/error_details.proto\"\xb2\x01\n\x13ResourceErrorDetail\x12\x34\n\rresource_info\x18\x01 \x01(\x0b\x32\x18.google.rpc.ResourceInfoB\x03\xe0\x41\x02\x12K\n\rerror_details\x18\x02 \x03(\x0b\x32/.google.cloud.bigquery.migration.v2.ErrorDetailB\x03\xe0\x41\x02\x12\x18\n\x0b\x65rror_count\x18\x03 \x01(\x05\x42\x03\xe0\x41\x02\"\x87\x01\n\x0b\x45rrorDetail\x12H\n\x08location\x18\x01 \x01(\x0b\x32\x31.google.cloud.bigquery.migration.v2.ErrorLocationB\x03\xe0\x41\x01\x12.\n\nerror_info\x18\x02 \x01(\x0b\x32\x15.google.rpc.ErrorInfoB\x03\xe0\x41\x02\"7\n\rErrorLocation\x12\x11\n\x04line\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12\x13\n\x06\x63olumn\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x42\xdd\x01\n&com.google.cloud.bigquery.migration.v2B\x1aMigrationErrorDetailsProtoP\x01ZKgoogle.golang.org/genproto/googleapis/cloud/bigquery/migration/v2;migration\xaa\x02\"Google.Cloud.BigQuery.Migration.V2\xca\x02\"Google\\Cloud\\BigQuery\\Migration\\V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.migration.v2.migration_error_details_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.cloud.bigquery.migration.v2B\032MigrationErrorDetailsProtoP\001ZKgoogle.golang.org/genproto/googleapis/cloud/bigquery/migration/v2;migration\252\002\"Google.Cloud.BigQuery.Migration.V2\312\002\"Google\\Cloud\\BigQuery\\Migration\\V2'
  _RESOURCEERRORDETAIL.fields_by_name['resource_info']._options = None
  _RESOURCEERRORDETAIL.fields_by_name['resource_info']._serialized_options = b'\340A\002'
  _RESOURCEERRORDETAIL.fields_by_name['error_details']._options = None
  _RESOURCEERRORDETAIL.fields_by_name['error_details']._serialized_options = b'\340A\002'
  _RESOURCEERRORDETAIL.fields_by_name['error_count']._options = None
  _RESOURCEERRORDETAIL.fields_by_name['error_count']._serialized_options = b'\340A\002'
  _ERRORDETAIL.fields_by_name['location']._options = None
  _ERRORDETAIL.fields_by_name['location']._serialized_options = b'\340A\001'
  _ERRORDETAIL.fields_by_name['error_info']._options = None
  _ERRORDETAIL.fields_by_name['error_info']._serialized_options = b'\340A\002'
  _ERRORLOCATION.fields_by_name['line']._options = None
  _ERRORLOCATION.fields_by_name['line']._serialized_options = b'\340A\001'
  _ERRORLOCATION.fields_by_name['column']._options = None
  _ERRORLOCATION.fields_by_name['column']._serialized_options = b'\340A\001'
  _RESOURCEERRORDETAIL._serialized_start=170
  _RESOURCEERRORDETAIL._serialized_end=348
  _ERRORDETAIL._serialized_start=351
  _ERRORDETAIL._serialized_end=486
  _ERRORLOCATION._serialized_start=488
  _ERRORLOCATION._serialized_end=543
# @@protoc_insertion_point(module_scope)
