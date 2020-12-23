# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/enums/app_campaign_app_store.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/enums/app_campaign_app_store.proto',
  package='google.ads.googleads.v6.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v6.enumsB\030AppCampaignAppStoreProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V6.Enums\312\002\035Google\\Ads\\GoogleAds\\V6\\Enums\352\002!Google::Ads::GoogleAds::V6::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v6/enums/app_campaign_app_store.proto\x12\x1dgoogle.ads.googleads.v6.enums\x1a\x1cgoogle/api/annotations.proto\"y\n\x17\x41ppCampaignAppStoreEnum\"^\n\x13\x41ppCampaignAppStore\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x13\n\x0f\x41PPLE_APP_STORE\x10\x02\x12\x14\n\x10GOOGLE_APP_STORE\x10\x03\x42\xed\x01\n!com.google.ads.googleads.v6.enumsB\x18\x41ppCampaignAppStoreProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v6/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V6.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V6\\Enums\xea\x02!Google::Ads::GoogleAds::V6::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_APPCAMPAIGNAPPSTOREENUM_APPCAMPAIGNAPPSTORE = _descriptor.EnumDescriptor(
  name='AppCampaignAppStore',
  full_name='google.ads.googleads.v6.enums.AppCampaignAppStoreEnum.AppCampaignAppStore',
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
      name='APPLE_APP_STORE', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GOOGLE_APP_STORE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=150,
  serialized_end=244,
)
_sym_db.RegisterEnumDescriptor(_APPCAMPAIGNAPPSTOREENUM_APPCAMPAIGNAPPSTORE)


_APPCAMPAIGNAPPSTOREENUM = _descriptor.Descriptor(
  name='AppCampaignAppStoreEnum',
  full_name='google.ads.googleads.v6.enums.AppCampaignAppStoreEnum',
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
    _APPCAMPAIGNAPPSTOREENUM_APPCAMPAIGNAPPSTORE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=123,
  serialized_end=244,
)

_APPCAMPAIGNAPPSTOREENUM_APPCAMPAIGNAPPSTORE.containing_type = _APPCAMPAIGNAPPSTOREENUM
DESCRIPTOR.message_types_by_name['AppCampaignAppStoreEnum'] = _APPCAMPAIGNAPPSTOREENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AppCampaignAppStoreEnum = _reflection.GeneratedProtocolMessageType('AppCampaignAppStoreEnum', (_message.Message,), {
  'DESCRIPTOR' : _APPCAMPAIGNAPPSTOREENUM,
  '__module__' : 'google.ads.googleads.v6.enums.app_campaign_app_store_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.enums.AppCampaignAppStoreEnum)
  })
_sym_db.RegisterMessage(AppCampaignAppStoreEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
