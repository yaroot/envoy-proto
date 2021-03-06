# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/trace/v2alpha/xray.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.api.v2.core import address_pb2 as envoy_dot_api_dot_v2_dot_core_dot_address__pb2
from envoy.api.v2.core import base_pb2 as envoy_dot_api_dot_v2_dot_core_dot_base__pb2
try:
  envoy_dot_api_dot_v2_dot_core_dot_socket__option__pb2 = envoy_dot_api_dot_v2_dot_core_dot_base__pb2.envoy_dot_api_dot_v2_dot_core_dot_socket__option__pb2
except AttributeError:
  envoy_dot_api_dot_v2_dot_core_dot_socket__option__pb2 = envoy_dot_api_dot_v2_dot_core_dot_base__pb2.envoy.api.v2.core.socket_option_pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/trace/v2alpha/xray.proto',
  package='envoy.config.trace.v2alpha',
  syntax='proto3',
  serialized_options=b'\n(io.envoyproxy.envoy.config.trace.v2alphaB\tXrayProtoP\001\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%envoy/config/trace/v2alpha/xray.proto\x12\x1a\x65nvoy.config.trace.v2alpha\x1a\x1f\x65nvoy/api/v2/core/address.proto\x1a\x1c\x65nvoy/api/v2/core/base.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xa5\x01\n\nXRayConfig\x12\x39\n\x0f\x64\x61\x65mon_endpoint\x18\x01 \x01(\x0b\x32 .envoy.api.v2.core.SocketAddress\x12\x1d\n\x0csegment_name\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12=\n\x16sampling_rule_manifest\x18\x03 \x01(\x0b\x32\x1d.envoy.api.v2.core.DataSourceB?\n(io.envoyproxy.envoy.config.trace.v2alphaB\tXrayProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_api_dot_v2_dot_core_dot_address__pb2.DESCRIPTOR,envoy_dot_api_dot_v2_dot_core_dot_base__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_XRAYCONFIG = _descriptor.Descriptor(
  name='XRayConfig',
  full_name='envoy.config.trace.v2alpha.XRayConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='daemon_endpoint', full_name='envoy.config.trace.v2alpha.XRayConfig.daemon_endpoint', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='segment_name', full_name='envoy.config.trace.v2alpha.XRayConfig.segment_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sampling_rule_manifest', full_name='envoy.config.trace.v2alpha.XRayConfig.sampling_rule_manifest', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=189,
  serialized_end=354,
)

_XRAYCONFIG.fields_by_name['daemon_endpoint'].message_type = envoy_dot_api_dot_v2_dot_core_dot_address__pb2._SOCKETADDRESS
_XRAYCONFIG.fields_by_name['sampling_rule_manifest'].message_type = envoy_dot_api_dot_v2_dot_core_dot_base__pb2._DATASOURCE
DESCRIPTOR.message_types_by_name['XRayConfig'] = _XRAYCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

XRayConfig = _reflection.GeneratedProtocolMessageType('XRayConfig', (_message.Message,), {
  'DESCRIPTOR' : _XRAYCONFIG,
  '__module__' : 'envoy.config.trace.v2alpha.xray_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.trace.v2alpha.XRayConfig)
  })
_sym_db.RegisterMessage(XRayConfig)


DESCRIPTOR._options = None
_XRAYCONFIG.fields_by_name['segment_name']._options = None
# @@protoc_insertion_point(module_scope)
