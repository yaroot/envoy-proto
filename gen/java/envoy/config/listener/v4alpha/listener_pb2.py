# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/listener/v4alpha/listener.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.accesslog.v4alpha import accesslog_pb2 as envoy_dot_config_dot_accesslog_dot_v4alpha_dot_accesslog__pb2
from envoy.config.core.v4alpha import address_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2
from envoy.config.core.v4alpha import base_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2
from envoy.config.core.v4alpha import extension_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_extension__pb2
from envoy.config.core.v4alpha import socket_option_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_socket__option__pb2
from envoy.config.listener.v4alpha import api_listener_pb2 as envoy_dot_config_dot_listener_dot_v4alpha_dot_api__listener__pb2
from envoy.config.listener.v4alpha import listener_components_pb2 as envoy_dot_config_dot_listener_dot_v4alpha_dot_listener__components__pb2
from envoy.config.listener.v4alpha import udp_listener_config_pb2 as envoy_dot_config_dot_listener_dot_v4alpha_dot_udp__listener__config__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.core.v1 import collection_entry_pb2 as udpa_dot_core_dot_v1_dot_collection__entry__pb2
from udpa.annotations import security_pb2 as udpa_dot_annotations_dot_security__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/listener/v4alpha/listener.proto',
  package='envoy.config.listener.v4alpha',
  syntax='proto3',
  serialized_options=b'\n+io.envoyproxy.envoy.config.listener.v4alphaB\rListenerProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,envoy/config/listener/v4alpha/listener.proto\x12\x1d\x65nvoy.config.listener.v4alpha\x1a.envoy/config/accesslog/v4alpha/accesslog.proto\x1a\'envoy/config/core/v4alpha/address.proto\x1a$envoy/config/core/v4alpha/base.proto\x1a)envoy/config/core/v4alpha/extension.proto\x1a-envoy/config/core/v4alpha/socket_option.proto\x1a\x30\x65nvoy/config/listener/v4alpha/api_listener.proto\x1a\x37\x65nvoy/config/listener/v4alpha/listener_components.proto\x1a\x37\x65nvoy/config/listener/v4alpha/udp_listener_config.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a#udpa/core/v1/collection_entry.proto\x1a\x1fudpa/annotations/security.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"x\n\x12ListenerCollection\x12.\n\x07\x65ntries\x18\x01 \x03(\x0b\x32\x1d.udpa.core.v1.CollectionEntry:2\x9a\xc5\x88\x1e-\n+envoy.config.listener.v3.ListenerCollection\"\x86\x0f\n\x08Listener\x12\x0c\n\x04name\x18\x01 \x01(\t\x12=\n\x07\x61\x64\x64ress\x18\x02 \x01(\x0b\x32\".envoy.config.core.v4alpha.AddressB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x41\n\rfilter_chains\x18\x03 \x03(\x0b\x32*.envoy.config.listener.v4alpha.FilterChain\x12P\n!per_connection_buffer_limit_bytes\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.UInt32ValueB\x07\x8a\x93\xb7*\x02\x08\x01\x12\x35\n\x08metadata\x18\x06 \x01(\x0b\x32#.envoy.config.core.v4alpha.Metadata\x12K\n\rdeprecated_v1\x18\x07 \x01(\x0b\x32\x34.envoy.config.listener.v4alpha.Listener.DeprecatedV1\x12\x45\n\ndrain_type\x18\x08 \x01(\x0e\x32\x31.envoy.config.listener.v4alpha.Listener.DrainType\x12G\n\x10listener_filters\x18\t \x03(\x0b\x32-.envoy.config.listener.v4alpha.ListenerFilter\x12;\n\x18listener_filters_timeout\x18\x0f \x01(\x0b\x32\x19.google.protobuf.Duration\x12,\n$continue_on_listener_filters_timeout\x18\x11 \x01(\x08\x12/\n\x0btransparent\x18\n \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12,\n\x08\x66reebind\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12?\n\x0esocket_options\x18\r \x03(\x0b\x32\'.envoy.config.core.v4alpha.SocketOption\x12@\n\x1atcp_fast_open_queue_length\x18\x0c \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x12\x46\n\x11traffic_direction\x18\x10 \x01(\x0e\x32+.envoy.config.core.v4alpha.TrafficDirection\x12M\n\x13udp_listener_config\x18\x12 \x01(\x0b\x32\x30.envoy.config.listener.v4alpha.UdpListenerConfig\x12@\n\x0c\x61pi_listener\x18\x13 \x01(\x0b\x32*.envoy.config.listener.v4alpha.ApiListener\x12\x62\n\x19\x63onnection_balance_config\x18\x14 \x01(\x0b\x32?.envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig\x12\x12\n\nreuse_port\x18\x15 \x01(\x08\x12=\n\naccess_log\x18\x16 \x03(\x0b\x32).envoy.config.accesslog.v4alpha.AccessLog\x12J\n\x11udp_writer_config\x18\x17 \x01(\x0b\x32/.envoy.config.core.v4alpha.TypedExtensionConfig\x12\x36\n\x10tcp_backlog_size\x18\x18 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x1aw\n\x0c\x44\x65precatedV1\x12\x30\n\x0c\x62ind_to_port\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.BoolValue:5\x9a\xc5\x88\x1e\x30\n.envoy.config.listener.v3.Listener.DeprecatedV1\x1a\xb6\x02\n\x17\x43onnectionBalanceConfig\x12\x65\n\rexact_balance\x18\x01 \x01(\x0b\x32L.envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig.ExactBalanceH\x00\x1a]\n\x0c\x45xactBalance:M\x9a\xc5\x88\x1eH\nFenvoy.config.listener.v3.Listener.ConnectionBalanceConfig.ExactBalance:@\x9a\xc5\x88\x1e;\n9envoy.config.listener.v3.Listener.ConnectionBalanceConfigB\x13\n\x0c\x62\x61lance_type\x12\x03\xf8\x42\x01\")\n\tDrainType\x12\x0b\n\x07\x44\x45\x46\x41ULT\x10\x00\x12\x0f\n\x0bMODIFY_ONLY\x10\x01:(\x9a\xc5\x88\x1e#\n!envoy.config.listener.v3.ListenerJ\x04\x08\x0e\x10\x0fJ\x04\x08\x04\x10\x05R\x10use_original_dstBF\n+io.envoyproxy.envoy.config.listener.v4alphaB\rListenerProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_accesslog_dot_v4alpha_dot_accesslog__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_extension__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_socket__option__pb2.DESCRIPTOR,envoy_dot_config_dot_listener_dot_v4alpha_dot_api__listener__pb2.DESCRIPTOR,envoy_dot_config_dot_listener_dot_v4alpha_dot_listener__components__pb2.DESCRIPTOR,envoy_dot_config_dot_listener_dot_v4alpha_dot_udp__listener__config__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_core_dot_v1_dot_collection__entry__pb2.DESCRIPTOR,udpa_dot_annotations_dot_security__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_LISTENER_DRAINTYPE = _descriptor.EnumDescriptor(
  name='DrainType',
  full_name='envoy.config.listener.v4alpha.Listener.DrainType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DEFAULT', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MODIFY_ONLY', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2651,
  serialized_end=2692,
)
_sym_db.RegisterEnumDescriptor(_LISTENER_DRAINTYPE)


