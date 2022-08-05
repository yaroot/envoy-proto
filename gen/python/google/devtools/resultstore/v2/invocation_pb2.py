# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/resultstore/v2/invocation.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.devtools.resultstore.v2 import common_pb2 as google_dot_devtools_dot_resultstore_dot_v2_dot_common__pb2
from google.devtools.resultstore.v2 import coverage_pb2 as google_dot_devtools_dot_resultstore_dot_v2_dot_coverage__pb2
from google.devtools.resultstore.v2 import coverage_summary_pb2 as google_dot_devtools_dot_resultstore_dot_v2_dot_coverage__summary__pb2
from google.devtools.resultstore.v2 import file_pb2 as google_dot_devtools_dot_resultstore_dot_v2_dot_file__pb2
from google.devtools.resultstore.v2 import file_processing_error_pb2 as google_dot_devtools_dot_resultstore_dot_v2_dot_file__processing__error__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/devtools/resultstore/v2/invocation.proto\x12\x1egoogle.devtools.resultstore.v2\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a+google/devtools/resultstore/v2/common.proto\x1a-google/devtools/resultstore/v2/coverage.proto\x1a\x35google/devtools/resultstore/v2/coverage_summary.proto\x1a)google/devtools/resultstore/v2/file.proto\x1a:google/devtools/resultstore/v2/file_processing_error.proto\"\xc6\x06\n\nInvocation\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x39\n\x02id\x18\x02 \x01(\x0b\x32-.google.devtools.resultstore.v2.Invocation.Id\x12K\n\x11status_attributes\x18\x03 \x01(\x0b\x32\x30.google.devtools.resultstore.v2.StatusAttributes\x12\x36\n\x06timing\x18\x04 \x01(\x0b\x32&.google.devtools.resultstore.v2.Timing\x12S\n\x15invocation_attributes\x18\x05 \x01(\x0b\x32\x34.google.devtools.resultstore.v2.InvocationAttributes\x12\x45\n\x0eworkspace_info\x18\x06 \x01(\x0b\x32-.google.devtools.resultstore.v2.WorkspaceInfo\x12<\n\nproperties\x18\x07 \x03(\x0b\x32(.google.devtools.resultstore.v2.Property\x12\x33\n\x05\x66iles\x18\x08 \x03(\x0b\x32$.google.devtools.resultstore.v2.File\x12S\n\x12\x63overage_summaries\x18\t \x03(\x0b\x32\x37.google.devtools.resultstore.v2.LanguageCoverageSummary\x12M\n\x12\x61ggregate_coverage\x18\n \x01(\x0b\x32\x31.google.devtools.resultstore.v2.AggregateCoverage\x12T\n\x16\x66ile_processing_errors\x18\x0b \x03(\x0b\x32\x34.google.devtools.resultstore.v2.FileProcessingErrors\x1a\x1b\n\x02Id\x12\x15\n\rinvocation_id\x18\x01 \x01(\t:D\xea\x41\x41\n%resultstore.googleapis.com/Invocation\x12\x18invocations/{invocation}\"\x12\n\x10WorkspaceContext\"\xdf\x01\n\rWorkspaceInfo\x12K\n\x11workspace_context\x18\x01 \x01(\x0b\x32\x30.google.devtools.resultstore.v2.WorkspaceContext\x12\x10\n\x08hostname\x18\x03 \x01(\t\x12\x19\n\x11working_directory\x18\x04 \x01(\t\x12\x10\n\x08tool_tag\x18\x05 \x01(\t\x12\x42\n\rcommand_lines\x18\x07 \x03(\x0b\x32+.google.devtools.resultstore.v2.CommandLine\"I\n\x0b\x43ommandLine\x12\r\n\x05label\x18\x01 \x01(\t\x12\x0c\n\x04tool\x18\x02 \x01(\t\x12\x0c\n\x04\x61rgs\x18\x03 \x03(\t\x12\x0f\n\x07\x63ommand\x18\x04 \x01(\t\"\xc6\x01\n\x14InvocationAttributes\x12\x17\n\nproject_id\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\r\n\x05users\x18\x02 \x03(\t\x12\x0e\n\x06labels\x18\x03 \x03(\t\x12\x13\n\x0b\x64\x65scription\x18\x04 \x01(\t\x12N\n\x13invocation_contexts\x18\x06 \x03(\x0b\x32\x31.google.devtools.resultstore.v2.InvocationContext\x12\x11\n\texit_code\x18\x07 \x01(\x05\"6\n\x11InvocationContext\x12\x14\n\x0c\x64isplay_name\x18\x01 \x01(\t\x12\x0b\n\x03url\x18\x02 \x01(\tB\x82\x01\n\"com.google.devtools.resultstore.v2B\x0fInvocationProtoP\x01ZIgoogle.golang.org/genproto/googleapis/devtools/resultstore/v2;resultstoreb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.devtools.resultstore.v2.invocation_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.devtools.resultstore.v2B\017InvocationProtoP\001ZIgoogle.golang.org/genproto/googleapis/devtools/resultstore/v2;resultstore'
  _INVOCATION._options = None
  _INVOCATION._serialized_options = b'\352AA\n%resultstore.googleapis.com/Invocation\022\030invocations/{invocation}'
  _INVOCATIONATTRIBUTES.fields_by_name['project_id']._options = None
  _INVOCATIONATTRIBUTES.fields_by_name['project_id']._serialized_options = b'\340A\005'
  _INVOCATION._serialized_start=394
  _INVOCATION._serialized_end=1232
  _INVOCATION_ID._serialized_start=1135
  _INVOCATION_ID._serialized_end=1162
  _WORKSPACECONTEXT._serialized_start=1234
  _WORKSPACECONTEXT._serialized_end=1252
  _WORKSPACEINFO._serialized_start=1255
  _WORKSPACEINFO._serialized_end=1478
  _COMMANDLINE._serialized_start=1480
  _COMMANDLINE._serialized_end=1553
  _INVOCATIONATTRIBUTES._serialized_start=1556
  _INVOCATIONATTRIBUTES._serialized_end=1754
  _INVOCATIONCONTEXT._serialized_start=1756
  _INVOCATIONCONTEXT._serialized_end=1810
# @@protoc_insertion_point(module_scope)
