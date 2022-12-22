# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v12/resources/detail_placement_view.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v12.enums import placement_type_pb2 as google_dot_ads_dot_googleads_dot_v12_dot_enums_dot_placement__type__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n>google/ads/googleads/v12/resources/detail_placement_view.proto\x12\"google.ads.googleads.v12.resources\x1a\x33google/ads/googleads/v12/enums/placement_type.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\"\x99\x04\n\x13\x44\x65tailPlacementView\x12K\n\rresource_name\x18\x01 \x01(\tB4\xe0\x41\x03\xfa\x41.\n,googleads.googleapis.com/DetailPlacementView\x12\x1b\n\tplacement\x18\x07 \x01(\tB\x03\xe0\x41\x03H\x00\x88\x01\x01\x12\x1e\n\x0c\x64isplay_name\x18\x08 \x01(\tB\x03\xe0\x41\x03H\x01\x88\x01\x01\x12,\n\x1agroup_placement_target_url\x18\t \x01(\tB\x03\xe0\x41\x03H\x02\x88\x01\x01\x12\x1c\n\ntarget_url\x18\n \x01(\tB\x03\xe0\x41\x03H\x03\x88\x01\x01\x12\\\n\x0eplacement_type\x18\x06 \x01(\x0e\x32?.google.ads.googleads.v12.enums.PlacementTypeEnum.PlacementTypeB\x03\xe0\x41\x03:\x80\x01\xea\x41}\n,googleads.googleapis.com/DetailPlacementView\x12Mcustomers/{customer_id}/detailPlacementViews/{ad_group_id}~{base64_placement}B\x0c\n\n_placementB\x0f\n\r_display_nameB\x1d\n\x1b_group_placement_target_urlB\r\n\x0b_target_urlB\x8a\x02\n&com.google.ads.googleads.v12.resourcesB\x18\x44\x65tailPlacementViewProtoP\x01ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\xa2\x02\x03GAA\xaa\x02\"Google.Ads.GoogleAds.V12.Resources\xca\x02\"Google\\Ads\\GoogleAds\\V12\\Resources\xea\x02&Google::Ads::GoogleAds::V12::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v12.resources.detail_placement_view_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n&com.google.ads.googleads.v12.resourcesB\030DetailPlacementViewProtoP\001ZKgoogle.golang.org/genproto/googleapis/ads/googleads/v12/resources;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V12.Resources\312\002\"Google\\Ads\\GoogleAds\\V12\\Resources\352\002&Google::Ads::GoogleAds::V12::Resources'
  _DETAILPLACEMENTVIEW.fields_by_name['resource_name']._options = None
  _DETAILPLACEMENTVIEW.fields_by_name['resource_name']._serialized_options = b'\340A\003\372A.\n,googleads.googleapis.com/DetailPlacementView'
  _DETAILPLACEMENTVIEW.fields_by_name['placement']._options = None
  _DETAILPLACEMENTVIEW.fields_by_name['placement']._serialized_options = b'\340A\003'
  _DETAILPLACEMENTVIEW.fields_by_name['display_name']._options = None
  _DETAILPLACEMENTVIEW.fields_by_name['display_name']._serialized_options = b'\340A\003'
  _DETAILPLACEMENTVIEW.fields_by_name['group_placement_target_url']._options = None
  _DETAILPLACEMENTVIEW.fields_by_name['group_placement_target_url']._serialized_options = b'\340A\003'
  _DETAILPLACEMENTVIEW.fields_by_name['target_url']._options = None
  _DETAILPLACEMENTVIEW.fields_by_name['target_url']._serialized_options = b'\340A\003'
  _DETAILPLACEMENTVIEW.fields_by_name['placement_type']._options = None
  _DETAILPLACEMENTVIEW.fields_by_name['placement_type']._serialized_options = b'\340A\003'
  _DETAILPLACEMENTVIEW._options = None
  _DETAILPLACEMENTVIEW._serialized_options = b'\352A}\n,googleads.googleapis.com/DetailPlacementView\022Mcustomers/{customer_id}/detailPlacementViews/{ad_group_id}~{base64_placement}'
  _DETAILPLACEMENTVIEW._serialized_start=216
  _DETAILPLACEMENTVIEW._serialized_end=753
# @@protoc_insertion_point(module_scope)