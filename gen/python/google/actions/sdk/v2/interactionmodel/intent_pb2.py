# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/intent.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel.type import class_reference_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_class__reference__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/actions/sdk/v2/interactionmodel/intent.proto\x12&google.actions.sdk.v2.interactionmodel\x1a\x41google/actions/sdk/v2/interactionmodel/type/class_reference.proto\x1a\x1fgoogle/api/field_behavior.proto\"\xce\x04\n\x06Intent\x12R\n\nparameters\x18\x01 \x03(\x0b\x32>.google.actions.sdk.v2.interactionmodel.Intent.IntentParameter\x12\x18\n\x10training_phrases\x18\x02 \x03(\t\x1a\xd5\x03\n\x0fIntentParameter\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12P\n\x04type\x18\x02 \x01(\x0b\x32;.google.actions.sdk.v2.interactionmodel.type.ClassReferenceB\x03\xe0\x41\x01H\x00\x12x\n\x15\x65ntity_set_references\x18\x03 \x01(\x0b\x32R.google.actions.sdk.v2.interactionmodel.Intent.IntentParameter.EntitySetReferencesB\x03\xe0\x41\x01H\x00\x1a\xd0\x01\n\x13\x45ntitySetReferences\x12\x89\x01\n\x15\x65ntity_set_references\x18\x01 \x03(\x0b\x32\x65.google.actions.sdk.v2.interactionmodel.Intent.IntentParameter.EntitySetReferences.EntitySetReferenceB\x03\xe0\x41\x02\x1a-\n\x12\x45ntitySetReference\x12\x17\n\nentity_set\x18\x01 \x01(\tB\x03\xe0\x41\x02\x42\x10\n\x0eparameter_typeB\x93\x01\n*com.google.actions.sdk.v2.interactionmodelB\x0bIntentProtoP\x01ZVgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel;interactionmodelb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.actions.sdk.v2.interactionmodel.intent_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.actions.sdk.v2.interactionmodelB\013IntentProtoP\001ZVgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel;interactionmodel'
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES_ENTITYSETREFERENCE.fields_by_name['entity_set']._options = None
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES_ENTITYSETREFERENCE.fields_by_name['entity_set']._serialized_options = b'\340A\002'
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES.fields_by_name['entity_set_references']._options = None
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES.fields_by_name['entity_set_references']._serialized_options = b'\340A\002'
  _INTENT_INTENTPARAMETER.fields_by_name['name']._options = None
  _INTENT_INTENTPARAMETER.fields_by_name['name']._serialized_options = b'\340A\002'
  _INTENT_INTENTPARAMETER.fields_by_name['type']._options = None
  _INTENT_INTENTPARAMETER.fields_by_name['type']._serialized_options = b'\340A\001'
  _INTENT_INTENTPARAMETER.fields_by_name['entity_set_references']._options = None
  _INTENT_INTENTPARAMETER.fields_by_name['entity_set_references']._serialized_options = b'\340A\001'
  _INTENT._serialized_start=196
  _INTENT._serialized_end=786
  _INTENT_INTENTPARAMETER._serialized_start=317
  _INTENT_INTENTPARAMETER._serialized_end=786
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES._serialized_start=560
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES._serialized_end=768
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES_ENTITYSETREFERENCE._serialized_start=723
  _INTENT_INTENTPARAMETER_ENTITYSETREFERENCES_ENTITYSETREFERENCE._serialized_end=768
# @@protoc_insertion_point(module_scope)