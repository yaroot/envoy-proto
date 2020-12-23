# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/network/tcp_proxy/v3/tcp_proxy.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.accesslog.v3 import accesslog_pb2 as envoy_dot_config_dot_accesslog_dot_v3_dot_accesslog__pb2
from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.type.v3 import hash_policy_pb2 as envoy_dot_type_dot_v3_dot_hash__policy__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/network/tcp_proxy/v3/tcp_proxy.proto',
  package='envoy.extensions.filters.network.tcp_proxy.v3',
  syntax='proto3',
  serialized_options=b'\n;io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3B\rTcpProxyProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n=envoy/extensions/filters/network/tcp_proxy/v3/tcp_proxy.proto\x12-envoy.extensions.filters.network.tcp_proxy.v3\x1a)envoy/config/accesslog/v3/accesslog.proto\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a\x1f\x65nvoy/type/v3/hash_policy.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xf5\n\n\x08TcpProxy\x12\x1c\n\x0bstat_prefix\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x11\n\x07\x63luster\x18\x02 \x01(\tH\x00\x12\x64\n\x11weighted_clusters\x18\n \x01(\x0b\x32G.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedClusterH\x00\x12\x36\n\x0emetadata_match\x18\t \x01(\x0b\x32\x1e.envoy.config.core.v3.Metadata\x12/\n\x0cidle_timeout\x18\x08 \x01(\x0b\x32\x19.google.protobuf.Duration\x12:\n\x17\x64ownstream_idle_timeout\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x38\n\x15upstream_idle_timeout\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x38\n\naccess_log\x18\x05 \x03(\x0b\x32$.envoy.config.accesslog.v3.AccessLog\x12\x43\n\x14max_connect_attempts\x18\x07 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x07\xfa\x42\x04*\x02(\x01\x12\x38\n\x0bhash_policy\x18\x0b \x03(\x0b\x32\x19.envoy.type.v3.HashPolicyB\x08\xfa\x42\x05\x92\x01\x02\x10\x01\x12\x61\n\x10tunneling_config\x18\x0c \x01(\x0b\x32G.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig\x12S\n\"max_downstream_connection_duration\x18\r \x01(\x0b\x32\x19.google.protobuf.DurationB\x0c\xfa\x42\t\xaa\x01\x06\x32\x04\x10\xc0\x84=\x1a\xa0\x03\n\x0fWeightedCluster\x12q\n\x08\x63lusters\x18\x01 \x03(\x0b\x32U.envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.ClusterWeightB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x1a\xcf\x01\n\rClusterWeight\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x17\n\x06weight\x18\x02 \x01(\rB\x07\xfa\x42\x04*\x02(\x01\x12\x36\n\x0emetadata_match\x18\x03 \x01(\x0b\x32\x1e.envoy.config.core.v3.Metadata:V\x9a\xc5\x88\x1eQ\nOenvoy.config.filter.network.tcp_proxy.v2.TcpProxy.WeightedCluster.ClusterWeight:H\x9a\xc5\x88\x1e\x43\nAenvoy.config.filter.network.tcp_proxy.v2.TcpProxy.WeightedCluster\x1av\n\x0fTunnelingConfig\x12\x19\n\x08hostname\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01:H\x9a\xc5\x88\x1e\x43\nAenvoy.config.filter.network.tcp_proxy.v2.TcpProxy.TunnelingConfig:8\x9a\xc5\x88\x1e\x33\n1envoy.config.filter.network.tcp_proxy.v2.TcpProxyB\x18\n\x11\x63luster_specifier\x12\x03\xf8\x42\x01J\x04\x08\x06\x10\x07R\rdeprecated_v1BV\n;io.envoyproxy.envoy.extensions.filters.network.tcp_proxy.v3B\rTcpProxyProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_accesslog_dot_v3_dot_accesslog__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,envoy_dot_type_dot_v3_dot_hash__policy__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT = _descriptor.Descriptor(
  name='ClusterWeight',
  full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.ClusterWeight',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.ClusterWeight.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='weight', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.ClusterWeight.weight', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002(\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata_match', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.ClusterWeight.metadata_match', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036Q\nOenvoy.config.filter.network.tcp_proxy.v2.TcpProxy.WeightedCluster.ClusterWeight',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1268,
  serialized_end=1475,
)

_TCPPROXY_WEIGHTEDCLUSTER = _descriptor.Descriptor(
  name='WeightedCluster',
  full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='clusters', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.clusters', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036C\nAenvoy.config.filter.network.tcp_proxy.v2.TcpProxy.WeightedCluster',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1133,
  serialized_end=1549,
)

_TCPPROXY_TUNNELINGCONFIG = _descriptor.Descriptor(
  name='TunnelingConfig',
  full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='hostname', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig.hostname', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036C\nAenvoy.config.filter.network.tcp_proxy.v2.TcpProxy.TunnelingConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1551,
  serialized_end=1669,
)

