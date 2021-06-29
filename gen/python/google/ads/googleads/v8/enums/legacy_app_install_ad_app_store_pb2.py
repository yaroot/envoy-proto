# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/enums/legacy_app_install_ad_app_store.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/enums/legacy_app_install_ad_app_store.proto',
  package='google.ads.googleads.v8.enums',
  syntax='proto3',
  serialized_options=b'\n!com.google.ads.googleads.v8.enumsB\037LegacyAppInstallAdAppStoreProtoP\001ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\242\002\003GAA\252\002\035Google.Ads.GoogleAds.V8.Enums\312\002\035Google\\Ads\\GoogleAds\\V8\\Enums\352\002!Google::Ads::GoogleAds::V8::Enums',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v8/enums/legacy_app_install_ad_app_store.proto\x12\x1dgoogle.ads.googleads.v8.enums\x1a\x1cgoogle/api/annotations.proto\"\xc1\x01\n\x1eLegacyAppInstallAdAppStoreEnum\"\x9e\x01\n\x1aLegacyAppInstallAdAppStore\x12\x0f\n\x0bUNSPECIFIED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x13\n\x0f\x41PPLE_APP_STORE\x10\x02\x12\x0f\n\x0bGOOGLE_PLAY\x10\x03\x12\x11\n\rWINDOWS_STORE\x10\x04\x12\x17\n\x13WINDOWS_PHONE_STORE\x10\x05\x12\x10\n\x0c\x43N_APP_STORE\x10\x06\x42\xf4\x01\n!com.google.ads.googleads.v8.enumsB\x1fLegacyAppInstallAdAppStoreProtoP\x01ZBgoogle.golang.org/genproto/googleapis/ads/googleads/v8/enums;enums\xa2\x02\x03GAA\xaa\x02\x1dGoogle.Ads.GoogleAds.V8.Enums\xca\x02\x1dGoogle\\Ads\\GoogleAds\\V8\\Enums\xea\x02!Google::Ads::GoogleAds::V8::Enumsb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,])



_LEGACYAPPINSTALLADAPPSTOREENUM_LEGACYAPPINSTALLADAPPSTORE = _descriptor.EnumDescriptor(
  name='LegacyAppInstallAdAppStore',
  full_name='google.ads.googleads.v8.enums.LegacyAppInstallAdAppStoreEnum.LegacyAppInstallAdAppStore',
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
      name='GOOGLE_PLAY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WINDOWS_STORE', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WINDOWS_PHONE_STORE', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CN_APP_STORE', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=168,
  serialized_end=326,
)
_sym_db.RegisterEnumDescriptor(_LEGACYAPPINSTALLADAPPSTOREENUM_LEGACYAPPINSTALLADAPPSTORE)


_LEGACYAPPINSTALLADAPPSTOREENUM = _descriptor.Descriptor(
  name='LegacyAppInstallAdAppStoreEnum',
  full_name='google.ads.googleads.v8.enums.LegacyAppInstallAdAppStoreEnum',
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
    _LEGACYAPPINSTALLADAPPSTOREENUM_LEGACYAPPINSTALLADAPPSTORE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=133,
  serialized_end=326,
)

_LEGACYAPPINSTALLADAPPSTOREENUM_LEGACYAPPINSTALLADAPPSTORE.containing_type = _LEGACYAPPINSTALLADAPPSTOREENUM
DESCRIPTOR.message_types_by_name['LegacyAppInstallAdAppStoreEnum'] = _LEGACYAPPINSTALLADAPPSTOREENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

LegacyAppInstallAdAppStoreEnum = _reflection.GeneratedProtocolMessageType('LegacyAppInstallAdAppStoreEnum', (_message.Message,), {
  'DESCRIPTOR' : _LEGACYAPPINSTALLADAPPSTOREENUM,
  '__module__' : 'google.ads.googleads.v8.enums.legacy_app_install_ad_app_store_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.enums.LegacyAppInstallAdAppStoreEnum)
  })
_sym_db.RegisterMessage(LegacyAppInstallAdAppStoreEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
