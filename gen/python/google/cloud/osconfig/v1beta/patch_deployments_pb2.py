# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/osconfig/v1beta/patch_deployments.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.osconfig.v1beta import patch_jobs_pb2 as google_dot_cloud_dot_osconfig_dot_v1beta_dot_patch__jobs__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import datetime_pb2 as google_dot_type_dot_datetime__pb2
from google.type import dayofweek_pb2 as google_dot_type_dot_dayofweek__pb2
from google.type import timeofday_pb2 as google_dot_type_dot_timeofday__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/cloud/osconfig/v1beta/patch_deployments.proto\x12\x1cgoogle.cloud.osconfig.v1beta\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a-google/cloud/osconfig/v1beta/patch_jobs.proto\x1a\x1egoogle/protobuf/duration.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1agoogle/type/datetime.proto\x1a\x1bgoogle/type/dayofweek.proto\x1a\x1bgoogle/type/timeofday.proto\"\x84\x07\n\x0fPatchDeployment\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x18\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x03\xe0\x41\x01\x12O\n\x0finstance_filter\x18\x03 \x01(\x0b\x32\x31.google.cloud.osconfig.v1beta.PatchInstanceFilterB\x03\xe0\x41\x02\x12\x44\n\x0cpatch_config\x18\x04 \x01(\x0b\x32).google.cloud.osconfig.v1beta.PatchConfigB\x03\xe0\x41\x01\x12\x30\n\x08\x64uration\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x01\x12O\n\x11one_time_schedule\x18\x06 \x01(\x0b\x32-.google.cloud.osconfig.v1beta.OneTimeScheduleB\x03\xe0\x41\x02H\x00\x12R\n\x12recurring_schedule\x18\x07 \x01(\x0b\x32/.google.cloud.osconfig.v1beta.RecurringScheduleB\x03\xe0\x41\x02H\x00\x12\x34\n\x0b\x63reate_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12:\n\x11last_execute_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12@\n\x07rollout\x18\x0b \x01(\x0b\x32*.google.cloud.osconfig.v1beta.PatchRolloutB\x03\xe0\x41\x01\x12G\n\x05state\x18\x0c \x01(\x0e\x32\x33.google.cloud.osconfig.v1beta.PatchDeployment.StateB\x03\xe0\x41\x03\"6\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\n\n\x06\x41\x43TIVE\x10\x01\x12\n\n\x06PAUSED\x10\x02:d\xea\x41\x61\n\'osconfig.googleapis.com/PatchDeployment\x12\x36projects/{project}/patchDeployments/{patch_deployment}B\n\n\x08schedule\"H\n\x0fOneTimeSchedule\x12\x35\n\x0c\x65xecute_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\"\x92\x05\n\x11RecurringSchedule\x12-\n\ttime_zone\x18\x01 \x01(\x0b\x32\x15.google.type.TimeZoneB\x03\xe0\x41\x02\x12\x33\n\nstart_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12\x31\n\x08\x65nd_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x01\x12\x30\n\x0btime_of_day\x18\x04 \x01(\x0b\x32\x16.google.type.TimeOfDayB\x03\xe0\x41\x02\x12Q\n\tfrequency\x18\x05 \x01(\x0e\x32\x39.google.cloud.osconfig.v1beta.RecurringSchedule.FrequencyB\x03\xe0\x41\x02\x12\x43\n\x06weekly\x18\x06 \x01(\x0b\x32,.google.cloud.osconfig.v1beta.WeeklyScheduleB\x03\xe0\x41\x02H\x00\x12\x45\n\x07monthly\x18\x07 \x01(\x0b\x32-.google.cloud.osconfig.v1beta.MonthlyScheduleB\x03\xe0\x41\x02H\x00\x12:\n\x11last_execute_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12:\n\x11next_execute_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"J\n\tFrequency\x12\x19\n\x15\x46REQUENCY_UNSPECIFIED\x10\x00\x12\n\n\x06WEEKLY\x10\x01\x12\x0b\n\x07MONTHLY\x10\x02\x12\t\n\x05\x44\x41ILY\x10\x03\x42\x11\n\x0fschedule_config\"B\n\x0eWeeklySchedule\x12\x30\n\x0b\x64\x61y_of_week\x18\x01 \x01(\x0e\x32\x16.google.type.DayOfWeekB\x03\xe0\x41\x02\"\x8b\x01\n\x0fMonthlySchedule\x12N\n\x11week_day_of_month\x18\x01 \x01(\x0b\x32,.google.cloud.osconfig.v1beta.WeekDayOfMonthB\x03\xe0\x41\x02H\x00\x12\x18\n\tmonth_day\x18\x02 \x01(\x05\x42\x03\xe0\x41\x02H\x00\x42\x0e\n\x0c\x64\x61y_of_month\"v\n\x0eWeekDayOfMonth\x12\x19\n\x0cweek_ordinal\x18\x01 \x01(\x05\x42\x03\xe0\x41\x02\x12\x30\n\x0b\x64\x61y_of_week\x18\x02 \x01(\x0e\x32\x16.google.type.DayOfWeekB\x03\xe0\x41\x02\x12\x17\n\nday_offset\x18\x03 \x01(\x05\x42\x03\xe0\x41\x01\"\xa3\x01\n\x1c\x43reatePatchDeploymentRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12 \n\x13patch_deployment_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12L\n\x10patch_deployment\x18\x03 \x01(\x0b\x32-.google.cloud.osconfig.v1beta.PatchDeploymentB\x03\xe0\x41\x02\".\n\x19GetPatchDeploymentRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"c\n\x1bListPatchDeploymentsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tpage_size\x18\x02 \x01(\x05\x42\x03\xe0\x41\x01\x12\x17\n\npage_token\x18\x03 \x01(\tB\x03\xe0\x41\x01\"\x81\x01\n\x1cListPatchDeploymentsResponse\x12H\n\x11patch_deployments\x18\x01 \x03(\x0b\x32-.google.cloud.osconfig.v1beta.PatchDeployment\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"1\n\x1c\x44\x65letePatchDeploymentRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\"\xa2\x01\n\x1cUpdatePatchDeploymentRequest\x12L\n\x10patch_deployment\x18\x01 \x01(\x0b\x32-.google.cloud.osconfig.v1beta.PatchDeploymentB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"\\\n\x1bPausePatchDeploymentRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'osconfig.googleapis.com/PatchDeployment\"]\n\x1cResumePatchDeploymentRequest\x12=\n\x04name\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\n\'osconfig.googleapis.com/PatchDeploymentBz\n com.google.cloud.osconfig.v1betaB\x10PatchDeploymentsZDgoogle.golang.org/genproto/googleapis/cloud/osconfig/v1beta;osconfigb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.osconfig.v1beta.patch_deployments_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.google.cloud.osconfig.v1betaB\020PatchDeploymentsZDgoogle.golang.org/genproto/googleapis/cloud/osconfig/v1beta;osconfig'
  _PATCHDEPLOYMENT.fields_by_name['description']._options = None
  _PATCHDEPLOYMENT.fields_by_name['description']._serialized_options = b'\340A\001'
  _PATCHDEPLOYMENT.fields_by_name['instance_filter']._options = None
  _PATCHDEPLOYMENT.fields_by_name['instance_filter']._serialized_options = b'\340A\002'
  _PATCHDEPLOYMENT.fields_by_name['patch_config']._options = None
  _PATCHDEPLOYMENT.fields_by_name['patch_config']._serialized_options = b'\340A\001'
  _PATCHDEPLOYMENT.fields_by_name['duration']._options = None
  _PATCHDEPLOYMENT.fields_by_name['duration']._serialized_options = b'\340A\001'
  _PATCHDEPLOYMENT.fields_by_name['one_time_schedule']._options = None
  _PATCHDEPLOYMENT.fields_by_name['one_time_schedule']._serialized_options = b'\340A\002'
  _PATCHDEPLOYMENT.fields_by_name['recurring_schedule']._options = None
  _PATCHDEPLOYMENT.fields_by_name['recurring_schedule']._serialized_options = b'\340A\002'
  _PATCHDEPLOYMENT.fields_by_name['create_time']._options = None
  _PATCHDEPLOYMENT.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _PATCHDEPLOYMENT.fields_by_name['update_time']._options = None
  _PATCHDEPLOYMENT.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _PATCHDEPLOYMENT.fields_by_name['last_execute_time']._options = None
  _PATCHDEPLOYMENT.fields_by_name['last_execute_time']._serialized_options = b'\340A\003'
  _PATCHDEPLOYMENT.fields_by_name['rollout']._options = None
  _PATCHDEPLOYMENT.fields_by_name['rollout']._serialized_options = b'\340A\001'
  _PATCHDEPLOYMENT.fields_by_name['state']._options = None
  _PATCHDEPLOYMENT.fields_by_name['state']._serialized_options = b'\340A\003'
  _PATCHDEPLOYMENT._options = None
  _PATCHDEPLOYMENT._serialized_options = b'\352Aa\n\'osconfig.googleapis.com/PatchDeployment\0226projects/{project}/patchDeployments/{patch_deployment}'
  _ONETIMESCHEDULE.fields_by_name['execute_time']._options = None
  _ONETIMESCHEDULE.fields_by_name['execute_time']._serialized_options = b'\340A\002'
  _RECURRINGSCHEDULE.fields_by_name['time_zone']._options = None
  _RECURRINGSCHEDULE.fields_by_name['time_zone']._serialized_options = b'\340A\002'
  _RECURRINGSCHEDULE.fields_by_name['start_time']._options = None
  _RECURRINGSCHEDULE.fields_by_name['start_time']._serialized_options = b'\340A\001'
  _RECURRINGSCHEDULE.fields_by_name['end_time']._options = None
  _RECURRINGSCHEDULE.fields_by_name['end_time']._serialized_options = b'\340A\001'
  _RECURRINGSCHEDULE.fields_by_name['time_of_day']._options = None
  _RECURRINGSCHEDULE.fields_by_name['time_of_day']._serialized_options = b'\340A\002'
  _RECURRINGSCHEDULE.fields_by_name['frequency']._options = None
  _RECURRINGSCHEDULE.fields_by_name['frequency']._serialized_options = b'\340A\002'
  _RECURRINGSCHEDULE.fields_by_name['weekly']._options = None
  _RECURRINGSCHEDULE.fields_by_name['weekly']._serialized_options = b'\340A\002'
  _RECURRINGSCHEDULE.fields_by_name['monthly']._options = None
  _RECURRINGSCHEDULE.fields_by_name['monthly']._serialized_options = b'\340A\002'
  _RECURRINGSCHEDULE.fields_by_name['last_execute_time']._options = None
  _RECURRINGSCHEDULE.fields_by_name['last_execute_time']._serialized_options = b'\340A\003'
  _RECURRINGSCHEDULE.fields_by_name['next_execute_time']._options = None
  _RECURRINGSCHEDULE.fields_by_name['next_execute_time']._serialized_options = b'\340A\003'
  _WEEKLYSCHEDULE.fields_by_name['day_of_week']._options = None
  _WEEKLYSCHEDULE.fields_by_name['day_of_week']._serialized_options = b'\340A\002'
  _MONTHLYSCHEDULE.fields_by_name['week_day_of_month']._options = None
  _MONTHLYSCHEDULE.fields_by_name['week_day_of_month']._serialized_options = b'\340A\002'
  _MONTHLYSCHEDULE.fields_by_name['month_day']._options = None
  _MONTHLYSCHEDULE.fields_by_name['month_day']._serialized_options = b'\340A\002'
  _WEEKDAYOFMONTH.fields_by_name['week_ordinal']._options = None
  _WEEKDAYOFMONTH.fields_by_name['week_ordinal']._serialized_options = b'\340A\002'
  _WEEKDAYOFMONTH.fields_by_name['day_of_week']._options = None
  _WEEKDAYOFMONTH.fields_by_name['day_of_week']._serialized_options = b'\340A\002'
  _WEEKDAYOFMONTH.fields_by_name['day_offset']._options = None
  _WEEKDAYOFMONTH.fields_by_name['day_offset']._serialized_options = b'\340A\001'
  _CREATEPATCHDEPLOYMENTREQUEST.fields_by_name['parent']._options = None
  _CREATEPATCHDEPLOYMENTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _CREATEPATCHDEPLOYMENTREQUEST.fields_by_name['patch_deployment_id']._options = None
  _CREATEPATCHDEPLOYMENTREQUEST.fields_by_name['patch_deployment_id']._serialized_options = b'\340A\002'
  _CREATEPATCHDEPLOYMENTREQUEST.fields_by_name['patch_deployment']._options = None
  _CREATEPATCHDEPLOYMENTREQUEST.fields_by_name['patch_deployment']._serialized_options = b'\340A\002'
  _GETPATCHDEPLOYMENTREQUEST.fields_by_name['name']._options = None
  _GETPATCHDEPLOYMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _LISTPATCHDEPLOYMENTSREQUEST.fields_by_name['parent']._options = None
  _LISTPATCHDEPLOYMENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _LISTPATCHDEPLOYMENTSREQUEST.fields_by_name['page_size']._options = None
  _LISTPATCHDEPLOYMENTSREQUEST.fields_by_name['page_size']._serialized_options = b'\340A\001'
  _LISTPATCHDEPLOYMENTSREQUEST.fields_by_name['page_token']._options = None
  _LISTPATCHDEPLOYMENTSREQUEST.fields_by_name['page_token']._serialized_options = b'\340A\001'
  _DELETEPATCHDEPLOYMENTREQUEST.fields_by_name['name']._options = None
  _DELETEPATCHDEPLOYMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _UPDATEPATCHDEPLOYMENTREQUEST.fields_by_name['patch_deployment']._options = None
  _UPDATEPATCHDEPLOYMENTREQUEST.fields_by_name['patch_deployment']._serialized_options = b'\340A\002'
  _UPDATEPATCHDEPLOYMENTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEPATCHDEPLOYMENTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _PAUSEPATCHDEPLOYMENTREQUEST.fields_by_name['name']._options = None
  _PAUSEPATCHDEPLOYMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'osconfig.googleapis.com/PatchDeployment'
  _RESUMEPATCHDEPLOYMENTREQUEST.fields_by_name['name']._options = None
  _RESUMEPATCHDEPLOYMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A)\n\'osconfig.googleapis.com/PatchDeployment'
  _PATCHDEPLOYMENT._serialized_start=379
  _PATCHDEPLOYMENT._serialized_end=1279
  _PATCHDEPLOYMENT_STATE._serialized_start=1111
  _PATCHDEPLOYMENT_STATE._serialized_end=1165
  _ONETIMESCHEDULE._serialized_start=1281
  _ONETIMESCHEDULE._serialized_end=1353
  _RECURRINGSCHEDULE._serialized_start=1356
  _RECURRINGSCHEDULE._serialized_end=2014
  _RECURRINGSCHEDULE_FREQUENCY._serialized_start=1921
  _RECURRINGSCHEDULE_FREQUENCY._serialized_end=1995
  _WEEKLYSCHEDULE._serialized_start=2016
  _WEEKLYSCHEDULE._serialized_end=2082
  _MONTHLYSCHEDULE._serialized_start=2085
  _MONTHLYSCHEDULE._serialized_end=2224
  _WEEKDAYOFMONTH._serialized_start=2226
  _WEEKDAYOFMONTH._serialized_end=2344
  _CREATEPATCHDEPLOYMENTREQUEST._serialized_start=2347
  _CREATEPATCHDEPLOYMENTREQUEST._serialized_end=2510
  _GETPATCHDEPLOYMENTREQUEST._serialized_start=2512
  _GETPATCHDEPLOYMENTREQUEST._serialized_end=2558
  _LISTPATCHDEPLOYMENTSREQUEST._serialized_start=2560
  _LISTPATCHDEPLOYMENTSREQUEST._serialized_end=2659
  _LISTPATCHDEPLOYMENTSRESPONSE._serialized_start=2662
  _LISTPATCHDEPLOYMENTSRESPONSE._serialized_end=2791
  _DELETEPATCHDEPLOYMENTREQUEST._serialized_start=2793
  _DELETEPATCHDEPLOYMENTREQUEST._serialized_end=2842
  _UPDATEPATCHDEPLOYMENTREQUEST._serialized_start=2845
  _UPDATEPATCHDEPLOYMENTREQUEST._serialized_end=3007
  _PAUSEPATCHDEPLOYMENTREQUEST._serialized_start=3009
  _PAUSEPATCHDEPLOYMENTREQUEST._serialized_end=3101
  _RESUMEPATCHDEPLOYMENTREQUEST._serialized_start=3103
  _RESUMEPATCHDEPLOYMENTREQUEST._serialized_end=3196
# @@protoc_insertion_point(module_scope)