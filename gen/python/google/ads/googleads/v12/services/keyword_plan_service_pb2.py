# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/services/keyword_plan_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.common import keyword_plan_common_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_common_dot_keyword__plan__common__pb2
from google.ads.googleads.v12.resources import keyword_plan_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_resources_dot_keyword__plan__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n<google/ads/googleads/v12/services/keyword_plan_service.proto\x12!google.ads.googleads.v12.services\x1a\x39google/ads/googleads/v12/common/keyword_plan_common.proto\x1a\x35google/ads/googleads/v12/resources/keyword_plan.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xb7\x01\n\x19MutateKeywordPlansRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12P\n\noperations\x18\x02 \x03(\x0b\x32\x37.google.ads.googleads.v12.services.KeywordPlanOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\x97\x02\n\x14KeywordPlanOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x41\n\x06\x63reate\x18\x01 \x01(\x0b\x32/.google.ads.googleads.v12.resources.KeywordPlanH\x00\x12\x41\n\x06update\x18\x02 \x01(\x0b\x32/.google.ads.googleads.v12.resources.KeywordPlanH\x00\x12;\n\x06remove\x18\x03 \x01(\tB)\xfa\x41&\n$googleads.googleapis.com/KeywordPlanH\x00\x42\x0b\n\toperation\"\x9d\x01\n\x1aMutateKeywordPlansResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12L\n\x07results\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v12.services.MutateKeywordPlansResult\"\\\n\x18MutateKeywordPlansResult\x12@\n\rresource_name\x18\x01 \x01(\tB)\xfa\x41&\n$googleads.googleapis.com/KeywordPlan\"b\n\x1cGenerateForecastCurveRequest\x12\x42\n\x0ckeyword_plan\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$googleads.googleapis.com/KeywordPlan\"\x86\x01\n\x1dGenerateForecastCurveResponse\x12\x65\n\x18\x63\x61mpaign_forecast_curves\x18\x01 \x03(\x0b\x32\x43.google.ads.googleads.v12.services.KeywordPlanCampaignForecastCurve\"g\n!GenerateForecastTimeSeriesRequest\x12\x42\n\x0ckeyword_plan\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$googleads.googleapis.com/KeywordPlan\"\x92\x01\n\"GenerateForecastTimeSeriesResponse\x12l\n\x1cweekly_time_series_forecasts\x18\x01 \x03(\x0b\x32\x46.google.ads.googleads.v12.services.KeywordPlanWeeklyTimeSeriesForecast\"d\n\x1eGenerateForecastMetricsRequest\x12\x42\n\x0ckeyword_plan\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$googleads.googleapis.com/KeywordPlan\"\xb2\x02\n\x1fGenerateForecastMetricsResponse\x12Z\n\x12\x63\x61mpaign_forecasts\x18\x01 \x03(\x0b\x32>.google.ads.googleads.v12.services.KeywordPlanCampaignForecast\x12Y\n\x12\x61\x64_group_forecasts\x18\x02 \x03(\x0b\x32=.google.ads.googleads.v12.services.KeywordPlanAdGroupForecast\x12X\n\x11keyword_forecasts\x18\x03 \x03(\x0b\x32=.google.ads.googleads.v12.services.KeywordPlanKeywordForecast\"\xaa\x01\n\x1bKeywordPlanCampaignForecast\x12\"\n\x15keyword_plan_campaign\x18\x03 \x01(\tH\x00\x88\x01\x01\x12M\n\x11\x63\x61mpaign_forecast\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v12.services.ForecastMetricsB\x18\n\x16_keyword_plan_campaign\"\xa9\x01\n\x1aKeywordPlanAdGroupForecast\x12\"\n\x15keyword_plan_ad_group\x18\x03 \x01(\tH\x00\x88\x01\x01\x12M\n\x11\x61\x64_group_forecast\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v12.services.ForecastMetricsB\x18\n\x16_keyword_plan_ad_group\"\xb8\x01\n\x1aKeywordPlanKeywordForecast\x12*\n\x1dkeyword_plan_ad_group_keyword\x18\x03 \x01(\tH\x00\x88\x01\x01\x12L\n\x10keyword_forecast\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v12.services.ForecastMetricsB \n\x1e_keyword_plan_ad_group_keyword\"\xca\x01\n KeywordPlanCampaignForecastCurve\x12\"\n\x15keyword_plan_campaign\x18\x03 \x01(\tH\x00\x88\x01\x01\x12h\n\x1amax_cpc_bid_forecast_curve\x18\x02 \x01(\x0b\x32\x44.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecastCurveB\x18\n\x16_keyword_plan_campaign\"\x83\x01\n!KeywordPlanMaxCpcBidForecastCurve\x12^\n\x15max_cpc_bid_forecasts\x18\x01 \x03(\x0b\x32?.google.ads.googleads.v12.services.KeywordPlanMaxCpcBidForecast\"\xa8\x01\n\x1cKeywordPlanMaxCpcBidForecast\x12\x1f\n\x12max_cpc_bid_micros\x18\x03 \x01(\x03H\x00\x88\x01\x01\x12P\n\x14max_cpc_bid_forecast\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v12.services.ForecastMetricsB\x15\n\x13_max_cpc_bid_micros\"\xbb\x01\n#KeywordPlanWeeklyTimeSeriesForecast\x12\"\n\x15keyword_plan_campaign\x18\x01 \x01(\tH\x00\x88\x01\x01\x12V\n\x10weekly_forecasts\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v12.services.KeywordPlanWeeklyForecastB\x18\n\x16_keyword_plan_campaign\"\x89\x01\n\x19KeywordPlanWeeklyForecast\x12\x17\n\nstart_date\x18\x01 \x01(\tH\x00\x88\x01\x01\x12\x44\n\x08\x66orecast\x18\x02 \x01(\x0b\x32\x32.google.ads.googleads.v12.services.ForecastMetricsB\r\n\x0b_start_date\"\xc9\x01\n\x0f\x46orecastMetrics\x12\x18\n\x0bimpressions\x18\x07 \x01(\x01H\x00\x88\x01\x01\x12\x10\n\x03\x63tr\x18\x08 \x01(\x01H\x01\x88\x01\x01\x12\x18\n\x0b\x61verage_cpc\x18\t \x01(\x03H\x02\x88\x01\x01\x12\x13\n\x06\x63licks\x18\n \x01(\x01H\x03\x88\x01\x01\x12\x18\n\x0b\x63ost_micros\x18\x0b \x01(\x03H\x04\x88\x01\x01\x42\x0e\n\x0c_impressionsB\x06\n\x04_ctrB\x0e\n\x0c_average_cpcB\t\n\x07_clicksB\x0e\n\x0c_cost_micros\"\x9e\x02\n GenerateHistoricalMetricsRequest\x12\x42\n\x0ckeyword_plan\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$googleads.googleapis.com/KeywordPlan\x12W\n\x11\x61ggregate_metrics\x18\x02 \x01(\x0b\x32<.google.ads.googleads.v12.common.KeywordPlanAggregateMetrics\x12]\n\x1ahistorical_metrics_options\x18\x03 \x01(\x0b\x32\x39.google.ads.googleads.v12.common.HistoricalMetricsOptions\"\xe2\x01\n!GenerateHistoricalMetricsResponse\x12W\n\x07metrics\x18\x01 \x03(\x0b\x32\x46.google.ads.googleads.v12.services.KeywordPlanKeywordHistoricalMetrics\x12\x64\n\x18\x61ggregate_metric_results\x18\x02 \x01(\x0b\x32\x42.google.ads.googleads.v12.common.KeywordPlanAggregateMetricResults\"\xc1\x01\n#KeywordPlanKeywordHistoricalMetrics\x12\x19\n\x0csearch_query\x18\x04 \x01(\tH\x00\x88\x01\x01\x12\x16\n\x0e\x63lose_variants\x18\x03 \x03(\t\x12V\n\x0fkeyword_metrics\x18\x02 \x01(\x0b\x32=.google.ads.googleads.v12.common.KeywordPlanHistoricalMetricsB\x0f\n\r_search_query2\xe7\n\n\x12KeywordPlanService\x12\xe9\x01\n\x12MutateKeywordPlans\x12<.google.ads.googleads.v12.services.MutateKeywordPlansRequest\x1a=.google.ads.googleads.v12.services.MutateKeywordPlansResponse\"V\x82\xd3\xe4\x93\x02\x37\"2/v12/customers/{customer_id=*}/keywordPlans:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x12\xfa\x01\n\x15GenerateForecastCurve\x12?.google.ads.googleads.v12.services.GenerateForecastCurveRequest\x1a@.google.ads.googleads.v12.services.GenerateForecastCurveResponse\"^\x82\xd3\xe4\x93\x02I\"D/v12/{keyword_plan=customers/*/keywordPlans/*}:generateForecastCurve:\x01*\xda\x41\x0ckeyword_plan\x12\x8e\x02\n\x1aGenerateForecastTimeSeries\x12\x44.google.ads.googleads.v12.services.GenerateForecastTimeSeriesRequest\x1a\x45.google.ads.googleads.v12.services.GenerateForecastTimeSeriesResponse\"c\x82\xd3\xe4\x93\x02N\"I/v12/{keyword_plan=customers/*/keywordPlans/*}:generateForecastTimeSeries:\x01*\xda\x41\x0ckeyword_plan\x12\x82\x02\n\x17GenerateForecastMetrics\x12\x41.google.ads.googleads.v12.services.GenerateForecastMetricsRequest\x1a\x42.google.ads.googleads.v12.services.GenerateForecastMetricsResponse\"`\x82\xd3\xe4\x93\x02K\"F/v12/{keyword_plan=customers/*/keywordPlans/*}:generateForecastMetrics:\x01*\xda\x41\x0ckeyword_plan\x12\x8a\x02\n\x19GenerateHistoricalMetrics\x12\x43.google.ads.googleads.v12.services.GenerateHistoricalMetricsRequest\x1a\x44.google.ads.googleads.v12.services.GenerateHistoricalMetricsResponse\"b\x82\xd3\xe4\x93\x02M\"H/v12/{keyword_plan=customers/*/keywordPlans/*}:generateHistoricalMetrics:\x01*\xda\x41\x0ckeyword_plan\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x83\x02\n%com.google.ads.googleads.v12.servicesB\x17KeywordPlanServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V12.Services\xca\x02!Google\\Ads\\GoogleAds\\V12\\Services\xea\x02%Google::Ads::GoogleAds::V12::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.services.keyword_plan_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v12.servicesB\027KeywordPlanServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Services\312\002!Google\\Ads\\GoogleAds\\V12\\Services\352\002%Google::Ads::GoogleAds::V12::Services'
  _MUTATEKEYWORDPLANSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEKEYWORDPLANSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEKEYWORDPLANSREQUEST.fields_by_name['operations']._options = None
  _MUTATEKEYWORDPLANSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _KEYWORDPLANOPERATION.fields_by_name['remove']._options = None
  _KEYWORDPLANOPERATION.fields_by_name['remove']._serialized_options = b'\372A&\n$googleads.googleapis.com/KeywordPlan'
  _MUTATEKEYWORDPLANSRESULT.fields_by_name['resource_name']._options = None
  _MUTATEKEYWORDPLANSRESULT.fields_by_name['resource_name']._serialized_options = b'\372A&\n$googleads.googleapis.com/KeywordPlan'
  _GENERATEFORECASTCURVEREQUEST.fields_by_name['keyword_plan']._options = None
  _GENERATEFORECASTCURVEREQUEST.fields_by_name['keyword_plan']._serialized_options = b'\340A\002\372A&\n$googleads.googleapis.com/KeywordPlan'
  _GENERATEFORECASTTIMESERIESREQUEST.fields_by_name['keyword_plan']._options = None
  _GENERATEFORECASTTIMESERIESREQUEST.fields_by_name['keyword_plan']._serialized_options = b'\340A\002\372A&\n$googleads.googleapis.com/KeywordPlan'
  _GENERATEFORECASTMETRICSREQUEST.fields_by_name['keyword_plan']._options = None
  _GENERATEFORECASTMETRICSREQUEST.fields_by_name['keyword_plan']._serialized_options = b'\340A\002\372A&\n$googleads.googleapis.com/KeywordPlan'
  _GENERATEHISTORICALMETRICSREQUEST.fields_by_name['keyword_plan']._options = None
  _GENERATEHISTORICALMETRICSREQUEST.fields_by_name['keyword_plan']._serialized_options = b'\340A\002\372A&\n$googleads.googleapis.com/KeywordPlan'
  _KEYWORDPLANSERVICE._options = None
  _KEYWORDPLANSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _KEYWORDPLANSERVICE.methods_by_name['MutateKeywordPlans']._options = None
  _KEYWORDPLANSERVICE.methods_by_name['MutateKeywordPlans']._serialized_options = b'\202\323\344\223\0027\"2/v12/customers/{customer_id=*}/keywordPlans:mutate:\001*\332A\026customer_id,operations'
  _KEYWORDPLANSERVICE.methods_by_name['GenerateForecastCurve']._options = None
  _KEYWORDPLANSERVICE.methods_by_name['GenerateForecastCurve']._serialized_options = b'\202\323\344\223\002I\"D/v12/{keyword_plan=customers/*/keywordPlans/*}:generateForecastCurve:\001*\332A\014keyword_plan'
  _KEYWORDPLANSERVICE.methods_by_name['GenerateForecastTimeSeries']._options = None
  _KEYWORDPLANSERVICE.methods_by_name['GenerateForecastTimeSeries']._serialized_options = b'\202\323\344\223\002N\"I/v12/{keyword_plan=customers/*/keywordPlans/*}:generateForecastTimeSeries:\001*\332A\014keyword_plan'
  _KEYWORDPLANSERVICE.methods_by_name['GenerateForecastMetrics']._options = None
  _KEYWORDPLANSERVICE.methods_by_name['GenerateForecastMetrics']._serialized_options = b'\202\323\344\223\002K\"F/v12/{keyword_plan=customers/*/keywordPlans/*}:generateForecastMetrics:\001*\332A\014keyword_plan'
  _KEYWORDPLANSERVICE.methods_by_name['GenerateHistoricalMetrics']._options = None
  _KEYWORDPLANSERVICE.methods_by_name['GenerateHistoricalMetrics']._serialized_options = b'\202\323\344\223\002M\"H/v12/{keyword_plan=customers/*/keywordPlans/*}:generateHistoricalMetrics:\001*\332A\014keyword_plan'
  _MUTATEKEYWORDPLANSREQUEST._serialized_start=388
  _MUTATEKEYWORDPLANSREQUEST._serialized_end=571
  _KEYWORDPLANOPERATION._serialized_start=574
  _KEYWORDPLANOPERATION._serialized_end=853
  _MUTATEKEYWORDPLANSRESPONSE._serialized_start=856
  _MUTATEKEYWORDPLANSRESPONSE._serialized_end=1013
  _MUTATEKEYWORDPLANSRESULT._serialized_start=1015
  _MUTATEKEYWORDPLANSRESULT._serialized_end=1107
  _GENERATEFORECASTCURVEREQUEST._serialized_start=1109
  _GENERATEFORECASTCURVEREQUEST._serialized_end=1207
  _GENERATEFORECASTCURVERESPONSE._serialized_start=1210
  _GENERATEFORECASTCURVERESPONSE._serialized_end=1344
  _GENERATEFORECASTTIMESERIESREQUEST._serialized_start=1346
  _GENERATEFORECASTTIMESERIESREQUEST._serialized_end=1449
  _GENERATEFORECASTTIMESERIESRESPONSE._serialized_start=1452
  _GENERATEFORECASTTIMESERIESRESPONSE._serialized_end=1598
  _GENERATEFORECASTMETRICSREQUEST._serialized_start=1600
  _GENERATEFORECASTMETRICSREQUEST._serialized_end=1700
  _GENERATEFORECASTMETRICSRESPONSE._serialized_start=1703
  _GENERATEFORECASTMETRICSRESPONSE._serialized_end=2009
  _KEYWORDPLANCAMPAIGNFORECAST._serialized_start=2012
  _KEYWORDPLANCAMPAIGNFORECAST._serialized_end=2182
  _KEYWORDPLANADGROUPFORECAST._serialized_start=2185
  _KEYWORDPLANADGROUPFORECAST._serialized_end=2354
  _KEYWORDPLANKEYWORDFORECAST._serialized_start=2357
  _KEYWORDPLANKEYWORDFORECAST._serialized_end=2541
  _KEYWORDPLANCAMPAIGNFORECASTCURVE._serialized_start=2544
  _KEYWORDPLANCAMPAIGNFORECASTCURVE._serialized_end=2746
  _KEYWORDPLANMAXCPCBIDFORECASTCURVE._serialized_start=2749
  _KEYWORDPLANMAXCPCBIDFORECASTCURVE._serialized_end=2880
  _KEYWORDPLANMAXCPCBIDFORECAST._serialized_start=2883
  _KEYWORDPLANMAXCPCBIDFORECAST._serialized_end=3051
  _KEYWORDPLANWEEKLYTIMESERIESFORECAST._serialized_start=3054
  _KEYWORDPLANWEEKLYTIMESERIESFORECAST._serialized_end=3241
  _KEYWORDPLANWEEKLYFORECAST._serialized_start=3244
  _KEYWORDPLANWEEKLYFORECAST._serialized_end=3381
  _FORECASTMETRICS._serialized_start=3384
  _FORECASTMETRICS._serialized_end=3585
  _GENERATEHISTORICALMETRICSREQUEST._serialized_start=3588
  _GENERATEHISTORICALMETRICSREQUEST._serialized_end=3874
  _GENERATEHISTORICALMETRICSRESPONSE._serialized_start=3877
  _GENERATEHISTORICALMETRICSRESPONSE._serialized_end=4103
  _KEYWORDPLANKEYWORDHISTORICALMETRICS._serialized_start=4106
  _KEYWORDPLANKEYWORDHISTORICALMETRICS._serialized_end=4299
  _KEYWORDPLANSERVICE._serialized_start=4302
  _KEYWORDPLANSERVICE._serialized_end=5685
# @@protoc_insertion_point(module_scope)