# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/video_classification.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/prediction/video_classification.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.prediction',
  syntax='proto3',
  serialized_options=b'\n=com.google.cloud.aiplatform.v1beta1.schema.predict.predictionB(VideoClassificationPredictionResultProtoP\001Zcgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/prediction;prediction',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nTgoogle/cloud/aiplatform/v1beta1/schema/predict/prediction/video_classification.proto\x12\x39google.cloud.aiplatform.v1beta1.schema.predict.prediction\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xf2\x01\n#VideoClassificationPredictionResult\x12\n\n\x02id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x0c\n\x04type\x18\x03 \x01(\t\x12\x35\n\x12time_segment_start\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x33\n\x10time_segment_end\x18\x05 \x01(\x0b\x32\x19.google.protobuf.Duration\x12/\n\nconfidence\x18\x06 \x01(\x0b\x32\x1b.google.protobuf.FloatValueB\xd0\x01\n=com.google.cloud.aiplatform.v1beta1.schema.predict.predictionB(VideoClassificationPredictionResultProtoP\x01Zcgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/prediction;predictionb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_VIDEOCLASSIFICATIONPREDICTIONRESULT = _descriptor.Descriptor(
  name='VideoClassificationPredictionResult',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult.type', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='time_segment_start', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult.time_segment_start', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='time_segment_end', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult.time_segment_end', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='confidence', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult.confidence', index=5,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_start=242,
  serialized_end=484,
)

_VIDEOCLASSIFICATIONPREDICTIONRESULT.fields_by_name['time_segment_start'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_VIDEOCLASSIFICATIONPREDICTIONRESULT.fields_by_name['time_segment_end'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_VIDEOCLASSIFICATIONPREDICTIONRESULT.fields_by_name['confidence'].message_type = google_dot_protobuf_dot_wrappers__pb2._FLOATVALUE
DESCRIPTOR.message_types_by_name['VideoClassificationPredictionResult'] = _VIDEOCLASSIFICATIONPREDICTIONRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

VideoClassificationPredictionResult = _reflection.GeneratedProtocolMessageType('VideoClassificationPredictionResult', (_message.Message,), {
  'DESCRIPTOR' : _VIDEOCLASSIFICATIONPREDICTIONRESULT,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.prediction.video_classification_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.VideoClassificationPredictionResult)
  })
_sym_db.RegisterMessage(VideoClassificationPredictionResult)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
