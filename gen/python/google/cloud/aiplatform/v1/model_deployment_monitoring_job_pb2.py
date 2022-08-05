# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/model_deployment_monitoring_job.proto
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
from google.cloud.aiplatform.v1 import feature_monitoring_stats_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_feature__monitoring__stats__pb2
from google.cloud.aiplatform.v1 import io_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_io__pb2
from google.cloud.aiplatform.v1 import job_state_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_job__state__pb2
from google.cloud.aiplatform.v1 import model_monitoring_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_model__monitoring__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/cloud/aiplatform/v1/model_deployment_monitoring_job.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x30google/cloud/aiplatform/v1/encryption_spec.proto\x1a\x39google/cloud/aiplatform/v1/feature_monitoring_stats.proto\x1a#google/cloud/aiplatform/v1/io.proto\x1a*google/cloud/aiplatform/v1/job_state.proto\x1a\x31google/cloud/aiplatform/v1/model_monitoring.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xad\x10\n\x1cModelDeploymentMonitoringJob\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12<\n\x08\x65ndpoint\x18\x03 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"aiplatform.googleapis.com/Endpoint\x12\x38\n\x05state\x18\x04 \x01(\x0e\x32$.google.cloud.aiplatform.v1.JobStateB\x03\xe0\x41\x03\x12m\n\x0eschedule_state\x18\x05 \x01(\x0e\x32P.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.MonitoringScheduleStateB\x03\xe0\x41\x03\x12\x8b\x01\n#latest_monitoring_pipeline_metadata\x18\x19 \x01(\x0b\x32Y.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.LatestMonitoringPipelineMetadataB\x03\xe0\x41\x03\x12\x80\x01\n-model_deployment_monitoring_objective_configs\x18\x06 \x03(\x0b\x32\x44.google.cloud.aiplatform.v1.ModelDeploymentMonitoringObjectiveConfigB\x03\xe0\x41\x02\x12}\n+model_deployment_monitoring_schedule_config\x18\x07 \x01(\x0b\x32\x43.google.cloud.aiplatform.v1.ModelDeploymentMonitoringScheduleConfigB\x03\xe0\x41\x02\x12T\n\x19logging_sampling_strategy\x18\x08 \x01(\x0b\x32,.google.cloud.aiplatform.v1.SamplingStrategyB\x03\xe0\x41\x02\x12]\n\x1dmodel_monitoring_alert_config\x18\x0f \x01(\x0b\x32\x36.google.cloud.aiplatform.v1.ModelMonitoringAlertConfig\x12#\n\x1bpredict_instance_schema_uri\x18\t \x01(\t\x12\x37\n\x17sample_predict_instance\x18\x13 \x01(\x0b\x32\x16.google.protobuf.Value\x12$\n\x1c\x61nalysis_instance_schema_uri\x18\x10 \x01(\t\x12`\n\x0f\x62igquery_tables\x18\n \x03(\x0b\x32\x42.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTableB\x03\xe0\x41\x03\x12*\n\x07log_ttl\x18\x11 \x01(\x0b\x32\x19.google.protobuf.Duration\x12T\n\x06labels\x18\x0b \x03(\x0b\x32\x44.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJob.LabelsEntry\x12\x34\n\x0b\x63reate_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12;\n\x12next_schedule_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12R\n\x1estats_anomalies_base_directory\x18\x14 \x01(\x0b\x32*.google.cloud.aiplatform.v1.GcsDestination\x12\x43\n\x0f\x65ncryption_spec\x18\x15 \x01(\x0b\x32*.google.cloud.aiplatform.v1.EncryptionSpec\x12\'\n\x1f\x65nable_monitoring_pipeline_logs\x18\x16 \x01(\x08\x12&\n\x05\x65rror\x18\x17 \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x1at\n LatestMonitoringPipelineMetadata\x12,\n\x08run_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\"\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"k\n\x17MonitoringScheduleState\x12)\n%MONITORING_SCHEDULE_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0b\n\x07OFFLINE\x10\x02\x12\x0b\n\x07RUNNING\x10\x03:\xa5\x01\xea\x41\xa1\x01\n6aiplatform.googleapis.com/ModelDeploymentMonitoringJob\x12gprojects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}\"\x88\x03\n&ModelDeploymentMonitoringBigQueryTable\x12`\n\nlog_source\x18\x01 \x01(\x0e\x32L.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogSource\x12\\\n\x08log_type\x18\x02 \x01(\x0e\x32J.google.cloud.aiplatform.v1.ModelDeploymentMonitoringBigQueryTable.LogType\x12\x1b\n\x13\x62igquery_table_path\x18\x03 \x01(\t\"B\n\tLogSource\x12\x1a\n\x16LOG_SOURCE_UNSPECIFIED\x10\x00\x12\x0c\n\x08TRAINING\x10\x01\x12\x0b\n\x07SERVING\x10\x02\"=\n\x07LogType\x12\x18\n\x14LOG_TYPE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PREDICT\x10\x01\x12\x0b\n\x07\x45XPLAIN\x10\x02\"\x9b\x01\n(ModelDeploymentMonitoringObjectiveConfig\x12\x19\n\x11\x64\x65ployed_model_id\x18\x01 \x01(\t\x12T\n\x10objective_config\x18\x02 \x01(\x0b\x32:.google.cloud.aiplatform.v1.ModelMonitoringObjectiveConfig\"\x96\x01\n\'ModelDeploymentMonitoringScheduleConfig\x12\x38\n\x10monitor_interval\x18\x01 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x02\x12\x31\n\x0emonitor_window\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"\xac\x04\n\x1dModelMonitoringStatsAnomalies\x12U\n\tobjective\x18\x01 \x01(\x0e\x32\x42.google.cloud.aiplatform.v1.ModelDeploymentMonitoringObjectiveType\x12\x19\n\x11\x64\x65ployed_model_id\x18\x02 \x01(\t\x12\x15\n\ranomaly_count\x18\x03 \x01(\x05\x12n\n\rfeature_stats\x18\x04 \x03(\x0b\x32W.google.cloud.aiplatform.v1.ModelMonitoringStatsAnomalies.FeatureHistoricStatsAnomalies\x1a\x91\x02\n\x1d\x46\x65\x61tureHistoricStatsAnomalies\x12\x1c\n\x14\x66\x65\x61ture_display_name\x18\x01 \x01(\t\x12>\n\tthreshold\x18\x03 \x01(\x0b\x32+.google.cloud.aiplatform.v1.ThresholdConfig\x12G\n\x0etraining_stats\x18\x04 \x01(\x0b\x32/.google.cloud.aiplatform.v1.FeatureStatsAnomaly\x12I\n\x10prediction_stats\x18\x05 \x03(\x0b\x32/.google.cloud.aiplatform.v1.FeatureStatsAnomaly*\xce\x01\n&ModelDeploymentMonitoringObjectiveType\x12:\n6MODEL_DEPLOYMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIFIED\x10\x00\x12\x14\n\x10RAW_FEATURE_SKEW\x10\x01\x12\x15\n\x11RAW_FEATURE_DRIFT\x10\x02\x12\x1c\n\x18\x46\x45\x41TURE_ATTRIBUTION_SKEW\x10\x03\x12\x1d\n\x19\x46\x45\x41TURE_ATTRIBUTION_DRIFT\x10\x04\x42\xe5\x01\n\x1e\x63om.google.cloud.aiplatform.v1B!ModelDeploymentMonitoringJobProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.model_deployment_monitoring_job_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B!ModelDeploymentMonitoringJobProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _MODELDEPLOYMENTMONITORINGJOB_LABELSENTRY._options = None
  _MODELDEPLOYMENTMONITORINGJOB_LABELSENTRY._serialized_options = b'8\001'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['name']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['name']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['display_name']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['endpoint']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['endpoint']._serialized_options = b'\340A\002\372A$\n\"aiplatform.googleapis.com/Endpoint'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['state']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['state']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['schedule_state']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['schedule_state']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['latest_monitoring_pipeline_metadata']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['latest_monitoring_pipeline_metadata']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['model_deployment_monitoring_objective_configs']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['model_deployment_monitoring_objective_configs']._serialized_options = b'\340A\002'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['model_deployment_monitoring_schedule_config']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['model_deployment_monitoring_schedule_config']._serialized_options = b'\340A\002'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['logging_sampling_strategy']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['logging_sampling_strategy']._serialized_options = b'\340A\002'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['bigquery_tables']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['bigquery_tables']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['create_time']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['update_time']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['next_schedule_time']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['next_schedule_time']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['error']._options = None
  _MODELDEPLOYMENTMONITORINGJOB.fields_by_name['error']._serialized_options = b'\340A\003'
  _MODELDEPLOYMENTMONITORINGJOB._options = None
  _MODELDEPLOYMENTMONITORINGJOB._serialized_options = b'\352A\241\001\n6aiplatform.googleapis.com/ModelDeploymentMonitoringJob\022gprojects/{project}/locations/{location}/modelDeploymentMonitoringJobs/{model_deployment_monitoring_job}'
  _MODELDEPLOYMENTMONITORINGSCHEDULECONFIG.fields_by_name['monitor_interval']._options = None
  _MODELDEPLOYMENTMONITORINGSCHEDULECONFIG.fields_by_name['monitor_interval']._serialized_options = b'\340A\002'
  _MODELDEPLOYMENTMONITORINGOBJECTIVETYPE._serialized_start=3879
  _MODELDEPLOYMENTMONITORINGOBJECTIVETYPE._serialized_end=4085
  _MODELDEPLOYMENTMONITORINGJOB._serialized_start=518
  _MODELDEPLOYMENTMONITORINGJOB._serialized_end=2611
  _MODELDEPLOYMENTMONITORINGJOB_LATESTMONITORINGPIPELINEMETADATA._serialized_start=2171
  _MODELDEPLOYMENTMONITORINGJOB_LATESTMONITORINGPIPELINEMETADATA._serialized_end=2287
  _MODELDEPLOYMENTMONITORINGJOB_LABELSENTRY._serialized_start=2289
  _MODELDEPLOYMENTMONITORINGJOB_LABELSENTRY._serialized_end=2334
  _MODELDEPLOYMENTMONITORINGJOB_MONITORINGSCHEDULESTATE._serialized_start=2336
  _MODELDEPLOYMENTMONITORINGJOB_MONITORINGSCHEDULESTATE._serialized_end=2443
  _MODELDEPLOYMENTMONITORINGBIGQUERYTABLE._serialized_start=2614
  _MODELDEPLOYMENTMONITORINGBIGQUERYTABLE._serialized_end=3006
  _MODELDEPLOYMENTMONITORINGBIGQUERYTABLE_LOGSOURCE._serialized_start=2877
  _MODELDEPLOYMENTMONITORINGBIGQUERYTABLE_LOGSOURCE._serialized_end=2943
  _MODELDEPLOYMENTMONITORINGBIGQUERYTABLE_LOGTYPE._serialized_start=2945
  _MODELDEPLOYMENTMONITORINGBIGQUERYTABLE_LOGTYPE._serialized_end=3006
  _MODELDEPLOYMENTMONITORINGOBJECTIVECONFIG._serialized_start=3009
  _MODELDEPLOYMENTMONITORINGOBJECTIVECONFIG._serialized_end=3164
  _MODELDEPLOYMENTMONITORINGSCHEDULECONFIG._serialized_start=3167
  _MODELDEPLOYMENTMONITORINGSCHEDULECONFIG._serialized_end=3317
  _MODELMONITORINGSTATSANOMALIES._serialized_start=3320
  _MODELMONITORINGSTATSANOMALIES._serialized_end=3876
  _MODELMONITORINGSTATSANOMALIES_FEATUREHISTORICSTATSANOMALIES._serialized_start=3603
  _MODELMONITORINGSTATSANOMALIES_FEATUREHISTORICSTATSANOMALIES._serialized_end=3876
# @@protoc_insertion_point(module_scope)
