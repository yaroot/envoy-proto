# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/assuredworkloads/v1beta1/assuredworkloads_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.assuredworkloads.v1beta1 import assuredworkloads_pb2 as google_dot_cloud_dot_assuredworkloads_dot_v1beta1_dot_assuredworkloads__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nDgoogle/cloud/assuredworkloads/v1beta1/assuredworkloads_service.proto\x12%google.cloud.assuredworkloads.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a<google/cloud/assuredworkloads/v1beta1/assuredworkloads.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto2\x90\x0b\n\x17\x41ssuredWorkloadsService\x12\xf9\x01\n\x0e\x43reateWorkload\x12<.google.cloud.assuredworkloads.v1beta1.CreateWorkloadRequest\x1a\x1d.google.longrunning.Operation\"\x89\x01\x82\xd3\xe4\x93\x02\x43\"7/v1beta1/{parent=organizations/*/locations/*}/workloads:\x08workload\xda\x41\x0fparent,workload\xca\x41+\n\x08Workload\x12\x1f\x43reateWorkloadOperationMetadata\x12\x98\x01\n\x0eUpdateWorkload\x12<.google.cloud.assuredworkloads.v1beta1.UpdateWorkloadRequest\x1a/.google.cloud.assuredworkloads.v1beta1.Workload\"\x17\xda\x41\x14workload,update_mask\x12\x88\x02\n\x18RestrictAllowedResources\x12\x46.google.cloud.assuredworkloads.v1beta1.RestrictAllowedResourcesRequest\x1aG.google.cloud.assuredworkloads.v1beta1.RestrictAllowedResourcesResponse\"[\x82\xd3\xe4\x93\x02U\"P/v1beta1/{name=organizations/*/locations/*/workloads/*}:restrictAllowedResources:\x01*\x12\xae\x01\n\x0e\x44\x65leteWorkload\x12<.google.cloud.assuredworkloads.v1beta1.DeleteWorkloadRequest\x1a\x16.google.protobuf.Empty\"F\x82\xd3\xe4\x93\x02\x39*7/v1beta1/{name=organizations/*/locations/*/workloads/*}\xda\x41\x04name\x12\x82\x01\n\x0bGetWorkload\x12\x39.google.cloud.assuredworkloads.v1beta1.GetWorkloadRequest\x1a/.google.cloud.assuredworkloads.v1beta1.Workload\"\x07\xda\x41\x04name\x12\xaf\x01\n\x13\x41nalyzeWorkloadMove\x12\x41.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveRequest\x1a\x42.google.cloud.assuredworkloads.v1beta1.AnalyzeWorkloadMoveResponse\"\x11\xda\x41\x0eproject,target\x12\x95\x01\n\rListWorkloads\x12;.google.cloud.assuredworkloads.v1beta1.ListWorkloadsRequest\x1a<.google.cloud.assuredworkloads.v1beta1.ListWorkloadsResponse\"\t\xda\x41\x06parent\x1aS\xca\x41\x1f\x61ssuredworkloads.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x9d\x02\n)com.google.cloud.assuredworkloads.v1beta1B\x1c\x41ssuredworkloadsServiceProtoP\x01ZUgoogle.golang.org/genproto/googleapis/cloud/assuredworkloads/v1beta1;assuredworkloads\xaa\x02%Google.Cloud.AssuredWorkloads.V1Beta1\xca\x02%Google\\Cloud\\AssuredWorkloads\\V1beta1\xea\x02(Google::Cloud::AssuredWorkloads::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.assuredworkloads.v1beta1.assuredworkloads_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.google.cloud.assuredworkloads.v1beta1B\034AssuredworkloadsServiceProtoP\001ZUgoogle.golang.org/genproto/googleapis/cloud/assuredworkloads/v1beta1;assuredworkloads\252\002%Google.Cloud.AssuredWorkloads.V1Beta1\312\002%Google\\Cloud\\AssuredWorkloads\\V1beta1\352\002(Google::Cloud::AssuredWorkloads::V1beta1'
  _ASSUREDWORKLOADSSERVICE._options = None
  _ASSUREDWORKLOADSSERVICE._serialized_options = b'\312A\037assuredworkloads.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['CreateWorkload']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['CreateWorkload']._serialized_options = b'\202\323\344\223\002C\"7/v1beta1/{parent=organizations/*/locations/*}/workloads:\010workload\332A\017parent,workload\312A+\n\010Workload\022\037CreateWorkloadOperationMetadata'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['UpdateWorkload']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['UpdateWorkload']._serialized_options = b'\332A\024workload,update_mask'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['RestrictAllowedResources']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['RestrictAllowedResources']._serialized_options = b'\202\323\344\223\002U\"P/v1beta1/{name=organizations/*/locations/*/workloads/*}:restrictAllowedResources:\001*'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['DeleteWorkload']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['DeleteWorkload']._serialized_options = b'\202\323\344\223\0029*7/v1beta1/{name=organizations/*/locations/*/workloads/*}\332A\004name'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['GetWorkload']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['GetWorkload']._serialized_options = b'\332A\004name'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['AnalyzeWorkloadMove']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['AnalyzeWorkloadMove']._serialized_options = b'\332A\016project,target'
  _ASSUREDWORKLOADSSERVICE.methods_by_name['ListWorkloads']._options = None
  _ASSUREDWORKLOADSSERVICE.methods_by_name['ListWorkloads']._serialized_options = b'\332A\006parent'
  _ASSUREDWORKLOADSSERVICE._serialized_start=295
  _ASSUREDWORKLOADSSERVICE._serialized_end=1719
# @@protoc_insertion_point(module_scope)
