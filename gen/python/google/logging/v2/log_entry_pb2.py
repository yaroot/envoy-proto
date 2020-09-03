# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/log_entry.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import monitored_resource_pb2 as google_dot_api_dot_monitored__resource__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.logging.type import http_request_pb2 as google_dot_logging_dot_type_dot_http__request__pb2
from google.logging.type import log_severity_pb2 as google_dot_logging_dot_type_dot_log__severity__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/logging/v2/log_entry.proto',
  package='google.logging.v2',
  syntax='proto3',
  serialized_options=b'\n\025com.google.logging.v2B\rLogEntryProtoP\001Z8google.golang.org/genproto/googleapis/logging/v2;logging\370\001\001\252\002\027Google.Cloud.Logging.V2\312\002\027Google\\Cloud\\Logging\\V2\352\002\032Google::Cloud::Logging::V2',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!google/logging/v2/log_entry.proto\x12\x11google.logging.v2\x1a\x1fgoogle/api/field_behavior.proto\x1a#google/api/monitored_resource.proto\x1a\x19google/api/resource.proto\x1a&google/logging/type/http_request.proto\x1a&google/logging/type/log_severity.proto\x1a\x19google/protobuf/any.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\x1a\x1cgoogle/api/annotations.proto\"\xd2\x07\n\x08LogEntry\x12\x15\n\x08log_name\x18\x0c \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x08resource\x18\x08 \x01(\x0b\x32\x1d.google.api.MonitoredResourceB\x03\xe0\x41\x02\x12-\n\rproto_payload\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyH\x00\x12\x16\n\x0ctext_payload\x18\x03 \x01(\tH\x00\x12/\n\x0cjson_payload\x18\x06 \x01(\x0b\x32\x17.google.protobuf.StructH\x00\x12\x32\n\ttimestamp\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12:\n\x11receive_timestamp\x18\x18 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x37\n\x08severity\x18\n \x01(\x0e\x32 .google.logging.type.LogSeverityB\x03\xe0\x41\x01\x12\x16\n\tinsert_id\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12;\n\x0chttp_request\x18\x07 \x01(\x0b\x32 .google.logging.type.HttpRequestB\x03\xe0\x41\x01\x12<\n\x06labels\x18\x0b \x03(\x0b\x32\'.google.logging.v2.LogEntry.LabelsEntryB\x03\xe0\x41\x01\x12<\n\toperation\x18\x0f \x01(\x0b\x32$.google.logging.v2.LogEntryOperationB\x03\xe0\x41\x01\x12\x12\n\x05trace\x18\x16 \x01(\tB\x03\xe0\x41\x01\x12\x14\n\x07span_id\x18\x1b \x01(\tB\x03\xe0\x41\x01\x12\x1a\n\rtrace_sampled\x18\x1e \x01(\x08\x42\x03\xe0\x41\x01\x12G\n\x0fsource_location\x18\x17 \x01(\x0b\x32).google.logging.v2.LogEntrySourceLocationB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\xbd\x01\xea\x41\xb9\x01\n\x1alogging.googleapis.com/Log\x12\x1dprojects/{project}/logs/{log}\x12\'organizations/{organization}/logs/{log}\x12\x1b\x66olders/{folder}/logs/{log}\x12,billingAccounts/{billing_account}/logs/{log}\x1a\x08log_nameB\t\n\x07payload\"b\n\x11LogEntryOperation\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x15\n\x08producer\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x12\n\x05\x66irst\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\x12\x11\n\x04last\x18\x04 \x01(\x08\x42\x03\xe0\x41\x01\"U\n\x16LogEntrySourceLocation\x12\x11\n\x04\x66ile\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x11\n\x04line\x18\x02 \x01(\x03\x42\x03\xe0\x41\x01\x12\x15\n\x08\x66unction\x18\x03 \x01(\tB\x03\xe0\x41\x01\x42\xb6\x01\n\x15\x63om.google.logging.v2B\rLogEntryProtoP\x01Z8google.golang.org/genproto/googleapis/logging/v2;logging\xf8\x01\x01\xaa\x02\x17Google.Cloud.Logging.V2\xca\x02\x17Google\\Cloud\\Logging\\V2\xea\x02\x1aGoogle::Cloud::Logging::V2b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_monitored__resource__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_logging_dot_type_dot_http__request__pb2.DESCRIPTOR,google_dot_logging_dot_type_dot_log__severity__pb2.DESCRIPTOR,google_dot_protobuf_dot_any__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_rpc_dot_status__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_LOGENTRY_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.logging.v2.LogEntry.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.logging.v2.LogEntry.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.logging.v2.LogEntry.LabelsEntry.value', index=1,
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
  serialized_start=1109,
  serialized_end=1154,
)

