# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/ratelimit/v3/rls.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from envoy.extensions.common.ratelimit.v3 import ratelimit_pb2 as envoy_dot_extensions_dot_common_dot_ratelimit_dot_v3_dot_ratelimit__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/service/ratelimit/v3/rls.proto',
  package='envoy.service.ratelimit.v3',
  syntax='proto3',
  serialized_options=b'\n(io.envoyproxy.envoy.service.ratelimit.v3B\010RlsProtoP\001\210\001\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n$envoy/service/ratelimit/v3/rls.proto\x12\x1a\x65nvoy.service.ratelimit.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a\x34\x65nvoy/extensions/common/ratelimit/v3/ratelimit.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xbb\x01\n\x10RateLimitRequest\x12\x0e\n\x06\x64omain\x18\x01 \x01(\t\x12N\n\x0b\x64\x65scriptors\x18\x02 \x03(\x0b\x32\x39.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor\x12\x13\n\x0bhits_addend\x18\x03 \x01(\r:2\x9a\xc5\x88\x1e-\n+envoy.service.ratelimit.v2.RateLimitRequest\"\xd1\t\n\x11RateLimitResponse\x12H\n\x0coverall_code\x18\x01 \x01(\x0e\x32\x32.envoy.service.ratelimit.v3.RateLimitResponse.Code\x12P\n\x08statuses\x18\x02 \x03(\x0b\x32>.envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus\x12\x42\n\x17response_headers_to_add\x18\x03 \x03(\x0b\x32!.envoy.config.core.v3.HeaderValue\x12\x41\n\x16request_headers_to_add\x18\x04 \x03(\x0b\x32!.envoy.config.core.v3.HeaderValue\x12\x10\n\x08raw_body\x18\x05 \x01(\x0c\x12\x31\n\x10\x64ynamic_metadata\x18\x06 \x01(\x0b\x32\x17.google.protobuf.Struct\x1a\xff\x01\n\tRateLimit\x12\x0c\n\x04name\x18\x03 \x01(\t\x12\x19\n\x11requests_per_unit\x18\x01 \x01(\r\x12J\n\x04unit\x18\x02 \x01(\x0e\x32<.envoy.service.ratelimit.v3.RateLimitResponse.RateLimit.Unit\">\n\x04Unit\x12\x0b\n\x07UNKNOWN\x10\x00\x12\n\n\x06SECOND\x10\x01\x12\n\n\x06MINUTE\x10\x02\x12\x08\n\x04HOUR\x10\x03\x12\x07\n\x03\x44\x41Y\x10\x04:=\x9a\xc5\x88\x1e\x38\n6envoy.service.ratelimit.v2.RateLimitResponse.RateLimit\x1am\n\x05Quota\x12\x19\n\x08requests\x18\x01 \x01(\rB\x07\xfa\x42\x04*\x02 \x00\x12\x31\n\x0bvalid_until\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x16\n\x14\x65xpiration_specifier\x1a\x80\x03\n\x10\x44\x65scriptorStatus\x12@\n\x04\x63ode\x18\x01 \x01(\x0e\x32\x32.envoy.service.ratelimit.v3.RateLimitResponse.Code\x12N\n\rcurrent_limit\x18\x02 \x01(\x0b\x32\x37.envoy.service.ratelimit.v3.RateLimitResponse.RateLimit\x12\x17\n\x0flimit_remaining\x18\x03 \x01(\r\x12\x37\n\x14\x64uration_until_reset\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x42\n\x05quota\x18\x05 \x01(\x0b\x32\x33.envoy.service.ratelimit.v3.RateLimitResponse.Quota:D\x9a\xc5\x88\x1e?\n=envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus\"+\n\x04\x43ode\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x06\n\x02OK\x10\x01\x12\x0e\n\nOVER_LIMIT\x10\x02:3\x9a\xc5\x88\x1e.\n,envoy.service.ratelimit.v2.RateLimitResponse2\x84\x01\n\x10RateLimitService\x12p\n\x0fShouldRateLimit\x12,.envoy.service.ratelimit.v3.RateLimitRequest\x1a-.envoy.service.ratelimit.v3.RateLimitResponse\"\x00\x42\x41\n(io.envoyproxy.envoy.service.ratelimit.v3B\x08RlsProtoP\x01\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_base__pb2.DESCRIPTOR,envoy_dot_extensions_dot_common_dot_ratelimit_dot_v3_dot_ratelimit__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_RATELIMITRESPONSE_RATELIMIT_UNIT = _descriptor.EnumDescriptor(
  name='Unit',
  full_name='envoy.service.ratelimit.v3.RateLimitResponse.RateLimit.Unit',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SECOND', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MINUTE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HOUR', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DAY', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1044,
  serialized_end=1106,
)
_sym_db.RegisterEnumDescriptor(_RATELIMITRESPONSE_RATELIMIT_UNIT)

_RATELIMITRESPONSE_CODE = _descriptor.EnumDescriptor(
  name='Code',
  full_name='envoy.service.ratelimit.v3.RateLimitResponse.Code',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OK', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OVER_LIMIT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1669,
  serialized_end=1712,
)
_sym_db.RegisterEnumDescriptor(_RATELIMITRESPONSE_CODE)


