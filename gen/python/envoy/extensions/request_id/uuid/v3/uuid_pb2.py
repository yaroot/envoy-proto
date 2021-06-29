# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/request_id/uuid/v3/uuid.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/request_id/uuid/v3/uuid.proto',
  package='envoy.extensions.request_id.uuid.v3',
  syntax='proto3',
  serialized_options=b'\n1io.envoyproxy.envoy.extensions.request_id.uuid.v3B\tUuidProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.envoy/extensions/request_id/uuid/v3/uuid.proto\x12#envoy.extensions.request_id.uuid.v3\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\"L\n\x13UuidRequestIdConfig\x12\x35\n\x11pack_trace_reason\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.BoolValueBH\n1io.envoyproxy.envoy.extensions.request_id.uuid.v3B\tUuidProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,])




_UUIDREQUESTIDCONFIG = _descriptor.Descriptor(
  name='UuidRequestIdConfig',
  full_name='envoy.extensions.request_id.uuid.v3.UuidRequestIdConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='pack_trace_reason', full_name='envoy.extensions.request_id.uuid.v3.UuidRequestIdConfig.pack_trace_reason', index=0,
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
  serialized_start=150,
  serialized_end=226,
)

_UUIDREQUESTIDCONFIG.fields_by_name['pack_trace_reason'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
DESCRIPTOR.message_types_by_name['UuidRequestIdConfig'] = _UUIDREQUESTIDCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UuidRequestIdConfig = _reflection.GeneratedProtocolMessageType('UuidRequestIdConfig', (_message.Message,), {
  'DESCRIPTOR' : _UUIDREQUESTIDCONFIG,
  '__module__' : 'envoy.extensions.request_id.uuid.v3.uuid_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.request_id.uuid.v3.UuidRequestIdConfig)
  })
_sym_db.RegisterMessage(UuidRequestIdConfig)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)