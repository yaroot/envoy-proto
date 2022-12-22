# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/agentendpoint/v1beta/tasks.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.osconfig.agentendpoint.v1beta import patch_jobs_pb2 as google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1beta_dot_patch__jobs__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/cloud/osconfig/agentendpoint/v1beta/tasks.proto\x12*google.cloud.osconfig.agentendpoint.v1beta\x1a\x1fgoogle/api/field_behavior.proto\x1a;google/cloud/osconfig/agentendpoint/v1beta/patch_jobs.proto\"\x86\x04\n\x04Task\x12\x0f\n\x07task_id\x18\x01 \x01(\t\x12G\n\ttask_type\x18\x02 \x01(\x0e\x32\x34.google.cloud.osconfig.agentendpoint.v1beta.TaskType\x12Q\n\x0etask_directive\x18\x03 \x01(\x0e\x32\x39.google.cloud.osconfig.agentendpoint.v1beta.TaskDirective\x12Z\n\x12\x61pply_patches_task\x18\x04 \x01(\x0b\x32<.google.cloud.osconfig.agentendpoint.v1beta.ApplyPatchesTaskH\x00\x12R\n\x0e\x65xec_step_task\x18\x05 \x01(\x0b\x32\x38.google.cloud.osconfig.agentendpoint.v1beta.ExecStepTaskH\x00\x12[\n\x0eservice_labels\x18\x06 \x03(\x0b\x32\x43.google.cloud.osconfig.agentendpoint.v1beta.Task.ServiceLabelsEntry\x1a\x34\n\x12ServiceLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\x0e\n\x0ctask_details\"r\n\x10\x41pplyPatchesTask\x12M\n\x0cpatch_config\x18\x01 \x01(\x0b\x32\x37.google.cloud.osconfig.agentendpoint.v1beta.PatchConfig\x12\x0f\n\x07\x64ry_run\x18\x03 \x01(\x08\"\xe5\x01\n\x18\x41pplyPatchesTaskProgress\x12^\n\x05state\x18\x01 \x01(\x0e\x32J.google.cloud.osconfig.agentendpoint.v1beta.ApplyPatchesTaskProgress.StateB\x03\xe0\x41\x02\"i\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07STARTED\x10\x04\x12\x17\n\x13\x44OWNLOADING_PATCHES\x10\x01\x12\x14\n\x10\x41PPLYING_PATCHES\x10\x02\x12\r\n\tREBOOTING\x10\x03\"\xd0\x01\n\x16\x41pplyPatchesTaskOutput\x12\\\n\x05state\x18\x01 \x01(\x0e\x32H.google.cloud.osconfig.agentendpoint.v1beta.ApplyPatchesTaskOutput.StateB\x03\xe0\x41\x02\"X\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tSUCCEEDED\x10\x01\x12\x1d\n\x19SUCCEEDED_REBOOT_REQUIRED\x10\x02\x12\n\n\x06\x46\x41ILED\x10\x03\"W\n\x0c\x45xecStepTask\x12G\n\texec_step\x18\x01 \x01(\x0b\x32\x34.google.cloud.osconfig.agentendpoint.v1beta.ExecStep\"\x9f\x01\n\x14\x45xecStepTaskProgress\x12Z\n\x05state\x18\x01 \x01(\x0e\x32\x46.google.cloud.osconfig.agentendpoint.v1beta.ExecStepTaskProgress.StateB\x03\xe0\x41\x02\"+\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07STARTED\x10\x01\"\xd3\x01\n\x12\x45xecStepTaskOutput\x12X\n\x05state\x18\x01 \x01(\x0e\x32\x44.google.cloud.osconfig.agentendpoint.v1beta.ExecStepTaskOutput.StateB\x03\xe0\x41\x02\x12\x16\n\texit_code\x18\x02 \x01(\x05\x42\x03\xe0\x41\x02\"K\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tCOMPLETED\x10\x01\x12\r\n\tTIMED_OUT\x10\x02\x12\r\n\tCANCELLED\x10\x03*G\n\rTaskDirective\x12\x1e\n\x1aTASK_DIRECTIVE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43ONTINUE\x10\x01\x12\x08\n\x04STOP\x10\x02*L\n\x08TaskType\x12\x19\n\x15TASK_TYPE_UNSPECIFIED\x10\x00\x12\x11\n\rAPPLY_PATCHES\x10\x01\x12\x12\n\x0e\x45XEC_STEP_TASK\x10\x02\x42\xaf\x01\n.com.google.cloud.osconfig.agentendpoint.v1betaB\x05TasksZWgoogle.golang.org/genproto/googleapis/cloud/osconfig/agentendpoint/v1beta;agentendpoint\xca\x02\x1cGoogle\\Cloud\\OsConfig\\V1betab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.osconfig.agentendpoint.v1beta.tasks_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n.com.google.cloud.osconfig.agentendpoint.v1betaB\005TasksZWgoogle.golang.org/genproto/googleapis/cloud/osconfig/agentendpoint/v1beta;agentendpoint\312\002\034Google\\Cloud\\OsConfig\\V1beta'
  _TASK_SERVICELABELSENTRY._options = None
  _TASK_SERVICELABELSENTRY._serialized_options = b'8\001'
  _APPLYPATCHESTASKPROGRESS.fields_by_name['state']._options = None
  _APPLYPATCHESTASKPROGRESS.fields_by_name['state']._serialized_options = b'\340A\002'
  _APPLYPATCHESTASKOUTPUT.fields_by_name['state']._options = None
  _APPLYPATCHESTASKOUTPUT.fields_by_name['state']._serialized_options = b'\340A\002'
  _EXECSTEPTASKPROGRESS.fields_by_name['state']._options = None
  _EXECSTEPTASKPROGRESS.fields_by_name['state']._serialized_options = b'\340A\002'
  _EXECSTEPTASKOUTPUT.fields_by_name['state']._options = None
  _EXECSTEPTASKOUTPUT.fields_by_name['state']._serialized_options = b'\340A\002'
  _EXECSTEPTASKOUTPUT.fields_by_name['exit_code']._options = None
  _EXECSTEPTASKOUTPUT.fields_by_name['exit_code']._serialized_options = b'\340A\002'
  _TASKDIRECTIVE._serialized_start=1741
  _TASKDIRECTIVE._serialized_end=1812
  _TASKTYPE._serialized_start=1814
  _TASKTYPE._serialized_end=1890
  _TASK._serialized_start=197
  _TASK._serialized_end=715
  _TASK_SERVICELABELSENTRY._serialized_start=647
  _TASK_SERVICELABELSENTRY._serialized_end=699
  _APPLYPATCHESTASK._serialized_start=717
  _APPLYPATCHESTASK._serialized_end=831
  _APPLYPATCHESTASKPROGRESS._serialized_start=834
  _APPLYPATCHESTASKPROGRESS._serialized_end=1063
  _APPLYPATCHESTASKPROGRESS_STATE._serialized_start=958
  _APPLYPATCHESTASKPROGRESS_STATE._serialized_end=1063
  _APPLYPATCHESTASKOUTPUT._serialized_start=1066
  _APPLYPATCHESTASKOUTPUT._serialized_end=1274
  _APPLYPATCHESTASKOUTPUT_STATE._serialized_start=1186
  _APPLYPATCHESTASKOUTPUT_STATE._serialized_end=1274
  _EXECSTEPTASK._serialized_start=1276
  _EXECSTEPTASK._serialized_end=1363
  _EXECSTEPTASKPROGRESS._serialized_start=1366
  _EXECSTEPTASKPROGRESS._serialized_end=1525
  _EXECSTEPTASKPROGRESS_STATE._serialized_start=1482
  _EXECSTEPTASKPROGRESS_STATE._serialized_end=1525
  _EXECSTEPTASKOUTPUT._serialized_start=1528
  _EXECSTEPTASKOUTPUT._serialized_end=1739
  _EXECSTEPTASKOUTPUT_STATE._serialized_start=1664
  _EXECSTEPTASKOUTPUT_STATE._serialized_end=1739
# @@protoc_insertion_point(module_scope)