_RATELIMITREQUEST = _descriptor.Descriptor(
  name='RateLimitRequest',
  full_name='envoy.service.ratelimit.v3.RateLimitRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='domain', full_name='envoy.service.ratelimit.v3.RateLimitRequest.domain', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='descriptors', full_name='envoy.service.ratelimit.v3.RateLimitRequest.descriptors', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='hits_addend', full_name='envoy.service.ratelimit.v3.RateLimitRequest.hits_addend', index=2,
      number=3, type=13, cpp_type=3, label=1,
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
  serialized_options=b'\232\305\210\036-\n+envoy.service.ratelimit.v2.RateLimitRequest',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=342,
  serialized_end=529,
)


_RATELIMITRESPONSE_RATELIMIT = _descriptor.Descriptor(
  name='RateLimit',
  full_name='envoy.service.ratelimit.v3.RateLimitResponse.RateLimit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='envoy.service.ratelimit.v3.RateLimitResponse.RateLimit.name', index=0,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='requests_per_unit', full_name='envoy.service.ratelimit.v3.RateLimitResponse.RateLimit.requests_per_unit', index=1,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='unit', full_name='envoy.service.ratelimit.v3.RateLimitResponse.RateLimit.unit', index=2,
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
    _RATELIMITRESPONSE_RATELIMIT_UNIT,
  ],
  serialized_options=b'\232\305\210\0368\n6envoy.service.ratelimit.v2.RateLimitResponse.RateLimit',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=914,
  serialized_end=1169,
)

_RATELIMITRESPONSE_QUOTA = _descriptor.Descriptor(
  name='Quota',
  full_name='envoy.service.ratelimit.v3.RateLimitResponse.Quota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='requests', full_name='envoy.service.ratelimit.v3.RateLimitResponse.Quota.requests', index=0,
      number=1, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004*\002 \000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='valid_until', full_name='envoy.service.ratelimit.v3.RateLimitResponse.Quota.valid_until', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='expiration_specifier', full_name='envoy.service.ratelimit.v3.RateLimitResponse.Quota.expiration_specifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1171,
  serialized_end=1280,
)

_RATELIMITRESPONSE_DESCRIPTORSTATUS = _descriptor.Descriptor(
  name='DescriptorStatus',
  full_name='envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus.code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='current_limit', full_name='envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus.current_limit', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit_remaining', full_name='envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus.limit_remaining', index=2,
      number=3, type=13, cpp_type=3, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='duration_until_reset', full_name='envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus.duration_until_reset', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota', full_name='envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus.quota', index=4,
      number=5, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036?\n=envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1283,
  serialized_end=1667,
)

_RATELIMITRESPONSE = _descriptor.Descriptor(
  name='RateLimitResponse',
  full_name='envoy.service.ratelimit.v3.RateLimitResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='overall_code', full_name='envoy.service.ratelimit.v3.RateLimitResponse.overall_code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='statuses', full_name='envoy.service.ratelimit.v3.RateLimitResponse.statuses', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='response_headers_to_add', full_name='envoy.service.ratelimit.v3.RateLimitResponse.response_headers_to_add', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='request_headers_to_add', full_name='envoy.service.ratelimit.v3.RateLimitResponse.request_headers_to_add', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='raw_body', full_name='envoy.service.ratelimit.v3.RateLimitResponse.raw_body', index=4,
      number=5, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dynamic_metadata', full_name='envoy.service.ratelimit.v3.RateLimitResponse.dynamic_metadata', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_RATELIMITRESPONSE_RATELIMIT, _RATELIMITRESPONSE_QUOTA, _RATELIMITRESPONSE_DESCRIPTORSTATUS, ],
  enum_types=[
    _RATELIMITRESPONSE_CODE,
  ],
  serialized_options=b'\232\305\210\036.\n,envoy.service.ratelimit.v2.RateLimitResponse',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=532,
  serialized_end=1765,
)

