# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/extension_feed_item.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_criteria__pb2
from google.ads.googleads.v10.common import extensions_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_extensions__pb2
from google.ads.googleads.v10.enums import extension_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_extension__type__pb2
from google.ads.googleads.v10.enums import feed_item_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_feed__item__status__pb2
from google.ads.googleads.v10.enums import feed_item_target_device_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_feed__item__target__device__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n<google/ads/googleads/v10/resources/extension_feed_item.proto\x12\"google.ads.googleads.v10.resources\x1a.google/ads/googleads/v10/common/criteria.proto\x1a\x30google/ads/googleads/v10/common/extensions.proto\x1a\x33google/ads/googleads/v10/enums/extension_type.proto\x1a\x35google/ads/googleads/v10/enums/feed_item_status.proto\x1a<google/ads/googleads/v10/enums/feed_item_target_device.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x8f\x10\n\x11\x45xtensionFeedItem\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x05\xfa\x41,\n*googleads.googleapis.com/ExtensionFeedItem\x12\x14\n\x02id\x18\x19 \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\\\n\x0e\x65xtension_type\x18\r \x01(\x0e\x32?.google.ads.googleads.v10.enums.ExtensionTypeEnum.ExtensionTypeB\x03\xe0\x41\x03\x12\x1c\n\x0fstart_date_time\x18\x1a \x01(\tH\x03\x88\x01\x01\x12\x1a\n\rend_date_time\x18\x1b \x01(\tH\x04\x88\x01\x01\x12\x45\n\x0c\x61\x64_schedules\x18\x10 \x03(\x0b\x32/.google.ads.googleads.v10.common.AdScheduleInfo\x12]\n\x06\x64\x65vice\x18\x11 \x01(\x0e\x32M.google.ads.googleads.v10.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice\x12Z\n\x1ctargeted_geo_target_constant\x18\x1e \x01(\tB/\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstantH\x05\x88\x01\x01\x12\x46\n\x10targeted_keyword\x18\x16 \x01(\x0b\x32,.google.ads.googleads.v10.common.KeywordInfo\x12V\n\x06status\x18\x04 \x01(\x0e\x32\x41.google.ads.googleads.v10.enums.FeedItemStatusEnum.FeedItemStatusB\x03\xe0\x41\x03\x12O\n\x12sitelink_feed_item\x18\x02 \x01(\x0b\x32\x31.google.ads.googleads.v10.common.SitelinkFeedItemH\x00\x12\x62\n\x1cstructured_snippet_feed_item\x18\x03 \x01(\x0b\x32:.google.ads.googleads.v10.common.StructuredSnippetFeedItemH\x00\x12\x45\n\rapp_feed_item\x18\x07 \x01(\x0b\x32,.google.ads.googleads.v10.common.AppFeedItemH\x00\x12G\n\x0e\x63\x61ll_feed_item\x18\x08 \x01(\x0b\x32-.google.ads.googleads.v10.common.CallFeedItemH\x00\x12M\n\x11\x63\x61llout_feed_item\x18\t \x01(\x0b\x32\x30.google.ads.googleads.v10.common.CalloutFeedItemH\x00\x12V\n\x16text_message_feed_item\x18\n \x01(\x0b\x32\x34.google.ads.googleads.v10.common.TextMessageFeedItemH\x00\x12I\n\x0fprice_feed_item\x18\x0b \x01(\x0b\x32..google.ads.googleads.v10.common.PriceFeedItemH\x00\x12Q\n\x13promotion_feed_item\x18\x0c \x01(\x0b\x32\x32.google.ads.googleads.v10.common.PromotionFeedItemH\x00\x12T\n\x12location_feed_item\x18\x0e \x01(\x0b\x32\x31.google.ads.googleads.v10.common.LocationFeedItemB\x03\xe0\x41\x03H\x00\x12g\n\x1c\x61\x66\x66iliate_location_feed_item\x18\x0f \x01(\x0b\x32:.google.ads.googleads.v10.common.AffiliateLocationFeedItemB\x03\xe0\x41\x03H\x00\x12X\n\x17hotel_callout_feed_item\x18\x17 \x01(\x0b\x32\x35.google.ads.googleads.v10.common.HotelCalloutFeedItemH\x00\x12N\n\x0fimage_feed_item\x18\x1f \x01(\x0b\x32..google.ads.googleads.v10.common.ImageFeedItemB\x03\xe0\x41\x05H\x00\x12\x43\n\x11targeted_campaign\x18\x1c \x01(\tB&\xfa\x41#\n!googleads.googleapis.com/CampaignH\x01\x12\x42\n\x11targeted_ad_group\x18\x1d \x01(\tB%\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x01:j\xea\x41g\n*googleads.googleapis.com/ExtensionFeedItem\x12\x39\x63ustomers/{customer_id}/extensionFeedItems/{feed_item_id}B\x0b\n\textensionB\x1c\n\x1aserving_resource_targetingB\x05\n\x03_idB\x12\n\x10_start_date_timeB\x10\n\x0e_end_date_timeB\x1f\n\x1d_targeted_geo_target_constantB\x88\x02\n&com.google.ads.googleads.v10.resourcesB\x16\x45xtensionFeedItemProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.extension_feed_item_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\026ExtensionFeedItemProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _EXTENSIONFEEDITEM.fields_by_name['resource_name']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A,\n*googleads.googleapis.com/ExtensionFeedItem'
  _EXTENSIONFEEDITEM.fields_by_name['id']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['id']._serialized_options = b'\340A\003'
  _EXTENSIONFEEDITEM.fields_by_name['extension_type']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['extension_type']._serialized_options = b'\340A\003'
  _EXTENSIONFEEDITEM.fields_by_name['targeted_geo_target_constant']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['targeted_geo_target_constant']._serialized_options = b'\372A,\n*googleads.googleapis.com/GeoTargetConstant'
  _EXTENSIONFEEDITEM.fields_by_name['status']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['status']._serialized_options = b'\340A\003'
  _EXTENSIONFEEDITEM.fields_by_name['location_feed_item']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['location_feed_item']._serialized_options = b'\340A\003'
  _EXTENSIONFEEDITEM.fields_by_name['affiliate_location_feed_item']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['affiliate_location_feed_item']._serialized_options = b'\340A\003'
  _EXTENSIONFEEDITEM.fields_by_name['image_feed_item']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['image_feed_item']._serialized_options = b'\340A\005'
  _EXTENSIONFEEDITEM.fields_by_name['targeted_campaign']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['targeted_campaign']._serialized_options = b'\372A#\n!googleads.googleapis.com/Campaign'
  _EXTENSIONFEEDITEM.fields_by_name['targeted_ad_group']._options = None
  _EXTENSIONFEEDITEM.fields_by_name['targeted_ad_group']._serialized_options = b'\372A\"\n googleads.googleapis.com/AdGroup'
  _EXTENSIONFEEDITEM._options = None
  _EXTENSIONFEEDITEM._serialized_options = b'\352Ag\n*googleads.googleapis.com/ExtensionFeedItem\0229customers/{customer_id}/extensionFeedItems/{feed_item_id}'
  _EXTENSIONFEEDITEM._serialized_start=429
  _EXTENSIONFEEDITEM._serialized_end=2492
# @@protoc_insertion_point(module_scope)
