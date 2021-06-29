# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/monitoring/dashboard/v1/dashboard.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.monitoring.dashboard.v1 import layouts_pb2 as google_dot_monitoring_dot_dashboard_dot_v1_dot_layouts__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/monitoring/dashboard/v1/dashboard.proto',
  package='google.monitoring.dashboard.v1',
  syntax='proto3',
  serialized_options=b'\n\"com.google.monitoring.dashboard.v1B\017DashboardsProtoP\001ZGgoogle.golang.org/genproto/googleapis/monitoring/dashboard/v1;dashboard\312\002$Google\\Cloud\\Monitoring\\Dashboard\\V1\352\002(Google::Cloud::Monitoring::Dashboard::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.google/monitoring/dashboard/v1/dashboard.proto\x12\x1egoogle.monitoring.dashboard.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a,google/monitoring/dashboard/v1/layouts.proto\"\xb8\x03\n\tDashboard\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x0c\n\x04\x65tag\x18\x04 \x01(\t\x12\x41\n\x0bgrid_layout\x18\x05 \x01(\x0b\x32*.google.monitoring.dashboard.v1.GridLayoutH\x00\x12\x45\n\rmosaic_layout\x18\x06 \x01(\x0b\x32,.google.monitoring.dashboard.v1.MosaicLayoutH\x00\x12?\n\nrow_layout\x18\x08 \x01(\x0b\x32).google.monitoring.dashboard.v1.RowLayoutH\x00\x12\x45\n\rcolumn_layout\x18\t \x01(\x0b\x32,.google.monitoring.dashboard.v1.ColumnLayoutH\x00:S\xea\x41P\n#monitoring.googleapis.com/Dashboard\x12)projects/{project}/dashboards/{dashboard}B\x08\n\x06layoutB\xd2\x01\n\"com.google.monitoring.dashboard.v1B\x0f\x44\x61shboardsProtoP\x01ZGgoogle.golang.org/genproto/googleapis/monitoring/dashboard/v1;dashboard\xca\x02$Google\\Cloud\\Monitoring\\Dashboard\\V1\xea\x02(Google::Cloud::Monitoring::Dashboard::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_monitoring_dot_dashboard_dot_v1_dot_layouts__pb2.DESCRIPTOR,])




_DASHBOARD = _descriptor.Descriptor(
  name='Dashboard',
  full_name='google.monitoring.dashboard.v1.Dashboard',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.monitoring.dashboard.v1.Dashboard.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.monitoring.dashboard.v1.Dashboard.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.monitoring.dashboard.v1.Dashboard.etag', index=2,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='grid_layout', full_name='google.monitoring.dashboard.v1.Dashboard.grid_layout', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mosaic_layout', full_name='google.monitoring.dashboard.v1.Dashboard.mosaic_layout', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='row_layout', full_name='google.monitoring.dashboard.v1.Dashboard.row_layout', index=5,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='column_layout', full_name='google.monitoring.dashboard.v1.Dashboard.column_layout', index=6,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AP\n#monitoring.googleapis.com/Dashboard\022)projects/{project}/dashboards/{dashboard}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='layout', full_name='google.monitoring.dashboard.v1.Dashboard.layout',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=189,
  serialized_end=629,
)

_DASHBOARD.fields_by_name['grid_layout'].message_type = google_dot_monitoring_dot_dashboard_dot_v1_dot_layouts__pb2._GRIDLAYOUT
_DASHBOARD.fields_by_name['mosaic_layout'].message_type = google_dot_monitoring_dot_dashboard_dot_v1_dot_layouts__pb2._MOSAICLAYOUT
_DASHBOARD.fields_by_name['row_layout'].message_type = google_dot_monitoring_dot_dashboard_dot_v1_dot_layouts__pb2._ROWLAYOUT
_DASHBOARD.fields_by_name['column_layout'].message_type = google_dot_monitoring_dot_dashboard_dot_v1_dot_layouts__pb2._COLUMNLAYOUT
_DASHBOARD.oneofs_by_name['layout'].fields.append(
  _DASHBOARD.fields_by_name['grid_layout'])
_DASHBOARD.fields_by_name['grid_layout'].containing_oneof = _DASHBOARD.oneofs_by_name['layout']
_DASHBOARD.oneofs_by_name['layout'].fields.append(
  _DASHBOARD.fields_by_name['mosaic_layout'])
_DASHBOARD.fields_by_name['mosaic_layout'].containing_oneof = _DASHBOARD.oneofs_by_name['layout']
_DASHBOARD.oneofs_by_name['layout'].fields.append(
  _DASHBOARD.fields_by_name['row_layout'])
_DASHBOARD.fields_by_name['row_layout'].containing_oneof = _DASHBOARD.oneofs_by_name['layout']
_DASHBOARD.oneofs_by_name['layout'].fields.append(
  _DASHBOARD.fields_by_name['column_layout'])
_DASHBOARD.fields_by_name['column_layout'].containing_oneof = _DASHBOARD.oneofs_by_name['layout']
DESCRIPTOR.message_types_by_name['Dashboard'] = _DASHBOARD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Dashboard = _reflection.GeneratedProtocolMessageType('Dashboard', (_message.Message,), {
  'DESCRIPTOR' : _DASHBOARD,
  '__module__' : 'google.monitoring.dashboard.v1.dashboard_pb2'
  # @@protoc_insertion_point(class_scope:google.monitoring.dashboard.v1.Dashboard)
  })
_sym_db.RegisterMessage(Dashboard)


DESCRIPTOR._options = None
_DASHBOARD.fields_by_name['name']._options = None
_DASHBOARD.fields_by_name['display_name']._options = None
_DASHBOARD._options = None
# @@protoc_insertion_point(module_scope)
