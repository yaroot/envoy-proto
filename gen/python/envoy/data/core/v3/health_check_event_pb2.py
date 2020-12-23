# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/data/core/v3/health_check_event.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import address_pb2 as envoy_dot_config_dot_core_dot_v3_dot_address__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/data/core/v3/health_check_event.proto',
  package='envoy.data.core.v3',
  syntax='proto3',
  serialized_options=b'\n io.envoyproxy.envoy.data.core.v3B\025HealthCheckEventProtoP\001\272\200\310\321\006\002\020\002',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n+envoy/data/core/v3/health_check_event.proto\x12\x12\x65nvoy.data.core.v3\x1a\"envoy/config/core/v3/address.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\x97\x05\n\x10HealthCheckEvent\x12L\n\x13health_checker_type\x18\x01 \x01(\x0e\x32%.envoy.data.core.v3.HealthCheckerTypeB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12+\n\x04host\x18\x02 \x01(\x0b\x32\x1d.envoy.config.core.v3.Address\x12\x1d\n\x0c\x63luster_name\x18\x03 \x01(\tB\x07\xfa\x42\x04r\x02\x10\x01\x12N\n\x15\x65ject_unhealthy_event\x18\x04 \x01(\x0b\x32-.envoy.data.core.v3.HealthCheckEjectUnhealthyH\x00\x12\x46\n\x11\x61\x64\x64_healthy_event\x18\x05 \x01(\x0b\x32).envoy.data.core.v3.HealthCheckAddHealthyH\x00\x12L\n\x1ahealth_check_failure_event\x18\x07 \x01(\x0b\x32&.envoy.data.core.v3.HealthCheckFailureH\x00\x12H\n\x15\x64\x65graded_healthy_host\x18\x08 \x01(\x0b\x32\'.envoy.data.core.v3.DegradedHealthyHostH\x00\x12K\n\x17no_longer_degraded_host\x18\t \x01(\x0b\x32(.envoy.data.core.v3.NoLongerDegradedHostH\x00\x12-\n\ttimestamp\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp:/\x9a\xc5\x88\x1e*\n(envoy.data.core.v2alpha.HealthCheckEventB\x0c\n\x05\x65vent\x12\x03\xf8\x42\x01\"\xa1\x01\n\x19HealthCheckEjectUnhealthy\x12J\n\x0c\x66\x61ilure_type\x18\x01 \x01(\x0e\x32*.envoy.data.core.v3.HealthCheckFailureTypeB\x08\xfa\x42\x05\x82\x01\x02\x10\x01:8\x9a\xc5\x88\x1e\x33\n1envoy.data.core.v2alpha.HealthCheckEjectUnhealthy\"b\n\x15HealthCheckAddHealthy\x12\x13\n\x0b\x66irst_check\x18\x01 \x01(\x08:4\x9a\xc5\x88\x1e/\n-envoy.data.core.v2alpha.HealthCheckAddHealthy\"\xa8\x01\n\x12HealthCheckFailure\x12J\n\x0c\x66\x61ilure_type\x18\x01 \x01(\x0e\x32*.envoy.data.core.v3.HealthCheckFailureTypeB\x08\xfa\x42\x05\x82\x01\x02\x10\x01\x12\x13\n\x0b\x66irst_check\x18\x02 \x01(\x08:1\x9a\xc5\x88\x1e,\n*envoy.data.core.v2alpha.HealthCheckFailure\"I\n\x13\x44\x65gradedHealthyHost:2\x9a\xc5\x88\x1e-\n+envoy.data.core.v2alpha.DegradedHealthyHost\"K\n\x14NoLongerDegradedHost:3\x9a\xc5\x88\x1e.\n,envoy.data.core.v2alpha.NoLongerDegradedHost*>\n\x16HealthCheckFailureType\x12\n\n\x06\x41\x43TIVE\x10\x00\x12\x0b\n\x07PASSIVE\x10\x01\x12\x0b\n\x07NETWORK\x10\x02*;\n\x11HealthCheckerType\x12\x08\n\x04HTTP\x10\x00\x12\x07\n\x03TCP\x10\x01\x12\x08\n\x04GRPC\x10\x02\x12\t\n\x05REDIS\x10\x03\x42\x43\n io.envoyproxy.envoy.data.core.v3B\x15HealthCheckEventProtoP\x01\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3'
  ,
  dependencies=[envoy_dot_config_dot_core_dot_v3_dot_address__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,validate_dot_validate__pb2.DESCRIPTOR,])

