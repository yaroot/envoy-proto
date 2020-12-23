# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/api/servicecontrol/v1/metric_value.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api.servicecontrol.v1 import distribution_pb2 as google_dot_api_dot_servicecontrol_dot_v1_dot_distribution__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/api/servicecontrol/v1/metric_value.proto',
  package='google.api.servicecontrol.v1',
  syntax='proto3',
  serialized_options=b'\n com.google.api.servicecontrol.v1B\023MetricValueSetProtoP\001ZJgoogle.golang.org/genproto/googleapis/api/servicecontrol/v1;servicecontrol\370\001\001\252\002\036Google.Cloud.ServiceControl.V1\312\002\036Google\\Cloud\\ServiceControl\\V1\352\002!Google::Cloud::ServiceControl::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/google/api/servicecontrol/v1/metric_value.proto\x12\x1cgoogle.api.servicecontrol.v1\x1a/google/api/servicecontrol/v1/distribution.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x91\x03\n\x0bMetricValue\x12\x45\n\x06labels\x18\x01 \x03(\x0b\x32\x35.google.api.servicecontrol.v1.MetricValue.LabelsEntry\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x14\n\nbool_value\x18\x04 \x01(\x08H\x00\x12\x15\n\x0bint64_value\x18\x05 \x01(\x03H\x00\x12\x16\n\x0c\x64ouble_value\x18\x06 \x01(\x01H\x00\x12\x16\n\x0cstring_value\x18\x07 \x01(\tH\x00\x12H\n\x12\x64istribution_value\x18\x08 \x01(\x0b\x32*.google.api.servicecontrol.v1.DistributionH\x00\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\x07\n\x05value\"g\n\x0eMetricValueSet\x12\x13\n\x0bmetric_name\x18\x01 \x01(\t\x12@\n\rmetric_values\x18\x02 \x03(\x0b\x32).google.api.servicecontrol.v1.MetricValueB\xee\x01\n com.google.api.servicecontrol.v1B\x13MetricValueSetProtoP\x01ZJgoogle.golang.org/genproto/googleapis/api/servicecontrol/v1;servicecontrol\xf8\x01\x01\xaa\x02\x1eGoogle.Cloud.ServiceControl.V1\xca\x02\x1eGoogle\\Cloud\\ServiceControl\\V1\xea\x02!Google::Cloud::ServiceControl::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_servicecontrol_dot_v1_dot_distribution__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_METRICVALUE_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.api.servicecontrol.v1.MetricValue.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.api.servicecontrol.v1.MetricValue.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.api.servicecontrol.v1.MetricValue.LabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=511,
  serialized_end=556,
)

_METRICVALUE = _descriptor.Descriptor(
  name='MetricValue',
  full_name='google.api.servicecontrol.v1.MetricValue',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.api.servicecontrol.v1.MetricValue.labels', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_time', full_name='google.api.servicecontrol.v1.MetricValue.start_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_time', full_name='google.api.servicecontrol.v1.MetricValue.end_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='bool_value', full_name='google.api.servicecontrol.v1.MetricValue.bool_value', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='int64_value', full_name='google.api.servicecontrol.v1.MetricValue.int64_value', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='double_value', full_name='google.api.servicecontrol.v1.MetricValue.double_value', index=5,
      number=6, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='string_value', full_name='google.api.servicecontrol.v1.MetricValue.string_value', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='distribution_value', full_name='google.api.servicecontrol.v1.MetricValue.distribution_value', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_METRICVALUE_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='value', full_name='google.api.servicecontrol.v1.MetricValue.value',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=164,
  serialized_end=565,
)


_METRICVALUESET = _descriptor.Descriptor(
  name='MetricValueSet',
  full_name='google.api.servicecontrol.v1.MetricValueSet',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='metric_name', full_name='google.api.servicecontrol.v1.MetricValueSet.metric_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metric_values', full_name='google.api.servicecontrol.v1.MetricValueSet.metric_values', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=567,
  serialized_end=670,
)

_METRICVALUE_LABELSENTRY.containing_type = _METRICVALUE
_METRICVALUE.fields_by_name['labels'].message_type = _METRICVALUE_LABELSENTRY
_METRICVALUE.fields_by_name['start_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_METRICVALUE.fields_by_name['end_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_METRICVALUE.fields_by_name['distribution_value'].message_type = google_dot_api_dot_servicecontrol_dot_v1_dot_distribution__pb2._DISTRIBUTION
_METRICVALUE.oneofs_by_name['value'].fields.append(
  _METRICVALUE.fields_by_name['bool_value'])
_METRICVALUE.fields_by_name['bool_value'].containing_oneof = _METRICVALUE.oneofs_by_name['value']
_METRICVALUE.oneofs_by_name['value'].fields.append(
  _METRICVALUE.fields_by_name['int64_value'])
_METRICVALUE.fields_by_name['int64_value'].containing_oneof = _METRICVALUE.oneofs_by_name['value']
_METRICVALUE.oneofs_by_name['value'].fields.append(
  _METRICVALUE.fields_by_name['double_value'])
_METRICVALUE.fields_by_name['double_value'].containing_oneof = _METRICVALUE.oneofs_by_name['value']
_METRICVALUE.oneofs_by_name['value'].fields.append(
  _METRICVALUE.fields_by_name['string_value'])
_METRICVALUE.fields_by_name['string_value'].containing_oneof = _METRICVALUE.oneofs_by_name['value']
_METRICVALUE.oneofs_by_name['value'].fields.append(
  _METRICVALUE.fields_by_name['distribution_value'])
_METRICVALUE.fields_by_name['distribution_value'].containing_oneof = _METRICVALUE.oneofs_by_name['value']
_METRICVALUESET.fields_by_name['metric_values'].message_type = _METRICVALUE
DESCRIPTOR.message_types_by_name['MetricValue'] = _METRICVALUE
DESCRIPTOR.message_types_by_name['MetricValueSet'] = _METRICVALUESET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MetricValue = _reflection.GeneratedProtocolMessageType('MetricValue', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _METRICVALUE_LABELSENTRY,
    '__module__' : 'google.api.servicecontrol.v1.metric_value_pb2'
    # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.MetricValue.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _METRICVALUE,
  '__module__' : 'google.api.servicecontrol.v1.metric_value_pb2'
  # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.MetricValue)
  })
_sym_db.RegisterMessage(MetricValue)
_sym_db.RegisterMessage(MetricValue.LabelsEntry)

MetricValueSet = _reflection.GeneratedProtocolMessageType('MetricValueSet', (_message.Message,), {
  'DESCRIPTOR' : _METRICVALUESET,
  '__module__' : 'google.api.servicecontrol.v1.metric_value_pb2'
  # @@protoc_insertion_point(class_scope:google.api.servicecontrol.v1.MetricValueSet)
  })
_sym_db.RegisterMessage(MetricValueSet)


DESCRIPTOR._options = None
_METRICVALUE_LABELSENTRY._options = None
# @@protoc_insertion_point(module_scope)
