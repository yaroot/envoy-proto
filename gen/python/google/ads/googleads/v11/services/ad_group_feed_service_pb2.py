# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/ad_group_feed_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v11.resources import ad_group_feed_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_ad__group__feed__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n=google/ads/googleads/v11/services/ad_group_feed_service.proto\x12!google.ads.googleads.v11.services\x1a:google/ads/googleads/v11/enums/response_content_type.proto\x1a\x36google/ads/googleads/v11/resources/ad_group_feed.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xa3\x02\n\x19MutateAdGroupFeedsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12P\n\noperations\x18\x02 \x03(\x0b\x32\x37.google.ads.googleads.v11.services.AdGroupFeedOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType\"\x97\x02\n\x14\x41\x64GroupFeedOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x41\n\x06\x63reate\x18\x01 \x01(\x0b\x32/.google.ads.googleads.v11.resources.AdGroupFeedH\x00\x12\x41\n\x06update\x18\x02 \x01(\x0b\x32/.google.ads.googleads.v11.resources.AdGroupFeedH\x00\x12;\n\x06remove\x18\x03 \x01(\tB)\xfa\x41&\n$googleads.googleapis.com/AdGroupFeedH\x00\x42\x0b\n\toperation\"\x9c\x01\n\x1aMutateAdGroupFeedsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12K\n\x07results\x18\x02 \x03(\x0b\x32:.google.ads.googleads.v11.services.MutateAdGroupFeedResult\"\xa3\x01\n\x17MutateAdGroupFeedResult\x12@\n\rresource_name\x18\x01 \x01(\tB)\xfa\x41&\n$googleads.googleapis.com/AdGroupFeed\x12\x46\n\rad_group_feed\x18\x02 \x01(\x0b\x32/.google.ads.googleads.v11.resources.AdGroupFeed2\xc7\x02\n\x12\x41\x64GroupFeedService\x12\xe9\x01\n\x12MutateAdGroupFeeds\x12<.google.ads.googleads.v11.services.MutateAdGroupFeedsRequest\x1a=.google.ads.googleads.v11.services.MutateAdGroupFeedsResponse\"V\x82\xd3\xe4\x93\x02\x37\"2/v11/customers/{customer_id=*}/adGroupFeeds:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x83\x02\n%com.google.ads.googleads.v11.servicesB\x17\x41\x64GroupFeedServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.ad_group_feed_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\027AdGroupFeedServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATEADGROUPFEEDSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEADGROUPFEEDSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEADGROUPFEEDSREQUEST.fields_by_name['operations']._options = None
  _MUTATEADGROUPFEEDSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ADGROUPFEEDOPERATION.fields_by_name['remove']._options = None
  _ADGROUPFEEDOPERATION.fields_by_name['remove']._serialized_options = b'\372A&\n$googleads.googleapis.com/AdGroupFeed'
  _MUTATEADGROUPFEEDRESULT.fields_by_name['resource_name']._options = None
  _MUTATEADGROUPFEEDRESULT.fields_by_name['resource_name']._serialized_options = b'\372A&\n$googleads.googleapis.com/AdGroupFeed'
  _ADGROUPFEEDSERVICE._options = None
  _ADGROUPFEEDSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ADGROUPFEEDSERVICE.methods_by_name['MutateAdGroupFeeds']._options = None
  _ADGROUPFEEDSERVICE.methods_by_name['MutateAdGroupFeeds']._serialized_options = b'\202\323\344\223\0027\"2/v11/customers/{customer_id=*}/adGroupFeeds:mutate:\001*\332A\026customer_id,operations'
  _MUTATEADGROUPFEEDSREQUEST._serialized_start=391
  _MUTATEADGROUPFEEDSREQUEST._serialized_end=682
  _ADGROUPFEEDOPERATION._serialized_start=685
  _ADGROUPFEEDOPERATION._serialized_end=964
  _MUTATEADGROUPFEEDSRESPONSE._serialized_start=967
  _MUTATEADGROUPFEEDSRESPONSE._serialized_end=1123
  _MUTATEADGROUPFEEDRESULT._serialized_start=1126
  _MUTATEADGROUPFEEDRESULT._serialized_end=1289
  _ADGROUPFEEDSERVICE._serialized_start=1292
  _ADGROUPFEEDSERVICE._serialized_end=1619
# @@protoc_insertion_point(module_scope)
