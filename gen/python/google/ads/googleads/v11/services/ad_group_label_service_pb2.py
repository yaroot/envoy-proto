# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/ad_group_label_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.resources import ad_group_label_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_ad__group__label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/ads/googleads/v11/services/ad_group_label_service.proto\x12!google.ads.googleads.v11.services\x1a\x37google/ads/googleads/v11/resources/ad_group_label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xb9\x01\n\x1aMutateAdGroupLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12Q\n\noperations\x18\x02 \x03(\x0b\x32\x38.google.ads.googleads.v11.services.AdGroupLabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xa6\x01\n\x15\x41\x64GroupLabelOperation\x12\x42\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x30.google.ads.googleads.v11.resources.AdGroupLabelH\x00\x12<\n\x06remove\x18\x02 \x01(\tB*\xfa\x41\'\n%googleads.googleapis.com/AdGroupLabelH\x00\x42\x0b\n\toperation\"\x9e\x01\n\x1bMutateAdGroupLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12L\n\x07results\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v11.services.MutateAdGroupLabelResult\"]\n\x18MutateAdGroupLabelResult\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xfa\x41\'\n%googleads.googleapis.com/AdGroupLabel2\xcc\x02\n\x13\x41\x64GroupLabelService\x12\xed\x01\n\x13MutateAdGroupLabels\x12=.google.ads.googleads.v11.services.MutateAdGroupLabelsRequest\x1a>.google.ads.googleads.v11.services.MutateAdGroupLabelsResponse\"W\x82\xd3\xe4\x93\x02\x38\"3/v11/customers/{customer_id=*}/adGroupLabels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x84\x02\n%com.google.ads.googleads.v11.servicesB\x18\x41\x64GroupLabelServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.ad_group_label_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\030AdGroupLabelServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATEADGROUPLABELSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEADGROUPLABELSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEADGROUPLABELSREQUEST.fields_by_name['operations']._options = None
  _MUTATEADGROUPLABELSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ADGROUPLABELOPERATION.fields_by_name['remove']._options = None
  _ADGROUPLABELOPERATION.fields_by_name['remove']._serialized_options = b'\372A\'\n%googleads.googleapis.com/AdGroupLabel'
  _MUTATEADGROUPLABELRESULT.fields_by_name['resource_name']._options = None
  _MUTATEADGROUPLABELRESULT.fields_by_name['resource_name']._serialized_options = b'\372A\'\n%googleads.googleapis.com/AdGroupLabel'
  _ADGROUPLABELSERVICE._options = None
  _ADGROUPLABELSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ADGROUPLABELSERVICE.methods_by_name['MutateAdGroupLabels']._options = None
  _ADGROUPLABELSERVICE.methods_by_name['MutateAdGroupLabels']._serialized_options = b'\202\323\344\223\0028\"3/v11/customers/{customer_id=*}/adGroupLabels:mutate:\001*\332A\026customer_id,operations'
  _MUTATEADGROUPLABELSREQUEST._serialized_start=299
  _MUTATEADGROUPLABELSREQUEST._serialized_end=484
  _ADGROUPLABELOPERATION._serialized_start=487
  _ADGROUPLABELOPERATION._serialized_end=653
  _MUTATEADGROUPLABELSRESPONSE._serialized_start=656
  _MUTATEADGROUPLABELSRESPONSE._serialized_end=814
  _MUTATEADGROUPLABELRESULT._serialized_start=816
  _MUTATEADGROUPLABELRESULT._serialized_end=909
  _ADGROUPLABELSERVICE._serialized_start=912
  _ADGROUPLABELSERVICE._serialized_end=1244
# @@protoc_insertion_point(module_scope)
