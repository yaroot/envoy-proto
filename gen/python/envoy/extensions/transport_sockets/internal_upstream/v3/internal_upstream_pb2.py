# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/transport_sockets/internal_upstream/v3/internal_upstream.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.type.metadata.v3 import metadata_pb2 as envoy_dot_type_dot_metadata_dot_v3_dot_metadata__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nOenvoy/extensions/transport_sockets/internal_upstream/v3/internal_upstream.proto\x12\x37\x65nvoy.extensions.transport_sockets.internal_upstream.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a%envoy/type/metadata/v3/metadata.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xd9\x02\n\x19InternalUpstreamTransport\x12\x84\x01\n\x14passthrough_metadata\x18\x01 \x03(\x0b\x32\x66.envoy.extensions.transport_sockets.internal_upstream.v3.InternalUpstreamTransport.MetadataValueSource\x12I\n\x10transport_socket\x18\x03 \x01(\x0b\x32%.envoy.config.core.v3.TransportSocketB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x1aj\n\x13MetadataValueSource\x12<\n\x04kind\x18\x01 \x01(\x0b\x32$.envoy.type.metadata.v3.MetadataKindB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x15\n\x04name\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x42\xdc\x01\nEio.envoyproxy.envoy.extensions.transport_sockets.internal_upstream.v3B\x15InternalUpstreamProtoP\x01Zrgithub.com/envoyproxy/go-control-plane/envoy/extensions/transport_sockets/internal_upstream/v3;internal_upstreamv3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.extensions.transport_sockets.internal_upstream.v3.internal_upstream_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\nEio.envoyproxy.envoy.extensions.transport_sockets.internal_upstream.v3B\025InternalUpstreamProtoP\001Zrgithub.com/envoyproxy/go-control-plane/envoy/extensions/transport_sockets/internal_upstream/v3;internal_upstreamv3\272\200\310\321\006\002\020\002'
  _INTERNALUPSTREAMTRANSPORT_METADATAVALUESOURCE.fields_by_name['kind']._options = None
  _INTERNALUPSTREAMTRANSPORT_METADATAVALUESOURCE.fields_by_name['kind']._serialized_options = b'\372B\005\212\001\002\020\001'
  _INTERNALUPSTREAMTRANSPORT_METADATAVALUESOURCE.fields_by_name['name']._options = None
  _INTERNALUPSTREAMTRANSPORT_METADATAVALUESOURCE.fields_by_name['name']._serialized_options = b'\372B\004r\002\020\001'
  _INTERNALUPSTREAMTRANSPORT.fields_by_name['transport_socket']._options = None
  _INTERNALUPSTREAMTRANSPORT.fields_by_name['transport_socket']._serialized_options = b'\372B\005\212\001\002\020\001'
  _INTERNALUPSTREAMTRANSPORT._serialized_start=269
  _INTERNALUPSTREAMTRANSPORT._serialized_end=614
  _INTERNALUPSTREAMTRANSPORT_METADATAVALUESOURCE._serialized_start=508
  _INTERNALUPSTREAMTRANSPORT_METADATAVALUESOURCE._serialized_end=614
# @@protoc_insertion_point(module_scope)
