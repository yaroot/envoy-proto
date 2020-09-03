# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/appengine/v1/instance.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/appengine/v1/instance.proto',
  package='google.appengine.v1',
  syntax='proto3',
  serialized_options=b'\n\027com.google.appengine.v1B\rInstanceProtoP\001Z<google.golang.org/genproto/googleapis/appengine/v1;appengine',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\"google/appengine/v1/instance.proto\x12\x13google.appengine.v1\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\xbe\x03\n\x08Instance\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\n\n\x02id\x18\x02 \x01(\t\x12\x1a\n\x12\x61pp_engine_release\x18\x03 \x01(\t\x12@\n\x0c\x61vailability\x18\x04 \x01(\x0e\x32*.google.appengine.v1.Instance.Availability\x12\x0f\n\x07vm_name\x18\x05 \x01(\t\x12\x14\n\x0cvm_zone_name\x18\x06 \x01(\t\x12\r\n\x05vm_id\x18\x07 \x01(\t\x12.\n\nstart_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x10\n\x08requests\x18\t \x01(\x05\x12\x0e\n\x06\x65rrors\x18\n \x01(\x05\x12\x0b\n\x03qps\x18\x0b \x01(\x02\x12\x17\n\x0f\x61verage_latency\x18\x0c \x01(\x05\x12\x14\n\x0cmemory_usage\x18\r \x01(\x03\x12\x11\n\tvm_status\x18\x0e \x01(\t\x12\x18\n\x10vm_debug_enabled\x18\x0f \x01(\x08\x12\r\n\x05vm_ip\x18\x10 \x01(\t\":\n\x0c\x41vailability\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0c\n\x08RESIDENT\x10\x01\x12\x0b\n\x07\x44YNAMIC\x10\x02\x42h\n\x17\x63om.google.appengine.v1B\rInstanceProtoP\x01Z<google.golang.org/genproto/googleapis/appengine/v1;appengineb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_INSTANCE_AVAILABILITY = _descriptor.EnumDescriptor(
  name='Availability',
  full_name='google.appengine.v1.Instance.Availability',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RESIDENT', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DYNAMIC', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=511,
  serialized_end=569,
)
_sym_db.RegisterEnumDescriptor(_INSTANCE_AVAILABILITY)


_INSTANCE = _descriptor.Descriptor(
  name='Instance',
  full_name='google.appengine.v1.Instance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.appengine.v1.Instance.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.appengine.v1.Instance.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='app_engine_release', full_name='google.appengine.v1.Instance.app_engine_release', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='availability', full_name='google.appengine.v1.Instance.availability', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_name', full_name='google.appengine.v1.Instance.vm_name', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_zone_name', full_name='google.appengine.v1.Instance.vm_zone_name', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_id', full_name='google.appengine.v1.Instance.vm_id', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_time', full_name='google.appengine.v1.Instance.start_time', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='requests', full_name='google.appengine.v1.Instance.requests', index=8,
      number=9, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='errors', full_name='google.appengine.v1.Instance.errors', index=9,
      number=10, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='qps', full_name='google.appengine.v1.Instance.qps', index=10,
      number=11, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='average_latency', full_name='google.appengine.v1.Instance.average_latency', index=11,
      number=12, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='memory_usage', full_name='google.appengine.v1.Instance.memory_usage', index=12,
      number=13, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_status', full_name='google.appengine.v1.Instance.vm_status', index=13,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_debug_enabled', full_name='google.appengine.v1.Instance.vm_debug_enabled', index=14,
      number=15, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vm_ip', full_name='google.appengine.v1.Instance.vm_ip', index=15,
      number=16, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _INSTANCE_AVAILABILITY,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=123,
  serialized_end=569,
)

_INSTANCE.fields_by_name['availability'].enum_type = _INSTANCE_AVAILABILITY
_INSTANCE.fields_by_name['start_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_INSTANCE_AVAILABILITY.containing_type = _INSTANCE
DESCRIPTOR.message_types_by_name['Instance'] = _INSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Instance = _reflection.GeneratedProtocolMessageType('Instance', (_message.Message,), {
  'DESCRIPTOR' : _INSTANCE,
  '__module__' : 'google.appengine.v1.instance_pb2'
  # @@protoc_insertion_point(class_scope:google.appengine.v1.Instance)
  })
_sym_db.RegisterMessage(Instance)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
