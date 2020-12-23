# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/files.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2 import config_file_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_config__file__pb2
from google.actions.sdk.v2 import data_file_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_data__file__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/files.proto',
  package='google.actions.sdk.v2',
  syntax='proto3',
  serialized_options=b'\n\031com.google.actions.sdk.v2B\nFilesProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!google/actions/sdk/v2/files.proto\x12\x15google.actions.sdk.v2\x1a\'google/actions/sdk/v2/config_file.proto\x1a%google/actions/sdk/v2/data_file.proto\"\x88\x01\n\x05\x46iles\x12:\n\x0c\x63onfig_files\x18\x01 \x01(\x0b\x32\".google.actions.sdk.v2.ConfigFilesH\x00\x12\x36\n\ndata_files\x18\x02 \x01(\x0b\x32 .google.actions.sdk.v2.DataFilesH\x00\x42\x0b\n\tfile_typeBc\n\x19\x63om.google.actions.sdk.v2B\nFilesProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_config__file__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_data__file__pb2.DESCRIPTOR,])




_FILES = _descriptor.Descriptor(
  name='Files',
  full_name='google.actions.sdk.v2.Files',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='config_files', full_name='google.actions.sdk.v2.Files.config_files', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data_files', full_name='google.actions.sdk.v2.Files.data_files', index=1,
      number=2, type=11, cpp_type=10, label=1,
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
      name='file_type', full_name='google.actions.sdk.v2.Files.file_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=141,
  serialized_end=277,
)

_FILES.fields_by_name['config_files'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_config__file__pb2._CONFIGFILES
_FILES.fields_by_name['data_files'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_data__file__pb2._DATAFILES
_FILES.oneofs_by_name['file_type'].fields.append(
  _FILES.fields_by_name['config_files'])
_FILES.fields_by_name['config_files'].containing_oneof = _FILES.oneofs_by_name['file_type']
_FILES.oneofs_by_name['file_type'].fields.append(
  _FILES.fields_by_name['data_files'])
_FILES.fields_by_name['data_files'].containing_oneof = _FILES.oneofs_by_name['file_type']
DESCRIPTOR.message_types_by_name['Files'] = _FILES
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Files = _reflection.GeneratedProtocolMessageType('Files', (_message.Message,), {
  'DESCRIPTOR' : _FILES,
  '__module__' : 'google.actions.sdk.v2.files_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.Files)
  })
_sym_db.RegisterMessage(Files)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
