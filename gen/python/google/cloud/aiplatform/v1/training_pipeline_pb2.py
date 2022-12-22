# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/training_pipeline.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1 import encryption_spec_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_encryption__spec__pb2
from google.cloud.aiplatform.v1 import io_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_io__pb2
from google.cloud.aiplatform.v1 import model_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_model__pb2
from google.cloud.aiplatform.v1 import pipeline_state_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_pipeline__state__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/cloud/aiplatform/v1/training_pipeline.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x30google/cloud/aiplatform/v1/encryption_spec.proto\x1a#google/cloud/aiplatform/v1/io.proto\x1a&google/cloud/aiplatform/v1/model.proto\x1a/google/cloud/aiplatform/v1/pipeline_state.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x8e\x08\n\x10TrainingPipeline\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x46\n\x11input_data_config\x18\x03 \x01(\x0b\x32+.google.cloud.aiplatform.v1.InputDataConfig\x12%\n\x18training_task_definition\x18\x04 \x01(\tB\x03\xe0\x41\x02\x12\x39\n\x14training_task_inputs\x18\x05 \x01(\x0b\x32\x16.google.protobuf.ValueB\x03\xe0\x41\x02\x12;\n\x16training_task_metadata\x18\x06 \x01(\x0b\x32\x16.google.protobuf.ValueB\x03\xe0\x41\x03\x12:\n\x0fmodel_to_upload\x18\x07 \x01(\x0b\x32!.google.cloud.aiplatform.v1.Model\x12\x15\n\x08model_id\x18\x16 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0cparent_model\x18\x15 \x01(\tB\x03\xe0\x41\x01\x12=\n\x05state\x18\t \x01(\x0e\x32).google.cloud.aiplatform.v1.PipelineStateB\x03\xe0\x41\x03\x12&\n\x05\x65rror\x18\n \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x33\n\nstart_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12H\n\x06labels\x18\x0f \x03(\x0b\x32\x38.google.cloud.aiplatform.v1.TrainingPipeline.LabelsEntry\x12\x43\n\x0f\x65ncryption_spec\x18\x12 \x01(\x0b\x32*.google.cloud.aiplatform.v1.EncryptionSpec\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:~\xea\x41{\n*aiplatform.googleapis.com/TrainingPipeline\x12Mprojects/{project}/locations/{location}/trainingPipelines/{training_pipeline}\"\xaf\x05\n\x0fInputDataConfig\x12\x43\n\x0e\x66raction_split\x18\x02 \x01(\x0b\x32).google.cloud.aiplatform.v1.FractionSplitH\x00\x12?\n\x0c\x66ilter_split\x18\x03 \x01(\x0b\x32\'.google.cloud.aiplatform.v1.FilterSplitH\x00\x12G\n\x10predefined_split\x18\x04 \x01(\x0b\x32+.google.cloud.aiplatform.v1.PredefinedSplitH\x00\x12\x45\n\x0ftimestamp_split\x18\x05 \x01(\x0b\x32*.google.cloud.aiplatform.v1.TimestampSplitH\x00\x12G\n\x10stratified_split\x18\x0c \x01(\x0b\x32+.google.cloud.aiplatform.v1.StratifiedSplitH\x00\x12\x45\n\x0fgcs_destination\x18\x08 \x01(\x0b\x32*.google.cloud.aiplatform.v1.GcsDestinationH\x01\x12O\n\x14\x62igquery_destination\x18\n \x01(\x0b\x32/.google.cloud.aiplatform.v1.BigQueryDestinationH\x01\x12\x17\n\ndataset_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\x12\x61nnotations_filter\x18\x06 \x01(\t\x12\x1d\n\x15\x61nnotation_schema_uri\x18\t \x01(\t\x12\x16\n\x0esaved_query_id\x18\x07 \x01(\t\x12!\n\x19persist_ml_use_assignment\x18\x0b \x01(\x08\x42\x07\n\x05splitB\r\n\x0b\x64\x65stination\"^\n\rFractionSplit\x12\x19\n\x11training_fraction\x18\x01 \x01(\x01\x12\x1b\n\x13validation_fraction\x18\x02 \x01(\x01\x12\x15\n\rtest_fraction\x18\x03 \x01(\x01\"e\n\x0b\x46ilterSplit\x12\x1c\n\x0ftraining_filter\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1e\n\x11validation_filter\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0btest_filter\x18\x03 \x01(\tB\x03\xe0\x41\x02\"#\n\x0fPredefinedSplit\x12\x10\n\x03key\x18\x01 \x01(\tB\x03\xe0\x41\x02\"q\n\x0eTimestampSplit\x12\x19\n\x11training_fraction\x18\x01 \x01(\x01\x12\x1b\n\x13validation_fraction\x18\x02 \x01(\x01\x12\x15\n\rtest_fraction\x18\x03 \x01(\x01\x12\x10\n\x03key\x18\x04 \x01(\tB\x03\xe0\x41\x02\"r\n\x0fStratifiedSplit\x12\x19\n\x11training_fraction\x18\x01 \x01(\x01\x12\x1b\n\x13validation_fraction\x18\x02 \x01(\x01\x12\x15\n\rtest_fraction\x18\x03 \x01(\x01\x12\x10\n\x03key\x18\x04 \x01(\tB\x03\xe0\x41\x02\x42\xd9\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x15TrainingPipelineProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.training_pipeline_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\025TrainingPipelineProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _TRAININGPIPELINE_LABELSENTRY._options = None
  _TRAININGPIPELINE_LABELSENTRY._serialized_options = b'8\001'
  _TRAININGPIPELINE.fields_by_name['name']._options = None
  _TRAININGPIPELINE.fields_by_name['name']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['display_name']._options = None
  _TRAININGPIPELINE.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _TRAININGPIPELINE.fields_by_name['training_task_definition']._options = None
  _TRAININGPIPELINE.fields_by_name['training_task_definition']._serialized_options = b'\340A\002'
  _TRAININGPIPELINE.fields_by_name['training_task_inputs']._options = None
  _TRAININGPIPELINE.fields_by_name['training_task_inputs']._serialized_options = b'\340A\002'
  _TRAININGPIPELINE.fields_by_name['training_task_metadata']._options = None
  _TRAININGPIPELINE.fields_by_name['training_task_metadata']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['model_id']._options = None
  _TRAININGPIPELINE.fields_by_name['model_id']._serialized_options = b'\340A\001'
  _TRAININGPIPELINE.fields_by_name['parent_model']._options = None
  _TRAININGPIPELINE.fields_by_name['parent_model']._serialized_options = b'\340A\001'
  _TRAININGPIPELINE.fields_by_name['state']._options = None
  _TRAININGPIPELINE.fields_by_name['state']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['error']._options = None
  _TRAININGPIPELINE.fields_by_name['error']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['create_time']._options = None
  _TRAININGPIPELINE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['start_time']._options = None
  _TRAININGPIPELINE.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['end_time']._options = None
  _TRAININGPIPELINE.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE.fields_by_name['update_time']._options = None
  _TRAININGPIPELINE.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TRAININGPIPELINE._options = None
  _TRAININGPIPELINE._serialized_options = b'\352A{\n*aiplatform.googleapis.com/TrainingPipeline\022Mprojects/{project}/locations/{location}/trainingPipelines/{training_pipeline}'
  _INPUTDATACONFIG.fields_by_name['dataset_id']._options = None
  _INPUTDATACONFIG.fields_by_name['dataset_id']._serialized_options = b'\340A\002'
  _FILTERSPLIT.fields_by_name['training_filter']._options = None
  _FILTERSPLIT.fields_by_name['training_filter']._serialized_options = b'\340A\002'
  _FILTERSPLIT.fields_by_name['validation_filter']._options = None
  _FILTERSPLIT.fields_by_name['validation_filter']._serialized_options = b'\340A\002'
  _FILTERSPLIT.fields_by_name['test_filter']._options = None
  _FILTERSPLIT.fields_by_name['test_filter']._serialized_options = b'\340A\002'
  _PREDEFINEDSPLIT.fields_by_name['key']._options = None
  _PREDEFINEDSPLIT.fields_by_name['key']._serialized_options = b'\340A\002'
  _TIMESTAMPSPLIT.fields_by_name['key']._options = None
  _TIMESTAMPSPLIT.fields_by_name['key']._serialized_options = b'\340A\002'
  _STRATIFIEDSPLIT.fields_by_name['key']._options = None
  _STRATIFIEDSPLIT.fields_by_name['key']._serialized_options = b'\340A\002'
  _TRAININGPIPELINE._serialized_start=407
  _TRAININGPIPELINE._serialized_end=1445
  _TRAININGPIPELINE_LABELSENTRY._serialized_start=1272
  _TRAININGPIPELINE_LABELSENTRY._serialized_end=1317
  _INPUTDATACONFIG._serialized_start=1448
  _INPUTDATACONFIG._serialized_end=2135
  _FRACTIONSPLIT._serialized_start=2137
  _FRACTIONSPLIT._serialized_end=2231
  _FILTERSPLIT._serialized_start=2233
  _FILTERSPLIT._serialized_end=2334
  _PREDEFINEDSPLIT._serialized_start=2336
  _PREDEFINEDSPLIT._serialized_end=2371
  _TIMESTAMPSPLIT._serialized_start=2373
  _TIMESTAMPSPLIT._serialized_end=2486
  _STRATIFIEDSPLIT._serialized_start=2488
  _STRATIFIEDSPLIT._serialized_end=2602
# @@protoc_insertion_point(module_scope)