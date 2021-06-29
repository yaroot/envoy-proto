# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/paid_organic_search_term_view_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.resources import paid_organic_search_term_view_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_paid__organic__search__term__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/paid_organic_search_term_view_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB%PaidOrganicSearchTermViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nLgoogle/ads/googleads/v7/services/paid_organic_search_term_view_service.proto\x12 google.ads.googleads.v7.services\x1a\x45google/ads/googleads/v7/resources/paid_organic_search_term_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"x\n#GetPaidOrganicSearchTermViewRequest\x12Q\n\rresource_name\x18\x01 \x01(\tB:\xe0\x41\x02\xfa\x41\x34\n2googleads.googleapis.com/PaidOrganicSearchTermView2\xe5\x02\n PaidOrganicSearchTermViewService\x12\xf9\x01\n\x1cGetPaidOrganicSearchTermView\x12\x45.google.ads.googleads.v7.services.GetPaidOrganicSearchTermViewRequest\x1a<.google.ads.googleads.v7.resources.PaidOrganicSearchTermView\"T\x82\xd3\xe4\x93\x02>\x12</v7/{resource_name=customers/*/paidOrganicSearchTermViews/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8c\x02\n$com.google.ads.googleads.v7.servicesB%PaidOrganicSearchTermViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_paid__organic__search__term__view__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETPAIDORGANICSEARCHTERMVIEWREQUEST = _descriptor.Descriptor(
  name='GetPaidOrganicSearchTermViewRequest',
  full_name='google.ads.googleads.v7.services.GetPaidOrganicSearchTermViewRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetPaidOrganicSearchTermViewRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A4\n2googleads.googleapis.com/PaidOrganicSearchTermView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=300,
  serialized_end=420,
)

DESCRIPTOR.message_types_by_name['GetPaidOrganicSearchTermViewRequest'] = _GETPAIDORGANICSEARCHTERMVIEWREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetPaidOrganicSearchTermViewRequest = _reflection.GeneratedProtocolMessageType('GetPaidOrganicSearchTermViewRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETPAIDORGANICSEARCHTERMVIEWREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.paid_organic_search_term_view_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetPaidOrganicSearchTermViewRequest)
  })
_sym_db.RegisterMessage(GetPaidOrganicSearchTermViewRequest)


DESCRIPTOR._options = None
_GETPAIDORGANICSEARCHTERMVIEWREQUEST.fields_by_name['resource_name']._options = None

_PAIDORGANICSEARCHTERMVIEWSERVICE = _descriptor.ServiceDescriptor(
  name='PaidOrganicSearchTermViewService',
  full_name='google.ads.googleads.v7.services.PaidOrganicSearchTermViewService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=423,
  serialized_end=780,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetPaidOrganicSearchTermView',
    full_name='google.ads.googleads.v7.services.PaidOrganicSearchTermViewService.GetPaidOrganicSearchTermView',
    index=0,
    containing_service=None,
    input_type=_GETPAIDORGANICSEARCHTERMVIEWREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_paid__organic__search__term__view__pb2._PAIDORGANICSEARCHTERMVIEW,
    serialized_options=b'\202\323\344\223\002>\022</v7/{resource_name=customers/*/paidOrganicSearchTermViews/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_PAIDORGANICSEARCHTERMVIEWSERVICE)

DESCRIPTOR.services_by_name['PaidOrganicSearchTermViewService'] = _PAIDORGANICSEARCHTERMVIEWSERVICE

# @@protoc_insertion_point(module_scope)
