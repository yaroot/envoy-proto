# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4/tenant.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/talent/v4/tenant.proto',
  package='google.cloud.talent.v4',
  syntax='proto3',
  serialized_options=b'\n\032com.google.cloud.talent.v4B\013TenantProtoP\001Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\242\002\003CTS',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n#google/cloud/talent/v4/tenant.proto\x12\x16google.cloud.talent.v4\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"v\n\x06Tenant\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x18\n\x0b\x65xternal_id\x18\x02 \x01(\tB\x03\xe0\x41\x02:D\xea\x41\x41\n\x1ajobs.googleapis.com/Tenant\x12#projects/{project}/tenants/{tenant}Bo\n\x1a\x63om.google.cloud.talent.v4B\x0bTenantProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/talent/v4;talent\xa2\x02\x03\x43TSb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_TENANT = _descriptor.Descriptor(
  name='Tenant',
  full_name='google.cloud.talent.v4.Tenant',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.talent.v4.Tenant.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='external_id', full_name='google.cloud.talent.v4.Tenant.external_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_options=b'\352AA\n\032jobs.googleapis.com/Tenant\022#projects/{project}/tenants/{tenant}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=153,
  serialized_end=271,
)

DESCRIPTOR.message_types_by_name['Tenant'] = _TENANT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Tenant = _reflection.GeneratedProtocolMessageType('Tenant', (_message.Message,), {
  'DESCRIPTOR' : _TENANT,
  '__module__' : 'google.cloud.talent.v4.tenant_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.talent.v4.Tenant)
  })
_sym_db.RegisterMessage(Tenant)


DESCRIPTOR._options = None
_TENANT.fields_by_name['external_id']._options = None
_TENANT._options = None
# @@protoc_insertion_point(module_scope)