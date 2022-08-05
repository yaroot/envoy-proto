# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/ads/googleads/v11/services/asset_group_signal_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.ads.googleads.v11.enums import response_content_type_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_enums_dot_response__content__type__pb2
from google.ads.googleads.v11.resources import asset_group_signal_pb2 as google_dot_ads_dot_googleads_dot_v11_dot_resources_dot_asset__group__signal__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nBgoogle/ads/googleads/v11/services/asset_group_signal_service.proto\x12!google.ads.googleads.v11.services\x1a:google/ads/googleads/v11/enums/response_content_type.proto\x1a;google/ads/googleads/v11/resources/asset_group_signal.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x17google/rpc/status.proto\"\xad\x02\n\x1eMutateAssetGroupSignalsRequest\x12\x18\n\x0b\x63ustomer_id\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12U\n\noperations\x18\x02 \x03(\x0b\x32<.google.ads.googleads.v11.services.AssetGroupSignalOperationB\x03\xe0\x41\x02\x12\x17\n\x0fpartial_failure\x18\x03 \x01(\x08\x12\x15\n\rvalidate_only\x18\x04 \x01(\x08\x12j\n\x15response_content_type\x18\x05 \x01(\x0e\x32K.google.ads.googleads.v11.enums.ResponseContentTypeEnum.ResponseContentType\"\xb2\x01\n\x19\x41ssetGroupSignalOperation\x12\x46\n\x06\x63reate\x18\x01 \x01(\x0b\x32\x34.google.ads.googleads.v11.resources.AssetGroupSignalH\x00\x12@\n\x06remove\x18\x02 \x01(\tB.\xfa\x41+\n)googleads.googleapis.com/AssetGroupSignalH\x00\x42\x0b\n\toperation\"\xa6\x01\n\x1fMutateAssetGroupSignalsResponse\x12P\n\x07results\x18\x01 \x03(\x0b\x32?.google.ads.googleads.v11.services.MutateAssetGroupSignalResult\x12\x31\n\x15partial_failure_error\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\"\xb7\x01\n\x1cMutateAssetGroupSignalResult\x12\x45\n\rresource_name\x18\x01 \x01(\tB.\xfa\x41+\n)googleads.googleapis.com/AssetGroupSignal\x12P\n\x12\x61sset_group_signal\x18\x02 \x01(\x0b\x32\x34.google.ads.googleads.v11.resources.AssetGroupSignal2\xe0\x02\n\x17\x41ssetGroupSignalService\x12\xfd\x01\n\x17MutateAssetGroupSignals\x12\x41.google.ads.googleads.v11.services.MutateAssetGroupSignalsRequest\x1a\x42.google.ads.googleads.v11.services.MutateAssetGroupSignalsResponse\"[\x82\xd3\xe4\x93\x02<\"7/v11/customers/{customer_id=*}/assetGroupSignals:mutate:\x01*\xda\x41\x16\x63ustomer_id,operations\x1a\x45\xca\x41\x18googleads.googleapis.com\xd2\x41\'https://www.googleapis.com/auth/adwordsB\x88\x02\n%com.google.ads.googleads.v11.servicesB\x1c\x41ssetGroupSignalServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\xa2\x02\x03GAA\xaa\x02!Google.Ads.GoogleAds.V11.Services\xca\x02!Google\\Ads\\GoogleAds\\V11\\Services\xea\x02%Google::Ads::GoogleAds::V11::Servicesb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.ads.googleads.v11.services.asset_group_signal_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.ads.googleads.v11.servicesB\034AssetGroupSignalServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/ads/googleads/v11/services;services\242\002\003GAA\252\002!Google.Ads.GoogleAds.V11.Services\312\002!Google\\Ads\\GoogleAds\\V11\\Services\352\002%Google::Ads::GoogleAds::V11::Services'
  _MUTATEASSETGROUPSIGNALSREQUEST.fields_by_name['customer_id']._options = None
  _MUTATEASSETGROUPSIGNALSREQUEST.fields_by_name['customer_id']._serialized_options = b'\340A\002'
  _MUTATEASSETGROUPSIGNALSREQUEST.fields_by_name['operations']._options = None
  _MUTATEASSETGROUPSIGNALSREQUEST.fields_by_name['operations']._serialized_options = b'\340A\002'
  _ASSETGROUPSIGNALOPERATION.fields_by_name['remove']._options = None
  _ASSETGROUPSIGNALOPERATION.fields_by_name['remove']._serialized_options = b'\372A+\n)googleads.googleapis.com/AssetGroupSignal'
  _MUTATEASSETGROUPSIGNALRESULT.fields_by_name['resource_name']._options = None
  _MUTATEASSETGROUPSIGNALRESULT.fields_by_name['resource_name']._serialized_options = b'\372A+\n)googleads.googleapis.com/AssetGroupSignal'
  _ASSETGROUPSIGNALSERVICE._options = None
  _ASSETGROUPSIGNALSERVICE._serialized_options = b'\312A\030googleads.googleapis.com\322A\'https://www.googleapis.com/auth/adwords'
  _ASSETGROUPSIGNALSERVICE.methods_by_name['MutateAssetGroupSignals']._options = None
  _ASSETGROUPSIGNALSERVICE.methods_by_name['MutateAssetGroupSignals']._serialized_options = b'\202\323\344\223\002<\"7/v11/customers/{customer_id=*}/assetGroupSignals:mutate:\001*\332A\026customer_id,operations'
  _MUTATEASSETGROUPSIGNALSREQUEST._serialized_start=367
  _MUTATEASSETGROUPSIGNALSREQUEST._serialized_end=668
  _ASSETGROUPSIGNALOPERATION._serialized_start=671
  _ASSETGROUPSIGNALOPERATION._serialized_end=849
  _MUTATEASSETGROUPSIGNALSRESPONSE._serialized_start=852
  _MUTATEASSETGROUPSIGNALSRESPONSE._serialized_end=1018
  _MUTATEASSETGROUPSIGNALRESULT._serialized_start=1021
  _MUTATEASSETGROUPSIGNALRESULT._serialized_end=1204
  _ASSETGROUPSIGNALSERVICE._serialized_start=1207
  _ASSETGROUPSIGNALSERVICE._serialized_end=1559
# @@protoc_insertion_point(module_scope)
