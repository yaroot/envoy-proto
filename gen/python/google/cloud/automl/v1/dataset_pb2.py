# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1/dataset.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.automl.v1 import image_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_image__pb2
from google.cloud.automl.v1 import text_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_text__pb2
from google.cloud.automl.v1 import translation_pb2 as google_dot_cloud_dot_automl_dot_v1_dot_translation__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$google/cloud/automl/v1/dataset.proto\x12\x16google.cloud.automl.v1\x1a\x19google/api/resource.proto\x1a\"google/cloud/automl/v1/image.proto\x1a!google/cloud/automl/v1/text.proto\x1a(google/cloud/automl/v1/translation.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xe0\x07\n\x07\x44\x61taset\x12Z\n\x1ctranslation_dataset_metadata\x18\x17 \x01(\x0b\x32\x32.google.cloud.automl.v1.TranslationDatasetMetadataH\x00\x12k\n%image_classification_dataset_metadata\x18\x18 \x01(\x0b\x32:.google.cloud.automl.v1.ImageClassificationDatasetMetadataH\x00\x12i\n$text_classification_dataset_metadata\x18\x19 \x01(\x0b\x32\x39.google.cloud.automl.v1.TextClassificationDatasetMetadataH\x00\x12n\n\'image_object_detection_dataset_metadata\x18\x1a \x01(\x0b\x32;.google.cloud.automl.v1.ImageObjectDetectionDatasetMetadataH\x00\x12\x61\n text_extraction_dataset_metadata\x18\x1c \x01(\x0b\x32\x35.google.cloud.automl.v1.TextExtractionDatasetMetadataH\x00\x12_\n\x1ftext_sentiment_dataset_metadata\x18\x1e \x01(\x0b\x32\x34.google.cloud.automl.v1.TextSentimentDatasetMetadataH\x00\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x15\n\rexample_count\x18\x15 \x01(\x05\x12/\n\x0b\x63reate_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04\x65tag\x18\x11 \x01(\t\x12;\n\x06labels\x18\' \x03(\x0b\x32+.google.cloud.automl.v1.Dataset.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:^\xea\x41[\n\x1d\x61utoml.googleapis.com/Dataset\x12:projects/{project}/locations/{location}/datasets/{dataset}B\x12\n\x10\x64\x61taset_metadataB\xaa\x01\n\x1a\x63om.google.cloud.automl.v1P\x01Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\xaa\x02\x16Google.Cloud.AutoML.V1\xca\x02\x16Google\\Cloud\\AutoMl\\V1\xea\x02\x19Google::Cloud::AutoML::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.automl.v1.dataset_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.automl.v1P\001Z<google.golang.org/genproto/googleapis/cloud/automl/v1;automl\252\002\026Google.Cloud.AutoML.V1\312\002\026Google\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1'
  _DATASET_LABELSENTRY._options = None
  _DATASET_LABELSENTRY._serialized_options = b'8\001'
  _DATASET._options = None
  _DATASET._serialized_options = b'\352A[\n\035automl.googleapis.com/Dataset\022:projects/{project}/locations/{location}/datasets/{dataset}'
  _DATASET._serialized_start=238
  _DATASET._serialized_end=1230
  _DATASET_LABELSENTRY._serialized_start=1069
  _DATASET_LABELSENTRY._serialized_end=1114
# @@protoc_insertion_point(module_scope)
