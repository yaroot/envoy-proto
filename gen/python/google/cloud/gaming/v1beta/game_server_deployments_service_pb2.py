# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gaming/v1beta/game_server_deployments_service.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.cloud.gaming.v1beta import game_server_deployments_pb2 as google_dot_cloud_dot_gaming_dot_v1beta_dot_game__server__deployments__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n@google/cloud/gaming/v1beta/game_server_deployments_service.proto\x12\x1agoogle.cloud.gaming.v1beta\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x38google/cloud/gaming/v1beta/game_server_deployments.proto\x1a#google/longrunning/operations.proto2\xc4\x13\n\x1cGameServerDeploymentsService\x12\xe8\x01\n\x19ListGameServerDeployments\x12<.google.cloud.gaming.v1beta.ListGameServerDeploymentsRequest\x1a=.google.cloud.gaming.v1beta.ListGameServerDeploymentsResponse\"N\x82\xd3\xe4\x93\x02?\x12=/v1beta/{parent=projects/*/locations/*}/gameServerDeployments\xda\x41\x06parent\x12\xd5\x01\n\x17GetGameServerDeployment\x12:.google.cloud.gaming.v1beta.GetGameServerDeploymentRequest\x1a\x30.google.cloud.gaming.v1beta.GameServerDeployment\"L\x82\xd3\xe4\x93\x02?\x12=/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}\xda\x41\x04name\x12\xa6\x02\n\x1a\x43reateGameServerDeployment\x12=.google.cloud.gaming.v1beta.CreateGameServerDeploymentRequest\x1a\x1d.google.longrunning.Operation\"\xa9\x01\x82\xd3\xe4\x93\x02W\"=/v1beta/{parent=projects/*/locations/*}/gameServerDeployments:\x16game_server_deployment\xda\x41\x1dparent,game_server_deployment\xca\x41)\n\x14GameServerDeployment\x12\x11OperationMetadata\x12\xf5\x01\n\x1a\x44\x65leteGameServerDeployment\x12=.google.cloud.gaming.v1beta.DeleteGameServerDeploymentRequest\x1a\x1d.google.longrunning.Operation\"y\x82\xd3\xe4\x93\x02?*=/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xc2\x02\n\x1aUpdateGameServerDeployment\x12=.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRequest\x1a\x1d.google.longrunning.Operation\"\xc5\x01\x82\xd3\xe4\x93\x02n2T/v1beta/{game_server_deployment.name=projects/*/locations/*/gameServerDeployments/*}:\x16game_server_deployment\xda\x41\"game_server_deployment,update_mask\xca\x41)\n\x14GameServerDeployment\x12\x11OperationMetadata\x12\xf2\x01\n\x1eGetGameServerDeploymentRollout\x12\x41.google.cloud.gaming.v1beta.GetGameServerDeploymentRolloutRequest\x1a\x37.google.cloud.gaming.v1beta.GameServerDeploymentRollout\"T\x82\xd3\xe4\x93\x02G\x12\x45/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}/rollout\xda\x41\x04name\x12\xab\x02\n!UpdateGameServerDeploymentRollout\x12\x44.google.cloud.gaming.v1beta.UpdateGameServerDeploymentRolloutRequest\x1a\x1d.google.longrunning.Operation\"\xa0\x01\x82\xd3\xe4\x93\x02X2M/v1beta/{rollout.name=projects/*/locations/*/gameServerDeployments/*}/rollout:\x07rollout\xda\x41\x13rollout,update_mask\xca\x41)\n\x14GameServerDeployment\x12\x11OperationMetadata\x12\x9b\x02\n\"PreviewGameServerDeploymentRollout\x12\x45.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutRequest\x1a\x46.google.cloud.gaming.v1beta.PreviewGameServerDeploymentRolloutResponse\"f\x82\xd3\xe4\x93\x02`2U/v1beta/{rollout.name=projects/*/locations/*/gameServerDeployments/*}/rollout:preview:\x07rollout\x12\xe8\x01\n\x14\x46\x65tchDeploymentState\x12\x37.google.cloud.gaming.v1beta.FetchDeploymentStateRequest\x1a\x38.google.cloud.gaming.v1beta.FetchDeploymentStateResponse\"]\x82\xd3\xe4\x93\x02W\"R/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}:fetchDeploymentState:\x01*\x1aO\xca\x41\x1bgameservices.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x81\x01\n\x1e\x63om.google.cloud.gaming.v1betaP\x01Z@google.golang.org/genproto/googleapis/cloud/gaming/v1beta;gaming\xca\x02\x1aGoogle\\Cloud\\Gaming\\V1betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gaming.v1beta.game_server_deployments_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.gaming.v1betaP\001Z@google.golang.org/genproto/googleapis/cloud/gaming/v1beta;gaming\312\002\032Google\\Cloud\\Gaming\\V1beta'
  _GAMESERVERDEPLOYMENTSSERVICE._options = None
  _GAMESERVERDEPLOYMENTSSERVICE._serialized_options = b'\312A\033gameservices.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['ListGameServerDeployments']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['ListGameServerDeployments']._serialized_options = b'\202\323\344\223\002?\022=/v1beta/{parent=projects/*/locations/*}/gameServerDeployments\332A\006parent'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['GetGameServerDeployment']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['GetGameServerDeployment']._serialized_options = b'\202\323\344\223\002?\022=/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}\332A\004name'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['CreateGameServerDeployment']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['CreateGameServerDeployment']._serialized_options = b'\202\323\344\223\002W\"=/v1beta/{parent=projects/*/locations/*}/gameServerDeployments:\026game_server_deployment\332A\035parent,game_server_deployment\312A)\n\024GameServerDeployment\022\021OperationMetadata'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['DeleteGameServerDeployment']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['DeleteGameServerDeployment']._serialized_options = b'\202\323\344\223\002?*=/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['UpdateGameServerDeployment']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['UpdateGameServerDeployment']._serialized_options = b'\202\323\344\223\002n2T/v1beta/{game_server_deployment.name=projects/*/locations/*/gameServerDeployments/*}:\026game_server_deployment\332A\"game_server_deployment,update_mask\312A)\n\024GameServerDeployment\022\021OperationMetadata'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['GetGameServerDeploymentRollout']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['GetGameServerDeploymentRollout']._serialized_options = b'\202\323\344\223\002G\022E/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}/rollout\332A\004name'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['UpdateGameServerDeploymentRollout']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['UpdateGameServerDeploymentRollout']._serialized_options = b'\202\323\344\223\002X2M/v1beta/{rollout.name=projects/*/locations/*/gameServerDeployments/*}/rollout:\007rollout\332A\023rollout,update_mask\312A)\n\024GameServerDeployment\022\021OperationMetadata'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['PreviewGameServerDeploymentRollout']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['PreviewGameServerDeploymentRollout']._serialized_options = b'\202\323\344\223\002`2U/v1beta/{rollout.name=projects/*/locations/*/gameServerDeployments/*}/rollout:preview:\007rollout'
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['FetchDeploymentState']._options = None
  _GAMESERVERDEPLOYMENTSSERVICE.methods_by_name['FetchDeploymentState']._serialized_options = b'\202\323\344\223\002W\"R/v1beta/{name=projects/*/locations/*/gameServerDeployments/*}:fetchDeploymentState:\001*'
  _GAMESERVERDEPLOYMENTSSERVICE._serialized_start=247
  _GAMESERVERDEPLOYMENTSSERVICE._serialized_end=2747
# @@protoc_insertion_point(module_scope)