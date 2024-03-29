# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/v1/entity.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n google/datastore/v1/entity.proto\x12\x13google.datastore.v1\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x18google/type/latlng.proto\"L\n\x0bPartitionId\x12\x12\n\nproject_id\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x61tabase_id\x18\x03 \x01(\t\x12\x14\n\x0cnamespace_id\x18\x04 \x01(\t\"\xb7\x01\n\x03Key\x12\x36\n\x0cpartition_id\x18\x01 \x01(\x0b\x32 .google.datastore.v1.PartitionId\x12\x32\n\x04path\x18\x02 \x03(\x0b\x32$.google.datastore.v1.Key.PathElement\x1a\x44\n\x0bPathElement\x12\x0c\n\x04kind\x18\x01 \x01(\t\x12\x0c\n\x02id\x18\x02 \x01(\x03H\x00\x12\x0e\n\x04name\x18\x03 \x01(\tH\x00\x42\t\n\x07id_type\"8\n\nArrayValue\x12*\n\x06values\x18\x01 \x03(\x0b\x32\x1a.google.datastore.v1.Value\"\xf1\x03\n\x05Value\x12\x30\n\nnull_value\x18\x0b \x01(\x0e\x32\x1a.google.protobuf.NullValueH\x00\x12\x17\n\rboolean_value\x18\x01 \x01(\x08H\x00\x12\x17\n\rinteger_value\x18\x02 \x01(\x03H\x00\x12\x16\n\x0c\x64ouble_value\x18\x03 \x01(\x01H\x00\x12\x35\n\x0ftimestamp_value\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x12-\n\tkey_value\x18\x05 \x01(\x0b\x32\x18.google.datastore.v1.KeyH\x00\x12\x16\n\x0cstring_value\x18\x11 \x01(\tH\x00\x12\x14\n\nblob_value\x18\x12 \x01(\x0cH\x00\x12.\n\x0fgeo_point_value\x18\x08 \x01(\x0b\x32\x13.google.type.LatLngH\x00\x12\x33\n\x0c\x65ntity_value\x18\x06 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12\x36\n\x0b\x61rray_value\x18\t \x01(\x0b\x32\x1f.google.datastore.v1.ArrayValueH\x00\x12\x0f\n\x07meaning\x18\x0e \x01(\x05\x12\x1c\n\x14\x65xclude_from_indexes\x18\x13 \x01(\x08\x42\x0c\n\nvalue_type\"\xbf\x01\n\x06\x45ntity\x12%\n\x03key\x18\x01 \x01(\x0b\x32\x18.google.datastore.v1.Key\x12?\n\nproperties\x18\x03 \x03(\x0b\x32+.google.datastore.v1.Entity.PropertiesEntry\x1aM\n\x0fPropertiesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.google.datastore.v1.Value:\x02\x38\x01\x42\xbd\x01\n\x17\x63om.google.datastore.v1B\x0b\x45ntityProtoP\x01Z<google.golang.org/genproto/googleapis/datastore/v1;datastore\xaa\x02\x19Google.Cloud.Datastore.V1\xca\x02\x19Google\\Cloud\\Datastore\\V1\xea\x02\x1cGoogle::Cloud::Datastore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.datastore.v1.entity_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.datastore.v1B\013EntityProtoP\001Z<google.golang.org/genproto/googleapis/datastore/v1;datastore\252\002\031Google.Cloud.Datastore.V1\312\002\031Google\\Cloud\\Datastore\\V1\352\002\034Google::Cloud::Datastore::V1'
  _ENTITY_PROPERTIESENTRY._options = None
  _ENTITY_PROPERTIESENTRY._serialized_options = b'8\001'
  _PARTITIONID._serialized_start=146
  _PARTITIONID._serialized_end=222
  _KEY._serialized_start=225
  _KEY._serialized_end=408
  _KEY_PATHELEMENT._serialized_start=340
  _KEY_PATHELEMENT._serialized_end=408
  _ARRAYVALUE._serialized_start=410
  _ARRAYVALUE._serialized_end=466
  _VALUE._serialized_start=469
  _VALUE._serialized_end=966
  _ENTITY._serialized_start=969
  _ENTITY._serialized_end=1160
  _ENTITY_PROPERTIESENTRY._serialized_start=1083
  _ENTITY_PROPERTIESENTRY._serialized_end=1160
# @@protoc_insertion_point(module_scope)
