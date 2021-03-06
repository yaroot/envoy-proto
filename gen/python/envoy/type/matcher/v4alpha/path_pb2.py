# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/type/matcher/v4alpha/path.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.type.matcher.v4alpha import string_pb2 as envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/type/matcher/v4alpha/path.proto',
  package='envoy.type.matcher.v4alpha',
  syntax='proto3',
  serialized_options=b'\n(io.envoyproxy.envoy.type.matcher.v4alphaB\tPathProtoP\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%envoy/type/matcher/v4alpha/path.proto\x12\x1a\x65nvoy.type.matcher.v4alpha\x1a\'envoy/type/matcher/v4alpha/string.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\x89\x01\n\x0bPathMatcher\x12\x43\n\x04path\x18\x01 \x01(\x0b\x32).envoy.type.matcher.v4alpha.StringMatcherB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01H\x00:(\x9a\xc5\x88\x1e#\n!envoy.type.matcher.v3.PathMatcherB\x0b\n\x04rule\x12\x03\xf8\x42\x01\x42?\n(io.envoyproxy.envoy.type.matcher.v4alphaB\tPathProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_PATHMATCHER = _descriptor.Descriptor(
  name='PathMatcher',
  full_name='envoy.type.matcher.v4alpha.PathMatcher',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='path', full_name='envoy.type.matcher.v4alpha.PathMatcher.path', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036#\n!envoy.type.matcher.v3.PathMatcher',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='rule', full_name='envoy.type.matcher.v4alpha.PathMatcher.rule',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=202,
  serialized_end=339,
)

_PATHMATCHER.fields_by_name['path'].message_type = envoy_dot_type_dot_matcher_dot_v4alpha_dot_string__pb2._STRINGMATCHER
_PATHMATCHER.oneofs_by_name['rule'].fields.append(
  _PATHMATCHER.fields_by_name['path'])
_PATHMATCHER.fields_by_name['path'].containing_oneof = _PATHMATCHER.oneofs_by_name['rule']
DESCRIPTOR.message_types_by_name['PathMatcher'] = _PATHMATCHER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PathMatcher = _reflection.GeneratedProtocolMessageType('PathMatcher', (_message.Message,), {
  'DESCRIPTOR' : _PATHMATCHER,
  '__module__' : 'envoy.type.matcher.v4alpha.path_pb2'
  # @@protoc_insertion_point(class_scope:envoy.type.matcher.v4alpha.PathMatcher)
  })
_sym_db.RegisterMessage(PathMatcher)


DESCRIPTOR._options = None
_PATHMATCHER.oneofs_by_name['rule']._options = None
_PATHMATCHER.fields_by_name['path']._options = None
_PATHMATCHER._options = None
# @@protoc_insertion_point(module_scope)
