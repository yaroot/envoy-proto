# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/resources/account_budget.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.enums import account_budget_proposal_type_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_account__budget__proposal__type__pb2
from google.ads.googleads.v9.enums import account_budget_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_account__budget__status__pb2
from google.ads.googleads.v9.enums import spending_limit_type_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_spending__limit__type__pb2
from google.ads.googleads.v9.enums import time_type_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_time__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/ads/googleads/v9/resources/account_budget.proto\x12!google.ads.googleads.v9.resources\x1a@google/ads/googleads/v9/enums/account_budget_proposal_type.proto\x1a\x39google/ads/googleads/v9/enums/account_budget_status.proto\x1a\x37google/ads/googleads/v9/enums/spending_limit_type.proto\x1a-google/ads/googleads/v9/enums/time_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\x86\x14\n\rAccountBudget\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xe0\x41\x03\xfa\x41(\n&googleads.googleapis.com/AccountBudget\x12\x14\n\x02id\x18\x17 \x01(\x03\x42\x03\xe0\x41\x03H\x05\x88\x01\x01\x12I\n\rbilling_setup\x18\x18 \x01(\tB-\xe0\x41\x03\xfa\x41\'\n%googleads.googleapis.com/BillingSetupH\x06\x88\x01\x01\x12_\n\x06status\x18\x04 \x01(\x0e\x32J.google.ads.googleads.v9.enums.AccountBudgetStatusEnum.AccountBudgetStatusB\x03\xe0\x41\x03\x12\x16\n\x04name\x18\x19 \x01(\tB\x03\xe0\x41\x03H\x07\x88\x01\x01\x12*\n\x18proposed_start_date_time\x18\x1a \x01(\tB\x03\xe0\x41\x03H\x08\x88\x01\x01\x12*\n\x18\x61pproved_start_date_time\x18\x1b \x01(\tB\x03\xe0\x41\x03H\t\x88\x01\x01\x12%\n\x18total_adjustments_micros\x18! \x01(\x03\x42\x03\xe0\x41\x03\x12!\n\x14\x61mount_served_micros\x18\" \x01(\x03\x42\x03\xe0\x41\x03\x12\'\n\x15purchase_order_number\x18# \x01(\tB\x03\xe0\x41\x03H\n\x88\x01\x01\x12\x17\n\x05notes\x18$ \x01(\tB\x03\xe0\x41\x03H\x0b\x88\x01\x01\x12l\n\x10pending_proposal\x18\x16 \x01(\x0b\x32M.google.ads.googleads.v9.resources.AccountBudget.PendingAccountBudgetProposalB\x03\xe0\x41\x03\x12%\n\x16proposed_end_date_time\x18\x1c \x01(\tB\x03\xe0\x41\x03H\x00\x12[\n\x16proposed_end_time_type\x18\t \x01(\x0e\x32\x34.google.ads.googleads.v9.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x03H\x00\x12%\n\x16\x61pproved_end_date_time\x18\x1d \x01(\tB\x03\xe0\x41\x03H\x01\x12[\n\x16\x61pproved_end_time_type\x18\x0b \x01(\x0e\x32\x34.google.ads.googleads.v9.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x03H\x01\x12-\n\x1eproposed_spending_limit_micros\x18\x1e \x01(\x03\x42\x03\xe0\x41\x03H\x02\x12s\n\x1cproposed_spending_limit_type\x18\r \x01(\x0e\x32\x46.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitTypeB\x03\xe0\x41\x03H\x02\x12-\n\x1e\x61pproved_spending_limit_micros\x18\x1f \x01(\x03\x42\x03\xe0\x41\x03H\x03\x12s\n\x1c\x61pproved_spending_limit_type\x18\x0f \x01(\x0e\x32\x46.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitTypeB\x03\xe0\x41\x03H\x03\x12-\n\x1e\x61\x64justed_spending_limit_micros\x18  \x01(\x03\x42\x03\xe0\x41\x03H\x04\x12s\n\x1c\x61\x64justed_spending_limit_type\x18\x11 \x01(\x0e\x32\x46.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitTypeB\x03\xe0\x41\x03H\x04\x1a\xa9\x06\n\x1cPendingAccountBudgetProposal\x12\\\n\x17\x61\x63\x63ount_budget_proposal\x18\x0c \x01(\tB6\xe0\x41\x03\xfa\x41\x30\n.googleads.googleapis.com/AccountBudgetProposalH\x02\x88\x01\x01\x12r\n\rproposal_type\x18\x02 \x01(\x0e\x32V.google.ads.googleads.v9.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalTypeB\x03\xe0\x41\x03\x12\x16\n\x04name\x18\r \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12!\n\x0fstart_date_time\x18\x0e \x01(\tB\x03\xe0\x41\x03H\x04\x88\x01\x01\x12\'\n\x15purchase_order_number\x18\x11 \x01(\tB\x03\xe0\x41\x03H\x05\x88\x01\x01\x12\x17\n\x05notes\x18\x12 \x01(\tB\x03\xe0\x41\x03H\x06\x88\x01\x01\x12$\n\x12\x63reation_date_time\x18\x13 \x01(\tB\x03\xe0\x41\x03H\x07\x88\x01\x01\x12\x1c\n\rend_date_time\x18\x0f \x01(\tB\x03\xe0\x41\x03H\x00\x12R\n\rend_time_type\x18\x06 \x01(\x0e\x32\x34.google.ads.googleads.v9.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x03H\x00\x12$\n\x15spending_limit_micros\x18\x10 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x12j\n\x13spending_limit_type\x18\x08 \x01(\x0e\x32\x46.google.ads.googleads.v9.enums.SpendingLimitTypeEnum.SpendingLimitTypeB\x03\xe0\x41\x03H\x01\x42\n\n\x08\x65nd_timeB\x10\n\x0espending_limitB\x1a\n\x18_account_budget_proposalB\x07\n\x05_nameB\x12\n\x10_start_date_timeB\x18\n\x16_purchase_order_numberB\x08\n\x06_notesB\x15\n\x13_creation_date_time:g\xea\x41\x64\n&googleads.googleapis.com/AccountBudget\x12:customers/{customer_id}/accountBudgets/{account_budget_id}B\x13\n\x11proposed_end_timeB\x13\n\x11\x61pproved_end_timeB\x19\n\x17proposed_spending_limitB\x19\n\x17\x61pproved_spending_limitB\x19\n\x17\x61\x64justed_spending_limitB\x05\n\x03_idB\x10\n\x0e_billing_setupB\x07\n\x05_nameB\x1b\n\x19_proposed_start_date_timeB\x1b\n\x19_approved_start_date_timeB\x18\n\x16_purchase_order_numberB\x08\n\x06_notesB\xff\x01\n%com.google.ads.googleads.v9.resourcesB\x12\x41\x63\x63ountBudgetProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v9/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V9.Resources\xca\x02!Google\\Ads\\GoogleAds\\V9\\Resources\xea\x02%Google::Ads::GoogleAds::V9::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.resources.account_budget_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v9.resourcesB\022AccountBudgetProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v9/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resources\312\002!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%Google::Ads::GoogleAds::V9::Resources'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['account_budget_proposal']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['account_budget_proposal']._serialized_options = b'\340A\003\372A0\n.googleads.googleapis.com/AccountBudgetProposal'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['proposal_type']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['proposal_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['name']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['name']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['start_date_time']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['start_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['purchase_order_number']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['purchase_order_number']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['notes']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['notes']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['creation_date_time']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['creation_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['end_date_time']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['end_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['end_time_type']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['end_time_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['spending_limit_micros']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['spending_limit_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['spending_limit_type']._options = None
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL.fields_by_name['spending_limit_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['resource_name']._options = None
  _ACCOUNTBUDGET.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A(\n&googleads.googleapis.com/AccountBudget'
  _ACCOUNTBUDGET.fields_by_name['id']._options = None
  _ACCOUNTBUDGET.fields_by_name['id']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['billing_setup']._options = None
  _ACCOUNTBUDGET.fields_by_name['billing_setup']._serialized_options = b'\340A\003\372A\'\n%googleads.googleapis.com/BillingSetup'
  _ACCOUNTBUDGET.fields_by_name['status']._options = None
  _ACCOUNTBUDGET.fields_by_name['status']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['name']._options = None
  _ACCOUNTBUDGET.fields_by_name['name']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['proposed_start_date_time']._options = None
  _ACCOUNTBUDGET.fields_by_name['proposed_start_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['approved_start_date_time']._options = None
  _ACCOUNTBUDGET.fields_by_name['approved_start_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['total_adjustments_micros']._options = None
  _ACCOUNTBUDGET.fields_by_name['total_adjustments_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['amount_served_micros']._options = None
  _ACCOUNTBUDGET.fields_by_name['amount_served_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['purchase_order_number']._options = None
  _ACCOUNTBUDGET.fields_by_name['purchase_order_number']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['notes']._options = None
  _ACCOUNTBUDGET.fields_by_name['notes']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['pending_proposal']._options = None
  _ACCOUNTBUDGET.fields_by_name['pending_proposal']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['proposed_end_date_time']._options = None
  _ACCOUNTBUDGET.fields_by_name['proposed_end_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['proposed_end_time_type']._options = None
  _ACCOUNTBUDGET.fields_by_name['proposed_end_time_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['approved_end_date_time']._options = None
  _ACCOUNTBUDGET.fields_by_name['approved_end_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['approved_end_time_type']._options = None
  _ACCOUNTBUDGET.fields_by_name['approved_end_time_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['proposed_spending_limit_micros']._options = None
  _ACCOUNTBUDGET.fields_by_name['proposed_spending_limit_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['proposed_spending_limit_type']._options = None
  _ACCOUNTBUDGET.fields_by_name['proposed_spending_limit_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['approved_spending_limit_micros']._options = None
  _ACCOUNTBUDGET.fields_by_name['approved_spending_limit_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['approved_spending_limit_type']._options = None
  _ACCOUNTBUDGET.fields_by_name['approved_spending_limit_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['adjusted_spending_limit_micros']._options = None
  _ACCOUNTBUDGET.fields_by_name['adjusted_spending_limit_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET.fields_by_name['adjusted_spending_limit_type']._options = None
  _ACCOUNTBUDGET.fields_by_name['adjusted_spending_limit_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGET._options = None
  _ACCOUNTBUDGET._serialized_options = b'\352Ad\n&googleads.googleapis.com/AccountBudget\022:customers/{customer_id}/accountBudgets/{account_budget_id}'
  _ACCOUNTBUDGET._serialized_start=413
  _ACCOUNTBUDGET._serialized_end=2979
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL._serialized_start=1814
  _ACCOUNTBUDGET_PENDINGACCOUNTBUDGETPROPOSAL._serialized_end=2623
# @@protoc_insertion_point(module_scope)
