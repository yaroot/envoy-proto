# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/conversion_value_rule_set.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import conversion_action_category_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_conversion__action__category__pb2
from google.ads.googleads.v10.enums import conversion_value_rule_set_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_conversion__value__rule__set__status__pb2
from google.ads.googleads.v10.enums import value_rule_set_attachment_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_value__rule__set__attachment__type__pb2
from google.ads.googleads.v10.enums import value_rule_set_dimension_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_value__rule__set__dimension__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nBgoogle/ads/googleads/v10/resources/conversion_value_rule_set.proto\x12\"google.ads.googleads.v10.resources\x1a?google/ads/googleads/v10/enums/conversion_action_category.proto\x1a\x45google/ads/googleads/v10/enums/conversion_value_rule_set_status.proto\x1a\x43google/ads/googleads/v10/enums/value_rule_set_attachment_type.proto\x1a=google/ads/googleads/v10/enums/value_rule_set_dimension.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\xa6\x07\n\x16\x43onversionValueRuleSet\x12N\n\rresource_name\x18\x01 \x01(\tB7\xe0\x41\x05\xfa\x41\x31\n/googleads.googleapis.com/ConversionValueRuleSet\x12\x0f\n\x02id\x18\x02 \x01(\x03\x42\x03\xe0\x41\x03\x12Q\n\x16\x63onversion_value_rules\x18\x03 \x03(\tB1\xfa\x41.\n,googleads.googleapis.com/ConversionValueRule\x12\x63\n\ndimensions\x18\x04 \x03(\x0e\x32O.google.ads.googleads.v10.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension\x12\x41\n\x0eowner_customer\x18\x05 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/Customer\x12w\n\x0f\x61ttachment_type\x18\x06 \x01(\x0e\x32Y.google.ads.googleads.v10.enums.ValueRuleSetAttachmentTypeEnum.ValueRuleSetAttachmentTypeB\x03\xe0\x41\x05\x12\x38\n\x08\x63\x61mpaign\x18\x07 \x01(\tB&\xfa\x41#\n!googleads.googleapis.com/Campaign\x12r\n\x06status\x18\x08 \x01(\x0e\x32].google.ads.googleads.v10.enums.ConversionValueRuleSetStatusEnum.ConversionValueRuleSetStatusB\x03\xe0\x41\x03\x12\x80\x01\n\x1c\x63onversion_action_categories\x18\t \x03(\x0e\x32U.google.ads.googleads.v10.enums.ConversionActionCategoryEnum.ConversionActionCategoryB\x03\xe0\x41\x05:\x85\x01\xea\x41\x81\x01\n/googleads.googleapis.com/ConversionValueRuleSet\x12Ncustomers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}B\x8d\x02\n&com.google.ads.googleads.v10.resourcesB\x1b\x43onversionValueRuleSetProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.conversion_value_rule_set_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\033ConversionValueRuleSetProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CONVERSIONVALUERULESET.fields_by_name['resource_name']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A1\n/googleads.googleapis.com/ConversionValueRuleSet'
  _CONVERSIONVALUERULESET.fields_by_name['id']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['id']._serialized_options = b'\340A\003'
  _CONVERSIONVALUERULESET.fields_by_name['conversion_value_rules']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['conversion_value_rules']._serialized_options = b'\372A.\n,googleads.googleapis.com/ConversionValueRule'
  _CONVERSIONVALUERULESET.fields_by_name['owner_customer']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['owner_customer']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/Customer'
  _CONVERSIONVALUERULESET.fields_by_name['attachment_type']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['attachment_type']._serialized_options = b'\340A\005'
  _CONVERSIONVALUERULESET.fields_by_name['campaign']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['campaign']._serialized_options = b'\372A#\n!googleads.googleapis.com/Campaign'
  _CONVERSIONVALUERULESET.fields_by_name['status']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['status']._serialized_options = b'\340A\003'
  _CONVERSIONVALUERULESET.fields_by_name['conversion_action_categories']._options = None
  _CONVERSIONVALUERULESET.fields_by_name['conversion_action_categories']._serialized_options = b'\340A\005'
  _CONVERSIONVALUERULESET._options = None
  _CONVERSIONVALUERULESET._serialized_options = b'\352A\201\001\n/googleads.googleapis.com/ConversionValueRuleSet\022Ncustomers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}'
  _CONVERSIONVALUERULESET._serialized_start=435
  _CONVERSIONVALUERULESET._serialized_end=1369
# @@protoc_insertion_point(module_scope)
