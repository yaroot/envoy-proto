# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v6/services/combined_audience_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v6.resources import combined_audience_pb2 as google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_combined__audience__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v6/services/combined_audience_service.proto',
  package='google.ads.googleads.v6.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v6.servicesB\034CombinedAudienceServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Services\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002$Google::Ads::GoogleAds::V6::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n@google/ads/googleads/v6/services/combined_audience_service.proto\x12 google.ads.googleads.v6.services\x1a\x39google/ads/googleads/v6/resources/combined_audience.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"f\n\x1aGetCombinedAudienceRequest\x12H\n\rresource_name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)googleads.googleapis.com/CombinedAudience2\xb8\x02\n\x17\x43ombinedAudienceService\x12\xd5\x01\n\x13GetCombinedAudience\x12<.google.ads.googleads.v6.services.GetCombinedAudienceRequest\x1a\x33.google.ads.googleads.v6.resources.CombinedAudience\"K\x82\xd3\xe4\x93\x02\x35\x12\x33/v6/{resource_name=customers/*/combinedAudiences/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x83\x02\n$com.google.ads.googleads.v6.servicesB\x1c\x43ombinedAudienceServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v6/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V6.Services\xca\x02 Google\\Ads\\GoogleAds\\V6\\Services\xea\x02$Google::Ads::GoogleAds::V6::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_combined__audience__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETCOMBINEDAUDIENCEREQUEST = _descriptor.Descriptor(
  name='GetCombinedAudienceRequest',
  full_name='google.ads.googleads.v6.services.GetCombinedAudienceRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v6.services.GetCombinedAudienceRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A+\n)googleads.googleapis.com/CombinedAudience', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=276,
  serialized_end=378,
)

DESCRIPTOR.message_types_by_name['GetCombinedAudienceRequest'] = _GETCOMBINEDAUDIENCEREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCombinedAudienceRequest = _reflection.GeneratedProtocolMessageType('GetCombinedAudienceRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCOMBINEDAUDIENCEREQUEST,
  '__module__' : 'google.ads.googleads.v6.services.combined_audience_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v6.services.GetCombinedAudienceRequest)
  })
_sym_db.RegisterMessage(GetCombinedAudienceRequest)


DESCRIPTOR._options = None
_GETCOMBINEDAUDIENCEREQUEST.fields_by_name['resource_name']._options = None

_COMBINEDAUDIENCESERVICE = _descriptor.ServiceDescriptor(
  name='CombinedAudienceService',
  full_name='google.ads.googleads.v6.services.CombinedAudienceService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=381,
  serialized_end=693,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCombinedAudience',
    full_name='google.ads.googleads.v6.services.CombinedAudienceService.GetCombinedAudience',
    index=0,
    containing_service=None,
    input_type=_GETCOMBINEDAUDIENCEREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v6_dot_resources_dot_combined__audience__pb2._COMBINEDAUDIENCE,
    serialized_options=b'\202\323\344\223\0025\0223/v6/{resource_name=customers/*/combinedAudiences/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_COMBINEDAUDIENCESERVICE)

DESCRIPTOR.services_by_name['CombinedAudienceService'] = _COMBINEDAUDIENCESERVICE

# @@protoc_insertion_point(module_scope)
