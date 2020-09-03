# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/admin/v1/field.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.firestore.admin.v1 import index_pb2 as google_dot_firestore_dot_admin_dot_v1_dot_index__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/firestore/admin/v1/field.proto',
  package='google.firestore.admin.v1',
  syntax='proto3',
  serialized_options=b'\n\035com.google.firestore.admin.v1B\nFieldProtoP\001Z>google.golang.org/genproto/googleapis/firestore/admin/v1;admin\242\002\004GCFS\252\002\037Google.Cloud.Firestore.Admin.V1\312\002\037Google\\Cloud\\Firestore\\Admin\\V1\352\002#Google::Cloud::Firestore::Admin::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%google/firestore/admin/v1/field.proto\x12\x19google.firestore.admin.v1\x1a\x19google/api/resource.proto\x1a%google/firestore/admin/v1/index.proto\x1a\x1cgoogle/api/annotations.proto\"\xe0\x02\n\x05\x46ield\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x42\n\x0cindex_config\x18\x02 \x01(\x0b\x32,.google.firestore.admin.v1.Field.IndexConfig\x1a\x89\x01\n\x0bIndexConfig\x12\x31\n\x07indexes\x18\x01 \x03(\x0b\x32 .google.firestore.admin.v1.Index\x12\x1c\n\x14uses_ancestor_config\x18\x02 \x01(\x08\x12\x16\n\x0e\x61ncestor_field\x18\x03 \x01(\t\x12\x11\n\treverting\x18\x04 \x01(\x08:y\xea\x41v\n\x1e\x66irestore.googleapis.com/Field\x12Tprojects/{project}/databases/{database}/collectionGroups/{collection}/fields/{field}B\xde\x01\n\x1d\x63om.google.firestore.admin.v1B\nFieldProtoP\x01Z>google.golang.org/genproto/googleapis/firestore/admin/v1;admin\xa2\x02\x04GCFS\xaa\x02\x1fGoogle.Cloud.Firestore.Admin.V1\xca\x02\x1fGoogle\\Cloud\\Firestore\\Admin\\V1\xea\x02#Google::Cloud::Firestore::Admin::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_firestore_dot_admin_dot_v1_dot_index__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_FIELD_INDEXCONFIG = _descriptor.Descriptor(
  name='IndexConfig',
  full_name='google.firestore.admin.v1.Field.IndexConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='indexes', full_name='google.firestore.admin.v1.Field.IndexConfig.indexes', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='uses_ancestor_config', full_name='google.firestore.admin.v1.Field.IndexConfig.uses_ancestor_config', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ancestor_field', full_name='google.firestore.admin.v1.Field.IndexConfig.ancestor_field', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverting', full_name='google.firestore.admin.v1.Field.IndexConfig.reverting', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=257,
  serialized_end=394,
)

_FIELD = _descriptor.Descriptor(
  name='Field',
  full_name='google.firestore.admin.v1.Field',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.firestore.admin.v1.Field.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='index_config', full_name='google.firestore.admin.v1.Field.index_config', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FIELD_INDEXCONFIG, ],
  enum_types=[
  ],
  serialized_options=b'\352Av\n\036firestore.googleapis.com/Field\022Tprojects/{project}/databases/{database}/collectionGroups/{collection}/fields/{field}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=165,
  serialized_end=517,
)

_FIELD_INDEXCONFIG.fields_by_name['indexes'].message_type = google_dot_firestore_dot_admin_dot_v1_dot_index__pb2._INDEX
_FIELD_INDEXCONFIG.containing_type = _FIELD
_FIELD.fields_by_name['index_config'].message_type = _FIELD_INDEXCONFIG
DESCRIPTOR.message_types_by_name['Field'] = _FIELD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Field = _reflection.GeneratedProtocolMessageType('Field', (_message.Message,), {

  'IndexConfig' : _reflection.GeneratedProtocolMessageType('IndexConfig', (_message.Message,), {
    'DESCRIPTOR' : _FIELD_INDEXCONFIG,
    '__module__' : 'google.firestore.admin.v1.field_pb2'
    # @@protoc_insertion_point(class_scope:google.firestore.admin.v1.Field.IndexConfig)
    })
  ,
  'DESCRIPTOR' : _FIELD,
  '__module__' : 'google.firestore.admin.v1.field_pb2'
  # @@protoc_insertion_point(class_scope:google.firestore.admin.v1.Field)
  })
_sym_db.RegisterMessage(Field)
_sym_db.RegisterMessage(Field.IndexConfig)


DESCRIPTOR._options = None
_FIELD._options = None
# @@protoc_insertion_point(module_scope)
