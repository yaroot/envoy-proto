# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/identity/accesscontextmanager/v1/access_policy.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/identity/accesscontextmanager/v1/access_policy.proto\x12\'google.identity.accesscontextmanager.v1\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x92\x02\n\x0c\x41\x63\x63\x65ssPolicy\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06parent\x18\x02 \x01(\t\x12\r\n\x05title\x18\x03 \x01(\t\x12\x0e\n\x06scopes\x18\x07 \x03(\t\x12/\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x65tag\x18\x06 \x01(\t:U\xea\x41R\n0accesscontextmanager.googleapis.com/AccessPolicy\x12\x1e\x61\x63\x63\x65ssPolicies/{access_policy}B\xa1\x02\n+com.google.identity.accesscontextmanager.v1B\x0bPolicyProtoP\x01Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\xa2\x02\x04GACM\xaa\x02\'Google.Identity.AccessContextManager.V1\xca\x02\'Google\\Identity\\AccessContextManager\\V1\xea\x02*Google::Identity::AccessContextManager::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.identity.accesscontextmanager.v1.access_policy_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n+com.google.identity.accesscontextmanager.v1B\013PolicyProtoP\001Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\242\002\004GACM\252\002\'Google.Identity.AccessContextManager.V1\312\002\'Google\\Identity\\AccessContextManager\\V1\352\002*Google::Identity::AccessContextManager::V1'
  _ACCESSPOLICY._options = None
  _ACCESSPOLICY._serialized_options = b'\352AR\n0accesscontextmanager.googleapis.com/AccessPolicy\022\036accessPolicies/{access_policy}'
  _ACCESSPOLICY._serialized_start=165
  _ACCESSPOLICY._serialized_end=439
# @@protoc_insertion_point(module_scope)
