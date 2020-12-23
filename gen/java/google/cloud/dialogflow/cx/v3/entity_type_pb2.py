# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/cx/v3/entity_type.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/dialogflow/cx/v3/entity_type.proto',
  package='google.cloud.dialogflow.cx.v3',
  syntax='proto3',
  serialized_options=b'\n!com.google.cloud.dialogflow.cx.v3B\017EntityTypeProtoP\001Z?google.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dialogflow.Cx.V3',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n/google/cloud/dialogflow/cx/v3/entity_type.proto\x12\x1dgoogle.cloud.dialogflow.cx.v3\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\x8a\x06\n\nEntityType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x41\n\x04kind\x18\x03 \x01(\x0e\x32..google.cloud.dialogflow.cx.v3.EntityType.KindB\x03\xe0\x41\x02\x12X\n\x13\x61uto_expansion_mode\x18\x04 \x01(\x0e\x32;.google.cloud.dialogflow.cx.v3.EntityType.AutoExpansionMode\x12\x42\n\x08\x65ntities\x18\x05 \x03(\x0b\x32\x30.google.cloud.dialogflow.cx.v3.EntityType.Entity\x12R\n\x10\x65xcluded_phrases\x18\x06 \x03(\x0b\x32\x38.google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase\x12\x1f\n\x17\x65nable_fuzzy_extraction\x18\x07 \x01(\x08\x1a\x33\n\x06\x45ntity\x12\x12\n\x05value\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08synonyms\x18\x02 \x03(\tB\x03\xe0\x41\x02\x1a$\n\x0e\x45xcludedPhrase\x12\x12\n\x05value\x18\x01 \x01(\tB\x03\xe0\x41\x02\"J\n\x04Kind\x12\x14\n\x10KIND_UNSPECIFIED\x10\x00\x12\x0c\n\x08KIND_MAP\x10\x01\x12\r\n\tKIND_LIST\x10\x02\x12\x0f\n\x0bKIND_REGEXP\x10\x03\"Y\n\x11\x41utoExpansionMode\x12#\n\x1f\x41UTO_EXPANSION_MODE_UNSPECIFIED\x10\x00\x12\x1f\n\x1b\x41UTO_EXPANSION_MODE_DEFAULT\x10\x01:{\xea\x41x\n$dialogflow.googleapis.com/EntityType\x12Pprojects/{project}/locations/{location}/agents/{agent}/entityTypes/{entity_type}\"\x94\x01\n\x16ListEntityTypesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$dialogflow.googleapis.com/EntityType\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"s\n\x17ListEntityTypesResponse\x12?\n\x0c\x65ntity_types\x18\x01 \x03(\x0b\x32).google.cloud.dialogflow.cx.v3.EntityType\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"i\n\x14GetEntityTypeRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\"\xb3\x01\n\x17\x43reateEntityTypeRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$dialogflow.googleapis.com/EntityType\x12\x43\n\x0b\x65ntity_type\x18\x02 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.EntityTypeB\x03\xe0\x41\x02\x12\x15\n\rlanguage_code\x18\x03 \x01(\t\"\xa6\x01\n\x17UpdateEntityTypeRequest\x12\x43\n\x0b\x65ntity_type\x18\x01 \x01(\x0b\x32).google.cloud.dialogflow.cx.v3.EntityTypeB\x03\xe0\x41\x02\x12\x15\n\rlanguage_code\x18\x02 \x01(\t\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"d\n\x17\x44\x65leteEntityTypeRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\r\n\x05\x66orce\x18\x02 \x01(\x08\x32\x87\t\n\x0b\x45ntityTypes\x12\xcb\x01\n\x0fListEntityTypes\x12\x35.google.cloud.dialogflow.cx.v3.ListEntityTypesRequest\x1a\x36.google.cloud.dialogflow.cx.v3.ListEntityTypesResponse\"I\x82\xd3\xe4\x93\x02:\x12\x38/v3/{parent=projects/*/locations/*/agents/*}/entityTypes\xda\x41\x06parent\x12\xb8\x01\n\rGetEntityType\x12\x33.google.cloud.dialogflow.cx.v3.GetEntityTypeRequest\x1a).google.cloud.dialogflow.cx.v3.EntityType\"G\x82\xd3\xe4\x93\x02:\x12\x38/v3/{name=projects/*/locations/*/agents/*/entityTypes/*}\xda\x41\x04name\x12\xd9\x01\n\x10\x43reateEntityType\x12\x36.google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest\x1a).google.cloud.dialogflow.cx.v3.EntityType\"b\x82\xd3\xe4\x93\x02G\"8/v3/{parent=projects/*/locations/*/agents/*}/entityTypes:\x0b\x65ntity_type\xda\x41\x12parent,entity_type\x12\xea\x01\n\x10UpdateEntityType\x12\x36.google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest\x1a).google.cloud.dialogflow.cx.v3.EntityType\"s\x82\xd3\xe4\x93\x02S2D/v3/{entity_type.name=projects/*/locations/*/agents/*/entityTypes/*}:\x0b\x65ntity_type\xda\x41\x17\x65ntity_type,update_mask\x12\xab\x01\n\x10\x44\x65leteEntityType\x12\x36.google.cloud.dialogflow.cx.v3.DeleteEntityTypeRequest\x1a\x16.google.protobuf.Empty\"G\x82\xd3\xe4\x93\x02:*8/v3/{name=projects/*/locations/*/agents/*/entityTypes/*}\xda\x41\x04name\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\x9f\x01\n!com.google.cloud.dialogflow.cx.v3B\x0f\x45ntityTypeProtoP\x01Z?google.golang.org/genproto/googleapis/cloud/dialogflow/cx/v3;cx\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1dGoogle.Cloud.Dialogflow.Cx.V3b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_empty__pb2.DESCRIPTOR,google_dot_protobuf_dot_field__mask__pb2.DESCRIPTOR,])



_ENTITYTYPE_KIND = _descriptor.EnumDescriptor(
  name='Kind',
  full_name='google.cloud.dialogflow.cx.v3.EntityType.Kind',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='KIND_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KIND_MAP', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KIND_LIST', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='KIND_REGEXP', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=749,
  serialized_end=823,
)
_sym_db.RegisterEnumDescriptor(_ENTITYTYPE_KIND)

_ENTITYTYPE_AUTOEXPANSIONMODE = _descriptor.EnumDescriptor(
  name='AutoExpansionMode',
  full_name='google.cloud.dialogflow.cx.v3.EntityType.AutoExpansionMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='AUTO_EXPANSION_MODE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AUTO_EXPANSION_MODE_DEFAULT', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=825,
  serialized_end=914,
)
_sym_db.RegisterEnumDescriptor(_ENTITYTYPE_AUTOEXPANSIONMODE)


_ENTITYTYPE_ENTITY = _descriptor.Descriptor(
  name='Entity',
  full_name='google.cloud.dialogflow.cx.v3.EntityType.Entity',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.dialogflow.cx.v3.EntityType.Entity.value', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='synonyms', full_name='google.cloud.dialogflow.cx.v3.EntityType.Entity.synonyms', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=658,
  serialized_end=709,
)

_ENTITYTYPE_EXCLUDEDPHRASE = _descriptor.Descriptor(
  name='ExcludedPhrase',
  full_name='google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase.value', index=0,
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
  serialized_start=711,
  serialized_end=747,
)

_ENTITYTYPE = _descriptor.Descriptor(
  name='EntityType',
  full_name='google.cloud.dialogflow.cx.v3.EntityType',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.cx.v3.EntityType.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='google.cloud.dialogflow.cx.v3.EntityType.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='kind', full_name='google.cloud.dialogflow.cx.v3.EntityType.kind', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='auto_expansion_mode', full_name='google.cloud.dialogflow.cx.v3.EntityType.auto_expansion_mode', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='entities', full_name='google.cloud.dialogflow.cx.v3.EntityType.entities', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='excluded_phrases', full_name='google.cloud.dialogflow.cx.v3.EntityType.excluded_phrases', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enable_fuzzy_extraction', full_name='google.cloud.dialogflow.cx.v3.EntityType.enable_fuzzy_extraction', index=6,
      number=7, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_ENTITYTYPE_ENTITY, _ENTITYTYPE_EXCLUDEDPHRASE, ],
  enum_types=[
    _ENTITYTYPE_KIND,
    _ENTITYTYPE_AUTOEXPANSIONMODE,
  ],
  serialized_options=b'\352Ax\n$dialogflow.googleapis.com/EntityType\022Pprojects/{project}/locations/{location}/agents/{agent}/entityTypes/{entity_type}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=261,
  serialized_end=1039,
)


_LISTENTITYTYPESREQUEST = _descriptor.Descriptor(
  name='ListEntityTypesRequest',
  full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\022$dialogflow.googleapis.com/EntityType', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesRequest.language_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_size', full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesRequest.page_size', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='page_token', full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesRequest.page_token', index=3,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_start=1042,
  serialized_end=1190,
)


_LISTENTITYTYPESRESPONSE = _descriptor.Descriptor(
  name='ListEntityTypesResponse',
  full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entity_types', full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesResponse.entity_types', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='next_page_token', full_name='google.cloud.dialogflow.cx.v3.ListEntityTypesResponse.next_page_token', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=1192,
  serialized_end=1307,
)


_GETENTITYTYPEREQUEST = _descriptor.Descriptor(
  name='GetEntityTypeRequest',
  full_name='google.cloud.dialogflow.cx.v3.GetEntityTypeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.cx.v3.GetEntityTypeRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3.GetEntityTypeRequest.language_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=1309,
  serialized_end=1414,
)


_CREATEENTITYTYPEREQUEST = _descriptor.Descriptor(
  name='CreateEntityTypeRequest',
  full_name='google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\022$dialogflow.googleapis.com/EntityType', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='entity_type', full_name='google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest.entity_type', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest.language_code', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_start=1417,
  serialized_end=1596,
)


_UPDATEENTITYTYPEREQUEST = _descriptor.Descriptor(
  name='UpdateEntityTypeRequest',
  full_name='google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entity_type', full_name='google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest.entity_type', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='language_code', full_name='google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest.language_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_mask', full_name='google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest.update_mask', index=2,
      number=3, type=11, cpp_type=10, label=1,
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
  serialized_start=1599,
  serialized_end=1765,
)


_DELETEENTITYTYPEREQUEST = _descriptor.Descriptor(
  name='DeleteEntityTypeRequest',
  full_name='google.cloud.dialogflow.cx.v3.DeleteEntityTypeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.dialogflow.cx.v3.DeleteEntityTypeRequest.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='force', full_name='google.cloud.dialogflow.cx.v3.DeleteEntityTypeRequest.force', index=1,
      number=2, type=8, cpp_type=7, label=1,
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
  serialized_start=1767,
  serialized_end=1867,
)

_ENTITYTYPE_ENTITY.containing_type = _ENTITYTYPE
_ENTITYTYPE_EXCLUDEDPHRASE.containing_type = _ENTITYTYPE
_ENTITYTYPE.fields_by_name['kind'].enum_type = _ENTITYTYPE_KIND
_ENTITYTYPE.fields_by_name['auto_expansion_mode'].enum_type = _ENTITYTYPE_AUTOEXPANSIONMODE
_ENTITYTYPE.fields_by_name['entities'].message_type = _ENTITYTYPE_ENTITY
_ENTITYTYPE.fields_by_name['excluded_phrases'].message_type = _ENTITYTYPE_EXCLUDEDPHRASE
_ENTITYTYPE_KIND.containing_type = _ENTITYTYPE
_ENTITYTYPE_AUTOEXPANSIONMODE.containing_type = _ENTITYTYPE
_LISTENTITYTYPESRESPONSE.fields_by_name['entity_types'].message_type = _ENTITYTYPE
_CREATEENTITYTYPEREQUEST.fields_by_name['entity_type'].message_type = _ENTITYTYPE
_UPDATEENTITYTYPEREQUEST.fields_by_name['entity_type'].message_type = _ENTITYTYPE
_UPDATEENTITYTYPEREQUEST.fields_by_name['update_mask'].message_type = google_dot_protobuf_dot_field__mask__pb2._FIELDMASK
DESCRIPTOR.message_types_by_name['EntityType'] = _ENTITYTYPE
DESCRIPTOR.message_types_by_name['ListEntityTypesRequest'] = _LISTENTITYTYPESREQUEST
DESCRIPTOR.message_types_by_name['ListEntityTypesResponse'] = _LISTENTITYTYPESRESPONSE
DESCRIPTOR.message_types_by_name['GetEntityTypeRequest'] = _GETENTITYTYPEREQUEST
DESCRIPTOR.message_types_by_name['CreateEntityTypeRequest'] = _CREATEENTITYTYPEREQUEST
DESCRIPTOR.message_types_by_name['UpdateEntityTypeRequest'] = _UPDATEENTITYTYPEREQUEST
DESCRIPTOR.message_types_by_name['DeleteEntityTypeRequest'] = _DELETEENTITYTYPEREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

EntityType = _reflection.GeneratedProtocolMessageType('EntityType', (_message.Message,), {

  'Entity' : _reflection.GeneratedProtocolMessageType('Entity', (_message.Message,), {
    'DESCRIPTOR' : _ENTITYTYPE_ENTITY,
    '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.EntityType.Entity)
    })
  ,

  'ExcludedPhrase' : _reflection.GeneratedProtocolMessageType('ExcludedPhrase', (_message.Message,), {
    'DESCRIPTOR' : _ENTITYTYPE_EXCLUDEDPHRASE,
    '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.EntityType.ExcludedPhrase)
    })
  ,
  'DESCRIPTOR' : _ENTITYTYPE,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.EntityType)
  })
_sym_db.RegisterMessage(EntityType)
_sym_db.RegisterMessage(EntityType.Entity)
_sym_db.RegisterMessage(EntityType.ExcludedPhrase)

ListEntityTypesRequest = _reflection.GeneratedProtocolMessageType('ListEntityTypesRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTENTITYTYPESREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ListEntityTypesRequest)
  })
_sym_db.RegisterMessage(ListEntityTypesRequest)

ListEntityTypesResponse = _reflection.GeneratedProtocolMessageType('ListEntityTypesResponse', (_message.Message,), {
  'DESCRIPTOR' : _LISTENTITYTYPESRESPONSE,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ListEntityTypesResponse)
  })
_sym_db.RegisterMessage(ListEntityTypesResponse)

GetEntityTypeRequest = _reflection.GeneratedProtocolMessageType('GetEntityTypeRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETENTITYTYPEREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.GetEntityTypeRequest)
  })
_sym_db.RegisterMessage(GetEntityTypeRequest)

CreateEntityTypeRequest = _reflection.GeneratedProtocolMessageType('CreateEntityTypeRequest', (_message.Message,), {
  'DESCRIPTOR' : _CREATEENTITYTYPEREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest)
  })
_sym_db.RegisterMessage(CreateEntityTypeRequest)

UpdateEntityTypeRequest = _reflection.GeneratedProtocolMessageType('UpdateEntityTypeRequest', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEENTITYTYPEREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest)
  })
