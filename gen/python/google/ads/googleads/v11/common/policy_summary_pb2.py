# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/common/policy_summary.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_policy__pb2
from google.ads.googleads.v11.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v11.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_policy__review__status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/ads/googleads/v11/common/policy_summary.proto\x12\x1fgoogle.ads.googleads.v11.common\x1a,google/ads/googleads/v11/common/policy.proto\x1a;google/ads/googleads/v11/enums/policy_approval_status.proto\x1a\x39google/ads/googleads/v11/enums/policy_review_status.proto\"\xaa\x02\n\rPolicySummary\x12O\n\x14policy_topic_entries\x18\x01 \x03(\x0b\x32\x31.google.ads.googleads.v11.common.PolicyTopicEntry\x12`\n\rreview_status\x18\x02 \x01(\x0e\x32I.google.ads.googleads.v11.enums.PolicyReviewStatusEnum.PolicyReviewStatus\x12\x66\n\x0f\x61pproval_status\x18\x03 \x01(\x0e\x32M.google.ads.googleads.v11.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\xf2\x01\n#com.google.ads.googleads.v11.commonB\x12PolicySummaryProtoP\x01ZEgoogle.golang.org/genproto/googleapis/ads/googleads/v11/common;common\xa2\x02\x03GAA\xaa\x02\x1fGoogle.Ads.GoogleAds.V11.Common\xca\x02\x1fGoogle\\Ads\\GoogleAds\\V11\\Common\xea\x02#Google::Ads::GoogleAds::V11::Commonb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.common.policy_summary_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.ads.googleads.v11.commonB\022PolicySummaryProtoP\001ZEgoogle.golang.org/genproto/googleapis/ads/googleads/v11/common;common\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V11.Common\312\002\037Google\\Ads\\GoogleAds\\V11\\Common\352\002#Google::Ads::GoogleAds::V11::Common'
  _POLICYSUMMARY._serialized_start=256
  _POLICYSUMMARY._serialized_end=554
# @@protoc_insertion_point(module_scope)
