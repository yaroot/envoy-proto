# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/v1alpha/config_common.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/osconfig/v1alpha/config_common.proto\x12\x1dgoogle.cloud.osconfig.v1alpha\"\xb1\x03\n\x1aOSPolicyResourceConfigStep\x12L\n\x04type\x18\x01 \x01(\x0e\x32>.google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.Type\x12R\n\x07outcome\x18\x02 \x01(\x0e\x32\x41.google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep.Outcome\x12\x15\n\rerror_message\x18\x03 \x01(\t\"\x92\x01\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nVALIDATION\x10\x01\x12\x17\n\x13\x44\x45SIRED_STATE_CHECK\x10\x02\x12\x1d\n\x19\x44\x45SIRED_STATE_ENFORCEMENT\x10\x03\x12(\n$DESIRED_STATE_CHECK_POST_ENFORCEMENT\x10\x04\x1a\x02\x18\x01\"A\n\x07Outcome\x12\x17\n\x13OUTCOME_UNSPECIFIED\x10\x00\x12\r\n\tSUCCEEDED\x10\x01\x12\n\n\x06\x46\x41ILED\x10\x02\x1a\x02\x18\x01:\x02\x18\x01\"\x85\x03\n\x1aOSPolicyResourceCompliance\x12\x1d\n\x15os_policy_resource_id\x18\x01 \x01(\t\x12O\n\x0c\x63onfig_steps\x18\x02 \x03(\x0b\x32\x39.google.cloud.osconfig.v1alpha.OSPolicyResourceConfigStep\x12\x45\n\x05state\x18\x03 \x01(\x0e\x32\x36.google.cloud.osconfig.v1alpha.OSPolicyComplianceState\x12l\n\x14\x65xec_resource_output\x18\x04 \x01(\x0b\x32L.google.cloud.osconfig.v1alpha.OSPolicyResourceCompliance.ExecResourceOutputH\x00\x1a\x34\n\x12\x45xecResourceOutput\x12\x1a\n\x12\x65nforcement_output\x18\x02 \x01(\x0c:\x02\x18\x01:\x02\x18\x01\x42\x08\n\x06output*\x97\x01\n\x17OSPolicyComplianceState\x12*\n&OS_POLICY_COMPLIANCE_STATE_UNSPECIFIED\x10\x00\x12\r\n\tCOMPLIANT\x10\x01\x12\x11\n\rNON_COMPLIANT\x10\x02\x12\x0b\n\x07UNKNOWN\x10\x03\x12\x1d\n\x19NO_OS_POLICIES_APPLICABLE\x10\x04\x1a\x02\x18\x01\x42\xe2\x01\n!com.google.cloud.osconfig.v1alphaB\x11\x43onfigCommonProtoP\x01ZEgoogle.golang.org/genproto/googleapis/cloud/osconfig/v1alpha;osconfig\xaa\x02\x1dGoogle.Cloud.OsConfig.V1Alpha\xca\x02\x1dGoogle\\Cloud\\OsConfig\\V1alpha\xea\x02 Google::Cloud::OsConfig::V1alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.osconfig.v1alpha.config_common_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.osconfig.v1alphaB\021ConfigCommonProtoP\001ZEgoogle.golang.org/genproto/googleapis/cloud/osconfig/v1alpha;osconfig\252\002\035Google.Cloud.OsConfig.V1Alpha\312\002\035Google\\Cloud\\OsConfig\\V1alpha\352\002 Google::Cloud::OsConfig::V1alpha'
  _OSPOLICYCOMPLIANCESTATE._options = None
  _OSPOLICYCOMPLIANCESTATE._serialized_options = b'\030\001'
  _OSPOLICYRESOURCECONFIGSTEP_TYPE._options = None
  _OSPOLICYRESOURCECONFIGSTEP_TYPE._serialized_options = b'\030\001'
  _OSPOLICYRESOURCECONFIGSTEP_OUTCOME._options = None
  _OSPOLICYRESOURCECONFIGSTEP_OUTCOME._serialized_options = b'\030\001'
  _OSPOLICYRESOURCECONFIGSTEP._options = None
  _OSPOLICYRESOURCECONFIGSTEP._serialized_options = b'\030\001'
  _OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT._options = None
  _OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT._serialized_options = b'\030\001'
  _OSPOLICYRESOURCECOMPLIANCE._options = None
  _OSPOLICYRESOURCECOMPLIANCE._serialized_options = b'\030\001'
  _OSPOLICYCOMPLIANCESTATE._serialized_start=913
  _OSPOLICYCOMPLIANCESTATE._serialized_end=1064
  _OSPOLICYRESOURCECONFIGSTEP._serialized_start=85
  _OSPOLICYRESOURCECONFIGSTEP._serialized_end=518
  _OSPOLICYRESOURCECONFIGSTEP_TYPE._serialized_start=301
  _OSPOLICYRESOURCECONFIGSTEP_TYPE._serialized_end=447
  _OSPOLICYRESOURCECONFIGSTEP_OUTCOME._serialized_start=449
  _OSPOLICYRESOURCECONFIGSTEP_OUTCOME._serialized_end=514
  _OSPOLICYRESOURCECOMPLIANCE._serialized_start=521
  _OSPOLICYRESOURCECOMPLIANCE._serialized_end=910
  _OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT._serialized_start=844
  _OSPOLICYRESOURCECOMPLIANCE_EXECRESOURCEOUTPUT._serialized_end=896
# @@protoc_insertion_point(module_scope)
