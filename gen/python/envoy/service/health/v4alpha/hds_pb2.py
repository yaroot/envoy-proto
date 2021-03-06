# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/health/v4alpha/hds.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.cluster.v4alpha import cluster_pb2 as envoy_dot_config_dot_cluster_dot_v4alpha_dot_cluster__pb2
from envoy.config.core.v4alpha import base_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2
from envoy.config.core.v4alpha import health_check_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2
from envoy.config.endpoint.v3 import endpoint_components_pb2 as envoy_dot_config_dot_endpoint_dot_v3_dot_endpoint__components__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/service/health/v4alpha/hds.proto',
  package='envoy.service.health.v4alpha',
  syntax='proto3',
  serialized_options=b'\n*io.envoyproxy.envoy.service.health.v4alphaB\010HdsProtoP\001\210\001\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&envoy/service/health/v4alpha/hds.proto\x12\x1c\x65nvoy.service.health.v4alpha\x1a*envoy/config/cluster/v4alpha/cluster.proto\x1a$envoy/config/core/v4alpha/base.proto\x1a,envoy/config/core/v4alpha/health_check.proto\x1a\x32\x65nvoy/config/endpoint/v3/endpoint_components.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"\xb4\x01\n\nCapability\x12Q\n\x16health_check_protocols\x18\x01 \x03(\x0e\x32\x31.envoy.service.health.v4alpha.Capability.Protocol\"(\n\x08Protocol\x12\x08\n\x04HTTP\x10\x00\x12\x07\n\x03TCP\x10\x01\x12\t\n\x05REDIS\x10\x02:)\x9a\xc5\x88\x1e$\n\"envoy.service.health.v3.Capability\"\xb4\x01\n\x12HealthCheckRequest\x12-\n\x04node\x18\x01 \x01(\x0b\x32\x1f.envoy.config.core.v4alpha.Node\x12<\n\ncapability\x18\x02 \x01(\x0b\x32(.envoy.service.health.v4alpha.Capability:1\x9a\xc5\x88\x1e,\n*envoy.service.health.v3.HealthCheckRequest\"\xb5\x01\n\x0e\x45ndpointHealth\x12\x34\n\x08\x65ndpoint\x18\x01 \x01(\x0b\x32\".envoy.config.endpoint.v3.Endpoint\x12>\n\rhealth_status\x18\x02 \x01(\x0e\x32\'.envoy.config.core.v4alpha.HealthStatus:-\x9a\xc5\x88\x1e(\n&envoy.service.health.v3.EndpointHealth\"\xd0\x01\n\x17LocalityEndpointsHealth\x12\x35\n\x08locality\x18\x01 \x01(\x0b\x32#.envoy.config.core.v4alpha.Locality\x12\x46\n\x10\x65ndpoints_health\x18\x02 \x03(\x0b\x32,.envoy.service.health.v4alpha.EndpointHealth:6\x9a\xc5\x88\x1e\x31\n/envoy.service.health.v3.LocalityEndpointsHealth\"\xbf\x01\n\x16\x43lusterEndpointsHealth\x12\x14\n\x0c\x63luster_name\x18\x01 \x01(\t\x12X\n\x19locality_endpoints_health\x18\x02 \x03(\x0b\x32\x35.envoy.service.health.v4alpha.LocalityEndpointsHealth:5\x9a\xc5\x88\x1e\x30\n.envoy.service.health.v3.ClusterEndpointsHealth\"\xbf\x01\n\x16\x45ndpointHealthResponse\x12V\n\x18\x63luster_endpoints_health\x18\x02 \x03(\x0b\x32\x34.envoy.service.health.v4alpha.ClusterEndpointsHealth:5\x9a\xc5\x88\x1e\x30\n.envoy.service.health.v3.EndpointHealthResponseJ\x04\x08\x01\x10\x02R\x10\x65ndpoints_health\"\xb3\x02\n*HealthCheckRequestOrEndpointHealthResponse\x12P\n\x14health_check_request\x18\x01 \x01(\x0b\x32\x30.envoy.service.health.v4alpha.HealthCheckRequestH\x00\x12X\n\x18\x65ndpoint_health_response\x18\x02 \x01(\x0b\x32\x34.envoy.service.health.v4alpha.EndpointHealthResponseH\x00:I\x9a\xc5\x88\x1e\x44\nBenvoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponseB\x0e\n\x0crequest_type\"\xb3\x01\n\x11LocalityEndpoints\x12\x35\n\x08locality\x18\x01 \x01(\x0b\x32#.envoy.config.core.v4alpha.Locality\x12\x35\n\tendpoints\x18\x02 \x03(\x0b\x32\".envoy.config.endpoint.v3.Endpoint:0\x9a\xc5\x88\x1e+\n)envoy.service.health.v3.LocalityEndpoints\"\xc7\x02\n\x12\x43lusterHealthCheck\x12\x14\n\x0c\x63luster_name\x18\x01 \x01(\t\x12=\n\rhealth_checks\x18\x02 \x03(\x0b\x32&.envoy.config.core.v4alpha.HealthCheck\x12K\n\x12locality_endpoints\x18\x03 \x03(\x0b\x32/.envoy.service.health.v4alpha.LocalityEndpoints\x12\\\n\x18transport_socket_matches\x18\x04 \x03(\x0b\x32:.envoy.config.cluster.v4alpha.Cluster.TransportSocketMatch:1\x9a\xc5\x88\x1e,\n*envoy.service.health.v3.ClusterHealthCheck\"\xc9\x01\n\x14HealthCheckSpecifier\x12O\n\x15\x63luster_health_checks\x18\x01 \x03(\x0b\x32\x30.envoy.service.health.v4alpha.ClusterHealthCheck\x12+\n\x08interval\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration:3\x9a\xc5\x88\x1e.\n,envoy.service.health.v3.HealthCheckSpecifier2\xf2\x02\n\x16HealthDiscoveryService\x12\x97\x01\n\x11StreamHealthCheck\x12H.envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse\x1a\x32.envoy.service.health.v4alpha.HealthCheckSpecifier\"\x00(\x01\x30\x01\x12\xbd\x01\n\x10\x46\x65tchHealthCheck\x12H.envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse\x1a\x32.envoy.service.health.v4alpha.HealthCheckSpecifier\"+\x82\xd3\xe4\x93\x02\x1c\"\x1a/v3/discovery:health_check\x82\xd3\xe4\x93\x02\x03:\x01*BC\n*io.envoyproxy.envoy.service.health.v4alphaB\x08HdsProtoP\x01\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_cluster_dot_v4alpha_dot_cluster__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2.DESCRIPTOR,envoy_dot_config_dot_endpoint_dot_v3_dot_endpoint__components__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])



