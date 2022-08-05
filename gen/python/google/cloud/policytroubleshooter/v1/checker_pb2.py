# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/policytroubleshooter/v1/checker.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.policytroubleshooter.v1 import explanations_pb2 as google_dot_cloud_dot_policytroubleshooter_dot_v1_dot_explanations__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2

from google.cloud.policytroubleshooter.v1.explanations_pb2 import *

DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/cloud/policytroubleshooter/v1/checker.proto\x12$google.cloud.policytroubleshooter.v1\x1a\x37google/cloud/policytroubleshooter/v1/explanations.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\"g\n\x1cTroubleshootIamPolicyRequest\x12G\n\x0c\x61\x63\x63\x65ss_tuple\x18\x01 \x01(\x0b\x32\x31.google.cloud.policytroubleshooter.v1.AccessTuple\"\xb5\x01\n\x1dTroubleshootIamPolicyResponse\x12\x41\n\x06\x61\x63\x63\x65ss\x18\x01 \x01(\x0e\x32\x31.google.cloud.policytroubleshooter.v1.AccessState\x12Q\n\x12\x65xplained_policies\x18\x02 \x03(\x0b\x32\x35.google.cloud.policytroubleshooter.v1.ExplainedPolicy2\xa9\x02\n\nIamChecker\x12\xc1\x01\n\x15TroubleshootIamPolicy\x12\x42.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyRequest\x1a\x43.google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyResponse\"\x1f\x82\xd3\xe4\x93\x02\x19\"\x14/v1/iam:troubleshoot:\x01*\x1aW\xca\x41#policytroubleshooter.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x92\x02\n(com.google.cloud.policytroubleshooter.v1B\x0fIAMCheckerProtoP\x01ZXgoogle.golang.org/genproto/googleapis/cloud/policytroubleshooter/v1;policytroubleshooter\xf8\x01\x01\xaa\x02$Google.Cloud.PolicyTroubleshooter.V1\xca\x02$Google\\Cloud\\PolicyTroubleshooter\\V1\xea\x02\'Google::Cloud::PolicyTroubleshooter::V1P\x00\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.policytroubleshooter.v1.checker_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n(com.google.cloud.policytroubleshooter.v1B\017IAMCheckerProtoP\001ZXgoogle.golang.org/genproto/googleapis/cloud/policytroubleshooter/v1;policytroubleshooter\370\001\001\252\002$Google.Cloud.PolicyTroubleshooter.V1\312\002$Google\\Cloud\\PolicyTroubleshooter\\V1\352\002\'Google::Cloud::PolicyTroubleshooter::V1'
  _IAMCHECKER._options = None
  _IAMCHECKER._serialized_options = b'\312A#policytroubleshooter.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _IAMCHECKER.methods_by_name['TroubleshootIamPolicy']._options = None
  _IAMCHECKER.methods_by_name['TroubleshootIamPolicy']._serialized_options = b'\202\323\344\223\002\031\"\024/v1/iam:troubleshoot:\001*'
  _TROUBLESHOOTIAMPOLICYREQUEST._serialized_start=204
  _TROUBLESHOOTIAMPOLICYREQUEST._serialized_end=307
  _TROUBLESHOOTIAMPOLICYRESPONSE._serialized_start=310
  _TROUBLESHOOTIAMPOLICYRESPONSE._serialized_end=491
  _IAMCHECKER._serialized_start=494
  _IAMCHECKER._serialized_end=791
# @@protoc_insertion_point(module_scope)
