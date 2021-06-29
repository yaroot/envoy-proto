# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/access_loggers/stream/v3/stream.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import substitution_format_string_pb2 as envoy_dot_config_dot_core_dot_v3_dot_substitution__format__string__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/access_loggers/stream/v3/stream.proto',
  package='envoy.extensions.access_loggers.stream.v3',
  syntax='proto3',
  serialized_options=b'\n7io.envoyproxy.envoy.extensions.access_loggers.stream.v3B\013StreamProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6envoy/extensions/access_loggers/stream/v3/stream.proto\x12)envoy.extensions.access_loggers.stream.v3\x1a\x35\x65nvoy/config/core/v3/substitution_format_string.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"v\n\x0fStdoutAccessLog\x12N\n\nlog_format\x18\x01 \x01(\x0b\x32..envoy.config.core.v3.SubstitutionFormatStringB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01H\x00\x42\x13\n\x11\x61\x63\x63\x65ss_log_format\"v\n\x0fStderrAccessLog\x12N\n\nlog_format\x18\x01 \x01(\x0b\x32..envoy.config.core.v3.SubstitutionFormatStringB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01H\x00\x42\x13\n\x11\x61\x63\x63\x65ss_log_formatBP\n7io.envoyproxy.envoy.extensions.access_loggers.stream.v3B\x0bStreamProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_substitution__format__string__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_STDOUTACCESSLOG = _descriptor.Descriptor(
  name='StdoutAccessLog',
  full_name='envoy.extensions.access_loggers.stream.v3.StdoutAccessLog',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='log_format', full_name='envoy.extensions.access_loggers.stream.v3.StdoutAccessLog.log_format', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='access_log_format', full_name='envoy.extensions.access_loggers.stream.v3.StdoutAccessLog.access_log_format',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=212,
  serialized_end=330,
)


_STDERRACCESSLOG = _descriptor.Descriptor(
  name='StderrAccessLog',
  full_name='envoy.extensions.access_loggers.stream.v3.StderrAccessLog',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='log_format', full_name='envoy.extensions.access_loggers.stream.v3.StderrAccessLog.log_format', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
      name='access_log_format', full_name='envoy.extensions.access_loggers.stream.v3.StderrAccessLog.access_log_format',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=332,
  serialized_end=450,
)

_STDOUTACCESSLOG.fields_by_name['log_format'].message_type = envoy_dot_config_dot_core_dot_v3_dot_substitution__format__string__pb2._SUBSTITUTIONFORMATSTRING
_STDOUTACCESSLOG.oneofs_by_name['access_log_format'].fields.append(
  _STDOUTACCESSLOG.fields_by_name['log_format'])
_STDOUTACCESSLOG.fields_by_name['log_format'].containing_oneof = _STDOUTACCESSLOG.oneofs_by_name['access_log_format']
_STDERRACCESSLOG.fields_by_name['log_format'].message_type = envoy_dot_config_dot_core_dot_v3_dot_substitution__format__string__pb2._SUBSTITUTIONFORMATSTRING
_STDERRACCESSLOG.oneofs_by_name['access_log_format'].fields.append(
  _STDERRACCESSLOG.fields_by_name['log_format'])
_STDERRACCESSLOG.fields_by_name['log_format'].containing_oneof = _STDERRACCESSLOG.oneofs_by_name['access_log_format']
DESCRIPTOR.message_types_by_name['StdoutAccessLog'] = _STDOUTACCESSLOG
DESCRIPTOR.message_types_by_name['StderrAccessLog'] = _STDERRACCESSLOG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StdoutAccessLog = _reflection.GeneratedProtocolMessageType('StdoutAccessLog', (_message.Message,), {
  'DESCRIPTOR' : _STDOUTACCESSLOG,
  '__module__' : 'envoy.extensions.access_loggers.stream.v3.stream_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.access_loggers.stream.v3.StdoutAccessLog)
  })
_sym_db.RegisterMessage(StdoutAccessLog)

StderrAccessLog = _reflection.GeneratedProtocolMessageType('StderrAccessLog', (_message.Message,), {
  'DESCRIPTOR' : _STDERRACCESSLOG,
  '__module__' : 'envoy.extensions.access_loggers.stream.v3.stream_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.access_loggers.stream.v3.StderrAccessLog)
  })
_sym_db.RegisterMessage(StderrAccessLog)


DESCRIPTOR._options = None
_STDOUTACCESSLOG.fields_by_name['log_format']._options = None
_STDERRACCESSLOG.fields_by_name['log_format']._options = None
# @@protoc_insertion_point(module_scope)