# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/keyword_plan_ad_group_keyword_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.resources import keyword_plan_ad_group_keyword_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_keyword__plan__ad__group__keyword__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nMgoogle/ads/googleads/v10/services/keyword_plan_ad_group_keyword_service.proto\x12!google.ads.googleads.v10.services\x1a\x46google/ads/googleads/v10/resources/keyword_plan_ad_group_keyword.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xd3\x01\n\'MutateKeywordPlanAdGroupKeywordsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12^\n\noperations\x18\x02 \x03(\x0b\x32\x45.google.ads.googleads.v10.services.KeywordPlanAdGroupKeywordOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xcf\x02\n\"KeywordPlanAdGroupKeywordOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12O\n\x06\x63reate\x18\x01 \x01(\x0b\x32=.google.ads.googleads.v10.resources.KeywordPlanAdGroupKeywordH\x00\x12O\n\x06update\x18\x02 \x01(\x0b\x32=.google.ads.googleads.v10.resources.KeywordPlanAdGroupKeywordH\x00\x12I\n\x06remove\x18\x03 \x01(\tB7\xfa\x41\x34\n2googleads.googleapis.com/KeywordPlanAdGroupKeywordH\x00\x42\x0b\n\toperation\"\xb8\x01\n(MutateKeywordPlanAdGroupKeywordsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Y\n\x07results\x18\x02 \x03(\x0b\x32H.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupKeywordResult\"w\n%MutateKeywordPlanAdGroupKeywordResult\x12N\n\rresource_name\x18\x01 \x01(\tB7\xfa\x41\x34\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword2\x8d\x03\n KeywordPlanAdGroupKeywordService\x12\xa1\x02\n MutateKeywordPlanAdGroupKeywords\x12J.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupKeywordsRequest\x1aK.google.ads.googleads.v10.services.MutateKeywordPlanAdGroupKeywordsResponse\"d\x82\xd3\xe4\x93\x02\x45\"@/v10/customers/{customer_id=*}/keywordPlanAdGroupKeywords:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x91\x02\n%com.google.ads.googleads.v10.servicesB%KeywordPlanAdGroupKeywordServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.keyword_plan_ad_group_keyword_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB%KeywordPlanAdGroupKeywordServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEKEYWORDPLANADGROUPKEYWORDSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEKEYWORDPLANADGROUPKEYWORDSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEKEYWORDPLANADGROUPKEYWORDSREQUEST.fields_by_name['operations']._options = None
  _MUTATEKEYWORDPLANADGROUPKEYWORDSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _KEYWORDPLANADGROUPKEYWORDOPERATION.fields_by_name['remove']._options = None
  _KEYWORDPLANADGROUPKEYWORDOPERATION.fields_by_name['remove']._serialized_options = b'\372A4\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword'
  _MUTATEKEYWORDPLANADGROUPKEYWORDRESULT.fields_by_name['resource_name']._options = None
  _MUTATEKEYWORDPLANADGROUPKEYWORDRESULT.fields_by_name['resource_name']._serialized_options = b'\372A4\n2googleads.googleapis.com/KeywordPlanAdGroupKeyword'
  _KEYWORDPLANADGROUPKEYWORDSERVICE._options = None
  _KEYWORDPLANADGROUPKEYWORDSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _KEYWORDPLANADGROUPKEYWORDSERVICE.methods_by_name['MutateKeywordPlanAdGroupKeywords']._options = None
  _KEYWORDPLANADGROUPKEYWORDSERVICE.methods_by_name['MutateKeywordPlanAdGroupKeywords']._serialized_options = b'\202\323\344\223\002E\"@/v10/customers/{customer_id=*}/keywordPlanAdGroupKeywords:mutate:\001*\332A\026customer_id,operations'
  _MUTATEKEYWORDPLANADGROUPKEYWORDSREQUEST._serialized_start=363
  _MUTATEKEYWORDPLANADGROUPKEYWORDSREQUEST._serialized_end=574
  _KEYWORDPLANADGROUPKEYWORDOPERATION._serialized_start=577
  _KEYWORDPLANADGROUPKEYWORDOPERATION._serialized_end=912
  _MUTATEKEYWORDPLANADGROUPKEYWORDSRESPONSE._serialized_start=915
  _MUTATEKEYWORDPLANADGROUPKEYWORDSRESPONSE._serialized_end=1099
  _MUTATEKEYWORDPLANADGROUPKEYWORDRESULT._serialized_start=1101
  _MUTATEKEYWORDPLANADGROUPKEYWORDRESULT._serialized_end=1220
  _KEYWORDPLANADGROUPKEYWORDSERVICE._serialized_start=1223
  _KEYWORDPLANADGROUPKEYWORDSERVICE._serialized_end=1620
# @@protoc_insertion_point(module_scope)