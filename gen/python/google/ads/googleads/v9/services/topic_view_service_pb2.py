# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/topic_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import topic_view_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_topic__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/ads/googleads/v9/services/topic_view_service.proto\x12 google.ads.googleads.v9.services\x1a\x32google/ads/googleads/v9/resources/topic_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"X\n\x13GetTopicViewRequest\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"googleads.googleapis.com/TopicView2\x95\x02\n\x10TopicViewService\x12\xb9\x01\n\x0cGetTopicView\x12\x35.google.ads.googleads.v9.services.GetTopicViewRequest\x1a,.google.ads.googleads.v9.resources.TopicView\"D\x82\xd3\xe4\x93\x02.\x12,/v9/{resource_name=customers/*/topicViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xfc\x01\n$com.google.ads.googleads.v9.servicesB\x15TopicViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.topic_view_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\025TopicViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETTOPICVIEWREQUEST.fields_by_name['resource_name']._options = None
  _GETTOPICVIEWREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A$\n\"googleads.googleapis.com/TopicView'
  _TOPICVIEWSERVICE._options = None
  _TOPICVIEWSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _TOPICVIEWSERVICE.methods_by_name['GetTopicView']._options = None
  _TOPICVIEWSERVICE.methods_by_name['GetTopicView']._serialized_options = b'\202\323\344\223\002.\022,/v9/{resource_name=customers/*/topicViews/*}\332A\rresource_name'
  _GETTOPICVIEWREQUEST._serialized_start=262
  _GETTOPICVIEWREQUEST._serialized_end=350
  _TOPICVIEWSERVICE._serialized_start=353
  _TOPICVIEWSERVICE._serialized_end=630
# @@protoc_insertion_point(module_scope)
