# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/manifest.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/manifest.proto',
  package='google.actions.sdk.v2',
  syntax='proto3',
  serialized_options=b'\n\031com.google.actions.sdk.v2B\rManifestProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$google/actions/sdk/v2/manifest.proto\x12\x15google.actions.sdk.v2\"\x1b\n\x08Manifest\x12\x0f\n\x07version\x18\x01 \x01(\tBf\n\x19\x63om.google.actions.sdk.v2B\rManifestProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3'
)




_MANIFEST = _descriptor.Descriptor(
  name='Manifest',
  full_name='google.actions.sdk.v2.Manifest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='version', full_name='google.actions.sdk.v2.Manifest.version', index=0,
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
  serialized_start=63,
  serialized_end=90,
)

DESCRIPTOR.message_types_by_name['Manifest'] = _MANIFEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Manifest = _reflection.GeneratedProtocolMessageType('Manifest', (_message.Message,), {
  'DESCRIPTOR' : _MANIFEST,
  '__module__' : 'google.actions.sdk.v2.manifest_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.Manifest)
  })
_sym_db.RegisterMessage(Manifest)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
