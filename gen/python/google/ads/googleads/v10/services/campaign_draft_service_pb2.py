# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/campaign_draft_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v10.resources import campaign_draft_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_campaign__draft__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/ads/googleads/v10/services/campaign_draft_service.proto\x12!google.ads.googleads.v10.services\x1a:google/ads/googleads/v10/enums/response_content_type.proto\x1a\x37google/ads/googleads/v10/resources/campaign_draft.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xa7\x02\n\x1bMutateCampaignDraftsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12R\n\noperations\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v10.services.CampaignDraftOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType\"|\n\x1bPromoteCampaignDraftRequest\x12\x46\n\x0e\x63\x61mpaign_draft\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&googleads.googleapis.com/CampaignDraft\x12\x15\n\rvalidate_only\x18\x02 \x01(\x08\"\x9f\x02\n\x16\x43\x61mpaignDraftOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x43\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x31.google.ads.googleads.v10.resources.CampaignDraftH\x00\x12\x43\n\x06update\x18\x02 \x01(\x0b\x32\x31.google.ads.googleads.v10.resources.CampaignDraftH\x00\x12=\n\x06remove\x18\x03 \x01(\tB+\xfa\x41(\n&googleads.googleapis.com/CampaignDraftH\x00\x42\x0b\n\toperation\"\xa0\x01\n\x1cMutateCampaignDraftsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12M\n\x07results\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v10.services.MutateCampaignDraftResult\"\xaa\x01\n\x19MutateCampaignDraftResult\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xfa\x41(\n&googleads.googleapis.com/CampaignDraft\x12I\n\x0e\x63\x61mpaign_draft\x18\x02 \x01(\x0b\x32\x31.google.ads.googleads.v10.resources.CampaignDraft\"\x93\x01\n#ListCampaignDraftAsyncErrorsRequest\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xe0\x41\x02\xfa\x41(\n&googleads.googleapis.com/CampaignDraft\x12\x12\n\npage_token\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\"c\n$ListCampaignDraftAsyncErrorsResponse\x12\"\n\x06\x65rrors\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xe0\x06\n\x14\x43\x61mpaignDraftService\x12\xf1\x01\n\x14MutateCampaignDrafts\x12>.google.ads.googleads.v10.services.MutateCampaignDraftsRequest\x1a?.google.ads.googleads.v10.services.MutateCampaignDraftsResponse\"X\x82\xd3\xe4\x93\x02\x39\"4/v10/customers/{customer_id=*}/campaignDrafts:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x12\xff\x01\n\x14PromoteCampaignDraft\x12>.google.ads.googleads.v10.services.PromoteCampaignDraftRequest\x1a\x1d.google.longrunning.Operation\"\x87\x01\x82\xd3\xe4\x93\x02?\":/v10/{campaign_draft=customers/*/campaignDrafts/*}:promote:\x01*\xda\x41\x0e\x63\x61mpaign_draft\xca\x41.\n\x15google.protobuf.Empty\x12\x15google.protobuf.Empty\x12\x8a\x02\n\x1cListCampaignDraftAsyncErrors\x12\x46.google.ads.googleads.v10.services.ListCampaignDraftAsyncErrorsRequest\x1aG.google.ads.googleads.v10.services.ListCampaignDraftAsyncErrorsResponse\"Y\x82\xd3\xe4\x93\x02\x43\x12\x41/v10/{resource_name=customers/*/campaignDrafts/*}:listAsyncErrors\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x85\x02\n%com.google.ads.googleads.v10.servicesB\x19\x43\x61mpaignDraftServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.campaign_draft_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\031CampaignDraftServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATECAMPAIGNDRAFTSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECAMPAIGNDRAFTSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECAMPAIGNDRAFTSREQUEST.fields_by_name['operations']._options = None
  _MUTATECAMPAIGNDRAFTSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _PROMOTECAMPAIGNDRAFTREQUEST.fields_by_name['campaign_draft']._options = None
  _PROMOTECAMPAIGNDRAFTREQUEST.fields_by_name['campaign_draft']._serialized_options = b'\340A\002\372A(\n&googleads.googleapis.com/CampaignDraft'
  _CAMPAIGNDRAFTOPERATION.fields_by_name['remove']._options = None
  _CAMPAIGNDRAFTOPERATION.fields_by_name['remove']._serialized_options = b'\372A(\n&googleads.googleapis.com/CampaignDraft'
  _MUTATECAMPAIGNDRAFTRESULT.fields_by_name['resource_name']._options = None
  _MUTATECAMPAIGNDRAFTRESULT.fields_by_name['resource_name']._serialized_options = b'\372A(\n&googleads.googleapis.com/CampaignDraft'
  _LISTCAMPAIGNDRAFTASYNCERRORSREQUEST.fields_by_name['resource_name']._options = None
  _LISTCAMPAIGNDRAFTASYNCERRORSREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A(\n&googleads.googleapis.com/CampaignDraft'
  _CAMPAIGNDRAFTSERVICE._options = None
  _CAMPAIGNDRAFTSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CAMPAIGNDRAFTSERVICE.methods_by_name['MutateCampaignDrafts']._options = None
  _CAMPAIGNDRAFTSERVICE.methods_by_name['MutateCampaignDrafts']._serialized_options = b'\202\323\344\223\0029\"4/v10/customers/{customer_id=*}/campaignDrafts:mutate:\001*\332A\026customer_id,operations'
  _CAMPAIGNDRAFTSERVICE.methods_by_name['PromoteCampaignDraft']._options = None
  _CAMPAIGNDRAFTSERVICE.methods_by_name['PromoteCampaignDraft']._serialized_options = b'\202\323\344\223\002?\":/v10/{campaign_draft=customers/*/campaignDrafts/*}:promote:\001*\332A\016campaign_draft\312A.\n\025google.protobuf.Empty\022\025google.protobuf.Empty'
  _CAMPAIGNDRAFTSERVICE.methods_by_name['ListCampaignDraftAsyncErrors']._options = None
  _CAMPAIGNDRAFTSERVICE.methods_by_name['ListCampaignDraftAsyncErrors']._serialized_options = b'\202\323\344\223\002C\022A/v10/{resource_name=customers/*/campaignDrafts/*}:listAsyncErrors\332A\rresource_name'
  _MUTATECAMPAIGNDRAFTSREQUEST._serialized_start=430
  _MUTATECAMPAIGNDRAFTSREQUEST._serialized_end=725
  _PROMOTECAMPAIGNDRAFTREQUEST._serialized_start=727
  _PROMOTECAMPAIGNDRAFTREQUEST._serialized_end=851
  _CAMPAIGNDRAFTOPERATION._serialized_start=854
  _CAMPAIGNDRAFTOPERATION._serialized_end=1141
  _MUTATECAMPAIGNDRAFTSRESPONSE._serialized_start=1144
  _MUTATECAMPAIGNDRAFTSRESPONSE._serialized_end=1304
  _MUTATECAMPAIGNDRAFTRESULT._serialized_start=1307
  _MUTATECAMPAIGNDRAFTRESULT._serialized_end=1477
  _LISTCAMPAIGNDRAFTASYNCERRORSREQUEST._serialized_start=1480
  _LISTCAMPAIGNDRAFTASYNCERRORSREQUEST._serialized_end=1627
  _LISTCAMPAIGNDRAFTASYNCERRORSRESPONSE._serialized_start=1629
  _LISTCAMPAIGNDRAFTASYNCERRORSRESPONSE._serialized_end=1728
  _CAMPAIGNDRAFTSERVICE._serialized_start=1731
  _CAMPAIGNDRAFTSERVICE._serialized_end=2595
# @@protoc_insertion_point(module_scope)
