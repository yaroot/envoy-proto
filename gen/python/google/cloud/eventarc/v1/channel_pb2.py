# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/eventarc/v1/channel.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&google/cloud/eventarc/v1/channel.proto\x12\x18google.cloud.eventarc.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb2\x04\n\x07\x43hannel\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x10\n\x08provider\x18\x07 \x01(\t\x12\x1b\n\x0cpubsub_topic\x18\x08 \x01(\tB\x03\xe0\x41\x03H\x00\x12;\n\x05state\x18\t \x01(\x0e\x32\'.google.cloud.eventarc.v1.Channel.StateB\x03\xe0\x41\x03\x12\x1d\n\x10\x61\x63tivation_token\x18\n \x01(\tB\x03\xe0\x41\x03\x12\x42\n\x0f\x63rypto_key_name\x18\x0b \x01(\tB)\xe0\x41\x01\xfa\x41#\n!cloudkms.googleapis.com/CryptoKey\"E\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\n\n\x06\x41\x43TIVE\x10\x02\x12\x0c\n\x08INACTIVE\x10\x03:s\xea\x41p\n\x1f\x65ventarc.googleapis.com/Channel\x12:projects/{project}/locations/{location}/channels/{channel}*\x08\x63hannels2\x07\x63hannelB\x0b\n\ttransportB\xc4\x01\n\x1c\x63om.google.cloud.eventarc.v1B\x0c\x43hannelProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/eventarc/v1;eventarc\xaa\x02\x18Google.Cloud.Eventarc.V1\xca\x02\x18Google\\Cloud\\Eventarc\\V1\xea\x02\x1bGoogle::Cloud::Eventarc::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.eventarc.v1.channel_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.eventarc.v1B\014ChannelProtoP\001Z@google.golang.org/genproto/googleapis/cloud/eventarc/v1;eventarc\252\002\030Google.Cloud.Eventarc.V1\312\002\030Google\\Cloud\\Eventarc\\V1\352\002\033Google::Cloud::Eventarc::V1'
  _CHANNEL.fields_by_name['name']._options = None
  _CHANNEL.fields_by_name['name']._serialized_options = b'\340A\002'
  _CHANNEL.fields_by_name['uid']._options = None
  _CHANNEL.fields_by_name['uid']._serialized_options = b'\340A\003'
  _CHANNEL.fields_by_name['create_time']._options = None
  _CHANNEL.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _CHANNEL.fields_by_name['update_time']._options = None
  _CHANNEL.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _CHANNEL.fields_by_name['pubsub_topic']._options = None
  _CHANNEL.fields_by_name['pubsub_topic']._serialized_options = b'\340A\003'
  _CHANNEL.fields_by_name['state']._options = None
  _CHANNEL.fields_by_name['state']._serialized_options = b'\340A\003'
  _CHANNEL.fields_by_name['activation_token']._options = None
  _CHANNEL.fields_by_name['activation_token']._serialized_options = b'\340A\003'
  _CHANNEL.fields_by_name['crypto_key_name']._options = None
  _CHANNEL.fields_by_name['crypto_key_name']._serialized_options = b'\340A\001\372A#\n!cloudkms.googleapis.com/CryptoKey'
  _CHANNEL._options = None
  _CHANNEL._serialized_options = b'\352Ap\n\037eventarc.googleapis.com/Channel\022:projects/{project}/locations/{location}/channels/{channel}*\010channels2\007channel'
  _CHANNEL._serialized_start=162
  _CHANNEL._serialized_end=724
  _CHANNEL_STATE._serialized_start=525
  _CHANNEL_STATE._serialized_end=594
# @@protoc_insertion_point(module_scope)