_LISTENERCOLLECTION = _descriptor.Descriptor(
  name='ListenerCollection',
  full_name='envoy.config.listener.v4alpha.ListenerCollection',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entries', full_name='envoy.config.listener.v4alpha.ListenerCollection.entries', index=0,
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
  serialized_options=b'\232\305\210\036-\n+envoy.config.listener.v3.ListenerCollection',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=715,
  serialized_end=835,
)


_LISTENER_DEPRECATEDV1 = _descriptor.Descriptor(
  name='DeprecatedV1',
  full_name='envoy.config.listener.v4alpha.Listener.DeprecatedV1',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='bind_to_port', full_name='envoy.config.listener.v4alpha.Listener.DeprecatedV1.bind_to_port', index=0,
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
  serialized_options=b'\232\305\210\0360\n.envoy.config.listener.v3.Listener.DeprecatedV1',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2217,
  serialized_end=2336,
)

_LISTENER_CONNECTIONBALANCECONFIG_EXACTBALANCE = _descriptor.Descriptor(
  name='ExactBalance',
  full_name='envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig.ExactBalance',
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
  serialized_options=b'\232\305\210\036H\nFenvoy.config.listener.v3.Listener.ConnectionBalanceConfig.ExactBalance',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2469,
  serialized_end=2562,
)

_LISTENER_CONNECTIONBALANCECONFIG = _descriptor.Descriptor(
  name='ConnectionBalanceConfig',
  full_name='envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='exact_balance', full_name='envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig.exact_balance', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_LISTENER_CONNECTIONBALANCECONFIG_EXACTBALANCE, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036;\n9envoy.config.listener.v3.Listener.ConnectionBalanceConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='balance_type', full_name='envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig.balance_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=2339,
  serialized_end=2649,
)

