# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/services/ad_group_ad_label_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.resources import ad_group_ad_label_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_resources_dot_ad__group__ad__label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/ads/googleads/v9/services/ad_group_ad_label_service.proto\x12 google.ads.googleads.v9.services\x1a\x39google/ads/googleads/v9/resources/ad_group_ad_label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"b\n\x18GetAdGroupAdLabelRequest\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'googleads.googleapis.com/AdGroupAdLabel\"\xbc\x01\n\x1cMutateAdGroupAdLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12R\n\noperations\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v9.services.AdGroupAdLabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"}\n\x17\x41\x64GroupAdLabelOperation\x12\x43\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x31.google.ads.googleads.v9.resources.AdGroupAdLabelH\x00\x12\x10\n\x06remove\x18\x02 \x01(\tH\x00\x42\x0b\n\toperation\"\xa1\x01\n\x1dMutateAdGroupAdLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12M\n\x07results\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v9.services.MutateAdGroupAdLabelResult\"3\n\x1aMutateAdGroupAdLabelResult\x12\x15\n\rresource_name\x18\x01 \x01(\t2\xa3\x04\n\x15\x41\x64GroupAdLabelService\x12\xcd\x01\n\x11GetAdGroupAdLabel\x12:.google.ads.googleads.v9.services.GetAdGroupAdLabelRequest\x1a\x31.google.ads.googleads.v9.resources.AdGroupAdLabel\"I\x82\xd3\xe4\x93\x02\x33\x12\x31/v9/{resource_name=customers/*/adGroupAdLabels/*}\xda\x41\rresource_name\x12\xf2\x01\n\x15MutateAdGroupAdLabels\x12>.google.ads.googleads.v9.services.MutateAdGroupAdLabelsRequest\x1a?.google.ads.googleads.v9.services.MutateAdGroupAdLabelsResponse\"X\x82\xd3\xe4\x93\x02\x39\"4/v9/customers/{customer_id=*}/adGroupAdLabels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x81\x02\n$com.google.ads.googleads.v9.servicesB\x1a\x41\x64GroupAdLabelServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V9.Services\xca\x02 Google\\Ads\\GoogleAds\\V9\\Services\xea\x02$Google::Ads::GoogleAds::V9::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.services.ad_group_ad_label_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.google.ads.googleads.v9.servicesB\032AdGroupAdLabelServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v9/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V9.Services\312\002 Google\\Ads\\GoogleAds\\V9\\Services\352\002$Google::Ads::GoogleAds::V9::Services'
  _GETADGROUPADLABELREQUEST.fields_by_name['resource_name']._options = None
  _GETADGROUPADLABELREQUEST.fields_by_name['resource_name']._serialized_options = b'\340A\002\372A)\n\'googleads.googleapis.com/AdGroupAdLabel'
  _MUTATEADGROUPADLABELSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEADGROUPADLABELSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEADGROUPADLABELSREQUEST.fields_by_name['operations']._options = None
  _MUTATEADGROUPADLABELSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ADGROUPADLABELSERVICE._options = None
  _ADGROUPADLABELSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ADGROUPADLABELSERVICE.methods_by_name['GetAdGroupAdLabel']._options = None
  _ADGROUPADLABELSERVICE.methods_by_name['GetAdGroupAdLabel']._serialized_options = b'\202\323\344\223\0023\0221/v9/{resource_name=customers/*/adGroupAdLabels/*}\332A\rresource_name'
  _ADGROUPADLABELSERVICE.methods_by_name['MutateAdGroupAdLabels']._options = None
  _ADGROUPADLABELSERVICE.methods_by_name['MutateAdGroupAdLabels']._serialized_options = b'\202\323\344\223\0029\"4/v9/customers/{customer_id=*}/adGroupAdLabels:mutate:\001*\332A\026customer_id,operations'
  _GETADGROUPADLABELREQUEST._serialized_start=301
  _GETADGROUPADLABELREQUEST._serialized_end=399
  _MUTATEADGROUPADLABELSREQUEST._serialized_start=402
  _MUTATEADGROUPADLABELSREQUEST._serialized_end=590
  _ADGROUPADLABELOPERATION._serialized_start=592
  _ADGROUPADLABELOPERATION._serialized_end=717
  _MUTATEADGROUPADLABELSRESPONSE._serialized_start=720
  _MUTATEADGROUPADLABELSRESPONSE._serialized_end=881
  _MUTATEADGROUPADLABELRESULT._serialized_start=883
  _MUTATEADGROUPADLABELRESULT._serialized_end=934
  _ADGROUPADLABELSERVICE._serialized_start=937
  _ADGROUPADLABELSERVICE._serialized_end=1484
# @@protoc_insertion_point(module_scope)
