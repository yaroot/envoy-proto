# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataplex/v1/tasks.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.dataplex.v1 import resources_pb2 as google_dot_cloud_dot_dataplex_dot_v1_dot_resources__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$google/cloud/dataplex/v1/tasks.proto\x12\x18google.cloud.dataplex.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a(google/cloud/dataplex/v1/resources.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x9f\x16\n\x04Task\x12\x32\n\x04name\x18\x01 \x01(\tB$\xe0\x41\x03\xfa\x41\x1e\n\x1c\x64\x61taplex.googleapis.com/Task\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x18\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0c\x64isplay_name\x18\x06 \x01(\tB\x03\xe0\x41\x01\x12\x33\n\x05state\x18\x07 \x01(\x0e\x32\x1f.google.cloud.dataplex.v1.StateB\x03\xe0\x41\x03\x12?\n\x06labels\x18\x08 \x03(\x0b\x32*.google.cloud.dataplex.v1.Task.LabelsEntryB\x03\xe0\x41\x01\x12\x45\n\x0ctrigger_spec\x18\x64 \x01(\x0b\x32*.google.cloud.dataplex.v1.Task.TriggerSpecB\x03\xe0\x41\x02\x12I\n\x0e\x65xecution_spec\x18\x65 \x01(\x0b\x32,.google.cloud.dataplex.v1.Task.ExecutionSpecB\x03\xe0\x41\x02\x12N\n\x10\x65xecution_status\x18\xc9\x01 \x01(\x0b\x32..google.cloud.dataplex.v1.Task.ExecutionStatusB\x03\xe0\x41\x03\x12@\n\x05spark\x18\xac\x02 \x01(\x0b\x32..google.cloud.dataplex.v1.Task.SparkTaskConfigH\x00\x12\x46\n\x08notebook\x18\xae\x02 \x01(\x0b\x32\x31.google.cloud.dataplex.v1.Task.NotebookTaskConfigH\x00\x1a\x9a\x06\n\x12InfrastructureSpec\x12X\n\x05\x62\x61tch\x18\x34 \x01(\x0b\x32G.google.cloud.dataplex.v1.Task.InfrastructureSpec.BatchComputeResourcesH\x00\x12\x62\n\x0f\x63ontainer_image\x18\x65 \x01(\x0b\x32G.google.cloud.dataplex.v1.Task.InfrastructureSpec.ContainerImageRuntimeH\x01\x12T\n\x0bvpc_network\x18\x96\x01 \x01(\x0b\x32<.google.cloud.dataplex.v1.Task.InfrastructureSpec.VpcNetworkH\x02\x1aW\n\x15\x42\x61tchComputeResources\x12\x1c\n\x0f\x65xecutors_count\x18\x01 \x01(\x05\x42\x03\xe0\x41\x01\x12 \n\x13max_executors_count\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x1a\x86\x02\n\x15\x43ontainerImageRuntime\x12\x12\n\x05image\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x16\n\tjava_jars\x18\x02 \x03(\tB\x03\xe0\x41\x01\x12\x1c\n\x0fpython_packages\x18\x03 \x03(\tB\x03\xe0\x41\x01\x12p\n\nproperties\x18\x04 \x03(\x0b\x32W.google.cloud.dataplex.v1.Task.InfrastructureSpec.ContainerImageRuntime.PropertiesEntryB\x03\xe0\x41\x01\x1a\x31\n\x0fPropertiesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1ak\n\nVpcNetwork\x12\x16\n\x07network\x18\x01 \x01(\tB\x03\xe0\x41\x01H\x00\x12\x1a\n\x0bsub_network\x18\x02 \x01(\tB\x03\xe0\x41\x01H\x00\x12\x19\n\x0cnetwork_tags\x18\x03 \x03(\tB\x03\xe0\x41\x01\x42\x0e\n\x0cnetwork_nameB\x0b\n\tresourcesB\t\n\x07runtimeB\t\n\x07network\x1a\x9a\x02\n\x0bTriggerSpec\x12\x45\n\x04type\x18\x05 \x01(\x0e\x32/.google.cloud.dataplex.v1.Task.TriggerSpec.TypeB\x06\xe0\x41\x02\xe0\x41\x05\x12\x33\n\nstart_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12\x15\n\x08\x64isabled\x18\x04 \x01(\x08\x42\x03\xe0\x41\x01\x12\x18\n\x0bmax_retries\x18\x07 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\x08schedule\x18\x64 \x01(\tB\x03\xe0\x41\x01H\x00\":\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\r\n\tON_DEMAND\x10\x01\x12\r\n\tRECURRING\x10\x02\x42\t\n\x07trigger\x1a\x95\x02\n\rExecutionSpec\x12I\n\x04\x61rgs\x18\x04 \x03(\x0b\x32\x36.google.cloud.dataplex.v1.Task.ExecutionSpec.ArgsEntryB\x03\xe0\x41\x01\x12\x1c\n\x0fservice_account\x18\x05 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x07project\x18\x07 \x01(\tB\x03\xe0\x41\x01\x12\x42\n\x1amax_job_execution_lifetime\x18\x08 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x01\x12\x14\n\x07kms_key\x18\t \x01(\tB\x03\xe0\x41\x01\x1a+\n\tArgsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\xa5\x02\n\x0fSparkTaskConfig\x12\x1b\n\x11main_jar_file_uri\x18\x64 \x01(\tH\x00\x12\x14\n\nmain_class\x18\x65 \x01(\tH\x00\x12\x1c\n\x12python_script_file\x18\x66 \x01(\tH\x00\x12\x19\n\x0fsql_script_file\x18h \x01(\tH\x00\x12\x14\n\nsql_script\x18i \x01(\tH\x00\x12\x16\n\tfile_uris\x18\x03 \x03(\tB\x03\xe0\x41\x01\x12\x19\n\x0c\x61rchive_uris\x18\x04 \x03(\tB\x03\xe0\x41\x01\x12S\n\x13infrastructure_spec\x18\x06 \x01(\x0b\x32\x31.google.cloud.dataplex.v1.Task.InfrastructureSpecB\x03\xe0\x41\x01\x42\x08\n\x06\x64river\x1a\xb3\x01\n\x12NotebookTaskConfig\x12\x15\n\x08notebook\x18\x04 \x01(\tB\x03\xe0\x41\x02\x12S\n\x13infrastructure_spec\x18\x03 \x01(\x0b\x32\x31.google.cloud.dataplex.v1.Task.InfrastructureSpecB\x03\xe0\x41\x01\x12\x16\n\tfile_uris\x18\x05 \x03(\tB\x03\xe0\x41\x01\x12\x19\n\x0c\x61rchive_uris\x18\x06 \x03(\tB\x03\xe0\x41\x01\x1a\x7f\n\x0f\x45xecutionStatus\x12\x34\n\x0bupdate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x36\n\nlatest_job\x18\t \x01(\x0b\x32\x1d.google.cloud.dataplex.v1.JobB\x03\xe0\x41\x03\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:d\xea\x41\x61\n\x1c\x64\x61taplex.googleapis.com/Task\x12\x41projects/{project}/locations/{location}/lakes/{lake}/tasks/{task}B\x08\n\x06\x63onfig\"\x88\x05\n\x03Job\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x03\xfa\x41\x1d\n\x1b\x64\x61taplex.googleapis.com/Job\x12\x10\n\x03uid\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x33\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x37\n\x05state\x18\x05 \x01(\x0e\x32#.google.cloud.dataplex.v1.Job.StateB\x03\xe0\x41\x03\x12\x18\n\x0bretry_count\x18\x06 \x01(\rB\x03\xe0\x41\x03\x12;\n\x07service\x18\x07 \x01(\x0e\x32%.google.cloud.dataplex.v1.Job.ServiceB\x03\xe0\x41\x03\x12\x18\n\x0bservice_job\x18\x08 \x01(\tB\x03\xe0\x41\x03\x12\x14\n\x07message\x18\t \x01(\tB\x03\xe0\x41\x03\"0\n\x07Service\x12\x17\n\x13SERVICE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x44\x41TAPROC\x10\x01\"r\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07RUNNING\x10\x01\x12\x0e\n\nCANCELLING\x10\x02\x12\r\n\tCANCELLED\x10\x03\x12\r\n\tSUCCEEDED\x10\x04\x12\n\n\x06\x46\x41ILED\x10\x05\x12\x0b\n\x07\x41\x42ORTED\x10\x06:n\xea\x41k\n\x1b\x64\x61taplex.googleapis.com/Job\x12Lprojects/{project}/locations/{location}/lakes/{lake}/tasks/{task}/jobs/{job}Bn\n\x1c\x63om.google.cloud.dataplex.v1B\nTasksProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/dataplex/v1;dataplexb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dataplex.v1.tasks_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.dataplex.v1B\nTasksProtoP\001Z@google.golang.org/genproto/googleapis/cloud/dataplex/v1;dataplex'
  _TASK_INFRASTRUCTURESPEC_BATCHCOMPUTERESOURCES.fields_by_name['executors_count']._options = None
  _TASK_INFRASTRUCTURESPEC_BATCHCOMPUTERESOURCES.fields_by_name['executors_count']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_BATCHCOMPUTERESOURCES.fields_by_name['max_executors_count']._options = None
  _TASK_INFRASTRUCTURESPEC_BATCHCOMPUTERESOURCES.fields_by_name['max_executors_count']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME_PROPERTIESENTRY._options = None
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME_PROPERTIESENTRY._serialized_options = b'8\001'
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['image']._options = None
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['image']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['java_jars']._options = None
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['java_jars']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['python_packages']._options = None
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['python_packages']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['properties']._options = None
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME.fields_by_name['properties']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK.fields_by_name['network']._options = None
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK.fields_by_name['network']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK.fields_by_name['sub_network']._options = None
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK.fields_by_name['sub_network']._serialized_options = b'\340A\001'
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK.fields_by_name['network_tags']._options = None
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK.fields_by_name['network_tags']._serialized_options = b'\340A\001'
  _TASK_TRIGGERSPEC.fields_by_name['type']._options = None
  _TASK_TRIGGERSPEC.fields_by_name['type']._serialized_options = b'\340A\002\340A\005'
  _TASK_TRIGGERSPEC.fields_by_name['start_time']._options = None
  _TASK_TRIGGERSPEC.fields_by_name['start_time']._serialized_options = b'\340A\001'
  _TASK_TRIGGERSPEC.fields_by_name['disabled']._options = None
  _TASK_TRIGGERSPEC.fields_by_name['disabled']._serialized_options = b'\340A\001'
  _TASK_TRIGGERSPEC.fields_by_name['max_retries']._options = None
  _TASK_TRIGGERSPEC.fields_by_name['max_retries']._serialized_options = b'\340A\001'
  _TASK_TRIGGERSPEC.fields_by_name['schedule']._options = None
  _TASK_TRIGGERSPEC.fields_by_name['schedule']._serialized_options = b'\340A\001'
  _TASK_EXECUTIONSPEC_ARGSENTRY._options = None
  _TASK_EXECUTIONSPEC_ARGSENTRY._serialized_options = b'8\001'
  _TASK_EXECUTIONSPEC.fields_by_name['args']._options = None
  _TASK_EXECUTIONSPEC.fields_by_name['args']._serialized_options = b'\340A\001'
  _TASK_EXECUTIONSPEC.fields_by_name['service_account']._options = None
  _TASK_EXECUTIONSPEC.fields_by_name['service_account']._serialized_options = b'\340A\002'
  _TASK_EXECUTIONSPEC.fields_by_name['project']._options = None
  _TASK_EXECUTIONSPEC.fields_by_name['project']._serialized_options = b'\340A\001'
  _TASK_EXECUTIONSPEC.fields_by_name['max_job_execution_lifetime']._options = None
  _TASK_EXECUTIONSPEC.fields_by_name['max_job_execution_lifetime']._serialized_options = b'\340A\001'
  _TASK_EXECUTIONSPEC.fields_by_name['kms_key']._options = None
  _TASK_EXECUTIONSPEC.fields_by_name['kms_key']._serialized_options = b'\340A\001'
  _TASK_SPARKTASKCONFIG.fields_by_name['file_uris']._options = None
  _TASK_SPARKTASKCONFIG.fields_by_name['file_uris']._serialized_options = b'\340A\001'
  _TASK_SPARKTASKCONFIG.fields_by_name['archive_uris']._options = None
  _TASK_SPARKTASKCONFIG.fields_by_name['archive_uris']._serialized_options = b'\340A\001'
  _TASK_SPARKTASKCONFIG.fields_by_name['infrastructure_spec']._options = None
  _TASK_SPARKTASKCONFIG.fields_by_name['infrastructure_spec']._serialized_options = b'\340A\001'
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['notebook']._options = None
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['notebook']._serialized_options = b'\340A\002'
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['infrastructure_spec']._options = None
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['infrastructure_spec']._serialized_options = b'\340A\001'
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['file_uris']._options = None
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['file_uris']._serialized_options = b'\340A\001'
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['archive_uris']._options = None
  _TASK_NOTEBOOKTASKCONFIG.fields_by_name['archive_uris']._serialized_options = b'\340A\001'
  _TASK_EXECUTIONSTATUS.fields_by_name['update_time']._options = None
  _TASK_EXECUTIONSTATUS.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TASK_EXECUTIONSTATUS.fields_by_name['latest_job']._options = None
  _TASK_EXECUTIONSTATUS.fields_by_name['latest_job']._serialized_options = b'\340A\003'
  _TASK_LABELSENTRY._options = None
  _TASK_LABELSENTRY._serialized_options = b'8\001'
  _TASK.fields_by_name['name']._options = None
  _TASK.fields_by_name['name']._serialized_options = b'\340A\003\372A\036\n\034dataplex.googleapis.com/Task'
  _TASK.fields_by_name['uid']._options = None
  _TASK.fields_by_name['uid']._serialized_options = b'\340A\003'
  _TASK.fields_by_name['create_time']._options = None
  _TASK.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _TASK.fields_by_name['update_time']._options = None
  _TASK.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TASK.fields_by_name['description']._options = None
  _TASK.fields_by_name['description']._serialized_options = b'\340A\001'
  _TASK.fields_by_name['display_name']._options = None
  _TASK.fields_by_name['display_name']._serialized_options = b'\340A\001'
  _TASK.fields_by_name['state']._options = None
  _TASK.fields_by_name['state']._serialized_options = b'\340A\003'
  _TASK.fields_by_name['labels']._options = None
  _TASK.fields_by_name['labels']._serialized_options = b'\340A\001'
  _TASK.fields_by_name['trigger_spec']._options = None
  _TASK.fields_by_name['trigger_spec']._serialized_options = b'\340A\002'
  _TASK.fields_by_name['execution_spec']._options = None
  _TASK.fields_by_name['execution_spec']._serialized_options = b'\340A\002'
  _TASK.fields_by_name['execution_status']._options = None
  _TASK.fields_by_name['execution_status']._serialized_options = b'\340A\003'
  _TASK._options = None
  _TASK._serialized_options = b'\352Aa\n\034dataplex.googleapis.com/Task\022Aprojects/{project}/locations/{location}/lakes/{lake}/tasks/{task}'
  _JOB.fields_by_name['name']._options = None
  _JOB.fields_by_name['name']._serialized_options = b'\340A\003\372A\035\n\033dataplex.googleapis.com/Job'
  _JOB.fields_by_name['uid']._options = None
  _JOB.fields_by_name['uid']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['start_time']._options = None
  _JOB.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['end_time']._options = None
  _JOB.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['state']._options = None
  _JOB.fields_by_name['state']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['retry_count']._options = None
  _JOB.fields_by_name['retry_count']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['service']._options = None
  _JOB.fields_by_name['service']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['service_job']._options = None
  _JOB.fields_by_name['service_job']._serialized_options = b'\340A\003'
  _JOB.fields_by_name['message']._options = None
  _JOB.fields_by_name['message']._serialized_options = b'\340A\003'
  _JOB._options = None
  _JOB._serialized_options = b'\352Ak\n\033dataplex.googleapis.com/Job\022Lprojects/{project}/locations/{location}/lakes/{lake}/tasks/{task}/jobs/{job}'
  _TASK._serialized_start=234
  _TASK._serialized_end=3081
  _TASK_INFRASTRUCTURESPEC._serialized_start=956
  _TASK_INFRASTRUCTURESPEC._serialized_end=1750
  _TASK_INFRASTRUCTURESPEC_BATCHCOMPUTERESOURCES._serialized_start=1254
  _TASK_INFRASTRUCTURESPEC_BATCHCOMPUTERESOURCES._serialized_end=1341
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME._serialized_start=1344
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME._serialized_end=1606
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME_PROPERTIESENTRY._serialized_start=1557
  _TASK_INFRASTRUCTURESPEC_CONTAINERIMAGERUNTIME_PROPERTIESENTRY._serialized_end=1606
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK._serialized_start=1608
  _TASK_INFRASTRUCTURESPEC_VPCNETWORK._serialized_end=1715
  _TASK_TRIGGERSPEC._serialized_start=1753
  _TASK_TRIGGERSPEC._serialized_end=2035
  _TASK_TRIGGERSPEC_TYPE._serialized_start=1966
  _TASK_TRIGGERSPEC_TYPE._serialized_end=2024
  _TASK_EXECUTIONSPEC._serialized_start=2038
  _TASK_EXECUTIONSPEC._serialized_end=2315
  _TASK_EXECUTIONSPEC_ARGSENTRY._serialized_start=2272
  _TASK_EXECUTIONSPEC_ARGSENTRY._serialized_end=2315
  _TASK_SPARKTASKCONFIG._serialized_start=2318
  _TASK_SPARKTASKCONFIG._serialized_end=2611
  _TASK_NOTEBOOKTASKCONFIG._serialized_start=2614
  _TASK_NOTEBOOKTASKCONFIG._serialized_end=2793
  _TASK_EXECUTIONSTATUS._serialized_start=2795
  _TASK_EXECUTIONSTATUS._serialized_end=2922
  _TASK_LABELSENTRY._serialized_start=2924
  _TASK_LABELSENTRY._serialized_end=2969
  _JOB._serialized_start=3084
  _JOB._serialized_end=3732
  _JOB_SERVICE._serialized_start=3456
  _JOB_SERVICE._serialized_end=3504
  _JOB_STATE._serialized_start=3506
  _JOB_STATE._serialized_end=3620
# @@protoc_insertion_point(module_scope)