_CAPABILITY_PROTOCOL = _descriptor.EnumDescriptor(
  name='Protocol',
  full_name='envoy.service.health.v4alpha.Capability.Protocol',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='HTTP', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TCP', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDIS', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=478,
  serialized_end=518,
)
_sym_db.RegisterEnumDescriptor(_CAPABILITY_PROTOCOL)


_CAPABILITY = _descriptor.Descriptor(
  name='Capability',
  full_name='envoy.service.health.v4alpha.Capability',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='health_check_protocols', full_name='envoy.service.health.v4alpha.Capability.health_check_protocols', index=0,
      number=1, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CAPABILITY_PROTOCOL,
  ],
  serialized_options=b'\232\305\210\036$\n\"envoy.service.health.v3.Capability',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=381,
  serialized_end=561,
)


_HEALTHCHECKREQUEST = _descriptor.Descriptor(
  name='HealthCheckRequest',
  full_name='envoy.service.health.v4alpha.HealthCheckRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='node', full_name='envoy.service.health.v4alpha.HealthCheckRequest.node', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='capability', full_name='envoy.service.health.v4alpha.HealthCheckRequest.capability', index=1,
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
  serialized_options=b'\232\305\210\036,\n*envoy.service.health.v3.HealthCheckRequest',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=564,
  serialized_end=744,
)


