# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/functions/v1/operations.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/cloud/functions/v1/operations.proto\x12\x19google.cloud.functions.v1\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x85\x02\n\x13OperationMetadataV1\x12\x0e\n\x06target\x18\x01 \x01(\t\x12\x36\n\x04type\x18\x02 \x01(\x0e\x32(.google.cloud.functions.v1.OperationType\x12%\n\x07request\x18\x03 \x01(\x0b\x32\x14.google.protobuf.Any\x12\x12\n\nversion_id\x18\x04 \x01(\x03\x12/\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x10\n\x08\x62uild_id\x18\x06 \x01(\t\x12\x14\n\x0csource_token\x18\x07 \x01(\t\x12\x12\n\nbuild_name\x18\x08 \x01(\t*i\n\rOperationType\x12\x19\n\x15OPERATION_UNSPECIFIED\x10\x00\x12\x13\n\x0f\x43REATE_FUNCTION\x10\x01\x12\x13\n\x0fUPDATE_FUNCTION\x10\x02\x12\x13\n\x0f\x44\x45LETE_FUNCTION\x10\x03\x42\x7f\n\x1d\x63om.google.cloud.functions.v1B\x18\x46unctionsOperationsProtoP\x01ZBgoogle.golang.org/genproto/googleapis/cloud/functions/v1;functionsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.functions.v1.operations_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.cloud.functions.v1B\030FunctionsOperationsProtoP\001ZBgoogle.golang.org/genproto/googleapis/cloud/functions/v1;functions'
  _OPERATIONTYPE._serialized_start=397
  _OPERATIONTYPE._serialized_end=502
  _OPERATIONMETADATAV1._serialized_start=134
  _OPERATIONMETADATAV1._serialized_end=395
# @@protoc_insertion_point(module_scope)