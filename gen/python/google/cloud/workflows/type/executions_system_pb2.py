# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/workflows/type/executions_system.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/workflows/type/executions_system.proto\x12\x1bgoogle.cloud.workflows.type\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc8\x04\n\x13\x45xecutionsSystemLog\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x31\n\ractivity_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x45\n\x05state\x18\x03 \x01(\x0e\x32\x36.google.cloud.workflows.type.ExecutionsSystemLog.State\x12G\n\x05start\x18\x04 \x01(\x0b\x32\x36.google.cloud.workflows.type.ExecutionsSystemLog.StartH\x00\x12K\n\x07success\x18\x05 \x01(\x0b\x32\x38.google.cloud.workflows.type.ExecutionsSystemLog.SuccessH\x00\x12K\n\x07\x66\x61ilure\x18\x06 \x01(\x0b\x32\x38.google.cloud.workflows.type.ExecutionsSystemLog.FailureH\x00\x1a\x19\n\x05Start\x12\x10\n\x08\x61rgument\x18\x02 \x01(\t\x1a\x19\n\x07Success\x12\x0e\n\x06result\x18\x02 \x01(\t\x1a,\n\x07\x46\x61ilure\x12\x11\n\texception\x18\x01 \x01(\t\x12\x0e\n\x06source\x18\x02 \x01(\t\"T\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\r\n\tSUCCEEDED\x10\x02\x12\n\n\x06\x46\x41ILED\x10\x03\x12\r\n\tCANCELLED\x10\x04\x42\t\n\x07\x64\x65tailsB<Z:google.golang.org/genproto/googleapis/cloud/workflows/typeb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.workflows.type.executions_system_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z:google.golang.org/genproto/googleapis/cloud/workflows/type'
  _EXECUTIONSSYSTEMLOG._serialized_start=118
  _EXECUTIONSSYSTEMLOG._serialized_end=702
  _EXECUTIONSSYSTEMLOG_START._serialized_start=507
  _EXECUTIONSSYSTEMLOG_START._serialized_end=532
  _EXECUTIONSSYSTEMLOG_SUCCESS._serialized_start=534
  _EXECUTIONSSYSTEMLOG_SUCCESS._serialized_end=559
  _EXECUTIONSSYSTEMLOG_FAILURE._serialized_start=561
  _EXECUTIONSSYSTEMLOG_FAILURE._serialized_end=605
  _EXECUTIONSSYSTEMLOG_STATE._serialized_start=607
  _EXECUTIONSSYSTEMLOG_STATE._serialized_end=691
# @@protoc_insertion_point(module_scope)