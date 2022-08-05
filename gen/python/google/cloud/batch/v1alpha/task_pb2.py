# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/batch/v1alpha/task.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.batch.v1alpha import volume_pb2 as google_dot_cloud_dot_batch_dot_v1alpha_dot_volume__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%google/cloud/batch/v1alpha/task.proto\x12\x1agoogle.cloud.batch.v1alpha\x1a\x19google/api/resource.proto\x1a\'google/cloud/batch/v1alpha/volume.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"b\n\x0f\x43omputeResource\x12\x11\n\tcpu_milli\x18\x01 \x01(\x03\x12\x12\n\nmemory_mib\x18\x02 \x01(\x03\x12\x11\n\tgpu_count\x18\x03 \x01(\x03\x12\x15\n\rboot_disk_mib\x18\x04 \x01(\x03\"\xa3\x01\n\x0bStatusEvent\x12\x0c\n\x04type\x18\x03 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x01 \x01(\t\x12.\n\nevent_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x41\n\x0etask_execution\x18\x04 \x01(\x0b\x32).google.cloud.batch.v1alpha.TaskExecution\"\"\n\rTaskExecution\x12\x11\n\texit_code\x18\x01 \x01(\x05\"\xec\x01\n\nTaskStatus\x12;\n\x05state\x18\x01 \x01(\x0e\x32,.google.cloud.batch.v1alpha.TaskStatus.State\x12>\n\rstatus_events\x18\x02 \x03(\x0b\x32\'.google.cloud.batch.v1alpha.StatusEvent\"a\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0c\n\x08\x41SSIGNED\x10\x02\x12\x0b\n\x07RUNNING\x10\x03\x12\n\n\x06\x46\x41ILED\x10\x04\x12\r\n\tSUCCEEDED\x10\x05\"\xf7\x05\n\x08Runnable\x12\x43\n\tcontainer\x18\x01 \x01(\x0b\x32..google.cloud.batch.v1alpha.Runnable.ContainerH\x00\x12=\n\x06script\x18\x02 \x01(\x0b\x32+.google.cloud.batch.v1alpha.Runnable.ScriptH\x00\x12?\n\x07\x62\x61rrier\x18\x06 \x01(\x0b\x32,.google.cloud.batch.v1alpha.Runnable.BarrierH\x00\x12\x1a\n\x12ignore_exit_status\x18\x03 \x01(\x08\x12\x12\n\nbackground\x18\x04 \x01(\x08\x12\x12\n\nalways_run\x18\x05 \x01(\x08\x12<\n\x0b\x65nvironment\x18\x07 \x01(\x0b\x32\'.google.cloud.batch.v1alpha.Environment\x12*\n\x07timeout\x18\x08 \x01(\x0b\x32\x19.google.protobuf.Duration\x12@\n\x06labels\x18\t \x03(\x0b\x32\x30.google.cloud.batch.v1alpha.Runnable.LabelsEntry\x1a\xaa\x01\n\tContainer\x12\x11\n\timage_uri\x18\x01 \x01(\t\x12\x10\n\x08\x63ommands\x18\x02 \x03(\t\x12\x12\n\nentrypoint\x18\x03 \x01(\t\x12\x0f\n\x07volumes\x18\x07 \x03(\t\x12\x0f\n\x07options\x18\x08 \x01(\t\x12\x1e\n\x16\x62lock_external_network\x18\t \x01(\x08\x12\x10\n\x08username\x18\n \x01(\t\x12\x10\n\x08password\x18\x0b \x01(\t\x1a\x33\n\x06Script\x12\x0e\n\x04path\x18\x01 \x01(\tH\x00\x12\x0e\n\x04text\x18\x02 \x01(\tH\x00\x42\t\n\x07\x63ommand\x1a\x17\n\x07\x42\x61rrier\x12\x0c\n\x04name\x18\x01 \x01(\t\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\x0c\n\nexecutable\"\x9b\x04\n\x08TaskSpec\x12\x37\n\trunnables\x18\x08 \x03(\x0b\x32$.google.cloud.batch.v1alpha.Runnable\x12\x45\n\x10\x63ompute_resource\x18\x03 \x01(\x0b\x32+.google.cloud.batch.v1alpha.ComputeResource\x12\x33\n\x10max_run_duration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x17\n\x0fmax_retry_count\x18\x05 \x01(\x05\x12G\n\x12lifecycle_policies\x18\t \x03(\x0b\x32+.google.cloud.batch.v1alpha.LifecyclePolicy\x12P\n\x0c\x65nvironments\x18\x06 \x03(\x0b\x32\x36.google.cloud.batch.v1alpha.TaskSpec.EnvironmentsEntryB\x02\x18\x01\x12\x33\n\x07volumes\x18\x07 \x03(\x0b\x32\".google.cloud.batch.v1alpha.Volume\x12<\n\x0b\x65nvironment\x18\n \x01(\x0b\x32\'.google.cloud.batch.v1alpha.Environment\x1a\x33\n\x11\x45nvironmentsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x94\x02\n\x0fLifecyclePolicy\x12\x42\n\x06\x61\x63tion\x18\x01 \x01(\x0e\x32\x32.google.cloud.batch.v1alpha.LifecyclePolicy.Action\x12U\n\x10\x61\x63tion_condition\x18\x02 \x01(\x0b\x32;.google.cloud.batch.v1alpha.LifecyclePolicy.ActionCondition\x1a%\n\x0f\x41\x63tionCondition\x12\x12\n\nexit_codes\x18\x01 \x03(\x05\"?\n\x06\x41\x63tion\x12\x16\n\x12\x41\x43TION_UNSPECIFIED\x10\x00\x12\x0e\n\nRETRY_TASK\x10\x01\x12\r\n\tFAIL_TASK\x10\x02\"\xc5\x01\n\x04Task\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x36\n\x06status\x18\x02 \x01(\x0b\x32&.google.cloud.batch.v1alpha.TaskStatus:w\xea\x41t\n\x19\x62\x61tch.googleapis.com/Task\x12Wprojects/{project}/locations/{location}/jobs/{job}/taskGroups/{task_group}/tasks/{task}\"\x9e\x03\n\x0b\x45nvironment\x12I\n\tvariables\x18\x01 \x03(\x0b\x32\x36.google.cloud.batch.v1alpha.Environment.VariablesEntry\x12V\n\x10secret_variables\x18\x02 \x03(\x0b\x32<.google.cloud.batch.v1alpha.Environment.SecretVariablesEntry\x12N\n\x13\x65ncrypted_variables\x18\x03 \x01(\x0b\x32\x31.google.cloud.batch.v1alpha.Environment.KMSEnvMap\x1a\x32\n\tKMSEnvMap\x12\x10\n\x08key_name\x18\x01 \x01(\t\x12\x13\n\x0b\x63ipher_text\x18\x02 \x01(\t\x1a\x30\n\x0eVariablesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\x36\n\x14SecretVariablesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\xce\x01\n\x1e\x63om.google.cloud.batch.v1alphaB\tTaskProtoP\x01Z?google.golang.org/genproto/googleapis/cloud/batch/v1alpha;batch\xa2\x02\x03GCB\xaa\x02\x1aGoogle.Cloud.Batch.V1Alpha\xca\x02\x1aGoogle\\Cloud\\Batch\\V1alpha\xea\x02\x1dGoogle::Cloud::Batch::V1alphab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.batch.v1alpha.task_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.batch.v1alphaB\tTaskProtoP\001Z?google.golang.org/genproto/googleapis/cloud/batch/v1alpha;batch\242\002\003GCB\252\002\032Google.Cloud.Batch.V1Alpha\312\002\032Google\\Cloud\\Batch\\V1alpha\352\002\035Google::Cloud::Batch::V1alpha'
  _RUNNABLE_LABELSENTRY._options = None
  _RUNNABLE_LABELSENTRY._serialized_options = b'8\001'
  _TASKSPEC_ENVIRONMENTSENTRY._options = None
  _TASKSPEC_ENVIRONMENTSENTRY._serialized_options = b'8\001'
  _TASKSPEC.fields_by_name['environments']._options = None
  _TASKSPEC.fields_by_name['environments']._serialized_options = b'\030\001'
  _TASK._options = None
  _TASK._serialized_options = b'\352At\n\031batch.googleapis.com/Task\022Wprojects/{project}/locations/{location}/jobs/{job}/taskGroups/{task_group}/tasks/{task}'
  _ENVIRONMENT_VARIABLESENTRY._options = None
  _ENVIRONMENT_VARIABLESENTRY._serialized_options = b'8\001'
  _ENVIRONMENT_SECRETVARIABLESENTRY._options = None
  _ENVIRONMENT_SECRETVARIABLESENTRY._serialized_options = b'8\001'
  _COMPUTERESOURCE._serialized_start=202
  _COMPUTERESOURCE._serialized_end=300
  _STATUSEVENT._serialized_start=303
  _STATUSEVENT._serialized_end=466
  _TASKEXECUTION._serialized_start=468
  _TASKEXECUTION._serialized_end=502
  _TASKSTATUS._serialized_start=505
  _TASKSTATUS._serialized_end=741
  _TASKSTATUS_STATE._serialized_start=644
  _TASKSTATUS_STATE._serialized_end=741
  _RUNNABLE._serialized_start=744
  _RUNNABLE._serialized_end=1503
  _RUNNABLE_CONTAINER._serialized_start=1194
  _RUNNABLE_CONTAINER._serialized_end=1364
  _RUNNABLE_SCRIPT._serialized_start=1366
  _RUNNABLE_SCRIPT._serialized_end=1417
  _RUNNABLE_BARRIER._serialized_start=1419
  _RUNNABLE_BARRIER._serialized_end=1442
  _RUNNABLE_LABELSENTRY._serialized_start=1444
  _RUNNABLE_LABELSENTRY._serialized_end=1489
  _TASKSPEC._serialized_start=1506
  _TASKSPEC._serialized_end=2045
  _TASKSPEC_ENVIRONMENTSENTRY._serialized_start=1994
  _TASKSPEC_ENVIRONMENTSENTRY._serialized_end=2045
  _LIFECYCLEPOLICY._serialized_start=2048
  _LIFECYCLEPOLICY._serialized_end=2324
  _LIFECYCLEPOLICY_ACTIONCONDITION._serialized_start=2222
  _LIFECYCLEPOLICY_ACTIONCONDITION._serialized_end=2259
  _LIFECYCLEPOLICY_ACTION._serialized_start=2261
  _LIFECYCLEPOLICY_ACTION._serialized_end=2324
  _TASK._serialized_start=2327
  _TASK._serialized_end=2524
  _ENVIRONMENT._serialized_start=2527
  _ENVIRONMENT._serialized_end=2941
  _ENVIRONMENT_KMSENVMAP._serialized_start=2785
  _ENVIRONMENT_KMSENVMAP._serialized_end=2835
  _ENVIRONMENT_VARIABLESENTRY._serialized_start=2837
  _ENVIRONMENT_VARIABLESENTRY._serialized_end=2885
  _ENVIRONMENT_SECRETVARIABLESENTRY._serialized_start=2887
  _ENVIRONMENT_SECRETVARIABLESENTRY._serialized_end=2941
# @@protoc_insertion_point(module_scope)
