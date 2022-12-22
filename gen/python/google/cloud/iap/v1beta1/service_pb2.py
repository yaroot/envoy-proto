# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/iap/v1beta1/service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.iam.v1 import iam_policy_pb2 as google_dot_iam_dot_v1_dot_iam__policy__pb2
from google.iam.v1 import policy_pb2 as google_dot_iam_dot_v1_dot_policy__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&google/cloud/iap/v1beta1/service.proto\x12\x18google.cloud.iap.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1egoogle/iam/v1/iam_policy.proto\x1a\x1agoogle/iam/v1/policy.proto2\x80\x04\n\x1eIdentityAwareProxyAdminV1Beta1\x12y\n\x0cSetIamPolicy\x12\".google.iam.v1.SetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\".\x82\xd3\xe4\x93\x02(\"#/v1beta1/{resource=**}:setIamPolicy:\x01*\x12y\n\x0cGetIamPolicy\x12\".google.iam.v1.GetIamPolicyRequest\x1a\x15.google.iam.v1.Policy\".\x82\xd3\xe4\x93\x02(\"#/v1beta1/{resource=**}:getIamPolicy:\x01*\x12\x9f\x01\n\x12TestIamPermissions\x12(.google.iam.v1.TestIamPermissionsRequest\x1a).google.iam.v1.TestIamPermissionsResponse\"4\x82\xd3\xe4\x93\x02.\")/v1beta1/{resource=**}:testIamPermissions:\x01*\x1a\x46\xca\x41\x12iap.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB]\n\x1c\x63om.google.cloud.iap.v1beta1P\x01Z;google.golang.org/genproto/googleapis/cloud/iap/v1beta1;iapb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.iap.v1beta1.service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.iap.v1beta1P\001Z;google.golang.org/genproto/googleapis/cloud/iap/v1beta1;iap'
  _IDENTITYAWAREPROXYADMINV1BETA1._options = None
  _IDENTITYAWAREPROXYADMINV1BETA1._serialized_options = b'\312A\022iap.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _IDENTITYAWAREPROXYADMINV1BETA1.methods_by_name['SetIamPolicy']._options = None
  _IDENTITYAWAREPROXYADMINV1BETA1.methods_by_name['SetIamPolicy']._serialized_options = b'\202\323\344\223\002(\"#/v1beta1/{resource=**}:setIamPolicy:\001*'
  _IDENTITYAWAREPROXYADMINV1BETA1.methods_by_name['GetIamPolicy']._options = None
  _IDENTITYAWAREPROXYADMINV1BETA1.methods_by_name['GetIamPolicy']._serialized_options = b'\202\323\344\223\002(\"#/v1beta1/{resource=**}:getIamPolicy:\001*'
  _IDENTITYAWAREPROXYADMINV1BETA1.methods_by_name['TestIamPermissions']._options = None
  _IDENTITYAWAREPROXYADMINV1BETA1.methods_by_name['TestIamPermissions']._serialized_options = b'\202\323\344\223\002.\")/v1beta1/{resource=**}:testIamPermissions:\001*'
  _IDENTITYAWAREPROXYADMINV1BETA1._serialized_start=184
  _IDENTITYAWAREPROXYADMINV1BETA1._serialized_end=696
# @@protoc_insertion_point(module_scope)