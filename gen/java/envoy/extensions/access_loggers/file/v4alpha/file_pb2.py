# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/access_loggers/file/v4alpha/file.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import substitution_format_string_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_substitution__format__string__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/access_loggers/file/v4alpha/file.proto',
  package='envoy.extensions.access_loggers.file.v4alpha',
  syntax='proto3',
  serialized_options=b'\n:io.envoyproxy.envoy.extensions.access_loggers.file.v4alphaB\tFileProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7envoy/extensions/access_loggers/file/v4alpha/file.proto\x12,envoy.extensions.access_loggers.file.v4alpha\x1a:envoy/config/core/v4alpha/substitution_format_string.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\x88\x02\n\rFileAccessLog\x12\x15\n\x04path\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12S\n\nlog_format\x18\x05 \x01(\x0b\x32\x33.envoy.config.core.v4alpha.SubstitutionFormatStringB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01H\x00:<\x9a\xc5\x88\x1e\x37\n5envoy.extensions.access_loggers.file.v3.FileAccessLogB\x13\n\x11\x61\x63\x63\x65ss_log_formatJ\x04\x08\x02\x10\x03J\x04\x08\x03\x10\x04J\x04\x08\x04\x10\x05R\x06\x66ormatR\x0bjson_formatR\x11typed_json_formatBQ\n:io.envoyproxy.envoy.extensions.access_loggers.file.v4alphaB\tFileProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_substitution__format__string__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_FILEACCESSLOG = _descriptor.Descriptor(
  name='FileAccessLog',
  full_name='envoy.extensions.access_loggers.file.v4alpha.FileAccessLog',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='path', full_name='envoy.extensions.access_loggers.file.v4alpha.FileAccessLog.path', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='log_format', full_name='envoy.extensions.access_loggers.file.v4alpha.FileAccessLog.log_format', index=1,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\0367\n5envoy.extensions.access_loggers.file.v3.FileAccessLog',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='access_log_format', full_name='envoy.extensions.access_loggers.file.v4alpha.FileAccessLog.access_log_format',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=287,
  serialized_end=551,
)

_FILEACCESSLOG.fields_by_name['log_format'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_substitution__format__string__pb2._SUBSTITUTIONFORMATSTRING
_FILEACCESSLOG.oneofs_by_name['access_log_format'].fields.append(
  _FILEACCESSLOG.fields_by_name['log_format'])
_FILEACCESSLOG.fields_by_name['log_format'].containing_oneof = _FILEACCESSLOG.oneofs_by_name['access_log_format']
DESCRIPTOR.message_types_by_name['FileAccessLog'] = _FILEACCESSLOG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FileAccessLog = _reflection.GeneratedProtocolMessageType('FileAccessLog', (_message.Message,), {
  'DESCRIPTOR' : _FILEACCESSLOG,
  '__module__' : 'envoy.extensions.access_loggers.file.v4alpha.file_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.access_loggers.file.v4alpha.FileAccessLog)
  })
_sym_db.RegisterMessage(FileAccessLog)


DESCRIPTOR._options = None
_FILEACCESSLOG.fields_by_name['path']._options = None
_FILEACCESSLOG.fields_by_name['log_format']._options = None
_FILEACCESSLOG._options = None
# @@protoc_insertion_point(module_scope)
