# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v4/services/gender_view_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v4.resources import gender_view_pb2 as google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_gender__view__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v4/services/gender_view_service.proto',
  package='google.ads.googleads.v4.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v4.servicesB\026GenderViewServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4.Services\312\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002$Google::Ads::GoogleAds::V4::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n:google/ads/googleads/v4/services/gender_view_service.proto\x12 google.ads.googleads.v4.services\x1a\x33google/ads/googleads/v4/resources/gender_view.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"Z\n\x14GetGenderViewRequest\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#googleads.googleapis.com/GenderView2\xf0\x01\n\x11GenderViewService\x12\xbd\x01\n\rGetGenderView\x12\x36.google.ads.googleads.v4.services.GetGenderViewRequest\x1a-.google.ads.googleads.v4.resources.GenderView\"E\x82\xd3\xe4\x93\x02/\x12-/v4/{resource_name=customers/*/genderViews/*}\xda\x41\rresource_name\x1a\x1b\xca\x41\x18googleads.googleapis.comB\xfd\x01\n$com.google.ads.googleads.v4.servicesB\x16GenderViewServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v4/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V4.Services\xca\x02 Google\\Ads\\GoogleAds\\V4\\Services\xea\x02$Google::Ads::GoogleAds::V4::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_gender__view__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETGENDERVIEWREQUEST = _descriptor.Descriptor(
  name='GetGenderViewRequest',
  full_name='google.ads.googleads.v4.services.GetGenderViewRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v4.services.GetGenderViewRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A%\n#googleads.googleapis.com/GenderView', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=264,
  serialized_end=354,
)

DESCRIPTOR.message_types_by_name['GetGenderViewRequest'] = _GETGENDERVIEWREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetGenderViewRequest = _reflection.GeneratedProtocolMessageType('GetGenderViewRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETGENDERVIEWREQUEST,
  '__module__' : 'google.ads.googleads.v4.services.gender_view_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v4.services.GetGenderViewRequest)
  })
_sym_db.RegisterMessage(GetGenderViewRequest)


DESCRIPTOR._options = None
_GETGENDERVIEWREQUEST.fields_by_name['resource_name']._options = None

_GENDERVIEWSERVICE = _descriptor.ServiceDescriptor(
  name='GenderViewService',
  full_name='google.ads.googleads.v4.services.GenderViewService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=357,
  serialized_end=597,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetGenderView',
    full_name='google.ads.googleads.v4.services.GenderViewService.GetGenderView',
    index=0,
    containing_service=None,
    input_type=_GETGENDERVIEWREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v4_dot_resources_dot_gender__view__pb2._GENDERVIEW,
    serialized_options=b'\202\323\344\223\002/\022-/v4/{resource_name=customers/*/genderViews/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_GENDERVIEWSERVICE)

DESCRIPTOR.services_by_name['GenderViewService'] = _GENDERVIEWSERVICE

# @@protoc_insertion_point(module_scope)
