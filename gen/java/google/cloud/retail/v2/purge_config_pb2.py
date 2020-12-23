# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/retail/v2/purge_config.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/retail/v2/purge_config.proto',
  package='google.cloud.retail.v2',
  syntax='proto3',
  serialized_options=b'\n\032com.google.cloud.retail.v2B\020PurgeConfigProtoP\001Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud::Retail::V2',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)google/cloud/retail/v2/purge_config.proto\x12\x16google.cloud.retail.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x1fgoogle/api/field_behavior.proto\"\x0f\n\rPurgeMetadata\"Q\n\x16PurgeUserEventsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x06\x66ilter\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\r\n\x05\x66orce\x18\x03 \x01(\x08\"6\n\x17PurgeUserEventsResponse\x12\x1b\n\x13purged_events_count\x18\x01 \x01(\x03\x42\xc5\x01\n\x1a\x63om.google.cloud.retail.v2B\x10PurgeConfigProtoP\x01Z<google.golang.org/genproto/googleapis/cloud/retail/v2;retail\xa2\x02\x06RETAIL\xaa\x02\x16Google.Cloud.Retail.V2\xca\x02\x16Google\\Cloud\\Retail\\V2\xea\x02\x19Google::Cloud::Retail::V2b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,])




_PURGEMETADATA = _descriptor.Descriptor(
  name='PurgeMetadata',
  full_name='google.cloud.retail.v2.PurgeMetadata',
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
  serialized_start=132,
  serialized_end=147,
)


_PURGEUSEREVENTSREQUEST = _descriptor.Descriptor(
  name='PurgeUserEventsRequest',
  full_name='google.cloud.retail.v2.PurgeUserEventsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='parent', full_name='google.cloud.retail.v2.PurgeUserEventsRequest.parent', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='filter', full_name='google.cloud.retail.v2.PurgeUserEventsRequest.filter', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='force', full_name='google.cloud.retail.v2.PurgeUserEventsRequest.force', index=2,
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
  serialized_start=149,
  serialized_end=230,
)


_PURGEUSEREVENTSRESPONSE = _descriptor.Descriptor(
  name='PurgeUserEventsResponse',
  full_name='google.cloud.retail.v2.PurgeUserEventsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='purged_events_count', full_name='google.cloud.retail.v2.PurgeUserEventsResponse.purged_events_count', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=232,
  serialized_end=286,
)

DESCRIPTOR.message_types_by_name['PurgeMetadata'] = _PURGEMETADATA
DESCRIPTOR.message_types_by_name['PurgeUserEventsRequest'] = _PURGEUSEREVENTSREQUEST
DESCRIPTOR.message_types_by_name['PurgeUserEventsResponse'] = _PURGEUSEREVENTSRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PurgeMetadata = _reflection.GeneratedProtocolMessageType('PurgeMetadata', (_message.Message,), {
  'DESCRIPTOR' : _PURGEMETADATA,
  '__module__' : 'google.cloud.retail.v2.purge_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2.PurgeMetadata)
  })
_sym_db.RegisterMessage(PurgeMetadata)

PurgeUserEventsRequest = _reflection.GeneratedProtocolMessageType('PurgeUserEventsRequest', (_message.Message,), {
  'DESCRIPTOR' : _PURGEUSEREVENTSREQUEST,
  '__module__' : 'google.cloud.retail.v2.purge_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2.PurgeUserEventsRequest)
  })
_sym_db.RegisterMessage(PurgeUserEventsRequest)

PurgeUserEventsResponse = _reflection.GeneratedProtocolMessageType('PurgeUserEventsResponse', (_message.Message,), {
  'DESCRIPTOR' : _PURGEUSEREVENTSRESPONSE,
  '__module__' : 'google.cloud.retail.v2.purge_config_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.retail.v2.PurgeUserEventsResponse)
  })
_sym_db.RegisterMessage(PurgeUserEventsResponse)


DESCRIPTOR._options = None
_PURGEUSEREVENTSREQUEST.fields_by_name['parent']._options = None
_PURGEUSEREVENTSREQUEST.fields_by_name['filter']._options = None
# @@protoc_insertion_point(module_scope)