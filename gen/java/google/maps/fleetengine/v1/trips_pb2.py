# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/fleetengine/v1/trips.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.maps.fleetengine.v1 import fleetengine_pb2 as google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2
from google.type import latlng_pb2 as google_dot_type_dot_latlng__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/maps/fleetengine/v1/trips.proto',
  package='maps.fleetengine.v1',
  syntax='proto3',
  serialized_options=b'\n\032google.maps.fleetengine.v1B\005TripsP\001ZEgoogle.golang.org/genproto/googleapis/maps/fleetengine/v1;fleetengine\242\002\003CFE',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&google/maps/fleetengine/v1/trips.proto\x12\x13maps.fleetengine.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a,google/maps/fleetengine/v1/fleetengine.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/wrappers.proto\x1a\x18google/type/latlng.proto\"\xe8\r\n\x04Trip\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x12\n\nvehicle_id\x18\x02 \x01(\t\x12\x34\n\x0btrip_status\x18\x03 \x01(\x0e\x32\x1f.maps.fleetengine.v1.TripStatus\x12\x30\n\ttrip_type\x18\x04 \x01(\x0e\x32\x1d.maps.fleetengine.v1.TripType\x12;\n\x0cpickup_point\x18\x05 \x01(\x0b\x32%.maps.fleetengine.v1.TerminalLocation\x12\x43\n\x13\x61\x63tual_pickup_point\x18\x16 \x01(\x0b\x32!.maps.fleetengine.v1.StopLocationB\x03\xe0\x41\x04\x12K\n\x1b\x61\x63tual_pickup_arrival_point\x18  \x01(\x0b\x32!.maps.fleetengine.v1.StopLocationB\x03\xe0\x41\x04\x12/\n\x0bpickup_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12H\n\x19intermediate_destinations\x18\x0e \x03(\x0b\x32%.maps.fleetengine.v1.TerminalLocation\x12\x45\n!intermediate_destinations_version\x18\x19 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12&\n\x1eintermediate_destination_index\x18\x0f \x01(\x05\x12^\n.actual_intermediate_destination_arrival_points\x18! \x03(\x0b\x32!.maps.fleetengine.v1.StopLocationB\x03\xe0\x41\x04\x12P\n actual_intermediate_destinations\x18\" \x03(\x0b\x32!.maps.fleetengine.v1.StopLocationB\x03\xe0\x41\x04\x12<\n\rdropoff_point\x18\x07 \x01(\x0b\x32%.maps.fleetengine.v1.TerminalLocation\x12\x44\n\x14\x61\x63tual_dropoff_point\x18\x17 \x01(\x0b\x32!.maps.fleetengine.v1.StopLocationB\x03\xe0\x41\x04\x12\x30\n\x0c\x64ropoff_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x43\n\x13remaining_waypoints\x18\x10 \x03(\x0b\x32!.maps.fleetengine.v1.TripWaypointB\x03\xe0\x41\x03\x12<\n\x11vehicle_waypoints\x18\x14 \x03(\x0b\x32!.maps.fleetengine.v1.TripWaypoint\x12\"\n\x05route\x18\t \x03(\x0b\x32\x13.google.type.LatLng\x12J\n\x1f\x63urrent_route_segment_end_point\x18\x18 \x01(\x0b\x32!.maps.fleetengine.v1.TripWaypoint\x12>\n\x19remaining_distance_meters\x18\x0c \x01(\x0b\x32\x1b.google.protobuf.Int32Value\x12>\n\x15\x65ta_to_first_waypoint\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12H\n remaining_time_to_first_waypoint\x18\x1b \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x03\x12?\n\x1bremaining_waypoints_version\x18\x13 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x45\n!remaining_waypoints_route_version\x18\x1d \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x1c\n\x14number_of_passengers\x18\n \x01(\x05\x12;\n\rlast_location\x18\x0b \x01(\x0b\x32$.maps.fleetengine.v1.VehicleLocation\x12\x1f\n\x17last_location_snappable\x18\x1a \x01(\x08\x12+\n\x04view\x18\x1f \x01(\x0e\x32\x1d.maps.fleetengine.v1.TripView:G\xea\x41\x44\n\x1f\x66leetengine.googleapis.com/Trip\x12!providers/{provider}/trips/{trip}\"\x95\x01\n\x0cStopLocation\x12\'\n\x05point\x18\x01 \x01(\x0b\x32\x13.google.type.LatLngB\x03\xe0\x41\x02\x12-\n\ttimestamp\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12-\n\tstop_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp*\xe2\x01\n\nTripStatus\x12\x17\n\x13UNKNOWN_TRIP_STATUS\x10\x00\x12\x07\n\x03NEW\x10\x01\x12\x15\n\x11\x45NROUTE_TO_PICKUP\x10\x02\x12\x15\n\x11\x41RRIVED_AT_PICKUP\x10\x03\x12\'\n#ARRIVED_AT_INTERMEDIATE_DESTINATION\x10\x07\x12\'\n#ENROUTE_TO_INTERMEDIATE_DESTINATION\x10\x08\x12\x16\n\x12\x45NROUTE_TO_DROPOFF\x10\x04\x12\x0c\n\x08\x43OMPLETE\x10\x05\x12\x0c\n\x08\x43\x41NCELED\x10\x06*\x7f\n\x19\x42illingPlatformIdentifier\x12+\n\'BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED\x10\x00\x12\n\n\x06SERVER\x10\x01\x12\x07\n\x03WEB\x10\x02\x12\x0b\n\x07\x41NDROID\x10\x03\x12\x07\n\x03IOS\x10\x04\x12\n\n\x06OTHERS\x10\x05*G\n\x08TripView\x12\x19\n\x15TRIP_VIEW_UNSPECIFIED\x10\x00\x12\x07\n\x03SDK\x10\x01\x12\x17\n\x13JOURNEY_SHARING_V1S\x10\x02\x42r\n\x1agoogle.maps.fleetengine.v1B\x05TripsP\x01ZEgoogle.golang.org/genproto/googleapis/maps/fleetengine/v1;fleetengine\xa2\x02\x03\x43\x46\x45\x62\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_api_dot_resource__pb2.DESCRIPTOR,google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2.DESCRIPTOR,google_dot_protobuf_dot_duration__pb2.DESCRIPTOR,google_dot_protobuf_dot_timestamp__pb2.DESCRIPTOR,google_dot_protobuf_dot_wrappers__pb2.DESCRIPTOR,google_dot_type_dot_latlng__pb2.DESCRIPTOR,])

