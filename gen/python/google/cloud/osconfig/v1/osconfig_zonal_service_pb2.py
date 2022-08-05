# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/v1/osconfig_zonal_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.osconfig.v1 import inventory_pb2 as google_dot_cloud_dot_osconfig_dot_v1_dot_inventory__pb2
from google.cloud.osconfig.v1 import os_policy_assignment_reports_pb2 as google_dot_cloud_dot_osconfig_dot_v1_dot_os__policy__assignment__reports__pb2
from google.cloud.osconfig.v1 import os_policy_assignments_pb2 as google_dot_cloud_dot_osconfig_dot_v1_dot_os__policy__assignments__pb2
from google.cloud.osconfig.v1 import vulnerability_pb2 as google_dot_cloud_dot_osconfig_dot_v1_dot_vulnerability__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n5google/cloud/osconfig/v1/osconfig_zonal_service.proto\x12\x18google.cloud.osconfig.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a(google/cloud/osconfig/v1/inventory.proto\x1a;google/cloud/osconfig/v1/os_policy_assignment_reports.proto\x1a\x34google/cloud/osconfig/v1/os_policy_assignments.proto\x1a,google/cloud/osconfig/v1/vulnerability.proto\x1a#google/longrunning/operations.proto2\xac\x17\n\x14OsConfigZonalService\x12\xbe\x02\n\x18\x43reateOSPolicyAssignment\x12\x39.google.cloud.osconfig.v1.CreateOSPolicyAssignmentRequest\x1a\x1d.google.longrunning.Operation\"\xc7\x01\x82\xd3\xe4\x93\x02O\"7/v1/{parent=projects/*/locations/*}/osPolicyAssignments:\x14os_policy_assignment\xda\x41\x33parent,os_policy_assignment,os_policy_assignment_id\xca\x41\x39\n\x12OSPolicyAssignment\x12#OSPolicyAssignmentOperationMetadata\x12\xc0\x02\n\x18UpdateOSPolicyAssignment\x12\x39.google.cloud.osconfig.v1.UpdateOSPolicyAssignmentRequest\x1a\x1d.google.longrunning.Operation\"\xc9\x01\x82\xd3\xe4\x93\x02\x64\x32L/v1/{os_policy_assignment.name=projects/*/locations/*/osPolicyAssignments/*}:\x14os_policy_assignment\xda\x41 os_policy_assignment,update_mask\xca\x41\x39\n\x12OSPolicyAssignment\x12#OSPolicyAssignmentOperationMetadata\x12\xc5\x01\n\x15GetOSPolicyAssignment\x12\x36.google.cloud.osconfig.v1.GetOSPolicyAssignmentRequest\x1a,.google.cloud.osconfig.v1.OSPolicyAssignment\"F\x82\xd3\xe4\x93\x02\x39\x12\x37/v1/{name=projects/*/locations/*/osPolicyAssignments/*}\xda\x41\x04name\x12\xd8\x01\n\x17ListOSPolicyAssignments\x12\x38.google.cloud.osconfig.v1.ListOSPolicyAssignmentsRequest\x1a\x39.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse\"H\x82\xd3\xe4\x93\x02\x39\x12\x37/v1/{parent=projects/*/locations/*}/osPolicyAssignments\xda\x41\x06parent\x12\xfc\x01\n\x1fListOSPolicyAssignmentRevisions\x12@.google.cloud.osconfig.v1.ListOSPolicyAssignmentRevisionsRequest\x1a\x41.google.cloud.osconfig.v1.ListOSPolicyAssignmentRevisionsResponse\"T\x82\xd3\xe4\x93\x02G\x12\x45/v1/{name=projects/*/locations/*/osPolicyAssignments/*}:listRevisions\xda\x41\x04name\x12\xfc\x01\n\x18\x44\x65leteOSPolicyAssignment\x12\x39.google.cloud.osconfig.v1.DeleteOSPolicyAssignmentRequest\x1a\x1d.google.longrunning.Operation\"\x85\x01\x82\xd3\xe4\x93\x02\x39*7/v1/{name=projects/*/locations/*/osPolicyAssignments/*}\xda\x41\x04name\xca\x41<\n\x15google.protobuf.Empty\x12#OSPolicyAssignmentOperationMetadata\x12\xea\x01\n\x1bGetOSPolicyAssignmentReport\x12<.google.cloud.osconfig.v1.GetOSPolicyAssignmentReportRequest\x1a\x32.google.cloud.osconfig.v1.OSPolicyAssignmentReport\"Y\x82\xd3\xe4\x93\x02L\x12J/v1/{name=projects/*/locations/*/instances/*/osPolicyAssignments/*/report}\xda\x41\x04name\x12\x80\x02\n\x1dListOSPolicyAssignmentReports\x12>.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsRequest\x1a?.google.cloud.osconfig.v1.ListOSPolicyAssignmentReportsResponse\"^\x82\xd3\xe4\x93\x02O\x12M/v1/{parent=projects/*/locations/*/instances/*/osPolicyAssignments/*}/reports\xda\x41\x06parent\x12\xaa\x01\n\x0cGetInventory\x12-.google.cloud.osconfig.v1.GetInventoryRequest\x1a#.google.cloud.osconfig.v1.Inventory\"F\x82\xd3\xe4\x93\x02\x39\x12\x37/v1/{name=projects/*/locations/*/instances/*/inventory}\xda\x41\x04name\x12\xc4\x01\n\x0fListInventories\x12\x30.google.cloud.osconfig.v1.ListInventoriesRequest\x1a\x31.google.cloud.osconfig.v1.ListInventoriesResponse\"L\x82\xd3\xe4\x93\x02=\x12;/v1/{parent=projects/*/locations/*/instances/*}/inventories\xda\x41\x06parent\x12\xd2\x01\n\x16GetVulnerabilityReport\x12\x37.google.cloud.osconfig.v1.GetVulnerabilityReportRequest\x1a-.google.cloud.osconfig.v1.VulnerabilityReport\"P\x82\xd3\xe4\x93\x02\x43\x12\x41/v1/{name=projects/*/locations/*/instances/*/vulnerabilityReport}\xda\x41\x04name\x12\xe8\x01\n\x18ListVulnerabilityReports\x12\x39.google.cloud.osconfig.v1.ListVulnerabilityReportsRequest\x1a:.google.cloud.osconfig.v1.ListVulnerabilityReportsResponse\"U\x82\xd3\xe4\x93\x02\x46\x12\x44/v1/{parent=projects/*/locations/*/instances/*}/vulnerabilityReports\xda\x41\x06parent\x1aK\xca\x41\x17osconfig.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd1\x01\n\x1c\x63om.google.cloud.osconfig.v1B\x19OsConfigZonalServiceProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/osconfig/v1;osconfig\xaa\x02\x18Google.Cloud.OsConfig.V1\xca\x02\x18Google\\Cloud\\OsConfig\\V1\xea\x02\x1bGoogle::Cloud::OsConfig::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.osconfig.v1.osconfig_zonal_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.osconfig.v1B\031OsConfigZonalServiceProtoP\001Z@google.golang.org/genproto/googleapis/cloud/osconfig/v1;osconfig\252\002\030Google.Cloud.OsConfig.V1\312\002\030Google\\Cloud\\OsConfig\\V1\352\002\033Google::Cloud::OsConfig::V1'
  _OSCONFIGZONALSERVICE._options = None
  _OSCONFIGZONALSERVICE._serialized_options = b'\312A\027osconfig.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _OSCONFIGZONALSERVICE.methods_by_name['CreateOSPolicyAssignment']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['CreateOSPolicyAssignment']._serialized_options = b'\202\323\344\223\002O\"7/v1/{parent=projects/*/locations/*}/osPolicyAssignments:\024os_policy_assignment\332A3parent,os_policy_assignment,os_policy_assignment_id\312A9\n\022OSPolicyAssignment\022#OSPolicyAssignmentOperationMetadata'
  _OSCONFIGZONALSERVICE.methods_by_name['UpdateOSPolicyAssignment']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['UpdateOSPolicyAssignment']._serialized_options = b'\202\323\344\223\002d2L/v1/{os_policy_assignment.name=projects/*/locations/*/osPolicyAssignments/*}:\024os_policy_assignment\332A os_policy_assignment,update_mask\312A9\n\022OSPolicyAssignment\022#OSPolicyAssignmentOperationMetadata'
  _OSCONFIGZONALSERVICE.methods_by_name['GetOSPolicyAssignment']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['GetOSPolicyAssignment']._serialized_options = b'\202\323\344\223\0029\0227/v1/{name=projects/*/locations/*/osPolicyAssignments/*}\332A\004name'
  _OSCONFIGZONALSERVICE.methods_by_name['ListOSPolicyAssignments']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['ListOSPolicyAssignments']._serialized_options = b'\202\323\344\223\0029\0227/v1/{parent=projects/*/locations/*}/osPolicyAssignments\332A\006parent'
  _OSCONFIGZONALSERVICE.methods_by_name['ListOSPolicyAssignmentRevisions']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['ListOSPolicyAssignmentRevisions']._serialized_options = b'\202\323\344\223\002G\022E/v1/{name=projects/*/locations/*/osPolicyAssignments/*}:listRevisions\332A\004name'
  _OSCONFIGZONALSERVICE.methods_by_name['DeleteOSPolicyAssignment']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['DeleteOSPolicyAssignment']._serialized_options = b'\202\323\344\223\0029*7/v1/{name=projects/*/locations/*/osPolicyAssignments/*}\332A\004name\312A<\n\025google.protobuf.Empty\022#OSPolicyAssignmentOperationMetadata'
  _OSCONFIGZONALSERVICE.methods_by_name['GetOSPolicyAssignmentReport']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['GetOSPolicyAssignmentReport']._serialized_options = b'\202\323\344\223\002L\022J/v1/{name=projects/*/locations/*/instances/*/osPolicyAssignments/*/report}\332A\004name'
  _OSCONFIGZONALSERVICE.methods_by_name['ListOSPolicyAssignmentReports']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['ListOSPolicyAssignmentReports']._serialized_options = b'\202\323\344\223\002O\022M/v1/{parent=projects/*/locations/*/instances/*/osPolicyAssignments/*}/reports\332A\006parent'
  _OSCONFIGZONALSERVICE.methods_by_name['GetInventory']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['GetInventory']._serialized_options = b'\202\323\344\223\0029\0227/v1/{name=projects/*/locations/*/instances/*/inventory}\332A\004name'
  _OSCONFIGZONALSERVICE.methods_by_name['ListInventories']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['ListInventories']._serialized_options = b'\202\323\344\223\002=\022;/v1/{parent=projects/*/locations/*/instances/*}/inventories\332A\006parent'
  _OSCONFIGZONALSERVICE.methods_by_name['GetVulnerabilityReport']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['GetVulnerabilityReport']._serialized_options = b'\202\323\344\223\002C\022A/v1/{name=projects/*/locations/*/instances/*/vulnerabilityReport}\332A\004name'
  _OSCONFIGZONALSERVICE.methods_by_name['ListVulnerabilityReports']._options = None
  _OSCONFIGZONALSERVICE.methods_by_name['ListVulnerabilityReports']._serialized_options = b'\202\323\344\223\002F\022D/v1/{parent=projects/*/locations/*/instances/*}/vulnerabilityReports\332A\006parent'
  _OSCONFIGZONALSERVICE._serialized_start=379
  _OSCONFIGZONALSERVICE._serialized_end=3367
# @@protoc_insertion_point(module_scope)
