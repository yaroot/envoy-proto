# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/formatter/req_without_query/v3/req_without_query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/formatter/req_without_query/v3/req_without_query.proto',
  package='envoy.extensions.formatter.req_without_query.v3',
  syntax='proto3',
  serialized_options=b'\n=io.envoyproxy.envoy.extensions.formatter.req_without_query.v3B\024ReqWithoutQueryProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nGenvoy/extensions/formatter/req_without_query/v3/req_without_query.proto\x12/envoy.extensions.formatter.req_without_query.v3\x1a\x1dudpa/annotations/status.proto\"\x11\n\x0fReqWithoutQueryB_\n=io.envoyproxy.envoy.extensions.formatter.req_without_query.v3B\x14ReqWithoutQueryProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_REQWITHOUTQUERY = _descriptor.Descriptor(
  name='ReqWithoutQuery',
  full_name='envoy.extensions.formatter.req_without_query.v3.ReqWithoutQuery',
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
  serialized_start=155,
  serialized_end=172,
)

DESCRIPTOR.message_types_by_name['ReqWithoutQuery'] = _REQWITHOUTQUERY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ReqWithoutQuery = _reflection.GeneratedProtocolMessageType('ReqWithoutQuery', (_message.Message,), {
  'DESCRIPTOR' : _REQWITHOUTQUERY,
  '__module__' : 'envoy.extensions.formatter.req_without_query.v3.req_without_query_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.formatter.req_without_query.v3.ReqWithoutQuery)
  })
_sym_db.RegisterMessage(ReqWithoutQuery)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
