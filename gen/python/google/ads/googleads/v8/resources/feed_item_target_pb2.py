# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/feed_item_target.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.common import criteria_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_common_dot_criteria__pb2
from google.ads.googleads.v8.enums import feed_item_target_device_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__device__pb2
from google.ads.googleads.v8.enums import feed_item_target_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__status__pb2
from google.ads.googleads.v8.enums import feed_item_target_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/feed_item_target.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\023FeedItemTargetProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n8google/ads/googleads/v8/resources/feed_item_target.proto\x12!google.ads.googleads.v8.resources\x1a-google/ads/googleads/v8/common/criteria.proto\x1a;google/ads/googleads/v8/enums/feed_item_target_device.proto\x1a;google/ads/googleads/v8/enums/feed_item_target_status.proto\x1a\x39google/ads/googleads/v8/enums/feed_item_target_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xa9\x08\n\x0e\x46\x65\x65\x64ItemTarget\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x05\xfa\x41)\n\'googleads.googleapis.com/FeedItemTarget\x12\x41\n\tfeed_item\x18\x0c \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/FeedItemH\x01\x88\x01\x01\x12l\n\x15\x66\x65\x65\x64_item_target_type\x18\x03 \x01(\x0e\x32H.google.ads.googleads.v8.enums.FeedItemTargetTypeEnum.FeedItemTargetTypeB\x03\xe0\x41\x03\x12%\n\x13\x66\x65\x65\x64_item_target_id\x18\r \x01(\x03\x42\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x61\n\x06status\x18\x0b \x01(\x0e\x32L.google.ads.googleads.v8.enums.FeedItemTargetStatusEnum.FeedItemTargetStatusB\x03\xe0\x41\x03\x12=\n\x08\x63\x61mpaign\x18\x0e \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/CampaignH\x00\x12<\n\x08\x61\x64_group\x18\x0f \x01(\tB(\xe0\x41\x05\xfa\x41\"\n googleads.googleapis.com/AdGroupH\x00\x12\x43\n\x07keyword\x18\x07 \x01(\x0b\x32+.google.ads.googleads.v8.common.KeywordInfoB\x03\xe0\x41\x05H\x00\x12Q\n\x13geo_target_constant\x18\x10 \x01(\tB2\xe0\x41\x05\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstantH\x00\x12\x63\n\x06\x64\x65vice\x18\t \x01(\x0e\x32L.google.ads.googleads.v8.enums.FeedItemTargetDeviceEnum.FeedItemTargetDeviceB\x03\xe0\x41\x05H\x00\x12J\n\x0b\x61\x64_schedule\x18\n \x01(\x0b\x32..google.ads.googleads.v8.common.AdScheduleInfoB\x03\xe0\x41\x05H\x00:\x9d\x01\xea\x41\x99\x01\n\'googleads.googleapis.com/FeedItemTarget\x12ncustomers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}B\x08\n\x06targetB\x0c\n\n_feed_itemB\x16\n\x14_feed_item_target_idB\x80\x02\n%com.google.ads.googleads.v8.resourcesB\x13\x46\x65\x65\x64ItemTargetProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_common_dot_criteria__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__device__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__status__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__type__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_FEEDITEMTARGET = _descriptor.Descriptor(
  name='FeedItemTarget',
  full_name='google.ads.googleads.v8.resources.FeedItemTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.FeedItemTarget.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A)\n\'googleads.googleapis.com/FeedItemTarget', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_item', full_name='google.ads.googleads.v8.resources.FeedItemTarget.feed_item', index=1,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/FeedItem', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_item_target_type', full_name='google.ads.googleads.v8.resources.FeedItemTarget.feed_item_target_type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='feed_item_target_id', full_name='google.ads.googleads.v8.resources.FeedItemTarget.feed_item_target_id', index=3,
      number=13, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='google.ads.googleads.v8.resources.FeedItemTarget.status', index=4,
      number=11, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='campaign', full_name='google.ads.googleads.v8.resources.FeedItemTarget.campaign', index=5,
      number=14, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A#\n!googleads.googleapis.com/Campaign', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_group', full_name='google.ads.googleads.v8.resources.FeedItemTarget.ad_group', index=6,
      number=15, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A\"\n googleads.googleapis.com/AdGroup', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyword', full_name='google.ads.googleads.v8.resources.FeedItemTarget.keyword', index=7,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_target_constant', full_name='google.ads.googleads.v8.resources.FeedItemTarget.geo_target_constant', index=8,
      number=16, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A,\n*googleads.googleapis.com/GeoTargetConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='device', full_name='google.ads.googleads.v8.resources.FeedItemTarget.device', index=9,
      number=9, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ad_schedule', full_name='google.ads.googleads.v8.resources.FeedItemTarget.ad_schedule', index=10,
      number=10, type=11, cpp_type=10, label=1,
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
  serialized_options=b'\352A\231\001\n\'googleads.googleapis.com/FeedItemTarget\022ncustomers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='target', full_name='google.ads.googleads.v8.resources.FeedItemTarget.target',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_feed_item', full_name='google.ads.googleads.v8.resources.FeedItemTarget._feed_item',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_feed_item_target_id', full_name='google.ads.googleads.v8.resources.FeedItemTarget._feed_item_target_id',
      index=2, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=414,
  serialized_end=1479,
)

