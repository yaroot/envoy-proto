# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: envoy/service/discovery/v3/discovery.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from envoy.config.core.v3 import base_pb2 as envoy_dot_config_dot_core_dot_v3_dot_base__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2
from udpa.annotations import status_pb2 as udpa_dot_annotations_dot_status__pb2
from udpa.annotations import versioning_pb2 as udpa_dot_annotations_dot_versioning__pb2
from validate import validate_pb2 as validate_dot_validate__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*envoy/service/discovery/v3/discovery.proto\x12\x1a\x65nvoy.service.discovery.v3\x1a\x1f\x65nvoy/config/core/v3/base.proto\x1a\x19google/protobuf/any.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x17google/rpc/status.proto\x1a\x1dudpa/annotations/status.proto\x1a!udpa/annotations/versioning.proto\x1a\x17validate/validate.proto\"\xb9\x01\n\x0fResourceLocator\x12\x0c\n\x04name\x18\x01 \x01(\t\x12^\n\x12\x64ynamic_parameters\x18\x02 \x03(\x0b\x32\x42.envoy.service.discovery.v3.ResourceLocator.DynamicParametersEntry\x1a\x38\n\x16\x44ynamicParametersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"|\n\x0cResourceName\x12\x0c\n\x04name\x18\x01 \x01(\t\x12^\n\x1d\x64ynamic_parameter_constraints\x18\x02 \x01(\x0b\x32\x37.envoy.service.discovery.v3.DynamicParameterConstraints\"\xac\x02\n\x10\x44iscoveryRequest\x12\x14\n\x0cversion_info\x18\x01 \x01(\t\x12(\n\x04node\x18\x02 \x01(\x0b\x32\x1a.envoy.config.core.v3.Node\x12\x16\n\x0eresource_names\x18\x03 \x03(\t\x12\x46\n\x11resource_locators\x18\x07 \x03(\x0b\x32+.envoy.service.discovery.v3.ResourceLocator\x12\x10\n\x08type_url\x18\x04 \x01(\t\x12\x16\n\x0eresponse_nonce\x18\x05 \x01(\t\x12(\n\x0c\x65rror_detail\x18\x06 \x01(\x0b\x32\x12.google.rpc.Status:$\x9a\xc5\x88\x1e\x1f\n\x1d\x65nvoy.api.v2.DiscoveryRequest\"\xe5\x01\n\x11\x44iscoveryResponse\x12\x14\n\x0cversion_info\x18\x01 \x01(\t\x12\'\n\tresources\x18\x02 \x03(\x0b\x32\x14.google.protobuf.Any\x12\x0e\n\x06\x63\x61nary\x18\x03 \x01(\x08\x12\x10\n\x08type_url\x18\x04 \x01(\t\x12\r\n\x05nonce\x18\x05 \x01(\t\x12\x39\n\rcontrol_plane\x18\x06 \x01(\x0b\x32\".envoy.config.core.v3.ControlPlane:%\x9a\xc5\x88\x1e \n\x1e\x65nvoy.api.v2.DiscoveryResponse\"\xdf\x04\n\x15\x44\x65ltaDiscoveryRequest\x12(\n\x04node\x18\x01 \x01(\x0b\x32\x1a.envoy.config.core.v3.Node\x12\x10\n\x08type_url\x18\x02 \x01(\t\x12 \n\x18resource_names_subscribe\x18\x03 \x03(\t\x12\"\n\x1aresource_names_unsubscribe\x18\x04 \x03(\t\x12P\n\x1bresource_locators_subscribe\x18\x08 \x03(\x0b\x32+.envoy.service.discovery.v3.ResourceLocator\x12R\n\x1dresource_locators_unsubscribe\x18\t \x03(\x0b\x32+.envoy.service.discovery.v3.ResourceLocator\x12q\n\x19initial_resource_versions\x18\x05 \x03(\x0b\x32N.envoy.service.discovery.v3.DeltaDiscoveryRequest.InitialResourceVersionsEntry\x12\x16\n\x0eresponse_nonce\x18\x06 \x01(\t\x12(\n\x0c\x65rror_detail\x18\x07 \x01(\x0b\x32\x12.google.rpc.Status\x1a>\n\x1cInitialResourceVersionsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:)\x9a\xc5\x88\x1e$\n\"envoy.api.v2.DeltaDiscoveryRequest\"\xdb\x02\n\x16\x44\x65ltaDiscoveryResponse\x12\x1b\n\x13system_version_info\x18\x01 \x01(\t\x12\x37\n\tresources\x18\x02 \x03(\x0b\x32$.envoy.service.discovery.v3.Resource\x12\x10\n\x08type_url\x18\x04 \x01(\t\x12\x19\n\x11removed_resources\x18\x06 \x03(\t\x12H\n\x16removed_resource_names\x18\x08 \x03(\x0b\x32(.envoy.service.discovery.v3.ResourceName\x12\r\n\x05nonce\x18\x05 \x01(\t\x12\x39\n\rcontrol_plane\x18\x07 \x01(\x0b\x32\".envoy.config.core.v3.ControlPlane:*\x9a\xc5\x88\x1e%\n#envoy.api.v2.DeltaDiscoveryResponse\"\xb6\x05\n\x1b\x44ynamicParameterConstraints\x12^\n\nconstraint\x18\x01 \x01(\x0b\x32H.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraintH\x00\x12`\n\x0eor_constraints\x18\x02 \x01(\x0b\x32\x46.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintListH\x00\x12\x61\n\x0f\x61nd_constraints\x18\x03 \x01(\x0b\x32\x46.envoy.service.discovery.v3.DynamicParameterConstraints.ConstraintListH\x00\x12R\n\x0fnot_constraints\x18\x04 \x01(\x0b\x32\x37.envoy.service.discovery.v3.DynamicParameterConstraintsH\x00\x1a\xb5\x01\n\x10SingleConstraint\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\x0f\n\x05value\x18\x02 \x01(\tH\x00\x12\x61\n\x06\x65xists\x18\x03 \x01(\x0b\x32O.envoy.service.discovery.v3.DynamicParameterConstraints.SingleConstraint.ExistsH\x00\x1a\x08\n\x06\x45xistsB\x16\n\x0f\x63onstraint_type\x12\x03\xf8\x42\x01\x1a^\n\x0e\x43onstraintList\x12L\n\x0b\x63onstraints\x18\x01 \x03(\x0b\x32\x37.envoy.service.discovery.v3.DynamicParameterConstraintsB\x06\n\x04type\"\xd9\x02\n\x08Resource\x12\x0c\n\x04name\x18\x03 \x01(\t\x12?\n\rresource_name\x18\x08 \x01(\x0b\x32(.envoy.service.discovery.v3.ResourceName\x12\x0f\n\x07\x61liases\x18\x04 \x03(\t\x12\x0f\n\x07version\x18\x01 \x01(\t\x12&\n\x08resource\x18\x02 \x01(\x0b\x32\x14.google.protobuf.Any\x12&\n\x03ttl\x18\x06 \x01(\x0b\x32\x19.google.protobuf.Duration\x12H\n\rcache_control\x18\x07 \x01(\x0b\x32\x31.envoy.service.discovery.v3.Resource.CacheControl\x1a$\n\x0c\x43\x61\x63heControl\x12\x14\n\x0c\x64o_not_cache\x18\x01 \x01(\x08:\x1c\x9a\xc5\x88\x1e\x17\n\x15\x65nvoy.api.v2.ResourceB\x93\x01\n(io.envoyproxy.envoy.service.discovery.v3B\x0e\x44iscoveryProtoP\x01ZMgithub.com/envoyproxy/go-control-plane/envoy/service/discovery/v3;discoveryv3\xba\x80\xc8\xd1\x06\x02\x10\x02\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'envoy.service.discovery.v3.discovery_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n(io.envoyproxy.envoy.service.discovery.v3B\016DiscoveryProtoP\001ZMgithub.com/envoyproxy/go-control-plane/envoy/service/discovery/v3;discoveryv3\272\200\310\321\006\002\020\002'
  _RESOURCELOCATOR_DYNAMICPARAMETERSENTRY._options = None
  _RESOURCELOCATOR_DYNAMICPARAMETERSENTRY._serialized_options = b'8\001'
  _DISCOVERYREQUEST._options = None
  _DISCOVERYREQUEST._serialized_options = b'\232\305\210\036\037\n\035envoy.api.v2.DiscoveryRequest'
  _DISCOVERYRESPONSE._options = None
  _DISCOVERYRESPONSE._serialized_options = b'\232\305\210\036 \n\036envoy.api.v2.DiscoveryResponse'
  _DELTADISCOVERYREQUEST_INITIALRESOURCEVERSIONSENTRY._options = None
  _DELTADISCOVERYREQUEST_INITIALRESOURCEVERSIONSENTRY._serialized_options = b'8\001'
  _DELTADISCOVERYREQUEST._options = None
  _DELTADISCOVERYREQUEST._serialized_options = b'\232\305\210\036$\n\"envoy.api.v2.DeltaDiscoveryRequest'
  _DELTADISCOVERYRESPONSE._options = None
  _DELTADISCOVERYRESPONSE._serialized_options = b'\232\305\210\036%\n#envoy.api.v2.DeltaDiscoveryResponse'
  _DYNAMICPARAMETERCONSTRAINTS_SINGLECONSTRAINT.oneofs_by_name['constraint_type']._options = None
  _DYNAMICPARAMETERCONSTRAINTS_SINGLECONSTRAINT.oneofs_by_name['constraint_type']._serialized_options = b'\370B\001'
  _RESOURCE._options = None
  _RESOURCE._serialized_options = b'\232\305\210\036\027\n\025envoy.api.v2.Resource'
  _RESOURCELOCATOR._serialized_start=283
  _RESOURCELOCATOR._serialized_end=468
  _RESOURCELOCATOR_DYNAMICPARAMETERSENTRY._serialized_start=412
  _RESOURCELOCATOR_DYNAMICPARAMETERSENTRY._serialized_end=468
  _RESOURCENAME._serialized_start=470
  _RESOURCENAME._serialized_end=594
  _DISCOVERYREQUEST._serialized_start=597
  _DISCOVERYREQUEST._serialized_end=897
  _DISCOVERYRESPONSE._serialized_start=900
  _DISCOVERYRESPONSE._serialized_end=1129
  _DELTADISCOVERYREQUEST._serialized_start=1132
  _DELTADISCOVERYREQUEST._serialized_end=1739
  _DELTADISCOVERYREQUEST_INITIALRESOURCEVERSIONSENTRY._serialized_start=1634
  _DELTADISCOVERYREQUEST_INITIALRESOURCEVERSIONSENTRY._serialized_end=1696
  _DELTADISCOVERYRESPONSE._serialized_start=1742
  _DELTADISCOVERYRESPONSE._serialized_end=2089
  _DYNAMICPARAMETERCONSTRAINTS._serialized_start=2092
  _DYNAMICPARAMETERCONSTRAINTS._serialized_end=2786
  _DYNAMICPARAMETERCONSTRAINTS_SINGLECONSTRAINT._serialized_start=2501
  _DYNAMICPARAMETERCONSTRAINTS_SINGLECONSTRAINT._serialized_end=2682
  _DYNAMICPARAMETERCONSTRAINTS_SINGLECONSTRAINT_EXISTS._serialized_start=2650
  _DYNAMICPARAMETERCONSTRAINTS_SINGLECONSTRAINT_EXISTS._serialized_end=2658
  _DYNAMICPARAMETERCONSTRAINTS_CONSTRAINTLIST._serialized_start=2684
  _DYNAMICPARAMETERCONSTRAINTS_CONSTRAINTLIST._serialized_end=2778
  _RESOURCE._serialized_start=2789
  _RESOURCE._serialized_end=3134
  _RESOURCE_CACHECONTROL._serialized_start=3068
  _RESOURCE_CACHECONTROL._serialized_end=3104
# @@protoc_insertion_point(module_scope)
