# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/pipeline_state.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1/pipeline_state.proto',
  package='google.cloud.aiplatform.v1',
  syntax='proto3',
  serialized_options=b'\n\036com.google.cloud.aiplatform.v1B\022PipelineStateProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/google/cloud/aiplatform/v1/pipeline_state.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1cgoogle/api/annotations.proto*\x93\x02\n\rPipelineState\x12\x1e\n\x1aPIPELINE_STATE_UNSPECIFIED\x10\x00\x12\x19\n\x15PIPELINE_STATE_QUEUED\x10\x01\x12\x1a\n\x16PIPELINE_STATE_PENDING\x10\x02\x12\x1a\n\x16PIPELINE_STATE_RUNNING\x10\x03\x12\x1c\n\x18PIPELINE_STATE_SUCCEEDED\x10\x04\x12\x19\n\x15PIPELINE_STATE_FAILED\x10\x05\x12\x1d\n\x19PIPELINE_STATE_CANCELLING\x10\x06\x12\x1c\n\x18PIPELINE_STATE_CANCELLED\x10\x07\x12\x19\n\x15PIPELINE_STATE_PAUSED\x10\x08\x42|\n\x1e\x63om.google.cloud.aiplatform.v1B\x12PipelineStateProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatformb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])

_PIPELINESTATE = _descriptor.EnumDescriptor(
  name='PipelineState',
  full_name='google.cloud.aiplatform.v1.PipelineState',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_QUEUED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_PENDING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_RUNNING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_SUCCEEDED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_FAILED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_CANCELLING', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_CANCELLED', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PIPELINE_STATE_PAUSED', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=110,
  serialized_end=385,
)
_sym_db.RegisterEnumDescriptor(_PIPELINESTATE)

PipelineState = enum_type_wrapper.EnumTypeWrapper(_PIPELINESTATE)
PIPELINE_STATE_UNSPECIFIED = 0
PIPELINE_STATE_QUEUED = 1
PIPELINE_STATE_PENDING = 2
PIPELINE_STATE_RUNNING = 3
PIPELINE_STATE_SUCCEEDED = 4
PIPELINE_STATE_FAILED = 5
PIPELINE_STATE_CANCELLING = 6
PIPELINE_STATE_CANCELLED = 7
PIPELINE_STATE_PAUSED = 8


DESCRIPTOR.enum_types_by_name['PipelineState'] = _PIPELINESTATE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)