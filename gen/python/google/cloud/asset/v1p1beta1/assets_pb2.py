# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/asset/v1p1beta1/assets.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/cloud/asset/v1p1beta1/assets.proto\x12\x1cgoogle.cloud.asset.v1p1beta1\x1a\x1agoogle/iam/v1/policy.proto\"\xc2\x02\n\x18StandardResourceMetadata\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nasset_type\x18\x02 \x01(\t\x12\x0f\n\x07project\x18\x03 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x04 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\x12\x1d\n\x15\x61\x64\x64itional_attributes\x18\n \x03(\t\x12\x10\n\x08location\x18\x0b \x01(\t\x12R\n\x06labels\x18\x0c \x03(\x0b\x32\x42.google.cloud.asset.v1p1beta1.StandardResourceMetadata.LabelsEntry\x12\x14\n\x0cnetwork_tags\x18\r \x03(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xa3\x03\n\x15IamPolicySearchResult\x12\x10\n\x08resource\x18\x01 \x01(\t\x12\x0f\n\x07project\x18\x03 \x01(\t\x12%\n\x06policy\x18\x04 \x01(\x0b\x32\x15.google.iam.v1.Policy\x12T\n\x0b\x65xplanation\x18\x05 \x01(\x0b\x32?.google.cloud.asset.v1p1beta1.IamPolicySearchResult.Explanation\x1a\xe9\x01\n\x0b\x45xplanation\x12t\n\x13matched_permissions\x18\x01 \x03(\x0b\x32W.google.cloud.asset.v1p1beta1.IamPolicySearchResult.Explanation.MatchedPermissionsEntry\x1a\x64\n\x17MatchedPermissionsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x38\n\x05value\x18\x02 \x01(\x0b\x32).google.cloud.asset.v1p1beta1.Permissions:\x02\x38\x01\"\"\n\x0bPermissions\x12\x13\n\x0bpermissions\x18\x01 \x03(\tB\xb4\x01\n com.google.cloud.asset.v1p1beta1B\nAssetProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/asset/v1p1beta1;asset\xf8\x01\x01\xaa\x02\x1cGoogle.Cloud.Asset.V1P1Beta1\xca\x02\x1cGoogle\\Cloud\\Asset\\V1p1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.asset.v1p1beta1.assets_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.google.cloud.asset.v1p1beta1B\nAssetProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/asset/v1p1beta1;asset\370\001\001\252\002\034Google.Cloud.Asset.V1P1Beta1\312\002\034Google\\Cloud\\Asset\\V1p1beta1'
  _STANDARDRESOURCEMETADATA_LABELSENTRY._options = None
  _STANDARDRESOURCEMETADATA_LABELSENTRY._serialized_options = b'8\001'
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._options = None
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._serialized_options = b'8\001'
  _STANDARDRESOURCEMETADATA._serialized_start=104
  _STANDARDRESOURCEMETADATA._serialized_end=426
  _STANDARDRESOURCEMETADATA_LABELSENTRY._serialized_start=381
  _STANDARDRESOURCEMETADATA_LABELSENTRY._serialized_end=426
  _IAMPOLICYSEARCHRESULT._serialized_start=429
  _IAMPOLICYSEARCHRESULT._serialized_end=848
  _IAMPOLICYSEARCHRESULT_EXPLANATION._serialized_start=615
  _IAMPOLICYSEARCHRESULT_EXPLANATION._serialized_end=848
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._serialized_start=748
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._serialized_end=848
  _PERMISSIONS._serialized_start=850
  _PERMISSIONS._serialized_end=884
# @@protoc_insertion_point(module_scope)
