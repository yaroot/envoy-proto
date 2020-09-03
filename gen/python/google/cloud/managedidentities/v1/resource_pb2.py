# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/managedidentities/v1/resource.proto

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
  name='google/cloud/managedidentities/v1/resource.proto',
  package='google.cloud.managedidentities.v1',
  syntax='proto3',
  serialized_options=b'\n%com.google.cloud.managedidentities.v1B\rResourceProtoP\001ZRgoogle.golang.org/genproto/googleapis/cloud/managedidentities/v1;managedidentities\252\002!Google.Cloud.ManagedIdentities.V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0google/cloud/managedidentities/v1/resource.proto\x12!google.cloud.managedidentities.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\x9e\x06\n\x06\x44omain\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12J\n\x06labels\x18\x02 \x03(\x0b\x32\x35.google.cloud.managedidentities.v1.Domain.LabelsEntryB\x03\xe0\x41\x01\x12 \n\x13\x61uthorized_networks\x18\x03 \x03(\tB\x03\xe0\x41\x01\x12\x1e\n\x11reserved_ip_range\x18\x04 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tlocations\x18\x05 \x03(\tB\x03\xe0\x41\x02\x12\x12\n\x05\x61\x64min\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12\x11\n\x04\x66qdn\x18\n \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x43\n\x05state\x18\r \x01(\x0e\x32/.google.cloud.managedidentities.v1.Domain.StateB\x03\xe0\x41\x03\x12\x1b\n\x0estatus_message\x18\x0e \x01(\tB\x03\xe0\x41\x03\x12=\n\x06trusts\x18\x0f \x03(\x0b\x32(.google.cloud.managedidentities.v1.TrustB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x8f\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02\x12\x0c\n\x08UPDATING\x10\x03\x12\x0c\n\x08\x44\x45LETING\x10\x04\x12\r\n\tREPAIRING\x10\x05\x12\x1a\n\x16PERFORMING_MAINTENANCE\x10\x06\x12\x0f\n\x0bUNAVAILABLE\x10\x07:f\xea\x41\x63\n\'managedidentities.googleapis.com/Domain\x12\x38projects/{project}/locations/{location}/domains/{domain}\"\xe1\x06\n\x05Trust\x12\x1f\n\x12target_domain_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12K\n\ntrust_type\x18\x02 \x01(\x0e\x32\x32.google.cloud.managedidentities.v1.Trust.TrustTypeB\x03\xe0\x41\x02\x12U\n\x0ftrust_direction\x18\x03 \x01(\x0e\x32\x37.google.cloud.managedidentities.v1.Trust.TrustDirectionB\x03\xe0\x41\x02\x12%\n\x18selective_authentication\x18\x04 \x01(\x08\x42\x03\xe0\x41\x01\x12$\n\x17target_dns_ip_addresses\x18\x05 \x03(\tB\x03\xe0\x41\x02\x12#\n\x16trust_handshake_secret\x18\x06 \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x42\n\x05state\x18\t \x01(\x0e\x32..google.cloud.managedidentities.v1.Trust.StateB\x03\xe0\x41\x03\x12\x1e\n\x11state_description\x18\x0b \x01(\tB\x03\xe0\x41\x03\x12\x42\n\x19last_trust_heartbeat_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"i\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x0c\n\x08UPDATING\x10\x02\x12\x0c\n\x08\x44\x45LETING\x10\x03\x12\r\n\tCONNECTED\x10\x04\x12\x10\n\x0c\x44ISCONNECTED\x10\x05\"A\n\tTrustType\x12\x1a\n\x16TRUST_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06\x46OREST\x10\x01\x12\x0c\n\x08\x45XTERNAL\x10\x02\"_\n\x0eTrustDirection\x12\x1f\n\x1bTRUST_DIRECTION_UNSPECIFIED\x10\x00\x12\x0b\n\x07INBOUND\x10\x01\x12\x0c\n\x08OUTBOUND\x10\x02\x12\x11\n\rBIDIRECTIONAL\x10\x03\x42\xb0\x01\n%com.google.cloud.managedidentities.v1B\rResourceProtoP\x01ZRgoogle.golang.org/genproto/googleapis/cloud/managedidentities/v1;managedidentities\xaa\x02!Google.Cloud.ManagedIdentities.V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_DOMAIN_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.managedidentities.v1.Domain.State',
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
      name='CREATING', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='READY', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UPDATING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DELETING', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REPAIRING', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PERFORMING_MAINTENANCE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNAVAILABLE', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=762,
  serialized_end=905,
)
_sym_db.RegisterEnumDescriptor(_DOMAIN_STATE)

