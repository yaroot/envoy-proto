# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/secretmanager/v1/resources.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/secretmanager/v1/resources.proto',
  package='google.cloud.secretmanager.v1',
  syntax='proto3',
  serialized_options=b'\n!com.google.cloud.secretmanager.v1B\016ResourcesProtoP\001ZJgoogle.golang.org/genproto/googleapis/cloud/secretmanager/v1;secretmanager\370\001\001\242\002\003GSM\252\002\035Google.Cloud.SecretManager.V1\312\002\035Google\\Cloud\\SecretManager\\V1\352\002 Google::Cloud::SecretManager::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-google/cloud/secretmanager/v1/resources.proto\x12\x1dgoogle.cloud.secretmanager.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xdb\x02\n\x06Secret\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12G\n\x0breplication\x18\x02 \x01(\x0b\x32*.google.cloud.secretmanager.v1.ReplicationB\x06\xe0\x41\x05\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x41\n\x06labels\x18\x04 \x03(\x0b\x32\x31.google.cloud.secretmanager.v1.Secret.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:M\xea\x41J\n#secretmanager.googleapis.com/Secret\x12#projects/{project}/secrets/{secret}\"\xdf\x03\n\rSecretVersion\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x35\n\x0c\x64\x65stroy_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x46\n\x05state\x18\x04 \x01(\x0e\x32\x32.google.cloud.secretmanager.v1.SecretVersion.StateB\x03\xe0\x41\x03\x12L\n\x12replication_status\x18\x05 \x01(\x0b\x32\x30.google.cloud.secretmanager.v1.ReplicationStatus\"H\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x45NABLED\x10\x01\x12\x0c\n\x08\x44ISABLED\x10\x02\x12\r\n\tDESTROYED\x10\x03:n\xea\x41k\n*secretmanager.googleapis.com/SecretVersion\x12=projects/{project}/secrets/{secret}/versions/{secret_version}\"\x90\x04\n\x0bReplication\x12I\n\tautomatic\x18\x01 \x01(\x0b\x32\x34.google.cloud.secretmanager.v1.Replication.AutomaticH\x00\x12N\n\x0cuser_managed\x18\x02 \x01(\x0b\x32\x36.google.cloud.secretmanager.v1.Replication.UserManagedH\x00\x1ao\n\tAutomatic\x12\x62\n\x1b\x63ustomer_managed_encryption\x18\x01 \x01(\x0b\x32\x38.google.cloud.secretmanager.v1.CustomerManagedEncryptionB\x03\xe0\x41\x01\x1a\xe5\x01\n\x0bUserManaged\x12U\n\x08replicas\x18\x01 \x03(\x0b\x32>.google.cloud.secretmanager.v1.Replication.UserManaged.ReplicaB\x03\xe0\x41\x02\x1a\x7f\n\x07Replica\x12\x10\n\x08location\x18\x01 \x01(\t\x12\x62\n\x1b\x63ustomer_managed_encryption\x18\x02 \x01(\x0b\x32\x38.google.cloud.secretmanager.v1.CustomerManagedEncryptionB\x03\xe0\x41\x01\x42\r\n\x0breplication\"6\n\x19\x43ustomerManagedEncryption\x12\x19\n\x0ckms_key_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\xeb\x04\n\x11ReplicationStatus\x12U\n\tautomatic\x18\x01 \x01(\x0b\x32@.google.cloud.secretmanager.v1.ReplicationStatus.AutomaticStatusH\x00\x12Z\n\x0cuser_managed\x18\x02 \x01(\x0b\x32\x42.google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatusH\x00\x1a{\n\x0f\x41utomaticStatus\x12h\n\x1b\x63ustomer_managed_encryption\x18\x01 \x01(\x0b\x32>.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatusB\x03\xe0\x41\x03\x1a\x8f\x02\n\x11UserManagedStatus\x12g\n\x08replicas\x18\x01 \x03(\x0b\x32P.google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus.ReplicaStatusB\x03\xe0\x41\x03\x1a\x90\x01\n\rReplicaStatus\x12\x15\n\x08location\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12h\n\x1b\x63ustomer_managed_encryption\x18\x02 \x01(\x0b\x32>.google.cloud.secretmanager.v1.CustomerManagedEncryptionStatusB\x03\xe0\x41\x03\x42\x14\n\x12replication_status\"D\n\x1f\x43ustomerManagedEncryptionStatus\x12!\n\x14kms_key_version_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\x1d\n\rSecretPayload\x12\x0c\n\x04\x64\x61ta\x18\x01 \x01(\x0c\x42\xed\x01\n!com.google.cloud.secretmanager.v1B\x0eResourcesProtoP\x01ZJgoogle.golang.org/genproto/googleapis/cloud/secretmanager/v1;secretmanager\xf8\x01\x01\xa2\x02\x03GSM\xaa\x02\x1dGoogle.Cloud.SecretManager.V1\xca\x02\x1dGoogle\\Cloud\\SecretManager\\V1\xea\x02 Google::Cloud::SecretManager::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_SECRETVERSION_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.secretmanager.v1.SecretVersion.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENABLED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DISABLED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DESTROYED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=849,
  serialized_end=921,
)
_sym_db.RegisterEnumDescriptor(_SECRETVERSION_STATE)


