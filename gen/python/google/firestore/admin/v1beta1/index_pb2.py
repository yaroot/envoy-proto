# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/admin/v1beta1/index.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*google/firestore/admin/v1beta1/index.proto\x12\x1egoogle.firestore.admin.v1beta1\x1a\x1cgoogle/api/annotations.proto\"\xb0\x01\n\nIndexField\x12\x12\n\nfield_path\x18\x01 \x01(\t\x12=\n\x04mode\x18\x02 \x01(\x0e\x32/.google.firestore.admin.v1beta1.IndexField.Mode\"O\n\x04Mode\x12\x14\n\x10MODE_UNSPECIFIED\x10\x00\x12\r\n\tASCENDING\x10\x02\x12\x0e\n\nDESCENDING\x10\x03\x12\x12\n\x0e\x41RRAY_CONTAINS\x10\x04\"\xe8\x01\n\x05Index\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x15\n\rcollection_id\x18\x02 \x01(\t\x12:\n\x06\x66ields\x18\x03 \x03(\x0b\x32*.google.firestore.admin.v1beta1.IndexField\x12:\n\x05state\x18\x06 \x01(\x0e\x32+.google.firestore.admin.v1beta1.Index.State\"B\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x03\x12\t\n\x05READY\x10\x02\x12\t\n\x05\x45RROR\x10\x05\x42\xa5\x01\n\"com.google.firestore.admin.v1beta1B\nIndexProtoP\x01ZCgoogle.golang.org/genproto/googleapis/firestore/admin/v1beta1;admin\xa2\x02\x04GCFS\xaa\x02$Google.Cloud.Firestore.Admin.V1Beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.admin.v1beta1.index_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.firestore.admin.v1beta1B\nIndexProtoP\001ZCgoogle.golang.org/genproto/googleapis/firestore/admin/v1beta1;admin\242\002\004GCFS\252\002$Google.Cloud.Firestore.Admin.V1Beta1'
  _INDEXFIELD._serialized_start=109
  _INDEXFIELD._serialized_end=285
  _INDEXFIELD_MODE._serialized_start=206
  _INDEXFIELD_MODE._serialized_end=285
  _INDEX._serialized_start=288
  _INDEX._serialized_end=520
  _INDEX_STATE._serialized_start=454
  _INDEX_STATE._serialized_end=520
# @@protoc_insertion_point(module_scope)
