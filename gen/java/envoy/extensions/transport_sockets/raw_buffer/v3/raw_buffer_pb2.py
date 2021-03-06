# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/transport_sockets/raw_buffer/v3/raw_buffer.proto
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
  name='envoy/extensions/transport_sockets/raw_buffer/v3/raw_buffer.proto',
  package='envoy.extensions.transport_sockets.raw_buffer.v3',
  syntax='proto3',
  serialized_options=b'\n>io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3B\016RawBufferProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nAenvoy/extensions/transport_sockets/raw_buffer/v3/raw_buffer.proto\x12\x30\x65nvoy.extensions.transport_sockets.raw_buffer.v3\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"I\n\tRawBuffer:<\x9a\xc5\x88\x1e\x37\n5envoy.config.transport_socket.raw_buffer.v2.RawBufferBZ\n>io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3B\x0eRawBufferProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_RAWBUFFER = _descriptor.Descriptor(
  name='RawBuffer',
  full_name='envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer',
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
  serialized_options=b'\232\305\210\0367\n5envoy.config.transport_socket.raw_buffer.v2.RawBuffer',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=185,
  serialized_end=258,
)

DESCRIPTOR.message_types_by_name['RawBuffer'] = _RAWBUFFER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RawBuffer = _reflection.GeneratedProtocolMessageType('RawBuffer', (_message.Message,), {
  'DESCRIPTOR' : _RAWBUFFER,
  '__module__' : 'envoy.extensions.transport_sockets.raw_buffer.v3.raw_buffer_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer)
  })
_sym_db.RegisterMessage(RawBuffer)


DESCRIPTOR._options = None
_RAWBUFFER._options = None
# @@protoc_insertion_point(module_scope)
