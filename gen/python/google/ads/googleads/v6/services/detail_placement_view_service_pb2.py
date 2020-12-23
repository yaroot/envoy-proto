# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/services/detail_placement_view_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.resources import detail_placement_view_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_detail__placement__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/services/detail_placement_view_service.proto',
  package='google.ads.googleads.v6.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v6.servicesB\037DetailPlacementViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002$Google::Ads::GoogleAds::V6::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nDgoogle/ads/googleads/v6/services/detail_placement_view_service.proto\x12 google.ads.googleads.v6.services\x1a=google/ads/googleads/v6/resources/detail_placement_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"l\n\x1dGetDetailPlacementViewRequest\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,googleads.googleapis.com/DetailPlacementView2\xc7\x02\n\x1a\x44\x65tailPlacementViewService\x12\xe1\x01\n\x16GetDetailPlacementView\x12?.google.ads.googleads.v6.services.GetDetailPlacementViewRequest\x1a\x36.google.ads.googleads.v6.resources.DetailPlacementView\"N\x82\xd3\xe4\x93\x02\x38\x12\x36/v6/{resource_name=customers/*/detailPlacementViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x86\x02\n$com.google.ads.googleads.v6.servicesB\x1f\x44\x65tailPlacementViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V6.Services\xca\x02 Google\\Ads\\GoogleAds\\V6\\Services\xea\x02$Google::Ads::GoogleAds::V6::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_detail__placement__view__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETDETAILPLACEMENTVIEWREQUEST = _descriptor.Descriptor(
  name='GetDetailPlacementViewRequest',
  full_name='google.ads.googleads.v6.services.GetDetailPlacementViewRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.services.GetDetailPlacementViewRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A.\n,googleads.googleapis.com/DetailPlacementView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=284,
  serialized_end=392,
)

DESCRIPTOR.message_types_by_name['GetDetailPlacementViewRequest'] = _GETDETAILPLACEMENTVIEWREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetDetailPlacementViewRequest = _reflection.GeneratedProtocolMessageType('GetDetailPlacementViewRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETDETAILPLACEMENTVIEWREQUEST,
  '__module__' : 'google.ads.googleads.v6.services.detail_placement_view_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.GetDetailPlacementViewRequest)
  })
_sym_db.RegisterMessage(GetDetailPlacementViewRequest)


DESCRIPTOR._options = None
_GETDETAILPLACEMENTVIEWREQUEST.fields_by_name['resource_name']._options = None

_DETAILPLACEMENTVIEWSERVICE = _descriptor.ServiceDescriptor(
  name='DetailPlacementViewService',
  full_name='google.ads.googleads.v6.services.DetailPlacementViewService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=395,
  serialized_end=722,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetDetailPlacementView',
    full_name='google.ads.googleads.v6.services.DetailPlacementViewService.GetDetailPlacementView',
    index=0,
    containing_service=None,
    input_type=_GETDETAILPLACEMENTVIEWREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_detail__placement__view__pb2._DETAILPLACEMENTVIEW,
    serialized_options=b'\202\323\344\223\0028\0226/v6/{resource_name=customers/*/detailPlacementViews/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_DETAILPLACEMENTVIEWSERVICE)

DESCRIPTOR.services_by_name['DetailPlacementViewService'] = _DETAILPLACEMENTVIEWSERVICE

# @@protoc_insertion_point(module_scope)
