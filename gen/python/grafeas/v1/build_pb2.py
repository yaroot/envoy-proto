# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: grafeas/v1/build.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from grafeas.v1 import provenance_pb2 as grafeas_dot_v1_dot_provenance__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='grafeas/v1/build.proto',
  package='grafeas.v1',
  syntax='proto3',
  serialized_options=b'\n\rio.grafeas.v1P\001Z4github.com/grafeas/grafeas/proto/v1/grafeas_go_proto\242\002\003GRA',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x16grafeas/v1/build.proto\x12\ngrafeas.v1\x1a\x1bgrafeas/v1/provenance.proto\"$\n\tBuildNote\x12\x17\n\x0f\x62uilder_version\x18\x01 \x01(\t\"\\\n\x0f\x42uildOccurrence\x12/\n\nprovenance\x18\x01 \x01(\x0b\x32\x1b.grafeas.v1.BuildProvenance\x12\x18\n\x10provenance_bytes\x18\x02 \x01(\tBM\n\rio.grafeas.v1P\x01Z4github.com/grafeas/grafeas/proto/v1/grafeas_go_proto\xa2\x02\x03GRAb\x06proto3'
  ,
  dependencies=[grafeas_dot_v1_dot_provenance__pb2.DESCRIPTOR,])




_BUILDNOTE = _descriptor.Descriptor(
  name='BuildNote',
  full_name='grafeas.v1.BuildNote',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='builder_version', full_name='grafeas.v1.BuildNote.builder_version', index=0,
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
  serialized_start=67,
  serialized_end=103,
)


_BUILDOCCURRENCE = _descriptor.Descriptor(
  name='BuildOccurrence',
  full_name='grafeas.v1.BuildOccurrence',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='provenance', full_name='grafeas.v1.BuildOccurrence.provenance', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='provenance_bytes', full_name='grafeas.v1.BuildOccurrence.provenance_bytes', index=1,
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
  serialized_start=105,
  serialized_end=197,
)

_BUILDOCCURRENCE.fields_by_name['provenance'].message_type = grafeas_dot_v1_dot_provenance__pb2._BUILDPROVENANCE
DESCRIPTOR.message_types_by_name['BuildNote'] = _BUILDNOTE
DESCRIPTOR.message_types_by_name['BuildOccurrence'] = _BUILDOCCURRENCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BuildNote = _reflection.GeneratedProtocolMessageType('BuildNote', (_message.Message,), {
  'DESCRIPTOR' : _BUILDNOTE,
  '__module__' : 'grafeas.v1.build_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1.BuildNote)
  })
_sym_db.RegisterMessage(BuildNote)

BuildOccurrence = _reflection.GeneratedProtocolMessageType('BuildOccurrence', (_message.Message,), {
  'DESCRIPTOR' : _BUILDOCCURRENCE,
  '__module__' : 'grafeas.v1.build_pb2'
  # @@protoc_insertion_point(class_scope:grafeas.v1.BuildOccurrence)
  })
_sym_db.RegisterMessage(BuildOccurrence)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)