_TRUST_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.managedidentities.v1.Trust.State',
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
      name='CREATING', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UPDATING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DELETING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CONNECTED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DISCONNECTED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1608,
  serialized_end=1713,
)
_sym_db.RegisterEnumDescriptor(_TRUST_STATE)

_TRUST_TRUSTTYPE = _descriptor.EnumDescriptor(
  name='TrustType',
  full_name='google.cloud.managedidentities.v1.Trust.TrustType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TRUST_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FOREST', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EXTERNAL', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1715,
  serialized_end=1780,
)
_sym_db.RegisterEnumDescriptor(_TRUST_TRUSTTYPE)

_TRUST_TRUSTDIRECTION = _descriptor.EnumDescriptor(
  name='TrustDirection',
  full_name='google.cloud.managedidentities.v1.Trust.TrustDirection',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TRUST_DIRECTION_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INBOUND', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OUTBOUND', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BIDIRECTIONAL', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1782,
  serialized_end=1877,
)
_sym_db.RegisterEnumDescriptor(_TRUST_TRUSTDIRECTION)


_DOMAIN_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.managedidentities.v1.Domain.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.managedidentities.v1.Domain.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.managedidentities.v1.Domain.LabelsEntry.value', index=1,
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
  serialized_start=714,
  serialized_end=759,
)

_DOMAIN = _descriptor.Descriptor(
  name='Domain',
  full_name='google.cloud.managedidentities.v1.Domain',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.managedidentities.v1.Domain.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.managedidentities.v1.Domain.labels', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='authorized_networks', full_name='google.cloud.managedidentities.v1.Domain.authorized_networks', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reserved_ip_range', full_name='google.cloud.managedidentities.v1.Domain.reserved_ip_range', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='locations', full_name='google.cloud.managedidentities.v1.Domain.locations', index=4,
      number=5, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='admin', full_name='google.cloud.managedidentities.v1.Domain.admin', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='fqdn', full_name='google.cloud.managedidentities.v1.Domain.fqdn', index=6,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.managedidentities.v1.Domain.create_time', index=7,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.managedidentities.v1.Domain.update_time', index=8,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.managedidentities.v1.Domain.state', index=9,
      number=13, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status_message', full_name='google.cloud.managedidentities.v1.Domain.status_message', index=10,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trusts', full_name='google.cloud.managedidentities.v1.Domain.trusts', index=11,
      number=15, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_DOMAIN_LABELSENTRY, ],
  enum_types=[
    _DOMAIN_STATE,
  ],
  serialized_options=b'\352Ac\n\'managedidentities.googleapis.com/Domain\0228projects/{project}/locations/{location}/domains/{domain}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=211,
  serialized_end=1009,
)


_TRUST = _descriptor.Descriptor(
  name='Trust',
  full_name='google.cloud.managedidentities.v1.Trust',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='target_domain_name', full_name='google.cloud.managedidentities.v1.Trust.target_domain_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trust_type', full_name='google.cloud.managedidentities.v1.Trust.trust_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trust_direction', full_name='google.cloud.managedidentities.v1.Trust.trust_direction', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='selective_authentication', full_name='google.cloud.managedidentities.v1.Trust.selective_authentication', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='target_dns_ip_addresses', full_name='google.cloud.managedidentities.v1.Trust.target_dns_ip_addresses', index=4,
      number=5, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trust_handshake_secret', full_name='google.cloud.managedidentities.v1.Trust.trust_handshake_secret', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.managedidentities.v1.Trust.create_time', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.managedidentities.v1.Trust.update_time', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.managedidentities.v1.Trust.state', index=8,
      number=9, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state_description', full_name='google.cloud.managedidentities.v1.Trust.state_description', index=9,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_trust_heartbeat_time', full_name='google.cloud.managedidentities.v1.Trust.last_trust_heartbeat_time', index=10,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _TRUST_STATE,
    _TRUST_TRUSTTYPE,
    _TRUST_TRUSTDIRECTION,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1012,
  serialized_end=1877,
)

