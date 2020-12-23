# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/instance/text_extraction.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/instance/text_extraction.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.instance',
  syntax='proto3',
  serialized_options=b'\n;com.google.cloud.aiplatform.v1beta1.schema.predict.instanceB%TextExtractionPredictionInstanceProtoP\001Z_google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/instance;instance',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nMgoogle/cloud/aiplatform/v1beta1/schema/predict/instance/text_extraction.proto\x12\x37google.cloud.aiplatform.v1beta1.schema.predict.instance\x1a\x1cgoogle/api/annotations.proto\"S\n TextExtractionPredictionInstance\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\t\x12\x11\n\tmime_type\x18\x02 \x01(\t\x12\x0b\n\x03key\x18\x03 \x01(\tB\xc7\x01\n;com.google.cloud.aiplatform.v1beta1.schema.predict.instanceB%TextExtractionPredictionInstanceProtoP\x01Z_google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/instance;instanceb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TEXTEXTRACTIONPREDICTIONINSTANCE = _descriptor.Descriptor(
  name='TextExtractionPredictionInstance',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextExtractionPredictionInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='content', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextExtractionPredictionInstance.content', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mime_type', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextExtractionPredictionInstance.mime_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.TextExtractionPredictionInstance.key', index=2,
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
  serialized_start=168,
  serialized_end=251,
)

DESCRIPTOR.message_types_by_name['TextExtractionPredictionInstance'] = _TEXTEXTRACTIONPREDICTIONINSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TextExtractionPredictionInstance = _reflection.GeneratedProtocolMessageType('TextExtractionPredictionInstance', (_message.Message,), {
  'DESCRIPTOR' : _TEXTEXTRACTIONPREDICTIONINSTANCE,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.instance.text_extraction_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.instance.TextExtractionPredictionInstance)
  })
_sym_db.RegisterMessage(TextExtractionPredictionInstance)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
