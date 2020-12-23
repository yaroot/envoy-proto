# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/status/v3/csds.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.admin.v3 import config_dump_pb2 as envoy_dot_admin_dot_v3_dot_config__dump__pb2
from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.type.matcher.v3 import node_pb2 as envoy_dot_type_dot_matcher_dot_v3_dot_node__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/service/status/v3/csds.proto',
  package='envoy.service.status.v3',
  syntax='proto3',
  serialized_options=b'\n%io.envoyproxy.envoy.service.status.v3B\tCsdsProtoP\001\210\001\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\"envoy/service/status/v3/csds.proto\x12\x17\x65nvoy.service.status.v3\x1a envoy/admin/v3/config_dump.proto\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a envoy/type/matcher/v3/node.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"\xae\x01\n\x13\x43lientStatusRequest\x12\x39\n\rnode_matchers\x18\x01 \x03(\x0b\x32\".envoy.type.matcher.v3.NodeMatcher\x12(\n\x04node\x18\x02 \x01(\x0b\x32\x1a.envoy.config.core.v3.Node:2\x9a\xc5\x88\x1e-\n+envoy.service.status.v2.ClientStatusRequest\"\xb5\x04\n\x0cPerXdsConfig\x12L\n\x06status\x18\x01 \x01(\x0e\x32%.envoy.service.status.v3.ConfigStatusB\x15\xf2\x98\xfe\x8f\x05\x0f\x12\rstatus_config\x12Y\n\rclient_status\x18\x07 \x01(\x0e\x32+.envoy.service.status.v3.ClientConfigStatusB\x15\xf2\x98\xfe\x8f\x05\x0f\x12\rstatus_config\x12>\n\x0flistener_config\x18\x02 \x01(\x0b\x32#.envoy.admin.v3.ListenersConfigDumpH\x00\x12<\n\x0e\x63luster_config\x18\x03 \x01(\x0b\x32\".envoy.admin.v3.ClustersConfigDumpH\x00\x12\x38\n\x0croute_config\x18\x04 \x01(\x0b\x32 .envoy.admin.v3.RoutesConfigDumpH\x00\x12\x45\n\x13scoped_route_config\x18\x05 \x01(\x0b\x32&.envoy.admin.v3.ScopedRoutesConfigDumpH\x00\x12>\n\x0f\x65ndpoint_config\x18\x06 \x01(\x0b\x32#.envoy.admin.v3.EndpointsConfigDumpH\x00:+\x9a\xc5\x88\x1e&\n$envoy.service.status.v2.PerXdsConfigB\x10\n\x0eper_xds_config\"\xa0\x01\n\x0c\x43lientConfig\x12(\n\x04node\x18\x01 \x01(\x0b\x32\x1a.envoy.config.core.v3.Node\x12\x39\n\nxds_config\x18\x02 \x03(\x0b\x32%.envoy.service.status.v3.PerXdsConfig:+\x9a\xc5\x88\x1e&\n$envoy.service.status.v2.ClientConfig\"\x82\x01\n\x14\x43lientStatusResponse\x12\x35\n\x06\x63onfig\x18\x01 \x03(\x0b\x32%.envoy.service.status.v3.ClientConfig:3\x9a\xc5\x88\x1e.\n,envoy.service.status.v2.ClientStatusResponse*K\n\x0c\x43onfigStatus\x12\x0b\n\x07UNKNOWN\x10\x00\x12\n\n\x06SYNCED\x10\x01\x12\x0c\n\x08NOT_SENT\x10\x02\x12\t\n\x05STALE\x10\x03\x12\t\n\x05\x45RROR\x10\x04*c\n\x12\x43lientConfigStatus\x12\x12\n\x0e\x43LIENT_UNKNOWN\x10\x00\x12\x14\n\x10\x43LIENT_REQUESTED\x10\x01\x12\x10\n\x0c\x43LIENT_ACKED\x10\x02\x12\x11\n\rCLIENT_NACKED\x10\x03\x32\xb8\x02\n\x1c\x43lientStatusDiscoveryService\x12w\n\x12StreamClientStatus\x12,.envoy.service.status.v3.ClientStatusRequest\x1a-.envoy.service.status.v3.ClientStatusResponse\"\x00(\x01\x30\x01\x12\x9e\x01\n\x11\x46\x65tchClientStatus\x12,.envoy.service.status.v3.ClientStatusRequest\x1a-.envoy.service.status.v3.ClientStatusResponse\",\x82\xd3\xe4\x93\x02\x1d\"\x1b/v3/discovery:client_status\x82\xd3\xe4\x93\x02\x03:\x01*B?\n%io.envoyproxy.envoy.service.status.v3B\tCsdsProtoP\x01\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_admin_dot_v3_dot_config__dump__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v3_dot_node__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])

