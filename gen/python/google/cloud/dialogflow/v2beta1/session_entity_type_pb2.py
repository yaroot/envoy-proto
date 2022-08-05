# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/session_entity_type.proto
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
from google.cloud.dialogflow.v2beta1 import entity_type_pb2 as google_dot_cloud_dot_dialogflow_dot_v2beta1_dot_entity__type__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/cloud/dialogflow/v2beta1/session_entity_type.proto\x12\x1fgoogle.cloud.dialogflow.v2beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x31google/cloud/dialogflow/v2beta1/entity_type.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\x9c\x06\n\x11SessionEntityType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x63\n\x14\x65ntity_override_mode\x18\x02 \x01(\x0e\x32\x45.google.cloud.dialogflow.v2beta1.SessionEntityType.EntityOverrideMode\x12\x44\n\x08\x65ntities\x18\x03 \x03(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.EntityType.Entity\"\x82\x01\n\x12\x45ntityOverrideMode\x12$\n ENTITY_OVERRIDE_MODE_UNSPECIFIED\x10\x00\x12!\n\x1d\x45NTITY_OVERRIDE_MODE_OVERRIDE\x10\x01\x12#\n\x1f\x45NTITY_OVERRIDE_MODE_SUPPLEMENT\x10\x02:\xc8\x03\xea\x41\xc4\x03\n+dialogflow.googleapis.com/SessionEntityType\x12\x45projects/{project}/agent/sessions/{session}/entityTypes/{entity_type}\x12Zprojects/{project}/locations/{location}/agent/sessions/{session}/entityTypes/{entity_type}\x12mprojects/{project}/agent/environments/{environment}/users/{user}/sessions/{session}/entityTypes/{entity_type}\x12\x82\x01projects/{project}/locations/{location}/agent/environments/{environment}/users/{user}/sessions/{session}/entityTypes/{entity_type}\"\x8b\x01\n\x1dListSessionEntityTypesRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\x12+dialogflow.googleapis.com/SessionEntityType\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x8b\x01\n\x1eListSessionEntityTypesResponse\x12P\n\x14session_entity_types\x18\x01 \x03(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.SessionEntityType\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"`\n\x1bGetSessionEntityTypeRequest\x12\x41\n\x04name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+dialogflow.googleapis.com/SessionEntityType\"\xbb\x01\n\x1e\x43reateSessionEntityTypeRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\x12+dialogflow.googleapis.com/SessionEntityType\x12T\n\x13session_entity_type\x18\x02 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.SessionEntityTypeB\x03\xe0\x41\x02\"\xa7\x01\n\x1eUpdateSessionEntityTypeRequest\x12T\n\x13session_entity_type\x18\x01 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2beta1.SessionEntityTypeB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"c\n\x1e\x44\x65leteSessionEntityTypeRequest\x12\x41\n\x04name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+dialogflow.googleapis.com/SessionEntityType2\xfb\x15\n\x12SessionEntityTypes\x12\xe4\x03\n\x16ListSessionEntityTypes\x12>.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesRequest\x1a?.google.cloud.dialogflow.v2beta1.ListSessionEntityTypesResponse\"\xc8\x02\x82\xd3\xe4\x93\x02\xb8\x02\x12\x39/v2beta1/{parent=projects/*/agent/sessions/*}/entityTypesZR\x12P/v2beta1/{parent=projects/*/agent/environments/*/users/*/sessions/*}/entityTypesZG\x12\x45/v2beta1/{parent=projects/*/locations/*/agent/sessions/*}/entityTypesZ^\x12\\/v2beta1/{parent=projects/*/locations/*/agent/environments/*/users/*/sessions/*}/entityTypes\xda\x41\x06parent\x12\xd1\x03\n\x14GetSessionEntityType\x12<.google.cloud.dialogflow.v2beta1.GetSessionEntityTypeRequest\x1a\x32.google.cloud.dialogflow.v2beta1.SessionEntityType\"\xc6\x02\x82\xd3\xe4\x93\x02\xb8\x02\x12\x39/v2beta1/{name=projects/*/agent/sessions/*/entityTypes/*}ZR\x12P/v2beta1/{name=projects/*/agent/environments/*/users/*/sessions/*/entityTypes/*}ZG\x12\x45/v2beta1/{name=projects/*/locations/*/agent/sessions/*/entityTypes/*}Z^\x12\\/v2beta1/{name=projects/*/locations/*/agent/environments/*/users/*/sessions/*/entityTypes/*}\xda\x41\x04name\x12\xc1\x04\n\x17\x43reateSessionEntityType\x12?.google.cloud.dialogflow.v2beta1.CreateSessionEntityTypeRequest\x1a\x32.google.cloud.dialogflow.v2beta1.SessionEntityType\"\xb0\x03\x82\xd3\xe4\x93\x02\x8c\x03\"9/v2beta1/{parent=projects/*/agent/sessions/*}/entityTypes:\x13session_entity_typeZg\"P/v2beta1/{parent=projects/*/agent/environments/*/users/*/sessions/*}/entityTypes:\x13session_entity_typeZ\\\"E/v2beta1/{parent=projects/*/locations/*/agent/sessions/*}/entityTypes:\x13session_entity_typeZs\"\\/v2beta1/{parent=projects/*/locations/*/agent/environments/*/users/*/sessions/*}/entityTypes:\x13session_entity_type\xda\x41\x1aparent,session_entity_type\x12\xad\x05\n\x17UpdateSessionEntityType\x12?.google.cloud.dialogflow.v2beta1.UpdateSessionEntityTypeRequest\x1a\x32.google.cloud.dialogflow.v2beta1.SessionEntityType\"\x9c\x04\x82\xd3\xe4\x93\x02\xdd\x03\x32M/v2beta1/{session_entity_type.name=projects/*/agent/sessions/*/entityTypes/*}:\x13session_entity_typeZ{2d/v2beta1/{session_entity_type.name=projects/*/agent/environments/*/users/*/sessions/*/entityTypes/*}:\x13session_entity_typeZp2Y/v2beta1/{session_entity_type.name=projects/*/locations/*/agent/sessions/*/entityTypes/*}:\x13session_entity_typeZ\x87\x01\x32p/v2beta1/{session_entity_type.name=projects/*/locations/*/agent/environments/*/users/*/sessions/*/entityTypes/*}:\x13session_entity_type\xda\x41\x13session_entity_type\xda\x41\x1fsession_entity_type,update_mask\x12\xbb\x03\n\x17\x44\x65leteSessionEntityType\x12?.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest\x1a\x16.google.protobuf.Empty\"\xc6\x02\x82\xd3\xe4\x93\x02\xb8\x02*9/v2beta1/{name=projects/*/agent/sessions/*/entityTypes/*}ZR*P/v2beta1/{name=projects/*/agent/environments/*/users/*/sessions/*/entityTypes/*}ZG*E/v2beta1/{name=projects/*/locations/*/agent/sessions/*/entityTypes/*}Z^*\\/v2beta1/{name=projects/*/locations/*/agent/environments/*/users/*/sessions/*/entityTypes/*}\xda\x41\x04name\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\xb4\x01\n#com.google.cloud.dialogflow.v2beta1B\x16SessionEntityTypeProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1fGoogle.Cloud.Dialogflow.V2beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2beta1.session_entity_type_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.dialogflow.v2beta1B\026SessionEntityTypeProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1'
  _SESSIONENTITYTYPE._options = None
  _SESSIONENTITYTYPE._serialized_options = b'\352A\304\003\n+dialogflow.googleapis.com/SessionEntityType\022Eprojects/{project}/agent/sessions/{session}/entityTypes/{entity_type}\022Zprojects/{project}/locations/{location}/agent/sessions/{session}/entityTypes/{entity_type}\022mprojects/{project}/agent/environments/{environment}/users/{user}/sessions/{session}/entityTypes/{entity_type}\022\202\001projects/{project}/locations/{location}/agent/environments/{environment}/users/{user}/sessions/{session}/entityTypes/{entity_type}'
  _LISTSESSIONENTITYTYPESREQUEST.fields_by_name['parent']._options = None
  _LISTSESSIONENTITYTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\022+dialogflow.googleapis.com/SessionEntityType'
  _GETSESSIONENTITYTYPEREQUEST.fields_by_name['name']._options = None
  _GETSESSIONENTITYTYPEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A-\n+dialogflow.googleapis.com/SessionEntityType'
  _CREATESESSIONENTITYTYPEREQUEST.fields_by_name['parent']._options = None
  _CREATESESSIONENTITYTYPEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\022+dialogflow.googleapis.com/SessionEntityType'
  _CREATESESSIONENTITYTYPEREQUEST.fields_by_name['session_entity_type']._options = None
  _CREATESESSIONENTITYTYPEREQUEST.fields_by_name['session_entity_type']._serialized_options = b'\340A\002'
  _UPDATESESSIONENTITYTYPEREQUEST.fields_by_name['session_entity_type']._options = None
  _UPDATESESSIONENTITYTYPEREQUEST.fields_by_name['session_entity_type']._serialized_options = b'\340A\002'
  _DELETESESSIONENTITYTYPEREQUEST.fields_by_name['name']._options = None
  _DELETESESSIONENTITYTYPEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A-\n+dialogflow.googleapis.com/SessionEntityType'
  _SESSIONENTITYTYPES._options = None
  _SESSIONENTITYTYPES._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _SESSIONENTITYTYPES.methods_by_name['ListSessionEntityTypes']._options = None
  _SESSIONENTITYTYPES.methods_by_name['ListSessionEntityTypes']._serialized_options = b'\202\323\344\223\002\270\002\0229/v2beta1/{parent=projects/*/agent/sessions/*}/entityTypesZR\022P/v2beta1/{parent=projects/*/agent/environments/*/users/*/sessions/*}/entityTypesZG\022E/v2beta1/{parent=projects/*/locations/*/agent/sessions/*}/entityTypesZ^\022\\/v2beta1/{parent=projects/*/locations/*/agent/environments/*/users/*/sessions/*}/entityTypes\332A\006parent'
  _SESSIONENTITYTYPES.methods_by_name['GetSessionEntityType']._options = None
  _SESSIONENTITYTYPES.methods_by_name['GetSessionEntityType']._serialized_options = b'\202\323\344\223\002\270\002\0229/v2beta1/{name=projects/*/agent/sessions/*/entityTypes/*}ZR\022P/v2beta1/{name=projects/*/agent/environments/*/users/*/sessions/*/entityTypes/*}ZG\022E/v2beta1/{name=projects/*/locations/*/agent/sessions/*/entityTypes/*}Z^\022\\/v2beta1/{name=projects/*/locations/*/agent/environments/*/users/*/sessions/*/entityTypes/*}\332A\004name'
  _SESSIONENTITYTYPES.methods_by_name['CreateSessionEntityType']._options = None
  _SESSIONENTITYTYPES.methods_by_name['CreateSessionEntityType']._serialized_options = b'\202\323\344\223\002\214\003\"9/v2beta1/{parent=projects/*/agent/sessions/*}/entityTypes:\023session_entity_typeZg\"P/v2beta1/{parent=projects/*/agent/environments/*/users/*/sessions/*}/entityTypes:\023session_entity_typeZ\\\"E/v2beta1/{parent=projects/*/locations/*/agent/sessions/*}/entityTypes:\023session_entity_typeZs\"\\/v2beta1/{parent=projects/*/locations/*/agent/environments/*/users/*/sessions/*}/entityTypes:\023session_entity_type\332A\032parent,session_entity_type'
  _SESSIONENTITYTYPES.methods_by_name['UpdateSessionEntityType']._options = None
  _SESSIONENTITYTYPES.methods_by_name['UpdateSessionEntityType']._serialized_options = b'\202\323\344\223\002\335\0032M/v2beta1/{session_entity_type.name=projects/*/agent/sessions/*/entityTypes/*}:\023session_entity_typeZ{2d/v2beta1/{session_entity_type.name=projects/*/agent/environments/*/users/*/sessions/*/entityTypes/*}:\023session_entity_typeZp2Y/v2beta1/{session_entity_type.name=projects/*/locations/*/agent/sessions/*/entityTypes/*}:\023session_entity_typeZ\207\0012p/v2beta1/{session_entity_type.name=projects/*/locations/*/agent/environments/*/users/*/sessions/*/entityTypes/*}:\023session_entity_type\332A\023session_entity_type\332A\037session_entity_type,update_mask'
  _SESSIONENTITYTYPES.methods_by_name['DeleteSessionEntityType']._options = None
  _SESSIONENTITYTYPES.methods_by_name['DeleteSessionEntityType']._serialized_options = b'\202\323\344\223\002\270\002*9/v2beta1/{name=projects/*/agent/sessions/*/entityTypes/*}ZR*P/v2beta1/{name=projects/*/agent/environments/*/users/*/sessions/*/entityTypes/*}ZG*E/v2beta1/{name=projects/*/locations/*/agent/sessions/*/entityTypes/*}Z^*\\/v2beta1/{name=projects/*/locations/*/agent/environments/*/users/*/sessions/*/entityTypes/*}\332A\004name'
  _SESSIONENTITYTYPE._serialized_start=324
  _SESSIONENTITYTYPE._serialized_end=1120
  _SESSIONENTITYTYPE_ENTITYOVERRIDEMODE._serialized_start=531
  _SESSIONENTITYTYPE_ENTITYOVERRIDEMODE._serialized_end=661
  _LISTSESSIONENTITYTYPESREQUEST._serialized_start=1123
  _LISTSESSIONENTITYTYPESREQUEST._serialized_end=1262
  _LISTSESSIONENTITYTYPESRESPONSE._serialized_start=1265
  _LISTSESSIONENTITYTYPESRESPONSE._serialized_end=1404
  _GETSESSIONENTITYTYPEREQUEST._serialized_start=1406
  _GETSESSIONENTITYTYPEREQUEST._serialized_end=1502
  _CREATESESSIONENTITYTYPEREQUEST._serialized_start=1505
  _CREATESESSIONENTITYTYPEREQUEST._serialized_end=1692
  _UPDATESESSIONENTITYTYPEREQUEST._serialized_start=1695
  _UPDATESESSIONENTITYTYPEREQUEST._serialized_end=1862
  _DELETESESSIONENTITYTYPEREQUEST._serialized_start=1864
  _DELETESESSIONENTITYTYPEREQUEST._serialized_end=1963
  _SESSIONENTITYTYPES._serialized_start=1966
  _SESSIONENTITYTYPES._serialized_end=4777
# @@protoc_insertion_point(module_scope)