_SECRET_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.secretmanager.v1.Secret.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.secretmanager.v1.Secret.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.secretmanager.v1.Secret.LabelsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=427,
  serialized_end=472,
)

_SECRET = _descriptor.Descriptor(
  name='Secret',
  full_name='google.cloud.secretmanager.v1.Secret',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.secretmanager.v1.Secret.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='replication', full_name='google.cloud.secretmanager.v1.Secret.replication', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.secretmanager.v1.Secret.create_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.secretmanager.v1.Secret.labels', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_SECRET_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352AJ\n#secretmanager.googleapis.com/Secret\022#projects/{project}/secrets/{secret}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=204,
  serialized_end=551,
)


_SECRETVERSION = _descriptor.Descriptor(
  name='SecretVersion',
  full_name='google.cloud.secretmanager.v1.SecretVersion',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.secretmanager.v1.SecretVersion.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.secretmanager.v1.SecretVersion.create_time', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='destroy_time', full_name='google.cloud.secretmanager.v1.SecretVersion.destroy_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.secretmanager.v1.SecretVersion.state', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='replication_status', full_name='google.cloud.secretmanager.v1.SecretVersion.replication_status', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _SECRETVERSION_STATE,
  ],
  serialized_options=b'\352Ak\n*secretmanager.googleapis.com/SecretVersion\022=projects/{project}/secrets/{secret}/versions/{secret_version}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=554,
  serialized_end=1033,
)


_REPLICATION_AUTOMATIC = _descriptor.Descriptor(
  name='Automatic',
  full_name='google.cloud.secretmanager.v1.Replication.Automatic',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_managed_encryption', full_name='google.cloud.secretmanager.v1.Replication.Automatic.customer_managed_encryption', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1206,
  serialized_end=1317,
)

_REPLICATION_USERMANAGED_REPLICA = _descriptor.Descriptor(
  name='Replica',
  full_name='google.cloud.secretmanager.v1.Replication.UserManaged.Replica',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='location', full_name='google.cloud.secretmanager.v1.Replication.UserManaged.Replica.location', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='customer_managed_encryption', full_name='google.cloud.secretmanager.v1.Replication.UserManaged.Replica.customer_managed_encryption', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1422,
  serialized_end=1549,
)

_REPLICATION_USERMANAGED = _descriptor.Descriptor(
  name='UserManaged',
  full_name='google.cloud.secretmanager.v1.Replication.UserManaged',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='replicas', full_name='google.cloud.secretmanager.v1.Replication.UserManaged.replicas', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_REPLICATION_USERMANAGED_REPLICA, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1320,
  serialized_end=1549,
)

_REPLICATION = _descriptor.Descriptor(
  name='Replication',
  full_name='google.cloud.secretmanager.v1.Replication',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='automatic', full_name='google.cloud.secretmanager.v1.Replication.automatic', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_managed', full_name='google.cloud.secretmanager.v1.Replication.user_managed', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_REPLICATION_AUTOMATIC, _REPLICATION_USERMANAGED, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='replication', full_name='google.cloud.secretmanager.v1.Replication.replication',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1036,
  serialized_end=1564,
)


