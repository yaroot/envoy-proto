# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/prompt/static_simple_prompt.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/prompt/static_simple_prompt.proto',
  package='google.actions.sdk.v2.interactionmodel.prompt',
  syntax='proto3',
  serialized_options=b'\n1com.google.actions.sdk.v2.interactionmodel.promptB\027StaticSimplePromptProtoP\001ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;prompt',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nHgoogle/actions/sdk/v2/interactionmodel/prompt/static_simple_prompt.proto\x12-google.actions.sdk.v2.interactionmodel.prompt\x1a\x1fgoogle/api/field_behavior.proto\"\xa4\x01\n\x12StaticSimplePrompt\x12[\n\x08variants\x18\x01 \x03(\x0b\x32I.google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant\x1a\x31\n\x07Variant\x12\x13\n\x06speech\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x11\n\x04text\x18\x02 \x01(\tB\x03\xe0\x41\x01\x42\xa3\x01\n1com.google.actions.sdk.v2.interactionmodel.promptB\x17StaticSimplePromptProtoP\x01ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;promptb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_STATICSIMPLEPROMPT_VARIANT = _descriptor.Descriptor(
  name='Variant',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='speech', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant.speech', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='text', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant.text', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=272,
  serialized_end=321,
)

_STATICSIMPLEPROMPT = _descriptor.Descriptor(
  name='StaticSimplePrompt',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='variants', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.variants', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_STATICSIMPLEPROMPT_VARIANT, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=157,
  serialized_end=321,
)

_STATICSIMPLEPROMPT_VARIANT.containing_type = _STATICSIMPLEPROMPT
_STATICSIMPLEPROMPT.fields_by_name['variants'].message_type = _STATICSIMPLEPROMPT_VARIANT
DESCRIPTOR.message_types_by_name['StaticSimplePrompt'] = _STATICSIMPLEPROMPT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StaticSimplePrompt = _reflection.GeneratedProtocolMessageType('StaticSimplePrompt', (_message.Message,), {

  'Variant' : _reflection.GeneratedProtocolMessageType('Variant', (_message.Message,), {
    'DESCRIPTOR' : _STATICSIMPLEPROMPT_VARIANT,
    '__module__' : 'google.actions.sdk.v2.interactionmodel.prompt.static_simple_prompt_pb2'
    # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt.Variant)
    })
  ,
  'DESCRIPTOR' : _STATICSIMPLEPROMPT,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.prompt.static_simple_prompt_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.prompt.StaticSimplePrompt)
  })
_sym_db.RegisterMessage(StaticSimplePrompt)
_sym_db.RegisterMessage(StaticSimplePrompt.Variant)


DESCRIPTOR._options = None
_STATICSIMPLEPROMPT_VARIANT.fields_by_name['speech']._options = None
_STATICSIMPLEPROMPT_VARIANT.fields_by_name['text']._options = None
# @@protoc_insertion_point(module_scope)
