# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/network/dubbo_proxy/v3/route.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.route.v3 import route_components_pb2 as envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2
from envoy.type.matcher.v3 import string_pb2 as envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2
from envoy.type.v3 import range_pb2 as envoy_dot_type_dot_v3_dot_range__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/network/dubbo_proxy/v3/route.proto',
  package='envoy.extensions.filters.network.dubbo_proxy.v3',
  syntax='proto3',
  serialized_options=b'\n=io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3B\nRouteProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;envoy/extensions/filters/network/dubbo_proxy/v3/route.proto\x12/envoy.extensions.filters.network.dubbo_proxy.v3\x1a,envoy/config/route/v3/route_components.proto\x1a\"envoy/type/matcher/v3/string.proto\x1a\x19\x65nvoy/type/v3/range.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xe9\x01\n\x12RouteConfiguration\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x11\n\tinterface\x18\x02 \x01(\t\x12\r\n\x05group\x18\x03 \x01(\t\x12\x0f\n\x07version\x18\x04 \x01(\t\x12\x46\n\x06routes\x18\x05 \x03(\x0b\x32\x36.envoy.extensions.filters.network.dubbo_proxy.v3.Route:J\x9a\xc5\x88\x1e\x45\nCenvoy.config.filter.network.dubbo_proxy.v2alpha1.RouteConfiguration\"\xf3\x01\n\x05Route\x12T\n\x05match\x18\x01 \x01(\x0b\x32;.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatchB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12U\n\x05route\x18\x02 \x01(\x0b\x32<.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01:=\x9a\xc5\x88\x1e\x38\n6envoy.config.filter.network.dubbo_proxy.v2alpha1.Route\"\xd5\x01\n\nRouteMatch\x12L\n\x06method\x18\x01 \x01(\x0b\x32<.envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch\x12\x35\n\x07headers\x18\x02 \x03(\x0b\x32$.envoy.config.route.v3.HeaderMatcher:B\x9a\xc5\x88\x1e=\n;envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteMatch\"\xc4\x01\n\x0bRouteAction\x12\x11\n\x07\x63luster\x18\x01 \x01(\tH\x00\x12\x43\n\x11weighted_clusters\x18\x02 \x01(\x0b\x32&.envoy.config.route.v3.WeightedClusterH\x00:C\x9a\xc5\x88\x1e>\n<envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteActionB\x18\n\x11\x63luster_specifier\x12\x03\xf8\x42\x01\"\xd5\x04\n\x0bMethodMatch\x12\x32\n\x04name\x18\x01 \x01(\x0b\x32$.envoy.type.matcher.v3.StringMatcher\x12\x63\n\x0cparams_match\x18\x02 \x03(\x0b\x32M.envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParamsMatchEntry\x1a\xdc\x01\n\x17ParameterMatchSpecifier\x12\x15\n\x0b\x65xact_match\x18\x03 \x01(\tH\x00\x12\x30\n\x0brange_match\x18\x04 \x01(\x0b\x32\x19.envoy.type.v3.Int64RangeH\x00:[\x9a\xc5\x88\x1eV\nTenvoy.config.filter.network.dubbo_proxy.v2alpha1.MethodMatch.ParameterMatchSpecifierB\x1b\n\x19parameter_match_specifier\x1a\x88\x01\n\x10ParamsMatchEntry\x12\x0b\n\x03key\x18\x01 \x01(\r\x12\x63\n\x05value\x18\x02 \x01(\x0b\x32T.envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParameterMatchSpecifier:\x02\x38\x01:C\x9a\xc5\x88\x1e>\n<envoy.config.filter.network.dubbo_proxy.v2alpha1.MethodMatchBU\n=io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3B\nRouteProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2.DESCRIPTOR,envoy_dot_type_dot_v3_dot_range__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_ROUTECONFIGURATION = _descriptor.Descriptor(
  name='RouteConfiguration',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='interface', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.interface', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='group', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.group', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.version', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='routes', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration.routes', index=4,
      number=5, type=11, cpp_type=10, label=3,
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
  serialized_options=b'\232\305\210\036E\nCenvoy.config.filter.network.dubbo_proxy.v2alpha1.RouteConfiguration',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=313,
  serialized_end=546,
)


