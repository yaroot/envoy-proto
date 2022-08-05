# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/customer_customizer.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.common import customizer_value_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_common_dot_customizer__value__pb2
from google.ads.googleads.v10.enums import customizer_value_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_customizer__value__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n<google/ads/googleads/v10/resources/customer_customizer.proto\x12\"google.ads.googleads.v10.resources\x1a\x36google/ads/googleads/v10/common/customizer_value.proto\x1a<google/ads/googleads/v10/enums/customizer_value_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xdc\x03\n\x12\x43ustomerCustomizer\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x05\xfa\x41-\n+googleads.googleapis.com/CustomerCustomizer\x12U\n\x14\x63ustomizer_attribute\x18\x02 \x01(\tB7\xe0\x41\x02\xe0\x41\x05\xfa\x41.\n,googleads.googleapis.com/CustomizerAttribute\x12\x64\n\x06status\x18\x03 \x01(\x0e\x32O.google.ads.googleads.v10.enums.CustomizerValueStatusEnum.CustomizerValueStatusB\x03\xe0\x41\x03\x12\x44\n\x05value\x18\x04 \x01(\x0b\x32\x30.google.ads.googleads.v10.common.CustomizerValueB\x03\xe0\x41\x02:w\xea\x41t\n+googleads.googleapis.com/CustomerCustomizer\x12\x45\x63ustomers/{customer_id}/customerCustomizers/{customizer_attribute_id}B\x89\x02\n&com.google.ads.googleads.v10.resourcesB\x17\x43ustomerCustomizerProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.customer_customizer_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\027CustomerCustomizerProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CUSTOMERCUSTOMIZER.fields_by_name['resource_name']._options = None
  _CUSTOMERCUSTOMIZER.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A-\n+googleads.googleapis.com/CustomerCustomizer'
  _CUSTOMERCUSTOMIZER.fields_by_name['customizer_attribute']._options = None
  _CUSTOMERCUSTOMIZER.fields_by_name['customizer_attribute']._serialized_options = b'\340A\002\340A\005\372A.\n,googleads.googleapis.com/CustomizerAttribute'
  _CUSTOMERCUSTOMIZER.fields_by_name['status']._options = None
  _CUSTOMERCUSTOMIZER.fields_by_name['status']._serialized_options = b'\340A\003'
  _CUSTOMERCUSTOMIZER.fields_by_name['value']._options = None
  _CUSTOMERCUSTOMIZER.fields_by_name['value']._serialized_options = b'\340A\002'
  _CUSTOMERCUSTOMIZER._options = None
  _CUSTOMERCUSTOMIZER._serialized_options = b'\352At\n+googleads.googleapis.com/CustomerCustomizer\022Ecustomers/{customer_id}/customerCustomizers/{customizer_attribute_id}'
  _CUSTOMERCUSTOMIZER._serialized_start=279
  _CUSTOMERCUSTOMIZER._serialized_end=755
# @@protoc_insertion_point(module_scope)
