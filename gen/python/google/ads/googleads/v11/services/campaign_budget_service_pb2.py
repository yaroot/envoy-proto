# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/campaign_budget_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v11.resources import campaign_budget_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_campaign__budget__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/ads/googleads/v11/services/campaign_budget_service.proto\x12!google.ads.googleads.v11.services\x1a:google/ads/googleads/v11/enums/response_content_type.proto\x1a\x38google/ads/googleads/v11/resources/campaign_budget.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xa9\x02\n\x1cMutateCampaignBudgetsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12S\n\noperations\x18\x02 \x03(\x0b\x32:.google.ads.googleads.v11.services.CampaignBudgetOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType\"\xa3\x02\n\x17\x43\x61mpaignBudgetOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x44\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x32.google.ads.googleads.v11.resources.CampaignBudgetH\x00\x12\x44\n\x06update\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v11.resources.CampaignBudgetH\x00\x12>\n\x06remove\x18\x03 \x01(\tB,\xfa\x41)\n\'googleads.googleapis.com/CampaignBudgetH\x00\x42\x0b\n\toperation\"\xa2\x01\n\x1dMutateCampaignBudgetsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12N\n\x07results\x18\x02 \x03(\x0b\x32=.google.ads.googleads.v11.services.MutateCampaignBudgetResult\"\xae\x01\n\x1aMutateCampaignBudgetResult\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xfa\x41)\n\'googleads.googleapis.com/CampaignBudget\x12K\n\x0f\x63\x61mpaign_budget\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v11.resources.CampaignBudget2\xd6\x02\n\x15\x43\x61mpaignBudgetService\x12\xf5\x01\n\x15MutateCampaignBudgets\x12?.google.ads.googleads.v11.services.MutateCampaignBudgetsRequest\x1a@.google.ads.googleads.v11.services.MutateCampaignBudgetsResponse\"Y\x82\xd3\xe4\x93\x02:\"5/v11/customers/{customer_id=*}/campaignBudgets:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x86\x02\n%com.google.ads.googleads.v11.servicesB\x1a\x43\x61mpaignBudgetServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.campaign_budget_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\032CampaignBudgetServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['operations']._options = None
  _MUTATECAMPAIGNBUDGETSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CAMPAIGNBUDGETOPERATION.fields_by_name['remove']._options = None
  _CAMPAIGNBUDGETOPERATION.fields_by_name['remove']._serialized_options = b'\372A)\n\'googleads.googleapis.com/CampaignBudget'
  _MUTATECAMPAIGNBUDGETRESULT.fields_by_name['resource_name']._options = None
  _MUTATECAMPAIGNBUDGETRESULT.fields_by_name['resource_name']._serialized_options = b'\372A)\n\'googleads.googleapis.com/CampaignBudget'
  _CAMPAIGNBUDGETSERVICE._options = None
  _CAMPAIGNBUDGETSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CAMPAIGNBUDGETSERVICE.methods_by_name['MutateCampaignBudgets']._options = None
  _CAMPAIGNBUDGETSERVICE.methods_by_name['MutateCampaignBudgets']._serialized_options = b'\202\323\344\223\002:\"5/v11/customers/{customer_id=*}/campaignBudgets:mutate:\001*\332A\026customer_id,operations'
  _MUTATECAMPAIGNBUDGETSREQUEST._serialized_start=395
  _MUTATECAMPAIGNBUDGETSREQUEST._serialized_end=692
  _CAMPAIGNBUDGETOPERATION._serialized_start=695
  _CAMPAIGNBUDGETOPERATION._serialized_end=986
  _MUTATECAMPAIGNBUDGETSRESPONSE._serialized_start=989
  _MUTATECAMPAIGNBUDGETSRESPONSE._serialized_end=1151
  _MUTATECAMPAIGNBUDGETRESULT._serialized_start=1154
  _MUTATECAMPAIGNBUDGETRESULT._serialized_end=1328
  _CAMPAIGNBUDGETSERVICE._serialized_start=1331
  _CAMPAIGNBUDGETSERVICE._serialized_end=1673
# @@protoc_insertion_point(module_scope)
