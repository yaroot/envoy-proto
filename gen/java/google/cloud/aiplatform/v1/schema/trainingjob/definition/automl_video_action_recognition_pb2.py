# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_action_recognition.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_action_recognition.proto',
  package='google.cloud.aiplatform.v1.schema.trainingjob.definition',
  syntax='proto3',
  serialized_options=b'\n<com.google.cloud.aiplatform.v1.schema.trainingjob.definitionB!AutoMLVideoActionRecognitionProtoP\001Zbgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/trainingjob/definition;definition\252\0028Google.Cloud.AIPlatform.V1.Schema.TrainingJob.Definition\312\0028Google\\Cloud\\AIPlatform\\V1\\Schema\\TrainingJob\\Definition\352\002>Google::Cloud::AIPlatform::V1::Schema::TrainingJob::Definition',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n^google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_action_recognition.proto\x12\x38google.cloud.aiplatform.v1.schema.trainingjob.definition\x1a\x1cgoogle/api/annotations.proto\"\x8c\x01\n\x1c\x41utoMlVideoActionRecognition\x12l\n\x06inputs\x18\x01 \x01(\x0b\x32\\.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognitionInputs\"\xec\x01\n\"AutoMlVideoActionRecognitionInputs\x12z\n\nmodel_type\x18\x01 \x01(\x0e\x32\x66.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognitionInputs.ModelType\"J\n\tModelType\x12\x1a\n\x16MODEL_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x43LOUD\x10\x01\x12\x16\n\x12MOBILE_VERSATILE_1\x10\x02\x42\xfe\x02\n<com.google.cloud.aiplatform.v1.schema.trainingjob.definitionB!AutoMLVideoActionRecognitionProtoP\x01Zbgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/trainingjob/definition;definition\xaa\x02\x38Google.Cloud.AIPlatform.V1.Schema.TrainingJob.Definition\xca\x02\x38Google\\Cloud\\AIPlatform\\V1\\Schema\\TrainingJob\\Definition\xea\x02>Google::Cloud::AIPlatform::V1::Schema::TrainingJob::Definitionb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_AUTOMLVIDEOACTIONRECOGNITIONINPUTS_MODELTYPE = _descriptor.EnumDescriptor(
  name='ModelType',
  full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognitionInputs.ModelType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='MODEL_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOUD', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MOBILE_VERSATILE_1', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=492,
  serialized_end=566,
)
_sym_db.RegisterEnumDescriptor(_AUTOMLVIDEOACTIONRECOGNITIONINPUTS_MODELTYPE)


_AUTOMLVIDEOACTIONRECOGNITION = _descriptor.Descriptor(
  name='AutoMlVideoActionRecognition',
  full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognition',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='inputs', full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognition.inputs', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=187,
  serialized_end=327,
)


_AUTOMLVIDEOACTIONRECOGNITIONINPUTS = _descriptor.Descriptor(
  name='AutoMlVideoActionRecognitionInputs',
  full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognitionInputs',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='model_type', full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognitionInputs.model_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _AUTOMLVIDEOACTIONRECOGNITIONINPUTS_MODELTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=330,
  serialized_end=566,
)

_AUTOMLVIDEOACTIONRECOGNITION.fields_by_name['inputs'].message_type = _AUTOMLVIDEOACTIONRECOGNITIONINPUTS
_AUTOMLVIDEOACTIONRECOGNITIONINPUTS.fields_by_name['model_type'].enum_type = _AUTOMLVIDEOACTIONRECOGNITIONINPUTS_MODELTYPE
_AUTOMLVIDEOACTIONRECOGNITIONINPUTS_MODELTYPE.containing_type = _AUTOMLVIDEOACTIONRECOGNITIONINPUTS
DESCRIPTOR.message_types_by_name['AutoMlVideoActionRecognition'] = _AUTOMLVIDEOACTIONRECOGNITION
DESCRIPTOR.message_types_by_name['AutoMlVideoActionRecognitionInputs'] = _AUTOMLVIDEOACTIONRECOGNITIONINPUTS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AutoMlVideoActionRecognition = _reflection.GeneratedProtocolMessageType('AutoMlVideoActionRecognition', (_message.Message,), {
  'DESCRIPTOR' : _AUTOMLVIDEOACTIONRECOGNITION,
  '__module__' : 'google.cloud.aiplatform.v1.schema.trainingjob.definition.automl_video_action_recognition_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognition)
  })
_sym_db.RegisterMessage(AutoMlVideoActionRecognition)

AutoMlVideoActionRecognitionInputs = _reflection.GeneratedProtocolMessageType('AutoMlVideoActionRecognitionInputs', (_message.Message,), {
  'DESCRIPTOR' : _AUTOMLVIDEOACTIONRECOGNITIONINPUTS,
  '__module__' : 'google.cloud.aiplatform.v1.schema.trainingjob.definition.automl_video_action_recognition_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoActionRecognitionInputs)
  })
_sym_db.RegisterMessage(AutoMlVideoActionRecognitionInputs)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
