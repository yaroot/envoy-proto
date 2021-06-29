# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/encryption_spec.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/aiplatform/v1beta1/encryption_spec.proto',
  package='google.cloud.aiplatform.v1beta1',
  syntax='proto3',
  serialized_options=b'\n#com.google.cloud.aiplatform.v1beta1B\023EncryptionSpecProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/cloud/aiplatform/v1beta1/encryption_spec.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1cgoogle/api/annotations.proto\"+\n\x0e\x45ncryptionSpec\x12\x19\n\x0ckms_key_name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x42\x87\x01\n#com.google.cloud.aiplatform.v1beta1B\x13\x45ncryptionSpecProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatformb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ENCRYPTIONSPEC = _descriptor.Descriptor(
  name='EncryptionSpec',
  full_name='google.cloud.aiplatform.v1beta1.EncryptionSpec',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='kms_key_name', full_name='google.cloud.aiplatform.v1beta1.EncryptionSpec.kms_key_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=153,
  serialized_end=196,
)

DESCRIPTOR.message_types_by_name['EncryptionSpec'] = _ENCRYPTIONSPEC
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

EncryptionSpec = _reflection.GeneratedProtocolMessageType('EncryptionSpec', (_message.Message,), {
  'DESCRIPTOR' : _ENCRYPTIONSPEC,
  '__module__' : 'google.cloud.aiplatform.v1beta1.encryption_spec_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.EncryptionSpec)
  })
_sym_db.RegisterMessage(EncryptionSpec)


DESCRIPTOR._options = None
_ENCRYPTIONSPEC.fields_by_name['kms_key_name']._options = None
# @@protoc_insertion_point(module_scope)