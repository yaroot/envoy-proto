# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datacatalog/v1/timestamps.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/datacatalog/v1/timestamps.proto\x12\x1bgoogle.cloud.datacatalog.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xaa\x01\n\x10SystemTimestamps\x12/\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x34\n\x0b\x65xpire_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x42\xcb\x01\n\x1f\x63om.google.cloud.datacatalog.v1P\x01ZFgoogle.golang.org/genproto/googleapis/cloud/datacatalog/v1;datacatalog\xf8\x01\x01\xaa\x02\x1bGoogle.Cloud.DataCatalog.V1\xca\x02\x1bGoogle\\Cloud\\DataCatalog\\V1\xea\x02\x1eGoogle::Cloud::DataCatalog::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.datacatalog.v1.timestamps_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.datacatalog.v1P\001ZFgoogle.golang.org/genproto/googleapis/cloud/datacatalog/v1;datacatalog\370\001\001\252\002\033Google.Cloud.DataCatalog.V1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Google::Cloud::DataCatalog::V1'
  _SYSTEMTIMESTAMPS.fields_by_name['expire_time']._options = None
  _SYSTEMTIMESTAMPS.fields_by_name['expire_time']._serialized_options = b'\340A\003'
  _SYSTEMTIMESTAMPS._serialized_start=144
  _SYSTEMTIMESTAMPS._serialized_end=314
# @@protoc_insertion_point(module_scope)