_TRIPSTATUS = _descriptor.EnumDescriptor(
  name='TripStatus',
  full_name='maps.fleetengine.v1.TripStatus',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='UNKNOWN_TRIP_STATUS', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NEW', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENROUTE_TO_PICKUP', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ARRIVED_AT_PICKUP', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ARRIVED_AT_INTERMEDIATE_DESTINATION', index=4, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENROUTE_TO_INTERMEDIATE_DESTINATION', index=5, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ENROUTE_TO_DROPOFF', index=6, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMPLETE', index=7, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANCELED', index=8, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2216,
  serialized_end=2442,
)
_sym_db.RegisterEnumDescriptor(_TRIPSTATUS)

TripStatus = enum_type_wrapper.EnumTypeWrapper(_TRIPSTATUS)
_BILLINGPLATFORMIDENTIFIER = _descriptor.EnumDescriptor(
  name='BillingPlatformIdentifier',
  full_name='maps.fleetengine.v1.BillingPlatformIdentifier',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SERVER', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='WEB', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ANDROID', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='IOS', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='OTHERS', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2444,
  serialized_end=2571,
)
_sym_db.RegisterEnumDescriptor(_BILLINGPLATFORMIDENTIFIER)

BillingPlatformIdentifier = enum_type_wrapper.EnumTypeWrapper(_BILLINGPLATFORMIDENTIFIER)
_TRIPVIEW = _descriptor.EnumDescriptor(
  name='TripView',
  full_name='maps.fleetengine.v1.TripView',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TRIP_VIEW_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SDK', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='JOURNEY_SHARING_V1S', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=2573,
  serialized_end=2644,
)
_sym_db.RegisterEnumDescriptor(_TRIPVIEW)

TripView = enum_type_wrapper.EnumTypeWrapper(_TRIPVIEW)
UNKNOWN_TRIP_STATUS = 0
NEW = 1
ENROUTE_TO_PICKUP = 2
ARRIVED_AT_PICKUP = 3
ARRIVED_AT_INTERMEDIATE_DESTINATION = 7
ENROUTE_TO_INTERMEDIATE_DESTINATION = 8
ENROUTE_TO_DROPOFF = 4
COMPLETE = 5
CANCELED = 6
BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED = 0
SERVER = 1
WEB = 2
ANDROID = 3
IOS = 4
OTHERS = 5
TRIP_VIEW_UNSPECIFIED = 0
SDK = 1
JOURNEY_SHARING_V1S = 2



