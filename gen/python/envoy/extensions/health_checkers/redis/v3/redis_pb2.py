# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/health_checkers/redis/v3/redis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/health_checkers/redis/v3/redis.proto',
  package='envoy.extensions.health_checkers.redis.v3',
  syntax='proto3',
  serialized_options=b'\n7io.envoyproxy.envoy.extensions.health_checkers.redis.v3B\nRedisProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5envoy/extensions/health_checkers/redis/v3/redis.proto\x12)envoy.extensions.health_checkers.redis.v3\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"G\n\x05Redis\x12\x0b\n\x03key\x18\x01 \x01(\t:1\x9a\xc5\x88\x1e,\n*envoy.config.health_checker.redis.v2.RedisBO\n7io.envoyproxy.envoy.extensions.health_checkers.redis.v3B\nRedisProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_REDIS = _descriptor.Descriptor(
  name='Redis',
  full_name='envoy.extensions.health_checkers.redis.v3.Redis',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='envoy.extensions.health_checkers.redis.v3.Redis.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036,\n*envoy.config.health_checker.redis.v2.Redis',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=166,
  serialized_end=237,
)

DESCRIPTOR.message_types_by_name['Redis'] = _REDIS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Redis = _reflection.GeneratedProtocolMessageType('Redis', (_message.Message,), {
  'DESCRIPTOR' : _REDIS,
  '__module__' : 'envoy.extensions.health_checkers.redis.v3.redis_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.health_checkers.redis.v3.Redis)
  })
_sym_db.RegisterMessage(Redis)


DESCRIPTOR._options = None
_REDIS._options = None
# @@protoc_insertion_point(module_scope)
