# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networksecurity/v1beta1/tls.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/networksecurity/v1beta1/tls.proto',
  package='google.cloud.networksecurity.v1beta1',
  syntax='proto3',
  serialized_options=b'\n(com.google.cloud.networksecurity.v1beta1P\001ZSgoogle.golang.org/genproto/googleapis/cloud/networksecurity/v1beta1;networksecurity\252\002$Google.Cloud.NetworkSecurity.V1Beta1\312\002$Google\\Cloud\\NetworkSecurity\\V1beta1\352\002\'Google::Cloud::NetworkSecurity::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.google/cloud/networksecurity/v1beta1/tls.proto\x12$google.cloud.networksecurity.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1cgoogle/api/annotations.proto\"\'\n\x0cGrpcEndpoint\x12\x17\n\ntarget_uri\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\xcf\x01\n\x0cValidationCA\x12K\n\rgrpc_endpoint\x18\x02 \x01(\x0b\x32\x32.google.cloud.networksecurity.v1beta1.GrpcEndpointH\x00\x12j\n\x1d\x63\x65rtificate_provider_instance\x18\x03 \x01(\x0b\x32\x41.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceH\x00\x42\x06\n\x04type\";\n\x1b\x43\x65rtificateProviderInstance\x12\x1c\n\x0fplugin_instance\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\xd6\x01\n\x13\x43\x65rtificateProvider\x12K\n\rgrpc_endpoint\x18\x02 \x01(\x0b\x32\x32.google.cloud.networksecurity.v1beta1.GrpcEndpointH\x00\x12j\n\x1d\x63\x65rtificate_provider_instance\x18\x03 \x01(\x0b\x32\x41.google.cloud.networksecurity.v1beta1.CertificateProviderInstanceH\x00\x42\x06\n\x04typeB\xf9\x01\n(com.google.cloud.networksecurity.v1beta1P\x01ZSgoogle.golang.org/genproto/googleapis/cloud/networksecurity/v1beta1;networksecurity\xaa\x02$Google.Cloud.NetworkSecurity.V1Beta1\xca\x02$Google\\Cloud\\NetworkSecurity\\V1beta1\xea\x02\'Google::Cloud::NetworkSecurity::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_GRPCENDPOINT = _descriptor.Descriptor(
  name='GrpcEndpoint',
  full_name='google.cloud.networksecurity.v1beta1.GrpcEndpoint',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_uri', full_name='google.cloud.networksecurity.v1beta1.GrpcEndpoint.target_uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=151,
  serialized_end=190,
)


