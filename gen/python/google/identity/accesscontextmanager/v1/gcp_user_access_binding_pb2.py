# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/identity/accesscontextmanager/v1/gcp_user_access_binding.proto
"""Generated protocol buffer code."""
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
  name='google/identity/accesscontextmanager/v1/gcp_user_access_binding.proto',
  package='google.identity.accesscontextmanager.v1',
  syntax='proto3',
  serialized_options=b'\n+com.google.identity.accesscontextmanager.v1B\031GcpUserAccessBindingProtoP\001Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\242\002\004GACM\252\002\'Google.Identity.AccessContextManager.V1\312\002\'Google\\Identity\\AccessContextManager\\V1\352\002*Google::Identity::AccessContextManager::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/identity/accesscontextmanager/v1/gcp_user_access_binding.proto\x12\'google.identity.accesscontextmanager.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xa3\x02\n\x14GcpUserAccessBinding\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x19\n\tgroup_key\x18\x02 \x01(\tB\x06\xe0\x41\x02\xe0\x41\x05\x12N\n\raccess_levels\x18\x03 \x03(\tB7\xe0\x41\x02\xfa\x41\x31\n/accesscontextmanager.googleapis.com/AccessLevel:\x8c\x01\xea\x41\x88\x01\n8accesscontextmanager.googleapis.com/GcpUserAccessBinding\x12Lorganizations/{organization}/gcpUserAccessBindings/{gcp_user_access_binding}B\xaf\x02\n+com.google.identity.accesscontextmanager.v1B\x19GcpUserAccessBindingProtoP\x01Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\xa2\x02\x04GACM\xaa\x02\'Google.Identity.AccessContextManager.V1\xca\x02\'Google\\Identity\\AccessContextManager\\V1\xea\x02*Google::Identity::AccessContextManager::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_GCPUSERACCESSBINDING = _descriptor.Descriptor(
  name='GcpUserAccessBinding',
  full_name='google.identity.accesscontextmanager.v1.GcpUserAccessBinding',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.identity.accesscontextmanager.v1.GcpUserAccessBinding.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='group_key', full_name='google.identity.accesscontextmanager.v1.GcpUserAccessBinding.group_key', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='access_levels', full_name='google.identity.accesscontextmanager.v1.GcpUserAccessBinding.access_levels', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A1\n/accesscontextmanager.googleapis.com/AccessLevel', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\210\001\n8accesscontextmanager.googleapis.com/GcpUserAccessBinding\022Lorganizations/{organization}/gcpUserAccessBindings/{gcp_user_access_binding}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=205,
  serialized_end=496,
)

DESCRIPTOR.message_types_by_name['GcpUserAccessBinding'] = _GCPUSERACCESSBINDING
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GcpUserAccessBinding = _reflection.GeneratedProtocolMessageType('GcpUserAccessBinding', (_message.Message,), {
  'DESCRIPTOR' : _GCPUSERACCESSBINDING,
  '__module__' : 'google.identity.accesscontextmanager.v1.gcp_user_access_binding_pb2'
  # @@protoc_insertion_point(class_scope:google.identity.accesscontextmanager.v1.GcpUserAccessBinding)
  })
_sym_db.RegisterMessage(GcpUserAccessBinding)


DESCRIPTOR._options = None
_GCPUSERACCESSBINDING.fields_by_name['name']._options = None
_GCPUSERACCESSBINDING.fields_by_name['group_key']._options = None
_GCPUSERACCESSBINDING.fields_by_name['access_levels']._options = None
_GCPUSERACCESSBINDING._options = None
# @@protoc_insertion_point(module_scope)