# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/campaign_experiment_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v10.resources import campaign_experiment_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_campaign__experiment__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nCgoogle/ads/googleads/v10/services/campaign_experiment_service.proto\x12!google.ads.googleads.v10.services\x1a:google/ads/googleads/v10/enums/response_content_type.proto\x1a<google/ads/googleads/v10/resources/campaign_experiment.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xb1\x02\n MutateCampaignExperimentsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12W\n\noperations\x18\x02 \x03(\x0b\x32>.google.ads.googleads.v10.services.CampaignExperimentOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType\"\xe9\x01\n\x1b\x43\x61mpaignExperimentOperation\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12H\n\x06update\x18\x01 \x01(\x0b\x32\x36.google.ads.googleads.v10.resources.CampaignExperimentH\x00\x12\x42\n\x06remove\x18\x02 \x01(\tB0\xfa\x41-\n+googleads.googleapis.com/CampaignExperimentH\x00\x42\x0b\n\toperation\"\xaa\x01\n!MutateCampaignExperimentsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12R\n\x07results\x18\x02 \x03(\x0b\x32\x41.google.ads.googleads.v10.services.MutateCampaignExperimentResult\"\xbe\x01\n\x1eMutateCampaignExperimentResult\x12G\n\rresource_name\x18\x01 \x01(\tB0\xfa\x41-\n+googleads.googleapis.com/CampaignExperiment\x12S\n\x13\x63\x61mpaign_experiment\x18\x02 \x01(\x0b\x32\x36.google.ads.googleads.v10.resources.CampaignExperiment\"\xac\x01\n\x1f\x43reateCampaignExperimentRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\x13\x63\x61mpaign_experiment\x18\x02 \x01(\x0b\x32\x36.google.ads.googleads.v10.resources.CampaignExperimentB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"?\n CreateCampaignExperimentMetadata\x12\x1b\n\x13\x63\x61mpaign_experiment\x18\x01 \x01(\t\"\xaa\x01\n!GraduateCampaignExperimentRequest\x12P\n\x13\x63\x61mpaign_experiment\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/CampaignExperiment\x12\x1c\n\x0f\x63\x61mpaign_budget\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\"@\n\"GraduateCampaignExperimentResponse\x12\x1a\n\x12graduated_campaign\x18\x01 \x01(\t\"\x8b\x01\n PromoteCampaignExperimentRequest\x12P\n\x13\x63\x61mpaign_experiment\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/CampaignExperiment\x12\x15\n\rvalidate_only\x18\x02 \x01(\x08\"\x87\x01\n\x1c\x45ndCampaignExperimentRequest\x12P\n\x13\x63\x61mpaign_experiment\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/CampaignExperiment\x12\x15\n\rvalidate_only\x18\x02 \x01(\x08\"\x9d\x01\n(ListCampaignExperimentAsyncErrorsRequest\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+googleads.googleapis.com/CampaignExperiment\x12\x12\n\npage_token\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\"h\n)ListCampaignExperimentAsyncErrorsResponse\x12\"\n\x06\x65rrors\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xe7\r\n\x19\x43\x61mpaignExperimentService\x12\xc4\x02\n\x18\x43reateCampaignExperiment\x12\x42.google.ads.googleads.v10.services.CreateCampaignExperimentRequest\x1a\x1d.google.longrunning.Operation\"\xc4\x01\x82\xd3\xe4\x93\x02>\"9/v10/customers/{customer_id=*}/campaignExperiments:create:\x01*\xda\x41\x1f\x63ustomer_id,campaign_experiment\xca\x41[\n\x15google.protobuf.Empty\x12\x42google.ads.googleads.v10.services.CreateCampaignExperimentMetadata\x12\x85\x02\n\x19MutateCampaignExperiments\x12\x43.google.ads.googleads.v10.services.MutateCampaignExperimentsRequest\x1a\x44.google.ads.googleads.v10.services.MutateCampaignExperimentsResponse\"]\x82\xd3\xe4\x93\x02>\"9/v10/customers/{customer_id=*}/campaignExperiments:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x12\xa1\x02\n\x1aGraduateCampaignExperiment\x12\x44.google.ads.googleads.v10.services.GraduateCampaignExperimentRequest\x1a\x45.google.ads.googleads.v10.services.GraduateCampaignExperimentResponse\"v\x82\xd3\xe4\x93\x02J\"E/v10/{campaign_experiment=customers/*/campaignExperiments/*}:graduate:\x01*\xda\x41#campaign_experiment,campaign_budget\x12\x98\x02\n\x19PromoteCampaignExperiment\x12\x43.google.ads.googleads.v10.services.PromoteCampaignExperimentRequest\x1a\x1d.google.longrunning.Operation\"\x96\x01\x82\xd3\xe4\x93\x02I\"D/v10/{campaign_experiment=customers/*/campaignExperiments/*}:promote:\x01*\xda\x41\x13\x63\x61mpaign_experiment\xca\x41.\n\x15google.protobuf.Empty\x12\x15google.protobuf.Empty\x12\xd3\x01\n\x15\x45ndCampaignExperiment\x12?.google.ads.googleads.v10.services.EndCampaignExperimentRequest\x1a\x16.google.protobuf.Empty\"a\x82\xd3\xe4\x93\x02\x45\"@/v10/{campaign_experiment=customers/*/campaignExperiments/*}:end:\x01*\xda\x41\x13\x63\x61mpaign_experiment\x12\x9e\x02\n!ListCampaignExperimentAsyncErrors\x12K.google.ads.googleads.v10.services.ListCampaignExperimentAsyncErrorsRequest\x1aL.google.ads.googleads.v10.services.ListCampaignExperimentAsyncErrorsResponse\"^\x82\xd3\xe4\x93\x02H\x12\x46/v10/{resource_name=customers/*/campaignExperiments/*}:listAsyncErrors\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8a\x02\n%com.google.ads.googleads.v10.servicesB\x1e\x43\x61mpaignExperimentServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.campaign_experiment_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\036CampaignExperimentServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATECAMPAIGNEXPERIMENTSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECAMPAIGNEXPERIMENTSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECAMPAIGNEXPERIMENTSREQUEST.fields_by_name['operations']._options = None
  _MUTATECAMPAIGNEXPERIMENTSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CAMPAIGNEXPERIMENTOPERATION.fields_by_name['remove']._options = None
  _CAMPAIGNEXPERIMENTOPERATION.fields_by_name['remove']._serialized_options = b'\372A-\n+googleads.googleapis.com/CampaignExperiment'
  _MUTATECAMPAIGNEXPERIMENTRESULT.fields_by_name['resource_name']._options = None
  _MUTATECAMPAIGNEXPERIMENTRESULT.fields_by_name['resource_name']._serialized_options = b'\372A-\n+googleads.googleapis.com/CampaignExperiment'
  _CREATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['customer_id']._options = None
  _CREATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _CREATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._options = None
  _CREATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._serialized_options = b'\340A\002'
  _GRADUATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._options = None
  _GRADUATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._serialized_options = b'\340A\002\372A-\n+googleads.googleapis.com/CampaignExperiment'
  _GRADUATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_budget']._options = None
  _GRADUATECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_budget']._serialized_options = b'\340A\002'
  _PROMOTECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._options = None
  _PROMOTECAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._serialized_options = b'\340A\002\372A-\n+googleads.googleapis.com/CampaignExperiment'
  _ENDCAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._options = None
  _ENDCAMPAIGNEXPERIMENTREQUEST.fields_by_name['campaign_experiment']._serialized_options = b'\340A\002\372A-\n+googleads.googleapis.com/CampaignExperiment'
  _LISTCAMPAIGNEXPERIMENTASYNCERRORSREQUEST.fields_by_name['resource_name']._options = None
  _LISTCAMPAIGNEXPERIMENTASYNCERRORSREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A-\n+googleads.googleapis.com/CampaignExperiment'
  _CAMPAIGNEXPERIMENTSERVICE._options = None
  _CAMPAIGNEXPERIMENTSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['CreateCampaignExperiment']._options = None
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['CreateCampaignExperiment']._serialized_options = b'\202\323\344\223\002>\"9/v10/customers/{customer_id=*}/campaignExperiments:create:\001*\332A\037customer_id,campaign_experiment\312A[\n\025google.protobuf.Empty\022Bgoogle.ads.googleads.v10.services.CreateCampaignExperimentMetadata'
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['MutateCampaignExperiments']._options = None
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['MutateCampaignExperiments']._serialized_options = b'\202\323\344\223\002>\"9/v10/customers/{customer_id=*}/campaignExperiments:mutate:\001*\332A\026customer_id,operations'
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['GraduateCampaignExperiment']._options = None
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['GraduateCampaignExperiment']._serialized_options = b'\202\323\344\223\002J\"E/v10/{campaign_experiment=customers/*/campaignExperiments/*}:graduate:\001*\332A#campaign_experiment,campaign_budget'
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['PromoteCampaignExperiment']._options = None
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['PromoteCampaignExperiment']._serialized_options = b'\202\323\344\223\002I\"D/v10/{campaign_experiment=customers/*/campaignExperiments/*}:promote:\001*\332A\023campaign_experiment\312A.\n\025google.protobuf.Empty\022\025google.protobuf.Empty'
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['EndCampaignExperiment']._options = None
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['EndCampaignExperiment']._serialized_options = b'\202\323\344\223\002E\"@/v10/{campaign_experiment=customers/*/campaignExperiments/*}:end:\001*\332A\023campaign_experiment'
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['ListCampaignExperimentAsyncErrors']._options = None
  _CAMPAIGNEXPERIMENTSERVICE.methods_by_name['ListCampaignExperimentAsyncErrors']._serialized_options = b'\202\323\344\223\002H\022F/v10/{resource_name=customers/*/campaignExperiments/*}:listAsyncErrors\332A\rresource_name'
  _MUTATECAMPAIGNEXPERIMENTSREQUEST._serialized_start=469
  _MUTATECAMPAIGNEXPERIMENTSREQUEST._serialized_end=774
  _CAMPAIGNEXPERIMENTOPERATION._serialized_start=777
  _CAMPAIGNEXPERIMENTOPERATION._serialized_end=1010
  _MUTATECAMPAIGNEXPERIMENTSRESPONSE._serialized_start=1013
  _MUTATECAMPAIGNEXPERIMENTSRESPONSE._serialized_end=1183
  _MUTATECAMPAIGNEXPERIMENTRESULT._serialized_start=1186
  _MUTATECAMPAIGNEXPERIMENTRESULT._serialized_end=1376
  _CREATECAMPAIGNEXPERIMENTREQUEST._serialized_start=1379
  _CREATECAMPAIGNEXPERIMENTREQUEST._serialized_end=1551
  _CREATECAMPAIGNEXPERIMENTMETADATA._serialized_start=1553
  _CREATECAMPAIGNEXPERIMENTMETADATA._serialized_end=1616
  _GRADUATECAMPAIGNEXPERIMENTREQUEST._serialized_start=1619
  _GRADUATECAMPAIGNEXPERIMENTREQUEST._serialized_end=1789
  _GRADUATECAMPAIGNEXPERIMENTRESPONSE._serialized_start=1791
  _GRADUATECAMPAIGNEXPERIMENTRESPONSE._serialized_end=1855
  _PROMOTECAMPAIGNEXPERIMENTREQUEST._serialized_start=1858
  _PROMOTECAMPAIGNEXPERIMENTREQUEST._serialized_end=1997
  _ENDCAMPAIGNEXPERIMENTREQUEST._serialized_start=2000
  _ENDCAMPAIGNEXPERIMENTREQUEST._serialized_end=2135
  _LISTCAMPAIGNEXPERIMENTASYNCERRORSREQUEST._serialized_start=2138
  _LISTCAMPAIGNEXPERIMENTASYNCERRORSREQUEST._serialized_end=2295
  _LISTCAMPAIGNEXPERIMENTASYNCERRORSRESPONSE._serialized_start=2297
  _LISTCAMPAIGNEXPERIMENTASYNCERRORSRESPONSE._serialized_end=2401
  _CAMPAIGNEXPERIMENTSERVICE._serialized_start=2404
  _CAMPAIGNEXPERIMENTSERVICE._serialized_end=4171
# @@protoc_insertion_point(module_scope)
