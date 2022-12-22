# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/contentwarehouse/v1/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-google/cloud/contentwarehouse/v1/common.proto\x12 google.cloud.contentwarehouse.v1\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"P\n\x0fRequestMetadata\x12=\n\tuser_info\x18\x01 \x01(\x0b\x32*.google.cloud.contentwarehouse.v1.UserInfo\"&\n\x10ResponseMetadata\x12\x12\n\nrequest_id\x18\x01 \x01(\t\")\n\x08UserInfo\x12\n\n\x02id\x18\x01 \x01(\t\x12\x11\n\tgroup_ids\x18\x02 \x03(\t\"\xd7\x01\n\rUpdateOptions\x12\x41\n\x0bupdate_type\x18\x01 \x01(\x0e\x32,.google.cloud.contentwarehouse.v1.UpdateType\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12R\n\x14merge_fields_options\x18\x03 \x01(\x0b\x32\x34.google.cloud.contentwarehouse.v1.MergeFieldsOptions\"\x96\x01\n\x12MergeFieldsOptions\x12#\n\x16replace_message_fields\x18\x01 \x01(\x08H\x00\x88\x01\x01\x12$\n\x17replace_repeated_fields\x18\x02 \x01(\x08H\x01\x88\x01\x01\x42\x19\n\x17_replace_message_fieldsB\x1a\n\x18_replace_repeated_fields*\xde\x01\n\nUpdateType\x12\x1b\n\x17UPDATE_TYPE_UNSPECIFIED\x10\x00\x12\x17\n\x13UPDATE_TYPE_REPLACE\x10\x01\x12\x15\n\x11UPDATE_TYPE_MERGE\x10\x02\x12*\n&UPDATE_TYPE_INSERT_PROPERTIES_BY_NAMES\x10\x03\x12+\n\'UPDATE_TYPE_REPLACE_PROPERTIES_BY_NAMES\x10\x04\x12*\n&UPDATE_TYPE_DELETE_PROPERTIES_BY_NAMES\x10\x05*O\n\x0c\x44\x61tabaseType\x12\x0e\n\nDB_UNKNOWN\x10\x00\x12\x14\n\x10\x44\x42_INFRA_SPANNER\x10\x01\x12\x19\n\x15\x44\x42_CLOUD_SQL_POSTGRES\x10\x02*\xaa\x01\n\x11\x41\x63\x63\x65ssControlMode\x12\x14\n\x10\x41\x43L_MODE_UNKNOWN\x10\x00\x12\x1d\n\x19\x41\x43L_MODE_UNIVERSAL_ACCESS\x10\x01\x12\x30\n,ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_BYOID\x10\x02\x12.\n*ACL_MODE_DOCUMENT_LEVEL_ACCESS_CONTROL_GCI\x10\x03\x42\xdd\x01\n$com.google.cloud.contentwarehouse.v1B\x0b\x43ommonProtoP\x01ZPgoogle.golang.org/genproto/googleapis/cloud/contentwarehouse/v1;contentwarehouse\xea\x41S\n(contentwarehouse.googleapis.com/Location\x12\'projects/{project}/locations/{location}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.contentwarehouse.v1.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.cloud.contentwarehouse.v1B\013CommonProtoP\001ZPgoogle.golang.org/genproto/googleapis/cloud/contentwarehouse/v1;contentwarehouse\352AS\n(contentwarehouse.googleapis.com/Location\022\'projects/{project}/locations/{location}'
  _UPDATETYPE._serialized_start=681
  _UPDATETYPE._serialized_end=903
  _DATABASETYPE._serialized_start=905
  _DATABASETYPE._serialized_end=984
  _ACCESSCONTROLMODE._serialized_start=987
  _ACCESSCONTROLMODE._serialized_end=1157
  _REQUESTMETADATA._serialized_start=144
  _REQUESTMETADATA._serialized_end=224
  _RESPONSEMETADATA._serialized_start=226
  _RESPONSEMETADATA._serialized_end=264
  _USERINFO._serialized_start=266
  _USERINFO._serialized_end=307
  _UPDATEOPTIONS._serialized_start=310
  _UPDATEOPTIONS._serialized_end=525
  _MERGEFIELDSOPTIONS._serialized_start=528
  _MERGEFIELDSOPTIONS._serialized_end=678
# @@protoc_insertion_point(module_scope)