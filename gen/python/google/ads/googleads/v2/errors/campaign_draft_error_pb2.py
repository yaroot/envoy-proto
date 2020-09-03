# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/errors/campaign_draft_error.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/errors/campaign_draft_error.proto',
  package='google.ads.googleads.v2.errors',
  syntax='proto3',
  serialized_options=b'\n\"com.google.ads.googleads.v2.errorsB\027CampaignDraftErrorProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v2/errors;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V2.Errors\312\002\036Google\\Ads\\GoogleAds\\V2\\Errors\352\002\"Google::Ads::GoogleAds::V2::Errors',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n9google/ads/googleads/v2/errors/campaign_draft_error.proto\x12\x1egoogle.ads.googleads.v2.errors\x1a\x1cgoogle/api/annotations.proto\"\xc8\x03\n\x16\x43\x61mpaignDraftErrorEnum\"\xad\x03\n\x12\x43\x61mpaignDraftError\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x18\n\x14\x44UPLICATE_DRAFT_NAME\x10\x02\x12*\n&INVALID_STATUS_TRANSITION_FROM_REMOVED\x10\x03\x12+\n\'INVALID_STATUS_TRANSITION_FROM_PROMOTED\x10\x04\x12\x31\n-INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED\x10\x05\x12 \n\x1c\x43USTOMER_CANNOT_CREATE_DRAFT\x10\x06\x12 \n\x1c\x43\x41MPAIGN_CANNOT_CREATE_DRAFT\x10\x07\x12\x18\n\x14INVALID_DRAFT_CHANGE\x10\x08\x12\x1d\n\x19INVALID_STATUS_TRANSITION\x10\t\x12-\n)MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED\x10\n\x12\'\n#LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY\x10\x0b\x42\xf2\x01\n\"com.google.ads.googleads.v2.errorsB\x17\x43\x61mpaignDraftErrorProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v2/errors;errors\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V2.Errors\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V2\\Errors\xea\x02\"Google::Ads::GoogleAds::V2::Errorsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_CAMPAIGNDRAFTERRORENUM_CAMPAIGNDRAFTERROR = _descriptor.EnumDescriptor(
  name='CampaignDraftError',
  full_name='google.ads.googleads.v2.errors.CampaignDraftErrorEnum.CampaignDraftError',
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
      name='DUPLICATE_DRAFT_NAME', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_STATUS_TRANSITION_FROM_REMOVED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_STATUS_TRANSITION_FROM_PROMOTED', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CUSTOMER_CANNOT_CREATE_DRAFT', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CAMPAIGN_CANNOT_CREATE_DRAFT', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_DRAFT_CHANGE', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='INVALID_STATUS_TRANSITION', index=9, number=9,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED', index=10, number=10,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY', index=11, number=11,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=151,
  serialized_end=580,
)
_sym_db.RegisterEnumDescriptor(_CAMPAIGNDRAFTERRORENUM_CAMPAIGNDRAFTERROR)


_CAMPAIGNDRAFTERRORENUM = _descriptor.Descriptor(
  name='CampaignDraftErrorEnum',
  full_name='google.ads.googleads.v2.errors.CampaignDraftErrorEnum',
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
    _CAMPAIGNDRAFTERRORENUM_CAMPAIGNDRAFTERROR,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=580,
)

_CAMPAIGNDRAFTERRORENUM_CAMPAIGNDRAFTERROR.containing_type = _CAMPAIGNDRAFTERRORENUM
DESCRIPTOR.message_types_by_name['CampaignDraftErrorEnum'] = _CAMPAIGNDRAFTERRORENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CampaignDraftErrorEnum = _reflection.GeneratedProtocolMessageType('CampaignDraftErrorEnum', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNDRAFTERRORENUM,
  '__module__' : 'google.ads.googleads.v2.errors.campaign_draft_error_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.errors.CampaignDraftErrorEnum)
  })
_sym_db.RegisterMessage(CampaignDraftErrorEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
