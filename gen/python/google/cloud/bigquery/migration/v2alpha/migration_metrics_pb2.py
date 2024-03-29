# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/migration/v2alpha/migration_metrics.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import distribution_pb2 as google_dot_api_dot_distribution__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import metric_pb2 as google_dot_api_dot_metric__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/cloud/bigquery/migration/v2alpha/migration_metrics.proto\x12\'google.cloud.bigquery.migration.v2alpha\x1a\x1dgoogle/api/distribution.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x17google/api/metric.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xea\x01\n\nTimeSeries\x12\x13\n\x06metric\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12?\n\nvalue_type\x18\x02 \x01(\x0e\x32&.google.api.MetricDescriptor.ValueTypeB\x03\xe0\x41\x02\x12\x41\n\x0bmetric_kind\x18\x03 \x01(\x0e\x32\'.google.api.MetricDescriptor.MetricKindB\x03\xe0\x41\x01\x12\x43\n\x06points\x18\x04 \x03(\x0b\x32..google.cloud.bigquery.migration.v2alpha.PointB\x03\xe0\x41\x02\"\x94\x01\n\x05Point\x12G\n\x08interval\x18\x01 \x01(\x0b\x32\x35.google.cloud.bigquery.migration.v2alpha.TimeInterval\x12\x42\n\x05value\x18\x02 \x01(\x0b\x32\x33.google.cloud.bigquery.migration.v2alpha.TypedValue\"v\n\x0cTimeInterval\x12\x33\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\"\xaa\x01\n\nTypedValue\x12\x14\n\nbool_value\x18\x01 \x01(\x08H\x00\x12\x15\n\x0bint64_value\x18\x02 \x01(\x03H\x00\x12\x16\n\x0c\x64ouble_value\x18\x03 \x01(\x01H\x00\x12\x16\n\x0cstring_value\x18\x04 \x01(\tH\x00\x12\x36\n\x12\x64istribution_value\x18\x05 \x01(\x0b\x32\x18.google.api.DistributionH\x00\x42\x07\n\x05valueB\xec\x01\n+com.google.cloud.bigquery.migration.v2alphaB\x15MigrationMetricsProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/bigquery/migration/v2alpha;migration\xaa\x02\'Google.Cloud.BigQuery.Migration.V2Alpha\xca\x02\'Google\\Cloud\\BigQuery\\Migration\\V2alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.migration.v2alpha.migration_metrics_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n+com.google.cloud.bigquery.migration.v2alphaB\025MigrationMetricsProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/bigquery/migration/v2alpha;migration\252\002\'Google.Cloud.BigQuery.Migration.V2Alpha\312\002\'Google\\Cloud\\BigQuery\\Migration\\V2alpha'
  _TIMESERIES.fields_by_name['metric']._options = None
  _TIMESERIES.fields_by_name['metric']._serialized_options = b'\340A\002'
  _TIMESERIES.fields_by_name['value_type']._options = None
  _TIMESERIES.fields_by_name['value_type']._serialized_options = b'\340A\002'
  _TIMESERIES.fields_by_name['metric_kind']._options = None
  _TIMESERIES.fields_by_name['metric_kind']._serialized_options = b'\340A\001'
  _TIMESERIES.fields_by_name['points']._options = None
  _TIMESERIES.fields_by_name['points']._serialized_options = b'\340A\002'
  _TIMEINTERVAL.fields_by_name['start_time']._options = None
  _TIMEINTERVAL.fields_by_name['start_time']._serialized_options = b'\340A\001'
  _TIMEINTERVAL.fields_by_name['end_time']._options = None
  _TIMEINTERVAL.fields_by_name['end_time']._serialized_options = b'\340A\002'
  _TIMESERIES._serialized_start=231
  _TIMESERIES._serialized_end=465
  _POINT._serialized_start=468
  _POINT._serialized_end=616
  _TIMEINTERVAL._serialized_start=618
  _TIMEINTERVAL._serialized_end=736
  _TYPEDVALUE._serialized_start=739
  _TYPEDVALUE._serialized_end=909
# @@protoc_insertion_point(module_scope)
