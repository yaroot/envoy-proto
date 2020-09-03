# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/package/package.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/devtools/containeranalysis/v1beta1/package/package.proto',
  package='grafeas.v1beta1.package',
  syntax='proto3',
  serialized_options=b'\n\026io.grafeas.v1beta1.pkgP\001ZXgoogle.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/package;package\242\002\003GRA',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n?google/devtools/containeranalysis/v1beta1/package/package.proto\x12\x17grafeas.v1beta1.package\"\xcc\x01\n\x0c\x44istribution\x12\x0f\n\x07\x63pe_uri\x18\x01 \x01(\t\x12;\n\x0c\x61rchitecture\x18\x02 \x01(\x0e\x32%.grafeas.v1beta1.package.Architecture\x12\x38\n\x0elatest_version\x18\x03 \x01(\x0b\x32 .grafeas.v1beta1.package.Version\x12\x12\n\nmaintainer\x18\x04 \x01(\t\x12\x0b\n\x03url\x18\x05 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x06 \x01(\t\"\\\n\x08Location\x12\x0f\n\x07\x63pe_uri\x18\x01 \x01(\t\x12\x31\n\x07version\x18\x02 \x01(\x0b\x32 .grafeas.v1beta1.package.Version\x12\x0c\n\x04path\x18\x03 \x01(\t\"T\n\x07Package\x12\x0c\n\x04name\x18\x01 \x01(\t\x12;\n\x0c\x64istribution\x18\n \x03(\x0b\x32%.grafeas.v1beta1.package.Distribution\"F\n\x07\x44\x65tails\x12;\n\x0cinstallation\x18\x01 \x01(\x0b\x32%.grafeas.v1beta1.package.Installation\"Q\n\x0cInstallation\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x33\n\x08location\x18\x02 \x03(\x0b\x32!.grafeas.v1beta1.package.Location\"\xc7\x01\n\x07Version\x12\r\n\x05\x65poch\x18\x01 \x01(\x05\x12\x0c\n\x04name\x18\x02 \x01(\t\x12\x10\n\x08revision\x18\x03 \x01(\t\x12:\n\x04kind\x18\x04 \x01(\x0e\x32,.grafeas.v1beta1.package.Version.VersionKind\"Q\n\x0bVersionKind\x12\x1c\n\x18VERSION_KIND_UNSPECIFIED\x10\x00\x12\n\n\x06NORMAL\x10\x01\x12\x0b\n\x07MINIMUM\x10\x02\x12\x0b\n\x07MAXIMUM\x10\x03*>\n\x0c\x41rchitecture\x12\x1c\n\x18\x41RCHITECTURE_UNSPECIFIED\x10\x00\x12\x07\n\x03X86\x10\x01\x12\x07\n\x03X64\x10\x02\x42z\n\x16io.grafeas.v1beta1.pkgP\x01ZXgoogle.golang.org/genproto/googleapis/devtools/containeranalysis/v1beta1/package;package\xa2\x02\x03GRAb\x06proto3'
)

_ARCHITECTURE = _descriptor.EnumDescriptor(
  name='Architecture',
  full_name='grafeas.v1beta1.package.Architecture',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ARCHITECTURE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='X86', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='X64', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=836,
  serialized_end=898,
)
_sym_db.RegisterEnumDescriptor(_ARCHITECTURE)

Architecture = enum_type_wrapper.EnumTypeWrapper(_ARCHITECTURE)
ARCHITECTURE_UNSPECIFIED = 0
X86 = 1
X64 = 2


_VERSION_VERSIONKIND = _descriptor.EnumDescriptor(
  name='VersionKind',
  full_name='grafeas.v1beta1.package.Version.VersionKind',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='VERSION_KIND_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NORMAL', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MINIMUM', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MAXIMUM', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=753,
  serialized_end=834,
)
_sym_db.RegisterEnumDescriptor(_VERSION_VERSIONKIND)


_DISTRIBUTION = _descriptor.Descriptor(
  name='Distribution',
  full_name='grafeas.v1beta1.package.Distribution',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cpe_uri', full_name='grafeas.v1beta1.package.Distribution.cpe_uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='architecture', full_name='grafeas.v1beta1.package.Distribution.architecture', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='latest_version', full_name='grafeas.v1beta1.package.Distribution.latest_version', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='maintainer', full_name='grafeas.v1beta1.package.Distribution.maintainer', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='url', full_name='grafeas.v1beta1.package.Distribution.url', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='grafeas.v1beta1.package.Distribution.description', index=5,
      number=6, type=9, cpp_type=9, label=1,
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
  serialized_start=93,
  serialized_end=297,
)


