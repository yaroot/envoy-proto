# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/spanner/v1/commit_response.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/spanner/v1/commit_response.proto\x12\x11google.spanner.v1\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb2\x01\n\x0e\x43ommitResponse\x12\x34\n\x10\x63ommit_timestamp\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x43\n\x0c\x63ommit_stats\x18\x02 \x01(\x0b\x32-.google.spanner.v1.CommitResponse.CommitStats\x1a%\n\x0b\x43ommitStats\x12\x16\n\x0emutation_count\x18\x01 \x01(\x03\x42\xb9\x01\n\x15\x63om.google.spanner.v1B\x13\x43ommitResponseProtoP\x01Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\xaa\x02\x17Google.Cloud.Spanner.V1\xca\x02\x17Google\\Cloud\\Spanner\\V1\xea\x02\x1aGoogle::Cloud::Spanner::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.spanner.v1.commit_response_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.google.spanner.v1B\023CommitResponseProtoP\001Z8google.golang.org/genproto/googleapis/spanner/v1;spanner\252\002\027Google.Cloud.Spanner.V1\312\002\027Google\\Cloud\\Spanner\\V1\352\002\032Google::Cloud::Spanner::V1'
  _COMMITRESPONSE._serialized_start=96
  _COMMITRESPONSE._serialized_end=274
  _COMMITRESPONSE_COMMITSTATS._serialized_start=237
  _COMMITRESPONSE_COMMITSTATS._serialized_end=274
# @@protoc_insertion_point(module_scope)