# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.ratelimit.v3 import rls_pb2 as envoy_dot_config_dot_ratelimit_dot_v3_dot_rls__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto',
  package='envoy.extensions.filters.http.ratelimit.v3',
  syntax='proto3',
  serialized_options=b'\n8io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3B\016RateLimitProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n;envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto\x12*envoy.extensions.filters.http.ratelimit.v3\x1a#envoy/config/ratelimit/v3/rls.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xb9\x04\n\tRateLimit\x12\x17\n\x06\x64omain\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12\x16\n\x05stage\x18\x02 \x01(\rB\x07\xfa\x42\x04*\x02\x18\n\x12\x37\n\x0crequest_type\x18\x03 \x01(\tB!\xfa\x42\x1er\x1cR\x08internalR\x08\x65xternalR\x04\x62othR\x00\x12*\n\x07timeout\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x19\n\x11\x66\x61ilure_mode_deny\x18\x05 \x01(\x08\x12*\n\"rate_limited_as_resource_exhausted\x18\x06 \x01(\x08\x12W\n\x12rate_limit_service\x18\x07 \x01(\x0b\x32\x31.envoy.config.ratelimit.v3.RateLimitServiceConfigB\x08\xfa\x42\x05\x8a\x01\x02\x10\x01\x12\x7f\n\x1a\x65nable_x_ratelimit_headers\x18\x08 \x01(\x0e\x32Q.envoy.extensions.filters.http.ratelimit.v3.RateLimit.XRateLimitHeadersRFCVersionB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\"<\n\x1bXRateLimitHeadersRFCVersion\x12\x07\n\x03OFF\x10\x00\x12\x14\n\x10\x44RAFT_VERSION_03\x10\x01:7\x9a\xc5\x88\x1e\x32\n0envoy.config.filter.http.rate_limit.v2.RateLimit\"\xc6\x01\n\x11RateLimitPerRoute\x12s\n\x0evh_rate_limits\x18\x01 \x01(\x0e\x32Q.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptionsB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\"<\n\x13VhRateLimitsOptions\x12\x0c\n\x08OVERRIDE\x10\x00\x12\x0b\n\x07INCLUDE\x10\x01\x12\n\n\x06IGNORE\x10\x02\x42T\n8io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3B\x0eRateLimitProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_ratelimit_dot_v3_dot_rls__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_RATELIMIT_XRATELIMITHEADERSRFCVERSION = _descriptor.EnumDescriptor(
  name='XRateLimitHeadersRFCVersion',
  full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.XRateLimitHeadersRFCVersion',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='OFF', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DRAFT_VERSION_03', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=720,
  serialized_end=780,
)
_sym_db.RegisterEnumDescriptor(_RATELIMIT_XRATELIMITHEADERSRFCVERSION)

_RATELIMITPERROUTE_VHRATELIMITSOPTIONS = _descriptor.EnumDescriptor(
  name='VhRateLimitsOptions',
  full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='OVERRIDE', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INCLUDE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='IGNORE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=978,
  serialized_end=1038,
)
_sym_db.RegisterEnumDescriptor(_RATELIMITPERROUTE_VHRATELIMITSOPTIONS)


_RATELIMIT = _descriptor.Descriptor(
  name='RateLimit',
  full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='domain', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.domain', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stage', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.stage', index=1,
      number=2, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002\030\n', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_type', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.request_type', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\036r\034R\010internalR\010externalR\004bothR\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timeout', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.timeout', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='failure_mode_deny', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.failure_mode_deny', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rate_limited_as_resource_exhausted', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.rate_limited_as_resource_exhausted', index=5,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rate_limit_service', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.rate_limit_service', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\212\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enable_x_ratelimit_headers', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimit.enable_x_ratelimit_headers', index=7,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _RATELIMIT_XRATELIMITHEADERSRFCVERSION,
  ],
  serialized_options=b'\232\305\210\0362\n0envoy.config.filter.http.rate_limit.v2.RateLimit',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=268,
  serialized_end=837,
)


_RATELIMITPERROUTE = _descriptor.Descriptor(
  name='RateLimitPerRoute',
  full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='vh_rate_limits', full_name='envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.vh_rate_limits', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _RATELIMITPERROUTE_VHRATELIMITSOPTIONS,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=840,
  serialized_end=1038,
)

_RATELIMIT.fields_by_name['timeout'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_RATELIMIT.fields_by_name['rate_limit_service'].message_type = envoy_dot_config_dot_ratelimit_dot_v3_dot_rls__pb2._RATELIMITSERVICECONFIG
_RATELIMIT.fields_by_name['enable_x_ratelimit_headers'].enum_type = _RATELIMIT_XRATELIMITHEADERSRFCVERSION
_RATELIMIT_XRATELIMITHEADERSRFCVERSION.containing_type = _RATELIMIT
_RATELIMITPERROUTE.fields_by_name['vh_rate_limits'].enum_type = _RATELIMITPERROUTE_VHRATELIMITSOPTIONS
_RATELIMITPERROUTE_VHRATELIMITSOPTIONS.containing_type = _RATELIMITPERROUTE
DESCRIPTOR.message_types_by_name['RateLimit'] = _RATELIMIT
DESCRIPTOR.message_types_by_name['RateLimitPerRoute'] = _RATELIMITPERROUTE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RateLimit = _reflection.GeneratedProtocolMessageType('RateLimit', (_message.Message,), {
  'DESCRIPTOR' : _RATELIMIT,
  '__module__' : 'envoy.extensions.filters.http.ratelimit.v3.rate_limit_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.ratelimit.v3.RateLimit)
  })
_sym_db.RegisterMessage(RateLimit)

RateLimitPerRoute = _reflection.GeneratedProtocolMessageType('RateLimitPerRoute', (_message.Message,), {
  'DESCRIPTOR' : _RATELIMITPERROUTE,
  '__module__' : 'envoy.extensions.filters.http.ratelimit.v3.rate_limit_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)
  })
_sym_db.RegisterMessage(RateLimitPerRoute)


DESCRIPTOR._options = None
_RATELIMIT.fields_by_name['domain']._options = None
_RATELIMIT.fields_by_name['stage']._options = None
_RATELIMIT.fields_by_name['request_type']._options = None
_RATELIMIT.fields_by_name['rate_limit_service']._options = None
_RATELIMIT.fields_by_name['enable_x_ratelimit_headers']._options = None
_RATELIMIT._options = None
_RATELIMITPERROUTE.fields_by_name['vh_rate_limits']._options = None
# @@protoc_insertion_point(module_scope)
