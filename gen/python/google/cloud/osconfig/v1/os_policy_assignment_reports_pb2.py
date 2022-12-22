# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/v1/os_policy_assignment_reports.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/cloud/osconfig/v1/os_policy_assignment_reports.proto\x12\x18google.cloud.osconfig.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"l\n\"GetOSPolicyAssignmentReportRequest\x12\x46\n\x04name\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0osconfig.googleapis.com/OSPolicyAssignmentReport\"\xa9\x01\n$ListOSPolicyAssignmentReportsRequest\x12J\n\x06parent\x18\x01 \x01(\tB:\xe0\x41\x02\xfa\x41\x34\n2osconfig.googleapis.com/InstanceOSPolicyAssignment\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x12\n\npage_token\x18\x04 \x01(\t\"\x9a\x01\n%ListOSPolicyAssignmentReportsResponse\x12X\n\x1cos_policy_assignment_reports\x18\x01 \x03(\x0b\x32\x32.google.cloud.osconfig.v1.OSPolicyAssignmentReport\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xcd\x0e\n\x18OSPolicyAssignmentReport\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x10\n\x08instance\x18\x02 \x01(\t\x12M\n\x14os_policy_assignment\x18\x03 \x01(\tB/\xfa\x41,\n*osconfig.googleapis.com/OSPolicyAssignment\x12\x64\n\x15os_policy_compliances\x18\x04 \x03(\x0b\x32\x45.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance\x12/\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x13\n\x0blast_run_id\x18\x06 \x01(\t\x1a\xf6\n\n\x12OSPolicyCompliance\x12\x14\n\x0cos_policy_id\x18\x01 \x01(\t\x12o\n\x10\x63ompliance_state\x18\x02 \x01(\x0e\x32U.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance.ComplianceState\x12\x1f\n\x17\x63ompliance_state_reason\x18\x03 \x01(\t\x12\x88\x01\n\x1eos_policy_resource_compliances\x18\x04 \x03(\x0b\x32`.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance.OSPolicyResourceCompliance\x1a\xea\x07\n\x1aOSPolicyResourceCompliance\x12\x1d\n\x15os_policy_resource_id\x18\x01 \x01(\t\x12\x91\x01\n\x0c\x63onfig_steps\x18\x02 \x03(\x0b\x32{.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance.OSPolicyResourceCompliance.OSPolicyResourceConfigStep\x12\x8a\x01\n\x10\x63ompliance_state\x18\x03 \x01(\x0e\x32p.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance.OSPolicyResourceCompliance.ComplianceState\x12\x1f\n\x17\x63ompliance_state_reason\x18\x04 \x01(\t\x12\x93\x01\n\x14\x65xec_resource_output\x18\x05 \x01(\x0b\x32s.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance.OSPolicyResourceCompliance.ExecResourceOutputH\x00\x1a\xd6\x02\n\x1aOSPolicyResourceConfigStep\x12\x8f\x01\n\x04type\x18\x01 \x01(\x0e\x32\x80\x01.google.cloud.osconfig.v1.OSPolicyAssignmentReport.OSPolicyCompliance.OSPolicyResourceCompliance.OSPolicyResourceConfigStep.Type\x12\x15\n\rerror_message\x18\x02 \x01(\t\"\x8e\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nVALIDATION\x10\x01\x12\x17\n\x13\x44\x45SIRED_STATE_CHECK\x10\x02\x12\x1d\n\x19\x44\x45SIRED_STATE_ENFORCEMENT\x10\x03\x12(\n$DESIRED_STATE_CHECK_POST_ENFORCEMENT\x10\x04\x1a\x30\n\x12\x45xecResourceOutput\x12\x1a\n\x12\x65nforcement_output\x18\x02 \x01(\x0c\"@\n\x0f\x43omplianceState\x12\x0b\n\x07UNKNOWN\x10\x00\x12\r\n\tCOMPLIANT\x10\x01\x12\x11\n\rNON_COMPLIANT\x10\x02\x42\x08\n\x06output\"@\n\x0f\x43omplianceState\x12\x0b\n\x07UNKNOWN\x10\x00\x12\r\n\tCOMPLIANT\x10\x01\x12\x11\n\rNON_COMPLIANT\x10\x02:\x9c\x01\xea\x41\x98\x01\n0osconfig.googleapis.com/OSPolicyAssignmentReport\x12\x64projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/reportB\xed\x02\n\x1c\x63om.google.cloud.osconfig.v1B\x1eOSPolicyAssignmentReportsProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/osconfig/v1;osconfig\xaa\x02\x18Google.Cloud.OsConfig.V1\xca\x02\x18Google\\Cloud\\OsConfig\\V1\xea\x02\x1bGoogle::Cloud::OsConfig::V1\xea\x41\x93\x01\n2osconfig.googleapis.com/InstanceOSPolicyAssignment\x12]projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.osconfig.v1.os_policy_assignment_reports_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.osconfig.v1B\036OSPolicyAssignmentReportsProtoP\001Z@google.golang.org/genproto/googleapis/cloud/osconfig/v1;osconfig\252\002\030Google.Cloud.OsConfig.V1\312\002\030Google\\Cloud\\OsConfig\\V1\352\002\033Google::Cloud::OsConfig::V1\352A\223\001\n2osconfig.googleapis.com/InstanceOSPolicyAssignment\022]projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}'
  _GETOSPOLICYASSIGNMENTREPORTREQUEST.fields_by_name['name']._options = None
  _GETOSPOLICYASSIGNMENTREPORTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A2\n0osconfig.googleapis.com/OSPolicyAssignmentReport'
  _LISTOSPOLICYASSIGNMENTREPORTSREQUEST.fields_by_name['parent']._options = None
  _LISTOSPOLICYASSIGNMENTREPORTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A4\n2osconfig.googleapis.com/InstanceOSPolicyAssignment'
  _OSPOLICYASSIGNMENTREPORT.fields_by_name['os_policy_assignment']._options = None
  _OSPOLICYASSIGNMENTREPORT.fields_by_name['os_policy_assignment']._serialized_options = b'\372A,\n*osconfig.googleapis.com/OSPolicyAssignment'
  _OSPOLICYASSIGNMENTREPORT._options = None
  _OSPOLICYASSIGNMENTREPORT._serialized_options = b'\352A\230\001\n0osconfig.googleapis.com/OSPolicyAssignmentReport\022dprojects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report'
  _GETOSPOLICYASSIGNMENTREPORTREQUEST._serialized_start=182
  _GETOSPOLICYASSIGNMENTREPORTREQUEST._serialized_end=290
  _LISTOSPOLICYASSIGNMENTREPORTSREQUEST._serialized_start=293
  _LISTOSPOLICYASSIGNMENTREPORTSREQUEST._serialized_end=462
  _LISTOSPOLICYASSIGNMENTREPORTSRESPONSE._serialized_start=465
  _LISTOSPOLICYASSIGNMENTREPORTSRESPONSE._serialized_end=619
  _OSPOLICYASSIGNMENTREPORT._serialized_start=622
  _OSPOLICYASSIGNMENTREPORT._serialized_end=2491
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE._serialized_start=934
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE._serialized_end=2332
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE._serialized_start=1264
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE._serialized_end=2266
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_OSPOLICYRESOURCECONFIGSTEP._serialized_start=1798
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_OSPOLICYRESOURCECONFIGSTEP._serialized_end=2140
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_OSPOLICYRESOURCECONFIGSTEP_TYPE._serialized_start=1998
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_OSPOLICYRESOURCECONFIGSTEP_TYPE._serialized_end=2140
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT._serialized_start=2142
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT._serialized_end=2190
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_COMPLIANCESTATE._serialized_start=2192
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_OSPOLICYRESOURCECOMPLIANCE_COMPLIANCESTATE._serialized_end=2256
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_COMPLIANCESTATE._serialized_start=2192
  _OSPOLICYASSIGNMENTREPORT_OSPOLICYCOMPLIANCE_COMPLIANCESTATE._serialized_end=2256
# @@protoc_insertion_point(module_scope)