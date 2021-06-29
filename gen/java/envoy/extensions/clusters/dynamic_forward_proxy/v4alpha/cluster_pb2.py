# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/clusters/dynamic_forward_proxy/v4alpha/cluster.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.extensions.common.dynamic_forward_proxy.v4alpha import dns_cache_pb2 as envoy_dot_extensions_dot_common_dot_dynamic__forward__proxy_dot_v4alpha_dot_dns__cache__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/clusters/dynamic_forward_proxy/v4alpha/cluster.proto',
  package='envoy.extensions.clusters.dynamic_forward_proxy.v4alpha',
  syntax='proto3',
  serialized_options=b'\nEio.envoyproxy.envoy.extensions.clusters.dynamic_forward_proxy.v4alphaB\014ClusterProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEenvoy/extensions/clusters/dynamic_forward_proxy/v4alpha/cluster.proto\x12\x37\x65nvoy.extensions.clusters.dynamic_forward_proxy.v4alpha\x1a\x45\x65nvoy/extensions/common/dynamic_forward_proxy/v4alpha/dns_cache.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xeb\x01\n\rClusterConfig\x12i\n\x10\x64ns_cache_config\x18\x01 \x01(\x0b\x32\x45.envoy.extensions.common.dynamic_forward_proxy.v4alpha.DnsCacheConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12&\n\x1e\x61llow_insecure_cluster_options\x18\x02 \x01(\x08:G\x9a\xc5\x88\x1e\x42\n@envoy.extensions.clusters.dynamic_forward_proxy.v3.ClusterConfigB_\nEio.envoyproxy.envoy.extensions.clusters.dynamic_forward_proxy.v4alphaB\x0c\x43lusterProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_extensions_dot_common_dot_dynamic__forward__proxy_dot_v4alpha_dot_dns__cache__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_CLUSTERCONFIG = _descriptor.Descriptor(
  name='ClusterConfig',
  full_name='envoy.extensions.clusters.dynamic_forward_proxy.v4alpha.ClusterConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='dns_cache_config', full_name='envoy.extensions.clusters.dynamic_forward_proxy.v4alpha.ClusterConfig.dns_cache_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allow_insecure_cluster_options', full_name='envoy.extensions.clusters.dynamic_forward_proxy.v4alpha.ClusterConfig.allow_insecure_cluster_options', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036B\n@envoy.extensions.clusters.dynamic_forward_proxy.v3.ClusterConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=293,
  serialized_end=528,
)

_CLUSTERCONFIG.fields_by_name['dns_cache_config'].message_type = envoy_dot_extensions_dot_common_dot_dynamic__forward__proxy_dot_v4alpha_dot_dns__cache__pb2._DNSCACHECONFIG
DESCRIPTOR.message_types_by_name['ClusterConfig'] = _CLUSTERCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ClusterConfig = _reflection.GeneratedProtocolMessageType('ClusterConfig', (_message.Message,), {
  'DESCRIPTOR' : _CLUSTERCONFIG,
  '__module__' : 'envoy.extensions.clusters.dynamic_forward_proxy.v4alpha.cluster_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.clusters.dynamic_forward_proxy.v4alpha.ClusterConfig)
  })
_sym_db.RegisterMessage(ClusterConfig)


DESCRIPTOR._options = None
_CLUSTERCONFIG.fields_by_name['dns_cache_config']._options = None
_CLUSTERCONFIG._options = None
# @@protoc_insertion_point(module_scope)
