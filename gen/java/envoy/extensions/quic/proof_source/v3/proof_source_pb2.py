# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/quic/proof_source/v3/proof_source.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/quic/proof_source/v3/proof_source.proto',
  package='envoy.extensions.quic.proof_source.v3',
  syntax='proto3',
  serialized_options=b'\n3io.envoyproxy.envoy.extensions.quic.proof_source.v3B\020ProofSourceProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8envoy/extensions/quic/proof_source/v3/proof_source.proto\x12%envoy.extensions.quic.proof_source.v3\x1a\x1dudpa/annotations/status.proto\"\x13\n\x11ProofSourceConfigBQ\n3io.envoyproxy.envoy.extensions.quic.proof_source.v3B\x10ProofSourceProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_PROOFSOURCECONFIG = _descriptor.Descriptor(
  name='ProofSourceConfig',
  full_name='envoy.extensions.quic.proof_source.v3.ProofSourceConfig',
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
  serialized_start=130,
  serialized_end=149,
)

DESCRIPTOR.message_types_by_name['ProofSourceConfig'] = _PROOFSOURCECONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ProofSourceConfig = _reflection.GeneratedProtocolMessageType('ProofSourceConfig', (_message.Message,), {
  'DESCRIPTOR' : _PROOFSOURCECONFIG,
  '__module__' : 'envoy.extensions.quic.proof_source.v3.proof_source_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.quic.proof_source.v3.ProofSourceConfig)
  })
_sym_db.RegisterMessage(ProofSourceConfig)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