_LISTENER = _descriptor.Descriptor(
  name='Listener',
  full_name='envoy.config.listener.v4alpha.Listener',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.config.listener.v4alpha.Listener.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='address', full_name='envoy.config.listener.v4alpha.Listener.address', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter_chains', full_name='envoy.config.listener.v4alpha.Listener.filter_chains', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='per_connection_buffer_limit_bytes', full_name='envoy.config.listener.v4alpha.Listener.per_connection_buffer_limit_bytes', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\212\223\267*\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='envoy.config.listener.v4alpha.Listener.metadata', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='deprecated_v1', full_name='envoy.config.listener.v4alpha.Listener.deprecated_v1', index=5,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='drain_type', full_name='envoy.config.listener.v4alpha.Listener.drain_type', index=6,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='listener_filters', full_name='envoy.config.listener.v4alpha.Listener.listener_filters', index=7,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='listener_filters_timeout', full_name='envoy.config.listener.v4alpha.Listener.listener_filters_timeout', index=8,
      number=15, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='continue_on_listener_filters_timeout', full_name='envoy.config.listener.v4alpha.Listener.continue_on_listener_filters_timeout', index=9,
      number=17, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transparent', full_name='envoy.config.listener.v4alpha.Listener.transparent', index=10,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='freebind', full_name='envoy.config.listener.v4alpha.Listener.freebind', index=11,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='socket_options', full_name='envoy.config.listener.v4alpha.Listener.socket_options', index=12,
      number=13, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tcp_fast_open_queue_length', full_name='envoy.config.listener.v4alpha.Listener.tcp_fast_open_queue_length', index=13,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='traffic_direction', full_name='envoy.config.listener.v4alpha.Listener.traffic_direction', index=14,
      number=16, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='udp_listener_config', full_name='envoy.config.listener.v4alpha.Listener.udp_listener_config', index=15,
      number=18, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='api_listener', full_name='envoy.config.listener.v4alpha.Listener.api_listener', index=16,
      number=19, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='connection_balance_config', full_name='envoy.config.listener.v4alpha.Listener.connection_balance_config', index=17,
      number=20, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reuse_port', full_name='envoy.config.listener.v4alpha.Listener.reuse_port', index=18,
      number=21, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='access_log', full_name='envoy.config.listener.v4alpha.Listener.access_log', index=19,
      number=22, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='udp_writer_config', full_name='envoy.config.listener.v4alpha.Listener.udp_writer_config', index=20,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='tcp_backlog_size', full_name='envoy.config.listener.v4alpha.Listener.tcp_backlog_size', index=21,
      number=24, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_LISTENER_DEPRECATEDV1, _LISTENER_CONNECTIONBALANCECONFIG, ],
  enum_types=[
    _LISTENER_DRAINTYPE,
  ],
  serialized_options=b'\232\305\210\036#\n!envoy.config.listener.v3.Listener',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=838,
  serialized_end=2764,
)

