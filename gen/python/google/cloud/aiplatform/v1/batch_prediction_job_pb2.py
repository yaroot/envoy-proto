# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/batch_prediction_job.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1 import completion_stats_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_completion__stats__pb2
from google.cloud.aiplatform.v1 import encryption_spec_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_encryption__spec__pb2
from google.cloud.aiplatform.v1 import explanation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_explanation__pb2
from google.cloud.aiplatform.v1 import io_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_io__pb2
from google.cloud.aiplatform.v1 import job_state_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_job__state__pb2
from google.cloud.aiplatform.v1 import machine_resources_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_machine__resources__pb2
from google.cloud.aiplatform.v1 import manual_batch_tuning_parameters_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_manual__batch__tuning__parameters__pb2
from google.cloud.aiplatform.v1 import unmanaged_container_model_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_unmanaged__container__model__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n5google/cloud/aiplatform/v1/batch_prediction_job.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x31google/cloud/aiplatform/v1/completion_stats.proto\x1a\x30google/cloud/aiplatform/v1/encryption_spec.proto\x1a,google/cloud/aiplatform/v1/explanation.proto\x1a#google/cloud/aiplatform/v1/io.proto\x1a*google/cloud/aiplatform/v1/job_state.proto\x1a\x32google/cloud/aiplatform/v1/machine_resources.proto\x1a?google/cloud/aiplatform/v1/manual_batch_tuning_parameters.proto\x1a:google/cloud/aiplatform/v1/unmanaged_container_model.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xd2\x11\n\x12\x42\x61tchPredictionJob\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x33\n\x05model\x18\x03 \x01(\tB$\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\x1d\n\x10model_version_id\x18\x1e \x01(\tB\x03\xe0\x41\x03\x12V\n\x19unmanaged_container_model\x18\x1c \x01(\x0b\x32\x33.google.cloud.aiplatform.v1.UnmanagedContainerModel\x12U\n\x0cinput_config\x18\x04 \x01(\x0b\x32:.google.cloud.aiplatform.v1.BatchPredictionJob.InputConfigB\x03\xe0\x41\x02\x12\x30\n\x10model_parameters\x18\x05 \x01(\x0b\x32\x16.google.protobuf.Value\x12W\n\routput_config\x18\x06 \x01(\x0b\x32;.google.cloud.aiplatform.v1.BatchPredictionJob.OutputConfigB\x03\xe0\x41\x02\x12P\n\x13\x64\x65\x64icated_resources\x18\x07 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1.BatchDedicatedResources\x12\x17\n\x0fservice_account\x18\x1d \x01(\t\x12\x64\n\x1emanual_batch_tuning_parameters\x18\x08 \x01(\x0b\x32\x37.google.cloud.aiplatform.v1.ManualBatchTuningParametersB\x03\xe0\x41\x05\x12\x1c\n\x14generate_explanation\x18\x17 \x01(\x08\x12\x45\n\x10\x65xplanation_spec\x18\x19 \x01(\x0b\x32+.google.cloud.aiplatform.v1.ExplanationSpec\x12S\n\x0boutput_info\x18\t \x01(\x0b\x32\x39.google.cloud.aiplatform.v1.BatchPredictionJob.OutputInfoB\x03\xe0\x41\x03\x12\x38\n\x05state\x18\n \x01(\x0e\x32$.google.cloud.aiplatform.v1.JobStateB\x03\xe0\x41\x03\x12&\n\x05\x65rror\x18\x0b \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x12\x31\n\x10partial_failures\x18\x0c \x03(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x12N\n\x12resources_consumed\x18\r \x01(\x0b\x32-.google.cloud.aiplatform.v1.ResourcesConsumedB\x03\xe0\x41\x03\x12J\n\x10\x63ompletion_stats\x18\x0e \x01(\x0b\x32+.google.cloud.aiplatform.v1.CompletionStatsB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x0f \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x33\n\nstart_time\x18\x10 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x11 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x12 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12J\n\x06labels\x18\x13 \x03(\x0b\x32:.google.cloud.aiplatform.v1.BatchPredictionJob.LabelsEntry\x12\x43\n\x0f\x65ncryption_spec\x18\x18 \x01(\x0b\x32*.google.cloud.aiplatform.v1.EncryptionSpec\x1a\xba\x01\n\x0bInputConfig\x12;\n\ngcs_source\x18\x02 \x01(\x0b\x32%.google.cloud.aiplatform.v1.GcsSourceH\x00\x12\x45\n\x0f\x62igquery_source\x18\x03 \x01(\x0b\x32*.google.cloud.aiplatform.v1.BigQuerySourceH\x00\x12\x1d\n\x10instances_format\x18\x01 \x01(\tB\x03\xe0\x41\x02\x42\x08\n\x06source\x1a\xd6\x01\n\x0cOutputConfig\x12\x45\n\x0fgcs_destination\x18\x02 \x01(\x0b\x32*.google.cloud.aiplatform.v1.GcsDestinationH\x00\x12O\n\x14\x62igquery_destination\x18\x03 \x01(\x0b\x32/.google.cloud.aiplatform.v1.BigQueryDestinationH\x00\x12\x1f\n\x12predictions_format\x18\x01 \x01(\tB\x03\xe0\x41\x02\x42\r\n\x0b\x64\x65stination\x1a\x90\x01\n\nOutputInfo\x12#\n\x14gcs_output_directory\x18\x01 \x01(\tB\x03\xe0\x41\x03H\x00\x12&\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tB\x03\xe0\x41\x03H\x00\x12\"\n\x15\x62igquery_output_table\x18\x04 \x01(\tB\x03\xe0\x41\x03\x42\x11\n\x0foutput_location\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x86\x01\xea\x41\x82\x01\n,aiplatform.googleapis.com/BatchPredictionJob\x12Rprojects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}B\xdb\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x17\x42\x61tchPredictionJobProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.batch_prediction_job_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\027BatchPredictionJobProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _BATCHPREDICTIONJOB_INPUTCONFIG.fields_by_name['instances_format']._options = None
  _BATCHPREDICTIONJOB_INPUTCONFIG.fields_by_name['instances_format']._serialized_options = b'\340A\002'
  _BATCHPREDICTIONJOB_OUTPUTCONFIG.fields_by_name['predictions_format']._options = None
  _BATCHPREDICTIONJOB_OUTPUTCONFIG.fields_by_name['predictions_format']._serialized_options = b'\340A\002'
  _BATCHPREDICTIONJOB_OUTPUTINFO.fields_by_name['gcs_output_directory']._options = None
  _BATCHPREDICTIONJOB_OUTPUTINFO.fields_by_name['gcs_output_directory']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB_OUTPUTINFO.fields_by_name['bigquery_output_dataset']._options = None
  _BATCHPREDICTIONJOB_OUTPUTINFO.fields_by_name['bigquery_output_dataset']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB_OUTPUTINFO.fields_by_name['bigquery_output_table']._options = None
  _BATCHPREDICTIONJOB_OUTPUTINFO.fields_by_name['bigquery_output_table']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB_LABELSENTRY._options = None
  _BATCHPREDICTIONJOB_LABELSENTRY._serialized_options = b'8\001'
  _BATCHPREDICTIONJOB.fields_by_name['name']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['name']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['display_name']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _BATCHPREDICTIONJOB.fields_by_name['model']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['model']._serialized_options = b'\372A!\n\037aiplatform.googleapis.com/Model'
  _BATCHPREDICTIONJOB.fields_by_name['model_version_id']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['model_version_id']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['input_config']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['input_config']._serialized_options = b'\340A\002'
  _BATCHPREDICTIONJOB.fields_by_name['output_config']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['output_config']._serialized_options = b'\340A\002'
  _BATCHPREDICTIONJOB.fields_by_name['manual_batch_tuning_parameters']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['manual_batch_tuning_parameters']._serialized_options = b'\340A\005'
  _BATCHPREDICTIONJOB.fields_by_name['output_info']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['output_info']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['state']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['state']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['error']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['error']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['partial_failures']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['partial_failures']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['resources_consumed']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['resources_consumed']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['completion_stats']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['completion_stats']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['create_time']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['start_time']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['end_time']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB.fields_by_name['update_time']._options = None
  _BATCHPREDICTIONJOB.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _BATCHPREDICTIONJOB._options = None
  _BATCHPREDICTIONJOB._serialized_options = b'\352A\202\001\n,aiplatform.googleapis.com/BatchPredictionJob\022Rprojects/{project}/locations/{location}/batchPredictionJobs/{batch_prediction_job}'
  _BATCHPREDICTIONJOB._serialized_start=639
  _BATCHPREDICTIONJOB._serialized_end=2897
  _BATCHPREDICTIONJOB_INPUTCONFIG._serialized_start=2163
  _BATCHPREDICTIONJOB_INPUTCONFIG._serialized_end=2349
  _BATCHPREDICTIONJOB_OUTPUTCONFIG._serialized_start=2352
  _BATCHPREDICTIONJOB_OUTPUTCONFIG._serialized_end=2566
  _BATCHPREDICTIONJOB_OUTPUTINFO._serialized_start=2569
  _BATCHPREDICTIONJOB_OUTPUTINFO._serialized_end=2713
  _BATCHPREDICTIONJOB_LABELSENTRY._serialized_start=2715
  _BATCHPREDICTIONJOB_LABELSENTRY._serialized_end=2760
# @@protoc_insertion_point(module_scope)