_TRIP = _descriptor.Descriptor(
  name='Trip',
  full_name='maps.fleetengine.v1.Trip',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='maps.fleetengine.v1.Trip.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vehicle_id', full_name='maps.fleetengine.v1.Trip.vehicle_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trip_status', full_name='maps.fleetengine.v1.Trip.trip_status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='trip_type', full_name='maps.fleetengine.v1.Trip.trip_type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pickup_point', full_name='maps.fleetengine.v1.Trip.pickup_point', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='actual_pickup_point', full_name='maps.fleetengine.v1.Trip.actual_pickup_point', index=5,
      number=22, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='actual_pickup_arrival_point', full_name='maps.fleetengine.v1.Trip.actual_pickup_arrival_point', index=6,
      number=32, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pickup_time', full_name='maps.fleetengine.v1.Trip.pickup_time', index=7,
      number=6, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='intermediate_destinations', full_name='maps.fleetengine.v1.Trip.intermediate_destinations', index=8,
      number=14, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='intermediate_destinations_version', full_name='maps.fleetengine.v1.Trip.intermediate_destinations_version', index=9,
      number=25, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='intermediate_destination_index', full_name='maps.fleetengine.v1.Trip.intermediate_destination_index', index=10,
      number=15, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='actual_intermediate_destination_arrival_points', full_name='maps.fleetengine.v1.Trip.actual_intermediate_destination_arrival_points', index=11,
      number=33, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='actual_intermediate_destinations', full_name='maps.fleetengine.v1.Trip.actual_intermediate_destinations', index=12,
      number=34, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dropoff_point', full_name='maps.fleetengine.v1.Trip.dropoff_point', index=13,
      number=7, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='actual_dropoff_point', full_name='maps.fleetengine.v1.Trip.actual_dropoff_point', index=14,
      number=23, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\004', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dropoff_time', full_name='maps.fleetengine.v1.Trip.dropoff_time', index=15,
      number=8, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remaining_waypoints', full_name='maps.fleetengine.v1.Trip.remaining_waypoints', index=16,
      number=16, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vehicle_waypoints', full_name='maps.fleetengine.v1.Trip.vehicle_waypoints', index=17,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='route', full_name='maps.fleetengine.v1.Trip.route', index=18,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='current_route_segment_end_point', full_name='maps.fleetengine.v1.Trip.current_route_segment_end_point', index=19,
      number=24, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remaining_distance_meters', full_name='maps.fleetengine.v1.Trip.remaining_distance_meters', index=20,
      number=12, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='eta_to_first_waypoint', full_name='maps.fleetengine.v1.Trip.eta_to_first_waypoint', index=21,
      number=13, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remaining_time_to_first_waypoint', full_name='maps.fleetengine.v1.Trip.remaining_time_to_first_waypoint', index=22,
      number=27, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\003', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remaining_waypoints_version', full_name='maps.fleetengine.v1.Trip.remaining_waypoints_version', index=23,
      number=19, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='remaining_waypoints_route_version', full_name='maps.fleetengine.v1.Trip.remaining_waypoints_route_version', index=24,
      number=29, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='number_of_passengers', full_name='maps.fleetengine.v1.Trip.number_of_passengers', index=25,
      number=10, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_location', full_name='maps.fleetengine.v1.Trip.last_location', index=26,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='last_location_snappable', full_name='maps.fleetengine.v1.Trip.last_location_snappable', index=27,
      number=26, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='view', full_name='maps.fleetengine.v1.Trip.view', index=28,
      number=31, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\352AD\n\037fleetengine.googleapis.com/Trip\022!providers/{provider}/trips/{trip}',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=293,
  serialized_end=2061,
)


_STOPLOCATION = _descriptor.Descriptor(
  name='StopLocation',
  full_name='maps.fleetengine.v1.StopLocation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='point', full_name='maps.fleetengine.v1.StopLocation.point', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='maps.fleetengine.v1.StopLocation.timestamp', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='stop_time', full_name='maps.fleetengine.v1.StopLocation.stop_time', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2064,
  serialized_end=2213,
)

