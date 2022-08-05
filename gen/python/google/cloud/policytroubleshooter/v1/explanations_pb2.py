# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/policytroubleshooter/v1/explanations.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.type import expr_pb2 as google_dot_type_dot_expr__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7google/cloud/policytroubleshooter/v1/explanations.proto\x12$google.cloud.policytroubleshooter.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x16google/type/expr.proto\"_\n\x0b\x41\x63\x63\x65ssTuple\x12\x16\n\tprincipal\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1f\n\x12\x66ull_resource_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\npermission\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\xbc\x02\n\x0f\x45xplainedPolicy\x12\x41\n\x06\x61\x63\x63\x65ss\x18\x01 \x01(\x0e\x32\x31.google.cloud.policytroubleshooter.v1.AccessState\x12\x1a\n\x12\x66ull_resource_name\x18\x02 \x01(\t\x12%\n\x06policy\x18\x03 \x01(\x0b\x32\x15.google.iam.v1.Policy\x12V\n\x14\x62inding_explanations\x18\x04 \x03(\x0b\x32\x38.google.cloud.policytroubleshooter.v1.BindingExplanation\x12K\n\trelevance\x18\x05 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\"\x83\t\n\x12\x42indingExplanation\x12\x46\n\x06\x61\x63\x63\x65ss\x18\x01 \x01(\x0e\x32\x31.google.cloud.policytroubleshooter.v1.AccessStateB\x03\xe0\x41\x02\x12\x0c\n\x04role\x18\x02 \x01(\t\x12`\n\x0frole_permission\x18\x03 \x01(\x0e\x32G.google.cloud.policytroubleshooter.v1.BindingExplanation.RolePermission\x12[\n\x19role_permission_relevance\x18\x04 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\x12^\n\x0bmemberships\x18\x05 \x03(\x0b\x32I.google.cloud.policytroubleshooter.v1.BindingExplanation.MembershipsEntry\x12K\n\trelevance\x18\x06 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\x12$\n\tcondition\x18\x07 \x01(\x0b\x32\x11.google.type.Expr\x1a\xbb\x01\n\x13\x41nnotatedMembership\x12W\n\nmembership\x18\x01 \x01(\x0e\x32\x43.google.cloud.policytroubleshooter.v1.BindingExplanation.Membership\x12K\n\trelevance\x18\x02 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\x1a\x80\x01\n\x10MembershipsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12[\n\x05value\x18\x02 \x01(\x0b\x32L.google.cloud.policytroubleshooter.v1.BindingExplanation.AnnotatedMembership:\x02\x38\x01\"\x9a\x01\n\x0eRolePermission\x12\x1f\n\x1bROLE_PERMISSION_UNSPECIFIED\x10\x00\x12\x1c\n\x18ROLE_PERMISSION_INCLUDED\x10\x01\x12 \n\x1cROLE_PERMISSION_NOT_INCLUDED\x10\x02\x12\'\n#ROLE_PERMISSION_UNKNOWN_INFO_DENIED\x10\x03\"\xa6\x01\n\nMembership\x12\x1a\n\x16MEMBERSHIP_UNSPECIFIED\x10\x00\x12\x17\n\x13MEMBERSHIP_INCLUDED\x10\x01\x12\x1b\n\x17MEMBERSHIP_NOT_INCLUDED\x10\x02\x12\"\n\x1eMEMBERSHIP_UNKNOWN_INFO_DENIED\x10\x03\x12\"\n\x1eMEMBERSHIP_UNKNOWN_UNSUPPORTED\x10\x04*{\n\x0b\x41\x63\x63\x65ssState\x12\x1c\n\x18\x41\x43\x43\x45SS_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07GRANTED\x10\x01\x12\x0f\n\x0bNOT_GRANTED\x10\x02\x12\x17\n\x13UNKNOWN_CONDITIONAL\x10\x03\x12\x17\n\x13UNKNOWN_INFO_DENIED\x10\x04*O\n\x12HeuristicRelevance\x12#\n\x1fHEURISTIC_RELEVANCE_UNSPECIFIED\x10\x00\x12\n\n\x06NORMAL\x10\x01\x12\x08\n\x04HIGH\x10\x02\x42\xd2\x01ZXgoogle.golang.org/genproto/googleapis/cloud/policytroubleshooter/v1;policytroubleshooter\xaa\x02$Google.Cloud.PolicyTroubleshooter.V1\xca\x02$Google\\Cloud\\PolicyTroubleshooter\\V1\xea\x02\'Google::Cloud::PolicyTroubleshooter::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.policytroubleshooter.v1.explanations_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'ZXgoogle.golang.org/genproto/googleapis/cloud/policytroubleshooter/v1;policytroubleshooter\252\002$Google.Cloud.PolicyTroubleshooter.V1\312\002$Google\\Cloud\\PolicyTroubleshooter\\V1\352\002\'Google::Cloud::PolicyTroubleshooter::V1'
  _ACCESSTUPLE.fields_by_name['principal']._options = None
  _ACCESSTUPLE.fields_by_name['principal']._serialized_options = b'\340A\002'
  _ACCESSTUPLE.fields_by_name['full_resource_name']._options = None
  _ACCESSTUPLE.fields_by_name['full_resource_name']._serialized_options = b'\340A\002'
  _ACCESSTUPLE.fields_by_name['permission']._options = None
  _ACCESSTUPLE.fields_by_name['permission']._serialized_options = b'\340A\002'
  _BINDINGEXPLANATION_MEMBERSHIPSENTRY._options = None
  _BINDINGEXPLANATION_MEMBERSHIPSENTRY._serialized_options = b'8\001'
  _BINDINGEXPLANATION.fields_by_name['access']._options = None
  _BINDINGEXPLANATION.fields_by_name['access']._serialized_options = b'\340A\002'
  _ACCESSSTATE._serialized_start=1756
  _ACCESSSTATE._serialized_end=1879
  _HEURISTICRELEVANCE._serialized_start=1881
  _HEURISTICRELEVANCE._serialized_end=1960
  _ACCESSTUPLE._serialized_start=182
  _ACCESSTUPLE._serialized_end=277
  _EXPLAINEDPOLICY._serialized_start=280
  _EXPLAINEDPOLICY._serialized_end=596
  _BINDINGEXPLANATION._serialized_start=599
  _BINDINGEXPLANATION._serialized_end=1754
  _BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP._serialized_start=1110
  _BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP._serialized_end=1297
  _BINDINGEXPLANATION_MEMBERSHIPSENTRY._serialized_start=1300
  _BINDINGEXPLANATION_MEMBERSHIPSENTRY._serialized_end=1428
  _BINDINGEXPLANATION_ROLEPERMISSION._serialized_start=1431
  _BINDINGEXPLANATION_ROLEPERMISSION._serialized_end=1585
  _BINDINGEXPLANATION_MEMBERSHIP._serialized_start=1588
  _BINDINGEXPLANATION_MEMBERSHIP._serialized_end=1754
# @@protoc_insertion_point(module_scope)
