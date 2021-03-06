# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/composite/v3/composite.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import extension_pb2 as envoy_dot_config_dot_core_dot_v3_dot_extension__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/http/composite/v3/composite.proto',
  package='envoy.extensions.filters.http.composite.v3',
  syntax='proto3',
  serialized_options=b'\n8io.envoyproxy.envoy.extensions.filters.http.composite.v3B\016CompositeProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:envoy/extensions/filters/http/composite/v3/composite.proto\x12*envoy.extensions.filters.http.composite.v3\x1a$envoy/config/core/v3/extension.proto\x1a\x1dudpa/annotations/status.proto\"\x0b\n\tComposite\"W\n\x13\x45xecuteFilterAction\x12@\n\x0ctyped_config\x18\x01 \x01(\x0b\x32*.envoy.config.core.v3.TypedExtensionConfigBT\n8io.envoyproxy.envoy.extensions.filters.http.composite.v3B\x0e\x43ompositeProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_extension__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_COMPOSITE = _descriptor.Descriptor(
  name='Composite',
  full_name='envoy.extensions.filters.http.composite.v3.Composite',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=175,
  serialized_end=186,
)


_EXECUTEFILTERACTION = _descriptor.Descriptor(
  name='ExecuteFilterAction',
  full_name='envoy.extensions.filters.http.composite.v3.ExecuteFilterAction',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='typed_config', full_name='envoy.extensions.filters.http.composite.v3.ExecuteFilterAction.typed_config', index=0,
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
  serialized_start=188,
  serialized_end=275,
)

_EXECUTEFILTERACTION.fields_by_name['typed_config'].message_type = envoy_dot_config_dot_core_dot_v3_dot_extension__pb2._TYPEDEXTENSIONCONFIG
DESCRIPTOR.message_types_by_name['Composite'] = _COMPOSITE
DESCRIPTOR.message_types_by_name['ExecuteFilterAction'] = _EXECUTEFILTERACTION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Composite = _reflection.GeneratedProtocolMessageType('Composite', (_message.Message,), {
  'DESCRIPTOR' : _COMPOSITE,
  '__module__' : 'envoy.extensions.filters.http.composite.v3.composite_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.composite.v3.Composite)
  })
_sym_db.RegisterMessage(Composite)

ExecuteFilterAction = _reflection.GeneratedProtocolMessageType('ExecuteFilterAction', (_message.Message,), {
  'DESCRIPTOR' : _EXECUTEFILTERACTION,
  '__module__' : 'envoy.extensions.filters.http.composite.v3.composite_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.composite.v3.ExecuteFilterAction)
  })
_sym_db.RegisterMessage(ExecuteFilterAction)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
