# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/orchestration/airflow/service/v1beta1/operations.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nCgoogle/cloud/orchestration/airflow/service/v1beta1/operations.proto\x12\x32google.cloud.orchestration.airflow.service.v1beta1\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xfe\x03\n\x11OperationMetadata\x12Z\n\x05state\x18\x01 \x01(\x0e\x32K.google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata.State\x12\x62\n\x0eoperation_type\x18\x02 \x01(\x0e\x32J.google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata.Type\x12\x10\n\x08resource\x18\x03 \x01(\t\x12\x15\n\rresource_uuid\x18\x04 \x01(\t\x12/\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"T\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\x0e\n\nSUCCESSFUL\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04\"K\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06\x43REATE\x10\x01\x12\n\n\x06\x44\x45LETE\x10\x02\x12\n\n\x06UPDATE\x10\x03\x12\t\n\x05\x43HECK\x10\x04\x42\xa6\x01\n6com.google.cloud.orchestration.airflow.service.v1beta1B\x0fOperationsProtoP\x01ZYgoogle.golang.org/genproto/googleapis/cloud/orchestration/airflow/service/v1beta1;serviceb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.orchestration.airflow.service.v1beta1.operations_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n6com.google.cloud.orchestration.airflow.service.v1beta1B\017OperationsProtoP\001ZYgoogle.golang.org/genproto/googleapis/cloud/orchestration/airflow/service/v1beta1;service'
  _OPERATIONMETADATA._serialized_start=187
  _OPERATIONMETADATA._serialized_end=697
  _OPERATIONMETADATA_STATE._serialized_start=536
  _OPERATIONMETADATA_STATE._serialized_end=620
  _OPERATIONMETADATA_TYPE._serialized_start=622
  _OPERATIONMETADATA_TYPE._serialized_end=697
# @@protoc_insertion_point(module_scope)