_RATELIMITREQUEST.fields_by_name['descriptors'].message_type = envoy_dot_extensions_dot_common_dot_ratelimit_dot_v3_dot_ratelimit__pb2._RATELIMITDESCRIPTOR
_RATELIMITRESPONSE_RATELIMIT.fields_by_name['unit'].enum_type = _RATELIMITRESPONSE_RATELIMIT_UNIT
_RATELIMITRESPONSE_RATELIMIT.containing_type = _RATELIMITRESPONSE
_RATELIMITRESPONSE_RATELIMIT_UNIT.containing_type = _RATELIMITRESPONSE_RATELIMIT
_RATELIMITRESPONSE_QUOTA.fields_by_name['valid_until'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_RATELIMITRESPONSE_QUOTA.containing_type = _RATELIMITRESPONSE
_RATELIMITRESPONSE_QUOTA.oneofs_by_name['expiration_specifier'].fields.append(
  _RATELIMITRESPONSE_QUOTA.fields_by_name['valid_until'])
_RATELIMITRESPONSE_QUOTA.fields_by_name['valid_until'].containing_oneof = _RATELIMITRESPONSE_QUOTA.oneofs_by_name['expiration_specifier']
_RATELIMITRESPONSE_DESCRIPTORSTATUS.fields_by_name['code'].enum_type = _RATELIMITRESPONSE_CODE
_RATELIMITRESPONSE_DESCRIPTORSTATUS.fields_by_name['current_limit'].message_type = _RATELIMITRESPONSE_RATELIMIT
_RATELIMITRESPONSE_DESCRIPTORSTATUS.fields_by_name['duration_until_reset'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_RATELIMITRESPONSE_DESCRIPTORSTATUS.fields_by_name['quota'].message_type = _RATELIMITRESPONSE_QUOTA
_RATELIMITRESPONSE_DESCRIPTORSTATUS.containing_type = _RATELIMITRESPONSE
_RATELIMITRESPONSE.fields_by_name['overall_code'].enum_type = _RATELIMITRESPONSE_CODE
_RATELIMITRESPONSE.fields_by_name['statuses'].message_type = _RATELIMITRESPONSE_DESCRIPTORSTATUS
_RATELIMITRESPONSE.fields_by_name['response_headers_to_add'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._HEADERVALUE
_RATELIMITRESPONSE.fields_by_name['request_headers_to_add'].message_type = envoy_dot_config_dot_core_dot_v3_dot_base__pb2._HEADERVALUE
_RATELIMITRESPONSE.fields_by_name['dynamic_metadata'].message_type = google_dot_protobuf_dot_struct__pb2._STRUCT
_RATELIMITRESPONSE_CODE.containing_type = _RATELIMITRESPONSE
DESCRIPTOR.message_types_by_name['RateLimitRequest'] = _RATELIMITREQUEST
DESCRIPTOR.message_types_by_name['RateLimitResponse'] = _RATELIMITRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RateLimitRequest = _reflection.GeneratedProtocolMessageType('RateLimitRequest', (_message.Message,), {
  'DESCRIPTOR' : _RATELIMITREQUEST,
  '__module__' : 'envoy.service.ratelimit.v3.rls_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.ratelimit.v3.RateLimitRequest)
  })
_sym_db.RegisterMessage(RateLimitRequest)

RateLimitResponse = _reflection.GeneratedProtocolMessageType('RateLimitResponse', (_message.Message,), {

  'RateLimit' : _reflection.GeneratedProtocolMessageType('RateLimit', (_message.Message,), {
    'DESCRIPTOR' : _RATELIMITRESPONSE_RATELIMIT,
    '__module__' : 'envoy.service.ratelimit.v3.rls_pb2'
    # @@protoc_insertion_point(class_scope:envoy.service.ratelimit.v3.RateLimitResponse.RateLimit)
    })
  ,

  'Quota' : _reflection.GeneratedProtocolMessageType('Quota', (_message.Message,), {
    'DESCRIPTOR' : _RATELIMITRESPONSE_QUOTA,
    '__module__' : 'envoy.service.ratelimit.v3.rls_pb2'
    # @@protoc_insertion_point(class_scope:envoy.service.ratelimit.v3.RateLimitResponse.Quota)
    })
  ,

  'DescriptorStatus' : _reflection.GeneratedProtocolMessageType('DescriptorStatus', (_message.Message,), {
    'DESCRIPTOR' : _RATELIMITRESPONSE_DESCRIPTORSTATUS,
    '__module__' : 'envoy.service.ratelimit.v3.rls_pb2'
    # @@protoc_insertion_point(class_scope:envoy.service.ratelimit.v3.RateLimitResponse.DescriptorStatus)
    })
  ,
  'DESCRIPTOR' : _RATELIMITRESPONSE,
  '__module__' : 'envoy.service.ratelimit.v3.rls_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.ratelimit.v3.RateLimitResponse)
  })
_sym_db.RegisterMessage(RateLimitResponse)
_sym_db.RegisterMessage(RateLimitResponse.RateLimit)
_sym_db.RegisterMessage(RateLimitResponse.Quota)
_sym_db.RegisterMessage(RateLimitResponse.DescriptorStatus)


DESCRIPTOR._options = None
_RATELIMITREQUEST._options = None
_RATELIMITRESPONSE_RATELIMIT._options = None
_RATELIMITRESPONSE_QUOTA.fields_by_name['requests']._options = None
_RATELIMITRESPONSE_DESCRIPTORSTATUS._options = None
_RATELIMITRESPONSE._options = None

_RATELIMITSERVICE = _descriptor.ServiceDescriptor(
  name='RateLimitService',
  full_name='envoy.service.ratelimit.v3.RateLimitService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=1768,
  serialized_end=1900,
  methods=[
  _descriptor.MethodDescriptor(
    name='ShouldRateLimit',
    full_name='envoy.service.ratelimit.v3.RateLimitService.ShouldRateLimit',
    index=0,
    containing_service=None,
    input_type=_RATELIMITREQUEST,
    output_type=_RATELIMITRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_RATELIMITSERVICE)

DESCRIPTOR.services_by_name['RateLimitService'] = _RATELIMITSERVICE

# @@protoc_insertion_point(module_scope)
