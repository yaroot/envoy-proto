# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/secrets/v1beta1/resources.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/secrets/v1beta1/resources.proto\x12\x1cgoogle.cloud.secrets.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd9\x02\n\x06Secret\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x46\n\x0breplication\x18\x02 \x01(\x0b\x32).google.cloud.secrets.v1beta1.ReplicationB\x06\xe0\x41\x05\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12@\n\x06labels\x18\x04 \x03(\x0b\x32\x30.google.cloud.secrets.v1beta1.Secret.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:M\xea\x41J\n#secretmanager.googleapis.com/Secret\x12#projects/{project}/secrets/{secret}\"\x90\x03\n\rSecretVersion\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x35\n\x0c\x64\x65stroy_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x45\n\x05state\x18\x04 \x01(\x0e\x32\x31.google.cloud.secrets.v1beta1.SecretVersion.StateB\x03\xe0\x41\x03\"H\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x45NABLED\x10\x01\x12\x0c\n\x08\x44ISABLED\x10\x02\x12\r\n\tDESTROYED\x10\x03:n\xea\x41k\n*secretmanager.googleapis.com/SecretVersion\x12=projects/{project}/secrets/{secret}/versions/{secret_version}\"\xc5\x02\n\x0bReplication\x12H\n\tautomatic\x18\x01 \x01(\x0b\x32\x33.google.cloud.secrets.v1beta1.Replication.AutomaticH\x00\x12M\n\x0cuser_managed\x18\x02 \x01(\x0b\x32\x35.google.cloud.secrets.v1beta1.Replication.UserManagedH\x00\x1a\x0b\n\tAutomatic\x1a\x80\x01\n\x0bUserManaged\x12T\n\x08replicas\x18\x01 \x03(\x0b\x32=.google.cloud.secrets.v1beta1.Replication.UserManaged.ReplicaB\x03\xe0\x41\x02\x1a\x1b\n\x07Replica\x12\x10\n\x08location\x18\x01 \x01(\tB\r\n\x0breplication\"\x1d\n\rSecretPayload\x12\x0c\n\x04\x64\x61ta\x18\x01 \x01(\x0c\x42\x86\x02\n&com.google.cloud.secretmanager.v1beta1B\x0eResourcesProtoP\x01ZOgoogle.golang.org/genproto/googleapis/cloud/secretmanager/v1beta1;secretmanager\xf8\x01\x01\xa2\x02\x03GSM\xaa\x02\"Google.Cloud.SecretManager.V1Beta1\xca\x02\"Google\\Cloud\\SecretManager\\V1beta1\xea\x02%Google::Cloud::SecretManager::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.secrets.v1beta1.resources_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.cloud.secretmanager.v1beta1B\016ResourcesProtoP\001ZOgoogle.golang.org/genproto/googleapis/cloud/secretmanager/v1beta1;secretmanager\370\001\001\242\002\003GSM\252\002\"Google.Cloud.SecretManager.V1Beta1\312\002\"Google\\Cloud\\SecretManager\\V1beta1\352\002%Google::Cloud::SecretManager::V1beta1'
  _SECRET_LABELSENTRY._options = None
  _SECRET_LABELSENTRY._serialized_options = b'8\001'
  _SECRET.fields_by_name['name']._options = None
  _SECRET.fields_by_name['name']._serialized_options = b'\340A\003'
  _SECRET.fields_by_name['replication']._options = None
  _SECRET.fields_by_name['replication']._serialized_options = b'\340A\005\340A\002'
  _SECRET.fields_by_name['create_time']._options = None
  _SECRET.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _SECRET._options = None
  _SECRET._serialized_options = b'\352AJ\n#secretmanager.googleapis.com/Secret\022#projects/{project}/secrets/{secret}'
  _SECRETVERSION.fields_by_name['name']._options = None
  _SECRETVERSION.fields_by_name['name']._serialized_options = b'\340A\003'
  _SECRETVERSION.fields_by_name['create_time']._options = None
  _SECRETVERSION.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _SECRETVERSION.fields_by_name['destroy_time']._options = None
  _SECRETVERSION.fields_by_name['destroy_time']._serialized_options = b'\340A\003'
  _SECRETVERSION.fields_by_name['state']._options = None
  _SECRETVERSION.fields_by_name['state']._serialized_options = b'\340A\003'
  _SECRETVERSION._options = None
  _SECRETVERSION._serialized_options = b'\352Ak\n*secretmanager.googleapis.com/SecretVersion\022=projects/{project}/secrets/{secret}/versions/{secret_version}'
  _REPLICATION_USERMANAGED.fields_by_name['replicas']._options = None
  _REPLICATION_USERMANAGED.fields_by_name['replicas']._serialized_options = b'\340A\002'
  _SECRET._serialized_start=172
  _SECRET._serialized_end=517
  _SECRET_LABELSENTRY._serialized_start=393
  _SECRET_LABELSENTRY._serialized_end=438
  _SECRETVERSION._serialized_start=520
  _SECRETVERSION._serialized_end=920
  _SECRETVERSION_STATE._serialized_start=736
  _SECRETVERSION_STATE._serialized_end=808
  _REPLICATION._serialized_start=923
  _REPLICATION._serialized_end=1248
  _REPLICATION_AUTOMATIC._serialized_start=1091
  _REPLICATION_AUTOMATIC._serialized_end=1102
  _REPLICATION_USERMANAGED._serialized_start=1105
  _REPLICATION_USERMANAGED._serialized_end=1233
  _REPLICATION_USERMANAGED_REPLICA._serialized_start=1206
  _REPLICATION_USERMANAGED_REPLICA._serialized_end=1233
  _SECRETPAYLOAD._serialized_start=1250
  _SECRETPAYLOAD._serialized_end=1279
# @@protoc_insertion_point(module_scope)
