# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/common/dynamic_forward_proxy/v2alpha/dns_cache.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.api.v2 import cluster_pb2 as envoy_dot_api_dot_v2_dot_cluster__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/common/dynamic_forward_proxy/v2alpha/dns_cache.proto',
  package='envoy.config.common.dynamic_forward_proxy.v2alpha',
  syntax='proto3',
  serialized_options=b'\n?io.envoyproxy.envoy.config.common.dynamic_forward_proxy.v2alphaB\rDnsCacheProtoP\001\362\230\376\217\0052\0220envoy.extensions.common.dynamic_forward_proxy.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nAenvoy/config/common/dynamic_forward_proxy/v2alpha/dns_cache.proto\x12\x31\x65nvoy.config.common.dynamic_forward_proxy.v2alpha\x1a\x1a\x65nvoy/api/v2/cluster.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xec\x02\n\x0e\x44nsCacheConfig\x12\x15\n\x04name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12J\n\x11\x64ns_lookup_family\x18\x02 \x01(\x0e\x32%.envoy.api.v2.Cluster.DnsLookupFamilyB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12\x41\n\x10\x64ns_refresh_rate\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x0c\xfa\x42\t\xaa\x01\x06\x32\x04\x10\xc0\x84=\x12\x35\n\x08host_ttl\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x12\x38\n\tmax_hosts\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x07\xfa\x42\x04*\x02 \x00\x12\x43\n\x18\x64ns_failure_refresh_rate\x18\x06 \x01(\x0b\x32!.envoy.api.v2.Cluster.RefreshRateB\x92\x01\n?io.envoyproxy.envoy.config.common.dynamic_forward_proxy.v2alphaB\rDnsCacheProtoP\x01\xf2\x98\xfe\x8f\x05\x32\x12\x30\x65nvoy.extensions.common.dynamic_forward_proxy.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_api_dot_v2_dot_cluster__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_DNSCACHECONFIG = _descriptor.Descriptor(
  name='DnsCacheConfig',
  full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_lookup_family', full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig.dns_lookup_family', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_refresh_rate', full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig.dns_refresh_rate', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\t\252\001\0062\004\020\300\204=', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host_ttl', full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig.host_ttl', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\252\001\002*\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_hosts', full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig.max_hosts', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002 \000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dns_failure_refresh_rate', full_name='envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig.dns_failure_refresh_rate', index=5,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=301,
  serialized_end=665,
)

_DNSCACHECONFIG.fields_by_name['dns_lookup_family'].enum_type = envoy_dot_api_dot_v2_dot_cluster__pb2._CLUSTER_DNSLOOKUPFAMILY
_DNSCACHECONFIG.fields_by_name['dns_refresh_rate'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_DNSCACHECONFIG.fields_by_name['host_ttl'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_DNSCACHECONFIG.fields_by_name['max_hosts'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_DNSCACHECONFIG.fields_by_name['dns_failure_refresh_rate'].message_type = envoy_dot_api_dot_v2_dot_cluster__pb2._CLUSTER_REFRESHRATE
DESCRIPTOR.message_types_by_name['DnsCacheConfig'] = _DNSCACHECONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DnsCacheConfig = _reflection.GeneratedProtocolMessageType('DnsCacheConfig', (_message.Message,), {
  'DESCRIPTOR' : _DNSCACHECONFIG,
  '__module__' : 'envoy.config.common.dynamic_forward_proxy.v2alpha.dns_cache_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.common.dynamic_forward_proxy.v2alpha.DnsCacheConfig)
  })
_sym_db.RegisterMessage(DnsCacheConfig)


DESCRIPTOR._options = None
_DNSCACHECONFIG.fields_by_name['name']._options = None
_DNSCACHECONFIG.fields_by_name['dns_lookup_family']._options = None
_DNSCACHECONFIG.fields_by_name['dns_refresh_rate']._options = None
_DNSCACHECONFIG.fields_by_name['host_ttl']._options = None
_DNSCACHECONFIG.fields_by_name['max_hosts']._options = None
# @@protoc_insertion_point(module_scope)
