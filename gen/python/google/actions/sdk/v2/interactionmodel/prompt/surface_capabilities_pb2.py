# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/prompt/surface_capabilities.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/prompt/surface_capabilities.proto',
  package='google.actions.sdk.v2.interactionmodel.prompt',
  syntax='proto3',
  serialized_options=b'\n1com.google.actions.sdk.v2.interactionmodel.promptB\030SurfaceCapabilitiesProtoP\001ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;prompt',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nHgoogle/actions/sdk/v2/interactionmodel/prompt/surface_capabilities.proto\x12-google.actions.sdk.v2.interactionmodel.prompt\x1a\x1fgoogle/api/field_behavior.proto\"\x8b\x02\n\x13SurfaceCapabilities\x12h\n\x0c\x63\x61pabilities\x18\x01 \x03(\x0e\x32M.google.actions.sdk.v2.interactionmodel.prompt.SurfaceCapabilities.CapabilityB\x03\xe0\x41\x02\"\x89\x01\n\nCapability\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\n\n\x06SPEECH\x10\x01\x12\x11\n\rRICH_RESPONSE\x10\x02\x12\x13\n\x0fLONG_FORM_AUDIO\x10\x03\x12\x16\n\x12INTERACTIVE_CANVAS\x10\x04\x12\x0c\n\x08WEB_LINK\x10\x05\x12\x10\n\x0cHOME_STORAGE\x10\x06\x42\xa4\x01\n1com.google.actions.sdk.v2.interactionmodel.promptB\x18SurfaceCapabilitiesProtoP\x01ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;promptb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])



_SURFACECAPABILITIES_CAPABILITY = _descriptor.EnumDescriptor(
  name='Capability',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.SurfaceCapabilities.Capability',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SPEECH', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RICH_RESPONSE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LONG_FORM_AUDIO', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INTERACTIVE_CANVAS', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEB_LINK', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HOME_STORAGE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=287,
  serialized_end=424,
)
_sym_db.RegisterEnumDescriptor(_SURFACECAPABILITIES_CAPABILITY)


_SURFACECAPABILITIES = _descriptor.Descriptor(
  name='SurfaceCapabilities',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.SurfaceCapabilities',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='capabilities', full_name='google.actions.sdk.v2.interactionmodel.prompt.SurfaceCapabilities.capabilities', index=0,
      number=1, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _SURFACECAPABILITIES_CAPABILITY,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=157,
  serialized_end=424,
)

_SURFACECAPABILITIES.fields_by_name['capabilities'].enum_type = _SURFACECAPABILITIES_CAPABILITY
_SURFACECAPABILITIES_CAPABILITY.containing_type = _SURFACECAPABILITIES
DESCRIPTOR.message_types_by_name['SurfaceCapabilities'] = _SURFACECAPABILITIES
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SurfaceCapabilities = _reflection.GeneratedProtocolMessageType('SurfaceCapabilities', (_message.Message,), {
  'DESCRIPTOR' : _SURFACECAPABILITIES,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.prompt.surface_capabilities_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.prompt.SurfaceCapabilities)
  })
_sym_db.RegisterMessage(SurfaceCapabilities)


DESCRIPTOR._options = None
_SURFACECAPABILITIES.fields_by_name['capabilities']._options = None
# @@protoc_insertion_point(module_scope)
