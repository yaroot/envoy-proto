# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/set_metadata/v3/set_metadata.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/http/set_metadata/v3/set_metadata.proto',
  package='envoy.extensions.filters.http.set_metadata.v3',
  syntax='proto3',
  serialized_options=b'\n;io.envoyproxy.envoy.extensions.filters.http.set_metadata.v3B\020SetMetadataProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@envoy/extensions/filters/http/set_metadata/v3/set_metadata.proto\x12-envoy.extensions.filters.http.set_metadata.v3\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"U\n\x06\x43onfig\x12#\n\x12metadata_namespace\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12&\n\x05value\x18\x02 \x01(\x0b\x32\x17.google.protobuf.StructBY\n;io.envoyproxy.envoy.extensions.filters.http.set_metadata.v3B\x10SetMetadataProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_CONFIG = _descriptor.Descriptor(
  name='Config',
  full_name='envoy.extensions.filters.http.set_metadata.v3.Config',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metadata_namespace', full_name='envoy.extensions.filters.http.set_metadata.v3.Config.metadata_namespace', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='envoy.extensions.filters.http.set_metadata.v3.Config.value', index=1,
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
  ],
  serialized_start=201,
  serialized_end=286,
)

_CONFIG.fields_by_name['value'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
DESCRIPTOR.message_types_by_name['Config'] = _CONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Config = _reflection.GeneratedProtocolMessageType('Config', (_message.Message,), {
  'DESCRIPTOR' : _CONFIG,
  '__module__' : 'envoy.extensions.filters.http.set_metadata.v3.set_metadata_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.set_metadata.v3.Config)
  })
_sym_db.RegisterMessage(Config)


DESCRIPTOR._options = None
_CONFIG.fields_by_name['metadata_namespace']._options = None
# @@protoc_insertion_point(module_scope)
