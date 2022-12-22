# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/services/ad_group_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v12.resources import ad_group_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_resources_dot_ad__group__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8google/ads/googleads/v12/services/ad_group_service.proto\x12!google.ads.googleads.v12.services\x1a:google/ads/googleads/v12/enums/response_content_type.proto\x1a\x31google/ads/googleads/v12/resources/ad_group.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\x9b\x02\n\x15MutateAdGroupsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12L\n\noperations\x18\x02 \x03(\x0b\x32\x33.google.ads.googleads.v12.services.AdGroupOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v12.enums.ResponseContentTypeEnum.ResponseContentType\"\x87\x02\n\x10\x41\x64GroupOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12=\n\x06\x63reate\x18\x01 \x01(\x0b\x32+.google.ads.googleads.v12.resources.AdGroupH\x00\x12=\n\x06update\x18\x02 \x01(\x0b\x32+.google.ads.googleads.v12.resources.AdGroupH\x00\x12\x37\n\x06remove\x18\x03 \x01(\tB%\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x00\x42\x0b\n\toperation\"\x94\x01\n\x16MutateAdGroupsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12G\n\x07results\x18\x02 \x03(\x0b\x32\x36.google.ads.googleads.v12.services.MutateAdGroupResult\"\x92\x01\n\x13MutateAdGroupResult\x12<\n\rresource_name\x18\x01 \x01(\tB%\xfa\x41\"\n googleads.googleapis.com/AdGroup\x12=\n\x08\x61\x64_group\x18\x02 \x01(\x0b\x32+.google.ads.googleads.v12.resources.AdGroup2\xb3\x02\n\x0e\x41\x64GroupService\x12\xd9\x01\n\x0eMutateAdGroups\x12\x38.google.ads.googleads.v12.services.MutateAdGroupsRequest\x1a\x39.google.ads.googleads.v12.services.MutateAdGroupsResponse\"R\x82\xd3\xe4\x93\x02\x33\"./v12/customers/{customer_id=*}/adGroups:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\xff\x01\n%com.google.ads.googleads.v12.servicesB\x13\x41\x64GroupServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V12.Services\xca\x02!Google\\Ads\\GoogleAds\\V12\\Services\xea\x02%Google::Ads::GoogleAds::V12::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.services.ad_group_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v12.servicesB\023AdGroupServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Services\312\002!Google\\Ads\\GoogleAds\\V12\\Services\352\002%Google::Ads::GoogleAds::V12::Services'
  _MUTATEADGROUPSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEADGROUPSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEADGROUPSREQUEST.fields_by_name['operations']._options = None
  _MUTATEADGROUPSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ADGROUPOPERATION.fields_by_name['remove']._options = None
  _ADGROUPOPERATION.fields_by_name['remove']._serialized_options = b'\372A\"\n googleads.googleapis.com/AdGroup'
  _MUTATEADGROUPRESULT.fields_by_name['resource_name']._options = None
  _MUTATEADGROUPRESULT.fields_by_name['resource_name']._serialized_options = b'\372A\"\n googleads.googleapis.com/AdGroup'
  _ADGROUPSERVICE._options = None
  _ADGROUPSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ADGROUPSERVICE.methods_by_name['MutateAdGroups']._options = None
  _ADGROUPSERVICE.methods_by_name['MutateAdGroups']._serialized_options = b'\202\323\344\223\0023\"./v12/customers/{customer_id=*}/adGroups:mutate:\001*\332A\026customer_id,operations'
  _MUTATEADGROUPSREQUEST._serialized_start=381
  _MUTATEADGROUPSREQUEST._serialized_end=664
  _ADGROUPOPERATION._serialized_start=667
  _ADGROUPOPERATION._serialized_end=930
  _MUTATEADGROUPSRESPONSE._serialized_start=933
  _MUTATEADGROUPSRESPONSE._serialized_end=1081
  _MUTATEADGROUPRESULT._serialized_start=1084
  _MUTATEADGROUPRESULT._serialized_end=1230
  _ADGROUPSERVICE._serialized_start=1233
  _ADGROUPSERVICE._serialized_end=1540
# @@protoc_insertion_point(module_scope)