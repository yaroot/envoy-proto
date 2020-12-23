# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/rbac/v4alpha/rbac.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v4alpha import address_pb2 as envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2
from envoy.config.route.v4alpha import route_components_pb2 as envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2
from envoy.type.matcher.v4alpha import metadata_pb2 as envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2
from envoy.type.matcher.v4alpha import path_pb2 as envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2
from envoy.type.matcher.v4alpha import string_pb2 as envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2
from google.api.expr.v1alpha1 import checked_pb2 as google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2
from google.api.expr.v1alpha1 import syntax_pb2 as google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/rbac/v4alpha/rbac.proto',
  package='envoy.config.rbac.v4alpha',
  syntax='proto3',
  serialized_options=b'\n\'io.envoyproxy.envoy.config.rbac.v4alphaB\tRbacProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$envoy/config/rbac/v4alpha/rbac.proto\x12\x19\x65nvoy.config.rbac.v4alpha\x1a\'envoy/config/core/v4alpha/address.proto\x1a\x31\x65nvoy/config/route/v4alpha/route_components.proto\x1a)envoy/type/matcher/v4alpha/metadata.proto\x1a%envoy/type/matcher/v4alpha/path.proto\x1a\'envoy/type/matcher/v4alpha/string.proto\x1a&google/api/expr/v1alpha1/checked.proto\x1a%google/api/expr/v1alpha1/syntax.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xa7\x02\n\x04RBAC\x12@\n\x06\x61\x63tion\x18\x01 \x01(\x0e\x32&.envoy.config.rbac.v4alpha.RBAC.ActionB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12?\n\x08policies\x18\x02 \x03(\x0b\x32-.envoy.config.rbac.v4alpha.RBAC.PoliciesEntry\x1aR\n\rPoliciesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x30\n\x05value\x18\x02 \x01(\x0b\x32!.envoy.config.rbac.v4alpha.Policy:\x02\x38\x01\"&\n\x06\x41\x63tion\x12\t\n\x05\x41LLOW\x10\x00\x12\x08\n\x04\x44\x45NY\x10\x01\x12\x07\n\x03LOG\x10\x02: \x9a\xc5\x88\x1e\x1b\n\x19\x65nvoy.config.rbac.v3.RBAC\"\xc7\x02\n\x06Policy\x12\x44\n\x0bpermissions\x18\x01 \x03(\x0b\x32%.envoy.config.rbac.v4alpha.PermissionB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x12\x42\n\nprincipals\x18\x02 \x03(\x0b\x32$.envoy.config.rbac.v4alpha.PrincipalB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x12\x33\n\tcondition\x18\x03 \x01(\x0b\x32\x1e.google.api.expr.v1alpha1.ExprH\x00\x12\x42\n\x11\x63hecked_condition\x18\x04 \x01(\x0b\x32%.google.api.expr.v1alpha1.CheckedExprH\x00:\"\x9a\xc5\x88\x1e\x1d\n\x1b\x65nvoy.config.rbac.v3.PolicyB\x16\n\x14\x65xpression_specifier\"\xf4\x05\n\nPermission\x12>\n\tand_rules\x18\x01 \x01(\x0b\x32).envoy.config.rbac.v4alpha.Permission.SetH\x00\x12=\n\x08or_rules\x18\x02 \x01(\x0b\x32).envoy.config.rbac.v4alpha.Permission.SetH\x00\x12\x16\n\x03\x61ny\x18\x03 \x01(\x08\x42\x07\xfa\x42\x04j\x02\x08\x01H\x00\x12;\n\x06header\x18\x04 \x01(\x0b\x32).envoy.config.route.v4alpha.HeaderMatcherH\x00\x12;\n\x08url_path\x18\n \x01(\x0b\x32\'.envoy.type.matcher.v4alpha.PathMatcherH\x00\x12>\n\x0e\x64\x65stination_ip\x18\x05 \x01(\x0b\x32$.envoy.config.core.v4alpha.CidrRangeH\x00\x12%\n\x10\x64\x65stination_port\x18\x06 \x01(\rB\t\xfa\x42\x06*\x04\x18\xff\xff\x03H\x00\x12?\n\x08metadata\x18\x07 \x01(\x0b\x32+.envoy.type.matcher.v4alpha.MetadataMatcherH\x00\x12\x39\n\x08not_rule\x18\x08 \x01(\x0b\x32%.envoy.config.rbac.v4alpha.PermissionH\x00\x12J\n\x15requested_server_name\x18\t \x01(\x0b\x32).envoy.type.matcher.v4alpha.StringMatcherH\x00\x1aq\n\x03Set\x12>\n\x05rules\x18\x01 \x03(\x0b\x32%.envoy.config.rbac.v4alpha.PermissionB\x08\xfa\x42\x05\x92\x01\x02\x08\x01:*\x9a\xc5\x88\x1e%\n#envoy.config.rbac.v3.Permission.Set:&\x9a\xc5\x88\x1e!\n\x1f\x65nvoy.config.rbac.v3.PermissionB\x0b\n\x04rule\x12\x03\xf8\x42\x01\"\xa3\x07\n\tPrincipal\x12;\n\x07\x61nd_ids\x18\x01 \x01(\x0b\x32(.envoy.config.rbac.v4alpha.Principal.SetH\x00\x12:\n\x06or_ids\x18\x02 \x01(\x0b\x32(.envoy.config.rbac.v4alpha.Principal.SetH\x00\x12\x16\n\x03\x61ny\x18\x03 \x01(\x08\x42\x07\xfa\x42\x04j\x02\x08\x01H\x00\x12K\n\rauthenticated\x18\x04 \x01(\x0b\x32\x32.envoy.config.rbac.v4alpha.Principal.AuthenticatedH\x00\x12@\n\x10\x64irect_remote_ip\x18\n \x01(\x0b\x32$.envoy.config.core.v4alpha.CidrRangeH\x00\x12\x39\n\tremote_ip\x18\x0b \x01(\x0b\x32$.envoy.config.core.v4alpha.CidrRangeH\x00\x12;\n\x06header\x18\x06 \x01(\x0b\x32).envoy.config.route.v4alpha.HeaderMatcherH\x00\x12;\n\x08url_path\x18\t \x01(\x0b\x32\'.envoy.type.matcher.v4alpha.PathMatcherH\x00\x12?\n\x08metadata\x18\x07 \x01(\x0b\x32+.envoy.type.matcher.v4alpha.MetadataMatcherH\x00\x12\x36\n\x06not_id\x18\x08 \x01(\x0b\x32$.envoy.config.rbac.v4alpha.PrincipalH\x00\x1am\n\x03Set\x12;\n\x03ids\x18\x01 \x03(\x0b\x32$.envoy.config.rbac.v4alpha.PrincipalB\x08\xfa\x42\x05\x92\x01\x02\x08\x01:)\x9a\xc5\x88\x1e$\n\"envoy.config.rbac.v3.Principal.Set\x1a\x8d\x01\n\rAuthenticated\x12\x41\n\x0eprincipal_name\x18\x02 \x01(\x0b\x32).envoy.type.matcher.v4alpha.StringMatcher:3\x9a\xc5\x88\x1e.\n,envoy.config.rbac.v3.Principal.AuthenticatedJ\x04\x08\x01\x10\x02:%\x9a\xc5\x88\x1e \n\x1e\x65nvoy.config.rbac.v3.PrincipalB\x11\n\nidentifier\x12\x03\xf8\x42\x01J\x04\x08\x05\x10\x06R\tsource_ipB>\n\'io.envoyproxy.envoy.config.rbac.v4alphaB\tRbacProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2.DESCRIPTOR,envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2.DESCRIPTOR,envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2.DESCRIPTOR,google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2.DESCRIPTOR,google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_RBAC_ACTION = _descriptor.EnumDescriptor(
  name='Action',
  full_name='envoy.config.rbac.v4alpha.RBAC.Action',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ALLOW', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DENY', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LOG', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=676,
  serialized_end=714,
)
_sym_db.RegisterEnumDescriptor(_RBAC_ACTION)


