# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/resources/user_interest.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.common import criterion_category_availability_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_common_dot_criterion__category__availability__pb2
from google.ads.googleads.v12.enums import user_interest_taxonomy_type_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_user__interest__taxonomy__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/ads/googleads/v12/resources/user_interest.proto\x12\"google.ads.googleads.v12.resources\x1a\x45google/ads/googleads/v12/common/criterion_category_availability.proto\x1a@google/ads/googleads/v12/enums/user_interest_taxonomy_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x86\x05\n\x0cUserInterest\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xe0\x41\x03\xfa\x41\'\n%googleads.googleapis.com/UserInterest\x12q\n\rtaxonomy_type\x18\x02 \x01(\x0e\x32U.google.ads.googleads.v12.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyTypeB\x03\xe0\x41\x03\x12\"\n\x10user_interest_id\x18\x08 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x16\n\x04name\x18\t \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12P\n\x14user_interest_parent\x18\n \x01(\tB-\xe0\x41\x03\xfa\x41\'\n%googleads.googleapis.com/UserInterestH\x02\x88\x01\x01\x12!\n\x0flaunched_to_all\x18\x0b \x01(\x08\x42\x03\xe0\x41\x03H\x03\x88\x01\x01\x12[\n\x0e\x61vailabilities\x18\x07 \x03(\x0b\x32>.google.ads.googleads.v12.common.CriterionCategoryAvailabilityB\x03\xe0\x41\x03:d\xea\x41\x61\n%googleads.googleapis.com/UserInterest\x12\x38\x63ustomers/{customer_id}/userInterests/{user_interest_id}B\x13\n\x11_user_interest_idB\x07\n\x05_nameB\x17\n\x15_user_interest_parentB\x12\n\x10_launched_to_allB\x83\x02\n&com.google.ads.googleads.v12.resourcesB\x11UserInterestProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V12.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V12\\Resources\xea\x02&Google::Ads::GoogleAds::V12::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.resources.user_interest_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v12.resourcesB\021UserInterestProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources\352\002&Google::Ads::GoogleAds::V12::Resources'
  _USERINTEREST.fields_by_name['resource_name']._options = None
  _USERINTEREST.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A\'\n%googleads.googleapis.com/UserInterest'
  _USERINTEREST.fields_by_name['taxonomy_type']._options = None
  _USERINTEREST.fields_by_name['taxonomy_type']._serialized_options = b'\340A\003'
  _USERINTEREST.fields_by_name['user_interest_id']._options = None
  _USERINTEREST.fields_by_name['user_interest_id']._serialized_options = b'\340A\003'
  _USERINTEREST.fields_by_name['name']._options = None
  _USERINTEREST.fields_by_name['name']._serialized_options = b'\340A\003'
  _USERINTEREST.fields_by_name['user_interest_parent']._options = None
  _USERINTEREST.fields_by_name['user_interest_parent']._serialized_options = b'\340A\003\372A\'\n%googleads.googleapis.com/UserInterest'
  _USERINTEREST.fields_by_name['launched_to_all']._options = None
  _USERINTEREST.fields_by_name['launched_to_all']._serialized_options = b'\340A\003'
  _USERINTEREST.fields_by_name['availabilities']._options = None
  _USERINTEREST.fields_by_name['availabilities']._serialized_options = b'\340A\003'
  _USERINTEREST._options = None
  _USERINTEREST._serialized_options = b'\352Aa\n%googleads.googleapis.com/UserInterest\0228customers/{customer_id}/userInterests/{user_interest_id}'
  _USERINTEREST._serialized_start=292
  _USERINTEREST._serialized_end=938
# @@protoc_insertion_point(module_scope)