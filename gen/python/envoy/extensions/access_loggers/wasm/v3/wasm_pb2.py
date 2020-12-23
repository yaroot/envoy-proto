# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/access_loggers/wasm/v3/wasm.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.extensions.wasm.v3 import wasm_pb2 as envoy_dot_extensions_dot_wasm_dot_v3_dot_wasm__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/access_loggers/wasm/v3/wasm.proto',
  package='envoy.extensions.access_loggers.wasm.v3',
  syntax='proto3',
  serialized_options=b'\n5io.envoyproxy.envoy.extensions.access_loggers.wasm.v3B\tWasmProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2envoy/extensions/access_loggers/wasm/v3/wasm.proto\x12\'envoy.extensions.access_loggers.wasm.v3\x1a#envoy/extensions/wasm/v3/wasm.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"G\n\rWasmAccessLog\x12\x36\n\x06\x63onfig\x18\x01 \x01(\x0b\x32&.envoy.extensions.wasm.v3.PluginConfigBL\n5io.envoyproxy.envoy.extensions.access_loggers.wasm.v3B\tWasmProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_extensions_dot_wasm_dot_v3_dot_wasm__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_WASMACCESSLOG = _descriptor.Descriptor(
  name='WasmAccessLog',
  full_name='envoy.extensions.access_loggers.wasm.v3.WasmAccessLog',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config', full_name='envoy.extensions.access_loggers.wasm.v3.WasmAccessLog.config', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=198,
  serialized_end=269,
)

_WASMACCESSLOG.fields_by_name['config'].message_type = envoy_dot_extensions_dot_wasm_dot_v3_dot_wasm__pb2._PLUGINCONFIG
DESCRIPTOR.message_types_by_name['WasmAccessLog'] = _WASMACCESSLOG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

WasmAccessLog = _reflection.GeneratedProtocolMessageType('WasmAccessLog', (_message.Message,), {
  'DESCRIPTOR' : _WASMACCESSLOG,
  '__module__' : 'envoy.extensions.access_loggers.wasm.v3.wasm_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.access_loggers.wasm.v3.WasmAccessLog)
  })
_sym_db.RegisterMessage(WasmAccessLog)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
