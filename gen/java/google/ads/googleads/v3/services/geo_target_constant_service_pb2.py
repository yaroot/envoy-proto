# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v3/services/geo_target_constant_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v3.resources import geo_target_constant_pb2 as google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_geo__target__constant__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/ads/googleads/v3/services/geo_target_constant_service.proto',
  package='google.ads.googleads.v3.services',
  syntax='proto3',
  serialized_options=b'\n$com.google.ads.googleads.v3.servicesB\035GeoTargetConstantServiceProtoP\001ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V3.Services\312\002 Google\\Ads\\GoogleAds\\V3\\Services\352\002$Google::Ads::GoogleAds::V3::Services',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\nBgoogle/ads/googleads/v3/services/geo_target_constant_service.proto\x12 google.ads.googleads.v3.services\x1a;google/ads/googleads/v3/resources/geo_target_constant.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1egoogle/protobuf/wrappers.proto\"h\n\x1bGetGeoTargetConstantRequest\x12I\n\rresource_name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*googleads.googleapis.com/GeoTargetConstant\"\xe7\x03\n SuggestGeoTargetConstantsRequest\x12,\n\x06locale\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12\x32\n\x0c\x63ountry_code\x18\x05 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12j\n\x0elocation_names\x18\x01 \x01(\x0b\x32P.google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.LocationNamesH\x00\x12\x64\n\x0bgeo_targets\x18\x02 \x01(\x0b\x32M.google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.GeoTargetsH\x00\x1a<\n\rLocationNames\x12+\n\x05names\x18\x01 \x03(\x0b\x32\x1c.google.protobuf.StringValue\x1aH\n\nGeoTargets\x12:\n\x14geo_target_constants\x18\x01 \x03(\x0b\x32\x1c.google.protobuf.StringValueB\x07\n\x05query\"\x8b\x01\n!SuggestGeoTargetConstantsResponse\x12\x66\n\x1fgeo_target_constant_suggestions\x18\x01 \x03(\x0b\x32=.google.ads.googleads.v3.services.GeoTargetConstantSuggestion\"\xd8\x02\n\x1bGeoTargetConstantSuggestion\x12,\n\x06locale\x18\x01 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12*\n\x05reach\x18\x02 \x01(\x0b\x32\x1b.google.protobuf.Int64Value\x12\x31\n\x0bsearch_term\x18\x03 \x01(\x0b\x32\x1c.google.protobuf.StringValue\x12Q\n\x13geo_target_constant\x18\x04 \x01(\x0b\x32\x34.google.ads.googleads.v3.resources.GeoTargetConstant\x12Y\n\x1bgeo_target_constant_parents\x18\x05 \x03(\x0b\x32\x34.google.ads.googleads.v3.resources.GeoTargetConstant2\xd9\x03\n\x18GeoTargetConstantService\x12\xcd\x01\n\x14GetGeoTargetConstant\x12=.google.ads.googleads.v3.services.GetGeoTargetConstantRequest\x1a\x34.google.ads.googleads.v3.resources.GeoTargetConstant\"@\x82\xd3\xe4\x93\x02*\x12(/v3/{resource_name=geoTargetConstants/*}\xda\x41\rresource_name\x12\xcf\x01\n\x19SuggestGeoTargetConstants\x12\x42.google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest\x1a\x43.google.ads.googleads.v3.services.SuggestGeoTargetConstantsResponse\")\x82\xd3\xe4\x93\x02#\"\x1e/v3/geoTargetConstants:suggest:\x01*\x1a\x1b\xca\x41\x18googleads.googleapis.comB\x84\x02\n$com.google.ads.googleads.v3.servicesB\x1dGeoTargetConstantServiceProtoP\x01ZHgoogle.golang.org/genproto/googleapis/ads/googleads/v3/services;services\xa2\x02\x03GAA\xaa\x02 Google.Ads.GoogleAds.V3.Services\xca\x02 Google\\Ads\\GoogleAds\\V3\\Services\xea\x02$Google::Ads::GoogleAds::V3::Servicesb\x06proto3'
  ,
  dependencies=[google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_geo__target__constant__pb2.DESCRIPTOR,google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,])




_GETGEOTARGETCONSTANTREQUEST = _descriptor.Descriptor(
  name='GetGeoTargetConstantRequest',
  full_name='google.ads.googleads.v3.services.GetGeoTargetConstantRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='resource_name', full_name='google.ads.googleads.v3.services.GetGeoTargetConstantRequest.resource_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002\372A,\n*googleads.googleapis.com/GeoTargetConstant', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=312,
  serialized_end=416,
)


_SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES = _descriptor.Descriptor(
  name='LocationNames',
  full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.LocationNames',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='names', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.LocationNames.names', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=763,
  serialized_end=823,
)

_SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS = _descriptor.Descriptor(
  name='GeoTargets',
  full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.GeoTargets',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='geo_target_constants', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.GeoTargets.geo_target_constants', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=825,
  serialized_end=897,
)

_SUGGESTGEOTARGETCONSTANTSREQUEST = _descriptor.Descriptor(
  name='SuggestGeoTargetConstantsRequest',
  full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='locale', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.locale', index=0,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='country_code', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.country_code', index=1,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='location_names', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.location_names', index=2,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_targets', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.geo_targets', index=3,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES, _SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='query', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.query',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=419,
  serialized_end=906,
)


_SUGGESTGEOTARGETCONSTANTSRESPONSE = _descriptor.Descriptor(
  name='SuggestGeoTargetConstantsResponse',
  full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsResponse',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='geo_target_constant_suggestions', full_name='google.ads.googleads.v3.services.SuggestGeoTargetConstantsResponse.geo_target_constant_suggestions', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=909,
  serialized_end=1048,
)


_GEOTARGETCONSTANTSUGGESTION = _descriptor.Descriptor(
  name='GeoTargetConstantSuggestion',
  full_name='google.ads.googleads.v3.services.GeoTargetConstantSuggestion',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='locale', full_name='google.ads.googleads.v3.services.GeoTargetConstantSuggestion.locale', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reach', full_name='google.ads.googleads.v3.services.GeoTargetConstantSuggestion.reach', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search_term', full_name='google.ads.googleads.v3.services.GeoTargetConstantSuggestion.search_term', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_target_constant', full_name='google.ads.googleads.v3.services.GeoTargetConstantSuggestion.geo_target_constant', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='geo_target_constant_parents', full_name='google.ads.googleads.v3.services.GeoTargetConstantSuggestion.geo_target_constant_parents', index=4,
      number=5, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1051,
  serialized_end=1395,
)

_SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES.fields_by_name['names'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES.containing_type = _SUGGESTGEOTARGETCONSTANTSREQUEST
_SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS.fields_by_name['geo_target_constants'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS.containing_type = _SUGGESTGEOTARGETCONSTANTSREQUEST
_SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['locale'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['country_code'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['location_names'].message_type = _SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES
_SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['geo_targets'].message_type = _SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS
_SUGGESTGEOTARGETCONSTANTSREQUEST.oneofs_by_name['query'].fields.append(
  _SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['location_names'])
_SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['location_names'].containing_oneof = _SUGGESTGEOTARGETCONSTANTSREQUEST.oneofs_by_name['query']
_SUGGESTGEOTARGETCONSTANTSREQUEST.oneofs_by_name['query'].fields.append(
  _SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['geo_targets'])
_SUGGESTGEOTARGETCONSTANTSREQUEST.fields_by_name['geo_targets'].containing_oneof = _SUGGESTGEOTARGETCONSTANTSREQUEST.oneofs_by_name['query']
_SUGGESTGEOTARGETCONSTANTSRESPONSE.fields_by_name['geo_target_constant_suggestions'].message_type = _GEOTARGETCONSTANTSUGGESTION
_GEOTARGETCONSTANTSUGGESTION.fields_by_name['locale'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_GEOTARGETCONSTANTSUGGESTION.fields_by_name['reach'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT64VALUE
_GEOTARGETCONSTANTSUGGESTION.fields_by_name['search_term'].message_type = google_dot_protobuf_dot_wrappers__pb2._STRINGVALUE
_GEOTARGETCONSTANTSUGGESTION.fields_by_name['geo_target_constant'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_geo__target__constant__pb2._GEOTARGETCONSTANT
_GEOTARGETCONSTANTSUGGESTION.fields_by_name['geo_target_constant_parents'].message_type = google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_geo__target__constant__pb2._GEOTARGETCONSTANT
DESCRIPTOR.message_types_by_name['GetGeoTargetConstantRequest'] = _GETGEOTARGETCONSTANTREQUEST
DESCRIPTOR.message_types_by_name['SuggestGeoTargetConstantsRequest'] = _SUGGESTGEOTARGETCONSTANTSREQUEST
DESCRIPTOR.message_types_by_name['SuggestGeoTargetConstantsResponse'] = _SUGGESTGEOTARGETCONSTANTSRESPONSE
DESCRIPTOR.message_types_by_name['GeoTargetConstantSuggestion'] = _GEOTARGETCONSTANTSUGGESTION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

GetGeoTargetConstantRequest = _reflection.GeneratedProtocolMessageType('GetGeoTargetConstantRequest', (_message.Message,), {
  'DESCRIPTOR' : _GETGEOTARGETCONSTANTREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.geo_target_constant_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GetGeoTargetConstantRequest)
  })
_sym_db.RegisterMessage(GetGeoTargetConstantRequest)

SuggestGeoTargetConstantsRequest = _reflection.GeneratedProtocolMessageType('SuggestGeoTargetConstantsRequest', (_message.Message,), {

  'LocationNames' : _reflection.GeneratedProtocolMessageType('LocationNames', (_message.Message,), {
    'DESCRIPTOR' : _SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES,
    '__module__' : 'google.ads.googleads.v3.services.geo_target_constant_service_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.LocationNames)
    })
  ,

  'GeoTargets' : _reflection.GeneratedProtocolMessageType('GeoTargets', (_message.Message,), {
    'DESCRIPTOR' : _SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS,
    '__module__' : 'google.ads.googleads.v3.services.geo_target_constant_service_pb2'
    # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest.GeoTargets)
    })
  ,
  'DESCRIPTOR' : _SUGGESTGEOTARGETCONSTANTSREQUEST,
  '__module__' : 'google.ads.googleads.v3.services.geo_target_constant_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.SuggestGeoTargetConstantsRequest)
  })
_sym_db.RegisterMessage(SuggestGeoTargetConstantsRequest)
_sym_db.RegisterMessage(SuggestGeoTargetConstantsRequest.LocationNames)
_sym_db.RegisterMessage(SuggestGeoTargetConstantsRequest.GeoTargets)

SuggestGeoTargetConstantsResponse = _reflection.GeneratedProtocolMessageType('SuggestGeoTargetConstantsResponse', (_message.Message,), {
  'DESCRIPTOR' : _SUGGESTGEOTARGETCONSTANTSRESPONSE,
  '__module__' : 'google.ads.googleads.v3.services.geo_target_constant_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.SuggestGeoTargetConstantsResponse)
  })
_sym_db.RegisterMessage(SuggestGeoTargetConstantsResponse)

GeoTargetConstantSuggestion = _reflection.GeneratedProtocolMessageType('GeoTargetConstantSuggestion', (_message.Message,), {
  'DESCRIPTOR' : _GEOTARGETCONSTANTSUGGESTION,
  '__module__' : 'google.ads.googleads.v3.services.geo_target_constant_service_pb2'
  # @@protoc_insertion_point(class_scope:google.ads.googleads.v3.services.GeoTargetConstantSuggestion)
  })
_sym_db.RegisterMessage(GeoTargetConstantSuggestion)


DESCRIPTOR._options = None
_GETGEOTARGETCONSTANTREQUEST.fields_by_name['resource_name']._options = None

_GEOTARGETCONSTANTSERVICE = _descriptor.ServiceDescriptor(
  name='GeoTargetConstantService',
  full_name='google.ads.googleads.v3.services.GeoTargetConstantService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\030googleads.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=1398,
  serialized_end=1871,
  methods=[
  _descriptor.MethodDescriptor(
    name='GetGeoTargetConstant',
    full_name='google.ads.googleads.v3.services.GeoTargetConstantService.GetGeoTargetConstant',
    index=0,
    containing_service=None,
    input_type=_GETGEOTARGETCONSTANTREQUEST,
    output_type=google_dot_ads_dot_googleads_dot_v3_dot_resources_dot_geo__target__constant__pb2._GEOTARGETCONSTANT,
    serialized_options=b'\202\323\344\223\002*\022(/v3/{resource_name=geoTargetConstants/*}\332A\rresource_name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='SuggestGeoTargetConstants',
    full_name='google.ads.googleads.v3.services.GeoTargetConstantService.SuggestGeoTargetConstants',
    index=1,
    containing_service=None,
    input_type=_SUGGESTGEOTARGETCONSTANTSREQUEST,
    output_type=_SUGGESTGEOTARGETCONSTANTSRESPONSE,
    serialized_options=b'\202\323\344\223\002#\"\036/v3/geoTargetConstants:suggest:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_GEOTARGETCONSTANTSERVICE)

DESCRIPTOR.services_by_name['GeoTargetConstantService'] = _GEOTARGETCONSTANTSERVICE

# @@protoc_insertion_point(module_scope)
