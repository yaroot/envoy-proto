# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/tracers/opencensus/v4alpha/opencensus.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import grpc_service_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2
from opencensus.proto.trace.v1 import trace_config_pb2 as opencensus_dot_proto_dot_trace_dot_v1_dot_trace__config__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/tracers/opencensus/v4alpha/opencensus.proto',
  package='envoy.extensions.tracers.opencensus.v4alpha',
  syntax='proto3',
  serialized_options=b'\n9io.envoyproxy.envoy.extensions.tracers.opencensus.v4alphaB\017OpencensusProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<envoy/extensions/tracers/opencensus/v4alpha/opencensus.proto\x12+envoy.extensions.tracers.opencensus.v4alpha\x1a,envoy/config/core/v4alpha/grpc_service.proto\x1a,opencensus/proto/trace/v1/trace_config.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"\xbf\x06\n\x10OpenCensusConfig\x12<\n\x0ctrace_config\x18\x01 \x01(\x0b\x32&.opencensus.proto.trace.v1.TraceConfig\x12\x1f\n\x17stdout_exporter_enabled\x18\x02 \x01(\x08\x12$\n\x1cstackdriver_exporter_enabled\x18\x03 \x01(\x08\x12\x1e\n\x16stackdriver_project_id\x18\x04 \x01(\t\x12\x1b\n\x13stackdriver_address\x18\n \x01(\t\x12H\n\x18stackdriver_grpc_service\x18\r \x01(\x0b\x32&.envoy.config.core.v4alpha.GrpcService\x12 \n\x18ocagent_exporter_enabled\x18\x0b \x01(\x08\x12\x17\n\x0focagent_address\x18\x0c \x01(\t\x12\x44\n\x14ocagent_grpc_service\x18\x0e \x01(\x0b\x32&.envoy.config.core.v4alpha.GrpcService\x12j\n\x16incoming_trace_context\x18\x08 \x03(\x0e\x32J.envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.TraceContext\x12j\n\x16outgoing_trace_context\x18\t \x03(\x0e\x32J.envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.TraceContext\"`\n\x0cTraceContext\x12\x08\n\x04NONE\x10\x00\x12\x11\n\rTRACE_CONTEXT\x10\x01\x12\x12\n\x0eGRPC_TRACE_BIN\x10\x02\x12\x17\n\x13\x43LOUD_TRACE_CONTEXT\x10\x03\x12\x06\n\x02\x42\x33\x10\x04:-\x9a\xc5\x88\x1e(\n&envoy.config.trace.v3.OpenCensusConfigJ\x04\x08\x07\x10\x08J\x04\x08\x05\x10\x06J\x04\x08\x06\x10\x07R\x17zipkin_exporter_enabledR\nzipkin_urlBV\n9io.envoyproxy.envoy.extensions.tracers.opencensus.v4alphaB\x0fOpencensusProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2.DESCRIPTOR,opencensus_dot_proto_dot_trace_dot_v1_dot_trace__config__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])



_OPENCENSUSCONFIG_TRACECONTEXT = _descriptor.EnumDescriptor(
  name='TraceContext',
  full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.TraceContext',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='NONE', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TRACE_CONTEXT', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GRPC_TRACE_BIN', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLOUD_TRACE_CONTEXT', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='B3', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=901,
  serialized_end=997,
)
_sym_db.RegisterEnumDescriptor(_OPENCENSUSCONFIG_TRACECONTEXT)


_OPENCENSUSCONFIG = _descriptor.Descriptor(
  name='OpenCensusConfig',
  full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='trace_config', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.trace_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stdout_exporter_enabled', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.stdout_exporter_enabled', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stackdriver_exporter_enabled', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.stackdriver_exporter_enabled', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stackdriver_project_id', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.stackdriver_project_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stackdriver_address', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.stackdriver_address', index=4,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stackdriver_grpc_service', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.stackdriver_grpc_service', index=5,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocagent_exporter_enabled', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.ocagent_exporter_enabled', index=6,
      number=11, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocagent_address', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.ocagent_address', index=7,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ocagent_grpc_service', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.ocagent_grpc_service', index=8,
      number=14, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='incoming_trace_context', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.incoming_trace_context', index=9,
      number=8, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='outgoing_trace_context', full_name='envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig.outgoing_trace_context', index=10,
      number=9, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _OPENCENSUSCONFIG_TRACECONTEXT,
  ],
  serialized_options=b'\232\305\210\036(\n&envoy.config.trace.v3.OpenCensusConfig',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=268,
  serialized_end=1099,
)

_OPENCENSUSCONFIG.fields_by_name['trace_config'].message_type = opencensus_dot_proto_dot_trace_dot_v1_dot_trace__config__pb2._TRACECONFIG
_OPENCENSUSCONFIG.fields_by_name['stackdriver_grpc_service'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2._GRPCSERVICE
_OPENCENSUSCONFIG.fields_by_name['ocagent_grpc_service'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_grpc__service__pb2._GRPCSERVICE
_OPENCENSUSCONFIG.fields_by_name['incoming_trace_context'].enum_type = _OPENCENSUSCONFIG_TRACECONTEXT
_OPENCENSUSCONFIG.fields_by_name['outgoing_trace_context'].enum_type = _OPENCENSUSCONFIG_TRACECONTEXT
_OPENCENSUSCONFIG_TRACECONTEXT.containing_type = _OPENCENSUSCONFIG
DESCRIPTOR.message_types_by_name['OpenCensusConfig'] = _OPENCENSUSCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OpenCensusConfig = _reflection.GeneratedProtocolMessageType('OpenCensusConfig', (_message.Message,), {
  'DESCRIPTOR' : _OPENCENSUSCONFIG,
  '__module__' : 'envoy.extensions.tracers.opencensus.v4alpha.opencensus_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.tracers.opencensus.v4alpha.OpenCensusConfig)
  })
_sym_db.RegisterMessage(OpenCensusConfig)


DESCRIPTOR._options = None
_OPENCENSUSCONFIG._options = None
# @@protoc_insertion_point(module_scope)
