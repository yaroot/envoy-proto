# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/routes/v1/route_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.maps.routes.v1 import compute_routes_request_pb2 as google_dot_maps_dot_routes_dot_v1_dot_compute__routes__request__pb2
from google.maps.routes.v1 import compute_routes_response_pb2 as google_dot_maps_dot_routes_dot_v1_dot_compute__routes__response__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/maps/routes/v1/route_service.proto',
  package='google.maps.routes.v1',
  syntax='proto3',
  serialized_options=b'\n\031com.google.maps.routes.v1B\022RoutesServiceProtoP\001Z;google.golang.org/genproto/googleapis/maps/routes/v1;routes\370\001\001\242\002\004GMRS\252\002\025Google.Maps.Routes.V1\312\002\025Google\\Maps\\Routes\\V1',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)google/maps/routes/v1/route_service.proto\x12\x15google.maps.routes.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x32google/maps/routes/v1/compute_routes_request.proto\x1a\x33google/maps/routes/v1/compute_routes_response.proto\x1a\x17google/api/client.proto2\xbf\x01\n\x0fRoutesPreferred\x12\x88\x01\n\rComputeRoutes\x12+.google.maps.routes.v1.ComputeRoutesRequest\x1a,.google.maps.routes.v1.ComputeRoutesResponse\"\x1c\x82\xd3\xe4\x93\x02\x16\"\x11/v1:computeRoutes:\x01*\x1a!\xca\x41\x1eroutespreferred.googleapis.comB\xa8\x01\n\x19\x63om.google.maps.routes.v1B\x12RoutesServiceProtoP\x01Z;google.golang.org/genproto/googleapis/maps/routes/v1;routes\xf8\x01\x01\xa2\x02\x04GMRS\xaa\x02\x15Google.Maps.Routes.V1\xca\x02\x15Google\\Maps\\Routes\\V1b\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_maps_dot_routes_dot_v1_dot_compute__routes__request__pb2.DESCRIPTOR,google_dot_maps_dot_routes_dot_v1_dot_compute__routes__response__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_ROUTESPREFERRED = _descriptor.ServiceDescriptor(
  name='RoutesPreferred',
  full_name='google.maps.routes.v1.RoutesPreferred',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\036routespreferred.googleapis.com',
  create_key=_descriptor._internal_create_key,
  serialized_start=229,
  serialized_end=420,
  methods=[
  _descriptor.MethodDescriptor(
    name='ComputeRoutes',
    full_name='google.maps.routes.v1.RoutesPreferred.ComputeRoutes',
    index=0,
    containing_service=None,
    input_type=google_dot_maps_dot_routes_dot_v1_dot_compute__routes__request__pb2._COMPUTEROUTESREQUEST,
    output_type=google_dot_maps_dot_routes_dot_v1_dot_compute__routes__response__pb2._COMPUTEROUTESRESPONSE,
    serialized_options=b'\202\323\344\223\002\026\"\021/v1:computeRoutes:\001*',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ROUTESPREFERRED)

DESCRIPTOR.services_by_name['RoutesPreferred'] = _ROUTESPREFERRED

# @@protoc_insertion_point(module_scope)