_LOCATION = _descriptor.Descriptor(
  name='Location',
  full_name='grafeas.v1beta1.package.Location',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cpe_uri', full_name='grafeas.v1beta1.package.Location.cpe_uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='grafeas.v1beta1.package.Location.version', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='path', full_name='grafeas.v1beta1.package.Location.path', index=2,
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
  serialized_start=299,
  serialized_end=391,
)


_PACKAGE = _descriptor.Descriptor(
  name='Package',
  full_name='grafeas.v1beta1.package.Package',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='grafeas.v1beta1.package.Package.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='distribution', full_name='grafeas.v1beta1.package.Package.distribution', index=1,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=393,
  serialized_end=477,
)


_DETAILS = _descriptor.Descriptor(
  name='Details',
  full_name='grafeas.v1beta1.package.Details',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='installation', full_name='grafeas.v1beta1.package.Details.installation', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=479,
  serialized_end=549,
)


_INSTALLATION = _descriptor.Descriptor(
  name='Installation',
  full_name='grafeas.v1beta1.package.Installation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='grafeas.v1beta1.package.Installation.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location', full_name='grafeas.v1beta1.package.Installation.location', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=551,
  serialized_end=632,
)


_VERSION = _descriptor.Descriptor(
  name='Version',
  full_name='grafeas.v1beta1.package.Version',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='epoch', full_name='grafeas.v1beta1.package.Version.epoch', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='grafeas.v1beta1.package.Version.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='revision', full_name='grafeas.v1beta1.package.Version.revision', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='kind', full_name='grafeas.v1beta1.package.Version.kind', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _VERSION_VERSIONKIND,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=635,
  serialized_end=834,
)

_DISTRIBUTION.fields_by_name['architecture'].enum_type = _ARCHITECTURE
_DISTRIBUTION.fields_by_name['latest_version'].message_type = _VERSION
_LOCATION.fields_by_name['version'].message_type = _VERSION
_PACKAGE.fields_by_name['distribution'].message_type = _DISTRIBUTION
_DETAILS.fields_by_name['installation'].message_type = _INSTALLATION
_INSTALLATION.fields_by_name['location'].message_type = _LOCATION
_VERSION.fields_by_name['kind'].enum_type = _VERSION_VERSIONKIND
_VERSION_VERSIONKIND.containing_type = _VERSION
DESCRIPTOR.message_types_by_name['Distribution'] = _DISTRIBUTION
DESCRIPTOR.message_types_by_name['Location'] = _LOCATION
DESCRIPTOR.message_types_by_name['Package'] = _PACKAGE
DESCRIPTOR.message_types_by_name['Details'] = _DETAILS
DESCRIPTOR.message_types_by_name['Installation'] = _INSTALLATION
DESCRIPTOR.message_types_by_name['Version'] = _VERSION
DESCRIPTOR.enum_types_by_name['Architecture'] = _ARCHITECTURE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Distribution = _reflection.GeneratedProtocolMessageType('Distribution', (_message.Message,), {
  'DESCRIPTOR' : _DISTRIBUTION,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.package.package_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Distribution)
  })
_sym_db.RegisterMessage(Distribution)

Location = _reflection.GeneratedProtocolMessageType('Location', (_message.Message,), {
  'DESCRIPTOR' : _LOCATION,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.package.package_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Location)
  })
_sym_db.RegisterMessage(Location)

Package = _reflection.GeneratedProtocolMessageType('Package', (_message.Message,), {
  'DESCRIPTOR' : _PACKAGE,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.package.package_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Package)
  })
_sym_db.RegisterMessage(Package)

Details = _reflection.GeneratedProtocolMessageType('Details', (_message.Message,), {
  'DESCRIPTOR' : _DETAILS,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.package.package_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Details)
  })
_sym_db.RegisterMessage(Details)

Installation = _reflection.GeneratedProtocolMessageType('Installation', (_message.Message,), {
  'DESCRIPTOR' : _INSTALLATION,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.package.package_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Installation)
  })
_sym_db.RegisterMessage(Installation)

Version = _reflection.GeneratedProtocolMessageType('Version', (_message.Message,), {
  'DESCRIPTOR' : _VERSION,
  '__module__' : 'google.devtools.containeranalysis.v1beta1.package.package_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Version)
  })
_sym_db.RegisterMessage(Version)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
