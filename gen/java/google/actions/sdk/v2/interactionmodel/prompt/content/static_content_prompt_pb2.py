# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/prompt/content/static_content_prompt.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel.prompt.content import static_card_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__card__prompt__pb2
from google.actions.sdk.v2.interactionmodel.prompt.content import static_collection_browse_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__collection__browse__prompt__pb2
from google.actions.sdk.v2.interactionmodel.prompt.content import static_collection_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__collection__prompt__pb2
from google.actions.sdk.v2.interactionmodel.prompt.content import static_image_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2
from google.actions.sdk.v2.interactionmodel.prompt.content import static_list_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__list__prompt__pb2
from google.actions.sdk.v2.interactionmodel.prompt.content import static_media_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__media__prompt__pb2
from google.actions.sdk.v2.interactionmodel.prompt.content import static_table_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__table__prompt__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/prompt/content/static_content_prompt.proto',
  package='google.actions.sdk.v2.interactionmodel.prompt',
  syntax='proto3',
  serialized_options=b'\n1com.google.actions.sdk.v2.interactionmodel.promptB\030StaticContentPromptProtoP\001ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;prompt',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nQgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_content_prompt.proto\x12-google.actions.sdk.v2.interactionmodel.prompt\x1aNgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_card_prompt.proto\x1a[google/actions/sdk/v2/interactionmodel/prompt/content/static_collection_browse_prompt.proto\x1aTgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_collection_prompt.proto\x1aOgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_image_prompt.proto\x1aNgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_list_prompt.proto\x1aOgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_media_prompt.proto\x1aOgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_table_prompt.proto\"\x82\x05\n\x13StaticContentPrompt\x12O\n\x04\x63\x61rd\x18\x01 \x01(\x0b\x32?.google.actions.sdk.v2.interactionmodel.prompt.StaticCardPromptH\x00\x12Q\n\x05image\x18\x02 \x01(\x0b\x32@.google.actions.sdk.v2.interactionmodel.prompt.StaticImagePromptH\x00\x12Q\n\x05table\x18\x03 \x01(\x0b\x32@.google.actions.sdk.v2.interactionmodel.prompt.StaticTablePromptH\x00\x12Q\n\x05media\x18\x04 \x01(\x0b\x32@.google.actions.sdk.v2.interactionmodel.prompt.StaticMediaPromptH\x00\x12O\n\x04list\x18\x05 \x01(\x0b\x32?.google.actions.sdk.v2.interactionmodel.prompt.StaticListPromptH\x00\x12[\n\ncollection\x18\x06 \x01(\x0b\x32\x45.google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPromptH\x00\x12h\n\x11\x63ollection_browse\x18\x07 \x01(\x0b\x32K.google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionBrowsePromptH\x00\x42\t\n\x07\x63ontentB\xa4\x01\n1com.google.actions.sdk.v2.interactionmodel.promptB\x18StaticContentPromptProtoP\x01ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;promptb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__card__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__collection__browse__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__collection__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__list__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__media__prompt__pb2.DESCRIPTOR,google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__table__prompt__pb2.DESCRIPTOR,])




_STATICCONTENTPROMPT = _descriptor.Descriptor(
  name='StaticContentPrompt',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='card', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.card', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.image', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='table', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.table', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='media', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.media', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='list', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.list', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='collection', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.collection', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='collection_browse', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.collection_browse', index=6,
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
      name='content', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt.content',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=715,
  serialized_end=1357,
)

_STATICCONTENTPROMPT.fields_by_name['card'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__card__prompt__pb2._STATICCARDPROMPT
_STATICCONTENTPROMPT.fields_by_name['image'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2._STATICIMAGEPROMPT
_STATICCONTENTPROMPT.fields_by_name['table'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__table__prompt__pb2._STATICTABLEPROMPT
_STATICCONTENTPROMPT.fields_by_name['media'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__media__prompt__pb2._STATICMEDIAPROMPT
_STATICCONTENTPROMPT.fields_by_name['list'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__list__prompt__pb2._STATICLISTPROMPT
_STATICCONTENTPROMPT.fields_by_name['collection'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__collection__prompt__pb2._STATICCOLLECTIONPROMPT
_STATICCONTENTPROMPT.fields_by_name['collection_browse'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__collection__browse__prompt__pb2._STATICCOLLECTIONBROWSEPROMPT
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['card'])
_STATICCONTENTPROMPT.fields_by_name['card'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['image'])
_STATICCONTENTPROMPT.fields_by_name['image'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['table'])
_STATICCONTENTPROMPT.fields_by_name['table'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['media'])
_STATICCONTENTPROMPT.fields_by_name['media'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['list'])
_STATICCONTENTPROMPT.fields_by_name['list'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['collection'])
_STATICCONTENTPROMPT.fields_by_name['collection'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
_STATICCONTENTPROMPT.oneofs_by_name['content'].fields.append(
  _STATICCONTENTPROMPT.fields_by_name['collection_browse'])
_STATICCONTENTPROMPT.fields_by_name['collection_browse'].containing_oneof = _STATICCONTENTPROMPT.oneofs_by_name['content']
DESCRIPTOR.message_types_by_name['StaticContentPrompt'] = _STATICCONTENTPROMPT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StaticContentPrompt = _reflection.GeneratedProtocolMessageType('StaticContentPrompt', (_message.Message,), {
  'DESCRIPTOR' : _STATICCONTENTPROMPT,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.prompt.content.static_content_prompt_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.prompt.StaticContentPrompt)
  })
_sym_db.RegisterMessage(StaticContentPrompt)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)