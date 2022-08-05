# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/campaign_shared_set.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import campaign_shared_set_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_campaign__shared__set__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n<google/ads/googleads/v10/resources/campaign_shared_set.proto\x12\"google.ads.googleads.v10.resources\x1a?google/ads/googleads/v10/enums/campaign_shared_set_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xe6\x03\n\x11\x43\x61mpaignSharedSet\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x05\xfa\x41,\n*googleads.googleapis.com/CampaignSharedSet\x12@\n\x08\x63\x61mpaign\x18\x05 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/CampaignH\x00\x88\x01\x01\x12\x43\n\nshared_set\x18\x06 \x01(\tB*\xe0\x41\x05\xfa\x41$\n\"googleads.googleapis.com/SharedSetH\x01\x88\x01\x01\x12h\n\x06status\x18\x02 \x01(\x0e\x32S.google.ads.googleads.v10.enums.CampaignSharedSetStatusEnum.CampaignSharedSetStatusB\x03\xe0\x41\x03:y\xea\x41v\n*googleads.googleapis.com/CampaignSharedSet\x12Hcustomers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}B\x0b\n\t_campaignB\r\n\x0b_shared_setB\x88\x02\n&com.google.ads.googleads.v10.resourcesB\x16\x43\x61mpaignSharedSetProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.campaign_shared_set_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\026CampaignSharedSetProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CAMPAIGNSHAREDSET.fields_by_name['resource_name']._options = None
  _CAMPAIGNSHAREDSET.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A,\n*googleads.googleapis.com/CampaignSharedSet'
  _CAMPAIGNSHAREDSET.fields_by_name['campaign']._options = None
  _CAMPAIGNSHAREDSET.fields_by_name['campaign']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Campaign'
  _CAMPAIGNSHAREDSET.fields_by_name['shared_set']._options = None
  _CAMPAIGNSHAREDSET.fields_by_name['shared_set']._serialized_options = b'\340A\005\372A$\n\"googleads.googleapis.com/SharedSet'
  _CAMPAIGNSHAREDSET.fields_by_name['status']._options = None
  _CAMPAIGNSHAREDSET.fields_by_name['status']._serialized_options = b'\340A\003'
  _CAMPAIGNSHAREDSET._options = None
  _CAMPAIGNSHAREDSET._serialized_options = b'\352Av\n*googleads.googleapis.com/CampaignSharedSet\022Hcustomers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}'
  _CAMPAIGNSHAREDSET._serialized_start=226
  _CAMPAIGNSHAREDSET._serialized_end=712
# @@protoc_insertion_point(module_scope)