_sym_db.RegisterMessage(UpdateEntityTypeRequest)

DeleteEntityTypeRequest = _reflection.GeneratedProtocolMessageType('DeleteEntityTypeRequest', (_message.Message,), {
  'DESCRIPTOR' : _DELETEENTITYTYPEREQUEST,
  '__module__' : 'google.cloud.dialogflow.cx.v3.entity_type_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.DeleteEntityTypeRequest)
  })
_sym_db.RegisterMessage(DeleteEntityTypeRequest)


DESCRIPTOR._options = None
_ENTITYTYPE_ENTITY.fields_by_name['value']._options = None
_ENTITYTYPE_ENTITY.fields_by_name['synonyms']._options = None
_ENTITYTYPE_EXCLUDEDPHRASE.fields_by_name['value']._options = None
_ENTITYTYPE.fields_by_name['display_name']._options = None
_ENTITYTYPE.fields_by_name['kind']._options = None
_ENTITYTYPE._options = None
_LISTENTITYTYPESREQUEST.fields_by_name['parent']._options = None
_GETENTITYTYPEREQUEST.fields_by_name['name']._options = None
_CREATEENTITYTYPEREQUEST.fields_by_name['parent']._options = None
_CREATEENTITYTYPEREQUEST.fields_by_name['entity_type']._options = None
_UPDATEENTITYTYPEREQUEST.fields_by_name['entity_type']._options = None
_DELETEENTITYTYPEREQUEST.fields_by_name['name']._options = None

