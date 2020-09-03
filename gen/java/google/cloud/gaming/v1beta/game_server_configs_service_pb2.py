# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gaming/v1beta/game_server_configs_service.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.gaming.v1beta import game_server_configs_pb2 as google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/gaming/v1beta/game_server_configs_service.proto',
  package='google.cloud.gaming.v1beta',
  syntax='proto3',
  serialized_options=b'\n\036com.google.cloud.gaming.v1betaP\001Z@google.golang.org/genproto/googleapis/cloud/gaming/v1beta;gaming',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n<google/cloud/gaming/v1beta/game_server_configs_service.proto\x12\x1agoogle.cloud.gaming.v1beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x34google/cloud/gaming/v1beta/game_server_configs.proto\x1a#google/longrunning/operations.proto2\xc4\x08\n\x18GameServerConfigsService\x12\xe6\x01\n\x15ListGameServerConfigs\x12\x38.google.cloud.gaming.v1beta.ListGameServerConfigsRequest\x1a\x39.google.cloud.gaming.v1beta.ListGameServerConfigsResponse\"X\x82\xd3\xe4\x93\x02I\x12G/v1beta/{parent=projects/*/locations/*/gameServerDeployments/*}/configs\xda\x41\x06parent\x12\xd3\x01\n\x13GetGameServerConfig\x12\x36.google.cloud.gaming.v1beta.GetGameServerConfigRequest\x1a,.google.cloud.gaming.v1beta.GameServerConfig\"V\x82\xd3\xe4\x93\x02I\x12G/v1beta/{name=projects/*/locations/*/gameServerDeployments/*/configs/*}\xda\x41\x04name\x12\x9c\x02\n\x16\x43reateGameServerConfig\x12\x39.google.cloud.gaming.v1beta.CreateGameServerConfigRequest\x1a\x1d.google.longrunning.Operation\"\xa7\x01\x82\xd3\xe4\x93\x02]\"G/v1beta/{parent=projects/*/locations/*/gameServerDeployments/*}/configs:\x12game_server_config\xda\x41\x19parent,game_server_config\xca\x41%\n\x10GameServerConfig\x12\x11OperationMetadata\x12\xf8\x01\n\x16\x44\x65leteGameServerConfig\x12\x39.google.cloud.gaming.v1beta.DeleteGameServerConfigRequest\x1a\x1d.google.longrunning.Operation\"\x83\x01\x82\xd3\xe4\x93\x02I*G/v1beta/{name=projects/*/locations/*/gameServerDeployments/*/configs/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x1aO\xca\x41\x1bgameservices.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformBd\n\x1e\x63om.google.cloud.gaming.v1betaP\x01Z@google.golang.org/genproto/googleapis/cloud/gaming/v1beta;gamingb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_annotations__pb2.DESCRIPTOR,google_dot_api_dot_client__pb2.DESCRIPTOR,google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2.DESCRIPTOR,google_dot_longrunning_dot_operations__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_GAMESERVERCONFIGSSERVICE = _descriptor.ServiceDescriptor(
  name='GameServerConfigsService',
  full_name='google.cloud.gaming.v1beta.GameServerConfigsService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=b'\312A\033gameservices.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform',
  create_key=_descriptor._internal_create_key,
  serialized_start=239,
  serialized_end=1331,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListGameServerConfigs',
    full_name='google.cloud.gaming.v1beta.GameServerConfigsService.ListGameServerConfigs',
    index=0,
    containing_service=None,
    input_type=google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2._LISTGAMESERVERCONFIGSREQUEST,
    output_type=google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2._LISTGAMESERVERCONFIGSRESPONSE,
    serialized_options=b'\202\323\344\223\002I\022G/v1beta/{parent=projects/*/locations/*/gameServerDeployments/*}/configs\332A\006parent',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetGameServerConfig',
    full_name='google.cloud.gaming.v1beta.GameServerConfigsService.GetGameServerConfig',
    index=1,
    containing_service=None,
    input_type=google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2._GETGAMESERVERCONFIGREQUEST,
    output_type=google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2._GAMESERVERCONFIG,
    serialized_options=b'\202\323\344\223\002I\022G/v1beta/{name=projects/*/locations/*/gameServerDeployments/*/configs/*}\332A\004name',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateGameServerConfig',
    full_name='google.cloud.gaming.v1beta.GameServerConfigsService.CreateGameServerConfig',
    index=2,
    containing_service=None,
    input_type=google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2._CREATEGAMESERVERCONFIGREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002]\"G/v1beta/{parent=projects/*/locations/*/gameServerDeployments/*}/configs:\022game_server_config\332A\031parent,game_server_config\312A%\n\020GameServerConfig\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteGameServerConfig',
    full_name='google.cloud.gaming.v1beta.GameServerConfigsService.DeleteGameServerConfig',
    index=3,
    containing_service=None,
    input_type=google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__configs__pb2._DELETEGAMESERVERCONFIGREQUEST,
    output_type=google_dot_longrunning_dot_operations__pb2._OPERATION,
    serialized_options=b'\202\323\344\223\002I*G/v1beta/{name=projects/*/locations/*/gameServerDeployments/*/configs/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata',
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_GAMESERVERCONFIGSSERVICE)

DESCRIPTOR.services_by_name['GameServerConfigsService'] = _GAMESERVERCONFIGSSERVICE

# @@protoc_insertion_point(module_scope)
