# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1beta1/ranges.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/automl/v1beta1/ranges.proto',
  package='google.cloud.automl.v1beta1',
  syntax='proto3',
  serialized_options=b'\n\037com.google.cloud.automl.v1beta1B\013RangesProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(google/cloud/automl/v1beta1/ranges.proto\x12\x1bgoogle.cloud.automl.v1beta1\x1a\x1cgoogle/api/annotations.proto\")\n\x0b\x44oubleRange\x12\r\n\x05start\x18\x01 \x01(\x01\x12\x0b\n\x03\x65nd\x18\x02 \x01(\x01\x42\xb2\x01\n\x1f\x63om.google.cloud.automl.v1beta1B\x0bRangesProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\xca\x02\x1bGoogle\\Cloud\\AutoMl\\V1beta1\xea\x02\x1eGoogle::Cloud::AutoML::V1beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_DOUBLERANGE = _descriptor.Descriptor(
  name='DoubleRange',
  full_name='google.cloud.automl.v1beta1.DoubleRange',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='start', full_name='google.cloud.automl.v1beta1.DoubleRange.start', index=0,
      number=1, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end', full_name='google.cloud.automl.v1beta1.DoubleRange.end', index=1,
      number=2, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
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
  serialized_start=103,
  serialized_end=144,
)

DESCRIPTOR.message_types_by_name['DoubleRange'] = _DOUBLERANGE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DoubleRange = _reflection.GeneratedProtocolMessageType('DoubleRange', (_message.Message,), {
  'DESCRIPTOR' : _DOUBLERANGE,
  '__module__' : 'google.cloud.automl.v1beta1.ranges_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.DoubleRange)
  })
_sym_db.RegisterMessage(DoubleRange)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
