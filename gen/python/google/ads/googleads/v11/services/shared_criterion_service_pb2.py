# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/shared_criterion_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v11.resources import shared_criterion_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_shared__criterion__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/ads/googleads/v11/services/shared_criterion_service.proto\x12!google.ads.googleads.v11.services\x1a:google/ads/googleads/v11/enums/response_content_type.proto\x1a\x39google/ads/googleads/v11/resources/shared_criterion.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xa9\x02\n\x1bMutateSharedCriteriaRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12T\n\noperations\x18\x02 \x03(\x0b\x32;.google.ads.googleads.v11.services.SharedCriterionOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType\"\xaf\x01\n\x18SharedCriterionOperation\x12\x45\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x33.google.ads.googleads.v11.resources.SharedCriterionH\x00\x12?\n\x06remove\x18\x03 \x01(\tB-\xfa\x41*\n(googleads.googleapis.com/SharedCriterionH\x00\x42\x0b\n\toperation\"\xa2\x01\n\x1cMutateSharedCriteriaResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12O\n\x07results\x18\x02 \x03(\x0b\x32>.google.ads.googleads.v11.services.MutateSharedCriterionResult\"\xb2\x01\n\x1bMutateSharedCriterionResult\x12\x44\n\rresource_name\x18\x01 \x01(\tB-\xfa\x41*\n(googleads.googleapis.com/SharedCriterion\x12M\n\x10shared_criterion\x18\x02 \x01(\x0b\x32\x33.google.ads.googleads.v11.resources.SharedCriterion2\xd3\x02\n\x16SharedCriterionService\x12\xf1\x01\n\x14MutateSharedCriteria\x12>.google.ads.googleads.v11.services.MutateSharedCriteriaRequest\x1a?.google.ads.googleads.v11.services.MutateSharedCriteriaResponse\"X\x82\xd3\xe4\x93\x02\x39\"4/v11/customers/{customer_id=*}/sharedCriteria:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x87\x02\n%com.google.ads.googleads.v11.servicesB\x1bSharedCriterionServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.shared_criterion_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\033SharedCriterionServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATESHAREDCRITERIAREQUEST.fields_by_name['customer_id']._options = None
  _MUTATESHAREDCRITERIAREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATESHAREDCRITERIAREQUEST.fields_by_name['operations']._options = None
  _MUTATESHAREDCRITERIAREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _SHAREDCRITERIONOPERATION.fields_by_name['remove']._options = None
  _SHAREDCRITERIONOPERATION.fields_by_name['remove']._serialized_options = b'\372A*\n(googleads.googleapis.com/SharedCriterion'
  _MUTATESHAREDCRITERIONRESULT.fields_by_name['resource_name']._options = None
  _MUTATESHAREDCRITERIONRESULT.fields_by_name['resource_name']._serialized_options = b'\372A*\n(googleads.googleapis.com/SharedCriterion'
  _SHAREDCRITERIONSERVICE._options = None
  _SHAREDCRITERIONSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _SHAREDCRITERIONSERVICE.methods_by_name['MutateSharedCriteria']._options = None
  _SHAREDCRITERIONSERVICE.methods_by_name['MutateSharedCriteria']._serialized_options = b'\202\323\344\223\0029\"4/v11/customers/{customer_id=*}/sharedCriteria:mutate:\001*\332A\026customer_id,operations'
  _MUTATESHAREDCRITERIAREQUEST._serialized_start=363
  _MUTATESHAREDCRITERIAREQUEST._serialized_end=660
  _SHAREDCRITERIONOPERATION._serialized_start=663
  _SHAREDCRITERIONOPERATION._serialized_end=838
  _MUTATESHAREDCRITERIARESPONSE._serialized_start=841
  _MUTATESHAREDCRITERIARESPONSE._serialized_end=1003
  _MUTATESHAREDCRITERIONRESULT._serialized_start=1006
  _MUTATESHAREDCRITERIONRESULT._serialized_end=1184
  _SHAREDCRITERIONSERVICE._serialized_start=1187
  _SHAREDCRITERIONSERVICE._serialized_end=1526
# @@protoc_insertion_point(module_scope)