_ROUTE = _descriptor.Descriptor(
  name='Route',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.Route',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='match', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.Route.match', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='route', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.Route.route', index=1,
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
  serialized_options=b'\232\305\210\0368\n6envoy.config.filter.network.dubbo_proxy.v2alpha1.Route',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=549,
  serialized_end=792,
)


_ROUTEMATCH = _descriptor.Descriptor(
  name='RouteMatch',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='method', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.method', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='headers', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.headers', index=1,
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
  serialized_options=b'\232\305\210\036=\n;envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteMatch',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=795,
  serialized_end=1008,
)


_ROUTEACTION = _descriptor.Descriptor(
  name='RouteAction',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.cluster', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='weighted_clusters', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.weighted_clusters', index=1,
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
  serialized_options=b'\232\305\210\036>\n<envoy.config.filter.network.dubbo_proxy.v2alpha1.RouteAction',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='cluster_specifier', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.cluster_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=1011,
  serialized_end=1207,
)


_METHODMATCH_PARAMETERMATCHSPECIFIER = _descriptor.Descriptor(
  name='ParameterMatchSpecifier',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParameterMatchSpecifier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='exact_match', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParameterMatchSpecifier.exact_match', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='range_match', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParameterMatchSpecifier.range_match', index=1,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036V\nTenvoy.config.filter.network.dubbo_proxy.v2alpha1.MethodMatch.ParameterMatchSpecifier',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='parameter_match_specifier', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParameterMatchSpecifier.parameter_match_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1379,
  serialized_end=1599,
)

_METHODMATCH_PARAMSMATCHENTRY = _descriptor.Descriptor(
  name='ParamsMatchEntry',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParamsMatchEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParamsMatchEntry.key', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParamsMatchEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1602,
  serialized_end=1738,
)

_METHODMATCH = _descriptor.Descriptor(
  name='MethodMatch',
  full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.name', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='params_match', full_name='envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.params_match', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_METHODMATCH_PARAMETERMATCHSPECIFIER, _METHODMATCH_PARAMSMATCHENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036>\n<envoy.config.filter.network.dubbo_proxy.v2alpha1.MethodMatch',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1210,
  serialized_end=1807,
)

_ROUTECONFIGURATION.fields_by_name['routes'].message_type = _ROUTE
_ROUTE.fields_by_name['match'].message_type = _ROUTEMATCH
_ROUTE.fields_by_name['route'].message_type = _ROUTEACTION
_ROUTEMATCH.fields_by_name['method'].message_type = _METHODMATCH
_ROUTEMATCH.fields_by_name['headers'].message_type = envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2._HEADERMATCHER
_ROUTEACTION.fields_by_name['weighted_clusters'].message_type = envoy_dot_config_dot_route_dot_v3_dot_route__components__pb2._WEIGHTEDCLUSTER
_ROUTEACTION.oneofs_by_name['cluster_specifier'].fields.append(
  _ROUTEACTION.fields_by_name['cluster'])
_ROUTEACTION.fields_by_name['cluster'].containing_oneof = _ROUTEACTION.oneofs_by_name['cluster_specifier']
_ROUTEACTION.oneofs_by_name['cluster_specifier'].fields.append(
  _ROUTEACTION.fields_by_name['weighted_clusters'])
_ROUTEACTION.fields_by_name['weighted_clusters'].containing_oneof = _ROUTEACTION.oneofs_by_name['cluster_specifier']
_METHODMATCH_PARAMETERMATCHSPECIFIER.fields_by_name['range_match'].message_type = envoy_dot_type_dot_v3_dot_range__pb2._INT64RANGE
_METHODMATCH_PARAMETERMATCHSPECIFIER.containing_type = _METHODMATCH
_METHODMATCH_PARAMETERMATCHSPECIFIER.oneofs_by_name['parameter_match_specifier'].fields.append(
  _METHODMATCH_PARAMETERMATCHSPECIFIER.fields_by_name['exact_match'])
