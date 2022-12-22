# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/common_resources.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/cloud/common_resources.proto\x12\x0cgoogle.cloud\x1a\x19google/api/resource.protoB\xf9\x02\xea\x41\x41\n+cloudresourcemanager.googleapis.com/Project\x12\x12projects/{project}\xea\x41P\n0cloudresourcemanager.googleapis.com/Organization\x12\x1corganizations/{organization}\xea\x41>\n*cloudresourcemanager.googleapis.com/Folder\x12\x10\x66olders/{folder}\xea\x41O\n*cloudbilling.googleapis.com/BillingAccount\x12!billingAccounts/{billing_account}\xea\x41L\n!locations.googleapis.com/Location\x12\'projects/{project}/locations/{location}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.common_resources_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\352AA\n+cloudresourcemanager.googleapis.com/Project\022\022projects/{project}\352AP\n0cloudresourcemanager.googleapis.com/Organization\022\034organizations/{organization}\352A>\n*cloudresourcemanager.googleapis.com/Folder\022\020folders/{folder}\352AO\n*cloudbilling.googleapis.com/BillingAccount\022!billingAccounts/{billing_account}\352AL\n!locations.googleapis.com/Location\022\'projects/{project}/locations/{location}'
# @@protoc_insertion_point(module_scope)