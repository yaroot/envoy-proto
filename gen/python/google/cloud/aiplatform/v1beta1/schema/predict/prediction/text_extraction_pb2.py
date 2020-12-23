# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/text_extraction.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/prediction/text_extraction.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.prediction',
  syntax='proto3',
  serialized_options=b'\n=com.google.cloud.aiplatform.v1beta1.schema.predict.predictionB#TextExtractionPredictionResultProtoP\001Zcgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/prediction;prediction',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nOgoogle/cloud/aiplatform/v1beta1/schema/predict/prediction/text_extraction.proto\x12\x39google.cloud.aiplatform.v1beta1.schema.predict.prediction\x1a\x1cgoogle/api/annotations.proto\"\x9f\x01\n\x1eTextExtractionPredictionResult\x12\x0b\n\x03ids\x18\x01 \x03(\x03\x12\x15\n\rdisplay_names\x18\x02 \x03(\t\x12\"\n\x1atext_segment_start_offsets\x18\x03 \x03(\x03\x12 \n\x18text_segment_end_offsets\x18\x04 \x03(\x03\x12\x13\n\x0b\x63onfidences\x18\x05 \x03(\x02\x42\xcb\x01\n=com.google.cloud.aiplatform.v1beta1.schema.predict.predictionB#TextExtractionPredictionResultProtoP\x01Zcgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/prediction;predictionb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TEXTEXTRACTIONPREDICTIONRESULT = _descriptor.Descriptor(
  name='TextExtractionPredictionResult',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='ids', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult.ids', index=0,
      number=1, type=3, cpp_type=2, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_names', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult.display_names', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_segment_start_offsets', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult.text_segment_start_offsets', index=2,
      number=3, type=3, cpp_type=2, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_segment_end_offsets', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult.text_segment_end_offsets', index=3,
      number=4, type=3, cpp_type=2, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='confidences', full_name='google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult.confidences', index=4,
      number=5, type=2, cpp_type=6, label=3,
      has_default_value=False, default_value=[],
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
  serialized_end=332,
)

DESCRIPTOR.message_types_by_name['TextExtractionPredictionResult'] = _TEXTEXTRACTIONPREDICTIONRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TextExtractionPredictionResult = _reflection.GeneratedProtocolMessageType('TextExtractionPredictionResult', (_message.Message,), {
  'DESCRIPTOR' : _TEXTEXTRACTIONPREDICTIONRESULT,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.prediction.text_extraction_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TextExtractionPredictionResult)
  })
_sym_db.RegisterMessage(TextExtractionPredictionResult)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)