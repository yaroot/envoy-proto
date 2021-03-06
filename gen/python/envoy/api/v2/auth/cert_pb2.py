# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/api/v2/auth/cert.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from envoy.api.v2.auth import common_pb2 as envoy_dot_api_dot_v2_dot_auth_dot_common__pb2
from envoy.api.v2.auth import secret_pb2 as envoy_dot_api_dot_v2_dot_auth_dot_secret__pb2
from envoy.api.v2.auth import tls_pb2 as envoy_dot_api_dot_v2_dot_auth_dot_tls__pb2

from envoy.api.v2.auth.common_pb2 import *
from envoy.api.v2.auth.secret_pb2 import *
from envoy.api.v2.auth.tls_pb2 import *

DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/api/v2/auth/cert.proto',
  package='envoy.api.v2.auth',
  syntax='proto3',
  serialized_options=b'\n\037io.envoyproxy.envoy.api.v2.authB\tCertProtoP\001\362\230\376\217\005+\022)envoy.extensions.transport_sockets.tls.v3',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1c\x65nvoy/api/v2/auth/cert.proto\x12\x11\x65nvoy.api.v2.auth\x1a\x1eudpa/annotations/migrate.proto\x1a\x1e\x65nvoy/api/v2/auth/common.proto\x1a\x1e\x65nvoy/api/v2/auth/secret.proto\x1a\x1b\x65nvoy/api/v2/auth/tls.protoB_\n\x1fio.envoyproxy.envoy.api.v2.authB\tCertProtoP\x01\xf2\x98\xfe\x8f\x05+\x12)envoy.extensions.transport_sockets.tls.v3P\x01P\x02P\x03\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_auth_dot_common__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_auth_dot_secret__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_auth_dot_tls__pb2.DESCRIPTOR,],
  public_dependencies=[envoy_dot_api_dot_v2_dot_auth_dot_common__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_auth_dot_secret__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_auth_dot_tls__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
