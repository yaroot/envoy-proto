# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/api/v2/core/http_uri.proto
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
  name='envoy/api/v2/core/http_uri.proto',
  package='envoy.api.v2.core',
  syntax='proto3',
  serialized_options=b'\n\037io.envoyproxy.envoy.api.v2.coreB\014HttpUriProtoP\001\362\230\376\217\005\026\022\024envoy.config.core.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n envoy/api/v2/core/http_uri.proto\x12\x11\x65nvoy.api.v2.core\x1a\x1egoogle/protobuf/duration.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\x8e\x01\n\x07HttpUri\x12\x14\n\x03uri\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12\x1a\n\x07\x63luster\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02 \x01H\x00\x12\x36\n\x07timeout\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\n\xfa\x42\x07\xaa\x01\x04\x08\x01\x32\x00\x42\x19\n\x12http_upstream_type\x12\x03\xf8\x42\x01\x42U\n\x1fio.envoyproxy.envoy.api.v2.coreB\x0cHttpUriProtoP\x01\xf2\x98\xfe\x8f\x05\x16\x12\x14\x65nvoy.config.core.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_HTTPURI = _descriptor.Descriptor(
  name='HttpUri',
  full_name='envoy.api.v2.core.HttpUri',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='uri', full_name='envoy.api.v2.core.HttpUri.uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster', full_name='envoy.api.v2.core.HttpUri.cluster', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timeout', full_name='envoy.api.v2.core.HttpUri.timeout', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\007\252\001\004\010\0012\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='http_upstream_type', full_name='envoy.api.v2.core.HttpUri.http_upstream_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=176,
  serialized_end=318,
)

_HTTPURI.fields_by_name['timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_HTTPURI.oneofs_by_name['http_upstream_type'].fields.append(
  _HTTPURI.fields_by_name['cluster'])
_HTTPURI.fields_by_name['cluster'].containing_oneof = _HTTPURI.oneofs_by_name['http_upstream_type']
DESCRIPTOR.message_types_by_name['HttpUri'] = _HTTPURI
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

HttpUri = _reflection.GeneratedProtocolMessageType('HttpUri', (_message.Message,), {
  'DESCRIPTOR' : _HTTPURI,
  '__module__' : 'envoy.api.v2.core.http_uri_pb2'
  # @@protoc_insertion_point(class_scope:envoy.api.v2.core.HttpUri)
  })
_sym_db.RegisterMessage(HttpUri)


DESCRIPTOR._options = None
_HTTPURI.oneofs_by_name['http_upstream_type']._options = None
_HTTPURI.fields_by_name['uri']._options = None
_HTTPURI.fields_by_name['cluster']._options = None
_HTTPURI.fields_by_name['timeout']._options = None
# @@protoc_insertion_point(module_scope)
