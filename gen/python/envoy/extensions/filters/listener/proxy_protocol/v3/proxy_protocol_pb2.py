# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/listener/proxy_protocol/v3/proxy_protocol.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nHenvoy/extensions/filters/listener/proxy_protocol/v3/proxy_protocol.proto\x12\x33\x65nvoy.extensions.filters.listener.proxy_protocol.v3\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xab\x03\n\rProxyProtocol\x12V\n\x05rules\x18\x01 \x03(\x0b\x32G.envoy.extensions.filters.listener.proxy_protocol.v3.ProxyProtocol.Rule\x12-\n%allow_requests_without_proxy_protocol\x18\x02 \x01(\x08\x1a@\n\x0cKeyValuePair\x12\x1a\n\x12metadata_namespace\x18\x01 \x01(\t\x12\x14\n\x03key\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x1a\x8b\x01\n\x04Rule\x12\x1a\n\x08tlv_type\x18\x01 \x01(\rB\x08\xfa\x42\x05*\x03\x10\x80\x02\x12g\n\x0eon_tlv_present\x18\x02 \x01(\x0b\x32O.envoy.extensions.filters.listener.proxy_protocol.v3.ProxyProtocol.KeyValuePair:C\x9a\xc5\x88\x1e>\n<envoy.config.filter.listener.proxy_protocol.v2.ProxyProtocolB\xce\x01\nAio.envoyproxy.envoy.extensions.filters.listener.proxy_protocol.v3B\x12ProxyProtocolProtoP\x01Zkgithub.com/envoyproxy/go-control-plane/envoy/extensions/filters/listener/proxy_protocol/v3;proxy_protocolv3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.extensions.filters.listener.proxy_protocol.v3.proxy_protocol_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\nAio.envoyproxy.envoy.extensions.filters.listener.proxy_protocol.v3B\022ProxyProtocolProtoP\001Zkgithub.com/envoyproxy/go-control-plane/envoy/extensions/filters/listener/proxy_protocol/v3;proxy_protocolv3\272\200\310\321\006\002\020\002'
  _PROXYPROTOCOL_KEYVALUEPAIR.fields_by_name['key']._options = None
  _PROXYPROTOCOL_KEYVALUEPAIR.fields_by_name['key']._serialized_options = b'\372B\004r\002\020\001'
  _PROXYPROTOCOL_RULE.fields_by_name['tlv_type']._options = None
  _PROXYPROTOCOL_RULE.fields_by_name['tlv_type']._serialized_options = b'\372B\005*\003\020\200\002'
  _PROXYPROTOCOL._options = None
  _PROXYPROTOCOL._serialized_options = b'\232\305\210\036>\n<envoy.config.filter.listener.proxy_protocol.v2.ProxyProtocol'
  _PROXYPROTOCOL._serialized_start=221
  _PROXYPROTOCOL._serialized_end=648
  _PROXYPROTOCOL_KEYVALUEPAIR._serialized_start=373
  _PROXYPROTOCOL_KEYVALUEPAIR._serialized_end=437
  _PROXYPROTOCOL_RULE._serialized_start=440
  _PROXYPROTOCOL_RULE._serialized_end=579
# @@protoc_insertion_point(module_scope)
