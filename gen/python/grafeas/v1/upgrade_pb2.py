# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/upgrade.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from grafeas.v1 import package_pb2 as grafeas_dot_v1_dot_package__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='grafeas/v1/upgrade.proto',
  package='grafeas.v1',
  syntax='proto3',
  serialized_options=b'\n\rio.grafeas.v1P\001Z4github.com/grafeas/grafeas/proto/v1/grafeas_go_proto\242\002\003GRA',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x18grafeas/v1/upgrade.proto\x12\ngrafeas.v1\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x18grafeas/v1/package.proto\"\xaf\x01\n\x0bUpgradeNote\x12\x0f\n\x07package\x18\x01 \x01(\t\x12$\n\x07version\x18\x02 \x01(\x0b\x32\x13.grafeas.v1.Version\x12\x36\n\rdistributions\x18\x03 \x03(\x0b\x32\x1f.grafeas.v1.UpgradeDistribution\x12\x31\n\x0ewindows_update\x18\x04 \x01(\x0b\x32\x19.grafeas.v1.WindowsUpdate\"]\n\x13UpgradeDistribution\x12\x0f\n\x07\x63pe_uri\x18\x01 \x01(\t\x12\x16\n\x0e\x63lassification\x18\x02 \x01(\t\x12\x10\n\x08severity\x18\x03 \x01(\t\x12\x0b\n\x03\x63ve\x18\x04 \x03(\t\"\xec\x02\n\rWindowsUpdate\x12\x34\n\x08identity\x18\x01 \x01(\x0b\x32\".grafeas.v1.WindowsUpdate.Identity\x12\r\n\x05title\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x36\n\ncategories\x18\x04 \x03(\x0b\x32\".grafeas.v1.WindowsUpdate.Category\x12\x16\n\x0ekb_article_ids\x18\x05 \x03(\t\x12\x13\n\x0bsupport_url\x18\x06 \x01(\t\x12<\n\x18last_published_timestamp\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1a/\n\x08Identity\x12\x11\n\tupdate_id\x18\x01 \x01(\t\x12\x10\n\x08revision\x18\x02 \x01(\x05\x1a-\n\x08\x43\x61tegory\x12\x13\n\x0b\x63\x61tegory_id\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\"\xbb\x01\n\x11UpgradeOccurrence\x12\x0f\n\x07package\x18\x01 \x01(\t\x12+\n\x0eparsed_version\x18\x03 \x01(\x0b\x32\x13.grafeas.v1.Version\x12\x35\n\x0c\x64istribution\x18\x04 \x01(\x0b\x32\x1f.grafeas.v1.UpgradeDistribution\x12\x31\n\x0ewindows_update\x18\x05 \x01(\x0b\x32\x19.grafeas.v1.WindowsUpdateBM\n\rio.grafeas.v1P\x01Z4github.com/grafeas/grafeas/proto/v1/grafeas_go_proto\xa2\x02\x03GRAb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,grafeas_dot_v1_dot_package__pb2.DESCRIPTOR,])




_UPGRADENOTE = _descriptor.Descriptor(
  name='UpgradeNote',
  full_name='grafeas.v1.UpgradeNote',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='package', full_name='grafeas.v1.UpgradeNote.package', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='grafeas.v1.UpgradeNote.version', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='distributions', full_name='grafeas.v1.UpgradeNote.distributions', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='windows_update', full_name='grafeas.v1.UpgradeNote.windows_update', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_start=100,
  serialized_end=275,
)


_UPGRADEDISTRIBUTION = _descriptor.Descriptor(
  name='UpgradeDistribution',
  full_name='grafeas.v1.UpgradeDistribution',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cpe_uri', full_name='grafeas.v1.UpgradeDistribution.cpe_uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='classification', full_name='grafeas.v1.UpgradeDistribution.classification', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='severity', full_name='grafeas.v1.UpgradeDistribution.severity', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cve', full_name='grafeas.v1.UpgradeDistribution.cve', index=3,
      number=4, type=9, cpp_type=9, label=3,
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
  serialized_start=277,
  serialized_end=370,
)


_WINDOWSUPDATE_IDENTITY = _descriptor.Descriptor(
  name='Identity',
  full_name='grafeas.v1.WindowsUpdate.Identity',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='update_id', full_name='grafeas.v1.WindowsUpdate.Identity.update_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='revision', full_name='grafeas.v1.WindowsUpdate.Identity.revision', index=1,
      number=2, type=5, cpp_type=1, label=1,
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
  serialized_start=643,
  serialized_end=690,
)

_WINDOWSUPDATE_CATEGORY = _descriptor.Descriptor(
  name='Category',
  full_name='grafeas.v1.WindowsUpdate.Category',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='category_id', full_name='grafeas.v1.WindowsUpdate.Category.category_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='grafeas.v1.WindowsUpdate.Category.name', index=1,
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
  serialized_start=692,
  serialized_end=737,
)

