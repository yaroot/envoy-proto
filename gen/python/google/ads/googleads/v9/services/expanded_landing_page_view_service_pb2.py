# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/expanded_landing_page_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import expanded_landing_page_view_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_expanded__landing__page__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nIgoogle/ads/googleads/v9/services/expanded_landing_page_view_service.proto\x12 google.ads.googleads.v9.services\x1a\x42google/ads/googleads/v9/resources/expanded_landing_page_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"t\n!GetExpandedLandingPageViewRequest\x12O\n\rresource_name\x18\x01 \x01(\tB8\xe0\x41\x02\xfa\x41\x32\n0googleads.googleapis.com/ExpandedLandingPageView2\xdb\x02\n\x1e\x45xpandedLandingPageViewService\x12\xf1\x01\n\x1aGetExpandedLandingPageView\x12\x43.google.ads.googleads.v9.services.GetExpandedLandingPageViewRequest\x1a:.google.ads.googleads.v9.resources.ExpandedLandingPageView\"R\x82\xd3\xe4\x93\x02<\x12:/v9/{resource_name=customers/*/expandedLandingPageViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8a\x02\n$com.google.ads.googleads.v9.servicesB#ExpandedLandingPageViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.expanded_landing_page_view_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB#ExpandedLandingPageViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETEXPANDEDLANDINGPAGEVIEWREQUEST.fields_by_name['resource_name']._options = None
  _GETEXPANDEDLANDINGPAGEVIEWREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A2\n0googleads.googleapis.com/ExpandedLandingPageView'
  _EXPANDEDLANDINGPAGEVIEWSERVICE._options = None
  _EXPANDEDLANDINGPAGEVIEWSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _EXPANDEDLANDINGPAGEVIEWSERVICE.methods_by_name['GetExpandedLandingPageView']._options = None
  _EXPANDEDLANDINGPAGEVIEWSERVICE.methods_by_name['GetExpandedLandingPageView']._serialized_options = b'\202\323\344\223\002<\022:/v9/{resource_name=customers/*/expandedLandingPageViews/*}\332A\rresource_name'
  _GETEXPANDEDLANDINGPAGEVIEWREQUEST._serialized_start=294
  _GETEXPANDEDLANDINGPAGEVIEWREQUEST._serialized_end=410
  _EXPANDEDLANDINGPAGEVIEWSERVICE._serialized_start=413
  _EXPANDEDLANDINGPAGEVIEWSERVICE._serialized_end=760
# @@protoc_insertion_point(module_scope)
