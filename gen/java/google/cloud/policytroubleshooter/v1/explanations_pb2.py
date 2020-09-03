# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/policytroubleshooter/v1/explanations.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.type import expr_pb2 as google_dot_type_dot_expr__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/policytroubleshooter/v1/explanations.proto',
  package='google.cloud.policytroubleshooter.v1',
  syntax='proto3',
  serialized_options=b'ZXgoogle.golang.org/genproto/googleapis/cloud/policytroubleshooter/v1;policytroubleshooter\252\002$Google.Cloud.PolicyTroubleshooter.V1\312\002$Google\\Cloud\\PolicyTroubleshooter\\V1\352\002\'Google::Cloud::PolicyTroubleshooter::V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/cloud/policytroubleshooter/v1/explanations.proto\x12$google.cloud.policytroubleshooter.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x16google/type/expr.proto\"_\n\x0b\x41\x63\x63\x65ssTuple\x12\x16\n\tprincipal\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1f\n\x12\x66ull_resource_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x17\n\npermission\x18\x03 \x01(\tB\x03\xe0\x41\x02\"\xbc\x02\n\x0f\x45xplainedPolicy\x12\x41\n\x06\x61\x63\x63\x65ss\x18\x01 \x01(\x0e\x32\x31.google.cloud.policytroubleshooter.v1.AccessState\x12\x1a\n\x12\x66ull_resource_name\x18\x02 \x01(\t\x12%\n\x06policy\x18\x03 \x01(\x0b\x32\x15.google.iam.v1.Policy\x12V\n\x14\x62inding_explanations\x18\x04 \x03(\x0b\x32\x38.google.cloud.policytroubleshooter.v1.BindingExplanation\x12K\n\trelevance\x18\x05 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\"\x83\t\n\x12\x42indingExplanation\x12\x46\n\x06\x61\x63\x63\x65ss\x18\x01 \x01(\x0e\x32\x31.google.cloud.policytroubleshooter.v1.AccessStateB\x03\xe0\x41\x02\x12\x0c\n\x04role\x18\x02 \x01(\t\x12`\n\x0frole_permission\x18\x03 \x01(\x0e\x32G.google.cloud.policytroubleshooter.v1.BindingExplanation.RolePermission\x12[\n\x19role_permission_relevance\x18\x04 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\x12^\n\x0bmemberships\x18\x05 \x03(\x0b\x32I.google.cloud.policytroubleshooter.v1.BindingExplanation.MembershipsEntry\x12K\n\trelevance\x18\x06 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\x12$\n\tcondition\x18\x07 \x01(\x0b\x32\x11.google.type.Expr\x1a\xbb\x01\n\x13\x41nnotatedMembership\x12W\n\nmembership\x18\x01 \x01(\x0e\x32\x43.google.cloud.policytroubleshooter.v1.BindingExplanation.Membership\x12K\n\trelevance\x18\x02 \x01(\x0e\x32\x38.google.cloud.policytroubleshooter.v1.HeuristicRelevance\x1a\x80\x01\n\x10MembershipsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12[\n\x05value\x18\x02 \x01(\x0b\x32L.google.cloud.policytroubleshooter.v1.BindingExplanation.AnnotatedMembership:\x02\x38\x01\"\x9a\x01\n\x0eRolePermission\x12\x1f\n\x1bROLE_PERMISSION_UNSPECIFIED\x10\x00\x12\x1c\n\x18ROLE_PERMISSION_INCLUDED\x10\x01\x12 \n\x1cROLE_PERMISSION_NOT_INCLUDED\x10\x02\x12\'\n#ROLE_PERMISSION_UNKNOWN_INFO_DENIED\x10\x03\"\xa6\x01\n\nMembership\x12\x1a\n\x16MEMBERSHIP_UNSPECIFIED\x10\x00\x12\x17\n\x13MEMBERSHIP_INCLUDED\x10\x01\x12\x1b\n\x17MEMBERSHIP_NOT_INCLUDED\x10\x02\x12\"\n\x1eMEMBERSHIP_UNKNOWN_INFO_DENIED\x10\x03\x12\"\n\x1eMEMBERSHIP_UNKNOWN_UNSUPPORTED\x10\x04*{\n\x0b\x41\x63\x63\x65ssState\x12\x1c\n\x18\x41\x43\x43\x45SS_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07GRANTED\x10\x01\x12\x0f\n\x0bNOT_GRANTED\x10\x02\x12\x17\n\x13UNKNOWN_CONDITIONAL\x10\x03\x12\x17\n\x13UNKNOWN_INFO_DENIED\x10\x04*O\n\x12HeuristicRelevance\x12#\n\x1fHEURISTIC_RELEVANCE_UNSPECIFIED\x10\x00\x12\n\n\x06NORMAL\x10\x01\x12\x08\n\x04HIGH\x10\x02\x42\xd2\x01ZXgoogle.golang.org/genproto/googleapis/cloud/policytroubleshooter/v1;policytroubleshooter\xaa\x02$Google.Cloud.PolicyTroubleshooter.V1\xca\x02$Google\\Cloud\\PolicyTroubleshooter\\V1\xea\x02\'Google::Cloud::PolicyTroubleshooter::V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_iam_dot_v1_dot_policy__pb2.DESCRIPTOR,google_dot_type_dot_expr__pb2.DESCRIPTOR,])

