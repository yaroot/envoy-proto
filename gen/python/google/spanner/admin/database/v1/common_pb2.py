# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/admin/database/v1/common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-google/spanner/admin/database/v1/common.proto\x12 google.spanner.admin.database.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x8b\x01\n\x11OperationProgress\x12\x18\n\x10progress_percent\x18\x01 \x01(\x05\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"P\n\x10\x45ncryptionConfig\x12<\n\x0ckms_key_name\x18\x02 \x01(\tB&\xfa\x41#\n!cloudkms.googleapis.com/CryptoKey\"\xc2\x02\n\x0e\x45ncryptionInfo\x12S\n\x0f\x65ncryption_type\x18\x03 \x01(\x0e\x32\x35.google.spanner.admin.database.v1.EncryptionInfo.TypeB\x03\xe0\x41\x03\x12\x32\n\x11\x65ncryption_status\x18\x04 \x01(\x0b\x32\x12.google.rpc.StatusB\x03\xe0\x41\x03\x12I\n\x0fkms_key_version\x18\x02 \x01(\tB0\xe0\x41\x03\xfa\x41*\n(cloudkms.googleapis.com/CryptoKeyVersion\"\\\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x1d\n\x19GOOGLE_DEFAULT_ENCRYPTION\x10\x01\x12\x1f\n\x1b\x43USTOMER_MANAGED_ENCRYPTION\x10\x02*\\\n\x0f\x44\x61tabaseDialect\x12 \n\x1c\x44\x41TABASE_DIALECT_UNSPECIFIED\x10\x00\x12\x17\n\x13GOOGLE_STANDARD_SQL\x10\x01\x12\x0e\n\nPOSTGRESQL\x10\x02\x42\xa4\x04\n$com.google.spanner.admin.database.v1B\x0b\x43ommonProtoP\x01ZHgoogle.golang.org/genproto/googleapis/spanner/admin/database/v1;database\xaa\x02&Google.Cloud.Spanner.Admin.Database.V1\xca\x02&Google\\Cloud\\Spanner\\Admin\\Database\\V1\xea\x02+Google::Cloud::Spanner::Admin::Database::V1\xea\x41x\n!cloudkms.googleapis.com/CryptoKey\x12Sprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}\xea\x41\xa6\x01\n(cloudkms.googleapis.com/CryptoKeyVersion\x12zprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.spanner.admin.database.v1.common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.spanner.admin.database.v1B\013CommonProtoP\001ZHgoogle.golang.org/genproto/googleapis/spanner/admin/database/v1;database\252\002&Google.Cloud.Spanner.Admin.Database.V1\312\002&Google\\Cloud\\Spanner\\Admin\\Database\\V1\352\002+Google::Cloud::Spanner::Admin::Database::V1\352Ax\n!cloudkms.googleapis.com/CryptoKey\022Sprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}\352A\246\001\n(cloudkms.googleapis.com/CryptoKeyVersion\022zprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}'
  _ENCRYPTIONCONFIG.fields_by_name['kms_key_name']._options = None
  _ENCRYPTIONCONFIG.fields_by_name['kms_key_name']._serialized_options = b'\372A#\n!cloudkms.googleapis.com/CryptoKey'
  _ENCRYPTIONINFO.fields_by_name['encryption_type']._options = None
  _ENCRYPTIONINFO.fields_by_name['encryption_type']._serialized_options = b'\340A\003'
  _ENCRYPTIONINFO.fields_by_name['encryption_status']._options = None
  _ENCRYPTIONINFO.fields_by_name['encryption_status']._serialized_options = b'\340A\003'
  _ENCRYPTIONINFO.fields_by_name['kms_key_version']._options = None
  _ENCRYPTIONINFO.fields_by_name['kms_key_version']._serialized_options = b'\340A\003\372A*\n(cloudkms.googleapis.com/CryptoKeyVersion'
  _DATABASEDIALECT._serialized_start=750
  _DATABASEDIALECT._serialized_end=842
  _OPERATIONPROGRESS._serialized_start=202
  _OPERATIONPROGRESS._serialized_end=341
  _ENCRYPTIONCONFIG._serialized_start=343
  _ENCRYPTIONCONFIG._serialized_end=423
  _ENCRYPTIONINFO._serialized_start=426
  _ENCRYPTIONINFO._serialized_end=748
  _ENCRYPTIONINFO_TYPE._serialized_start=656
  _ENCRYPTIONINFO_TYPE._serialized_end=748
# @@protoc_insertion_point(module_scope)