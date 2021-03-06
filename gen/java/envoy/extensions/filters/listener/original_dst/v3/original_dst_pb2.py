# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/listener/original_dst/v3/original_dst.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/listener/original_dst/v3/original_dst.proto',
  package='envoy.extensions.filters.listener.original_dst.v3',
  syntax='proto3',
  serialized_options=b'\n?io.envoyproxy.envoy.extensions.filters.listener.original_dst.v3B\020OriginalDstProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDenvoy/extensions/filters/listener/original_dst/v3/original_dst.proto\x12\x31\x65nvoy.extensions.filters.listener.original_dst.v3\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"N\n\x0bOriginalDst:?\x9a\xc5\x88\x1e:\n8envoy.config.filter.listener.original_dst.v2.OriginalDstB]\n?io.envoyproxy.envoy.extensions.filters.listener.original_dst.v3B\x10OriginalDstProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_ORIGINALDST = _descriptor.Descriptor(
  name='OriginalDst',
  full_name='envoy.extensions.filters.listener.original_dst.v3.OriginalDst',
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
  serialized_options=b'\232\305\210\036:\n8envoy.config.filter.listener.original_dst.v2.OriginalDst',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=189,
  serialized_end=267,
)

DESCRIPTOR.message_types_by_name['OriginalDst'] = _ORIGINALDST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OriginalDst = _reflection.GeneratedProtocolMessageType('OriginalDst', (_message.Message,), {
  'DESCRIPTOR' : _ORIGINALDST,
  '__module__' : 'envoy.extensions.filters.listener.original_dst.v3.original_dst_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.listener.original_dst.v3.OriginalDst)
  })
_sym_db.RegisterMessage(OriginalDst)


DESCRIPTOR._options = None
_ORIGINALDST._options = None
# @@protoc_insertion_point(module_scope)
