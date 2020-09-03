# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/agentendpoint/v1/tasks.proto

from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.cloud.osconfig.agentendpoint.v1 import patch_jobs_pb2 as google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1_dot_patch__jobs__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='google/cloud/osconfig/agentendpoint/v1/tasks.proto',
  package='google.cloud.osconfig.agentendpoint.v1',
  syntax='proto3',
  serialized_options=b'\n*com.google.cloud.osconfig.agentendpoint.v1B\005TasksZSgoogle.golang.org/genproto/googleapis/cloud/osconfig/agentendpoint/v1;agentendpoint',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n2google/cloud/osconfig/agentendpoint/v1/tasks.proto\x12&google.cloud.osconfig.agentendpoint.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x37google/cloud/osconfig/agentendpoint/v1/patch_jobs.proto\"\xf2\x03\n\x04Task\x12\x0f\n\x07task_id\x18\x01 \x01(\t\x12\x43\n\ttask_type\x18\x02 \x01(\x0e\x32\x30.google.cloud.osconfig.agentendpoint.v1.TaskType\x12M\n\x0etask_directive\x18\x03 \x01(\x0e\x32\x35.google.cloud.osconfig.agentendpoint.v1.TaskDirective\x12V\n\x12\x61pply_patches_task\x18\x04 \x01(\x0b\x32\x38.google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskH\x00\x12N\n\x0e\x65xec_step_task\x18\x05 \x01(\x0b\x32\x34.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskH\x00\x12W\n\x0eservice_labels\x18\x06 \x03(\x0b\x32?.google.cloud.osconfig.agentendpoint.v1.Task.ServiceLabelsEntry\x1a\x34\n\x12ServiceLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\x0e\n\x0ctask_details\"n\n\x10\x41pplyPatchesTask\x12I\n\x0cpatch_config\x18\x01 \x01(\x0b\x32\x33.google.cloud.osconfig.agentendpoint.v1.PatchConfig\x12\x0f\n\x07\x64ry_run\x18\x03 \x01(\x08\"\xe1\x01\n\x18\x41pplyPatchesTaskProgress\x12Z\n\x05state\x18\x01 \x01(\x0e\x32\x46.google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskProgress.StateB\x03\xe0\x41\x02\"i\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07STARTED\x10\x04\x12\x17\n\x13\x44OWNLOADING_PATCHES\x10\x01\x12\x14\n\x10\x41PPLYING_PATCHES\x10\x02\x12\r\n\tREBOOTING\x10\x03\"\xcc\x01\n\x16\x41pplyPatchesTaskOutput\x12X\n\x05state\x18\x01 \x01(\x0e\x32\x44.google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskOutput.StateB\x03\xe0\x41\x02\"X\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tSUCCEEDED\x10\x01\x12\x1d\n\x19SUCCEEDED_REBOOT_REQUIRED\x10\x02\x12\n\n\x06\x46\x41ILED\x10\x03\"S\n\x0c\x45xecStepTask\x12\x43\n\texec_step\x18\x01 \x01(\x0b\x32\x30.google.cloud.osconfig.agentendpoint.v1.ExecStep\"\x9b\x01\n\x14\x45xecStepTaskProgress\x12V\n\x05state\x18\x01 \x01(\x0e\x32\x42.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskProgress.StateB\x03\xe0\x41\x02\"+\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07STARTED\x10\x01\"\xcf\x01\n\x12\x45xecStepTaskOutput\x12T\n\x05state\x18\x01 \x01(\x0e\x32@.google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.StateB\x03\xe0\x41\x02\x12\x16\n\texit_code\x18\x02 \x01(\x05\x42\x03\xe0\x41\x02\"K\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tCOMPLETED\x10\x01\x12\r\n\tTIMED_OUT\x10\x02\x12\r\n\tCANCELLED\x10\x03*G\n\rTaskDirective\x12\x1e\n\x1aTASK_DIRECTIVE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43ONTINUE\x10\x01\x12\x08\n\x04STOP\x10\x02*L\n\x08TaskType\x12\x19\n\x15TASK_TYPE_UNSPECIFIED\x10\x00\x12\x11\n\rAPPLY_PATCHES\x10\x01\x12\x12\n\x0e\x45XEC_STEP_TASK\x10\x02\x42\x88\x01\n*com.google.cloud.osconfig.agentendpoint.v1B\x05TasksZSgoogle.golang.org/genproto/googleapis/cloud/osconfig/agentendpoint/v1;agentendpointb\x06proto3'
  ,
  dependencies=[google_dot_api_dot_field__behavior__pb2.DESCRIPTOR,google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1_dot_patch__jobs__pb2.DESCRIPTOR,])

