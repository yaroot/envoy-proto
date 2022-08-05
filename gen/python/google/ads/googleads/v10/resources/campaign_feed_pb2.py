# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/campaign_feed.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import matching_function_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_matching__function__pb2
from google.ads.googleads.v10.enums import feed_link_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_feed__link__status__pb2
from google.ads.googleads.v10.enums import placeholder_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_placeholder__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/ads/googleads/v10/resources/campaign_feed.proto\x12\"google.ads.googleads.v10.resources\x1a\x37google/ads/googleads/v10/common/matching_function.proto\x1a\x35google/ads/googleads/v10/enums/feed_link_status.proto\x1a\x35google/ads/googleads/v10/enums/placeholder_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xd7\x04\n\x0c\x43\x61mpaignFeed\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x05\xfa\x41\'\n%googleads.googleapis.com/CampaignFeed\x12\x38\n\x04\x66\x65\x65\x64\x18\x07 \x01(\tB%\xe0\x41\x05\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/FeedH\x00\x88\x01\x01\x12@\n\x08\x63\x61mpaign\x18\x08 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/CampaignH\x01\x88\x01\x01\x12^\n\x11placeholder_types\x18\x04 \x03(\x0e\x32\x43.google.ads.googleads.v10.enums.PlaceholderTypeEnum.PlaceholderType\x12L\n\x11matching_function\x18\x05 \x01(\x0b\x32\x31.google.ads.googleads.v10.common.MatchingFunction\x12V\n\x06status\x18\x06 \x01(\x0e\x32\x41.google.ads.googleads.v10.enums.FeedLinkStatusEnum.FeedLinkStatusB\x03\xe0\x41\x03:i\xea\x41\x66\n%googleads.googleapis.com/CampaignFeed\x12=customers/{customer_id}/campaignFeeds/{campaign_id}~{feed_id}B\x07\n\x05_feedB\x0b\n\t_campaignB\x83\x02\n&com.google.ads.googleads.v10.resourcesB\x11\x43\x61mpaignFeedProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.campaign_feed_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\021CampaignFeedProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CAMPAIGNFEED.fields_by_name['resource_name']._options = None
  _CAMPAIGNFEED.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A\'\n%googleads.googleapis.com/CampaignFeed'
  _CAMPAIGNFEED.fields_by_name['feed']._options = None
  _CAMPAIGNFEED.fields_by_name['feed']._serialized_options = b'\340A\005\372A\037\n\035googleads.googleapis.com/Feed'
  _CAMPAIGNFEED.fields_by_name['campaign']._options = None
  _CAMPAIGNFEED.fields_by_name['campaign']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGNFEED.fields_by_name['status']._options = None
  _CAMPAIGNFEED.fields_by_name['status']._serialized_options = b'\340A\003'
  _CAMPAIGNFEED._options = None
  _CAMPAIGNFEED._serialized_options = b'\352Af\n%googleads.googleapis.com/CampaignFeed\022=customers/{customer_id}/campaignFeeds/{campaign_id}~{feed_id}'
  _CAMPAIGNFEED._serialized_start=322
  _CAMPAIGNFEED._serialized_end=921
# @@protoc_insertion_point(module_scope)
