# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import udp_socket_config_pb2 as envoy_dot_config_dot_core_dot_v3_dot_udp__socket__config__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto',
  package='envoy.extensions.filters.udp.udp_proxy.v3',
  syntax='proto3',
  serialized_options=b'\n7io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3B\rUdpProxyProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9envoy/extensions/filters/udp/udp_proxy/v3/udp_proxy.proto\x12)envoy.extensions.filters.udp.udp_proxy.v3\x1a,envoy/config/core/v3/udp_socket_config.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xfc\x03\n\x0eUdpProxyConfig\x12\x1c\n\x0bstat_prefix\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x1a\n\x07\x63luster\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01H\x00\x12/\n\x0cidle_timeout\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x1b\n\x13use_original_src_ip\x18\x04 \x01(\x08\x12\x65\n\rhash_policies\x18\x05 \x03(\x0b\x32\x44.envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicyB\x08\xfa\x42\x05\x92\x01\x02\x10\x01\x12\x45\n\x16upstream_socket_config\x18\x06 \x01(\x0b\x32%.envoy.config.core.v3.UdpSocketConfig\x1a[\n\nHashPolicy\x12\x1c\n\tsource_ip\x18\x01 \x01(\x08\x42\x07\xfa\x42\x04j\x02\x08\x01H\x00\x12\x16\n\x03key\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01H\x00\x42\x17\n\x10policy_specifier\x12\x03\xf8\x42\x01:?\x9a\xc5\x88\x1e:\n8envoy.config.filter.udp.udp_proxy.v2alpha.UdpProxyConfigB\x16\n\x0froute_specifier\x12\x03\xf8\x42\x01\x42R\n7io.envoyproxy.envoy.extensions.filters.udp.udp_proxy.v3B\rUdpProxyProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_udp__socket__config__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_UDPPROXYCONFIG_HASHPOLICY = _descriptor.Descriptor(
  name='HashPolicy',
  full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='source_ip', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy.source_ip', index=0,
      number=1, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004j\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='key', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy.key', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='policy_specifier', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy.policy_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=602,
  serialized_end=693,
)

_UDPPROXYCONFIG = _descriptor.Descriptor(
  name='UdpProxyConfig',
  full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='stat_prefix', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.stat_prefix', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.cluster', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='idle_timeout', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.idle_timeout', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='use_original_src_ip', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.use_original_src_ip', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hash_policies', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.hash_policies', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='upstream_socket_config', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.upstream_socket_config', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_UDPPROXYCONFIG_HASHPOLICY, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036:\n8envoy.config.filter.udp.udp_proxy.v2alpha.UdpProxyConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='route_specifier', full_name='envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.route_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=274,
  serialized_end=782,
)

_UDPPROXYCONFIG_HASHPOLICY.containing_type = _UDPPROXYCONFIG
_UDPPROXYCONFIG_HASHPOLICY.oneofs_by_name['policy_specifier'].fields.append(
  _UDPPROXYCONFIG_HASHPOLICY.fields_by_name['source_ip'])
_UDPPROXYCONFIG_HASHPOLICY.fields_by_name['source_ip'].containing_oneof = _UDPPROXYCONFIG_HASHPOLICY.oneofs_by_name['policy_specifier']
_UDPPROXYCONFIG_HASHPOLICY.oneofs_by_name['policy_specifier'].fields.append(
  _UDPPROXYCONFIG_HASHPOLICY.fields_by_name['key'])
_UDPPROXYCONFIG_HASHPOLICY.fields_by_name['key'].containing_oneof = _UDPPROXYCONFIG_HASHPOLICY.oneofs_by_name['policy_specifier']
_UDPPROXYCONFIG.fields_by_name['idle_timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_UDPPROXYCONFIG.fields_by_name['hash_policies'].message_type = _UDPPROXYCONFIG_HASHPOLICY
_UDPPROXYCONFIG.fields_by_name['upstream_socket_config'].message_type = envoy_dot_config_dot_core_dot_v3_dot_udp__socket__config__pb2._UDPSOCKETCONFIG
_UDPPROXYCONFIG.oneofs_by_name['route_specifier'].fields.append(
  _UDPPROXYCONFIG.fields_by_name['cluster'])
_UDPPROXYCONFIG.fields_by_name['cluster'].containing_oneof = _UDPPROXYCONFIG.oneofs_by_name['route_specifier']
DESCRIPTOR.message_types_by_name['UdpProxyConfig'] = _UDPPROXYCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UdpProxyConfig = _reflection.GeneratedProtocolMessageType('UdpProxyConfig', (_message.Message,), {

  'HashPolicy' : _reflection.GeneratedProtocolMessageType('HashPolicy', (_message.Message,), {
    'DESCRIPTOR' : _UDPPROXYCONFIG_HASHPOLICY,
    '__module__' : 'envoy.extensions.filters.udp.udp_proxy.v3.udp_proxy_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig.HashPolicy)
    })
  ,
  'DESCRIPTOR' : _UDPPROXYCONFIG,
  '__module__' : 'envoy.extensions.filters.udp.udp_proxy.v3.udp_proxy_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.udp.udp_proxy.v3.UdpProxyConfig)
  })
_sym_db.RegisterMessage(UdpProxyConfig)
_sym_db.RegisterMessage(UdpProxyConfig.HashPolicy)


DESCRIPTOR._options = None
_UDPPROXYCONFIG_HASHPOLICY.oneofs_by_name['policy_specifier']._options = None
_UDPPROXYCONFIG_HASHPOLICY.fields_by_name['source_ip']._options = None
_UDPPROXYCONFIG_HASHPOLICY.fields_by_name['key']._options = None
_UDPPROXYCONFIG.oneofs_by_name['route_specifier']._options = None
_UDPPROXYCONFIG.fields_by_name['stat_prefix']._options = None
_UDPPROXYCONFIG.fields_by_name['cluster']._options = None
_UDPPROXYCONFIG.fields_by_name['hash_policies']._options = None
_UDPPROXYCONFIG._options = None
# @@protoc_insertion_point(module_scope)
