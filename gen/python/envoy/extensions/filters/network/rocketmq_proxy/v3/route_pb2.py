# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/network/rocketmq_proxy/v3/route.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.config.route.v3 import route_components_pb2 as envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2
from envoy.type.matcher.v3 import string_pb2 as envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/network/rocketmq_proxy/v3/route.proto',
  package='envoy.extensions.filters.network.rocketmq_proxy.v3',
  syntax='proto3',
  serialized_options=b'\n@io.envoyproxy.envoy.extensions.filters.network.rocketmq_proxy.v3B\nRouteProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>envoy/extensions/filters/network/rocketmq_proxy/v3/route.proto\x12\x32\x65nvoy.extensions.filters.network.rocketmq_proxy.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a,envoy/config/route/v3/route_components.proto\x1a\"envoy/type/matcher/v3/string.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"m\n\x12RouteConfiguration\x12\x0c\n\x04name\x18\x01 \x01(\t\x12I\n\x06routes\x18\x02 \x03(\x0b\x32\x39.envoy.extensions.filters.network.rocketmq_proxy.v3.Route\"\xba\x01\n\x05Route\x12W\n\x05match\x18\x01 \x01(\x0b\x32>.envoy.extensions.filters.network.rocketmq_proxy.v3.RouteMatchB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12X\n\x05route\x18\x02 \x01(\x0b\x32?.envoy.extensions.filters.network.rocketmq_proxy.v3.RouteActionB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\"\x82\x01\n\nRouteMatch\x12=\n\x05topic\x18\x01 \x01(\x0b\x32$.envoy.type.matcher.v3.StringMatcherB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x35\n\x07headers\x18\x02 \x03(\x0b\x32$.envoy.config.route.v3.HeaderMatcher\"_\n\x0bRouteAction\x12\x18\n\x07\x63luster\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x36\n\x0emetadata_match\x18\x02 \x01(\x0b\x32\x1e.envoy.config.core.v3.MetadataBX\n@io.envoyproxy.envoy.extensions.filters.network.rocketmq_proxy.v3B\nRouteProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_ROUTECONFIGURATION = _descriptor.Descriptor(
  name='RouteConfiguration',
  full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteConfiguration',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteConfiguration.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='routes', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteConfiguration.routes', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=289,
  serialized_end=398,
)


_ROUTE = _descriptor.Descriptor(
  name='Route',
  full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.Route',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='match', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.Route.match', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='route', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.Route.route', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=401,
  serialized_end=587,
)


_ROUTEMATCH = _descriptor.Descriptor(
  name='RouteMatch',
  full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteMatch',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteMatch.topic', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='headers', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteMatch.headers', index=1,
      number=2, type=11, cpp_type=10, label=3,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=590,
  serialized_end=720,
)


_ROUTEACTION = _descriptor.Descriptor(
  name='RouteAction',
  full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteAction',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteAction.cluster', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata_match', full_name='envoy.extensions.filters.network.rocketmq_proxy.v3.RouteAction.metadata_match', index=1,
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
  serialized_start=722,
  serialized_end=817,
)

_ROUTECONFIGURATION.fields_by_name['routes'].message_type = _ROUTE
_ROUTE.fields_by_name['match'].message_type = _ROUTEMATCH
_ROUTE.fields_by_name['route'].message_type = _ROUTEACTION
_ROUTEMATCH.fields_by_name['topic'].message_type = envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2._STRINGMATCHER
_ROUTEMATCH.fields_by_name['headers'].message_type = envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2._HEADERMATCHER
_ROUTEACTION.fields_by_name['metadata_match'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._METADATA
DESCRIPTOR.message_types_by_name['RouteConfiguration'] = _ROUTECONFIGURATION
DESCRIPTOR.message_types_by_name['Route'] = _ROUTE
DESCRIPTOR.message_types_by_name['RouteMatch'] = _ROUTEMATCH
DESCRIPTOR.message_types_by_name['RouteAction'] = _ROUTEACTION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RouteConfiguration = _reflection.GeneratedProtocolMessageType('RouteConfiguration', (_message.Message,), {
  'DESCRIPTOR' : _ROUTECONFIGURATION,
  '__module__' : 'envoy.extensions.filters.network.rocketmq_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.rocketmq_proxy.v3.RouteConfiguration)
  })
_sym_db.RegisterMessage(RouteConfiguration)

Route = _reflection.GeneratedProtocolMessageType('Route', (_message.Message,), {
  'DESCRIPTOR' : _ROUTE,
  '__module__' : 'envoy.extensions.filters.network.rocketmq_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.rocketmq_proxy.v3.Route)
  })
_sym_db.RegisterMessage(Route)

RouteMatch = _reflection.GeneratedProtocolMessageType('RouteMatch', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEMATCH,
  '__module__' : 'envoy.extensions.filters.network.rocketmq_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.rocketmq_proxy.v3.RouteMatch)
  })
_sym_db.RegisterMessage(RouteMatch)

RouteAction = _reflection.GeneratedProtocolMessageType('RouteAction', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEACTION,
  '__module__' : 'envoy.extensions.filters.network.rocketmq_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.rocketmq_proxy.v3.RouteAction)
  })
_sym_db.RegisterMessage(RouteAction)


DESCRIPTOR._options = None
_ROUTE.fields_by_name['match']._options = None
_ROUTE.fields_by_name['route']._options = None
_ROUTEMATCH.fields_by_name['topic']._options = None
_ROUTEACTION.fields_by_name['cluster']._options = None
# @@protoc_insertion_point(module_scope)
