# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/common/policy_summary.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_common_dot_policy__pb2
from google.ads.googleads.v9.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v9.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_policy__review__status__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/ads/googleads/v9/common/policy_summary.proto\x12\x1egoogle.ads.googleads.v9.common\x1a+google/ads/googleads/v9/common/policy.proto\x1a:google/ads/googleads/v9/enums/policy_approval_status.proto\x1a\x38google/ads/googleads/v9/enums/policy_review_status.proto\x1a\x1cgoogle/api/annotations.proto\"\xa7\x02\n\rPolicySummary\x12N\n\x14policy_topic_entries\x18\x01 \x03(\x0b\x32\x30.google.ads.googleads.v9.common.PolicyTopicEntry\x12_\n\rreview_status\x18\x02 \x01(\x0e\x32H.google.ads.googleads.v9.enums.PolicyReviewStatusEnum.PolicyReviewStatus\x12\x65\n\x0f\x61pproval_status\x18\x03 \x01(\x0e\x32L.google.ads.googleads.v9.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\xed\x01\n\"com.google.ads.googleads.v9.commonB\x12PolicySummaryProtoP\x01ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v9/common;common\xa2\x02\x03GAA\xaa\x02\x1eGoogle.Ads.GoogleAds.V9.Common\xca\x02\x1eGoogle\\Ads\\GoogleAds\\V9\\Common\xea\x02\"Google::Ads::GoogleAds::V9::Commonb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.common.policy_summary_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.google.ads.googleads.v9.commonB\022PolicySummaryProtoP\001ZDgoogle.golang.org/genproto/googleapis/ads/googleads/v9/common;common\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V9.Common\312\002\036Google\\Ads\\GoogleAds\\V9\\Common\352\002\"Google::Ads::GoogleAds::V9::Common'
  _POLICYSUMMARY._serialized_start=281
  _POLICYSUMMARY._serialized_end=576
# @@protoc_insertion_point(module_scope)
