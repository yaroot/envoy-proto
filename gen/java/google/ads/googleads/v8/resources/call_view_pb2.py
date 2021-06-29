# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/resources/call_view.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.enums import call_tracking_display_location_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_call__tracking__display__location__pb2
from google.ads.googleads.v8.enums import call_type_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_call__type__pb2
from google.ads.googleads.v8.enums import google_voice_call_status_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_google__voice__call__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/resources/call_view.proto',
  package='google.ads.googleads.v8.resources',
  syntax='proto3',
  serialized_options=b'\n%com.google.ads.googleads.v8.resourcesB\rCallViewProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\GoogleAds\\V8\\Resources\352\002%Google::Ads::GoogleAds::V8::Resources',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1google/ads/googleads/v8/resources/call_view.proto\x12!google.ads.googleads.v8.resources\x1a\x42google/ads/googleads/v8/enums/call_tracking_display_location.proto\x1a-google/ads/googleads/v8/enums/call_type.proto\x1a<google/ads/googleads/v8/enums/google_voice_call_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\x8e\x05\n\x08\x43\x61llView\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CallView\x12 \n\x13\x63\x61ller_country_code\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10\x63\x61ller_area_code\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\"\n\x15\x63\x61ll_duration_seconds\x18\x04 \x01(\x03\x42\x03\xe0\x41\x03\x12!\n\x14start_call_date_time\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x1f\n\x12\x65nd_call_date_time\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12\x87\x01\n\x1e\x63\x61ll_tracking_display_location\x18\x07 \x01(\x0e\x32Z.google.ads.googleads.v8.enums.CallTrackingDisplayLocationEnum.CallTrackingDisplayLocationB\x03\xe0\x41\x03\x12G\n\x04type\x18\x08 \x01(\x0e\x32\x34.google.ads.googleads.v8.enums.CallTypeEnum.CallTypeB\x03\xe0\x41\x03\x12h\n\x0b\x63\x61ll_status\x18\t \x01(\x0e\x32N.google.ads.googleads.v8.enums.GoogleVoiceCallStatusEnum.GoogleVoiceCallStatusB\x03\xe0\x41\x03:Z\xea\x41W\n!googleads.googleapis.com/CallView\x12\x32\x63ustomers/{customer_id}/callViews/{call_detail_id}B\xfa\x01\n%com.google.ads.googleads.v8.resourcesB\rCallViewProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v8/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V8.Resources\xca\x02!Google\\Ads\\GoogleAds\\V8\\Resources\xea\x02%Google::Ads::GoogleAds::V8::Resourcesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_call__tracking__display__location__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_call__type__pb2.DESCRIPTOR,google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_google__voice__call__status__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,])




_CALLVIEW = _descriptor.Descriptor(
  name='CallView',
  full_name='google.ads.googleads.v8.resources.CallView',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.resources.CallView.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003\372A#\n!googleads.googleapis.com/CallView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='caller_country_code', full_name='google.ads.googleads.v8.resources.CallView.caller_country_code', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='caller_area_code', full_name='google.ads.googleads.v8.resources.CallView.caller_area_code', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='call_duration_seconds', full_name='google.ads.googleads.v8.resources.CallView.call_duration_seconds', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_call_date_time', full_name='google.ads.googleads.v8.resources.CallView.start_call_date_time', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_call_date_time', full_name='google.ads.googleads.v8.resources.CallView.end_call_date_time', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='call_tracking_display_location', full_name='google.ads.googleads.v8.resources.CallView.call_tracking_display_location', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='google.ads.googleads.v8.resources.CallView.type', index=7,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='call_status', full_name='google.ads.googleads.v8.resources.CallView.call_status', index=8,
      number=9, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\352AW\n!googleads.googleapis.com/CallView\0222customers/{customer_id}/callViews/{call_detail_id}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=356,
  serialized_end=1010,
)

_CALLVIEW.fields_by_name['call_tracking_display_location'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_call__tracking__display__location__pb2._CALLTRACKINGDISPLAYLOCATIONENUM_CALLTRACKINGDISPLAYLOCATION
_CALLVIEW.fields_by_name['type'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_call__type__pb2._CALLTYPEENUM_CALLTYPE
_CALLVIEW.fields_by_name['call_status'].enum_type = google_dot_ads_dot_googleads_dot_v8_dot_enums_dot_google__voice__call__status__pb2._GOOGLEVOICECALLSTATUSENUM_GOOGLEVOICECALLSTATUS
DESCRIPTOR.message_types_by_name['CallView'] = _CALLVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CallView = _reflection.GeneratedProtocolMessageType('CallView', (_message.Message,), {
  'DESCRIPTOR' : _CALLVIEW,
  '__module__' : 'google.ads.googleads.v8.resources.call_view_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.resources.CallView)
  })
_sym_db.RegisterMessage(CallView)


DESCRIPTOR._options = None
_CALLVIEW.fields_by_name['resource_name']._options = None
_CALLVIEW.fields_by_name['caller_country_code']._options = None
_CALLVIEW.fields_by_name['caller_area_code']._options = None
_CALLVIEW.fields_by_name['call_duration_seconds']._options = None
_CALLVIEW.fields_by_name['start_call_date_time']._options = None
_CALLVIEW.fields_by_name['end_call_date_time']._options = None
_CALLVIEW.fields_by_name['call_tracking_display_location']._options = None
_CALLVIEW.fields_by_name['type']._options = None
_CALLVIEW.fields_by_name['call_status']._options = None
_CALLVIEW._options = None
# @@protoc_insertion_point(module_scope)
