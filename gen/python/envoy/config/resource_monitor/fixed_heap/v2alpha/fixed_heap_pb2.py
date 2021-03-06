# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/resource_monitor/fixed_heap/v2alpha/fixed_heap.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/resource_monitor/fixed_heap/v2alpha/fixed_heap.proto',
  package='envoy.config.resource_monitor.fixed_heap.v2alpha',
  syntax='proto3',
  serialized_options=b'\n>io.envoyproxy.envoy.config.resource_monitor.fixed_heap.v2alphaB\016FixedHeapProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nAenvoy/config/resource_monitor/fixed_heap/v2alpha/fixed_heap.proto\x12\x30\x65nvoy.config.resource_monitor.fixed_heap.v2alpha\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"7\n\x0f\x46ixedHeapConfig\x12$\n\x13max_heap_size_bytes\x18\x01 \x01(\x04\x42\x07\xfa\x42\x04\x32\x02 \x00\x42Z\n>io.envoyproxy.envoy.config.resource_monitor.fixed_heap.v2alphaB\x0e\x46ixedHeapProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_FIXEDHEAPCONFIG = _descriptor.Descriptor(
  name='FixedHeapConfig',
  full_name='envoy.config.resource_monitor.fixed_heap.v2alpha.FixedHeapConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='max_heap_size_bytes', full_name='envoy.config.resource_monitor.fixed_heap.v2alpha.FixedHeapConfig.max_heap_size_bytes', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\0042\002 \000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=230,
)

DESCRIPTOR.message_types_by_name['FixedHeapConfig'] = _FIXEDHEAPCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FixedHeapConfig = _reflection.GeneratedProtocolMessageType('FixedHeapConfig', (_message.Message,), {
  'DESCRIPTOR' : _FIXEDHEAPCONFIG,
  '__module__' : 'envoy.config.resource_monitor.fixed_heap.v2alpha.fixed_heap_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.resource_monitor.fixed_heap.v2alpha.FixedHeapConfig)
  })
_sym_db.RegisterMessage(FixedHeapConfig)


DESCRIPTOR._options = None
_FIXEDHEAPCONFIG.fields_by_name['max_heap_size_bytes']._options = None
# @@protoc_insertion_point(module_scope)