_TCPPROXY = _descriptor.Descriptor(
  name='TcpProxy',
  full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='stat_prefix', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.stat_prefix', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.cluster', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='weighted_clusters', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.weighted_clusters', index=2,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata_match', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.metadata_match', index=3,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='idle_timeout', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.idle_timeout', index=4,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='downstream_idle_timeout', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.downstream_idle_timeout', index=5,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='upstream_idle_timeout', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.upstream_idle_timeout', index=6,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='access_log', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.access_log', index=7,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_connect_attempts', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.max_connect_attempts', index=8,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002(\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hash_policy', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.hash_policy', index=9,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tunneling_config', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.tunneling_config', index=10,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_downstream_connection_duration', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.max_downstream_connection_duration', index=11,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\t\252\001\0062\004\020\300\204=', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_TCPPROXY_WEIGHTEDCLUSTER, _TCPPROXY_TUNNELINGCONFIG, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\0363\n1envoy.config.filter.network.tcp_proxy.v2.TcpProxy',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='cluster_specifier', full_name='envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.cluster_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=377,
  serialized_end=1774,
)

_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT.fields_by_name['metadata_match'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._METADATA
_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT.containing_type = _TCPPROXY_WEIGHTEDCLUSTER
_TCPPROXY_WEIGHTEDCLUSTER.fields_by_name['clusters'].message_type = _TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT
_TCPPROXY_WEIGHTEDCLUSTER.containing_type = _TCPPROXY
_TCPPROXY_TUNNELINGCONFIG.containing_type = _TCPPROXY
_TCPPROXY.fields_by_name['weighted_clusters'].message_type = _TCPPROXY_WEIGHTEDCLUSTER
_TCPPROXY.fields_by_name['metadata_match'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._METADATA
_TCPPROXY.fields_by_name['idle_timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_TCPPROXY.fields_by_name['downstream_idle_timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_TCPPROXY.fields_by_name['upstream_idle_timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_TCPPROXY.fields_by_name['access_log'].message_type = envoy_dot_config_dot_accesslog_dot_v3_dot_accesslog__pb2._ACCESSLOG
_TCPPROXY.fields_by_name['max_connect_attempts'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_TCPPROXY.fields_by_name['hash_policy'].message_type = envoy_dot_type_dot_v3_dot_hash__policy__pb2._HASHPOLICY
_TCPPROXY.fields_by_name['tunneling_config'].message_type = _TCPPROXY_TUNNELINGCONFIG
_TCPPROXY.fields_by_name['max_downstream_connection_duration'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_TCPPROXY.oneofs_by_name['cluster_specifier'].fields.append(
  _TCPPROXY.fields_by_name['cluster'])
_TCPPROXY.fields_by_name['cluster'].containing_oneof = _TCPPROXY.oneofs_by_name['cluster_specifier']
_TCPPROXY.oneofs_by_name['cluster_specifier'].fields.append(
  _TCPPROXY.fields_by_name['weighted_clusters'])
_TCPPROXY.fields_by_name['weighted_clusters'].containing_oneof = _TCPPROXY.oneofs_by_name['cluster_specifier']
DESCRIPTOR.message_types_by_name['TcpProxy'] = _TCPPROXY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TcpProxy = _reflection.GeneratedProtocolMessageType('TcpProxy', (_message.Message,), {

  'WeightedCluster' : _reflection.GeneratedProtocolMessageType('WeightedCluster', (_message.Message,), {

    'ClusterWeight' : _reflection.GeneratedProtocolMessageType('ClusterWeight', (_message.Message,), {
      'DESCRIPTOR' : _TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT,
      '__module__' : 'envoy.extensions.filters.network.tcp_proxy.v3.tcp_proxy_pb2'
      # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster.ClusterWeight)
      })
    ,
    'DESCRIPTOR' : _TCPPROXY_WEIGHTEDCLUSTER,
    '__module__' : 'envoy.extensions.filters.network.tcp_proxy.v3.tcp_proxy_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.WeightedCluster)
    })
  ,

  'TunnelingConfig' : _reflection.GeneratedProtocolMessageType('TunnelingConfig', (_message.Message,), {
    'DESCRIPTOR' : _TCPPROXY_TUNNELINGCONFIG,
    '__module__' : 'envoy.extensions.filters.network.tcp_proxy.v3.tcp_proxy_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy.TunnelingConfig)
    })
  ,
  'DESCRIPTOR' : _TCPPROXY,
  '__module__' : 'envoy.extensions.filters.network.tcp_proxy.v3.tcp_proxy_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.tcp_proxy.v3.TcpProxy)
  })
_sym_db.RegisterMessage(TcpProxy)
_sym_db.RegisterMessage(TcpProxy.WeightedCluster)
_sym_db.RegisterMessage(TcpProxy.WeightedCluster.ClusterWeight)
_sym_db.RegisterMessage(TcpProxy.TunnelingConfig)


DESCRIPTOR._options = None
_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT.fields_by_name['name']._options = None
_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT.fields_by_name['weight']._options = None
_TCPPROXY_WEIGHTEDCLUSTER_CLUSTERWEIGHT._options = None
_TCPPROXY_WEIGHTEDCLUSTER.fields_by_name['clusters']._options = None
_TCPPROXY_WEIGHTEDCLUSTER._options = None
_TCPPROXY_TUNNELINGCONFIG.fields_by_name['hostname']._options = None
_TCPPROXY_TUNNELINGCONFIG._options = None
_TCPPROXY.oneofs_by_name['cluster_specifier']._options = None
_TCPPROXY.fields_by_name['stat_prefix']._options = None
_TCPPROXY.fields_by_name['max_connect_attempts']._options = None
_TCPPROXY.fields_by_name['hash_policy']._options = None
_TCPPROXY.fields_by_name['max_downstream_connection_duration']._options = None
_TCPPROXY._options = None
# @@protoc_insertion_point(module_scope)
