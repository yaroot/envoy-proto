# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/artifactregistry/v1beta2/package.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/artifactregistry/v1beta2/package.proto',
  package='google.devtools.artifactregistry.v1beta2',
  syntax='proto3',
  serialized_options=b'\n,com.google.devtools.artifactregistry.v1beta2B\014PackageProtoP\001ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\252\002%Google.Cloud.ArtifactRegistry.V1Beta2\312\002%Google\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Google::Cloud::ArtifactRegistry::V1beta2',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n6google/devtools/artifactregistry/v1beta2/package.proto\x12(google.devtools.artifactregistry.v1beta2\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\x8f\x01\n\x07Package\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12/\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"L\n\x13ListPackagesRequest\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"t\n\x14ListPackagesResponse\x12\x43\n\x08packages\x18\x01 \x03(\x0b\x32\x31.google.devtools.artifactregistry.v1beta2.Package\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"!\n\x11GetPackageRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\"$\n\x14\x44\x65letePackageRequest\x12\x0c\n\x04name\x18\x01 \x01(\tB\x93\x02\n,com.google.devtools.artifactregistry.v1beta2B\x0cPackageProtoP\x01ZXgoogle.golang.org/genproto/googleapis/devtools/artifactregistry/v1beta2;artifactregistry\xaa\x02%Google.Cloud.ArtifactRegistry.V1Beta2\xca\x02%Google\\Cloud\\ArtifactRegistry\\V1beta2\xea\x02(Google::Cloud::ArtifactRegistry::V1beta2b\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_PACKAGE = _descriptor.Descriptor(
  name='Package',
  full_name='google.devtools.artifactregistry.v1beta2.Package',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.devtools.artifactregistry.v1beta2.Package.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.devtools.artifactregistry.v1beta2.Package.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.devtools.artifactregistry.v1beta2.Package.create_time', index=2,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.devtools.artifactregistry.v1beta2.Package.update_time', index=3,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_start=164,
  serialized_end=307,
)


_LISTPACKAGESREQUEST = _descriptor.Descriptor(
  name='ListPackagesRequest',
  full_name='google.devtools.artifactregistry.v1beta2.ListPackagesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.devtools.artifactregistry.v1beta2.ListPackagesRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.devtools.artifactregistry.v1beta2.ListPackagesRequest.page_size', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.devtools.artifactregistry.v1beta2.ListPackagesRequest.page_token', index=2,
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
  serialized_start=309,
  serialized_end=385,
)


_LISTPACKAGESRESPONSE = _descriptor.Descriptor(
  name='ListPackagesResponse',
  full_name='google.devtools.artifactregistry.v1beta2.ListPackagesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='packages', full_name='google.devtools.artifactregistry.v1beta2.ListPackagesResponse.packages', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.devtools.artifactregistry.v1beta2.ListPackagesResponse.next_page_token', index=1,
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
  serialized_start=387,
  serialized_end=503,
)


_GETPACKAGEREQUEST = _descriptor.Descriptor(
  name='GetPackageRequest',
  full_name='google.devtools.artifactregistry.v1beta2.GetPackageRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.devtools.artifactregistry.v1beta2.GetPackageRequest.name', index=0,
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
  serialized_start=505,
  serialized_end=538,
)


_DELETEPACKAGEREQUEST = _descriptor.Descriptor(
  name='DeletePackageRequest',
  full_name='google.devtools.artifactregistry.v1beta2.DeletePackageRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.devtools.artifactregistry.v1beta2.DeletePackageRequest.name', index=0,
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
  serialized_start=540,
  serialized_end=576,
)

_PACKAGE.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_PACKAGE.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_LISTPACKAGESRESPONSE.fields_by_name['packages'].message_type = _PACKAGE
DESCRIPTOR.message_types_by_name['Package'] = _PACKAGE
DESCRIPTOR.message_types_by_name['ListPackagesRequest'] = _LISTPACKAGESREQUEST
DESCRIPTOR.message_types_by_name['ListPackagesResponse'] = _LISTPACKAGESRESPONSE
DESCRIPTOR.message_types_by_name['GetPackageRequest'] = _GETPACKAGEREQUEST
DESCRIPTOR.message_types_by_name['DeletePackageRequest'] = _DELETEPACKAGEREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Package = _reflection.GeneratedProtocolMessageType('Package', (_message.Message,), {
  'DESCRIPTOR' : _PACKAGE,
  '__module__' : 'google.devtools.artifactregistry.v1beta2.package_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.Package)
  })
_sym_db.RegisterMessage(Package)

ListPackagesRequest = _reflection.GeneratedProtocolMessageType('ListPackagesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTPACKAGESREQUEST,
  '__module__' : 'google.devtools.artifactregistry.v1beta2.package_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ListPackagesRequest)
  })
_sym_db.RegisterMessage(ListPackagesRequest)

ListPackagesResponse = _reflection.GeneratedProtocolMessageType('ListPackagesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTPACKAGESRESPONSE,
  '__module__' : 'google.devtools.artifactregistry.v1beta2.package_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ListPackagesResponse)
  })
_sym_db.RegisterMessage(ListPackagesResponse)

GetPackageRequest = _reflection.GeneratedProtocolMessageType('GetPackageRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETPACKAGEREQUEST,
  '__module__' : 'google.devtools.artifactregistry.v1beta2.package_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.GetPackageRequest)
  })
_sym_db.RegisterMessage(GetPackageRequest)

DeletePackageRequest = _reflection.GeneratedProtocolMessageType('DeletePackageRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEPACKAGEREQUEST,
  '__module__' : 'google.devtools.artifactregistry.v1beta2.package_pb2'
  # @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.DeletePackageRequest)
  })
_sym_db.RegisterMessage(DeletePackageRequest)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
