# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datafusion/v1beta1/v1beta1.proto
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
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-google/cloud/datafusion/v1beta1/v1beta1.proto\x12\x1fgoogle.cloud.datafusion.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"7\n\rNetworkConfig\x12\x0f\n\x07network\x18\x01 \x01(\t\x12\x15\n\rip_allocation\x18\x02 \x01(\t\"\xe2\x01\n\x07Version\x12\x16\n\x0eversion_number\x18\x01 \x01(\t\x12\x17\n\x0f\x64\x65\x66\x61ult_version\x18\x02 \x01(\x08\x12\x1a\n\x12\x61vailable_features\x18\x03 \x03(\t\x12;\n\x04type\x18\x04 \x01(\x0e\x32-.google.cloud.datafusion.v1beta1.Version.Type\"M\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\x10\n\x0cTYPE_PREVIEW\x10\x01\x12\x1d\n\x19TYPE_GENERAL_AVAILABILITY\x10\x02\"\xb3\x01\n\x0b\x41\x63\x63\x65lerator\x12V\n\x10\x61\x63\x63\x65lerator_type\x18\x01 \x01(\x0e\x32<.google.cloud.datafusion.v1beta1.Accelerator.AcceleratorType\"L\n\x0f\x41\x63\x63\x65leratorType\x12 \n\x1c\x41\x43\x43\x45LERATOR_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03\x43\x44\x43\x10\x01\x12\x0e\n\nHEALTHCARE\x10\x02\"P\n\x0f\x43ryptoKeyConfig\x12=\n\rkey_reference\x18\x01 \x01(\tB&\xfa\x41#\n!cloudkms.googleapis.com/CryptoKey\"\x80\x0e\n\x08Instance\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"datafusion.googleapis.com/Instance\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\x41\n\x04type\x18\x03 \x01(\x0e\x32..google.cloud.datafusion.v1beta1.Instance.TypeB\x03\xe0\x41\x02\x12\"\n\x1a\x65nable_stackdriver_logging\x18\x04 \x01(\x08\x12%\n\x1d\x65nable_stackdriver_monitoring\x18\x05 \x01(\x08\x12\x18\n\x10private_instance\x18\x06 \x01(\x08\x12\x46\n\x0enetwork_config\x18\x07 \x01(\x0b\x32..google.cloud.datafusion.v1beta1.NetworkConfig\x12\x45\n\x06labels\x18\x08 \x03(\x0b\x32\x35.google.cloud.datafusion.v1beta1.Instance.LabelsEntry\x12G\n\x07options\x18\t \x03(\x0b\x32\x36.google.cloud.datafusion.v1beta1.Instance.OptionsEntry\x12\x34\n\x0b\x63reate_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x43\n\x05state\x18\x0c \x01(\x0e\x32/.google.cloud.datafusion.v1beta1.Instance.StateB\x03\xe0\x41\x03\x12\x1a\n\rstate_message\x18\r \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10service_endpoint\x18\x0e \x01(\tB\x03\xe0\x41\x03\x12\x0c\n\x04zone\x18\x0f \x01(\t\x12\x0f\n\x07version\x18\x10 \x01(\t\x12\x1e\n\x0fservice_account\x18\x11 \x01(\tB\x05\x18\x01\xe0\x41\x03\x12\x14\n\x0c\x64isplay_name\x18\x12 \x01(\t\x12\x43\n\x11\x61vailable_version\x18\x13 \x03(\x0b\x32(.google.cloud.datafusion.v1beta1.Version\x12\x19\n\x0c\x61pi_endpoint\x18\x14 \x01(\tB\x03\xe0\x41\x03\x12\x17\n\ngcs_bucket\x18\x15 \x01(\tB\x03\xe0\x41\x03\x12\x42\n\x0c\x61\x63\x63\x65lerators\x18\x16 \x03(\x0b\x32,.google.cloud.datafusion.v1beta1.Accelerator\x12\x1f\n\x12p4_service_account\x18\x17 \x01(\tB\x03\xe0\x41\x03\x12\x1e\n\x11tenant_project_id\x18\x18 \x01(\tB\x03\xe0\x41\x03\x12 \n\x18\x64\x61taproc_service_account\x18\x19 \x01(\t\x12\x13\n\x0b\x65nable_rbac\x18\x1a \x01(\x08\x12K\n\x11\x63rypto_key_config\x18\x1b \x01(\x0b\x32\x30.google.cloud.datafusion.v1beta1.CryptoKeyConfig\x12V\n\x0f\x64isabled_reason\x18\x1c \x03(\x0e\x32\x38.google.cloud.datafusion.v1beta1.Instance.DisabledReasonB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a.\n\x0cOptionsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"F\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x42\x41SIC\x10\x01\x12\x0e\n\nENTERPRISE\x10\x02\x12\r\n\tDEVELOPER\x10\x03\"\xb5\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\n\n\x06\x46\x41ILED\x10\x03\x12\x0c\n\x08\x44\x45LETING\x10\x04\x12\r\n\tUPGRADING\x10\x05\x12\x0e\n\nRESTARTING\x10\x06\x12\x0c\n\x08UPDATING\x10\x07\x12\x11\n\rAUTO_UPDATING\x10\x08\x12\x12\n\x0e\x41UTO_UPGRADING\x10\t\x12\x0c\n\x08\x44ISABLED\x10\n\"D\n\x0e\x44isabledReason\x12\x1f\n\x1b\x44ISABLED_REASON_UNSPECIFIED\x10\x00\x12\x11\n\rKMS_KEY_ISSUE\x10\x01:e\xea\x41\x62\n\"datafusion.googleapis.com/Instance\x12<projects/{project}/locations/{location}/instances/{instance}\"\x9a\x01\n\x14ListInstancesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x83\x01\n\x15ListInstancesResponse\x12<\n\tinstances\x18\x01 \x03(\x0b\x32).google.cloud.datafusion.v1beta1.Instance\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"\x9b\x01\n\x1cListAvailableVersionsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x19\n\x11latest_patch_only\x18\x04 \x01(\x08\"~\n\x1dListAvailableVersionsResponse\x12\x44\n\x12\x61vailable_versions\x18\x01 \x03(\x0b\x32(.google.cloud.datafusion.v1beta1.Version\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"N\n\x12GetInstanceRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\"\xa9\x01\n\x15\x43reateInstanceRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x18\n\x0binstance_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12;\n\x08instance\x18\x03 \x01(\x0b\x32).google.cloud.datafusion.v1beta1.Instance\"Q\n\x15\x44\x65leteInstanceRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\"\x8a\x01\n\x15UpdateInstanceRequest\x12@\n\x08instance\x18\x01 \x01(\x0b\x32).google.cloud.datafusion.v1beta1.InstanceB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"R\n\x16RestartInstanceRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\"R\n\x16UpgradeInstanceRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\"\xdc\x01\n\x11OperationMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0e\n\x06target\x18\x03 \x01(\t\x12\x0c\n\x04verb\x18\x04 \x01(\t\x12\x15\n\rstatus_detail\x18\x05 \x01(\t\x12\x1e\n\x16requested_cancellation\x18\x06 \x01(\x08\x12\x13\n\x0b\x61pi_version\x18\x07 \x01(\t\"/\n\x16RemoveIamPolicyRequest\x12\x15\n\x08resource\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\x19\n\x17RemoveIamPolicyResponse\"\xb8\x01\n\x15ListNamespacesRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12<\n\x04view\x18\x04 \x01(\x0e\x32..google.cloud.datafusion.v1beta1.NamespaceView\"V\n\tIAMPolicy\x12%\n\x06policy\x18\x01 \x01(\x0b\x32\x15.google.iam.v1.Policy\x12\"\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\"\xd8\x01\n\tNamespace\x12\x0c\n\x04name\x18\x01 \x01(\t\x12>\n\niam_policy\x18\x02 \x01(\x0b\x32*.google.cloud.datafusion.v1beta1.IAMPolicy:}\xea\x41z\n#datafusion.googleapis.com/Namespace\x12Sprojects/{project}/locations/{location}/instances/{instance}/namespaces/{namespace}\"q\n\x16ListNamespacesResponse\x12>\n\nnamespaces\x18\x01 \x03(\x0b\x32*.google.cloud.datafusion.v1beta1.Namespace\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x88\x01\n\nDnsPeering\x12\x11\n\x04zone\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x06\x64omain\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x1b\n\x0etarget_project\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x1b\n\x0etarget_network\x18\x05 \x01(\tB\x03\xe0\x41\x01\"\x94\x01\n\x14\x41\x64\x64\x44nsPeeringRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\x12@\n\x0b\x64ns_peering\x18\x02 \x01(\x0b\x32+.google.cloud.datafusion.v1beta1.DnsPeering\"\x17\n\x15\x41\x64\x64\x44nsPeeringResponse\"h\n\x17RemoveDnsPeeringRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\x12\x11\n\x04zone\x18\x02 \x01(\tB\x03\xe0\x41\x02\"\x1a\n\x18RemoveDnsPeeringResponse\"{\n\x16ListDnsPeeringsRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"datafusion.googleapis.com/Instance\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"u\n\x17ListDnsPeeringsResponse\x12\x41\n\x0c\x64ns_peerings\x18\x01 \x03(\x0b\x32+.google.cloud.datafusion.v1beta1.DnsPeering\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t*b\n\rNamespaceView\x12\x1e\n\x1aNAMESPACE_VIEW_UNSPECIFIED\x10\x00\x12\x18\n\x14NAMESPACE_VIEW_BASIC\x10\x01\x12\x17\n\x13NAMESPACE_VIEW_FULL\x10\x02\x32\xc9\x16\n\nDataFusion\x12\xda\x01\n\x15ListAvailableVersions\x12=.google.cloud.datafusion.v1beta1.ListAvailableVersionsRequest\x1a>.google.cloud.datafusion.v1beta1.ListAvailableVersionsResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1beta1/{parent=projects/*/locations/*}/versions\xda\x41\x06parent\x12\xba\x01\n\rListInstances\x12\x35.google.cloud.datafusion.v1beta1.ListInstancesRequest\x1a\x36.google.cloud.datafusion.v1beta1.ListInstancesResponse\":\x82\xd3\xe4\x93\x02\x34\x12\x32/v1beta1/{parent=projects/*/locations/*}/instances\x12\xa9\x01\n\x0bGetInstance\x12\x33.google.cloud.datafusion.v1beta1.GetInstanceRequest\x1a).google.cloud.datafusion.v1beta1.Instance\":\x82\xd3\xe4\x93\x02\x34\x12\x32/v1beta1/{name=projects/*/locations/*/instances/*}\x12\xec\x01\n\x0e\x43reateInstance\x12\x36.google.cloud.datafusion.v1beta1.CreateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\x82\x01\x82\xd3\xe4\x93\x02>\"2/v1beta1/{parent=projects/*/locations/*}/instances:\x08instance\xda\x41\x1bparent,instance,instance_id\xca\x41\x1d\n\x08Instance\x12\x11OperationMetadata\x12\xd7\x01\n\x0e\x44\x65leteInstance\x12\x36.google.cloud.datafusion.v1beta1.DeleteInstanceRequest\x1a\x1d.google.longrunning.Operation\"n\x82\xd3\xe4\x93\x02\x34*2/v1beta1/{name=projects/*/locations/*/instances/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xee\x01\n\x0eUpdateInstance\x12\x36.google.cloud.datafusion.v1beta1.UpdateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\x84\x01\x82\xd3\xe4\x93\x02G2;/v1beta1/{instance.name=projects/*/locations/*/instances/*}:\x08instance\xda\x41\x14instance,update_mask\xca\x41\x1d\n\x08Instance\x12\x11OperationMetadata\x12\xd0\x01\n\x0fRestartInstance\x12\x37.google.cloud.datafusion.v1beta1.RestartInstanceRequest\x1a\x1d.google.longrunning.Operation\"e\x82\xd3\xe4\x93\x02?\":/v1beta1/{name=projects/*/locations/*/instances/*}:restart:\x01*\xca\x41\x1d\n\x08Instance\x12\x11OperationMetadata\x12\xd0\x01\n\x0fUpgradeInstance\x12\x37.google.cloud.datafusion.v1beta1.UpgradeInstanceRequest\x1a\x1d.google.longrunning.Operation\"e\x82\xd3\xe4\x93\x02?\":/v1beta1/{name=projects/*/locations/*/instances/*}:upgrade:\x01*\xca\x41\x1d\n\x08Instance\x12\x11OperationMetadata\x12\xce\x01\n\x0fRemoveIamPolicy\x12\x37.google.cloud.datafusion.v1beta1.RemoveIamPolicyRequest\x1a\x38.google.cloud.datafusion.v1beta1.RemoveIamPolicyResponse\"H\x82\xd3\xe4\x93\x02\x42\"=/v1beta1/{resource=projects/*/locations/*/**}:removeIamPolicy:\x01*\x12\xd3\x01\n\x0eListNamespaces\x12\x36.google.cloud.datafusion.v1beta1.ListNamespacesRequest\x1a\x37.google.cloud.datafusion.v1beta1.ListNamespacesResponse\"P\x82\xd3\xe4\x93\x02\x41\x12?/v1beta1/{parent=projects/*/locations/*/instances/*}/namespaces\xda\x41\x06parent\x12\xd8\x01\n\rAddDnsPeering\x12\x35.google.cloud.datafusion.v1beta1.AddDnsPeeringRequest\x1a\x36.google.cloud.datafusion.v1beta1.AddDnsPeeringResponse\"X\x82\xd3\xe4\x93\x02I\"D/v1beta1/{parent=projects/*/locations/*/instances/*}/dnsPeerings:add:\x01*\xda\x41\x06parent\x12\xe4\x01\n\x10RemoveDnsPeering\x12\x38.google.cloud.datafusion.v1beta1.RemoveDnsPeeringRequest\x1a\x39.google.cloud.datafusion.v1beta1.RemoveDnsPeeringResponse\"[\x82\xd3\xe4\x93\x02L\"G/v1beta1/{parent=projects/*/locations/*/instances/*}/dnsPeerings:remove:\x01*\xda\x41\x06parent\x12\xdc\x01\n\x0fListDnsPeerings\x12\x37.google.cloud.datafusion.v1beta1.ListDnsPeeringsRequest\x1a\x38.google.cloud.datafusion.v1beta1.ListDnsPeeringsResponse\"V\x82\xd3\xe4\x93\x02G\x12\x45/v1beta1/{parent=projects/*/locations/*/instances/*}/dnsPeerings:list\xda\x41\x06parent\x1aM\xca\x41\x19\x64\x61tafusion.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd6\x02\n#com.google.cloud.datafusion.v1beta1P\x01ZIgoogle.golang.org/genproto/googleapis/cloud/datafusion/v1beta1;datafusion\xaa\x02\x1fGoogle.Cloud.DataFusion.V1Beta1\xca\x02\x1fGoogle\\Cloud\\DataFusion\\V1beta1\xea\x02\"Google::Cloud::DataFusion::V1beta1\xea\x41x\n!cloudkms.googleapis.com/CryptoKey\x12Sprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.datafusion.v1beta1.v1beta1_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.datafusion.v1beta1P\001ZIgoogle.golang.org/genproto/googleapis/cloud/datafusion/v1beta1;datafusion\252\002\037Google.Cloud.DataFusion.V1Beta1\312\002\037Google\\Cloud\\DataFusion\\V1beta1\352\002\"Google::Cloud::DataFusion::V1beta1\352Ax\n!cloudkms.googleapis.com/CryptoKey\022Sprojects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}'
  _CRYPTOKEYCONFIG.fields_by_name['key_reference']._options = None
  _CRYPTOKEYCONFIG.fields_by_name['key_reference']._serialized_options = b'\372A#\n!cloudkms.googleapis.com/CryptoKey'
  _INSTANCE_LABELSENTRY._options = None
  _INSTANCE_LABELSENTRY._serialized_options = b'8\001'
  _INSTANCE_OPTIONSENTRY._options = None
  _INSTANCE_OPTIONSENTRY._serialized_options = b'8\001'
  _INSTANCE.fields_by_name['name']._options = None
  _INSTANCE.fields_by_name['name']._serialized_options = b'\340A\003\372A$\n\"datafusion.googleapis.com/Instance'
  _INSTANCE.fields_by_name['type']._options = None
  _INSTANCE.fields_by_name['type']._serialized_options = b'\340A\002'
  _INSTANCE.fields_by_name['create_time']._options = None
  _INSTANCE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['update_time']._options = None
  _INSTANCE.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['state']._options = None
  _INSTANCE.fields_by_name['state']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['state_message']._options = None
  _INSTANCE.fields_by_name['state_message']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['service_endpoint']._options = None
  _INSTANCE.fields_by_name['service_endpoint']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['service_account']._options = None
  _INSTANCE.fields_by_name['service_account']._serialized_options = b'\030\001\340A\003'
  _INSTANCE.fields_by_name['api_endpoint']._options = None
  _INSTANCE.fields_by_name['api_endpoint']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['gcs_bucket']._options = None
  _INSTANCE.fields_by_name['gcs_bucket']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['p4_service_account']._options = None
  _INSTANCE.fields_by_name['p4_service_account']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['tenant_project_id']._options = None
  _INSTANCE.fields_by_name['tenant_project_id']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['disabled_reason']._options = None
  _INSTANCE.fields_by_name['disabled_reason']._serialized_options = b'\340A\003'
  _INSTANCE._options = None
  _INSTANCE._serialized_options = b'\352Ab\n\"datafusion.googleapis.com/Instance\022<projects/{project}/locations/{location}/instances/{instance}'
  _LISTINSTANCESREQUEST.fields_by_name['parent']._options = None
  _LISTINSTANCESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _LISTAVAILABLEVERSIONSREQUEST.fields_by_name['parent']._options = None
  _LISTAVAILABLEVERSIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _GETINSTANCEREQUEST.fields_by_name['name']._options = None
  _GETINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _CREATEINSTANCEREQUEST.fields_by_name['parent']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEINSTANCEREQUEST.fields_by_name['instance_id']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['instance_id']._serialized_options = b'\340A\002'
  _DELETEINSTANCEREQUEST.fields_by_name['name']._options = None
  _DELETEINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _UPDATEINSTANCEREQUEST.fields_by_name['instance']._options = None
  _UPDATEINSTANCEREQUEST.fields_by_name['instance']._serialized_options = b'\340A\002'
  _RESTARTINSTANCEREQUEST.fields_by_name['name']._options = None
  _RESTARTINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _UPGRADEINSTANCEREQUEST.fields_by_name['name']._options = None
  _UPGRADEINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _REMOVEIAMPOLICYREQUEST.fields_by_name['resource']._options = None
  _REMOVEIAMPOLICYREQUEST.fields_by_name['resource']._serialized_options = b'\340A\002'
  _LISTNAMESPACESREQUEST.fields_by_name['parent']._options = None
  _LISTNAMESPACESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _NAMESPACE._options = None
  _NAMESPACE._serialized_options = b'\352Az\n#datafusion.googleapis.com/Namespace\022Sprojects/{project}/locations/{location}/instances/{instance}/namespaces/{namespace}'
  _DNSPEERING.fields_by_name['zone']._options = None
  _DNSPEERING.fields_by_name['zone']._serialized_options = b'\340A\002'
  _DNSPEERING.fields_by_name['domain']._options = None
  _DNSPEERING.fields_by_name['domain']._serialized_options = b'\340A\002'
  _DNSPEERING.fields_by_name['description']._options = None
  _DNSPEERING.fields_by_name['description']._serialized_options = b'\340A\001'
  _DNSPEERING.fields_by_name['target_project']._options = None
  _DNSPEERING.fields_by_name['target_project']._serialized_options = b'\340A\001'
  _DNSPEERING.fields_by_name['target_network']._options = None
  _DNSPEERING.fields_by_name['target_network']._serialized_options = b'\340A\001'
  _ADDDNSPEERINGREQUEST.fields_by_name['parent']._options = None
  _ADDDNSPEERINGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _REMOVEDNSPEERINGREQUEST.fields_by_name['parent']._options = None
  _REMOVEDNSPEERINGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _REMOVEDNSPEERINGREQUEST.fields_by_name['zone']._options = None
  _REMOVEDNSPEERINGREQUEST.fields_by_name['zone']._serialized_options = b'\340A\002'
  _LISTDNSPEERINGSREQUEST.fields_by_name['parent']._options = None
  _LISTDNSPEERINGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\n\"datafusion.googleapis.com/Instance'
  _DATAFUSION._options = None
  _DATAFUSION._serialized_options = b'\312A\031datafusion.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _DATAFUSION.methods_by_name['ListAvailableVersions']._options = None
  _DATAFUSION.methods_by_name['ListAvailableVersions']._serialized_options = b'\202\323\344\223\0023\0221/v1beta1/{parent=projects/*/locations/*}/versions\332A\006parent'
  _DATAFUSION.methods_by_name['ListInstances']._options = None
  _DATAFUSION.methods_by_name['ListInstances']._serialized_options = b'\202\323\344\223\0024\0222/v1beta1/{parent=projects/*/locations/*}/instances'
  _DATAFUSION.methods_by_name['GetInstance']._options = None
  _DATAFUSION.methods_by_name['GetInstance']._serialized_options = b'\202\323\344\223\0024\0222/v1beta1/{name=projects/*/locations/*/instances/*}'
  _DATAFUSION.methods_by_name['CreateInstance']._options = None
  _DATAFUSION.methods_by_name['CreateInstance']._serialized_options = b'\202\323\344\223\002>\"2/v1beta1/{parent=projects/*/locations/*}/instances:\010instance\332A\033parent,instance,instance_id\312A\035\n\010Instance\022\021OperationMetadata'
  _DATAFUSION.methods_by_name['DeleteInstance']._options = None
  _DATAFUSION.methods_by_name['DeleteInstance']._serialized_options = b'\202\323\344\223\0024*2/v1beta1/{name=projects/*/locations/*/instances/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _DATAFUSION.methods_by_name['UpdateInstance']._options = None
  _DATAFUSION.methods_by_name['UpdateInstance']._serialized_options = b'\202\323\344\223\002G2;/v1beta1/{instance.name=projects/*/locations/*/instances/*}:\010instance\332A\024instance,update_mask\312A\035\n\010Instance\022\021OperationMetadata'
  _DATAFUSION.methods_by_name['RestartInstance']._options = None
  _DATAFUSION.methods_by_name['RestartInstance']._serialized_options = b'\202\323\344\223\002?\":/v1beta1/{name=projects/*/locations/*/instances/*}:restart:\001*\312A\035\n\010Instance\022\021OperationMetadata'
  _DATAFUSION.methods_by_name['UpgradeInstance']._options = None
  _DATAFUSION.methods_by_name['UpgradeInstance']._serialized_options = b'\202\323\344\223\002?\":/v1beta1/{name=projects/*/locations/*/instances/*}:upgrade:\001*\312A\035\n\010Instance\022\021OperationMetadata'
  _DATAFUSION.methods_by_name['RemoveIamPolicy']._options = None
  _DATAFUSION.methods_by_name['RemoveIamPolicy']._serialized_options = b'\202\323\344\223\002B\"=/v1beta1/{resource=projects/*/locations/*/**}:removeIamPolicy:\001*'
  _DATAFUSION.methods_by_name['ListNamespaces']._options = None
  _DATAFUSION.methods_by_name['ListNamespaces']._serialized_options = b'\202\323\344\223\002A\022?/v1beta1/{parent=projects/*/locations/*/instances/*}/namespaces\332A\006parent'
  _DATAFUSION.methods_by_name['AddDnsPeering']._options = None
  _DATAFUSION.methods_by_name['AddDnsPeering']._serialized_options = b'\202\323\344\223\002I\"D/v1beta1/{parent=projects/*/locations/*/instances/*}/dnsPeerings:add:\001*\332A\006parent'
  _DATAFUSION.methods_by_name['RemoveDnsPeering']._options = None
  _DATAFUSION.methods_by_name['RemoveDnsPeering']._serialized_options = b'\202\323\344\223\002L\"G/v1beta1/{parent=projects/*/locations/*/instances/*}/dnsPeerings:remove:\001*\332A\006parent'
  _DATAFUSION.methods_by_name['ListDnsPeerings']._options = None
  _DATAFUSION.methods_by_name['ListDnsPeerings']._serialized_options = b'\202\323\344\223\002G\022E/v1beta1/{parent=projects/*/locations/*/instances/*}/dnsPeerings:list\332A\006parent'
  _NAMESPACEVIEW._serialized_start=5521
  _NAMESPACEVIEW._serialized_end=5619
  _NETWORKCONFIG._serialized_start=354
  _NETWORKCONFIG._serialized_end=409
  _VERSION._serialized_start=412
  _VERSION._serialized_end=638
  _VERSION_TYPE._serialized_start=561
  _VERSION_TYPE._serialized_end=638
  _ACCELERATOR._serialized_start=641
  _ACCELERATOR._serialized_end=820
  _ACCELERATOR_ACCELERATORTYPE._serialized_start=744
  _ACCELERATOR_ACCELERATORTYPE._serialized_end=820
  _CRYPTOKEYCONFIG._serialized_start=822
  _CRYPTOKEYCONFIG._serialized_end=902
  _INSTANCE._serialized_start=905
  _INSTANCE._serialized_end=2697
  _INSTANCE_LABELSENTRY._serialized_start=2175
  _INSTANCE_LABELSENTRY._serialized_end=2220
  _INSTANCE_OPTIONSENTRY._serialized_start=2222
  _INSTANCE_OPTIONSENTRY._serialized_end=2268
  _INSTANCE_TYPE._serialized_start=2270
  _INSTANCE_TYPE._serialized_end=2340
  _INSTANCE_STATE._serialized_start=2343
  _INSTANCE_STATE._serialized_end=2524
  _INSTANCE_DISABLEDREASON._serialized_start=2526
  _INSTANCE_DISABLEDREASON._serialized_end=2594
  _LISTINSTANCESREQUEST._serialized_start=2700
  _LISTINSTANCESREQUEST._serialized_end=2854
  _LISTINSTANCESRESPONSE._serialized_start=2857
  _LISTINSTANCESRESPONSE._serialized_end=2988
  _LISTAVAILABLEVERSIONSREQUEST._serialized_start=2991
  _LISTAVAILABLEVERSIONSREQUEST._serialized_end=3146
  _LISTAVAILABLEVERSIONSRESPONSE._serialized_start=3148
  _LISTAVAILABLEVERSIONSRESPONSE._serialized_end=3274
  _GETINSTANCEREQUEST._serialized_start=3276
  _GETINSTANCEREQUEST._serialized_end=3354
  _CREATEINSTANCEREQUEST._serialized_start=3357
  _CREATEINSTANCEREQUEST._serialized_end=3526
  _DELETEINSTANCEREQUEST._serialized_start=3528
  _DELETEINSTANCEREQUEST._serialized_end=3609
  _UPDATEINSTANCEREQUEST._serialized_start=3612
  _UPDATEINSTANCEREQUEST._serialized_end=3750
  _RESTARTINSTANCEREQUEST._serialized_start=3752
  _RESTARTINSTANCEREQUEST._serialized_end=3834
  _UPGRADEINSTANCEREQUEST._serialized_start=3836
  _UPGRADEINSTANCEREQUEST._serialized_end=3918
  _OPERATIONMETADATA._serialized_start=3921
  _OPERATIONMETADATA._serialized_end=4141
  _REMOVEIAMPOLICYREQUEST._serialized_start=4143
  _REMOVEIAMPOLICYREQUEST._serialized_end=4190
  _REMOVEIAMPOLICYRESPONSE._serialized_start=4192
  _REMOVEIAMPOLICYRESPONSE._serialized_end=4217
  _LISTNAMESPACESREQUEST._serialized_start=4220
  _LISTNAMESPACESREQUEST._serialized_end=4404
  _IAMPOLICY._serialized_start=4406
  _IAMPOLICY._serialized_end=4492
  _NAMESPACE._serialized_start=4495
  _NAMESPACE._serialized_end=4711
  _LISTNAMESPACESRESPONSE._serialized_start=4713
  _LISTNAMESPACESRESPONSE._serialized_end=4826
  _DNSPEERING._serialized_start=4829
  _DNSPEERING._serialized_end=4965
  _ADDDNSPEERINGREQUEST._serialized_start=4968
  _ADDDNSPEERINGREQUEST._serialized_end=5116
  _ADDDNSPEERINGRESPONSE._serialized_start=5118
  _ADDDNSPEERINGRESPONSE._serialized_end=5141
  _REMOVEDNSPEERINGREQUEST._serialized_start=5143
  _REMOVEDNSPEERINGREQUEST._serialized_end=5247
  _REMOVEDNSPEERINGRESPONSE._serialized_start=5249
  _REMOVEDNSPEERINGRESPONSE._serialized_end=5275
  _LISTDNSPEERINGSREQUEST._serialized_start=5277
  _LISTDNSPEERINGSREQUEST._serialized_end=5400
  _LISTDNSPEERINGSRESPONSE._serialized_start=5402
  _LISTDNSPEERINGSRESPONSE._serialized_end=5519
  _DATAFUSION._serialized_start=5622
  _DATAFUSION._serialized_end=8511
# @@protoc_insertion_point(module_scope)
