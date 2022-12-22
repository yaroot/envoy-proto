# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/asset_group_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.resources import asset_group_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_asset__group__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/ads/googleads/v11/services/asset_group_service.proto\x12!google.ads.googleads.v11.services\x1a\x34google/ads/googleads/v11/resources/asset_group.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a google/protobuf/field_mask.proto\x1a\x17google/rpc/status.proto\"\x9c\x01\n\x18MutateAssetGroupsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12O\n\noperations\x18\x02 \x03(\x0b\x32\x36.google.ads.googleads.v11.services.AssetGroupOperationB\x03\xe0\x41\x02\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\"\x93\x02\n\x13\x41ssetGroupOperation\x12/\n\x0bupdate_mask\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12@\n\x06\x63reate\x18\x01 \x01(\x0b\x32..google.ads.googleads.v11.resources.AssetGroupH\x00\x12@\n\x06update\x18\x02 \x01(\x0b\x32..google.ads.googleads.v11.resources.AssetGroupH\x00\x12:\n\x06remove\x18\x03 \x01(\tB(\xfa\x41%\n#googleads.googleapis.com/AssetGroupH\x00\x42\x0b\n\toperation\"\x9a\x01\n\x19MutateAssetGroupsResponse\x12J\n\x07results\x18\x01 \x03(\x0b\x32\x39.google.ads.googleads.v11.services.MutateAssetGroupResult\x12\x31\n\x15partial_failure_error\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\"Y\n\x16MutateAssetGroupResult\x12?\n\rresource_name\x18\x01 \x01(\tB(\xfa\x41%\n#googleads.googleapis.com/AssetGroup2\xc2\x02\n\x11\x41ssetGroupService\x12\xe5\x01\n\x11MutateAssetGroups\x12;.google.ads.googleads.v11.services.MutateAssetGroupsRequest\x1a<.google.ads.googleads.v11.services.MutateAssetGroupsResponse\"U\x82\xd3\xe4\x93\x02\x36\"1/v11/customers/{customer_id=*}/assetGroups:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x82\x02\n%com.google.ads.googleads.v11.servicesB\x16\x41ssetGroupServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.asset_group_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\026AssetGroupServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATEASSETGROUPSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEASSETGROUPSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEASSETGROUPSREQUEST.fields_by_name['operations']._options = None
  _MUTATEASSETGROUPSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ASSETGROUPOPERATION.fields_by_name['remove']._options = None
  _ASSETGROUPOPERATION.fields_by_name['remove']._serialized_options = b'\372A%\n#googleads.googleapis.com/AssetGroup'
  _MUTATEASSETGROUPRESULT.fields_by_name['resource_name']._options = None
  _MUTATEASSETGROUPRESULT.fields_by_name['resource_name']._serialized_options = b'\372A%\n#googleads.googleapis.com/AssetGroup'
  _ASSETGROUPSERVICE._options = None
  _ASSETGROUPSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ASSETGROUPSERVICE.methods_by_name['MutateAssetGroups']._options = None
  _ASSETGROUPSERVICE.methods_by_name['MutateAssetGroups']._serialized_options = b'\202\323\344\223\0026\"1/v11/customers/{customer_id=*}/assetGroups:mutate:\001*\332A\026customer_id,operations'
  _MUTATEASSETGROUPSREQUEST._serialized_start=327
  _MUTATEASSETGROUPSREQUEST._serialized_end=483
  _ASSETGROUPOPERATION._serialized_start=486
  _ASSETGROUPOPERATION._serialized_end=761
  _MUTATEASSETGROUPSRESPONSE._serialized_start=764
  _MUTATEASSETGROUPSRESPONSE._serialized_end=918
  _MUTATEASSETGROUPRESULT._serialized_start=920
  _MUTATEASSETGROUPRESULT._serialized_end=1009
  _ASSETGROUPSERVICE._serialized_start=1012
  _ASSETGROUPSERVICE._serialized_end=1334
# @@protoc_insertion_point(module_scope)