_CUSTOMERMANAGEDENCRYPTION = _descriptor.Descriptor(
  name='CustomerManagedEncryption',
  full_name='google.cloud.secretmanager.v1.CustomerManagedEncryption',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='kms_key_name', full_name='google.cloud.secretmanager.v1.CustomerManagedEncryption.kms_key_name', index=0,
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
  serialized_start=1566,
  serialized_end=1620,
)


_REPLICATIONSTATUS_AUTOMATICSTATUS = _descriptor.Descriptor(
  name='AutomaticStatus',
  full_name='google.cloud.secretmanager.v1.ReplicationStatus.AutomaticStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='customer_managed_encryption', full_name='google.cloud.secretmanager.v1.ReplicationStatus.AutomaticStatus.customer_managed_encryption', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1823,
  serialized_end=1946,
)

_REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS = _descriptor.Descriptor(
  name='ReplicaStatus',
  full_name='google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus.ReplicaStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='location', full_name='google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus.ReplicaStatus.location', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='customer_managed_encryption', full_name='google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus.ReplicaStatus.customer_managed_encryption', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=2076,
  serialized_end=2220,
)

_REPLICATIONSTATUS_USERMANAGEDSTATUS = _descriptor.Descriptor(
  name='UserManagedStatus',
  full_name='google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='replicas', full_name='google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus.replicas', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1949,
  serialized_end=2220,
)

_REPLICATIONSTATUS = _descriptor.Descriptor(
  name='ReplicationStatus',
  full_name='google.cloud.secretmanager.v1.ReplicationStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='automatic', full_name='google.cloud.secretmanager.v1.ReplicationStatus.automatic', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_managed', full_name='google.cloud.secretmanager.v1.ReplicationStatus.user_managed', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_REPLICATIONSTATUS_AUTOMATICSTATUS, _REPLICATIONSTATUS_USERMANAGEDSTATUS, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='replication_status', full_name='google.cloud.secretmanager.v1.ReplicationStatus.replication_status',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1623,
  serialized_end=2242,
)


_CUSTOMERMANAGEDENCRYPTIONSTATUS = _descriptor.Descriptor(
  name='CustomerManagedEncryptionStatus',
  full_name='google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='kms_key_version_name', full_name='google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus.kms_key_version_name', index=0,
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
  serialized_start=2244,
  serialized_end=2312,
)


_SECRETPAYLOAD = _descriptor.Descriptor(
  name='SecretPayload',
  full_name='google.cloud.secretmanager.v1.SecretPayload',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='data', full_name='google.cloud.secretmanager.v1.SecretPayload.data', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
  serialized_start=2314,
  serialized_end=2343,
)

