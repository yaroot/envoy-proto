# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/api/monitored_resource.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import label_pb2 as google_dot_api_dot_label__pb2
from google.api import launch_stage_pb2 as google_dot_api_dot_launch__stage__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/api/monitored_resource.proto',
  package='google.api',
  syntax='proto3',
  serialized_options=b'\n\016com.google.apiB\026MonitoredResourceProtoP\001ZCgoogle.golang.org/genproto/googleapis/api/monitoredres;monitoredres\370\001\001\242\002\004GAPI',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n#google/api/monitored_resource.proto\x12\ngoogle.api\x1a\x16google/api/label.proto\x1a\x1dgoogle/api/launch_stage.proto\x1a\x1cgoogle/protobuf/struct.proto\"\xc0\x01\n\x1bMonitoredResourceDescriptor\x12\x0c\n\x04name\x18\x05 \x01(\t\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12+\n\x06labels\x18\x04 \x03(\x0b\x32\x1b.google.api.LabelDescriptor\x12-\n\x0claunch_stage\x18\x07 \x01(\x0e\x32\x17.google.api.LaunchStage\"\x8b\x01\n\x11MonitoredResource\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x39\n\x06labels\x18\x02 \x03(\x0b\x32).google.api.MonitoredResource.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xca\x01\n\x19MonitoredResourceMetadata\x12.\n\rsystem_labels\x18\x01 \x01(\x0b\x32\x17.google.protobuf.Struct\x12J\n\x0buser_labels\x18\x02 \x03(\x0b\x32\x35.google.api.MonitoredResourceMetadata.UserLabelsEntry\x1a\x31\n\x0fUserLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42y\n\x0e\x63om.google.apiB\x16MonitoredResourceProtoP\x01ZCgoogle.golang.org/genproto/googleapis/api/monitoredres;monitoredres\xf8\x01\x01\xa2\x02\x04GAPIb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_label__pb2.DESCRIPTOR,google_dot_api_dot_launch__stage__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,])




_MONITOREDRESOURCEDESCRIPTOR = _descriptor.Descriptor(
  name='MonitoredResourceDescriptor',
  full_name='google.api.MonitoredResourceDescriptor',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.api.MonitoredResourceDescriptor.name', index=0,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.api.MonitoredResourceDescriptor.type', index=1,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.api.MonitoredResourceDescriptor.display_name', index=2,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.api.MonitoredResourceDescriptor.description', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.api.MonitoredResourceDescriptor.labels', index=4,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='launch_stage', full_name='google.api.MonitoredResourceDescriptor.launch_stage', index=5,
      number=7, type=14, cpp_type=8, label=1,
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
  serialized_start=137,
  serialized_end=329,
)


_MONITOREDRESOURCE_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.api.MonitoredResource.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.api.MonitoredResource.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.api.MonitoredResource.LabelsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=426,
  serialized_end=471,
)

_MONITOREDRESOURCE = _descriptor.Descriptor(
  name='MonitoredResource',
  full_name='google.api.MonitoredResource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='google.api.MonitoredResource.type', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.api.MonitoredResource.labels', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_MONITOREDRESOURCE_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=332,
  serialized_end=471,
)


_MONITOREDRESOURCEMETADATA_USERLABELSENTRY = _descriptor.Descriptor(
  name='UserLabelsEntry',
  full_name='google.api.MonitoredResourceMetadata.UserLabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.api.MonitoredResourceMetadata.UserLabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.api.MonitoredResourceMetadata.UserLabelsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=627,
  serialized_end=676,
)

_MONITOREDRESOURCEMETADATA = _descriptor.Descriptor(
  name='MonitoredResourceMetadata',
  full_name='google.api.MonitoredResourceMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='system_labels', full_name='google.api.MonitoredResourceMetadata.system_labels', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_labels', full_name='google.api.MonitoredResourceMetadata.user_labels', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_MONITOREDRESOURCEMETADATA_USERLABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=474,
  serialized_end=676,
)

_MONITOREDRESOURCEDESCRIPTOR.fields_by_name['labels'].message_type = google_dot_api_dot_label__pb2._LABELDESCRIPTOR
_MONITOREDRESOURCEDESCRIPTOR.fields_by_name['launch_stage'].enum_type = google_dot_api_dot_launch__stage__pb2._LAUNCHSTAGE
_MONITOREDRESOURCE_LABELSENTRY.containing_type = _MONITOREDRESOURCE
_MONITOREDRESOURCE.fields_by_name['labels'].message_type = _MONITOREDRESOURCE_LABELSENTRY
_MONITOREDRESOURCEMETADATA_USERLABELSENTRY.containing_type = _MONITOREDRESOURCEMETADATA
_MONITOREDRESOURCEMETADATA.fields_by_name['system_labels'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_MONITOREDRESOURCEMETADATA.fields_by_name['user_labels'].message_type = _MONITOREDRESOURCEMETADATA_USERLABELSENTRY
DESCRIPTOR.message_types_by_name['MonitoredResourceDescriptor'] = _MONITOREDRESOURCEDESCRIPTOR
DESCRIPTOR.message_types_by_name['MonitoredResource'] = _MONITOREDRESOURCE
DESCRIPTOR.message_types_by_name['MonitoredResourceMetadata'] = _MONITOREDRESOURCEMETADATA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MonitoredResourceDescriptor = _reflection.GeneratedProtocolMessageType('MonitoredResourceDescriptor', (_message.Message,), {
  'DESCRIPTOR' : _MONITOREDRESOURCEDESCRIPTOR,
  '__module__' : 'google.api.monitored_resource_pb2'
  # @@protoc_insertion_point(class_scope:google.api.MonitoredResourceDescriptor)
  })
_sym_db.RegisterMessage(MonitoredResourceDescriptor)

MonitoredResource = _reflection.GeneratedProtocolMessageType('MonitoredResource', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _MONITOREDRESOURCE_LABELSENTRY,
    '__module__' : 'google.api.monitored_resource_pb2'
    # @@protoc_insertion_point(class_scope:google.api.MonitoredResource.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _MONITOREDRESOURCE,
  '__module__' : 'google.api.monitored_resource_pb2'
  # @@protoc_insertion_point(class_scope:google.api.MonitoredResource)
  })
_sym_db.RegisterMessage(MonitoredResource)
_sym_db.RegisterMessage(MonitoredResource.LabelsEntry)

MonitoredResourceMetadata = _reflection.GeneratedProtocolMessageType('MonitoredResourceMetadata', (_message.Message,), {

  'UserLabelsEntry' : _reflection.GeneratedProtocolMessageType('UserLabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _MONITOREDRESOURCEMETADATA_USERLABELSENTRY,
    '__module__' : 'google.api.monitored_resource_pb2'
    # @@protoc_insertion_point(class_scope:google.api.MonitoredResourceMetadata.UserLabelsEntry)
    })
  ,
  'DESCRIPTOR' : _MONITOREDRESOURCEMETADATA,
  '__module__' : 'google.api.monitored_resource_pb2'
  # @@protoc_insertion_point(class_scope:google.api.MonitoredResourceMetadata)
  })
_sym_db.RegisterMessage(MonitoredResourceMetadata)
_sym_db.RegisterMessage(MonitoredResourceMetadata.UserLabelsEntry)


DESCRIPTOR._options = None
_MONITOREDRESOURCE_LABELSENTRY._options = None
_MONITOREDRESOURCEMETADATA_USERLABELSENTRY._options = None
# @@protoc_insertion_point(module_scope)
