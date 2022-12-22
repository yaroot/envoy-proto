# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkehub/v1/membership.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/cloud/gkehub/v1/membership.proto\x12\x16google.cloud.gkehub.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xee\x05\n\nMembership\x12\x43\n\x08\x65ndpoint\x18\x04 \x01(\x0b\x32*.google.cloud.gkehub.v1.MembershipEndpointB\x03\xe0\x41\x01H\x00\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x43\n\x06labels\x18\x02 \x03(\x0b\x32..google.cloud.gkehub.v1.Membership.LabelsEntryB\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12;\n\x05state\x18\x05 \x01(\x0b\x32\'.google.cloud.gkehub.v1.MembershipStateB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0b\x64\x65lete_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x18\n\x0b\x65xternal_id\x18\t \x01(\tB\x03\xe0\x41\x01\x12=\n\x14last_connection_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x16\n\tunique_id\x18\x0b \x01(\tB\x03\xe0\x41\x03\x12\x39\n\tauthority\x18\x0c \x01(\x0b\x32!.google.cloud.gkehub.v1.AuthorityB\x03\xe0\x41\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:g\xea\x41\x64\n gkehub.googleapis.com/Membership\x12@projects/{project}/locations/{location}/memberships/{membership}B\x06\n\x04type\"\xee\x01\n\x12MembershipEndpoint\x12<\n\x0bgke_cluster\x18\x01 \x01(\x0b\x32\".google.cloud.gkehub.v1.GkeClusterB\x03\xe0\x41\x01\x12L\n\x13kubernetes_metadata\x18\x02 \x01(\x0b\x32*.google.cloud.gkehub.v1.KubernetesMetadataB\x03\xe0\x41\x03\x12L\n\x13kubernetes_resource\x18\x03 \x01(\x0b\x32*.google.cloud.gkehub.v1.KubernetesResourceB\x03\xe0\x41\x01\"\x98\x02\n\x12KubernetesResource\x12#\n\x16membership_cr_manifest\x18\x01 \x01(\tB\x03\xe0\x41\x04\x12K\n\x14membership_resources\x18\x02 \x03(\x0b\x32(.google.cloud.gkehub.v1.ResourceManifestB\x03\xe0\x41\x03\x12H\n\x11\x63onnect_resources\x18\x03 \x03(\x0b\x32(.google.cloud.gkehub.v1.ResourceManifestB\x03\xe0\x41\x03\x12\x46\n\x10resource_options\x18\x04 \x01(\x0b\x32\'.google.cloud.gkehub.v1.ResourceOptionsB\x03\xe0\x41\x01\"c\n\x0fResourceOptions\x12\x1c\n\x0f\x63onnect_version\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x18\n\x0bv1beta1_crd\x18\x02 \x01(\x08\x42\x03\xe0\x41\x01\x12\x18\n\x0bk8s_version\x18\x03 \x01(\tB\x03\xe0\x41\x01\"<\n\x10ResourceManifest\x12\x10\n\x08manifest\x18\x01 \x01(\t\x12\x16\n\x0e\x63luster_scoped\x18\x02 \x01(\x08\"(\n\nGkeCluster\x12\x1a\n\rresource_link\x18\x01 \x01(\tB\x03\xe0\x41\x05\"\xdf\x01\n\x12KubernetesMetadata\x12*\n\x1dkubernetes_api_server_version\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10node_provider_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x17\n\nnode_count\x18\x03 \x01(\x05\x42\x03\xe0\x41\x03\x12\x17\n\nvcpu_count\x18\x04 \x01(\x05\x42\x03\xe0\x41\x03\x12\x16\n\tmemory_mb\x18\x05 \x01(\x05\x42\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x64 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"\xbb\x01\n\x0fMembershipState\x12?\n\x04\x63ode\x18\x01 \x01(\x0e\x32,.google.cloud.gkehub.v1.MembershipState.CodeB\x03\xe0\x41\x03\"g\n\x04\x43ode\x12\x14\n\x10\x43ODE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02\x12\x0c\n\x08\x44\x45LETING\x10\x03\x12\x0c\n\x08UPDATING\x10\x04\x12\x14\n\x10SERVICE_UPDATING\x10\x05\"}\n\tAuthority\x12\x13\n\x06issuer\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12#\n\x16workload_identity_pool\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x1e\n\x11identity_provider\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x16\n\toidc_jwks\x18\x04 \x01(\x0c\x42\x03\xe0\x41\x01\x42\xbb\x01\n\x1a\x63om.google.cloud.gkehub.v1B\x0fMembershipProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/gkehub/v1;gkehub\xaa\x02\x16Google.Cloud.GkeHub.V1\xca\x02\x16Google\\Cloud\\GkeHub\\V1\xea\x02\x19Google::Cloud::GkeHub::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gkehub.v1.membership_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.gkehub.v1B\017MembershipProtoP\001Z<google.golang.org/genproto/googleapis/cloud/gkehub/v1;gkehub\252\002\026Google.Cloud.GkeHub.V1\312\002\026Google\\Cloud\\GkeHub\\V1\352\002\031Google::Cloud::GkeHub::V1'
  _MEMBERSHIP_LABELSENTRY._options = None
  _MEMBERSHIP_LABELSENTRY._serialized_options = b'8\001'
  _MEMBERSHIP.fields_by_name['endpoint']._options = None
  _MEMBERSHIP.fields_by_name['endpoint']._serialized_options = b'\340A\001'
  _MEMBERSHIP.fields_by_name['name']._options = None
  _MEMBERSHIP.fields_by_name['name']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['labels']._options = None
  _MEMBERSHIP.fields_by_name['labels']._serialized_options = b'\340A\001'
  _MEMBERSHIP.fields_by_name['description']._options = None
  _MEMBERSHIP.fields_by_name['description']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['state']._options = None
  _MEMBERSHIP.fields_by_name['state']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['create_time']._options = None
  _MEMBERSHIP.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['update_time']._options = None
  _MEMBERSHIP.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['delete_time']._options = None
  _MEMBERSHIP.fields_by_name['delete_time']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['external_id']._options = None
  _MEMBERSHIP.fields_by_name['external_id']._serialized_options = b'\340A\001'
  _MEMBERSHIP.fields_by_name['last_connection_time']._options = None
  _MEMBERSHIP.fields_by_name['last_connection_time']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['unique_id']._options = None
  _MEMBERSHIP.fields_by_name['unique_id']._serialized_options = b'\340A\003'
  _MEMBERSHIP.fields_by_name['authority']._options = None
  _MEMBERSHIP.fields_by_name['authority']._serialized_options = b'\340A\001'
  _MEMBERSHIP._options = None
  _MEMBERSHIP._serialized_options = b'\352Ad\n gkehub.googleapis.com/Membership\022@projects/{project}/locations/{location}/memberships/{membership}'
  _MEMBERSHIPENDPOINT.fields_by_name['gke_cluster']._options = None
  _MEMBERSHIPENDPOINT.fields_by_name['gke_cluster']._serialized_options = b'\340A\001'
  _MEMBERSHIPENDPOINT.fields_by_name['kubernetes_metadata']._options = None
  _MEMBERSHIPENDPOINT.fields_by_name['kubernetes_metadata']._serialized_options = b'\340A\003'
  _MEMBERSHIPENDPOINT.fields_by_name['kubernetes_resource']._options = None
  _MEMBERSHIPENDPOINT.fields_by_name['kubernetes_resource']._serialized_options = b'\340A\001'
  _KUBERNETESRESOURCE.fields_by_name['membership_cr_manifest']._options = None
  _KUBERNETESRESOURCE.fields_by_name['membership_cr_manifest']._serialized_options = b'\340A\004'
  _KUBERNETESRESOURCE.fields_by_name['membership_resources']._options = None
  _KUBERNETESRESOURCE.fields_by_name['membership_resources']._serialized_options = b'\340A\003'
  _KUBERNETESRESOURCE.fields_by_name['connect_resources']._options = None
  _KUBERNETESRESOURCE.fields_by_name['connect_resources']._serialized_options = b'\340A\003'
  _KUBERNETESRESOURCE.fields_by_name['resource_options']._options = None
  _KUBERNETESRESOURCE.fields_by_name['resource_options']._serialized_options = b'\340A\001'
  _RESOURCEOPTIONS.fields_by_name['connect_version']._options = None
  _RESOURCEOPTIONS.fields_by_name['connect_version']._serialized_options = b'\340A\001'
  _RESOURCEOPTIONS.fields_by_name['v1beta1_crd']._options = None
  _RESOURCEOPTIONS.fields_by_name['v1beta1_crd']._serialized_options = b'\340A\001'
  _RESOURCEOPTIONS.fields_by_name['k8s_version']._options = None
  _RESOURCEOPTIONS.fields_by_name['k8s_version']._serialized_options = b'\340A\001'
  _GKECLUSTER.fields_by_name['resource_link']._options = None
  _GKECLUSTER.fields_by_name['resource_link']._serialized_options = b'\340A\005'
  _KUBERNETESMETADATA.fields_by_name['kubernetes_api_server_version']._options = None
  _KUBERNETESMETADATA.fields_by_name['kubernetes_api_server_version']._serialized_options = b'\340A\003'
  _KUBERNETESMETADATA.fields_by_name['node_provider_id']._options = None
  _KUBERNETESMETADATA.fields_by_name['node_provider_id']._serialized_options = b'\340A\003'
  _KUBERNETESMETADATA.fields_by_name['node_count']._options = None
  _KUBERNETESMETADATA.fields_by_name['node_count']._serialized_options = b'\340A\003'
  _KUBERNETESMETADATA.fields_by_name['vcpu_count']._options = None
  _KUBERNETESMETADATA.fields_by_name['vcpu_count']._serialized_options = b'\340A\003'
  _KUBERNETESMETADATA.fields_by_name['memory_mb']._options = None
  _KUBERNETESMETADATA.fields_by_name['memory_mb']._serialized_options = b'\340A\003'
  _KUBERNETESMETADATA.fields_by_name['update_time']._options = None
  _KUBERNETESMETADATA.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _MEMBERSHIPSTATE.fields_by_name['code']._options = None
  _MEMBERSHIPSTATE.fields_by_name['code']._serialized_options = b'\340A\003'
  _AUTHORITY.fields_by_name['issuer']._options = None
  _AUTHORITY.fields_by_name['issuer']._serialized_options = b'\340A\001'
  _AUTHORITY.fields_by_name['workload_identity_pool']._options = None
  _AUTHORITY.fields_by_name['workload_identity_pool']._serialized_options = b'\340A\003'
  _AUTHORITY.fields_by_name['identity_provider']._options = None
  _AUTHORITY.fields_by_name['identity_provider']._serialized_options = b'\340A\003'
  _AUTHORITY.fields_by_name['oidc_jwks']._options = None
  _AUTHORITY.fields_by_name['oidc_jwks']._serialized_options = b'\340A\001'
  _MEMBERSHIP._serialized_start=161
  _MEMBERSHIP._serialized_end=911
  _MEMBERSHIP_LABELSENTRY._serialized_start=753
  _MEMBERSHIP_LABELSENTRY._serialized_end=798
  _MEMBERSHIPENDPOINT._serialized_start=914
  _MEMBERSHIPENDPOINT._serialized_end=1152
  _KUBERNETESRESOURCE._serialized_start=1155
  _KUBERNETESRESOURCE._serialized_end=1435
  _RESOURCEOPTIONS._serialized_start=1437
  _RESOURCEOPTIONS._serialized_end=1536
  _RESOURCEMANIFEST._serialized_start=1538
  _RESOURCEMANIFEST._serialized_end=1598
  _GKECLUSTER._serialized_start=1600
  _GKECLUSTER._serialized_end=1640
  _KUBERNETESMETADATA._serialized_start=1643
  _KUBERNETESMETADATA._serialized_end=1866
  _MEMBERSHIPSTATE._serialized_start=1869
  _MEMBERSHIPSTATE._serialized_end=2056
  _MEMBERSHIPSTATE_CODE._serialized_start=1953
  _MEMBERSHIPSTATE_CODE._serialized_end=2056
  _AUTHORITY._serialized_start=2058
  _AUTHORITY._serialized_end=2183
# @@protoc_insertion_point(module_scope)