# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/entity_set.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/interactionmodel/entity_set.proto',
  package='google.actions.sdk.v2.interactionmodel',
  syntax='proto3',
  serialized_options=b'\n*com.google.actions.sdk.v2.interactionmodelB\016EntitySetProtoP\001ZVgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel;interactionmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/actions/sdk/v2/interactionmodel/entity_set.proto\x12&google.actions.sdk.v2.interactionmodel\x1a\x1fgoogle/api/field_behavior.proto\"w\n\tEntitySet\x12O\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\x38.google.actions.sdk.v2.interactionmodel.EntitySet.EntityB\x03\xe0\x41\x02\x1a\x19\n\x06\x45ntity\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x42\x96\x01\n*com.google.actions.sdk.v2.interactionmodelB\x0e\x45ntitySetProtoP\x01ZVgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel;interactionmodelb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_ENTITYSET_ENTITY = _descriptor.Descriptor(
  name='Entity',
  full_name='google.actions.sdk.v2.interactionmodel.EntitySet.Entity',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='google.actions.sdk.v2.interactionmodel.EntitySet.Entity.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=226,
  serialized_end=251,
)

_ENTITYSET = _descriptor.Descriptor(
  name='EntitySet',
  full_name='google.actions.sdk.v2.interactionmodel.EntitySet',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entities', full_name='google.actions.sdk.v2.interactionmodel.EntitySet.entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_ENTITYSET_ENTITY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=132,
  serialized_end=251,
)

_ENTITYSET_ENTITY.containing_type = _ENTITYSET
_ENTITYSET.fields_by_name['entities'].message_type = _ENTITYSET_ENTITY
DESCRIPTOR.message_types_by_name['EntitySet'] = _ENTITYSET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

EntitySet = _reflection.GeneratedProtocolMessageType('EntitySet', (_message.Message,), {

  'Entity' : _reflection.GeneratedProtocolMessageType('Entity', (_message.Message,), {
    'DESCRIPTOR' : _ENTITYSET_ENTITY,
    '__module__' : 'google.actions.sdk.v2.interactionmodel.entity_set_pb2'
    # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.EntitySet.Entity)
    })
  ,
  'DESCRIPTOR' : _ENTITYSET,
  '__module__' : 'google.actions.sdk.v2.interactionmodel.entity_set_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.interactionmodel.EntitySet)
  })
_sym_db.RegisterMessage(EntitySet)
_sym_db.RegisterMessage(EntitySet.Entity)


DESCRIPTOR._options = None
_ENTITYSET_ENTITY.fields_by_name['id']._options = None
_ENTITYSET.fields_by_name['entities']._options = None
# @@protoc_insertion_point(module_scope)