_FEEDITEMTARGET.fields_by_name['feed_item_target_type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__type__pb2._FEEDITEMTARGETTYPEENUM_FEEDITEMTARGETTYPE
_FEEDITEMTARGET.fields_by_name['status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__status__pb2._FEEDITEMTARGETSTATUSENUM_FEEDITEMTARGETSTATUS
_FEEDITEMTARGET.fields_by_name['keyword'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_criteria__pb2._KEYWORDINFO
_FEEDITEMTARGET.fields_by_name['device'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_feed__item__target__device__pb2._FEEDITEMTARGETDEVICEENUM_FEEDITEMTARGETDEVICE
_FEEDITEMTARGET.fields_by_name['ad_schedule'].message_type = google_dot_ads_dot_googleads_dot_v8_dot_common_dot_criteria__pb2._ADSCHEDULEINFO
_FEEDITEMTARGET.oneofs_by_name['target'].fields.append(
  _FEEDITEMTARGET.fields_by_name['campaign'])
_FEEDITEMTARGET.fields_by_name['campaign'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['target']
_FEEDITEMTARGET.oneofs_by_name['target'].fields.append(
  _FEEDITEMTARGET.fields_by_name['ad_group'])
_FEEDITEMTARGET.fields_by_name['ad_group'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['target']
_FEEDITEMTARGET.oneofs_by_name['target'].fields.append(
  _FEEDITEMTARGET.fields_by_name['keyword'])
_FEEDITEMTARGET.fields_by_name['keyword'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['target']
_FEEDITEMTARGET.oneofs_by_name['target'].fields.append(
  _FEEDITEMTARGET.fields_by_name['geo_target_constant'])
_FEEDITEMTARGET.fields_by_name['geo_target_constant'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['target']
_FEEDITEMTARGET.oneofs_by_name['target'].fields.append(
  _FEEDITEMTARGET.fields_by_name['device'])
_FEEDITEMTARGET.fields_by_name['device'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['target']
_FEEDITEMTARGET.oneofs_by_name['target'].fields.append(
  _FEEDITEMTARGET.fields_by_name['ad_schedule'])
_FEEDITEMTARGET.fields_by_name['ad_schedule'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['target']
_FEEDITEMTARGET.oneofs_by_name['_feed_item'].fields.append(
  _FEEDITEMTARGET.fields_by_name['feed_item'])
_FEEDITEMTARGET.fields_by_name['feed_item'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['_feed_item']
_FEEDITEMTARGET.oneofs_by_name['_feed_item_target_id'].fields.append(
  _FEEDITEMTARGET.fields_by_name['feed_item_target_id'])
_FEEDITEMTARGET.fields_by_name['feed_item_target_id'].containing_oneof = _FEEDITEMTARGET.oneofs_by_name['_feed_item_target_id']
DESCRIPTOR.message_types_by_name['FeedItemTarget'] = _FEEDITEMTARGET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

FeedItemTarget = _reflection.GeneratedProtocolMessageType('FeedItemTarget', (_message.Message,), {
  'DESCRIPTOR' : _FEEDITEMTARGET,
  '__module__' : 'google.ads.googleads.v8.resources.feed_item_target_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.FeedItemTarget)
  })
_sym_db.RegisterMessage(FeedItemTarget)


DESCRIPTOR._options = None
_FEEDITEMTARGET.fields_by_name['resource_name']._options = None
_FEEDITEMTARGET.fields_by_name['feed_item']._options = None
_FEEDITEMTARGET.fields_by_name['feed_item_target_type']._options = None
_FEEDITEMTARGET.fields_by_name['feed_item_target_id']._options = None
_FEEDITEMTARGET.fields_by_name['status']._options = None
_FEEDITEMTARGET.fields_by_name['campaign']._options = None
_FEEDITEMTARGET.fields_by_name['ad_group']._options = None
_FEEDITEMTARGET.fields_by_name['keyword']._options = None
_FEEDITEMTARGET.fields_by_name['geo_target_constant']._options = None
_FEEDITEMTARGET.fields_by_name['device']._options = None
_FEEDITEMTARGET.fields_by_name['ad_schedule']._options = None
_FEEDITEMTARGET._options = None
# @@protoc_insertion_point(module_scope)