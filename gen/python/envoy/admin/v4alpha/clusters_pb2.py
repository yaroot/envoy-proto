# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/admin/v4alpha/clusters.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.admin.v4alpha import metrics_pb2 as envoy_dot_admin_dot_v4alpha_dot_metrics__pb2
from envoy.config.cluster.v4alpha import circuit_breaker_pb2 as envoy_dot_config_dot_cluster_dot_v4alpha_dot_circuit__breaker__pb2
from envoy.config.core.v4alpha import address_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2
from envoy.config.core.v4alpha import base_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2
from envoy.config.core.v4alpha import health_check_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2
from envoy.type.v3 import percent_pb2 as envoy_dot_type_dot_v3_dot_percent__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/admin/v4alpha/clusters.proto',
  package='envoy.admin.v4alpha',
  syntax='proto3',
  serialized_options=b'\n!io.envoyproxy.envoy.admin.v4alphaB\rClustersProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\"envoy/admin/v4alpha/clusters.proto\x12\x13\x65nvoy.admin.v4alpha\x1a!envoy/admin/v4alpha/metrics.proto\x1a\x32\x65nvoy/config/cluster/v4alpha/circuit_breaker.proto\x1a\'envoy/config/core/v4alpha/address.proto\x1a$envoy/config/core/v4alpha/base.proto\x1a,envoy/config/core/v4alpha/health_check.proto\x1a\x1b\x65nvoy/type/v3/percent.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"h\n\x08\x43lusters\x12<\n\x10\x63luster_statuses\x18\x01 \x03(\x0b\x32\".envoy.admin.v4alpha.ClusterStatus:\x1e\x9a\xc5\x88\x1e\x19\n\x17\x65nvoy.admin.v3.Clusters\"\xe9\x02\n\rClusterStatus\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x15\n\radded_via_api\x18\x02 \x01(\x08\x12?\n\x1fsuccess_rate_ejection_threshold\x18\x03 \x01(\x0b\x32\x16.envoy.type.v3.Percent\x12\x36\n\rhost_statuses\x18\x04 \x03(\x0b\x32\x1f.envoy.admin.v4alpha.HostStatus\x12L\n,local_origin_success_rate_ejection_threshold\x18\x05 \x01(\x0b\x32\x16.envoy.type.v3.Percent\x12G\n\x10\x63ircuit_breakers\x18\x06 \x01(\x0b\x32-.envoy.config.cluster.v4alpha.CircuitBreakers:#\x9a\xc5\x88\x1e\x1e\n\x1c\x65nvoy.admin.v3.ClusterStatus\"\xa7\x03\n\nHostStatus\x12\x33\n\x07\x61\x64\x64ress\x18\x01 \x01(\x0b\x32\".envoy.config.core.v4alpha.Address\x12\x30\n\x05stats\x18\x02 \x03(\x0b\x32!.envoy.admin.v4alpha.SimpleMetric\x12<\n\rhealth_status\x18\x03 \x01(\x0b\x32%.envoy.admin.v4alpha.HostHealthStatus\x12,\n\x0csuccess_rate\x18\x04 \x01(\x0b\x32\x16.envoy.type.v3.Percent\x12\x0e\n\x06weight\x18\x05 \x01(\r\x12\x10\n\x08hostname\x18\x06 \x01(\t\x12\x10\n\x08priority\x18\x07 \x01(\r\x12\x39\n\x19local_origin_success_rate\x18\x08 \x01(\x0b\x32\x16.envoy.type.v3.Percent\x12\x35\n\x08locality\x18\t \x01(\x0b\x32#.envoy.config.core.v4alpha.Locality: \x9a\xc5\x88\x1e\x1b\n\x19\x65nvoy.admin.v3.HostStatus\"\xa2\x02\n\x10HostHealthStatus\x12\"\n\x1a\x66\x61iled_active_health_check\x18\x01 \x01(\x08\x12\x1c\n\x14\x66\x61iled_outlier_check\x18\x02 \x01(\x08\x12$\n\x1c\x66\x61iled_active_degraded_check\x18\x04 \x01(\x08\x12\x1f\n\x17pending_dynamic_removal\x18\x05 \x01(\x08\x12\x19\n\x11pending_active_hc\x18\x06 \x01(\x08\x12\x42\n\x11\x65\x64s_health_status\x18\x03 \x01(\x0e\x32\'.envoy.config.core.v4alpha.HealthStatus:&\x9a\xc5\x88\x1e!\n\x1f\x65nvoy.admin.v3.HostHealthStatusB<\n!io.envoyproxy.envoy.admin.v4alphaB\rClustersProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_admin_dot_v4alpha_dot_metrics__pb2.DESCRIPTOR,envoy_dot_config_dot_cluster_dot_v4alpha_dot_circuit__breaker__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2.DESCRIPTOR,envoy_dot_type_dot_v3_dot_percent__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_CLUSTERS = _descriptor.Descriptor(
  name='Clusters',
  full_name='envoy.admin.v4alpha.Clusters',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_statuses', full_name='envoy.admin.v4alpha.Clusters.cluster_statuses', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036\031\n\027envoy.admin.v3.Clusters',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=366,
  serialized_end=470,
)


