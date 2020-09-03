# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1/text.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.automl.v1 import classification_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_classification__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/automl/v1/text.proto',
  package='google.cloud.automl.v1',
  syntax='proto3',
  serialized_options=b'\n\032com.google.cloud.automl.v1B\tTextProtoP\001Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!google/cloud/automl/v1/text.proto\x12\x16google.cloud.automl.v1\x1a+google/cloud/automl/v1/classification.proto\x1a\x1cgoogle/api/annotations.proto\"l\n!TextClassificationDatasetMetadata\x12G\n\x13\x63lassification_type\x18\x01 \x01(\x0e\x32*.google.cloud.automl.v1.ClassificationType\"j\n\x1fTextClassificationModelMetadata\x12G\n\x13\x63lassification_type\x18\x03 \x01(\x0e\x32*.google.cloud.automl.v1.ClassificationType\"\x1f\n\x1dTextExtractionDatasetMetadata\"\x1d\n\x1bTextExtractionModelMetadata\"5\n\x1cTextSentimentDatasetMetadata\x12\x15\n\rsentiment_max\x18\x01 \x01(\x05\"\x1c\n\x1aTextSentimentModelMetadataB\xb5\x01\n\x1a\x63om.google.cloud.automl.v1B\tTextProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\xaa\x02\x16Google.Cloud.AutoML.V1\xca\x02\x16Google\\Cloud\\AutoMl\\V1\xea\x02\x19Google::Cloud::AutoML::V1b\x06proto3'
  ,
  dependencies=[google_dot_cloud_dot_automl_dot_v1_dot_classification__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TEXTCLASSIFICATIONDATASETMETADATA = _descriptor.Descriptor(
  name='TextClassificationDatasetMetadata',
  full_name='google.cloud.automl.v1.TextClassificationDatasetMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='classification_type', full_name='google.cloud.automl.v1.TextClassificationDatasetMetadata.classification_type', index=0,
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
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=136,
  serialized_end=244,
)


_TEXTCLASSIFICATIONMODELMETADATA = _descriptor.Descriptor(
  name='TextClassificationModelMetadata',
  full_name='google.cloud.automl.v1.TextClassificationModelMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='classification_type', full_name='google.cloud.automl.v1.TextClassificationModelMetadata.classification_type', index=0,
      number=3, type=14, cpp_type=8, label=1,
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
  serialized_start=246,
  serialized_end=352,
)


_TEXTEXTRACTIONDATASETMETADATA = _descriptor.Descriptor(
  name='TextExtractionDatasetMetadata',
  full_name='google.cloud.automl.v1.TextExtractionDatasetMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=354,
  serialized_end=385,
)


_TEXTEXTRACTIONMODELMETADATA = _descriptor.Descriptor(
  name='TextExtractionModelMetadata',
  full_name='google.cloud.automl.v1.TextExtractionModelMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=387,
  serialized_end=416,
)


_TEXTSENTIMENTDATASETMETADATA = _descriptor.Descriptor(
  name='TextSentimentDatasetMetadata',
  full_name='google.cloud.automl.v1.TextSentimentDatasetMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='sentiment_max', full_name='google.cloud.automl.v1.TextSentimentDatasetMetadata.sentiment_max', index=0,
      number=1, type=5, cpp_type=1, label=1,
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
  serialized_start=418,
  serialized_end=471,
)


_TEXTSENTIMENTMODELMETADATA = _descriptor.Descriptor(
  name='TextSentimentModelMetadata',
  full_name='google.cloud.automl.v1.TextSentimentModelMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=473,
  serialized_end=501,
)

_TEXTCLASSIFICATIONDATASETMETADATA.fields_by_name['classification_type'].enum_type = google_dot_cloud_dot_automl_dot_v1_dot_classification__pb2._CLASSIFICATIONTYPE
_TEXTCLASSIFICATIONMODELMETADATA.fields_by_name['classification_type'].enum_type = google_dot_cloud_dot_automl_dot_v1_dot_classification__pb2._CLASSIFICATIONTYPE
DESCRIPTOR.message_types_by_name['TextClassificationDatasetMetadata'] = _TEXTCLASSIFICATIONDATASETMETADATA
DESCRIPTOR.message_types_by_name['TextClassificationModelMetadata'] = _TEXTCLASSIFICATIONMODELMETADATA
DESCRIPTOR.message_types_by_name['TextExtractionDatasetMetadata'] = _TEXTEXTRACTIONDATASETMETADATA
DESCRIPTOR.message_types_by_name['TextExtractionModelMetadata'] = _TEXTEXTRACTIONMODELMETADATA
DESCRIPTOR.message_types_by_name['TextSentimentDatasetMetadata'] = _TEXTSENTIMENTDATASETMETADATA
DESCRIPTOR.message_types_by_name['TextSentimentModelMetadata'] = _TEXTSENTIMENTMODELMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TextClassificationDatasetMetadata = _reflection.GeneratedProtocolMessageType('TextClassificationDatasetMetadata', (_message.Message,), {
  'DESCRIPTOR' : _TEXTCLASSIFICATIONDATASETMETADATA,
  '__module__' : 'google.cloud.automl.v1.text_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextClassificationDatasetMetadata)
  })
_sym_db.RegisterMessage(TextClassificationDatasetMetadata)

TextClassificationModelMetadata = _reflection.GeneratedProtocolMessageType('TextClassificationModelMetadata', (_message.Message,), {
  'DESCRIPTOR' : _TEXTCLASSIFICATIONMODELMETADATA,
  '__module__' : 'google.cloud.automl.v1.text_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextClassificationModelMetadata)
  })
_sym_db.RegisterMessage(TextClassificationModelMetadata)

TextExtractionDatasetMetadata = _reflection.GeneratedProtocolMessageType('TextExtractionDatasetMetadata', (_message.Message,), {
  'DESCRIPTOR' : _TEXTEXTRACTIONDATASETMETADATA,
  '__module__' : 'google.cloud.automl.v1.text_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextExtractionDatasetMetadata)
  })
_sym_db.RegisterMessage(TextExtractionDatasetMetadata)

TextExtractionModelMetadata = _reflection.GeneratedProtocolMessageType('TextExtractionModelMetadata', (_message.Message,), {
  'DESCRIPTOR' : _TEXTEXTRACTIONMODELMETADATA,
  '__module__' : 'google.cloud.automl.v1.text_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextExtractionModelMetadata)
  })
_sym_db.RegisterMessage(TextExtractionModelMetadata)

TextSentimentDatasetMetadata = _reflection.GeneratedProtocolMessageType('TextSentimentDatasetMetadata', (_message.Message,), {
  'DESCRIPTOR' : _TEXTSENTIMENTDATASETMETADATA,
  '__module__' : 'google.cloud.automl.v1.text_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextSentimentDatasetMetadata)
  })
_sym_db.RegisterMessage(TextSentimentDatasetMetadata)

TextSentimentModelMetadata = _reflection.GeneratedProtocolMessageType('TextSentimentModelMetadata', (_message.Message,), {
  'DESCRIPTOR' : _TEXTSENTIMENTMODELMETADATA,
  '__module__' : 'google.cloud.automl.v1.text_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.TextSentimentModelMetadata)
  })
_sym_db.RegisterMessage(TextSentimentModelMetadata)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
