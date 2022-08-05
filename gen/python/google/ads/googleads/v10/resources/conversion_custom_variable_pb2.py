# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/conversion_custom_variable.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import conversion_custom_variable_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_conversion__custom__variable__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nCgoogle/ads/googleads/v10/resources/conversion_custom_variable.proto\x12\"google.ads.googleads.v10.resources\x1a\x46google/ads/googleads/v10/enums/conversion_custom_variable_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xe8\x03\n\x18\x43onversionCustomVariable\x12P\n\rresource_name\x18\x01 \x01(\tB9\xe0\x41\x05\xfa\x41\x33\n1googleads.googleapis.com/ConversionCustomVariable\x12\x0f\n\x02id\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03\x12\x11\n\x04name\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x03tag\x18\x04 \x01(\tB\x06\xe0\x41\x02\xe0\x41\x05\x12q\n\x06status\x18\x05 \x01(\x0e\x32\x61.google.ads.googleads.v10.enums.ConversionCustomVariableStatusEnum.ConversionCustomVariableStatus\x12\x41\n\x0eowner_customer\x18\x06 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/Customer:\x8a\x01\xea\x41\x86\x01\n1googleads.googleapis.com/ConversionCustomVariable\x12Qcustomers/{customer_id}/conversionCustomVariables/{conversion_custom_variable_id}B\x8f\x02\n&com.google.ads.googleads.v10.resourcesB\x1d\x43onversionCustomVariableProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.conversion_custom_variable_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\035ConversionCustomVariableProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['resource_name']._options = None
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A3\n1googleads.googleapis.com/ConversionCustomVariable'
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['id']._options = None
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['id']._serialized_options = b'\340A\003'
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['name']._options = None
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['name']._serialized_options = b'\340A\002'
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['tag']._options = None
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['tag']._serialized_options = b'\340A\002\340A\005'
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['owner_customer']._options = None
  _CONVERSIONCUSTOMVARIABLE.fields_by_name['owner_customer']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Customer'
  _CONVERSIONCUSTOMVARIABLE._options = None
  _CONVERSIONCUSTOMVARIABLE._serialized_options = b'\352A\206\001\n1googleads.googleapis.com/ConversionCustomVariable\022Qcustomers/{customer_id}/conversionCustomVariables/{conversion_custom_variable_id}'
  _CONVERSIONCUSTOMVARIABLE._serialized_start=240
  _CONVERSIONCUSTOMVARIABLE._serialized_end=728
# @@protoc_insertion_point(module_scope)
