# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/type/free_text_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel.type import entity_display_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_entity__display__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/type/free_text_type.proto',
  package='google.actions.sdk.v2.interactionmodel.type',
  syntax='proto3',
  serialized_options=b'\n/com.google.actions.sdk.v2.interactionmodel.typeB\021FreeTextTypeProtoP\001ZOgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/type;type',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@google/actions/sdk/v2/interactionmodel/type/free_text_type.proto\x12+google.actions.sdk.v2.interactionmodel.type\x1a@google/actions/sdk/v2/interactionmodel/type/entity_display.proto\x1a\x1fgoogle/api/field_behavior.proto\"`\n\x0c\x46reeTextType\x12P\n\x07\x64isplay\x18\x02 \x01(\x0b\x32:.google.actions.sdk.v2.interactionmodel.type.EntityDisplayB\x03\xe0\x41\x01\x42\x97\x01\n/com.google.actions.sdk.v2.interactionmodel.typeB\x11\x46reeTextTypeProtoP\x01ZOgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/type;typeb\x06proto3'
  ,
  dependencies=[google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_entity__display__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_FREETEXTTYPE = _descriptor.Descriptor(
  name='FreeTextType',
  full_name='google.actions.sdk.v2.interactionmodel.type.FreeTextType',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='display', full_name='google.actions.sdk.v2.interactionmodel.type.FreeTextType.display', index=0,
      number=2, type=11, cpp_type=10, label=1,
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
  serialized_start=212,
  serialized_end=308,
)

_FREETEXTTYPE.fields_by_name['display'].message_type = google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_entity__display__pb2._ENTITYDISPLAY
DESCRIPTOR.message_types_by_name['FreeTextType'] = _FREETEXTTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FreeTextType = _reflection.GeneratedProtocolMessageType('FreeTextType', (_message.Message,), {
  'DESCRIPTOR' : _FREETEXTTYPE,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.type.free_text_type_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.type.FreeTextType)
  })
_sym_db.RegisterMessage(FreeTextType)


DESCRIPTOR._options = None
_FREETEXTTYPE.fields_by_name['display']._options = None
# @@protoc_insertion_point(module_scope)
