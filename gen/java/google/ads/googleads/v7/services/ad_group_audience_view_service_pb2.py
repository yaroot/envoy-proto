# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/ad_group_audience_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.resources import ad_group_audience_view_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__audience__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/ad_group_audience_view_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB\037AdGroupAudienceViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v7/services/ad_group_audience_view_service.proto\x12 google.ads.googleads.v7.services\x1a>google/ads/googleads/v7/resources/ad_group_audience_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"l\n\x1dGetAdGroupAudienceViewRequest\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,googleads.googleapis.com/AdGroupAudienceView2\xc7\x02\n\x1a\x41\x64GroupAudienceViewService\x12\xe1\x01\n\x16GetAdGroupAudienceView\x12?.google.ads.googleads.v7.services.GetAdGroupAudienceViewRequest\x1a\x36.google.ads.googleads.v7.resources.AdGroupAudienceView\"N\x82\xd3\xe4\x93\x02\x38\x12\x36/v7/{resource_name=customers/*/adGroupAudienceViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x86\x02\n$com.google.ads.googleads.v7.servicesB\x1f\x41\x64GroupAudienceViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__audience__view__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETADGROUPAUDIENCEVIEWREQUEST = _descriptor.Descriptor(
  name='GetAdGroupAudienceViewRequest',
  full_name='google.ads.googleads.v7.services.GetAdGroupAudienceViewRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetAdGroupAudienceViewRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A.\n,googleads.googleapis.com/AdGroupAudienceView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=286,
  serialized_end=394,
)

DESCRIPTOR.message_types_by_name['GetAdGroupAudienceViewRequest'] = _GETADGROUPAUDIENCEVIEWREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupAudienceViewRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupAudienceViewRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPAUDIENCEVIEWREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_audience_view_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetAdGroupAudienceViewRequest)
  })
_sym_db.RegisterMessage(GetAdGroupAudienceViewRequest)


DESCRIPTOR._options = None
_GETADGROUPAUDIENCEVIEWREQUEST.fields_by_name['resource_name']._options = None

_ADGROUPAUDIENCEVIEWSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupAudienceViewService',
  full_name='google.ads.googleads.v7.services.AdGroupAudienceViewService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=397,
  serialized_end=724,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupAudienceView',
    full_name='google.ads.googleads.v7.services.AdGroupAudienceViewService.GetAdGroupAudienceView',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPAUDIENCEVIEWREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__audience__view__pb2._ADGROUPAUDIENCEVIEW,
    serialized_options=b'\202\323\344\223\0028\0226/v7/{resource_name=customers/*/adGroupAudienceViews/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPAUDIENCEVIEWSERVICE)

DESCRIPTOR.services_by_name['AdGroupAudienceViewService'] = _ADGROUPAUDIENCEVIEWSERVICE

# @@protoc_insertion_point(module_scope)