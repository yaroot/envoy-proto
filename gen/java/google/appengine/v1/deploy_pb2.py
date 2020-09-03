# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/appengine/v1/deploy.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/appengine/v1/deploy.proto',
  package='google.appengine.v1',
  syntax='proto3',
  serialized_options=b'\n\027com.google.appengine.v1B\013DeployProtoP\001Z<google.golang.org/genproto/googleapis/appengine/v1;appengine',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n google/appengine/v1/deploy.proto\x12\x13google.appengine.v1\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/api/annotations.proto\"\xbb\x02\n\nDeployment\x12\x39\n\x05\x66iles\x18\x01 \x03(\x0b\x32*.google.appengine.v1.Deployment.FilesEntry\x12\x35\n\tcontainer\x18\x02 \x01(\x0b\x32\".google.appengine.v1.ContainerInfo\x12)\n\x03zip\x18\x03 \x01(\x0b\x32\x1c.google.appengine.v1.ZipInfo\x12\x43\n\x13\x63loud_build_options\x18\x06 \x01(\x0b\x32&.google.appengine.v1.CloudBuildOptions\x1aK\n\nFilesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12,\n\x05value\x18\x02 \x01(\x0b\x32\x1d.google.appengine.v1.FileInfo:\x02\x38\x01\"C\n\x08\x46ileInfo\x12\x12\n\nsource_url\x18\x01 \x01(\t\x12\x10\n\x08sha1_sum\x18\x02 \x01(\t\x12\x11\n\tmime_type\x18\x03 \x01(\t\"\x1e\n\rContainerInfo\x12\r\n\x05image\x18\x01 \x01(\t\"b\n\x11\x43loudBuildOptions\x12\x15\n\rapp_yaml_path\x18\x01 \x01(\t\x12\x36\n\x13\x63loud_build_timeout\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"2\n\x07ZipInfo\x12\x12\n\nsource_url\x18\x03 \x01(\t\x12\x13\n\x0b\x66iles_count\x18\x04 \x01(\x05\x42\x66\n\x17\x63om.google.appengine.v1B\x0b\x44\x65ployProtoP\x01Z<google.golang.org/genproto/googleapis/appengine/v1;appengineb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_DEPLOYMENT_FILESENTRY = _descriptor.Descriptor(
  name='FilesEntry',
  full_name='google.appengine.v1.Deployment.FilesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.appengine.v1.Deployment.FilesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.appengine.v1.Deployment.FilesEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=360,
  serialized_end=435,
)

_DEPLOYMENT = _descriptor.Descriptor(
  name='Deployment',
  full_name='google.appengine.v1.Deployment',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='files', full_name='google.appengine.v1.Deployment.files', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='container', full_name='google.appengine.v1.Deployment.container', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='zip', full_name='google.appengine.v1.Deployment.zip', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cloud_build_options', full_name='google.appengine.v1.Deployment.cloud_build_options', index=3,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_DEPLOYMENT_FILESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=120,
  serialized_end=435,
)


_FILEINFO = _descriptor.Descriptor(
  name='FileInfo',
  full_name='google.appengine.v1.FileInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='source_url', full_name='google.appengine.v1.FileInfo.source_url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sha1_sum', full_name='google.appengine.v1.FileInfo.sha1_sum', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mime_type', full_name='google.appengine.v1.FileInfo.mime_type', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_start=437,
  serialized_end=504,
)


_CONTAINERINFO = _descriptor.Descriptor(
  name='ContainerInfo',
  full_name='google.appengine.v1.ContainerInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='image', full_name='google.appengine.v1.ContainerInfo.image', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=506,
  serialized_end=536,
)


_CLOUDBUILDOPTIONS = _descriptor.Descriptor(
  name='CloudBuildOptions',
  full_name='google.appengine.v1.CloudBuildOptions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='app_yaml_path', full_name='google.appengine.v1.CloudBuildOptions.app_yaml_path', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cloud_build_timeout', full_name='google.appengine.v1.CloudBuildOptions.cloud_build_timeout', index=1,
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
  ],
  serialized_start=538,
  serialized_end=636,
)


_ZIPINFO = _descriptor.Descriptor(
  name='ZipInfo',
  full_name='google.appengine.v1.ZipInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='source_url', full_name='google.appengine.v1.ZipInfo.source_url', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='files_count', full_name='google.appengine.v1.ZipInfo.files_count', index=1,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=638,
  serialized_end=688,
)

_DEPLOYMENT_FILESENTRY.fields_by_name['value'].message_type = _FILEINFO
_DEPLOYMENT_FILESENTRY.containing_type = _DEPLOYMENT
_DEPLOYMENT.fields_by_name['files'].message_type = _DEPLOYMENT_FILESENTRY
_DEPLOYMENT.fields_by_name['container'].message_type = _CONTAINERINFO
_DEPLOYMENT.fields_by_name['zip'].message_type = _ZIPINFO
_DEPLOYMENT.fields_by_name['cloud_build_options'].message_type = _CLOUDBUILDOPTIONS
_CLOUDBUILDOPTIONS.fields_by_name['cloud_build_timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
DESCRIPTOR.message_types_by_name['Deployment'] = _DEPLOYMENT
DESCRIPTOR.message_types_by_name['FileInfo'] = _FILEINFO
DESCRIPTOR.message_types_by_name['ContainerInfo'] = _CONTAINERINFO
DESCRIPTOR.message_types_by_name['CloudBuildOptions'] = _CLOUDBUILDOPTIONS
DESCRIPTOR.message_types_by_name['ZipInfo'] = _ZIPINFO
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Deployment = _reflection.GeneratedProtocolMessageType('Deployment', (_message.Message,), {

  'FilesEntry' : _reflection.GeneratedProtocolMessageType('FilesEntry', (_message.Message,), {
    'DESCRIPTOR' : _DEPLOYMENT_FILESENTRY,
    '__module__' : 'google.appengine.v1.deploy_pb2'
    # @@protoc_insertion_point(class_scope:google.appengine.v1.Deployment.FilesEntry)
    })
  ,
  'DESCRIPTOR' : _DEPLOYMENT,
  '__module__' : 'google.appengine.v1.deploy_pb2'
  # @@protoc_insertion_point(class_scope:google.appengine.v1.Deployment)
  })
_sym_db.RegisterMessage(Deployment)
_sym_db.RegisterMessage(Deployment.FilesEntry)

FileInfo = _reflection.GeneratedProtocolMessageType('FileInfo', (_message.Message,), {
  'DESCRIPTOR' : _FILEINFO,
  '__module__' : 'google.appengine.v1.deploy_pb2'
  # @@protoc_insertion_point(class_scope:google.appengine.v1.FileInfo)
  })
_sym_db.RegisterMessage(FileInfo)

ContainerInfo = _reflection.GeneratedProtocolMessageType('ContainerInfo', (_message.Message,), {
  'DESCRIPTOR' : _CONTAINERINFO,
  '__module__' : 'google.appengine.v1.deploy_pb2'
  # @@protoc_insertion_point(class_scope:google.appengine.v1.ContainerInfo)
  })
_sym_db.RegisterMessage(ContainerInfo)

CloudBuildOptions = _reflection.GeneratedProtocolMessageType('CloudBuildOptions', (_message.Message,), {
  'DESCRIPTOR' : _CLOUDBUILDOPTIONS,
  '__module__' : 'google.appengine.v1.deploy_pb2'
  # @@protoc_insertion_point(class_scope:google.appengine.v1.CloudBuildOptions)
  })
_sym_db.RegisterMessage(CloudBuildOptions)

ZipInfo = _reflection.GeneratedProtocolMessageType('ZipInfo', (_message.Message,), {
  'DESCRIPTOR' : _ZIPINFO,
  '__module__' : 'google.appengine.v1.deploy_pb2'
  # @@protoc_insertion_point(class_scope:google.appengine.v1.ZipInfo)
  })
_sym_db.RegisterMessage(ZipInfo)


DESCRIPTOR._options = None
_DEPLOYMENT_FILESENTRY._options = None
# @@protoc_insertion_point(module_scope)
