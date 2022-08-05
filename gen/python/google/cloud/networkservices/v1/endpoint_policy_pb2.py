# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/networkservices/v1/endpoint_policy.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.networkservices.v1 import common_pb2 as google_dot_cloud_dot_networkservices_dot_v1_dot_common__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n5google/cloud/networkservices/v1/endpoint_policy.proto\x12\x1fgoogle.cloud.networkservices.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a,google/cloud/networkservices/v1/common.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x8c\x08\n\x0e\x45ndpointPolicy\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12P\n\x06labels\x18\x04 \x03(\x0b\x32;.google.cloud.networkservices.v1.EndpointPolicy.LabelsEntryB\x03\xe0\x41\x01\x12U\n\x04type\x18\x05 \x01(\x0e\x32\x42.google.cloud.networkservices.v1.EndpointPolicy.EndpointPolicyTypeB\x03\xe0\x41\x02\x12X\n\x14\x61uthorization_policy\x18\x07 \x01(\tB:\xe0\x41\x01\xfa\x41\x34\n2networksecurity.googleapis.com/AuthorizationPolicy\x12O\n\x10\x65ndpoint_matcher\x18\t \x01(\x0b\x32\x30.google.cloud.networkservices.v1.EndpointMatcherB\x03\xe0\x41\x02\x12X\n\x15traffic_port_selector\x18\n \x01(\x0b\x32\x34.google.cloud.networkservices.v1.TrafficPortSelectorB\x03\xe0\x41\x01\x12\x18\n\x0b\x64\x65scription\x18\x0b \x01(\tB\x03\xe0\x41\x01\x12Q\n\x11server_tls_policy\x18\x0c \x01(\tB6\xe0\x41\x01\xfa\x41\x30\n.networksecurity.googleapis.com/ServerTlsPolicy\x12Q\n\x11\x63lient_tls_policy\x18\r \x01(\tB6\xe0\x41\x01\xfa\x41\x30\n.networksecurity.googleapis.com/ClientTlsPolicy\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"^\n\x12\x45ndpointPolicyType\x12$\n ENDPOINT_POLICY_TYPE_UNSPECIFIED\x10\x00\x12\x11\n\rSIDECAR_PROXY\x10\x01\x12\x0f\n\x0bGRPC_SERVER\x10\x02:~\xea\x41{\n-networkservices.googleapis.com/EndpointPolicy\x12Jprojects/{project}/locations/{location}/endpointPolicies/{endpoint_policy}\"\x8b\x01\n\x1bListEndpointPoliciesRequest\x12\x45\n\x06parent\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\x12-networkservices.googleapis.com/EndpointPolicy\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x83\x01\n\x1cListEndpointPoliciesResponse\x12J\n\x11\x65ndpoint_policies\x18\x01 \x03(\x0b\x32/.google.cloud.networkservices.v1.EndpointPolicy\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"_\n\x18GetEndpointPolicyRequest\x12\x43\n\x04name\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\n-networkservices.googleapis.com/EndpointPolicy\"\xd4\x01\n\x1b\x43reateEndpointPolicyRequest\x12\x45\n\x06parent\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\x12-networkservices.googleapis.com/EndpointPolicy\x12\x1f\n\x12\x65ndpoint_policy_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12M\n\x0f\x65ndpoint_policy\x18\x03 \x01(\x0b\x32/.google.cloud.networkservices.v1.EndpointPolicyB\x03\xe0\x41\x02\"\xa2\x01\n\x1bUpdateEndpointPolicyRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\x12M\n\x0f\x65ndpoint_policy\x18\x02 \x01(\x0b\x32/.google.cloud.networkservices.v1.EndpointPolicyB\x03\xe0\x41\x02\"b\n\x1b\x44\x65leteEndpointPolicyRequest\x12\x43\n\x04name\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\n-networkservices.googleapis.com/EndpointPolicyB\x87\x05\n#com.google.cloud.networkservices.v1B\x13\x45ndpointPolicyProtoP\x01ZNgoogle.golang.org/genproto/googleapis/cloud/networkservices/v1;networkservices\xaa\x02\x1fGoogle.Cloud.NetworkServices.V1\xca\x02\x1fGoogle\\Cloud\\NetworkServices\\V1\xea\x02\"Google::Cloud::NetworkServices::V1\xea\x41\x8a\x01\n2networksecurity.googleapis.com/AuthorizationPolicy\x12Tprojects/{project}/locations/{location}/authorizationPolicies/{authorization_policy}\xea\x41\x7f\n.networksecurity.googleapis.com/ServerTlsPolicy\x12Mprojects/{project}/locations/{location}/serverTlsPolicies/{server_tls_policy}\xea\x41\x7f\n.networksecurity.googleapis.com/ClientTlsPolicy\x12Mprojects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.networkservices.v1.endpoint_policy_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.networkservices.v1B\023EndpointPolicyProtoP\001ZNgoogle.golang.org/genproto/googleapis/cloud/networkservices/v1;networkservices\252\002\037Google.Cloud.NetworkServices.V1\312\002\037Google\\Cloud\\NetworkServices\\V1\352\002\"Google::Cloud::NetworkServices::V1\352A\212\001\n2networksecurity.googleapis.com/AuthorizationPolicy\022Tprojects/{project}/locations/{location}/authorizationPolicies/{authorization_policy}\352A\177\n.networksecurity.googleapis.com/ServerTlsPolicy\022Mprojects/{project}/locations/{location}/serverTlsPolicies/{server_tls_policy}\352A\177\n.networksecurity.googleapis.com/ClientTlsPolicy\022Mprojects/{project}/locations/{location}/clientTlsPolicies/{client_tls_policy}'
  _ENDPOINTPOLICY_LABELSENTRY._options = None
  _ENDPOINTPOLICY_LABELSENTRY._serialized_options = b'8\001'
  _ENDPOINTPOLICY.fields_by_name['name']._options = None
  _ENDPOINTPOLICY.fields_by_name['name']._serialized_options = b'\340A\002'
  _ENDPOINTPOLICY.fields_by_name['create_time']._options = None
  _ENDPOINTPOLICY.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _ENDPOINTPOLICY.fields_by_name['update_time']._options = None
  _ENDPOINTPOLICY.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _ENDPOINTPOLICY.fields_by_name['labels']._options = None
  _ENDPOINTPOLICY.fields_by_name['labels']._serialized_options = b'\340A\001'
  _ENDPOINTPOLICY.fields_by_name['type']._options = None
  _ENDPOINTPOLICY.fields_by_name['type']._serialized_options = b'\340A\002'
  _ENDPOINTPOLICY.fields_by_name['authorization_policy']._options = None
  _ENDPOINTPOLICY.fields_by_name['authorization_policy']._serialized_options = b'\340A\001\372A4\n2networksecurity.googleapis.com/AuthorizationPolicy'
  _ENDPOINTPOLICY.fields_by_name['endpoint_matcher']._options = None
  _ENDPOINTPOLICY.fields_by_name['endpoint_matcher']._serialized_options = b'\340A\002'
  _ENDPOINTPOLICY.fields_by_name['traffic_port_selector']._options = None
  _ENDPOINTPOLICY.fields_by_name['traffic_port_selector']._serialized_options = b'\340A\001'
  _ENDPOINTPOLICY.fields_by_name['description']._options = None
  _ENDPOINTPOLICY.fields_by_name['description']._serialized_options = b'\340A\001'
  _ENDPOINTPOLICY.fields_by_name['server_tls_policy']._options = None
  _ENDPOINTPOLICY.fields_by_name['server_tls_policy']._serialized_options = b'\340A\001\372A0\n.networksecurity.googleapis.com/ServerTlsPolicy'
  _ENDPOINTPOLICY.fields_by_name['client_tls_policy']._options = None
  _ENDPOINTPOLICY.fields_by_name['client_tls_policy']._serialized_options = b'\340A\001\372A0\n.networksecurity.googleapis.com/ClientTlsPolicy'
  _ENDPOINTPOLICY._options = None
  _ENDPOINTPOLICY._serialized_options = b'\352A{\n-networkservices.googleapis.com/EndpointPolicy\022Jprojects/{project}/locations/{location}/endpointPolicies/{endpoint_policy}'
  _LISTENDPOINTPOLICIESREQUEST.fields_by_name['parent']._options = None
  _LISTENDPOINTPOLICIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A/\022-networkservices.googleapis.com/EndpointPolicy'
  _GETENDPOINTPOLICYREQUEST.fields_by_name['name']._options = None
  _GETENDPOINTPOLICYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A/\n-networkservices.googleapis.com/EndpointPolicy'
  _CREATEENDPOINTPOLICYREQUEST.fields_by_name['parent']._options = None
  _CREATEENDPOINTPOLICYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A/\022-networkservices.googleapis.com/EndpointPolicy'
  _CREATEENDPOINTPOLICYREQUEST.fields_by_name['endpoint_policy_id']._options = None
  _CREATEENDPOINTPOLICYREQUEST.fields_by_name['endpoint_policy_id']._serialized_options = b'\340A\002'
  _CREATEENDPOINTPOLICYREQUEST.fields_by_name['endpoint_policy']._options = None
  _CREATEENDPOINTPOLICYREQUEST.fields_by_name['endpoint_policy']._serialized_options = b'\340A\002'
  _UPDATEENDPOINTPOLICYREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEENDPOINTPOLICYREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _UPDATEENDPOINTPOLICYREQUEST.fields_by_name['endpoint_policy']._options = None
  _UPDATEENDPOINTPOLICYREQUEST.fields_by_name['endpoint_policy']._serialized_options = b'\340A\002'
  _DELETEENDPOINTPOLICYREQUEST.fields_by_name['name']._options = None
  _DELETEENDPOINTPOLICYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A/\n-networkservices.googleapis.com/EndpointPolicy'
  _ENDPOINTPOLICY._serialized_start=264
  _ENDPOINTPOLICY._serialized_end=1300
  _ENDPOINTPOLICY_LABELSENTRY._serialized_start=1031
  _ENDPOINTPOLICY_LABELSENTRY._serialized_end=1076
  _ENDPOINTPOLICY_ENDPOINTPOLICYTYPE._serialized_start=1078
  _ENDPOINTPOLICY_ENDPOINTPOLICYTYPE._serialized_end=1172
  _LISTENDPOINTPOLICIESREQUEST._serialized_start=1303
  _LISTENDPOINTPOLICIESREQUEST._serialized_end=1442
  _LISTENDPOINTPOLICIESRESPONSE._serialized_start=1445
  _LISTENDPOINTPOLICIESRESPONSE._serialized_end=1576
  _GETENDPOINTPOLICYREQUEST._serialized_start=1578
  _GETENDPOINTPOLICYREQUEST._serialized_end=1673
  _CREATEENDPOINTPOLICYREQUEST._serialized_start=1676
  _CREATEENDPOINTPOLICYREQUEST._serialized_end=1888
  _UPDATEENDPOINTPOLICYREQUEST._serialized_start=1891
  _UPDATEENDPOINTPOLICYREQUEST._serialized_end=2053
  _DELETEENDPOINTPOLICYREQUEST._serialized_start=2055
  _DELETEENDPOINTPOLICYREQUEST._serialized_end=2153
# @@protoc_insertion_point(module_scope)
