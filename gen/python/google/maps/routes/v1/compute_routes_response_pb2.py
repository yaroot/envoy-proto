# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/maps/routes/v1/compute_routes_response.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.maps.routes.v1 import fallback_info_pb2 as google_dot_maps_dot_routes_dot_v1_dot_fallback__info__pb2
from google.maps.routes.v1 import route_pb2 as google_dot_maps_dot_routes_dot_v1_dot_route__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/maps/routes/v1/compute_routes_response.proto\x12\x15google.maps.routes.v1\x1a)google/maps/routes/v1/fallback_info.proto\x1a!google/maps/routes/v1/route.proto\"\x81\x01\n\x15\x43omputeRoutesResponse\x12,\n\x06routes\x18\x01 \x03(\x0b\x32\x1c.google.maps.routes.v1.Route\x12:\n\rfallback_info\x18\x02 \x01(\x0b\x32#.google.maps.routes.v1.FallbackInfoB\xb0\x01\n\x19\x63om.google.maps.routes.v1B\x1a\x43omputeRoutesResponseProtoP\x01Z;google.golang.org/genproto/googleapis/maps/routes/v1;routes\xf8\x01\x01\xa2\x02\x04GMRS\xaa\x02\x15Google.Maps.Routes.V1\xca\x02\x15Google\\Maps\\Routes\\V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.maps.routes.v1.compute_routes_response_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.maps.routes.v1B\032ComputeRoutesResponseProtoP\001Z;google.golang.org/genproto/googleapis/maps/routes/v1;routes\370\001\001\242\002\004GMRS\252\002\025Google.Maps.Routes.V1\312\002\025Google\\Maps\\Routes\\V1'
  _COMPUTEROUTESRESPONSE._serialized_start=157
  _COMPUTEROUTESRESPONSE._serialized_end=286
# @@protoc_insertion_point(module_scope)
