# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/geometry.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/geometry.proto',
  package='google.cloud.aiplatform.v1beta1.schema',
  syntax='proto3',
  serialized_options=b'\n*com.google.cloud.aiplatform.v1beta1.schemaB\rGeometryProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schema',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/cloud/aiplatform/v1beta1/schema/geometry.proto\x12&google.cloud.aiplatform.v1beta1.schema\x1a\x1cgoogle/api/annotations.proto\"\x1e\n\x06Vertex\x12\t\n\x01x\x18\x01 \x01(\x01\x12\t\n\x01y\x18\x02 \x01(\x01\x42\x8b\x01\n*com.google.cloud.aiplatform.v1beta1.schemaB\rGeometryProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schemab\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_VERTEX = _descriptor.Descriptor(
  name='Vertex',
  full_name='google.cloud.aiplatform.v1beta1.schema.Vertex',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='x', full_name='google.cloud.aiplatform.v1beta1.schema.Vertex.x', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='y', full_name='google.cloud.aiplatform.v1beta1.schema.Vertex.y', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=127,
  serialized_end=157,
)

DESCRIPTOR.message_types_by_name['Vertex'] = _VERTEX
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Vertex = _reflection.GeneratedProtocolMessageType('Vertex', (_message.Message,), {
  'DESCRIPTOR' : _VERTEX,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.geometry_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.Vertex)
  })
_sym_db.RegisterMessage(Vertex)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
