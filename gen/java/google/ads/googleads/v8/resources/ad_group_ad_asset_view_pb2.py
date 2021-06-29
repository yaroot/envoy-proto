# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/ad_group_ad_asset_view.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.common import policy_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_policy__pb2
from google.ads.googleads.v8.enums import asset_field_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__field__type__pb2
from google.ads.googleads.v8.enums import asset_performance_label_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__performance__label__pb2
from google.ads.googleads.v8.enums import policy_approval_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__approval__status__pb2
from google.ads.googleads.v8.enums import policy_review_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__review__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/ad_group_ad_asset_view.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\027AdGroupAdAssetViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v8/resources/ad_group_ad_asset_view.proto\x12!google.ads.googleads.v8.resources\x1a+google/ads/googleads/v8/common/policy.proto\x1a\x34google/ads/googleads/v8/enums/asset_field_type.proto\x1a;google/ads/googleads/v8/enums/asset_performance_label.proto\x1a:google/ads/googleads/v8/enums/policy_approval_status.proto\x1a\x38google/ads/googleads/v8/enums/policy_review_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xda\x05\n\x12\x41\x64GroupAdAssetView\x12J\n\rresource_name\x18\x01 \x01(\tB3\xe0\x41\x03\xfa\x41-\n+googleads.googleapis.com/AdGroupAdAssetView\x12\x44\n\x0b\x61\x64_group_ad\x18\t \x01(\tB*\xe0\x41\x03\xfa\x41$\n\"googleads.googleapis.com/AdGroupAdH\x00\x88\x01\x01\x12:\n\x05\x61sset\x18\n \x01(\tB&\xe0\x41\x03\xfa\x41 \n\x1egoogleads.googleapis.com/AssetH\x01\x88\x01\x01\x12Y\n\nfield_type\x18\x02 \x01(\x0e\x32@.google.ads.googleads.v8.enums.AssetFieldTypeEnum.AssetFieldTypeB\x03\xe0\x41\x03\x12\x19\n\x07\x65nabled\x18\x08 \x01(\x08\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12[\n\x0epolicy_summary\x18\x03 \x01(\x0b\x32>.google.ads.googleads.v8.resources.AdGroupAdAssetPolicySummaryB\x03\xe0\x41\x03\x12n\n\x11performance_label\x18\x04 \x01(\x0e\x32N.google.ads.googleads.v8.enums.AssetPerformanceLabelEnum.AssetPerformanceLabelB\x03\xe0\x41\x03:\x8c\x01\xea\x41\x88\x01\n+googleads.googleapis.com/AdGroupAdAssetView\x12Ycustomers/{customer_id}/adGroupAdAssetViews/{ad_group_id}~{ad_id}~{asset_id}~{field_type}B\x0e\n\x0c_ad_group_adB\x08\n\x06_assetB\n\n\x08_enabled\"\xc4\x02\n\x1b\x41\x64GroupAdAssetPolicySummary\x12S\n\x14policy_topic_entries\x18\x01 \x03(\x0b\x32\x30.google.ads.googleads.v8.common.PolicyTopicEntryB\x03\xe0\x41\x03\x12\x64\n\rreview_status\x18\x02 \x01(\x0e\x32H.google.ads.googleads.v8.enums.PolicyReviewStatusEnum.PolicyReviewStatusB\x03\xe0\x41\x03\x12j\n\x0f\x61pproval_status\x18\x03 \x01(\x0e\x32L.google.ads.googleads.v8.enums.PolicyApprovalStatusEnum.PolicyApprovalStatusB\x03\xe0\x41\x03\x42\x84\x02\n%com.google.ads.googleads.v8.resourcesB\x17\x41\x64GroupAdAssetViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_common_dot_policy__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__field__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__performance__label__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__approval__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__review__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_ADGROUPADASSETVIEW = _descriptor.Descriptor(
  name='AdGroupAdAssetView',
  full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A-\n+googleads.googleapis.com/AdGroupAdAssetView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group_ad', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.ad_group_ad', index=1,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A$\n\"googleads.googleapis.com/AdGroupAd', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='asset', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.asset', index=2,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A \n\036googleads.googleapis.com/Asset', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='field_type', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.field_type', index=3,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='enabled', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.enabled', index=4,
      number=8, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='policy_summary', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.policy_summary', index=5,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='performance_label', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView.performance_label', index=6,
      number=4, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\352A\210\001\n+googleads.googleapis.com/AdGroupAdAssetView\022Ycustomers/{customer_id}/adGroupAdAssetViews/{ad_group_id}~{ad_id}~{asset_id}~{field_type}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_ad_group_ad', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView._ad_group_ad',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_asset', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView._asset',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_enabled', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetView._enabled',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=470,
  serialized_end=1200,
)


_ADGROUPADASSETPOLICYSUMMARY = _descriptor.Descriptor(
  name='AdGroupAdAssetPolicySummary',
  full_name='google.ads.googleads.v8.resources.AdGroupAdAssetPolicySummary',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='policy_topic_entries', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetPolicySummary.policy_topic_entries', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='review_status', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetPolicySummary.review_status', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='approval_status', full_name='google.ads.googleads.v8.resources.AdGroupAdAssetPolicySummary.approval_status', index=2,
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
  serialized_start=1203,
  serialized_end=1527,
)

_ADGROUPADASSETVIEW.fields_by_name['field_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__field__type__pb2._ASSETFIELDTYPEENUM_ASSETFIELDTYPE
_ADGROUPADASSETVIEW.fields_by_name['policy_summary'].message_type = _ADGROUPADASSETPOLICYSUMMARY
_ADGROUPADASSETVIEW.fields_by_name['performance_label'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_asset__performance__label__pb2._ASSETPERFORMANCELABELENUM_ASSETPERFORMANCELABEL
_ADGROUPADASSETVIEW.oneofs_by_name['_ad_group_ad'].fields.append(
  _ADGROUPADASSETVIEW.fields_by_name['ad_group_ad'])
_ADGROUPADASSETVIEW.fields_by_name['ad_group_ad'].containing_oneof = _ADGROUPADASSETVIEW.oneofs_by_name['_ad_group_ad']
_ADGROUPADASSETVIEW.oneofs_by_name['_asset'].fields.append(
  _ADGROUPADASSETVIEW.fields_by_name['asset'])
_ADGROUPADASSETVIEW.fields_by_name['asset'].containing_oneof = _ADGROUPADASSETVIEW.oneofs_by_name['_asset']
_ADGROUPADASSETVIEW.oneofs_by_name['_enabled'].fields.append(
  _ADGROUPADASSETVIEW.fields_by_name['enabled'])
_ADGROUPADASSETVIEW.fields_by_name['enabled'].containing_oneof = _ADGROUPADASSETVIEW.oneofs_by_name['_enabled']
_ADGROUPADASSETPOLICYSUMMARY.fields_by_name['policy_topic_entries'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_policy__pb2._POLICYTOPICENTRY
_ADGROUPADASSETPOLICYSUMMARY.fields_by_name['review_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__review__status__pb2._POLICYREVIEWSTATUSENUM_POLICYREVIEWSTATUS
_ADGROUPADASSETPOLICYSUMMARY.fields_by_name['approval_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_policy__approval__status__pb2._POLICYAPPROVALSTATUSENUM_POLICYAPPROVALSTATUS
DESCRIPTOR.message_types_by_name['AdGroupAdAssetView'] = _ADGROUPADASSETVIEW
DESCRIPTOR.message_types_by_name['AdGroupAdAssetPolicySummary'] = _ADGROUPADASSETPOLICYSUMMARY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdGroupAdAssetView = _reflection.GeneratedProtocolMessageType('AdGroupAdAssetView', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPADASSETVIEW,
  '__module__' : 'google.ads.googleads.v8.resources.ad_group_ad_asset_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AdGroupAdAssetView)
  })
_sym_db.RegisterMessage(AdGroupAdAssetView)

AdGroupAdAssetPolicySummary = _reflection.GeneratedProtocolMessageType('AdGroupAdAssetPolicySummary', (_message.Message,), {
  'DESCRIPTOR' : _ADGROUPADASSETPOLICYSUMMARY,
  '__module__' : 'google.ads.googleads.v8.resources.ad_group_ad_asset_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.AdGroupAdAssetPolicySummary)
  })
_sym_db.RegisterMessage(AdGroupAdAssetPolicySummary)


DESCRIPTOR._options = None
_ADGROUPADASSETVIEW.fields_by_name['resource_name']._options = None
_ADGROUPADASSETVIEW.fields_by_name['ad_group_ad']._options = None
_ADGROUPADASSETVIEW.fields_by_name['asset']._options = None
_ADGROUPADASSETVIEW.fields_by_name['field_type']._options = None
_ADGROUPADASSETVIEW.fields_by_name['enabled']._options = None
_ADGROUPADASSETVIEW.fields_by_name['policy_summary']._options = None
_ADGROUPADASSETVIEW.fields_by_name['performance_label']._options = None
_ADGROUPADASSETVIEW._options = None
_ADGROUPADASSETPOLICYSUMMARY.fields_by_name['policy_topic_entries']._options = None
_ADGROUPADASSETPOLICYSUMMARY.fields_by_name['review_status']._options = None
_ADGROUPADASSETPOLICYSUMMARY.fields_by_name['approval_status']._options = None
# @@protoc_insertion_point(module_scope)