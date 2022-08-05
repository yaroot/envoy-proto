# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/conversion_value_rule_set_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v11.resources import conversion_value_rule_set_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_conversion__value__rule__set__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nIgoogle/ads/googleads/v11/services/conversion_value_rule_set_service.proto\x12!google.ads.googleads.v11.services\x1a:google/ads/googleads/v11/enums/response_content_type.proto\x1a\x42google/ads/googleads/v11/resources/conversion_value_rule_set.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xb9\x02\n$MutateConversionValueRuleSetsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12[\n\noperations\x18\x02 \x03(\x0b\x32\x42.google.ads.googleads.v11.services.ConversionValueRuleSetOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x05 \x01(\x08\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\x12j\n\x15response_content_type\x18\x04 \x01(\x0e\x32K.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType\"\xc3\x02\n\x1f\x43onversionValueRuleSetOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12L\n\x06\x63reate\x18\x01 \x01(\x0b\x32:.google.ads.googleads.v11.resources.ConversionValueRuleSetH\x00\x12L\n\x06update\x18\x02 \x01(\x0b\x32:.google.ads.googleads.v11.resources.ConversionValueRuleSetH\x00\x12\x46\n\x06remove\x18\x03 \x01(\tB4\xfa\x41\x31\n/googleads.googleapis.com/ConversionValueRuleSetH\x00\x42\x0b\n\toperation\"\xb2\x01\n%MutateConversionValueRuleSetsResponse\x12V\n\x07results\x18\x01 \x03(\x0b\x32\x45.google.ads.googleads.v11.services.MutateConversionValueRuleSetResult\x12\x31\n\x15partial_failure_error\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\"\xd0\x01\n\"MutateConversionValueRuleSetResult\x12K\n\rresource_name\x18\x01 \x01(\tB4\xfa\x41\x31\n/googleads.googleapis.com/ConversionValueRuleSet\x12]\n\x19\x63onversion_value_rule_set\x18\x02 \x01(\x0b\x32:.google.ads.googleads.v11.resources.ConversionValueRuleSet2\xfe\x02\n\x1d\x43onversionValueRuleSetService\x12\x95\x02\n\x1dMutateConversionValueRuleSets\x12G.google.ads.googleads.v11.services.MutateConversionValueRuleSetsRequest\x1aH.google.ads.googleads.v11.services.MutateConversionValueRuleSetsResponse\"a\x82\xd3\xe4\x93\x02\x42\"=/v11/customers/{customer_id=*}/conversionValueRuleSets:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8e\x02\n%com.google.ads.googleads.v11.servicesB\"ConversionValueRuleSetServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.conversion_value_rule_set_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\"ConversionValueRuleSetServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATECONVERSIONVALUERULESETSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECONVERSIONVALUERULESETSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECONVERSIONVALUERULESETSREQUEST.fields_by_name['operations']._options = None
  _MUTATECONVERSIONVALUERULESETSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CONVERSIONVALUERULESETOPERATION.fields_by_name['remove']._options = None
  _CONVERSIONVALUERULESETOPERATION.fields_by_name['remove']._serialized_options = b'\372A1\n/googleads.googleapis.com/ConversionValueRuleSet'
  _MUTATECONVERSIONVALUERULESETRESULT.fields_by_name['resource_name']._options = None
  _MUTATECONVERSIONVALUERULESETRESULT.fields_by_name['resource_name']._serialized_options = b'\372A1\n/googleads.googleapis.com/ConversionValueRuleSet'
  _CONVERSIONVALUERULESETSERVICE._options = None
  _CONVERSIONVALUERULESETSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CONVERSIONVALUERULESETSERVICE.methods_by_name['MutateConversionValueRuleSets']._options = None
  _CONVERSIONVALUERULESETSERVICE.methods_by_name['MutateConversionValueRuleSets']._serialized_options = b'\202\323\344\223\002B\"=/v11/customers/{customer_id=*}/conversionValueRuleSets:mutate:\001*\332A\026customer_id,operations'
  _MUTATECONVERSIONVALUERULESETSREQUEST._serialized_start=415
  _MUTATECONVERSIONVALUERULESETSREQUEST._serialized_end=728
  _CONVERSIONVALUERULESETOPERATION._serialized_start=731
  _CONVERSIONVALUERULESETOPERATION._serialized_end=1054
  _MUTATECONVERSIONVALUERULESETSRESPONSE._serialized_start=1057
  _MUTATECONVERSIONVALUERULESETSRESPONSE._serialized_end=1235
  _MUTATECONVERSIONVALUERULESETRESULT._serialized_start=1238
  _MUTATECONVERSIONVALUERULESETRESULT._serialized_end=1446
  _CONVERSIONVALUERULESETSERVICE._serialized_start=1449
  _CONVERSIONVALUERULESETSERVICE._serialized_end=1831
# @@protoc_insertion_point(module_scope)