_SECRET_LABELSENTRY.containing_type = _SECRET
_SECRET.fields_by_name['replication'].message_type = _REPLICATION
_SECRET.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_SECRET.fields_by_name['labels'].message_type = _SECRET_LABELSENTRY
_SECRETVERSION.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_SECRETVERSION.fields_by_name['destroy_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_SECRETVERSION.fields_by_name['state'].enum_type = _SECRETVERSION_STATE
_SECRETVERSION.fields_by_name['replication_status'].message_type = _REPLICATIONSTATUS
_SECRETVERSION_STATE.containing_type = _SECRETVERSION
_REPLICATION_AUTOMATIC.fields_by_name['customer_managed_encryption'].message_type = _CUSTOMERMANAGEDENCRYPTION
_REPLICATION_AUTOMATIC.containing_type = _REPLICATION
_REPLICATION_USERMANAGED_REPLICA.fields_by_name['customer_managed_encryption'].message_type = _CUSTOMERMANAGEDENCRYPTION
_REPLICATION_USERMANAGED_REPLICA.containing_type = _REPLICATION_USERMANAGED
_REPLICATION_USERMANAGED.fields_by_name['replicas'].message_type = _REPLICATION_USERMANAGED_REPLICA
_REPLICATION_USERMANAGED.containing_type = _REPLICATION
_REPLICATION.fields_by_name['automatic'].message_type = _REPLICATION_AUTOMATIC
_REPLICATION.fields_by_name['user_managed'].message_type = _REPLICATION_USERMANAGED
_REPLICATION.oneofs_by_name['replication'].fields.append(
  _REPLICATION.fields_by_name['automatic'])
_REPLICATION.fields_by_name['automatic'].containing_oneof = _REPLICATION.oneofs_by_name['replication']
_REPLICATION.oneofs_by_name['replication'].fields.append(
  _REPLICATION.fields_by_name['user_managed'])
_REPLICATION.fields_by_name['user_managed'].containing_oneof = _REPLICATION.oneofs_by_name['replication']
_REPLICATIONSTATUS_AUTOMATICSTATUS.fields_by_name['customer_managed_encryption'].message_type = _CUSTOMERMANAGEDENCRYPTIONSTATUS
_REPLICATIONSTATUS_AUTOMATICSTATUS.containing_type = _REPLICATIONSTATUS
_REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS.fields_by_name['customer_managed_encryption'].message_type = _CUSTOMERMANAGEDENCRYPTIONSTATUS
_REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS.containing_type = _REPLICATIONSTATUS_USERMANAGEDSTATUS
_REPLICATIONSTATUS_USERMANAGEDSTATUS.fields_by_name['replicas'].message_type = _REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS
_REPLICATIONSTATUS_USERMANAGEDSTATUS.containing_type = _REPLICATIONSTATUS
_REPLICATIONSTATUS.fields_by_name['automatic'].message_type = _REPLICATIONSTATUS_AUTOMATICSTATUS
_REPLICATIONSTATUS.fields_by_name['user_managed'].message_type = _REPLICATIONSTATUS_USERMANAGEDSTATUS
_REPLICATIONSTATUS.oneofs_by_name['replication_status'].fields.append(
  _REPLICATIONSTATUS.fields_by_name['automatic'])
_REPLICATIONSTATUS.fields_by_name['automatic'].containing_oneof = _REPLICATIONSTATUS.oneofs_by_name['replication_status']
_REPLICATIONSTATUS.oneofs_by_name['replication_status'].fields.append(
  _REPLICATIONSTATUS.fields_by_name['user_managed'])
_REPLICATIONSTATUS.fields_by_name['user_managed'].containing_oneof = _REPLICATIONSTATUS.oneofs_by_name['replication_status']
DESCRIPTOR.message_types_by_name['Secret'] = _SECRET
DESCRIPTOR.message_types_by_name['SecretVersion'] = _SECRETVERSION
DESCRIPTOR.message_types_by_name['Replication'] = _REPLICATION
DESCRIPTOR.message_types_by_name['CustomerManagedEncryption'] = _CUSTOMERMANAGEDENCRYPTION
DESCRIPTOR.message_types_by_name['ReplicationStatus'] = _REPLICATIONSTATUS
DESCRIPTOR.message_types_by_name['CustomerManagedEncryptionStatus'] = _CUSTOMERMANAGEDENCRYPTIONSTATUS
DESCRIPTOR.message_types_by_name['SecretPayload'] = _SECRETPAYLOAD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Secret = _reflection.GeneratedProtocolMessageType('Secret', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _SECRET_LABELSENTRY,
    '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.Secret.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _SECRET,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.Secret)
  })
_sym_db.RegisterMessage(Secret)
_sym_db.RegisterMessage(Secret.LabelsEntry)

SecretVersion = _reflection.GeneratedProtocolMessageType('SecretVersion', (_message.Message,), {
  'DESCRIPTOR' : _SECRETVERSION,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.SecretVersion)
  })
_sym_db.RegisterMessage(SecretVersion)

Replication = _reflection.GeneratedProtocolMessageType('Replication', (_message.Message,), {

  'Automatic' : _reflection.GeneratedProtocolMessageType('Automatic', (_message.Message,), {
    'DESCRIPTOR' : _REPLICATION_AUTOMATIC,
    '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.Replication.Automatic)
    })
  ,

  'UserManaged' : _reflection.GeneratedProtocolMessageType('UserManaged', (_message.Message,), {

    'Replica' : _reflection.GeneratedProtocolMessageType('Replica', (_message.Message,), {
      'DESCRIPTOR' : _REPLICATION_USERMANAGED_REPLICA,
      '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
      # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.Replication.UserManaged.Replica)
      })
    ,
    'DESCRIPTOR' : _REPLICATION_USERMANAGED,
    '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.Replication.UserManaged)
    })
  ,
  'DESCRIPTOR' : _REPLICATION,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.Replication)
  })
