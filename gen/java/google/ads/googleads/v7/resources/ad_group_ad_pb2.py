# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/resources/ad_group_ad.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_common_dot_policy__pb2
from google.ads.googleads.v7.enums import ad_group_ad_status_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_ad__group__ad__status__pb2
from google.ads.googleads.v7.enums import ad_strength_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_ad__strength__pb2
from google.ads.googleads.v7.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v7.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_policy__review__status__pb2
from google.ads.googleads.v7.resources import ad_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/resources/ad_group_ad.proto',
  package='google.ads.googleads.v7.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v7.resourcesB\016AdGroupAdProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V7.Resources\312\002!Google\\Ads\\GoogleAds\\V7\\Resources\352\002%Google::Ads::GoogleAds::V7::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3google/ads/googleads/v7/resources/ad_group_ad.proto\x12!google.ads.googleads.v7.resources\x1a+google/ads/googleads/v7/common/policy.proto\x1a\x36google/ads/googleads/v7/enums/ad_group_ad_status.proto\x1a/google/ads/googleads/v7/enums/ad_strength.proto\x1a:google/ads/googleads/v7/enums/policy_approval_status.proto\x1a\x38google/ads/googleads/v7/enums/policy_review_status.proto\x1a*google/ads/googleads/v7/resources/ad.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xf8\x04\n\tAdGroupAd\x12\x41\n\rresource_name\x18\x01 \x01(\tB*\xe0\x41\x05\xfa\x41$\n\"googleads.googleapis.com/AdGroupAd\x12R\n\x06status\x18\x03 \x01(\x0e\x32\x42.google.ads.googleads.v7.enums.AdGroupAdStatusEnum.AdGroupAdStatus\x12?\n\x08\x61\x64_group\x18\t \x01(\tB(\xe0\x41\x05\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x00\x88\x01\x01\x12\x36\n\x02\x61\x64\x18\x05 \x01(\x0b\x32%.google.ads.googleads.v7.resources.AdB\x03\xe0\x41\x05\x12V\n\x0epolicy_summary\x18\x06 \x01(\x0b\x32\x39.google.ads.googleads.v7.resources.AdGroupAdPolicySummaryB\x03\xe0\x41\x03\x12R\n\x0b\x61\x64_strength\x18\x07 \x01(\x0e\x32\x38.google.ads.googleads.v7.enums.AdStrengthEnum.AdStrengthB\x03\xe0\x41\x03\x12?\n\x06labels\x18\n \x03(\tB/\xe0\x41\x03\xfa\x41)\n\'googleads.googleapis.com/AdGroupAdLabel:a\xea\x41^\n\"googleads.googleapis.com/AdGroupAd\x12\x38\x63ustomers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}B\x0b\n\t_ad_group\"\xbf\x02\n\x16\x41\x64GroupAdPolicySummary\x12S\n\x14policy_topic_entries\x18\x01 \x03(\x0b\x32\x30.google.ads.googleads.v7.common.PolicyTopicEntryB\x03\xe0\x41\x03\x12\x64\n\rreview_status\x18\x02 \x01(\x0e\x32H.google.ads.googleads.v7.enums.PolicyReviewStatusEnum.PolicyReviewStatusB\x03\xe0\x41\x03\x12j\n\x0f\x61pproval_status\x18\x03 \x01(\x0e\x32L.google.ads.googleads.v7.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\x03\xe0\x41\x03\x42\xfb\x01\n%com.google.ads.googleads.v7.resourcesB\x0e\x41\x64GroupAdProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v7/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V7.Resources\xca\x02!Google\\Ads\\GoogleAds\\V7\\Resources\xea\x02%Google::Ads::GoogleAds::V7::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_common_dot_policy__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_ad__group__ad__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_ad__strength__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_policy__approval__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_policy__review__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ADGROUPAD = _descriptor.Descriptor(
  name='AdGroupAd',
  full_name='google.ads.googleads.v7.resources.AdGroupAd',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.resources.AdGroupAd.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A$\n\"googleads.googleapis.com/AdGroupAd', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v7.resources.AdGroupAd.status', index=1,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group', full_name='google.ads.googleads.v7.resources.AdGroupAd.ad_group', index=2,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\"\n googleads.googleapis.com/AdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad', full_name='google.ads.googleads.v7.resources.AdGroupAd.ad', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policy_summary', full_name='google.ads.googleads.v7.resources.AdGroupAd.policy_summary', index=4,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_strength', full_name='google.ads.googleads.v7.resources.AdGroupAd.ad_strength', index=5,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='labels', full_name='google.ads.googleads.v7.resources.AdGroupAd.labels', index=6,
      number=10, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A)\n\'googleads.googleapis.com/AdGroupAdLabel', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A^\n\"googleads.googleapis.com/AdGroupAd\0228customers/{customer_id}/adGroupAds/{ad_group_id}~{ad_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_ad_group', full_name='google.ads.googleads.v7.resources.AdGroupAd._ad_group',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=493,
  serialized_end=1125,
)


