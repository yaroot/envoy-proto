# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v7/services/domain_category_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v7.resources import domain_category_pb2 as google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_domain__category__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v7/services/domain_category_service.proto',
  package='google.ads.googleads.v7.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v7.servicesB\032DomainCategoryServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 Google\\Ads\\GoogleAds\\V7\\Services\352\002$Google::Ads::GoogleAds::V7::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n>google/ads/googleads/v7/services/domain_category_service.proto\x12 google.ads.googleads.v7.services\x1a\x37google/ads/googleads/v7/resources/domain_category.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"b\n\x18GetDomainCategoryRequest\x12\x46\n\rresource_name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'googleads.googleapis.com/DomainCategory2\xaf\x02\n\x15\x44omainCategoryService\x12\xce\x01\n\x11GetDomainCategory\x12:.google.ads.googleads.v7.services.GetDomainCategoryRequest\x1a\x31.google.ads.googleads.v7.resources.DomainCategory\"J\x82\xd3\xe4\x93\x02\x34\x12\x32/v7/{resource_name=customers/*/domainCategories/*}\xda\x41\rresource_name\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x81\x02\n$com.google.ads.googleads.v7.servicesB\x1a\x44omainCategoryServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v7/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V7.Services\xca\x02 Google\\Ads\\GoogleAds\\V7\\Services\xea\x02$Google::Ads::GoogleAds::V7::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_domain__category__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,])




_GETDOMAINCATEGORYREQUEST = _descriptor.Descriptor(
  name='GetDomainCategoryRequest',
  full_name='google.ads.googleads.v7.services.GetDomainCategoryRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v7.services.GetDomainCategoryRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A)\n\'googleads.googleapis.com/DomainCategory', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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

DESCRIPTOR.message_types_by_name['GetDomainCategoryRequest'] = _GETDOMAINCATEGORYREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetDomainCategoryRequest = _reflection.GeneratedProtocolMessageType('GetDomainCategoryRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETDOMAINCATEGORYREQUEST,
  '__module__' : 'google.ads.googleads.v7.services.domain_category_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v7.services.GetDomainCategoryRequest)
  })
_sym_db.RegisterMessage(GetDomainCategoryRequest)


DESCRIPTOR._options = None
_GETDOMAINCATEGORYREQUEST.fields_by_name['resource_name']._options = None

_DOMAINCATEGORYSERVICE = _descriptor.ServiceDescriptor(
  name='DomainCategoryService',
  full_name='google.ads.googleads.v7.services.DomainCategoryService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=373,
  serialized_end=676,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetDomainCategory',
    full_name='google.ads.googleads.v7.services.DomainCategoryService.GetDomainCategory',
    index=0,
    containing_service=None,
    input_type=_GETDOMAINCATEGORYREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v7_dot_resources_dot_domain__category__pb2._DOMAINCATEGORY,
    serialized_options=b'\202\323\344\223\0024\0222/v7/{resource_name=customers/*/domainCategories/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_DOMAINCATEGORYSERVICE)

DESCRIPTOR.services_by_name['DomainCategoryService'] = _DOMAINCATEGORYSERVICE

# @@protoc_insertion_point(module_scope)