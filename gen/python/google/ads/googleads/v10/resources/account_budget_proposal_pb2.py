# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/account_budget_proposal.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import account_budget_proposal_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_account__budget__proposal__status__pb2
from google.ads.googleads.v10.enums import account_budget_proposal_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_account__budget__proposal__type__pb2
from google.ads.googleads.v10.enums import spending_limit_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_spending__limit__type__pb2
from google.ads.googleads.v10.enums import time_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_time__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/ads/googleads/v10/resources/account_budget_proposal.proto\x12\"google.ads.googleads.v10.resources\x1a\x43google/ads/googleads/v10/enums/account_budget_proposal_status.proto\x1a\x41google/ads/googleads/v10/enums/account_budget_proposal_type.proto\x1a\x38google/ads/googleads/v10/enums/spending_limit_type.proto\x1a.google/ads/googleads/v10/enums/time_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xfe\x0e\n\x15\x41\x63\x63ountBudgetProposal\x12M\n\rresource_name\x18\x01 \x01(\tB6\xe0\x41\x05\xfa\x41\x30\n.googleads.googleapis.com/AccountBudgetProposal\x12\x14\n\x02id\x18\x19 \x01(\x03\x42\x03\xe0\x41\x03H\x05\x88\x01\x01\x12I\n\rbilling_setup\x18\x1a \x01(\tB-\xe0\x41\x05\xfa\x41\'\n%googleads.googleapis.com/BillingSetupH\x06\x88\x01\x01\x12K\n\x0e\x61\x63\x63ount_budget\x18\x1b \x01(\tB.\xe0\x41\x05\xfa\x41(\n&googleads.googleapis.com/AccountBudgetH\x07\x88\x01\x01\x12s\n\rproposal_type\x18\x04 \x01(\x0e\x32W.google.ads.googleads.v10.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalTypeB\x03\xe0\x41\x05\x12p\n\x06status\x18\x0f \x01(\x0e\x32[.google.ads.googleads.v10.enums.AccountBudgetProposalStatusEnum.AccountBudgetProposalStatusB\x03\xe0\x41\x03\x12\x1f\n\rproposed_name\x18\x1c \x01(\tB\x03\xe0\x41\x05H\x08\x88\x01\x01\x12*\n\x18\x61pproved_start_date_time\x18\x1e \x01(\tB\x03\xe0\x41\x03H\t\x88\x01\x01\x12\x30\n\x1eproposed_purchase_order_number\x18# \x01(\tB\x03\xe0\x41\x05H\n\x88\x01\x01\x12 \n\x0eproposed_notes\x18$ \x01(\tB\x03\xe0\x41\x05H\x0b\x88\x01\x01\x12$\n\x12\x63reation_date_time\x18% \x01(\tB\x03\xe0\x41\x03H\x0c\x88\x01\x01\x12$\n\x12\x61pproval_date_time\x18& \x01(\tB\x03\xe0\x41\x03H\r\x88\x01\x01\x12\'\n\x18proposed_start_date_time\x18\x1d \x01(\tB\x03\xe0\x41\x05H\x00\x12^\n\x18proposed_start_time_type\x18\x07 \x01(\x0e\x32\x35.google.ads.googleads.v10.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x05H\x00\x12%\n\x16proposed_end_date_time\x18\x1f \x01(\tB\x03\xe0\x41\x05H\x01\x12\\\n\x16proposed_end_time_type\x18\t \x01(\x0e\x32\x35.google.ads.googleads.v10.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x05H\x01\x12%\n\x16\x61pproved_end_date_time\x18  \x01(\tB\x03\xe0\x41\x03H\x02\x12\\\n\x16\x61pproved_end_time_type\x18\x16 \x01(\x0e\x32\x35.google.ads.googleads.v10.enums.TimeTypeEnum.TimeTypeB\x03\xe0\x41\x03H\x02\x12-\n\x1eproposed_spending_limit_micros\x18! \x01(\x03\x42\x03\xe0\x41\x05H\x03\x12t\n\x1cproposed_spending_limit_type\x18\x0b \x01(\x0e\x32G.google.ads.googleads.v10.enums.SpendingLimitTypeEnum.SpendingLimitTypeB\x03\xe0\x41\x05H\x03\x12-\n\x1e\x61pproved_spending_limit_micros\x18\" \x01(\x03\x42\x03\xe0\x41\x03H\x04\x12t\n\x1c\x61pproved_spending_limit_type\x18\x18 \x01(\x0e\x32G.google.ads.googleads.v10.enums.SpendingLimitTypeEnum.SpendingLimitTypeB\x03\xe0\x41\x03H\x04:\x80\x01\xea\x41}\n.googleads.googleapis.com/AccountBudgetProposal\x12Kcustomers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}B\x15\n\x13proposed_start_timeB\x13\n\x11proposed_end_timeB\x13\n\x11\x61pproved_end_timeB\x19\n\x17proposed_spending_limitB\x19\n\x17\x61pproved_spending_limitB\x05\n\x03_idB\x10\n\x0e_billing_setupB\x11\n\x0f_account_budgetB\x10\n\x0e_proposed_nameB\x1b\n\x19_approved_start_date_timeB!\n\x1f_proposed_purchase_order_numberB\x11\n\x0f_proposed_notesB\x15\n\x13_creation_date_timeB\x15\n\x13_approval_date_timeB\x8c\x02\n&com.google.ads.googleads.v10.resourcesB\x1a\x41\x63\x63ountBudgetProposalProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.account_budget_proposal_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\032AccountBudgetProposalProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['resource_name']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A0\n.googleads.googleapis.com/AccountBudgetProposal'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['id']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['id']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['billing_setup']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['billing_setup']._serialized_options = b'\340A\005\372A\'\n%googleads.googleapis.com/BillingSetup'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['account_budget']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['account_budget']._serialized_options = b'\340A\005\372A(\n&googleads.googleapis.com/AccountBudget'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposal_type']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposal_type']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['status']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['status']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_name']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_name']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_start_date_time']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_start_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_purchase_order_number']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_purchase_order_number']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_notes']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_notes']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['creation_date_time']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['creation_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approval_date_time']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approval_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_start_date_time']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_start_date_time']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_start_time_type']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_start_time_type']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_end_date_time']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_end_date_time']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_end_time_type']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_end_time_type']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_end_date_time']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_end_date_time']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_end_time_type']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_end_time_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_spending_limit_micros']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_spending_limit_micros']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_spending_limit_type']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['proposed_spending_limit_type']._serialized_options = b'\340A\005'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_spending_limit_micros']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_spending_limit_micros']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_spending_limit_type']._options = None
  _ACCOUNTBUDGETPROPOSAL.fields_by_name['approved_spending_limit_type']._serialized_options = b'\340A\003'
  _ACCOUNTBUDGETPROPOSAL._options = None
  _ACCOUNTBUDGETPROPOSAL._serialized_options = b'\352A}\n.googleads.googleapis.com/AccountBudgetProposal\022Kcustomers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}'
  _ACCOUNTBUDGETPROPOSAL._serialized_start=407
  _ACCOUNTBUDGETPROPOSAL._serialized_end=2325
# @@protoc_insertion_point(module_scope)
