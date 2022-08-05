# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/ad_group_criterion_label_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.resources import ad_group_criterion_label_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_ad__group__criterion__label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nHgoogle/ads/googleads/v10/services/ad_group_criterion_label_service.proto\x12!google.ads.googleads.v10.services\x1a\x41google/ads/googleads/v10/resources/ad_group_criterion_label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xcb\x01\n#MutateAdGroupCriterionLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12Z\n\noperations\x18\x02 \x03(\x0b\x32\x41.google.ads.googleads.v10.services.AdGroupCriterionLabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xc1\x01\n\x1e\x41\x64GroupCriterionLabelOperation\x12K\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x39.google.ads.googleads.v10.resources.AdGroupCriterionLabelH\x00\x12\x45\n\x06remove\x18\x02 \x01(\tB3\xfa\x41\x30\n.googleads.googleapis.com/AdGroupCriterionLabelH\x00\x42\x0b\n\toperation\"\xb0\x01\n$MutateAdGroupCriterionLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12U\n\x07results\x18\x02 \x03(\x0b\x32\x44.google.ads.googleads.v10.services.MutateAdGroupCriterionLabelResult\"o\n!MutateAdGroupCriterionLabelResult\x12J\n\rresource_name\x18\x01 \x01(\tB3\xfa\x41\x30\n.googleads.googleapis.com/AdGroupCriterionLabel2\xf9\x02\n\x1c\x41\x64GroupCriterionLabelService\x12\x91\x02\n\x1cMutateAdGroupCriterionLabels\x12\x46.google.ads.googleads.v10.services.MutateAdGroupCriterionLabelsRequest\x1aG.google.ads.googleads.v10.services.MutateAdGroupCriterionLabelsResponse\"`\x82\xd3\xe4\x93\x02\x41\"</v10/customers/{customer_id=*}/adGroupCriterionLabels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8d\x02\n%com.google.ads.googleads.v10.servicesB!AdGroupCriterionLabelServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.ad_group_criterion_label_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB!AdGroupCriterionLabelServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['operations']._options = None
  _MUTATEADGROUPCRITERIONLABELSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ADGROUPCRITERIONLABELOPERATION.fields_by_name['remove']._options = None
  _ADGROUPCRITERIONLABELOPERATION.fields_by_name['remove']._serialized_options = b'\372A0\n.googleads.googleapis.com/AdGroupCriterionLabel'
  _MUTATEADGROUPCRITERIONLABELRESULT.fields_by_name['resource_name']._options = None
  _MUTATEADGROUPCRITERIONLABELRESULT.fields_by_name['resource_name']._serialized_options = b'\372A0\n.googleads.googleapis.com/AdGroupCriterionLabel'
  _ADGROUPCRITERIONLABELSERVICE._options = None
  _ADGROUPCRITERIONLABELSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ADGROUPCRITERIONLABELSERVICE.methods_by_name['MutateAdGroupCriterionLabels']._options = None
  _ADGROUPCRITERIONLABELSERVICE.methods_by_name['MutateAdGroupCriterionLabels']._serialized_options = b'\202\323\344\223\002A\"</v10/customers/{customer_id=*}/adGroupCriterionLabels:mutate:\001*\332A\026customer_id,operations'
  _MUTATEADGROUPCRITERIONLABELSREQUEST._serialized_start=319
  _MUTATEADGROUPCRITERIONLABELSREQUEST._serialized_end=522
  _ADGROUPCRITERIONLABELOPERATION._serialized_start=525
  _ADGROUPCRITERIONLABELOPERATION._serialized_end=718
  _MUTATEADGROUPCRITERIONLABELSRESPONSE._serialized_start=721
  _MUTATEADGROUPCRITERIONLABELSRESPONSE._serialized_end=897
  _MUTATEADGROUPCRITERIONLABELRESULT._serialized_start=899
  _MUTATEADGROUPCRITERIONLABELRESULT._serialized_end=1010
  _ADGROUPCRITERIONLABELSERVICE._serialized_start=1013
  _ADGROUPCRITERIONLABELSERVICE._serialized_end=1390
# @@protoc_insertion_point(module_scope)