_ACCESSSTATE = _descriptor.EnumDescriptor(
  name='AccessState',
  full_name='google.cloud.policytroubleshooter.v1.AccessState',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ACCESS_STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GRANTED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NOT_GRANTED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_CONDITIONAL', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_INFO_DENIED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1756,
  serialized_end=1879,
)
_sym_db.RegisterEnumDescriptor(_ACCESSSTATE)

AccessState = enum_type_wrapper.EnumTypeWrapper(_ACCESSSTATE)
_HEURISTICRELEVANCE = _descriptor.EnumDescriptor(
  name='HeuristicRelevance',
  full_name='google.cloud.policytroubleshooter.v1.HeuristicRelevance',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='HEURISTIC_RELEVANCE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NORMAL', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HIGH', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1881,
  serialized_end=1960,
)
_sym_db.RegisterEnumDescriptor(_HEURISTICRELEVANCE)

HeuristicRelevance = enum_type_wrapper.EnumTypeWrapper(_HEURISTICRELEVANCE)
ACCESS_STATE_UNSPECIFIED = 0
GRANTED = 1
NOT_GRANTED = 2
UNKNOWN_CONDITIONAL = 3
UNKNOWN_INFO_DENIED = 4
HEURISTIC_RELEVANCE_UNSPECIFIED = 0
NORMAL = 1
HIGH = 2


_BINDINGEXPLANATION_ROLEPERMISSION = _descriptor.EnumDescriptor(
  name='RolePermission',
  full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.RolePermission',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ROLE_PERMISSION_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ROLE_PERMISSION_INCLUDED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ROLE_PERMISSION_NOT_INCLUDED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ROLE_PERMISSION_UNKNOWN_INFO_DENIED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1431,
  serialized_end=1585,
)
_sym_db.RegisterEnumDescriptor(_BINDINGEXPLANATION_ROLEPERMISSION)

_BINDINGEXPLANATION_MEMBERSHIP = _descriptor.EnumDescriptor(
  name='Membership',
  full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.Membership',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='MEMBERSHIP_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEMBERSHIP_INCLUDED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEMBERSHIP_NOT_INCLUDED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEMBERSHIP_UNKNOWN_INFO_DENIED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MEMBERSHIP_UNKNOWN_UNSUPPORTED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1588,
  serialized_end=1754,
)
_sym_db.RegisterEnumDescriptor(_BINDINGEXPLANATION_MEMBERSHIP)


_ACCESSTUPLE = _descriptor.Descriptor(
  name='AccessTuple',
  full_name='google.cloud.policytroubleshooter.v1.AccessTuple',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='principal', full_name='google.cloud.policytroubleshooter.v1.AccessTuple.principal', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='full_resource_name', full_name='google.cloud.policytroubleshooter.v1.AccessTuple.full_resource_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='permission', full_name='google.cloud.policytroubleshooter.v1.AccessTuple.permission', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=182,
  serialized_end=277,
)


_EXPLAINEDPOLICY = _descriptor.Descriptor(
  name='ExplainedPolicy',
  full_name='google.cloud.policytroubleshooter.v1.ExplainedPolicy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='access', full_name='google.cloud.policytroubleshooter.v1.ExplainedPolicy.access', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='full_resource_name', full_name='google.cloud.policytroubleshooter.v1.ExplainedPolicy.full_resource_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policy', full_name='google.cloud.policytroubleshooter.v1.ExplainedPolicy.policy', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='binding_explanations', full_name='google.cloud.policytroubleshooter.v1.ExplainedPolicy.binding_explanations', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='relevance', full_name='google.cloud.policytroubleshooter.v1.ExplainedPolicy.relevance', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=280,
  serialized_end=596,
)


_BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP = _descriptor.Descriptor(
  name='AnnotatedMembership',
  full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.AnnotatedMembership',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='membership', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.AnnotatedMembership.membership', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='relevance', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.AnnotatedMembership.relevance', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1110,
  serialized_end=1297,
)

_BINDINGEXPLANATION_MEMBERSHIPSENTRY = _descriptor.Descriptor(
  name='MembershipsEntry',
  full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.MembershipsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.MembershipsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.MembershipsEntry.value', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1300,
  serialized_end=1428,
)

