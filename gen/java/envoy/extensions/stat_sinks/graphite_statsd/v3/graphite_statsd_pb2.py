# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/stat_sinks/graphite_statsd/v3/graphite_statsd.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import address_pb2 as envoy_dot_config_dot_core_dot_v3_dot_address__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/stat_sinks/graphite_statsd/v3/graphite_statsd.proto',
  package='envoy.extensions.stat_sinks.graphite_statsd.v3',
  syntax='proto3',
  serialized_options=b'\n<io.envoyproxy.envoy.extensions.stat_sinks.graphite_statsd.v3B\023GraphiteStatsdProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDenvoy/extensions/stat_sinks/graphite_statsd/v3/graphite_statsd.proto\x12.envoy.extensions.stat_sinks.graphite_statsd.v3\x1a\"envoy/config/core/v3/address.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xb6\x01\n\x12GraphiteStatsdSink\x12\x30\n\x07\x61\x64\x64ress\x18\x01 \x01(\x0b\x32\x1d.envoy.config.core.v3.AddressH\x00\x12\x0e\n\x06prefix\x18\x03 \x01(\t\x12\x45\n\x16max_bytes_per_datagram\x18\x04 \x01(\x0b\x32\x1c.google.protobuf.UInt64ValueB\x07\xfa\x42\x04\x32\x02 \x00\x42\x17\n\x10statsd_specifier\x12\x03\xf8\x42\x01\x42]\n<io.envoyproxy.envoy.extensions.stat_sinks.graphite_statsd.v3B\x13GraphiteStatsdProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_address__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_GRAPHITESTATSDSINK = _descriptor.Descriptor(
  name='GraphiteStatsdSink',
  full_name='envoy.extensions.stat_sinks.graphite_statsd.v3.GraphiteStatsdSink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='address', full_name='envoy.extensions.stat_sinks.graphite_statsd.v3.GraphiteStatsdSink.address', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='prefix', full_name='envoy.extensions.stat_sinks.graphite_statsd.v3.GraphiteStatsdSink.prefix', index=1,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='max_bytes_per_datagram', full_name='envoy.extensions.stat_sinks.graphite_statsd.v3.GraphiteStatsdSink.max_bytes_per_datagram', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\0042\002 \000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
    _descriptor.OneofDescriptor(
      name='statsd_specifier', full_name='envoy.extensions.stat_sinks.graphite_statsd.v3.GraphiteStatsdSink.statsd_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=245,
  serialized_end=427,
)

_GRAPHITESTATSDSINK.fields_by_name['address'].message_type = envoy_dot_config_dot_core_dot_v3_dot_address__pb2._ADDRESS
_GRAPHITESTATSDSINK.fields_by_name['max_bytes_per_datagram'].message_type = google_dot_protobuf_dot_wrappers__pb2._UINT64VALUE
_GRAPHITESTATSDSINK.oneofs_by_name['statsd_specifier'].fields.append(
  _GRAPHITESTATSDSINK.fields_by_name['address'])
_GRAPHITESTATSDSINK.fields_by_name['address'].containing_oneof = _GRAPHITESTATSDSINK.oneofs_by_name['statsd_specifier']
DESCRIPTOR.message_types_by_name['GraphiteStatsdSink'] = _GRAPHITESTATSDSINK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GraphiteStatsdSink = _reflection.GeneratedProtocolMessageType('GraphiteStatsdSink', (_message.Message,), {
  'DESCRIPTOR' : _GRAPHITESTATSDSINK,
  '__module__' : 'envoy.extensions.stat_sinks.graphite_statsd.v3.graphite_statsd_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.stat_sinks.graphite_statsd.v3.GraphiteStatsdSink)
  })
_sym_db.RegisterMessage(GraphiteStatsdSink)


DESCRIPTOR._options = None
_GRAPHITESTATSDSINK.oneofs_by_name['statsd_specifier']._options = None
_GRAPHITESTATSDSINK.fields_by_name['max_bytes_per_datagram']._options = None
# @@protoc_insertion_point(module_scope)
