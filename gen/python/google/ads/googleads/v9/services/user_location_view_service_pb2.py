# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/user_location_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import user_location_view_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_user__location__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nAgoogle/ads/googleads/v9/services/user_location_view_service.proto\x12 google.ads.googleads.v9.services\x1a:google/ads/googleads/v9/resources/user_location_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"f\n\x1aGetUserLocationViewRequest\x12H\n\rresource_name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)googleads.googleapis.com/UserLocationView2\xb8\x02\n\x17UserLocationViewService\x12\xd5\x01\n\x13GetUserLocationView\x12<.google.ads.googleads.v9.services.GetUserLocationViewRequest\x1a\x33.google.ads.googleads.v9.resources.UserLocationView\"K\x82\xd3\xe4\x93\x02\x35\x12\x33/v9/{resource_name=customers/*/userLocationViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x83\x02\n$com.google.ads.googleads.v9.servicesB\x1cUserLocationViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.user_location_view_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\034UserLocationViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETUSERLOCATIONVIEWREQUEST.fields_by_name['resource_name']._options = None
  _GETUSERLOCATIONVIEWREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A+\n)googleads.googleapis.com/UserLocationView'
  _USERLOCATIONVIEWSERVICE._options = None
  _USERLOCATIONVIEWSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _USERLOCATIONVIEWSERVICE.methods_by_name['GetUserLocationView']._options = None
  _USERLOCATIONVIEWSERVICE.methods_by_name['GetUserLocationView']._serialized_options = b'\202\323\344\223\0025\0223/v9/{resource_name=customers/*/userLocationViews/*}\332A\rresource_name'
  _GETUSERLOCATIONVIEWREQUEST._serialized_start=278
  _GETUSERLOCATIONVIEWREQUEST._serialized_end=380
  _USERLOCATIONVIEWSERVICE._serialized_start=383
  _USERLOCATIONVIEWSERVICE._serialized_end=695
# @@protoc_insertion_point(module_scope)
