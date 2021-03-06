# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/tracers/skywalking/v4alpha/skywalking.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import grpc_service_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import sensitive_pb2 as udpa_dot_annotations_dot_sensitive__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/tracers/skywalking/v4alpha/skywalking.proto',
  package='envoy.extensions.tracers.skywalking.v4alpha',
  syntax='proto3',
  serialized_options=b'\n9io.envoyproxy.envoy.extensions.tracers.skywalking.v4alphaB\017SkywalkingProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<envoy/extensions/tracers/skywalking/v4alpha/skywalking.proto\x12+envoy.extensions.tracers.skywalking.v4alpha\x1a,envoy/config/core/v4alpha/grpc_service.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a udpa/annotations/sensitive.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xdb\x01\n\x10SkyWalkingConfig\x12\x46\n\x0cgrpc_service\x18\x01 \x01(\x0b\x32&.envoy.config.core.v4alpha.GrpcServiceB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12P\n\rclient_config\x18\x02 \x01(\x0b\x32\x39.envoy.extensions.tracers.skywalking.v4alpha.ClientConfig:-\x9a\xc5\x88\x1e(\n&envoy.config.trace.v3.SkyWalkingConfig\"\xd8\x01\n\x0c\x43lientConfig\x12\x14\n\x0cservice_name\x18\x01 \x01(\t\x12\x15\n\rinstance_name\x18\x02 \x01(\t\x12\x1f\n\rbackend_token\x18\x03 \x01(\tB\x06\xb8\xb7\x8b\xa4\x02\x01H\x00\x12\x34\n\x0emax_cache_size\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value:)\x9a\xc5\x88\x1e$\n\"envoy.config.trace.v3.ClientConfigB\x19\n\x17\x62\x61\x63kend_token_specifierBV\n9io.envoyproxy.envoy.extensions.tracers.skywalking.v4alphaB\x0fSkywalkingProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_sensitive__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_SKYWALKINGCONFIG = _descriptor.Descriptor(
  name='SkyWalkingConfig',
  full_name='envoy.extensions.tracers.skywalking.v4alpha.SkyWalkingConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='grpc_service', full_name='envoy.extensions.tracers.skywalking.v4alpha.SkyWalkingConfig.grpc_service', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='client_config', full_name='envoy.extensions.tracers.skywalking.v4alpha.SkyWalkingConfig.client_config', index=1,
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
  serialized_options=b'\232\305\210\036(\n&envoy.config.trace.v3.SkyWalkingConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=313,
  serialized_end=532,
)


_CLIENTCONFIG = _descriptor.Descriptor(
  name='ClientConfig',
  full_name='envoy.extensions.tracers.skywalking.v4alpha.ClientConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='service_name', full_name='envoy.extensions.tracers.skywalking.v4alpha.ClientConfig.service_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_name', full_name='envoy.extensions.tracers.skywalking.v4alpha.ClientConfig.instance_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='backend_token', full_name='envoy.extensions.tracers.skywalking.v4alpha.ClientConfig.backend_token', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\270\267\213\244\002\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_cache_size', full_name='envoy.extensions.tracers.skywalking.v4alpha.ClientConfig.max_cache_size', index=3,
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
  serialized_options=b'\232\305\210\036$\n\"envoy.config.trace.v3.ClientConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='backend_token_specifier', full_name='envoy.extensions.tracers.skywalking.v4alpha.ClientConfig.backend_token_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=535,
  serialized_end=751,
)

_SKYWALKINGCONFIG.fields_by_name['grpc_service'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2._GRPCSERVICE
_SKYWALKINGCONFIG.fields_by_name['client_config'].message_type = _CLIENTCONFIG
_CLIENTCONFIG.fields_by_name['max_cache_size'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT32VALUE
_CLIENTCONFIG.oneofs_by_name['backend_token_specifier'].fields.append(
  _CLIENTCONFIG.fields_by_name['backend_token'])
_CLIENTCONFIG.fields_by_name['backend_token'].containing_oneof = _CLIENTCONFIG.oneofs_by_name['backend_token_specifier']
DESCRIPTOR.message_types_by_name['SkyWalkingConfig'] = _SKYWALKINGCONFIG
DESCRIPTOR.message_types_by_name['ClientConfig'] = _CLIENTCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SkyWalkingConfig = _reflection.GeneratedProtocolMessageType('SkyWalkingConfig', (_message.Message,), {
  'DESCRIPTOR' : _SKYWALKINGCONFIG,
  '__module__' : 'envoy.extensions.tracers.skywalking.v4alpha.skywalking_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.tracers.skywalking.v4alpha.SkyWalkingConfig)
  })
_sym_db.RegisterMessage(SkyWalkingConfig)

ClientConfig = _reflection.GeneratedProtocolMessageType('ClientConfig', (_message.Message,), {
  'DESCRIPTOR' : _CLIENTCONFIG,
  '__module__' : 'envoy.extensions.tracers.skywalking.v4alpha.skywalking_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.tracers.skywalking.v4alpha.ClientConfig)
  })
_sym_db.RegisterMessage(ClientConfig)


DESCRIPTOR._options = None
_SKYWALKINGCONFIG.fields_by_name['grpc_service']._options = None
_SKYWALKINGCONFIG._options = None
_CLIENTCONFIG.fields_by_name['backend_token']._options = None
_CLIENTCONFIG._options = None
# @@protoc_insertion_point(module_scope)
