# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_object_tracking.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_object_tracking.proto',
  package='google.cloud.aiplatform.v1.schema.trainingjob.definition',
  syntax='proto3',
  serialized_options=b'\n<com.google.cloud.aiplatform.v1.schema.trainingjob.definitionB\036AutoMLVideoObjectTrackingProtoP\001Zbgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/trainingjob/definition;definition\252\0028Google.Cloud.AIPlatform.V1.Schema.TrainingJob.Definition\312\0028Google\\Cloud\\AIPlatform\\V1\\Schema\\TrainingJob\\Definition\352\002>Google::Cloud::AIPlatform::V1::Schema::TrainingJob::Definition',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n[google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_video_object_tracking.proto\x12\x38google.cloud.aiplatform.v1.schema.trainingjob.definition\x1a\x1cgoogle/api/annotations.proto\"\x86\x01\n\x19\x41utoMlVideoObjectTracking\x12i\n\x06inputs\x18\x01 \x01(\x0b\x32Y.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs\"\xe5\x02\n\x1f\x41utoMlVideoObjectTrackingInputs\x12w\n\nmodel_type\x18\x01 \x01(\x0e\x32\x63.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType\"\xc8\x01\n\tModelType\x12\x1a\n\x16MODEL_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x43LOUD\x10\x01\x12\x16\n\x12MOBILE_VERSATILE_1\x10\x02\x12\x1c\n\x18MOBILE_CORAL_VERSATILE_1\x10\x03\x12\x1e\n\x1aMOBILE_CORAL_LOW_LATENCY_1\x10\x04\x12\x1d\n\x19MOBILE_JETSON_VERSATILE_1\x10\x05\x12\x1f\n\x1bMOBILE_JETSON_LOW_LATENCY_1\x10\x06\x42\xfb\x02\n<com.google.cloud.aiplatform.v1.schema.trainingjob.definitionB\x1e\x41utoMLVideoObjectTrackingProtoP\x01Zbgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/trainingjob/definition;definition\xaa\x02\x38Google.Cloud.AIPlatform.V1.Schema.TrainingJob.Definition\xca\x02\x38Google\\Cloud\\AIPlatform\\V1\\Schema\\TrainingJob\\Definition\xea\x02>Google::Cloud::AIPlatform::V1::Schema::TrainingJob::Definitionb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_AUTOMLVIDEOOBJECTTRACKINGINPUTS_MODELTYPE = _descriptor.EnumDescriptor(
  name='ModelType',
  full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.ModelType',
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
    _descriptor.EnumValueDescriptor(
      name='MOBILE_CORAL_VERSATILE_1', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MOBILE_CORAL_LOW_LATENCY_1', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MOBILE_JETSON_VERSATILE_1', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MOBILE_JETSON_LOW_LATENCY_1', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=478,
  serialized_end=678,
)
_sym_db.RegisterEnumDescriptor(_AUTOMLVIDEOOBJECTTRACKINGINPUTS_MODELTYPE)


_AUTOMLVIDEOOBJECTTRACKING = _descriptor.Descriptor(
  name='AutoMlVideoObjectTracking',
  full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTracking',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='inputs', full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTracking.inputs', index=0,
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
  serialized_start=184,
  serialized_end=318,
)


_AUTOMLVIDEOOBJECTTRACKINGINPUTS = _descriptor.Descriptor(
  name='AutoMlVideoObjectTrackingInputs',
  full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='model_type', full_name='google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs.model_type', index=0,
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
    _AUTOMLVIDEOOBJECTTRACKINGINPUTS_MODELTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=321,
  serialized_end=678,
)

_AUTOMLVIDEOOBJECTTRACKING.fields_by_name['inputs'].message_type = _AUTOMLVIDEOOBJECTTRACKINGINPUTS
_AUTOMLVIDEOOBJECTTRACKINGINPUTS.fields_by_name['model_type'].enum_type = _AUTOMLVIDEOOBJECTTRACKINGINPUTS_MODELTYPE
_AUTOMLVIDEOOBJECTTRACKINGINPUTS_MODELTYPE.containing_type = _AUTOMLVIDEOOBJECTTRACKINGINPUTS
DESCRIPTOR.message_types_by_name['AutoMlVideoObjectTracking'] = _AUTOMLVIDEOOBJECTTRACKING
DESCRIPTOR.message_types_by_name['AutoMlVideoObjectTrackingInputs'] = _AUTOMLVIDEOOBJECTTRACKINGINPUTS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AutoMlVideoObjectTracking = _reflection.GeneratedProtocolMessageType('AutoMlVideoObjectTracking', (_message.Message,), {
  'DESCRIPTOR' : _AUTOMLVIDEOOBJECTTRACKING,
  '__module__' : 'google.cloud.aiplatform.v1.schema.trainingjob.definition.automl_video_object_tracking_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTracking)
  })
_sym_db.RegisterMessage(AutoMlVideoObjectTracking)

AutoMlVideoObjectTrackingInputs = _reflection.GeneratedProtocolMessageType('AutoMlVideoObjectTrackingInputs', (_message.Message,), {
  'DESCRIPTOR' : _AUTOMLVIDEOOBJECTTRACKINGINPUTS,
  '__module__' : 'google.cloud.aiplatform.v1.schema.trainingjob.definition.automl_video_object_tracking_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs)
  })
_sym_db.RegisterMessage(AutoMlVideoObjectTrackingInputs)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