_CONFIGSTATUS = _descriptor.EnumDescriptor(
  name='ConfigStatus',
  full_name='envoy.service.status.v3.ConfigStatus',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SYNCED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NOT_SENT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STALE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ERROR', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1363,
  serialized_end=1438,
)
_sym_db.RegisterEnumDescriptor(_CONFIGSTATUS)

ConfigStatus = enum_type_wrapper.EnumTypeWrapper(_CONFIGSTATUS)
_CLIENTCONFIGSTATUS = _descriptor.EnumDescriptor(
  name='ClientConfigStatus',
  full_name='envoy.service.status.v3.ClientConfigStatus',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CLIENT_UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLIENT_REQUESTED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLIENT_ACKED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLIENT_NACKED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1440,
  serialized_end=1539,
)
_sym_db.RegisterEnumDescriptor(_CLIENTCONFIGSTATUS)

ClientConfigStatus = enum_type_wrapper.EnumTypeWrapper(_CLIENTCONFIGSTATUS)
UNKNOWN = 0
SYNCED = 1
NOT_SENT = 2
STALE = 3
ERROR = 4
CLIENT_UNKNOWN = 0
CLIENT_REQUESTED = 1
CLIENT_ACKED = 2
CLIENT_NACKED = 3



_CLIENTSTATUSREQUEST = _descriptor.Descriptor(
  name='ClientStatusRequest',
  full_name='envoy.service.status.v3.ClientStatusRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='node_matchers', full_name='envoy.service.status.v3.ClientStatusRequest.node_matchers', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='node', full_name='envoy.service.status.v3.ClientStatusRequest.node', index=1,
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
  serialized_options=b'\232\305\210\036-\n+envoy.service.status.v2.ClientStatusRequest',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=323,
  serialized_end=497,
)


_PERXDSCONFIG = _descriptor.Descriptor(
  name='PerXdsConfig',
  full_name='envoy.service.status.v3.PerXdsConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='envoy.service.status.v3.PerXdsConfig.status', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\362\230\376\217\005\017\022\rstatus_config', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='client_status', full_name='envoy.service.status.v3.PerXdsConfig.client_status', index=1,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\362\230\376\217\005\017\022\rstatus_config', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='listener_config', full_name='envoy.service.status.v3.PerXdsConfig.listener_config', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_config', full_name='envoy.service.status.v3.PerXdsConfig.cluster_config', index=3,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='route_config', full_name='envoy.service.status.v3.PerXdsConfig.route_config', index=4,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scoped_route_config', full_name='envoy.service.status.v3.PerXdsConfig.scoped_route_config', index=5,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='endpoint_config', full_name='envoy.service.status.v3.PerXdsConfig.endpoint_config', index=6,
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
  serialized_options=b'\232\305\210\036&\n$envoy.service.status.v2.PerXdsConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='per_xds_config', full_name='envoy.service.status.v3.PerXdsConfig.per_xds_config',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=500,
  serialized_end=1065,
)


