# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/roads/v1op/roads.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"google/maps/roads/v1op/roads.proto\x12\x16google.maps.roads.v1op\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x18google/type/latlng.proto\"\x82\x01\n\x12SnapToRoadsRequest\x12\x0c\n\x04path\x18\x01 \x01(\t\x12\x13\n\x0binterpolate\x18\x02 \x01(\x08\x12\x10\n\x08\x61sset_id\x18\x03 \x01(\t\x12\x37\n\x0btravel_mode\x18\x04 \x01(\x0e\x32\".google.maps.roads.v1op.TravelMode\"}\n\x0cSnappedPoint\x12%\n\x08location\x18\x01 \x01(\x0b\x32\x13.google.type.LatLng\x12\x34\n\x0eoriginal_index\x18\x02 \x01(\x0b\x32\x1c.google.protobuf.UInt32Value\x12\x10\n\x08place_id\x18\x03 \x01(\t\"l\n\x13SnapToRoadsResponse\x12<\n\x0esnapped_points\x18\x01 \x03(\x0b\x32$.google.maps.roads.v1op.SnappedPoint\x12\x17\n\x0fwarning_message\x18\x02 \x01(\t\"b\n\x17ListNearestRoadsRequest\x12\x0e\n\x06points\x18\x01 \x01(\t\x12\x37\n\x0btravel_mode\x18\x02 \x01(\x0e\x32\".google.maps.roads.v1op.TravelMode\"X\n\x18ListNearestRoadsResponse\x12<\n\x0esnapped_points\x18\x01 \x03(\x0b\x32$.google.maps.roads.v1op.SnappedPoint*P\n\nTravelMode\x12\x1b\n\x17TRAVEL_MODE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x44RIVING\x10\x01\x12\x0b\n\x07\x43YCLING\x10\x02\x12\x0b\n\x07WALKING\x10\x03\x32\x9b\x02\n\x0cRoadsService\x12o\n\x0bSnapToRoads\x12*.google.maps.roads.v1op.SnapToRoadsRequest\x1a+.google.maps.roads.v1op.SnapToRoadsResponse\"\x07\xda\x41\x04path\x12\x80\x01\n\x10ListNearestRoads\x12/.google.maps.roads.v1op.ListNearestRoadsRequest\x1a\x30.google.maps.roads.v1op.ListNearestRoadsResponse\"\t\xda\x41\x06points\x1a\x17\xca\x41\x14roads.googleapis.comBg\n\x1a\x63om.google.maps.roads.v1opB\nRoadsProtoP\x01Z;google.golang.org/genproto/googleapis/maps/roads/v1op;roadsb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.maps.roads.v1op.roads_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.maps.roads.v1opB\nRoadsProtoP\001Z;google.golang.org/genproto/googleapis/maps/roads/v1op;roads'
  _ROADSSERVICE._options = None
  _ROADSSERVICE._serialized_options = b'\312A\024roads.googleapis.com'
  _ROADSSERVICE.methods_by_name['SnapToRoads']._options = None
  _ROADSSERVICE.methods_by_name['SnapToRoads']._serialized_options = b'\332A\004path'
  _ROADSSERVICE.methods_by_name['ListNearestRoads']._options = None
  _ROADSSERVICE.methods_by_name['ListNearestRoads']._serialized_options = b'\332A\006points'
  _TRAVELMODE._serialized_start=735
  _TRAVELMODE._serialized_end=815
  _SNAPTOROADSREQUEST._serialized_start=176
  _SNAPTOROADSREQUEST._serialized_end=306
  _SNAPPEDPOINT._serialized_start=308
  _SNAPPEDPOINT._serialized_end=433
  _SNAPTOROADSRESPONSE._serialized_start=435
  _SNAPTOROADSRESPONSE._serialized_end=543
  _LISTNEARESTROADSREQUEST._serialized_start=545
  _LISTNEARESTROADSREQUEST._serialized_end=643
  _LISTNEARESTROADSRESPONSE._serialized_start=645
  _LISTNEARESTROADSRESPONSE._serialized_end=733
  _ROADSSERVICE._serialized_start=818
  _ROADSSERVICE._serialized_end=1101
# @@protoc_insertion_point(module_scope)
