# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.devtools.clouderrorreporting.v1beta1 import common_pb2 as google_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto',
  package='google.devtools.clouderrorreporting.v1beta1',
  syntax='proto3',
  serialized_options=b'\n/com.google.devtools.clouderrorreporting.v1beta1B\030ReportErrorsServiceProtoP\001Z^google.golang.org/genproto/googleapis/devtools/clouderrorreporting/v1beta1;clouderrorreporting\370\001\001\252\002#Google.Cloud.ErrorReporting.V1Beta1\312\002#Google\\Cloud\\ErrorReporting\\V1beta1\352\002&Google::Cloud::ErrorReporting::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nGgoogle/devtools/clouderrorreporting/v1beta1/report_errors_service.proto\x12+google.devtools.clouderrorreporting.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x38google/devtools/clouderrorreporting/v1beta1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb9\x01\n\x17ReportErrorEventRequest\x12I\n\x0cproject_name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12S\n\x05\x65vent\x18\x02 \x01(\x0b\x32?.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEventB\x03\xe0\x41\x02\"\x1a\n\x18ReportErrorEventResponse\"\x8b\x02\n\x12ReportedErrorEvent\x12\x33\n\nevent_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12Y\n\x0fservice_context\x18\x02 \x01(\x0b\x32;.google.devtools.clouderrorreporting.v1beta1.ServiceContextB\x03\xe0\x41\x02\x12\x14\n\x07message\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12O\n\x07\x63ontext\x18\x04 \x01(\x0b\x32\x39.google.devtools.clouderrorreporting.v1beta1.ErrorContextB\x03\xe0\x41\x01\x32\xe5\x02\n\x13ReportErrorsService\x12\xf5\x01\n\x10ReportErrorEvent\x12\x44.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest\x1a\x45.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse\"T\x82\xd3\xe4\x93\x02\x39\"0/v1beta1/{project_name=projects/*}/events:report:\x05\x65vent\xda\x41\x12project_name,event\x1aV\xca\x41\"clouderrorreporting.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xa5\x02\n/com.google.devtools.clouderrorreporting.v1beta1B\x18ReportErrorsServiceProtoP\x01Z^google.golang.org/genproto/googleapis/devtools/clouderrorreporting/v1beta1;clouderrorreporting\xf8\x01\x01\xaa\x02#Google.Cloud.ErrorReporting.V1Beta1\xca\x02#Google\\Cloud\\ErrorReporting\\V1beta1\xea\x02&Google::Cloud::ErrorReporting::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_REPORTERROREVENTREQUEST = _descriptor.Descriptor(
  name='ReportErrorEventRequest',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='project_name', full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.project_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event', full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.event', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=327,
  serialized_end=512,
)


_REPORTERROREVENTRESPONSE = _descriptor.Descriptor(
  name='ReportErrorEventResponse',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=514,
  serialized_end=540,
)


_REPORTEDERROREVENT = _descriptor.Descriptor(
  name='ReportedErrorEvent',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='event_time', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.event_time', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_context', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.service_context', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.message', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='context', full_name='google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.context', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=543,
  serialized_end=810,
)

_REPORTERROREVENTREQUEST.fields_by_name['event'].message_type = _REPORTEDERROREVENT
_REPORTEDERROREVENT.fields_by_name['event_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_REPORTEDERROREVENT.fields_by_name['service_context'].message_type = google_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2._SERVICECONTEXT
_REPORTEDERROREVENT.fields_by_name['context'].message_type = google_dot_devtools_dot_clouderrorreporting_dot_v1beta1_dot_common__pb2._ERRORCONTEXT
DESCRIPTOR.message_types_by_name['ReportErrorEventRequest'] = _REPORTERROREVENTREQUEST
DESCRIPTOR.message_types_by_name['ReportErrorEventResponse'] = _REPORTERROREVENTRESPONSE
DESCRIPTOR.message_types_by_name['ReportedErrorEvent'] = _REPORTEDERROREVENT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ReportErrorEventRequest = _reflection.GeneratedProtocolMessageType('ReportErrorEventRequest', (_message.Message,), {
  'DESCRIPTOR' : _REPORTERROREVENTREQUEST,
  '__module__' : 'google.devtools.clouderrorreporting.v1beta1.report_errors_service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)
  })
_sym_db.RegisterMessage(ReportErrorEventRequest)

ReportErrorEventResponse = _reflection.GeneratedProtocolMessageType('ReportErrorEventResponse', (_message.Message,), {
  'DESCRIPTOR' : _REPORTERROREVENTRESPONSE,
  '__module__' : 'google.devtools.clouderrorreporting.v1beta1.report_errors_service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse)
  })
_sym_db.RegisterMessage(ReportErrorEventResponse)

ReportedErrorEvent = _reflection.GeneratedProtocolMessageType('ReportedErrorEvent', (_message.Message,), {
  'DESCRIPTOR' : _REPORTEDERROREVENT,
  '__module__' : 'google.devtools.clouderrorreporting.v1beta1.report_errors_service_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent)
  })
_sym_db.RegisterMessage(ReportedErrorEvent)


DESCRIPTOR._options = None
_REPORTERROREVENTREQUEST.fields_by_name['project_name']._options = None
_REPORTERROREVENTREQUEST.fields_by_name['event']._options = None
_REPORTEDERROREVENT.fields_by_name['event_time']._options = None
_REPORTEDERROREVENT.fields_by_name['service_context']._options = None
_REPORTEDERROREVENT.fields_by_name['message']._options = None
_REPORTEDERROREVENT.fields_by_name['context']._options = None

_REPORTERRORSSERVICE = _descriptor.ServiceDescriptor(
  name='ReportErrorsService',
  full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorsService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\"clouderrorreporting.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=813,
  serialized_end=1170,
  methods=[
  _descriptor.MethodDescriptor(
    name='ReportErrorEvent',
    full_name='google.devtools.clouderrorreporting.v1beta1.ReportErrorsService.ReportErrorEvent',
    index=0,
    containing_service=None,
    input_type=_REPORTERROREVENTREQUEST,
    output_type=_REPORTERROREVENTRESPONSE,
    serialized_options=b'\202\323\344\223\0029\"0/v1beta1/{project_name=projects/*}/events:report:\005event\332A\022project_name,event',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_REPORTERRORSSERVICE)

DESCRIPTOR.services_by_name['ReportErrorsService'] = _REPORTERRORSSERVICE

# @@protoc_insertion_point(module_scope)
