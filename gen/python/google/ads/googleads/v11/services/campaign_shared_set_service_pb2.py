# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/campaign_shared_set_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v11.resources import campaign_shared_set_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_campaign__shared__set__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nCgoogle/ads/googleads/v11/services/campaign_shared_set_service.proto\x12!google.ads.googleads.v11.services\x1a:google/ads/googleads/v11/enums/response_content_type.proto\x1a<google/ads/googleads/v11/resources/campaign_shared_set.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xaf\x02\n\x1fMutateCampaignSharedSetsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\noperations\x18\x02 \x03(\x0b\x32=.google.ads.googleads.v11.services.CampaignSharedSetOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType\"\xb5\x01\n\x1a\x43\x61mpaignSharedSetOperation\x12G\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x35.google.ads.googleads.v11.resources.CampaignSharedSetH\x00\x12\x41\n\x06remove\x18\x03 \x01(\tB/\xfa\x41,\n*googleads.googleapis.com/CampaignSharedSetH\x00\x42\x0b\n\toperation\"\xa8\x01\n MutateCampaignSharedSetsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Q\n\x07results\x18\x02 \x03(\x0b\x32@.google.ads.googleads.v11.services.MutateCampaignSharedSetResult\"\xbb\x01\n\x1dMutateCampaignSharedSetResult\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xfa\x41,\n*googleads.googleapis.com/CampaignSharedSet\x12R\n\x13\x63\x61mpaign_shared_set\x18\x02 \x01(\x0b\x32\x35.google.ads.googleads.v11.resources.CampaignSharedSet2\xe5\x02\n\x18\x43\x61mpaignSharedSetService\x12\x81\x02\n\x18MutateCampaignSharedSets\x12\x42.google.ads.googleads.v11.services.MutateCampaignSharedSetsRequest\x1a\x43.google.ads.googleads.v11.services.MutateCampaignSharedSetsResponse\"\\\x82\xd3\xe4\x93\x02=\"8/v11/customers/{customer_id=*}/campaignSharedSets:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x89\x02\n%com.google.ads.googleads.v11.servicesB\x1d\x43\x61mpaignSharedSetServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.campaign_shared_set_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\035CampaignSharedSetServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATECAMPAIGNSHAREDSETSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECAMPAIGNSHAREDSETSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECAMPAIGNSHAREDSETSREQUEST.fields_by_name['operations']._options = None
  _MUTATECAMPAIGNSHAREDSETSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CAMPAIGNSHAREDSETOPERATION.fields_by_name['remove']._options = None
  _CAMPAIGNSHAREDSETOPERATION.fields_by_name['remove']._serialized_options = b'\372A,\n*googleads.googleapis.com/CampaignSharedSet'
  _MUTATECAMPAIGNSHAREDSETRESULT.fields_by_name['resource_name']._options = None
  _MUTATECAMPAIGNSHAREDSETRESULT.fields_by_name['resource_name']._serialized_options = b'\372A,\n*googleads.googleapis.com/CampaignSharedSet'
  _CAMPAIGNSHAREDSETSERVICE._options = None
  _CAMPAIGNSHAREDSETSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CAMPAIGNSHAREDSETSERVICE.methods_by_name['MutateCampaignSharedSets']._options = None
  _CAMPAIGNSHAREDSETSERVICE.methods_by_name['MutateCampaignSharedSets']._serialized_options = b'\202\323\344\223\002=\"8/v11/customers/{customer_id=*}/campaignSharedSets:mutate:\001*\332A\026customer_id,operations'
  _MUTATECAMPAIGNSHAREDSETSREQUEST._serialized_start=369
  _MUTATECAMPAIGNSHAREDSETSREQUEST._serialized_end=672
  _CAMPAIGNSHAREDSETOPERATION._serialized_start=675
  _CAMPAIGNSHAREDSETOPERATION._serialized_end=856
  _MUTATECAMPAIGNSHAREDSETSRESPONSE._serialized_start=859
  _MUTATECAMPAIGNSHAREDSETSRESPONSE._serialized_end=1027
  _MUTATECAMPAIGNSHAREDSETRESULT._serialized_start=1030
  _MUTATECAMPAIGNSHAREDSETRESULT._serialized_end=1217
  _CAMPAIGNSHAREDSETSERVICE._serialized_start=1220
  _CAMPAIGNSHAREDSETSERVICE._serialized_end=1577
# @@protoc_insertion_point(module_scope)