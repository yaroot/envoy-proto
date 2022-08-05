# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/payments_account.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/ads/googleads/v10/resources/payments_account.proto\x12\"google.ads.googleads.v10.resources\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xdb\x04\n\x0fPaymentsAccount\x12G\n\rresource_name\x18\x01 \x01(\tB0\xe0\x41\x03\xfa\x41*\n(googleads.googleapis.com/PaymentsAccount\x12%\n\x13payments_account_id\x18\x08 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x16\n\x04name\x18\t \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1f\n\rcurrency_code\x18\n \x01(\tB\x03\xe0\x41\x03H\x02\x88\x01\x01\x12%\n\x13payments_profile_id\x18\x0b \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12/\n\x1dsecondary_payments_profile_id\x18\x0c \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x12O\n\x17paying_manager_customer\x18\r \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CustomerH\x05\x88\x01\x01:m\xea\x41j\n(googleads.googleapis.com/PaymentsAccount\x12>customers/{customer_id}/paymentsAccounts/{payments_account_id}B\x16\n\x14_payments_account_idB\x07\n\x05_nameB\x10\n\x0e_currency_codeB\x16\n\x14_payments_profile_idB \n\x1e_secondary_payments_profile_idB\x1a\n\x18_paying_manager_customerB\x86\x02\n&com.google.ads.googleads.v10.resourcesB\x14PaymentsAccountProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.payments_account_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\024PaymentsAccountProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _PAYMENTSACCOUNT.fields_by_name['resource_name']._options = None
  _PAYMENTSACCOUNT.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A*\n(googleads.googleapis.com/PaymentsAccount'
  _PAYMENTSACCOUNT.fields_by_name['payments_account_id']._options = None
  _PAYMENTSACCOUNT.fields_by_name['payments_account_id']._serialized_options = b'\340A\003'
  _PAYMENTSACCOUNT.fields_by_name['name']._options = None
  _PAYMENTSACCOUNT.fields_by_name['name']._serialized_options = b'\340A\003'
  _PAYMENTSACCOUNT.fields_by_name['currency_code']._options = None
  _PAYMENTSACCOUNT.fields_by_name['currency_code']._serialized_options = b'\340A\003'
  _PAYMENTSACCOUNT.fields_by_name['payments_profile_id']._options = None
  _PAYMENTSACCOUNT.fields_by_name['payments_profile_id']._serialized_options = b'\340A\003'
  _PAYMENTSACCOUNT.fields_by_name['secondary_payments_profile_id']._options = None
  _PAYMENTSACCOUNT.fields_by_name['secondary_payments_profile_id']._serialized_options = b'\340A\003'
  _PAYMENTSACCOUNT.fields_by_name['paying_manager_customer']._options = None
  _PAYMENTSACCOUNT.fields_by_name['paying_manager_customer']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Customer'
  _PAYMENTSACCOUNT._options = None
  _PAYMENTSACCOUNT._serialized_options = b'\352Aj\n(googleads.googleapis.com/PaymentsAccount\022>customers/{customer_id}/paymentsAccounts/{payments_account_id}'
  _PAYMENTSACCOUNT._serialized_start=158
  _PAYMENTSACCOUNT._serialized_end=761
# @@protoc_insertion_point(module_scope)
