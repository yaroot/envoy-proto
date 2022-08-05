# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/geographic_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import geographic_view_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_geographic__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/ads/googleads/v9/services/geographic_view_service.proto\x12 google.ads.googleads.v9.services\x1a\x37google/ads/googleads/v9/resources/geographic_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"b\n\x18GetGeographicViewRequest\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'googleads.googleapis.com/GeographicView2\xae\x02\n\x15GeographicViewService\x12\xcd\x01\n\x11GetGeographicView\x12:.google.ads.googleads.v9.services.GetGeographicViewRequest\x1a\x31.google.ads.googleads.v9.resources.GeographicView\"I\x82\xd3\xe4\x93\x02\x33\x12\x31/v9/{resource_name=customers/*/geographicViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x81\x02\n$com.google.ads.googleads.v9.servicesB\x1aGeographicViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.geographic_view_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\032GeographicViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETGEOGRAPHICVIEWREQUEST.fields_by_name['resource_name']._options = None
  _GETGEOGRAPHICVIEWREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A)\n\'googleads.googleapis.com/GeographicView'
  _GEOGRAPHICVIEWSERVICE._options = None
  _GEOGRAPHICVIEWSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _GEOGRAPHICVIEWSERVICE.methods_by_name['GetGeographicView']._options = None
  _GEOGRAPHICVIEWSERVICE.methods_by_name['GetGeographicView']._serialized_options = b'\202\323\344\223\0023\0221/v9/{resource_name=customers/*/geographicViews/*}\332A\rresource_name'
  _GETGEOGRAPHICVIEWREQUEST._serialized_start=272
  _GETGEOGRAPHICVIEWREQUEST._serialized_end=370
  _GEOGRAPHICVIEWSERVICE._serialized_start=373
  _GEOGRAPHICVIEWSERVICE._serialized_end=675
# @@protoc_insertion_point(module_scope)
