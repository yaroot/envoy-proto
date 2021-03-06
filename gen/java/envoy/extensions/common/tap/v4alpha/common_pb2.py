# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/common/tap/v4alpha/common.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.tap.v4alpha import common_pb2 as envoy_dot_config_dot_tap_dot_v4alpha_dot_common__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/common/tap/v4alpha/common.proto',
  package='envoy.extensions.common.tap.v4alpha',
  syntax='proto3',
  serialized_options=b'\n1io.envoyproxy.envoy.extensions.common.tap.v4alphaB\013CommonProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0envoy/extensions/common/tap/v4alpha/common.proto\x12#envoy.extensions.common.tap.v4alpha\x1a%envoy/config/tap/v4alpha/common.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xf0\x01\n\x15\x43ommonExtensionConfig\x12H\n\x0c\x61\x64min_config\x18\x01 \x01(\x0b\x32\x30.envoy.extensions.common.tap.v4alpha.AdminConfigH\x00\x12<\n\rstatic_config\x18\x02 \x01(\x0b\x32#.envoy.config.tap.v4alpha.TapConfigH\x00:;\x9a\xc5\x88\x1e\x36\n4envoy.extensions.common.tap.v3.CommonExtensionConfigB\x12\n\x0b\x63onfig_type\x12\x03\xf8\x42\x01\"\\\n\x0b\x41\x64minConfig\x12\x1a\n\tconfig_id\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01:1\x9a\xc5\x88\x1e,\n*envoy.extensions.common.tap.v3.AdminConfigBJ\n1io.envoyproxy.envoy.extensions.common.tap.v4alphaB\x0b\x43ommonProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_tap_dot_v4alpha_dot_common__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_COMMONEXTENSIONCONFIG = _descriptor.Descriptor(
  name='CommonExtensionConfig',
  full_name='envoy.extensions.common.tap.v4alpha.CommonExtensionConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='admin_config', full_name='envoy.extensions.common.tap.v4alpha.CommonExtensionConfig.admin_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='static_config', full_name='envoy.extensions.common.tap.v4alpha.CommonExtensionConfig.static_config', index=1,
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
  serialized_options=b'\232\305\210\0366\n4envoy.extensions.common.tap.v3.CommonExtensionConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='config_type', full_name='envoy.extensions.common.tap.v4alpha.CommonExtensionConfig.config_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=220,
  serialized_end=460,
)


_ADMINCONFIG = _descriptor.Descriptor(
  name='AdminConfig',
  full_name='envoy.extensions.common.tap.v4alpha.AdminConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config_id', full_name='envoy.extensions.common.tap.v4alpha.AdminConfig.config_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036,\n*envoy.extensions.common.tap.v3.AdminConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=462,
  serialized_end=554,
)

_COMMONEXTENSIONCONFIG.fields_by_name['admin_config'].message_type = _ADMINCONFIG
_COMMONEXTENSIONCONFIG.fields_by_name['static_config'].message_type = envoy_dot_config_dot_tap_dot_v4alpha_dot_common__pb2._TAPCONFIG
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
  '__module__' : 'envoy.extensions.common.tap.v4alpha.common_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.common.tap.v4alpha.CommonExtensionConfig)
  })
_sym_db.RegisterMessage(CommonExtensionConfig)

AdminConfig = _reflection.GeneratedProtocolMessageType('AdminConfig', (_message.Message,), {
  'DESCRIPTOR' : _ADMINCONFIG,
  '__module__' : 'envoy.extensions.common.tap.v4alpha.common_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.common.tap.v4alpha.AdminConfig)
  })
_sym_db.RegisterMessage(AdminConfig)


DESCRIPTOR._options = None
_COMMONEXTENSIONCONFIG.oneofs_by_name['config_type']._options = None
_COMMONEXTENSIONCONFIG._options = None
_ADMINCONFIG.fields_by_name['config_id']._options = None
_ADMINCONFIG._options = None
# @@protoc_insertion_point(module_scope)
