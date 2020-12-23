# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/instance/text_classification.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/instance/text_classification.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.instance',
  syntax='proto3',
  serialized_options=b'\n;com.google.cloud.aiplatform.v1beta1.schema.predict.instanceB)TextClassificationPredictionInstanceProtoP\001Z_google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/instance;instance',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nQgoogle/cloud/aiplatform/v1beta1/schema/predict/instance/text_classification.proto\x12\x37google.cloud.aiplatform.v1beta1.schema.predict.instance\x1a\x1cgoogle/api/annotations.proto\"J\n$TextClassificationPredictionInstance\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\t\x12\x11\n\tmime_type\x18\x02 \x01(\tB\xcb\x01\n;com.google.cloud.aiplatform.v1beta1.schema.predict.instanceB)TextClassificationPredictionInstanceProtoP\x01Z_google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/instance;instanceb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TEXTCLASSIFICATIONPREDICTIONINSTANCE = _descriptor.Descriptor(
  name='TextClassificationPredictionInstance',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextClassificationPredictionInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='content', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextClassificationPredictionInstance.content', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mime_type', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextClassificationPredictionInstance.mime_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=172,
  serialized_end=246,
)

DESCRIPTOR.message_types_by_name['TextClassificationPredictionInstance'] = _TEXTCLASSIFICATIONPREDICTIONINSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TextClassificationPredictionInstance = _reflection.GeneratedProtocolMessageType('TextClassificationPredictionInstance', (_message.Message,), {
  'DESCRIPTOR' : _TEXTCLASSIFICATIONPREDICTIONINSTANCE,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.instance.text_classification_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.instance.TextClassificationPredictionInstance)
  })
_sym_db.RegisterMessage(TextClassificationPredictionInstance)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
