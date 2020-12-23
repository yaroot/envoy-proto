# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/annotation_spec_color.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.type import color_pb2 as google_dot_type_dot_color__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/annotation_spec_color.proto',
  package='google.cloud.aiplatform.v1beta1.schema',
  syntax='proto3',
  serialized_options=b'\n*com.google.cloud.aiplatform.v1beta1.schemaB\030AnnotationSpecColorProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schema',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/cloud/aiplatform/v1beta1/schema/annotation_spec_color.proto\x12&google.cloud.aiplatform.v1beta1.schema\x1a\x17google/type/color.proto\x1a\x1cgoogle/api/annotations.proto\"Z\n\x13\x41nnotationSpecColor\x12!\n\x05\x63olor\x18\x01 \x01(\x0b\x32\x12.google.type.Color\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\n\n\x02id\x18\x03 \x01(\tB\x96\x01\n*com.google.cloud.aiplatform.v1beta1.schemaB\x18\x41nnotationSpecColorProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schemab\x06proto3'
  ,
  dependencies=[google_dot_type_dot_color__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ANNOTATIONSPECCOLOR = _descriptor.Descriptor(
  name='AnnotationSpecColor',
  full_name='google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='color', full_name='google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.color', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor.id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=165,
  serialized_end=255,
)

_ANNOTATIONSPECCOLOR.fields_by_name['color'].message_type = google_dot_type_dot_color__pb2._COLOR
DESCRIPTOR.message_types_by_name['AnnotationSpecColor'] = _ANNOTATIONSPECCOLOR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AnnotationSpecColor = _reflection.GeneratedProtocolMessageType('AnnotationSpecColor', (_message.Message,), {
  'DESCRIPTOR' : _ANNOTATIONSPECCOLOR,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.annotation_spec_color_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor)
  })
_sym_db.RegisterMessage(AnnotationSpecColor)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)