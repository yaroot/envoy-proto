# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/run_asset_discovery_response.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nFgoogle/cloud/securitycenter/v1beta1/run_asset_discovery_response.proto\x12#google.cloud.securitycenter.v1beta1\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/api/annotations.proto\"\xec\x01\n\x19RunAssetDiscoveryResponse\x12S\n\x05state\x18\x01 \x01(\x0e\x32\x44.google.cloud.securitycenter.v1beta1.RunAssetDiscoveryResponse.State\x12+\n\x08\x64uration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"M\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tCOMPLETED\x10\x01\x12\x0e\n\nSUPERSEDED\x10\x02\x12\x0e\n\nTERMINATED\x10\x03\x42~\n\'com.google.cloud.securitycenter.v1beta1P\x01ZQgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1beta1;securitycenterb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.securitycenter.v1beta1.run_asset_discovery_response_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.google.cloud.securitycenter.v1beta1P\001ZQgoogle.golang.org/genproto/googleapis/cloud/securitycenter/v1beta1;securitycenter'
  _RUNASSETDISCOVERYRESPONSE._serialized_start=174
  _RUNASSETDISCOVERYRESPONSE._serialized_end=410
  _RUNASSETDISCOVERYRESPONSE_STATE._serialized_start=333
  _RUNASSETDISCOVERYRESPONSE_STATE._serialized_end=410
# @@protoc_insertion_point(module_scope)
