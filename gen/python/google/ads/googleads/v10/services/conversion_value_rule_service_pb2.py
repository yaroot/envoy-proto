# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/services/conversion_value_rule_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v10.resources import conversion_value_rule_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_resources_dot_conversion__value__rule__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nEgoogle/ads/googleads/v10/services/conversion_value_rule_service.proto\x12!google.ads.googleads.v10.services\x1a:google/ads/googleads/v10/enums/response_content_type.proto\x1a>google/ads/googleads/v10/resources/conversion_value_rule.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xb3\x02\n!MutateConversionValueRulesRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12X\n\noperations\x18\x02 \x03(\x0b\x32?.google.ads.googleads.v10.services.ConversionValueRuleOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x05 \x01(\x08\x12\x15\n\rvalidate_only\x18\x03 \x01(\x08\x12j\n\x15response_content_type\x18\x04 \x01(\x0e\x32K.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType\"\xb7\x02\n\x1c\x43onversionValueRuleOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12I\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x37.google.ads.googleads.v10.resources.ConversionValueRuleH\x00\x12I\n\x06update\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v10.resources.ConversionValueRuleH\x00\x12\x43\n\x06remove\x18\x03 \x01(\tB1\xfa\x41.\n,googleads.googleapis.com/ConversionValueRuleH\x00\x42\x0b\n\toperation\"\xac\x01\n\"MutateConversionValueRulesResponse\x12S\n\x07results\x18\x02 \x03(\x0b\x32\x42.google.ads.googleads.v10.services.MutateConversionValueRuleResult\x12\x31\n\x15partial_failure_error\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\"\xc3\x01\n\x1fMutateConversionValueRuleResult\x12H\n\rresource_name\x18\x01 \x01(\tB1\xfa\x41.\n,googleads.googleapis.com/ConversionValueRule\x12V\n\x15\x63onversion_value_rule\x18\x02 \x01(\x0b\x32\x37.google.ads.googleads.v10.resources.ConversionValueRule2\xef\x02\n\x1a\x43onversionValueRuleService\x12\x89\x02\n\x1aMutateConversionValueRules\x12\x44.google.ads.googleads.v10.services.MutateConversionValueRulesRequest\x1a\x45.google.ads.googleads.v10.services.MutateConversionValueRulesResponse\"^\x82\xd3\xe4\x93\x02?\":/v10/customers/{customer_id=*}/conversionValueRules:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8b\x02\n%com.google.ads.googleads.v10.servicesB\x1f\x43onversionValueRuleServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V10.Services\xca\x02!Google\\Ads\\GoogleAds\\V10\\Services\xea\x02%Google::Ads::GoogleAds::V10::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.services.conversion_value_rule_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v10.servicesB\037ConversionValueRuleServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v10/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V10.Services\312\002!Google\\Ads\\GoogleAds\\V10\\Services\352\002%Google::Ads::GoogleAds::V10::Services'
  _MUTATECONVERSIONVALUERULESREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECONVERSIONVALUERULESREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECONVERSIONVALUERULESREQUEST.fields_by_name['operations']._options = None
  _MUTATECONVERSIONVALUERULESREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _CONVERSIONVALUERULEOPERATION.fields_by_name['remove']._options = None
  _CONVERSIONVALUERULEOPERATION.fields_by_name['remove']._serialized_options = b'\372A.\n,googleads.googleapis.com/ConversionValueRule'
  _MUTATECONVERSIONVALUERULERESULT.fields_by_name['resource_name']._options = None
  _MUTATECONVERSIONVALUERULERESULT.fields_by_name['resource_name']._serialized_options = b'\372A.\n,googleads.googleapis.com/ConversionValueRule'
  _CONVERSIONVALUERULESERVICE._options = None
  _CONVERSIONVALUERULESERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CONVERSIONVALUERULESERVICE.methods_by_name['MutateConversionValueRules']._options = None
  _CONVERSIONVALUERULESERVICE.methods_by_name['MutateConversionValueRules']._serialized_options = b'\202\323\344\223\002?\":/v10/customers/{customer_id=*}/conversionValueRules:mutate:\001*\332A\026customer_id,operations'
  _MUTATECONVERSIONVALUERULESREQUEST._serialized_start=407
  _MUTATECONVERSIONVALUERULESREQUEST._serialized_end=714
  _CONVERSIONVALUERULEOPERATION._serialized_start=717
  _CONVERSIONVALUERULEOPERATION._serialized_end=1028
  _MUTATECONVERSIONVALUERULESRESPONSE._serialized_start=1031
  _MUTATECONVERSIONVALUERULESRESPONSE._serialized_end=1203
  _MUTATECONVERSIONVALUERULERESULT._serialized_start=1206
  _MUTATECONVERSIONVALUERULERESULT._serialized_end=1401
  _CONVERSIONVALUERULESERVICE._serialized_start=1404
  _CONVERSIONVALUERULESERVICE._serialized_end=1771
# @@protoc_insertion_point(module_scope)