# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/extensions/matching/input_matchers/ip/v3/ip.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import address_pb2 as envoy_dot_config_dot_core_dot_v3_dot_address__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/extensions/matching/input_matchers/ip/v3/ip.proto',
  package='envoy.extensions.matching.input_matchers.ip.v3',
  syntax='proto3',
  serialized_options=b'\n<io.envoyproxy.envoy.extensions.matching.input_matchers.ip.v3B\007IpProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7envoy/extensions/matching/input_matchers/ip/v3/ip.proto\x12.envoy.extensions.matching.input_matchers.ip.v3\x1a\"envoy/config/core/v3/address.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"b\n\x02Ip\x12>\n\x0b\x63idr_ranges\x18\x01 \x03(\x0b\x32\x1f.envoy.config.core.v3.CidrRangeB\x08\xfa\x42\x05\x92\x01\x02\x08\x01\x12\x1c\n\x0bstat_prefix\x18\x02 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x42Q\n<io.envoyproxy.envoy.extensions.matching.input_matchers.ip.v3B\x07IpProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_address__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])




_IP = _descriptor.Descriptor(
  name='Ip',
  full_name='envoy.extensions.matching.input_matchers.ip.v3.Ip',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cidr_ranges', full_name='envoy.extensions.matching.input_matchers.ip.v3.Ip.cidr_ranges', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\222\001\002\010\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stat_prefix', full_name='envoy.extensions.matching.input_matchers.ip.v3.Ip.stat_prefix', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=199,
  serialized_end=297,
)

_IP.fields_by_name['cidr_ranges'].message_type = envoy_dot_config_dot_core_dot_v3_dot_address__pb2._CIDRRANGE
DESCRIPTOR.message_types_by_name['Ip'] = _IP
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Ip = _reflection.GeneratedProtocolMessageType('Ip', (_message.Message,), {
  'DESCRIPTOR' : _IP,
  '__module__' : 'envoy.extensions.matching.input_matchers.ip.v3.ip_pb2'
  # @@protoc_insertion_point(class_scope:envoy.extensions.matching.input_matchers.ip.v3.Ip)
  })
_sym_db.RegisterMessage(Ip)


DESCRIPTOR._options = None
_IP.fields_by_name['cidr_ranges']._options = None
_IP.fields_by_name['stat_prefix']._options = None
# @@protoc_insertion_point(module_scope)
