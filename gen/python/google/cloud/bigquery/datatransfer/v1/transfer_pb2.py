# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/datatransfer/v1/transfer.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/cloud/bigquery/datatransfer/v1/transfer.proto\x12%google.cloud.bigquery.datatransfer.v1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x1cgoogle/protobuf/struct.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"0\n\x10\x45mailPreferences\x12\x1c\n\x14\x65nable_failure_email\x18\x01 \x01(\x08\"\x90\x01\n\x0fScheduleOptions\x12\x1f\n\x17\x64isable_auto_scheduling\x18\x03 \x01(\x08\x12.\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"(\n\x08UserInfo\x12\x12\n\x05\x65mail\x18\x01 \x01(\tH\x00\x88\x01\x01\x42\x08\n\x06_email\"\xb5\x07\n\x0eTransferConfig\x12\x0c\n\x04name\x18\x01 \x01(\t\x12 \n\x16\x64\x65stination_dataset_id\x18\x02 \x01(\tH\x00\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x12\x16\n\x0e\x64\x61ta_source_id\x18\x05 \x01(\t\x12\'\n\x06params\x18\t \x01(\x0b\x32\x17.google.protobuf.Struct\x12\x10\n\x08schedule\x18\x07 \x01(\t\x12P\n\x10schedule_options\x18\x18 \x01(\x0b\x32\x36.google.cloud.bigquery.datatransfer.v1.ScheduleOptions\x12 \n\x18\x64\x61ta_refresh_window_days\x18\x0c \x01(\x05\x12\x10\n\x08\x64isabled\x18\r \x01(\x08\x12\x34\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x36\n\rnext_run_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12H\n\x05state\x18\n \x01(\x0e\x32\x34.google.cloud.bigquery.datatransfer.v1.TransferStateB\x03\xe0\x41\x03\x12\x0f\n\x07user_id\x18\x0b \x01(\x03\x12\x1b\n\x0e\x64\x61taset_region\x18\x0e \x01(\tB\x03\xe0\x41\x03\x12!\n\x19notification_pubsub_topic\x18\x0f \x01(\t\x12R\n\x11\x65mail_preferences\x18\x12 \x01(\x0b\x32\x37.google.cloud.bigquery.datatransfer.v1.EmailPreferences\x12M\n\nowner_info\x18\x1b \x01(\x0b\x32/.google.cloud.bigquery.datatransfer.v1.UserInfoB\x03\xe0\x41\x03H\x01\x88\x01\x01:\xb9\x01\xea\x41\xb5\x01\n2bigquerydatatransfer.googleapis.com/TransferConfig\x12\x34projects/{project}/transferConfigs/{transfer_config}\x12Iprojects/{project}/locations/{location}/transferConfigs/{transfer_config}B\r\n\x0b\x64\x65stinationB\r\n\x0b_owner_info\"\xfa\x06\n\x0bTransferRun\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x31\n\rschedule_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08run_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12(\n\x0c\x65rror_status\x18\x15 \x01(\x0b\x32\x12.google.rpc.Status\x12\x33\n\nstart_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12,\n\x06params\x18\t \x01(\x0b\x32\x17.google.protobuf.StructB\x03\xe0\x41\x03\x12%\n\x16\x64\x65stination_dataset_id\x18\x02 \x01(\tB\x03\xe0\x41\x03H\x00\x12\x1b\n\x0e\x64\x61ta_source_id\x18\x07 \x01(\tB\x03\xe0\x41\x03\x12\x43\n\x05state\x18\x08 \x01(\x0e\x32\x34.google.cloud.bigquery.datatransfer.v1.TransferState\x12\x0f\n\x07user_id\x18\x0b \x01(\x03\x12\x15\n\x08schedule\x18\x0c \x01(\tB\x03\xe0\x41\x03\x12&\n\x19notification_pubsub_topic\x18\x17 \x01(\tB\x03\xe0\x41\x03\x12W\n\x11\x65mail_preferences\x18\x19 \x01(\x0b\x32\x37.google.cloud.bigquery.datatransfer.v1.EmailPreferencesB\x03\xe0\x41\x03:\xc4\x01\xea\x41\xc0\x01\n\'bigquerydatatransfer.googleapis.com/Run\x12?projects/{project}/transferConfigs/{transfer_config}/runs/{run}\x12Tprojects/{project}/locations/{location}/transferConfigs/{transfer_config}/runs/{run}B\r\n\x0b\x64\x65stination\"\x8a\x02\n\x0fTransferMessage\x12\x30\n\x0cmessage_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12X\n\x08severity\x18\x02 \x01(\x0e\x32\x46.google.cloud.bigquery.datatransfer.v1.TransferMessage.MessageSeverity\x12\x14\n\x0cmessage_text\x18\x03 \x01(\t\"U\n\x0fMessageSeverity\x12 \n\x1cMESSAGE_SEVERITY_UNSPECIFIED\x10\x00\x12\x08\n\x04INFO\x10\x01\x12\x0b\n\x07WARNING\x10\x02\x12\t\n\x05\x45RROR\x10\x03*K\n\x0cTransferType\x12\x1d\n\x19TRANSFER_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05\x42\x41TCH\x10\x01\x12\r\n\tSTREAMING\x10\x02\x1a\x02\x18\x01*s\n\rTransferState\x12\x1e\n\x1aTRANSFER_STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x02\x12\x0b\n\x07RUNNING\x10\x03\x12\r\n\tSUCCEEDED\x10\x04\x12\n\n\x06\x46\x41ILED\x10\x05\x12\r\n\tCANCELLED\x10\x06\x42\x93\x02\n)com.google.cloud.bigquery.datatransfer.v1B\rTransferProtoP\x01ZQgoogle.golang.org/genproto/googleapis/cloud/bigquery/datatransfer/v1;datatransfer\xa2\x02\x05GCBDT\xaa\x02%Google.Cloud.BigQuery.DataTransfer.V1\xca\x02%Google\\Cloud\\BigQuery\\DataTransfer\\V1\xea\x02)Google::Cloud::Bigquery::DataTransfer::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.bigquery.datatransfer.v1.transfer_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.google.cloud.bigquery.datatransfer.v1B\rTransferProtoP\001ZQgoogle.golang.org/genproto/googleapis/cloud/bigquery/datatransfer/v1;datatransfer\242\002\005GCBDT\252\002%Google.Cloud.BigQuery.DataTransfer.V1\312\002%Google\\Cloud\\BigQuery\\DataTransfer\\V1\352\002)Google::Cloud::Bigquery::DataTransfer::V1'
  _TRANSFERTYPE._options = None
  _TRANSFERTYPE._serialized_options = b'\030\001'
  _TRANSFERCONFIG.fields_by_name['update_time']._options = None
  _TRANSFERCONFIG.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TRANSFERCONFIG.fields_by_name['next_run_time']._options = None
  _TRANSFERCONFIG.fields_by_name['next_run_time']._serialized_options = b'\340A\003'
  _TRANSFERCONFIG.fields_by_name['state']._options = None
  _TRANSFERCONFIG.fields_by_name['state']._serialized_options = b'\340A\003'
  _TRANSFERCONFIG.fields_by_name['dataset_region']._options = None
  _TRANSFERCONFIG.fields_by_name['dataset_region']._serialized_options = b'\340A\003'
  _TRANSFERCONFIG.fields_by_name['owner_info']._options = None
  _TRANSFERCONFIG.fields_by_name['owner_info']._serialized_options = b'\340A\003'
  _TRANSFERCONFIG._options = None
  _TRANSFERCONFIG._serialized_options = b'\352A\265\001\n2bigquerydatatransfer.googleapis.com/TransferConfig\0224projects/{project}/transferConfigs/{transfer_config}\022Iprojects/{project}/locations/{location}/transferConfigs/{transfer_config}'
  _TRANSFERRUN.fields_by_name['start_time']._options = None
  _TRANSFERRUN.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['end_time']._options = None
  _TRANSFERRUN.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['update_time']._options = None
  _TRANSFERRUN.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['params']._options = None
  _TRANSFERRUN.fields_by_name['params']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['destination_dataset_id']._options = None
  _TRANSFERRUN.fields_by_name['destination_dataset_id']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['data_source_id']._options = None
  _TRANSFERRUN.fields_by_name['data_source_id']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['schedule']._options = None
  _TRANSFERRUN.fields_by_name['schedule']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['notification_pubsub_topic']._options = None
  _TRANSFERRUN.fields_by_name['notification_pubsub_topic']._serialized_options = b'\340A\003'
  _TRANSFERRUN.fields_by_name['email_preferences']._options = None
  _TRANSFERRUN.fields_by_name['email_preferences']._serialized_options = b'\340A\003'
  _TRANSFERRUN._options = None
  _TRANSFERRUN._serialized_options = b'\352A\300\001\n\'bigquerydatatransfer.googleapis.com/Run\022?projects/{project}/transferConfigs/{transfer_config}/runs/{run}\022Tprojects/{project}/locations/{location}/transferConfigs/{transfer_config}/runs/{run}'
  _TRANSFERTYPE._serialized_start=2596
  _TRANSFERTYPE._serialized_end=2671
  _TRANSFERSTATE._serialized_start=2673
  _TRANSFERSTATE._serialized_end=2788
  _EMAILPREFERENCES._serialized_start=243
  _EMAILPREFERENCES._serialized_end=291
  _SCHEDULEOPTIONS._serialized_start=294
  _SCHEDULEOPTIONS._serialized_end=438
  _USERINFO._serialized_start=440
  _USERINFO._serialized_end=480
  _TRANSFERCONFIG._serialized_start=483
  _TRANSFERCONFIG._serialized_end=1432
  _TRANSFERRUN._serialized_start=1435
  _TRANSFERRUN._serialized_end=2325
  _TRANSFERMESSAGE._serialized_start=2328
  _TRANSFERMESSAGE._serialized_end=2594
  _TRANSFERMESSAGE_MESSAGESEVERITY._serialized_start=2509
  _TRANSFERMESSAGE_MESSAGESEVERITY._serialized_end=2594
# @@protoc_insertion_point(module_scope)
