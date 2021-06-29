# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/feed_item.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.common import custom_parameter_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_custom__parameter__pb2
from google.ads.googleads.v8.common import feed_common_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_feed__common__pb2
from google.ads.googleads.v8.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_policy__pb2
from google.ads.googleads.v8.enums import feed_item_quality_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__quality__approval__status__pb2
from google.ads.googleads.v8.enums import feed_item_quality_disapproval_reason_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__quality__disapproval__reason__pb2
from google.ads.googleads.v8.enums import feed_item_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__status__pb2
from google.ads.googleads.v8.enums import feed_item_validation_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__validation__status__pb2
from google.ads.googleads.v8.enums import geo_targeting_restriction_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_geo__targeting__restriction__pb2
from google.ads.googleads.v8.enums import placeholder_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_placeholder__type__pb2
from google.ads.googleads.v8.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v8.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__review__status__pb2
from google.ads.googleads.v8.errors import feed_item_validation_error_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_errors_dot_feed__item__validation__error__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/feed_item.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\rFeedItemProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/ads/googleads/v8/resources/feed_item.proto\x12!google.ads.googleads.v8.resources\x1a\x35google/ads/googleads/v8/common/custom_parameter.proto\x1a\x30google/ads/googleads/v8/common/feed_common.proto\x1a+google/ads/googleads/v8/common/policy.proto\x1a\x45google/ads/googleads/v8/enums/feed_item_quality_approval_status.proto\x1aHgoogle/ads/googleads/v8/enums/feed_item_quality_disapproval_reason.proto\x1a\x34google/ads/googleads/v8/enums/feed_item_status.proto\x1a?google/ads/googleads/v8/enums/feed_item_validation_status.proto\x1a=google/ads/googleads/v8/enums/geo_targeting_restriction.proto\x1a\x34google/ads/googleads/v8/enums/placeholder_type.proto\x1a:google/ads/googleads/v8/enums/policy_approval_status.proto\x1a\x38google/ads/googleads/v8/enums/policy_review_status.proto\x1a?google/ads/googleads/v8/errors/feed_item_validation_error.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xc0\x06\n\x08\x46\x65\x65\x64Item\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/FeedItem\x12\x38\n\x04\x66\x65\x65\x64\x18\x0b \x01(\tB%\xe0\x41\x05\xfa\x41\x1f\n\x1dgoogleads.googleapis.com/FeedH\x00\x88\x01\x01\x12\x14\n\x02id\x18\x0c \x01(\x03\x42\x03\xe0\x41\x03H\x01\x88\x01\x01\x12\x1c\n\x0fstart_date_time\x18\r \x01(\tH\x02\x88\x01\x01\x12\x1a\n\rend_date_time\x18\x0e \x01(\tH\x03\x88\x01\x01\x12S\n\x10\x61ttribute_values\x18\x06 \x03(\x0b\x32\x39.google.ads.googleads.v8.resources.FeedItemAttributeValue\x12u\n\x19geo_targeting_restriction\x18\x07 \x01(\x0e\x32R.google.ads.googleads.v8.enums.GeoTargetingRestrictionEnum.GeoTargetingRestriction\x12N\n\x15url_custom_parameters\x18\x08 \x03(\x0b\x32/.google.ads.googleads.v8.common.CustomParameter\x12U\n\x06status\x18\t \x01(\x0e\x32@.google.ads.googleads.v8.enums.FeedItemStatusEnum.FeedItemStatusB\x03\xe0\x41\x03\x12[\n\x0cpolicy_infos\x18\n \x03(\x0b\x32@.google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfoB\x03\xe0\x41\x03:b\xea\x41_\n!googleads.googleapis.com/FeedItem\x12:customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}B\x07\n\x05_feedB\x05\n\x03_idB\x12\n\x10_start_date_timeB\x10\n\x0e_end_date_time\"\x9c\x03\n\x16\x46\x65\x65\x64ItemAttributeValue\x12\x1e\n\x11\x66\x65\x65\x64_attribute_id\x18\x0b \x01(\x03H\x00\x88\x01\x01\x12\x1a\n\rinteger_value\x18\x0c \x01(\x03H\x01\x88\x01\x01\x12\x1a\n\rboolean_value\x18\r \x01(\x08H\x02\x88\x01\x01\x12\x19\n\x0cstring_value\x18\x0e \x01(\tH\x03\x88\x01\x01\x12\x19\n\x0c\x64ouble_value\x18\x0f \x01(\x01H\x04\x88\x01\x01\x12:\n\x0bprice_value\x18\x06 \x01(\x0b\x32%.google.ads.googleads.v8.common.Money\x12\x16\n\x0einteger_values\x18\x10 \x03(\x03\x12\x16\n\x0e\x62oolean_values\x18\x11 \x03(\x08\x12\x15\n\rstring_values\x18\x12 \x03(\t\x12\x15\n\rdouble_values\x18\x13 \x03(\x01\x42\x14\n\x12_feed_attribute_idB\x10\n\x0e_integer_valueB\x10\n\x0e_boolean_valueB\x0f\n\r_string_valueB\x0f\n\r_double_value\"\xe5\x07\n\x1d\x46\x65\x65\x64ItemPlaceholderPolicyInfo\x12\x66\n\x15placeholder_type_enum\x18\n \x01(\x0e\x32\x42.google.ads.googleads.v8.enums.PlaceholderTypeEnum.PlaceholderTypeB\x03\xe0\x41\x03\x12,\n\x1a\x66\x65\x65\x64_mapping_resource_name\x18\x0b \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x64\n\rreview_status\x18\x03 \x01(\x0e\x32H.google.ads.googleads.v8.enums.PolicyReviewStatusEnum.PolicyReviewStatusB\x03\xe0\x41\x03\x12j\n\x0f\x61pproval_status\x18\x04 \x01(\x0e\x32L.google.ads.googleads.v8.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\x03\xe0\x41\x03\x12S\n\x14policy_topic_entries\x18\x05 \x03(\x0b\x32\x30.google.ads.googleads.v8.common.PolicyTopicEntryB\x03\xe0\x41\x03\x12t\n\x11validation_status\x18\x06 \x01(\x0e\x32T.google.ads.googleads.v8.enums.FeedItemValidationStatusEnum.FeedItemValidationStatusB\x03\xe0\x41\x03\x12Z\n\x11validation_errors\x18\x07 \x03(\x0b\x32:.google.ads.googleads.v8.resources.FeedItemValidationErrorB\x03\xe0\x41\x03\x12\x84\x01\n\x17quality_approval_status\x18\x08 \x01(\x0e\x32^.google.ads.googleads.v8.enums.FeedItemQualityApprovalStatusEnum.FeedItemQualityApprovalStatusB\x03\xe0\x41\x03\x12\x8e\x01\n\x1bquality_disapproval_reasons\x18\t \x03(\x0e\x32\x64.google.ads.googleads.v8.enums.FeedItemQualityDisapprovalReasonEnum.FeedItemQualityDisapprovalReasonB\x03\xe0\x41\x03\x42\x1d\n\x1b_feed_mapping_resource_name\"\x8a\x02\n\x17\x46\x65\x65\x64ItemValidationError\x12r\n\x10validation_error\x18\x01 \x01(\x0e\x32S.google.ads.googleads.v8.errors.FeedItemValidationErrorEnum.FeedItemValidationErrorB\x03\xe0\x41\x03\x12\x1d\n\x0b\x64\x65scription\x18\x06 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x1f\n\x12\x66\x65\x65\x64_attribute_ids\x18\x07 \x03(\x03\x42\x03\xe0\x41\x03\x12\x1c\n\nextra_info\x18\x08 \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x42\x0e\n\x0c_descriptionB\r\n\x0b_extra_infoB\xfa\x01\n%com.google.ads.googleads.v8.resourcesB\rFeedItemProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_common_dot_custom__parameter__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_common_dot_feed__common__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_common_dot_policy__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__quality__approval__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__quality__disapproval__reason__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__validation__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_geo__targeting__restriction__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_placeholder__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__approval__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__review__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_errors_dot_feed__item__validation__error__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_FEEDITEM = _descriptor.Descriptor(
  name='FeedItem',
  full_name='google.ads.googleads.v8.resources.FeedItem',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.FeedItem.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/FeedItem', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed', full_name='google.ads.googleads.v8.resources.FeedItem.feed', index=1,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\037\n\035googleads.googleapis.com/Feed', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v8.resources.FeedItem.id', index=2,
      number=12, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_date_time', full_name='google.ads.googleads.v8.resources.FeedItem.start_date_time', index=3,
      number=13, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_date_time', full_name='google.ads.googleads.v8.resources.FeedItem.end_date_time', index=4,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='attribute_values', full_name='google.ads.googleads.v8.resources.FeedItem.attribute_values', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_targeting_restriction', full_name='google.ads.googleads.v8.resources.FeedItem.geo_targeting_restriction', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='url_custom_parameters', full_name='google.ads.googleads.v8.resources.FeedItem.url_custom_parameters', index=7,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v8.resources.FeedItem.status', index=8,
      number=9, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policy_infos', full_name='google.ads.googleads.v8.resources.FeedItem.policy_infos', index=9,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A_\n!googleads.googleapis.com/FeedItem\022:customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_feed', full_name='google.ads.googleads.v8.resources.FeedItem._feed',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v8.resources.FeedItem._id',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_start_date_time', full_name='google.ads.googleads.v8.resources.FeedItem._start_date_time',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_end_date_time', full_name='google.ads.googleads.v8.resources.FeedItem._end_date_time',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=893,
  serialized_end=1725,
)


_FEEDITEMATTRIBUTEVALUE = _descriptor.Descriptor(
  name='FeedItemAttributeValue',
  full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='feed_attribute_id', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.feed_attribute_id', index=0,
      number=11, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='integer_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.integer_value', index=1,
      number=12, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='boolean_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.boolean_value', index=2,
      number=13, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='string_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.string_value', index=3,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='double_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.double_value', index=4,
      number=15, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='price_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.price_value', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='integer_values', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.integer_values', index=6,
      number=16, type=3, cpp_type=2, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='boolean_values', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.boolean_values', index=7,
      number=17, type=8, cpp_type=7, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='string_values', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.string_values', index=8,
      number=18, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='double_values', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue.double_values', index=9,
      number=19, type=1, cpp_type=5, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_feed_attribute_id', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue._feed_attribute_id',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_integer_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue._integer_value',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_boolean_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue._boolean_value',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_string_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue._string_value',
      index=3, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_double_value', full_name='google.ads.googleads.v8.resources.FeedItemAttributeValue._double_value',
      index=4, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=1728,
  serialized_end=2140,
)


_FEEDITEMPLACEHOLDERPOLICYINFO = _descriptor.Descriptor(
  name='FeedItemPlaceholderPolicyInfo',
  full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='placeholder_type_enum', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.placeholder_type_enum', index=0,
      number=10, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_mapping_resource_name', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.feed_mapping_resource_name', index=1,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='review_status', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.review_status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='approval_status', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.approval_status', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policy_topic_entries', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.policy_topic_entries', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validation_status', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.validation_status', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='validation_errors', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.validation_errors', index=6,
      number=7, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quality_approval_status', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.quality_approval_status', index=7,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quality_disapproval_reasons', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo.quality_disapproval_reasons', index=8,
      number=9, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_feed_mapping_resource_name', full_name='google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo._feed_mapping_resource_name',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=2143,
  serialized_end=3140,
)


_FEEDITEMVALIDATIONERROR = _descriptor.Descriptor(
  name='FeedItemValidationError',
  full_name='google.ads.googleads.v8.resources.FeedItemValidationError',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='validation_error', full_name='google.ads.googleads.v8.resources.FeedItemValidationError.validation_error', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='description', full_name='google.ads.googleads.v8.resources.FeedItemValidationError.description', index=1,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_attribute_ids', full_name='google.ads.googleads.v8.resources.FeedItemValidationError.feed_attribute_ids', index=2,
      number=7, type=3, cpp_type=2, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='extra_info', full_name='google.ads.googleads.v8.resources.FeedItemValidationError.extra_info', index=3,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_description', full_name='google.ads.googleads.v8.resources.FeedItemValidationError._description',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_extra_info', full_name='google.ads.googleads.v8.resources.FeedItemValidationError._extra_info',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=3143,
  serialized_end=3409,
)

_FEEDITEM.fields_by_name['attribute_values'].message_type = _FEEDITEMATTRIBUTEVALUE
_FEEDITEM.fields_by_name['geo_targeting_restriction'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_geo__targeting__restriction__pb2._GEOTARGETINGRESTRICTIONENUM_GEOTARGETINGRESTRICTION
_FEEDITEM.fields_by_name['url_custom_parameters'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_custom__parameter__pb2._CUSTOMPARAMETER
_FEEDITEM.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__status__pb2._FEEDITEMSTATUSENUM_FEEDITEMSTATUS
_FEEDITEM.fields_by_name['policy_infos'].message_type = _FEEDITEMPLACEHOLDERPOLICYINFO
_FEEDITEM.oneofs_by_name['_feed'].fields.append(
  _FEEDITEM.fields_by_name['feed'])
_FEEDITEM.fields_by_name['feed'].containing_oneof = _FEEDITEM.oneofs_by_name['_feed']
_FEEDITEM.oneofs_by_name['_id'].fields.append(
  _FEEDITEM.fields_by_name['id'])
_FEEDITEM.fields_by_name['id'].containing_oneof = _FEEDITEM.oneofs_by_name['_id']
_FEEDITEM.oneofs_by_name['_start_date_time'].fields.append(
  _FEEDITEM.fields_by_name['start_date_time'])
_FEEDITEM.fields_by_name['start_date_time'].containing_oneof = _FEEDITEM.oneofs_by_name['_start_date_time']
_FEEDITEM.oneofs_by_name['_end_date_time'].fields.append(
  _FEEDITEM.fields_by_name['end_date_time'])
_FEEDITEM.fields_by_name['end_date_time'].containing_oneof = _FEEDITEM.oneofs_by_name['_end_date_time']
_FEEDITEMATTRIBUTEVALUE.fields_by_name['price_value'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_feed__common__pb2._MONEY
_FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_feed_attribute_id'].fields.append(
  _FEEDITEMATTRIBUTEVALUE.fields_by_name['feed_attribute_id'])
_FEEDITEMATTRIBUTEVALUE.fields_by_name['feed_attribute_id'].containing_oneof = _FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_feed_attribute_id']
_FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_integer_value'].fields.append(
  _FEEDITEMATTRIBUTEVALUE.fields_by_name['integer_value'])
_FEEDITEMATTRIBUTEVALUE.fields_by_name['integer_value'].containing_oneof = _FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_integer_value']
_FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_boolean_value'].fields.append(
  _FEEDITEMATTRIBUTEVALUE.fields_by_name['boolean_value'])
_FEEDITEMATTRIBUTEVALUE.fields_by_name['boolean_value'].containing_oneof = _FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_boolean_value']
_FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_string_value'].fields.append(
  _FEEDITEMATTRIBUTEVALUE.fields_by_name['string_value'])
_FEEDITEMATTRIBUTEVALUE.fields_by_name['string_value'].containing_oneof = _FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_string_value']
_FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_double_value'].fields.append(
  _FEEDITEMATTRIBUTEVALUE.fields_by_name['double_value'])
_FEEDITEMATTRIBUTEVALUE.fields_by_name['double_value'].containing_oneof = _FEEDITEMATTRIBUTEVALUE.oneofs_by_name['_double_value']
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['placeholder_type_enum'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_placeholder__type__pb2._PLACEHOLDERTYPEENUM_PLACEHOLDERTYPE
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['review_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__review__status__pb2._POLICYREVIEWSTATUSENUM_POLICYREVIEWSTATUS
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['approval_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__approval__status__pb2._POLICYAPPROVALSTATUSENUM_POLICYAPPROVALSTATUS
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['policy_topic_entries'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_policy__pb2._POLICYTOPICENTRY
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['validation_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__validation__status__pb2._FEEDITEMVALIDATIONSTATUSENUM_FEEDITEMVALIDATIONSTATUS
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['validation_errors'].message_type = _FEEDITEMVALIDATIONERROR
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['quality_approval_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__quality__approval__status__pb2._FEEDITEMQUALITYAPPROVALSTATUSENUM_FEEDITEMQUALITYAPPROVALSTATUS
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['quality_disapproval_reasons'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__quality__disapproval__reason__pb2._FEEDITEMQUALITYDISAPPROVALREASONENUM_FEEDITEMQUALITYDISAPPROVALREASON
_FEEDITEMPLACEHOLDERPOLICYINFO.oneofs_by_name['_feed_mapping_resource_name'].fields.append(
  _FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['feed_mapping_resource_name'])
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['feed_mapping_resource_name'].containing_oneof = _FEEDITEMPLACEHOLDERPOLICYINFO.oneofs_by_name['_feed_mapping_resource_name']
_FEEDITEMVALIDATIONERROR.fields_by_name['validation_error'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_errors_dot_feed__item__validation__error__pb2._FEEDITEMVALIDATIONERRORENUM_FEEDITEMVALIDATIONERROR
_FEEDITEMVALIDATIONERROR.oneofs_by_name['_description'].fields.append(
  _FEEDITEMVALIDATIONERROR.fields_by_name['description'])
_FEEDITEMVALIDATIONERROR.fields_by_name['description'].containing_oneof = _FEEDITEMVALIDATIONERROR.oneofs_by_name['_description']
_FEEDITEMVALIDATIONERROR.oneofs_by_name['_extra_info'].fields.append(
  _FEEDITEMVALIDATIONERROR.fields_by_name['extra_info'])
_FEEDITEMVALIDATIONERROR.fields_by_name['extra_info'].containing_oneof = _FEEDITEMVALIDATIONERROR.oneofs_by_name['_extra_info']
DESCRIPTOR.message_types_by_name['FeedItem'] = _FEEDITEM
DESCRIPTOR.message_types_by_name['FeedItemAttributeValue'] = _FEEDITEMATTRIBUTEVALUE
DESCRIPTOR.message_types_by_name['FeedItemPlaceholderPolicyInfo'] = _FEEDITEMPLACEHOLDERPOLICYINFO
DESCRIPTOR.message_types_by_name['FeedItemValidationError'] = _FEEDITEMVALIDATIONERROR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedItem = _reflection.GeneratedProtocolMessageType('FeedItem', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEM,
  '__module__' : 'google.ads.googleads.v8.resources.feed_item_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.FeedItem)
  })
_sym_db.RegisterMessage(FeedItem)

FeedItemAttributeValue = _reflection.GeneratedProtocolMessageType('FeedItemAttributeValue', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMATTRIBUTEVALUE,
  '__module__' : 'google.ads.googleads.v8.resources.feed_item_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.FeedItemAttributeValue)
  })
_sym_db.RegisterMessage(FeedItemAttributeValue)

FeedItemPlaceholderPolicyInfo = _reflection.GeneratedProtocolMessageType('FeedItemPlaceholderPolicyInfo', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMPLACEHOLDERPOLICYINFO,
  '__module__' : 'google.ads.googleads.v8.resources.feed_item_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.FeedItemPlaceholderPolicyInfo)
  })
_sym_db.RegisterMessage(FeedItemPlaceholderPolicyInfo)

FeedItemValidationError = _reflection.GeneratedProtocolMessageType('FeedItemValidationError', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMVALIDATIONERROR,
  '__module__' : 'google.ads.googleads.v8.resources.feed_item_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.FeedItemValidationError)
  })
_sym_db.RegisterMessage(FeedItemValidationError)


DESCRIPTOR._options = None
_FEEDITEM.fields_by_name['resource_name']._options = None
_FEEDITEM.fields_by_name['feed']._options = None
_FEEDITEM.fields_by_name['id']._options = None
_FEEDITEM.fields_by_name['status']._options = None
_FEEDITEM.fields_by_name['policy_infos']._options = None
_FEEDITEM._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['placeholder_type_enum']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['feed_mapping_resource_name']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['review_status']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['approval_status']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['policy_topic_entries']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['validation_status']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['validation_errors']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['quality_approval_status']._options = None
_FEEDITEMPLACEHOLDERPOLICYINFO.fields_by_name['quality_disapproval_reasons']._options = None
_FEEDITEMVALIDATIONERROR.fields_by_name['validation_error']._options = None
_FEEDITEMVALIDATIONERROR.fields_by_name['description']._options = None
_FEEDITEMVALIDATIONERROR.fields_by_name['feed_attribute_ids']._options = None
_FEEDITEMVALIDATIONERROR.fields_by_name['extra_info']._options = None
# @@protoc_insertion_point(module_scope)
