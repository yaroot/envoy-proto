# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/conversation/prompt/content/content.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.conversation.prompt.content import canvas_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_canvas__pb2
from google.actions.sdk.v2.conversation.prompt.content import card_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_card__pb2
from google.actions.sdk.v2.conversation.prompt.content import collection_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_collection__pb2
from google.actions.sdk.v2.conversation.prompt.content import image_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_image__pb2
from google.actions.sdk.v2.conversation.prompt.content import list_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_list__pb2
from google.actions.sdk.v2.conversation.prompt.content import media_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_media__pb2
from google.actions.sdk.v2.conversation.prompt.content import table_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_table__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/conversation/prompt/content/content.proto',
  package='google.actions.sdk.v2.conversation',
  syntax='proto3',
  serialized_options=b'\n&com.google.actions.sdk.v2.conversationB\014ContentProtoP\001ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversation',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n?google/actions/sdk/v2/conversation/prompt/content/content.proto\x12\"google.actions.sdk.v2.conversation\x1a>google/actions/sdk/v2/conversation/prompt/content/canvas.proto\x1a<google/actions/sdk/v2/conversation/prompt/content/card.proto\x1a\x42google/actions/sdk/v2/conversation/prompt/content/collection.proto\x1a=google/actions/sdk/v2/conversation/prompt/content/image.proto\x1a<google/actions/sdk/v2/conversation/prompt/content/list.proto\x1a=google/actions/sdk/v2/conversation/prompt/content/media.proto\x1a=google/actions/sdk/v2/conversation/prompt/content/table.proto\"\xc4\x03\n\x07\x43ontent\x12\x38\n\x04\x63\x61rd\x18\x01 \x01(\x0b\x32(.google.actions.sdk.v2.conversation.CardH\x00\x12:\n\x05image\x18\x02 \x01(\x0b\x32).google.actions.sdk.v2.conversation.ImageH\x00\x12:\n\x05table\x18\x03 \x01(\x0b\x32).google.actions.sdk.v2.conversation.TableH\x00\x12:\n\x05media\x18\x04 \x01(\x0b\x32).google.actions.sdk.v2.conversation.MediaH\x00\x12@\n\x06\x63\x61nvas\x18\x05 \x01(\x0b\x32*.google.actions.sdk.v2.conversation.CanvasB\x02\x18\x01H\x00\x12\x44\n\ncollection\x18\x06 \x01(\x0b\x32..google.actions.sdk.v2.conversation.CollectionH\x00\x12\x38\n\x04list\x18\x07 \x01(\x0b\x32(.google.actions.sdk.v2.conversation.ListH\x00\x42\t\n\x07\x63ontentB\x88\x01\n&com.google.actions.sdk.v2.conversationB\x0c\x43ontentProtoP\x01ZNgoogle.golang.org/genproto/googleapis/actions/sdk/v2/conversation;conversationb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_canvas__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_card__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_collection__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_image__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_list__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_media__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_table__pb2.DESCRIPTOR,])




_CONTENT = _descriptor.Descriptor(
  name='Content',
  full_name='google.actions.sdk.v2.conversation.Content',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='card', full_name='google.actions.sdk.v2.conversation.Content.card', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image', full_name='google.actions.sdk.v2.conversation.Content.image', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='table', full_name='google.actions.sdk.v2.conversation.Content.table', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='media', full_name='google.actions.sdk.v2.conversation.Content.media', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='canvas', full_name='google.actions.sdk.v2.conversation.Content.canvas', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='collection', full_name='google.actions.sdk.v2.conversation.Content.collection', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='list', full_name='google.actions.sdk.v2.conversation.Content.list', index=6,
      number=7, type=11, cpp_type=10, label=1,
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
    _descriptor.OneofDescriptor(
      name='content', full_name='google.actions.sdk.v2.conversation.Content.content',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=549,
  serialized_end=1001,
)

_CONTENT.fields_by_name['card'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_card__pb2._CARD
_CONTENT.fields_by_name['image'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_image__pb2._IMAGE
_CONTENT.fields_by_name['table'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_table__pb2._TABLE
_CONTENT.fields_by_name['media'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_media__pb2._MEDIA
_CONTENT.fields_by_name['canvas'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_canvas__pb2._CANVAS
_CONTENT.fields_by_name['collection'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_collection__pb2._COLLECTION
_CONTENT.fields_by_name['list'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_conversation_dot_prompt_dot_content_dot_list__pb2._LIST
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['card'])
_CONTENT.fields_by_name['card'].containing_oneof = _CONTENT.oneofs_by_name['content']
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['image'])
_CONTENT.fields_by_name['image'].containing_oneof = _CONTENT.oneofs_by_name['content']
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['table'])
_CONTENT.fields_by_name['table'].containing_oneof = _CONTENT.oneofs_by_name['content']
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['media'])
_CONTENT.fields_by_name['media'].containing_oneof = _CONTENT.oneofs_by_name['content']
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['canvas'])
_CONTENT.fields_by_name['canvas'].containing_oneof = _CONTENT.oneofs_by_name['content']
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['collection'])
_CONTENT.fields_by_name['collection'].containing_oneof = _CONTENT.oneofs_by_name['content']
_CONTENT.oneofs_by_name['content'].fields.append(
  _CONTENT.fields_by_name['list'])
_CONTENT.fields_by_name['list'].containing_oneof = _CONTENT.oneofs_by_name['content']
DESCRIPTOR.message_types_by_name['Content'] = _CONTENT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Content = _reflection.GeneratedProtocolMessageType('Content', (_message.Message,), {
  'DESCRIPTOR' : _CONTENT,
  '__module__' : 'google.actions.sdk.v2.conversation.prompt.content.content_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.conversation.Content)
  })
_sym_db.RegisterMessage(Content)


DESCRIPTOR._options = None
_CONTENT.fields_by_name['canvas']._options = None
# @@protoc_insertion_point(module_scope)
