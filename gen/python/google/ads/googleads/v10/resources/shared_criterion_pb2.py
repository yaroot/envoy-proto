# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/shared_criterion.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_criteria__pb2
from google.ads.googleads.v10.enums import criterion_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_criterion__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9google/ads/googleads/v10/resources/shared_criterion.proto\x12\"google.ads.googleads.v10.resources\x1a.google/ads/googleads/v10/common/criteria.proto\x1a\x33google/ads/googleads/v10/enums/criterion_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xa3\x07\n\x0fSharedCriterion\x12G\n\rresource_name\x18\x01 \x01(\tB0\xe0\x41\x05\xfa\x41*\n(googleads.googleapis.com/SharedCriterion\x12\x43\n\nshared_set\x18\n \x01(\tB*\xe0\x41\x05\xfa\x41$\n\"googleads.googleapis.com/SharedSetH\x01\x88\x01\x01\x12\x1e\n\x0c\x63riterion_id\x18\x0b \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12R\n\x04type\x18\x04 \x01(\x0e\x32?.google.ads.googleads.v10.enums.CriterionTypeEnum.CriterionTypeB\x03\xe0\x41\x03\x12\x44\n\x07keyword\x18\x03 \x01(\x0b\x32,.google.ads.googleads.v10.common.KeywordInfoB\x03\xe0\x41\x05H\x00\x12O\n\ryoutube_video\x18\x05 \x01(\x0b\x32\x31.google.ads.googleads.v10.common.YouTubeVideoInfoB\x03\xe0\x41\x05H\x00\x12S\n\x0fyoutube_channel\x18\x06 \x01(\x0b\x32\x33.google.ads.googleads.v10.common.YouTubeChannelInfoB\x03\xe0\x41\x05H\x00\x12H\n\tplacement\x18\x07 \x01(\x0b\x32..google.ads.googleads.v10.common.PlacementInfoB\x03\xe0\x41\x05H\x00\x12Z\n\x13mobile_app_category\x18\x08 \x01(\x0b\x32\x36.google.ads.googleads.v10.common.MobileAppCategoryInfoB\x03\xe0\x41\x05H\x00\x12Y\n\x12mobile_application\x18\t \x01(\x0b\x32\x36.google.ads.googleads.v10.common.MobileApplicationInfoB\x03\xe0\x41\x05H\x00:t\xea\x41q\n(googleads.googleapis.com/SharedCriterion\x12\x45\x63ustomers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}B\x0b\n\tcriterionB\r\n\x0b_shared_setB\x0f\n\r_criterion_idB\x86\x02\n&com.google.ads.googleads.v10.resourcesB\x14SharedCriterionProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.shared_criterion_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\024SharedCriterionProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _SHAREDCRITERION.fields_by_name['resource_name']._options = None
  _SHAREDCRITERION.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A*\n(googleads.googleapis.com/SharedCriterion'
  _SHAREDCRITERION.fields_by_name['shared_set']._options = None
  _SHAREDCRITERION.fields_by_name['shared_set']._serialized_options = b'\340A\005\372A$\n\"googleads.googleapis.com/SharedSet'
  _SHAREDCRITERION.fields_by_name['criterion_id']._options = None
  _SHAREDCRITERION.fields_by_name['criterion_id']._serialized_options = b'\340A\003'
  _SHAREDCRITERION.fields_by_name['type']._options = None
  _SHAREDCRITERION.fields_by_name['type']._serialized_options = b'\340A\003'
  _SHAREDCRITERION.fields_by_name['keyword']._options = None
  _SHAREDCRITERION.fields_by_name['keyword']._serialized_options = b'\340A\005'
  _SHAREDCRITERION.fields_by_name['youtube_video']._options = None
  _SHAREDCRITERION.fields_by_name['youtube_video']._serialized_options = b'\340A\005'
  _SHAREDCRITERION.fields_by_name['youtube_channel']._options = None
  _SHAREDCRITERION.fields_by_name['youtube_channel']._serialized_options = b'\340A\005'
  _SHAREDCRITERION.fields_by_name['placement']._options = None
  _SHAREDCRITERION.fields_by_name['placement']._serialized_options = b'\340A\005'
  _SHAREDCRITERION.fields_by_name['mobile_app_category']._options = None
  _SHAREDCRITERION.fields_by_name['mobile_app_category']._serialized_options = b'\340A\005'
  _SHAREDCRITERION.fields_by_name['mobile_application']._options = None
  _SHAREDCRITERION.fields_by_name['mobile_application']._serialized_options = b'\340A\005'
  _SHAREDCRITERION._options = None
  _SHAREDCRITERION._serialized_options = b'\352Aq\n(googleads.googleapis.com/SharedCriterion\022Ecustomers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}'
  _SHAREDCRITERION._serialized_start=259
  _SHAREDCRITERION._serialized_end=1190
# @@protoc_insertion_point(module_scope)
