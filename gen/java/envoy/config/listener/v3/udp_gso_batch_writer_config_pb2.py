# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/listener/v3/udp_gso_batch_writer_config.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/listener/v3/udp_gso_batch_writer_config.proto',
  package='envoy.config.listener.v3',
  syntax='proto3',
  serialized_options=b'\n&io.envoyproxy.envoy.config.listener.v3B\034UdpGsoBatchWriterConfigProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:envoy/config/listener/v3/udp_gso_batch_writer_config.proto\x12\x18\x65nvoy.config.listener.v3\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"\x1a\n\x18UdpGsoBatchWriterOptionsBP\n&io.envoyproxy.envoy.config.listener.v3B\x1cUdpGsoBatchWriterConfigProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_UDPGSOBATCHWRITEROPTIONS = _descriptor.Descriptor(
  name='UdpGsoBatchWriterOptions',
  full_name='envoy.config.listener.v3.UdpGsoBatchWriterOptions',
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
  serialized_start=218,
  serialized_end=244,
)

DESCRIPTOR.message_types_by_name['UdpGsoBatchWriterOptions'] = _UDPGSOBATCHWRITEROPTIONS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UdpGsoBatchWriterOptions = _reflection.GeneratedProtocolMessageType('UdpGsoBatchWriterOptions', (_message.Message,), {
  'DESCRIPTOR' : _UDPGSOBATCHWRITEROPTIONS,
  '__module__' : 'envoy.config.listener.v3.udp_gso_batch_writer_config_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.listener.v3.UdpGsoBatchWriterOptions)
  })
_sym_db.RegisterMessage(UdpGsoBatchWriterOptions)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
