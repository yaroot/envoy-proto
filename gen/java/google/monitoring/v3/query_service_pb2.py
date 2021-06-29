# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/v3/query_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import label_pb2 as google_dot_api_dot_label__pb2
from google.monitoring.v3 import metric_pb2 as google_dot_monitoring_dot_v3_dot_metric__pb2
from google.monitoring.v3 import metric_service_pb2 as google_dot_monitoring_dot_v3_dot_metric__service__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/monitoring/v3/query_service.proto',
  package='google.monitoring.v3',
  syntax='proto3',
  serialized_options=b'\n\030com.google.monitoring.v3B\021QueryServiceProtoP\001Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\252\002\032Google.Cloud.Monitoring.V3\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Google::Cloud::Monitoring::V3',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(google/monitoring/v3/query_service.proto\x12\x14google.monitoring.v3\x1a\x1cgoogle/api/annotations.proto\x1a\x16google/api/label.proto\x1a!google/monitoring/v3/metric.proto\x1a)google/monitoring/v3/metric_service.proto\x1a\x17google/api/client.proto2\xde\x02\n\x0cQueryService\x12\xa1\x01\n\x0fQueryTimeSeries\x12,.google.monitoring.v3.QueryTimeSeriesRequest\x1a-.google.monitoring.v3.QueryTimeSeriesResponse\"1\x82\xd3\xe4\x93\x02+\"&/v3/{name=projects/*}/timeSeries:query:\x01*\x1a\xa9\x01\xca\x41\x19monitoring.googleapis.com\xd2\x41\x89\x01https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https://www.googleapis.com/auth/monitoring.readB\xc9\x01\n\x18\x63om.google.monitoring.v3B\x11QueryServiceProtoP\x01Z>google.golang.org/genproto/googleapis/monitoring/v3;monitoring\xaa\x02\x1aGoogle.Cloud.Monitoring.V3\xca\x02\x1aGoogle\\Cloud\\Monitoring\\V3\xea\x02\x1dGoogle::Cloud::Monitoring::V3b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_label__pb2.DESCRIPTOR,google_dot_monitoring_dot_v3_dot_metric__pb2.DESCRIPTOR,google_dot_monitoring_dot_v3_dot_metric__service__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_QUERYSERVICE = _descriptor.ServiceDescriptor(
  name='QueryService',
  full_name='google.monitoring.v3.QueryService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\031monitoring.googleapis.com\322A\211\001https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/monitoring,https://www.googleapis.com/auth/monitoring.read',
  create_key=_descriptor._internal_create_key,
  serialized_start=224,
  serialized_end=574,
  methods=[
  _descriptor.MethodDescriptor(
    name='QueryTimeSeries',
    full_name='google.monitoring.v3.QueryService.QueryTimeSeries',
    index=0,
    containing_service=None,
    input_type=google_dot_monitoring_dot_v3_dot_metric__service__pb2._QUERYTIMESERIESREQUEST,
    output_type=google_dot_monitoring_dot_v3_dot_metric__service__pb2._QUERYTIMESERIESRESPONSE,
    serialized_options=b'\202\323\344\223\002+\"&/v3/{name=projects/*}/timeSeries:query:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_QUERYSERVICE)

DESCRIPTOR.services_by_name['QueryService'] = _QUERYSERVICE

# @@protoc_insertion_point(module_scope)