_sym_db.RegisterMessage(Replication)
_sym_db.RegisterMessage(Replication.Automatic)
_sym_db.RegisterMessage(Replication.UserManaged)
_sym_db.RegisterMessage(Replication.UserManaged.Replica)

CustomerManagedEncryption = _reflection.GeneratedProtocolMessageType('CustomerManagedEncryption', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMERMANAGEDENCRYPTION,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.CustomerManagedEncryption)
  })
_sym_db.RegisterMessage(CustomerManagedEncryption)

ReplicationStatus = _reflection.GeneratedProtocolMessageType('ReplicationStatus', (_message.Message,), {

  'AutomaticStatus' : _reflection.GeneratedProtocolMessageType('AutomaticStatus', (_message.Message,), {
    'DESCRIPTOR' : _REPLICATIONSTATUS_AUTOMATICSTATUS,
    '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.ReplicationStatus.AutomaticStatus)
    })
  ,

  'UserManagedStatus' : _reflection.GeneratedProtocolMessageType('UserManagedStatus', (_message.Message,), {

    'ReplicaStatus' : _reflection.GeneratedProtocolMessageType('ReplicaStatus', (_message.Message,), {
      'DESCRIPTOR' : _REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS,
      '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
      # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus.ReplicaStatus)
      })
    ,
    'DESCRIPTOR' : _REPLICATIONSTATUS_USERMANAGEDSTATUS,
    '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.ReplicationStatus.UserManagedStatus)
    })
  ,
  'DESCRIPTOR' : _REPLICATIONSTATUS,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.ReplicationStatus)
  })
_sym_db.RegisterMessage(ReplicationStatus)
_sym_db.RegisterMessage(ReplicationStatus.AutomaticStatus)
_sym_db.RegisterMessage(ReplicationStatus.UserManagedStatus)
_sym_db.RegisterMessage(ReplicationStatus.UserManagedStatus.ReplicaStatus)

CustomerManagedEncryptionStatus = _reflection.GeneratedProtocolMessageType('CustomerManagedEncryptionStatus', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMERMANAGEDENCRYPTIONSTATUS,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.CustomerManagedEncryptionStatus)
  })
_sym_db.RegisterMessage(CustomerManagedEncryptionStatus)

SecretPayload = _reflection.GeneratedProtocolMessageType('SecretPayload', (_message.Message,), {
  'DESCRIPTOR' : _SECRETPAYLOAD,
  '__module__' : 'google.cloud.secretmanager.v1.resources_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.secretmanager.v1.SecretPayload)
  })
_sym_db.RegisterMessage(SecretPayload)


DESCRIPTOR._options = None
_SECRET_LABELSENTRY._options = None
_SECRET.fields_by_name['name']._options = None
_SECRET.fields_by_name['replication']._options = None
_SECRET.fields_by_name['create_time']._options = None
_SECRET._options = None
_SECRETVERSION.fields_by_name['name']._options = None
_SECRETVERSION.fields_by_name['create_time']._options = None
_SECRETVERSION.fields_by_name['destroy_time']._options = None
_SECRETVERSION.fields_by_name['state']._options = None
_SECRETVERSION._options = None
_REPLICATION_AUTOMATIC.fields_by_name['customer_managed_encryption']._options = None
_REPLICATION_USERMANAGED_REPLICA.fields_by_name['customer_managed_encryption']._options = None
_REPLICATION_USERMANAGED.fields_by_name['replicas']._options = None
_CUSTOMERMANAGEDENCRYPTION.fields_by_name['kms_key_name']._options = None
_REPLICATIONSTATUS_AUTOMATICSTATUS.fields_by_name['customer_managed_encryption']._options = None
_REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS.fields_by_name['location']._options = None
_REPLICATIONSTATUS_USERMANAGEDSTATUS_REPLICASTATUS.fields_by_name['customer_managed_encryption']._options = None
_REPLICATIONSTATUS_USERMANAGEDSTATUS.fields_by_name['replicas']._options = None
_CUSTOMERMANAGEDENCRYPTIONSTATUS.fields_by_name['kms_key_version_name']._options = None
# @@protoc_insertion_point(module_scope)
