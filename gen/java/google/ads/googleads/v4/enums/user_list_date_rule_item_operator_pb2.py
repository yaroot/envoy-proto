# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/enums/user_list_date_rule_item_operator.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/enums/user_list_date_rule_item_operator.proto',
  package='google.ads.googleads.v4.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v4.enumsB!UserListDateRuleItemOperatorProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v4/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V4.Enums\312\002\035Google\\Ads\\GoogleAds\\V4\\Enums\352\002!Google::Ads::GoogleAds::V4::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v4/enums/user_list_date_rule_item_operator.proto\x12\x1dgoogle.ads.googleads.v4.enums\x1a\x1cgoogle/api/annotations.proto\"\x93\x01\n UserListDateRuleItemOperatorEnum\"o\n\x1cUserListDateRuleItemOperator\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\n\n\x06\x45QUALS\x10\x02\x12\x0e\n\nNOT_EQUALS\x10\x03\x12\n\n\x06\x42\x45\x46ORE\x10\x04\x12\t\n\x05\x41\x46TER\x10\x05\x42\xf6\x01\n!com.google.ads.googleads.v4.enumsB!UserListDateRuleItemOperatorProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v4/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V4.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V4\\Enums\xea\x02!Google::Ads::GoogleAds::V4::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_USERLISTDATERULEITEMOPERATORENUM_USERLISTDATERULEITEMOPERATOR = _descriptor.EnumDescriptor(
  name='UserListDateRuleItemOperator',
  full_name='google.ads.googleads.v4.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator',
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
      name='EQUALS', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NOT_EQUALS', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BEFORE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AFTER', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=171,
  serialized_end=282,
)
_sym_db.RegisterEnumDescriptor(_USERLISTDATERULEITEMOPERATORENUM_USERLISTDATERULEITEMOPERATOR)


_USERLISTDATERULEITEMOPERATORENUM = _descriptor.Descriptor(
  name='UserListDateRuleItemOperatorEnum',
  full_name='google.ads.googleads.v4.enums.UserListDateRuleItemOperatorEnum',
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
    _USERLISTDATERULEITEMOPERATORENUM_USERLISTDATERULEITEMOPERATOR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=135,
  serialized_end=282,
)

_USERLISTDATERULEITEMOPERATORENUM_USERLISTDATERULEITEMOPERATOR.containing_type = _USERLISTDATERULEITEMOPERATORENUM
DESCRIPTOR.message_types_by_name['UserListDateRuleItemOperatorEnum'] = _USERLISTDATERULEITEMOPERATORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

UserListDateRuleItemOperatorEnum = _reflection.GeneratedProtocolMessageType('UserListDateRuleItemOperatorEnum', (_message.Message,), {
  'DESCRIPTOR' : _USERLISTDATERULEITEMOPERATORENUM,
  '__module__' : 'google.ads.googleads.v4.enums.user_list_date_rule_item_operator_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.enums.UserListDateRuleItemOperatorEnum)
  })
_sym_db.RegisterMessage(UserListDateRuleItemOperatorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