_RBAC_POLICIESENTRY = _descriptor.Descriptor(
  name='PoliciesEntry',
  full_name='envoy.config.rbac.v4alpha.RBAC.PoliciesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='envoy.config.rbac.v4alpha.RBAC.PoliciesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='envoy.config.rbac.v4alpha.RBAC.PoliciesEntry.value', index=1,
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
  serialized_start=592,
  serialized_end=674,
)

_RBAC = _descriptor.Descriptor(
  name='RBAC',
  full_name='envoy.config.rbac.v4alpha.RBAC',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='action', full_name='envoy.config.rbac.v4alpha.RBAC.action', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policies', full_name='envoy.config.rbac.v4alpha.RBAC.policies', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_RBAC_POLICIESENTRY, ],
  enum_types=[
    _RBAC_ACTION,
  ],
  serialized_options=b'\232\305\210\036\033\n\031envoy.config.rbac.v3.RBAC',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=453,
  serialized_end=748,
)


_POLICY = _descriptor.Descriptor(
  name='Policy',
  full_name='envoy.config.rbac.v4alpha.Policy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='permissions', full_name='envoy.config.rbac.v4alpha.Policy.permissions', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='principals', full_name='envoy.config.rbac.v4alpha.Policy.principals', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='condition', full_name='envoy.config.rbac.v4alpha.Policy.condition', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='checked_condition', full_name='envoy.config.rbac.v4alpha.Policy.checked_condition', index=3,
      number=4, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036\035\n\033envoy.config.rbac.v3.Policy',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='expression_specifier', full_name='envoy.config.rbac.v4alpha.Policy.expression_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=751,
  serialized_end=1078,
)


