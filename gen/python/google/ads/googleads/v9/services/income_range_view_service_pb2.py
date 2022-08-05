# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/income_range_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import income_range_view_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_income__range__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/ads/googleads/v9/services/income_range_view_service.proto\x12 google.ads.googleads.v9.services\x1a\x39google/ads/googleads/v9/resources/income_range_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"d\n\x19GetIncomeRangeViewRequest\x12G\n\rresource_name\x18\x01 \x01(\tB0\xe0\x41\x02\xfa\x41*\n(googleads.googleapis.com/IncomeRangeView2\xb3\x02\n\x16IncomeRangeViewService\x12\xd1\x01\n\x12GetIncomeRangeView\x12;.google.ads.googleads.v9.services.GetIncomeRangeViewRequest\x1a\x32.google.ads.googleads.v9.resources.IncomeRangeView\"J\x82\xd3\xe4\x93\x02\x34\x12\x32/v9/{resource_name=customers/*/incomeRangeViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x82\x02\n$com.google.ads.googleads.v9.servicesB\x1bIncomeRangeViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.income_range_view_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\033IncomeRangeViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETINCOMERANGEVIEWREQUEST.fields_by_name['resource_name']._options = None
  _GETINCOMERANGEVIEWREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A*\n(googleads.googleapis.com/IncomeRangeView'
  _INCOMERANGEVIEWSERVICE._options = None
  _INCOMERANGEVIEWSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _INCOMERANGEVIEWSERVICE.methods_by_name['GetIncomeRangeView']._options = None
  _INCOMERANGEVIEWSERVICE.methods_by_name['GetIncomeRangeView']._serialized_options = b'\202\323\344\223\0024\0222/v9/{resource_name=customers/*/incomeRangeViews/*}\332A\rresource_name'
  _GETINCOMERANGEVIEWREQUEST._serialized_start=276
  _GETINCOMERANGEVIEWREQUEST._serialized_end=376
  _INCOMERANGEVIEWSERVICE._serialized_start=379
  _INCOMERANGEVIEWSERVICE._serialized_end=686
# @@protoc_insertion_point(module_scope)
