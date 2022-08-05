# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/routing/v2/route.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.geo.type import viewport_pb2 as google_dot_geo_dot_type_dot_viewport__pb2
from google.maps.routing.v2 import location_pb2 as google_dot_maps_dot_routing_dot_v2_dot_location__pb2
from google.maps.routing.v2 import navigation_instruction_pb2 as google_dot_maps_dot_routing_dot_v2_dot_navigation__instruction__pb2
from google.maps.routing.v2 import polyline_pb2 as google_dot_maps_dot_routing_dot_v2_dot_polyline__pb2
from google.maps.routing.v2 import speed_reading_interval_pb2 as google_dot_maps_dot_routing_dot_v2_dot_speed__reading__interval__pb2
from google.maps.routing.v2 import toll_info_pb2 as google_dot_maps_dot_routing_dot_v2_dot_toll__info__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"google/maps/routing/v2/route.proto\x12\x16google.maps.routing.v2\x1a\x1egoogle/geo/type/viewport.proto\x1a%google/maps/routing/v2/location.proto\x1a\x33google/maps/routing/v2/navigation_instruction.proto\x1a%google/maps/routing/v2/polyline.proto\x1a\x33google/maps/routing/v2/speed_reading_interval.proto\x1a&google/maps/routing/v2/toll_info.proto\x1a\x1egoogle/protobuf/duration.proto\"\xff\x02\n\x05Route\x12.\n\x04legs\x18\x01 \x03(\x0b\x32 .google.maps.routing.v2.RouteLeg\x12\x17\n\x0f\x64istance_meters\x18\x02 \x01(\x05\x12+\n\x08\x64uration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0fstatic_duration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x08polyline\x18\x05 \x01(\x0b\x32 .google.maps.routing.v2.Polyline\x12\x13\n\x0b\x64\x65scription\x18\x06 \x01(\t\x12\x10\n\x08warnings\x18\x07 \x03(\t\x12+\n\x08viewport\x18\x08 \x01(\x0b\x32\x19.google.geo.type.Viewport\x12\x44\n\x0ftravel_advisory\x18\t \x01(\x0b\x32+.google.maps.routing.v2.RouteTravelAdvisory\"\x99\x01\n\x13RouteTravelAdvisory\x12\x33\n\ttoll_info\x18\x02 \x01(\x0b\x32 .google.maps.routing.v2.TollInfo\x12M\n\x17speed_reading_intervals\x18\x03 \x03(\x0b\x32,.google.maps.routing.v2.SpeedReadingInterval\"\x9c\x01\n\x16RouteLegTravelAdvisory\x12\x33\n\ttoll_info\x18\x01 \x01(\x0b\x32 .google.maps.routing.v2.TollInfo\x12M\n\x17speed_reading_intervals\x18\x02 \x03(\x0b\x32,.google.maps.routing.v2.SpeedReadingInterval\"k\n\x1aRouteLegStepTravelAdvisory\x12M\n\x17speed_reading_intervals\x18\x01 \x03(\x0b\x32,.google.maps.routing.v2.SpeedReadingInterval\"\xa8\x03\n\x08RouteLeg\x12\x17\n\x0f\x64istance_meters\x18\x01 \x01(\x05\x12+\n\x08\x64uration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0fstatic_duration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x08polyline\x18\x04 \x01(\x0b\x32 .google.maps.routing.v2.Polyline\x12\x38\n\x0estart_location\x18\x05 \x01(\x0b\x32 .google.maps.routing.v2.Location\x12\x36\n\x0c\x65nd_location\x18\x06 \x01(\x0b\x32 .google.maps.routing.v2.Location\x12\x33\n\x05steps\x18\x07 \x03(\x0b\x32$.google.maps.routing.v2.RouteLegStep\x12G\n\x0ftravel_advisory\x18\x08 \x01(\x0b\x32..google.maps.routing.v2.RouteLegTravelAdvisory\"\x9d\x03\n\x0cRouteLegStep\x12\x17\n\x0f\x64istance_meters\x18\x01 \x01(\x05\x12\x32\n\x0fstatic_duration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x08polyline\x18\x03 \x01(\x0b\x32 .google.maps.routing.v2.Polyline\x12\x38\n\x0estart_location\x18\x04 \x01(\x0b\x32 .google.maps.routing.v2.Location\x12\x36\n\x0c\x65nd_location\x18\x05 \x01(\x0b\x32 .google.maps.routing.v2.Location\x12M\n\x16navigation_instruction\x18\x06 \x01(\x0b\x32-.google.maps.routing.v2.NavigationInstruction\x12K\n\x0ftravel_advisory\x18\x07 \x01(\x0b\x32\x32.google.maps.routing.v2.RouteLegStepTravelAdvisoryB\xc2\x01\n\x1a\x63om.google.maps.routing.v2B\nRouteProtoP\x01Z=google.golang.org/genproto/googleapis/maps/routing/v2;routing\xf8\x01\x01\xa2\x02\x05GMRV2\xaa\x02\x16Google.Maps.Routing.V2\xca\x02\x16Google\\Maps\\Routing\\V2\xea\x02\x19Google::Maps::Routing::V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.maps.routing.v2.route_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.maps.routing.v2B\nRouteProtoP\001Z=google.golang.org/genproto/googleapis/maps/routing/v2;routing\370\001\001\242\002\005GMRV2\252\002\026Google.Maps.Routing.V2\312\002\026Google\\Maps\\Routing\\V2\352\002\031Google::Maps::Routing::V2'
  _ROUTE._serialized_start=351
  _ROUTE._serialized_end=734
  _ROUTETRAVELADVISORY._serialized_start=737
  _ROUTETRAVELADVISORY._serialized_end=890
  _ROUTELEGTRAVELADVISORY._serialized_start=893
  _ROUTELEGTRAVELADVISORY._serialized_end=1049
  _ROUTELEGSTEPTRAVELADVISORY._serialized_start=1051
  _ROUTELEGSTEPTRAVELADVISORY._serialized_end=1158
  _ROUTELEG._serialized_start=1161
  _ROUTELEG._serialized_end=1585
  _ROUTELEGSTEP._serialized_start=1588
  _ROUTELEGSTEP._serialized_end=2001
# @@protoc_insertion_point(module_scope)
