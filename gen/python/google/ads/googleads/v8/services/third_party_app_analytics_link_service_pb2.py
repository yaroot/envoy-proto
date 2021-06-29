# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v8/services/third_party_app_analytics_link_service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v8.resources import third_party_app_analytics_link_pb2 as google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_third__party__app__analytics__link__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v8/services/third_party_app_analytics_link_service.proto',
  package='google.ads.googleads.v8.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v8.servicesB&ThirdPartyAppAnalyticsLinkServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V8.Services\312\002 Google\\Ads\\GoogleAds\\V8\\Services\352\002$Google::Ads::GoogleAds::V8::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nMgoogle/ads/googleads/v8/services/third_party_app_analytics_link_service.proto\x12 google.ads.googleads.v8.services\x1a\x46google/ads/googleads/v8/resources/third_party_app_analytics_link.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/api/resource.proto\x1a\x17google/api/client.proto\"w\n$GetThirdPartyAppAnalyticsLinkRequest\x12O\n\rresource_name\x18\x01 \x01(\tB8\xfa\x41\x35\n3googleads.googleapis.com/ThirdPartyAppAnalyticsLink\"s\n RegenerateShareableLinkIdRequest\x12O\n\rresource_name\x18\x01 \x01(\tB8\xfa\x41\x35\n3googleads.googleapis.com/ThirdPartyAppAnalyticsLink\"#\n!RegenerateShareableLinkIdResponse2\xe5\x04\n!ThirdPartyAppAnalyticsLinkService\x12\xed\x01\n\x1dGetThirdPartyAppAnalyticsLink\x12\x46.google.ads.googleads.v8.services.GetThirdPartyAppAnalyticsLinkRequest\x1a=.google.ads.googleads.v8.resources.ThirdPartyAppAnalyticsLink\"E\x82\xd3\xe4\x93\x02?\x12=/v8/{resource_name=customers/*/thirdPartyAppAnalyticsLinks/*}\x12\x88\x02\n\x19RegenerateShareableLinkId\x12\x42.google.ads.googleads.v8.services.RegenerateShareableLinkIdRequest\x1a\x43.google.ads.googleads.v8.services.RegenerateShareableLinkIdResponse\"b\x82\xd3\xe4\x93\x02\\\"W/v8/{resource_name=customers/*/thirdPartyAppAnalyticsLinks/*}:regenerateShareableLinkId:\x01*\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x8d\x02\n$com.google.ads.googleads.v8.servicesB&ThirdPartyAppAnalyticsLinkServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v8/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V8.Services\xca\x02 Google\\Ads\\GoogleAds\\V8\\Services\xea\x02$Google::Ads::GoogleAds::V8::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_third__party__app__analytics__link__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])




_GETTHIRDPARTYAPPANALYTICSLINKREQUEST = _descriptor.Descriptor(
  name='GetThirdPartyAppAnalyticsLinkRequest',
  full_name='google.ads.googleads.v8.services.GetThirdPartyAppAnalyticsLinkRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.GetThirdPartyAppAnalyticsLinkRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A5\n3googleads.googleapis.com/ThirdPartyAppAnalyticsLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=269,
  serialized_end=388,
)


_REGENERATESHAREABLELINKIDREQUEST = _descriptor.Descriptor(
  name='RegenerateShareableLinkIdRequest',
  full_name='google.ads.googleads.v8.services.RegenerateShareableLinkIdRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v8.services.RegenerateShareableLinkIdRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\372A5\n3googleads.googleapis.com/ThirdPartyAppAnalyticsLink', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=390,
  serialized_end=505,
)


_REGENERATESHAREABLELINKIDRESPONSE = _descriptor.Descriptor(
  name='RegenerateShareableLinkIdResponse',
  full_name='google.ads.googleads.v8.services.RegenerateShareableLinkIdResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
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
  serialized_start=507,
  serialized_end=542,
)

