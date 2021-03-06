# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/common/matching/v3/extension_matcher.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.common.matcher.v3 import matcher_pb2 as envoy_dot_config_dot_common_dot_matcher_dot_v3_dot_matcher__pb2
from envoy.config.core.v3 import extension_pb2 as envoy_dot_config_dot_core_dot_v3_dot_extension__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/common/matching/v3/extension_matcher.proto',
  package='envoy.extensions.common.matching.v3',
  syntax='proto3',
  serialized_options=b'\n1io.envoyproxy.envoy.extensions.common.matching.v3B\025ExtensionMatcherProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;envoy/extensions/common/matching/v3/extension_matcher.proto\x12#envoy.extensions.common.matching.v3\x1a,envoy/config/common/matcher/v3/matcher.proto\x1a$envoy/config/core/v3/extension.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xaa\x01\n\x14\x45xtensionWithMatcher\x12\x42\n\x07matcher\x18\x01 \x01(\x0b\x32\'.envoy.config.common.matcher.v3.MatcherB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12N\n\x10\x65xtension_config\x18\x02 \x01(\x0b\x32*.envoy.config.core.v3.TypedExtensionConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x42T\n1io.envoyproxy.envoy.extensions.common.matching.v3B\x15\x45xtensionMatcherProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_common_dot_matcher_dot_v3_dot_matcher__pb2.DESCRIPTOR,envoy_dot_config_dot_core_dot_v3_dot_extension__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_EXTENSIONWITHMATCHER = _descriptor.Descriptor(
  name='ExtensionWithMatcher',
  full_name='envoy.extensions.common.matching.v3.ExtensionWithMatcher',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='matcher', full_name='envoy.extensions.common.matching.v3.ExtensionWithMatcher.matcher', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='extension_config', full_name='envoy.extensions.common.matching.v3.ExtensionWithMatcher.extension_config', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=241,
  serialized_end=411,
)

_EXTENSIONWITHMATCHER.fields_by_name['matcher'].message_type = envoy_dot_config_dot_common_dot_matcher_dot_v3_dot_matcher__pb2._MATCHER
_EXTENSIONWITHMATCHER.fields_by_name['extension_config'].message_type = envoy_dot_config_dot_core_dot_v3_dot_extension__pb2._TYPEDEXTENSIONCONFIG
DESCRIPTOR.message_types_by_name['ExtensionWithMatcher'] = _EXTENSIONWITHMATCHER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ExtensionWithMatcher = _reflection.GeneratedProtocolMessageType('ExtensionWithMatcher', (_message.Message,), {
  'DESCRIPTOR' : _EXTENSIONWITHMATCHER,
  '__module__' : 'envoy.extensions.common.matching.v3.extension_matcher_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.common.matching.v3.ExtensionWithMatcher)
  })
_sym_db.RegisterMessage(ExtensionWithMatcher)


DESCRIPTOR._options = None
_EXTENSIONWITHMATCHER.fields_by_name['matcher']._options = None
_EXTENSIONWITHMATCHER.fields_by_name['extension_config']._options = None
# @@protoc_insertion_point(module_scope)