_TASKDIRECTIVE = _descriptor.EnumDescriptor(
  name='TaskDirective',
  full_name='google.cloud.osconfig.agentendpoint.v1.TaskDirective',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TASK_DIRECTIVE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CONTINUE', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STOP', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1685,
  serialized_end=1756,
)
_sym_db.RegisterEnumDescriptor(_TASKDIRECTIVE)

TaskDirective = enum_type_wrapper.EnumTypeWrapper(_TASKDIRECTIVE)
_TASKTYPE = _descriptor.EnumDescriptor(
  name='TaskType',
  full_name='google.cloud.osconfig.agentendpoint.v1.TaskType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TASK_TYPE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='APPLY_PATCHES', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EXEC_STEP_TASK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1758,
  serialized_end=1834,
)
_sym_db.RegisterEnumDescriptor(_TASKTYPE)

TaskType = enum_type_wrapper.EnumTypeWrapper(_TASKTYPE)
TASK_DIRECTIVE_UNSPECIFIED = 0
CONTINUE = 1
STOP = 2
TASK_TYPE_UNSPECIFIED = 0
APPLY_PATCHES = 1
EXEC_STEP_TASK = 2


_APPLYPATCHESTASKPROGRESS_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskProgress.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STARTED', index=1, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DOWNLOADING_PATCHES', index=2, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='APPLYING_PATCHES', index=3, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='REBOOTING', index=4, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=918,
  serialized_end=1023,
)
_sym_db.RegisterEnumDescriptor(_APPLYPATCHESTASKPROGRESS_STATE)

_APPLYPATCHESTASKOUTPUT_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskOutput.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SUCCEEDED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SUCCEEDED_REBOOT_REQUIRED', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FAILED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1142,
  serialized_end=1230,
)
_sym_db.RegisterEnumDescriptor(_APPLYPATCHESTASKOUTPUT_STATE)

_EXECSTEPTASKPROGRESS_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskProgress.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='STARTED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1430,
  serialized_end=1473,
)
_sym_db.RegisterEnumDescriptor(_EXECSTEPTASKPROGRESS_STATE)

_EXECSTEPTASKOUTPUT_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='STATE_UNSPECIFIED', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='COMPLETED', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='TIMED_OUT', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CANCELLED', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1608,
  serialized_end=1683,
)
_sym_db.RegisterEnumDescriptor(_EXECSTEPTASKOUTPUT_STATE)


_TASK_SERVICELABELSENTRY = _descriptor.Descriptor(
  name='ServiceLabelsEntry',
  full_name='google.cloud.osconfig.agentendpoint.v1.Task.ServiceLabelsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='google.cloud.osconfig.agentendpoint.v1.Task.ServiceLabelsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='google.cloud.osconfig.agentendpoint.v1.Task.ServiceLabelsEntry.value', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=615,
  serialized_end=667,
)

_TASK = _descriptor.Descriptor(
  name='Task',
  full_name='google.cloud.osconfig.agentendpoint.v1.Task',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='task_id', full_name='google.cloud.osconfig.agentendpoint.v1.Task.task_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='task_type', full_name='google.cloud.osconfig.agentendpoint.v1.Task.task_type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='task_directive', full_name='google.cloud.osconfig.agentendpoint.v1.Task.task_directive', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='apply_patches_task', full_name='google.cloud.osconfig.agentendpoint.v1.Task.apply_patches_task', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exec_step_task', full_name='google.cloud.osconfig.agentendpoint.v1.Task.exec_step_task', index=4,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='service_labels', full_name='google.cloud.osconfig.agentendpoint.v1.Task.service_labels', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_TASK_SERVICELABELSENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='task_details', full_name='google.cloud.osconfig.agentendpoint.v1.Task.task_details',
      index=0, containing_type=None,
      create_key=_descriptor._internal_create_key,
    fields=[]),
  ],
  serialized_start=185,
  serialized_end=683,
)


