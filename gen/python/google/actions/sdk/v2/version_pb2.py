# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/actions/sdk/v2/version.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/actions/sdk/v2/version.proto\x12\x15google.actions.sdk.v2\x1a\x19google/api/resource.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x99\x04\n\x07Version\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x42\n\rversion_state\x18\x02 \x01(\x0b\x32+.google.actions.sdk.v2.Version.VersionState\x12\x0f\n\x07\x63reator\x18\x03 \x01(\t\x12/\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x1a\xad\x02\n\x0cVersionState\x12@\n\x05state\x18\x01 \x01(\x0e\x32\x31.google.actions.sdk.v2.Version.VersionState.State\x12\x0f\n\x07message\x18\x02 \x01(\t\"\xc9\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x18\n\x14\x43REATION_IN_PROGRESS\x10\x01\x12\x13\n\x0f\x43REATION_FAILED\x10\x02\x12\x0b\n\x07\x43REATED\x10\x03\x12\x16\n\x12REVIEW_IN_PROGRESS\x10\x04\x12\x0c\n\x08\x41PPROVED\x10\x05\x12\x1a\n\x16\x43ONDITIONALLY_APPROVED\x10\x06\x12\n\n\x06\x44\x45NIED\x10\x07\x12\x12\n\x0eUNDER_TAKEDOWN\x10\x08\x12\x0b\n\x07\x44\x45LETED\x10\t:J\xea\x41G\n\x1e\x61\x63tions.googleapis.com/Version\x12%projects/{project}/versions/{version}Be\n\x19\x63om.google.actions.sdk.v2B\x0cVersionProtoP\x01Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdkb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.actions.sdk.v2.version_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.actions.sdk.v2B\014VersionProtoP\001Z8google.golang.org/genproto/googleapis/actions/sdk/v2;sdk'
  _VERSION._options = None
  _VERSION._serialized_options = b'\352AG\n\036actions.googleapis.com/Version\022%projects/{project}/versions/{version}'
  _VERSION._serialized_start=123
  _VERSION._serialized_end=660
  _VERSION_VERSIONSTATE._serialized_start=283
  _VERSION_VERSIONSTATE._serialized_end=584
  _VERSION_VERSIONSTATE_STATE._serialized_start=383
  _VERSION_VERSIONSTATE_STATE._serialized_end=584
# @@protoc_insertion_point(module_scope)
