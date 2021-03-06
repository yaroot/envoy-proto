# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/resources/account_link.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.enums import account_link_status_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_account__link__status__pb2
from google.ads.googleads.v4.enums import linked_account_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_linked__account__type__pb2
from google.ads.googleads.v4.enums import mobile_app_vendor_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_mobile__app__vendor__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/resources/account_link.proto',
  package='google.ads.googleads.v4.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v4.resourcesB\020AccountLinkProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ads::GoogleAds::V4::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v4/resources/account_link.proto\x12!google.ads.googleads.v4.resources\x1a\x37google/ads/googleads/v4/enums/account_link_status.proto\x1a\x37google/ads/googleads/v4/enums/linked_account_type.proto\x1a\x35google/ads/googleads/v4/enums/mobile_app_vendor.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xa2\x04\n\x0b\x41\x63\x63ountLink\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x05\xfa\x41&\n$googleads.googleapis.com/AccountLink\x12\x39\n\x0f\x61\x63\x63ount_link_id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12V\n\x06status\x18\x03 \x01(\x0e\x32\x46.google.ads.googleads.v4.enums.AccountLinkStatusEnum.AccountLinkStatus\x12Y\n\x04type\x18\x04 \x01(\x0e\x32\x46.google.ads.googleads.v4.enums.LinkedAccountTypeEnum.LinkedAccountTypeB\x03\xe0\x41\x03\x12q\n\x19third_party_app_analytics\x18\x05 \x01(\x0b\x32G.google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLinkIdentifierB\x03\xe0\x41\x05H\x00:[\xea\x41X\n$googleads.googleapis.com/AccountLink\x12\x30\x63ustomers/{customer}/accountLinks/{account_link}B\x10\n\x0elinked_account\"\xfb\x01\n$ThirdPartyAppAnalyticsLinkIdentifier\x12\x43\n\x19\x61pp_analytics_provider_id\x18\x01 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x05\x12\x31\n\x06\x61pp_id\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB\x03\xe0\x41\x05\x12[\n\napp_vendor\x18\x03 \x01(\x0e\x32\x42.google.ads.googleads.v4.enums.MobileAppVendorEnum.MobileAppVendorB\x03\xe0\x41\x05\x42\xfd\x01\n%com.google.ads.googleads.v4.resourcesB\x10\x41\x63\x63ountLinkProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V4.Resources\xca\x02!Google\\Ads\\GoogleAds\\V4\\Resources\xea\x02%Google::Ads::GoogleAds::V4::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_account__link__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_linked__account__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_mobile__app__vendor__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ACCOUNTLINK = _descriptor.Descriptor(
  name='AccountLink',
  full_name='google.ads.googleads.v4.resources.AccountLink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.resources.AccountLink.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A&\n$googleads.googleapis.com/AccountLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='account_link_id', full_name='google.ads.googleads.v4.resources.AccountLink.account_link_id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v4.resources.AccountLink.status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v4.resources.AccountLink.type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='third_party_app_analytics', full_name='google.ads.googleads.v4.resources.AccountLink.third_party_app_analytics', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AX\n$googleads.googleapis.com/AccountLink\0220customers/{customer}/accountLinks/{account_link}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='linked_account', full_name='google.ads.googleads.v4.resources.AccountLink.linked_account',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=383,
  serialized_end=929,
)


_THIRDPARTYAPPANALYTICSLINKIDENTIFIER = _descriptor.Descriptor(
  name='ThirdPartyAppAnalyticsLinkIdentifier',
  full_name='google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLinkIdentifier',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='app_analytics_provider_id', full_name='google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLinkIdentifier.app_analytics_provider_id', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='app_id', full_name='google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLinkIdentifier.app_id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='app_vendor', full_name='google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLinkIdentifier.app_vendor', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=932,
  serialized_end=1183,
)

_ACCOUNTLINK.fields_by_name['account_link_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_ACCOUNTLINK.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_account__link__status__pb2._ACCOUNTLINKSTATUSENUM_ACCOUNTLINKSTATUS
_ACCOUNTLINK.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_linked__account__type__pb2._LINKEDACCOUNTTYPEENUM_LINKEDACCOUNTTYPE
_ACCOUNTLINK.fields_by_name['third_party_app_analytics'].message_type = _THIRDPARTYAPPANALYTICSLINKIDENTIFIER
_ACCOUNTLINK.oneofs_by_name['linked_account'].fields.append(
  _ACCOUNTLINK.fields_by_name['third_party_app_analytics'])
_ACCOUNTLINK.fields_by_name['third_party_app_analytics'].containing_oneof = _ACCOUNTLINK.oneofs_by_name['linked_account']
_THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_analytics_provider_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_id'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_vendor'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_mobile__app__vendor__pb2._MOBILEAPPVENDORENUM_MOBILEAPPVENDOR
DESCRIPTOR.message_types_by_name['AccountLink'] = _ACCOUNTLINK
DESCRIPTOR.message_types_by_name['ThirdPartyAppAnalyticsLinkIdentifier'] = _THIRDPARTYAPPANALYTICSLINKIDENTIFIER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AccountLink = _reflection.GeneratedProtocolMessageType('AccountLink', (_message.Message,), {
  'DESCRIPTOR' : _ACCOUNTLINK,
  '__module__' : 'google.ads.googleads.v4.resources.account_link_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.AccountLink)
  })
_sym_db.RegisterMessage(AccountLink)

ThirdPartyAppAnalyticsLinkIdentifier = _reflection.GeneratedProtocolMessageType('ThirdPartyAppAnalyticsLinkIdentifier', (_message.Message,), {
  'DESCRIPTOR' : _THIRDPARTYAPPANALYTICSLINKIDENTIFIER,
  '__module__' : 'google.ads.googleads.v4.resources.account_link_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.ThirdPartyAppAnalyticsLinkIdentifier)
  })
_sym_db.RegisterMessage(ThirdPartyAppAnalyticsLinkIdentifier)


DESCRIPTOR._options = None
_ACCOUNTLINK.fields_by_name['resource_name']._options = None
_ACCOUNTLINK.fields_by_name['account_link_id']._options = None
_ACCOUNTLINK.fields_by_name['type']._options = None
_ACCOUNTLINK.fields_by_name['third_party_app_analytics']._options = None
_ACCOUNTLINK._options = None
_THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_analytics_provider_id']._options = None
_THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_id']._options = None
_THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_vendor']._options = None
# @@protoc_insertion_point(module_scope)
