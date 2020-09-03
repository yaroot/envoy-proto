# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/api/usage.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/api/usage.proto',
  package='google.api',
  syntax='proto3',
  serialized_options=b'\n\016com.google.apiB\nUsageProtoP\001ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig\242\002\004GAPI',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x16google/api/usage.proto\x12\ngoogle.api\"j\n\x05Usage\x12\x14\n\x0crequirements\x18\x01 \x03(\t\x12$\n\x05rules\x18\x06 \x03(\x0b\x32\x15.google.api.UsageRule\x12%\n\x1dproducer_notification_channel\x18\x07 \x01(\t\"]\n\tUsageRule\x12\x10\n\x08selector\x18\x01 \x01(\t\x12 \n\x18\x61llow_unregistered_calls\x18\x02 \x01(\x08\x12\x1c\n\x14skip_service_control\x18\x03 \x01(\x08\x42l\n\x0e\x63om.google.apiB\nUsageProtoP\x01ZEgoogle.golang.org/genproto/googleapis/api/serviceconfig;serviceconfig\xa2\x02\x04GAPIb\x06proto3'
)




_USAGE = _descriptor.Descriptor(
  name='Usage',
  full_name='google.api.Usage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='requirements', full_name='google.api.Usage.requirements', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rules', full_name='google.api.Usage.rules', index=1,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='producer_notification_channel', full_name='google.api.Usage.producer_notification_channel', index=2,
      number=7, type=9, cpp_type=9, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=38,
  serialized_end=144,
)


_USAGERULE = _descriptor.Descriptor(
  name='UsageRule',
  full_name='google.api.UsageRule',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='selector', full_name='google.api.UsageRule.selector', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allow_unregistered_calls', full_name='google.api.UsageRule.allow_unregistered_calls', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='skip_service_control', full_name='google.api.UsageRule.skip_service_control', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_start=146,
  serialized_end=239,
)

_USAGE.fields_by_name['rules'].message_type = _USAGERULE
DESCRIPTOR.message_types_by_name['Usage'] = _USAGE
DESCRIPTOR.message_types_by_name['UsageRule'] = _USAGERULE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Usage = _reflection.GeneratedProtocolMessageType('Usage', (_message.Message,), {
  'DESCRIPTOR' : _USAGE,
  '__module__' : 'google.api.usage_pb2'
  # @@protoc_insertion_point(class_scope:google.api.Usage)
  })
_sym_db.RegisterMessage(Usage)

UsageRule = _reflection.GeneratedProtocolMessageType('UsageRule', (_message.Message,), {
  'DESCRIPTOR' : _USAGERULE,
  '__module__' : 'google.api.usage_pb2'
  # @@protoc_insertion_point(class_scope:google.api.UsageRule)
  })
_sym_db.RegisterMessage(UsageRule)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
