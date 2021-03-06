# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/filter/network/mongo_proxy/v2/mongo_proxy.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.filter.fault.v2 import fault_pb2 as envoy_dot_config_dot_filter_dot_fault_dot_v2_dot_fault__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/filter/network/mongo_proxy/v2/mongo_proxy.proto',
  package='envoy.config.filter.network.mongo_proxy.v2',
  syntax='proto3',
  serialized_options=b'\n8io.envoyproxy.envoy.config.filter.network.mongo_proxy.v2B\017MongoProxyProtoP\001\362\230\376\217\0051\022/envoy.extensions.filters.network.mongo_proxy.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<envoy/config/filter/network/mongo_proxy/v2/mongo_proxy.proto\x12*envoy.config.filter.network.mongo_proxy.v2\x1a(envoy/config/filter/fault/v2/fault.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\x96\x01\n\nMongoProxy\x12\x1c\n\x0bstat_prefix\x18\x01 \x01(\tB\x07\xfa\x42\x04r\x02 \x01\x12\x12\n\naccess_log\x18\x02 \x01(\t\x12\x37\n\x05\x64\x65lay\x18\x03 \x01(\x0b\x32(.envoy.config.filter.fault.v2.FaultDelay\x12\x1d\n\x15\x65mit_dynamic_metadata\x18\x04 \x01(\x08\x42\x8c\x01\n8io.envoyproxy.envoy.config.filter.network.mongo_proxy.v2B\x0fMongoProxyProtoP\x01\xf2\x98\xfe\x8f\x05\x31\x12/envoy.extensions.filters.network.mongo_proxy.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_filter_dot_fault_dot_v2_dot_fault__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_MONGOPROXY = _descriptor.Descriptor(
  name='MongoProxy',
  full_name='envoy.config.filter.network.mongo_proxy.v2.MongoProxy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='stat_prefix', full_name='envoy.config.filter.network.mongo_proxy.v2.MongoProxy.stat_prefix', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002 \001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='access_log', full_name='envoy.config.filter.network.mongo_proxy.v2.MongoProxy.access_log', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='delay', full_name='envoy.config.filter.network.mongo_proxy.v2.MongoProxy.delay', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='emit_dynamic_metadata', full_name='envoy.config.filter.network.mongo_proxy.v2.MongoProxy.emit_dynamic_metadata', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=239,
  serialized_end=389,
)

_MONGOPROXY.fields_by_name['delay'].message_type = envoy_dot_config_dot_filter_dot_fault_dot_v2_dot_fault__pb2._FAULTDELAY
DESCRIPTOR.message_types_by_name['MongoProxy'] = _MONGOPROXY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MongoProxy = _reflection.GeneratedProtocolMessageType('MongoProxy', (_message.Message,), {
  'DESCRIPTOR' : _MONGOPROXY,
  '__module__' : 'envoy.config.filter.network.mongo_proxy.v2.mongo_proxy_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.filter.network.mongo_proxy.v2.MongoProxy)
  })
_sym_db.RegisterMessage(MongoProxy)


DESCRIPTOR._options = None
_MONGOPROXY.fields_by_name['stat_prefix']._options = None
# @@protoc_insertion_point(module_scope)
