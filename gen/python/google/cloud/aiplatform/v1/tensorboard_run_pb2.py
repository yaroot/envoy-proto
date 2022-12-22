# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/tensorboard_run.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/aiplatform/v1/tensorboard_run.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xdd\x03\n\x0eTensorboardRun\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x46\n\x06labels\x18\x08 \x03(\x0b\x32\x36.google.cloud.aiplatform.v1.TensorboardRun.LabelsEntry\x12\x0c\n\x04\x65tag\x18\t \x01(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x96\x01\xea\x41\x92\x01\n(aiplatform.googleapis.com/TensorboardRun\x12\x66projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}B\xd7\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x13TensorboardRunProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.tensorboard_run_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\023TensorboardRunProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _TENSORBOARDRUN_LABELSENTRY._options = None
  _TENSORBOARDRUN_LABELSENTRY._serialized_options = b'8\001'
  _TENSORBOARDRUN.fields_by_name['name']._options = None
  _TENSORBOARDRUN.fields_by_name['name']._serialized_options = b'\340A\003'
  _TENSORBOARDRUN.fields_by_name['display_name']._options = None
  _TENSORBOARDRUN.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _TENSORBOARDRUN.fields_by_name['create_time']._options = None
  _TENSORBOARDRUN.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _TENSORBOARDRUN.fields_by_name['update_time']._options = None
  _TENSORBOARDRUN.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TENSORBOARDRUN._options = None
  _TENSORBOARDRUN._serialized_options = b'\352A\222\001\n(aiplatform.googleapis.com/TensorboardRun\022fprojects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}'
  _TENSORBOARDRUN._serialized_start=174
  _TENSORBOARDRUN._serialized_end=651
  _TENSORBOARDRUN_LABELSENTRY._serialized_start=453
  _TENSORBOARDRUN_LABELSENTRY._serialized_end=498
# @@protoc_insertion_point(module_scope)