_ENDPOINTHEALTH = _descriptor.Descriptor(
  name='EndpointHealth',
  full_name='envoy.service.health.v4alpha.EndpointHealth',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='endpoint', full_name='envoy.service.health.v4alpha.EndpointHealth.endpoint', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='health_status', full_name='envoy.service.health.v4alpha.EndpointHealth.health_status', index=1,
      number=2, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\232\305\210\036(\n&envoy.service.health.v3.EndpointHealth',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=747,
  serialized_end=928,
)


_LOCALITYENDPOINTSHEALTH = _descriptor.Descriptor(
  name='LocalityEndpointsHealth',
  full_name='envoy.service.health.v4alpha.LocalityEndpointsHealth',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='locality', full_name='envoy.service.health.v4alpha.LocalityEndpointsHealth.locality', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='endpoints_health', full_name='envoy.service.health.v4alpha.LocalityEndpointsHealth.endpoints_health', index=1,
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
  serialized_options=b'\232\305\210\0361\n/envoy.service.health.v3.LocalityEndpointsHealth',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=931,
  serialized_end=1139,
)


_CLUSTERENDPOINTSHEALTH = _descriptor.Descriptor(
  name='ClusterEndpointsHealth',
  full_name='envoy.service.health.v4alpha.ClusterEndpointsHealth',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_name', full_name='envoy.service.health.v4alpha.ClusterEndpointsHealth.cluster_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='locality_endpoints_health', full_name='envoy.service.health.v4alpha.ClusterEndpointsHealth.locality_endpoints_health', index=1,
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
  serialized_options=b'\232\305\210\0360\n.envoy.service.health.v3.ClusterEndpointsHealth',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1142,
  serialized_end=1333,
)


_ENDPOINTHEALTHRESPONSE = _descriptor.Descriptor(
  name='EndpointHealthResponse',
  full_name='envoy.service.health.v4alpha.EndpointHealthResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_endpoints_health', full_name='envoy.service.health.v4alpha.EndpointHealthResponse.cluster_endpoints_health', index=0,
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
  serialized_options=b'\232\305\210\0360\n.envoy.service.health.v3.EndpointHealthResponse',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1336,
  serialized_end=1527,
)


_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE = _descriptor.Descriptor(
  name='HealthCheckRequestOrEndpointHealthResponse',
  full_name='envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='health_check_request', full_name='envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse.health_check_request', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='endpoint_health_response', full_name='envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse.endpoint_health_response', index=1,
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
  serialized_options=b'\232\305\210\036D\nBenvoy.service.health.v3.HealthCheckRequestOrEndpointHealthResponse',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='request_type', full_name='envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse.request_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1530,
  serialized_end=1837,
)


_LOCALITYENDPOINTS = _descriptor.Descriptor(
  name='LocalityEndpoints',
  full_name='envoy.service.health.v4alpha.LocalityEndpoints',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='locality', full_name='envoy.service.health.v4alpha.LocalityEndpoints.locality', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='endpoints', full_name='envoy.service.health.v4alpha.LocalityEndpoints.endpoints', index=1,
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
  serialized_options=b'\232\305\210\036+\n)envoy.service.health.v3.LocalityEndpoints',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1840,
  serialized_end=2019,
)


_CLUSTERHEALTHCHECK = _descriptor.Descriptor(
  name='ClusterHealthCheck',
  full_name='envoy.service.health.v4alpha.ClusterHealthCheck',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_name', full_name='envoy.service.health.v4alpha.ClusterHealthCheck.cluster_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='health_checks', full_name='envoy.service.health.v4alpha.ClusterHealthCheck.health_checks', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='locality_endpoints', full_name='envoy.service.health.v4alpha.ClusterHealthCheck.locality_endpoints', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transport_socket_matches', full_name='envoy.service.health.v4alpha.ClusterHealthCheck.transport_socket_matches', index=3,
      number=4, type=11, cpp_type=10, label=3,
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
  serialized_options=b'\232\305\210\036,\n*envoy.service.health.v3.ClusterHealthCheck',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2022,
  serialized_end=2349,
)


_HEALTHCHECKSPECIFIER = _descriptor.Descriptor(
  name='HealthCheckSpecifier',
  full_name='envoy.service.health.v4alpha.HealthCheckSpecifier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_health_checks', full_name='envoy.service.health.v4alpha.HealthCheckSpecifier.cluster_health_checks', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='interval', full_name='envoy.service.health.v4alpha.HealthCheckSpecifier.interval', index=1,
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
  serialized_options=b'\232\305\210\036.\n,envoy.service.health.v3.HealthCheckSpecifier',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2352,
  serialized_end=2553,
)

_CAPABILITY.fields_by_name['health_check_protocols'].enum_type = _CAPABILITY_PROTOCOL
_CAPABILITY_PROTOCOL.containing_type = _CAPABILITY
_HEALTHCHECKREQUEST.fields_by_name['node'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._NODE
_HEALTHCHECKREQUEST.fields_by_name['capability'].message_type = _CAPABILITY
_ENDPOINTHEALTH.fields_by_name['endpoint'].message_type = envoy_dot_config_dot_endpoint_dot_v3_dot_endpoint__components__pb2._ENDPOINT
_ENDPOINTHEALTH.fields_by_name['health_status'].enum_type = envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2._HEALTHSTATUS
_LOCALITYENDPOINTSHEALTH.fields_by_name['locality'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._LOCALITY
_LOCALITYENDPOINTSHEALTH.fields_by_name['endpoints_health'].message_type = _ENDPOINTHEALTH
_CLUSTERENDPOINTSHEALTH.fields_by_name['locality_endpoints_health'].message_type = _LOCALITYENDPOINTSHEALTH
_ENDPOINTHEALTHRESPONSE.fields_by_name['cluster_endpoints_health'].message_type = _CLUSTERENDPOINTSHEALTH
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.fields_by_name['health_check_request'].message_type = _HEALTHCHECKREQUEST
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.fields_by_name['endpoint_health_response'].message_type = _ENDPOINTHEALTHRESPONSE
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.oneofs_by_name['request_type'].fields.append(
  _HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.fields_by_name['health_check_request'])
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.fields_by_name['health_check_request'].containing_oneof = _HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.oneofs_by_name['request_type']
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.oneofs_by_name['request_type'].fields.append(
  _HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.fields_by_name['endpoint_health_response'])
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.fields_by_name['endpoint_health_response'].containing_oneof = _HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE.oneofs_by_name['request_type']
_LOCALITYENDPOINTS.fields_by_name['locality'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._LOCALITY
_LOCALITYENDPOINTS.fields_by_name['endpoints'].message_type = envoy_dot_config_dot_endpoint_dot_v3_dot_endpoint__components__pb2._ENDPOINT
_CLUSTERHEALTHCHECK.fields_by_name['health_checks'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_health__check__pb2._HEALTHCHECK
_CLUSTERHEALTHCHECK.fields_by_name['locality_endpoints'].message_type = _LOCALITYENDPOINTS
_CLUSTERHEALTHCHECK.fields_by_name['transport_socket_matches'].message_type = envoy_dot_config_dot_cluster_dot_v4alpha_dot_cluster__pb2._CLUSTER_TRANSPORTSOCKETMATCH
_HEALTHCHECKSPECIFIER.fields_by_name['cluster_health_checks'].message_type = _CLUSTERHEALTHCHECK
_HEALTHCHECKSPECIFIER.fields_by_name['interval'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
DESCRIPTOR.message_types_by_name['Capability'] = _CAPABILITY
DESCRIPTOR.message_types_by_name['HealthCheckRequest'] = _HEALTHCHECKREQUEST
DESCRIPTOR.message_types_by_name['EndpointHealth'] = _ENDPOINTHEALTH
DESCRIPTOR.message_types_by_name['LocalityEndpointsHealth'] = _LOCALITYENDPOINTSHEALTH
DESCRIPTOR.message_types_by_name['ClusterEndpointsHealth'] = _CLUSTERENDPOINTSHEALTH
DESCRIPTOR.message_types_by_name['EndpointHealthResponse'] = _ENDPOINTHEALTHRESPONSE
DESCRIPTOR.message_types_by_name['HealthCheckRequestOrEndpointHealthResponse'] = _HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE
DESCRIPTOR.message_types_by_name['LocalityEndpoints'] = _LOCALITYENDPOINTS
DESCRIPTOR.message_types_by_name['ClusterHealthCheck'] = _CLUSTERHEALTHCHECK
DESCRIPTOR.message_types_by_name['HealthCheckSpecifier'] = _HEALTHCHECKSPECIFIER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Capability = _reflection.GeneratedProtocolMessageType('Capability', (_message.Message,), {
  'DESCRIPTOR' : _CAPABILITY,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.Capability)
  })
_sym_db.RegisterMessage(Capability)

HealthCheckRequest = _reflection.GeneratedProtocolMessageType('HealthCheckRequest', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKREQUEST,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.HealthCheckRequest)
  })
_sym_db.RegisterMessage(HealthCheckRequest)

EndpointHealth = _reflection.GeneratedProtocolMessageType('EndpointHealth', (_message.Message,), {
  'DESCRIPTOR' : _ENDPOINTHEALTH,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.EndpointHealth)
  })
_sym_db.RegisterMessage(EndpointHealth)

LocalityEndpointsHealth = _reflection.GeneratedProtocolMessageType('LocalityEndpointsHealth', (_message.Message,), {
  'DESCRIPTOR' : _LOCALITYENDPOINTSHEALTH,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.LocalityEndpointsHealth)
  })
_sym_db.RegisterMessage(LocalityEndpointsHealth)

ClusterEndpointsHealth = _reflection.GeneratedProtocolMessageType('ClusterEndpointsHealth', (_message.Message,), {
  'DESCRIPTOR' : _CLUSTERENDPOINTSHEALTH,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.ClusterEndpointsHealth)
  })
