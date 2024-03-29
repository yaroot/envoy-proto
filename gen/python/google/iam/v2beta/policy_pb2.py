# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/iam/v2beta/policy.proto
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
from google.iam.v2beta import deny_pb2 as google_dot_iam_dot_v2beta_dot_deny__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1egoogle/iam/v2beta/policy.proto\x12\x11google.iam.v2beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1cgoogle/iam/v2beta/deny.proto\x1a#google/longrunning/operations.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa9\x03\n\x06Policy\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x05\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x05\x12\x11\n\x04kind\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x14\n\x0c\x64isplay_name\x18\x04 \x01(\t\x12?\n\x0b\x61nnotations\x18\x05 \x03(\x0b\x32*.google.iam.v2beta.Policy.AnnotationsEntry\x12\x0c\n\x04\x65tag\x18\x06 \x01(\t\x12\x34\n\x0b\x63reate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0b\x64\x65lete_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12,\n\x05rules\x18\n \x03(\x0b\x32\x1d.google.iam.v2beta.PolicyRule\x1a\x32\n\x10\x41nnotationsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"[\n\nPolicyRule\x12\x30\n\tdeny_rule\x18\x02 \x01(\x0b\x32\x1b.google.iam.v2beta.DenyRuleH\x00\x12\x13\n\x0b\x64\x65scription\x18\x01 \x01(\tB\x06\n\x04kind\"Q\n\x13ListPoliciesRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\\\n\x14ListPoliciesResponse\x12+\n\x08policies\x18\x01 \x03(\x0b\x32\x19.google.iam.v2beta.Policy\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"%\n\x10GetPolicyRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"m\n\x13\x43reatePolicyRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12.\n\x06policy\x18\x02 \x01(\x0b\x32\x19.google.iam.v2beta.PolicyB\x03\xe0\x41\x02\x12\x11\n\tpolicy_id\x18\x03 \x01(\t\"E\n\x13UpdatePolicyRequest\x12.\n\x06policy\x18\x01 \x01(\x0b\x32\x19.google.iam.v2beta.PolicyB\x03\xe0\x41\x02\";\n\x13\x44\x65letePolicyRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\x04\x65tag\x18\x02 \x01(\tB\x03\xe0\x41\x01\"J\n\x17PolicyOperationMetadata\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp2\x80\x07\n\x08Policies\x12\x8f\x01\n\x0cListPolicies\x12&.google.iam.v2beta.ListPoliciesRequest\x1a\'.google.iam.v2beta.ListPoliciesResponse\".\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v2beta/{parent=policies/*/*}\xda\x41\x06parent\x12y\n\tGetPolicy\x12#.google.iam.v2beta.GetPolicyRequest\x1a\x19.google.iam.v2beta.Policy\",\x82\xd3\xe4\x93\x02\x1f\x12\x1d/v2beta/{name=policies/*/*/*}\xda\x41\x04name\x12\xc2\x01\n\x0c\x43reatePolicy\x12&.google.iam.v2beta.CreatePolicyRequest\x1a\x1d.google.longrunning.Operation\"k\x82\xd3\xe4\x93\x02\'\"\x1d/v2beta/{parent=policies/*/*}:\x06policy\xda\x41\x17parent,policy,policy_id\xca\x41!\n\x06Policy\x12\x17PolicyOperationMetadata\x12\xaf\x01\n\x0cUpdatePolicy\x12&.google.iam.v2beta.UpdatePolicyRequest\x1a\x1d.google.longrunning.Operation\"X\x82\xd3\xe4\x93\x02.\x1a$/v2beta/{policy.name=policies/*/*/*}:\x06policy\xca\x41!\n\x06Policy\x12\x17PolicyOperationMetadata\x12\xa7\x01\n\x0c\x44\x65letePolicy\x12&.google.iam.v2beta.DeletePolicyRequest\x1a\x1d.google.longrunning.Operation\"P\x82\xd3\xe4\x93\x02\x1f*\x1d/v2beta/{name=policies/*/*/*}\xda\x41\x04name\xca\x41!\n\x06Policy\x12\x17PolicyOperationMetadata\x1a\x46\xca\x41\x12iam.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x90\x01\n\x15\x63om.google.iam.v2betaB\x0bPolicyProtoP\x01Z4google.golang.org/genproto/googleapis/iam/v2beta;iam\xaa\x02\x17Google.Cloud.Iam.V2Beta\xca\x02\x17Google\\Cloud\\Iam\\V2betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.iam.v2beta.policy_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.google.iam.v2betaB\013PolicyProtoP\001Z4google.golang.org/genproto/googleapis/iam/v2beta;iam\252\002\027Google.Cloud.Iam.V2Beta\312\002\027Google\\Cloud\\Iam\\V2beta'
  _POLICY_ANNOTATIONSENTRY._options = None
  _POLICY_ANNOTATIONSENTRY._serialized_options = b'8\001'
  _POLICY.fields_by_name['name']._options = None
  _POLICY.fields_by_name['name']._serialized_options = b'\340A\005'
  _POLICY.fields_by_name['uid']._options = None
  _POLICY.fields_by_name['uid']._serialized_options = b'\340A\005'
  _POLICY.fields_by_name['kind']._options = None
  _POLICY.fields_by_name['kind']._serialized_options = b'\340A\003'
  _POLICY.fields_by_name['create_time']._options = None
  _POLICY.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _POLICY.fields_by_name['update_time']._options = None
  _POLICY.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _POLICY.fields_by_name['delete_time']._options = None
  _POLICY.fields_by_name['delete_time']._serialized_options = b'\340A\003'
  _LISTPOLICIESREQUEST.fields_by_name['parent']._options = None
  _LISTPOLICIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _GETPOLICYREQUEST.fields_by_name['name']._options = None
  _GETPOLICYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _CREATEPOLICYREQUEST.fields_by_name['parent']._options = None
  _CREATEPOLICYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _CREATEPOLICYREQUEST.fields_by_name['policy']._options = None
  _CREATEPOLICYREQUEST.fields_by_name['policy']._serialized_options = b'\340A\002'
  _UPDATEPOLICYREQUEST.fields_by_name['policy']._options = None
  _UPDATEPOLICYREQUEST.fields_by_name['policy']._serialized_options = b'\340A\002'
  _DELETEPOLICYREQUEST.fields_by_name['name']._options = None
  _DELETEPOLICYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _DELETEPOLICYREQUEST.fields_by_name['etag']._options = None
  _DELETEPOLICYREQUEST.fields_by_name['etag']._serialized_options = b'\340A\001'
  _POLICIES._options = None
  _POLICIES._serialized_options = b'\312A\022iam.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _POLICIES.methods_by_name['ListPolicies']._options = None
  _POLICIES.methods_by_name['ListPolicies']._serialized_options = b'\202\323\344\223\002\037\022\035/v2beta/{parent=policies/*/*}\332A\006parent'
  _POLICIES.methods_by_name['GetPolicy']._options = None
  _POLICIES.methods_by_name['GetPolicy']._serialized_options = b'\202\323\344\223\002\037\022\035/v2beta/{name=policies/*/*/*}\332A\004name'
  _POLICIES.methods_by_name['CreatePolicy']._options = None
  _POLICIES.methods_by_name['CreatePolicy']._serialized_options = b'\202\323\344\223\002\'\"\035/v2beta/{parent=policies/*/*}:\006policy\332A\027parent,policy,policy_id\312A!\n\006Policy\022\027PolicyOperationMetadata'
  _POLICIES.methods_by_name['UpdatePolicy']._options = None
  _POLICIES.methods_by_name['UpdatePolicy']._serialized_options = b'\202\323\344\223\002.\032$/v2beta/{policy.name=policies/*/*/*}:\006policy\312A!\n\006Policy\022\027PolicyOperationMetadata'
  _POLICIES.methods_by_name['DeletePolicy']._options = None
  _POLICIES.methods_by_name['DeletePolicy']._serialized_options = b'\202\323\344\223\002\037*\035/v2beta/{name=policies/*/*/*}\332A\004name\312A!\n\006Policy\022\027PolicyOperationMetadata'
  _POLICY._serialized_start=242
  _POLICY._serialized_end=667
  _POLICY_ANNOTATIONSENTRY._serialized_start=617
  _POLICY_ANNOTATIONSENTRY._serialized_end=667
  _POLICYRULE._serialized_start=669
  _POLICYRULE._serialized_end=760
  _LISTPOLICIESREQUEST._serialized_start=762
  _LISTPOLICIESREQUEST._serialized_end=843
  _LISTPOLICIESRESPONSE._serialized_start=845
  _LISTPOLICIESRESPONSE._serialized_end=937
  _GETPOLICYREQUEST._serialized_start=939
  _GETPOLICYREQUEST._serialized_end=976
  _CREATEPOLICYREQUEST._serialized_start=978
  _CREATEPOLICYREQUEST._serialized_end=1087
  _UPDATEPOLICYREQUEST._serialized_start=1089
  _UPDATEPOLICYREQUEST._serialized_end=1158
  _DELETEPOLICYREQUEST._serialized_start=1160
  _DELETEPOLICYREQUEST._serialized_end=1219
  _POLICYOPERATIONMETADATA._serialized_start=1221
  _POLICYOPERATIONMETADATA._serialized_end=1295
  _POLICIES._serialized_start=1298
  _POLICIES._serialized_end=2194
# @@protoc_insertion_point(module_scope)