_BINDINGEXPLANATION = _descriptor.Descriptor(
  name='BindingExplanation',
  full_name='google.cloud.policytroubleshooter.v1.BindingExplanation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='access', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.access', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='role', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.role', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='role_permission', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.role_permission', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='role_permission_relevance', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.role_permission_relevance', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='memberships', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.memberships', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='relevance', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.relevance', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='condition', full_name='google.cloud.policytroubleshooter.v1.BindingExplanation.condition', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP, _BINDINGEXPLANATION_MEMBERSHIPSENTRY, ],
  enum_types=[
    _BINDINGEXPLANATION_ROLEPERMISSION,
    _BINDINGEXPLANATION_MEMBERSHIP,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=599,
  serialized_end=1754,
)

_EXPLAINEDPOLICY.fields_by_name['access'].enum_type = _ACCESSSTATE
_EXPLAINEDPOLICY.fields_by_name['policy'].message_type = google_dot_iam_dot_v1_dot_policy__pb2._POLICY
_EXPLAINEDPOLICY.fields_by_name['binding_explanations'].message_type = _BINDINGEXPLANATION
_EXPLAINEDPOLICY.fields_by_name['relevance'].enum_type = _HEURISTICRELEVANCE
_BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP.fields_by_name['membership'].enum_type = _BINDINGEXPLANATION_MEMBERSHIP
_BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP.fields_by_name['relevance'].enum_type = _HEURISTICRELEVANCE
_BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP.containing_type = _BINDINGEXPLANATION
_BINDINGEXPLANATION_MEMBERSHIPSENTRY.fields_by_name['value'].message_type = _BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP
_BINDINGEXPLANATION_MEMBERSHIPSENTRY.containing_type = _BINDINGEXPLANATION
_BINDINGEXPLANATION.fields_by_name['access'].enum_type = _ACCESSSTATE
_BINDINGEXPLANATION.fields_by_name['role_permission'].enum_type = _BINDINGEXPLANATION_ROLEPERMISSION
_BINDINGEXPLANATION.fields_by_name['role_permission_relevance'].enum_type = _HEURISTICRELEVANCE
_BINDINGEXPLANATION.fields_by_name['memberships'].message_type = _BINDINGEXPLANATION_MEMBERSHIPSENTRY
_BINDINGEXPLANATION.fields_by_name['relevance'].enum_type = _HEURISTICRELEVANCE
_BINDINGEXPLANATION.fields_by_name['condition'].message_type = google_dot_type_dot_expr__pb2._EXPR
_BINDINGEXPLANATION_ROLEPERMISSION.containing_type = _BINDINGEXPLANATION
_BINDINGEXPLANATION_MEMBERSHIP.containing_type = _BINDINGEXPLANATION
DESCRIPTOR.message_types_by_name['AccessTuple'] = _ACCESSTUPLE
DESCRIPTOR.message_types_by_name['ExplainedPolicy'] = _EXPLAINEDPOLICY
DESCRIPTOR.message_types_by_name['BindingExplanation'] = _BINDINGEXPLANATION
DESCRIPTOR.enum_types_by_name['AccessState'] = _ACCESSSTATE
DESCRIPTOR.enum_types_by_name['HeuristicRelevance'] = _HEURISTICRELEVANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AccessTuple = _reflection.GeneratedProtocolMessageType('AccessTuple', (_message.Message,), {
  'DESCRIPTOR' : _ACCESSTUPLE,
  '__module__' : 'google.cloud.policytroubleshooter.v1.explanations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.policytroubleshooter.v1.AccessTuple)
  })
_sym_db.RegisterMessage(AccessTuple)

ExplainedPolicy = _reflection.GeneratedProtocolMessageType('ExplainedPolicy', (_message.Message,), {
  'DESCRIPTOR' : _EXPLAINEDPOLICY,
  '__module__' : 'google.cloud.policytroubleshooter.v1.explanations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.policytroubleshooter.v1.ExplainedPolicy)
  })
_sym_db.RegisterMessage(ExplainedPolicy)

BindingExplanation = _reflection.GeneratedProtocolMessageType('BindingExplanation', (_message.Message,), {

  'AnnotatedMembership' : _reflection.GeneratedProtocolMessageType('AnnotatedMembership', (_message.Message,), {
    'DESCRIPTOR' : _BINDINGEXPLANATION_ANNOTATEDMEMBERSHIP,
    '__module__' : 'google.cloud.policytroubleshooter.v1.explanations_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.policytroubleshooter.v1.BindingExplanation.AnnotatedMembership)
    })
  ,

  'MembershipsEntry' : _reflection.GeneratedProtocolMessageType('MembershipsEntry', (_message.Message,), {
    'DESCRIPTOR' : _BINDINGEXPLANATION_MEMBERSHIPSENTRY,
    '__module__' : 'google.cloud.policytroubleshooter.v1.explanations_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.policytroubleshooter.v1.BindingExplanation.MembershipsEntry)
    })
  ,
  'DESCRIPTOR' : _BINDINGEXPLANATION,
  '__module__' : 'google.cloud.policytroubleshooter.v1.explanations_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.policytroubleshooter.v1.BindingExplanation)
  })
_sym_db.RegisterMessage(BindingExplanation)
_sym_db.RegisterMessage(BindingExplanation.AnnotatedMembership)
_sym_db.RegisterMessage(BindingExplanation.MembershipsEntry)


DESCRIPTOR._options = None
_ACCESSTUPLE.fields_by_name['principal']._options = None
_ACCESSTUPLE.fields_by_name['full_resource_name']._options = None
_ACCESSTUPLE.fields_by_name['permission']._options = None
_BINDINGEXPLANATION_MEMBERSHIPSENTRY._options = None
_BINDINGEXPLANATION.fields_by_name['access']._options = None
# @@protoc_insertion_point(module_scope)
