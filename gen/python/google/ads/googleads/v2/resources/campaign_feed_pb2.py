# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/resources/campaign_feed.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v2.common import matching_function_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_common_dot_matching__function__pb2
from google.ads.googleads.v2.enums import feed_link_status_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_feed__link__status__pb2
from google.ads.googleads.v2.enums import placeholder_type_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_placeholder__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/resources/campaign_feed.proto',
  package='google.ads.googleads.v2.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v2.resourcesB\021CampaignFeedProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v2/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V2.Resources\312\002!Google\\Ads\\GoogleAds\\V2\\Resources\352\002%Google::Ads::GoogleAds::V2::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5google/ads/googleads/v2/resources/campaign_feed.proto\x12!google.ads.googleads.v2.resources\x1a\x36google/ads/googleads/v2/common/matching_function.proto\x1a\x34google/ads/googleads/v2/enums/feed_link_status.proto\x1a\x34google/ads/googleads/v2/enums/placeholder_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xe5\x04\n\x0c\x43\x61mpaignFeed\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x05\xfa\x41\'\n%googleads.googleapis.com/CampaignFeed\x12Q\n\x04\x66\x65\x65\x64\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.StringValueB%\xe0\x41\x05\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/Feed\x12Y\n\x08\x63\x61mpaign\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValueB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/Campaign\x12]\n\x11placeholder_types\x18\x04 \x03(\x0e\x32\x42.google.ads.googleads.v2.enums.PlaceholderTypeEnum.PlaceholderType\x12K\n\x11matching_function\x18\x05 \x01(\x0b\x32\x30.google.ads.googleads.v2.common.MatchingFunction\x12U\n\x06status\x18\x06 \x01(\x0e\x32@.google.ads.googleads.v2.enums.FeedLinkStatusEnum.FeedLinkStatusB\x03\xe0\x41\x03:^\xea\x41[\n%googleads.googleapis.com/CampaignFeed\x12\x32\x63ustomers/{customer}/campaignFeeds/{campaign_feed}B\xfe\x01\n%com.google.ads.googleads.v2.resourcesB\x11\x43\x61mpaignFeedProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v2/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V2.Resources\xca\x02!Google\\Ads\\GoogleAds\\V2\\Resources\xea\x02%Google::Ads::GoogleAds::V2::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v2_dot_common_dot_matching__function__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_feed__link__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_placeholder__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CAMPAIGNFEED = _descriptor.Descriptor(
  name='CampaignFeed',
  full_name='google.ads.googleads.v2.resources.CampaignFeed',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.resources.CampaignFeed.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\'\n%googleads.googleapis.com/CampaignFeed', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed', full_name='google.ads.googleads.v2.resources.CampaignFeed.feed', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\037\n\035googleads.googleapis.com/Feed', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign', full_name='google.ads.googleads.v2.resources.CampaignFeed.campaign', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/Campaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='placeholder_types', full_name='google.ads.googleads.v2.resources.CampaignFeed.placeholder_types', index=3,
      number=4, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='matching_function', full_name='google.ads.googleads.v2.resources.CampaignFeed.matching_function', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v2.resources.CampaignFeed.status', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A[\n%googleads.googleapis.com/CampaignFeed\0222customers/{customer}/campaignFeeds/{campaign_feed}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=379,
  serialized_end=992,
)

_CAMPAIGNFEED.fields_by_name['feed'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CAMPAIGNFEED.fields_by_name['campaign'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_CAMPAIGNFEED.fields_by_name['placeholder_types'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_placeholder__type__pb2._PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE
_CAMPAIGNFEED.fields_by_name['matching_function'].message_type = google_dot_ads_dot_googleads_dot_v2_dot_common_dot_matching__function__pb2._MATCHINGFUNCTION
_CAMPAIGNFEED.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v2_dot_enums_dot_feed__link__status__pb2._FEEDLINKSTATUSENUM_FEEDLINKSTATUS
DESCRIPTOR.message_types_by_name['CampaignFeed'] = _CAMPAIGNFEED
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CampaignFeed = _reflection.GeneratedProtocolMessageType('CampaignFeed', (_message.Message,), {
  'DESCRIPTOR' : _CAMPAIGNFEED,
  '__module__' : 'google.ads.googleads.v2.resources.campaign_feed_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.resources.CampaignFeed)
  })
_sym_db.RegisterMessage(CampaignFeed)


DESCRIPTOR._options = None
_CAMPAIGNFEED.fields_by_name['resource_name']._options = None
_CAMPAIGNFEED.fields_by_name['feed']._options = None
_CAMPAIGNFEED.fields_by_name['campaign']._options = None
_CAMPAIGNFEED.fields_by_name['status']._options = None
_CAMPAIGNFEED._options = None
# @@protoc_insertion_point(module_scope)
