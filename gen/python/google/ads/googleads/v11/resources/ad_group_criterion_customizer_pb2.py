# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/resources/ad_group_criterion_customizer.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.common import customizer_value_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_common_dot_customizer__value__pb2
from google.ads.googleads.v11.enums import customizer_value_status_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_customizer__value__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nFgoogle/ads/googleads/v11/resources/ad_group_criterion_customizer.proto\x12\"google.ads.googleads.v11.resources\x1a\x36google/ads/googleads/v11/common/customizer_value.proto\x1a<google/ads/googleads/v11/enums/customizer_value_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x86\x05\n\x1a\x41\x64GroupCriterionCustomizer\x12R\n\rresource_name\x18\x01 \x01(\tB;\xe0\x41\x05\xfa\x41\x35\n3googleads.googleapis.com/AdGroupCriterionCustomizer\x12R\n\x12\x61\x64_group_criterion\x18\x02 \x01(\tB1\xe0\x41\x05\xfa\x41+\n)googleads.googleapis.com/AdGroupCriterionH\x00\x88\x01\x01\x12U\n\x14\x63ustomizer_attribute\x18\x03 \x01(\tB7\xe0\x41\x02\xe0\x41\x05\xfa\x41.\n,googleads.googleapis.com/CustomizerAttribute\x12\x64\n\x06status\x18\x04 \x01(\x0e\x32O.google.ads.googleads.v11.enums.CustomizerValueStatusEnum.CustomizerValueStatusB\x03\xe0\x41\x03\x12\x44\n\x05value\x18\x05 \x01(\x0b\x32\x30.google.ads.googleads.v11.common.CustomizerValueB\x03\xe0\x41\x02:\xa5\x01\xea\x41\xa1\x01\n3googleads.googleapis.com/AdGroupCriterionCustomizer\x12jcustomers/{customer_id}/adGroupCriterionCustomizers/{ad_group_id}~{criterion_id}~{customizer_attribute_id}B\x15\n\x13_ad_group_criterionB\x91\x02\n&com.google.ads.googleads.v11.resourcesB\x1f\x41\x64GroupCriterionCustomizerProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V11.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V11\\Resources\xea\x02&Google::Ads::GoogleAds::V11::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.resources.ad_group_criterion_customizer_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v11.resourcesB\037AdGroupCriterionCustomizerProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v11/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V11.Resources\312\002\"Google\\Ads\\GoogleAds\\V11\\Resources\352\002&Google::Ads::GoogleAds::V11::Resources'
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['resource_name']._options = None
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A5\n3googleads.googleapis.com/AdGroupCriterionCustomizer'
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['ad_group_criterion']._options = None
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['ad_group_criterion']._serialized_options = b'\340A\005\372A+\n)googleads.googleapis.com/AdGroupCriterion'
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['customizer_attribute']._options = None
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['customizer_attribute']._serialized_options = b'\340A\002\340A\005\372A.\n,googleads.googleapis.com/CustomizerAttribute'
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['status']._options = None
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['status']._serialized_options = b'\340A\003'
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['value']._options = None
  _ADGROUPCRITERIONCUSTOMIZER.fields_by_name['value']._serialized_options = b'\340A\002'
  _ADGROUPCRITERIONCUSTOMIZER._options = None
  _ADGROUPCRITERIONCUSTOMIZER._serialized_options = b'\352A\241\001\n3googleads.googleapis.com/AdGroupCriterionCustomizer\022jcustomers/{customer_id}/adGroupCriterionCustomizers/{ad_group_id}~{criterion_id}~{customizer_attribute_id}'
  _ADGROUPCRITERIONCUSTOMIZER._serialized_start=289
  _ADGROUPCRITERIONCUSTOMIZER._serialized_end=935
# @@protoc_insertion_point(module_scope)
