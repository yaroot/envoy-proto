# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/admin/v1beta2/field.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.firestore.admin.v1beta2 import index_pb2 as google_dot_firestore_dot_admin_dot_v1beta2_dot_index__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/firestore/admin/v1beta2/field.proto\x12\x1egoogle.firestore.admin.v1beta2\x1a*google/firestore/admin/v1beta2/index.proto\x1a\x1cgoogle/api/annotations.proto\"\xef\x01\n\x05\x46ield\x12\x0c\n\x04name\x18\x01 \x01(\t\x12G\n\x0cindex_config\x18\x02 \x01(\x0b\x32\x31.google.firestore.admin.v1beta2.Field.IndexConfig\x1a\x8e\x01\n\x0bIndexConfig\x12\x36\n\x07indexes\x18\x01 \x03(\x0b\x32%.google.firestore.admin.v1beta2.Index\x12\x1c\n\x14uses_ancestor_config\x18\x02 \x01(\x08\x12\x16\n\x0e\x61ncestor_field\x18\x03 \x01(\t\x12\x11\n\treverting\x18\x04 \x01(\x08\x42\xa5\x01\n\"com.google.firestore.admin.v1beta2B\nFieldProtoP\x01ZCgoogle.golang.org/genproto/googleapis/firestore/admin/v1beta2;admin\xa2\x02\x04GCFS\xaa\x02$Google.Cloud.Firestore.Admin.V1Beta2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.admin.v1beta2.field_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.firestore.admin.v1beta2B\nFieldProtoP\001ZCgoogle.golang.org/genproto/googleapis/firestore/admin/v1beta2;admin\242\002\004GCFS\252\002$Google.Cloud.Firestore.Admin.V1Beta2'
  _FIELD._serialized_start=153
  _FIELD._serialized_end=392
  _FIELD_INDEXCONFIG._serialized_start=250
  _FIELD_INDEXCONFIG._serialized_end=392
# @@protoc_insertion_point(module_scope)