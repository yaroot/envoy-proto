# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/identity/accesscontextmanager/v1/access_level.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.identity.accesscontextmanager.type import device_resources_pb2 as google_dot_identity_dot_accesscontextmanager_dot_type_dot_device__resources__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import expr_pb2 as google_dot_type_dot_expr__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:google/identity/accesscontextmanager/v1/access_level.proto\x12\'google.identity.accesscontextmanager.v1\x1a\x19google/api/resource.proto\x1a@google/identity/accesscontextmanager/type/device_resources.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x16google/type/expr.proto\"\xaa\x03\n\x0b\x41\x63\x63\x65ssLevel\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\r\n\x05title\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x44\n\x05\x62\x61sic\x18\x04 \x01(\x0b\x32\x33.google.identity.accesscontextmanager.v1.BasicLevelH\x00\x12\x46\n\x06\x63ustom\x18\x05 \x01(\x0b\x32\x34.google.identity.accesscontextmanager.v1.CustomLevelH\x00\x12/\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp:p\xea\x41m\n/accesscontextmanager.googleapis.com/AccessLevel\x12:accessPolicies/{access_policy}/accessLevels/{access_level}B\x07\n\x05level\"\xef\x01\n\nBasicLevel\x12\x46\n\nconditions\x18\x01 \x03(\x0b\x32\x32.google.identity.accesscontextmanager.v1.Condition\x12j\n\x12\x63ombining_function\x18\x02 \x01(\x0e\x32N.google.identity.accesscontextmanager.v1.BasicLevel.ConditionCombiningFunction\"-\n\x1a\x43onditionCombiningFunction\x12\x07\n\x03\x41ND\x10\x00\x12\x06\n\x02OR\x10\x01\"\xc3\x01\n\tCondition\x12\x16\n\x0eip_subnetworks\x18\x01 \x03(\t\x12L\n\rdevice_policy\x18\x02 \x01(\x0b\x32\x35.google.identity.accesscontextmanager.v1.DevicePolicy\x12\x1e\n\x16required_access_levels\x18\x03 \x03(\t\x12\x0e\n\x06negate\x18\x05 \x01(\x08\x12\x0f\n\x07members\x18\x06 \x03(\t\x12\x0f\n\x07regions\x18\x07 \x03(\t\".\n\x0b\x43ustomLevel\x12\x1f\n\x04\x65xpr\x18\x01 \x01(\x0b\x32\x11.google.type.Expr\"\x89\x03\n\x0c\x44\x65vicePolicy\x12\x1a\n\x12require_screenlock\x18\x01 \x01(\x08\x12\x66\n\x1b\x61llowed_encryption_statuses\x18\x02 \x03(\x0e\x32\x41.google.identity.accesscontextmanager.type.DeviceEncryptionStatus\x12M\n\x0eos_constraints\x18\x03 \x03(\x0b\x32\x35.google.identity.accesscontextmanager.v1.OsConstraint\x12j\n allowed_device_management_levels\x18\x06 \x03(\x0e\x32@.google.identity.accesscontextmanager.type.DeviceManagementLevel\x12\x1e\n\x16require_admin_approval\x18\x07 \x01(\x08\x12\x1a\n\x12require_corp_owned\x18\x08 \x01(\x08\"\x8f\x01\n\x0cOsConstraint\x12\x42\n\x07os_type\x18\x01 \x01(\x0e\x32\x31.google.identity.accesscontextmanager.type.OsType\x12\x17\n\x0fminimum_version\x18\x02 \x01(\t\x12\"\n\x1arequire_verified_chrome_os\x18\x03 \x01(\x08\x42\xa6\x02\n+com.google.identity.accesscontextmanager.v1B\x10\x41\x63\x63\x65ssLevelProtoP\x01Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\xa2\x02\x04GACM\xaa\x02\'Google.Identity.AccessContextManager.V1\xca\x02\'Google\\Identity\\AccessContextManager\\V1\xea\x02*Google::Identity::AccessContextManager::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.identity.accesscontextmanager.v1.access_level_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n+com.google.identity.accesscontextmanager.v1B\020AccessLevelProtoP\001Z[google.golang.org/genproto/googleapis/identity/accesscontextmanager/v1;accesscontextmanager\242\002\004GACM\252\002\'Google.Identity.AccessContextManager.V1\312\002\'Google\\Identity\\AccessContextManager\\V1\352\002*Google::Identity::AccessContextManager::V1'
  _ACCESSLEVEL._options = None
  _ACCESSLEVEL._serialized_options = b'\352Am\n/accesscontextmanager.googleapis.com/AccessLevel\022:accessPolicies/{access_policy}/accessLevels/{access_level}'
  _ACCESSLEVEL._serialized_start=254
  _ACCESSLEVEL._serialized_end=680
  _BASICLEVEL._serialized_start=683
  _BASICLEVEL._serialized_end=922
  _BASICLEVEL_CONDITIONCOMBININGFUNCTION._serialized_start=877
  _BASICLEVEL_CONDITIONCOMBININGFUNCTION._serialized_end=922
  _CONDITION._serialized_start=925
  _CONDITION._serialized_end=1120
  _CUSTOMLEVEL._serialized_start=1122
  _CUSTOMLEVEL._serialized_end=1168
  _DEVICEPOLICY._serialized_start=1171
  _DEVICEPOLICY._serialized_end=1564
  _OSCONSTRAINT._serialized_start=1567
  _OSCONSTRAINT._serialized_end=1710
# @@protoc_insertion_point(module_scope)