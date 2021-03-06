# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/transport_sockets/quic/v4alpha/quic_transport.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.extensions.transport_sockets.tls.v4alpha import tls_pb2 as envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_tls__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/transport_sockets/quic/v4alpha/quic_transport.proto',
  package='envoy.extensions.transport_sockets.quic.v4alpha',
  syntax='proto3',
  serialized_options=b'\n=io.envoyproxy.envoy.extensions.transport_sockets.quic.v4alphaB\022QuicTransportProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDenvoy/extensions/transport_sockets/quic/v4alpha/quic_transport.proto\x12/envoy.extensions.transport_sockets.quic.v4alpha\x1a\x38\x65nvoy/extensions/transport_sockets/tls/v4alpha/tls.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xd4\x01\n\x17QuicDownstreamTransport\x12n\n\x16\x64ownstream_tls_context\x18\x01 \x01(\x0b\x32\x44.envoy.extensions.transport_sockets.tls.v4alpha.DownstreamTlsContextB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01:I\x9a\xc5\x88\x1e\x44\nBenvoy.extensions.transport_sockets.quic.v3.QuicDownstreamTransport\"\xcc\x01\n\x15QuicUpstreamTransport\x12j\n\x14upstream_tls_context\x18\x01 \x01(\x0b\x32\x42.envoy.extensions.transport_sockets.tls.v4alpha.UpstreamTlsContextB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01:G\x9a\xc5\x88\x1e\x42\n@envoy.extensions.transport_sockets.quic.v3.QuicUpstreamTransportB]\n=io.envoyproxy.envoy.extensions.transport_sockets.quic.v4alphaB\x12QuicTransportProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_tls__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_QUICDOWNSTREAMTRANSPORT = _descriptor.Descriptor(
  name='QuicDownstreamTransport',
  full_name='envoy.extensions.transport_sockets.quic.v4alpha.QuicDownstreamTransport',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='downstream_tls_context', full_name='envoy.extensions.transport_sockets.quic.v4alpha.QuicDownstreamTransport.downstream_tls_context', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036D\nBenvoy.extensions.transport_sockets.quic.v3.QuicDownstreamTransport',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=271,
  serialized_end=483,
)


_QUICUPSTREAMTRANSPORT = _descriptor.Descriptor(
  name='QuicUpstreamTransport',
  full_name='envoy.extensions.transport_sockets.quic.v4alpha.QuicUpstreamTransport',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='upstream_tls_context', full_name='envoy.extensions.transport_sockets.quic.v4alpha.QuicUpstreamTransport.upstream_tls_context', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036B\n@envoy.extensions.transport_sockets.quic.v3.QuicUpstreamTransport',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=486,
  serialized_end=690,
)

_QUICDOWNSTREAMTRANSPORT.fields_by_name['downstream_tls_context'].message_type = envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_tls__pb2._DOWNSTREAMTLSCONTEXT
_QUICUPSTREAMTRANSPORT.fields_by_name['upstream_tls_context'].message_type = envoy_dot_extensions_dot_transport__sockets_dot_tls_dot_v4alpha_dot_tls__pb2._UPSTREAMTLSCONTEXT
DESCRIPTOR.message_types_by_name['QuicDownstreamTransport'] = _QUICDOWNSTREAMTRANSPORT
DESCRIPTOR.message_types_by_name['QuicUpstreamTransport'] = _QUICUPSTREAMTRANSPORT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

QuicDownstreamTransport = _reflection.GeneratedProtocolMessageType('QuicDownstreamTransport', (_message.Message,), {
  'DESCRIPTOR' : _QUICDOWNSTREAMTRANSPORT,
  '__module__' : 'envoy.extensions.transport_sockets.quic.v4alpha.quic_transport_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.quic.v4alpha.QuicDownstreamTransport)
  })
_sym_db.RegisterMessage(QuicDownstreamTransport)

QuicUpstreamTransport = _reflection.GeneratedProtocolMessageType('QuicUpstreamTransport', (_message.Message,), {
  'DESCRIPTOR' : _QUICUPSTREAMTRANSPORT,
  '__module__' : 'envoy.extensions.transport_sockets.quic.v4alpha.quic_transport_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.quic.v4alpha.QuicUpstreamTransport)
  })
_sym_db.RegisterMessage(QuicUpstreamTransport)


DESCRIPTOR._options = None
_QUICDOWNSTREAMTRANSPORT.fields_by_name['downstream_tls_context']._options = None
_QUICDOWNSTREAMTRANSPORT._options = None
_QUICUPSTREAMTRANSPORT.fields_by_name['upstream_tls_context']._options = None
_QUICUPSTREAMTRANSPORT._options = None
# @@protoc_insertion_point(module_scope)
