# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/discovery/v4alpha/ads.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.service.discovery.v4alpha import discovery_pb2 as envoy_dot_service_dot_discovery_dot_v4alpha_dot_discovery__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='envoy/service/discovery/v4alpha/ads.proto',
  package='envoy.service.discovery.v4alpha',
  syntax='proto3',
  serialized_options=b'\n-io.envoyproxy.envoy.service.discovery.v4alphaB\010AdsProtoP\001\210\001\001\272\200\310\321\006\002\020\003',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)envoy/service/discovery/v4alpha/ads.proto\x12\x1f\x65nvoy.service.discovery.v4alpha\x1a/envoy/service/discovery/v4alpha/discovery.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\"6\n\x08\x41\x64sDummy:*\x9a\xc5\x88\x1e%\n#envoy.service.discovery.v3.AdsDummy2\xbb\x02\n\x1a\x41ggregatedDiscoveryService\x12\x88\x01\n\x19StreamAggregatedResources\x12\x31.envoy.service.discovery.v4alpha.DiscoveryRequest\x1a\x32.envoy.service.discovery.v4alpha.DiscoveryResponse\"\x00(\x01\x30\x01\x12\x91\x01\n\x18\x44\x65ltaAggregatedResources\x12\x36.envoy.service.discovery.v4alpha.DeltaDiscoveryRequest\x1a\x37.envoy.service.discovery.v4alpha.DeltaDiscoveryResponse\"\x00(\x01\x30\x01\x42\x46\n-io.envoyproxy.envoy.service.discovery.v4alphaB\x08\x41\x64sProtoP\x01\x88\x01\x01\xba\x80\xc8\xd1\x06\x02\x10\x03\x62\x06proto3'
  ,
  dependencies=[envoy_dot_service_dot_discovery_dot_v4alpha_dot_discovery__pb2.DESCRIPTOR,udpa_dot_annotations_dot_status__pb2.DESCRIPTOR,udpa_dot_annotations_dot_versioning__pb2.DESCRIPTOR,])




_ADSDUMMY = _descriptor.Descriptor(
  name='AdsDummy',
  full_name='envoy.service.discovery.v4alpha.AdsDummy',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\232\305\210\036%\n#envoy.service.discovery.v3.AdsDummy',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=193,
  serialized_end=247,
)

DESCRIPTOR.message_types_by_name['AdsDummy'] = _ADSDUMMY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

AdsDummy = _reflection.GeneratedProtocolMessageType('AdsDummy', (_message.Message,), {
  'DESCRIPTOR' : _ADSDUMMY,
  '__module__' : 'envoy.service.discovery.v4alpha.ads_pb2'
  # @@protoc_insertion_point(class_scope:envoy.service.discovery.v4alpha.AdsDummy)
  })
_sym_db.RegisterMessage(AdsDummy)


DESCRIPTOR._options = None
_ADSDUMMY._options = None

_AGGREGATEDDISCOVERYSERVICE = _descriptor.ServiceDescriptor(
  name='AggregatedDiscoveryService',
  full_name='envoy.service.discovery.v4alpha.AggregatedDiscoveryService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=250,
  serialized_end=565,
  methods=[
  _descriptor.MethodDescriptor(
    name='StreamAggregatedResources',
    full_name='envoy.service.discovery.v4alpha.AggregatedDiscoveryService.StreamAggregatedResources',
    index=0,
    containing_service=None,
    input_type=envoy_dot_service_dot_discovery_dot_v4alpha_dot_discovery__pb2._DISCOVERYREQUEST,
    output_type=envoy_dot_service_dot_discovery_dot_v4alpha_dot_discovery__pb2._DISCOVERYRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeltaAggregatedResources',
    full_name='envoy.service.discovery.v4alpha.AggregatedDiscoveryService.DeltaAggregatedResources',
    index=1,
    containing_service=None,
    input_type=envoy_dot_service_dot_discovery_dot_v4alpha_dot_discovery__pb2._DELTADISCOVERYREQUEST,
    output_type=envoy_dot_service_dot_discovery_dot_v4alpha_dot_discovery__pb2._DELTADISCOVERYRESPONSE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_AGGREGATEDDISCOVERYSERVICE)

DESCRIPTOR.services_by_name['AggregatedDiscoveryService'] = _AGGREGATEDDISCOVERYSERVICE

# @@protoc_insertion_point(module_scope)