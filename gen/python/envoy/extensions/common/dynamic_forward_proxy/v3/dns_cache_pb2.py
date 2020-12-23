# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/common/dynamic_forward_proxy/v3/dns_cache.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.cluster.v3 import cluster_pb2 as envoy_dot_config_dot_cluster_dot_v3_dot_cluster__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/common/dynamic_forward_proxy/v3/dns_cache.proto',
  package='envoy.extensions.common.dynamic_forward_proxy.v3',
  syntax='proto3',
  serialized_options=b'\n>io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3B\rDnsCacheProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@envoy/extensions/common/dynamic_forward_proxy/v3/dns_cache.proto\x12\x30\x65nvoy.extensions.common.dynamic_forward_proxy.v3\x1a%envoy/config/cluster/v3/cluster.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"U\n\x17\x44nsCacheCircuitBreakers\x12:\n\x14max_pending_requests\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\"\xda\x04\n\x0e\x44nsCacheConfig\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12U\n\x11\x64ns_lookup_family\x18\x02 \x01(\x0e\x32\x30.envoy.config.cluster.v3.Cluster.DnsLookupFamilyB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12\x41\n\x10\x64ns_refresh_rate\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x0c\xfa\x42\t\xaa\x01\x06\x32\x04\x10\xc0\x84=\x12\x35\n\x08host_ttl\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12\x38\n\tmax_hosts\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x07\xfa\x42\x04*\x02 \x00\x12N\n\x18\x64ns_failure_refresh_rate\x18\x06 \x01(\x0b\x32,.envoy.config.cluster.v3.Cluster.RefreshRate\x12l\n\x19\x64ns_cache_circuit_breaker\x18\x07 \x01(\x0b\x32I.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers\x12\x1f\n\x17use_tcp_for_dns_lookups\x18\x08 \x01(\x08:G\x9a\xc5\x88\x1e\x42\n@envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfigBY\n>io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3B\rDnsCacheProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_cluster_dot_v3_dot_cluster__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_DNSCACHECIRCUITBREAKERS = _descriptor.Descriptor(
  name='DnsCacheCircuitBreakers',
  full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='max_pending_requests', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.max_pending_requests', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=312,
  serialized_end=397,
)


_DNSCACHECONFIG = _descriptor.Descriptor(
  name='DnsCacheConfig',
  full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_lookup_family', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.dns_lookup_family', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_refresh_rate', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.dns_refresh_rate', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\t\252\001\0062\004\020\300\204=', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host_ttl', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.host_ttl', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\252\001\002*\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_hosts', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.max_hosts', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002 \000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_failure_refresh_rate', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.dns_failure_refresh_rate', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_cache_circuit_breaker', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.dns_cache_circuit_breaker', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='use_tcp_for_dns_lookups', full_name='envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig.use_tcp_for_dns_lookups', index=7,
      number=8, type=8, cpp_type=7, label=1,
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
  serialized_options=b'\232\305\210\036B\n@envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=400,
  serialized_end=1002,
)

_DNSCACHECIRCUITBREAKERS.fields_by_name['max_pending_requests'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_DNSCACHECONFIG.fields_by_name['dns_lookup_family'].enum_type = envoy_dot_config_dot_cluster_dot_v3_dot_cluster__pb2._CLUSTER_DNSLOOKUPFAMILY
_DNSCACHECONFIG.fields_by_name['dns_refresh_rate'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_DNSCACHECONFIG.fields_by_name['host_ttl'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_DNSCACHECONFIG.fields_by_name['max_hosts'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_DNSCACHECONFIG.fields_by_name['dns_failure_refresh_rate'].message_type = envoy_dot_config_dot_cluster_dot_v3_dot_cluster__pb2._CLUSTER_REFRESHRATE
_DNSCACHECONFIG.fields_by_name['dns_cache_circuit_breaker'].message_type = _DNSCACHECIRCUITBREAKERS
DESCRIPTOR.message_types_by_name['DnsCacheCircuitBreakers'] = _DNSCACHECIRCUITBREAKERS
DESCRIPTOR.message_types_by_name['DnsCacheConfig'] = _DNSCACHECONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DnsCacheCircuitBreakers = _reflection.GeneratedProtocolMessageType('DnsCacheCircuitBreakers', (_message.Message,), {
  'DESCRIPTOR' : _DNSCACHECIRCUITBREAKERS,
  '__module__' : 'envoy.extensions.common.dynamic_forward_proxy.v3.dns_cache_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)
  })
_sym_db.RegisterMessage(DnsCacheCircuitBreakers)

DnsCacheConfig = _reflection.GeneratedProtocolMessageType('DnsCacheConfig', (_message.Message,), {
  'DESCRIPTOR' : _DNSCACHECONFIG,
  '__module__' : 'envoy.extensions.common.dynamic_forward_proxy.v3.dns_cache_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig)
  })
_sym_db.RegisterMessage(DnsCacheConfig)


DESCRIPTOR._options = None
_DNSCACHECONFIG.fields_by_name['name']._options = None
_DNSCACHECONFIG.fields_by_name['dns_lookup_family']._options = None
_DNSCACHECONFIG.fields_by_name['dns_refresh_rate']._options = None
_DNSCACHECONFIG.fields_by_name['host_ttl']._options = None
_DNSCACHECONFIG.fields_by_name['max_hosts']._options = None
_DNSCACHECONFIG._options = None
# @@protoc_insertion_point(module_scope)
