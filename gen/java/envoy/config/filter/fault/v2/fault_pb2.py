# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/config/filter/fault/v2/fault.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.type import percent_pb2 as envoy_dot_type_dot_percent__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from envoy.annotations import deprecation_pb2 as envoy_dot_annotations_dot_deprecation__pb2
from udpa.annotations import migrate_pb2 as udpa_dot_annotations_dot_migrate__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/config/filter/fault/v2/fault.proto',
  package='envoy.config.filter.fault.v2',
  syntax='proto3',
  serialized_options=b'\n*io.envoyproxy.envoy.config.filter.fault.v2B\nFaultProtoP\001\362\230\376\217\005*\022(envoy.extensions.filters.common.fault.v3\272\200\310\321\006\002\020\001',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(envoy/config/filter/fault/v2/fault.proto\x12\x1c\x65nvoy.config.filter.fault.v2\x1a\x18\x65nvoy/type/percent.proto\x1a\x1egoogle/protobuf/duration.proto\x1a#envoy/annotations/deprecation.proto\x1a\x1eudpa/annotations/migrate.proto\x1a\x1dudpa/annotations/status.proto\x1a\x17validate/validate.proto\"\xe9\x02\n\nFaultDelay\x12O\n\x04type\x18\x01 \x01(\x0e\x32\x37.envoy.config.filter.fault.v2.FaultDelay.FaultDelayTypeB\x08\x18\x01\xb8\xee\xf2\xd2\x05\x01\x12:\n\x0b\x66ixed_delay\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xfa\x42\x05\xaa\x01\x02*\x00H\x00\x12L\n\x0cheader_delay\x18\x05 \x01(\x0b\x32\x34.envoy.config.filter.fault.v2.FaultDelay.HeaderDelayH\x00\x12\x31\n\npercentage\x18\x04 \x01(\x0b\x32\x1d.envoy.type.FractionalPercent\x1a\r\n\x0bHeaderDelay\"\x1b\n\x0e\x46\x61ultDelayType\x12\t\n\x05\x46IXED\x10\x00\x42\x1b\n\x14\x66\x61ult_delay_secifier\x12\x03\xf8\x42\x01J\x04\x08\x02\x10\x03\"\xb2\x02\n\x0e\x46\x61ultRateLimit\x12N\n\x0b\x66ixed_limit\x18\x01 \x01(\x0b\x32\x37.envoy.config.filter.fault.v2.FaultRateLimit.FixedLimitH\x00\x12P\n\x0cheader_limit\x18\x03 \x01(\x0b\x32\x38.envoy.config.filter.fault.v2.FaultRateLimit.HeaderLimitH\x00\x12\x31\n\npercentage\x18\x02 \x01(\x0b\x32\x1d.envoy.type.FractionalPercent\x1a)\n\nFixedLimit\x12\x1b\n\nlimit_kbps\x18\x01 \x01(\x04\x42\x07\xfa\x42\x04\x32\x02(\x01\x1a\r\n\x0bHeaderLimitB\x11\n\nlimit_type\x12\x03\xf8\x42\x01\x42r\n*io.envoyproxy.envoy.config.filter.fault.v2B\nFaultProtoP\x01\xf2\x98\xfe\x8f\x05*\x12(envoy.extensions.filters.common.fault.v3\xba\x80\xc8\xd1\x06\x02\x10\x01\x62\x06proto3'
  ,
  dependencies=[envoy_dot_type_dot_percent__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,envoy_dot_annotations_dot_deprecation__pb2.DESCRIPTOR,udpa_dot_annotations_dot_migrate__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])



_FAULTDELAY_FAULTDELAYTYPE = _descriptor.EnumDescriptor(
  name='FaultDelayType',
  full_name='envoy.config.filter.fault.v2.FaultDelay.FaultDelayType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='FIXED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=557,
  serialized_end=584,
)
_sym_db.RegisterEnumDescriptor(_FAULTDELAY_FAULTDELAYTYPE)