_CLIENTCONFIG = _descriptor.Descriptor(
  name='ClientConfig',
  full_name='envoy.service.status.v3.ClientConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='node', full_name='envoy.service.status.v3.ClientConfig.node', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='xds_config', full_name='envoy.service.status.v3.ClientConfig.xds_config', index=1,
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
  serialized_options=b'\232\305\210\036&\n$envoy.service.status.v2.ClientConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1068,
  serialized_end=1228,
)


_CLIENTSTATUSRESPONSE = _descriptor.Descriptor(
  name='ClientStatusResponse',
  full_name='envoy.service.status.v3.ClientStatusResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config', full_name='envoy.service.status.v3.ClientStatusResponse.config', index=0,
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
  serialized_options=b'\232\305\210\036.\n,envoy.service.status.v2.ClientStatusResponse',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1231,
  serialized_end=1361,
)

_CLIENTSTATUSREQUEST.fields_by_name['node_matchers'].message_type = envoy_dot_type_dot_matcher_dot_v3_dot_node__pb2._NODEMATCHER
_CLIENTSTATUSREQUEST.fields_by_name['node'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._NODE
_PERXDSCONFIG.fields_by_name['status'].enum_type = _CONFIGSTATUS
_PERXDSCONFIG.fields_by_name['client_status'].enum_type = _CLIENTCONFIGSTATUS
_PERXDSCONFIG.fields_by_name['listener_config'].message_type = envoy_dot_admin_dot_v3_dot_config__dump__pb2._LISTENERSCONFIGDUMP
_PERXDSCONFIG.fields_by_name['cluster_config'].message_type = envoy_dot_admin_dot_v3_dot_config__dump__pb2._CLUSTERSCONFIGDUMP
_PERXDSCONFIG.fields_by_name['route_config'].message_type = envoy_dot_admin_dot_v3_dot_config__dump__pb2._ROUTESCONFIGDUMP
_PERXDSCONFIG.fields_by_name['scoped_route_config'].message_type = envoy_dot_admin_dot_v3_dot_config__dump__pb2._SCOPEDROUTESCONFIGDUMP
_PERXDSCONFIG.fields_by_name['endpoint_config'].message_type = envoy_dot_admin_dot_v3_dot_config__dump__pb2._ENDPOINTSCONFIGDUMP
_PERXDSCONFIG.oneofs_by_name['per_xds_config'].fields.append(
  _PERXDSCONFIG.fields_by_name['listener_config'])
_PERXDSCONFIG.fields_by_name['listener_config'].containing_oneof = _PERXDSCONFIG.oneofs_by_name['per_xds_config']
_PERXDSCONFIG.oneofs_by_name['per_xds_config'].fields.append(
  _PERXDSCONFIG.fields_by_name['cluster_config'])
_PERXDSCONFIG.fields_by_name['cluster_config'].containing_oneof = _PERXDSCONFIG.oneofs_by_name['per_xds_config']
_PERXDSCONFIG.oneofs_by_name['per_xds_config'].fields.append(
  _PERXDSCONFIG.fields_by_name['route_config'])
_PERXDSCONFIG.fields_by_name['route_config'].containing_oneof = _PERXDSCONFIG.oneofs_by_name['per_xds_config']
_PERXDSCONFIG.oneofs_by_name['per_xds_config'].fields.append(
  _PERXDSCONFIG.fields_by_name['scoped_route_config'])
_PERXDSCONFIG.fields_by_name['scoped_route_config'].containing_oneof = _PERXDSCONFIG.oneofs_by_name['per_xds_config']
_PERXDSCONFIG.oneofs_by_name['per_xds_config'].fields.append(
  _PERXDSCONFIG.fields_by_name['endpoint_config'])
_PERXDSCONFIG.fields_by_name['endpoint_config'].containing_oneof = _PERXDSCONFIG.oneofs_by_name['per_xds_config']
_CLIENTCONFIG.fields_by_name['node'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._NODE
_CLIENTCONFIG.fields_by_name['xds_config'].message_type = _PERXDSCONFIG
_CLIENTSTATUSRESPONSE.fields_by_name['config'].message_type = _CLIENTCONFIG
DESCRIPTOR.message_types_by_name['ClientStatusRequest'] = _CLIENTSTATUSREQUEST
DESCRIPTOR.message_types_by_name['PerXdsConfig'] = _PERXDSCONFIG
DESCRIPTOR.message_types_by_name['ClientConfig'] = _CLIENTCONFIG
DESCRIPTOR.message_types_by_name['ClientStatusResponse'] = _CLIENTSTATUSRESPONSE
DESCRIPTOR.enum_types_by_name['ConfigStatus'] = _CONFIGSTATUS
DESCRIPTOR.enum_types_by_name['ClientConfigStatus'] = _CLIENTCONFIGSTATUS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ClientStatusRequest = _reflection.GeneratedProtocolMessageType('ClientStatusRequest', (_message.Message,), {
  'DESCRIPTOR' : _CLIENTSTATUSREQUEST,
  '__module__' : 'envoy.service.status.v3.csds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.status.v3.ClientStatusRequest)
  })
_sym_db.RegisterMessage(ClientStatusRequest)

PerXdsConfig = _reflection.GeneratedProtocolMessageType('PerXdsConfig', (_message.Message,), {
  'DESCRIPTOR' : _PERXDSCONFIG,
  '__module__' : 'envoy.service.status.v3.csds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.status.v3.PerXdsConfig)
  })
_sym_db.RegisterMessage(PerXdsConfig)

ClientConfig = _reflection.GeneratedProtocolMessageType('ClientConfig', (_message.Message,), {
  'DESCRIPTOR' : _CLIENTCONFIG,
  '__module__' : 'envoy.service.status.v3.csds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.status.v3.ClientConfig)
  })
_sym_db.RegisterMessage(ClientConfig)

ClientStatusResponse = _reflection.GeneratedProtocolMessageType('ClientStatusResponse', (_message.Message,), {
  'DESCRIPTOR' : _CLIENTSTATUSRESPONSE,
  '__module__' : 'envoy.service.status.v3.csds_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.status.v3.ClientStatusResponse)
  })
_sym_db.RegisterMessage(ClientStatusResponse)


DESCRIPTOR._options = None
_CLIENTSTATUSREQUEST._options = None
_PERXDSCONFIG.fields_by_name['status']._options = None
_PERXDSCONFIG.fields_by_name['client_status']._options = None
_PERXDSCONFIG._options = None
_CLIENTCONFIG._options = None
_CLIENTSTATUSRESPONSE._options = None

_CLIENTSTATUSDISCOVERYSERVICE = _descriptor.ServiceDescriptor(
  name='ClientStatusDiscoveryService',
  full_name='envoy.service.status.v3.ClientStatusDiscoveryService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1542,
  serialized_end=1854,
  methods=[
  _descriptor.MethodDescriptor(
    name='StreamClientStatus',
    full_name='envoy.service.status.v3.ClientStatusDiscoveryService.StreamClientStatus',
    index=0,
    containing_service=None,
    input_type=_CLIENTSTATUSREQUEST,
    output_type=_CLIENTSTATUSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='FetchClientStatus',
    full_name='envoy.service.status.v3.ClientStatusDiscoveryService.FetchClientStatus',
    index=1,
    containing_service=None,
    input_type=_CLIENTSTATUSREQUEST,
    output_type=_CLIENTSTATUSRESPONSE,
    serialized_options=b'\202\323\344\223\002\035\"\033/v3/discovery:client_status\202\323\344\223\002\003:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CLIENTSTATUSDISCOVERYSERVICE)

DESCRIPTOR.services_by_name['ClientStatusDiscoveryService'] = _CLIENTSTATUSDISCOVERYSERVICE

# @@protoc_insertion_point(module_scope)
