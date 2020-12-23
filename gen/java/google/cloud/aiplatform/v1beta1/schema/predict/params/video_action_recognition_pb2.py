# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/params/video_action_recognition.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/params/video_action_recognition.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.params',
  syntax='proto3',
  serialized_options=b'\n9com.google.cloud.aiplatform.v1beta1.schema.predict.paramsB+VideoActionRecognitionPredictionParamsProtoP\001Z[google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/params;params',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nTgoogle/cloud/aiplatform/v1beta1/schema/predict/params/video_action_recognition.proto\x12\x35google.cloud.aiplatform.v1beta1.schema.predict.params\x1a\x1cgoogle/api/annotations.proto\"_\n&VideoActionRecognitionPredictionParams\x12\x1c\n\x14\x63onfidence_threshold\x18\x01 \x01(\x02\x12\x17\n\x0fmax_predictions\x18\x02 \x01(\x05\x42\xc7\x01\n9com.google.cloud.aiplatform.v1beta1.schema.predict.paramsB+VideoActionRecognitionPredictionParamsProtoP\x01Z[google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/params;paramsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_VIDEOACTIONRECOGNITIONPREDICTIONPARAMS = _descriptor.Descriptor(
  name='VideoActionRecognitionPredictionParams',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.params.VideoActionRecognitionPredictionParams',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='confidence_threshold', full_name='google.cloud.aiplatform.v1beta1.schema.predict.params.VideoActionRecognitionPredictionParams.confidence_threshold', index=0,
      number=1, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_predictions', full_name='google.cloud.aiplatform.v1beta1.schema.predict.params.VideoActionRecognitionPredictionParams.max_predictions', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=173,
  serialized_end=268,
)

DESCRIPTOR.message_types_by_name['VideoActionRecognitionPredictionParams'] = _VIDEOACTIONRECOGNITIONPREDICTIONPARAMS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

VideoActionRecognitionPredictionParams = _reflection.GeneratedProtocolMessageType('VideoActionRecognitionPredictionParams', (_message.Message,), {
  'DESCRIPTOR' : _VIDEOACTIONRECOGNITIONPREDICTIONPARAMS,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.params.video_action_recognition_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.params.VideoActionRecognitionPredictionParams)
  })
_sym_db.RegisterMessage(VideoActionRecognitionPredictionParams)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
