# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/errors/manager_link_error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/errors/manager_link_error.proto',
  package='google.ads.googleads.v8.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v8.errorsB\025ManagerLinkErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V8.Errors\312\002\036Google\\Ads\\GoogleAds\\V8\\Errors\352\002\"Google::Ads::GoogleAds::V8::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n7google/ads/googleads/v8/errors/manager_link_error.proto\x12\x1egoogle.ads.googleads.v8.errors\x1a\x1cgoogle/api/annotations.proto\"\xc5\x04\n\x14ManagerLinkErrorEnum\"\xac\x04\n\x10ManagerLinkError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\'\n#ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING\x10\x02\x12\x15\n\x11TOO_MANY_MANAGERS\x10\x03\x12\x14\n\x10TOO_MANY_INVITES\x10\x04\x12#\n\x1f\x41LREADY_INVITED_BY_THIS_MANAGER\x10\x05\x12#\n\x1f\x41LREADY_MANAGED_BY_THIS_MANAGER\x10\x06\x12 \n\x1c\x41LREADY_MANAGED_IN_HIERARCHY\x10\x07\x12\x19\n\x15\x44UPLICATE_CHILD_FOUND\x10\x08\x12\x1c\n\x18\x43LIENT_HAS_NO_ADMIN_USER\x10\t\x12\x16\n\x12MAX_DEPTH_EXCEEDED\x10\n\x12\x15\n\x11\x43YCLE_NOT_ALLOWED\x10\x0b\x12\x15\n\x11TOO_MANY_ACCOUNTS\x10\x0c\x12 \n\x1cTOO_MANY_ACCOUNTS_AT_MANAGER\x10\r\x12%\n!NON_OWNER_USER_CANNOT_MODIFY_LINK\x10\x0e\x12(\n$SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS\x10\x0f\x12\x17\n\x13\x43LIENT_OUTSIDE_TREE\x10\x10\x12\x19\n\x15INVALID_STATUS_CHANGE\x10\x11\x12\x12\n\x0eINVALID_CHANGE\x10\x12\x42\xf0\x01\n\"com.google.ads.googleads.v8.errorsB\x15ManagerLinkErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v8/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V8.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V8\\Errors\xea\x02\"Google::Ads::GoogleAds::V8::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_MANAGERLINKERRORENUM_MANAGERLINKERROR = _descriptor.EnumDescriptor(
  name='ManagerLinkError',
  full_name='google.ads.googleads.v8.errors.ManagerLinkErrorEnum.ManagerLinkError',
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
      name='UNKNOWN', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_MANAGERS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_INVITES', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ALREADY_INVITED_BY_THIS_MANAGER', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ALREADY_MANAGED_BY_THIS_MANAGER', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ALREADY_MANAGED_IN_HIERARCHY', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DUPLICATE_CHILD_FOUND', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLIENT_HAS_NO_ADMIN_USER', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MAX_DEPTH_EXCEEDED', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CYCLE_NOT_ALLOWED', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_ACCOUNTS', index=12, number=12,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TOO_MANY_ACCOUNTS_AT_MANAGER', index=13, number=13,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NON_OWNER_USER_CANNOT_MODIFY_LINK', index=14, number=14,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS', index=15, number=15,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CLIENT_OUTSIDE_TREE', index=16, number=16,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_STATUS_CHANGE', index=17, number=17,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_CHANGE', index=18, number=18,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=147,
  serialized_end=703,
)
_sym_db.RegisterEnumDescriptor(_MANAGERLINKERRORENUM_MANAGERLINKERROR)


_MANAGERLINKERRORENUM = _descriptor.Descriptor(
  name='ManagerLinkErrorEnum',
  full_name='google.ads.googleads.v8.errors.ManagerLinkErrorEnum',
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
    _MANAGERLINKERRORENUM_MANAGERLINKERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=122,
  serialized_end=703,
)

_MANAGERLINKERRORENUM_MANAGERLINKERROR.containing_type = _MANAGERLINKERRORENUM
DESCRIPTOR.message_types_by_name['ManagerLinkErrorEnum'] = _MANAGERLINKERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ManagerLinkErrorEnum = _reflection.GeneratedProtocolMessageType('ManagerLinkErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _MANAGERLINKERRORENUM,
  '__module__' : 'google.ads.googleads.v8.errors.manager_link_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.errors.ManagerLinkErrorEnum)
  })
_sym_db.RegisterMessage(ManagerLinkErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
