# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/vision/v1p3beta1/geometry.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/vision/v1p3beta1/geometry.proto\x12\x1dgoogle.cloud.vision.v1p3beta1\"\x1e\n\x06Vertex\x12\t\n\x01x\x18\x01 \x01(\x05\x12\t\n\x01y\x18\x02 \x01(\x05\"(\n\x10NormalizedVertex\x12\t\n\x01x\x18\x01 \x01(\x02\x12\t\n\x01y\x18\x02 \x01(\x02\"\x95\x01\n\x0c\x42oundingPoly\x12\x37\n\x08vertices\x18\x01 \x03(\x0b\x32%.google.cloud.vision.v1p3beta1.Vertex\x12L\n\x13normalized_vertices\x18\x02 \x03(\x0b\x32/.google.cloud.vision.v1p3beta1.NormalizedVertex\"+\n\x08Position\x12\t\n\x01x\x18\x01 \x01(\x02\x12\t\n\x01y\x18\x02 \x01(\x02\x12\t\n\x01z\x18\x03 \x01(\x02\x42\x83\x01\n!com.google.cloud.vision.v1p3beta1B\rGeometryProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p3beta1;vision\xf8\x01\x01\xa2\x02\x04GCVNb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.vision.v1p3beta1.geometry_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.vision.v1p3beta1B\rGeometryProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p3beta1;vision\370\001\001\242\002\004GCVN'
  _VERTEX._serialized_start=79
  _VERTEX._serialized_end=109
  _NORMALIZEDVERTEX._serialized_start=111
  _NORMALIZEDVERTEX._serialized_end=151
  _BOUNDINGPOLY._serialized_start=154
  _BOUNDINGPOLY._serialized_end=303
  _POSITION._serialized_start=305
  _POSITION._serialized_end=348
# @@protoc_insertion_point(module_scope)