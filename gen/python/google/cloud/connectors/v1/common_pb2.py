# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/connectors/v1/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/cloud/connectors/v1/common.proto\x12\x1agoogle.cloud.connectors.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x80\x02\n\x11OperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1b\n\x0estatus_message\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12#\n\x16requested_cancellation\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\"\x96\x05\n\x16\x43onfigVariableTemplate\x12\x0b\n\x03key\x18\x01 \x01(\t\x12P\n\nvalue_type\x18\x02 \x01(\x0e\x32<.google.cloud.connectors.v1.ConfigVariableTemplate.ValueType\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x04 \x01(\t\x12\x18\n\x10validation_regex\x18\x05 \x01(\t\x12\x10\n\x08required\x18\x06 \x01(\x08\x12\x39\n\nrole_grant\x18\x07 \x01(\x0b\x32%.google.cloud.connectors.v1.RoleGrant\x12<\n\x0c\x65num_options\x18\x08 \x03(\x0b\x32&.google.cloud.connectors.v1.EnumOption\x12R\n\x17\x61uthorization_code_link\x18\t \x01(\x0b\x32\x31.google.cloud.connectors.v1.AuthorizationCodeLink\x12G\n\x05state\x18\n \x01(\x0e\x32\x38.google.cloud.connectors.v1.ConfigVariableTemplate.State\"t\n\tValueType\x12\x1a\n\x16VALUE_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06STRING\x10\x01\x12\x07\n\x03INT\x10\x02\x12\x08\n\x04\x42OOL\x10\x03\x12\n\n\x06SECRET\x10\x04\x12\x08\n\x04\x45NUM\x10\x05\x12\x16\n\x12\x41UTHORIZATION_CODE\x10\x06\":\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\x0e\n\nDEPRECATED\x10\x02\" \n\x06Secret\x12\x16\n\x0esecret_version\x18\x01 \x01(\t\".\n\nEnumOption\x12\n\n\x02id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\"\xa5\x01\n\x0e\x43onfigVariable\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x13\n\tint_value\x18\x02 \x01(\x03H\x00\x12\x14\n\nbool_value\x18\x03 \x01(\x08H\x00\x12\x16\n\x0cstring_value\x18\x04 \x01(\tH\x00\x12:\n\x0csecret_value\x18\x05 \x01(\x0b\x32\".google.cloud.connectors.v1.SecretH\x00\x42\x07\n\x05value\"\xe5\x03\n\tRoleGrant\x12\x42\n\tprincipal\x18\x01 \x01(\x0e\x32/.google.cloud.connectors.v1.RoleGrant.Principal\x12\r\n\x05roles\x18\x02 \x03(\t\x12@\n\x08resource\x18\x03 \x01(\x0b\x32..google.cloud.connectors.v1.RoleGrant.Resource\x12\x1c\n\x14helper_text_template\x18\x04 \x01(\t\x1a\xea\x01\n\x08Resource\x12\x41\n\x04type\x18\x01 \x01(\x0e\x32\x33.google.cloud.connectors.v1.RoleGrant.Resource.Type\x12\x15\n\rpath_template\x18\x03 \x01(\t\"\x83\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0f\n\x0bGCP_PROJECT\x10\x01\x12\x10\n\x0cGCP_RESOURCE\x10\x02\x12\x1c\n\x18GCP_SECRETMANAGER_SECRET\x10\x03\x12$\n GCP_SECRETMANAGER_SECRET_VERSION\x10\x04\"8\n\tPrincipal\x12\x19\n\x15PRINCIPAL_UNSPECIFIED\x10\x00\x12\x10\n\x0c\x43ONNECTOR_SA\x10\x01\"\\\n\x15\x41uthorizationCodeLink\x12\x0b\n\x03uri\x18\x01 \x01(\t\x12\x0e\n\x06scopes\x18\x02 \x03(\t\x12\x11\n\tclient_id\x18\x03 \x01(\t\x12\x13\n\x0b\x65nable_pkce\x18\x04 \x01(\x08*P\n\x0bLaunchStage\x12\x1c\n\x18LAUNCH_STAGE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PREVIEW\x10\x01\x12\x06\n\x02GA\x10\x02\x12\x0e\n\nDEPRECATED\x10\x03\x42u\n\x1e\x63om.google.cloud.connectors.v1B\x0b\x43ommonProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/connectors/v1;connectorsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.connectors.v1.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.connectors.v1B\013CommonProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/connectors/v1;connectors'
  _OPERATIONMETADATA.fields_by_name['create_time']._options = None
  _OPERATIONMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['end_time']._options = None
  _OPERATIONMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['target']._options = None
  _OPERATIONMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['verb']._options = None
  _OPERATIONMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['status_message']._options = None
  _OPERATIONMETADATA.fields_by_name['status_message']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._options = None
  _OPERATIONMETADATA.fields_by_name['requested_cancellation']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['api_version']._options = None
  _OPERATIONMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _LAUNCHSTAGE._serialized_start=1893
  _LAUNCHSTAGE._serialized_end=1973
  _OPERATIONMETADATA._serialized_start=138
  _OPERATIONMETADATA._serialized_end=394
  _CONFIGVARIABLETEMPLATE._serialized_start=397
  _CONFIGVARIABLETEMPLATE._serialized_end=1059
  _CONFIGVARIABLETEMPLATE_VALUETYPE._serialized_start=883
  _CONFIGVARIABLETEMPLATE_VALUETYPE._serialized_end=999
  _CONFIGVARIABLETEMPLATE_STATE._serialized_start=1001
  _CONFIGVARIABLETEMPLATE_STATE._serialized_end=1059
  _SECRET._serialized_start=1061
  _SECRET._serialized_end=1093
  _ENUMOPTION._serialized_start=1095
  _ENUMOPTION._serialized_end=1141
  _CONFIGVARIABLE._serialized_start=1144
  _CONFIGVARIABLE._serialized_end=1309
  _ROLEGRANT._serialized_start=1312
  _ROLEGRANT._serialized_end=1797
  _ROLEGRANT_RESOURCE._serialized_start=1505
  _ROLEGRANT_RESOURCE._serialized_end=1739
  _ROLEGRANT_RESOURCE_TYPE._serialized_start=1608
  _ROLEGRANT_RESOURCE_TYPE._serialized_end=1739
  _ROLEGRANT_PRINCIPAL._serialized_start=1741
  _ROLEGRANT_PRINCIPAL._serialized_end=1797
  _AUTHORIZATIONCODELINK._serialized_start=1799
  _AUTHORIZATIONCODELINK._serialized_end=1891
# @@protoc_insertion_point(module_scope)