_sym_db.RegisterMessage(ClusterEndpointsHealth)

EndpointHealthResponse = _reflection.GeneratedProtocolMessageType('EndpointHealthResponse', (_message.Message,), {
  'DESCRIPTOR' : _ENDPOINTHEALTHRESPONSE,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.EndpointHealthResponse)
  })
_sym_db.RegisterMessage(EndpointHealthResponse)

HealthCheckRequestOrEndpointHealthResponse = _reflection.GeneratedProtocolMessageType('HealthCheckRequestOrEndpointHealthResponse', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.HealthCheckRequestOrEndpointHealthResponse)
  })
_sym_db.RegisterMessage(HealthCheckRequestOrEndpointHealthResponse)

LocalityEndpoints = _reflection.GeneratedProtocolMessageType('LocalityEndpoints', (_message.Message,), {
  'DESCRIPTOR' : _LOCALITYENDPOINTS,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.LocalityEndpoints)
  })
_sym_db.RegisterMessage(LocalityEndpoints)

ClusterHealthCheck = _reflection.GeneratedProtocolMessageType('ClusterHealthCheck', (_message.Message,), {
  'DESCRIPTOR' : _CLUSTERHEALTHCHECK,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.ClusterHealthCheck)
  })
_sym_db.RegisterMessage(ClusterHealthCheck)

