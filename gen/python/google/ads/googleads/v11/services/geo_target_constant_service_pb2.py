# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/geo_target_constant_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.resources import geo_target_constant_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_geo__target__constant__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nCgoogle/ads/googleads/v11/services/geo_target_constant_service.proto\x12!google.ads.googleads.v11.services\x1a<google/ads/googleads/v11/resources/geo_target_constant.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\"\x97\x03\n SuggestGeoTargetConstantsRequest\x12\x13\n\x06locale\x18\x06 \x01(\tH\x01\x88\x01\x01\x12\x19\n\x0c\x63ountry_code\x18\x07 \x01(\tH\x02\x88\x01\x01\x12k\n\x0elocation_names\x18\x01 \x01(\x0b\x32Q.google.ads.googleads.v11.services.SuggestGeoTargetConstantsRequest.LocationNamesH\x00\x12\x65\n\x0bgeo_targets\x18\x02 \x01(\x0b\x32N.google.ads.googleads.v11.services.SuggestGeoTargetConstantsRequest.GeoTargetsH\x00\x1a\x1e\n\rLocationNames\x12\r\n\x05names\x18\x02 \x03(\t\x1a*\n\nGeoTargets\x12\x1c\n\x14geo_target_constants\x18\x02 \x03(\tB\x07\n\x05queryB\t\n\x07_localeB\x0f\n\r_country_code\"\x8c\x01\n!SuggestGeoTargetConstantsResponse\x12g\n\x1fgeo_target_constant_suggestions\x18\x01 \x03(\x0b\x32>.google.ads.googleads.v11.services.GeoTargetConstantSuggestion\"\xb5\x02\n\x1bGeoTargetConstantSuggestion\x12\x13\n\x06locale\x18\x06 \x01(\tH\x00\x88\x01\x01\x12\x12\n\x05reach\x18\x07 \x01(\x03H\x01\x88\x01\x01\x12\x18\n\x0bsearch_term\x18\x08 \x01(\tH\x02\x88\x01\x01\x12R\n\x13geo_target_constant\x18\x04 \x01(\x0b\x32\x35.google.ads.googleads.v11.resources.GeoTargetConstant\x12Z\n\x1bgeo_target_constant_parents\x18\x05 \x03(\x0b\x32\x35.google.ads.googleads.v11.resources.GeoTargetConstantB\t\n\x07_localeB\x08\n\x06_reachB\x0e\n\x0c_search_term2\xb6\x02\n\x18GeoTargetConstantService\x12\xd2\x01\n\x19SuggestGeoTargetConstants\x12\x43.google.ads.googleads.v11.services.SuggestGeoTargetConstantsRequest\x1a\x44.google.ads.googleads.v11.services.SuggestGeoTargetConstantsResponse\"*\x82\xd3\xe4\x93\x02$\"\x1f/v11/geoTargetConstants:suggest:\x01*\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x89\x02\n%com.google.ads.googleads.v11.servicesB\x1dGeoTargetConstantServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.geo_target_constant_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\035GeoTargetConstantServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _GEOTARGETCONSTANTSERVICE._options = None
  _GEOTARGETCONSTANTSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _GEOTARGETCONSTANTSERVICE.methods_by_name['SuggestGeoTargetConstants']._options = None
  _GEOTARGETCONSTANTSERVICE.methods_by_name['SuggestGeoTargetConstants']._serialized_options = b'\202\323\344\223\002$\"\037/v11/geoTargetConstants:suggest:\001*'
  _SUGGESTGEOTARGETCONSTANTSREQUEST._serialized_start=224
  _SUGGESTGEOTARGETCONSTANTSREQUEST._serialized_end=631
  _SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES._serialized_start=520
  _SUGGESTGEOTARGETCONSTANTSREQUEST_LOCATIONNAMES._serialized_end=550
  _SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS._serialized_start=552
  _SUGGESTGEOTARGETCONSTANTSREQUEST_GEOTARGETS._serialized_end=594
  _SUGGESTGEOTARGETCONSTANTSRESPONSE._serialized_start=634
  _SUGGESTGEOTARGETCONSTANTSRESPONSE._serialized_end=774
  _GEOTARGETCONSTANTSUGGESTION._serialized_start=777
  _GEOTARGETCONSTANTSUGGESTION._serialized_end=1086
  _GEOTARGETCONSTANTSERVICE._serialized_start=1089
  _GEOTARGETCONSTANTSERVICE._serialized_end=1399
# @@protoc_insertion_point(module_scope)
