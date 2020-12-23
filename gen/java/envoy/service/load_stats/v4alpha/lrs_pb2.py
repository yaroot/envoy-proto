# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/load_stats/v4alpha/lrs.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import base_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2
from envoy.config.endpoint.v3 import load_report_pb2 as envoy_dot_config_dot_endpoint_dot_v3_dot_load__report__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/service/load_stats/v4alpha/lrs.proto',
  package='envoy.service.load_stats.v4alpha',
  syntax='proto3',
  serialized_options=b'\n.io.envoyproxy.envoy.service.load_stats.v4alphaB\010LrsProtoP\001\210\001\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n*envoy/service/load_stats/v4alpha/lrs.proto\x12 envoy.service.load_stats.v4alpha\x1a$envoy/config/core/v4alpha/base.proto\x1a*envoy/config/endpoint/v3/load_report.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xb5\x01\n\x10LoadStatsRequest\x12-\n\x04node\x18\x01 \x01(\x0b\x32\x1f.envoy.config.core.v4alpha.Node\x12=\n\rcluster_stats\x18\x02 \x03(\x0b\x32&.envoy.config.endpoint.v3.ClusterStats:3\x9a\xc5\x88\x1e.\n,envoy.service.load_stats.v3.LoadStatsRequest\"\xd7\x01\n\x11LoadStatsResponse\x12\x10\n\x08\x63lusters\x18\x01 \x03(\t\x12\x19\n\x11send_all_clusters\x18\x04 \x01(\x08\x12:\n\x17load_reporting_interval\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12#\n\x1breport_endpoint_granularity\x18\x03 \x01(\x08:4\x9a\xc5\x88\x1e/\n-envoy.service.load_stats.v3.LoadStatsResponse2\x99\x01\n\x14LoadReportingService\x12\x80\x01\n\x0fStreamLoadStats\x12\x32.envoy.service.load_stats.v4alpha.LoadStatsRequest\x1a\x33.envoy.service.load_stats.v4alpha.LoadStatsResponse\"\x00(\x01\x30\x01\x42G\n.io.envoyproxy.envoy.service.load_stats.v4alphaB\x08LrsProtoP\x01\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2.DESCRIPTOR,envoy_dot_config_dot_endpoint_dot_v3_dot_load__report__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_LOADSTATSREQUEST = _descriptor.Descriptor(
  name='LoadStatsRequest',
  full_name='envoy.service.load_stats.v4alpha.LoadStatsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='node', full_name='envoy.service.load_stats.v4alpha.LoadStatsRequest.node', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_stats', full_name='envoy.service.load_stats.v4alpha.LoadStatsRequest.cluster_stats', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036.\n,envoy.service.load_stats.v3.LoadStatsRequest',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=286,
  serialized_end=467,
)


_LOADSTATSRESPONSE = _descriptor.Descriptor(
  name='LoadStatsResponse',
  full_name='envoy.service.load_stats.v4alpha.LoadStatsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='clusters', full_name='envoy.service.load_stats.v4alpha.LoadStatsResponse.clusters', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='send_all_clusters', full_name='envoy.service.load_stats.v4alpha.LoadStatsResponse.send_all_clusters', index=1,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='load_reporting_interval', full_name='envoy.service.load_stats.v4alpha.LoadStatsResponse.load_reporting_interval', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='report_endpoint_granularity', full_name='envoy.service.load_stats.v4alpha.LoadStatsResponse.report_endpoint_granularity', index=3,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036/\n-envoy.service.load_stats.v3.LoadStatsResponse',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=470,
  serialized_end=685,
)

_LOADSTATSREQUEST.fields_by_name['node'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._NODE
_LOADSTATSREQUEST.fields_by_name['cluster_stats'].message_type = envoy_dot_config_dot_endpoint_dot_v3_dot_load__report__pb2._CLUSTERSTATS
_LOADSTATSRESPONSE.fields_by_name['load_reporting_interval'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
DESCRIPTOR.message_types_by_name['LoadStatsRequest'] = _LOADSTATSREQUEST
DESCRIPTOR.message_types_by_name['LoadStatsResponse'] = _LOADSTATSRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LoadStatsRequest = _reflection.GeneratedProtocolMessageType('LoadStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _LOADSTATSREQUEST,
  '__module__' : 'envoy.service.load_stats.v4alpha.lrs_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.load_stats.v4alpha.LoadStatsRequest)
  })
_sym_db.RegisterMessage(LoadStatsRequest)

LoadStatsResponse = _reflection.GeneratedProtocolMessageType('LoadStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _LOADSTATSRESPONSE,
  '__module__' : 'envoy.service.load_stats.v4alpha.lrs_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.load_stats.v4alpha.LoadStatsResponse)
  })
_sym_db.RegisterMessage(LoadStatsResponse)


DESCRIPTOR._options = None
_LOADSTATSREQUEST._options = None
_LOADSTATSRESPONSE._options = None

_LOADREPORTINGSERVICE = _descriptor.ServiceDescriptor(
  name='LoadReportingService',
  full_name='envoy.service.load_stats.v4alpha.LoadReportingService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=688,
  serialized_end=841,
  methods=[
  _descriptor.MethodDescriptor(
    name='StreamLoadStats',
    full_name='envoy.service.load_stats.v4alpha.LoadReportingService.StreamLoadStats',
    index=0,
    containing_service=None,
    input_type=_LOADSTATSREQUEST,
    output_type=_LOADSTATSRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_LOADREPORTINGSERVICE)

DESCRIPTOR.services_by_name['LoadReportingService'] = _LOADREPORTINGSERVICE

# @@protoc_insertion_point(module_scope)
