# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/upstreams/http/http/v3/http_connection_pool.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/upstreams/http/http/v3/http_connection_pool.proto',
  package='envoy.extensions.upstreams.http.http.v3',
  syntax='proto3',
  serialized_options=b'\n5io.envoyproxy.envoy.extensions.upstreams.http.http.v3B!HttpConnectionPoolProtoOuterClassP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBenvoy/extensions/upstreams/http/http/v3/http_connection_pool.proto\x12\'envoy.extensions.upstreams.http.http.v3\x1a\x1dudpa/annotations/status.proto\"\x19\n\x17HttpConnectionPoolProtoBd\n5io.envoyproxy.envoy.extensions.upstreams.http.http.v3B!HttpConnectionPoolProtoOuterClassP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_HTTPCONNECTIONPOOLPROTO = _descriptor.Descriptor(
  name='HttpConnectionPoolProto',
  full_name='envoy.extensions.upstreams.http.http.v3.HttpConnectionPoolProto',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=142,
  serialized_end=167,
)

DESCRIPTOR.message_types_by_name['HttpConnectionPoolProto'] = _HTTPCONNECTIONPOOLPROTO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

HttpConnectionPoolProto = _reflection.GeneratedProtocolMessageType('HttpConnectionPoolProto', (_message.Message,), {
  'DESCRIPTOR' : _HTTPCONNECTIONPOOLPROTO,
  '__module__' : 'envoy.extensions.upstreams.http.http.v3.http_connection_pool_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.upstreams.http.http.v3.HttpConnectionPoolProto)
  })
_sym_db.RegisterMessage(HttpConnectionPoolProto)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
