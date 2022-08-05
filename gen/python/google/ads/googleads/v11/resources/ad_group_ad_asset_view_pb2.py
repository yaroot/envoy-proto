# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/ad_group_ad_asset_view.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_policy__pb2
from google.ads.googleads.v11.enums import asset_field_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_asset__field__type__pb2
from google.ads.googleads.v11.enums import asset_performance_label_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_asset__performance__label__pb2
from google.ads.googleads.v11.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v11.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_policy__review__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/ads/googleads/v11/resources/ad_group_ad_asset_view.proto\x12\"google.ads.googleads.v11.resources\x1a,google/ads/googleads/v11/common/policy.proto\x1a\x35google/ads/googleads/v11/enums/asset_field_type.proto\x1a<google/ads/googleads/v11/enums/asset_performance_label.proto\x1a;google/ads/googleads/v11/enums/policy_approval_status.proto\x1a\x39google/ads/googleads/v11/enums/policy_review_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xdd\x05\n\x12\x41\x64GroupAdAssetView\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x03\xfa\x41-\n+googleads.googleapis.com/AdGroupAdAssetView\x12\x44\n\x0b\x61\x64_group_ad\x18\t \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"googleads.googleapis.com/AdGroupAdH\x00\x88\x01\x01\x12:\n\x05\x61sset\x18\n \x01(\tB&\xe0\x41\x03\xfa\x41 \n\x1egoogleads.googleapis.com/AssetH\x01\x88\x01\x01\x12Z\n\nfield_type\x18\x02 \x01(\x0e\x32\x41.google.ads.googleads.v11.enums.AssetFieldTypeEnum.AssetFieldTypeB\x03\xe0\x41\x03\x12\x19\n\x07\x65nabled\x18\x08 \x01(\x08\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\\\n\x0epolicy_summary\x18\x03 \x01(\x0b\x32?.google.ads.googleads.v11.resources.AdGroupAdAssetPolicySummaryB\x03\xe0\x41\x03\x12o\n\x11performance_label\x18\x04 \x01(\x0e\x32O.google.ads.googleads.v11.enums.AssetPerformanceLabelEnum.AssetPerformanceLabelB\x03\xe0\x41\x03:\x8c\x01\xea\x41\x88\x01\n+googleads.googleapis.com/AdGroupAdAssetView\x12Ycustomers/{customer_id}/adGroupAdAssetViews/{ad_group_id}~{ad_id}~{asset_id}~{field_type}B\x0e\n\x0c_ad_group_adB\x08\n\x06_assetB\n\n\x08_enabled\"\xc7\x02\n\x1b\x41\x64GroupAdAssetPolicySummary\x12T\n\x14policy_topic_entries\x18\x01 \x03(\x0b\x32\x31.google.ads.googleads.v11.common.PolicyTopicEntryB\x03\xe0\x41\x03\x12\x65\n\rreview_status\x18\x02 \x01(\x0e\x32I.google.ads.googleads.v11.enums.PolicyReviewStatusEnum.PolicyReviewStatusB\x03\xe0\x41\x03\x12k\n\x0f\x61pproval_status\x18\x03 \x01(\x0e\x32M.google.ads.googleads.v11.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\x03\xe0\x41\x03\x42\x89\x02\n&com.google.ads.googleads.v11.resourcesB\x17\x41\x64GroupAdAssetViewProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.ad_group_ad_asset_view_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\027AdGroupAdAssetViewProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _ADGROUPADASSETVIEW.fields_by_name['resource_name']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A-\n+googleads.googleapis.com/AdGroupAdAssetView'
  _ADGROUPADASSETVIEW.fields_by_name['ad_group_ad']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['ad_group_ad']._serialized_options = b'\340A\003\372A$\n\"googleads.googleapis.com/AdGroupAd'
  _ADGROUPADASSETVIEW.fields_by_name['asset']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['asset']._serialized_options = b'\340A\003\372A \n\036googleads.googleapis.com/Asset'
  _ADGROUPADASSETVIEW.fields_by_name['field_type']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['field_type']._serialized_options = b'\340A\003'
  _ADGROUPADASSETVIEW.fields_by_name['enabled']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['enabled']._serialized_options = b'\340A\003'
  _ADGROUPADASSETVIEW.fields_by_name['policy_summary']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['policy_summary']._serialized_options = b'\340A\003'
  _ADGROUPADASSETVIEW.fields_by_name['performance_label']._options = None
  _ADGROUPADASSETVIEW.fields_by_name['performance_label']._serialized_options = b'\340A\003'
  _ADGROUPADASSETVIEW._options = None
  _ADGROUPADASSETVIEW._serialized_options = b'\352A\210\001\n+googleads.googleapis.com/AdGroupAdAssetView\022Ycustomers/{customer_id}/adGroupAdAssetViews/{ad_group_id}~{ad_id}~{asset_id}~{field_type}'
  _ADGROUPADASSETPOLICYSUMMARY.fields_by_name['policy_topic_entries']._options = None
  _ADGROUPADASSETPOLICYSUMMARY.fields_by_name['policy_topic_entries']._serialized_options = b'\340A\003'
  _ADGROUPADASSETPOLICYSUMMARY.fields_by_name['review_status']._options = None
  _ADGROUPADASSETPOLICYSUMMARY.fields_by_name['review_status']._serialized_options = b'\340A\003'
  _ADGROUPADASSETPOLICYSUMMARY.fields_by_name['approval_status']._options = None
  _ADGROUPADASSETPOLICYSUMMARY.fields_by_name['approval_status']._serialized_options = b'\340A\003'
  _ADGROUPADASSETVIEW._serialized_start=447
  _ADGROUPADASSETVIEW._serialized_end=1180
  _ADGROUPADASSETPOLICYSUMMARY._serialized_start=1183
  _ADGROUPADASSETPOLICYSUMMARY._serialized_end=1510
# @@protoc_insertion_point(module_scope)
