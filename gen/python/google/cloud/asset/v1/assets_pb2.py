# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/asset/v1/assets.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.orgpolicy.v1 import orgpolicy_pb2 as google_dot_cloud_dot_orgpolicy_dot_v1_dot_orgpolicy__pb2
from google.cloud.osconfig.v1 import inventory_pb2 as google_dot_cloud_dot_osconfig_dot_v1_dot_inventory__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.identity.accesscontextmanager.v1 import access_level_pb2 as google_dot_identity_dot_accesscontextmanager_dot_v1_dot_access__level__pb2
from google.identity.accesscontextmanager.v1 import access_policy_pb2 as google_dot_identity_dot_accesscontextmanager_dot_v1_dot_access__policy__pb2
from google.identity.accesscontextmanager.v1 import service_perimeter_pb2 as google_dot_identity_dot_accesscontextmanager_dot_v1_dot_service__perimeter__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import code_pb2 as google_dot_rpc_dot_code__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"google/cloud/asset/v1/assets.proto\x12\x15google.cloud.asset.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a)google/cloud/orgpolicy/v1/orgpolicy.proto\x1a(google/cloud/osconfig/v1/inventory.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a:google/identity/accesscontextmanager/v1/access_level.proto\x1a;google/identity/accesscontextmanager/v1/access_policy.proto\x1a?google/identity/accesscontextmanager/v1/service_perimeter.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x15google/rpc/code.proto\"\xf5\x02\n\rTemporalAsset\x12\x31\n\x06window\x18\x01 \x01(\x0b\x32!.google.cloud.asset.v1.TimeWindow\x12\x0f\n\x07\x64\x65leted\x18\x02 \x01(\x08\x12+\n\x05\x61sset\x18\x03 \x01(\x0b\x32\x1c.google.cloud.asset.v1.Asset\x12O\n\x11prior_asset_state\x18\x04 \x01(\x0e\x32\x34.google.cloud.asset.v1.TemporalAsset.PriorAssetState\x12\x31\n\x0bprior_asset\x18\x05 \x01(\x0b\x32\x1c.google.cloud.asset.v1.Asset\"o\n\x0fPriorAssetState\x12!\n\x1dPRIOR_ASSET_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PRESENT\x10\x01\x12\x0b\n\x07INVALID\x10\x02\x12\x12\n\x0e\x44OES_NOT_EXIST\x10\x03\x12\x0b\n\x07\x44\x45LETED\x10\x04\"j\n\nTimeWindow\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xf3\x05\n\x05\x41sset\x12/\n\x0bupdate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nasset_type\x18\x02 \x01(\t\x12\x31\n\x08resource\x18\x03 \x01(\x0b\x32\x1f.google.cloud.asset.v1.Resource\x12)\n\niam_policy\x18\x04 \x01(\x0b\x32\x15.google.iam.v1.Policy\x12\x35\n\norg_policy\x18\x06 \x03(\x0b\x32!.google.cloud.orgpolicy.v1.Policy\x12N\n\raccess_policy\x18\x07 \x01(\x0b\x32\x35.google.identity.accesscontextmanager.v1.AccessPolicyH\x00\x12L\n\x0c\x61\x63\x63\x65ss_level\x18\x08 \x01(\x0b\x32\x34.google.identity.accesscontextmanager.v1.AccessLevelH\x00\x12V\n\x11service_perimeter\x18\t \x01(\x0b\x32\x39.google.identity.accesscontextmanager.v1.ServicePerimeterH\x00\x12\x39\n\x0cos_inventory\x18\x0c \x01(\x0b\x32#.google.cloud.osconfig.v1.Inventory\x12@\n\x0erelated_assets\x18\r \x01(\x0b\x32$.google.cloud.asset.v1.RelatedAssetsB\x02\x18\x01\x12:\n\rrelated_asset\x18\x0f \x01(\x0b\x32#.google.cloud.asset.v1.RelatedAsset\x12\x11\n\tancestors\x18\n \x03(\t:\'\xea\x41$\n\x1f\x63loudasset.googleapis.com/Asset\x12\x01*B\x17\n\x15\x61\x63\x63\x65ss_context_policy\"\xb2\x01\n\x08Resource\x12\x0f\n\x07version\x18\x01 \x01(\t\x12\x1e\n\x16\x64iscovery_document_uri\x18\x02 \x01(\t\x12\x16\n\x0e\x64iscovery_name\x18\x03 \x01(\t\x12\x14\n\x0cresource_url\x18\x04 \x01(\t\x12\x0e\n\x06parent\x18\x05 \x01(\t\x12%\n\x04\x64\x61ta\x18\x06 \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x10\n\x08location\x18\x08 \x01(\t\"\x98\x01\n\rRelatedAssets\x12N\n\x17relationship_attributes\x18\x01 \x01(\x0b\x32-.google.cloud.asset.v1.RelationshipAttributes\x12\x33\n\x06\x61ssets\x18\x02 \x03(\x0b\x32#.google.cloud.asset.v1.RelatedAsset:\x02\x18\x01\"v\n\x16RelationshipAttributes\x12\x0c\n\x04type\x18\x04 \x01(\t\x12\x1c\n\x14source_resource_type\x18\x01 \x01(\t\x12\x1c\n\x14target_resource_type\x18\x02 \x01(\t\x12\x0e\n\x06\x61\x63tion\x18\x03 \x01(\t:\x02\x18\x01\"\x85\x01\n\x0cRelatedAsset\x12\x33\n\x05\x61sset\x18\x01 \x01(\tB$\xfa\x41!\n\x1f\x63loudasset.googleapis.com/Asset\x12\x12\n\nasset_type\x18\x02 \x01(\t\x12\x11\n\tancestors\x18\x03 \x03(\t\x12\x19\n\x11relationship_type\x18\x04 \x01(\t\"\xb2\x07\n\x14ResourceSearchResult\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nasset_type\x18\x02 \x01(\t\x12\x0f\n\x07project\x18\x03 \x01(\t\x12\x0f\n\x07\x66olders\x18\x11 \x03(\t\x12\x14\n\x0corganization\x18\x12 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x04 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x05 \x01(\t\x12\x10\n\x08location\x18\x06 \x01(\t\x12G\n\x06labels\x18\x07 \x03(\x0b\x32\x37.google.cloud.asset.v1.ResourceSearchResult.LabelsEntry\x12\x14\n\x0cnetwork_tags\x18\x08 \x03(\t\x12\x0f\n\x07kms_key\x18\n \x01(\t\x12/\n\x0b\x63reate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\r\n\x05state\x18\r \x01(\t\x12\x36\n\x15\x61\x64\x64itional_attributes\x18\t \x01(\x0b\x32\x17.google.protobuf.Struct\x12!\n\x19parent_full_resource_name\x18\x13 \x01(\t\x12\x45\n\x13versioned_resources\x18\x10 \x03(\x0b\x32(.google.cloud.asset.v1.VersionedResource\x12\x43\n\x12\x61ttached_resources\x18\x14 \x03(\x0b\x32\'.google.cloud.asset.v1.AttachedResource\x12U\n\rrelationships\x18\x15 \x03(\x0b\x32>.google.cloud.asset.v1.ResourceSearchResult.RelationshipsEntry\x12\x10\n\x08tag_keys\x18\x17 \x03(\t\x12\x12\n\ntag_values\x18\x19 \x03(\t\x12\x15\n\rtag_value_ids\x18\x1a \x03(\t\x12\x19\n\x11parent_asset_type\x18g \x01(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a]\n\x12RelationshipsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x36\n\x05value\x18\x02 \x01(\x0b\x32\'.google.cloud.asset.v1.RelatedResources:\x02\x38\x01\"O\n\x11VersionedResource\x12\x0f\n\x07version\x18\x01 \x01(\t\x12)\n\x08resource\x18\x02 \x01(\x0b\x32\x17.google.protobuf.Struct\"m\n\x10\x41ttachedResource\x12\x12\n\nasset_type\x18\x01 \x01(\t\x12\x45\n\x13versioned_resources\x18\x03 \x03(\x0b\x32(.google.cloud.asset.v1.VersionedResource\"U\n\x10RelatedResources\x12\x41\n\x11related_resources\x18\x01 \x03(\x0b\x32&.google.cloud.asset.v1.RelatedResource\"A\n\x0fRelatedResource\x12\x12\n\nasset_type\x18\x01 \x01(\t\x12\x1a\n\x12\x66ull_resource_name\x18\x02 \x01(\t\"\x8f\x04\n\x15IamPolicySearchResult\x12\x10\n\x08resource\x18\x01 \x01(\t\x12\x12\n\nasset_type\x18\x05 \x01(\t\x12\x0f\n\x07project\x18\x02 \x01(\t\x12\x0f\n\x07\x66olders\x18\x06 \x03(\t\x12\x14\n\x0corganization\x18\x07 \x01(\t\x12%\n\x06policy\x18\x03 \x01(\x0b\x32\x15.google.iam.v1.Policy\x12M\n\x0b\x65xplanation\x18\x04 \x01(\x0b\x32\x38.google.cloud.asset.v1.IamPolicySearchResult.Explanation\x1a\xa1\x02\n\x0b\x45xplanation\x12m\n\x13matched_permissions\x18\x01 \x03(\x0b\x32P.google.cloud.asset.v1.IamPolicySearchResult.Explanation.MatchedPermissionsEntry\x1a\"\n\x0bPermissions\x12\x13\n\x0bpermissions\x18\x01 \x03(\t\x1a\x7f\n\x17MatchedPermissionsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12S\n\x05value\x18\x02 \x01(\x0b\x32\x44.google.cloud.asset.v1.IamPolicySearchResult.Explanation.Permissions:\x02\x38\x01\"G\n\x16IamPolicyAnalysisState\x12\x1e\n\x04\x63ode\x18\x01 \x01(\x0e\x32\x10.google.rpc.Code\x12\r\n\x05\x63\x61use\x18\x02 \x01(\t\"\xc6\x01\n\x13\x43onditionEvaluation\x12T\n\x10\x65valuation_value\x18\x01 \x01(\x0e\x32:.google.cloud.asset.v1.ConditionEvaluation.EvaluationValue\"Y\n\x0f\x45valuationValue\x12 \n\x1c\x45VALUATION_VALUE_UNSPECIFIED\x10\x00\x12\x08\n\x04TRUE\x10\x01\x12\t\n\x05\x46\x41LSE\x10\x02\x12\x0f\n\x0b\x43ONDITIONAL\x10\x03\"\xab\t\n\x17IamPolicyAnalysisResult\x12#\n\x1b\x61ttached_resource_full_name\x18\x01 \x01(\t\x12+\n\x0biam_binding\x18\x02 \x01(\x0b\x32\x16.google.iam.v1.Binding\x12^\n\x14\x61\x63\x63\x65ss_control_lists\x18\x03 \x03(\x0b\x32@.google.cloud.asset.v1.IamPolicyAnalysisResult.AccessControlList\x12R\n\ridentity_list\x18\x04 \x01(\x0b\x32;.google.cloud.asset.v1.IamPolicyAnalysisResult.IdentityList\x12\x16\n\x0e\x66ully_explored\x18\x05 \x01(\x08\x1am\n\x08Resource\x12\x1a\n\x12\x66ull_resource_name\x18\x01 \x01(\t\x12\x45\n\x0e\x61nalysis_state\x18\x02 \x01(\x0b\x32-.google.cloud.asset.v1.IamPolicyAnalysisState\x1a\x85\x01\n\x06\x41\x63\x63\x65ss\x12\x0e\n\x04role\x18\x01 \x01(\tH\x00\x12\x14\n\npermission\x18\x02 \x01(\tH\x00\x12\x45\n\x0e\x61nalysis_state\x18\x03 \x01(\x0b\x32-.google.cloud.asset.v1.IamPolicyAnalysisStateB\x0e\n\x0coneof_access\x1a_\n\x08Identity\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x45\n\x0e\x61nalysis_state\x18\x02 \x01(\x0b\x32-.google.cloud.asset.v1.IamPolicyAnalysisState\x1a\x30\n\x04\x45\x64ge\x12\x13\n\x0bsource_node\x18\x01 \x01(\t\x12\x13\n\x0btarget_node\x18\x02 \x01(\t\x1a\xbf\x02\n\x11\x41\x63\x63\x65ssControlList\x12J\n\tresources\x18\x01 \x03(\x0b\x32\x37.google.cloud.asset.v1.IamPolicyAnalysisResult.Resource\x12G\n\x08\x61\x63\x63\x65sses\x18\x02 \x03(\x0b\x32\x35.google.cloud.asset.v1.IamPolicyAnalysisResult.Access\x12K\n\x0eresource_edges\x18\x03 \x03(\x0b\x32\x33.google.cloud.asset.v1.IamPolicyAnalysisResult.Edge\x12H\n\x14\x63ondition_evaluation\x18\x04 \x01(\x0b\x32*.google.cloud.asset.v1.ConditionEvaluation\x1a\xa5\x01\n\x0cIdentityList\x12K\n\nidentities\x18\x01 \x03(\x0b\x32\x37.google.cloud.asset.v1.IamPolicyAnalysisResult.Identity\x12H\n\x0bgroup_edges\x18\x02 \x03(\x0b\x32\x33.google.cloud.asset.v1.IamPolicyAnalysisResult.EdgeB\x98\x01\n\x19\x63om.google.cloud.asset.v1B\nAssetProtoP\x01Z:google.golang.org/genproto/googleapis/cloud/asset/v1;asset\xf8\x01\x01\xaa\x02\x15Google.Cloud.Asset.V1\xca\x02\x15Google\\Cloud\\Asset\\V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.asset.v1.assets_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.cloud.asset.v1B\nAssetProtoP\001Z:google.golang.org/genproto/googleapis/cloud/asset/v1;asset\370\001\001\252\002\025Google.Cloud.Asset.V1\312\002\025Google\\Cloud\\Asset\\V1'
  _ASSET.fields_by_name['related_assets']._options = None
  _ASSET.fields_by_name['related_assets']._serialized_options = b'\030\001'
  _ASSET._options = None
  _ASSET._serialized_options = b'\352A$\n\037cloudasset.googleapis.com/Asset\022\001*'
  _RELATEDASSETS._options = None
  _RELATEDASSETS._serialized_options = b'\030\001'
  _RELATIONSHIPATTRIBUTES._options = None
  _RELATIONSHIPATTRIBUTES._serialized_options = b'\030\001'
  _RELATEDASSET.fields_by_name['asset']._options = None
  _RELATEDASSET.fields_by_name['asset']._serialized_options = b'\372A!\n\037cloudasset.googleapis.com/Asset'
  _RESOURCESEARCHRESULT_LABELSENTRY._options = None
  _RESOURCESEARCHRESULT_LABELSENTRY._serialized_options = b'8\001'
  _RESOURCESEARCHRESULT_RELATIONSHIPSENTRY._options = None
  _RESOURCESEARCHRESULT_RELATIONSHIPSENTRY._serialized_options = b'8\001'
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._options = None
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._serialized_options = b'8\001'
  _TEMPORALASSET._serialized_start=507
  _TEMPORALASSET._serialized_end=880
  _TEMPORALASSET_PRIORASSETSTATE._serialized_start=769
  _TEMPORALASSET_PRIORASSETSTATE._serialized_end=880
  _TIMEWINDOW._serialized_start=882
  _TIMEWINDOW._serialized_end=988
  _ASSET._serialized_start=991
  _ASSET._serialized_end=1746
  _RESOURCE._serialized_start=1749
  _RESOURCE._serialized_end=1927
  _RELATEDASSETS._serialized_start=1930
  _RELATEDASSETS._serialized_end=2082
  _RELATIONSHIPATTRIBUTES._serialized_start=2084
  _RELATIONSHIPATTRIBUTES._serialized_end=2202
  _RELATEDASSET._serialized_start=2205
  _RELATEDASSET._serialized_end=2338
  _RESOURCESEARCHRESULT._serialized_start=2341
  _RESOURCESEARCHRESULT._serialized_end=3287
  _RESOURCESEARCHRESULT_LABELSENTRY._serialized_start=3147
  _RESOURCESEARCHRESULT_LABELSENTRY._serialized_end=3192
  _RESOURCESEARCHRESULT_RELATIONSHIPSENTRY._serialized_start=3194
  _RESOURCESEARCHRESULT_RELATIONSHIPSENTRY._serialized_end=3287
  _VERSIONEDRESOURCE._serialized_start=3289
  _VERSIONEDRESOURCE._serialized_end=3368
  _ATTACHEDRESOURCE._serialized_start=3370
  _ATTACHEDRESOURCE._serialized_end=3479
  _RELATEDRESOURCES._serialized_start=3481
  _RELATEDRESOURCES._serialized_end=3566
  _RELATEDRESOURCE._serialized_start=3568
  _RELATEDRESOURCE._serialized_end=3633
  _IAMPOLICYSEARCHRESULT._serialized_start=3636
  _IAMPOLICYSEARCHRESULT._serialized_end=4163
  _IAMPOLICYSEARCHRESULT_EXPLANATION._serialized_start=3874
  _IAMPOLICYSEARCHRESULT_EXPLANATION._serialized_end=4163
  _IAMPOLICYSEARCHRESULT_EXPLANATION_PERMISSIONS._serialized_start=4000
  _IAMPOLICYSEARCHRESULT_EXPLANATION_PERMISSIONS._serialized_end=4034
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._serialized_start=4036
  _IAMPOLICYSEARCHRESULT_EXPLANATION_MATCHEDPERMISSIONSENTRY._serialized_end=4163
  _IAMPOLICYANALYSISSTATE._serialized_start=4165
  _IAMPOLICYANALYSISSTATE._serialized_end=4236
  _CONDITIONEVALUATION._serialized_start=4239
  _CONDITIONEVALUATION._serialized_end=4437
  _CONDITIONEVALUATION_EVALUATIONVALUE._serialized_start=4348
  _CONDITIONEVALUATION_EVALUATIONVALUE._serialized_end=4437
  _IAMPOLICYANALYSISRESULT._serialized_start=4440
  _IAMPOLICYANALYSISRESULT._serialized_end=5635
  _IAMPOLICYANALYSISRESULT_RESOURCE._serialized_start=4753
  _IAMPOLICYANALYSISRESULT_RESOURCE._serialized_end=4862
  _IAMPOLICYANALYSISRESULT_ACCESS._serialized_start=4865
  _IAMPOLICYANALYSISRESULT_ACCESS._serialized_end=4998
  _IAMPOLICYANALYSISRESULT_IDENTITY._serialized_start=5000
  _IAMPOLICYANALYSISRESULT_IDENTITY._serialized_end=5095
  _IAMPOLICYANALYSISRESULT_EDGE._serialized_start=5097
  _IAMPOLICYANALYSISRESULT_EDGE._serialized_end=5145
  _IAMPOLICYANALYSISRESULT_ACCESSCONTROLLIST._serialized_start=5148
  _IAMPOLICYANALYSISRESULT_ACCESSCONTROLLIST._serialized_end=5467
  _IAMPOLICYANALYSISRESULT_IDENTITYLIST._serialized_start=5470
  _IAMPOLICYANALYSISRESULT_IDENTITYLIST._serialized_end=5635
# @@protoc_insertion_point(module_scope)