_ADGROUPADPOLICYSUMMARY = _descriptor.Descriptor(
  name='AdGroupAdPolicySummary',
  full_name='google.ads.googleads.v7.resources.AdGroupAdPolicySummary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='policy_topic_entries', full_name='google.ads.googleads.v7.resources.AdGroupAdPolicySummary.policy_topic_entries', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='review_status', full_name='google.ads.googleads.v7.resources.AdGroupAdPolicySummary.review_status', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='approval_status', full_name='google.ads.googleads.v7.resources.AdGroupAdPolicySummary.approval_status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
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
  ],
  serialized_start=1128,
  serialized_end=1447,
)

_ADGROUPAD.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_ad__group__ad__status__pb2._ADGROUPADSTATUSENUM_ADGROUPADSTATUS
_ADGROUPAD.fields_by_name['ad'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__pb2._AD
_ADGROUPAD.fields_by_name['policy_summary'].message_type = _ADGROUPADPOLICYSUMMARY
_ADGROUPAD.fields_by_name['ad_strength'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_ad__strength__pb2._ADSTRENGTHENUM_ADSTRENGTH
_ADGROUPAD.oneofs_by_name['_ad_group'].fields.append(
  _ADGROUPAD.fields_by_name['ad_group'])
_ADGROUPAD.fields_by_name['ad_group'].containing_oneof = _ADGROUPAD.oneofs_by_name['_ad_group']
_ADGROUPADPOLICYSUMMARY.fields_by_name['policy_topic_entries'].message_type = google_dot_ads_dot_googleads_dot_v7_dot_common_dot_policy__pb2._POLICYTOPICENTRY
_ADGROUPADPOLICYSUMMARY.fields_by_name['review_status'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_policy__review__status__pb2._POLICYREVIEWSTATUSENUM_POLICYREVIEWSTATUS
_ADGROUPADPOLICYSUMMARY.fields_by_name['approval_status'].enum_type = google_dot_ads_dot_googleads_dot_v7_dot_enums_dot_policy__approval__status__pb2._POLICYAPPROVALSTATUSENUM_POLICYAPPROVALSTATUS
DESCRIPTOR.message_types_by_name['AdGroupAd'] = _ADGROUPAD
DESCRIPTOR.message_types_by_name['AdGroupAdPolicySummary'] = _ADGROUPADPOLICYSUMMARY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupAd = _reflection.GeneratedProtocolMessageType('AdGroupAd', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPAD,
  '__module__' : 'google.ads.googleads.v7.resources.ad_group_ad_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.AdGroupAd)
  })
_sym_db.RegisterMessage(AdGroupAd)

AdGroupAdPolicySummary = _reflection.GeneratedProtocolMessageType('AdGroupAdPolicySummary', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPADPOLICYSUMMARY,
  '__module__' : 'google.ads.googleads.v7.resources.ad_group_ad_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.resources.AdGroupAdPolicySummary)
  })
_sym_db.RegisterMessage(AdGroupAdPolicySummary)


DESCRIPTOR._options = None
_ADGROUPAD.fields_by_name['resource_name']._options = None
_ADGROUPAD.fields_by_name['ad_group']._options = None
_ADGROUPAD.fields_by_name['ad']._options = None
_ADGROUPAD.fields_by_name['policy_summary']._options = None
_ADGROUPAD.fields_by_name['ad_strength']._options = None
_ADGROUPAD.fields_by_name['labels']._options = None
_ADGROUPAD._options = None
_ADGROUPADPOLICYSUMMARY.fields_by_name['policy_topic_entries']._options = None
_ADGROUPADPOLICYSUMMARY.fields_by_name['review_status']._options = None
_ADGROUPADPOLICYSUMMARY.fields_by_name['approval_status']._options = None
# @@protoc_insertion_point(module_scope)