_ENTITYTYPES = _descriptor.ServiceDescriptor(
  name='EntityTypes',
  full_name='google.cloud.dialogflow.cx.v3.EntityTypes',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow',
  create_key=_descriptor._internal_create_key,
  serialized_start=1870,
  serialized_end=3029,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListEntityTypes',
    full_name='google.cloud.dialogflow.cx.v3.EntityTypes.ListEntityTypes',
    index=0,
    containing_service=None,
    input_type=_LISTENTITYTYPESREQUEST,
    output_type=_LISTENTITYTYPESRESPONSE,
    serialized_options=b'\202\323\344\223\002:\0228/v3/{parent=projects/*/locations/*/agents/*}/entityTypes\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetEntityType',
    full_name='google.cloud.dialogflow.cx.v3.EntityTypes.GetEntityType',
    index=1,
    containing_service=None,
    input_type=_GETENTITYTYPEREQUEST,
    output_type=_ENTITYTYPE,
    serialized_options=b'\202\323\344\223\002:\0228/v3/{name=projects/*/locations/*/agents/*/entityTypes/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateEntityType',
    full_name='google.cloud.dialogflow.cx.v3.EntityTypes.CreateEntityType',
    index=2,
    containing_service=None,
    input_type=_CREATEENTITYTYPEREQUEST,
    output_type=_ENTITYTYPE,
    serialized_options=b'\202\323\344\223\002G\"8/v3/{parent=projects/*/locations/*/agents/*}/entityTypes:\013entity_type\332A\022parent,entity_type',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateEntityType',
    full_name='google.cloud.dialogflow.cx.v3.EntityTypes.UpdateEntityType',
    index=3,
    containing_service=None,
    input_type=_UPDATEENTITYTYPEREQUEST,
    output_type=_ENTITYTYPE,
    serialized_options=b'\202\323\344\223\002S2D/v3/{entity_type.name=projects/*/locations/*/agents/*/entityTypes/*}:\013entity_type\332A\027entity_type,update_mask',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteEntityType',
    full_name='google.cloud.dialogflow.cx.v3.EntityTypes.DeleteEntityType',
    index=4,
    containing_service=None,
    input_type=_DELETEENTITYTYPEREQUEST,
    output_type=google_dot_protobuf_dot_empty__pb2._EMPTY,
    serialized_options=b'\202\323\344\223\002:*8/v3/{name=projects/*/locations/*/agents/*/entityTypes/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ENTITYTYPES)

DESCRIPTOR.services_by_name['EntityTypes'] = _ENTITYTYPES

# @@protoc_insertion_point(module_scope)