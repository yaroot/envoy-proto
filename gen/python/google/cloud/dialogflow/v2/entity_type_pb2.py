# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2/entity_type.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/dialogflow/v2/entity_type.proto\x12\x1agoogle.cloud.dialogflow.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xc3\x05\n\nEntityType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12>\n\x04kind\x18\x03 \x01(\x0e\x32+.google.cloud.dialogflow.v2.EntityType.KindB\x03\xe0\x41\x02\x12Z\n\x13\x61uto_expansion_mode\x18\x04 \x01(\x0e\x32\x38.google.cloud.dialogflow.v2.EntityType.AutoExpansionModeB\x03\xe0\x41\x01\x12\x44\n\x08\x65ntities\x18\x06 \x03(\x0b\x32-.google.cloud.dialogflow.v2.EntityType.EntityB\x03\xe0\x41\x01\x12$\n\x17\x65nable_fuzzy_extraction\x18\x07 \x01(\x08\x42\x03\xe0\x41\x01\x1a\x33\n\x06\x45ntity\x12\x12\n\x05value\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08synonyms\x18\x02 \x03(\tB\x03\xe0\x41\x02\"J\n\x04Kind\x12\x14\n\x10KIND_UNSPECIFIED\x10\x00\x12\x0c\n\x08KIND_MAP\x10\x01\x12\r\n\tKIND_LIST\x10\x02\x12\x0f\n\x0bKIND_REGEXP\x10\x03\"Y\n\x11\x41utoExpansionMode\x12#\n\x1f\x41UTO_EXPANSION_MODE_UNSPECIFIED\x10\x00\x12\x1f\n\x1b\x41UTO_EXPANSION_MODE_DEFAULT\x10\x01:\xa7\x01\xea\x41\xa3\x01\n$dialogflow.googleapis.com/EntityType\x12\x32projects/{project}/agent/entityTypes/{entity_type}\x12Gprojects/{project}/locations/{location}/agent/entityTypes/{entity_type}\"\xa3\x01\n\x16ListEntityTypesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$dialogflow.googleapis.com/EntityType\x12\x1a\n\rlanguage_code\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x16\n\tpage_size\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x04 \x01(\tB\x03\xe0\x41\x01\"p\n\x17ListEntityTypesResponse\x12<\n\x0c\x65ntity_types\x18\x01 \x03(\x0b\x32&.google.cloud.dialogflow.v2.EntityType\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"n\n\x14GetEntityTypeRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\x1a\n\rlanguage_code\x18\x02 \x01(\tB\x03\xe0\x41\x01\"\xb5\x01\n\x17\x43reateEntityTypeRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$dialogflow.googleapis.com/EntityType\x12@\n\x0b\x65ntity_type\x18\x02 \x01(\x0b\x32&.google.cloud.dialogflow.v2.EntityTypeB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x03 \x01(\tB\x03\xe0\x41\x01\"\xad\x01\n\x17UpdateEntityTypeRequest\x12@\n\x0b\x65ntity_type\x18\x01 \x01(\x0b\x32&.google.cloud.dialogflow.v2.EntityTypeB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x34\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"U\n\x17\x44\x65leteEntityTypeRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\"\xb6\x02\n\x1d\x42\x61tchUpdateEntityTypesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$dialogflow.googleapis.com/EntityType\x12\x1f\n\x15\x65ntity_type_batch_uri\x18\x02 \x01(\tH\x00\x12O\n\x18\x65ntity_type_batch_inline\x18\x03 \x01(\x0b\x32+.google.cloud.dialogflow.v2.EntityTypeBatchH\x00\x12\x1a\n\rlanguage_code\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x34\n\x0bupdate_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x42\x13\n\x11\x65ntity_type_batch\"^\n\x1e\x42\x61tchUpdateEntityTypesResponse\x12<\n\x0c\x65ntity_types\x18\x01 \x03(\x0b\x32&.google.cloud.dialogflow.v2.EntityType\"}\n\x1d\x42\x61tchDeleteEntityTypesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$dialogflow.googleapis.com/EntityType\x12\x1e\n\x11\x65ntity_type_names\x18\x02 \x03(\tB\x03\xe0\x41\x02\"\xbc\x01\n\x1a\x42\x61tchCreateEntitiesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\x44\n\x08\x65ntities\x18\x02 \x03(\x0b\x32-.google.cloud.dialogflow.v2.EntityType.EntityB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x03 \x01(\tB\x03\xe0\x41\x01\"\xf2\x01\n\x1a\x42\x61tchUpdateEntitiesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\x44\n\x08\x65ntities\x18\x02 \x03(\x0b\x32-.google.cloud.dialogflow.v2.EntityType.EntityB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x34\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"\x92\x01\n\x1a\x42\x61tchDeleteEntitiesRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$dialogflow.googleapis.com/EntityType\x12\x1a\n\rentity_values\x18\x02 \x03(\tB\x03\xe0\x41\x02\x12\x1a\n\rlanguage_code\x18\x03 \x01(\tB\x03\xe0\x41\x01\"O\n\x0f\x45ntityTypeBatch\x12<\n\x0c\x65ntity_types\x18\x01 \x03(\x0b\x32&.google.cloud.dialogflow.v2.EntityType2\xd6\x19\n\x0b\x45ntityTypes\x12\x87\x02\n\x0fListEntityTypes\x12\x32.google.cloud.dialogflow.v2.ListEntityTypesRequest\x1a\x33.google.cloud.dialogflow.v2.ListEntityTypesResponse\"\x8a\x01\x82\xd3\xe4\x93\x02\x64\x12)/v2/{parent=projects/*/agent}/entityTypesZ7\x12\x35/v2/{parent=projects/*/locations/*/agent}/entityTypes\xda\x41\x06parent\xda\x41\x14parent,language_code\x12\xf2\x01\n\rGetEntityType\x12\x30.google.cloud.dialogflow.v2.GetEntityTypeRequest\x1a&.google.cloud.dialogflow.v2.EntityType\"\x86\x01\x82\xd3\xe4\x93\x02\x64\x12)/v2/{name=projects/*/agent/entityTypes/*}Z7\x12\x35/v2/{name=projects/*/locations/*/agent/entityTypes/*}\xda\x41\x04name\xda\x41\x12name,language_code\x12\xae\x02\n\x10\x43reateEntityType\x12\x33.google.cloud.dialogflow.v2.CreateEntityTypeRequest\x1a&.google.cloud.dialogflow.v2.EntityType\"\xbc\x01\x82\xd3\xe4\x93\x02~\")/v2/{parent=projects/*/agent}/entityTypes:\x0b\x65ntity_typeZD\"5/v2/{parent=projects/*/locations/*/agent}/entityTypes:\x0b\x65ntity_type\xda\x41\x12parent,entity_type\xda\x41 parent,entity_type,language_code\x12\xb9\x02\n\x10UpdateEntityType\x12\x33.google.cloud.dialogflow.v2.UpdateEntityTypeRequest\x1a&.google.cloud.dialogflow.v2.EntityType\"\xc7\x01\x82\xd3\xe4\x93\x02\x96\x01\x32\x35/v2/{entity_type.name=projects/*/agent/entityTypes/*}:\x0b\x65ntity_typeZP2A/v2/{entity_type.name=projects/*/locations/*/agent/entityTypes/*}:\x0b\x65ntity_type\xda\x41\x0b\x65ntity_type\xda\x41\x19\x65ntity_type,language_code\x12\xd2\x01\n\x10\x44\x65leteEntityType\x12\x33.google.cloud.dialogflow.v2.DeleteEntityTypeRequest\x1a\x16.google.protobuf.Empty\"q\x82\xd3\xe4\x93\x02\x64*)/v2/{name=projects/*/agent/entityTypes/*}Z7*5/v2/{name=projects/*/locations/*/agent/entityTypes/*}\xda\x41\x04name\x12\xd4\x02\n\x16\x42\x61tchUpdateEntityTypes\x12\x39.google.cloud.dialogflow.v2.BatchUpdateEntityTypesRequest\x1a\x1d.google.longrunning.Operation\"\xdf\x01\x82\xd3\xe4\x93\x02\x82\x01\"5/v2/{parent=projects/*/agent}/entityTypes:batchUpdate:\x01*ZF\"A/v2/{parent=projects/*/locations/*/agent}/entityTypes:batchUpdate:\x01*\xca\x41S\n9google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse\x12\x16google.protobuf.Struct\x12\xcb\x02\n\x16\x42\x61tchDeleteEntityTypes\x12\x39.google.cloud.dialogflow.v2.BatchDeleteEntityTypesRequest\x1a\x1d.google.longrunning.Operation\"\xd6\x01\x82\xd3\xe4\x93\x02\x82\x01\"5/v2/{parent=projects/*/agent}/entityTypes:batchDelete:\x01*ZF\"A/v2/{parent=projects/*/locations/*/agent}/entityTypes:batchDelete:\x01*\xda\x41\x18parent,entity_type_names\xca\x41/\n\x15google.protobuf.Empty\x12\x16google.protobuf.Struct\x12\xf2\x02\n\x13\x42\x61tchCreateEntities\x12\x36.google.cloud.dialogflow.v2.BatchCreateEntitiesRequest\x1a\x1d.google.longrunning.Operation\"\x83\x02\x82\xd3\xe4\x93\x02\x98\x01\"@/v2/{parent=projects/*/agent/entityTypes/*}/entities:batchCreate:\x01*ZQ\"L/v2/{parent=projects/*/locations/*/agent/entityTypes/*}/entities:batchCreate:\x01*\xda\x41\x0fparent,entities\xda\x41\x1dparent,entities,language_code\xca\x41/\n\x15google.protobuf.Empty\x12\x16google.protobuf.Struct\x12\xf2\x02\n\x13\x42\x61tchUpdateEntities\x12\x36.google.cloud.dialogflow.v2.BatchUpdateEntitiesRequest\x1a\x1d.google.longrunning.Operation\"\x83\x02\x82\xd3\xe4\x93\x02\x98\x01\"@/v2/{parent=projects/*/agent/entityTypes/*}/entities:batchUpdate:\x01*ZQ\"L/v2/{parent=projects/*/locations/*/agent/entityTypes/*}/entities:batchUpdate:\x01*\xda\x41\x0fparent,entities\xda\x41\x1dparent,entities,language_code\xca\x41/\n\x15google.protobuf.Empty\x12\x16google.protobuf.Struct\x12\xfc\x02\n\x13\x42\x61tchDeleteEntities\x12\x36.google.cloud.dialogflow.v2.BatchDeleteEntitiesRequest\x1a\x1d.google.longrunning.Operation\"\x8d\x02\x82\xd3\xe4\x93\x02\x98\x01\"@/v2/{parent=projects/*/agent/entityTypes/*}/entities:batchDelete:\x01*ZQ\"L/v2/{parent=projects/*/locations/*/agent/entityTypes/*}/entities:batchDelete:\x01*\xda\x41\x14parent,entity_values\xda\x41\"parent,entity_values,language_code\xca\x41/\n\x15google.protobuf.Empty\x12\x16google.protobuf.Struct\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\x9e\x01\n\x1e\x63om.google.cloud.dialogflow.v2B\x0f\x45ntityTypeProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1aGoogle.Cloud.Dialogflow.V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2.entity_type_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.dialogflow.v2B\017EntityTypeProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2'
  _ENTITYTYPE_ENTITY.fields_by_name['value']._options = None
  _ENTITYTYPE_ENTITY.fields_by_name['value']._serialized_options = b'\340A\002'
  _ENTITYTYPE_ENTITY.fields_by_name['synonyms']._options = None
  _ENTITYTYPE_ENTITY.fields_by_name['synonyms']._serialized_options = b'\340A\002'
  _ENTITYTYPE.fields_by_name['display_name']._options = None
  _ENTITYTYPE.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _ENTITYTYPE.fields_by_name['kind']._options = None
  _ENTITYTYPE.fields_by_name['kind']._serialized_options = b'\340A\002'
  _ENTITYTYPE.fields_by_name['auto_expansion_mode']._options = None
  _ENTITYTYPE.fields_by_name['auto_expansion_mode']._serialized_options = b'\340A\001'
  _ENTITYTYPE.fields_by_name['entities']._options = None
  _ENTITYTYPE.fields_by_name['entities']._serialized_options = b'\340A\001'
  _ENTITYTYPE.fields_by_name['enable_fuzzy_extraction']._options = None
  _ENTITYTYPE.fields_by_name['enable_fuzzy_extraction']._serialized_options = b'\340A\001'
  _ENTITYTYPE._options = None
  _ENTITYTYPE._serialized_options = b'\352A\243\001\n$dialogflow.googleapis.com/EntityType\0222projects/{project}/agent/entityTypes/{entity_type}\022Gprojects/{project}/locations/{location}/agent/entityTypes/{entity_type}'
  _LISTENTITYTYPESREQUEST.fields_by_name['parent']._options = None
  _LISTENTITYTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$dialogflow.googleapis.com/EntityType'
  _LISTENTITYTYPESREQUEST.fields_by_name['language_code']._options = None
  _LISTENTITYTYPESREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _LISTENTITYTYPESREQUEST.fields_by_name['page_size']._options = None
  _LISTENTITYTYPESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTENTITYTYPESREQUEST.fields_by_name['page_token']._options = None
  _LISTENTITYTYPESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _GETENTITYTYPEREQUEST.fields_by_name['name']._options = None
  _GETENTITYTYPEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType'
  _GETENTITYTYPEREQUEST.fields_by_name['language_code']._options = None
  _GETENTITYTYPEREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _CREATEENTITYTYPEREQUEST.fields_by_name['parent']._options = None
  _CREATEENTITYTYPEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$dialogflow.googleapis.com/EntityType'
  _CREATEENTITYTYPEREQUEST.fields_by_name['entity_type']._options = None
  _CREATEENTITYTYPEREQUEST.fields_by_name['entity_type']._serialized_options = b'\340A\002'
  _CREATEENTITYTYPEREQUEST.fields_by_name['language_code']._options = None
  _CREATEENTITYTYPEREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _UPDATEENTITYTYPEREQUEST.fields_by_name['entity_type']._options = None
  _UPDATEENTITYTYPEREQUEST.fields_by_name['entity_type']._serialized_options = b'\340A\002'
  _UPDATEENTITYTYPEREQUEST.fields_by_name['language_code']._options = None
  _UPDATEENTITYTYPEREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _UPDATEENTITYTYPEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEENTITYTYPEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _DELETEENTITYTYPEREQUEST.fields_by_name['name']._options = None
  _DELETEENTITYTYPEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType'
  _BATCHUPDATEENTITYTYPESREQUEST.fields_by_name['parent']._options = None
  _BATCHUPDATEENTITYTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$dialogflow.googleapis.com/EntityType'
  _BATCHUPDATEENTITYTYPESREQUEST.fields_by_name['language_code']._options = None
  _BATCHUPDATEENTITYTYPESREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _BATCHUPDATEENTITYTYPESREQUEST.fields_by_name['update_mask']._options = None
  _BATCHUPDATEENTITYTYPESREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _BATCHDELETEENTITYTYPESREQUEST.fields_by_name['parent']._options = None
  _BATCHDELETEENTITYTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$dialogflow.googleapis.com/EntityType'
  _BATCHDELETEENTITYTYPESREQUEST.fields_by_name['entity_type_names']._options = None
  _BATCHDELETEENTITYTYPESREQUEST.fields_by_name['entity_type_names']._serialized_options = b'\340A\002'
  _BATCHCREATEENTITIESREQUEST.fields_by_name['parent']._options = None
  _BATCHCREATEENTITIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType'
  _BATCHCREATEENTITIESREQUEST.fields_by_name['entities']._options = None
  _BATCHCREATEENTITIESREQUEST.fields_by_name['entities']._serialized_options = b'\340A\002'
  _BATCHCREATEENTITIESREQUEST.fields_by_name['language_code']._options = None
  _BATCHCREATEENTITIESREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['parent']._options = None
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType'
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['entities']._options = None
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['entities']._serialized_options = b'\340A\002'
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['language_code']._options = None
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['update_mask']._options = None
  _BATCHUPDATEENTITIESREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _BATCHDELETEENTITIESREQUEST.fields_by_name['parent']._options = None
  _BATCHDELETEENTITIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\n$dialogflow.googleapis.com/EntityType'
  _BATCHDELETEENTITIESREQUEST.fields_by_name['entity_values']._options = None
  _BATCHDELETEENTITIESREQUEST.fields_by_name['entity_values']._serialized_options = b'\340A\002'
  _BATCHDELETEENTITIESREQUEST.fields_by_name['language_code']._options = None
  _BATCHDELETEENTITIESREQUEST.fields_by_name['language_code']._serialized_options = b'\340A\001'
  _ENTITYTYPES._options = None
  _ENTITYTYPES._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _ENTITYTYPES.methods_by_name['ListEntityTypes']._options = None
  _ENTITYTYPES.methods_by_name['ListEntityTypes']._serialized_options = b'\202\323\344\223\002d\022)/v2/{parent=projects/*/agent}/entityTypesZ7\0225/v2/{parent=projects/*/locations/*/agent}/entityTypes\332A\006parent\332A\024parent,language_code'
  _ENTITYTYPES.methods_by_name['GetEntityType']._options = None
  _ENTITYTYPES.methods_by_name['GetEntityType']._serialized_options = b'\202\323\344\223\002d\022)/v2/{name=projects/*/agent/entityTypes/*}Z7\0225/v2/{name=projects/*/locations/*/agent/entityTypes/*}\332A\004name\332A\022name,language_code'
  _ENTITYTYPES.methods_by_name['CreateEntityType']._options = None
  _ENTITYTYPES.methods_by_name['CreateEntityType']._serialized_options = b'\202\323\344\223\002~\")/v2/{parent=projects/*/agent}/entityTypes:\013entity_typeZD\"5/v2/{parent=projects/*/locations/*/agent}/entityTypes:\013entity_type\332A\022parent,entity_type\332A parent,entity_type,language_code'
  _ENTITYTYPES.methods_by_name['UpdateEntityType']._options = None
  _ENTITYTYPES.methods_by_name['UpdateEntityType']._serialized_options = b'\202\323\344\223\002\226\00125/v2/{entity_type.name=projects/*/agent/entityTypes/*}:\013entity_typeZP2A/v2/{entity_type.name=projects/*/locations/*/agent/entityTypes/*}:\013entity_type\332A\013entity_type\332A\031entity_type,language_code'
  _ENTITYTYPES.methods_by_name['DeleteEntityType']._options = None
  _ENTITYTYPES.methods_by_name['DeleteEntityType']._serialized_options = b'\202\323\344\223\002d*)/v2/{name=projects/*/agent/entityTypes/*}Z7*5/v2/{name=projects/*/locations/*/agent/entityTypes/*}\332A\004name'
  _ENTITYTYPES.methods_by_name['BatchUpdateEntityTypes']._options = None
  _ENTITYTYPES.methods_by_name['BatchUpdateEntityTypes']._serialized_options = b'\202\323\344\223\002\202\001\"5/v2/{parent=projects/*/agent}/entityTypes:batchUpdate:\001*ZF\"A/v2/{parent=projects/*/locations/*/agent}/entityTypes:batchUpdate:\001*\312AS\n9google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse\022\026google.protobuf.Struct'
  _ENTITYTYPES.methods_by_name['BatchDeleteEntityTypes']._options = None
  _ENTITYTYPES.methods_by_name['BatchDeleteEntityTypes']._serialized_options = b'\202\323\344\223\002\202\001\"5/v2/{parent=projects/*/agent}/entityTypes:batchDelete:\001*ZF\"A/v2/{parent=projects/*/locations/*/agent}/entityTypes:batchDelete:\001*\332A\030parent,entity_type_names\312A/\n\025google.protobuf.Empty\022\026google.protobuf.Struct'
  _ENTITYTYPES.methods_by_name['BatchCreateEntities']._options = None
  _ENTITYTYPES.methods_by_name['BatchCreateEntities']._serialized_options = b'\202\323\344\223\002\230\001\"@/v2/{parent=projects/*/agent/entityTypes/*}/entities:batchCreate:\001*ZQ\"L/v2/{parent=projects/*/locations/*/agent/entityTypes/*}/entities:batchCreate:\001*\332A\017parent,entities\332A\035parent,entities,language_code\312A/\n\025google.protobuf.Empty\022\026google.protobuf.Struct'
  _ENTITYTYPES.methods_by_name['BatchUpdateEntities']._options = None
  _ENTITYTYPES.methods_by_name['BatchUpdateEntities']._serialized_options = b'\202\323\344\223\002\230\001\"@/v2/{parent=projects/*/agent/entityTypes/*}/entities:batchUpdate:\001*ZQ\"L/v2/{parent=projects/*/locations/*/agent/entityTypes/*}/entities:batchUpdate:\001*\332A\017parent,entities\332A\035parent,entities,language_code\312A/\n\025google.protobuf.Empty\022\026google.protobuf.Struct'
  _ENTITYTYPES.methods_by_name['BatchDeleteEntities']._options = None
  _ENTITYTYPES.methods_by_name['BatchDeleteEntities']._serialized_options = b'\202\323\344\223\002\230\001\"@/v2/{parent=projects/*/agent/entityTypes/*}/entities:batchDelete:\001*ZQ\"L/v2/{parent=projects/*/locations/*/agent/entityTypes/*}/entities:batchDelete:\001*\332A\024parent,entity_values\332A\"parent,entity_values,language_code\312A/\n\025google.protobuf.Empty\022\026google.protobuf.Struct'
  _ENTITYTYPE._serialized_start=292
  _ENTITYTYPE._serialized_end=999
  _ENTITYTYPE_ENTITY._serialized_start=611
  _ENTITYTYPE_ENTITY._serialized_end=662
  _ENTITYTYPE_KIND._serialized_start=664
  _ENTITYTYPE_KIND._serialized_end=738
  _ENTITYTYPE_AUTOEXPANSIONMODE._serialized_start=740
  _ENTITYTYPE_AUTOEXPANSIONMODE._serialized_end=829
  _LISTENTITYTYPESREQUEST._serialized_start=1002
  _LISTENTITYTYPESREQUEST._serialized_end=1165
  _LISTENTITYTYPESRESPONSE._serialized_start=1167
  _LISTENTITYTYPESRESPONSE._serialized_end=1279
  _GETENTITYTYPEREQUEST._serialized_start=1281
  _GETENTITYTYPEREQUEST._serialized_end=1391
  _CREATEENTITYTYPEREQUEST._serialized_start=1394
  _CREATEENTITYTYPEREQUEST._serialized_end=1575
  _UPDATEENTITYTYPEREQUEST._serialized_start=1578
  _UPDATEENTITYTYPEREQUEST._serialized_end=1751
  _DELETEENTITYTYPEREQUEST._serialized_start=1753
  _DELETEENTITYTYPEREQUEST._serialized_end=1838
  _BATCHUPDATEENTITYTYPESREQUEST._serialized_start=1841
  _BATCHUPDATEENTITYTYPESREQUEST._serialized_end=2151
  _BATCHUPDATEENTITYTYPESRESPONSE._serialized_start=2153
  _BATCHUPDATEENTITYTYPESRESPONSE._serialized_end=2247
  _BATCHDELETEENTITYTYPESREQUEST._serialized_start=2249
  _BATCHDELETEENTITYTYPESREQUEST._serialized_end=2374
  _BATCHCREATEENTITIESREQUEST._serialized_start=2377
  _BATCHCREATEENTITIESREQUEST._serialized_end=2565
  _BATCHUPDATEENTITIESREQUEST._serialized_start=2568
  _BATCHUPDATEENTITIESREQUEST._serialized_end=2810
  _BATCHDELETEENTITIESREQUEST._serialized_start=2813
  _BATCHDELETEENTITIESREQUEST._serialized_end=2959
  _ENTITYTYPEBATCH._serialized_start=2961
  _ENTITYTYPEBATCH._serialized_end=3040
  _ENTITYTYPES._serialized_start=3043
  _ENTITYTYPES._serialized_end=6329
# @@protoc_insertion_point(module_scope)
