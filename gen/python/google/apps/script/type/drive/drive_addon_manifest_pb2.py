# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/apps/script/type/drive/drive_addon_manifest.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.apps.script.type import extension_point_pb2 as google_dot_apps_dot_script_dot_type_dot_extension__point__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/apps/script/type/drive/drive_addon_manifest.proto',
  package='google.apps.script.type.drive',
  syntax='proto3',
  serialized_options=b'\n!com.google.apps.script.type.driveB\027DriveAddOnManifestProtoP\001Z<google.golang.org/genproto/googleapis/apps/script/type/drive\252\002\035Google.Apps.Script.Type.Drive\312\002\035Google\\Apps\\Script\\Type\\Drive\352\002!Google::Apps::Script::Type::Drive',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8google/apps/script/type/drive/drive_addon_manifest.proto\x12\x1dgoogle.apps.script.type.drive\x1a-google/apps/script/type/extension_point.proto\"\xb6\x01\n\x12\x44riveAddOnManifest\x12I\n\x10homepage_trigger\x18\x01 \x01(\x0b\x32/.google.apps.script.type.HomepageExtensionPoint\x12U\n\x19on_items_selected_trigger\x18\x02 \x01(\x0b\x32\x32.google.apps.script.type.drive.DriveExtensionPoint\"+\n\x13\x44riveExtensionPoint\x12\x14\n\x0crun_function\x18\x01 \x01(\tB\xe0\x01\n!com.google.apps.script.type.driveB\x17\x44riveAddOnManifestProtoP\x01Z<google.golang.org/genproto/googleapis/apps/script/type/drive\xaa\x02\x1dGoogle.Apps.Script.Type.Drive\xca\x02\x1dGoogle\\Apps\\Script\\Type\\Drive\xea\x02!Google::Apps::Script::Type::Driveb\x06proto3'
  ,
  dependencies=[google_dot_apps_dot_script_dot_type_dot_extension__point__pb2.DESCRIPTOR,])




_DRIVEADDONMANIFEST = _descriptor.Descriptor(
  name='DriveAddOnManifest',
  full_name='google.apps.script.type.drive.DriveAddOnManifest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='homepage_trigger', full_name='google.apps.script.type.drive.DriveAddOnManifest.homepage_trigger', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='on_items_selected_trigger', full_name='google.apps.script.type.drive.DriveAddOnManifest.on_items_selected_trigger', index=1,
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
  serialized_start=139,
  serialized_end=321,
)


_DRIVEEXTENSIONPOINT = _descriptor.Descriptor(
  name='DriveExtensionPoint',
  full_name='google.apps.script.type.drive.DriveExtensionPoint',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='run_function', full_name='google.apps.script.type.drive.DriveExtensionPoint.run_function', index=0,
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
  serialized_start=323,
  serialized_end=366,
)

_DRIVEADDONMANIFEST.fields_by_name['homepage_trigger'].message_type = google_dot_apps_dot_script_dot_type_dot_extension__point__pb2._HOMEPAGEEXTENSIONPOINT
_DRIVEADDONMANIFEST.fields_by_name['on_items_selected_trigger'].message_type = _DRIVEEXTENSIONPOINT
DESCRIPTOR.message_types_by_name['DriveAddOnManifest'] = _DRIVEADDONMANIFEST
DESCRIPTOR.message_types_by_name['DriveExtensionPoint'] = _DRIVEEXTENSIONPOINT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DriveAddOnManifest = _reflection.GeneratedProtocolMessageType('DriveAddOnManifest', (_message.Message,), {
  'DESCRIPTOR' : _DRIVEADDONMANIFEST,
  '__module__' : 'google.apps.script.type.drive.drive_addon_manifest_pb2'
  # @@protoc_insertion_point(class_scope:google.apps.script.type.drive.DriveAddOnManifest)
  })
_sym_db.RegisterMessage(DriveAddOnManifest)

DriveExtensionPoint = _reflection.GeneratedProtocolMessageType('DriveExtensionPoint', (_message.Message,), {
  'DESCRIPTOR' : _DRIVEEXTENSIONPOINT,
  '__module__' : 'google.apps.script.type.drive.drive_addon_manifest_pb2'
  # @@protoc_insertion_point(class_scope:google.apps.script.type.drive.DriveExtensionPoint)
  })
_sym_db.RegisterMessage(DriveExtensionPoint)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)