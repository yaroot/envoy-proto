# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/access_loggers/open_telemetry/v3alpha/logs_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.extensions.access_loggers.grpc.v3 import als_pb2 as envoy_dot_extensions_dot_access__loggers_dot_grpc_dot_v3_dot_als__pb2
from opentelemetry.proto.common.v1 import common_pb2 as opentelemetry_dot_proto_dot_common_dot_v1_dot_common__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/access_loggers/open_telemetry/v3alpha/logs_service.proto',
  package='envoy.extensions.access_loggers.open_telemetry.v3alpha',
  syntax='proto3',
  serialized_options=b'\nDio.envoyproxy.envoy.extensions.access_loggers.open_telemetry.v3alphaB\020LogsServiceProtoP\001\272\200\310\321\006\002\010\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nIenvoy/extensions/access_loggers/open_telemetry/v3alpha/logs_service.proto\x12\x36\x65nvoy.extensions.access_loggers.open_telemetry.v3alpha\x1a\x31\x65nvoy/extensions/access_loggers/grpc/v3/als.proto\x1a*opentelemetry/proto/common/v1/common.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xfb\x01\n\x1cOpenTelemetryAccessLogConfig\x12\x63\n\rcommon_config\x18\x01 \x01(\x0b\x32\x42.envoy.extensions.access_loggers.grpc.v3.CommonGrpcAccessLogConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x35\n\x04\x62ody\x18\x02 \x01(\x0b\x32\'.opentelemetry.proto.common.v1.AnyValue\x12?\n\nattributes\x18\x03 \x01(\x0b\x32+.opentelemetry.proto.common.v1.KeyValueListBj\nDio.envoyproxy.envoy.extensions.access_loggers.open_telemetry.v3alphaB\x10LogsServiceProtoP\x01\xba\x80\xc8\xd1\x06\x02\x08\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_extensions_dot_access__loggers_dot_grpc_dot_v3_dot_als__pb2.DESCRIPTOR,opentelemetry_dot_proto_dot_common_dot_v1_dot_common__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_OPENTELEMETRYACCESSLOGCONFIG = _descriptor.Descriptor(
  name='OpenTelemetryAccessLogConfig',
  full_name='envoy.extensions.access_loggers.open_telemetry.v3alpha.OpenTelemetryAccessLogConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='common_config', full_name='envoy.extensions.access_loggers.open_telemetry.v3alpha.OpenTelemetryAccessLogConfig.common_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='body', full_name='envoy.extensions.access_loggers.open_telemetry.v3alpha.OpenTelemetryAccessLogConfig.body', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attributes', full_name='envoy.extensions.access_loggers.open_telemetry.v3alpha.OpenTelemetryAccessLogConfig.attributes', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=285,
  serialized_end=536,
)

_OPENTELEMETRYACCESSLOGCONFIG.fields_by_name['common_config'].message_type = envoy_dot_extensions_dot_access__loggers_dot_grpc_dot_v3_dot_als__pb2._COMMONGRPCACCESSLOGCONFIG
_OPENTELEMETRYACCESSLOGCONFIG.fields_by_name['body'].message_type = opentelemetry_dot_proto_dot_common_dot_v1_dot_common__pb2._ANYVALUE
_OPENTELEMETRYACCESSLOGCONFIG.fields_by_name['attributes'].message_type = opentelemetry_dot_proto_dot_common_dot_v1_dot_common__pb2._KEYVALUELIST
DESCRIPTOR.message_types_by_name['OpenTelemetryAccessLogConfig'] = _OPENTELEMETRYACCESSLOGCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

OpenTelemetryAccessLogConfig = _reflection.GeneratedProtocolMessageType('OpenTelemetryAccessLogConfig', (_message.Message,), {
  'DESCRIPTOR' : _OPENTELEMETRYACCESSLOGCONFIG,
  '__module__' : 'envoy.extensions.access_loggers.open_telemetry.v3alpha.logs_service_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.access_loggers.open_telemetry.v3alpha.OpenTelemetryAccessLogConfig)
  })
_sym_db.RegisterMessage(OpenTelemetryAccessLogConfig)


DESCRIPTOR._options = None
_OPENTELEMETRYACCESSLOGCONFIG.fields_by_name['common_config']._options = None
# @@protoc_insertion_point(module_scope)
