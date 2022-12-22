# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/remarketing_action_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.resources import remarketing_action_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_remarketing__action__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nBgoogle/ads/googleads/v10/services/remarketing_action_service.proto\x12!google.ads.googleads.v10.services\x1a;google/ads/googleads/v10/resources/remarketing_action.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xc3\x01\n\x1fMutateRemarketingActionsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12V\n\noperations\x18\x02 \x03(\x0b\x32=.google.ads.googleads.v10.services.RemarketingActionOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\xec\x01\n\x1aRemarketingActionOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12G\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x35.google.ads.googleads.v10.resources.RemarketingActionH\x00\x12G\n\x06update\x18\x02 \x01(\x0b\x32\x35.google.ads.googleads.v10.resources.RemarketingActionH\x00\x42\x0b\n\toperation\"\xa8\x01\n MutateRemarketingActionsResponse\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12Q\n\x07results\x18\x02 \x03(\x0b\x32@.google.ads.googleads.v10.services.MutateRemarketingActionResult\"g\n\x1dMutateRemarketingActionResult\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xfa\x41,\n*googleads.googleapis.com/RemarketingAction2\xe5\x02\n\x18RemarketingActionService\x12\x81\x02\n\x18MutateRemarketingActions\x12\x42.google.ads.googleads.v10.services.MutateRemarketingActionsRequest\x1a\x43.google.ads.googleads.v10.services.MutateRemarketingActionsResponse\"\\\x82\xd3\xe4\x93\x02=\"8/v10/customers/{customer_id=*}/remarketingActions:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x89\x02\n%com.google.ads.googleads.v10.servicesB\x1dRemarketingActionServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.remarketing_action_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\035RemarketingActionServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATEREMARKETINGACTIONSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEREMARKETINGACTIONSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEREMARKETINGACTIONSREQUEST.fields_by_name['operations']._options = None
  _MUTATEREMARKETINGACTIONSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _MUTATEREMARKETINGACTIONRESULT.fields_by_name['resource_name']._options = None
  _MUTATEREMARKETINGACTIONRESULT.fields_by_name['resource_name']._serialized_options = b'\372A,\n*googleads.googleapis.com/RemarketingAction'
  _REMARKETINGACTIONSERVICE._options = None
  _REMARKETINGACTIONSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _REMARKETINGACTIONSERVICE.methods_by_name['MutateRemarketingActions']._options = None
  _REMARKETINGACTIONSERVICE.methods_by_name['MutateRemarketingActions']._serialized_options = b'\202\323\344\223\002=\"8/v10/customers/{customer_id=*}/remarketingActions:mutate:\001*\332A\026customer_id,operations'
  _MUTATEREMARKETINGACTIONSREQUEST._serialized_start=341
  _MUTATEREMARKETINGACTIONSREQUEST._serialized_end=536
  _REMARKETINGACTIONOPERATION._serialized_start=539
  _REMARKETINGACTIONOPERATION._serialized_end=775
  _MUTATEREMARKETINGACTIONSRESPONSE._serialized_start=778
  _MUTATEREMARKETINGACTIONSRESPONSE._serialized_end=946
  _MUTATEREMARKETINGACTIONRESULT._serialized_start=948
  _MUTATEREMARKETINGACTIONRESULT._serialized_end=1051
  _REMARKETINGACTIONSERVICE._serialized_start=1054
  _REMARKETINGACTIONSERVICE._serialized_end=1411
# @@protoc_insertion_point(module_scope)