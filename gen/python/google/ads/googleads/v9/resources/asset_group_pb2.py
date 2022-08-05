# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v9/resources/asset_group.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v9.enums import asset_group_status_pb2 as google_dot_ads_dot_googleads_dot_v9_dot_enums_dot_asset__group__status__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/ads/googleads/v9/resources/asset_group.proto\x12!google.ads.googleads.v9.resources\x1a\x36google/ads/googleads/v9/enums/asset_group_status.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/api/annotations.proto\"\xb4\x03\n\nAssetGroup\x12\x42\n\rresource_name\x18\x01 \x01(\tB+\xe0\x41\x05\xfa\x41%\n#googleads.googleapis.com/AssetGroup\x12\x0f\n\x02id\x18\t \x01(\x03\x42\x03\xe0\x41\x03\x12;\n\x08\x63\x61mpaign\x18\x02 \x01(\tB)\xe0\x41\x05\xfa\x41#\n!googleads.googleapis.com/Campaign\x12\x11\n\x04name\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\nfinal_urls\x18\x04 \x03(\t\x12\x19\n\x11\x66inal_mobile_urls\x18\x05 \x03(\t\x12T\n\x06status\x18\x06 \x01(\x0e\x32\x44.google.ads.googleads.v9.enums.AssetGroupStatusEnum.AssetGroupStatus\x12\r\n\x05path1\x18\x07 \x01(\t\x12\r\n\x05path2\x18\x08 \x01(\t:^\xea\x41[\n#googleads.googleapis.com/AssetGroup\x12\x34\x63ustomers/{customer_id}/assetGroups/{asset_group_id}B\xfc\x01\n%com.google.ads.googleads.v9.resourcesB\x0f\x41ssetGroupProtoP\x01ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v9/resources;resources\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V9.Resources\xca\x02!Google\\Ads\\GoogleAds\\V9\\Resources\xea\x02%Google::Ads::GoogleAds::V9::Resourcesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v9.resources.asset_group_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v9.resourcesB\017AssetGroupProtoP\001ZJgoogle.golang.org/genproto/googleapis/ads/googleads/v9/resources;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V9.Resources\312\002!Google\\Ads\\GoogleAds\\V9\\Resources\352\002%Google::Ads::GoogleAds::V9::Resources'
  _ASSETGROUP.fields_by_name['resource_name']._options = None
  _ASSETGROUP.fields_by_name['resource_name']._serialized_options = b'\340A\005\372A%\n#googleads.googleapis.com/AssetGroup'
  _ASSETGROUP.fields_by_name['id']._options = None
  _ASSETGROUP.fields_by_name['id']._serialized_options = b'\340A\003'
  _ASSETGROUP.fields_by_name['campaign']._options = None
  _ASSETGROUP.fields_by_name['campaign']._serialized_options = b'\340A\005\372A#\n!googleads.googleapis.com/Campaign'
  _ASSETGROUP.fields_by_name['name']._options = None
  _ASSETGROUP.fields_by_name['name']._serialized_options = b'\340A\002'
  _ASSETGROUP._options = None
  _ASSETGROUP._serialized_options = b'\352A[\n#googleads.googleapis.com/AssetGroup\0224customers/{customer_id}/assetGroups/{asset_group_id}'
  _ASSETGROUP._serialized_start=237
  _ASSETGROUP._serialized_end=673
# @@protoc_insertion_point(module_scope)
