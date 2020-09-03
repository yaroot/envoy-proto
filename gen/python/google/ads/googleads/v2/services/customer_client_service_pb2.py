# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v2/services/customer_client_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v2.resources import customer_client_pb2 as google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_customer__client__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v2/services/customer_client_service.proto',
  package='google.ads.googleads.v2.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v2.servicesB\032CustomerClientServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v2/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V2.Services\312\002 Google\\Ads\\GoogleAds\\V2\\Services\352\002$Google::Ads::GoogleAds::V2::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v2/services/customer_client_service.proto\x12 google.ads.googleads.v2.services\x1a\x37google/ads/googleads/v2/resources/customer_client.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"b\n\x18GetCustomerClientRequest\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'googleads.googleapis.com/CustomerClient2\x84\x02\n\x15\x43ustomerClientService\x12\xcd\x01\n\x11GetCustomerClient\x12:.google.ads.googleads.v2.services.GetCustomerClientRequest\x1a\x31.google.ads.googleads.v2.resources.CustomerClient\"I\x82\xd3\xe4\x93\x02\x33\x12\x31/v2/{resource_name=customers/*/customerClients/*}\xda\x41\rresource_name\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x81\x02\n$com.google.ads.googleads.v2.servicesB\x1a\x43ustomerClientServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v2/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V2.Services\xca\x02 Google\\Ads\\GoogleAds\\V2\\Services\xea\x02$Google::Ads::GoogleAds::V2::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_customer__client__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETCUSTOMERCLIENTREQUEST = _descriptor.Descriptor(
  name='GetCustomerClientRequest',
  full_name='google.ads.googleads.v2.services.GetCustomerClientRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v2.services.GetCustomerClientRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A)\n\'googleads.googleapis.com/CustomerClient', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=272,
  serialized_end=370,
)

DESCRIPTOR.message_types_by_name['GetCustomerClientRequest'] = _GETCUSTOMERCLIENTREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetCustomerClientRequest = _reflection.GeneratedProtocolMessageType('GetCustomerClientRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETCUSTOMERCLIENTREQUEST,
  '__module__' : 'google.ads.googleads.v2.services.customer_client_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v2.services.GetCustomerClientRequest)
  })
_sym_db.RegisterMessage(GetCustomerClientRequest)


DESCRIPTOR._options = None
_GETCUSTOMERCLIENTREQUEST.fields_by_name['resource_name']._options = None

_CUSTOMERCLIENTSERVICE = _descriptor.ServiceDescriptor(
  name='CustomerClientService',
  full_name='google.ads.googleads.v2.services.CustomerClientService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=373,
  serialized_end=633,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetCustomerClient',
    full_name='google.ads.googleads.v2.services.CustomerClientService.GetCustomerClient',
    index=0,
    containing_service=None,
    input_type=_GETCUSTOMERCLIENTREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v2_dot_resources_dot_customer__client__pb2._CUSTOMERCLIENT,
    serialized_options=b'\202\323\344\223\0023\0221/v2/{resource_name=customers/*/customerClients/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_CUSTOMERCLIENTSERVICE)

DESCRIPTOR.services_by_name['CustomerClientService'] = _CUSTOMERCLIENTSERVICE

# @@protoc_insertion_point(module_scope)
