# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/formatter/metadata/v3/metadata.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/formatter/metadata/v3/metadata.proto',
  package='envoy.extensions.formatter.metadata.v3',
  syntax='proto3',
  serialized_options=b'\n4io.envoyproxy.envoy.extensions.formatter.metadata.v3B\rMetadataProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5envoy/extensions/formatter/metadata/v3/metadata.proto\x12&envoy.extensions.formatter.metadata.v3\x1a\x1dudpa/annotations/status.proto\"\n\n\x08MetadataBO\n4io.envoyproxy.envoy.extensions.formatter.metadata.v3B\rMetadataProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_METADATA = _descriptor.Descriptor(
  name='Metadata',
  full_name='envoy.extensions.formatter.metadata.v3.Metadata',
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
  serialized_start=128,
  serialized_end=138,
)

DESCRIPTOR.message_types_by_name['Metadata'] = _METADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Metadata = _reflection.GeneratedProtocolMessageType('Metadata', (_message.Message,), {
  'DESCRIPTOR' : _METADATA,
  '__module__' : 'envoy.extensions.formatter.metadata.v3.metadata_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.formatter.metadata.v3.Metadata)
  })
_sym_db.RegisterMessage(Metadata)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)