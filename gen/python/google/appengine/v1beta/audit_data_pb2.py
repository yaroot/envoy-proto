# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/appengine/v1beta/audit_data.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.appengine.v1beta import appengine_pb2 as google_dot_appengine_dot_v1beta_dot_appengine__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(google/appengine/v1beta/audit_data.proto\x12\x17google.appengine.v1beta\x1a\'google/appengine/v1beta/appengine.proto\x1a\x1cgoogle/api/annotations.proto\"\xa5\x01\n\tAuditData\x12\x46\n\x0eupdate_service\x18\x01 \x01(\x0b\x32,.google.appengine.v1beta.UpdateServiceMethodH\x00\x12\x46\n\x0e\x63reate_version\x18\x02 \x01(\x0b\x32,.google.appengine.v1beta.CreateVersionMethodH\x00\x42\x08\n\x06method\"U\n\x13UpdateServiceMethod\x12>\n\x07request\x18\x01 \x01(\x0b\x32-.google.appengine.v1beta.UpdateServiceRequest\"U\n\x13\x43reateVersionMethod\x12>\n\x07request\x18\x01 \x01(\x0b\x32-.google.appengine.v1beta.CreateVersionRequestB\xd4\x01\n\x1b\x63om.google.appengine.v1betaB\x0e\x41uditDataProtoP\x01Z@google.golang.org/genproto/googleapis/appengine/v1beta;appengine\xaa\x02\x1dGoogle.Cloud.AppEngine.V1Beta\xca\x02\x1dGoogle\\Cloud\\AppEngine\\V1beta\xea\x02 Google::Cloud::AppEngine::V1betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.appengine.v1beta.audit_data_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.google.appengine.v1betaB\016AuditDataProtoP\001Z@google.golang.org/genproto/googleapis/appengine/v1beta;appengine\252\002\035Google.Cloud.AppEngine.V1Beta\312\002\035Google\\Cloud\\AppEngine\\V1beta\352\002 Google::Cloud::AppEngine::V1beta'
  _AUDITDATA._serialized_start=141
  _AUDITDATA._serialized_end=306
  _UPDATESERVICEMETHOD._serialized_start=308
  _UPDATESERVICEMETHOD._serialized_end=393
  _CREATEVERSIONMETHOD._serialized_start=395
  _CREATEVERSIONMETHOD._serialized_end=480
# @@protoc_insertion_point(module_scope)
