# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/billing_setup.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import billing_setup_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_billing__setup__status__pb2
from google.ads.googleads.v10.enums import time_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_time__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/ads/googleads/v10/resources/billing_setup.proto\x12\"google.ads.googleads.v10.resources\x1a\x39google/ads/googleads/v10/enums/billing_setup_status.proto\x1a.google/ads/googleads/v10/enums/time_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xfa\x08\n\x0c\x42illingSetup\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x05\xfa\x41\'\n%googleads.googleapis.com/BillingSetup\x12\x14\n\x02id\x18\x0f \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12^\n\x06status\x18\x03 \x01(\x0e\x32I.google.ads.googleads.v10.enums.BillingSetupStatusEnum.BillingSetupStatusB\x03\xe0\x41\x03\x12O\n\x10payments_account\x18\x12 \x01(\tB0\xe0\x41\x05\xfa\x41*\n(googleads.googleapis.com/PaymentsAccountH\x03\x88\x01\x01\x12h\n\x15payments_account_info\x18\x0c \x01(\x0b\x32\x44.google.ads.googleads.v10.resources.BillingSetup.PaymentsAccountInfoB\x03\xe0\x41\x05\x12\x1e\n\x0fstart_date_time\x18\x10 \x01(\tB\x03\xe0\x41\x05H\x00\x12U\n\x0fstart_time_type\x18\n \x01(\x0e\x32\x35.google.ads.googleads.v10.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x05H\x00\x12\x1c\n\rend_date_time\x18\x11 \x01(\tB\x03\xe0\x41\x03H\x01\x12S\n\rend_time_type\x18\x0e \x01(\x0e\x32\x35.google.ads.googleads.v10.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x03H\x01\x1a\xec\x02\n\x13PaymentsAccountInfo\x12%\n\x13payments_account_id\x18\x06 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\'\n\x15payments_account_name\x18\x07 \x01(\tB\x03\xe0\x41\x05H\x01\x88\x01\x01\x12%\n\x13payments_profile_id\x18\x08 \x01(\tB\x03\xe0\x41\x05H\x02\x88\x01\x01\x12\'\n\x15payments_profile_name\x18\t \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12/\n\x1dsecondary_payments_profile_id\x18\n \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x42\x16\n\x14_payments_account_idB\x18\n\x16_payments_account_nameB\x16\n\x14_payments_profile_idB\x18\n\x16_payments_profile_nameB \n\x1e_secondary_payments_profile_id:d\xea\x41\x61\n%googleads.googleapis.com/BillingSetup\x12\x38\x63ustomers/{customer_id}/billingSetups/{billing_setup_id}B\x0c\n\nstart_timeB\n\n\x08\x65nd_timeB\x05\n\x03_idB\x13\n\x11_payments_accountB\x83\x02\n&com.google.ads.googleads.v10.resourcesB\x11\x42illingSetupProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.billing_setup_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\021BillingSetupProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_id']._options = None
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_id']._serialized_options = b'\340A\003'
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_name']._options = None
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_account_name']._serialized_options = b'\340A\005'
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_id']._options = None
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_id']._serialized_options = b'\340A\005'
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_name']._options = None
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['payments_profile_name']._serialized_options = b'\340A\003'
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['secondary_payments_profile_id']._options = None
  _BILLINGSETUP_PAYMENTSACCOUNTINFO.fields_by_name['secondary_payments_profile_id']._serialized_options = b'\340A\003'
  _BILLINGSETUP.fields_by_name['resource_name']._options = None
  _BILLINGSETUP.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A\'\n%googleads.googleapis.com/BillingSetup'
  _BILLINGSETUP.fields_by_name['id']._options = None
  _BILLINGSETUP.fields_by_name['id']._serialized_options = b'\340A\003'
  _BILLINGSETUP.fields_by_name['status']._options = None
  _BILLINGSETUP.fields_by_name['status']._serialized_options = b'\340A\003'
  _BILLINGSETUP.fields_by_name['payments_account']._options = None
  _BILLINGSETUP.fields_by_name['payments_account']._serialized_options = b'\340A\005\372A*\n(googleads.googleapis.com/PaymentsAccount'
  _BILLINGSETUP.fields_by_name['payments_account_info']._options = None
  _BILLINGSETUP.fields_by_name['payments_account_info']._serialized_options = b'\340A\005'
  _BILLINGSETUP.fields_by_name['start_date_time']._options = None
  _BILLINGSETUP.fields_by_name['start_date_time']._serialized_options = b'\340A\005'
  _BILLINGSETUP.fields_by_name['start_time_type']._options = None
  _BILLINGSETUP.fields_by_name['start_time_type']._serialized_options = b'\340A\005'
  _BILLINGSETUP.fields_by_name['end_date_time']._options = None
  _BILLINGSETUP.fields_by_name['end_date_time']._serialized_options = b'\340A\003'
  _BILLINGSETUP.fields_by_name['end_time_type']._options = None
  _BILLINGSETUP.fields_by_name['end_time_type']._serialized_options = b'\340A\003'
  _BILLINGSETUP._options = None
  _BILLINGSETUP._serialized_options = b'\352Aa\n%googleads.googleapis.com/BillingSetup\0228customers/{customer_id}/billingSetups/{billing_setup_id}'
  _BILLINGSETUP._serialized_start=262
  _BILLINGSETUP._serialized_end=1408
  _BILLINGSETUP_PAYMENTSACCOUNTINFO._serialized_start=888
  _BILLINGSETUP_PAYMENTSACCOUNTINFO._serialized_end=1252
# @@protoc_insertion_point(module_scope)
