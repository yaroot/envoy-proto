# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/account_budget_proposal_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import account_budget_proposal_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_account__budget__proposal__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nFgoogle/ads/googleads/v9/services/account_budget_proposal_service.proto\x12 google.ads.googleads.v9.services\x1a?google/ads/googleads/v9/resources/account_budget_proposal.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\"p\n\x1fGetAccountBudgetProposalRequest\x12M\n\rresource_name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.googleads.googleapis.com/AccountBudgetProposal\"\xaf\x01\n\"MutateAccountBudgetProposalRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\toperation\x18\x02 \x01(\x0b\x32@.google.ads.googleads.v9.services.AccountBudgetProposalOperationB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"\xbc\x01\n\x1e\x41\x63\x63ountBudgetProposalOperation\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12J\n\x06\x63reate\x18\x02 \x01(\x0b\x32\x38.google.ads.googleads.v9.resources.AccountBudgetProposalH\x00\x12\x10\n\x06remove\x18\x01 \x01(\tH\x00\x42\x0b\n\toperation\"z\n#MutateAccountBudgetProposalResponse\x12S\n\x06result\x18\x02 \x01(\x0b\x32\x43.google.ads.googleads.v9.services.MutateAccountBudgetProposalResult\":\n!MutateAccountBudgetProposalResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xde\x04\n\x1c\x41\x63\x63ountBudgetProposalService\x12\xe9\x01\n\x18GetAccountBudgetProposal\x12\x41.google.ads.googleads.v9.services.GetAccountBudgetProposalRequest\x1a\x38.google.ads.googleads.v9.resources.AccountBudgetProposal\"P\x82\xd3\xe4\x93\x02:\x12\x38/v9/{resource_name=customers/*/accountBudgetProposals/*}\xda\x41\rresource_name\x12\x8a\x02\n\x1bMutateAccountBudgetProposal\x12\x44.google.ads.googleads.v9.services.MutateAccountBudgetProposalRequest\x1a\x45.google.ads.googleads.v9.services.MutateAccountBudgetProposalResponse\"^\x82\xd3\xe4\x93\x02@\";/v9/customers/{customer_id=*}/accountBudgetProposals:mutate:\x01*\xda\x41\x15\x63ustomer_id,operation\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x88\x02\n$com.google.ads.googleads.v9.servicesB!AccountBudgetProposalServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.account_budget_proposal_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB!AccountBudgetProposalServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['resource_name']._options = None
  _GETACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A0\n.googleads.googleapis.com/AccountBudgetProposal'
  _MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['operation']._options = None
  _MUTATEACCOUNTBUDGETPROPOSALREQUEST.fields_by_name['operation']._serialized_options = b'\340A\002'
  _ACCOUNTBUDGETPROPOSALSERVICE._options = None
  _ACCOUNTBUDGETPROPOSALSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ACCOUNTBUDGETPROPOSALSERVICE.methods_by_name['GetAccountBudgetProposal']._options = None
  _ACCOUNTBUDGETPROPOSALSERVICE.methods_by_name['GetAccountBudgetProposal']._serialized_options = b'\202\323\344\223\002:\0228/v9/{resource_name=customers/*/accountBudgetProposals/*}\332A\rresource_name'
  _ACCOUNTBUDGETPROPOSALSERVICE.methods_by_name['MutateAccountBudgetProposal']._options = None
  _ACCOUNTBUDGETPROPOSALSERVICE.methods_by_name['MutateAccountBudgetProposal']._serialized_options = b'\202\323\344\223\002@\";/v9/customers/{customer_id=*}/accountBudgetProposals:mutate:\001*\332A\025customer_id,operation'
  _GETACCOUNTBUDGETPROPOSALREQUEST._serialized_start=322
  _GETACCOUNTBUDGETPROPOSALREQUEST._serialized_end=434
  _MUTATEACCOUNTBUDGETPROPOSALREQUEST._serialized_start=437
  _MUTATEACCOUNTBUDGETPROPOSALREQUEST._serialized_end=612
  _ACCOUNTBUDGETPROPOSALOPERATION._serialized_start=615
  _ACCOUNTBUDGETPROPOSALOPERATION._serialized_end=803
  _MUTATEACCOUNTBUDGETPROPOSALRESPONSE._serialized_start=805
  _MUTATEACCOUNTBUDGETPROPOSALRESPONSE._serialized_end=927
  _MUTATEACCOUNTBUDGETPROPOSALRESULT._serialized_start=929
  _MUTATEACCOUNTBUDGETPROPOSALRESULT._serialized_end=987
  _ACCOUNTBUDGETPROPOSALSERVICE._serialized_start=990
  _ACCOUNTBUDGETPROPOSALSERVICE._serialized_end=1596
# @@protoc_insertion_point(module_scope)
