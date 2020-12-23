# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/resources/keyword_plan.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.common import dates_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_common_dot_dates__pb2
from google.ads.googleads.v6.enums import keyword_plan_forecast_interval_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_keyword__plan__forecast__interval__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/resources/keyword_plan.proto',
  package='google.ads.googleads.v6.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v6.resourcesB\020KeywordPlanProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v6/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V6.Resources\312\002!Google\\Ads\\GoogleAds\\V6\\Resources\352\002%Google::Ads::GoogleAds::V6::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n4google/ads/googleads/v6/resources/keyword_plan.proto\x12!google.ads.googleads.v6.resources\x1a*google/ads/googleads/v6/common/dates.proto\x1a\x42google/ads/googleads/v6/enums/keyword_plan_forecast_interval.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xc5\x02\n\x0bKeywordPlan\x12\x43\n\rresource_name\x18\x01 \x01(\tB,\xe0\x41\x05\xfa\x41&\n$googleads.googleapis.com/KeywordPlan\x12\x14\n\x02id\x18\x05 \x01(\x03\x42\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x11\n\x04name\x18\x06 \x01(\tH\x01\x88\x01\x01\x12U\n\x0f\x66orecast_period\x18\x04 \x01(\x0b\x32<.google.ads.googleads.v6.resources.KeywordPlanForecastPeriod:a\xea\x41^\n$googleads.googleapis.com/KeywordPlan\x12\x36\x63ustomers/{customer_id}/keywordPlans/{keyword_plan_id}B\x05\n\x03_idB\x07\n\x05_name\"\xdd\x01\n\x19KeywordPlanForecastPeriod\x12s\n\rdate_interval\x18\x01 \x01(\x0e\x32Z.google.ads.googleads.v6.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastIntervalH\x00\x12?\n\ndate_range\x18\x02 \x01(\x0b\x32).google.ads.googleads.v6.common.DateRangeH\x00\x42\n\n\x08intervalB\xfd\x01\n%com.google.ads.googleads.v6.resourcesB\x10KeywordPlanProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v6/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V6.Resources\xca\x02!Google\\Ads\\GoogleAds\\V6\\Resources\xea\x02%Google::Ads::GoogleAds::V6::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_common_dot_dates__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_keyword__plan__forecast__interval__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_KEYWORDPLAN = _descriptor.Descriptor(
  name='KeywordPlan',
  full_name='google.ads.googleads.v6.resources.KeywordPlan',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.resources.KeywordPlan.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\005\372A&\n$googleads.googleapis.com/KeywordPlan', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='google.ads.googleads.v6.resources.KeywordPlan.id', index=1,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='google.ads.googleads.v6.resources.KeywordPlan.name', index=2,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='forecast_period', full_name='google.ads.googleads.v6.resources.KeywordPlan.forecast_period', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352A^\n$googleads.googleapis.com/KeywordPlan\0226customers/{customer_id}/keywordPlans/{keyword_plan_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='_id', full_name='google.ads.googleads.v6.resources.KeywordPlan._id',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
    _descriptor.OneofDescriptor(
      name='_name', full_name='google.ads.googleads.v6.resources.KeywordPlan._name',
      index=1, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=294,
  serialized_end=619,
)


_KEYWORDPLANFORECASTPERIOD = _descriptor.Descriptor(
  name='KeywordPlanForecastPeriod',
  full_name='google.ads.googleads.v6.resources.KeywordPlanForecastPeriod',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='date_interval', full_name='google.ads.googleads.v6.resources.KeywordPlanForecastPeriod.date_interval', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='date_range', full_name='google.ads.googleads.v6.resources.KeywordPlanForecastPeriod.date_range', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
      name='interval', full_name='google.ads.googleads.v6.resources.KeywordPlanForecastPeriod.interval',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=622,
  serialized_end=843,
)

_KEYWORDPLAN.fields_by_name['forecast_period'].message_type = _KEYWORDPLANFORECASTPERIOD
_KEYWORDPLAN.oneofs_by_name['_id'].fields.append(
  _KEYWORDPLAN.fields_by_name['id'])
_KEYWORDPLAN.fields_by_name['id'].containing_oneof = _KEYWORDPLAN.oneofs_by_name['_id']
_KEYWORDPLAN.oneofs_by_name['_name'].fields.append(
  _KEYWORDPLAN.fields_by_name['name'])
_KEYWORDPLAN.fields_by_name['name'].containing_oneof = _KEYWORDPLAN.oneofs_by_name['_name']
_KEYWORDPLANFORECASTPERIOD.fields_by_name['date_interval'].enum_type = google_dot_ads_dot_googleads_dot_v6_dot_enums_dot_keyword__plan__forecast__interval__pb2._KEYWORDPLANFORECASTINTERVALENUM_KEYWORDPLANFORECASTINTERVAL
_KEYWORDPLANFORECASTPERIOD.fields_by_name['date_range'].message_type = google_dot_ads_dot_googleads_dot_v6_dot_common_dot_dates__pb2._DATERANGE
_KEYWORDPLANFORECASTPERIOD.oneofs_by_name['interval'].fields.append(
  _KEYWORDPLANFORECASTPERIOD.fields_by_name['date_interval'])
_KEYWORDPLANFORECASTPERIOD.fields_by_name['date_interval'].containing_oneof = _KEYWORDPLANFORECASTPERIOD.oneofs_by_name['interval']
_KEYWORDPLANFORECASTPERIOD.oneofs_by_name['interval'].fields.append(
  _KEYWORDPLANFORECASTPERIOD.fields_by_name['date_range'])
_KEYWORDPLANFORECASTPERIOD.fields_by_name['date_range'].containing_oneof = _KEYWORDPLANFORECASTPERIOD.oneofs_by_name['interval']
DESCRIPTOR.message_types_by_name['KeywordPlan'] = _KEYWORDPLAN
DESCRIPTOR.message_types_by_name['KeywordPlanForecastPeriod'] = _KEYWORDPLANFORECASTPERIOD
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KeywordPlan = _reflection.GeneratedProtocolMessageType('KeywordPlan', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLAN,
  '__module__' : 'google.ads.googleads.v6.resources.keyword_plan_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.resources.KeywordPlan)
  })
_sym_db.RegisterMessage(KeywordPlan)

KeywordPlanForecastPeriod = _reflection.GeneratedProtocolMessageType('KeywordPlanForecastPeriod', (_message.Message,), {
  'DESCRIPTOR' : _KEYWORDPLANFORECASTPERIOD,
  '__module__' : 'google.ads.googleads.v6.resources.keyword_plan_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.resources.KeywordPlanForecastPeriod)
  })
_sym_db.RegisterMessage(KeywordPlanForecastPeriod)


DESCRIPTOR._options = None
_KEYWORDPLAN.fields_by_name['resource_name']._options = None
_KEYWORDPLAN.fields_by_name['id']._options = None
_KEYWORDPLAN._options = None
# @@protoc_insertion_point(module_scope)
