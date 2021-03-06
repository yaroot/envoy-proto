# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkehub/v1/membership.proto
"""Generated protocol buffer code."""
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
  name='google/cloud/gkehub/v1/membership.proto',
  package='google.cloud.gkehub.v1',
  syntax='proto3',
  serialized_options=b'\n\032com.google.cloud.gkehub.v1B\017MembershipProtoP\001Z<google.golang.org/genproto/googleapis/cloud/gkehub/v1;gkehub\252\002\026Google.Cloud.GkeHub.V1\312\002\026Google\\Cloud\\GkeHub\\V1\352\002\031Google::Cloud::GkeHub::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'google/cloud/gkehub/v1/membership.proto\x12\x16google.cloud.gkehub.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xee\x05\n\nMembership\x12\x43\n\x08\x65ndpoint\x18\x04 \x01(\x0b\x32*.google.cloud.gkehub.v1.MembershipEndpointB\x03\xe0\x41\x01H\x00\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x43\n\x06labels\x18\x02 \x03(\x0b\x32..google.cloud.gkehub.v1.Membership.LabelsEntryB\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12;\n\x05state\x18\x05 \x01(\x0b\x32\'.google.cloud.gkehub.v1.MembershipStateB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0b\x64\x65lete_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x18\n\x0b\x65xternal_id\x18\t \x01(\tB\x03\xe0\x41\x01\x12=\n\x14last_connection_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x16\n\tunique_id\x18\x0b \x01(\tB\x03\xe0\x41\x03\x12\x39\n\tauthority\x18\x0c \x01(\x0b\x32!.google.cloud.gkehub.v1.AuthorityB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:g\xea\x41\x64\n gkehub.googleapis.com/Membership\x12@projects/{project}/locations/{location}/memberships/{membership}B\x06\n\x04type\"\xa0\x01\n\x12MembershipEndpoint\x12<\n\x0bgke_cluster\x18\x01 \x01(\x0b\x32\".google.cloud.gkehub.v1.GkeClusterB\x03\xe0\x41\x01\x12L\n\x13kubernetes_metadata\x18\x02 \x01(\x0b\x32*.google.cloud.gkehub.v1.KubernetesMetadataB\x03\xe0\x41\x03\"(\n\nGkeCluster\x12\x1a\n\rresource_link\x18\x01 \x01(\tB\x03\xe0\x41\x05\"\xdf\x01\n\x12KubernetesMetadata\x12*\n\x1dkubernetes_api_server_version\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10node_provider_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x17\n\nnode_count\x18\x03 \x01(\x05\x42\x03\xe0\x41\x03\x12\x17\n\nvcpu_count\x18\x04 \x01(\x05\x42\x03\xe0\x41\x03\x12\x16\n\tmemory_mb\x18\x05 \x01(\x05\x42\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x64 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"\xbb\x01\n\x0fMembershipState\x12?\n\x04\x63ode\x18\x01 \x01(\x0e\x32,.google.cloud.gkehub.v1.MembershipState.CodeB\x03\xe0\x41\x03\"g\n\x04\x43ode\x12\x14\n\x10\x43ODE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02\x12\x0c\n\x08\x44\x45LETING\x10\x03\x12\x0c\n\x08UPDATING\x10\x04\x12\x14\n\x10SERVICE_UPDATING\x10\x05\"}\n\tAuthority\x12\x13\n\x06issuer\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12#\n\x16workload_identity_pool\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x1e\n\x11identity_provider\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\toidc_jwks\x18\x04 \x01(\x0c\x42\x03\xe0\x41\x01\x42\xbb\x01\n\x1a\x63om.google.cloud.gkehub.v1B\x0fMembershipProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/gkehub/v1;gkehub\xaa\x02\x16Google.Cloud.GkeHub.V1\xca\x02\x16Google\\Cloud\\GkeHub\\V1\xea\x02\x19Google::Cloud::GkeHub::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_MEMBERSHIPSTATE_CODE = _descriptor.EnumDescriptor(
  name='Code',
  full_name='google.cloud.gkehub.v1.MembershipState.Code',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CODE_UNSPECIFIED', index=0, number=0,
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
      name='DELETING', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UPDATING', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SERVICE_UPDATING', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1459,
  serialized_end=1562,
)
_sym_db.RegisterEnumDescriptor(_MEMBERSHIPSTATE_CODE)


_MEMBERSHIP_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.gkehub.v1.Membership.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.gkehub.v1.Membership.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.gkehub.v1.Membership.LabelsEntry.value', index=1,
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
  serialized_start=783,
  serialized_end=828,
)

_MEMBERSHIP = _descriptor.Descriptor(
  name='Membership',
  full_name='google.cloud.gkehub.v1.Membership',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='endpoint', full_name='google.cloud.gkehub.v1.Membership.endpoint', index=0,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.gkehub.v1.Membership.name', index=1,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.gkehub.v1.Membership.labels', index=2,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.cloud.gkehub.v1.Membership.description', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.gkehub.v1.Membership.state', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.gkehub.v1.Membership.create_time', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.gkehub.v1.Membership.update_time', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='delete_time', full_name='google.cloud.gkehub.v1.Membership.delete_time', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='external_id', full_name='google.cloud.gkehub.v1.Membership.external_id', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_connection_time', full_name='google.cloud.gkehub.v1.Membership.last_connection_time', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='unique_id', full_name='google.cloud.gkehub.v1.Membership.unique_id', index=10,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='authority', full_name='google.cloud.gkehub.v1.Membership.authority', index=11,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_MEMBERSHIP_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352Ad\n gkehub.googleapis.com/Membership\022@projects/{project}/locations/{location}/memberships/{membership}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='type', full_name='google.cloud.gkehub.v1.Membership.type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=191,
  serialized_end=941,
)


_MEMBERSHIPENDPOINT = _descriptor.Descriptor(
  name='MembershipEndpoint',
  full_name='google.cloud.gkehub.v1.MembershipEndpoint',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='gke_cluster', full_name='google.cloud.gkehub.v1.MembershipEndpoint.gke_cluster', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='kubernetes_metadata', full_name='google.cloud.gkehub.v1.MembershipEndpoint.kubernetes_metadata', index=1,
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
  serialized_start=944,
  serialized_end=1104,
)


_GKECLUSTER = _descriptor.Descriptor(
  name='GkeCluster',
  full_name='google.cloud.gkehub.v1.GkeCluster',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_link', full_name='google.cloud.gkehub.v1.GkeCluster.resource_link', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1106,
  serialized_end=1146,
)


_KUBERNETESMETADATA = _descriptor.Descriptor(
  name='KubernetesMetadata',
  full_name='google.cloud.gkehub.v1.KubernetesMetadata',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='kubernetes_api_server_version', full_name='google.cloud.gkehub.v1.KubernetesMetadata.kubernetes_api_server_version', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='node_provider_id', full_name='google.cloud.gkehub.v1.KubernetesMetadata.node_provider_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='node_count', full_name='google.cloud.gkehub.v1.KubernetesMetadata.node_count', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vcpu_count', full_name='google.cloud.gkehub.v1.KubernetesMetadata.vcpu_count', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='memory_mb', full_name='google.cloud.gkehub.v1.KubernetesMetadata.memory_mb', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.gkehub.v1.KubernetesMetadata.update_time', index=5,
      number=100, type=11, cpp_type=10, label=1,
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
  serialized_start=1149,
  serialized_end=1372,
)


_MEMBERSHIPSTATE = _descriptor.Descriptor(
  name='MembershipState',
  full_name='google.cloud.gkehub.v1.MembershipState',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='google.cloud.gkehub.v1.MembershipState.code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _MEMBERSHIPSTATE_CODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1375,
  serialized_end=1562,
)


_AUTHORITY = _descriptor.Descriptor(
  name='Authority',
  full_name='google.cloud.gkehub.v1.Authority',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='issuer', full_name='google.cloud.gkehub.v1.Authority.issuer', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='workload_identity_pool', full_name='google.cloud.gkehub.v1.Authority.workload_identity_pool', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='identity_provider', full_name='google.cloud.gkehub.v1.Authority.identity_provider', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='oidc_jwks', full_name='google.cloud.gkehub.v1.Authority.oidc_jwks', index=3,
      number=4, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
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
  serialized_start=1564,
  serialized_end=1689,
)

_MEMBERSHIP_LABELSENTRY.containing_type = _MEMBERSHIP
_MEMBERSHIP.fields_by_name['endpoint'].message_type = _MEMBERSHIPENDPOINT
_MEMBERSHIP.fields_by_name['labels'].message_type = _MEMBERSHIP_LABELSENTRY
_MEMBERSHIP.fields_by_name['state'].message_type = _MEMBERSHIPSTATE
_MEMBERSHIP.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_MEMBERSHIP.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_MEMBERSHIP.fields_by_name['delete_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_MEMBERSHIP.fields_by_name['last_connection_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_MEMBERSHIP.fields_by_name['authority'].message_type = _AUTHORITY
_MEMBERSHIP.oneofs_by_name['type'].fields.append(
  _MEMBERSHIP.fields_by_name['endpoint'])
_MEMBERSHIP.fields_by_name['endpoint'].containing_oneof = _MEMBERSHIP.oneofs_by_name['type']
_MEMBERSHIPENDPOINT.fields_by_name['gke_cluster'].message_type = _GKECLUSTER
_MEMBERSHIPENDPOINT.fields_by_name['kubernetes_metadata'].message_type = _KUBERNETESMETADATA
_KUBERNETESMETADATA.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_MEMBERSHIPSTATE.fields_by_name['code'].enum_type = _MEMBERSHIPSTATE_CODE
_MEMBERSHIPSTATE_CODE.containing_type = _MEMBERSHIPSTATE
DESCRIPTOR.message_types_by_name['Membership'] = _MEMBERSHIP
DESCRIPTOR.message_types_by_name['MembershipEndpoint'] = _MEMBERSHIPENDPOINT
DESCRIPTOR.message_types_by_name['GkeCluster'] = _GKECLUSTER
DESCRIPTOR.message_types_by_name['KubernetesMetadata'] = _KUBERNETESMETADATA
DESCRIPTOR.message_types_by_name['MembershipState'] = _MEMBERSHIPSTATE
DESCRIPTOR.message_types_by_name['Authority'] = _AUTHORITY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Membership = _reflection.GeneratedProtocolMessageType('Membership', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _MEMBERSHIP_LABELSENTRY,
    '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.Membership.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _MEMBERSHIP,
  '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.Membership)
  })
_sym_db.RegisterMessage(Membership)
_sym_db.RegisterMessage(Membership.LabelsEntry)

MembershipEndpoint = _reflection.GeneratedProtocolMessageType('MembershipEndpoint', (_message.Message,), {
  'DESCRIPTOR' : _MEMBERSHIPENDPOINT,
  '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.MembershipEndpoint)
  })
_sym_db.RegisterMessage(MembershipEndpoint)

GkeCluster = _reflection.GeneratedProtocolMessageType('GkeCluster', (_message.Message,), {
  'DESCRIPTOR' : _GKECLUSTER,
  '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.GkeCluster)
  })
_sym_db.RegisterMessage(GkeCluster)

KubernetesMetadata = _reflection.GeneratedProtocolMessageType('KubernetesMetadata', (_message.Message,), {
  'DESCRIPTOR' : _KUBERNETESMETADATA,
  '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.KubernetesMetadata)
  })
_sym_db.RegisterMessage(KubernetesMetadata)

MembershipState = _reflection.GeneratedProtocolMessageType('MembershipState', (_message.Message,), {
  'DESCRIPTOR' : _MEMBERSHIPSTATE,
  '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.MembershipState)
  })
_sym_db.RegisterMessage(MembershipState)

Authority = _reflection.GeneratedProtocolMessageType('Authority', (_message.Message,), {
  'DESCRIPTOR' : _AUTHORITY,
  '__module__' : 'google.cloud.gkehub.v1.membership_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.Authority)
  })
_sym_db.RegisterMessage(Authority)


DESCRIPTOR._options = None
_MEMBERSHIP_LABELSENTRY._options = None
_MEMBERSHIP.fields_by_name['endpoint']._options = None
_MEMBERSHIP.fields_by_name['name']._options = None
_MEMBERSHIP.fields_by_name['labels']._options = None
_MEMBERSHIP.fields_by_name['description']._options = None
_MEMBERSHIP.fields_by_name['state']._options = None
_MEMBERSHIP.fields_by_name['create_time']._options = None
_MEMBERSHIP.fields_by_name['update_time']._options = None
_MEMBERSHIP.fields_by_name['delete_time']._options = None
_MEMBERSHIP.fields_by_name['external_id']._options = None
_MEMBERSHIP.fields_by_name['last_connection_time']._options = None
_MEMBERSHIP.fields_by_name['unique_id']._options = None
_MEMBERSHIP.fields_by_name['authority']._options = None
_MEMBERSHIP._options = None
_MEMBERSHIPENDPOINT.fields_by_name['gke_cluster']._options = None
_MEMBERSHIPENDPOINT.fields_by_name['kubernetes_metadata']._options = None
_GKECLUSTER.fields_by_name['resource_link']._options = None
_KUBERNETESMETADATA.fields_by_name['kubernetes_api_server_version']._options = None
_KUBERNETESMETADATA.fields_by_name['node_provider_id']._options = None
_KUBERNETESMETADATA.fields_by_name['node_count']._options = None
_KUBERNETESMETADATA.fields_by_name['vcpu_count']._options = None
_KUBERNETESMETADATA.fields_by_name['memory_mb']._options = None
_KUBERNETESMETADATA.fields_by_name['update_time']._options = None
_MEMBERSHIPSTATE.fields_by_name['code']._options = None
_AUTHORITY.fields_by_name['issuer']._options = None
_AUTHORITY.fields_by_name['workload_identity_pool']._options = None
_AUTHORITY.fields_by_name['identity_provider']._options = None
_AUTHORITY.fields_by_name['oidc_jwks']._options = None
# @@protoc_insertion_point(module_scope)