_CLUSTERSTATUS = _descriptor.Descriptor(
  name='ClusterStatus',
  full_name='envoy.admin.v4alpha.ClusterStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.admin.v4alpha.ClusterStatus.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='added_via_api', full_name='envoy.admin.v4alpha.ClusterStatus.added_via_api', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='success_rate_ejection_threshold', full_name='envoy.admin.v4alpha.ClusterStatus.success_rate_ejection_threshold', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host_statuses', full_name='envoy.admin.v4alpha.ClusterStatus.host_statuses', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='local_origin_success_rate_ejection_threshold', full_name='envoy.admin.v4alpha.ClusterStatus.local_origin_success_rate_ejection_threshold', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='circuit_breakers', full_name='envoy.admin.v4alpha.ClusterStatus.circuit_breakers', index=5,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036\036\n\034envoy.admin.v3.ClusterStatus',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=473,
  serialized_end=834,
)


_HOSTSTATUS = _descriptor.Descriptor(
  name='HostStatus',
  full_name='envoy.admin.v4alpha.HostStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='address', full_name='envoy.admin.v4alpha.HostStatus.address', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stats', full_name='envoy.admin.v4alpha.HostStatus.stats', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='health_status', full_name='envoy.admin.v4alpha.HostStatus.health_status', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='success_rate', full_name='envoy.admin.v4alpha.HostStatus.success_rate', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='weight', full_name='envoy.admin.v4alpha.HostStatus.weight', index=4,
      number=5, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hostname', full_name='envoy.admin.v4alpha.HostStatus.hostname', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='priority', full_name='envoy.admin.v4alpha.HostStatus.priority', index=6,
      number=7, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='local_origin_success_rate', full_name='envoy.admin.v4alpha.HostStatus.local_origin_success_rate', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='locality', full_name='envoy.admin.v4alpha.HostStatus.locality', index=8,
      number=9, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036\033\n\031envoy.admin.v3.HostStatus',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=837,
  serialized_end=1260,
)


_HOSTHEALTHSTATUS = _descriptor.Descriptor(
  name='HostHealthStatus',
  full_name='envoy.admin.v4alpha.HostHealthStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='failed_active_health_check', full_name='envoy.admin.v4alpha.HostHealthStatus.failed_active_health_check', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='failed_outlier_check', full_name='envoy.admin.v4alpha.HostHealthStatus.failed_outlier_check', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='failed_active_degraded_check', full_name='envoy.admin.v4alpha.HostHealthStatus.failed_active_degraded_check', index=2,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pending_dynamic_removal', full_name='envoy.admin.v4alpha.HostHealthStatus.pending_dynamic_removal', index=3,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pending_active_hc', full_name='envoy.admin.v4alpha.HostHealthStatus.pending_active_hc', index=4,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eds_health_status', full_name='envoy.admin.v4alpha.HostHealthStatus.eds_health_status', index=5,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036!\n\037envoy.admin.v3.HostHealthStatus',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1263,
  serialized_end=1553,
)

