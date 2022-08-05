# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/routes/v1/route.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.geo.type import viewport_pb2 as google_dot_geo_dot_type_dot_viewport__pb2
from google.maps.routes.v1 import polyline_pb2 as google_dot_maps_dot_routes_dot_v1_dot_polyline__pb2
from google.maps.routes.v1 import waypoint_pb2 as google_dot_maps_dot_routes_dot_v1_dot_waypoint__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.type import money_pb2 as google_dot_type_dot_money__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!google/maps/routes/v1/route.proto\x12\x15google.maps.routes.v1\x1a\x1egoogle/geo/type/viewport.proto\x1a$google/maps/routes/v1/polyline.proto\x1a$google/maps/routes/v1/waypoint.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x17google/type/money.proto\"\xab\x03\n\x05Route\x12-\n\x04legs\x18\x01 \x03(\x0b\x32\x1f.google.maps.routes.v1.RouteLeg\x12\x17\n\x0f\x64istance_meters\x18\x02 \x01(\x05\x12+\n\x08\x64uration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0fstatic_duration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x31\n\x08polyline\x18\x05 \x01(\x0b\x32\x1f.google.maps.routes.v1.Polyline\x12\x13\n\x0b\x64\x65scription\x18\x06 \x01(\t\x12\x10\n\x08warnings\x18\x07 \x03(\t\x12+\n\x08viewport\x18\x08 \x01(\x0b\x32\x19.google.geo.type.Viewport\x12\x43\n\x0ftravel_advisory\x18\t \x01(\x0b\x32*.google.maps.routes.v1.RouteTravelAdvisory\x12-\n%optimized_intermediate_waypoint_index\x18\n \x03(\x05\"\xa2\x02\n\x13RouteTravelAdvisory\x12\x46\n\x13traffic_restriction\x18\x01 \x01(\x0b\x32).google.maps.routes.v1.TrafficRestriction\x12\x32\n\ttoll_info\x18\x02 \x01(\x0b\x32\x1f.google.maps.routes.v1.TollInfo\x12L\n\x17speed_reading_intervals\x18\x03 \x03(\x0b\x32+.google.maps.routes.v1.SpeedReadingInterval\x12\x41\n\x11\x63ustom_layer_info\x18\x04 \x01(\x0b\x32&.google.maps.routes.v1.CustomLayerInfo\"\xdd\x01\n\x16RouteLegTravelAdvisory\x12\x32\n\ttoll_info\x18\x01 \x01(\x0b\x32\x1f.google.maps.routes.v1.TollInfo\x12L\n\x17speed_reading_intervals\x18\x02 \x03(\x0b\x32+.google.maps.routes.v1.SpeedReadingInterval\x12\x41\n\x11\x63ustom_layer_info\x18\x03 \x01(\x0b\x32&.google.maps.routes.v1.CustomLayerInfo\"j\n\x1aRouteLegStepTravelAdvisory\x12L\n\x17speed_reading_intervals\x18\x01 \x03(\x0b\x32+.google.maps.routes.v1.SpeedReadingInterval\"\x83\x01\n\x12TrafficRestriction\x12m\n(license_plate_last_character_restriction\x18\x01 \x01(\x0b\x32;.google.maps.routes.v1.LicensePlateLastCharacterRestriction\"G\n$LicensePlateLastCharacterRestriction\x12\x1f\n\x17\x61llowed_last_characters\x18\x01 \x03(\t\"\xa3\x03\n\x08RouteLeg\x12\x17\n\x0f\x64istance_meters\x18\x01 \x01(\x05\x12+\n\x08\x64uration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0fstatic_duration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x31\n\x08polyline\x18\x04 \x01(\x0b\x32\x1f.google.maps.routes.v1.Polyline\x12\x37\n\x0estart_location\x18\x05 \x01(\x0b\x32\x1f.google.maps.routes.v1.Location\x12\x35\n\x0c\x65nd_location\x18\x06 \x01(\x0b\x32\x1f.google.maps.routes.v1.Location\x12\x32\n\x05steps\x18\x07 \x03(\x0b\x32#.google.maps.routes.v1.RouteLegStep\x12\x46\n\x0ftravel_advisory\x18\x08 \x01(\x0b\x32-.google.maps.routes.v1.RouteLegTravelAdvisory\"7\n\x08TollInfo\x12+\n\x0f\x65stimated_price\x18\x01 \x03(\x0b\x32\x12.google.type.Money\"\x98\x03\n\x0cRouteLegStep\x12\x17\n\x0f\x64istance_meters\x18\x01 \x01(\x05\x12\x32\n\x0fstatic_duration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x31\n\x08polyline\x18\x03 \x01(\x0b\x32\x1f.google.maps.routes.v1.Polyline\x12\x37\n\x0estart_location\x18\x04 \x01(\x0b\x32\x1f.google.maps.routes.v1.Location\x12\x35\n\x0c\x65nd_location\x18\x05 \x01(\x0b\x32\x1f.google.maps.routes.v1.Location\x12L\n\x16navigation_instruction\x18\x06 \x01(\x0b\x32,.google.maps.routes.v1.NavigationInstruction\x12J\n\x0ftravel_advisory\x18\x07 \x01(\x0b\x32\x31.google.maps.routes.v1.RouteLegStepTravelAdvisory\"`\n\x15NavigationInstruction\x12\x31\n\x08maneuver\x18\x01 \x01(\x0e\x32\x1f.google.maps.routes.v1.Maneuver\x12\x14\n\x0cinstructions\x18\x02 \x01(\t\"\xe5\x01\n\x14SpeedReadingInterval\x12\"\n\x1astart_polyline_point_index\x18\x01 \x01(\x05\x12 \n\x18\x65nd_polyline_point_index\x18\x02 \x01(\x05\x12@\n\x05speed\x18\x03 \x01(\x0e\x32\x31.google.maps.routes.v1.SpeedReadingInterval.Speed\"E\n\x05Speed\x12\x15\n\x11SPEED_UNSPECIFIED\x10\x00\x12\n\n\x06NORMAL\x10\x01\x12\x08\n\x04SLOW\x10\x02\x12\x0f\n\x0bTRAFFIC_JAM\x10\x03\"\xc8\x01\n\x0f\x43ustomLayerInfo\x12\x42\n\tarea_info\x18\x01 \x03(\x0b\x32/.google.maps.routes.v1.CustomLayerInfo.AreaInfo\x1aq\n\x08\x41reaInfo\x12\x0f\n\x07\x61rea_id\x18\x01 \x01(\t\x12\x1f\n\x17\x64istance_in_area_meters\x18\x02 \x01(\x02\x12\x33\n\x10\x64uration_in_area\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration*\xda\x02\n\x08Maneuver\x12\x18\n\x14MANEUVER_UNSPECIFIED\x10\x00\x12\x14\n\x10TURN_SLIGHT_LEFT\x10\x01\x12\x13\n\x0fTURN_SHARP_LEFT\x10\x02\x12\x0e\n\nUTURN_LEFT\x10\x03\x12\r\n\tTURN_LEFT\x10\x04\x12\x15\n\x11TURN_SLIGHT_RIGHT\x10\x05\x12\x14\n\x10TURN_SHARP_RIGHT\x10\x06\x12\x0f\n\x0bUTURN_RIGHT\x10\x07\x12\x0e\n\nTURN_RIGHT\x10\x08\x12\x0c\n\x08STRAIGHT\x10\t\x12\r\n\tRAMP_LEFT\x10\n\x12\x0e\n\nRAMP_RIGHT\x10\x0b\x12\t\n\x05MERGE\x10\x0c\x12\r\n\tFORK_LEFT\x10\r\x12\x0e\n\nFORK_RIGHT\x10\x0e\x12\t\n\x05\x46\x45RRY\x10\x0f\x12\x0f\n\x0b\x46\x45RRY_TRAIN\x10\x10\x12\x13\n\x0fROUNDABOUT_LEFT\x10\x11\x12\x14\n\x10ROUNDABOUT_RIGHT\x10\x12\x42\xa0\x01\n\x19\x63om.google.maps.routes.v1B\nRouteProtoP\x01Z;google.golang.org/genproto/googleapis/maps/routes/v1;routes\xf8\x01\x01\xa2\x02\x04GMRS\xaa\x02\x15Google.Maps.Routes.V1\xca\x02\x15Google\\Maps\\Routes\\V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.maps.routes.v1.route_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.maps.routes.v1B\nRouteProtoP\001Z;google.golang.org/genproto/googleapis/maps/routes/v1;routes\370\001\001\242\002\004GMRS\252\002\025Google.Maps.Routes.V1\312\002\025Google\\Maps\\Routes\\V1'
  _MANEUVER._serialized_start=2911
  _MANEUVER._serialized_end=3257
  _ROUTE._serialized_start=226
  _ROUTE._serialized_end=653
  _ROUTETRAVELADVISORY._serialized_start=656
  _ROUTETRAVELADVISORY._serialized_end=946
  _ROUTELEGTRAVELADVISORY._serialized_start=949
  _ROUTELEGTRAVELADVISORY._serialized_end=1170
  _ROUTELEGSTEPTRAVELADVISORY._serialized_start=1172
  _ROUTELEGSTEPTRAVELADVISORY._serialized_end=1278
  _TRAFFICRESTRICTION._serialized_start=1281
  _TRAFFICRESTRICTION._serialized_end=1412
  _LICENSEPLATELASTCHARACTERRESTRICTION._serialized_start=1414
  _LICENSEPLATELASTCHARACTERRESTRICTION._serialized_end=1485
  _ROUTELEG._serialized_start=1488
  _ROUTELEG._serialized_end=1907
  _TOLLINFO._serialized_start=1909
  _TOLLINFO._serialized_end=1964
  _ROUTELEGSTEP._serialized_start=1967
  _ROUTELEGSTEP._serialized_end=2375
  _NAVIGATIONINSTRUCTION._serialized_start=2377
  _NAVIGATIONINSTRUCTION._serialized_end=2473
  _SPEEDREADINGINTERVAL._serialized_start=2476
  _SPEEDREADINGINTERVAL._serialized_end=2705
  _SPEEDREADINGINTERVAL_SPEED._serialized_start=2636
  _SPEEDREADINGINTERVAL_SPEED._serialized_end=2705
  _CUSTOMLAYERINFO._serialized_start=2708
  _CUSTOMLAYERINFO._serialized_end=2908
  _CUSTOMLAYERINFO_AREAINFO._serialized_start=2795
  _CUSTOMLAYERINFO_AREAINFO._serialized_end=2908
# @@protoc_insertion_point(module_scope)
