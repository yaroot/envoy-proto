# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/filter/network/sni_cluster/v2/sni_cluster.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/filter/network/sni_cluster/v2/sni_cluster.proto',
  package='envoy.config.filter.network.sni_cluster.v2',
  syntax='proto3',
  serialized_options=b'\n8io.envoyproxy.envoy.config.filter.network.sni_cluster.v2B\017SniClusterProtoP\001\362\230\376\217\0051\022/envoy.extensions.filters.network.sni_cluster.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<envoy/config/filter/network/sni_cluster/v2/sni_cluster.proto\x12*envoy.config.filter.network.sni_cluster.v2\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\"\x0c\n\nSniClusterB\x8c\x01\n8io.envoyproxy.envoy.config.filter.network.sni_cluster.v2B\x0fSniClusterProtoP\x01\xf2\x98\xfe\x8f\x05\x31\x12/envoy.extensions.filters.network.sni_cluster.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_SNICLUSTER = _descriptor.Descriptor(
  name='SniCluster',
  full_name='envoy.config.filter.network.sni_cluster.v2.SniCluster',
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
  serialized_start=171,
  serialized_end=183,
)

DESCRIPTOR.message_types_by_name['SniCluster'] = _SNICLUSTER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SniCluster = _reflection.GeneratedProtocolMessageType('SniCluster', (_message.Message,), {
  'DESCRIPTOR' : _SNICLUSTER,
  '__module__' : 'envoy.config.filter.network.sni_cluster.v2.sni_cluster_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.filter.network.sni_cluster.v2.SniCluster)
  })
_sym_db.RegisterMessage(SniCluster)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