_FAULTDELAY_HEADERDELAY = _descriptor.Descriptor(
  name='HeaderDelay',
  full_name='envoy.config.filter.fault.v2.FaultDelay.HeaderDelay',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=542,
  serialized_end=555,
)

_FAULTDELAY = _descriptor.Descriptor(
  name='FaultDelay',
  full_name='envoy.config.filter.fault.v2.FaultDelay',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='type', full_name='envoy.config.filter.fault.v2.FaultDelay.type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\030\001\270\356\362\322\005\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='fixed_delay', full_name='envoy.config.filter.fault.v2.FaultDelay.fixed_delay', index=1,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\252\001\002*\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='header_delay', full_name='envoy.config.filter.fault.v2.FaultDelay.header_delay', index=2,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='percentage', full_name='envoy.config.filter.fault.v2.FaultDelay.percentage', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FAULTDELAY_HEADERDELAY, ],
  enum_types=[
    _FAULTDELAY_FAULTDELAYTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='fault_delay_secifier', full_name='envoy.config.filter.fault.v2.FaultDelay.fault_delay_secifier',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=258,
  serialized_end=619,
)


_FAULTRATELIMIT_FIXEDLIMIT = _descriptor.Descriptor(
  name='FixedLimit',
  full_name='envoy.config.filter.fault.v2.FaultRateLimit.FixedLimit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='limit_kbps', full_name='envoy.config.filter.fault.v2.FaultRateLimit.FixedLimit.limit_kbps', index=0,
      number=1, type=4, cpp_type=4, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\0042\002(\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=853,
  serialized_end=894,
)

_FAULTRATELIMIT_HEADERLIMIT = _descriptor.Descriptor(
  name='HeaderLimit',
  full_name='envoy.config.filter.fault.v2.FaultRateLimit.HeaderLimit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=896,
  serialized_end=909,
)

_FAULTRATELIMIT = _descriptor.Descriptor(
  name='FaultRateLimit',
  full_name='envoy.config.filter.fault.v2.FaultRateLimit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='fixed_limit', full_name='envoy.config.filter.fault.v2.FaultRateLimit.fixed_limit', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='header_limit', full_name='envoy.config.filter.fault.v2.FaultRateLimit.header_limit', index=1,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='percentage', full_name='envoy.config.filter.fault.v2.FaultRateLimit.percentage', index=2,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_FAULTRATELIMIT_FIXEDLIMIT, _FAULTRATELIMIT_HEADERLIMIT, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='limit_type', full_name='envoy.config.filter.fault.v2.FaultRateLimit.limit_type',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=622,
  serialized_end=928,
)

_FAULTDELAY_HEADERDELAY.containing_type = _FAULTDELAY
_FAULTDELAY.fields_by_name['type'].enum_type = _FAULTDELAY_FAULTDELAYTYPE
_FAULTDELAY.fields_by_name['fixed_delay'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_FAULTDELAY.fields_by_name['header_delay'].message_type = _FAULTDELAY_HEADERDELAY
_FAULTDELAY.fields_by_name['percentage'].message_type = envoy_dot_type_dot_percent__pb2._FRACTIONALPERCENT
_FAULTDELAY_FAULTDELAYTYPE.containing_type = _FAULTDELAY
_FAULTDELAY.oneofs_by_name['fault_delay_secifier'].fields.append(
  _FAULTDELAY.fields_by_name['fixed_delay'])
_FAULTDELAY.fields_by_name['fixed_delay'].containing_oneof = _FAULTDELAY.oneofs_by_name['fault_delay_secifier']
_FAULTDELAY.oneofs_by_name['fault_delay_secifier'].fields.append(
  _FAULTDELAY.fields_by_name['header_delay'])
_FAULTDELAY.fields_by_name['header_delay'].containing_oneof = _FAULTDELAY.oneofs_by_name['fault_delay_secifier']
_FAULTRATELIMIT_FIXEDLIMIT.containing_type = _FAULTRATELIMIT
_FAULTRATELIMIT_HEADERLIMIT.containing_type = _FAULTRATELIMIT
_FAULTRATELIMIT.fields_by_name['fixed_limit'].message_type = _FAULTRATELIMIT_FIXEDLIMIT
_FAULTRATELIMIT.fields_by_name['header_limit'].message_type = _FAULTRATELIMIT_HEADERLIMIT
_FAULTRATELIMIT.fields_by_name['percentage'].message_type = envoy_dot_type_dot_percent__pb2._FRACTIONALPERCENT
_FAULTRATELIMIT.oneofs_by_name['limit_type'].fields.append(
  _FAULTRATELIMIT.fields_by_name['fixed_limit'])
_FAULTRATELIMIT.fields_by_name['fixed_limit'].containing_oneof = _FAULTRATELIMIT.oneofs_by_name['limit_type']
_FAULTRATELIMIT.oneofs_by_name['limit_type'].fields.append(
  _FAULTRATELIMIT.fields_by_name['header_limit'])
_FAULTRATELIMIT.fields_by_name['header_limit'].containing_oneof = _FAULTRATELIMIT.oneofs_by_name['limit_type']
DESCRIPTOR.message_types_by_name['FaultDelay'] = _FAULTDELAY
DESCRIPTOR.message_types_by_name['FaultRateLimit'] = _FAULTRATELIMIT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FaultDelay = _reflection.GeneratedProtocolMessageType('FaultDelay', (_message.Message,), {

  'HeaderDelay' : _reflection.GeneratedProtocolMessageType('HeaderDelay', (_message.Message,), {
    'DESCRIPTOR' : _FAULTDELAY_HEADERDELAY,
    '__module__' : 'envoy.config.filter.fault.v2.fault_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.filter.fault.v2.FaultDelay.HeaderDelay)
    })
  ,
  'DESCRIPTOR' : _FAULTDELAY,
  '__module__' : 'envoy.config.filter.fault.v2.fault_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.filter.fault.v2.FaultDelay)
  })
_sym_db.RegisterMessage(FaultDelay)
_sym_db.RegisterMessage(FaultDelay.HeaderDelay)

FaultRateLimit = _reflection.GeneratedProtocolMessageType('FaultRateLimit', (_message.Message,), {

  'FixedLimit' : _reflection.GeneratedProtocolMessageType('FixedLimit', (_message.Message,), {
    'DESCRIPTOR' : _FAULTRATELIMIT_FIXEDLIMIT,
    '__module__' : 'envoy.config.filter.fault.v2.fault_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.filter.fault.v2.FaultRateLimit.FixedLimit)
    })
  ,

  'HeaderLimit' : _reflection.GeneratedProtocolMessageType('HeaderLimit', (_message.Message,), {
    'DESCRIPTOR' : _FAULTRATELIMIT_HEADERLIMIT,
    '__module__' : 'envoy.config.filter.fault.v2.fault_pb2'
    # @@protoc_insertion_point(class_scope:envoy.config.filter.fault.v2.FaultRateLimit.HeaderLimit)
    })
  ,
  'DESCRIPTOR' : _FAULTRATELIMIT,
  '__module__' : 'envoy.config.filter.fault.v2.fault_pb2'
  # @@protoc_insertion_point(class_scope:envoy.config.filter.fault.v2.FaultRateLimit)
  })
_sym_db.RegisterMessage(FaultRateLimit)
_sym_db.RegisterMessage(FaultRateLimit.FixedLimit)
_sym_db.RegisterMessage(FaultRateLimit.HeaderLimit)


DESCRIPTOR._options = None
_FAULTDELAY.oneofs_by_name['fault_delay_secifier']._options = None
_FAULTDELAY.fields_by_name['type']._options = None
_FAULTDELAY.fields_by_name['fixed_delay']._options = None
_FAULTRATELIMIT_FIXEDLIMIT.fields_by_name['limit_kbps']._options = None
_FAULTRATELIMIT.oneofs_by_name['limit_type']._options = None
# @@protoc_insertion_point(module_scope)
