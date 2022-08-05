# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/annotation_spec.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/aiplatform/v1/annotation_spec.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xcc\x02\n\x0e\x41nnotationSpec\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x11\n\x04\x65tag\x18\x05 \x01(\tB\x03\xe0\x41\x01:\x8c\x01\xea\x41\x88\x01\n(aiplatform.googleapis.com/AnnotationSpec\x12\\projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}B\xd7\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x13\x41nnotationSpecProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.annotation_spec_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\023AnnotationSpecProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _ANNOTATIONSPEC.fields_by_name['name']._options = None
  _ANNOTATIONSPEC.fields_by_name['name']._serialized_options = b'\340A\003'
  _ANNOTATIONSPEC.fields_by_name['display_name']._options = None
  _ANNOTATIONSPEC.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _ANNOTATIONSPEC.fields_by_name['create_time']._options = None
  _ANNOTATIONSPEC.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ANNOTATIONSPEC.fields_by_name['update_time']._options = None
  _ANNOTATIONSPEC.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _ANNOTATIONSPEC.fields_by_name['etag']._options = None
  _ANNOTATIONSPEC.fields_by_name['etag']._serialized_options = b'\340A\001'
  _ANNOTATIONSPEC._options = None
  _ANNOTATIONSPEC._serialized_options = b'\352A\210\001\n(aiplatform.googleapis.com/AnnotationSpec\022\\projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}'
  _ANNOTATIONSPEC._serialized_start=174
  _ANNOTATIONSPEC._serialized_end=506
# @@protoc_insertion_point(module_scope)
