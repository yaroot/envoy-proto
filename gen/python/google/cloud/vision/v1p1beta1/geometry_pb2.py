# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/vision/v1p1beta1/geometry.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/vision/v1p1beta1/geometry.proto\x12\x1dgoogle.cloud.vision.v1p1beta1\"\x1e\n\x06Vertex\x12\t\n\x01x\x18\x01 \x01(\x05\x12\t\n\x01y\x18\x02 \x01(\x05\"G\n\x0c\x42oundingPoly\x12\x37\n\x08vertices\x18\x01 \x03(\x0b\x32%.google.cloud.vision.v1p1beta1.Vertex\"+\n\x08Position\x12\t\n\x01x\x18\x01 \x01(\x02\x12\t\n\x01y\x18\x02 \x01(\x02\x12\t\n\x01z\x18\x03 \x01(\x02\x42|\n!com.google.cloud.vision.v1p1beta1B\rGeometryProtoP\x01ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p1beta1;vision\xf8\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.vision.v1p1beta1.geometry_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.vision.v1p1beta1B\rGeometryProtoP\001ZCgoogle.golang.org/genproto/googleapis/cloud/vision/v1p1beta1;vision\370\001\001'
  _VERTEX._serialized_start=79
  _VERTEX._serialized_end=109
  _BOUNDINGPOLY._serialized_start=111
  _BOUNDINGPOLY._serialized_end=182
  _POSITION._serialized_start=184
  _POSITION._serialized_end=227
# @@protoc_insertion_point(module_scope)
