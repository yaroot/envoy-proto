# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/conversation/prompt/content/canvas.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/conversation/prompt/content/canvas.proto',
  package='google.actions.sdk.v2.conversation',
  syntax='proto3',
  serialized_options=b'\n&com.google.actions.sdk.v2.conversationB\013CanvasProtoP\001ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversation',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/actions/sdk/v2/conversation/prompt/content/canvas.proto\x12\"google.actions.sdk.v2.conversation\x1a\x1cgoogle/protobuf/struct.proto\"m\n\x06\x43\x61nvas\x12\x0b\n\x03url\x18\x01 \x01(\t\x12$\n\x04\x64\x61ta\x18\x04 \x03(\x0b\x32\x16.google.protobuf.Value\x12\x14\n\x0csuppress_mic\x18\x03 \x01(\x08\x12\x1a\n\x12\x65nable_full_screen\x18\x08 \x01(\x08\x42\x87\x01\n&com.google.actions.sdk.v2.conversationB\x0b\x43\x61nvasProtoP\x01ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversationb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,])




_CANVAS = _descriptor.Descriptor(
  name='Canvas',
  full_name='google.actions.sdk.v2.conversation.Canvas',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='url', full_name='google.actions.sdk.v2.conversation.Canvas.url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='data', full_name='google.actions.sdk.v2.conversation.Canvas.data', index=1,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='suppress_mic', full_name='google.actions.sdk.v2.conversation.Canvas.suppress_mic', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enable_full_screen', full_name='google.actions.sdk.v2.conversation.Canvas.enable_full_screen', index=3,
      number=8, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=132,
  serialized_end=241,
)

_CANVAS.fields_by_name['data'].message_type = google_dot_protobuf_dot_struct__pb2._VALUE
DESCRIPTOR.message_types_by_name['Canvas'] = _CANVAS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Canvas = _reflection.GeneratedProtocolMessageType('Canvas', (_message.Message,), {
  'DESCRIPTOR' : _CANVAS,
  '__module__' : 'google.actions.sdk.v2.conversation.prompt.content.canvas_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.conversation.Canvas)
  })
_sym_db.RegisterMessage(Canvas)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
