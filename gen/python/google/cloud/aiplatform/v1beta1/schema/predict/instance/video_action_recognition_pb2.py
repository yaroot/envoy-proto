# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.instance',
  syntax='proto3',
  serialized_options=b'\n;com.google.cloud.aiplatform.v1beta1.schema.predict.instanceB-VideoActionRecognitionPredictionInstanceProtoP\001Z_google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/instance;instance',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nVgoogle/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto\x12\x37google.cloud.aiplatform.v1beta1.schema.predict.instance\x1a\x1cgoogle/api/annotations.proto\"\x84\x01\n(VideoActionRecognitionPredictionInstance\x12\x0f\n\x07\x63ontent\x18\x01 \x01(\t\x12\x11\n\tmime_type\x18\x02 \x01(\t\x12\x1a\n\x12time_segment_start\x18\x03 \x01(\t\x12\x18\n\x10time_segment_end\x18\x04 \x01(\tB\xcf\x01\n;com.google.cloud.aiplatform.v1beta1.schema.predict.instanceB-VideoActionRecognitionPredictionInstanceProtoP\x01Z_google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/instance;instanceb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_VIDEOACTIONRECOGNITIONPREDICTIONINSTANCE = _descriptor.Descriptor(
  name='VideoActionRecognitionPredictionInstance',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='content', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance.content', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mime_type', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance.mime_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='time_segment_start', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance.time_segment_start', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='time_segment_end', full_name='google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance.time_segment_end', index=3,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_start=178,
  serialized_end=310,
)

DESCRIPTOR.message_types_by_name['VideoActionRecognitionPredictionInstance'] = _VIDEOACTIONRECOGNITIONPREDICTIONINSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

VideoActionRecognitionPredictionInstance = _reflection.GeneratedProtocolMessageType('VideoActionRecognitionPredictionInstance', (_message.Message,), {
  'DESCRIPTOR' : _VIDEOACTIONRECOGNITIONPREDICTIONINSTANCE,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.instance.video_action_recognition_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.instance.VideoActionRecognitionPredictionInstance)
  })
_sym_db.RegisterMessage(VideoActionRecognitionPredictionInstance)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
