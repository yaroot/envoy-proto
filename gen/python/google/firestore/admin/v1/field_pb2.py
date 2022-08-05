# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/admin/v1/field.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.firestore.admin.v1 import index_pb2 as google_dot_firestore_dot_admin_dot_v1_dot_index__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%google/firestore/admin/v1/field.proto\x12\x19google.firestore.admin.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a%google/firestore/admin/v1/index.proto\"\xc5\x04\n\x05\x46ield\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x42\n\x0cindex_config\x18\x02 \x01(\x0b\x32,.google.firestore.admin.v1.Field.IndexConfig\x12>\n\nttl_config\x18\x03 \x01(\x0b\x32*.google.firestore.admin.v1.Field.TtlConfig\x1a\x89\x01\n\x0bIndexConfig\x12\x31\n\x07indexes\x18\x01 \x03(\x0b\x32 .google.firestore.admin.v1.Index\x12\x1c\n\x14uses_ancestor_config\x18\x02 \x01(\x08\x12\x16\n\x0e\x61ncestor_field\x18\x03 \x01(\t\x12\x11\n\treverting\x18\x04 \x01(\x08\x1a\x9d\x01\n\tTtlConfig\x12\x44\n\x05state\x18\x01 \x01(\x0e\x32\x30.google.firestore.admin.v1.Field.TtlConfig.StateB\x03\xe0\x41\x03\"J\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\n\n\x06\x41\x43TIVE\x10\x02\x12\x10\n\x0cNEEDS_REPAIR\x10\x03:y\xea\x41v\n\x1e\x66irestore.googleapis.com/Field\x12Tprojects/{project}/databases/{database}/collectionGroups/{collection}/fields/{field}B\xde\x01\n\x1d\x63om.google.firestore.admin.v1B\nFieldProtoP\x01Z>google.golang.org/genproto/googleapis/firestore/admin/v1;admin\xa2\x02\x04GCFS\xaa\x02\x1fGoogle.Cloud.Firestore.Admin.V1\xca\x02\x1fGoogle\\Cloud\\Firestore\\Admin\\V1\xea\x02#Google::Cloud::Firestore::Admin::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.admin.v1.field_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.google.firestore.admin.v1B\nFieldProtoP\001Z>google.golang.org/genproto/googleapis/firestore/admin/v1;admin\242\002\004GCFS\252\002\037Google.Cloud.Firestore.Admin.V1\312\002\037Google\\Cloud\\Firestore\\Admin\\V1\352\002#Google::Cloud::Firestore::Admin::V1'
  _FIELD_TTLCONFIG.fields_by_name['state']._options = None
  _FIELD_TTLCONFIG.fields_by_name['state']._serialized_options = b'\340A\003'
  _FIELD.fields_by_name['name']._options = None
  _FIELD.fields_by_name['name']._serialized_options = b'\340A\002'
  _FIELD._options = None
  _FIELD._serialized_options = b'\352Av\n\036firestore.googleapis.com/Field\022Tprojects/{project}/databases/{database}/collectionGroups/{collection}/fields/{field}'
  _FIELD._serialized_start=168
  _FIELD._serialized_end=749
  _FIELD_INDEXCONFIG._serialized_start=329
  _FIELD_INDEXCONFIG._serialized_end=466
  _FIELD_TTLCONFIG._serialized_start=469
  _FIELD_TTLCONFIG._serialized_end=626
  _FIELD_TTLCONFIG_STATE._serialized_start=552
  _FIELD_TTLCONFIG_STATE._serialized_end=626
# @@protoc_insertion_point(module_scope)
