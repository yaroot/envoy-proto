# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/eventarc/v1/trigger.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/eventarc/v1/trigger.proto',
  package='google.cloud.eventarc.v1',
  syntax='proto3',
  serialized_options=b'\n\034com.google.cloud.eventarc.v1B\014TriggerProtoP\001Z@google.golang.org/genproto/googleapis/cloud/eventarc/v1;eventarc\352Ak\n+cloudfunctions.googleapis.com/CloudFunction\022<projects/{project}/locations/{location}/functions/{function}\352AY\n!iam.googleapis.com/ServiceAccount\0224projects/{project}/serviceAccounts/{service_account}\352A\037\n\032run.googleapis.com/Service\022\001*',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&google/cloud/eventarc/v1/trigger.proto\x12\x18google.cloud.eventarc.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x9d\x05\n\x07Trigger\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x44\n\revent_filters\x18\x08 \x03(\x0b\x32%.google.cloud.eventarc.v1.EventFilterB\x06\xe0\x41\x06\xe0\x41\x02\x12\x42\n\x0fservice_account\x18\t \x01(\tB)\xe0\x41\x01\xfa\x41#\n!iam.googleapis.com/ServiceAccount\x12?\n\x0b\x64\x65stination\x18\n \x01(\x0b\x32%.google.cloud.eventarc.v1.DestinationB\x03\xe0\x41\x02\x12;\n\ttransport\x18\x0b \x01(\x0b\x32#.google.cloud.eventarc.v1.TransportB\x03\xe0\x41\x01\x12\x42\n\x06labels\x18\x0c \x03(\x0b\x32-.google.cloud.eventarc.v1.Trigger.LabelsEntryB\x03\xe0\x41\x01\x12\x11\n\x04\x65tag\x18\x63 \x01(\tB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:s\xea\x41p\n\x1f\x65ventarc.googleapis.com/Trigger\x12:projects/{project}/locations/{location}/triggers/{trigger}*\x08triggers2\x07trigger\"9\n\x0b\x45ventFilter\x12\x16\n\tattribute\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\x05value\x18\x02 \x01(\tB\x03\xe0\x41\x02\"T\n\x0b\x44\x65stination\x12\x37\n\tcloud_run\x18\x01 \x01(\x0b\x32\".google.cloud.eventarc.v1.CloudRunH\x00\x42\x0c\n\ndescriptor\"O\n\tTransport\x12\x32\n\x06pubsub\x18\x01 \x01(\x0b\x32 .google.cloud.eventarc.v1.PubsubH\x00\x42\x0e\n\x0cintermediary\"g\n\x08\x43loudRun\x12\x33\n\x07service\x18\x01 \x01(\tB\"\xe0\x41\x02\xfa\x41\x1c\n\x1arun.googleapis.com/Service\x12\x11\n\x04path\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06region\x18\x03 \x01(\tB\x03\xe0\x41\x02\"7\n\x06Pubsub\x12\x12\n\x05topic\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0csubscription\x18\x02 \x01(\tB\x03\xe0\x41\x03\x42\xdc\x02\n\x1c\x63om.google.cloud.eventarc.v1B\x0cTriggerProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/eventarc/v1;eventarc\xea\x41k\n+cloudfunctions.googleapis.com/CloudFunction\x12<projects/{project}/locations/{location}/functions/{function}\xea\x41Y\n!iam.googleapis.com/ServiceAccount\x12\x34projects/{project}/serviceAccounts/{service_account}\xea\x41\x1f\n\x1arun.googleapis.com/Service\x12\x01*b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,])




_TRIGGER_LABELSENTRY = _descriptor.Descriptor(
  name='LabelsEntry',
  full_name='google.cloud.eventarc.v1.Trigger.LabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.eventarc.v1.Trigger.LabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.eventarc.v1.Trigger.LabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=699,
  serialized_end=744,
)

_TRIGGER = _descriptor.Descriptor(
  name='Trigger',
  full_name='google.cloud.eventarc.v1.Trigger',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.cloud.eventarc.v1.Trigger.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='uid', full_name='google.cloud.eventarc.v1.Trigger.uid', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='google.cloud.eventarc.v1.Trigger.create_time', index=2,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='update_time', full_name='google.cloud.eventarc.v1.Trigger.update_time', index=3,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='event_filters', full_name='google.cloud.eventarc.v1.Trigger.event_filters', index=4,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\006\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_account', full_name='google.cloud.eventarc.v1.Trigger.service_account', index=5,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001\372A#\n!iam.googleapis.com/ServiceAccount', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='destination', full_name='google.cloud.eventarc.v1.Trigger.destination', index=6,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='transport', full_name='google.cloud.eventarc.v1.Trigger.transport', index=7,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.cloud.eventarc.v1.Trigger.labels', index=8,
      number=12, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='etag', full_name='google.cloud.eventarc.v1.Trigger.etag', index=9,
      number=99, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_TRIGGER_LABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\352Ap\n\037eventarc.googleapis.com/Trigger\022:projects/{project}/locations/{location}/triggers/{trigger}*\010triggers2\007trigger',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=192,
  serialized_end=861,
)


_EVENTFILTER = _descriptor.Descriptor(
  name='EventFilter',
  full_name='google.cloud.eventarc.v1.EventFilter',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='attribute', full_name='google.cloud.eventarc.v1.EventFilter.attribute', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.eventarc.v1.EventFilter.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=863,
  serialized_end=920,
)


_DESTINATION = _descriptor.Descriptor(
  name='Destination',
  full_name='google.cloud.eventarc.v1.Destination',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cloud_run', full_name='google.cloud.eventarc.v1.Destination.cloud_run', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
      name='descriptor', full_name='google.cloud.eventarc.v1.Destination.descriptor',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=922,
  serialized_end=1006,
)


_TRANSPORT = _descriptor.Descriptor(
  name='Transport',
  full_name='google.cloud.eventarc.v1.Transport',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='pubsub', full_name='google.cloud.eventarc.v1.Transport.pubsub', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
      name='intermediary', full_name='google.cloud.eventarc.v1.Transport.intermediary',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1008,
  serialized_end=1087,
)


_CLOUDRUN = _descriptor.Descriptor(
  name='CloudRun',
  full_name='google.cloud.eventarc.v1.CloudRun',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='service', full_name='google.cloud.eventarc.v1.CloudRun.service', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A\034\n\032run.googleapis.com/Service', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='path', full_name='google.cloud.eventarc.v1.CloudRun.path', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='region', full_name='google.cloud.eventarc.v1.CloudRun.region', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1089,
  serialized_end=1192,
)


_PUBSUB = _descriptor.Descriptor(
  name='Pubsub',
  full_name='google.cloud.eventarc.v1.Pubsub',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='topic', full_name='google.cloud.eventarc.v1.Pubsub.topic', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='subscription', full_name='google.cloud.eventarc.v1.Pubsub.subscription', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1194,
  serialized_end=1249,
)

_TRIGGER_LABELSENTRY.containing_type = _TRIGGER
_TRIGGER.fields_by_name['create_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIGGER.fields_by_name['update_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIGGER.fields_by_name['event_filters'].message_type = _EVENTFILTER
_TRIGGER.fields_by_name['destination'].message_type = _DESTINATION
_TRIGGER.fields_by_name['transport'].message_type = _TRANSPORT
_TRIGGER.fields_by_name['labels'].message_type = _TRIGGER_LABELSENTRY
_DESTINATION.fields_by_name['cloud_run'].message_type = _CLOUDRUN
_DESTINATION.oneofs_by_name['descriptor'].fields.append(
  _DESTINATION.fields_by_name['cloud_run'])
_DESTINATION.fields_by_name['cloud_run'].containing_oneof = _DESTINATION.oneofs_by_name['descriptor']
_TRANSPORT.fields_by_name['pubsub'].message_type = _PUBSUB
_TRANSPORT.oneofs_by_name['intermediary'].fields.append(
  _TRANSPORT.fields_by_name['pubsub'])
_TRANSPORT.fields_by_name['pubsub'].containing_oneof = _TRANSPORT.oneofs_by_name['intermediary']
DESCRIPTOR.message_types_by_name['Trigger'] = _TRIGGER
DESCRIPTOR.message_types_by_name['EventFilter'] = _EVENTFILTER
DESCRIPTOR.message_types_by_name['Destination'] = _DESTINATION
DESCRIPTOR.message_types_by_name['Transport'] = _TRANSPORT
DESCRIPTOR.message_types_by_name['CloudRun'] = _CLOUDRUN
DESCRIPTOR.message_types_by_name['Pubsub'] = _PUBSUB
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Trigger = _reflection.GeneratedProtocolMessageType('Trigger', (_message.Message,), {

  'LabelsEntry' : _reflection.GeneratedProtocolMessageType('LabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _TRIGGER_LABELSENTRY,
    '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.Trigger.LabelsEntry)
    })
  ,
  'DESCRIPTOR' : _TRIGGER,
  '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.Trigger)
  })
_sym_db.RegisterMessage(Trigger)
_sym_db.RegisterMessage(Trigger.LabelsEntry)

EventFilter = _reflection.GeneratedProtocolMessageType('EventFilter', (_message.Message,), {
  'DESCRIPTOR' : _EVENTFILTER,
  '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.EventFilter)
  })
_sym_db.RegisterMessage(EventFilter)

Destination = _reflection.GeneratedProtocolMessageType('Destination', (_message.Message,), {
  'DESCRIPTOR' : _DESTINATION,
  '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.Destination)
  })
_sym_db.RegisterMessage(Destination)

Transport = _reflection.GeneratedProtocolMessageType('Transport', (_message.Message,), {
  'DESCRIPTOR' : _TRANSPORT,
  '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.Transport)
  })
_sym_db.RegisterMessage(Transport)

CloudRun = _reflection.GeneratedProtocolMessageType('CloudRun', (_message.Message,), {
  'DESCRIPTOR' : _CLOUDRUN,
  '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.CloudRun)
  })
_sym_db.RegisterMessage(CloudRun)

Pubsub = _reflection.GeneratedProtocolMessageType('Pubsub', (_message.Message,), {
  'DESCRIPTOR' : _PUBSUB,
  '__module__' : 'google.cloud.eventarc.v1.trigger_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.Pubsub)
  })
_sym_db.RegisterMessage(Pubsub)


DESCRIPTOR._options = None
_TRIGGER_LABELSENTRY._options = None
_TRIGGER.fields_by_name['name']._options = None
_TRIGGER.fields_by_name['uid']._options = None
_TRIGGER.fields_by_name['create_time']._options = None
_TRIGGER.fields_by_name['update_time']._options = None
_TRIGGER.fields_by_name['event_filters']._options = None
_TRIGGER.fields_by_name['service_account']._options = None
_TRIGGER.fields_by_name['destination']._options = None
_TRIGGER.fields_by_name['transport']._options = None
_TRIGGER.fields_by_name['labels']._options = None
_TRIGGER.fields_by_name['etag']._options = None
_TRIGGER._options = None
_EVENTFILTER.fields_by_name['attribute']._options = None
_EVENTFILTER.fields_by_name['value']._options = None
_CLOUDRUN.fields_by_name['service']._options = None
_CLOUDRUN.fields_by_name['path']._options = None
_CLOUDRUN.fields_by_name['region']._options = None
_PUBSUB.fields_by_name['topic']._options = None
_PUBSUB.fields_by_name['subscription']._options = None
# @@protoc_insertion_point(module_scope)