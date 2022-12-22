# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/oslogin/common/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(google/cloud/oslogin/common/common.proto\x12\x1bgoogle.cloud.oslogin.common\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xdc\x02\n\x0cPosixAccount\x12\x0f\n\x07primary\x18\x01 \x01(\x08\x12\x10\n\x08username\x18\x02 \x01(\t\x12\x0b\n\x03uid\x18\x03 \x01(\x03\x12\x0b\n\x03gid\x18\x04 \x01(\x03\x12\x16\n\x0ehome_directory\x18\x05 \x01(\t\x12\r\n\x05shell\x18\x06 \x01(\t\x12\r\n\x05gecos\x18\x07 \x01(\t\x12\x11\n\tsystem_id\x18\x08 \x01(\t\x12\x17\n\naccount_id\x18\t \x01(\tB\x03\xe0\x41\x03\x12O\n\x15operating_system_type\x18\n \x01(\x0e\x32\x30.google.cloud.oslogin.common.OperatingSystemType\x12\x11\n\x04name\x18\x0b \x01(\tB\x03\xe0\x41\x03:I\xea\x41\x46\n#oslogin.googleapis.com/PosixAccount\x12\x1fusers/{user}/projects/{project}\"\xba\x01\n\x0cSshPublicKey\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x1c\n\x14\x65xpiration_time_usec\x18\x02 \x01(\x03\x12\x18\n\x0b\x66ingerprint\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04name\x18\x04 \x01(\tB\x03\xe0\x41\x03:R\xea\x41O\n#oslogin.googleapis.com/SshPublicKey\x12(users/{user}/sshPublicKeys/{fingerprint}*T\n\x13OperatingSystemType\x12%\n!OPERATING_SYSTEM_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05LINUX\x10\x01\x12\x0b\n\x07WINDOWS\x10\x02\x42\xfd\x01\n\x1f\x63om.google.cloud.oslogin.commonB\x0cOsLoginProtoZAgoogle.golang.org/genproto/googleapis/cloud/oslogin/common;common\xaa\x02\x1bGoogle.Cloud.OsLogin.Common\xca\x02\x1bGoogle\\Cloud\\OsLogin\\Common\xea\x02\x1eGoogle::Cloud::OsLogin::Common\xea\x41+\n\x1boslogin.googleapis.com/User\x12\x0cusers/{user}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.oslogin.common.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.oslogin.commonB\014OsLoginProtoZAgoogle.golang.org/genproto/googleapis/cloud/oslogin/common;common\252\002\033Google.Cloud.OsLogin.Common\312\002\033Google\\Cloud\\OsLogin\\Common\352\002\036Google::Cloud::OsLogin::Common\352A+\n\033oslogin.googleapis.com/User\022\014users/{user}'
  _POSIXACCOUNT.fields_by_name['account_id']._options = None
  _POSIXACCOUNT.fields_by_name['account_id']._serialized_options = b'\340A\003'
  _POSIXACCOUNT.fields_by_name['name']._options = None
  _POSIXACCOUNT.fields_by_name['name']._serialized_options = b'\340A\003'
  _POSIXACCOUNT._options = None
  _POSIXACCOUNT._serialized_options = b'\352AF\n#oslogin.googleapis.com/PosixAccount\022\037users/{user}/projects/{project}'
  _SSHPUBLICKEY.fields_by_name['fingerprint']._options = None
  _SSHPUBLICKEY.fields_by_name['fingerprint']._serialized_options = b'\340A\003'
  _SSHPUBLICKEY.fields_by_name['name']._options = None
  _SSHPUBLICKEY.fields_by_name['name']._serialized_options = b'\340A\003'
  _SSHPUBLICKEY._options = None
  _SSHPUBLICKEY._serialized_options = b'\352AO\n#oslogin.googleapis.com/SshPublicKey\022(users/{user}/sshPublicKeys/{fingerprint}'
  _OPERATINGSYSTEMTYPE._serialized_start=673
  _OPERATINGSYSTEMTYPE._serialized_end=757
  _POSIXACCOUNT._serialized_start=134
  _POSIXACCOUNT._serialized_end=482
  _SSHPUBLICKEY._serialized_start=485
  _SSHPUBLICKEY._serialized_end=671
# @@protoc_insertion_point(module_scope)