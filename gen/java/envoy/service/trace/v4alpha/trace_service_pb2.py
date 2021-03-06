# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/trace/v4alpha/trace_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import base_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2
from opencensus.proto.trace.v1 import trace_pb2 as opencensus_dot_proto_dot_trace_dot_v1_dot_trace__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/service/trace/v4alpha/trace_service.proto',
  package='envoy.service.trace.v4alpha',
  syntax='proto3',
  serialized_options=b'\n)io.envoyproxy.envoy.service.trace.v4alphaB\021TraceServiceProtoP\001\210\001\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/envoy/service/trace/v4alpha/trace_service.proto\x12\x1b\x65nvoy.service.trace.v4alpha\x1a$envoy/config/core/v4alpha/base.proto\x1a%opencensus/proto/trace/v1/trace.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"J\n\x14StreamTracesResponse:2\x9a\xc5\x88\x1e-\n+envoy.service.trace.v3.StreamTracesResponse\"\xcf\x02\n\x13StreamTracesMessage\x12O\n\nidentifier\x18\x01 \x01(\x0b\x32;.envoy.service.trace.v4alpha.StreamTracesMessage.Identifier\x12.\n\x05spans\x18\x02 \x03(\x0b\x32\x1f.opencensus.proto.trace.v1.Span\x1a\x83\x01\n\nIdentifier\x12\x37\n\x04node\x18\x01 \x01(\x0b\x32\x1f.envoy.config.core.v4alpha.NodeB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01:<\x9a\xc5\x88\x1e\x37\n5envoy.service.trace.v3.StreamTracesMessage.Identifier:1\x9a\xc5\x88\x1e,\n*envoy.service.trace.v3.StreamTracesMessage2\x87\x01\n\x0cTraceService\x12w\n\x0cStreamTraces\x12\x30.envoy.service.trace.v4alpha.StreamTracesMessage\x1a\x31.envoy.service.trace.v4alpha.StreamTracesResponse\"\x00(\x01\x42K\n)io.envoyproxy.envoy.service.trace.v4alphaB\x11TraceServiceProtoP\x01\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2.DESCRIPTOR,opencensus_dot_proto_dot_trace_dot_v1_dot_trace__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_STREAMTRACESRESPONSE = _descriptor.Descriptor(
  name='StreamTracesResponse',
  full_name='envoy.service.trace.v4alpha.StreamTracesResponse',
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
  serialized_options=b'\232\305\210\036-\n+envoy.service.trace.v3.StreamTracesResponse',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=248,
  serialized_end=322,
)


_STREAMTRACESMESSAGE_IDENTIFIER = _descriptor.Descriptor(
  name='Identifier',
  full_name='envoy.service.trace.v4alpha.StreamTracesMessage.Identifier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='node', full_name='envoy.service.trace.v4alpha.StreamTracesMessage.Identifier.node', index=0,
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
  serialized_options=b'\232\305\210\0367\n5envoy.service.trace.v3.StreamTracesMessage.Identifier',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=478,
  serialized_end=609,
)

_STREAMTRACESMESSAGE = _descriptor.Descriptor(
  name='StreamTracesMessage',
  full_name='envoy.service.trace.v4alpha.StreamTracesMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='identifier', full_name='envoy.service.trace.v4alpha.StreamTracesMessage.identifier', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='spans', full_name='envoy.service.trace.v4alpha.StreamTracesMessage.spans', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_STREAMTRACESMESSAGE_IDENTIFIER, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036,\n*envoy.service.trace.v3.StreamTracesMessage',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=325,
  serialized_end=660,
)

_STREAMTRACESMESSAGE_IDENTIFIER.fields_by_name['node'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_base__pb2._NODE
_STREAMTRACESMESSAGE_IDENTIFIER.containing_type = _STREAMTRACESMESSAGE
_STREAMTRACESMESSAGE.fields_by_name['identifier'].message_type = _STREAMTRACESMESSAGE_IDENTIFIER
_STREAMTRACESMESSAGE.fields_by_name['spans'].message_type = opencensus_dot_proto_dot_trace_dot_v1_dot_trace__pb2._SPAN
DESCRIPTOR.message_types_by_name['StreamTracesResponse'] = _STREAMTRACESRESPONSE
DESCRIPTOR.message_types_by_name['StreamTracesMessage'] = _STREAMTRACESMESSAGE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StreamTracesResponse = _reflection.GeneratedProtocolMessageType('StreamTracesResponse', (_message.Message,), {
  'DESCRIPTOR' : _STREAMTRACESRESPONSE,
  '__module__' : 'envoy.service.trace.v4alpha.trace_service_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.trace.v4alpha.StreamTracesResponse)
  })
_sym_db.RegisterMessage(StreamTracesResponse)

StreamTracesMessage = _reflection.GeneratedProtocolMessageType('StreamTracesMessage', (_message.Message,), {

  'Identifier' : _reflection.GeneratedProtocolMessageType('Identifier', (_message.Message,), {
    'DESCRIPTOR' : _STREAMTRACESMESSAGE_IDENTIFIER,
    '__module__' : 'envoy.service.trace.v4alpha.trace_service_pb2'
    # @@protoc_insertion_point(class_scope:envoy.service.trace.v4alpha.StreamTracesMessage.Identifier)
    })
  ,
  'DESCRIPTOR' : _STREAMTRACESMESSAGE,
  '__module__' : 'envoy.service.trace.v4alpha.trace_service_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.trace.v4alpha.StreamTracesMessage)
  })
_sym_db.RegisterMessage(StreamTracesMessage)
_sym_db.RegisterMessage(StreamTracesMessage.Identifier)


DESCRIPTOR._options = None
_STREAMTRACESRESPONSE._options = None
_STREAMTRACESMESSAGE_IDENTIFIER.fields_by_name['node']._options = None
_STREAMTRACESMESSAGE_IDENTIFIER._options = None
_STREAMTRACESMESSAGE._options = None

_TRACESERVICE = _descriptor.ServiceDescriptor(
  name='TraceService',
  full_name='envoy.service.trace.v4alpha.TraceService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=663,
  serialized_end=798,
  methods=[
  _descriptor.MethodDescriptor(
    name='StreamTraces',
    full_name='envoy.service.trace.v4alpha.TraceService.StreamTraces',
    index=0,
    containing_service=None,
    input_type=_STREAMTRACESMESSAGE,
    output_type=_STREAMTRACESRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_TRACESERVICE)

DESCRIPTOR.services_by_name['TraceService'] = _TRACESERVICE

# @@protoc_insertion_point(module_scope)
