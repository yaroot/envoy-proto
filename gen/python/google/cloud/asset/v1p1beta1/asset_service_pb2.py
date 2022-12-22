# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/asset/v1p1beta1/asset_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.asset.v1p1beta1 import assets_pb2 as google_dot_cloud_dot_asset_dot_v1p1beta1_dot_assets__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/asset/v1p1beta1/asset_service.proto\x12\x1cgoogle.cloud.asset.v1p1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a)google/cloud/asset/v1p1beta1/assets.proto\"\xa5\x01\n\x19SearchAllResourcesRequest\x12\x12\n\x05scope\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\x05query\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x18\n\x0b\x61sset_types\x18\x03 \x03(\tB\x03\xe0\x41\x01\x12\x16\n\tpage_size\x18\x04 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12\x15\n\x08order_by\x18\n \x01(\tB\x03\xe0\x41\x01\"~\n\x1aSearchAllResourcesResponse\x12G\n\x07results\x18\x01 \x03(\x0b\x32\x36.google.cloud.asset.v1p1beta1.StandardResourceMetadata\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"v\n\x1bSearchAllIamPoliciesRequest\x12\x12\n\x05scope\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x12\n\x05query\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12\x16\n\tpage_size\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x04 \x01(\tB\x03\xe0\x41\x01\"}\n\x1cSearchAllIamPoliciesResponse\x12\x44\n\x07results\x18\x01 \x03(\x0b\x32\x33.google.cloud.asset.v1p1beta1.IamPolicySearchResult\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\x89\x04\n\x0c\x41ssetService\x12\xd5\x01\n\x12SearchAllResources\x12\x37.google.cloud.asset.v1p1beta1.SearchAllResourcesRequest\x1a\x38.google.cloud.asset.v1p1beta1.SearchAllResourcesResponse\"L\x82\xd3\xe4\x93\x02,\x12*/v1p1beta1/{scope=*/*}/resources:searchAll\xda\x41\x17scope,query,asset_types\x12\xd1\x01\n\x14SearchAllIamPolicies\x12\x39.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesRequest\x1a:.google.cloud.asset.v1p1beta1.SearchAllIamPoliciesResponse\"B\x82\xd3\xe4\x93\x02.\x12,/v1p1beta1/{scope=*/*}/iamPolicies:searchAll\xda\x41\x0bscope,query\x1aM\xca\x41\x19\x63loudasset.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xb8\x01\n com.google.cloud.asset.v1p1beta1B\x11\x41ssetServiceProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/asset/v1p1beta1;asset\xaa\x02\x1cGoogle.Cloud.Asset.V1P1Beta1\xca\x02\x1cGoogle\\Cloud\\Asset\\V1p1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.asset.v1p1beta1.asset_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.google.cloud.asset.v1p1beta1B\021AssetServiceProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/asset/v1p1beta1;asset\252\002\034Google.Cloud.Asset.V1P1Beta1\312\002\034Google\\Cloud\\Asset\\V1p1beta1'
  _SEARCHALLRESOURCESREQUEST.fields_by_name['scope']._options = None
  _SEARCHALLRESOURCESREQUEST.fields_by_name['scope']._serialized_options = b'\340A\002'
  _SEARCHALLRESOURCESREQUEST.fields_by_name['query']._options = None
  _SEARCHALLRESOURCESREQUEST.fields_by_name['query']._serialized_options = b'\340A\001'
  _SEARCHALLRESOURCESREQUEST.fields_by_name['asset_types']._options = None
  _SEARCHALLRESOURCESREQUEST.fields_by_name['asset_types']._serialized_options = b'\340A\001'
  _SEARCHALLRESOURCESREQUEST.fields_by_name['page_size']._options = None
  _SEARCHALLRESOURCESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _SEARCHALLRESOURCESREQUEST.fields_by_name['page_token']._options = None
  _SEARCHALLRESOURCESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _SEARCHALLRESOURCESREQUEST.fields_by_name['order_by']._options = None
  _SEARCHALLRESOURCESREQUEST.fields_by_name['order_by']._serialized_options = b'\340A\001'
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['scope']._options = None
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['scope']._serialized_options = b'\340A\002'
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['query']._options = None
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['query']._serialized_options = b'\340A\001'
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['page_size']._options = None
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['page_token']._options = None
  _SEARCHALLIAMPOLICIESREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _ASSETSERVICE._options = None
  _ASSETSERVICE._serialized_options = b'\312A\031cloudasset.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _ASSETSERVICE.methods_by_name['SearchAllResources']._options = None
  _ASSETSERVICE.methods_by_name['SearchAllResources']._serialized_options = b'\202\323\344\223\002,\022*/v1p1beta1/{scope=*/*}/resources:searchAll\332A\027scope,query,asset_types'
  _ASSETSERVICE.methods_by_name['SearchAllIamPolicies']._options = None
  _ASSETSERVICE.methods_by_name['SearchAllIamPolicies']._serialized_options = b'\202\323\344\223\002.\022,/v1p1beta1/{scope=*/*}/iamPolicies:searchAll\332A\013scope,query'
  _SEARCHALLRESOURCESREQUEST._serialized_start=214
  _SEARCHALLRESOURCESREQUEST._serialized_end=379
  _SEARCHALLRESOURCESRESPONSE._serialized_start=381
  _SEARCHALLRESOURCESRESPONSE._serialized_end=507
  _SEARCHALLIAMPOLICIESREQUEST._serialized_start=509
  _SEARCHALLIAMPOLICIESREQUEST._serialized_end=627
  _SEARCHALLIAMPOLICIESRESPONSE._serialized_start=629
  _SEARCHALLIAMPOLICIESRESPONSE._serialized_end=754
  _ASSETSERVICE._serialized_start=757
  _ASSETSERVICE._serialized_end=1278
# @@protoc_insertion_point(module_scope)