# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/network/rbac/v3/rbac.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.rbac.v3 import rbac_pb2 as envoy_dot_config_dot_rbac_dot_v3_dot_rbac__pb2
from xds.annotations.v3 import status_pb2 as xds_dot_annotations_dot_v3_dot_status__pb2
from xds.type.matcher.v3 import matcher_pb2 as xds_dot_type_dot_matcher_dot_v3_dot_matcher__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3envoy/extensions/filters/network/rbac/v3/rbac.proto\x12(envoy.extensions.filters.network.rbac.v3\x1a\x1f\x65nvoy/config/rbac/v3/rbac.proto\x1a\x1fxds/annotations/v3/status.proto\x1a!xds/type/matcher/v3/matcher.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xd4\x04\n\x04RBAC\x12\x42\n\x05rules\x18\x01 \x01(\x0b\x32\x1a.envoy.config.rbac.v3.RBACB\x17\xf2\x98\xfe\x8f\x05\x11\x12\x0frules_specifier\x12N\n\x07matcher\x18\x06 \x01(\x0b\x32\x1c.xds.type.matcher.v3.MatcherB\x1f\xf2\x98\xfe\x8f\x05\x11\x12\x0frules_specifier\xd2\xc6\xa4\xe1\x06\x02\x08\x01\x12P\n\x0cshadow_rules\x18\x02 \x01(\x0b\x32\x1a.envoy.config.rbac.v3.RBACB\x1e\xf2\x98\xfe\x8f\x05\x18\x12\x16shadow_rules_specifier\x12\\\n\x0eshadow_matcher\x18\x07 \x01(\x0b\x32\x1c.xds.type.matcher.v3.MatcherB&\xf2\x98\xfe\x8f\x05\x18\x12\x16shadow_rules_specifier\xd2\xc6\xa4\xe1\x06\x02\x08\x01\x12 \n\x18shadow_rules_stat_prefix\x18\x05 \x01(\t\x12\x1c\n\x0bstat_prefix\x18\x03 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12X\n\x10\x65nforcement_type\x18\x04 \x01(\x0e\x32>.envoy.extensions.filters.network.rbac.v3.RBAC.EnforcementType\"=\n\x0f\x45nforcementType\x12\x1a\n\x16ONE_TIME_ON_FIRST_BYTE\x10\x00\x12\x0e\n\nCONTINUOUS\x10\x01:/\x9a\xc5\x88\x1e*\n(envoy.config.filter.network.rbac.v2.RBACB\xa5\x01\n6io.envoyproxy.envoy.extensions.filters.network.rbac.v3B\tRbacProtoP\x01ZVgithub.com/envoyproxy/go-control-plane/envoy/extensions/filters/network/rbac/v3;rbacv3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.extensions.filters.network.rbac.v3.rbac_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n6io.envoyproxy.envoy.extensions.filters.network.rbac.v3B\tRbacProtoP\001ZVgithub.com/envoyproxy/go-control-plane/envoy/extensions/filters/network/rbac/v3;rbacv3\272\200\310\321\006\002\020\002'
  _RBAC.fields_by_name['rules']._options = None
  _RBAC.fields_by_name['rules']._serialized_options = b'\362\230\376\217\005\021\022\017rules_specifier'
  _RBAC.fields_by_name['matcher']._options = None
  _RBAC.fields_by_name['matcher']._serialized_options = b'\362\230\376\217\005\021\022\017rules_specifier\322\306\244\341\006\002\010\001'
  _RBAC.fields_by_name['shadow_rules']._options = None
  _RBAC.fields_by_name['shadow_rules']._serialized_options = b'\362\230\376\217\005\030\022\026shadow_rules_specifier'
  _RBAC.fields_by_name['shadow_matcher']._options = None
  _RBAC.fields_by_name['shadow_matcher']._serialized_options = b'\362\230\376\217\005\030\022\026shadow_rules_specifier\322\306\244\341\006\002\010\001'
  _RBAC.fields_by_name['stat_prefix']._options = None
  _RBAC.fields_by_name['stat_prefix']._serialized_options = b'\372B\004r\002\020\001'
  _RBAC._options = None
  _RBAC._serialized_options = b'\232\305\210\036*\n(envoy.config.filter.network.rbac.v2.RBAC'
  _RBAC._serialized_start=322
  _RBAC._serialized_end=918
  _RBAC_ENFORCEMENTTYPE._serialized_start=808
  _RBAC_ENFORCEMENTTYPE._serialized_end=869
# @@protoc_insertion_point(module_scope)
