# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/api/v2/core/backoff.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/api/v2/core/backoff.proto',
  package='envoy.api.v2.core',
  syntax='proto3',
  serialized_options=b'\n\037io.envoyproxy.envoy.api.v2.coreB\014BackoffProtoP\001\362\230\376\217\005\026\022\024envoy.config.core.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1f\x65nvoy/api/v2/core/backoff.proto\x12\x11\x65nvoy.api.v2.core\x1a\x1egoogle/protobuf/duration.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\x8e\x01\n\x0f\x42\x61\x63koffStrategy\x12@\n\rbase_interval\x18\x01 \x01(\x0b\x32\x19.google.protobuf.DurationB\x0e\xfa\x42\x0b\xaa\x01\x08\x08\x01\x32\x04\x10\xc0\x84=\x12\x39\n\x0cmax_interval\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00\x42U\n\x1fio.envoyproxy.envoy.api.v2.coreB\x0c\x42\x61\x63koffProtoP\x01\xf2\x98\xfe\x8f\x05\x16\x12\x14\x65nvoy.config.core.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_BACKOFFSTRATEGY = _descriptor.Descriptor(
  name='BackoffStrategy',
  full_name='envoy.api.v2.core.BackoffStrategy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='base_interval', full_name='envoy.api.v2.core.BackoffStrategy.base_interval', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\013\252\001\010\010\0012\004\020\300\204=', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_interval', full_name='envoy.api.v2.core.BackoffStrategy.max_interval', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\252\001\002*\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=317,
)

_BACKOFFSTRATEGY.fields_by_name['base_interval'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_BACKOFFSTRATEGY.fields_by_name['max_interval'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
DESCRIPTOR.message_types_by_name['BackoffStrategy'] = _BACKOFFSTRATEGY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BackoffStrategy = _reflection.GeneratedProtocolMessageType('BackoffStrategy', (_message.Message,), {
  'DESCRIPTOR' : _BACKOFFSTRATEGY,
  '__module__' : 'envoy.api.v2.core.backoff_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.core.BackoffStrategy)
  })
_sym_db.RegisterMessage(BackoffStrategy)


DESCRIPTOR._options = None
_BACKOFFSTRATEGY.fields_by_name['base_interval']._options = None
_BACKOFFSTRATEGY.fields_by_name['max_interval']._options = None
# @@protoc_insertion_point(module_scope)
