# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/trace/v3/zipkin.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from envoy.annotations import deprecation_pb2 as envoy_dot_annotations_dot_deprecation__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/trace/v3/zipkin.proto',
  package='envoy.config.trace.v3',
  syntax='proto3',
  serialized_options=b'\n#io.envoyproxy.envoy.config.trace.v3B\013ZipkinProtoP\001\362\230\376\217\005)\022\'envoy.extensions.tracers.zipkin.v4alpha\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\"envoy/config/trace/v3/zipkin.proto\x12\x15\x65nvoy.config.trace.v3\x1a\x1egoogle/protobuf/wrappers.proto\x1a#envoy/annotations/deprecation.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xb0\x03\n\x0cZipkinConfig\x12\"\n\x11\x63ollector_cluster\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12#\n\x12\x63ollector_endpoint\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x17\n\x0ftrace_id_128bit\x18\x03 \x01(\x08\x12\x37\n\x13shared_span_context\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.BoolValue\x12`\n\x1a\x63ollector_endpoint_version\x18\x05 \x01(\x0e\x32<.envoy.config.trace.v3.ZipkinConfig.CollectorEndpointVersion\"x\n\x18\x43ollectorEndpointVersion\x12\x33\n%DEPRECATED_AND_UNAVAILABLE_DO_NOT_USE\x10\x00\x1a\x08\x08\x01\xa8\xf7\xb4\x8b\x02\x01\x12\r\n\tHTTP_JSON\x10\x01\x12\x0e\n\nHTTP_PROTO\x10\x02\x12\x08\n\x04GRPC\x10\x03:)\x9a\xc5\x88\x1e$\n\"envoy.config.trace.v2.ZipkinConfigBk\n#io.envoyproxy.envoy.config.trace.v3B\x0bZipkinProtoP\x01\xf2\x98\xfe\x8f\x05)\x12\'envoy.extensions.tracers.zipkin.v4alpha\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,envoy_dot_annotations_dot_deprecation__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_ZIPKINCONFIG_COLLECTORENDPOINTVERSION = _descriptor.EnumDescriptor(
  name='CollectorEndpointVersion',
  full_name='envoy.config.trace.v3.ZipkinConfig.CollectorEndpointVersion',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DEPRECATED_AND_UNAVAILABLE_DO_NOT_USE', index=0, number=0,
      serialized_options=b'\010\001\250\367\264\213\002\001',
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HTTP_JSON', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HTTP_PROTO', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GRPC', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=523,
  serialized_end=643,
)
_sym_db.RegisterEnumDescriptor(_ZIPKINCONFIG_COLLECTORENDPOINTVERSION)


_ZIPKINCONFIG = _descriptor.Descriptor(
  name='ZipkinConfig',
  full_name='envoy.config.trace.v3.ZipkinConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='collector_cluster', full_name='envoy.config.trace.v3.ZipkinConfig.collector_cluster', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='collector_endpoint', full_name='envoy.config.trace.v3.ZipkinConfig.collector_endpoint', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trace_id_128bit', full_name='envoy.config.trace.v3.ZipkinConfig.trace_id_128bit', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='shared_span_context', full_name='envoy.config.trace.v3.ZipkinConfig.shared_span_context', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='collector_endpoint_version', full_name='envoy.config.trace.v3.ZipkinConfig.collector_endpoint_version', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _ZIPKINCONFIG_COLLECTORENDPOINTVERSION,
  ],
  serialized_options=b'\232\305\210\036$\n\"envoy.config.trace.v2.ZipkinConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=254,
  serialized_end=686,
)

_ZIPKINCONFIG.fields_by_name['shared_span_context'].message_type = google_dot_protobuf_dot_wrappers__pb2._BOOLVALUE
_ZIPKINCONFIG.fields_by_name['collector_endpoint_version'].enum_type = _ZIPKINCONFIG_COLLECTORENDPOINTVERSION
_ZIPKINCONFIG_COLLECTORENDPOINTVERSION.containing_type = _ZIPKINCONFIG
DESCRIPTOR.message_types_by_name['ZipkinConfig'] = _ZIPKINCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ZipkinConfig = _reflection.GeneratedProtocolMessageType('ZipkinConfig', (_message.Message,), {
  'DESCRIPTOR' : _ZIPKINCONFIG,
  '__module__' : 'envoy.config.trace.v3.zipkin_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.trace.v3.ZipkinConfig)
  })
_sym_db.RegisterMessage(ZipkinConfig)


DESCRIPTOR._options = None
_ZIPKINCONFIG_COLLECTORENDPOINTVERSION.values_by_name["DEPRECATED_AND_UNAVAILABLE_DO_NOT_USE"]._options = None
_ZIPKINCONFIG.fields_by_name['collector_cluster']._options = None
_ZIPKINCONFIG.fields_by_name['collector_endpoint']._options = None
_ZIPKINCONFIG._options = None
# @@protoc_insertion_point(module_scope)
