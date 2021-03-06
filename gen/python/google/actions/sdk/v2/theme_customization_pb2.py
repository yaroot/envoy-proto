# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/theme_customization.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/theme_customization.proto',
  package='google.actions.sdk.v2',
  syntax='proto3',
  serialized_options=b'\n\031com.google.actions.sdk.v2B\027ThemeCustomizationProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/google/actions/sdk/v2/theme_customization.proto\x12\x15google.actions.sdk.v2\"\xc9\x02\n\x12ThemeCustomization\x12\x18\n\x10\x62\x61\x63kground_color\x18\x01 \x01(\t\x12\x15\n\rprimary_color\x18\x02 \x01(\t\x12\x13\n\x0b\x66ont_family\x18\x03 \x01(\t\x12V\n\x12image_corner_style\x18\x04 \x01(\x0e\x32:.google.actions.sdk.v2.ThemeCustomization.ImageCornerStyle\x12\"\n\x1alandscape_background_image\x18\x05 \x01(\t\x12!\n\x19portrait_background_image\x18\x06 \x01(\t\"N\n\x10ImageCornerStyle\x12\"\n\x1eIMAGE_CORNER_STYLE_UNSPECIFIED\x10\x00\x12\n\n\x06\x43URVED\x10\x01\x12\n\n\x06\x41NGLED\x10\x02\x42p\n\x19\x63om.google.actions.sdk.v2B\x17ThemeCustomizationProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3'
)



_THEMECUSTOMIZATION_IMAGECORNERSTYLE = _descriptor.EnumDescriptor(
  name='ImageCornerStyle',
  full_name='google.actions.sdk.v2.ThemeCustomization.ImageCornerStyle',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='IMAGE_CORNER_STYLE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CURVED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ANGLED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=326,
  serialized_end=404,
)
_sym_db.RegisterEnumDescriptor(_THEMECUSTOMIZATION_IMAGECORNERSTYLE)


_THEMECUSTOMIZATION = _descriptor.Descriptor(
  name='ThemeCustomization',
  full_name='google.actions.sdk.v2.ThemeCustomization',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='background_color', full_name='google.actions.sdk.v2.ThemeCustomization.background_color', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='primary_color', full_name='google.actions.sdk.v2.ThemeCustomization.primary_color', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='font_family', full_name='google.actions.sdk.v2.ThemeCustomization.font_family', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image_corner_style', full_name='google.actions.sdk.v2.ThemeCustomization.image_corner_style', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='landscape_background_image', full_name='google.actions.sdk.v2.ThemeCustomization.landscape_background_image', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='portrait_background_image', full_name='google.actions.sdk.v2.ThemeCustomization.portrait_background_image', index=5,
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
    _THEMECUSTOMIZATION_IMAGECORNERSTYLE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=75,
  serialized_end=404,
)

_THEMECUSTOMIZATION.fields_by_name['image_corner_style'].enum_type = _THEMECUSTOMIZATION_IMAGECORNERSTYLE
_THEMECUSTOMIZATION_IMAGECORNERSTYLE.containing_type = _THEMECUSTOMIZATION
DESCRIPTOR.message_types_by_name['ThemeCustomization'] = _THEMECUSTOMIZATION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ThemeCustomization = _reflection.GeneratedProtocolMessageType('ThemeCustomization', (_message.Message,), {
  'DESCRIPTOR' : _THEMECUSTOMIZATION,
  '__module__' : 'google.actions.sdk.v2.theme_customization_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.ThemeCustomization)
  })
_sym_db.RegisterMessage(ThemeCustomization)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
