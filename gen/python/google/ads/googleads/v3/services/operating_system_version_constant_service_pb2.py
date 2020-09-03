# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/operating_system_version_constant_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import operating_system_version_constant_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_operating__system__version__constant__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/operating_system_version_constant_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB*OperatingSystemVersionConstantServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nPgoogle/ads/googleads/v3/services/operating_system_version_constant_service.proto\x12 google.ads.googleads.v3.services\x1aIgoogle/ads/googleads/v3/resources/operating_system_version_constant.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x82\x01\n(GetOperatingSystemVersionConstantRequest\x12V\n\rresource_name\x18\x01 \x01(\tB?\xe0\x41\x02\xfa\x41\x39\n7googleads.googleapis.com/OperatingSystemVersionConstant2\xc8\x02\n%OperatingSystemVersionConstantService\x12\x81\x02\n!GetOperatingSystemVersionConstant\x12J.google.ads.googleads.v3.services.GetOperatingSystemVersionConstantRequest\x1a\x41.google.ads.googleads.v3.resources.OperatingSystemVersionConstant\"M\x82\xd3\xe4\x93\x02\x37\x12\x35/v3/{resource_name=operatingSystemVersionConstants/*}\xda\x41\rresource_name\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x91\x02\n$com.google.ads.googleads.v3.servicesB*OperatingSystemVersionConstantServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_operating__system__version__constant__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETOPERATINGSYSTEMVERSIONCONSTANTREQUEST = _descriptor.Descriptor(
  name='GetOperatingSystemVersionConstantRequest',
  full_name='google.ads.googleads.v3.services.GetOperatingSystemVersionConstantRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetOperatingSystemVersionConstantRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A9\n7googleads.googleapis.com/OperatingSystemVersionConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=309,
  serialized_end=439,
)

DESCRIPTOR.message_types_by_name['GetOperatingSystemVersionConstantRequest'] = _GETOPERATINGSYSTEMVERSIONCONSTANTREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetOperatingSystemVersionConstantRequest = _reflection.GeneratedProtocolMessageType('GetOperatingSystemVersionConstantRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETOPERATINGSYSTEMVERSIONCONSTANTREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.operating_system_version_constant_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetOperatingSystemVersionConstantRequest)
  })
_sym_db.RegisterMessage(GetOperatingSystemVersionConstantRequest)


DESCRIPTOR._options = None
_GETOPERATINGSYSTEMVERSIONCONSTANTREQUEST.fields_by_name['resource_name']._options = None

_OPERATINGSYSTEMVERSIONCONSTANTSERVICE = _descriptor.ServiceDescriptor(
  name='OperatingSystemVersionConstantService',
  full_name='google.ads.googleads.v3.services.OperatingSystemVersionConstantService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=442,
  serialized_end=770,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetOperatingSystemVersionConstant',
    full_name='google.ads.googleads.v3.services.OperatingSystemVersionConstantService.GetOperatingSystemVersionConstant',
    index=0,
    containing_service=None,
    input_type=_GETOPERATINGSYSTEMVERSIONCONSTANTREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_operating__system__version__constant__pb2._OPERATINGSYSTEMVERSIONCONSTANT,
    serialized_options=b'\202\323\344\223\0027\0225/v3/{resource_name=operatingSystemVersionConstants/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_OPERATINGSYSTEMVERSIONCONSTANTSERVICE)

DESCRIPTOR.services_by_name['OperatingSystemVersionConstantService'] = _OPERATINGSYSTEMVERSIONCONSTANTSERVICE

# @@protoc_insertion_point(module_scope)
