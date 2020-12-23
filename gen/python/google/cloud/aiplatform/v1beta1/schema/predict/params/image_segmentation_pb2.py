# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/params/image_segmentation.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/schema/predict/params/image_segmentation.proto',
  package='google.cloud.aiplatform.v1beta1.schema.predict.params',
  syntax='proto3',
  serialized_options=b'\n9com.google.cloud.aiplatform.v1beta1.schema.predict.paramsB&ImageSegmentationPredictionParamsProtoP\001Z[google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/params;params',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nNgoogle/cloud/aiplatform/v1beta1/schema/predict/params/image_segmentation.proto\x12\x35google.cloud.aiplatform.v1beta1.schema.predict.params\x1a\x1cgoogle/api/annotations.proto\"A\n!ImageSegmentationPredictionParams\x12\x1c\n\x14\x63onfidence_threshold\x18\x01 \x01(\x02\x42\xc2\x01\n9com.google.cloud.aiplatform.v1beta1.schema.predict.paramsB&ImageSegmentationPredictionParamsProtoP\x01Z[google.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/params;paramsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_IMAGESEGMENTATIONPREDICTIONPARAMS = _descriptor.Descriptor(
  name='ImageSegmentationPredictionParams',
  full_name='google.cloud.aiplatform.v1beta1.schema.predict.params.ImageSegmentationPredictionParams',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='confidence_threshold', full_name='google.cloud.aiplatform.v1beta1.schema.predict.params.ImageSegmentationPredictionParams.confidence_threshold', index=0,
      number=1, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=167,
  serialized_end=232,
)

DESCRIPTOR.message_types_by_name['ImageSegmentationPredictionParams'] = _IMAGESEGMENTATIONPREDICTIONPARAMS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ImageSegmentationPredictionParams = _reflection.GeneratedProtocolMessageType('ImageSegmentationPredictionParams', (_message.Message,), {
  'DESCRIPTOR' : _IMAGESEGMENTATIONPREDICTIONPARAMS,
  '__module__' : 'google.cloud.aiplatform.v1beta1.schema.predict.params.image_segmentation_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.schema.predict.params.ImageSegmentationPredictionParams)
  })
_sym_db.RegisterMessage(ImageSegmentationPredictionParams)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)