_WINDOWSUPDATE = _descriptor.Descriptor(
  name='WindowsUpdate',
  full_name='grafeas.v1.WindowsUpdate',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='identity', full_name='grafeas.v1.WindowsUpdate.identity', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='title', full_name='grafeas.v1.WindowsUpdate.title', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='grafeas.v1.WindowsUpdate.description', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='categories', full_name='grafeas.v1.WindowsUpdate.categories', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='kb_article_ids', full_name='grafeas.v1.WindowsUpdate.kb_article_ids', index=4,
      number=5, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='support_url', full_name='grafeas.v1.WindowsUpdate.support_url', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_published_timestamp', full_name='grafeas.v1.WindowsUpdate.last_published_timestamp', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_WINDOWSUPDATE_IDENTITY, _WINDOWSUPDATE_CATEGORY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=373,
  serialized_end=737,
)


_UPGRADEOCCURRENCE = _descriptor.Descriptor(
  name='UpgradeOccurrence',
  full_name='grafeas.v1.UpgradeOccurrence',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='package', full_name='grafeas.v1.UpgradeOccurrence.package', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='parsed_version', full_name='grafeas.v1.UpgradeOccurrence.parsed_version', index=1,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='distribution', full_name='grafeas.v1.UpgradeOccurrence.distribution', index=2,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='windows_update', full_name='grafeas.v1.UpgradeOccurrence.windows_update', index=3,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_start=740,
  serialized_end=927,
)

_UPGRADENOTE.fields_by_name['version'].message_type = grafeas_dot_v1_dot_package__pb2._VERSION
_UPGRADENOTE.fields_by_name['distributions'].message_type = _UPGRADEDISTRIBUTION
_UPGRADENOTE.fields_by_name['windows_update'].message_type = _WINDOWSUPDATE
_WINDOWSUPDATE_IDENTITY.containing_type = _WINDOWSUPDATE
_WINDOWSUPDATE_CATEGORY.containing_type = _WINDOWSUPDATE
_WINDOWSUPDATE.fields_by_name['identity'].message_type = _WINDOWSUPDATE_IDENTITY
_WINDOWSUPDATE.fields_by_name['categories'].message_type = _WINDOWSUPDATE_CATEGORY
_WINDOWSUPDATE.fields_by_name['last_published_timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_UPGRADEOCCURRENCE.fields_by_name['parsed_version'].message_type = grafeas_dot_v1_dot_package__pb2._VERSION
_UPGRADEOCCURRENCE.fields_by_name['distribution'].message_type = _UPGRADEDISTRIBUTION
_UPGRADEOCCURRENCE.fields_by_name['windows_update'].message_type = _WINDOWSUPDATE
DESCRIPTOR.message_types_by_name['UpgradeNote'] = _UPGRADENOTE
DESCRIPTOR.message_types_by_name['UpgradeDistribution'] = _UPGRADEDISTRIBUTION
DESCRIPTOR.message_types_by_name['WindowsUpdate'] = _WINDOWSUPDATE
DESCRIPTOR.message_types_by_name['UpgradeOccurrence'] = _UPGRADEOCCURRENCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UpgradeNote = _reflection.GeneratedProtocolMessageType('UpgradeNote', (_message.Message,), {
  'DESCRIPTOR' : _UPGRADENOTE,
  '__module__' : 'grafeas.v1.upgrade_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1.UpgradeNote)
  })
_sym_db.RegisterMessage(UpgradeNote)

UpgradeDistribution = _reflection.GeneratedProtocolMessageType('UpgradeDistribution', (_message.Message,), {
  'DESCRIPTOR' : _UPGRADEDISTRIBUTION,
  '__module__' : 'grafeas.v1.upgrade_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1.UpgradeDistribution)
  })
_sym_db.RegisterMessage(UpgradeDistribution)

WindowsUpdate = _reflection.GeneratedProtocolMessageType('WindowsUpdate', (_message.Message,), {

  'Identity' : _reflection.GeneratedProtocolMessageType('Identity', (_message.Message,), {
    'DESCRIPTOR' : _WINDOWSUPDATE_IDENTITY,
    '__module__' : 'grafeas.v1.upgrade_pb2'
    # @@protoc_insertion_point(class_scope:grafeas.v1.WindowsUpdate.Identity)
    })
  ,

  'Category' : _reflection.GeneratedProtocolMessageType('Category', (_message.Message,), {
    'DESCRIPTOR' : _WINDOWSUPDATE_CATEGORY,
    '__module__' : 'grafeas.v1.upgrade_pb2'
    # @@protoc_insertion_point(class_scope:grafeas.v1.WindowsUpdate.Category)
    })
  ,
  'DESCRIPTOR' : _WINDOWSUPDATE,
  '__module__' : 'grafeas.v1.upgrade_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1.WindowsUpdate)
  })
_sym_db.RegisterMessage(WindowsUpdate)
_sym_db.RegisterMessage(WindowsUpdate.Identity)
_sym_db.RegisterMessage(WindowsUpdate.Category)

UpgradeOccurrence = _reflection.GeneratedProtocolMessageType('UpgradeOccurrence', (_message.Message,), {
  'DESCRIPTOR' : _UPGRADEOCCURRENCE,
  '__module__' : 'grafeas.v1.upgrade_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1.UpgradeOccurrence)
  })
_sym_db.RegisterMessage(UpgradeOccurrence)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)