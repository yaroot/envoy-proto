# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/customer_label_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.resources import customer_label_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_customer__label__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/ads/googleads/v10/services/customer_label_service.proto\x12!google.ads.googleads.v10.services\x1a\x37google/ads/googleads/v10/resources/customer_label.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xbb\x01\n\x1bMutateCustomerLabelsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12R\n\noperations\x18\x02 \x03(\x0b\x32\x39.google.ads.googleads.v10.services.CustomerLabelOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xa9\x01\n\x16\x43ustomerLabelOperation\x12\x43\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x31.google.ads.googleads.v10.resources.CustomerLabelH\x00\x12=\n\x06remove\x18\x02 \x01(\tB+\xfa\x41(\n&googleads.googleapis.com/CustomerLabelH\x00\x42\x0b\n\toperation\"\xa0\x01\n\x1cMutateCustomerLabelsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12M\n\x07results\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v10.services.MutateCustomerLabelResult\"_\n\x19MutateCustomerLabelResult\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xfa\x41(\n&googleads.googleapis.com/CustomerLabel2\xd1\x02\n\x14\x43ustomerLabelService\x12\xf1\x01\n\x14MutateCustomerLabels\x12>.google.ads.googleads.v10.services.MutateCustomerLabelsRequest\x1a?.google.ads.googleads.v10.services.MutateCustomerLabelsResponse\"X\x82\xd3\xe4\x93\x02\x39\"4/v10/customers/{customer_id=*}/customerLabels:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x85\x02\n%com.google.ads.googleads.v10.servicesB\x19\x43ustomerLabelServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.customer_label_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\031CustomerLabelServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATECUSTOMERLABELSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECUSTOMERLABELSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECUSTOMERLABELSREQUEST.fields_by_name['operations']._options = None
  _MUTATECUSTOMERLABELSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CUSTOMERLABELOPERATION.fields_by_name['remove']._options = None
  _CUSTOMERLABELOPERATION.fields_by_name['remove']._serialized_options = b'\372A(\n&googleads.googleapis.com/CustomerLabel'
  _MUTATECUSTOMERLABELRESULT.fields_by_name['resource_name']._options = None
  _MUTATECUSTOMERLABELRESULT.fields_by_name['resource_name']._serialized_options = b'\372A(\n&googleads.googleapis.com/CustomerLabel'
  _CUSTOMERLABELSERVICE._options = None
  _CUSTOMERLABELSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CUSTOMERLABELSERVICE.methods_by_name['MutateCustomerLabels']._options = None
  _CUSTOMERLABELSERVICE.methods_by_name['MutateCustomerLabels']._serialized_options = b'\202\323\344\223\0029\"4/v10/customers/{customer_id=*}/customerLabels:mutate:\001*\332A\026customer_id,operations'
  _MUTATECUSTOMERLABELSREQUEST._serialized_start=299
  _MUTATECUSTOMERLABELSREQUEST._serialized_end=486
  _CUSTOMERLABELOPERATION._serialized_start=489
  _CUSTOMERLABELOPERATION._serialized_end=658
  _MUTATECUSTOMERLABELSRESPONSE._serialized_start=661
  _MUTATECUSTOMERLABELSRESPONSE._serialized_end=821
  _MUTATECUSTOMERLABELRESULT._serialized_start=823
  _MUTATECUSTOMERLABELRESULT._serialized_end=918
  _CUSTOMERLABELSERVICE._serialized_start=921
  _CUSTOMERLABELSERVICE._serialized_end=1258
# @@protoc_insertion_point(module_scope)
