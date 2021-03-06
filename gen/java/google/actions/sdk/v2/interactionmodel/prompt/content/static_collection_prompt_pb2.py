# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/prompt/content/static_collection_prompt.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel.prompt.content import static_image_prompt_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/prompt/content/static_collection_prompt.proto',
  package='google.actions.sdk.v2.interactionmodel.prompt',
  syntax='proto3',
  serialized_options=b'\n1com.google.actions.sdk.v2.interactionmodel.promptB\033StaticCollectionPromptProtoP\001ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;prompt',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nTgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_collection_prompt.proto\x12-google.actions.sdk.v2.interactionmodel.prompt\x1aOgoogle/actions/sdk/v2/interactionmodel/prompt/content/static_image_prompt.proto\x1a\x1fgoogle/api/field_behavior.proto\"\xbb\x03\n\x16StaticCollectionPrompt\x12\x12\n\x05title\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x15\n\x08subtitle\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12h\n\x05items\x18\x03 \x03(\x0b\x32T.google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItemB\x03\xe0\x41\x02\x12\x63\n\nimage_fill\x18\x04 \x01(\x0e\x32J.google.actions.sdk.v2.interactionmodel.prompt.StaticImagePrompt.ImageFillB\x03\xe0\x41\x01\x1a\xa6\x01\n\x0e\x43ollectionItem\x12\x10\n\x03key\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\x05title\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12T\n\x05image\x18\x04 \x01(\x0b\x32@.google.actions.sdk.v2.interactionmodel.prompt.StaticImagePromptB\x03\xe0\x41\x01\x42\xa7\x01\n1com.google.actions.sdk.v2.interactionmodel.promptB\x1bStaticCollectionPromptProtoP\x01ZSgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/prompt;promptb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_STATICCOLLECTIONPROMPT_COLLECTIONITEM = _descriptor.Descriptor(
  name='CollectionItem',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItem',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItem.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='title', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItem.title', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItem.description', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItem.image', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=527,
  serialized_end=693,
)

_STATICCOLLECTIONPROMPT = _descriptor.Descriptor(
  name='StaticCollectionPrompt',
  full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='title', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.title', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='subtitle', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.subtitle', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='items', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.items', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='image_fill', full_name='google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.image_fill', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_STATICCOLLECTIONPROMPT_COLLECTIONITEM, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=250,
  serialized_end=693,
)

_STATICCOLLECTIONPROMPT_COLLECTIONITEM.fields_by_name['image'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2._STATICIMAGEPROMPT
_STATICCOLLECTIONPROMPT_COLLECTIONITEM.containing_type = _STATICCOLLECTIONPROMPT
_STATICCOLLECTIONPROMPT.fields_by_name['items'].message_type = _STATICCOLLECTIONPROMPT_COLLECTIONITEM
_STATICCOLLECTIONPROMPT.fields_by_name['image_fill'].enum_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_prompt_dot_content_dot_static__image__prompt__pb2._STATICIMAGEPROMPT_IMAGEFILL
DESCRIPTOR.message_types_by_name['StaticCollectionPrompt'] = _STATICCOLLECTIONPROMPT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StaticCollectionPrompt = _reflection.GeneratedProtocolMessageType('StaticCollectionPrompt', (_message.Message,), {

  'CollectionItem' : _reflection.GeneratedProtocolMessageType('CollectionItem', (_message.Message,), {
    'DESCRIPTOR' : _STATICCOLLECTIONPROMPT_COLLECTIONITEM,
    '__module__' : 'google.actions.sdk.v2.interactionmodel.prompt.content.static_collection_prompt_pb2'
    # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt.CollectionItem)
    })
  ,
  'DESCRIPTOR' : _STATICCOLLECTIONPROMPT,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.prompt.content.static_collection_prompt_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.prompt.StaticCollectionPrompt)
  })
_sym_db.RegisterMessage(StaticCollectionPrompt)
_sym_db.RegisterMessage(StaticCollectionPrompt.CollectionItem)


DESCRIPTOR._options = None
_STATICCOLLECTIONPROMPT_COLLECTIONITEM.fields_by_name['key']._options = None
_STATICCOLLECTIONPROMPT_COLLECTIONITEM.fields_by_name['title']._options = None
_STATICCOLLECTIONPROMPT_COLLECTIONITEM.fields_by_name['description']._options = None
_STATICCOLLECTIONPROMPT_COLLECTIONITEM.fields_by_name['image']._options = None
_STATICCOLLECTIONPROMPT.fields_by_name['title']._options = None
_STATICCOLLECTIONPROMPT.fields_by_name['subtitle']._options = None
_STATICCOLLECTIONPROMPT.fields_by_name['items']._options = None
_STATICCOLLECTIONPROMPT.fields_by_name['image_fill']._options = None
# @@protoc_insertion_point(module_scope)
