# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/interactionmodel/type/synonym_type.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.actions.sdk.v2.interactionmodel.type import entity_display_pb2 as google_dot_actions_dot_sdk_dot_v2_dot_interactionmodel_dot_type_dot_entity__display__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/actions/sdk/v2/interactionmodel/type/synonym_type.proto\x12+google.actions.sdk.v2.interactionmodel.type\x1a@google/actions/sdk/v2/interactionmodel/type/entity_display.proto\x1a\x1fgoogle/api/field_behavior.proto\"\x92\x04\n\x0bSynonymType\x12[\n\nmatch_type\x18\x01 \x01(\x0e\x32\x42.google.actions.sdk.v2.interactionmodel.type.SynonymType.MatchTypeB\x03\xe0\x41\x01\x12\"\n\x15\x61\x63\x63\x65pt_unknown_values\x18\x03 \x01(\x08\x42\x03\xe0\x41\x01\x12]\n\x08\x65ntities\x18\x02 \x03(\x0b\x32\x46.google.actions.sdk.v2.interactionmodel.type.SynonymType.EntitiesEntryB\x03\xe0\x41\x02\x1aq\n\x06\x45ntity\x12P\n\x07\x64isplay\x18\x01 \x01(\x0b\x32:.google.actions.sdk.v2.interactionmodel.type.EntityDisplayB\x03\xe0\x41\x01\x12\x15\n\x08synonyms\x18\x02 \x03(\tB\x03\xe0\x41\x01\x1ap\n\rEntitiesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12N\n\x05value\x18\x02 \x01(\x0b\x32?.google.actions.sdk.v2.interactionmodel.type.SynonymType.Entity:\x02\x38\x01\">\n\tMatchType\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0f\n\x0b\x45XACT_MATCH\x10\x01\x12\x0f\n\x0b\x46UZZY_MATCH\x10\x02\x42\x91\x01\n/com.google.actions.sdk.v2.interactionmodel.typeB\x10SynonymTypeProtoP\x01ZJgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/typeb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.actions.sdk.v2.interactionmodel.type.synonym_type_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n/com.google.actions.sdk.v2.interactionmodel.typeB\020SynonymTypeProtoP\001ZJgoogle.golang.org/genproto/googleapis/actions/sdk/v2/interactionmodel/type'
  _SYNONYMTYPE_ENTITY.fields_by_name['display']._options = None
  _SYNONYMTYPE_ENTITY.fields_by_name['display']._serialized_options = b'\340A\001'
  _SYNONYMTYPE_ENTITY.fields_by_name['synonyms']._options = None
  _SYNONYMTYPE_ENTITY.fields_by_name['synonyms']._serialized_options = b'\340A\001'
  _SYNONYMTYPE_ENTITIESENTRY._options = None
  _SYNONYMTYPE_ENTITIESENTRY._serialized_options = b'8\001'
  _SYNONYMTYPE.fields_by_name['match_type']._options = None
  _SYNONYMTYPE.fields_by_name['match_type']._serialized_options = b'\340A\001'
  _SYNONYMTYPE.fields_by_name['accept_unknown_values']._options = None
  _SYNONYMTYPE.fields_by_name['accept_unknown_values']._serialized_options = b'\340A\001'
  _SYNONYMTYPE.fields_by_name['entities']._options = None
  _SYNONYMTYPE.fields_by_name['entities']._serialized_options = b'\340A\002'
  _SYNONYMTYPE._serialized_start=211
  _SYNONYMTYPE._serialized_end=741
  _SYNONYMTYPE_ENTITY._serialized_start=450
  _SYNONYMTYPE_ENTITY._serialized_end=563
  _SYNONYMTYPE_ENTITIESENTRY._serialized_start=565
  _SYNONYMTYPE_ENTITIESENTRY._serialized_end=677
  _SYNONYMTYPE_MATCHTYPE._serialized_start=679
  _SYNONYMTYPE_MATCHTYPE._serialized_end=741
# @@protoc_insertion_point(module_scope)
