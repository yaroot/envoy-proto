# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/transport_sockets/proxy_protocol/v3/upstream_proxy_protocol.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.config.core.v3 import proxy_protocol_pb2 as envoy_dot_config_dot_core_dot_v3_dot_proxy__protocol__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/transport_sockets/proxy_protocol/v3/upstream_proxy_protocol.proto',
  package='envoy.extensions.transport_sockets.proxy_protocol.v3',
  syntax='proto3',
  serialized_options=b'\nBio.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3B\032UpstreamProxyProtocolProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nRenvoy/extensions/transport_sockets/proxy_protocol/v3/upstream_proxy_protocol.proto\x12\x34\x65nvoy.extensions.transport_sockets.proxy_protocol.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a)envoy/config/core/v3/proxy_protocol.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xa6\x01\n\x1eProxyProtocolUpstreamTransport\x12\x39\n\x06\x63onfig\x18\x01 \x01(\x0b\x32).envoy.config.core.v3.ProxyProtocolConfig\x12I\n\x10transport_socket\x18\x02 \x01(\x0b\x32%.envoy.config.core.v3.TransportSocketB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x42j\nBio.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3B\x1aUpstreamProxyProtocolProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v3_dot_proxy__protocol__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_PROXYPROTOCOLUPSTREAMTRANSPORT = _descriptor.Descriptor(
  name='ProxyProtocolUpstreamTransport',
  full_name='envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config', full_name='envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transport_socket', full_name='envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.transport_socket', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=273,
  serialized_end=439,
)

_PROXYPROTOCOLUPSTREAMTRANSPORT.fields_by_name['config'].message_type = envoy_dot_config_dot_core_dot_v3_dot_proxy__protocol__pb2._PROXYPROTOCOLCONFIG
_PROXYPROTOCOLUPSTREAMTRANSPORT.fields_by_name['transport_socket'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._TRANSPORTSOCKET
DESCRIPTOR.message_types_by_name['ProxyProtocolUpstreamTransport'] = _PROXYPROTOCOLUPSTREAMTRANSPORT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ProxyProtocolUpstreamTransport = _reflection.GeneratedProtocolMessageType('ProxyProtocolUpstreamTransport', (_message.Message,), {
  'DESCRIPTOR' : _PROXYPROTOCOLUPSTREAMTRANSPORT,
  '__module__' : 'envoy.extensions.transport_sockets.proxy_protocol.v3.upstream_proxy_protocol_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)
  })
_sym_db.RegisterMessage(ProxyProtocolUpstreamTransport)


DESCRIPTOR._options = None
_PROXYPROTOCOLUPSTREAMTRANSPORT.fields_by_name['transport_socket']._options = None
# @@protoc_insertion_point(module_scope)