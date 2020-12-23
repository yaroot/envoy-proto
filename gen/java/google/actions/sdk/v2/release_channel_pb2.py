# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/release_channel.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/release_channel.proto',
  package='google.actions.sdk.v2',
  syntax='proto3',
  serialized_options=b'\n\031com.google.actions.sdk.v2B\023ReleaseChannelProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n+google/actions/sdk/v2/release_channel.proto\x12\x15google.actions.sdk.v2\x1a\x19google/api/resource.proto\"\xb2\x01\n\x0eReleaseChannel\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x17\n\x0f\x63urrent_version\x18\x02 \x01(\t\x12\x17\n\x0fpending_version\x18\x03 \x01(\t:`\xea\x41]\n%actions.googleapis.com/ReleaseChannel\x12\x34projects/{project}/releaseChannels/{release_channel}Bl\n\x19\x63om.google.actions.sdk.v2B\x13ReleaseChannelProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_RELEASECHANNEL = _descriptor.Descriptor(
  name='ReleaseChannel',
  full_name='google.actions.sdk.v2.ReleaseChannel',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='google.actions.sdk.v2.ReleaseChannel.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='current_version', full_name='google.actions.sdk.v2.ReleaseChannel.current_version', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pending_version', full_name='google.actions.sdk.v2.ReleaseChannel.pending_version', index=2,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_options=b'\352A]\n%actions.googleapis.com/ReleaseChannel\0224projects/{project}/releaseChannels/{release_channel}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=98,
  serialized_end=276,
)

DESCRIPTOR.message_types_by_name['ReleaseChannel'] = _RELEASECHANNEL
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ReleaseChannel = _reflection.GeneratedProtocolMessageType('ReleaseChannel', (_message.Message,), {
  'DESCRIPTOR' : _RELEASECHANNEL,
  '__module__' : 'google.actions.sdk.v2.release_channel_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.ReleaseChannel)
  })
_sym_db.RegisterMessage(ReleaseChannel)


DESCRIPTOR._options = None
_RELEASECHANNEL._options = None
# @@protoc_insertion_point(module_scope)
