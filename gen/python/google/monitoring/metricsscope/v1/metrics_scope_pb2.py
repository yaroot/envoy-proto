# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/metricsscope/v1/metrics_scope.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/monitoring/metricsscope/v1/metrics_scope.proto',
  package='google.monitoring.metricsscope.v1',
  syntax='proto3',
  serialized_options=b'\n%com.google.monitoring.metricsscope.v1B\021MetricsScopeProtoP\001ZMgoogle.golang.org/genproto/googleapis/monitoring/metricsscope/v1;metricsscope\252\002\'Google.Cloud.Monitoring.MetricsScope.V1\312\002\'Google\\Cloud\\Monitoring\\MetricsScope\\V1\352\002+Google::Cloud::Monitoring::MetricsScope::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/monitoring/metricsscope/v1/metrics_scope.proto\x12!google.monitoring.metricsscope.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xbf\x02\n\x0cMetricsScope\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12T\n\x12monitored_projects\x18\x04 \x03(\x0b\x32\x33.google.monitoring.metricsscope.v1.MonitoredProjectB\x03\xe0\x41\x03:Z\xea\x41W\n&monitoring.googleapis.com/MetricsScope\x12-locations/global/metricsScope/{metrics_scope}\"\xcf\x01\n\x10MonitoredProject\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03:r\xea\x41o\n*monitoring.googleapis.com/MonitoredProject\x12\x41locations/global/metricsScopes/{metrics_scope}/projects/{project}B\x8d\x02\n%com.google.monitoring.metricsscope.v1B\x11MetricsScopeProtoP\x01ZMgoogle.golang.org/genproto/googleapis/monitoring/metricsscope/v1;metricsscope\xaa\x02\'Google.Cloud.Monitoring.MetricsScope.V1\xca\x02\'Google\\Cloud\\Monitoring\\MetricsScope\\V1\xea\x02+Google::Cloud::Monitoring::MetricsScope::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_METRICSSCOPE = _descriptor.Descriptor(
  name='MetricsScope',
  full_name='google.monitoring.metricsscope.v1.MetricsScope',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.metricsscope.v1.MetricsScope.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.monitoring.metricsscope.v1.MetricsScope.create_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.monitoring.metricsscope.v1.MetricsScope.update_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='monitored_projects', full_name='google.monitoring.metricsscope.v1.MetricsScope.monitored_projects', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AW\n&monitoring.googleapis.com/MetricsScope\022-locations/global/metricsScope/{metrics_scope}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=186,
  serialized_end=505,
)


_MONITOREDPROJECT = _descriptor.Descriptor(
  name='MonitoredProject',
  full_name='google.monitoring.metricsscope.v1.MonitoredProject',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.metricsscope.v1.MonitoredProject.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.monitoring.metricsscope.v1.MonitoredProject.create_time', index=1,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352Ao\n*monitoring.googleapis.com/MonitoredProject\022Alocations/global/metricsScopes/{metrics_scope}/projects/{project}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=508,
  serialized_end=715,
)

_METRICSSCOPE.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_METRICSSCOPE.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_METRICSSCOPE.fields_by_name['monitored_projects'].message_type = _MONITOREDPROJECT
_MONITOREDPROJECT.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['MetricsScope'] = _METRICSSCOPE
DESCRIPTOR.message_types_by_name['MonitoredProject'] = _MONITOREDPROJECT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MetricsScope = _reflection.GeneratedProtocolMessageType('MetricsScope', (_message.Message,), {
  'DESCRIPTOR' : _METRICSSCOPE,
  '__module__' : 'google.monitoring.metricsscope.v1.metrics_scope_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.metricsscope.v1.MetricsScope)
  })
_sym_db.RegisterMessage(MetricsScope)

MonitoredProject = _reflection.GeneratedProtocolMessageType('MonitoredProject', (_message.Message,), {
  'DESCRIPTOR' : _MONITOREDPROJECT,
  '__module__' : 'google.monitoring.metricsscope.v1.metrics_scope_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.metricsscope.v1.MonitoredProject)
  })
_sym_db.RegisterMessage(MonitoredProject)


DESCRIPTOR._options = None
_METRICSSCOPE.fields_by_name['name']._options = None
_METRICSSCOPE.fields_by_name['create_time']._options = None
_METRICSSCOPE.fields_by_name['update_time']._options = None
_METRICSSCOPE.fields_by_name['monitored_projects']._options = None
_METRICSSCOPE._options = None
_MONITOREDPROJECT.fields_by_name['name']._options = None
_MONITOREDPROJECT.fields_by_name['create_time']._options = None
_MONITOREDPROJECT._options = None
# @@protoc_insertion_point(module_scope)