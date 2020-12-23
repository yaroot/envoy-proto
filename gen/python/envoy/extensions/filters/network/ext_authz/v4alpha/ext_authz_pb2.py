# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/network/ext_authz/v4alpha/ext_authz.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import config_source_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_config__source__pb2
from envoy.config.core.v4alpha import grpc_service_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2
from envoy.type.matcher.v4alpha import metadata_pb2 as envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/network/ext_authz/v4alpha/ext_authz.proto',
  package='envoy.extensions.filters.network.ext_authz.v4alpha',
  syntax='proto3',
  serialized_options=b'\n@io.envoyproxy.envoy.extensions.filters.network.ext_authz.v4alphaB\rExtAuthzProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBenvoy/extensions/filters/network/ext_authz/v4alpha/ext_authz.proto\x12\x32\x65nvoy.extensions.filters.network.ext_authz.v4alpha\x1a-envoy/config/core/v4alpha/config_source.proto\x1a,envoy/config/core/v4alpha/grpc_service.proto\x1a)envoy/type/matcher/v4alpha/metadata.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\x81\x03\n\x08\x45xtAuthz\x12\x1c\n\x0bstat_prefix\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12<\n\x0cgrpc_service\x18\x02 \x01(\x0b\x32&.envoy.config.core.v4alpha.GrpcService\x12\x1a\n\x12\x66\x61ilure_mode_allow\x18\x03 \x01(\x08\x12 \n\x18include_peer_certificate\x18\x04 \x01(\x08\x12N\n\x15transport_api_version\x18\x05 \x01(\x0e\x32%.envoy.config.core.v4alpha.ApiVersionB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12L\n\x17\x66ilter_enabled_metadata\x18\x06 \x01(\x0b\x32+.envoy.type.matcher.v4alpha.MetadataMatcher:=\x9a\xc5\x88\x1e\x38\n6envoy.extensions.filters.network.ext_authz.v3.ExtAuthzB[\n@io.envoyproxy.envoy.extensions.filters.network.ext_authz.v4alphaB\rExtAuthzProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_config__source__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_EXTAUTHZ = _descriptor.Descriptor(
  name='ExtAuthz',
  full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='stat_prefix', full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz.stat_prefix', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='grpc_service', full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz.grpc_service', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='failure_mode_allow', full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz.failure_mode_allow', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='include_peer_certificate', full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz.include_peer_certificate', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transport_api_version', full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz.transport_api_version', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter_enabled_metadata', full_name='envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz.filter_enabled_metadata', index=5,
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
  serialized_options=b'\232\305\210\0368\n6envoy.extensions.filters.network.ext_authz.v3.ExtAuthz',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=350,
  serialized_end=735,
)

_EXTAUTHZ.fields_by_name['grpc_service'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2._GRPCSERVICE
_EXTAUTHZ.fields_by_name['transport_api_version'].enum_type = envoy_dot_config_dot_core_dot_v4alpha_dot_config__source__pb2._APIVERSION
_EXTAUTHZ.fields_by_name['filter_enabled_metadata'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2._METADATAMATCHER
DESCRIPTOR.message_types_by_name['ExtAuthz'] = _EXTAUTHZ
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ExtAuthz = _reflection.GeneratedProtocolMessageType('ExtAuthz', (_message.Message,), {
  'DESCRIPTOR' : _EXTAUTHZ,
  '__module__' : 'envoy.extensions.filters.network.ext_authz.v4alpha.ext_authz_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.ext_authz.v4alpha.ExtAuthz)
  })
_sym_db.RegisterMessage(ExtAuthz)


DESCRIPTOR._options = None
_EXTAUTHZ.fields_by_name['stat_prefix']._options = None
_EXTAUTHZ.fields_by_name['transport_api_version']._options = None
_EXTAUTHZ._options = None
# @@protoc_insertion_point(module_scope)