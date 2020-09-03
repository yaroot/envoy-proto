# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/resources/customer_negative_criterion.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2
from google.ads.googleads.v4.enums import criterion_type_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_criterion__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/resources/customer_negative_criterion.proto',
  package='google.ads.googleads.v4.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v4.resourcesB\036CustomerNegativeCriterionProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ads::GoogleAds::V4::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nCgoogle/ads/googleads/v4/resources/customer_negative_criterion.proto\x12!google.ads.googleads.v4.resources\x1a-google/ads/googleads/v4/common/criteria.proto\x1a\x32google/ads/googleads/v4/enums/criterion_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x1cgoogle/api/annotations.proto\"\xf6\x06\n\x19\x43ustomerNegativeCriterion\x12Q\n\rresource_name\x18\x01 \x01(\tB:\xe0\x41\x05\xfa\x41\x34\n2googleads.googleapis.com/CustomerNegativeCriterion\x12,\n\x02id\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64ValueB\x03\xe0\x41\x03\x12Q\n\x04type\x18\x03 \x01(\x0e\x32>.google.ads.googleads.v4.enums.CriterionTypeEnum.CriterionTypeB\x03\xe0\x41\x03\x12N\n\rcontent_label\x18\x04 \x01(\x0b\x32\x30.google.ads.googleads.v4.common.ContentLabelInfoB\x03\xe0\x41\x05H\x00\x12X\n\x12mobile_application\x18\x05 \x01(\x0b\x32\x35.google.ads.googleads.v4.common.MobileApplicationInfoB\x03\xe0\x41\x05H\x00\x12Y\n\x13mobile_app_category\x18\x06 \x01(\x0b\x32\x35.google.ads.googleads.v4.common.MobileAppCategoryInfoB\x03\xe0\x41\x05H\x00\x12G\n\tplacement\x18\x07 \x01(\x0b\x32-.google.ads.googleads.v4.common.PlacementInfoB\x03\xe0\x41\x05H\x00\x12N\n\ryoutube_video\x18\x08 \x01(\x0b\x32\x30.google.ads.googleads.v4.common.YouTubeVideoInfoB\x03\xe0\x41\x05H\x00\x12R\n\x0fyoutube_channel\x18\t \x01(\x0b\x32\x32.google.ads.googleads.v4.common.YouTubeChannelInfoB\x03\xe0\x41\x05H\x00:\x85\x01\xea\x41\x81\x01\n2googleads.googleapis.com/CustomerNegativeCriterion\x12Kcustomers/{customer}/customerNegativeCriteria/{customer_negative_criterion}B\x0b\n\tcriterionB\x8b\x02\n%com.google.ads.googleads.v4.resourcesB\x1e\x43ustomerNegativeCriterionProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v4/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V4.Resources\xca\x02!Google\\Ads\\GoogleAds\\V4\\Resources\xea\x02%Google::Ads::GoogleAds::V4::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_criterion__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CUSTOMERNEGATIVECRITERION = _descriptor.Descriptor(
  name='CustomerNegativeCriterion',
  full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A4\n2googleads.googleapis.com/CustomerNegativeCriterion', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.id', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content_label', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.content_label', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mobile_application', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.mobile_application', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mobile_app_category', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.mobile_app_category', index=5,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='placement', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.placement', index=6,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='youtube_video', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.youtube_video', index=7,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='youtube_channel', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.youtube_channel', index=8,
      number=9, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A\201\001\n2googleads.googleapis.com/CustomerNegativeCriterion\022Kcustomers/{customer}/customerNegativeCriteria/{customer_negative_criterion}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='criterion', full_name='google.ads.googleads.v4.resources.CustomerNegativeCriterion.criterion',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=328,
  serialized_end=1214,
)

_CUSTOMERNEGATIVECRITERION.fields_by_name['id'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_CUSTOMERNEGATIVECRITERION.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v4_dot_enums_dot_criterion__type__pb2._CRITERIONTYPEENUM_CRITERIONTYPE
_CUSTOMERNEGATIVECRITERION.fields_by_name['content_label'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2._CONTENTLABELINFO
_CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_application'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2._MOBILEAPPLICATIONINFO
_CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_app_category'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2._MOBILEAPPCATEGORYINFO
_CUSTOMERNEGATIVECRITERION.fields_by_name['placement'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2._PLACEMENTINFO
_CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_video'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2._YOUTUBEVIDEOINFO
_CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_channel'].message_type = google_dot_ads_dot_googleads_dot_v4_dot_common_dot_criteria__pb2._YOUTUBECHANNELINFO
_CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion'].fields.append(
  _CUSTOMERNEGATIVECRITERION.fields_by_name['content_label'])
_CUSTOMERNEGATIVECRITERION.fields_by_name['content_label'].containing_oneof = _CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion']
_CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion'].fields.append(
  _CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_application'])
_CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_application'].containing_oneof = _CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion']
_CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion'].fields.append(
  _CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_app_category'])
_CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_app_category'].containing_oneof = _CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion']
_CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion'].fields.append(
  _CUSTOMERNEGATIVECRITERION.fields_by_name['placement'])
_CUSTOMERNEGATIVECRITERION.fields_by_name['placement'].containing_oneof = _CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion']
_CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion'].fields.append(
  _CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_video'])
_CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_video'].containing_oneof = _CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion']
_CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion'].fields.append(
  _CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_channel'])
_CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_channel'].containing_oneof = _CUSTOMERNEGATIVECRITERION.oneofs_by_name['criterion']
DESCRIPTOR.message_types_by_name['CustomerNegativeCriterion'] = _CUSTOMERNEGATIVECRITERION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CustomerNegativeCriterion = _reflection.GeneratedProtocolMessageType('CustomerNegativeCriterion', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMERNEGATIVECRITERION,
  '__module__' : 'google.ads.googleads.v4.resources.customer_negative_criterion_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.CustomerNegativeCriterion)
  })
_sym_db.RegisterMessage(CustomerNegativeCriterion)


DESCRIPTOR._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['resource_name']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['id']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['type']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['content_label']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_application']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['mobile_app_category']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['placement']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_video']._options = None
_CUSTOMERNEGATIVECRITERION.fields_by_name['youtube_channel']._options = None
_CUSTOMERNEGATIVECRITERION._options = None
# @@protoc_insertion_point(module_scope)