_TRIP.fields_by_name['trip_status'].enum_type = _TRIPSTATUS
_TRIP.fields_by_name['trip_type'].enum_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TRIPTYPE
_TRIP.fields_by_name['pickup_point'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TERMINALLOCATION
_TRIP.fields_by_name['actual_pickup_point'].message_type = _STOPLOCATION
_TRIP.fields_by_name['actual_pickup_arrival_point'].message_type = _STOPLOCATION
_TRIP.fields_by_name['pickup_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIP.fields_by_name['intermediate_destinations'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TERMINALLOCATION
_TRIP.fields_by_name['intermediate_destinations_version'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIP.fields_by_name['actual_intermediate_destination_arrival_points'].message_type = _STOPLOCATION
_TRIP.fields_by_name['actual_intermediate_destinations'].message_type = _STOPLOCATION
_TRIP.fields_by_name['dropoff_point'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TERMINALLOCATION
_TRIP.fields_by_name['actual_dropoff_point'].message_type = _STOPLOCATION
_TRIP.fields_by_name['dropoff_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIP.fields_by_name['remaining_waypoints'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TRIPWAYPOINT
_TRIP.fields_by_name['vehicle_waypoints'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TRIPWAYPOINT
_TRIP.fields_by_name['route'].message_type = google_dot_type_dot_latlng__pb2._LATLNG
_TRIP.fields_by_name['current_route_segment_end_point'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._TRIPWAYPOINT
_TRIP.fields_by_name['remaining_distance_meters'].message_type = google_dot_protobuf_dot_wrappers__pb2._INT32VALUE
_TRIP.fields_by_name['eta_to_first_waypoint'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIP.fields_by_name['remaining_time_to_first_waypoint'].message_type = google_dot_protobuf_dot_duration__pb2._DURATION
_TRIP.fields_by_name['remaining_waypoints_version'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIP.fields_by_name['remaining_waypoints_route_version'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_TRIP.fields_by_name['last_location'].message_type = google_dot_maps_dot_fleetengine_dot_v1_dot_fleetengine__pb2._VEHICLELOCATION
_TRIP.fields_by_name['view'].enum_type = _TRIPVIEW
_STOPLOCATION.fields_by_name['point'].message_type = google_dot_type_dot_latlng__pb2._LATLNG
_STOPLOCATION.fields_by_name['timestamp'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
_STOPLOCATION.fields_by_name['stop_time'].message_type = google_dot_protobuf_dot_timestamp__pb2._TIMESTAMP
DESCRIPTOR.message_types_by_name['Trip'] = _TRIP
DESCRIPTOR.message_types_by_name['StopLocation'] = _STOPLOCATION
DESCRIPTOR.enum_types_by_name['TripStatus'] = _TRIPSTATUS
DESCRIPTOR.enum_types_by_name['BillingPlatformIdentifier'] = _BILLINGPLATFORMIDENTIFIER
DESCRIPTOR.enum_types_by_name['TripView'] = _TRIPVIEW
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Trip = _reflection.GeneratedProtocolMessageType('Trip', (_message.Message,), {
  'DESCRIPTOR' : _TRIP,
  '__module__' : 'google.maps.fleetengine.v1.trips_pb2'
  # @@protoc_insertion_point(class_scope:maps.fleetengine.v1.Trip)
  })
_sym_db.RegisterMessage(Trip)

StopLocation = _reflection.GeneratedProtocolMessageType('StopLocation', (_message.Message,), {
  'DESCRIPTOR' : _STOPLOCATION,
  '__module__' : 'google.maps.fleetengine.v1.trips_pb2'
  # @@protoc_insertion_point(class_scope:maps.fleetengine.v1.StopLocation)
  })
_sym_db.RegisterMessage(StopLocation)


DESCRIPTOR._options = None
_TRIP.fields_by_name['actual_pickup_point']._options = None
_TRIP.fields_by_name['actual_pickup_arrival_point']._options = None
_TRIP.fields_by_name['actual_intermediate_destination_arrival_points']._options = None
_TRIP.fields_by_name['actual_intermediate_destinations']._options = None
_TRIP.fields_by_name['actual_dropoff_point']._options = None
_TRIP.fields_by_name['remaining_waypoints']._options = None
_TRIP.fields_by_name['eta_to_first_waypoint']._options = None
_TRIP.fields_by_name['remaining_time_to_first_waypoint']._options = None
_TRIP._options = None
_STOPLOCATION.fields_by_name['point']._options = None
# @@protoc_insertion_point(module_scope)
