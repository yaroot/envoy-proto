# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2beta1/gcs.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/dialogflow/v2beta1/gcs.proto',
  package='google.cloud.dialogflow.v2beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.dialogflow.v2beta1B\010GcsProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)google/cloud/dialogflow/v2beta1/gcs.proto\x12\x1fgoogle.cloud.dialogflow.v2beta1\x1a\x1cgoogle/api/annotations.proto\"\x18\n\tGcsSource\x12\x0b\n\x03uri\x18\x01 \x01(\tB\xa6\x01\n#com.google.cloud.dialogflow.v2beta1B\x08GcsProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2beta1;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1fGoogle.Cloud.Dialogflow.V2beta1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_GCSSOURCE = _descriptor.Descriptor(
  name='GcsSource',
  full_name='google.cloud.dialogflow.v2beta1.GcsSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='uri', full_name='google.cloud.dialogflow.v2beta1.GcsSource.uri', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=108,
  serialized_end=132,
)

DESCRIPTOR.message_types_by_name['GcsSource'] = _GCSSOURCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GcsSource = _reflection.GeneratedProtocolMessageType('GcsSource', (_message.Message,), {
  'DESCRIPTOR' : _GCSSOURCE,
  '__module__' : 'google.cloud.dialogflow.v2beta1.gcs_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.GcsSource)
  })
_sym_db.RegisterMessage(GcsSource)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
