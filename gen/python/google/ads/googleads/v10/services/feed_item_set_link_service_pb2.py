# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/feed_item_set_link_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.resources import feed_item_set_link_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_feed__item__set__link__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nBgoogle/ads/googleads/v10/services/feed_item_set_link_service.proto\x12!google.ads.googleads.v10.services\x1a;google/ads/googleads/v10/resources/feed_item_set_link.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xbf\x01\n\x1dMutateFeedItemSetLinksRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12T\n\noperations\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v10.services.FeedItemSetLinkOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xaf\x01\n\x18\x46\x65\x65\x64ItemSetLinkOperation\x12\x45\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x33.google.ads.googleads.v10.resources.FeedItemSetLinkH\x00\x12?\n\x06remove\x18\x02 \x01(\tB-\xfa\x41*\n(googleads.googleapis.com/FeedItemSetLinkH\x00\x42\x0b\n\toperation\"\xa4\x01\n\x1eMutateFeedItemSetLinksResponse\x12O\n\x07results\x18\x01 \x03(\x0b\x32>.google.ads.googleads.v10.services.MutateFeedItemSetLinkResult\x12\x31\n\x15partial_failure_error\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\"c\n\x1bMutateFeedItemSetLinkResult\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xfa\x41*\n(googleads.googleapis.com/FeedItemSetLink2\xdb\x02\n\x16\x46\x65\x65\x64ItemSetLinkService\x12\xf9\x01\n\x16MutateFeedItemSetLinks\x12@.google.ads.googleads.v10.services.MutateFeedItemSetLinksRequest\x1a\x41.google.ads.googleads.v10.services.MutateFeedItemSetLinksResponse\"Z\x82\xd3\xe4\x93\x02;\"6/v10/customers/{customer_id=*}/feedItemSetLinks:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x87\x02\n%com.google.ads.googleads.v10.servicesB\x1b\x46\x65\x65\x64ItemSetLinkServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.feed_item_set_link_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\033FeedItemSetLinkServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEFEEDITEMSETLINKSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEFEEDITEMSETLINKSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEFEEDITEMSETLINKSREQUEST.fields_by_name['operations']._options = None
  _MUTATEFEEDITEMSETLINKSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _FEEDITEMSETLINKOPERATION.fields_by_name['remove']._options = None
  _FEEDITEMSETLINKOPERATION.fields_by_name['remove']._serialized_options = b'\372A*\n(googleads.googleapis.com/FeedItemSetLink'
  _MUTATEFEEDITEMSETLINKRESULT.fields_by_name['resource_name']._options = None
  _MUTATEFEEDITEMSETLINKRESULT.fields_by_name['resource_name']._serialized_options = b'\372A*\n(googleads.googleapis.com/FeedItemSetLink'
  _FEEDITEMSETLINKSERVICE._options = None
  _FEEDITEMSETLINKSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _FEEDITEMSETLINKSERVICE.methods_by_name['MutateFeedItemSetLinks']._options = None
  _FEEDITEMSETLINKSERVICE.methods_by_name['MutateFeedItemSetLinks']._serialized_options = b'\202\323\344\223\002;\"6/v10/customers/{customer_id=*}/feedItemSetLinks:mutate:\001*\332A\026customer_id,operations'
  _MUTATEFEEDITEMSETLINKSREQUEST._serialized_start=307
  _MUTATEFEEDITEMSETLINKSREQUEST._serialized_end=498
  _FEEDITEMSETLINKOPERATION._serialized_start=501
  _FEEDITEMSETLINKOPERATION._serialized_end=676
  _MUTATEFEEDITEMSETLINKSRESPONSE._serialized_start=679
  _MUTATEFEEDITEMSETLINKSRESPONSE._serialized_end=843
  _MUTATEFEEDITEMSETLINKRESULT._serialized_start=845
  _MUTATEFEEDITEMSETLINKRESULT._serialized_end=944
  _FEEDITEMSETLINKSERVICE._serialized_start=947
  _FEEDITEMSETLINKSERVICE._serialized_end=1294
# @@protoc_insertion_point(module_scope)
