# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gkemulticloud/v1/attached_resources.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.gkemulticloud.v1 import common_resources_pb2 as google_dot_cloud_dot_gkemulticloud_dot_v1_dot_common__resources__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/cloud/gkemulticloud/v1/attached_resources.proto\x12\x1dgoogle.cloud.gkemulticloud.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x34google/cloud/gkemulticloud/v1/common_resources.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xcc\n\n\x0f\x41ttachedCluster\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12K\n\x0boidc_config\x18\x03 \x01(\x0b\x32\x31.google.cloud.gkemulticloud.v1.AttachedOidcConfigB\x03\xe0\x41\x02\x12\x1d\n\x10platform_version\x18\x04 \x01(\tB\x03\xe0\x41\x02\x12\x19\n\x0c\x64istribution\x18\x10 \x01(\tB\x03\xe0\x41\x02\x12\x1b\n\x0e\x63luster_region\x18\x16 \x01(\tB\x03\xe0\x41\x03\x12\x38\n\x05\x66leet\x18\x05 \x01(\x0b\x32$.google.cloud.gkemulticloud.v1.FleetB\x03\xe0\x41\x02\x12H\n\x05state\x18\x06 \x01(\x0e\x32\x34.google.cloud.gkemulticloud.v1.AttachedCluster.StateB\x03\xe0\x41\x03\x12\x10\n\x03uid\x18\x07 \x01(\tB\x03\xe0\x41\x03\x12\x18\n\x0breconciling\x18\x08 \x01(\x08\x42\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x0c\n\x04\x65tag\x18\x0b \x01(\t\x12\x1f\n\x12kubernetes_version\x18\x0c \x01(\tB\x03\xe0\x41\x03\x12Y\n\x0b\x61nnotations\x18\r \x03(\x0b\x32?.google.cloud.gkemulticloud.v1.AttachedCluster.AnnotationsEntryB\x03\xe0\x41\x01\x12\\\n\x18workload_identity_config\x18\x0e \x01(\x0b\x32\x35.google.cloud.gkemulticloud.v1.WorkloadIdentityConfigB\x03\xe0\x41\x03\x12I\n\x0elogging_config\x18\x0f \x01(\x0b\x32,.google.cloud.gkemulticloud.v1.LoggingConfigB\x03\xe0\x41\x01\x12H\n\x06\x65rrors\x18\x14 \x03(\x0b\x32\x33.google.cloud.gkemulticloud.v1.AttachedClusterErrorB\x03\xe0\x41\x03\x12X\n\rauthorization\x18\x15 \x01(\x0b\x32<.google.cloud.gkemulticloud.v1.AttachedClustersAuthorizationB\x03\xe0\x41\x01\x12O\n\x11monitoring_config\x18\x17 \x01(\x0b\x32/.google.cloud.gkemulticloud.v1.MonitoringConfigB\x03\xe0\x41\x01\x1a\x32\n\x10\x41nnotationsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"u\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x10\n\x0cPROVISIONING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\x0f\n\x0bRECONCILING\x10\x03\x12\x0c\n\x08STOPPING\x10\x04\x12\t\n\x05\x45RROR\x10\x05\x12\x0c\n\x08\x44\x45GRADED\x10\x06:~\xea\x41{\n,gkemulticloud.googleapis.com/AttachedCluster\x12Kprojects/{project}/locations/{location}/attachedClusters/{attached_cluster}\"m\n\x1d\x41ttachedClustersAuthorization\x12L\n\x0b\x61\x64min_users\x18\x01 \x03(\x0b\x32\x32.google.cloud.gkemulticloud.v1.AttachedClusterUserB\x03\xe0\x41\x02\",\n\x13\x41ttachedClusterUser\x12\x15\n\x08username\x18\x01 \x01(\tB\x03\xe0\x41\x02\";\n\x12\x41ttachedOidcConfig\x12\x12\n\nissuer_url\x18\x01 \x01(\t\x12\x11\n\x04jwks\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x01\"\xee\x01\n\x14\x41ttachedServerConfig\x12\x0c\n\x04name\x18\x01 \x01(\t\x12R\n\x0evalid_versions\x18\x02 \x03(\x0b\x32:.google.cloud.gkemulticloud.v1.AttachedPlatformVersionInfo:t\xea\x41q\n1gkemulticloud.googleapis.com/AttachedServerConfig\x12<projects/{project}/locations/{location}/attachedServerConfig\".\n\x1b\x41ttachedPlatformVersionInfo\x12\x0f\n\x07version\x18\x01 \x01(\t\"\'\n\x14\x41ttachedClusterError\x12\x0f\n\x07message\x18\x01 \x01(\tB\xec\x01\n!com.google.cloud.gkemulticloud.v1B\x16\x41ttachedResourcesProtoP\x01ZJgoogle.golang.org/genproto/googleapis/cloud/gkemulticloud/v1;gkemulticloud\xaa\x02\x1dGoogle.Cloud.GkeMultiCloud.V1\xca\x02\x1dGoogle\\Cloud\\GkeMultiCloud\\V1\xea\x02 Google::Cloud::GkeMultiCloud::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gkemulticloud.v1.attached_resources_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.gkemulticloud.v1B\026AttachedResourcesProtoP\001ZJgoogle.golang.org/genproto/googleapis/cloud/gkemulticloud/v1;gkemulticloud\252\002\035Google.Cloud.GkeMultiCloud.V1\312\002\035Google\\Cloud\\GkeMultiCloud\\V1\352\002 Google::Cloud::GkeMultiCloud::V1'
  _ATTACHEDCLUSTER_ANNOTATIONSENTRY._options = None
  _ATTACHEDCLUSTER_ANNOTATIONSENTRY._serialized_options = b'8\001'
  _ATTACHEDCLUSTER.fields_by_name['description']._options = None
  _ATTACHEDCLUSTER.fields_by_name['description']._serialized_options = b'\340A\001'
  _ATTACHEDCLUSTER.fields_by_name['oidc_config']._options = None
  _ATTACHEDCLUSTER.fields_by_name['oidc_config']._serialized_options = b'\340A\002'
  _ATTACHEDCLUSTER.fields_by_name['platform_version']._options = None
  _ATTACHEDCLUSTER.fields_by_name['platform_version']._serialized_options = b'\340A\002'
  _ATTACHEDCLUSTER.fields_by_name['distribution']._options = None
  _ATTACHEDCLUSTER.fields_by_name['distribution']._serialized_options = b'\340A\002'
  _ATTACHEDCLUSTER.fields_by_name['cluster_region']._options = None
  _ATTACHEDCLUSTER.fields_by_name['cluster_region']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['fleet']._options = None
  _ATTACHEDCLUSTER.fields_by_name['fleet']._serialized_options = b'\340A\002'
  _ATTACHEDCLUSTER.fields_by_name['state']._options = None
  _ATTACHEDCLUSTER.fields_by_name['state']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['uid']._options = None
  _ATTACHEDCLUSTER.fields_by_name['uid']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['reconciling']._options = None
  _ATTACHEDCLUSTER.fields_by_name['reconciling']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['create_time']._options = None
  _ATTACHEDCLUSTER.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['update_time']._options = None
  _ATTACHEDCLUSTER.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['kubernetes_version']._options = None
  _ATTACHEDCLUSTER.fields_by_name['kubernetes_version']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['annotations']._options = None
  _ATTACHEDCLUSTER.fields_by_name['annotations']._serialized_options = b'\340A\001'
  _ATTACHEDCLUSTER.fields_by_name['workload_identity_config']._options = None
  _ATTACHEDCLUSTER.fields_by_name['workload_identity_config']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['logging_config']._options = None
  _ATTACHEDCLUSTER.fields_by_name['logging_config']._serialized_options = b'\340A\001'
  _ATTACHEDCLUSTER.fields_by_name['errors']._options = None
  _ATTACHEDCLUSTER.fields_by_name['errors']._serialized_options = b'\340A\003'
  _ATTACHEDCLUSTER.fields_by_name['authorization']._options = None
  _ATTACHEDCLUSTER.fields_by_name['authorization']._serialized_options = b'\340A\001'
  _ATTACHEDCLUSTER.fields_by_name['monitoring_config']._options = None
  _ATTACHEDCLUSTER.fields_by_name['monitoring_config']._serialized_options = b'\340A\001'
  _ATTACHEDCLUSTER._options = None
  _ATTACHEDCLUSTER._serialized_options = b'\352A{\n,gkemulticloud.googleapis.com/AttachedCluster\022Kprojects/{project}/locations/{location}/attachedClusters/{attached_cluster}'
  _ATTACHEDCLUSTERSAUTHORIZATION.fields_by_name['admin_users']._options = None
  _ATTACHEDCLUSTERSAUTHORIZATION.fields_by_name['admin_users']._serialized_options = b'\340A\002'
  _ATTACHEDCLUSTERUSER.fields_by_name['username']._options = None
  _ATTACHEDCLUSTERUSER.fields_by_name['username']._serialized_options = b'\340A\002'
  _ATTACHEDOIDCCONFIG.fields_by_name['jwks']._options = None
  _ATTACHEDOIDCCONFIG.fields_by_name['jwks']._serialized_options = b'\340A\001'
  _ATTACHEDSERVERCONFIG._options = None
  _ATTACHEDSERVERCONFIG._serialized_options = b'\352Aq\n1gkemulticloud.googleapis.com/AttachedServerConfig\022<projects/{project}/locations/{location}/attachedServerConfig'
  _ATTACHEDCLUSTER._serialized_start=237
  _ATTACHEDCLUSTER._serialized_end=1593
  _ATTACHEDCLUSTER_ANNOTATIONSENTRY._serialized_start=1296
  _ATTACHEDCLUSTER_ANNOTATIONSENTRY._serialized_end=1346
  _ATTACHEDCLUSTER_STATE._serialized_start=1348
  _ATTACHEDCLUSTER_STATE._serialized_end=1465
  _ATTACHEDCLUSTERSAUTHORIZATION._serialized_start=1595
  _ATTACHEDCLUSTERSAUTHORIZATION._serialized_end=1704
  _ATTACHEDCLUSTERUSER._serialized_start=1706
  _ATTACHEDCLUSTERUSER._serialized_end=1750
  _ATTACHEDOIDCCONFIG._serialized_start=1752
  _ATTACHEDOIDCCONFIG._serialized_end=1811
  _ATTACHEDSERVERCONFIG._serialized_start=1814
  _ATTACHEDSERVERCONFIG._serialized_end=2052
  _ATTACHEDPLATFORMVERSIONINFO._serialized_start=2054
  _ATTACHEDPLATFORMVERSIONINFO._serialized_end=2100
  _ATTACHEDCLUSTERERROR._serialized_start=2102
  _ATTACHEDCLUSTERERROR._serialized_end=2141
# @@protoc_insertion_point(module_scope)