_PERMISSION_SET = _descriptor.Descriptor(
  name='Set',
  full_name='envoy.config.rbac.v4alpha.Permission.Set',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='rules', full_name='envoy.config.rbac.v4alpha.Permission.Set.rules', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036%\n#envoy.config.rbac.v3.Permission.Set',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1671,
  serialized_end=1784,
)

_PERMISSION = _descriptor.Descriptor(
  name='Permission',
  full_name='envoy.config.rbac.v4alpha.Permission',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='and_rules', full_name='envoy.config.rbac.v4alpha.Permission.and_rules', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='or_rules', full_name='envoy.config.rbac.v4alpha.Permission.or_rules', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='any', full_name='envoy.config.rbac.v4alpha.Permission.any', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004j\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='header', full_name='envoy.config.rbac.v4alpha.Permission.header', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='url_path', full_name='envoy.config.rbac.v4alpha.Permission.url_path', index=4,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='destination_ip', full_name='envoy.config.rbac.v4alpha.Permission.destination_ip', index=5,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='destination_port', full_name='envoy.config.rbac.v4alpha.Permission.destination_port', index=6,
      number=6, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\006*\004\030\377\377\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='envoy.config.rbac.v4alpha.Permission.metadata', index=7,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='not_rule', full_name='envoy.config.rbac.v4alpha.Permission.not_rule', index=8,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='requested_server_name', full_name='envoy.config.rbac.v4alpha.Permission.requested_server_name', index=9,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PERMISSION_SET, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036!\n\037envoy.config.rbac.v3.Permission',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='rule', full_name='envoy.config.rbac.v4alpha.Permission.rule',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=1081,
  serialized_end=1837,
)


_PRINCIPAL_SET = _descriptor.Descriptor(
  name='Set',
  full_name='envoy.config.rbac.v4alpha.Principal.Set',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='ids', full_name='envoy.config.rbac.v4alpha.Principal.Set.ids', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036$\n\"envoy.config.rbac.v3.Principal.Set',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2443,
  serialized_end=2552,
)

_PRINCIPAL_AUTHENTICATED = _descriptor.Descriptor(
  name='Authenticated',
  full_name='envoy.config.rbac.v4alpha.Principal.Authenticated',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='principal_name', full_name='envoy.config.rbac.v4alpha.Principal.Authenticated.principal_name', index=0,
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
  serialized_options=b'\232\305\210\036.\n,envoy.config.rbac.v3.Principal.Authenticated',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2555,
  serialized_end=2696,
)

_PRINCIPAL = _descriptor.Descriptor(
  name='Principal',
  full_name='envoy.config.rbac.v4alpha.Principal',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='and_ids', full_name='envoy.config.rbac.v4alpha.Principal.and_ids', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='or_ids', full_name='envoy.config.rbac.v4alpha.Principal.or_ids', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='any', full_name='envoy.config.rbac.v4alpha.Principal.any', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004j\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='authenticated', full_name='envoy.config.rbac.v4alpha.Principal.authenticated', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='direct_remote_ip', full_name='envoy.config.rbac.v4alpha.Principal.direct_remote_ip', index=4,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remote_ip', full_name='envoy.config.rbac.v4alpha.Principal.remote_ip', index=5,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='header', full_name='envoy.config.rbac.v4alpha.Principal.header', index=6,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='url_path', full_name='envoy.config.rbac.v4alpha.Principal.url_path', index=7,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='metadata', full_name='envoy.config.rbac.v4alpha.Principal.metadata', index=8,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='not_id', full_name='envoy.config.rbac.v4alpha.Principal.not_id', index=9,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PRINCIPAL_SET, _PRINCIPAL_AUTHENTICATED, ],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036 \n\036envoy.config.rbac.v3.Principal',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='identifier', full_name='envoy.config.rbac.v4alpha.Principal.identifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=1840,
  serialized_end=2771,
)