DESCRIPTOR.message_types_by_name['GetThirdPartyAppAnalyticsLinkRequest'] = _GETTHIRDPARTYAPPANALYTICSLINKREQUEST
DESCRIPTOR.message_types_by_name['RegenerateShareableLinkIdRequest'] = _REGENERATESHAREABLELINKIDREQUEST
DESCRIPTOR.message_types_by_name['RegenerateShareableLinkIdResponse'] = _REGENERATESHAREABLELINKIDRESPONSE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetThirdPartyAppAnalyticsLinkRequest = _reflection.GeneratedProtocolMessageType('GetThirdPartyAppAnalyticsLinkRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETTHIRDPARTYAPPANALYTICSLINKREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.third_party_app_analytics_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.GetThirdPartyAppAnalyticsLinkRequest)
  })
_sym_db.RegisterMessage(GetThirdPartyAppAnalyticsLinkRequest)

RegenerateShareableLinkIdRequest = _reflection.GeneratedProtocolMessageType('RegenerateShareableLinkIdRequest', (_message.Message,), {
  'DESCRIPTOR' : _REGENERATESHAREABLELINKIDREQUEST,
  '__module__' : 'google.ads.googleads.v8.services.third_party_app_analytics_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.RegenerateShareableLinkIdRequest)
  })
_sym_db.RegisterMessage(RegenerateShareableLinkIdRequest)

RegenerateShareableLinkIdResponse = _reflection.GeneratedProtocolMessageType('RegenerateShareableLinkIdResponse', (_message.Message,), {
  'DESCRIPTOR' : _REGENERATESHAREABLELINKIDRESPONSE,
  '__module__' : 'google.ads.googleads.v8.services.third_party_app_analytics_link_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v8.services.RegenerateShareableLinkIdResponse)
  })
_sym_db.RegisterMessage(RegenerateShareableLinkIdResponse)


DESCRIPTOR._options = None
_GETTHIRDPARTYAPPANALYTICSLINKREQUEST.fields_by_name['resource_name']._options = None
_REGENERATESHAREABLELINKIDREQUEST.fields_by_name['resource_name']._options = None

_THIRDPARTYAPPANALYTICSLINKSERVICE = _descriptor.ServiceDescriptor(
  name='ThirdPartyAppAnalyticsLinkService',
  full_name='google.ads.googleads.v8.services.ThirdPartyAppAnalyticsLinkService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords',
  create_key=_descriptor._internal_create_key,
  serialized_start=545,
  serialized_end=1158,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetThirdPartyAppAnalyticsLink',
    full_name='google.ads.googleads.v8.services.ThirdPartyAppAnalyticsLinkService.GetThirdPartyAppAnalyticsLink',
    index=0,
    containing_service=None,
    input_type=_GETTHIRDPARTYAPPANALYTICSLINKREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v8_dot_resources_dot_third__party__app__analytics__link__pb2._THIRDPARTYAPPANALYTICSLINK,
    serialized_options=b'\202\323\344\223\002?\022=/v8/{resource_name=customers/*/thirdPartyAppAnalyticsLinks/*}',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='RegenerateShareableLinkId',
    full_name='google.ads.googleads.v8.services.ThirdPartyAppAnalyticsLinkService.RegenerateShareableLinkId',
    index=1,
    containing_service=None,
    input_type=_REGENERATESHAREABLELINKIDREQUEST,
    output_type=_REGENERATESHAREABLELINKIDRESPONSE,
    serialized_options=b'\202\323\344\223\002\\\"W/v8/{resource_name=customers/*/thirdPartyAppAnalyticsLinks/*}:regenerateShareableLinkId:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_THIRDPARTYAPPANALYTICSLINKSERVICE)

DESCRIPTOR.services_by_name['ThirdPartyAppAnalyticsLinkService'] = _THIRDPARTYAPPANALYTICSLINKSERVICE

# @@protoc_insertion_point(module_scope)
