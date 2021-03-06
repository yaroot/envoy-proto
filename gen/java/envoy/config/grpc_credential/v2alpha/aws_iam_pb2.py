# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/grpc_credential/v2alpha/aws_iam.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/grpc_credential/v2alpha/aws_iam.proto',
  package='envoy.config.grpc_credential.v2alpha',
  syntax='proto3',
  serialized_options=b'\n2io.envoyproxy.envoy.config.grpc_credential.v2alphaB\013AwsIamProtoP\001\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2envoy/config/grpc_credential/v2alpha/aws_iam.proto\x12$envoy.config.grpc_credential.v2alpha\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"=\n\x0c\x41wsIamConfig\x12\x1d\n\x0cservice_name\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12\x0e\n\x06region\x18\x02 \x01(\tBK\n2io.envoyproxy.envoy.config.grpc_credential.v2alphaB\x0b\x41wsIamProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_AWSIAMCONFIG = _descriptor.Descriptor(
  name='AwsIamConfig',
  full_name='envoy.config.grpc_credential.v2alpha.AwsIamConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='service_name', full_name='envoy.config.grpc_credential.v2alpha.AwsIamConfig.service_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='region', full_name='envoy.config.grpc_credential.v2alpha.AwsIamConfig.region', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=148,
  serialized_end=209,
)

DESCRIPTOR.message_types_by_name['AwsIamConfig'] = _AWSIAMCONFIG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AwsIamConfig = _reflection.GeneratedProtocolMessageType('AwsIamConfig', (_message.Message,), {
  'DESCRIPTOR' : _AWSIAMCONFIG,
  '__module__' : 'envoy.config.grpc_credential.v2alpha.aws_iam_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.grpc_credential.v2alpha.AwsIamConfig)
  })
_sym_db.RegisterMessage(AwsIamConfig)


DESCRIPTOR._options = None
_AWSIAMCONFIG.fields_by_name['service_name']._options = None
# @@protoc_insertion_point(module_scope)
