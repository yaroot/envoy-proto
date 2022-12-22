# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/notebooks/v1/environment.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+google/cloud/notebooks/v1/environment.proto\x12\x19google.cloud.notebooks.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x84\x03\n\x0b\x45nvironment\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x36\n\x08vm_image\x18\x06 \x01(\x0b\x32\".google.cloud.notebooks.v1.VmImageH\x00\x12\x44\n\x0f\x63ontainer_image\x18\x07 \x01(\x0b\x32).google.cloud.notebooks.v1.ContainerImageH\x00\x12\x1b\n\x13post_startup_script\x18\x08 \x01(\t\x12\x34\n\x0b\x63reate_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03:X\xea\x41U\n$notebooks.googleapis.com/Environment\x12-projects/{project}/environments/{environment}B\x0c\n\nimage_type\"V\n\x07VmImage\x12\x14\n\x07project\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\nimage_name\x18\x02 \x01(\tH\x00\x12\x16\n\x0cimage_family\x18\x03 \x01(\tH\x00\x42\x07\n\x05image\"6\n\x0e\x43ontainerImage\x12\x17\n\nrepository\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x0b\n\x03tag\x18\x02 \x01(\tB\xce\x01\n\x1d\x63om.google.cloud.notebooks.v1B\x10\x45nvironmentProtoP\x01ZBgoogle.golang.org/genproto/googleapis/cloud/notebooks/v1;notebooks\xaa\x02\x19Google.Cloud.Notebooks.V1\xca\x02\x19Google\\Cloud\\Notebooks\\V1\xea\x02\x1cGoogle::Cloud::Notebooks::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.notebooks.v1.environment_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.cloud.notebooks.v1B\020EnvironmentProtoP\001ZBgoogle.golang.org/genproto/googleapis/cloud/notebooks/v1;notebooks\252\002\031Google.Cloud.Notebooks.V1\312\002\031Google\\Cloud\\Notebooks\\V1\352\002\034Google::Cloud::Notebooks::V1'
  _ENVIRONMENT.fields_by_name['name']._options = None
  _ENVIRONMENT.fields_by_name['name']._serialized_options = b'\340A\003'
  _ENVIRONMENT.fields_by_name['create_time']._options = None
  _ENVIRONMENT.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ENVIRONMENT._options = None
  _ENVIRONMENT._serialized_options = b'\352AU\n$notebooks.googleapis.com/Environment\022-projects/{project}/environments/{environment}'
  _VMIMAGE.fields_by_name['project']._options = None
  _VMIMAGE.fields_by_name['project']._serialized_options = b'\340A\002'
  _CONTAINERIMAGE.fields_by_name['repository']._options = None
  _CONTAINERIMAGE.fields_by_name['repository']._serialized_options = b'\340A\002'
  _ENVIRONMENT._serialized_start=168
  _ENVIRONMENT._serialized_end=556
  _VMIMAGE._serialized_start=558
  _VMIMAGE._serialized_end=644
  _CONTAINERIMAGE._serialized_start=646
  _CONTAINERIMAGE._serialized_end=700
# @@protoc_insertion_point(module_scope)