_LISTENERCOLLECTION.fields_by_name['entries'].message_type = udpa_dot_core_dot_v1_dot_collection__entry__pb2._COLLECTIONENTRY
_LISTENER_DEPRECATEDV1.fields_by_name['bind_to_port'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_LISTENER_DEPRECATEDV1.containing_type = _LISTENER
_LISTENER_CONNECTIONBALANCECONFIG_EXACTBALANCE.containing_type = _LISTENER_CONNECTIONBALANCECONFIG
_LISTENER_CONNECTIONBALANCECONFIG.fields_by_name['exact_balance'].message_type = _LISTENER_CONNECTIONBALANCECONFIG_EXACTBALANCE
_LISTENER_CONNECTIONBALANCECONFIG.containing_type = _LISTENER
_LISTENER_CONNECTIONBALANCECONFIG.oneofs_by_name['balance_type'].fields.append(
  _LISTENER_CONNECTIONBALANCECONFIG.fields_by_name['exact_balance'])
_LISTENER_CONNECTIONBALANCECONFIG.fields_by_name['exact_balance'].containing_oneof = _LISTENER_CONNECTIONBALANCECONFIG.oneofs_by_name['balance_type']
_LISTENER.fields_by_name['address'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2._ADDRESS
_LISTENER.fields_by_name['filter_chains'].message_type = envoy_dot_config_dot_listener_dot_v4alpha_dot_listener__components__pb2._FILTERCHAIN
_LISTENER.fields_by_name['per_connection_buffer_limit_bytes'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_LISTENER.fields_by_name['metadata'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._METADATA
_LISTENER.fields_by_name['deprecated_v1'].message_type = _LISTENER_DEPRECATEDV1
_LISTENER.fields_by_name['drain_type'].enum_type = _LISTENER_DRAINTYPE
_LISTENER.fields_by_name['listener_filters'].message_type = envoy_dot_config_dot_listener_dot_v4alpha_dot_listener__components__pb2._LISTENERFILTER
_LISTENER.fields_by_name['listener_filters_timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_LISTENER.fields_by_name['transparent'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_LISTENER.fields_by_name['freebind'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_LISTENER.fields_by_name['socket_options'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_socket__option__pb2._SOCKETOPTION
_LISTENER.fields_by_name['tcp_fast_open_queue_length'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_LISTENER.fields_by_name['traffic_direction'].enum_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._TRAFFICDIRECTION
_LISTENER.fields_by_name['udp_listener_config'].message_type = envoy_dot_config_dot_listener_dot_v4alpha_dot_udp__listener__config__pb2._UDPLISTENERCONFIG
_LISTENER.fields_by_name['api_listener'].message_type = envoy_dot_config_dot_listener_dot_v4alpha_dot_api__listener__pb2._APILISTENER
_LISTENER.fields_by_name['connection_balance_config'].message_type = _LISTENER_CONNECTIONBALANCECONFIG
_LISTENER.fields_by_name['access_log'].message_type = envoy_dot_config_dot_accesslog_dot_v4alpha_dot_accesslog__pb2._ACCESSLOG
_LISTENER.fields_by_name['udp_writer_config'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_extension__pb2._TYPEDEXTENSIONCONFIG
_LISTENER.fields_by_name['tcp_backlog_size'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_LISTENER_DRAINTYPE.containing_type = _LISTENER
DESCRIPTOR.message_types_by_name['ListenerCollection'] = _LISTENERCOLLECTION
DESCRIPTOR.message_types_by_name['Listener'] = _LISTENER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListenerCollection = _reflection.GeneratedProtocolMessageType('ListenerCollection', (_message.Message,), {
  'DESCRIPTOR' : _LISTENERCOLLECTION,
  '__module__' : 'envoy.config.listener.v4alpha.listener_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.listener.v4alpha.ListenerCollection)
  })
_sym_db.RegisterMessage(ListenerCollection)

Listener = _reflection.GeneratedProtocolMessageType('Listener', (_message.Message,), {

  'DeprecatedV1' : _reflection.GeneratedProtocolMessageType('DeprecatedV1', (_message.Message,), {
    'DESCRIPTOR' : _LISTENER_DEPRECATEDV1,
    '__module__' : 'envoy.config.listener.v4alpha.listener_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.listener.v4alpha.Listener.DeprecatedV1)
    })
  ,

  'ConnectionBalanceConfig' : _reflection.GeneratedProtocolMessageType('ConnectionBalanceConfig', (_message.Message,), {

    'ExactBalance' : _reflection.GeneratedProtocolMessageType('ExactBalance', (_message.Message,), {
      'DESCRIPTOR' : _LISTENER_CONNECTIONBALANCECONFIG_EXACTBALANCE,
      '__module__' : 'envoy.config.listener.v4alpha.listener_pb2'
      # @@protoc_insertion_point(class_scope:envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig.ExactBalance)
      })
    ,
    'DESCRIPTOR' : _LISTENER_CONNECTIONBALANCECONFIG,
    '__module__' : 'envoy.config.listener.v4alpha.listener_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.listener.v4alpha.Listener.ConnectionBalanceConfig)
    })
  ,
  'DESCRIPTOR' : _LISTENER,
  '__module__' : 'envoy.config.listener.v4alpha.listener_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.listener.v4alpha.Listener)
  })
_sym_db.RegisterMessage(Listener)
_sym_db.RegisterMessage(Listener.DeprecatedV1)
_sym_db.RegisterMessage(Listener.ConnectionBalanceConfig)
_sym_db.RegisterMessage(Listener.ConnectionBalanceConfig.ExactBalance)


DESCRIPTOR._options = None
_LISTENERCOLLECTION._options = None
_LISTENER_DEPRECATEDV1._options = None
_LISTENER_CONNECTIONBALANCECONFIG_EXACTBALANCE._options = None
_LISTENER_CONNECTIONBALANCECONFIG.oneofs_by_name['balance_type']._options = None
_LISTENER_CONNECTIONBALANCECONFIG._options = None
_LISTENER.fields_by_name['address']._options = None
_LISTENER.fields_by_name['per_connection_buffer_limit_bytes']._options = None
_LISTENER._options = None
# @@protoc_insertion_point(module_scope)
