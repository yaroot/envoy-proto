# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/account_link.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import account_link_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_account__link__status__pb2
from google.ads.googleads.v11.enums import linked_account_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_linked__account__type__pb2
from google.ads.googleads.v11.enums import mobile_app_vendor_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_mobile__app__vendor__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n5google/ads/googleads/v11/resources/account_link.proto\x12\"google.ads.googleads.v11.resources\x1a\x38google/ads/googleads/v11/enums/account_link_status.proto\x1a\x38google/ads/googleads/v11/enums/linked_account_type.proto\x1a\x36google/ads/googleads/v11/enums/mobile_app_vendor.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xb7\x06\n\x0b\x41\x63\x63ountLink\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x05\xfa\x41&\n$googleads.googleapis.com/AccountLink\x12!\n\x0f\x61\x63\x63ount_link_id\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12W\n\x06status\x18\x03 \x01(\x0e\x32G.google.ads.googleads.v11.enums.AccountLinkStatusEnum.AccountLinkStatus\x12Z\n\x04type\x18\x04 \x01(\x0e\x32G.google.ads.googleads.v11.enums.LinkedAccountTypeEnum.LinkedAccountTypeB\x03\xe0\x41\x03\x12r\n\x19third_party_app_analytics\x18\x05 \x01(\x0b\x32H.google.ads.googleads.v11.resources.ThirdPartyAppAnalyticsLinkIdentifierB\x03\xe0\x41\x05H\x00\x12Z\n\x0c\x64\x61ta_partner\x18\x06 \x01(\x0b\x32=.google.ads.googleads.v11.resources.DataPartnerLinkIdentifierB\x03\xe0\x41\x03H\x00\x12V\n\ngoogle_ads\x18\x07 \x01(\x0b\x32;.google.ads.googleads.v11.resources.GoogleAdsLinkIdentifierB\x03\xe0\x41\x03H\x00\x12Z\n\x0chotel_center\x18\t \x01(\x0b\x32=.google.ads.googleads.v11.resources.HotelCenterLinkIdentifierB\x03\xe0\x41\x03H\x00:a\xea\x41^\n$googleads.googleapis.com/AccountLink\x12\x36\x63ustomers/{customer_id}/accountLinks/{account_link_id}B\x10\n\x0elinked_accountB\x12\n\x10_account_link_id\"\xf4\x01\n$ThirdPartyAppAnalyticsLinkIdentifier\x12+\n\x19\x61pp_analytics_provider_id\x18\x04 \x01(\x03\x42\x03\xe0\x41\x05H\x00\x88\x01\x01\x12\x18\n\x06\x61pp_id\x18\x05 \x01(\tB\x03\xe0\x41\x05H\x01\x88\x01\x01\x12\\\n\napp_vendor\x18\x03 \x01(\x0e\x32\x43.google.ads.googleads.v11.enums.MobileAppVendorEnum.MobileAppVendorB\x03\xe0\x41\x05\x42\x1c\n\x1a_app_analytics_provider_idB\t\n\x07_app_id\"R\n\x19\x44\x61taPartnerLinkIdentifier\x12!\n\x0f\x64\x61ta_partner_id\x18\x01 \x01(\x03\x42\x03\xe0\x41\x05H\x00\x88\x01\x01\x42\x12\n\x10_data_partner_id\"9\n\x19HotelCenterLinkIdentifier\x12\x1c\n\x0fhotel_center_id\x18\x01 \x01(\x03\x42\x03\xe0\x41\x03\"h\n\x17GoogleAdsLinkIdentifier\x12@\n\x08\x63ustomer\x18\x03 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/CustomerH\x00\x88\x01\x01\x42\x0b\n\t_customerB\x82\x02\n&com.google.ads.googleads.v11.resourcesB\x10\x41\x63\x63ountLinkProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.account_link_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\020AccountLinkProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _ACCOUNTLINK.fields_by_name['resource_name']._options = None
  _ACCOUNTLINK.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A&\n$googleads.googleapis.com/AccountLink'
  _ACCOUNTLINK.fields_by_name['account_link_id']._options = None
  _ACCOUNTLINK.fields_by_name['account_link_id']._serialized_options = b'\340A\003'
  _ACCOUNTLINK.fields_by_name['type']._options = None
  _ACCOUNTLINK.fields_by_name['type']._serialized_options = b'\340A\003'
  _ACCOUNTLINK.fields_by_name['third_party_app_analytics']._options = None
  _ACCOUNTLINK.fields_by_name['third_party_app_analytics']._serialized_options = b'\340A\005'
  _ACCOUNTLINK.fields_by_name['data_partner']._options = None
  _ACCOUNTLINK.fields_by_name['data_partner']._serialized_options = b'\340A\003'
  _ACCOUNTLINK.fields_by_name['google_ads']._options = None
  _ACCOUNTLINK.fields_by_name['google_ads']._serialized_options = b'\340A\003'
  _ACCOUNTLINK.fields_by_name['hotel_center']._options = None
  _ACCOUNTLINK.fields_by_name['hotel_center']._serialized_options = b'\340A\003'
  _ACCOUNTLINK._options = None
  _ACCOUNTLINK._serialized_options = b'\352A^\n$googleads.googleapis.com/AccountLink\0226customers/{customer_id}/accountLinks/{account_link_id}'
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_analytics_provider_id']._options = None
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_analytics_provider_id']._serialized_options = b'\340A\005'
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_id']._options = None
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_id']._serialized_options = b'\340A\005'
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_vendor']._options = None
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER.fields_by_name['app_vendor']._serialized_options = b'\340A\005'
  _DATAPARTNERLINKIDENTIFIER.fields_by_name['data_partner_id']._options = None
  _DATAPARTNERLINKIDENTIFIER.fields_by_name['data_partner_id']._serialized_options = b'\340A\005'
  _HOTELCENTERLINKIDENTIFIER.fields_by_name['hotel_center_id']._options = None
  _HOTELCENTERLINKIDENTIFIER.fields_by_name['hotel_center_id']._serialized_options = b'\340A\003'
  _GOOGLEADSLINKIDENTIFIER.fields_by_name['customer']._options = None
  _GOOGLEADSLINKIDENTIFIER.fields_by_name['customer']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Customer'
  _ACCOUNTLINK._serialized_start=326
  _ACCOUNTLINK._serialized_end=1149
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER._serialized_start=1152
  _THIRDPARTYAPPANALYTICSLINKIDENTIFIER._serialized_end=1396
  _DATAPARTNERLINKIDENTIFIER._serialized_start=1398
  _DATAPARTNERLINKIDENTIFIER._serialized_end=1480
  _HOTELCENTERLINKIDENTIFIER._serialized_start=1482
  _HOTELCENTERLINKIDENTIFIER._serialized_end=1539
  _GOOGLEADSLINKIDENTIFIER._serialized_start=1541
  _GOOGLEADSLINKIDENTIFIER._serialized_end=1645
# @@protoc_insertion_point(module_scope)