HealthCheckSpecifier = _reflection.GeneratedProtocolMessageType('HealthCheckSpecifier', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKSPECIFIER,
  '__module__' : 'envoy.service.health.v4alpha.hds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.health.v4alpha.HealthCheckSpecifier)
  })
_sym_db.RegisterMessage(HealthCheckSpecifier)


DESCRIPTOR._options = None
_CAPABILITY._options = None
_HEALTHCHECKREQUEST._options = None
_ENDPOINTHEALTH._options = None
_LOCALITYENDPOINTSHEALTH._options = None
_CLUSTERENDPOINTSHEALTH._options = None
_ENDPOINTHEALTHRESPONSE._options = None
_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE._options = None
_LOCALITYENDPOINTS._options = None
_CLUSTERHEALTHCHECK._options = None
_HEALTHCHECKSPECIFIER._options = None

_HEALTHDISCOVERYSERVICE = _descriptor.ServiceDescriptor(
  name='HealthDiscoveryService',
  full_name='envoy.service.health.v4alpha.HealthDiscoveryService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=2556,
  serialized_end=2926,
  methods=[
  _descriptor.MethodDescriptor(
    name='StreamHealthCheck',
    full_name='envoy.service.health.v4alpha.HealthDiscoveryService.StreamHealthCheck',
    index=0,
    containing_service=None,
    input_type=_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE,
    output_type=_HEALTHCHECKSPECIFIER,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='FetchHealthCheck',
    full_name='envoy.service.health.v4alpha.HealthDiscoveryService.FetchHealthCheck',
    index=1,
    containing_service=None,
    input_type=_HEALTHCHECKREQUESTORENDPOINTHEALTHRESPONSE,
    output_type=_HEALTHCHECKSPECIFIER,
    serialized_options=b'\202\323\344\223\002\034\"\032/v3/discovery:health_check\202\323\344\223\002\003:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_HEALTHDISCOVERYSERVICE)

DESCRIPTOR.services_by_name['HealthDiscoveryService'] = _HEALTHDISCOVERYSERVICE

# @@protoc_insertion_point(module_scope)
