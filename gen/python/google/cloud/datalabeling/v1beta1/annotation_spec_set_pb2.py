# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datalabeling/v1beta1/annotation_spec_set.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/cloud/datalabeling/v1beta1/annotation_spec_set.proto\x12!google.cloud.datalabeling.v1beta1\x1a\x19google/api/resource.proto\"\xa6\x02\n\x11\x41nnotationSpecSet\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12K\n\x10\x61nnotation_specs\x18\x04 \x03(\x0b\x32\x31.google.cloud.datalabeling.v1beta1.AnnotationSpec\x12\x1a\n\x12\x62locking_resources\x18\x05 \x03(\t:o\xea\x41l\n-datalabeling.googleapis.com/AnnotationSpecSet\x12;projects/{project}/annotationSpecSets/{annotation_spec_set}\";\n\x0e\x41nnotationSpec\x12\x14\n\x0c\x64isplay_name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\tB\xe7\x01\n%com.google.cloud.datalabeling.v1beta1P\x01ZMgoogle.golang.org/genproto/googleapis/cloud/datalabeling/v1beta1;datalabeling\xaa\x02!Google.Cloud.DataLabeling.V1Beta1\xca\x02!Google\\Cloud\\DataLabeling\\V1beta1\xea\x02$Google::Cloud::DataLabeling::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.datalabeling.v1beta1.annotation_spec_set_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.cloud.datalabeling.v1beta1P\001ZMgoogle.golang.org/genproto/googleapis/cloud/datalabeling/v1beta1;datalabeling\252\002!Google.Cloud.DataLabeling.V1Beta1\312\002!Google\\Cloud\\DataLabeling\\V1beta1\352\002$Google::Cloud::DataLabeling::V1beta1'
  _ANNOTATIONSPECSET._options = None
  _ANNOTATIONSPECSET._serialized_options = b'\352Al\n-datalabeling.googleapis.com/AnnotationSpecSet\022;projects/{project}/annotationSpecSets/{annotation_spec_set}'
  _ANNOTATIONSPECSET._serialized_start=126
  _ANNOTATIONSPECSET._serialized_end=420
  _ANNOTATIONSPEC._serialized_start=422
  _ANNOTATIONSPEC._serialized_end=481
# @@protoc_insertion_point(module_scope)
