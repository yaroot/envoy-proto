# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1/dataset.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.automl.v1 import image_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_image__pb2
from google.cloud.automl.v1 import text_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_text__pb2
from google.cloud.automl.v1 import translation_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_translation__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/automl/v1/dataset.proto',
  package='google.cloud.automl.v1',
  syntax='proto3',
  serialized_options=b'\n\032com.google.cloud.automl.v1P\001Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$google/cloud/automl/v1/dataset.proto\x12\x16google.cloud.automl.v1\x1a\x19google/api/resource.proto\x1a\"google/cloud/automl/v1/image.proto\x1a!google/cloud/automl/v1/text.proto\x1a(google/cloud/automl/v1/translation.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xe0\x07\n\x07\x44\x61taset\x12Z\n\x1ctranslation_dataset_metadata\x18\x17 \x01(\x0b\x32\x32.google.cloud.automl.v1.TranslationDatasetMetadataH\x00\x12k\n%image_classification_dataset_metadata\x18\x18 \x01(\x0b\x32:.google.cloud.automl.v1.ImageClassificationDatasetMetadataH\x00\x12i\n$text_classification_dataset_metadata\x18\x19 \x01(\x0b\x32\x39.google.cloud.automl.v1.TextClassificationDatasetMetadataH\x00\x12n\n\'image_object_detection_dataset_metadata\x18\x1a \x01(\x0b\x32;.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadataH\x00\x12\x61\n text_extraction_dataset_metadata\x18\x1c \x01(\x0b\x32\x35.google.cloud.automl.v1.TextExtractionDatasetMetadataH\x00\x12_\n\x1ftext_sentiment_dataset_metadata\x18\x1e \x01(\x0b\x32\x34.google.cloud.automl.v1.TextSentimentDatasetMetadataH\x00\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x15\n\rexample_count\x18\x15 \x01(\x05\x12/\n\x0b\x63reate_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x65tag\x18\x11 \x01(\t\x12;\n\x06labels\x18\' \x03(\x0b\x32+.google.cloud.automl.v1.Dataset.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:^\xea\x41[\n\x1d\x61utoml.googleapis.com/Dataset\x12:projects/{project}/locations/{location}/datasets/{dataset}B\x12\n\x10\x64\x61taset_metadataB\xaa\x01\n\x1a\x63om.google.cloud.automl.v1P\x01Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\xaa\x02\x16Google.Cloud.AutoML.V1\xca\x02\x16Google\\Cloud\\AutoMl\\V1\xea\x02\x19Google::Cloud::AutoML::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_cloud_dot_automl_dot_v1_dot_image__pb2.DESCRIPTOR,google_dot_cloud_dot_automl_dot_v1_dot_text__pb2.DESCRIPTOR,google_dot_cloud_dot_automl_dot_v1_dot_translation__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_DATASET_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.automl.v1.Dataset.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.automl.v1.Dataset.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.automl.v1.Dataset.LabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1099,
  serialized_end=1144,
)