_APPLYPATCHESTASK = _descriptor.Descriptor(
  name='ApplyPatchesTask',
  full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTask',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='patch_config', full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTask.patch_config', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='dry_run', full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTask.dry_run', index=1,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=685,
  serialized_end=795,
)


_APPLYPATCHESTASKPROGRESS = _descriptor.Descriptor(
  name='ApplyPatchesTaskProgress',
  full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskProgress',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskProgress.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _APPLYPATCHESTASKPROGRESS_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=798,
  serialized_end=1023,
)


_APPLYPATCHESTASKOUTPUT = _descriptor.Descriptor(
  name='ApplyPatchesTaskOutput',
  full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskOutput',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskOutput.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _APPLYPATCHESTASKOUTPUT_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1026,
  serialized_end=1230,
)


_EXECSTEPTASK = _descriptor.Descriptor(
  name='ExecStepTask',
  full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTask',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='exec_step', full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTask.exec_step', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=1232,
  serialized_end=1315,
)


_EXECSTEPTASKPROGRESS = _descriptor.Descriptor(
  name='ExecStepTaskProgress',
  full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskProgress',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskProgress.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _EXECSTEPTASKPROGRESS_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1318,
  serialized_end=1473,
)


_EXECSTEPTASKOUTPUT = _descriptor.Descriptor(
  name='ExecStepTaskOutput',
  full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.state', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='exit_code', full_name='google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput.exit_code', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\340A\002', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _EXECSTEPTASKOUTPUT_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1476,
  serialized_end=1683,
)

_TASK_SERVICELABELSENTRY.containing_type = _TASK
_TASK.fields_by_name['task_type'].enum_type = _TASKTYPE
_TASK.fields_by_name['task_directive'].enum_type = _TASKDIRECTIVE
_TASK.fields_by_name['apply_patches_task'].message_type = _APPLYPATCHESTASK
_TASK.fields_by_name['exec_step_task'].message_type = _EXECSTEPTASK
_TASK.fields_by_name['service_labels'].message_type = _TASK_SERVICELABELSENTRY
_TASK.oneofs_by_name['task_details'].fields.append(
  _TASK.fields_by_name['apply_patches_task'])
_TASK.fields_by_name['apply_patches_task'].containing_oneof = _TASK.oneofs_by_name['task_details']
_TASK.oneofs_by_name['task_details'].fields.append(
  _TASK.fields_by_name['exec_step_task'])
_TASK.fields_by_name['exec_step_task'].containing_oneof = _TASK.oneofs_by_name['task_details']
_APPLYPATCHESTASK.fields_by_name['patch_config'].message_type = google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1_dot_patch__jobs__pb2._PATCHCONFIG
_APPLYPATCHESTASKPROGRESS.fields_by_name['state'].enum_type = _APPLYPATCHESTASKPROGRESS_STATE
_APPLYPATCHESTASKPROGRESS_STATE.containing_type = _APPLYPATCHESTASKPROGRESS
_APPLYPATCHESTASKOUTPUT.fields_by_name['state'].enum_type = _APPLYPATCHESTASKOUTPUT_STATE
_APPLYPATCHESTASKOUTPUT_STATE.containing_type = _APPLYPATCHESTASKOUTPUT
_EXECSTEPTASK.fields_by_name['exec_step'].message_type = google_dot_cloud_dot_osconfig_dot_agentendpoint_dot_v1_dot_patch__jobs__pb2._EXECSTEP
_EXECSTEPTASKPROGRESS.fields_by_name['state'].enum_type = _EXECSTEPTASKPROGRESS_STATE
_EXECSTEPTASKPROGRESS_STATE.containing_type = _EXECSTEPTASKPROGRESS
_EXECSTEPTASKOUTPUT.fields_by_name['state'].enum_type = _EXECSTEPTASKOUTPUT_STATE
_EXECSTEPTASKOUTPUT_STATE.containing_type = _EXECSTEPTASKOUTPUT
DESCRIPTOR.message_types_by_name['Task'] = _TASK
DESCRIPTOR.message_types_by_name['ApplyPatchesTask'] = _APPLYPATCHESTASK
DESCRIPTOR.message_types_by_name['ApplyPatchesTaskProgress'] = _APPLYPATCHESTASKPROGRESS
DESCRIPTOR.message_types_by_name['ApplyPatchesTaskOutput'] = _APPLYPATCHESTASKOUTPUT
DESCRIPTOR.message_types_by_name['ExecStepTask'] = _EXECSTEPTASK
DESCRIPTOR.message_types_by_name['ExecStepTaskProgress'] = _EXECSTEPTASKPROGRESS
DESCRIPTOR.message_types_by_name['ExecStepTaskOutput'] = _EXECSTEPTASKOUTPUT
DESCRIPTOR.enum_types_by_name['TaskDirective'] = _TASKDIRECTIVE
DESCRIPTOR.enum_types_by_name['TaskType'] = _TASKTYPE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Task = _reflection.GeneratedProtocolMessageType('Task', (_message.Message,), {

  'ServiceLabelsEntry' : _reflection.GeneratedProtocolMessageType('ServiceLabelsEntry', (_message.Message,), {
    'DESCRIPTOR' : _TASK_SERVICELABELSENTRY,
    '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
    # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.Task.ServiceLabelsEntry)
    })
  ,
  'DESCRIPTOR' : _TASK,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.Task)
  })
