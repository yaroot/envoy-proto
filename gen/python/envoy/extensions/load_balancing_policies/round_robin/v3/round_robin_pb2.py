# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/load_balancing_policies/round_robin/v3/round_robin.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.cluster.v3 import cluster_pb2 as envoy_dot_config_dot_cluster_dot_v3_dot_cluster__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nIenvoy/extensions/load_balancing_policies/round_robin/v3/round_robin.proto\x12\x37\x65nvoy.extensions.load_balancing_policies.round_robin.v3\x1a%envoy/config/cluster/v3/cluster.proto\x1a\x1dudpa/annotations/status.proto\"Y\n\nRoundRobin\x12K\n\x11slow_start_config\x18\x01 \x01(\x0b\x32\x30.envoy.config.cluster.v3.Cluster.SlowStartConfigB\xd0\x01\nEio.envoyproxy.envoy.extensions.load_balancing_policies.round_robin.v3B\x0fRoundRobinProtoP\x01Zlgithub.com/envoyproxy/go-control-plane/envoy/extensions/load_balancing_policies/round_robin/v3;round_robinv3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.extensions.load_balancing_policies.round_robin.v3.round_robin_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\nEio.envoyproxy.envoy.extensions.load_balancing_policies.round_robin.v3B\017RoundRobinProtoP\001Zlgithub.com/envoyproxy/go-control-plane/envoy/extensions/load_balancing_policies/round_robin/v3;round_robinv3\272\200\310\321\006\002\020\002'
  _ROUNDROBIN._serialized_start=204
  _ROUNDROBIN._serialized_end=293
# @@protoc_insertion_point(module_scope)
