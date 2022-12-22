# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/admin/instance/v1/spanner_instance_admin.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.spanner.admin.instance.v1 import common_pb2 as google_dot_spanner_dot_admin_dot_instance_dot_v1_dot_common__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n=google/spanner/admin/instance/v1/spanner_instance_admin.proto\x12 google.spanner.admin.instance.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a-google/spanner/admin/instance/v1/common.proto\"\xda\x01\n\x0bReplicaInfo\x12\x10\n\x08location\x18\x01 \x01(\t\x12G\n\x04type\x18\x02 \x01(\x0e\x32\x39.google.spanner.admin.instance.v1.ReplicaInfo.ReplicaType\x12\x1f\n\x17\x64\x65\x66\x61ult_leader_location\x18\x03 \x01(\x08\"O\n\x0bReplicaType\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nREAD_WRITE\x10\x01\x12\r\n\tREAD_ONLY\x10\x02\x12\x0b\n\x07WITNESS\x10\x03\"\xbe\x06\n\x0eInstanceConfig\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12O\n\x0b\x63onfig_type\x18\x05 \x01(\x0e\x32\x35.google.spanner.admin.instance.v1.InstanceConfig.TypeB\x03\xe0\x41\x03\x12?\n\x08replicas\x18\x03 \x03(\x0b\x32-.google.spanner.admin.instance.v1.ReplicaInfo\x12M\n\x11optional_replicas\x18\x06 \x03(\x0b\x32-.google.spanner.admin.instance.v1.ReplicaInfoB\x03\xe0\x41\x03\x12?\n\x0b\x62\x61se_config\x18\x07 \x01(\tB*\xfa\x41\'\n%spanner.googleapis.com/InstanceConfig\x12L\n\x06labels\x18\x08 \x03(\x0b\x32<.google.spanner.admin.instance.v1.InstanceConfig.LabelsEntry\x12\x0c\n\x04\x65tag\x18\t \x01(\t\x12\x16\n\x0eleader_options\x18\x04 \x03(\t\x12\x18\n\x0breconciling\x18\n \x01(\x08\x42\x03\xe0\x41\x03\x12J\n\x05state\x18\x0b \x01(\x0e\x32\x36.google.spanner.admin.instance.v1.InstanceConfig.StateB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"B\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x12\n\x0eGOOGLE_MANAGED\x10\x01\x12\x10\n\x0cUSER_MANAGED\x10\x02\"7\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02:`\xea\x41]\n%spanner.googleapis.com/InstanceConfig\x12\x34projects/{project}/instanceConfigs/{instance_config}\"\xed\x04\n\x08Instance\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12=\n\x06\x63onfig\x18\x02 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%spanner.googleapis.com/InstanceConfig\x12\x19\n\x0c\x64isplay_name\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\nnode_count\x18\x05 \x01(\x05\x12\x18\n\x10processing_units\x18\t \x01(\x05\x12\x44\n\x05state\x18\x06 \x01(\x0e\x32\x30.google.spanner.admin.instance.v1.Instance.StateB\x03\xe0\x41\x03\x12\x46\n\x06labels\x18\x07 \x03(\x0b\x32\x36.google.spanner.admin.instance.v1.Instance.LabelsEntry\x12\x15\n\rendpoint_uris\x18\x08 \x03(\t\x12\x34\n\x0b\x63reate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"7\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02:M\xea\x41J\n\x1fspanner.googleapis.com/Instance\x12\'projects/{project}/instances/{instance}\"\x88\x01\n\x1aListInstanceConfigsRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x82\x01\n\x1bListInstanceConfigsResponse\x12J\n\x10instance_configs\x18\x01 \x03(\x0b\x32\x30.google.spanner.admin.instance.v1.InstanceConfig\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"W\n\x18GetInstanceConfigRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%spanner.googleapis.com/InstanceConfig\"\xea\x01\n\x1b\x43reateInstanceConfigRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12\x1f\n\x12instance_config_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12N\n\x0finstance_config\x18\x03 \x01(\x0b\x32\x30.google.spanner.admin.instance.v1.InstanceConfigB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xba\x01\n\x1bUpdateInstanceConfigRequest\x12N\n\x0finstance_config\x18\x01 \x01(\x0b\x32\x30.google.spanner.admin.instance.v1.InstanceConfigB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"\x7f\n\x1b\x44\x65leteInstanceConfigRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%spanner.googleapis.com/InstanceConfig\x12\x0c\n\x04\x65tag\x18\x02 \x01(\t\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"\xa1\x01\n#ListInstanceConfigOperationsRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\"r\n$ListInstanceConfigOperationsResponse\x12\x31\n\noperations\x18\x01 \x03(\x0b\x32\x1d.google.longrunning.Operation\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"{\n\x12GetInstanceRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1fspanner.googleapis.com/Instance\x12.\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xb9\x01\n\x15\x43reateInstanceRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12\x18\n\x0binstance_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x41\n\x08instance\x18\x03 \x01(\x0b\x32*.google.spanner.admin.instance.v1.InstanceB\x03\xe0\x41\x02\"\x92\x01\n\x14ListInstancesRequest\x12\x43\n\x06parent\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+cloudresourcemanager.googleapis.com/Project\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"o\n\x15ListInstancesResponse\x12=\n\tinstances\x18\x01 \x03(\x0b\x32*.google.spanner.admin.instance.v1.Instance\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8f\x01\n\x15UpdateInstanceRequest\x12\x41\n\x08instance\x18\x01 \x01(\x0b\x32*.google.spanner.admin.instance.v1.InstanceB\x03\xe0\x41\x02\x12\x33\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"N\n\x15\x44\x65leteInstanceRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1fspanner.googleapis.com/Instance\"\xe5\x01\n\x16\x43reateInstanceMetadata\x12<\n\x08instance\x18\x01 \x01(\x0b\x32*.google.spanner.admin.instance.v1.Instance\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x63\x61ncel_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xe5\x01\n\x16UpdateInstanceMetadata\x12<\n\x08instance\x18\x01 \x01(\x0b\x32*.google.spanner.admin.instance.v1.Instance\x12.\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0b\x63\x61ncel_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xe1\x01\n\x1c\x43reateInstanceConfigMetadata\x12I\n\x0finstance_config\x18\x01 \x01(\x0b\x32\x30.google.spanner.admin.instance.v1.InstanceConfig\x12\x45\n\x08progress\x18\x02 \x01(\x0b\x32\x33.google.spanner.admin.instance.v1.OperationProgress\x12/\n\x0b\x63\x61ncel_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xe1\x01\n\x1cUpdateInstanceConfigMetadata\x12I\n\x0finstance_config\x18\x01 \x01(\x0b\x32\x30.google.spanner.admin.instance.v1.InstanceConfig\x12\x45\n\x08progress\x18\x02 \x01(\x0b\x32\x33.google.spanner.admin.instance.v1.OperationProgress\x12/\n\x0b\x63\x61ncel_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp2\xf2\x18\n\rInstanceAdmin\x12\xcc\x01\n\x13ListInstanceConfigs\x12<.google.spanner.admin.instance.v1.ListInstanceConfigsRequest\x1a=.google.spanner.admin.instance.v1.ListInstanceConfigsResponse\"8\x82\xd3\xe4\x93\x02)\x12\'/v1/{parent=projects/*}/instanceConfigs\xda\x41\x06parent\x12\xb9\x01\n\x11GetInstanceConfig\x12:.google.spanner.admin.instance.v1.GetInstanceConfigRequest\x1a\x30.google.spanner.admin.instance.v1.InstanceConfig\"6\x82\xd3\xe4\x93\x02)\x12\'/v1/{name=projects/*/instanceConfigs/*}\xda\x41\x04name\x12\xc8\x02\n\x14\x43reateInstanceConfig\x12=.google.spanner.admin.instance.v1.CreateInstanceConfigRequest\x1a\x1d.google.longrunning.Operation\"\xd1\x01\x82\xd3\xe4\x93\x02,\"\'/v1/{parent=projects/*}/instanceConfigs:\x01*\xda\x41)parent,instance_config,instance_config_id\xca\x41p\n/google.spanner.admin.instance.v1.InstanceConfig\x12=google.spanner.admin.instance.v1.CreateInstanceConfigMetadata\x12\xca\x02\n\x14UpdateInstanceConfig\x12=.google.spanner.admin.instance.v1.UpdateInstanceConfigRequest\x1a\x1d.google.longrunning.Operation\"\xd3\x01\x82\xd3\xe4\x93\x02<27/v1/{instance_config.name=projects/*/instanceConfigs/*}:\x01*\xda\x41\x1binstance_config,update_mask\xca\x41p\n/google.spanner.admin.instance.v1.InstanceConfig\x12=google.spanner.admin.instance.v1.UpdateInstanceConfigMetadata\x12\xa5\x01\n\x14\x44\x65leteInstanceConfig\x12=.google.spanner.admin.instance.v1.DeleteInstanceConfigRequest\x1a\x16.google.protobuf.Empty\"6\x82\xd3\xe4\x93\x02)*\'/v1/{name=projects/*/instanceConfigs/*}\xda\x41\x04name\x12\xf0\x01\n\x1cListInstanceConfigOperations\x12\x45.google.spanner.admin.instance.v1.ListInstanceConfigOperationsRequest\x1a\x46.google.spanner.admin.instance.v1.ListInstanceConfigOperationsResponse\"A\x82\xd3\xe4\x93\x02\x32\x12\x30/v1/{parent=projects/*}/instanceConfigOperations\xda\x41\x06parent\x12\xb4\x01\n\rListInstances\x12\x36.google.spanner.admin.instance.v1.ListInstancesRequest\x1a\x37.google.spanner.admin.instance.v1.ListInstancesResponse\"2\x82\xd3\xe4\x93\x02#\x12!/v1/{parent=projects/*}/instances\xda\x41\x06parent\x12\xa1\x01\n\x0bGetInstance\x12\x34.google.spanner.admin.instance.v1.GetInstanceRequest\x1a*.google.spanner.admin.instance.v1.Instance\"0\x82\xd3\xe4\x93\x02#\x12!/v1/{name=projects/*/instances/*}\xda\x41\x04name\x12\x9c\x02\n\x0e\x43reateInstance\x12\x37.google.spanner.admin.instance.v1.CreateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\xb1\x01\x82\xd3\xe4\x93\x02&\"!/v1/{parent=projects/*}/instances:\x01*\xda\x41\x1bparent,instance_id,instance\xca\x41\x64\n)google.spanner.admin.instance.v1.Instance\x12\x37google.spanner.admin.instance.v1.CreateInstanceMetadata\x12\x9d\x02\n\x0eUpdateInstance\x12\x37.google.spanner.admin.instance.v1.UpdateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\xb2\x01\x82\xd3\xe4\x93\x02/2*/v1/{instance.name=projects/*/instances/*}:\x01*\xda\x41\x13instance,field_mask\xca\x41\x64\n)google.spanner.admin.instance.v1.Instance\x12\x37google.spanner.admin.instance.v1.UpdateInstanceMetadata\x12\x93\x01\n\x0e\x44\x65leteInstance\x12\x37.google.spanner.admin.instance.v1.DeleteInstanceRequest\x1a\x16.google.protobuf.Empty\"0\x82\xd3\xe4\x93\x02#*!/v1/{name=projects/*/instances/*}\xda\x41\x04name\x12\x9a\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"O\x82\xd3\xe4\x93\x02\x37\"2/v1/{resource=projects/*/instances/*}:setIamPolicy:\x01*\xda\x41\x0fresource,policy\x12\x93\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"H\x82\xd3\xe4\x93\x02\x37\"2/v1/{resource=projects/*/instances/*}:getIamPolicy:\x01*\xda\x41\x08resource\x12\xc5\x01\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"Z\x82\xd3\xe4\x93\x02=\"8/v1/{resource=projects/*/instances/*}:testIamPermissions:\x01*\xda\x41\x14resource,permissions\x1ax\xca\x41\x16spanner.googleapis.com\xd2\x41\\https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/spanner.adminB\x8d\x02\n$com.google.spanner.admin.instance.v1B\x19SpannerInstanceAdminProtoP\x01ZHgoogle.golang.org/genproto/googleapis/spanner/admin/instance/v1;instance\xaa\x02&Google.Cloud.Spanner.Admin.Instance.V1\xca\x02&Google\\Cloud\\Spanner\\Admin\\Instance\\V1\xea\x02+Google::Cloud::Spanner::Admin::Instance::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.spanner.admin.instance.v1.spanner_instance_admin_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.spanner.admin.instance.v1B\031SpannerInstanceAdminProtoP\001ZHgoogle.golang.org/genproto/googleapis/spanner/admin/instance/v1;instance\252\002&Google.Cloud.Spanner.Admin.Instance.V1\312\002&Google\\Cloud\\Spanner\\Admin\\Instance\\V1\352\002+Google::Cloud::Spanner::Admin::Instance::V1'
  _INSTANCECONFIG_LABELSENTRY._options = None
  _INSTANCECONFIG_LABELSENTRY._serialized_options = b'8\001'
  _INSTANCECONFIG.fields_by_name['config_type']._options = None
  _INSTANCECONFIG.fields_by_name['config_type']._serialized_options = b'\340A\003'
  _INSTANCECONFIG.fields_by_name['optional_replicas']._options = None
  _INSTANCECONFIG.fields_by_name['optional_replicas']._serialized_options = b'\340A\003'
  _INSTANCECONFIG.fields_by_name['base_config']._options = None
  _INSTANCECONFIG.fields_by_name['base_config']._serialized_options = b'\372A\'\n%spanner.googleapis.com/InstanceConfig'
  _INSTANCECONFIG.fields_by_name['reconciling']._options = None
  _INSTANCECONFIG.fields_by_name['reconciling']._serialized_options = b'\340A\003'
  _INSTANCECONFIG.fields_by_name['state']._options = None
  _INSTANCECONFIG.fields_by_name['state']._serialized_options = b'\340A\003'
  _INSTANCECONFIG._options = None
  _INSTANCECONFIG._serialized_options = b'\352A]\n%spanner.googleapis.com/InstanceConfig\0224projects/{project}/instanceConfigs/{instance_config}'
  _INSTANCE_LABELSENTRY._options = None
  _INSTANCE_LABELSENTRY._serialized_options = b'8\001'
  _INSTANCE.fields_by_name['name']._options = None
  _INSTANCE.fields_by_name['name']._serialized_options = b'\340A\002'
  _INSTANCE.fields_by_name['config']._options = None
  _INSTANCE.fields_by_name['config']._serialized_options = b'\340A\002\372A\'\n%spanner.googleapis.com/InstanceConfig'
  _INSTANCE.fields_by_name['display_name']._options = None
  _INSTANCE.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _INSTANCE.fields_by_name['state']._options = None
  _INSTANCE.fields_by_name['state']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['create_time']._options = None
  _INSTANCE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['update_time']._options = None
  _INSTANCE.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _INSTANCE._options = None
  _INSTANCE._serialized_options = b'\352AJ\n\037spanner.googleapis.com/Instance\022\'projects/{project}/instances/{instance}'
  _LISTINSTANCECONFIGSREQUEST.fields_by_name['parent']._options = None
  _LISTINSTANCECONFIGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _GETINSTANCECONFIGREQUEST.fields_by_name['name']._options = None
  _GETINSTANCECONFIGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%spanner.googleapis.com/InstanceConfig'
  _CREATEINSTANCECONFIGREQUEST.fields_by_name['parent']._options = None
  _CREATEINSTANCECONFIGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _CREATEINSTANCECONFIGREQUEST.fields_by_name['instance_config_id']._options = None
  _CREATEINSTANCECONFIGREQUEST.fields_by_name['instance_config_id']._serialized_options = b'\340A\002'
  _CREATEINSTANCECONFIGREQUEST.fields_by_name['instance_config']._options = None
  _CREATEINSTANCECONFIGREQUEST.fields_by_name['instance_config']._serialized_options = b'\340A\002'
  _UPDATEINSTANCECONFIGREQUEST.fields_by_name['instance_config']._options = None
  _UPDATEINSTANCECONFIGREQUEST.fields_by_name['instance_config']._serialized_options = b'\340A\002'
  _UPDATEINSTANCECONFIGREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEINSTANCECONFIGREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _DELETEINSTANCECONFIGREQUEST.fields_by_name['name']._options = None
  _DELETEINSTANCECONFIGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%spanner.googleapis.com/InstanceConfig'
  _LISTINSTANCECONFIGOPERATIONSREQUEST.fields_by_name['parent']._options = None
  _LISTINSTANCECONFIGOPERATIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _GETINSTANCEREQUEST.fields_by_name['name']._options = None
  _GETINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037spanner.googleapis.com/Instance'
  _CREATEINSTANCEREQUEST.fields_by_name['parent']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _CREATEINSTANCEREQUEST.fields_by_name['instance_id']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['instance_id']._serialized_options = b'\340A\002'
  _CREATEINSTANCEREQUEST.fields_by_name['instance']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['instance']._serialized_options = b'\340A\002'
  _LISTINSTANCESREQUEST.fields_by_name['parent']._options = None
  _LISTINSTANCESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A-\n+cloudresourcemanager.googleapis.com/Project'
  _UPDATEINSTANCEREQUEST.fields_by_name['instance']._options = None
  _UPDATEINSTANCEREQUEST.fields_by_name['instance']._serialized_options = b'\340A\002'
  _UPDATEINSTANCEREQUEST.fields_by_name['field_mask']._options = None
  _UPDATEINSTANCEREQUEST.fields_by_name['field_mask']._serialized_options = b'\340A\002'
  _DELETEINSTANCEREQUEST.fields_by_name['name']._options = None
  _DELETEINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037spanner.googleapis.com/Instance'
  _INSTANCEADMIN._options = None
  _INSTANCEADMIN._serialized_options = b'\312A\026spanner.googleapis.com\322A\\https://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/spanner.admin'
  _INSTANCEADMIN.methods_by_name['ListInstanceConfigs']._options = None
  _INSTANCEADMIN.methods_by_name['ListInstanceConfigs']._serialized_options = b'\202\323\344\223\002)\022\'/v1/{parent=projects/*}/instanceConfigs\332A\006parent'
  _INSTANCEADMIN.methods_by_name['GetInstanceConfig']._options = None
  _INSTANCEADMIN.methods_by_name['GetInstanceConfig']._serialized_options = b'\202\323\344\223\002)\022\'/v1/{name=projects/*/instanceConfigs/*}\332A\004name'
  _INSTANCEADMIN.methods_by_name['CreateInstanceConfig']._options = None
  _INSTANCEADMIN.methods_by_name['CreateInstanceConfig']._serialized_options = b'\202\323\344\223\002,\"\'/v1/{parent=projects/*}/instanceConfigs:\001*\332A)parent,instance_config,instance_config_id\312Ap\n/google.spanner.admin.instance.v1.InstanceConfig\022=google.spanner.admin.instance.v1.CreateInstanceConfigMetadata'
  _INSTANCEADMIN.methods_by_name['UpdateInstanceConfig']._options = None
  _INSTANCEADMIN.methods_by_name['UpdateInstanceConfig']._serialized_options = b'\202\323\344\223\002<27/v1/{instance_config.name=projects/*/instanceConfigs/*}:\001*\332A\033instance_config,update_mask\312Ap\n/google.spanner.admin.instance.v1.InstanceConfig\022=google.spanner.admin.instance.v1.UpdateInstanceConfigMetadata'
  _INSTANCEADMIN.methods_by_name['DeleteInstanceConfig']._options = None
  _INSTANCEADMIN.methods_by_name['DeleteInstanceConfig']._serialized_options = b'\202\323\344\223\002)*\'/v1/{name=projects/*/instanceConfigs/*}\332A\004name'
  _INSTANCEADMIN.methods_by_name['ListInstanceConfigOperations']._options = None
  _INSTANCEADMIN.methods_by_name['ListInstanceConfigOperations']._serialized_options = b'\202\323\344\223\0022\0220/v1/{parent=projects/*}/instanceConfigOperations\332A\006parent'
  _INSTANCEADMIN.methods_by_name['ListInstances']._options = None
  _INSTANCEADMIN.methods_by_name['ListInstances']._serialized_options = b'\202\323\344\223\002#\022!/v1/{parent=projects/*}/instances\332A\006parent'
  _INSTANCEADMIN.methods_by_name['GetInstance']._options = None
  _INSTANCEADMIN.methods_by_name['GetInstance']._serialized_options = b'\202\323\344\223\002#\022!/v1/{name=projects/*/instances/*}\332A\004name'
  _INSTANCEADMIN.methods_by_name['CreateInstance']._options = None
  _INSTANCEADMIN.methods_by_name['CreateInstance']._serialized_options = b'\202\323\344\223\002&\"!/v1/{parent=projects/*}/instances:\001*\332A\033parent,instance_id,instance\312Ad\n)google.spanner.admin.instance.v1.Instance\0227google.spanner.admin.instance.v1.CreateInstanceMetadata'
  _INSTANCEADMIN.methods_by_name['UpdateInstance']._options = None
  _INSTANCEADMIN.methods_by_name['UpdateInstance']._serialized_options = b'\202\323\344\223\002/2*/v1/{instance.name=projects/*/instances/*}:\001*\332A\023instance,field_mask\312Ad\n)google.spanner.admin.instance.v1.Instance\0227google.spanner.admin.instance.v1.UpdateInstanceMetadata'
  _INSTANCEADMIN.methods_by_name['DeleteInstance']._options = None
  _INSTANCEADMIN.methods_by_name['DeleteInstance']._serialized_options = b'\202\323\344\223\002#*!/v1/{name=projects/*/instances/*}\332A\004name'
  _INSTANCEADMIN.methods_by_name['SetIamPolicy']._options = None
  _INSTANCEADMIN.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\0027\"2/v1/{resource=projects/*/instances/*}:setIamPolicy:\001*\332A\017resource,policy'
  _INSTANCEADMIN.methods_by_name['GetIamPolicy']._options = None
  _INSTANCEADMIN.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\0027\"2/v1/{resource=projects/*/instances/*}:getIamPolicy:\001*\332A\010resource'
  _INSTANCEADMIN.methods_by_name['TestIamPermissions']._options = None
  _INSTANCEADMIN.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002=\"8/v1/{resource=projects/*/instances/*}:testIamPermissions:\001*\332A\024resource,permissions'
  _REPLICAINFO._serialized_start=455
  _REPLICAINFO._serialized_end=673
  _REPLICAINFO_REPLICATYPE._serialized_start=594
  _REPLICAINFO_REPLICATYPE._serialized_end=673
  _INSTANCECONFIG._serialized_start=676
  _INSTANCECONFIG._serialized_end=1506
  _INSTANCECONFIG_LABELSENTRY._serialized_start=1238
  _INSTANCECONFIG_LABELSENTRY._serialized_end=1283
  _INSTANCECONFIG_TYPE._serialized_start=1285
  _INSTANCECONFIG_TYPE._serialized_end=1351
  _INSTANCECONFIG_STATE._serialized_start=1353
  _INSTANCECONFIG_STATE._serialized_end=1408
  _INSTANCE._serialized_start=1509
  _INSTANCE._serialized_end=2130
  _INSTANCE_LABELSENTRY._serialized_start=1238
  _INSTANCE_LABELSENTRY._serialized_end=1283
  _INSTANCE_STATE._serialized_start=1353
  _INSTANCE_STATE._serialized_end=1408
  _LISTINSTANCECONFIGSREQUEST._serialized_start=2133
  _LISTINSTANCECONFIGSREQUEST._serialized_end=2269
  _LISTINSTANCECONFIGSRESPONSE._serialized_start=2272
  _LISTINSTANCECONFIGSRESPONSE._serialized_end=2402
  _GETINSTANCECONFIGREQUEST._serialized_start=2404
  _GETINSTANCECONFIGREQUEST._serialized_end=2491
  _CREATEINSTANCECONFIGREQUEST._serialized_start=2494
  _CREATEINSTANCECONFIGREQUEST._serialized_end=2728
  _UPDATEINSTANCECONFIGREQUEST._serialized_start=2731
  _UPDATEINSTANCECONFIGREQUEST._serialized_end=2917
  _DELETEINSTANCECONFIGREQUEST._serialized_start=2919
  _DELETEINSTANCECONFIGREQUEST._serialized_end=3046
  _LISTINSTANCECONFIGOPERATIONSREQUEST._serialized_start=3049
  _LISTINSTANCECONFIGOPERATIONSREQUEST._serialized_end=3210
  _LISTINSTANCECONFIGOPERATIONSRESPONSE._serialized_start=3212
  _LISTINSTANCECONFIGOPERATIONSRESPONSE._serialized_end=3326
  _GETINSTANCEREQUEST._serialized_start=3328
  _GETINSTANCEREQUEST._serialized_end=3451
  _CREATEINSTANCEREQUEST._serialized_start=3454
  _CREATEINSTANCEREQUEST._serialized_end=3639
  _LISTINSTANCESREQUEST._serialized_start=3642
  _LISTINSTANCESREQUEST._serialized_end=3788
  _LISTINSTANCESRESPONSE._serialized_start=3790
  _LISTINSTANCESRESPONSE._serialized_end=3901
  _UPDATEINSTANCEREQUEST._serialized_start=3904
  _UPDATEINSTANCEREQUEST._serialized_end=4047
  _DELETEINSTANCEREQUEST._serialized_start=4049
  _DELETEINSTANCEREQUEST._serialized_end=4127
  _CREATEINSTANCEMETADATA._serialized_start=4130
  _CREATEINSTANCEMETADATA._serialized_end=4359
  _UPDATEINSTANCEMETADATA._serialized_start=4362
  _UPDATEINSTANCEMETADATA._serialized_end=4591
  _CREATEINSTANCECONFIGMETADATA._serialized_start=4594
  _CREATEINSTANCECONFIGMETADATA._serialized_end=4819
  _UPDATEINSTANCECONFIGMETADATA._serialized_start=4822
  _UPDATEINSTANCECONFIGMETADATA._serialized_end=5047
  _INSTANCEADMIN._serialized_start=5050
  _INSTANCEADMIN._serialized_end=8236
# @@protoc_insertion_point(module_scope)