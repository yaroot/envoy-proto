# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/filter/http/rbac/v2/rbac.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.rbac.v2 import rbac_pb2 as envoy_dot_config_dot_rbac_dot_v2_dot_rbac__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/filter/http/rbac/v2/rbac.proto',
  package='envoy.config.filter.http.rbac.v2',
  syntax='proto3',
  serialized_options=b'\n.io.envoyproxy.envoy.config.filter.http.rbac.v2B\tRbacProtoP\001\362\230\376\217\005\'\022%envoy.extensions.filters.http.rbac.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n+envoy/config/filter/http/rbac/v2/rbac.proto\x12 envoy.config.filter.http.rbac.v2\x1a\x1f\x65nvoy/config/rbac/v2/rbac.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\"c\n\x04RBAC\x12)\n\x05rules\x18\x01 \x01(\x0b\x32\x1a.envoy.config.rbac.v2.RBAC\x12\x30\n\x0cshadow_rules\x18\x02 \x01(\x0b\x32\x1a.envoy.config.rbac.v2.RBAC\"J\n\x0cRBACPerRoute\x12\x34\n\x04rbac\x18\x02 \x01(\x0b\x32&.envoy.config.filter.http.rbac.v2.RBACJ\x04\x08\x01\x10\x02\x42r\n.io.envoyproxy.envoy.config.filter.http.rbac.v2B\tRbacProtoP\x01\xf2\x98\xfe\x8f\x05\'\x12%envoy.extensions.filters.http.rbac.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_rbac_dot_v2_dot_rbac__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_RBAC = _descriptor.Descriptor(
  name='RBAC',
  full_name='envoy.config.filter.http.rbac.v2.RBAC',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='rules', full_name='envoy.config.filter.http.rbac.v2.RBAC.rules', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='shadow_rules', full_name='envoy.config.filter.http.rbac.v2.RBAC.shadow_rules', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=177,
  serialized_end=276,
)


_RBACPERROUTE = _descriptor.Descriptor(
  name='RBACPerRoute',
  full_name='envoy.config.filter.http.rbac.v2.RBACPerRoute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='rbac', full_name='envoy.config.filter.http.rbac.v2.RBACPerRoute.rbac', index=0,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=278,
  serialized_end=352,
)

_RBAC.fields_by_name['rules'].message_type = envoy_dot_config_dot_rbac_dot_v2_dot_rbac__pb2._RBAC
_RBAC.fields_by_name['shadow_rules'].message_type = envoy_dot_config_dot_rbac_dot_v2_dot_rbac__pb2._RBAC
_RBACPERROUTE.fields_by_name['rbac'].message_type = _RBAC
DESCRIPTOR.message_types_by_name['RBAC'] = _RBAC
DESCRIPTOR.message_types_by_name['RBACPerRoute'] = _RBACPERROUTE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RBAC = _reflection.GeneratedProtocolMessageType('RBAC', (_message.Message,), {
  'DESCRIPTOR' : _RBAC,
  '__module__' : 'envoy.config.filter.http.rbac.v2.rbac_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.filter.http.rbac.v2.RBAC)
  })
_sym_db.RegisterMessage(RBAC)

RBACPerRoute = _reflection.GeneratedProtocolMessageType('RBACPerRoute', (_message.Message,), {
  'DESCRIPTOR' : _RBACPERROUTE,
  '__module__' : 'envoy.config.filter.http.rbac.v2.rbac_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.filter.http.rbac.v2.RBACPerRoute)
  })
_sym_db.RegisterMessage(RBACPerRoute)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