_HEALTHCHECKFAILURETYPE = _descriptor.EnumDescriptor(
  name='HealthCheckFailureType',
  full_name='envoy.data.core.v3.HealthCheckFailureType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ACTIVE', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='PASSIVE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NETWORK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1480,
  serialized_end=1542,
)
_sym_db.RegisterEnumDescriptor(_HEALTHCHECKFAILURETYPE)

HealthCheckFailureType = enum_type_wrapper.EnumTypeWrapper(_HEALTHCHECKFAILURETYPE)
_HEALTHCHECKERTYPE = _descriptor.EnumDescriptor(
  name='HealthCheckerType',
  full_name='envoy.data.core.v3.HealthCheckerType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='HTTP', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TCP', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GRPC', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REDIS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1544,
  serialized_end=1603,
)
_sym_db.RegisterEnumDescriptor(_HEALTHCHECKERTYPE)

HealthCheckerType = enum_type_wrapper.EnumTypeWrapper(_HEALTHCHECKERTYPE)
ACTIVE = 0
PASSIVE = 1
NETWORK = 2
HTTP = 0
TCP = 1
GRPC = 2
REDIS = 3



_HEALTHCHECKEVENT = _descriptor.Descriptor(
  name='HealthCheckEvent',
  full_name='envoy.data.core.v3.HealthCheckEvent',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='health_checker_type', full_name='envoy.data.core.v3.HealthCheckEvent.health_checker_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host', full_name='envoy.data.core.v3.HealthCheckEvent.host', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_name', full_name='envoy.data.core.v3.HealthCheckEvent.cluster_name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\004r\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eject_unhealthy_event', full_name='envoy.data.core.v3.HealthCheckEvent.eject_unhealthy_event', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='add_healthy_event', full_name='envoy.data.core.v3.HealthCheckEvent.add_healthy_event', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='health_check_failure_event', full_name='envoy.data.core.v3.HealthCheckEvent.health_check_failure_event', index=5,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='degraded_healthy_host', full_name='envoy.data.core.v3.HealthCheckEvent.degraded_healthy_host', index=6,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='no_longer_degraded_host', full_name='envoy.data.core.v3.HealthCheckEvent.no_longer_degraded_host', index=7,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='envoy.data.core.v3.HealthCheckEvent.timestamp', index=8,
      number=6, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\232\305\210\036*\n(envoy.data.core.v2alpha.HealthCheckEvent',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='event', full_name='envoy.data.core.v3.HealthCheckEvent.event',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[], serialized_options=b'\370B\001'),
  ],
  serialized_start=228,
  serialized_end=891,
)


_HEALTHCHECKEJECTUNHEALTHY = _descriptor.Descriptor(
  name='HealthCheckEjectUnhealthy',
  full_name='envoy.data.core.v3.HealthCheckEjectUnhealthy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='failure_type', full_name='envoy.data.core.v3.HealthCheckEjectUnhealthy.failure_type', index=0,
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
  ],
  serialized_options=b'\232\305\210\0363\n1envoy.data.core.v2alpha.HealthCheckEjectUnhealthy',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=894,
  serialized_end=1055,
)


_HEALTHCHECKADDHEALTHY = _descriptor.Descriptor(
  name='HealthCheckAddHealthy',
  full_name='envoy.data.core.v3.HealthCheckAddHealthy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='first_check', full_name='envoy.data.core.v3.HealthCheckAddHealthy.first_check', index=0,
      number=1, type=8, cpp_type=7, label=1,
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
  serialized_options=b'\232\305\210\036/\n-envoy.data.core.v2alpha.HealthCheckAddHealthy',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1057,
  serialized_end=1155,
)