_CLUSTERS.fields_by_name['cluster_statuses'].message_type = _CLUSTERSTATUS
_CLUSTERSTATUS.fields_by_name['success_rate_ejection_threshold'].message_type = envoy_dot_type_dot_v3_dot_percent__pb2._PERCENT
_CLUSTERSTATUS.fields_by_name['host_statuses'].message_type = _HOSTSTATUS
_CLUSTERSTATUS.fields_by_name['local_origin_success_rate_ejection_threshold'].message_type = envoy_dot_type_dot_v3_dot_percent__pb2._PERCENT
_CLUSTERSTATUS.fields_by_name['circuit_breakers'].message_type = envoy_dot_config_dot_cluster_dot_v4alpha_dot_circuit__breaker__pb2._CIRCUITBREAKERS
_HOSTSTATUS.fields_by_name['address'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2._ADDRESS
_HOSTSTATUS.fields_by_name['stats'].message_type = envoy_dot_admin_dot_v4alpha_dot_metrics__pb2._SIMPLEMETRIC
_HOSTSTATUS.fields_by_name['health_status'].message_type = _HOSTHEALTHSTATUS
_HOSTSTATUS.fields_by_name['success_rate'].message_type = envoy_dot_type_dot_v3_dot_percent__pb2._PERCENT
_HOSTSTATUS.fields_by_name['local_origin_success_rate'].message_type = envoy_dot_type_dot_v3_dot_percent__pb2._PERCENT
_HOSTSTATUS.fields_by_name['locality'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._LOCALITY
_HOSTHEALTHSTATUS.fields_by_name['eds_health_status'].enum_type = envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2._HEALTHSTATUS
DESCRIPTOR.message_types_by_name['Clusters'] = _CLUSTERS
DESCRIPTOR.message_types_by_name['ClusterStatus'] = _CLUSTERSTATUS
DESCRIPTOR.message_types_by_name['HostStatus'] = _HOSTSTATUS
DESCRIPTOR.message_types_by_name['HostHealthStatus'] = _HOSTHEALTHSTATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Clusters = _reflection.GeneratedProtocolMessageType('Clusters', (_message.Message,), {
  'DESCRIPTOR' : _CLUSTERS,
  '__module__' : 'envoy.admin.v4alpha.clusters_pb2'
  # @@protoc_insertion_point(class_scope:envoy.admin.v4alpha.Clusters)
  })
_sym_db.RegisterMessage(Clusters)

ClusterStatus = _reflection.GeneratedProtocolMessageType('ClusterStatus', (_message.Message,), {
  'DESCRIPTOR' : _CLUSTERSTATUS,
  '__module__' : 'envoy.admin.v4alpha.clusters_pb2'
  # @@protoc_insertion_point(class_scope:envoy.admin.v4alpha.ClusterStatus)
  })
_sym_db.RegisterMessage(ClusterStatus)

HostStatus = _reflection.GeneratedProtocolMessageType('HostStatus', (_message.Message,), {
  'DESCRIPTOR' : _HOSTSTATUS,
  '__module__' : 'envoy.admin.v4alpha.clusters_pb2'
  # @@protoc_insertion_point(class_scope:envoy.admin.v4alpha.HostStatus)
  })
_sym_db.RegisterMessage(HostStatus)

HostHealthStatus = _reflection.GeneratedProtocolMessageType('HostHealthStatus', (_message.Message,), {
  'DESCRIPTOR' : _HOSTHEALTHSTATUS,
  '__module__' : 'envoy.admin.v4alpha.clusters_pb2'
  # @@protoc_insertion_point(class_scope:envoy.admin.v4alpha.HostHealthStatus)
  })
_sym_db.RegisterMessage(HostHealthStatus)


DESCRIPTOR._options = None
_CLUSTERS._options = None
_CLUSTERSTATUS._options = None
_HOSTSTATUS._options = None
_HOSTHEALTHSTATUS._options = None
# @@protoc_insertion_point(module_scope)