_LOGENTRY = _descriptor.Descriptor(
  name='LogEntry',
  full_name='google.logging.v2.LogEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='log_name', full_name='google.logging.v2.LogEntry.log_name', index=0,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource', full_name='google.logging.v2.LogEntry.resource', index=1,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='proto_payload', full_name='google.logging.v2.LogEntry.proto_payload', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text_payload', full_name='google.logging.v2.LogEntry.text_payload', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='json_payload', full_name='google.logging.v2.LogEntry.json_payload', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='google.logging.v2.LogEntry.timestamp', index=5,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='receive_timestamp', full_name='google.logging.v2.LogEntry.receive_timestamp', index=6,
      number=24, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='severity', full_name='google.logging.v2.LogEntry.severity', index=7,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='insert_id', full_name='google.logging.v2.LogEntry.insert_id', index=8,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='http_request', full_name='google.logging.v2.LogEntry.http_request', index=9,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.logging.v2.LogEntry.labels', index=10,
      number=11, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='operation', full_name='google.logging.v2.LogEntry.operation', index=11,
      number=15, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trace', full_name='google.logging.v2.LogEntry.trace', index=12,
      number=22, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='span_id', full_name='google.logging.v2.LogEntry.span_id', index=13,
      number=27, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trace_sampled', full_name='google.logging.v2.LogEntry.trace_sampled', index=14,
      number=30, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='source_location', full_name='google.logging.v2.LogEntry.source_location', index=15,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_LOGENTRY_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352A\271\001\n\032logging.googleapis.com/Log\022\035projects/{project}/logs/{log}\022\'organizations/{organization}/logs/{log}\022\033folders/{folder}/logs/{log}\022,billingAccounts/{billing_account}/logs/{log}\032\010log_name',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='payload', full_name='google.logging.v2.LogEntry.payload',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=379,
  serialized_end=1357,
)


_LOGENTRYOPERATION = _descriptor.Descriptor(
  name='LogEntryOperation',
  full_name='google.logging.v2.LogEntryOperation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.logging.v2.LogEntryOperation.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='producer', full_name='google.logging.v2.LogEntryOperation.producer', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='first', full_name='google.logging.v2.LogEntryOperation.first', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last', full_name='google.logging.v2.LogEntryOperation.last', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1359,
  serialized_end=1457,
)


_LOGENTRYSOURCELOCATION = _descriptor.Descriptor(
  name='LogEntrySourceLocation',
  full_name='google.logging.v2.LogEntrySourceLocation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='file', full_name='google.logging.v2.LogEntrySourceLocation.file', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='line', full_name='google.logging.v2.LogEntrySourceLocation.line', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='function', full_name='google.logging.v2.LogEntrySourceLocation.function', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1459,
  serialized_end=1544,
)

