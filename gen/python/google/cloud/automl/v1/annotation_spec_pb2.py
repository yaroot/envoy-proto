# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1/annotation_spec.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/automl/v1/annotation_spec.proto\x12\x16google.cloud.automl.v1\x1a\x19google/api/resource.proto\"\xd6\x01\n\x0e\x41nnotationSpec\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x15\n\rexample_count\x18\t \x01(\x05:\x88\x01\xea\x41\x84\x01\n$automl.googleapis.com/AnnotationSpec\x12\\projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}B\xaa\x01\n\x1a\x63om.google.cloud.automl.v1P\x01Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\xaa\x02\x16Google.Cloud.AutoML.V1\xca\x02\x16Google\\Cloud\\AutoMl\\V1\xea\x02\x19Google::Cloud::AutoML::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.automl.v1.annotation_spec_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.automl.v1P\001Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1'
  _ANNOTATIONSPEC._options = None
  _ANNOTATIONSPEC._serialized_options = b'\352A\204\001\n$automl.googleapis.com/AnnotationSpec\022\\projects/{project}/locations/{location}/datasets/{dataset}/annotationSpecs/{annotation_spec}'
  _ANNOTATIONSPEC._serialized_start=100
  _ANNOTATIONSPEC._serialized_end=314
# @@protoc_insertion_point(module_scope)