_DATASET = _descriptor.Descriptor(
  name='Dataset',
  full_name='google.cloud.automl.v1.Dataset',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='translation_dataset_metadata', full_name='google.cloud.automl.v1.Dataset.translation_dataset_metadata', index=0,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image_classification_dataset_metadata', full_name='google.cloud.automl.v1.Dataset.image_classification_dataset_metadata', index=1,
      number=24, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_classification_dataset_metadata', full_name='google.cloud.automl.v1.Dataset.text_classification_dataset_metadata', index=2,
      number=25, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image_object_detection_dataset_metadata', full_name='google.cloud.automl.v1.Dataset.image_object_detection_dataset_metadata', index=3,
      number=26, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_extraction_dataset_metadata', full_name='google.cloud.automl.v1.Dataset.text_extraction_dataset_metadata', index=4,
      number=28, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_sentiment_dataset_metadata', full_name='google.cloud.automl.v1.Dataset.text_sentiment_dataset_metadata', index=5,
      number=30, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.automl.v1.Dataset.name', index=6,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.automl.v1.Dataset.display_name', index=7,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.automl.v1.Dataset.description', index=8,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='example_count', full_name='google.cloud.automl.v1.Dataset.example_count', index=9,
      number=21, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.automl.v1.Dataset.create_time', index=10,
      number=14, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.cloud.automl.v1.Dataset.etag', index=11,
      number=17, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.automl.v1.Dataset.labels', index=12,
      number=39, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_DATASET_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352A[\n\035automl.googleapis.com/Dataset\022:projects/{project}/locations/{location}/datasets/{dataset}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='dataset_metadata', full_name='google.cloud.automl.v1.Dataset.dataset_metadata',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=268,
  serialized_end=1260,
)

_DATASET_LABELSENTRY.containing_type = _DATASET
_DATASET.fields_by_name['translation_dataset_metadata'].message_type = google_dot_cloud_dot_automl_dot_v1_dot_translation__pb2._TRANSLATIONDATASETMETADATA
_DATASET.fields_by_name['image_classification_dataset_metadata'].message_type = google_dot_cloud_dot_automl_dot_v1_dot_image__pb2._IMAGECLASSIFICATIONDATASETMETADATA
_DATASET.fields_by_name['text_classification_dataset_metadata'].message_type = google_dot_cloud_dot_automl_dot_v1_dot_text__pb2._TEXTCLASSIFICATIONDATASETMETADATA
_DATASET.fields_by_name['image_object_detection_dataset_metadata'].message_type = google_dot_cloud_dot_automl_dot_v1_dot_image__pb2._IMAGEOBJECTDETECTIONDATASETMETADATA
_DATASET.fields_by_name['text_extraction_dataset_metadata'].message_type = google_dot_cloud_dot_automl_dot_v1_dot_text__pb2._TEXTEXTRACTIONDATASETMETADATA
_DATASET.fields_by_name['text_sentiment_dataset_metadata'].message_type = google_dot_cloud_dot_automl_dot_v1_dot_text__pb2._TEXTSENTIMENTDATASETMETADATA
_DATASET.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_DATASET.fields_by_name['labels'].message_type = _DATASET_LABELSENTRY
_DATASET.oneofs_by_name['dataset_metadata'].fields.append(
  _DATASET.fields_by_name['translation_dataset_metadata'])
_DATASET.fields_by_name['translation_dataset_metadata'].containing_oneof = _DATASET.oneofs_by_name['dataset_metadata']
_DATASET.oneofs_by_name['dataset_metadata'].fields.append(
  _DATASET.fields_by_name['image_classification_dataset_metadata'])
_DATASET.fields_by_name['image_classification_dataset_metadata'].containing_oneof = _DATASET.oneofs_by_name['dataset_metadata']
_DATASET.oneofs_by_name['dataset_metadata'].fields.append(
  _DATASET.fields_by_name['text_classification_dataset_metadata'])
_DATASET.fields_by_name['text_classification_dataset_metadata'].containing_oneof = _DATASET.oneofs_by_name['dataset_metadata']
_DATASET.oneofs_by_name['dataset_metadata'].fields.append(
  _DATASET.fields_by_name['image_object_detection_dataset_metadata'])
_DATASET.fields_by_name['image_object_detection_dataset_metadata'].containing_oneof = _DATASET.oneofs_by_name['dataset_metadata']
_DATASET.oneofs_by_name['dataset_metadata'].fields.append(
  _DATASET.fields_by_name['text_extraction_dataset_metadata'])
_DATASET.fields_by_name['text_extraction_dataset_metadata'].containing_oneof = _DATASET.oneofs_by_name['dataset_metadata']
_DATASET.oneofs_by_name['dataset_metadata'].fields.append(
  _DATASET.fields_by_name['text_sentiment_dataset_metadata'])
_DATASET.fields_by_name['text_sentiment_dataset_metadata'].containing_oneof = _DATASET.oneofs_by_name['dataset_metadata']
DESCRIPTOR.message_types_by_name['Dataset'] = _DATASET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Dataset = _reflection.GeneratedProtocolMessageType('Dataset', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _DATASET_LABELSENTRY,
    '__module__' : 'google.cloud.automl.v1.dataset_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.Dataset.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _DATASET,
  '__module__' : 'google.cloud.automl.v1.dataset_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1.Dataset)
  })
_sym_db.RegisterMessage(Dataset)
_sym_db.RegisterMessage(Dataset.LabelsEntry)


DESCRIPTOR._options = None
_DATASET_LABELSENTRY._options = None
_DATASET._options = None
# @@protoc_insertion_point(module_scope)
