# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/keyword_plan_campaign_keyword_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.resources import keyword_plan_campaign_keyword_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_keyword__plan__campaign__keyword__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nMgoogle/ads/googleads/v10/services/keyword_plan_campaign_keyword_service.proto\x12!google.ads.googleads.v10.services\x1a\x46google/ads/googleads/v10/resources/keyword_plan_campaign_keyword.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xd5\x01\n(MutateKeywordPlanCampaignKeywordsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12_\n\noperations\x18\x02 \x03(\x0b\x32\x46.google.ads.googleads.v10.services.KeywordPlanCampaignKeywordOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xd3\x02\n#KeywordPlanCampaignKeywordOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12P\n\x06\x63reate\x18\x01 \x01(\x0b\x32>.google.ads.googleads.v10.resources.KeywordPlanCampaignKeywordH\x00\x12P\n\x06update\x18\x02 \x01(\x0b\x32>.google.ads.googleads.v10.resources.KeywordPlanCampaignKeywordH\x00\x12J\n\x06remove\x18\x03 \x01(\tB8\xfa\x41\x35\n3googleads.googleapis.com/KeywordPlanCampaignKeywordH\x00\x42\x0b\n\toperation\"\xba\x01\n)MutateKeywordPlanCampaignKeywordsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Z\n\x07results\x18\x02 \x03(\x0b\x32I.google.ads.googleads.v10.services.MutateKeywordPlanCampaignKeywordResult\"y\n&MutateKeywordPlanCampaignKeywordResult\x12O\n\rresource_name\x18\x01 \x01(\tB8\xfa\x41\x35\n3googleads.googleapis.com/KeywordPlanCampaignKeyword2\x92\x03\n!KeywordPlanCampaignKeywordService\x12\xa5\x02\n!MutateKeywordPlanCampaignKeywords\x12K.google.ads.googleads.v10.services.MutateKeywordPlanCampaignKeywordsRequest\x1aL.google.ads.googleads.v10.services.MutateKeywordPlanCampaignKeywordsResponse\"e\x82\xd3\xe4\x93\x02\x46\"A/v10/customers/{customer_id=*}/keywordPlanCampaignKeywords:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x92\x02\n%com.google.ads.googleads.v10.servicesB&KeywordPlanCampaignKeywordServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.keyword_plan_campaign_keyword_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB&KeywordPlanCampaignKeywordServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['operations']._options = None
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['remove']._options = None
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION.fields_by_name['remove']._serialized_options = b'\372A5\n3googleads.googleapis.com/KeywordPlanCampaignKeyword'
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT.fields_by_name['resource_name']._options = None
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT.fields_by_name['resource_name']._serialized_options = b'\372A5\n3googleads.googleapis.com/KeywordPlanCampaignKeyword'
  _KEYWORDPLANCAMPAIGNKEYWORDSERVICE._options = None
  _KEYWORDPLANCAMPAIGNKEYWORDSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _KEYWORDPLANCAMPAIGNKEYWORDSERVICE.methods_by_name['MutateKeywordPlanCampaignKeywords']._options = None
  _KEYWORDPLANCAMPAIGNKEYWORDSERVICE.methods_by_name['MutateKeywordPlanCampaignKeywords']._serialized_options = b'\202\323\344\223\002F\"A/v10/customers/{customer_id=*}/keywordPlanCampaignKeywords:mutate:\001*\332A\026customer_id,operations'
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST._serialized_start=363
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSREQUEST._serialized_end=576
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION._serialized_start=579
  _KEYWORDPLANCAMPAIGNKEYWORDOPERATION._serialized_end=918
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE._serialized_start=921
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDSRESPONSE._serialized_end=1107
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT._serialized_start=1109
  _MUTATEKEYWORDPLANCAMPAIGNKEYWORDRESULT._serialized_end=1230
  _KEYWORDPLANCAMPAIGNKEYWORDSERVICE._serialized_start=1233
  _KEYWORDPLANCAMPAIGNKEYWORDSERVICE._serialized_end=1635
# @@protoc_insertion_point(module_scope)