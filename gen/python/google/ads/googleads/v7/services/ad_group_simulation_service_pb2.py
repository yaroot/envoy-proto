# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/ad_group_simulation_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.resources import ad_group_simulation_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__simulation__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/ad_group_simulation_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB\035AdGroupSimulationServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v7/services/ad_group_simulation_service.proto\x12 google.ads.googleads.v7.services\x1a;google/ads/googleads/v7/resources/ad_group_simulation.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"h\n\x1bGetAdGroupSimulationRequest\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*googleads.googleapis.com/AdGroupSimulation2\xbd\x02\n\x18\x41\x64GroupSimulationService\x12\xd9\x01\n\x14GetAdGroupSimulation\x12=.google.ads.googleads.v7.services.GetAdGroupSimulationRequest\x1a\x34.google.ads.googleads.v7.resources.AdGroupSimulation\"L\x82\xd3\xe4\x93\x02\x36\x12\x34/v7/{resource_name=customers/*/adGroupSimulations/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x84\x02\n$com.google.ads.googleads.v7.servicesB\x1d\x41\x64GroupSimulationServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__simulation__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETADGROUPSIMULATIONREQUEST = _descriptor.Descriptor(
  name='GetAdGroupSimulationRequest',
  full_name='google.ads.googleads.v7.services.GetAdGroupSimulationRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetAdGroupSimulationRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A,\n*googleads.googleapis.com/AdGroupSimulation', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=280,
  serialized_end=384,
)

DESCRIPTOR.message_types_by_name['GetAdGroupSimulationRequest'] = _GETADGROUPSIMULATIONREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetAdGroupSimulationRequest = _reflection.GeneratedProtocolMessageType('GetAdGroupSimulationRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETADGROUPSIMULATIONREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.ad_group_simulation_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetAdGroupSimulationRequest)
  })
_sym_db.RegisterMessage(GetAdGroupSimulationRequest)


DESCRIPTOR._options = None
_GETADGROUPSIMULATIONREQUEST.fields_by_name['resource_name']._options = None

_ADGROUPSIMULATIONSERVICE = _descriptor.ServiceDescriptor(
  name='AdGroupSimulationService',
  full_name='google.ads.googleads.v7.services.AdGroupSimulationService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=387,
  serialized_end=704,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetAdGroupSimulation',
    full_name='google.ads.googleads.v7.services.AdGroupSimulationService.GetAdGroupSimulation',
    index=0,
    containing_service=None,
    input_type=_GETADGROUPSIMULATIONREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_ad__group__simulation__pb2._ADGROUPSIMULATION,
    serialized_options=b'\202\323\344\223\0026\0224/v7/{resource_name=customers/*/adGroupSimulations/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ADGROUPSIMULATIONSERVICE)

DESCRIPTOR.services_by_name['AdGroupSimulationService'] = _ADGROUPSIMULATIONSERVICE

# @@protoc_insertion_point(module_scope)
