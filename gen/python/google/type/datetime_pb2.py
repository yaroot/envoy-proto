# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/type/datetime.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1agoogle/type/datetime.proto\x12\x0bgoogle.type\x1a\x1egoogle/protobuf/duration.proto\"\xe0\x01\n\x08\x44\x61teTime\x12\x0c\n\x04year\x18\x01 \x01(\x05\x12\r\n\x05month\x18\x02 \x01(\x05\x12\x0b\n\x03\x64\x61y\x18\x03 \x01(\x05\x12\r\n\x05hours\x18\x04 \x01(\x05\x12\x0f\n\x07minutes\x18\x05 \x01(\x05\x12\x0f\n\x07seconds\x18\x06 \x01(\x05\x12\r\n\x05nanos\x18\x07 \x01(\x05\x12/\n\nutc_offset\x18\x08 \x01(\x0b\x32\x19.google.protobuf.DurationH\x00\x12*\n\ttime_zone\x18\t \x01(\x0b\x32\x15.google.type.TimeZoneH\x00\x42\r\n\x0btime_offset\"\'\n\x08TimeZone\x12\n\n\x02id\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\tBi\n\x0f\x63om.google.typeB\rDateTimeProtoP\x01Z<google.golang.org/genproto/googleapis/type/datetime;datetime\xf8\x01\x01\xa2\x02\x03GTPb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.type.datetime_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\017com.google.typeB\rDateTimeProtoP\001Z<google.golang.org/genproto/googleapis/type/datetime;datetime\370\001\001\242\002\003GTP'
  _DATETIME._serialized_start=76
  _DATETIME._serialized_end=300
  _TIMEZONE._serialized_start=302
  _TIMEZONE._serialized_end=341
# @@protoc_insertion_point(module_scope)
