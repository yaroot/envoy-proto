# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/dataset_metadata.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n=google/cloud/aiplatform/v1beta1/schema/dataset_metadata.proto\x12&google.cloud.aiplatform.v1beta1.schema\x1a\x1cgoogle/api/annotations.proto\"H\n\x14ImageDatasetMetadata\x12\x1c\n\x14\x64\x61ta_item_schema_uri\x18\x01 \x01(\t\x12\x12\n\ngcs_bucket\x18\x02 \x01(\t\"G\n\x13TextDatasetMetadata\x12\x1c\n\x14\x64\x61ta_item_schema_uri\x18\x01 \x01(\t\x12\x12\n\ngcs_bucket\x18\x02 \x01(\t\"H\n\x14VideoDatasetMetadata\x12\x1c\n\x14\x64\x61ta_item_schema_uri\x18\x01 \x01(\t\x12\x12\n\ngcs_bucket\x18\x02 \x01(\t\"\x93\x03\n\x15TablesDatasetMetadata\x12_\n\x0cinput_config\x18\x01 \x01(\x0b\x32I.google.cloud.aiplatform.v1beta1.schema.TablesDatasetMetadata.InputConfig\x1a\xdf\x01\n\x0bInputConfig\x12]\n\ngcs_source\x18\x01 \x01(\x0b\x32G.google.cloud.aiplatform.v1beta1.schema.TablesDatasetMetadata.GcsSourceH\x00\x12g\n\x0f\x62igquery_source\x18\x02 \x01(\x0b\x32L.google.cloud.aiplatform.v1beta1.schema.TablesDatasetMetadata.BigQuerySourceH\x00\x42\x08\n\x06source\x1a\x18\n\tGcsSource\x12\x0b\n\x03uri\x18\x01 \x03(\t\x1a\x1d\n\x0e\x42igQuerySource\x12\x0b\n\x03uri\x18\x01 \x01(\t\"\xdf\x03\n\x19TimeSeriesDatasetMetadata\x12\x63\n\x0cinput_config\x18\x01 \x01(\x0b\x32M.google.cloud.aiplatform.v1beta1.schema.TimeSeriesDatasetMetadata.InputConfig\x12%\n\x1dtime_series_identifier_column\x18\x02 \x01(\t\x12\x13\n\x0btime_column\x18\x03 \x01(\t\x1a\xe7\x01\n\x0bInputConfig\x12\x61\n\ngcs_source\x18\x01 \x01(\x0b\x32K.google.cloud.aiplatform.v1beta1.schema.TimeSeriesDatasetMetadata.GcsSourceH\x00\x12k\n\x0f\x62igquery_source\x18\x02 \x01(\x0b\x32P.google.cloud.aiplatform.v1beta1.schema.TimeSeriesDatasetMetadata.BigQuerySourceH\x00\x42\x08\n\x06source\x1a\x18\n\tGcsSource\x12\x0b\n\x03uri\x18\x01 \x03(\t\x1a\x1d\n\x0e\x42igQuerySource\x12\x0b\n\x03uri\x18\x01 \x01(\tB\x91\x02\n*com.google.cloud.aiplatform.v1beta1.schemaB\x14\x44\x61tasetMetadataProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schema\xaa\x02&Google.Cloud.AIPlatform.V1Beta1.Schema\xca\x02&Google\\Cloud\\AIPlatform\\V1beta1\\Schema\xea\x02*Google::Cloud::AIPlatform::V1beta1::Schemab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.schema.dataset_metadata_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.aiplatform.v1beta1.schemaB\024DatasetMetadataProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schema\252\002&Google.Cloud.AIPlatform.V1Beta1.Schema\312\002&Google\\Cloud\\AIPlatform\\V1beta1\\Schema\352\002*Google::Cloud::AIPlatform::V1beta1::Schema'
  _IMAGEDATASETMETADATA._serialized_start=135
  _IMAGEDATASETMETADATA._serialized_end=207
  _TEXTDATASETMETADATA._serialized_start=209
  _TEXTDATASETMETADATA._serialized_end=280
  _VIDEODATASETMETADATA._serialized_start=282
  _VIDEODATASETMETADATA._serialized_end=354
  _TABLESDATASETMETADATA._serialized_start=357
  _TABLESDATASETMETADATA._serialized_end=760
  _TABLESDATASETMETADATA_INPUTCONFIG._serialized_start=480
  _TABLESDATASETMETADATA_INPUTCONFIG._serialized_end=703
  _TABLESDATASETMETADATA_GCSSOURCE._serialized_start=705
  _TABLESDATASETMETADATA_GCSSOURCE._serialized_end=729
  _TABLESDATASETMETADATA_BIGQUERYSOURCE._serialized_start=731
  _TABLESDATASETMETADATA_BIGQUERYSOURCE._serialized_end=760
  _TIMESERIESDATASETMETADATA._serialized_start=763
  _TIMESERIESDATASETMETADATA._serialized_end=1242
  _TIMESERIESDATASETMETADATA_INPUTCONFIG._serialized_start=954
  _TIMESERIESDATASETMETADATA_INPUTCONFIG._serialized_end=1185
  _TIMESERIESDATASETMETADATA_GCSSOURCE._serialized_start=705
  _TIMESERIESDATASETMETADATA_GCSSOURCE._serialized_end=729
  _TIMESERIESDATASETMETADATA_BIGQUERYSOURCE._serialized_start=731
  _TIMESERIESDATASETMETADATA_BIGQUERYSOURCE._serialized_end=760
# @@protoc_insertion_point(module_scope)