_LOGENTRY_LABELSENTRY.containing_type = _LOGENTRY
_LOGENTRY.fields_by_name['resource'].message_type = google_dot_api_dot_monitored__resource__pb2._MONITOREDRESOURCE
_LOGENTRY.fields_by_name['proto_payload'].message_type = google_dot_protobuf_dot_any__pb2._ANY
_LOGENTRY.fields_by_name['json_payload'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_LOGENTRY.fields_by_name['timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_LOGENTRY.fields_by_name['receive_timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_LOGENTRY.fields_by_name['severity'].enum_type = google_dot_logging_dot_type_dot_log__severity__pb2._LOGSEVERITY
_LOGENTRY.fields_by_name['http_request'].message_type = google_dot_logging_dot_type_dot_http__request__pb2._HTTPREQUEST
_LOGENTRY.fields_by_name['labels'].message_type = _LOGENTRY_LABELSENTRY
_LOGENTRY.fields_by_name['operation'].message_type = _LOGENTRYOPERATION
_LOGENTRY.fields_by_name['source_location'].message_type = _LOGENTRYSOURCELOCATION
_LOGENTRY.oneofs_by_name['payload'].fields.append(
  _LOGENTRY.fields_by_name['proto_payload'])
_LOGENTRY.fields_by_name['proto_payload'].containing_oneof = _LOGENTRY.oneofs_by_name['payload']
_LOGENTRY.oneofs_by_name['payload'].fields.append(
  _LOGENTRY.fields_by_name['text_payload'])
_LOGENTRY.fields_by_name['text_payload'].containing_oneof = _LOGENTRY.oneofs_by_name['payload']
_LOGENTRY.oneofs_by_name['payload'].fields.append(
  _LOGENTRY.fields_by_name['json_payload'])
_LOGENTRY.fields_by_name['json_payload'].containing_oneof = _LOGENTRY.oneofs_by_name['payload']
DESCRIPTOR.message_types_by_name['LogEntry'] = _LOGENTRY
DESCRIPTOR.message_types_by_name['LogEntryOperation'] = _LOGENTRYOPERATION
DESCRIPTOR.message_types_by_name['LogEntrySourceLocation'] = _LOGENTRYSOURCELOCATION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LogEntry = _reflection.GeneratedProtocolMessageType('LogEntry', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _LOGENTRY_LABELSENTRY,
    '__module__' : 'google.logging.v2.log_entry_pb2'
    # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntry.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _LOGENTRY,
  '__module__' : 'google.logging.v2.log_entry_pb2'
  # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntry)
  })
_sym_db.RegisterMessage(LogEntry)
_sym_db.RegisterMessage(LogEntry.LabelsEntry)

LogEntryOperation = _reflection.GeneratedProtocolMessageType('LogEntryOperation', (_message.Message,), {
  'DESCRIPTOR' : _LOGENTRYOPERATION,
  '__module__' : 'google.logging.v2.log_entry_pb2'
  # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntryOperation)
  })
_sym_db.RegisterMessage(LogEntryOperation)

LogEntrySourceLocation = _reflection.GeneratedProtocolMessageType('LogEntrySourceLocation', (_message.Message,), {
  'DESCRIPTOR' : _LOGENTRYSOURCELOCATION,
  '__module__' : 'google.logging.v2.log_entry_pb2'
  # @@protoc_insertion_point(class_scope:google.logging.v2.LogEntrySourceLocation)
  })
_sym_db.RegisterMessage(LogEntrySourceLocation)


DESCRIPTOR._options = None
_LOGENTRY_LABELSENTRY._options = None
_LOGENTRY.fields_by_name['log_name']._options = None
_LOGENTRY.fields_by_name['resource']._options = None
_LOGENTRY.fields_by_name['timestamp']._options = None
_LOGENTRY.fields_by_name['receive_timestamp']._options = None
_LOGENTRY.fields_by_name['severity']._options = None
_LOGENTRY.fields_by_name['insert_id']._options = None
_LOGENTRY.fields_by_name['http_request']._options = None
_LOGENTRY.fields_by_name['labels']._options = None
_LOGENTRY.fields_by_name['operation']._options = None
_LOGENTRY.fields_by_name['trace']._options = None
_LOGENTRY.fields_by_name['span_id']._options = None
_LOGENTRY.fields_by_name['trace_sampled']._options = None
_LOGENTRY.fields_by_name['source_location']._options = None
_LOGENTRY._options = None
_LOGENTRYOPERATION.fields_by_name['id']._options = None
_LOGENTRYOPERATION.fields_by_name['producer']._options = None
_LOGENTRYOPERATION.fields_by_name['first']._options = None
_LOGENTRYOPERATION.fields_by_name['last']._options = None
_LOGENTRYSOURCELOCATION.fields_by_name['file']._options = None
_LOGENTRYSOURCELOCATION.fields_by_name['line']._options = None
_LOGENTRYSOURCELOCATION.fields_by_name['function']._options = None
# @@protoc_insertion_point(module_scope)
