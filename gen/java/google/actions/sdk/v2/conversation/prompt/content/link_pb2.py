# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/conversation/prompt/content/link.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/conversation/prompt/content/link.proto',
  package='google.actions.sdk.v2.conversation',
  syntax='proto3',
  serialized_options=b'\n&com.google.actions.sdk.v2.conversationB\tLinkProtoP\001ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversation',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/actions/sdk/v2/conversation/prompt/content/link.proto\x12\"google.actions.sdk.v2.conversation\"O\n\x04Link\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x39\n\x04open\x18\x02 \x01(\x0b\x32+.google.actions.sdk.v2.conversation.OpenUrl\"Q\n\x07OpenUrl\x12\x0b\n\x03url\x18\x01 \x01(\t\x12\x39\n\x04hint\x18\x02 \x01(\x0e\x32+.google.actions.sdk.v2.conversation.UrlHint*(\n\x07UrlHint\x12\x14\n\x10LINK_UNSPECIFIED\x10\x00\x12\x07\n\x03\x41MP\x10\x01\x42\x85\x01\n&com.google.actions.sdk.v2.conversationB\tLinkProtoP\x01ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversationb\x06proto3'
)

_URLHINT = _descriptor.EnumDescriptor(
  name='UrlHint',
  full_name='google.actions.sdk.v2.conversation.UrlHint',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='LINK_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AMP', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=264,
  serialized_end=304,
)
_sym_db.RegisterEnumDescriptor(_URLHINT)

UrlHint = enum_type_wrapper.EnumTypeWrapper(_URLHINT)
LINK_UNSPECIFIED = 0
AMP = 1



_LINK = _descriptor.Descriptor(
  name='Link',
  full_name='google.actions.sdk.v2.conversation.Link',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.actions.sdk.v2.conversation.Link.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='open', full_name='google.actions.sdk.v2.conversation.Link.open', index=1,
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
  serialized_start=100,
  serialized_end=179,
)


_OPENURL = _descriptor.Descriptor(
  name='OpenUrl',
  full_name='google.actions.sdk.v2.conversation.OpenUrl',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='url', full_name='google.actions.sdk.v2.conversation.OpenUrl.url', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hint', full_name='google.actions.sdk.v2.conversation.OpenUrl.hint', index=1,
      number=2, type=14, cpp_type=8, label=1,
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
  serialized_start=181,
  serialized_end=262,
)

_LINK.fields_by_name['open'].message_type = _OPENURL
_OPENURL.fields_by_name['hint'].enum_type = _URLHINT
DESCRIPTOR.message_types_by_name['Link'] = _LINK
DESCRIPTOR.message_types_by_name['OpenUrl'] = _OPENURL
DESCRIPTOR.enum_types_by_name['UrlHint'] = _URLHINT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Link = _reflection.GeneratedProtocolMessageType('Link', (_message.Message,), {
  'DESCRIPTOR' : _LINK,
  '__module__' : 'google.actions.sdk.v2.conversation.prompt.content.link_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.conversation.Link)
  })
_sym_db.RegisterMessage(Link)

OpenUrl = _reflection.GeneratedProtocolMessageType('OpenUrl', (_message.Message,), {
  'DESCRIPTOR' : _OPENURL,
  '__module__' : 'google.actions.sdk.v2.conversation.prompt.content.link_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.conversation.OpenUrl)
  })
_sym_db.RegisterMessage(OpenUrl)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
