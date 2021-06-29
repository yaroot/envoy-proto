# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1p1beta1/folder.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/securitycenter/v1p1beta1/folder.proto',
  package='google.cloud.securitycenter.v1p1beta1',
  syntax='proto3',
  serialized_options=b'\n)com.google.cloud.securitycenter.v1p1beta1B\013FolderProtoP\001ZSgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1p1beta1;securitycenter\252\002%Google.Cloud.SecurityCenter.V1P1Beta1\312\002%Google\\Cloud\\SecurityCenter\\V1p1beta1\352\002(Google::Cloud::SecurityCenter::V1p1Beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/cloud/securitycenter/v1p1beta1/folder.proto\x12%google.cloud.securitycenter.v1p1beta1\x1a\x1cgoogle/api/annotations.proto\"G\n\x06\x46older\x12\x17\n\x0fresource_folder\x18\x01 \x01(\t\x12$\n\x1cresource_folder_display_name\x18\x02 \x01(\tB\x8a\x02\n)com.google.cloud.securitycenter.v1p1beta1B\x0b\x46olderProtoP\x01ZSgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1p1beta1;securitycenter\xaa\x02%Google.Cloud.SecurityCenter.V1P1Beta1\xca\x02%Google\\Cloud\\SecurityCenter\\V1p1beta1\xea\x02(Google::Cloud::SecurityCenter::V1p1Beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_FOLDER = _descriptor.Descriptor(
  name='Folder',
  full_name='google.cloud.securitycenter.v1p1beta1.Folder',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_folder', full_name='google.cloud.securitycenter.v1p1beta1.Folder.resource_folder', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resource_folder_display_name', full_name='google.cloud.securitycenter.v1p1beta1.Folder.resource_folder_display_name', index=1,
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
  serialized_start=123,
  serialized_end=194,
)

DESCRIPTOR.message_types_by_name['Folder'] = _FOLDER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Folder = _reflection.GeneratedProtocolMessageType('Folder', (_message.Message,), {
  'DESCRIPTOR' : _FOLDER,
  '__module__' : 'google.cloud.securitycenter.v1p1beta1.folder_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1p1beta1.Folder)
  })
_sym_db.RegisterMessage(Folder)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
