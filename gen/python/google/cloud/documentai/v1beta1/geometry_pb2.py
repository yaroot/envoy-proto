# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1beta1/geometry.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/documentai/v1beta1/geometry.proto\x12\x1fgoogle.cloud.documentai.v1beta1\"\x1e\n\x06Vertex\x12\t\n\x01x\x18\x01 \x01(\x05\x12\t\n\x01y\x18\x02 \x01(\x05\"(\n\x10NormalizedVertex\x12\t\n\x01x\x18\x01 \x01(\x02\x12\t\n\x01y\x18\x02 \x01(\x02\"\x99\x01\n\x0c\x42oundingPoly\x12\x39\n\x08vertices\x18\x01 \x03(\x0b\x32\'.google.cloud.documentai.v1beta1.Vertex\x12N\n\x13normalized_vertices\x18\x02 \x03(\x0b\x32\x31.google.cloud.documentai.v1beta1.NormalizedVertexB\xea\x01\n#com.google.cloud.documentai.v1beta1B\rGeometryProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta1;documentai\xaa\x02\x1fGoogle.Cloud.DocumentAI.V1Beta1\xca\x02\x1fGoogle\\Cloud\\DocumentAI\\V1beta1\xea\x02\"Google::Cloud::DocumentAI::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.documentai.v1beta1.geometry_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.documentai.v1beta1B\rGeometryProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta1;documentai\252\002\037Google.Cloud.DocumentAI.V1Beta1\312\002\037Google\\Cloud\\DocumentAI\\V1beta1\352\002\"Google::Cloud::DocumentAI::V1beta1'
  _VERTEX._serialized_start=83
  _VERTEX._serialized_end=113
  _NORMALIZEDVERTEX._serialized_start=115
  _NORMALIZEDVERTEX._serialized_end=155
  _BOUNDINGPOLY._serialized_start=158
  _BOUNDINGPOLY._serialized_end=311
# @@protoc_insertion_point(module_scope)
