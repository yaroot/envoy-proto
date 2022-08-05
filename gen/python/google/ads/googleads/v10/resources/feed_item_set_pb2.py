# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/feed_item_set.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import feed_item_set_filter_type_infos_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_feed__item__set__filter__type__infos__pb2
from google.ads.googleads.v10.enums import feed_item_set_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_feed__item__set__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/ads/googleads/v10/resources/feed_item_set.proto\x12\"google.ads.googleads.v10.resources\x1a\x45google/ads/googleads/v10/common/feed_item_set_filter_type_infos.proto\x1a\x39google/ads/googleads/v10/enums/feed_item_set_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xf5\x04\n\x0b\x46\x65\x65\x64ItemSet\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x05\xfa\x41&\n$googleads.googleapis.com/FeedItemSet\x12\x33\n\x04\x66\x65\x65\x64\x18\x02 \x01(\tB%\xe0\x41\x05\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/Feed\x12\x1d\n\x10\x66\x65\x65\x64_item_set_id\x18\x03 \x01(\x03\x42\x03\xe0\x41\x03\x12\x14\n\x0c\x64isplay_name\x18\x04 \x01(\t\x12\\\n\x06status\x18\x08 \x01(\x0e\x32G.google.ads.googleads.v10.enums.FeedItemSetStatusEnum.FeedItemSetStatusB\x03\xe0\x41\x03\x12`\n\x1b\x64ynamic_location_set_filter\x18\x05 \x01(\x0b\x32\x39.google.ads.googleads.v10.common.DynamicLocationSetFilterH\x00\x12s\n%dynamic_affiliate_location_set_filter\x18\x06 \x01(\x0b\x32\x42.google.ads.googleads.v10.common.DynamicAffiliateLocationSetFilterH\x00:l\xea\x41i\n$googleads.googleapis.com/FeedItemSet\x12\x41\x63ustomers/{customer_id}/feedItemSets/{feed_id}~{feed_item_set_id}B\x14\n\x12\x64ynamic_set_filterB\x82\x02\n&com.google.ads.googleads.v10.resourcesB\x10\x46\x65\x65\x64ItemSetProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.feed_item_set_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\020FeedItemSetProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _FEEDITEMSET.fields_by_name['resource_name']._options = None
  _FEEDITEMSET.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A&\n$googleads.googleapis.com/FeedItemSet'
  _FEEDITEMSET.fields_by_name['feed']._options = None
  _FEEDITEMSET.fields_by_name['feed']._serialized_options = b'\340A\005\372A\037\n\035googleads.googleapis.com/Feed'
  _FEEDITEMSET.fields_by_name['feed_item_set_id']._options = None
  _FEEDITEMSET.fields_by_name['feed_item_set_id']._serialized_options = b'\340A\003'
  _FEEDITEMSET.fields_by_name['status']._options = None
  _FEEDITEMSET.fields_by_name['status']._serialized_options = b'\340A\003'
  _FEEDITEMSET._options = None
  _FEEDITEMSET._serialized_options = b'\352Ai\n$googleads.googleapis.com/FeedItemSet\022Acustomers/{customer_id}/feedItemSets/{feed_id}~{feed_item_set_id}'
  _FEEDITEMSET._serialized_start=285
  _FEEDITEMSET._serialized_end=914
# @@protoc_insertion_point(module_scope)
