# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/discovery/v2/sds.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.api.v2 import discovery_pb2 as envoy_dot_api_dot_v2_dot_discovery__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from envoy.annotations import resource_pb2 as envoy_dot_annotations_dot_resource__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$envoy/service/discovery/v2/sds.proto\x12\x1a\x65nvoy.service.discovery.v2\x1a\x1c\x65nvoy/api/v2/discovery.proto\x1a\x1cgoogle/api/annotations.proto\x1a envoy/annotations/resource.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\"\n\n\x08SdsDummy2\xec\x02\n\x16SecretDiscoveryService\x12_\n\x0c\x44\x65ltaSecrets\x12#.envoy.api.v2.DeltaDiscoveryRequest\x1a$.envoy.api.v2.DeltaDiscoveryResponse\"\x00(\x01\x30\x01\x12V\n\rStreamSecrets\x12\x1e.envoy.api.v2.DiscoveryRequest\x1a\x1f.envoy.api.v2.DiscoveryResponse\"\x00(\x01\x30\x01\x12w\n\x0c\x46\x65tchSecrets\x12\x1e.envoy.api.v2.DiscoveryRequest\x1a\x1f.envoy.api.v2.DiscoveryResponse\"&\x82\xd3\xe4\x93\x02\x17\"\x15/v2/discovery:secrets\x82\xd3\xe4\x93\x02\x03:\x01*\x1a \x8a\xa4\x96\xf3\x07\x1a\n\x18\x65nvoy.api.v2.auth.SecretB\xaf\x01\n(io.envoyproxy.envoy.service.discovery.v2B\x08SdsProtoP\x01ZMgithub.com/envoyproxy/go-control-plane/envoy/service/discovery/v2;discoveryv2\x88\x01\x01\xf2\x98\xfe\x8f\x05\x19\x12\x17\x65nvoy.service.secret.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.service.discovery.v2.sds_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n(io.envoyproxy.envoy.service.discovery.v2B\010SdsProtoP\001ZMgithub.com/envoyproxy/go-control-plane/envoy/service/discovery/v2;discoveryv2\210\001\001\362\230\376\217\005\031\022\027envoy.service.secret.v3\272\200\310\321\006\002\020\001'
  _SECRETDISCOVERYSERVICE._options = None
  _SECRETDISCOVERYSERVICE._serialized_options = b'\212\244\226\363\007\032\n\030envoy.api.v2.auth.Secret'
  _SECRETDISCOVERYSERVICE.methods_by_name['FetchSecrets']._options = None
  _SECRETDISCOVERYSERVICE.methods_by_name['FetchSecrets']._serialized_options = b'\202\323\344\223\002\027\"\025/v2/discovery:secrets\202\323\344\223\002\003:\001*'
  _SDSDUMMY._serialized_start=225
  _SDSDUMMY._serialized_end=235
  _SECRETDISCOVERYSERVICE._serialized_start=238
  _SECRETDISCOVERYSERVICE._serialized_end=602
# @@protoc_insertion_point(module_scope)
