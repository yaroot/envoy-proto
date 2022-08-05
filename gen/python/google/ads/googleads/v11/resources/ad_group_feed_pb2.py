# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/ad_group_feed.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import matching_function_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_matching__function__pb2
from google.ads.googleads.v11.enums import feed_link_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_feed__link__status__pb2
from google.ads.googleads.v11.enums import placeholder_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_placeholder__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/ads/googleads/v11/resources/ad_group_feed.proto\x12\"google.ads.googleads.v11.resources\x1a\x37google/ads/googleads/v11/common/matching_function.proto\x1a\x35google/ads/googleads/v11/enums/feed_link_status.proto\x1a\x35google/ads/googleads/v11/enums/placeholder_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xd2\x04\n\x0b\x41\x64GroupFeed\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x05\xfa\x41&\n$googleads.googleapis.com/AdGroupFeed\x12\x38\n\x04\x66\x65\x65\x64\x18\x07 \x01(\tB%\xe0\x41\x05\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/FeedH\x00\x88\x01\x01\x12?\n\x08\x61\x64_group\x18\x08 \x01(\tB(\xe0\x41\x05\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x01\x88\x01\x01\x12^\n\x11placeholder_types\x18\x04 \x03(\x0e\x32\x43.google.ads.googleads.v11.enums.PlaceholderTypeEnum.PlaceholderType\x12L\n\x11matching_function\x18\x05 \x01(\x0b\x32\x31.google.ads.googleads.v11.common.MatchingFunction\x12V\n\x06status\x18\x06 \x01(\x0e\x32\x41.google.ads.googleads.v11.enums.FeedLinkStatusEnum.FeedLinkStatusB\x03\xe0\x41\x03:g\xea\x41\x64\n$googleads.googleapis.com/AdGroupFeed\x12<customers/{customer_id}/adGroupFeeds/{ad_group_id}~{feed_id}B\x07\n\x05_feedB\x0b\n\t_ad_groupB\x82\x02\n&com.google.ads.googleads.v11.resourcesB\x10\x41\x64GroupFeedProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.ad_group_feed_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\020AdGroupFeedProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _ADGROUPFEED.fields_by_name['resource_name']._options = None
  _ADGROUPFEED.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A&\n$googleads.googleapis.com/AdGroupFeed'
  _ADGROUPFEED.fields_by_name['feed']._options = None
  _ADGROUPFEED.fields_by_name['feed']._serialized_options = b'\340A\005\372A\037\n\035googleads.googleapis.com/Feed'
  _ADGROUPFEED.fields_by_name['ad_group']._options = None
  _ADGROUPFEED.fields_by_name['ad_group']._serialized_options = b'\340A\005\372A\"\n googleads.googleapis.com/AdGroup'
  _ADGROUPFEED.fields_by_name['status']._options = None
  _ADGROUPFEED.fields_by_name['status']._serialized_options = b'\340A\003'
  _ADGROUPFEED._options = None
  _ADGROUPFEED._serialized_options = b'\352Ad\n$googleads.googleapis.com/AdGroupFeed\022<customers/{customer_id}/adGroupFeeds/{ad_group_id}~{feed_id}'
  _ADGROUPFEED._serialized_start=322
  _ADGROUPFEED._serialized_end=916
# @@protoc_insertion_point(module_scope)
