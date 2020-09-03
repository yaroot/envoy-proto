# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/mobile_device_constant_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import mobile_device_constant_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_mobile__device__constant__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/mobile_device_constant_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB MobileDeviceConstantServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nEgoogle/ads/googleads/v3/services/mobile_device_constant_service.proto\x12 google.ads.googleads.v3.services\x1a>google/ads/googleads/v3/resources/mobile_device_constant.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"n\n\x1eGetMobileDeviceConstantRequest\x12L\n\rresource_name\x18\x01 \x01(\tB5\xe0\x41\x02\xfa\x41/\n-googleads.googleapis.com/MobileDeviceConstant2\x96\x02\n\x1bMobileDeviceConstantService\x12\xd9\x01\n\x17GetMobileDeviceConstant\x12@.google.ads.googleads.v3.services.GetMobileDeviceConstantRequest\x1a\x37.google.ads.googleads.v3.resources.MobileDeviceConstant\"C\x82\xd3\xe4\x93\x02-\x12+/v3/{resource_name=mobileDeviceConstants/*}\xda\x41\rresource_name\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x87\x02\n$com.google.ads.googleads.v3.servicesB MobileDeviceConstantServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_mobile__device__constant__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETMOBILEDEVICECONSTANTREQUEST = _descriptor.Descriptor(
  name='GetMobileDeviceConstantRequest',
  full_name='google.ads.googleads.v3.services.GetMobileDeviceConstantRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetMobileDeviceConstantRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A/\n-googleads.googleapis.com/MobileDeviceConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=396,
)

DESCRIPTOR.message_types_by_name['GetMobileDeviceConstantRequest'] = _GETMOBILEDEVICECONSTANTREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetMobileDeviceConstantRequest = _reflection.GeneratedProtocolMessageType('GetMobileDeviceConstantRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETMOBILEDEVICECONSTANTREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.mobile_device_constant_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetMobileDeviceConstantRequest)
  })
_sym_db.RegisterMessage(GetMobileDeviceConstantRequest)


DESCRIPTOR._options = None
_GETMOBILEDEVICECONSTANTREQUEST.fields_by_name['resource_name']._options = None

_MOBILEDEVICECONSTANTSERVICE = _descriptor.ServiceDescriptor(
  name='MobileDeviceConstantService',
  full_name='google.ads.googleads.v3.services.MobileDeviceConstantService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=399,
  serialized_end=677,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetMobileDeviceConstant',
    full_name='google.ads.googleads.v3.services.MobileDeviceConstantService.GetMobileDeviceConstant',
    index=0,
    containing_service=None,
    input_type=_GETMOBILEDEVICECONSTANTREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_mobile__device__constant__pb2._MOBILEDEVICECONSTANT,
    serialized_options=b'\202\323\344\223\002-\022+/v3/{resource_name=mobileDeviceConstants/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_MOBILEDEVICECONSTANTSERVICE)

DESCRIPTOR.services_by_name['MobileDeviceConstantService'] = _MOBILEDEVICECONSTANTSERVICE

# @@protoc_insertion_point(module_scope)
