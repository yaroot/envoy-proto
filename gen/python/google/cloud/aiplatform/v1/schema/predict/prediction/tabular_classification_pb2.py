# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/schema/predict/prediction/tabular_classification.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1/schema/predict/prediction/tabular_classification.proto',
  package='google.cloud.aiplatform.v1.schema.predict.prediction',
  syntax='proto3',
  serialized_options=b'\n8com.google.cloud.aiplatform.v1.schema.predict.predictionB*TabularClassificationPredictionResultProtoP\001Z^google.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/predict/prediction;prediction',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nQgoogle/cloud/aiplatform/v1/schema/predict/prediction/tabular_classification.proto\x12\x34google.cloud.aiplatform.v1.schema.predict.prediction\x1a\x1cgoogle/api/annotations.proto\"H\n%TabularClassificationPredictionResult\x12\x0f\n\x07\x63lasses\x18\x01 \x03(\t\x12\x0e\n\x06scores\x18\x02 \x03(\x02\x42\xc8\x01\n8com.google.cloud.aiplatform.v1.schema.predict.predictionB*TabularClassificationPredictionResultProtoP\x01Z^google.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/predict/prediction;predictionb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TABULARCLASSIFICATIONPREDICTIONRESULT = _descriptor.Descriptor(
  name='TabularClassificationPredictionResult',
  full_name='google.cloud.aiplatform.v1.schema.predict.prediction.TabularClassificationPredictionResult',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='classes', full_name='google.cloud.aiplatform.v1.schema.predict.prediction.TabularClassificationPredictionResult.classes', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scores', full_name='google.cloud.aiplatform.v1.schema.predict.prediction.TabularClassificationPredictionResult.scores', index=1,
      number=2, type=2, cpp_type=6, label=3,
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
  serialized_start=169,
  serialized_end=241,
)

DESCRIPTOR.message_types_by_name['TabularClassificationPredictionResult'] = _TABULARCLASSIFICATIONPREDICTIONRESULT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TabularClassificationPredictionResult = _reflection.GeneratedProtocolMessageType('TabularClassificationPredictionResult', (_message.Message,), {
  'DESCRIPTOR' : _TABULARCLASSIFICATIONPREDICTIONRESULT,
  '__module__' : 'google.cloud.aiplatform.v1.schema.predict.prediction.tabular_classification_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.predict.prediction.TabularClassificationPredictionResult)
  })
_sym_db.RegisterMessage(TabularClassificationPredictionResult)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)