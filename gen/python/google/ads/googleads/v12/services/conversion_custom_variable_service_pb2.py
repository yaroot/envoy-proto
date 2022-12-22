# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/services/conversion_custom_variable_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v12.resources import conversion_custom_variable_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_resources_dot_conversion__custom__variable__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nJgoogle/ads/googleads/v12/services/conversion_custom_variable_service.proto\x12!google.ads.googleads.v12.services\x1a:google/ads/googleads/v12/enums/response_content_type.proto\x1a\x43google/ads/googleads/v12/resources/conversion_custom_variable.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\xbd\x02\n&MutateConversionCustomVariablesRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12]\n\noperations\x18\x02 \x03(\x0b\x32\x44.google.ads.googleads.v12.services.ConversionCustomVariableOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v12.enums.ResponseContentTypeEnum.ResponseContentType\"\x81\x02\n!ConversionCustomVariableOperation\x12/\n\x0bupdate_mask\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12N\n\x06\x63reate\x18\x01 \x01(\x0b\x32<.google.ads.googleads.v12.resources.ConversionCustomVariableH\x00\x12N\n\x06update\x18\x02 \x01(\x0b\x32<.google.ads.googleads.v12.resources.ConversionCustomVariableH\x00\x42\x0b\n\toperation\"\xb6\x01\n\'MutateConversionCustomVariablesResponse\x12\x31\n\x15partial_failure_error\x18\x01 \x01(\x0b\x32\x12.google.rpc.Status\x12X\n\x07results\x18\x02 \x03(\x0b\x32G.google.ads.googleads.v12.services.MutateConversionCustomVariableResult\"\xd7\x01\n$MutateConversionCustomVariableResult\x12M\n\rresource_name\x18\x01 \x01(\tB6\xfa\x41\x33\n1googleads.googleapis.com/ConversionCustomVariable\x12`\n\x1a\x63onversion_custom_variable\x18\x02 \x01(\x0b\x32<.google.ads.googleads.v12.resources.ConversionCustomVariable2\x88\x03\n\x1f\x43onversionCustomVariableService\x12\x9d\x02\n\x1fMutateConversionCustomVariables\x12I.google.ads.googleads.v12.services.MutateConversionCustomVariablesRequest\x1aJ.google.ads.googleads.v12.services.MutateConversionCustomVariablesResponse\"c\x82\xd3\xe4\x93\x02\x44\"?/v12/customers/{customer_id=*}/conversionCustomVariables:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x90\x02\n%com.google.ads.googleads.v12.servicesB$ConversionCustomVariableServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V12.Services\xca\x02!Google\\Ads\\GoogleAds\\V12\\Services\xea\x02%Google::Ads::GoogleAds::V12::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.services.conversion_custom_variable_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v12.servicesB$ConversionCustomVariableServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v12/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V12.Services\312\002!Google\\Ads\\GoogleAds\\V12\\Services\352\002%Google::Ads::GoogleAds::V12::Services'
  _MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['customer_id']._options = None
  _MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['operations']._options = None
  _MUTATECONVERSIONCUSTOMVARIABLESREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _MUTATECONVERSIONCUSTOMVARIABLERESULT.fields_by_name['resource_name']._options = None
  _MUTATECONVERSIONCUSTOMVARIABLERESULT.fields_by_name['resource_name']._serialized_options = b'\372A3\n1googleads.googleapis.com/ConversionCustomVariable'
  _CONVERSIONCUSTOMVARIABLESERVICE._options = None
  _CONVERSIONCUSTOMVARIABLESERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _CONVERSIONCUSTOMVARIABLESERVICE.methods_by_name['MutateConversionCustomVariables']._options = None
  _CONVERSIONCUSTOMVARIABLESERVICE.methods_by_name['MutateConversionCustomVariables']._serialized_options = b'\202\323\344\223\002D\"?/v12/customers/{customer_id=*}/conversionCustomVariables:mutate:\001*\332A\026customer_id,operations'
  _MUTATECONVERSIONCUSTOMVARIABLESREQUEST._serialized_start=417
  _MUTATECONVERSIONCUSTOMVARIABLESREQUEST._serialized_end=734
  _CONVERSIONCUSTOMVARIABLEOPERATION._serialized_start=737
  _CONVERSIONCUSTOMVARIABLEOPERATION._serialized_end=994
  _MUTATECONVERSIONCUSTOMVARIABLESRESPONSE._serialized_start=997
  _MUTATECONVERSIONCUSTOMVARIABLESRESPONSE._serialized_end=1179
  _MUTATECONVERSIONCUSTOMVARIABLERESULT._serialized_start=1182
  _MUTATECONVERSIONCUSTOMVARIABLERESULT._serialized_end=1397
  _CONVERSIONCUSTOMVARIABLESERVICE._serialized_start=1400
  _CONVERSIONCUSTOMVARIABLESERVICE._serialized_end=1792
# @@protoc_insertion_point(module_scope)