_RBAC_POLICIESENTRY.fields_by_name['value'].message_type = _POLICY
_RBAC_POLICIESENTRY.containing_type = _RBAC
_RBAC.fields_by_name['action'].enum_type = _RBAC_ACTION
_RBAC.fields_by_name['policies'].message_type = _RBAC_POLICIESENTRY
_RBAC_ACTION.containing_type = _RBAC
_POLICY.fields_by_name['permissions'].message_type = _PERMISSION
_POLICY.fields_by_name['principals'].message_type = _PRINCIPAL
_POLICY.fields_by_name['condition'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_syntax__pb2._EXPR
_POLICY.fields_by_name['checked_condition'].message_type = google_dot_api_dot_expr_dot_v1alpha1_dot_checked__pb2._CHECKEDEXPR
_POLICY.oneofs_by_name['expression_specifier'].fields.append(
  _POLICY.fields_by_name['condition'])
_POLICY.fields_by_name['condition'].containing_oneof = _POLICY.oneofs_by_name['expression_specifier']
_POLICY.oneofs_by_name['expression_specifier'].fields.append(
  _POLICY.fields_by_name['checked_condition'])
_POLICY.fields_by_name['checked_condition'].containing_oneof = _POLICY.oneofs_by_name['expression_specifier']
_PERMISSION_SET.fields_by_name['rules'].message_type = _PERMISSION
_PERMISSION_SET.containing_type = _PERMISSION
_PERMISSION.fields_by_name['and_rules'].message_type = _PERMISSION_SET
_PERMISSION.fields_by_name['or_rules'].message_type = _PERMISSION_SET
_PERMISSION.fields_by_name['header'].message_type = envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2._HEADERMATCHER
_PERMISSION.fields_by_name['url_path'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2._PATHMATCHER
_PERMISSION.fields_by_name['destination_ip'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2._CIDRRANGE
_PERMISSION.fields_by_name['metadata'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2._METADATAMATCHER
_PERMISSION.fields_by_name['not_rule'].message_type = _PERMISSION
_PERMISSION.fields_by_name['requested_server_name'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2._STRINGMATCHER
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['and_rules'])
_PERMISSION.fields_by_name['and_rules'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['or_rules'])
_PERMISSION.fields_by_name['or_rules'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['any'])
_PERMISSION.fields_by_name['any'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['header'])
_PERMISSION.fields_by_name['header'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['url_path'])
_PERMISSION.fields_by_name['url_path'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['destination_ip'])
_PERMISSION.fields_by_name['destination_ip'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['destination_port'])
_PERMISSION.fields_by_name['destination_port'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['metadata'])
_PERMISSION.fields_by_name['metadata'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['not_rule'])
_PERMISSION.fields_by_name['not_rule'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PERMISSION.oneofs_by_name['rule'].fields.append(
  _PERMISSION.fields_by_name['requested_server_name'])
_PERMISSION.fields_by_name['requested_server_name'].containing_oneof = _PERMISSION.oneofs_by_name['rule']
_PRINCIPAL_SET.fields_by_name['ids'].message_type = _PRINCIPAL
_PRINCIPAL_SET.containing_type = _PRINCIPAL
_PRINCIPAL_AUTHENTICATED.fields_by_name['principal_name'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2._STRINGMATCHER
_PRINCIPAL_AUTHENTICATED.containing_type = _PRINCIPAL
_PRINCIPAL.fields_by_name['and_ids'].message_type = _PRINCIPAL_SET
_PRINCIPAL.fields_by_name['or_ids'].message_type = _PRINCIPAL_SET
_PRINCIPAL.fields_by_name['authenticated'].message_type = _PRINCIPAL_AUTHENTICATED
_PRINCIPAL.fields_by_name['direct_remote_ip'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2._CIDRRANGE
_PRINCIPAL.fields_by_name['remote_ip'].message_type = envoy_dot_config_dot_core_dot_v4alpha_dot_address__pb2._CIDRRANGE
_PRINCIPAL.fields_by_name['header'].message_type = envoy_dot_config_dot_route_dot_v4alpha_dot_route__components__pb2._HEADERMATCHER
_PRINCIPAL.fields_by_name['url_path'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_path__pb2._PATHMATCHER
_PRINCIPAL.fields_by_name['metadata'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_metadata__pb2._METADATAMATCHER
_PRINCIPAL.fields_by_name['not_id'].message_type = _PRINCIPAL
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['and_ids'])
_PRINCIPAL.fields_by_name['and_ids'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['or_ids'])
_PRINCIPAL.fields_by_name['or_ids'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['any'])
_PRINCIPAL.fields_by_name['any'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['authenticated'])
_PRINCIPAL.fields_by_name['authenticated'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['direct_remote_ip'])
_PRINCIPAL.fields_by_name['direct_remote_ip'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['remote_ip'])
_PRINCIPAL.fields_by_name['remote_ip'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['header'])
_PRINCIPAL.fields_by_name['header'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['url_path'])
_PRINCIPAL.fields_by_name['url_path'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['metadata'])
_PRINCIPAL.fields_by_name['metadata'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
_PRINCIPAL.oneofs_by_name['identifier'].fields.append(
  _PRINCIPAL.fields_by_name['not_id'])
_PRINCIPAL.fields_by_name['not_id'].containing_oneof = _PRINCIPAL.oneofs_by_name['identifier']
DESCRIPTOR.message_types_by_name['RBAC'] = _RBAC
DESCRIPTOR.message_types_by_name['Policy'] = _POLICY
DESCRIPTOR.message_types_by_name['Permission'] = _PERMISSION
DESCRIPTOR.message_types_by_name['Principal'] = _PRINCIPAL
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RBAC = _reflection.GeneratedProtocolMessageType('RBAC', (_message.Message,), {

  'PoliciesEntry' : _reflection.GeneratedProtocolMessageType('PoliciesEntry', (_message.Message,), {
    'DESCRIPTOR' : _RBAC_POLICIESENTRY,
    '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.RBAC.PoliciesEntry)
    })
  ,
  'DESCRIPTOR' : _RBAC,
  '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.RBAC)
  })
_sym_db.RegisterMessage(RBAC)
_sym_db.RegisterMessage(RBAC.PoliciesEntry)

Policy = _reflection.GeneratedProtocolMessageType('Policy', (_message.Message,), {
  'DESCRIPTOR' : _POLICY,
  '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.Policy)
  })
_sym_db.RegisterMessage(Policy)

Permission = _reflection.GeneratedProtocolMessageType('Permission', (_message.Message,), {

  'Set' : _reflection.GeneratedProtocolMessageType('Set', (_message.Message,), {
    'DESCRIPTOR' : _PERMISSION_SET,
    '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.Permission.Set)
    })
  ,
  'DESCRIPTOR' : _PERMISSION,
  '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.Permission)
  })
_sym_db.RegisterMessage(Permission)
_sym_db.RegisterMessage(Permission.Set)

Principal = _reflection.GeneratedProtocolMessageType('Principal', (_message.Message,), {

  'Set' : _reflection.GeneratedProtocolMessageType('Set', (_message.Message,), {
    'DESCRIPTOR' : _PRINCIPAL_SET,
    '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.Principal.Set)
    })
  ,

  'Authenticated' : _reflection.GeneratedProtocolMessageType('Authenticated', (_message.Message,), {
    'DESCRIPTOR' : _PRINCIPAL_AUTHENTICATED,
    '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.Principal.Authenticated)
    })
  ,
  'DESCRIPTOR' : _PRINCIPAL,
  '__module__' : 'envoy.config.rbac.v4alpha.rbac_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.rbac.v4alpha.Principal)
  })
_sym_db.RegisterMessage(Principal)
_sym_db.RegisterMessage(Principal.Set)
_sym_db.RegisterMessage(Principal.Authenticated)


DESCRIPTOR._options = None
_RBAC_POLICIESENTRY._options = None
_RBAC.fields_by_name['action']._options = None
_RBAC._options = None
_POLICY.fields_by_name['permissions']._options = None
_POLICY.fields_by_name['principals']._options = None
_POLICY._options = None
_PERMISSION_SET.fields_by_name['rules']._options = None
_PERMISSION_SET._options = None
_PERMISSION.oneofs_by_name['rule']._options = None
_PERMISSION.fields_by_name['any']._options = None
_PERMISSION.fields_by_name['destination_port']._options = None
_PERMISSION._options = None
_PRINCIPAL_SET.fields_by_name['ids']._options = None
_PRINCIPAL_SET._options = None
_PRINCIPAL_AUTHENTICATED._options = None
_PRINCIPAL.oneofs_by_name['identifier']._options = None
_PRINCIPAL.fields_by_name['any']._options = None
_PRINCIPAL._options = None
# @@protoc_insertion_point(module_scope)
