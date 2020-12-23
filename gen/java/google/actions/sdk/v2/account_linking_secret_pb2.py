# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/account_linking_secret.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/actions/sdk/v2/account_linking_secret.proto',
  package='google.actions.sdk.v2',
  syntax='proto3',
  serialized_options=b'\n\031com.google.actions.sdk.v2B\031AccountLinkingSecretProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/actions/sdk/v2/account_linking_secret.proto\x12\x15google.actions.sdk.v2\"W\n\x14\x41\x63\x63ountLinkingSecret\x12\x1f\n\x17\x65ncrypted_client_secret\x18\x01 \x01(\x0c\x12\x1e\n\x16\x65ncryption_key_version\x18\x02 \x01(\tBr\n\x19\x63om.google.actions.sdk.v2B\x19\x41\x63\x63ountLinkingSecretProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3'
)




_ACCOUNTLINKINGSECRET = _descriptor.Descriptor(
  name='AccountLinkingSecret',
  full_name='google.actions.sdk.v2.AccountLinkingSecret',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='encrypted_client_secret', full_name='google.actions.sdk.v2.AccountLinkingSecret.encrypted_client_secret', index=0,
      number=1, type=12, cpp_type=9, label=1,
      has_default_value=False, default_value=b"",
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='encryption_key_version', full_name='google.actions.sdk.v2.AccountLinkingSecret.encryption_key_version', index=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=77,
  serialized_end=164,
)

DESCRIPTOR.message_types_by_name['AccountLinkingSecret'] = _ACCOUNTLINKINGSECRET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AccountLinkingSecret = _reflection.GeneratedProtocolMessageType('AccountLinkingSecret', (_message.Message,), {
  'DESCRIPTOR' : _ACCOUNTLINKINGSECRET,
  '__module__' : 'google.actions.sdk.v2.account_linking_secret_pb2'
  # @@protoc_insertion_point(class_scope:google.actions.sdk.v2.AccountLinkingSecret)
  })
_sym_db.RegisterMessage(AccountLinkingSecret)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