_VALIDATIONCA = _descriptor.Descriptor(
  name='ValidationCA',
  full_name='google.cloud.networksecurity.v1beta1.ValidationCA',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='grpc_endpoint', full_name='google.cloud.networksecurity.v1beta1.ValidationCA.grpc_endpoint', index=0,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='certificate_provider_instance', full_name='google.cloud.networksecurity.v1beta1.ValidationCA.certificate_provider_instance', index=1,
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
    _descriptor.OneofDescriptor(
      name='type', full_name='google.cloud.networksecurity.v1beta1.ValidationCA.type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=193,
  serialized_end=400,
)


_CERTIFICATEPROVIDERINSTANCE = _descriptor.Descriptor(
  name='CertificateProviderInstance',
  full_name='google.cloud.networksecurity.v1beta1.CertificateProviderInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='plugin_instance', full_name='google.cloud.networksecurity.v1beta1.CertificateProviderInstance.plugin_instance', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
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
  serialized_start=402,
  serialized_end=461,
)


_CERTIFICATEPROVIDER = _descriptor.Descriptor(
  name='CertificateProvider',
  full_name='google.cloud.networksecurity.v1beta1.CertificateProvider',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='grpc_endpoint', full_name='google.cloud.networksecurity.v1beta1.CertificateProvider.grpc_endpoint', index=0,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='certificate_provider_instance', full_name='google.cloud.networksecurity.v1beta1.CertificateProvider.certificate_provider_instance', index=1,
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
    _descriptor.OneofDescriptor(
      name='type', full_name='google.cloud.networksecurity.v1beta1.CertificateProvider.type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=464,
  serialized_end=678,
)

_VALIDATIONCA.fields_by_name['grpc_endpoint'].message_type = _GRPCENDPOINT
_VALIDATIONCA.fields_by_name['certificate_provider_instance'].message_type = _CERTIFICATEPROVIDERINSTANCE
_VALIDATIONCA.oneofs_by_name['type'].fields.append(
  _VALIDATIONCA.fields_by_name['grpc_endpoint'])
_VALIDATIONCA.fields_by_name['grpc_endpoint'].containing_oneof = _VALIDATIONCA.oneofs_by_name['type']
_VALIDATIONCA.oneofs_by_name['type'].fields.append(
  _VALIDATIONCA.fields_by_name['certificate_provider_instance'])
_VALIDATIONCA.fields_by_name['certificate_provider_instance'].containing_oneof = _VALIDATIONCA.oneofs_by_name['type']
_CERTIFICATEPROVIDER.fields_by_name['grpc_endpoint'].message_type = _GRPCENDPOINT
_CERTIFICATEPROVIDER.fields_by_name['certificate_provider_instance'].message_type = _CERTIFICATEPROVIDERINSTANCE
_CERTIFICATEPROVIDER.oneofs_by_name['type'].fields.append(
  _CERTIFICATEPROVIDER.fields_by_name['grpc_endpoint'])
_CERTIFICATEPROVIDER.fields_by_name['grpc_endpoint'].containing_oneof = _CERTIFICATEPROVIDER.oneofs_by_name['type']
_CERTIFICATEPROVIDER.oneofs_by_name['type'].fields.append(
  _CERTIFICATEPROVIDER.fields_by_name['certificate_provider_instance'])
_CERTIFICATEPROVIDER.fields_by_name['certificate_provider_instance'].containing_oneof = _CERTIFICATEPROVIDER.oneofs_by_name['type']
DESCRIPTOR.message_types_by_name['GrpcEndpoint'] = _GRPCENDPOINT
DESCRIPTOR.message_types_by_name['ValidationCA'] = _VALIDATIONCA
DESCRIPTOR.message_types_by_name['CertificateProviderInstance'] = _CERTIFICATEPROVIDERINSTANCE
DESCRIPTOR.message_types_by_name['CertificateProvider'] = _CERTIFICATEPROVIDER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GrpcEndpoint = _reflection.GeneratedProtocolMessageType('GrpcEndpoint', (_message.Message,), {
  'DESCRIPTOR' : _GRPCENDPOINT,
  '__module__' : 'google.cloud.networksecurity.v1beta1.tls_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.GrpcEndpoint)
  })
_sym_db.RegisterMessage(GrpcEndpoint)

ValidationCA = _reflection.GeneratedProtocolMessageType('ValidationCA', (_message.Message,), {
  'DESCRIPTOR' : _VALIDATIONCA,
  '__module__' : 'google.cloud.networksecurity.v1beta1.tls_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.ValidationCA)
  })
_sym_db.RegisterMessage(ValidationCA)

CertificateProviderInstance = _reflection.GeneratedProtocolMessageType('CertificateProviderInstance', (_message.Message,), {
  'DESCRIPTOR' : _CERTIFICATEPROVIDERINSTANCE,
  '__module__' : 'google.cloud.networksecurity.v1beta1.tls_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.CertificateProviderInstance)
  })
_sym_db.RegisterMessage(CertificateProviderInstance)

CertificateProvider = _reflection.GeneratedProtocolMessageType('CertificateProvider', (_message.Message,), {
  'DESCRIPTOR' : _CERTIFICATEPROVIDER,
  '__module__' : 'google.cloud.networksecurity.v1beta1.tls_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1beta1.CertificateProvider)
  })
_sym_db.RegisterMessage(CertificateProvider)


DESCRIPTOR._options = None
_GRPCENDPOINT.fields_by_name['target_uri']._options = None
_CERTIFICATEPROVIDERINSTANCE.fields_by_name['plugin_instance']._options = None
# @@protoc_insertion_point(module_scope)