_METHODMATCH_PARAMETERMATCHSPECIFIER.fields_by_name['exact_match'].containing_oneof = _METHODMATCH_PARAMETERMATCHSPECIFIER.oneofs_by_name['parameter_match_specifier']
_METHODMATCH_PARAMETERMATCHSPECIFIER.oneofs_by_name['parameter_match_specifier'].fields.append(
  _METHODMATCH_PARAMETERMATCHSPECIFIER.fields_by_name['range_match'])
_METHODMATCH_PARAMETERMATCHSPECIFIER.fields_by_name['range_match'].containing_oneof = _METHODMATCH_PARAMETERMATCHSPECIFIER.oneofs_by_name['parameter_match_specifier']
_METHODMATCH_PARAMSMATCHENTRY.fields_by_name['value'].message_type = _METHODMATCH_PARAMETERMATCHSPECIFIER
_METHODMATCH_PARAMSMATCHENTRY.containing_type = _METHODMATCH
_METHODMATCH.fields_by_name['name'].message_type = envoy_dot_type_dot_matcher_dot_v3_dot_string__pb2._STRINGMATCHER
_METHODMATCH.fields_by_name['params_match'].message_type = _METHODMATCH_PARAMSMATCHENTRY
DESCRIPTOR.message_types_by_name['RouteConfiguration'] = _ROUTECONFIGURATION
DESCRIPTOR.message_types_by_name['Route'] = _ROUTE
DESCRIPTOR.message_types_by_name['RouteMatch'] = _ROUTEMATCH
DESCRIPTOR.message_types_by_name['RouteAction'] = _ROUTEACTION
DESCRIPTOR.message_types_by_name['MethodMatch'] = _METHODMATCH
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RouteConfiguration = _reflection.GeneratedProtocolMessageType('RouteConfiguration', (_message.Message,), {
  'DESCRIPTOR' : _ROUTECONFIGURATION,
  '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration)
  })
_sym_db.RegisterMessage(RouteConfiguration)

Route = _reflection.GeneratedProtocolMessageType('Route', (_message.Message,), {
  'DESCRIPTOR' : _ROUTE,
  '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.Route)
  })
_sym_db.RegisterMessage(Route)

RouteMatch = _reflection.GeneratedProtocolMessageType('RouteMatch', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEMATCH,
  '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch)
  })
_sym_db.RegisterMessage(RouteMatch)

RouteAction = _reflection.GeneratedProtocolMessageType('RouteAction', (_message.Message,), {
  'DESCRIPTOR' : _ROUTEACTION,
  '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)
  })
_sym_db.RegisterMessage(RouteAction)

MethodMatch = _reflection.GeneratedProtocolMessageType('MethodMatch', (_message.Message,), {

  'ParameterMatchSpecifier' : _reflection.GeneratedProtocolMessageType('ParameterMatchSpecifier', (_message.Message,), {
    'DESCRIPTOR' : _METHODMATCH_PARAMETERMATCHSPECIFIER,
    '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParameterMatchSpecifier)
    })
  ,

  'ParamsMatchEntry' : _reflection.GeneratedProtocolMessageType('ParamsMatchEntry', (_message.Message,), {
    'DESCRIPTOR' : _METHODMATCH_PARAMSMATCHENTRY,
    '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
    # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch.ParamsMatchEntry)
    })
  ,
  'DESCRIPTOR' : _METHODMATCH,
  '__module__' : 'envoy.extensions.filters.network.dubbo_proxy.v3.route_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.MethodMatch)
  })
_sym_db.RegisterMessage(MethodMatch)
_sym_db.RegisterMessage(MethodMatch.ParameterMatchSpecifier)
_sym_db.RegisterMessage(MethodMatch.ParamsMatchEntry)


DESCRIPTOR._options = None
_ROUTECONFIGURATION._options = None
_ROUTE.fields_by_name['match']._options = None
_ROUTE.fields_by_name['route']._options = None
_ROUTE._options = None
_ROUTEMATCH._options = None
_ROUTEACTION.oneofs_by_name['cluster_specifier']._options = None
_ROUTEACTION._options = None
_METHODMATCH_PARAMETERMATCHSPECIFIER._options = None
_METHODMATCH_PARAMSMATCHENTRY._options = None
_METHODMATCH._options = None
# @@protoc_insertion_point(module_scope)
