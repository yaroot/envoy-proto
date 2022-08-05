# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/feature.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.aiplatform.v1beta1 import feature_monitoring_stats_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_feature__monitoring__stats__pb2
from google.cloud.aiplatform.v1beta1 import featurestore_monitoring_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_featurestore__monitoring__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-google/cloud/aiplatform/v1beta1/feature.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a>google/cloud/aiplatform/v1beta1/feature_monitoring_stats.proto\x1a=google/cloud/aiplatform/v1beta1/featurestore_monitoring.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xae\n\n\x07\x46\x65\x61ture\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12N\n\nvalue_type\x18\x03 \x01(\x0e\x32\x32.google.cloud.aiplatform.v1beta1.Feature.ValueTypeB\x06\xe0\x41\x02\xe0\x41\x05\x12\x34\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12I\n\x06labels\x18\x06 \x03(\x0b\x32\x34.google.cloud.aiplatform.v1beta1.Feature.LabelsEntryB\x03\xe0\x41\x01\x12\x0c\n\x04\x65tag\x18\x07 \x01(\t\x12_\n\x11monitoring_config\x18\t \x01(\x0b\x32=.google.cloud.aiplatform.v1beta1.FeaturestoreMonitoringConfigB\x05\x18\x01\xe0\x41\x01\x12\x1f\n\x12\x64isable_monitoring\x18\x0c \x01(\x08\x42\x03\xe0\x41\x01\x12S\n\x10monitoring_stats\x18\n \x03(\x0b\x32\x34.google.cloud.aiplatform.v1beta1.FeatureStatsAnomalyB\x03\xe0\x41\x03\x12h\n\x1amonitoring_stats_anomalies\x18\x0b \x03(\x0b\x32?.google.cloud.aiplatform.v1beta1.Feature.MonitoringStatsAnomalyB\x03\xe0\x41\x03\x1a\xb1\x02\n\x16MonitoringStatsAnomaly\x12\x61\n\tobjective\x18\x01 \x01(\x0e\x32I.google.cloud.aiplatform.v1beta1.Feature.MonitoringStatsAnomaly.ObjectiveB\x03\xe0\x41\x03\x12X\n\x15\x66\x65\x61ture_stats_anomaly\x18\x02 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1beta1.FeatureStatsAnomalyB\x03\xe0\x41\x03\"Z\n\tObjective\x12\x19\n\x15OBJECTIVE_UNSPECIFIED\x10\x00\x12\x1b\n\x17IMPORT_FEATURE_ANALYSIS\x10\x01\x12\x15\n\x11SNAPSHOT_ANALYSIS\x10\x02\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xa4\x01\n\tValueType\x12\x1a\n\x16VALUE_TYPE_UNSPECIFIED\x10\x00\x12\x08\n\x04\x42OOL\x10\x01\x12\x0e\n\nBOOL_ARRAY\x10\x02\x12\n\n\x06\x44OUBLE\x10\x03\x12\x10\n\x0c\x44OUBLE_ARRAY\x10\x04\x12\t\n\x05INT64\x10\t\x12\x0f\n\x0bINT64_ARRAY\x10\n\x12\n\n\x06STRING\x10\x0b\x12\x10\n\x0cSTRING_ARRAY\x10\x0c\x12\t\n\x05\x42YTES\x10\r:\x9a\x01\xea\x41\x96\x01\n!aiplatform.googleapis.com/Feature\x12qprojects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}B\xe9\x01\n#com.google.cloud.aiplatform.v1beta1B\x0c\x46\x65\x61tureProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\xaa\x02\x1fGoogle.Cloud.AIPlatform.V1Beta1\xca\x02\x1fGoogle\\Cloud\\AIPlatform\\V1beta1\xea\x02\"Google::Cloud::AIPlatform::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.feature_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.aiplatform.v1beta1B\014FeatureProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1'
  _FEATURE_MONITORINGSTATSANOMALY.fields_by_name['objective']._options = None
  _FEATURE_MONITORINGSTATSANOMALY.fields_by_name['objective']._serialized_options = b'\340A\003'
  _FEATURE_MONITORINGSTATSANOMALY.fields_by_name['feature_stats_anomaly']._options = None
  _FEATURE_MONITORINGSTATSANOMALY.fields_by_name['feature_stats_anomaly']._serialized_options = b'\340A\003'
  _FEATURE_LABELSENTRY._options = None
  _FEATURE_LABELSENTRY._serialized_options = b'8\001'
  _FEATURE.fields_by_name['name']._options = None
  _FEATURE.fields_by_name['name']._serialized_options = b'\340A\005'
  _FEATURE.fields_by_name['value_type']._options = None
  _FEATURE.fields_by_name['value_type']._serialized_options = b'\340A\002\340A\005'
  _FEATURE.fields_by_name['create_time']._options = None
  _FEATURE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _FEATURE.fields_by_name['update_time']._options = None
  _FEATURE.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _FEATURE.fields_by_name['labels']._options = None
  _FEATURE.fields_by_name['labels']._serialized_options = b'\340A\001'
  _FEATURE.fields_by_name['monitoring_config']._options = None
  _FEATURE.fields_by_name['monitoring_config']._serialized_options = b'\030\001\340A\001'
  _FEATURE.fields_by_name['disable_monitoring']._options = None
  _FEATURE.fields_by_name['disable_monitoring']._serialized_options = b'\340A\001'
  _FEATURE.fields_by_name['monitoring_stats']._options = None
  _FEATURE.fields_by_name['monitoring_stats']._serialized_options = b'\340A\003'
  _FEATURE.fields_by_name['monitoring_stats_anomalies']._options = None
  _FEATURE.fields_by_name['monitoring_stats_anomalies']._serialized_options = b'\340A\003'
  _FEATURE._options = None
  _FEATURE._serialized_options = b'\352A\226\001\n!aiplatform.googleapis.com/Feature\022qprojects/{project}/locations/{location}/featurestores/{featurestore}/entityTypes/{entity_type}/features/{feature}'
  _FEATURE._serialized_start=303
  _FEATURE._serialized_end=1629
  _FEATURE_MONITORINGSTATSANOMALY._serialized_start=953
  _FEATURE_MONITORINGSTATSANOMALY._serialized_end=1258
  _FEATURE_MONITORINGSTATSANOMALY_OBJECTIVE._serialized_start=1168
  _FEATURE_MONITORINGSTATSANOMALY_OBJECTIVE._serialized_end=1258
  _FEATURE_LABELSENTRY._serialized_start=1260
  _FEATURE_LABELSENTRY._serialized_end=1305
  _FEATURE_VALUETYPE._serialized_start=1308
  _FEATURE_VALUETYPE._serialized_end=1472
# @@protoc_insertion_point(module_scope)