_HEALTHCHECKFAILURE = _descriptor.Descriptor(
  name='HealthCheckFailure',
  full_name='envoy.data.core.v3.HealthCheckFailure',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='failure_type', full_name='envoy.data.core.v3.HealthCheckFailure.failure_type', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372B\005\202\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='first_check', full_name='envoy.data.core.v3.HealthCheckFailure.first_check', index=1,
      number=2, type=8, cpp_type=7, label=1,
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
  serialized_options=b'\232\305\210\036,\n*envoy.data.core.v2alpha.HealthCheckFailure',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1158,
  serialized_end=1326,
)


_DEGRADEDHEALTHYHOST = _descriptor.Descriptor(
  name='DegradedHealthyHost',
  full_name='envoy.data.core.v3.DegradedHealthyHost',
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
  serialized_options=b'\232\305\210\036-\n+envoy.data.core.v2alpha.DegradedHealthyHost',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1328,
  serialized_end=1401,
)


_NOLONGERDEGRADEDHOST = _descriptor.Descriptor(
  name='NoLongerDegradedHost',
  full_name='envoy.data.core.v3.NoLongerDegradedHost',
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
  serialized_options=b'\232\305\210\036.\n,envoy.data.core.v2alpha.NoLongerDegradedHost',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1403,
  serialized_end=1478,
)

_HEALTHCHECKEVENT.fields_by_name['health_checker_type'].enum_type = _HEALTHCHECKERTYPE
_HEALTHCHECKEVENT.fields_by_name['host'].message_type = envoy_dot_config_dot_core_dot_v3_dot_address__pb2._ADDRESS
_HEALTHCHECKEVENT.fields_by_name['eject_unhealthy_event'].message_type = _HEALTHCHECKEJECTUNHEALTHY
_HEALTHCHECKEVENT.fields_by_name['add_healthy_event'].message_type = _HEALTHCHECKADDHEALTHY
_HEALTHCHECKEVENT.fields_by_name['health_check_failure_event'].message_type = _HEALTHCHECKFAILURE
_HEALTHCHECKEVENT.fields_by_name['degraded_healthy_host'].message_type = _DEGRADEDHEALTHYHOST
_HEALTHCHECKEVENT.fields_by_name['no_longer_degraded_host'].message_type = _NOLONGERDEGRADEDHOST
_HEALTHCHECKEVENT.fields_by_name['timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_HEALTHCHECKEVENT.oneofs_by_name['event'].fields.append(
  _HEALTHCHECKEVENT.fields_by_name['eject_unhealthy_event'])
_HEALTHCHECKEVENT.fields_by_name['eject_unhealthy_event'].containing_oneof = _HEALTHCHECKEVENT.oneofs_by_name['event']
_HEALTHCHECKEVENT.oneofs_by_name['event'].fields.append(
  _HEALTHCHECKEVENT.fields_by_name['add_healthy_event'])
_HEALTHCHECKEVENT.fields_by_name['add_healthy_event'].containing_oneof = _HEALTHCHECKEVENT.oneofs_by_name['event']
_HEALTHCHECKEVENT.oneofs_by_name['event'].fields.append(
  _HEALTHCHECKEVENT.fields_by_name['health_check_failure_event'])
_HEALTHCHECKEVENT.fields_by_name['health_check_failure_event'].containing_oneof = _HEALTHCHECKEVENT.oneofs_by_name['event']
_HEALTHCHECKEVENT.oneofs_by_name['event'].fields.append(
  _HEALTHCHECKEVENT.fields_by_name['degraded_healthy_host'])
_HEALTHCHECKEVENT.fields_by_name['degraded_healthy_host'].containing_oneof = _HEALTHCHECKEVENT.oneofs_by_name['event']
_HEALTHCHECKEVENT.oneofs_by_name['event'].fields.append(
  _HEALTHCHECKEVENT.fields_by_name['no_longer_degraded_host'])
