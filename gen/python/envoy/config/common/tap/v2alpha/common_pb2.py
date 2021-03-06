# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/common/tap/v2alpha/common.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.service.tap.v2alpha import common_pb2 as envoy_dot_service_dot_tap_dot_v2alpha_dot_common__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/common/tap/v2alpha/common.proto',
  package='envoy.config.common.tap.v2alpha',
  syntax='proto3',
  serialized_options=b'\n-io.envoyproxy.envoy.config.common.tap.v2alphaB\013CommonProtoP\001\362\230\376\217\005 \022\036envoy.extensions.common.tap.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,envoy/config/common/tap/v2alpha/common.proto\x12\x1f\x65nvoy.config.common.tap.v2alpha\x1a&envoy/service/tap/v2alpha/common.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xb0\x01\n\x15\x43ommonExtensionConfig\x12\x44\n\x0c\x61\x64min_config\x18\x01 \x01(\x0b\x32,.envoy.config.common.tap.v2alpha.AdminConfigH\x00\x12=\n\rstatic_config\x18\x02 \x01(\x0b\x32$.envoy.service.tap.v2alpha.TapConfigH\x00\x42\x12\n\x0b\x63onfig_type\x12\x03\xf8\x42\x01\")\n\x0b\x41\x64minConfig\x12\x1a\n\tconfig_id\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x42l\n-io.envoyproxy.envoy.config.common.tap.v2alphaB\x0b\x43ommonProtoP\x01\xf2\x98\xfe\x8f\x05 \x12\x1e\x65nvoy.extensions.common.tap.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_service_dot_tap_dot_v2alpha_dot_common__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_COMMONEXTENSIONCONFIG = _descriptor.Descriptor(
  name='CommonExtensionConfig',
  full_name='envoy.config.common.tap.v2alpha.CommonExtensionConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='admin_config', full_name='envoy.config.common.tap.v2alpha.CommonExtensionConfig.admin_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='static_config', full_name='envoy.config.common.tap.v2alpha.CommonExtensionConfig.static_config', index=1,
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
    _descriptor.OneofDescriptor(
      name='config_type', full_name='envoy.config.common.tap.v2alpha.CommonExtensionConfig.config_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=210,
  serialized_end=386,
)


_ADMINCONFIG = _descriptor.Descriptor(
  name='AdminConfig',
  full_name='envoy.config.common.tap.v2alpha.AdminConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config_id', full_name='envoy.config.common.tap.v2alpha.AdminConfig.config_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=388,
  serialized_end=429,
)

_COMMONEXTENSIONCONFIG.fields_by_name['admin_config'].message_type = _ADMINCONFIG
_COMMONEXTENSIONCONFIG.fields_by_name['static_config'].message_type = envoy_dot_service_dot_tap_dot_v2alpha_dot_common__pb2._TAPCONFIG
_COMMONEXTENSIONCONFIG.oneofs_by_name['config_type'].fields.append(
  _COMMONEXTENSIONCONFIG.fields_by_name['admin_config'])
_COMMONEXTENSIONCONFIG.fields_by_name['admin_config'].containing_oneof = _COMMONEXTENSIONCONFIG.oneofs_by_name['config_type']
_COMMONEXTENSIONCONFIG.oneofs_by_name['config_type'].fields.append(
  _COMMONEXTENSIONCONFIG.fields_by_name['static_config'])
_COMMONEXTENSIONCONFIG.fields_by_name['static_config'].containing_oneof = _COMMONEXTENSIONCONFIG.oneofs_by_name['config_type']
DESCRIPTOR.message_types_by_name['CommonExtensionConfig'] = _COMMONEXTENSIONCONFIG
DESCRIPTOR.message_types_by_name['AdminConfig'] = _ADMINCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CommonExtensionConfig = _reflection.GeneratedProtocolMessageType('CommonExtensionConfig', (_message.Message,), {
  'DESCRIPTOR' : _COMMONEXTENSIONCONFIG,
  '__module__' : 'envoy.config.common.tap.v2alpha.common_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.common.tap.v2alpha.CommonExtensionConfig)
  })
_sym_db.RegisterMessage(CommonExtensionConfig)

AdminConfig = _reflection.GeneratedProtocolMessageType('AdminConfig', (_message.Message,), {
  'DESCRIPTOR' : _ADMINCONFIG,
  '__module__' : 'envoy.config.common.tap.v2alpha.common_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.common.tap.v2alpha.AdminConfig)
  })
_sym_db.RegisterMessage(AdminConfig)


DESCRIPTOR._options = None
_COMMONEXTENSIONCONFIG.oneofs_by_name['config_type']._options = None
_ADMINCONFIG.fields_by_name['config_id']._options = None
# @@protoc_insertion_point(module_scope)
