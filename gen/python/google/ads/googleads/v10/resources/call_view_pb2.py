# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v10/resources/call_view.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v10.enums import call_tracking_display_location_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_call__tracking__display__location__pb2
from google.ads.googleads.v10.enums import call_type_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_call__type__pb2
from google.ads.googleads.v10.enums import google_voice_call_status_pb2 as google_dot_ads_dot_googleads_dot_v10_dot_enums_dot_google__voice__call__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/ads/googleads/v10/resources/call_view.proto\x12\"google.ads.googleads.v10.resources\x1a\x43google/ads/googleads/v10/enums/call_tracking_display_location.proto\x1a.google/ads/googleads/v10/enums/call_type.proto\x1a=google/ads/googleads/v10/enums/google_voice_call_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x91\x05\n\x08\x43\x61llView\x12@\n\rresource_name\x18\x01 \x01(\tB)\xe0\x41\x03\xfa\x41#\n!googleads.googleapis.com/CallView\x12 \n\x13\x63\x61ller_country_code\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10\x63\x61ller_area_code\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\"\n\x15\x63\x61ll_duration_seconds\x18\x04 \x01(\x03\x42\x03\xe0\x41\x03\x12!\n\x14start_call_date_time\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x1f\n\x12\x65nd_call_date_time\x18\x06 \x01(\tB\x03\xe0\x41\x03\x12\x88\x01\n\x1e\x63\x61ll_tracking_display_location\x18\x07 \x01(\x0e\x32[.google.ads.googleads.v10.enums.CallTrackingDisplayLocationEnum.CallTrackingDisplayLocationB\x03\xe0\x41\x03\x12H\n\x04type\x18\x08 \x01(\x0e\x32\x35.google.ads.googleads.v10.enums.CallTypeEnum.CallTypeB\x03\xe0\x41\x03\x12i\n\x0b\x63\x61ll_status\x18\t \x01(\x0e\x32O.google.ads.googleads.v10.enums.GoogleVoiceCallStatusEnum.GoogleVoiceCallStatusB\x03\xe0\x41\x03:Z\xea\x41W\n!googleads.googleapis.com/CallView\x12\x32\x63ustomers/{customer_id}/callViews/{call_detail_id}B\xff\x01\n&com.google.ads.googleads.v10.resourcesB\rCallViewProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V10.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V10\\Resources\xea\x02&Google::Ads::GoogleAds::V10::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v10.resources.call_view_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v10.resourcesB\rCallViewProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v10/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&Google::Ads::GoogleAds::V10::Resources'
  _CALLVIEW.fields_by_name['resource_name']._options = None
  _CALLVIEW.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A#\n!googleads.googleapis.com/CallView'
  _CALLVIEW.fields_by_name['caller_country_code']._options = None
  _CALLVIEW.fields_by_name['caller_country_code']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['caller_area_code']._options = None
  _CALLVIEW.fields_by_name['caller_area_code']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['call_duration_seconds']._options = None
  _CALLVIEW.fields_by_name['call_duration_seconds']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['start_call_date_time']._options = None
  _CALLVIEW.fields_by_name['start_call_date_time']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['end_call_date_time']._options = None
  _CALLVIEW.fields_by_name['end_call_date_time']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['call_tracking_display_location']._options = None
  _CALLVIEW.fields_by_name['call_tracking_display_location']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['type']._options = None
  _CALLVIEW.fields_by_name['type']._serialized_options = b'\340A\003'
  _CALLVIEW.fields_by_name['call_status']._options = None
  _CALLVIEW.fields_by_name['call_status']._serialized_options = b'\340A\003'
  _CALLVIEW._options = None
  _CALLVIEW._serialized_options = b'\352AW\n!googleads.googleapis.com/CallView\0222customers/{customer_id}/callViews/{call_detail_id}'
  _CALLVIEW._serialized_start=331
  _CALLVIEW._serialized_end=988
# @@protoc_insertion_point(module_scope)
