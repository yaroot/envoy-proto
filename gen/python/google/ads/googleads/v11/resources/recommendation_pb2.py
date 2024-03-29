# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/recommendation.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_criteria__pb2
from google.ads.googleads.v11.common import extensions_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_extensions__pb2
from google.ads.googleads.v11.enums import keyword_match_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_keyword__match__type__pb2
from google.ads.googleads.v11.enums import recommendation_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_recommendation__type__pb2
from google.ads.googleads.v11.enums import target_cpa_opt_in_recommendation_goal_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_target__cpa__opt__in__recommendation__goal__pb2
from google.ads.googleads.v11.resources import ad_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_ad__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7google/ads/googleads/v11/resources/recommendation.proto\x12\"google.ads.googleads.v11.resources\x1a.google/ads/googleads/v11/common/criteria.proto\x1a\x30google/ads/googleads/v11/common/extensions.proto\x1a\x37google/ads/googleads/v11/enums/keyword_match_type.proto\x1a\x38google/ads/googleads/v11/enums/recommendation_type.proto\x1aJgoogle/ads/googleads/v11/enums/target_cpa_opt_in_recommendation_goal.proto\x1a+google/ads/googleads/v11/resources/ad.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x90\x42\n\x0eRecommendation\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x05\xfa\x41)\n\'googleads.googleapis.com/Recommendation\x12\\\n\x04type\x18\x02 \x01(\x0e\x32I.google.ads.googleads.v11.enums.RecommendationTypeEnum.RecommendationTypeB\x03\xe0\x41\x03\x12\\\n\x06impact\x18\x03 \x01(\x0b\x32G.google.ads.googleads.v11.resources.Recommendation.RecommendationImpactB\x03\xe0\x41\x03\x12M\n\x0f\x63\x61mpaign_budget\x18\x18 \x01(\tB/\xe0\x41\x03\xfa\x41)\n\'googleads.googleapis.com/CampaignBudgetH\x01\x88\x01\x01\x12@\n\x08\x63\x61mpaign\x18\x19 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CampaignH\x02\x88\x01\x01\x12?\n\x08\x61\x64_group\x18\x1a \x01(\tB(\xe0\x41\x03\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x03\x88\x01\x01\x12\x1b\n\tdismissed\x18\x1b \x01(\x08\x42\x03\xe0\x41\x03H\x04\x88\x01\x01\x12~\n\x1e\x63\x61mpaign_budget_recommendation\x18\x04 \x01(\x0b\x32O.google.ads.googleads.v11.resources.Recommendation.CampaignBudgetRecommendationB\x03\xe0\x41\x03H\x00\x12\x8a\x01\n*forecasting_campaign_budget_recommendation\x18\x16 \x01(\x0b\x32O.google.ads.googleads.v11.resources.Recommendation.CampaignBudgetRecommendationB\x03\xe0\x41\x03H\x00\x12o\n\x16keyword_recommendation\x18\x08 \x01(\x0b\x32H.google.ads.googleads.v11.resources.Recommendation.KeywordRecommendationB\x03\xe0\x41\x03H\x00\x12n\n\x16text_ad_recommendation\x18\t \x01(\x0b\x32G.google.ads.googleads.v11.resources.Recommendation.TextAdRecommendationB\x03\xe0\x41\x03H\x00\x12\x80\x01\n target_cpa_opt_in_recommendation\x18\n \x01(\x0b\x32O.google.ads.googleads.v11.resources.Recommendation.TargetCpaOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\x94\x01\n*maximize_conversions_opt_in_recommendation\x18\x0b \x01(\x0b\x32Y.google.ads.googleads.v11.resources.Recommendation.MaximizeConversionsOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\x84\x01\n\"enhanced_cpc_opt_in_recommendation\x18\x0c \x01(\x0b\x32Q.google.ads.googleads.v11.resources.Recommendation.EnhancedCpcOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\x8a\x01\n%search_partners_opt_in_recommendation\x18\x0e \x01(\x0b\x32T.google.ads.googleads.v11.resources.Recommendation.SearchPartnersOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\x8a\x01\n%maximize_clicks_opt_in_recommendation\x18\x0f \x01(\x0b\x32T.google.ads.googleads.v11.resources.Recommendation.MaximizeClicksOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\x87\x01\n#optimize_ad_rotation_recommendation\x18\x10 \x01(\x0b\x32S.google.ads.googleads.v11.resources.Recommendation.OptimizeAdRotationRecommendationB\x03\xe0\x41\x03H\x00\x12\x82\x01\n callout_extension_recommendation\x18\x11 \x01(\x0b\x32Q.google.ads.googleads.v11.resources.Recommendation.CalloutExtensionRecommendationB\x03\xe0\x41\x03H\x00\x12\x84\x01\n!sitelink_extension_recommendation\x18\x12 \x01(\x0b\x32R.google.ads.googleads.v11.resources.Recommendation.SitelinkExtensionRecommendationB\x03\xe0\x41\x03H\x00\x12|\n\x1d\x63\x61ll_extension_recommendation\x18\x13 \x01(\x0b\x32N.google.ads.googleads.v11.resources.Recommendation.CallExtensionRecommendationB\x03\xe0\x41\x03H\x00\x12\x83\x01\n!keyword_match_type_recommendation\x18\x14 \x01(\x0b\x32Q.google.ads.googleads.v11.resources.Recommendation.KeywordMatchTypeRecommendationB\x03\xe0\x41\x03H\x00\x12\x83\x01\n!move_unused_budget_recommendation\x18\x15 \x01(\x0b\x32Q.google.ads.googleads.v11.resources.Recommendation.MoveUnusedBudgetRecommendationB\x03\xe0\x41\x03H\x00\x12\x82\x01\n!target_roas_opt_in_recommendation\x18\x17 \x01(\x0b\x32P.google.ads.googleads.v11.resources.Recommendation.TargetRoasOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\x87\x01\n#responsive_search_ad_recommendation\x18\x1c \x01(\x0b\x32S.google.ads.googleads.v11.resources.Recommendation.ResponsiveSearchAdRecommendationB\x03\xe0\x41\x03H\x00\x12\x8b\x01\n+marginal_roi_campaign_budget_recommendation\x18\x1d \x01(\x0b\x32O.google.ads.googleads.v11.resources.Recommendation.CampaignBudgetRecommendationB\x03\xe0\x41\x03H\x00\x12\x8c\x01\n&use_broad_match_keyword_recommendation\x18\x1e \x01(\x0b\x32U.google.ads.googleads.v11.resources.Recommendation.UseBroadMatchKeywordRecommendationB\x03\xe0\x41\x03H\x00\x12\x92\x01\n)responsive_search_ad_asset_recommendation\x18\x1f \x01(\x0b\x32X.google.ads.googleads.v11.resources.Recommendation.ResponsiveSearchAdAssetRecommendationB\x03\xe0\x41\x03H\x00\x12\xbf\x01\nAupgrade_smart_shopping_campaign_to_performance_max_recommendation\x18  \x01(\x0b\x32m.google.ads.googleads.v11.resources.Recommendation.UpgradeSmartShoppingCampaignToPerformanceMaxRecommendationB\x03\xe0\x41\x03H\x00\x12\xac\x01\n7responsive_search_ad_improve_ad_strength_recommendation\x18! \x01(\x0b\x32\x64.google.ads.googleads.v11.resources.Recommendation.ResponsiveSearchAdImproveAdStrengthRecommendationB\x03\xe0\x41\x03H\x00\x12\x8e\x01\n\'display_expansion_opt_in_recommendation\x18\" \x01(\x0b\x32V.google.ads.googleads.v11.resources.Recommendation.DisplayExpansionOptInRecommendationB\x03\xe0\x41\x03H\x00\x12\xae\x01\n8upgrade_local_campaign_to_performance_max_recommendation\x18# \x01(\x0b\x32\x65.google.ads.googleads.v11.resources.Recommendation.UpgradeLocalCampaignToPerformanceMaxRecommendationB\x03\xe0\x41\x03H\x00\x1a\xe5\x01\n\x14RecommendationImpact\x12\x63\n\x0c\x62\x61se_metrics\x18\x01 \x01(\x0b\x32H.google.ads.googleads.v11.resources.Recommendation.RecommendationMetricsB\x03\xe0\x41\x03\x12h\n\x11potential_metrics\x18\x02 \x01(\x0b\x32H.google.ads.googleads.v11.resources.Recommendation.RecommendationMetricsB\x03\xe0\x41\x03\x1a\xf8\x01\n\x15RecommendationMetrics\x12\x1d\n\x0bimpressions\x18\x06 \x01(\x01\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x18\n\x06\x63licks\x18\x07 \x01(\x01\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1d\n\x0b\x63ost_micros\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x1d\n\x0b\x63onversions\x18\t \x01(\x01\x42\x03\xe0\x41\x03H\x03\x88\x01\x01\x12\x1d\n\x0bvideo_views\x18\n \x01(\x01\x42\x03\xe0\x41\x03H\x04\x88\x01\x01\x42\x0e\n\x0c_impressionsB\t\n\x07_clicksB\x0e\n\x0c_cost_microsB\x0e\n\x0c_conversionsB\x0e\n\x0c_video_views\x1a\xa0\x04\n\x1c\x43\x61mpaignBudgetRecommendation\x12.\n\x1c\x63urrent_budget_amount_micros\x18\x07 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x32\n recommended_budget_amount_micros\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x8f\x01\n\x0e\x62udget_options\x18\x03 \x03(\x0b\x32r.google.ads.googleads.v11.resources.Recommendation.CampaignBudgetRecommendation.CampaignBudgetRecommendationOptionB\x03\xe0\x41\x03\x1a\xc3\x01\n\"CampaignBudgetRecommendationOption\x12&\n\x14\x62udget_amount_micros\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\\\n\x06impact\x18\x02 \x01(\x0b\x32G.google.ads.googleads.v11.resources.Recommendation.RecommendationImpactB\x03\xe0\x41\x03\x42\x17\n\x15_budget_amount_microsB\x1f\n\x1d_current_budget_amount_microsB#\n!_recommended_budget_amount_micros\x1a\xa8\x01\n\x15KeywordRecommendation\x12\x42\n\x07keyword\x18\x01 \x01(\x0b\x32,.google.ads.googleads.v11.common.KeywordInfoB\x03\xe0\x41\x03\x12,\n\x1arecommended_cpc_bid_micros\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x42\x1d\n\x1b_recommended_cpc_bid_micros\x1a\xb9\x01\n\x14TextAdRecommendation\x12\x37\n\x02\x61\x64\x18\x01 \x01(\x0b\x32&.google.ads.googleads.v11.resources.AdB\x03\xe0\x41\x03\x12\x1f\n\rcreation_date\x18\x04 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12!\n\x0f\x61uto_apply_date\x18\x05 \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x42\x10\n\x0e_creation_dateB\x12\n\x10_auto_apply_date\x1a\x9b\x05\n\x1cTargetCpaOptInRecommendation\x12\x88\x01\n\x07options\x18\x01 \x03(\x0b\x32r.google.ads.googleads.v11.resources.Recommendation.TargetCpaOptInRecommendation.TargetCpaOptInRecommendationOptionB\x03\xe0\x41\x03\x12/\n\x1drecommended_target_cpa_micros\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x1a\x9c\x03\n\"TargetCpaOptInRecommendationOption\x12x\n\x04goal\x18\x01 \x01(\x0e\x32\x65.google.ads.googleads.v11.enums.TargetCpaOptInRecommendationGoalEnum.TargetCpaOptInRecommendationGoalB\x03\xe0\x41\x03\x12#\n\x11target_cpa_micros\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x38\n&required_campaign_budget_amount_micros\x18\x06 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\\\n\x06impact\x18\x04 \x01(\x0b\x32G.google.ads.googleads.v11.resources.Recommendation.RecommendationImpactB\x03\xe0\x41\x03\x42\x14\n\x12_target_cpa_microsB)\n\'_required_campaign_budget_amount_microsB \n\x1e_recommended_target_cpa_micros\x1a\x81\x01\n&MaximizeConversionsOptInRecommendation\x12\x32\n recommended_budget_amount_micros\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x42#\n!_recommended_budget_amount_micros\x1a \n\x1e\x45nhancedCpcOptInRecommendation\x1a#\n!SearchPartnersOptInRecommendation\x1a|\n!MaximizeClicksOptInRecommendation\x12\x32\n recommended_budget_amount_micros\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x42#\n!_recommended_budget_amount_micros\x1a\"\n OptimizeAdRotationRecommendation\x1aw\n\x1e\x43\x61lloutExtensionRecommendation\x12U\n\x16recommended_extensions\x18\x01 \x03(\x0b\x32\x30.google.ads.googleads.v11.common.CalloutFeedItemB\x03\xe0\x41\x03\x1ay\n\x1fSitelinkExtensionRecommendation\x12V\n\x16recommended_extensions\x18\x01 \x03(\x0b\x32\x31.google.ads.googleads.v11.common.SitelinkFeedItemB\x03\xe0\x41\x03\x1aq\n\x1b\x43\x61llExtensionRecommendation\x12R\n\x16recommended_extensions\x18\x01 \x03(\x0b\x32-.google.ads.googleads.v11.common.CallFeedItemB\x03\xe0\x41\x03\x1a\xd0\x01\n\x1eKeywordMatchTypeRecommendation\x12\x42\n\x07keyword\x18\x01 \x01(\x0b\x32,.google.ads.googleads.v11.common.KeywordInfoB\x03\xe0\x41\x03\x12j\n\x16recommended_match_type\x18\x02 \x01(\x0e\x32\x45.google.ads.googleads.v11.enums.KeywordMatchTypeEnum.KeywordMatchTypeB\x03\xe0\x41\x03\x1a\xda\x01\n\x1eMoveUnusedBudgetRecommendation\x12(\n\x16\x65xcess_campaign_budget\x18\x03 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12s\n\x15\x62udget_recommendation\x18\x02 \x01(\x0b\x32O.google.ads.googleads.v11.resources.Recommendation.CampaignBudgetRecommendationB\x03\xe0\x41\x03\x42\x19\n\x17_excess_campaign_budget\x1a\xcb\x01\n\x1dTargetRoasOptInRecommendation\x12)\n\x17recommended_target_roas\x18\x01 \x01(\x01\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x38\n&required_campaign_budget_amount_micros\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x42\x1a\n\x18_recommended_target_roasB)\n\'_required_campaign_budget_amount_micros\x1a\xb1\x01\n%ResponsiveSearchAdAssetRecommendation\x12?\n\ncurrent_ad\x18\x01 \x01(\x0b\x32&.google.ads.googleads.v11.resources.AdB\x03\xe0\x41\x03\x12G\n\x12recommended_assets\x18\x02 \x01(\x0b\x32&.google.ads.googleads.v11.resources.AdB\x03\xe0\x41\x03\x1a\xb9\x01\n1ResponsiveSearchAdImproveAdStrengthRecommendation\x12?\n\ncurrent_ad\x18\x01 \x01(\x0b\x32&.google.ads.googleads.v11.resources.AdB\x03\xe0\x41\x03\x12\x43\n\x0erecommended_ad\x18\x02 \x01(\x0b\x32&.google.ads.googleads.v11.resources.AdB\x03\xe0\x41\x03\x1a[\n ResponsiveSearchAdRecommendation\x12\x37\n\x02\x61\x64\x18\x01 \x01(\x0b\x32&.google.ads.googleads.v11.resources.AdB\x03\xe0\x41\x03\x1a\x94\x02\n\"UseBroadMatchKeywordRecommendation\x12\x42\n\x07keyword\x18\x01 \x03(\x0b\x32,.google.ads.googleads.v11.common.KeywordInfoB\x03\xe0\x41\x03\x12%\n\x18suggested_keywords_count\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03\x12$\n\x17\x63\x61mpaign_keywords_count\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03\x12(\n\x1b\x63\x61mpaign_uses_shared_budget\x18\x04 \x01(\x08\x42\x03\xe0\x41\x03\x12\x33\n&required_campaign_budget_amount_micros\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03\x1aw\n:UpgradeSmartShoppingCampaignToPerformanceMaxRecommendation\x12\x18\n\x0bmerchant_id\x18\x01 \x01(\x03\x42\x03\xe0\x41\x03\x12\x1f\n\x12sales_country_code\x18\x02 \x01(\tB\x03\xe0\x41\x03\x1a%\n#DisplayExpansionOptInRecommendation\x1a\x34\n2UpgradeLocalCampaignToPerformanceMaxRecommendation:i\xea\x41\x66\n\'googleads.googleapis.com/Recommendation\x12;customers/{customer_id}/recommendations/{recommendation_id}B\x10\n\x0erecommendationB\x12\n\x10_campaign_budgetB\x0b\n\t_campaignB\x0b\n\t_ad_groupB\x0c\n\n_dismissedB\x85\x02\n&com.google.ads.googleads.v11.resourcesB\x13RecommendationProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.recommendation_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\023RecommendationProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _RECOMMENDATION_RECOMMENDATIONIMPACT.fields_by_name['base_metrics']._options = None
  _RECOMMENDATION_RECOMMENDATIONIMPACT.fields_by_name['base_metrics']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RECOMMENDATIONIMPACT.fields_by_name['potential_metrics']._options = None
  _RECOMMENDATION_RECOMMENDATIONIMPACT.fields_by_name['potential_metrics']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['impressions']._options = None
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['impressions']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['clicks']._options = None
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['clicks']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['cost_micros']._options = None
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['cost_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['conversions']._options = None
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['conversions']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['video_views']._options = None
  _RECOMMENDATION_RECOMMENDATIONMETRICS.fields_by_name['video_views']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATIONOPTION.fields_by_name['budget_amount_micros']._options = None
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATIONOPTION.fields_by_name['budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATIONOPTION.fields_by_name['impact']._options = None
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATIONOPTION.fields_by_name['impact']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION.fields_by_name['current_budget_amount_micros']._options = None
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION.fields_by_name['current_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION.fields_by_name['recommended_budget_amount_micros']._options = None
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION.fields_by_name['recommended_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION.fields_by_name['budget_options']._options = None
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION.fields_by_name['budget_options']._serialized_options = b'\340A\003'
  _RECOMMENDATION_KEYWORDRECOMMENDATION.fields_by_name['keyword']._options = None
  _RECOMMENDATION_KEYWORDRECOMMENDATION.fields_by_name['keyword']._serialized_options = b'\340A\003'
  _RECOMMENDATION_KEYWORDRECOMMENDATION.fields_by_name['recommended_cpc_bid_micros']._options = None
  _RECOMMENDATION_KEYWORDRECOMMENDATION.fields_by_name['recommended_cpc_bid_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TEXTADRECOMMENDATION.fields_by_name['ad']._options = None
  _RECOMMENDATION_TEXTADRECOMMENDATION.fields_by_name['ad']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TEXTADRECOMMENDATION.fields_by_name['creation_date']._options = None
  _RECOMMENDATION_TEXTADRECOMMENDATION.fields_by_name['creation_date']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TEXTADRECOMMENDATION.fields_by_name['auto_apply_date']._options = None
  _RECOMMENDATION_TEXTADRECOMMENDATION.fields_by_name['auto_apply_date']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['goal']._options = None
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['goal']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['target_cpa_micros']._options = None
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['target_cpa_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['required_campaign_budget_amount_micros']._options = None
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['required_campaign_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['impact']._options = None
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION.fields_by_name['impact']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION.fields_by_name['options']._options = None
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION.fields_by_name['options']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION.fields_by_name['recommended_target_cpa_micros']._options = None
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION.fields_by_name['recommended_target_cpa_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_MAXIMIZECONVERSIONSOPTINRECOMMENDATION.fields_by_name['recommended_budget_amount_micros']._options = None
  _RECOMMENDATION_MAXIMIZECONVERSIONSOPTINRECOMMENDATION.fields_by_name['recommended_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_MAXIMIZECLICKSOPTINRECOMMENDATION.fields_by_name['recommended_budget_amount_micros']._options = None
  _RECOMMENDATION_MAXIMIZECLICKSOPTINRECOMMENDATION.fields_by_name['recommended_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CALLOUTEXTENSIONRECOMMENDATION.fields_by_name['recommended_extensions']._options = None
  _RECOMMENDATION_CALLOUTEXTENSIONRECOMMENDATION.fields_by_name['recommended_extensions']._serialized_options = b'\340A\003'
  _RECOMMENDATION_SITELINKEXTENSIONRECOMMENDATION.fields_by_name['recommended_extensions']._options = None
  _RECOMMENDATION_SITELINKEXTENSIONRECOMMENDATION.fields_by_name['recommended_extensions']._serialized_options = b'\340A\003'
  _RECOMMENDATION_CALLEXTENSIONRECOMMENDATION.fields_by_name['recommended_extensions']._options = None
  _RECOMMENDATION_CALLEXTENSIONRECOMMENDATION.fields_by_name['recommended_extensions']._serialized_options = b'\340A\003'
  _RECOMMENDATION_KEYWORDMATCHTYPERECOMMENDATION.fields_by_name['keyword']._options = None
  _RECOMMENDATION_KEYWORDMATCHTYPERECOMMENDATION.fields_by_name['keyword']._serialized_options = b'\340A\003'
  _RECOMMENDATION_KEYWORDMATCHTYPERECOMMENDATION.fields_by_name['recommended_match_type']._options = None
  _RECOMMENDATION_KEYWORDMATCHTYPERECOMMENDATION.fields_by_name['recommended_match_type']._serialized_options = b'\340A\003'
  _RECOMMENDATION_MOVEUNUSEDBUDGETRECOMMENDATION.fields_by_name['excess_campaign_budget']._options = None
  _RECOMMENDATION_MOVEUNUSEDBUDGETRECOMMENDATION.fields_by_name['excess_campaign_budget']._serialized_options = b'\340A\003'
  _RECOMMENDATION_MOVEUNUSEDBUDGETRECOMMENDATION.fields_by_name['budget_recommendation']._options = None
  _RECOMMENDATION_MOVEUNUSEDBUDGETRECOMMENDATION.fields_by_name['budget_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETROASOPTINRECOMMENDATION.fields_by_name['recommended_target_roas']._options = None
  _RECOMMENDATION_TARGETROASOPTINRECOMMENDATION.fields_by_name['recommended_target_roas']._serialized_options = b'\340A\003'
  _RECOMMENDATION_TARGETROASOPTINRECOMMENDATION.fields_by_name['required_campaign_budget_amount_micros']._options = None
  _RECOMMENDATION_TARGETROASOPTINRECOMMENDATION.fields_by_name['required_campaign_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RESPONSIVESEARCHADASSETRECOMMENDATION.fields_by_name['current_ad']._options = None
  _RECOMMENDATION_RESPONSIVESEARCHADASSETRECOMMENDATION.fields_by_name['current_ad']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RESPONSIVESEARCHADASSETRECOMMENDATION.fields_by_name['recommended_assets']._options = None
  _RECOMMENDATION_RESPONSIVESEARCHADASSETRECOMMENDATION.fields_by_name['recommended_assets']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RESPONSIVESEARCHADIMPROVEADSTRENGTHRECOMMENDATION.fields_by_name['current_ad']._options = None
  _RECOMMENDATION_RESPONSIVESEARCHADIMPROVEADSTRENGTHRECOMMENDATION.fields_by_name['current_ad']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RESPONSIVESEARCHADIMPROVEADSTRENGTHRECOMMENDATION.fields_by_name['recommended_ad']._options = None
  _RECOMMENDATION_RESPONSIVESEARCHADIMPROVEADSTRENGTHRECOMMENDATION.fields_by_name['recommended_ad']._serialized_options = b'\340A\003'
  _RECOMMENDATION_RESPONSIVESEARCHADRECOMMENDATION.fields_by_name['ad']._options = None
  _RECOMMENDATION_RESPONSIVESEARCHADRECOMMENDATION.fields_by_name['ad']._serialized_options = b'\340A\003'
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['keyword']._options = None
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['keyword']._serialized_options = b'\340A\003'
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['suggested_keywords_count']._options = None
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['suggested_keywords_count']._serialized_options = b'\340A\003'
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['campaign_keywords_count']._options = None
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['campaign_keywords_count']._serialized_options = b'\340A\003'
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['campaign_uses_shared_budget']._options = None
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['campaign_uses_shared_budget']._serialized_options = b'\340A\003'
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['required_campaign_budget_amount_micros']._options = None
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION.fields_by_name['required_campaign_budget_amount_micros']._serialized_options = b'\340A\003'
  _RECOMMENDATION_UPGRADESMARTSHOPPINGCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION.fields_by_name['merchant_id']._options = None
  _RECOMMENDATION_UPGRADESMARTSHOPPINGCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION.fields_by_name['merchant_id']._serialized_options = b'\340A\003'
  _RECOMMENDATION_UPGRADESMARTSHOPPINGCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION.fields_by_name['sales_country_code']._options = None
  _RECOMMENDATION_UPGRADESMARTSHOPPINGCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION.fields_by_name['sales_country_code']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['resource_name']._options = None
  _RECOMMENDATION.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A)\n\'googleads.googleapis.com/Recommendation'
  _RECOMMENDATION.fields_by_name['type']._options = None
  _RECOMMENDATION.fields_by_name['type']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['impact']._options = None
  _RECOMMENDATION.fields_by_name['impact']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['campaign_budget']._options = None
  _RECOMMENDATION.fields_by_name['campaign_budget']._serialized_options = b'\340A\003\372A)\n\'googleads.googleapis.com/CampaignBudget'
  _RECOMMENDATION.fields_by_name['campaign']._options = None
  _RECOMMENDATION.fields_by_name['campaign']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Campaign'
  _RECOMMENDATION.fields_by_name['ad_group']._options = None
  _RECOMMENDATION.fields_by_name['ad_group']._serialized_options = b'\340A\003\372A\"\n googleads.googleapis.com/AdGroup'
  _RECOMMENDATION.fields_by_name['dismissed']._options = None
  _RECOMMENDATION.fields_by_name['dismissed']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['campaign_budget_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['campaign_budget_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['forecasting_campaign_budget_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['forecasting_campaign_budget_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['keyword_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['keyword_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['text_ad_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['text_ad_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['target_cpa_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['target_cpa_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['maximize_conversions_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['maximize_conversions_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['enhanced_cpc_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['enhanced_cpc_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['search_partners_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['search_partners_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['maximize_clicks_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['maximize_clicks_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['optimize_ad_rotation_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['optimize_ad_rotation_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['callout_extension_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['callout_extension_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['sitelink_extension_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['sitelink_extension_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['call_extension_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['call_extension_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['keyword_match_type_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['keyword_match_type_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['move_unused_budget_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['move_unused_budget_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['target_roas_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['target_roas_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['responsive_search_ad_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['responsive_search_ad_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['marginal_roi_campaign_budget_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['marginal_roi_campaign_budget_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['use_broad_match_keyword_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['use_broad_match_keyword_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['responsive_search_ad_asset_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['responsive_search_ad_asset_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['upgrade_smart_shopping_campaign_to_performance_max_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['upgrade_smart_shopping_campaign_to_performance_max_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['responsive_search_ad_improve_ad_strength_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['responsive_search_ad_improve_ad_strength_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['display_expansion_opt_in_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['display_expansion_opt_in_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION.fields_by_name['upgrade_local_campaign_to_performance_max_recommendation']._options = None
  _RECOMMENDATION.fields_by_name['upgrade_local_campaign_to_performance_max_recommendation']._serialized_options = b'\340A\003'
  _RECOMMENDATION._options = None
  _RECOMMENDATION._serialized_options = b'\352Af\n\'googleads.googleapis.com/Recommendation\022;customers/{customer_id}/recommendations/{recommendation_id}'
  _RECOMMENDATION._serialized_start=490
  _RECOMMENDATION._serialized_end=8954
  _RECOMMENDATION_RECOMMENDATIONIMPACT._serialized_start=4397
  _RECOMMENDATION_RECOMMENDATIONIMPACT._serialized_end=4626
  _RECOMMENDATION_RECOMMENDATIONMETRICS._serialized_start=4629
  _RECOMMENDATION_RECOMMENDATIONMETRICS._serialized_end=4877
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION._serialized_start=4880
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION._serialized_end=5424
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATIONOPTION._serialized_start=5159
  _RECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATION_CAMPAIGNBUDGETRECOMMENDATIONOPTION._serialized_end=5354
  _RECOMMENDATION_KEYWORDRECOMMENDATION._serialized_start=5427
  _RECOMMENDATION_KEYWORDRECOMMENDATION._serialized_end=5595
  _RECOMMENDATION_TEXTADRECOMMENDATION._serialized_start=5598
  _RECOMMENDATION_TEXTADRECOMMENDATION._serialized_end=5783
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION._serialized_start=5786
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION._serialized_end=6453
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION._serialized_start=6007
  _RECOMMENDATION_TARGETCPAOPTINRECOMMENDATION_TARGETCPAOPTINRECOMMENDATIONOPTION._serialized_end=6419
  _RECOMMENDATION_MAXIMIZECONVERSIONSOPTINRECOMMENDATION._serialized_start=6456
  _RECOMMENDATION_MAXIMIZECONVERSIONSOPTINRECOMMENDATION._serialized_end=6585
  _RECOMMENDATION_ENHANCEDCPCOPTINRECOMMENDATION._serialized_start=6587
  _RECOMMENDATION_ENHANCEDCPCOPTINRECOMMENDATION._serialized_end=6619
  _RECOMMENDATION_SEARCHPARTNERSOPTINRECOMMENDATION._serialized_start=6621
  _RECOMMENDATION_SEARCHPARTNERSOPTINRECOMMENDATION._serialized_end=6656
  _RECOMMENDATION_MAXIMIZECLICKSOPTINRECOMMENDATION._serialized_start=6658
  _RECOMMENDATION_MAXIMIZECLICKSOPTINRECOMMENDATION._serialized_end=6782
  _RECOMMENDATION_OPTIMIZEADROTATIONRECOMMENDATION._serialized_start=6784
  _RECOMMENDATION_OPTIMIZEADROTATIONRECOMMENDATION._serialized_end=6818
  _RECOMMENDATION_CALLOUTEXTENSIONRECOMMENDATION._serialized_start=6820
  _RECOMMENDATION_CALLOUTEXTENSIONRECOMMENDATION._serialized_end=6939
  _RECOMMENDATION_SITELINKEXTENSIONRECOMMENDATION._serialized_start=6941
  _RECOMMENDATION_SITELINKEXTENSIONRECOMMENDATION._serialized_end=7062
  _RECOMMENDATION_CALLEXTENSIONRECOMMENDATION._serialized_start=7064
  _RECOMMENDATION_CALLEXTENSIONRECOMMENDATION._serialized_end=7177
  _RECOMMENDATION_KEYWORDMATCHTYPERECOMMENDATION._serialized_start=7180
  _RECOMMENDATION_KEYWORDMATCHTYPERECOMMENDATION._serialized_end=7388
  _RECOMMENDATION_MOVEUNUSEDBUDGETRECOMMENDATION._serialized_start=7391
  _RECOMMENDATION_MOVEUNUSEDBUDGETRECOMMENDATION._serialized_end=7609
  _RECOMMENDATION_TARGETROASOPTINRECOMMENDATION._serialized_start=7612
  _RECOMMENDATION_TARGETROASOPTINRECOMMENDATION._serialized_end=7815
  _RECOMMENDATION_RESPONSIVESEARCHADASSETRECOMMENDATION._serialized_start=7818
  _RECOMMENDATION_RESPONSIVESEARCHADASSETRECOMMENDATION._serialized_end=7995
  _RECOMMENDATION_RESPONSIVESEARCHADIMPROVEADSTRENGTHRECOMMENDATION._serialized_start=7998
  _RECOMMENDATION_RESPONSIVESEARCHADIMPROVEADSTRENGTHRECOMMENDATION._serialized_end=8183
  _RECOMMENDATION_RESPONSIVESEARCHADRECOMMENDATION._serialized_start=8185
  _RECOMMENDATION_RESPONSIVESEARCHADRECOMMENDATION._serialized_end=8276
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION._serialized_start=8279
  _RECOMMENDATION_USEBROADMATCHKEYWORDRECOMMENDATION._serialized_end=8555
  _RECOMMENDATION_UPGRADESMARTSHOPPINGCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION._serialized_start=8557
  _RECOMMENDATION_UPGRADESMARTSHOPPINGCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION._serialized_end=8676
  _RECOMMENDATION_DISPLAYEXPANSIONOPTINRECOMMENDATION._serialized_start=8678
  _RECOMMENDATION_DISPLAYEXPANSIONOPTINRECOMMENDATION._serialized_end=8715
  _RECOMMENDATION_UPGRADELOCALCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION._serialized_start=8717
  _RECOMMENDATION_UPGRADELOCALCAMPAIGNTOPERFORMANCEMAXRECOMMENDATION._serialized_end=8769
# @@protoc_insertion_point(module_scope)