_HEALTHCHECKEVENT.fields_by_name['no_longer_degraded_host'].containing_oneof = _HEALTHCHECKEVENT.oneofs_by_name['event']
_HEALTHCHECKEJECTUNHEALTHY.fields_by_name['failure_type'].enum_type = _HEALTHCHECKFAILURETYPE
_HEALTHCHECKFAILURE.fields_by_name['failure_type'].enum_type = _HEALTHCHECKFAILURETYPE
DESCRIPTOR.message_types_by_name['HealthCheckEvent'] = _HEALTHCHECKEVENT
DESCRIPTOR.message_types_by_name['HealthCheckEjectUnhealthy'] = _HEALTHCHECKEJECTUNHEALTHY
DESCRIPTOR.message_types_by_name['HealthCheckAddHealthy'] = _HEALTHCHECKADDHEALTHY
DESCRIPTOR.message_types_by_name['HealthCheckFailure'] = _HEALTHCHECKFAILURE
DESCRIPTOR.message_types_by_name['DegradedHealthyHost'] = _DEGRADEDHEALTHYHOST
DESCRIPTOR.message_types_by_name['NoLongerDegradedHost'] = _NOLONGERDEGRADEDHOST
DESCRIPTOR.enum_types_by_name['HealthCheckFailureType'] = _HEALTHCHECKFAILURETYPE
DESCRIPTOR.enum_types_by_name['HealthCheckerType'] = _HEALTHCHECKERTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

HealthCheckEvent = _reflection.GeneratedProtocolMessageType('HealthCheckEvent', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKEVENT,
  '__module__' : 'envoy.data.core.v3.health_check_event_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.core.v3.HealthCheckEvent)
  })
_sym_db.RegisterMessage(HealthCheckEvent)

HealthCheckEjectUnhealthy = _reflection.GeneratedProtocolMessageType('HealthCheckEjectUnhealthy', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKEJECTUNHEALTHY,
  '__module__' : 'envoy.data.core.v3.health_check_event_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.core.v3.HealthCheckEjectUnhealthy)
  })
_sym_db.RegisterMessage(HealthCheckEjectUnhealthy)

HealthCheckAddHealthy = _reflection.GeneratedProtocolMessageType('HealthCheckAddHealthy', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKADDHEALTHY,
  '__module__' : 'envoy.data.core.v3.health_check_event_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.core.v3.HealthCheckAddHealthy)
  })
_sym_db.RegisterMessage(HealthCheckAddHealthy)

HealthCheckFailure = _reflection.GeneratedProtocolMessageType('HealthCheckFailure', (_message.Message,), {
  'DESCRIPTOR' : _HEALTHCHECKFAILURE,
  '__module__' : 'envoy.data.core.v3.health_check_event_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.core.v3.HealthCheckFailure)
  })
_sym_db.RegisterMessage(HealthCheckFailure)

DegradedHealthyHost = _reflection.GeneratedProtocolMessageType('DegradedHealthyHost', (_message.Message,), {
  'DESCRIPTOR' : _DEGRADEDHEALTHYHOST,
  '__module__' : 'envoy.data.core.v3.health_check_event_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.core.v3.DegradedHealthyHost)
  })
_sym_db.RegisterMessage(DegradedHealthyHost)

NoLongerDegradedHost = _reflection.GeneratedProtocolMessageType('NoLongerDegradedHost', (_message.Message,), {
  'DESCRIPTOR' : _NOLONGERDEGRADEDHOST,
  '__module__' : 'envoy.data.core.v3.health_check_event_pb2'
  # @@protoc_insertion_point(class_scope:envoy.data.core.v3.NoLongerDegradedHost)
  })
_sym_db.RegisterMessage(NoLongerDegradedHost)


DESCRIPTOR._options = None
_HEALTHCHECKEVENT.oneofs_by_name['event']._options = None
_HEALTHCHECKEVENT.fields_by_name['health_checker_type']._options = None
_HEALTHCHECKEVENT.fields_by_name['cluster_name']._options = None
_HEALTHCHECKEVENT._options = None
_HEALTHCHECKEJECTUNHEALTHY.fields_by_name['failure_type']._options = None
_HEALTHCHECKEJECTUNHEALTHY._options = None
_HEALTHCHECKADDHEALTHY._options = None
_HEALTHCHECKFAILURE.fields_by_name['failure_type']._options = None
_HEALTHCHECKFAILURE._options = None
_DEGRADEDHEALTHYHOST._options = None
_NOLONGERDEGRADEDHOST._options = None
# @@protoc_insertion_point(module_scope)
