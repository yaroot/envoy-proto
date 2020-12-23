# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/network/ratelimit/v3/rate_limit.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.ratelimit.v3 import rls_pb2 as envoy_dot_config_dot_ratelimit_dot_v3_dot_rls__pb2
from envoy.extensions.common.ratelimit.v3 import ratelimit_pb2 as envoy_dot_extensions_dot_common_dot_ratelimit_dot_v3_dot_ratelimit__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/network/ratelimit/v3/rate_limit.proto',
  package='envoy.extensions.filters.network.ratelimit.v3',
  syntax='proto3',
  serialized_options=b'\n;io.envoyproxy.envoy.extensions.filters.network.ratelimit.v3B\016RateLimitProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>envoy/extensions/filters/network/ratelimit/v3/rate_limit.proto\x12-envoy.extensions.filters.network.ratelimit.v3\x1a#envoy/config/ratelimit/v3/rls.proto\x1a\x34\x65nvoy/extensions/common/ratelimit/v3/ratelimit.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xf8\x02\n\tRateLimit\x12\x1c\n\x0bstat_prefix\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x17\n\x06\x64omain\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12X\n\x0b\x64\x65scriptors\x18\x03 \x03(\x0b\x32\x39.envoy.extensions.common.ratelimit.v3.RateLimitDescriptorB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x12*\n\x07timeout\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x19\n\x11\x66\x61ilure_mode_deny\x18\x05 \x01(\x08\x12W\n\x12rate_limit_service\x18\x06 \x01(\x0b\x32\x31.envoy.config.ratelimit.v3.RateLimitServiceConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01::\x9a\xc5\x88\x1e\x35\n3envoy.config.filter.network.rate_limit.v2.RateLimitBW\n;io.envoyproxy.envoy.extensions.filters.network.ratelimit.v3B\x0eRateLimitProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_ratelimit_dot_v3_dot_rls__pb2.DESCRIPTOR,envoy_dot_extensions_dot_common_dot_ratelimit_dot_v3_dot_ratelimit__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_RATELIMIT = _descriptor.Descriptor(
  name='RateLimit',
  full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='stat_prefix', full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit.stat_prefix', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='domain', full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit.domain', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='descriptors', full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit.descriptors', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timeout', full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit.timeout', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='failure_mode_deny', full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit.failure_mode_deny', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rate_limit_service', full_name='envoy.extensions.filters.network.ratelimit.v3.RateLimit.rate_limit_service', index=5,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\0365\n3envoy.config.filter.network.rate_limit.v2.RateLimit',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=328,
  serialized_end=704,
)

_RATELIMIT.fields_by_name['descriptors'].message_type = envoy_dot_extensions_dot_common_dot_ratelimit_dot_v3_dot_ratelimit__pb2._RATELIMITDESCRIPTOR
_RATELIMIT.fields_by_name['timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_RATELIMIT.fields_by_name['rate_limit_service'].message_type = envoy_dot_config_dot_ratelimit_dot_v3_dot_rls__pb2._RATELIMITSERVICECONFIG
DESCRIPTOR.message_types_by_name['RateLimit'] = _RATELIMIT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RateLimit = _reflection.GeneratedProtocolMessageType('RateLimit', (_message.Message,), {
  'DESCRIPTOR' : _RATELIMIT,
  '__module__' : 'envoy.extensions.filters.network.ratelimit.v3.rate_limit_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.ratelimit.v3.RateLimit)
  })
_sym_db.RegisterMessage(RateLimit)


DESCRIPTOR._options = None
_RATELIMIT.fields_by_name['stat_prefix']._options = None
_RATELIMIT.fields_by_name['domain']._options = None
_RATELIMIT.fields_by_name['descriptors']._options = None
_RATELIMIT.fields_by_name['rate_limit_service']._options = None
_RATELIMIT._options = None
# @@protoc_insertion_point(module_scope)