_sym_db.RegisterMessage(Task)
_sym_db.RegisterMessage(Task.ServiceLabelsEntry)

ApplyPatchesTask = _reflection.GeneratedProtocolMessageType('ApplyPatchesTask', (_message.Message,), {
  'DESCRIPTOR' : _APPLYPATCHESTASK,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTask)
  })
_sym_db.RegisterMessage(ApplyPatchesTask)

ApplyPatchesTaskProgress = _reflection.GeneratedProtocolMessageType('ApplyPatchesTaskProgress', (_message.Message,), {
  'DESCRIPTOR' : _APPLYPATCHESTASKPROGRESS,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskProgress)
  })
_sym_db.RegisterMessage(ApplyPatchesTaskProgress)

ApplyPatchesTaskOutput = _reflection.GeneratedProtocolMessageType('ApplyPatchesTaskOutput', (_message.Message,), {
  'DESCRIPTOR' : _APPLYPATCHESTASKOUTPUT,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ApplyPatchesTaskOutput)
  })
_sym_db.RegisterMessage(ApplyPatchesTaskOutput)

ExecStepTask = _reflection.GeneratedProtocolMessageType('ExecStepTask', (_message.Message,), {
  'DESCRIPTOR' : _EXECSTEPTASK,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ExecStepTask)
  })
_sym_db.RegisterMessage(ExecStepTask)

ExecStepTaskProgress = _reflection.GeneratedProtocolMessageType('ExecStepTaskProgress', (_message.Message,), {
  'DESCRIPTOR' : _EXECSTEPTASKPROGRESS,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskProgress)
  })
_sym_db.RegisterMessage(ExecStepTaskProgress)

ExecStepTaskOutput = _reflection.GeneratedProtocolMessageType('ExecStepTaskOutput', (_message.Message,), {
  'DESCRIPTOR' : _EXECSTEPTASKOUTPUT,
  '__module__' : 'google.cloud.osconfig.agentendpoint.v1.tasks_pb2'
  # @@protoc_insertion_point(class_scope:google.cloud.osconfig.agentendpoint.v1.ExecStepTaskOutput)
  })
_sym_db.RegisterMessage(ExecStepTaskOutput)


DESCRIPTOR._options = None
_TASK_SERVICELABELSENTRY._options = None
_APPLYPATCHESTASKPROGRESS.fields_by_name['state']._options = None
_APPLYPATCHESTASKOUTPUT.fields_by_name['state']._options = None
_EXECSTEPTASKPROGRESS.fields_by_name['state']._options = None
_EXECSTEPTASKOUTPUT.fields_by_name['state']._options = None
_EXECSTEPTASKOUTPUT.fields_by_name['exit_code']._options = None
# @@protoc_insertion_point(module_scope)
