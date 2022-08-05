# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datacatalog/v1/policytagmanager.proto
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
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.datacatalog.v1 import timestamps_pb2 as google_dot_cloud_dot_datacatalog_dot_v1_dot_timestamps__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/cloud/datacatalog/v1/policytagmanager.proto\x12\x1bgoogle.cloud.datacatalog.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a,google/cloud/datacatalog/v1/timestamps.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a google/protobuf/field_mask.proto\"\xce\x03\n\x08Taxonomy\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x1d\n\x10policy_tag_count\x18\x04 \x01(\x05\x42\x03\xe0\x41\x03\x12O\n\x13taxonomy_timestamps\x18\x05 \x01(\x0b\x32-.google.cloud.datacatalog.v1.SystemTimestampsB\x03\xe0\x41\x03\x12U\n\x16\x61\x63tivated_policy_types\x18\x06 \x03(\x0e\x32\x30.google.cloud.datacatalog.v1.Taxonomy.PolicyTypeB\x03\xe0\x41\x01\"J\n\nPolicyType\x12\x1b\n\x17POLICY_TYPE_UNSPECIFIED\x10\x00\x12\x1f\n\x1b\x46INE_GRAINED_ACCESS_CONTROL\x10\x01:g\xea\x41\x64\n#datacatalog.googleapis.com/Taxonomy\x12=projects/{project}/locations/{location}/taxonomies/{taxonomy}\"\x8c\x02\n\tPolicyTag\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12\x19\n\x11parent_policy_tag\x18\x04 \x01(\t\x12\x1e\n\x11\x63hild_policy_tags\x18\x05 \x03(\tB\x03\xe0\x41\x03:\x80\x01\xea\x41}\n$datacatalog.googleapis.com/PolicyTag\x12Uprojects/{project}/locations/{location}/taxonomies/{taxonomy}/policyTags/{policy_tag}\"\x8d\x01\n\x15\x43reateTaxonomyRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#datacatalog.googleapis.com/Taxonomy\x12\x37\n\x08taxonomy\x18\x02 \x01(\x0b\x32%.google.cloud.datacatalog.v1.Taxonomy\"R\n\x15\x44\x65leteTaxonomyRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#datacatalog.googleapis.com/Taxonomy\"\x81\x01\n\x15UpdateTaxonomyRequest\x12\x37\n\x08taxonomy\x18\x01 \x01(\x0b\x32%.google.cloud.datacatalog.v1.Taxonomy\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"{\n\x15ListTaxonomiesRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#datacatalog.googleapis.com/Taxonomy\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"l\n\x16ListTaxonomiesResponse\x12\x39\n\ntaxonomies\x18\x01 \x03(\x0b\x32%.google.cloud.datacatalog.v1.Taxonomy\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"O\n\x12GetTaxonomyRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#datacatalog.googleapis.com/Taxonomy\"\x92\x01\n\x16\x43reatePolicyTagRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$datacatalog.googleapis.com/PolicyTag\x12:\n\npolicy_tag\x18\x02 \x01(\x0b\x32&.google.cloud.datacatalog.v1.PolicyTag\"T\n\x16\x44\x65letePolicyTagRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$datacatalog.googleapis.com/PolicyTag\"\x85\x01\n\x16UpdatePolicyTagRequest\x12:\n\npolicy_tag\x18\x01 \x01(\x0b\x32&.google.cloud.datacatalog.v1.PolicyTag\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"|\n\x15ListPolicyTagsRequest\x12<\n\x06parent\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\x12$datacatalog.googleapis.com/PolicyTag\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"n\n\x16ListPolicyTagsResponse\x12;\n\x0bpolicy_tags\x18\x01 \x03(\x0b\x32&.google.cloud.datacatalog.v1.PolicyTag\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"Q\n\x13GetPolicyTagRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$datacatalog.googleapis.com/PolicyTag2\xbb\x15\n\x10PolicyTagManager\x12\xbf\x01\n\x0e\x43reateTaxonomy\x12\x32.google.cloud.datacatalog.v1.CreateTaxonomyRequest\x1a%.google.cloud.datacatalog.v1.Taxonomy\"R\x82\xd3\xe4\x93\x02:\"./v1/{parent=projects/*/locations/*}/taxonomies:\x08taxonomy\xda\x41\x0fparent,taxonomy\x12\x9b\x01\n\x0e\x44\x65leteTaxonomy\x12\x32.google.cloud.datacatalog.v1.DeleteTaxonomyRequest\x1a\x16.google.protobuf.Empty\"=\x82\xd3\xe4\x93\x02\x30*./v1/{name=projects/*/locations/*/taxonomies/*}\xda\x41\x04name\x12\xc1\x01\n\x0eUpdateTaxonomy\x12\x32.google.cloud.datacatalog.v1.UpdateTaxonomyRequest\x1a%.google.cloud.datacatalog.v1.Taxonomy\"T\x82\xd3\xe4\x93\x02\x43\x32\x37/v1/{taxonomy.name=projects/*/locations/*/taxonomies/*}:\x08taxonomy\xda\x41\x08taxonomy\x12\xba\x01\n\x0eListTaxonomies\x12\x32.google.cloud.datacatalog.v1.ListTaxonomiesRequest\x1a\x33.google.cloud.datacatalog.v1.ListTaxonomiesResponse\"?\x82\xd3\xe4\x93\x02\x30\x12./v1/{parent=projects/*/locations/*}/taxonomies\xda\x41\x06parent\x12\xa4\x01\n\x0bGetTaxonomy\x12/.google.cloud.datacatalog.v1.GetTaxonomyRequest\x1a%.google.cloud.datacatalog.v1.Taxonomy\"=\x82\xd3\xe4\x93\x02\x30\x12./v1/{name=projects/*/locations/*/taxonomies/*}\xda\x41\x04name\x12\xd3\x01\n\x0f\x43reatePolicyTag\x12\x33.google.cloud.datacatalog.v1.CreatePolicyTagRequest\x1a&.google.cloud.datacatalog.v1.PolicyTag\"c\x82\xd3\xe4\x93\x02I\";/v1/{parent=projects/*/locations/*/taxonomies/*}/policyTags:\npolicy_tag\xda\x41\x11parent,policy_tag\x12\xaa\x01\n\x0f\x44\x65letePolicyTag\x12\x33.google.cloud.datacatalog.v1.DeletePolicyTagRequest\x1a\x16.google.protobuf.Empty\"J\x82\xd3\xe4\x93\x02=*;/v1/{name=projects/*/locations/*/taxonomies/*/policyTags/*}\xda\x41\x04name\x12\xd7\x01\n\x0fUpdatePolicyTag\x12\x33.google.cloud.datacatalog.v1.UpdatePolicyTagRequest\x1a&.google.cloud.datacatalog.v1.PolicyTag\"g\x82\xd3\xe4\x93\x02T2F/v1/{policy_tag.name=projects/*/locations/*/taxonomies/*/policyTags/*}:\npolicy_tag\xda\x41\npolicy_tag\x12\xc7\x01\n\x0eListPolicyTags\x12\x32.google.cloud.datacatalog.v1.ListPolicyTagsRequest\x1a\x33.google.cloud.datacatalog.v1.ListPolicyTagsResponse\"L\x82\xd3\xe4\x93\x02=\x12;/v1/{parent=projects/*/locations/*/taxonomies/*}/policyTags\xda\x41\x06parent\x12\xb4\x01\n\x0cGetPolicyTag\x12\x30.google.cloud.datacatalog.v1.GetPolicyTagRequest\x1a&.google.cloud.datacatalog.v1.PolicyTag\"J\x82\xd3\xe4\x93\x02=\x12;/v1/{name=projects/*/locations/*/taxonomies/*/policyTags/*}\xda\x41\x04name\x12\xea\x01\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\x9e\x01\x82\xd3\xe4\x93\x02\x97\x01\"?/v1/{resource=projects/*/locations/*/taxonomies/*}:getIamPolicy:\x01*ZQ\"L/v1/{resource=projects/*/locations/*/taxonomies/*/policyTags/*}:getIamPolicy:\x01*\x12\xea\x01\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\"\x9e\x01\x82\xd3\xe4\x93\x02\x97\x01\"?/v1/{resource=projects/*/locations/*/taxonomies/*}:setIamPolicy:\x01*ZQ\"L/v1/{resource=projects/*/locations/*/taxonomies/*/policyTags/*}:setIamPolicy:\x01*\x12\x96\x02\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"\xaa\x01\x82\xd3\xe4\x93\x02\xa3\x01\"E/v1/{resource=projects/*/locations/*/taxonomies/*}:testIamPermissions:\x01*ZW\"R/v1/{resource=projects/*/locations/*/taxonomies/*/policyTags/*}:testIamPermissions:\x01*\x1aN\xca\x41\x1a\x64\x61tacatalog.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xe2\x01\n\x1f\x63om.google.cloud.datacatalog.v1B\x15PolicyTagManagerProtoP\x01ZFgoogle.golang.org/genproto/googleapis/cloud/datacatalog/v1;datacatalog\xf8\x01\x01\xaa\x02\x1bGoogle.Cloud.DataCatalog.V1\xca\x02\x1bGoogle\\Cloud\\DataCatalog\\V1\xea\x02\x1eGoogle::Cloud::DataCatalog::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.datacatalog.v1.policytagmanager_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.datacatalog.v1B\025PolicyTagManagerProtoP\001ZFgoogle.golang.org/genproto/googleapis/cloud/datacatalog/v1;datacatalog\370\001\001\252\002\033Google.Cloud.DataCatalog.V1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Google::Cloud::DataCatalog::V1'
  _TAXONOMY.fields_by_name['name']._options = None
  _TAXONOMY.fields_by_name['name']._serialized_options = b'\340A\003'
  _TAXONOMY.fields_by_name['display_name']._options = None
  _TAXONOMY.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _TAXONOMY.fields_by_name['description']._options = None
  _TAXONOMY.fields_by_name['description']._serialized_options = b'\340A\001'
  _TAXONOMY.fields_by_name['policy_tag_count']._options = None
  _TAXONOMY.fields_by_name['policy_tag_count']._serialized_options = b'\340A\003'
  _TAXONOMY.fields_by_name['taxonomy_timestamps']._options = None
  _TAXONOMY.fields_by_name['taxonomy_timestamps']._serialized_options = b'\340A\003'
  _TAXONOMY.fields_by_name['activated_policy_types']._options = None
  _TAXONOMY.fields_by_name['activated_policy_types']._serialized_options = b'\340A\001'
  _TAXONOMY._options = None
  _TAXONOMY._serialized_options = b'\352Ad\n#datacatalog.googleapis.com/Taxonomy\022=projects/{project}/locations/{location}/taxonomies/{taxonomy}'
  _POLICYTAG.fields_by_name['name']._options = None
  _POLICYTAG.fields_by_name['name']._serialized_options = b'\340A\003'
  _POLICYTAG.fields_by_name['display_name']._options = None
  _POLICYTAG.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _POLICYTAG.fields_by_name['child_policy_tags']._options = None
  _POLICYTAG.fields_by_name['child_policy_tags']._serialized_options = b'\340A\003'
  _POLICYTAG._options = None
  _POLICYTAG._serialized_options = b'\352A}\n$datacatalog.googleapis.com/PolicyTag\022Uprojects/{project}/locations/{location}/taxonomies/{taxonomy}/policyTags/{policy_tag}'
  _CREATETAXONOMYREQUEST.fields_by_name['parent']._options = None
  _CREATETAXONOMYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#datacatalog.googleapis.com/Taxonomy'
  _DELETETAXONOMYREQUEST.fields_by_name['name']._options = None
  _DELETETAXONOMYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#datacatalog.googleapis.com/Taxonomy'
  _LISTTAXONOMIESREQUEST.fields_by_name['parent']._options = None
  _LISTTAXONOMIESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#datacatalog.googleapis.com/Taxonomy'
  _GETTAXONOMYREQUEST.fields_by_name['name']._options = None
  _GETTAXONOMYREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#datacatalog.googleapis.com/Taxonomy'
  _CREATEPOLICYTAGREQUEST.fields_by_name['parent']._options = None
  _CREATEPOLICYTAGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$datacatalog.googleapis.com/PolicyTag'
  _DELETEPOLICYTAGREQUEST.fields_by_name['name']._options = None
  _DELETEPOLICYTAGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$datacatalog.googleapis.com/PolicyTag'
  _LISTPOLICYTAGSREQUEST.fields_by_name['parent']._options = None
  _LISTPOLICYTAGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A&\022$datacatalog.googleapis.com/PolicyTag'
  _GETPOLICYTAGREQUEST.fields_by_name['name']._options = None
  _GETPOLICYTAGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$datacatalog.googleapis.com/PolicyTag'
  _POLICYTAGMANAGER._options = None
  _POLICYTAGMANAGER._serialized_options = b'\312A\032datacatalog.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _POLICYTAGMANAGER.methods_by_name['CreateTaxonomy']._options = None
  _POLICYTAGMANAGER.methods_by_name['CreateTaxonomy']._serialized_options = b'\202\323\344\223\002:\"./v1/{parent=projects/*/locations/*}/taxonomies:\010taxonomy\332A\017parent,taxonomy'
  _POLICYTAGMANAGER.methods_by_name['DeleteTaxonomy']._options = None
  _POLICYTAGMANAGER.methods_by_name['DeleteTaxonomy']._serialized_options = b'\202\323\344\223\0020*./v1/{name=projects/*/locations/*/taxonomies/*}\332A\004name'
  _POLICYTAGMANAGER.methods_by_name['UpdateTaxonomy']._options = None
  _POLICYTAGMANAGER.methods_by_name['UpdateTaxonomy']._serialized_options = b'\202\323\344\223\002C27/v1/{taxonomy.name=projects/*/locations/*/taxonomies/*}:\010taxonomy\332A\010taxonomy'
  _POLICYTAGMANAGER.methods_by_name['ListTaxonomies']._options = None
  _POLICYTAGMANAGER.methods_by_name['ListTaxonomies']._serialized_options = b'\202\323\344\223\0020\022./v1/{parent=projects/*/locations/*}/taxonomies\332A\006parent'
  _POLICYTAGMANAGER.methods_by_name['GetTaxonomy']._options = None
  _POLICYTAGMANAGER.methods_by_name['GetTaxonomy']._serialized_options = b'\202\323\344\223\0020\022./v1/{name=projects/*/locations/*/taxonomies/*}\332A\004name'
  _POLICYTAGMANAGER.methods_by_name['CreatePolicyTag']._options = None
  _POLICYTAGMANAGER.methods_by_name['CreatePolicyTag']._serialized_options = b'\202\323\344\223\002I\";/v1/{parent=projects/*/locations/*/taxonomies/*}/policyTags:\npolicy_tag\332A\021parent,policy_tag'
  _POLICYTAGMANAGER.methods_by_name['DeletePolicyTag']._options = None
  _POLICYTAGMANAGER.methods_by_name['DeletePolicyTag']._serialized_options = b'\202\323\344\223\002=*;/v1/{name=projects/*/locations/*/taxonomies/*/policyTags/*}\332A\004name'
  _POLICYTAGMANAGER.methods_by_name['UpdatePolicyTag']._options = None
  _POLICYTAGMANAGER.methods_by_name['UpdatePolicyTag']._serialized_options = b'\202\323\344\223\002T2F/v1/{policy_tag.name=projects/*/locations/*/taxonomies/*/policyTags/*}:\npolicy_tag\332A\npolicy_tag'
  _POLICYTAGMANAGER.methods_by_name['ListPolicyTags']._options = None
  _POLICYTAGMANAGER.methods_by_name['ListPolicyTags']._serialized_options = b'\202\323\344\223\002=\022;/v1/{parent=projects/*/locations/*/taxonomies/*}/policyTags\332A\006parent'
  _POLICYTAGMANAGER.methods_by_name['GetPolicyTag']._options = None
  _POLICYTAGMANAGER.methods_by_name['GetPolicyTag']._serialized_options = b'\202\323\344\223\002=\022;/v1/{name=projects/*/locations/*/taxonomies/*/policyTags/*}\332A\004name'
  _POLICYTAGMANAGER.methods_by_name['GetIamPolicy']._options = None
  _POLICYTAGMANAGER.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002\227\001\"?/v1/{resource=projects/*/locations/*/taxonomies/*}:getIamPolicy:\001*ZQ\"L/v1/{resource=projects/*/locations/*/taxonomies/*/policyTags/*}:getIamPolicy:\001*'
  _POLICYTAGMANAGER.methods_by_name['SetIamPolicy']._options = None
  _POLICYTAGMANAGER.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002\227\001\"?/v1/{resource=projects/*/locations/*/taxonomies/*}:setIamPolicy:\001*ZQ\"L/v1/{resource=projects/*/locations/*/taxonomies/*/policyTags/*}:setIamPolicy:\001*'
  _POLICYTAGMANAGER.methods_by_name['TestIamPermissions']._options = None
  _POLICYTAGMANAGER.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002\243\001\"E/v1/{resource=projects/*/locations/*/taxonomies/*}:testIamPermissions:\001*ZW\"R/v1/{resource=projects/*/locations/*/taxonomies/*/policyTags/*}:testIamPermissions:\001*'
  _TAXONOMY._serialized_start=368
  _TAXONOMY._serialized_end=830
  _TAXONOMY_POLICYTYPE._serialized_start=651
  _TAXONOMY_POLICYTYPE._serialized_end=725
  _POLICYTAG._serialized_start=833
  _POLICYTAG._serialized_end=1101
  _CREATETAXONOMYREQUEST._serialized_start=1104
  _CREATETAXONOMYREQUEST._serialized_end=1245
  _DELETETAXONOMYREQUEST._serialized_start=1247
  _DELETETAXONOMYREQUEST._serialized_end=1329
  _UPDATETAXONOMYREQUEST._serialized_start=1332
  _UPDATETAXONOMYREQUEST._serialized_end=1461
  _LISTTAXONOMIESREQUEST._serialized_start=1463
  _LISTTAXONOMIESREQUEST._serialized_end=1586
  _LISTTAXONOMIESRESPONSE._serialized_start=1588
  _LISTTAXONOMIESRESPONSE._serialized_end=1696
  _GETTAXONOMYREQUEST._serialized_start=1698
  _GETTAXONOMYREQUEST._serialized_end=1777
  _CREATEPOLICYTAGREQUEST._serialized_start=1780
  _CREATEPOLICYTAGREQUEST._serialized_end=1926
  _DELETEPOLICYTAGREQUEST._serialized_start=1928
  _DELETEPOLICYTAGREQUEST._serialized_end=2012
  _UPDATEPOLICYTAGREQUEST._serialized_start=2015
  _UPDATEPOLICYTAGREQUEST._serialized_end=2148
  _LISTPOLICYTAGSREQUEST._serialized_start=2150
  _LISTPOLICYTAGSREQUEST._serialized_end=2274
  _LISTPOLICYTAGSRESPONSE._serialized_start=2276
  _LISTPOLICYTAGSRESPONSE._serialized_end=2386
  _GETPOLICYTAGREQUEST._serialized_start=2388
  _GETPOLICYTAGREQUEST._serialized_end=2469
  _POLICYTAGMANAGER._serialized_start=2472
  _POLICYTAGMANAGER._serialized_end=5219
# @@protoc_insertion_point(module_scope)
