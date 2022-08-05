# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/user_interest_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import user_interest_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_user__interest__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n<google/ads/googleads/v9/services/user_interest_service.proto\x12 google.ads.googleads.v9.services\x1a\x35google/ads/googleads/v9/resources/user_interest.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"^\n\x16GetUserInterestRequest\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%googleads.googleapis.com/UserInterest2\xa4\x02\n\x13UserInterestService\x12\xc5\x01\n\x0fGetUserInterest\x12\x38.google.ads.googleads.v9.services.GetUserInterestRequest\x1a/.google.ads.googleads.v9.resources.UserInterest\"G\x82\xd3\xe4\x93\x02\x31\x12//v9/{resource_name=customers/*/userInterests/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xff\x01\n$com.google.ads.googleads.v9.servicesB\x18UserInterestServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.user_interest_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\030UserInterestServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETUSERINTERESTREQUEST.fields_by_name['resource_name']._options = None
  _GETUSERINTERESTREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A\'\n%googleads.googleapis.com/UserInterest'
  _USERINTERESTSERVICE._options = None
  _USERINTERESTSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _USERINTERESTSERVICE.methods_by_name['GetUserInterest']._options = None
  _USERINTERESTSERVICE.methods_by_name['GetUserInterest']._serialized_options = b'\202\323\344\223\0021\022//v9/{resource_name=customers/*/userInterests/*}\332A\rresource_name'
  _GETUSERINTERESTREQUEST._serialized_start=268
  _GETUSERINTERESTREQUEST._serialized_end=362
  _USERINTERESTSERVICE._serialized_start=365
  _USERINTERESTSERVICE._serialized_end=657
# @@protoc_insertion_point(module_scope)
