# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/agentendpoint/v1/agentendpoint.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.osconfig.agentendpoint.v1 import inventory_pb2 as google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1_dot_inventory__pb2
from google.cloud.osconfig.agentendpoint.v1 import tasks_pb2 as google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1_dot_tasks__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:google/cloud/osconfig/agentendpoint/v1/agentendpoint.proto\x12&google.cloud.osconfig.agentendpoint.v1\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x36google/cloud/osconfig/agentendpoint/v1/inventory.proto\x1a\x32google/cloud/osconfig/agentendpoint/v1/tasks.proto\"\\\n\x1eReceiveTaskNotificationRequest\x12\x1e\n\x11instance_id_token\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\ragent_version\x18\x02 \x01(\tB\x03\xe0\x41\x02\"!\n\x1fReceiveTaskNotificationResponse\"6\n\x14StartNextTaskRequest\x12\x1e\n\x11instance_id_token\x18\x01 \x01(\tB\x03\xe0\x41\x02\"S\n\x15StartNextTaskResponse\x12:\n\x04task\x18\x01 \x01(\x0b\x32,.google.cloud.osconfig.agentendpoint.v1.Task\"\xd8\x03\n\x19ReportTaskProgressRequest\x12\x1e\n\x11instance_id_token\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x07task_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12H\n\ttask_type\x18\x03 \x01(\x0e\x32\x30.google.cloud.osconfig.agentendpoint.v1.TaskTypeB\x03\xe0\x41\x02\x12g\n\x1b\x61pply_patches_task_progress\x18\x04 \x01(\x0b\x32@.google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskProgressH\x00\x12_\n\x17\x65xec_step_task_progress\x18\x05 \x01(\x0b\x32<.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskProgressH\x00\x12\x65\n\x1a\x61pply_config_task_progress\x18\x06 \x01(\x0b\x32?.google.cloud.osconfig.agentendpoint.v1.ApplyConfigTaskProgressH\x00\x42\n\n\x08progress\"k\n\x1aReportTaskProgressResponse\x12M\n\x0etask_directive\x18\x01 \x01(\x0e\x32\x35.google.cloud.osconfig.agentendpoint.v1.TaskDirective\"\xe1\x03\n\x19ReportTaskCompleteRequest\x12\x1e\n\x11instance_id_token\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x07task_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12H\n\ttask_type\x18\x03 \x01(\x0e\x32\x30.google.cloud.osconfig.agentendpoint.v1.TaskTypeB\x03\xe0\x41\x02\x12\x15\n\rerror_message\x18\x04 \x01(\t\x12\x63\n\x19\x61pply_patches_task_output\x18\x05 \x01(\x0b\x32>.google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskOutputH\x00\x12[\n\x15\x65xec_step_task_output\x18\x06 \x01(\x0b\x32:.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutputH\x00\x12\x61\n\x18\x61pply_config_task_output\x18\x07 \x01(\x0b\x32=.google.cloud.osconfig.agentendpoint.v1.ApplyConfigTaskOutputH\x00\x42\x08\n\x06output\"\x1c\n\x1aReportTaskCompleteResponse\"\xd1\x01\n\x14RegisterAgentRequest\x12\x1e\n\x11instance_id_token\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\ragent_version\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12#\n\x16supported_capabilities\x18\x03 \x03(\tB\x03\xe0\x41\x02\x12\x14\n\x0cos_long_name\x18\x04 \x01(\t\x12\x15\n\ros_short_name\x18\x05 \x01(\t\x12\x12\n\nos_version\x18\x06 \x01(\t\x12\x17\n\x0fos_architecture\x18\x07 \x01(\t\"\x17\n\x15RegisterAgentResponse\"\xa4\x01\n\x16ReportInventoryRequest\x12\x1e\n\x11instance_id_token\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1f\n\x12inventory_checksum\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12I\n\tinventory\x18\x03 \x01(\x0b\x32\x31.google.cloud.osconfig.agentendpoint.v1.InventoryB\x03\xe0\x41\x01\"8\n\x17ReportInventoryResponse\x12\x1d\n\x15report_full_inventory\x18\x01 \x01(\x08\x32\xd6\t\n\x14\x41gentEndpointService\x12\xd0\x01\n\x17ReceiveTaskNotification\x12\x46.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationRequest\x1aG.google.cloud.osconfig.agentendpoint.v1.ReceiveTaskNotificationResponse\"\"\xda\x41\x1finstance_id_token,agent_version0\x01\x12\xa2\x01\n\rStartNextTask\x12<.google.cloud.osconfig.agentendpoint.v1.StartNextTaskRequest\x1a=.google.cloud.osconfig.agentendpoint.v1.StartNextTaskResponse\"\x14\xda\x41\x11instance_id_token\x12\xc3\x01\n\x12ReportTaskProgress\x12\x41.google.cloud.osconfig.agentendpoint.v1.ReportTaskProgressRequest\x1a\x42.google.cloud.osconfig.agentendpoint.v1.ReportTaskProgressResponse\"&\xda\x41#instance_id_token,task_id,task_type\x12\xd1\x01\n\x12ReportTaskComplete\x12\x41.google.cloud.osconfig.agentendpoint.v1.ReportTaskCompleteRequest\x1a\x42.google.cloud.osconfig.agentendpoint.v1.ReportTaskCompleteResponse\"4\xda\x41\x31instance_id_token,task_id,task_type,error_message\x12\xc7\x01\n\rRegisterAgent\x12<.google.cloud.osconfig.agentendpoint.v1.RegisterAgentRequest\x1a=.google.cloud.osconfig.agentendpoint.v1.RegisterAgentResponse\"9\xda\x41\x36instance_id_token,agent_version,supported_capabilities\x12\xc5\x01\n\x0fReportInventory\x12>.google.cloud.osconfig.agentendpoint.v1.ReportInventoryRequest\x1a?.google.cloud.osconfig.agentendpoint.v1.ReportInventoryResponse\"1\xda\x41.instance_id_token,inventory_checksum,inventory\x1a\x1a\xca\x41\x17osconfig.googleapis.comB\x97\x01\n*com.google.cloud.osconfig.agentendpoint.v1B\x12\x41gentEndpointProtoP\x01ZSgoogle.golang.org/genproto/googleapis/cloud/osconfig/agentendpoint/v1;agentendpointb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.osconfig.agentendpoint.v1.agentendpoint_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.osconfig.agentendpoint.v1B\022AgentEndpointProtoP\001ZSgoogle.golang.org/genproto/googleapis/cloud/osconfig/agentendpoint/v1;agentendpoint'
  _RECEIVETASKNOTIFICATIONREQUEST.fields_by_name['instance_id_token']._options = None
  _RECEIVETASKNOTIFICATIONREQUEST.fields_by_name['instance_id_token']._serialized_options = b'\340A\002'
  _RECEIVETASKNOTIFICATIONREQUEST.fields_by_name['agent_version']._options = None
  _RECEIVETASKNOTIFICATIONREQUEST.fields_by_name['agent_version']._serialized_options = b'\340A\002'
  _STARTNEXTTASKREQUEST.fields_by_name['instance_id_token']._options = None
  _STARTNEXTTASKREQUEST.fields_by_name['instance_id_token']._serialized_options = b'\340A\002'
  _REPORTTASKPROGRESSREQUEST.fields_by_name['instance_id_token']._options = None
  _REPORTTASKPROGRESSREQUEST.fields_by_name['instance_id_token']._serialized_options = b'\340A\002'
  _REPORTTASKPROGRESSREQUEST.fields_by_name['task_id']._options = None
  _REPORTTASKPROGRESSREQUEST.fields_by_name['task_id']._serialized_options = b'\340A\002'
  _REPORTTASKPROGRESSREQUEST.fields_by_name['task_type']._options = None
  _REPORTTASKPROGRESSREQUEST.fields_by_name['task_type']._serialized_options = b'\340A\002'
  _REPORTTASKCOMPLETEREQUEST.fields_by_name['instance_id_token']._options = None
  _REPORTTASKCOMPLETEREQUEST.fields_by_name['instance_id_token']._serialized_options = b'\340A\002'
  _REPORTTASKCOMPLETEREQUEST.fields_by_name['task_id']._options = None
  _REPORTTASKCOMPLETEREQUEST.fields_by_name['task_id']._serialized_options = b'\340A\002'
  _REPORTTASKCOMPLETEREQUEST.fields_by_name['task_type']._options = None
  _REPORTTASKCOMPLETEREQUEST.fields_by_name['task_type']._serialized_options = b'\340A\002'
  _REGISTERAGENTREQUEST.fields_by_name['instance_id_token']._options = None
  _REGISTERAGENTREQUEST.fields_by_name['instance_id_token']._serialized_options = b'\340A\002'
  _REGISTERAGENTREQUEST.fields_by_name['agent_version']._options = None
  _REGISTERAGENTREQUEST.fields_by_name['agent_version']._serialized_options = b'\340A\002'
  _REGISTERAGENTREQUEST.fields_by_name['supported_capabilities']._options = None
  _REGISTERAGENTREQUEST.fields_by_name['supported_capabilities']._serialized_options = b'\340A\002'
  _REPORTINVENTORYREQUEST.fields_by_name['instance_id_token']._options = None
  _REPORTINVENTORYREQUEST.fields_by_name['instance_id_token']._serialized_options = b'\340A\002'
  _REPORTINVENTORYREQUEST.fields_by_name['inventory_checksum']._options = None
  _REPORTINVENTORYREQUEST.fields_by_name['inventory_checksum']._serialized_options = b'\340A\002'
  _REPORTINVENTORYREQUEST.fields_by_name['inventory']._options = None
  _REPORTINVENTORYREQUEST.fields_by_name['inventory']._serialized_options = b'\340A\001'
  _AGENTENDPOINTSERVICE._options = None
  _AGENTENDPOINTSERVICE._serialized_options = b'\312A\027osconfig.googleapis.com'
  _AGENTENDPOINTSERVICE.methods_by_name['ReceiveTaskNotification']._options = None
  _AGENTENDPOINTSERVICE.methods_by_name['ReceiveTaskNotification']._serialized_options = b'\332A\037instance_id_token,agent_version'
  _AGENTENDPOINTSERVICE.methods_by_name['StartNextTask']._options = None
  _AGENTENDPOINTSERVICE.methods_by_name['StartNextTask']._serialized_options = b'\332A\021instance_id_token'
  _AGENTENDPOINTSERVICE.methods_by_name['ReportTaskProgress']._options = None
  _AGENTENDPOINTSERVICE.methods_by_name['ReportTaskProgress']._serialized_options = b'\332A#instance_id_token,task_id,task_type'
  _AGENTENDPOINTSERVICE.methods_by_name['ReportTaskComplete']._options = None
  _AGENTENDPOINTSERVICE.methods_by_name['ReportTaskComplete']._serialized_options = b'\332A1instance_id_token,task_id,task_type,error_message'
  _AGENTENDPOINTSERVICE.methods_by_name['RegisterAgent']._options = None
  _AGENTENDPOINTSERVICE.methods_by_name['RegisterAgent']._serialized_options = b'\332A6instance_id_token,agent_version,supported_capabilities'
  _AGENTENDPOINTSERVICE.methods_by_name['ReportInventory']._options = None
  _AGENTENDPOINTSERVICE.methods_by_name['ReportInventory']._serialized_options = b'\332A.instance_id_token,inventory_checksum,inventory'
  _RECEIVETASKNOTIFICATIONREQUEST._serialized_start=268
  _RECEIVETASKNOTIFICATIONREQUEST._serialized_end=360
  _RECEIVETASKNOTIFICATIONRESPONSE._serialized_start=362
  _RECEIVETASKNOTIFICATIONRESPONSE._serialized_end=395
  _STARTNEXTTASKREQUEST._serialized_start=397
  _STARTNEXTTASKREQUEST._serialized_end=451
  _STARTNEXTTASKRESPONSE._serialized_start=453
  _STARTNEXTTASKRESPONSE._serialized_end=536
  _REPORTTASKPROGRESSREQUEST._serialized_start=539
  _REPORTTASKPROGRESSREQUEST._serialized_end=1011
  _REPORTTASKPROGRESSRESPONSE._serialized_start=1013
  _REPORTTASKPROGRESSRESPONSE._serialized_end=1120
  _REPORTTASKCOMPLETEREQUEST._serialized_start=1123
  _REPORTTASKCOMPLETEREQUEST._serialized_end=1604
  _REPORTTASKCOMPLETERESPONSE._serialized_start=1606
  _REPORTTASKCOMPLETERESPONSE._serialized_end=1634
  _REGISTERAGENTREQUEST._serialized_start=1637
  _REGISTERAGENTREQUEST._serialized_end=1846
  _REGISTERAGENTRESPONSE._serialized_start=1848
  _REGISTERAGENTRESPONSE._serialized_end=1871
  _REPORTINVENTORYREQUEST._serialized_start=1874
  _REPORTINVENTORYREQUEST._serialized_end=2038
  _REPORTINVENTORYRESPONSE._serialized_start=2040
  _REPORTINVENTORYRESPONSE._serialized_end=2096
  _AGENTENDPOINTSERVICE._serialized_start=2099
  _AGENTENDPOINTSERVICE._serialized_end=3337
# @@protoc_insertion_point(module_scope)