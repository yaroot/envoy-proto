# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/resources/ad_group_ad.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_common_dot_policy__pb2
from google.ads.googleads.v9.enums import ad_group_ad_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_ad__group__ad__status__pb2
from google.ads.googleads.v9.enums import ad_strength_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_ad__strength__pb2
from google.ads.googleads.v9.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v9.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_policy__review__status__pb2
from google.ads.googleads.v9.resources import ad_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_ad__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/ads/googleads/v9/resources/ad_group_ad.proto\x12!google.ads.googleads.v9.resources\x1a+google/ads/googleads/v9/common/policy.proto\x1a\x36google/ads/googleads/v9/enums/ad_group_ad_status.proto\x1a/google/ads/googleads/v9/enums/ad_strength.proto\x1a:google/ads/googleads/v9/enums/policy_approval_status.proto\x1a\x38google/ads/googleads/v9/enums/policy_review_status.proto\x1a*google/ads/googleads/v9/resources/ad.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\x93\x05\n\tAdGroupAd\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x05\xfa\x41$\n\"googleads.googleapis.com/AdGroupAd\x12R\n\x06status\x18\x03 \x01(\x0e\x32\x42.google.ads.googleads.v9.enums.AdGroupAdStatusEnum.AdGroupAdStatus\x12?\n\x08\x61\x64_group\x18\t \x01(\tB(\xe0\x41\x05\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x00\x88\x01\x01\x12\x36\n\x02\x61\x64\x18\x05 \x01(\x0b\x32%.google.ads.googleads.v9.resources.AdB\x03\xe0\x41\x05\x12V\n\x0epolicy_summary\x18\x06 \x01(\x0b\x32\x39.google.ads.googleads.v9.resources.AdGroupAdPolicySummaryB\x03\xe0\x41\x03\x12R\n\x0b\x61\x64_strength\x18\x07 \x01(\x0e\x32\x38.google.ads.googleads.v9.enums.AdStrengthEnum.AdStrengthB\x03\xe0\x41\x03\x12\x19\n\x0c\x61\x63tion_items\x18\r \x03(\tB\x03\xe0\x41\x03\x12?\n\x06labels\x18\n \x03(\tB/\xe0\x41\x03\xfa\x41)\n\'googleads.googleapis.com/AdGroupAdLabel:a\xea\x41^\n\"googleads.googleapis.com/AdGroupAd\x12\x38\x63ustomers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}B\x0b\n\t_ad_group\"\xbf\x02\n\x16\x41\x64GroupAdPolicySummary\x12S\n\x14policy_topic_entries\x18\x01 \x03(\x0b\x32\x30.google.ads.googleads.v9.common.PolicyTopicEntryB\x03\xe0\x41\x03\x12\x64\n\rreview_status\x18\x02 \x01(\x0e\x32H.google.ads.googleads.v9.enums.PolicyReviewStatusEnum.PolicyReviewStatusB\x03\xe0\x41\x03\x12j\n\x0f\x61pproval_status\x18\x03 \x01(\x0e\x32L.google.ads.googleads.v9.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\x03\xe0\x41\x03\x42\xfb\x01\n%com.google.ads.googleads.v9.resourcesB\x0e\x41\x64GroupAdProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v9/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V9.Resources\xca\x02!Google\\Ads\\GoogleAds\\V9\\Resources\xea\x02%Google::Ads::GoogleAds::V9::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.resources.ad_group_ad_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v9.resourcesB\016AdGroupAdProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v9/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resources\312\002!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%Google::Ads::GoogleAds::V9::Resources'
  _ADGROUPAD.fields_by_name['resource_name']._options = None
  _ADGROUPAD.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A$\n\"googleads.googleapis.com/AdGroupAd'
  _ADGROUPAD.fields_by_name['ad_group']._options = None
  _ADGROUPAD.fields_by_name['ad_group']._serialized_options = b'\340A\005\372A\"\n googleads.googleapis.com/AdGroup'
  _ADGROUPAD.fields_by_name['ad']._options = None
  _ADGROUPAD.fields_by_name['ad']._serialized_options = b'\340A\005'
  _ADGROUPAD.fields_by_name['policy_summary']._options = None
  _ADGROUPAD.fields_by_name['policy_summary']._serialized_options = b'\340A\003'
  _ADGROUPAD.fields_by_name['ad_strength']._options = None
  _ADGROUPAD.fields_by_name['ad_strength']._serialized_options = b'\340A\003'
  _ADGROUPAD.fields_by_name['action_items']._options = None
  _ADGROUPAD.fields_by_name['action_items']._serialized_options = b'\340A\003'
  _ADGROUPAD.fields_by_name['labels']._options = None
  _ADGROUPAD.fields_by_name['labels']._serialized_options = b'\340A\003\372A)\n\'googleads.googleapis.com/AdGroupAdLabel'
  _ADGROUPAD._options = None
  _ADGROUPAD._serialized_options = b'\352A^\n\"googleads.googleapis.com/AdGroupAd\0228customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}'
  _ADGROUPADPOLICYSUMMARY.fields_by_name['policy_topic_entries']._options = None
  _ADGROUPADPOLICYSUMMARY.fields_by_name['policy_topic_entries']._serialized_options = b'\340A\003'
  _ADGROUPADPOLICYSUMMARY.fields_by_name['review_status']._options = None
  _ADGROUPADPOLICYSUMMARY.fields_by_name['review_status']._serialized_options = b'\340A\003'
  _ADGROUPADPOLICYSUMMARY.fields_by_name['approval_status']._options = None
  _ADGROUPADPOLICYSUMMARY.fields_by_name['approval_status']._serialized_options = b'\340A\003'
  _ADGROUPAD._serialized_start=493
  _ADGROUPAD._serialized_end=1152
  _ADGROUPADPOLICYSUMMARY._serialized_start=1155
  _ADGROUPADPOLICYSUMMARY._serialized_end=1474
# @@protoc_insertion_point(module_scope)
