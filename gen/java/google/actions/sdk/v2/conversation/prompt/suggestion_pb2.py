# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/conversation/prompt/suggestion.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/conversation/prompt/suggestion.proto',
  package='google.actions.sdk.v2.conversation',
  syntax='proto3',
  serialized_options=b'\n&com.google.actions.sdk.v2.conversationB\017SuggestionProtoP\001ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversation',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/actions/sdk/v2/conversation/prompt/suggestion.proto\x12\"google.actions.sdk.v2.conversation\"\x1b\n\nSuggestion\x12\r\n\x05title\x18\x01 \x01(\tB\x8b\x01\n&com.google.actions.sdk.v2.conversationB\x0fSuggestionProtoP\x01ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversationb\x06proto3'
)




_SUGGESTION = _descriptor.Descriptor(
  name='Suggestion',
  full_name='google.actions.sdk.v2.conversation.Suggestion',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='title', full_name='google.actions.sdk.v2.conversation.Suggestion.title', index=0,
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
  serialized_start=98,
  serialized_end=125,
)

DESCRIPTOR.message_types_by_name['Suggestion'] = _SUGGESTION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Suggestion = _reflection.GeneratedProtocolMessageType('Suggestion', (_message.Message,), {
  'DESCRIPTOR' : _SUGGESTION,
  '__module__' : 'google.actions.sdk.v2.conversation.prompt.suggestion_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.conversation.Suggestion)
  })
_sym_db.RegisterMessage(Suggestion)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