_DOMAIN_LABELSENTRY.containing_type = _DOMAIN
_DOMAIN.fields_by_name['labels'].message_type = _DOMAIN_LABELSENTRY
_DOMAIN.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_DOMAIN.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_DOMAIN.fields_by_name['state'].enum_type = _DOMAIN_STATE
_DOMAIN.fields_by_name['trusts'].message_type = _TRUST
_DOMAIN_STATE.containing_type = _DOMAIN
_TRUST.fields_by_name['trust_type'].enum_type = _TRUST_TRUSTTYPE
_TRUST.fields_by_name['trust_direction'].enum_type = _TRUST_TRUSTDIRECTION
_TRUST.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRUST.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRUST.fields_by_name['state'].enum_type = _TRUST_STATE
_TRUST.fields_by_name['last_trust_heartbeat_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRUST_STATE.containing_type = _TRUST
_TRUST_TRUSTTYPE.containing_type = _TRUST
_TRUST_TRUSTDIRECTION.containing_type = _TRUST
DESCRIPTOR.message_types_by_name['Domain'] = _DOMAIN
DESCRIPTOR.message_types_by_name['Trust'] = _TRUST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Domain = _reflection.GeneratedProtocolMessageType('Domain', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _DOMAIN_LABELSENTRY,
    '__module__' : 'google.cloud.managedidentities.v1.resource_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1.Domain.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _DOMAIN,
  '__module__' : 'google.cloud.managedidentities.v1.resource_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1.Domain)
  })
_sym_db.RegisterMessage(Domain)
_sym_db.RegisterMessage(Domain.LabelsEntry)

Trust = _reflection.GeneratedProtocolMessageType('Trust', (_message.Message,), {
  'DESCRIPTOR' : _TRUST,
  '__module__' : 'google.cloud.managedidentities.v1.resource_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1.Trust)
  })
_sym_db.RegisterMessage(Trust)


DESCRIPTOR._options = None
_DOMAIN_LABELSENTRY._options = None
_DOMAIN.fields_by_name['name']._options = None
_DOMAIN.fields_by_name['labels']._options = None
_DOMAIN.fields_by_name['authorized_networks']._options = None
_DOMAIN.fields_by_name['reserved_ip_range']._options = None
_DOMAIN.fields_by_name['locations']._options = None
_DOMAIN.fields_by_name['admin']._options = None
_DOMAIN.fields_by_name['fqdn']._options = None
_DOMAIN.fields_by_name['create_time']._options = None
_DOMAIN.fields_by_name['update_time']._options = None
_DOMAIN.fields_by_name['state']._options = None
_DOMAIN.fields_by_name['status_message']._options = None
_DOMAIN.fields_by_name['trusts']._options = None
_DOMAIN._options = None
_TRUST.fields_by_name['target_domain_name']._options = None
_TRUST.fields_by_name['trust_type']._options = None
_TRUST.fields_by_name['trust_direction']._options = None
_TRUST.fields_by_name['selective_authentication']._options = None
_TRUST.fields_by_name['target_dns_ip_addresses']._options = None
_TRUST.fields_by_name['trust_handshake_secret']._options = None
_TRUST.fields_by_name['create_time']._options = None
_TRUST.fields_by_name['update_time']._options = None
_TRUST.fields_by_name['state']._options = None
_TRUST.fields_by_name['state_description']._options = None
_TRUST.fields_by_name['last_trust_heartbeat_time']._options = None
# @@protoc_insertion_point(module_scope)
