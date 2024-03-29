# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/gaming/v1/game_server_configs.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.gaming.v1 import common_pb2 as google_dot_cloud_dot_gaming_dot_v1_dot_common__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/gaming/v1/game_server_configs.proto\x12\x16google.cloud.gaming.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/cloud/gaming/v1/common.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc1\x01\n\x1cListGameServerConfigsRequest\x12\x44\n\x06parent\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\x12,gameservices.googleapis.com/GameServerConfig\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\x12\x13\n\x06\x66ilter\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x15\n\x08order_by\x18\x05 \x01(\tB\x03\xe0\x41\x01\"\x94\x01\n\x1dListGameServerConfigsResponse\x12\x45\n\x13game_server_configs\x18\x01 \x03(\x0b\x32(.google.cloud.gaming.v1.GameServerConfig\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x04 \x03(\t\"`\n\x1aGetGameServerConfigRequest\x12\x42\n\x04name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,gameservices.googleapis.com/GameServerConfig\"\xc8\x01\n\x1d\x43reateGameServerConfigRequest\x12\x44\n\x06parent\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\x12,gameservices.googleapis.com/GameServerConfig\x12\x16\n\tconfig_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12I\n\x12game_server_config\x18\x03 \x01(\x0b\x32(.google.cloud.gaming.v1.GameServerConfigB\x03\xe0\x41\x02\"c\n\x1d\x44\x65leteGameServerConfigRequest\x12\x42\n\x04name\x18\x01 \x01(\tB4\xe0\x41\x02\xfa\x41.\n,gameservices.googleapis.com/GameServerConfig\"\xb5\x01\n\rScalingConfig\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\"\n\x15\x66leet_autoscaler_spec\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x38\n\tselectors\x18\x04 \x03(\x0b\x32%.google.cloud.gaming.v1.LabelSelector\x12\x33\n\tschedules\x18\x05 \x03(\x0b\x32 .google.cloud.gaming.v1.Schedule\"/\n\x0b\x46leetConfig\x12\x12\n\nfleet_spec\x18\x01 \x01(\t\x12\x0c\n\x04name\x18\x02 \x01(\t\"\xa4\x04\n\x10GameServerConfig\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x34\n\x0b\x63reate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x44\n\x06labels\x18\x04 \x03(\x0b\x32\x34.google.cloud.gaming.v1.GameServerConfig.LabelsEntry\x12:\n\rfleet_configs\x18\x05 \x03(\x0b\x32#.google.cloud.gaming.v1.FleetConfig\x12>\n\x0fscaling_configs\x18\x06 \x03(\x0b\x32%.google.cloud.gaming.v1.ScalingConfig\x12\x13\n\x0b\x64\x65scription\x18\x07 \x01(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x8f\x01\xea\x41\x8b\x01\n,gameservices.googleapis.com/GameServerConfig\x12[projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}B\\\n\x1a\x63om.google.cloud.gaming.v1P\x01Z<google.golang.org/genproto/googleapis/cloud/gaming/v1;gamingb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.gaming.v1.game_server_configs_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.google.cloud.gaming.v1P\001Z<google.golang.org/genproto/googleapis/cloud/gaming/v1;gaming'
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['parent']._options = None
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A.\022,gameservices.googleapis.com/GameServerConfig'
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['page_size']._options = None
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['page_token']._options = None
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['filter']._options = None
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['filter']._serialized_options = b'\340A\001'
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['order_by']._options = None
  _LISTGAMESERVERCONFIGSREQUEST.fields_by_name['order_by']._serialized_options = b'\340A\001'
  _GETGAMESERVERCONFIGREQUEST.fields_by_name['name']._options = None
  _GETGAMESERVERCONFIGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A.\n,gameservices.googleapis.com/GameServerConfig'
  _CREATEGAMESERVERCONFIGREQUEST.fields_by_name['parent']._options = None
  _CREATEGAMESERVERCONFIGREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A.\022,gameservices.googleapis.com/GameServerConfig'
  _CREATEGAMESERVERCONFIGREQUEST.fields_by_name['config_id']._options = None
  _CREATEGAMESERVERCONFIGREQUEST.fields_by_name['config_id']._serialized_options = b'\340A\002'
  _CREATEGAMESERVERCONFIGREQUEST.fields_by_name['game_server_config']._options = None
  _CREATEGAMESERVERCONFIGREQUEST.fields_by_name['game_server_config']._serialized_options = b'\340A\002'
  _DELETEGAMESERVERCONFIGREQUEST.fields_by_name['name']._options = None
  _DELETEGAMESERVERCONFIGREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A.\n,gameservices.googleapis.com/GameServerConfig'
  _SCALINGCONFIG.fields_by_name['name']._options = None
  _SCALINGCONFIG.fields_by_name['name']._serialized_options = b'\340A\002'
  _SCALINGCONFIG.fields_by_name['fleet_autoscaler_spec']._options = None
  _SCALINGCONFIG.fields_by_name['fleet_autoscaler_spec']._serialized_options = b'\340A\002'
  _GAMESERVERCONFIG_LABELSENTRY._options = None
  _GAMESERVERCONFIG_LABELSENTRY._serialized_options = b'8\001'
  _GAMESERVERCONFIG.fields_by_name['create_time']._options = None
  _GAMESERVERCONFIG.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _GAMESERVERCONFIG.fields_by_name['update_time']._options = None
  _GAMESERVERCONFIG.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _GAMESERVERCONFIG._options = None
  _GAMESERVERCONFIG._serialized_options = b'\352A\213\001\n,gameservices.googleapis.com/GameServerConfig\022[projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}'
  _LISTGAMESERVERCONFIGSREQUEST._serialized_start=207
  _LISTGAMESERVERCONFIGSREQUEST._serialized_end=400
  _LISTGAMESERVERCONFIGSRESPONSE._serialized_start=403
  _LISTGAMESERVERCONFIGSRESPONSE._serialized_end=551
  _GETGAMESERVERCONFIGREQUEST._serialized_start=553
  _GETGAMESERVERCONFIGREQUEST._serialized_end=649
  _CREATEGAMESERVERCONFIGREQUEST._serialized_start=652
  _CREATEGAMESERVERCONFIGREQUEST._serialized_end=852
  _DELETEGAMESERVERCONFIGREQUEST._serialized_start=854
  _DELETEGAMESERVERCONFIGREQUEST._serialized_end=953
  _SCALINGCONFIG._serialized_start=956
  _SCALINGCONFIG._serialized_end=1137
  _FLEETCONFIG._serialized_start=1139
  _FLEETCONFIG._serialized_end=1186
  _GAMESERVERCONFIG._serialized_start=1189
  _GAMESERVERCONFIG._serialized_end=1737
  _GAMESERVERCONFIG_LABELSENTRY._serialized_start=1546
  _GAMESERVERCONFIG_LABELSENTRY._serialized_end=1591
# @@protoc_insertion_point(module_scope)
