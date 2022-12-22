# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/keyword_plan_idea_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import keyword_plan_common_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_keyword__plan__common__pb2
from google.ads.googleads.v11.enums import keyword_match_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_keyword__match__type__pb2
from google.ads.googleads.v11.enums import keyword_plan_keyword_annotation_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_keyword__plan__keyword__annotation__pb2
from google.ads.googleads.v11.enums import keyword_plan_network_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_keyword__plan__network__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nAgoogle/ads/googleads/v11/services/keyword_plan_idea_service.proto\x12!google.ads.googleads.v11.services\x1a\x39google/ads/googleads/v11/common/keyword_plan_common.proto\x1a\x37google/ads/googleads/v11/enums/keyword_match_type.proto\x1a\x44google/ads/googleads/v11/enums/keyword_plan_keyword_annotation.proto\x1a\x39google/ads/googleads/v11/enums/keyword_plan_network.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\"\xff\x06\n\x1bGenerateKeywordIdeasRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x15\n\x08language\x18\x0e \x01(\tH\x01\x88\x01\x01\x12\x1c\n\x14geo_target_constants\x18\x0f \x03(\t\x12\x1e\n\x16include_adult_keywords\x18\n \x01(\x08\x12\x12\n\npage_token\x18\x0c \x01(\t\x12\x11\n\tpage_size\x18\r \x01(\x05\x12g\n\x14keyword_plan_network\x18\t \x01(\x0e\x32I.google.ads.googleads.v11.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork\x12y\n\x12keyword_annotation\x18\x11 \x03(\x0e\x32].google.ads.googleads.v11.enums.KeywordPlanKeywordAnnotationEnum.KeywordPlanKeywordAnnotation\x12W\n\x11\x61ggregate_metrics\x18\x10 \x01(\x0b\x32<.google.ads.googleads.v11.common.KeywordPlanAggregateMetrics\x12]\n\x1ahistorical_metrics_options\x18\x12 \x01(\x0b\x32\x39.google.ads.googleads.v11.common.HistoricalMetricsOptions\x12T\n\x14keyword_and_url_seed\x18\x02 \x01(\x0b\x32\x34.google.ads.googleads.v11.services.KeywordAndUrlSeedH\x00\x12\x46\n\x0ckeyword_seed\x18\x03 \x01(\x0b\x32..google.ads.googleads.v11.services.KeywordSeedH\x00\x12>\n\x08url_seed\x18\x05 \x01(\x0b\x32*.google.ads.googleads.v11.services.UrlSeedH\x00\x12@\n\tsite_seed\x18\x0b \x01(\x0b\x32+.google.ads.googleads.v11.services.SiteSeedH\x00\x42\x06\n\x04seedB\x0b\n\t_language\"?\n\x11KeywordAndUrlSeed\x12\x10\n\x03url\x18\x03 \x01(\tH\x00\x88\x01\x01\x12\x10\n\x08keywords\x18\x04 \x03(\tB\x06\n\x04_url\"\x1f\n\x0bKeywordSeed\x12\x10\n\x08keywords\x18\x02 \x03(\t\"&\n\x08SiteSeed\x12\x11\n\x04site\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x07\n\x05_site\"#\n\x07UrlSeed\x12\x10\n\x03url\x18\x02 \x01(\tH\x00\x88\x01\x01\x42\x06\n\x04_url\"\xff\x01\n\x1bGenerateKeywordIdeaResponse\x12M\n\x07results\x18\x01 \x03(\x0b\x32<.google.ads.googleads.v11.services.GenerateKeywordIdeaResult\x12\x64\n\x18\x61ggregate_metric_results\x18\x04 \x01(\x0b\x32\x42.google.ads.googleads.v11.common.KeywordPlanAggregateMetricResults\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x12\n\ntotal_size\x18\x03 \x01(\x03\"\xfe\x01\n\x19GenerateKeywordIdeaResult\x12\x11\n\x04text\x18\x05 \x01(\tH\x00\x88\x01\x01\x12[\n\x14keyword_idea_metrics\x18\x03 \x01(\x0b\x32=.google.ads.googleads.v11.common.KeywordPlanHistoricalMetrics\x12P\n\x13keyword_annotations\x18\x06 \x01(\x0b\x32\x33.google.ads.googleads.v11.common.KeywordAnnotations\x12\x16\n\x0e\x63lose_variants\x18\x07 \x03(\tB\x07\n\x05_text\"\xd3\x03\n\'GenerateKeywordHistoricalMetricsRequest\x12\x13\n\x0b\x63ustomer_id\x18\x01 \x01(\t\x12\x10\n\x08keywords\x18\x02 \x03(\t\x12\x15\n\x08language\x18\x04 \x01(\tH\x00\x88\x01\x01\x12\x1e\n\x16include_adult_keywords\x18\x05 \x01(\x08\x12\x1c\n\x14geo_target_constants\x18\x06 \x03(\t\x12g\n\x14keyword_plan_network\x18\x07 \x01(\x0e\x32I.google.ads.googleads.v11.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork\x12W\n\x11\x61ggregate_metrics\x18\x08 \x01(\x0b\x32<.google.ads.googleads.v11.common.KeywordPlanAggregateMetrics\x12]\n\x1ahistorical_metrics_options\x18\x03 \x01(\x0b\x32\x39.google.ads.googleads.v11.common.HistoricalMetricsOptionsB\x0b\n\t_language\"\xec\x01\n(GenerateKeywordHistoricalMetricsResponse\x12Z\n\x07results\x18\x01 \x03(\x0b\x32I.google.ads.googleads.v11.services.GenerateKeywordHistoricalMetricsResult\x12\x64\n\x18\x61ggregate_metric_results\x18\x02 \x01(\x0b\x32\x42.google.ads.googleads.v11.common.KeywordPlanAggregateMetricResults\"\xb4\x01\n&GenerateKeywordHistoricalMetricsResult\x12\x11\n\x04text\x18\x01 \x01(\tH\x00\x88\x01\x01\x12\x16\n\x0e\x63lose_variants\x18\x03 \x03(\t\x12V\n\x0fkeyword_metrics\x18\x02 \x01(\x0b\x32=.google.ads.googleads.v11.common.KeywordPlanHistoricalMetricsB\x07\n\x05_text\"g\n\x1cGenerateAdGroupThemesRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\x08keywords\x18\x02 \x03(\tB\x03\xe0\x41\x02\x12\x16\n\tad_groups\x18\x03 \x03(\tB\x03\xe0\x41\x02\"\xd2\x01\n\x1dGenerateAdGroupThemesResponse\x12\x61\n\x1c\x61\x64_group_keyword_suggestions\x18\x01 \x03(\x0b\x32;.google.ads.googleads.v11.services.AdGroupKeywordSuggestion\x12N\n\x12unusable_ad_groups\x18\x02 \x03(\x0b\x32\x32.google.ads.googleads.v11.services.UnusableAdGroup\"\xed\x01\n\x18\x41\x64GroupKeywordSuggestion\x12\x14\n\x0ckeyword_text\x18\x01 \x01(\t\x12\x1e\n\x16suggested_keyword_text\x18\x02 \x01(\t\x12\x63\n\x14suggested_match_type\x18\x03 \x01(\x0e\x32\x45.google.ads.googleads.v11.enums.KeywordMatchTypeEnum.KeywordMatchType\x12\x1a\n\x12suggested_ad_group\x18\x04 \x01(\t\x12\x1a\n\x12suggested_campaign\x18\x05 \x01(\t\"5\n\x0fUnusableAdGroup\x12\x10\n\x08\x61\x64_group\x18\x01 \x01(\t\x12\x10\n\x08\x63\x61mpaign\x18\x02 \x01(\t2\xa0\x06\n\x16KeywordPlanIdeaService\x12\xd6\x01\n\x14GenerateKeywordIdeas\x12>.google.ads.googleads.v11.services.GenerateKeywordIdeasRequest\x1a>.google.ads.googleads.v11.services.GenerateKeywordIdeaResponse\">\x82\xd3\xe4\x93\x02\x38\"3/v11/customers/{customer_id=*}:generateKeywordIdeas:\x01*\x12\x87\x02\n GenerateKeywordHistoricalMetrics\x12J.google.ads.googleads.v11.services.GenerateKeywordHistoricalMetricsRequest\x1aK.google.ads.googleads.v11.services.GenerateKeywordHistoricalMetricsResponse\"J\x82\xd3\xe4\x93\x02\x44\"?/v11/customers/{customer_id=*}:generateKeywordHistoricalMetrics:\x01*\x12\xdb\x01\n\x15GenerateAdGroupThemes\x12?.google.ads.googleads.v11.services.GenerateAdGroupThemesRequest\x1a@.google.ads.googleads.v11.services.GenerateAdGroupThemesResponse\"?\x82\xd3\xe4\x93\x02\x39\"4/v11/customers/{customer_id=*}:generateAdGroupThemes:\x01*\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x87\x02\n%com.google.ads.googleads.v11.servicesB\x1bKeywordPlanIdeaServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.keyword_plan_idea_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\033KeywordPlanIdeaServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _GENERATEADGROUPTHEMESREQUEST.fields_by_name['customer_id']._options = None
  _GENERATEADGROUPTHEMESREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _GENERATEADGROUPTHEMESREQUEST.fields_by_name['keywords']._options = None
  _GENERATEADGROUPTHEMESREQUEST.fields_by_name['keywords']._serialized_options = b'\340A\002'
  _GENERATEADGROUPTHEMESREQUEST.fields_by_name['ad_groups']._options = None
  _GENERATEADGROUPTHEMESREQUEST.fields_by_name['ad_groups']._serialized_options = b'\340A\002'
  _KEYWORDPLANIDEASERVICE._options = None
  _KEYWORDPLANIDEASERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _KEYWORDPLANIDEASERVICE.methods_by_name['GenerateKeywordIdeas']._options = None
  _KEYWORDPLANIDEASERVICE.methods_by_name['GenerateKeywordIdeas']._serialized_options = b'\202\323\344\223\0028\"3/v11/customers/{customer_id=*}:generateKeywordIdeas:\001*'
  _KEYWORDPLANIDEASERVICE.methods_by_name['GenerateKeywordHistoricalMetrics']._options = None
  _KEYWORDPLANIDEASERVICE.methods_by_name['GenerateKeywordHistoricalMetrics']._serialized_options = b'\202\323\344\223\002D\"?/v11/customers/{customer_id=*}:generateKeywordHistoricalMetrics:\001*'
  _KEYWORDPLANIDEASERVICE.methods_by_name['GenerateAdGroupThemes']._options = None
  _KEYWORDPLANIDEASERVICE.methods_by_name['GenerateAdGroupThemes']._serialized_options = b'\202\323\344\223\0029\"4/v11/customers/{customer_id=*}:generateAdGroupThemes:\001*'
  _GENERATEKEYWORDIDEASREQUEST._serialized_start=438
  _GENERATEKEYWORDIDEASREQUEST._serialized_end=1333
  _KEYWORDANDURLSEED._serialized_start=1335
  _KEYWORDANDURLSEED._serialized_end=1398
  _KEYWORDSEED._serialized_start=1400
  _KEYWORDSEED._serialized_end=1431
  _SITESEED._serialized_start=1433
  _SITESEED._serialized_end=1471
  _URLSEED._serialized_start=1473
  _URLSEED._serialized_end=1508
  _GENERATEKEYWORDIDEARESPONSE._serialized_start=1511
  _GENERATEKEYWORDIDEARESPONSE._serialized_end=1766
  _GENERATEKEYWORDIDEARESULT._serialized_start=1769
  _GENERATEKEYWORDIDEARESULT._serialized_end=2023
  _GENERATEKEYWORDHISTORICALMETRICSREQUEST._serialized_start=2026
  _GENERATEKEYWORDHISTORICALMETRICSREQUEST._serialized_end=2493
  _GENERATEKEYWORDHISTORICALMETRICSRESPONSE._serialized_start=2496
  _GENERATEKEYWORDHISTORICALMETRICSRESPONSE._serialized_end=2732
  _GENERATEKEYWORDHISTORICALMETRICSRESULT._serialized_start=2735
  _GENERATEKEYWORDHISTORICALMETRICSRESULT._serialized_end=2915
  _GENERATEADGROUPTHEMESREQUEST._serialized_start=2917
  _GENERATEADGROUPTHEMESREQUEST._serialized_end=3020
  _GENERATEADGROUPTHEMESRESPONSE._serialized_start=3023
  _GENERATEADGROUPTHEMESRESPONSE._serialized_end=3233
  _ADGROUPKEYWORDSUGGESTION._serialized_start=3236
  _ADGROUPKEYWORDSUGGESTION._serialized_end=3473
  _UNUSABLEADGROUP._serialized_start=3475
  _UNUSABLEADGROUP._serialized_end=3528
  _KEYWORDPLANIDEASERVICE._serialized_start=3531
  _KEYWORDPLANIDEASERVICE._serialized_end=4331
# @@protoc_insertion_point(module_scope)