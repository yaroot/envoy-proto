# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataplex/v1/logs.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/cloud/dataplex/v1/logs.proto\x12\x18google.cloud.dataplex.v1\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa0\t\n\x0e\x44iscoveryEvent\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x0f\n\x07lake_id\x18\x02 \x01(\t\x12\x0f\n\x07zone_id\x18\x03 \x01(\t\x12\x10\n\x08\x61sset_id\x18\x04 \x01(\t\x12\x15\n\rdata_location\x18\x05 \x01(\t\x12@\n\x04type\x18\n \x01(\x0e\x32\x32.google.cloud.dataplex.v1.DiscoveryEvent.EventType\x12H\n\x06\x63onfig\x18\x14 \x01(\x0b\x32\x36.google.cloud.dataplex.v1.DiscoveryEvent.ConfigDetailsH\x00\x12H\n\x06\x65ntity\x18\x15 \x01(\x0b\x32\x36.google.cloud.dataplex.v1.DiscoveryEvent.EntityDetailsH\x00\x12N\n\tpartition\x18\x16 \x01(\x0b\x32\x39.google.cloud.dataplex.v1.DiscoveryEvent.PartitionDetailsH\x00\x12H\n\x06\x61\x63tion\x18\x17 \x01(\x0b\x32\x36.google.cloud.dataplex.v1.DiscoveryEvent.ActionDetailsH\x00\x1a\x9e\x01\n\rConfigDetails\x12Z\n\nparameters\x18\x01 \x03(\x0b\x32\x46.google.cloud.dataplex.v1.DiscoveryEvent.ConfigDetails.ParametersEntry\x1a\x31\n\x0fParametersEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\x62\n\rEntityDetails\x12\x0e\n\x06\x65ntity\x18\x01 \x01(\t\x12\x41\n\x04type\x18\x02 \x01(\x0e\x32\x33.google.cloud.dataplex.v1.DiscoveryEvent.EntityType\x1a\x98\x01\n\x10PartitionDetails\x12\x11\n\tpartition\x18\x01 \x01(\t\x12\x0e\n\x06\x65ntity\x18\x02 \x01(\t\x12\x41\n\x04type\x18\x03 \x01(\x0e\x32\x33.google.cloud.dataplex.v1.DiscoveryEvent.EntityType\x12\x1e\n\x16sampled_data_locations\x18\x04 \x03(\t\x1a\x1d\n\rActionDetails\x12\x0c\n\x04type\x18\x01 \x01(\t\"\xb4\x01\n\tEventType\x12\x1a\n\x16\x45VENT_TYPE_UNSPECIFIED\x10\x00\x12\n\n\x06\x43ONFIG\x10\x01\x12\x12\n\x0e\x45NTITY_CREATED\x10\x02\x12\x12\n\x0e\x45NTITY_UPDATED\x10\x03\x12\x12\n\x0e\x45NTITY_DELETED\x10\x04\x12\x15\n\x11PARTITION_CREATED\x10\x05\x12\x15\n\x11PARTITION_UPDATED\x10\x06\x12\x15\n\x11PARTITION_DELETED\x10\x07\"A\n\nEntityType\x12\x1b\n\x17\x45NTITY_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05TABLE\x10\x01\x12\x0b\n\x07\x46ILESET\x10\x02\x42\t\n\x07\x64\x65tails\"\x9c\x04\n\x08JobEvent\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x0e\n\x06job_id\x18\x02 \x01(\t\x12.\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12,\n\x08\x65nd_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x37\n\x05state\x18\x05 \x01(\x0e\x32(.google.cloud.dataplex.v1.JobEvent.State\x12\x0f\n\x07retries\x18\x06 \x01(\x05\x12\x35\n\x04type\x18\x07 \x01(\x0e\x32\'.google.cloud.dataplex.v1.JobEvent.Type\x12;\n\x07service\x18\x08 \x01(\x0e\x32*.google.cloud.dataplex.v1.JobEvent.Service\x12\x13\n\x0bservice_job\x18\t \x01(\t\"5\n\x04Type\x12\x14\n\x10TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05SPARK\x10\x01\x12\x0c\n\x08NOTEBOOK\x10\x02\"U\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\r\n\tSUCCEEDED\x10\x01\x12\n\n\x06\x46\x41ILED\x10\x02\x12\r\n\tCANCELLED\x10\x03\x12\x0b\n\x07\x41\x42ORTED\x10\x04\"0\n\x07Service\x12\x17\n\x13SERVICE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x44\x41TAPROC\x10\x01\"\xc2\x04\n\x0cSessionEvent\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x0f\n\x07user_id\x18\x02 \x01(\t\x12\x12\n\nsession_id\x18\x03 \x01(\t\x12>\n\x04type\x18\x04 \x01(\x0e\x32\x30.google.cloud.dataplex.v1.SessionEvent.EventType\x12\x43\n\x05query\x18\x05 \x01(\x0b\x32\x32.google.cloud.dataplex.v1.SessionEvent.QueryDetailH\x00\x1a\xa3\x02\n\x0bQueryDetail\x12\x10\n\x08query_id\x18\x01 \x01(\t\x12\x12\n\nquery_text\x18\x02 \x01(\t\x12I\n\x06\x65ngine\x18\x03 \x01(\x0e\x32\x39.google.cloud.dataplex.v1.SessionEvent.QueryDetail.Engine\x12+\n\x08\x64uration\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x19\n\x11result_size_bytes\x18\x05 \x01(\x03\x12\x1c\n\x14\x64\x61ta_processed_bytes\x18\x06 \x01(\x03\"=\n\x06\x45ngine\x12\x16\n\x12\x45NGINE_UNSPECIFIED\x10\x00\x12\r\n\tSPARK_SQL\x10\x01\x12\x0c\n\x08\x42IGQUERY\x10\x02\"G\n\tEventType\x12\x1a\n\x16\x45VENT_TYPE_UNSPECIFIED\x10\x00\x12\t\n\x05START\x10\x01\x12\x08\n\x04STOP\x10\x02\x12\t\n\x05QUERY\x10\x03\x42\x08\n\x06\x64\x65tailBm\n\x1c\x63om.google.cloud.dataplex.v1B\tLogsProtoP\x01Z@google.golang.org/genproto/googleapis/cloud/dataplex/v1;dataplexb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dataplex.v1.logs_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.google.cloud.dataplex.v1B\tLogsProtoP\001Z@google.golang.org/genproto/googleapis/cloud/dataplex/v1;dataplex'
  _DISCOVERYEVENT_CONFIGDETAILS_PARAMETERSENTRY._options = None
  _DISCOVERYEVENT_CONFIGDETAILS_PARAMETERSENTRY._serialized_options = b'8\001'
  _DISCOVERYEVENT._serialized_start=131
  _DISCOVERYEVENT._serialized_end=1315
  _DISCOVERYEVENT_CONFIGDETAILS._serialized_start=610
  _DISCOVERYEVENT_CONFIGDETAILS._serialized_end=768
  _DISCOVERYEVENT_CONFIGDETAILS_PARAMETERSENTRY._serialized_start=719
  _DISCOVERYEVENT_CONFIGDETAILS_PARAMETERSENTRY._serialized_end=768
  _DISCOVERYEVENT_ENTITYDETAILS._serialized_start=770
  _DISCOVERYEVENT_ENTITYDETAILS._serialized_end=868
  _DISCOVERYEVENT_PARTITIONDETAILS._serialized_start=871
  _DISCOVERYEVENT_PARTITIONDETAILS._serialized_end=1023
  _DISCOVERYEVENT_ACTIONDETAILS._serialized_start=1025
  _DISCOVERYEVENT_ACTIONDETAILS._serialized_end=1054
  _DISCOVERYEVENT_EVENTTYPE._serialized_start=1057
  _DISCOVERYEVENT_EVENTTYPE._serialized_end=1237
  _DISCOVERYEVENT_ENTITYTYPE._serialized_start=1239
  _DISCOVERYEVENT_ENTITYTYPE._serialized_end=1304
  _JOBEVENT._serialized_start=1318
  _JOBEVENT._serialized_end=1858
  _JOBEVENT_TYPE._serialized_start=1668
  _JOBEVENT_TYPE._serialized_end=1721
  _JOBEVENT_STATE._serialized_start=1723
  _JOBEVENT_STATE._serialized_end=1808
  _JOBEVENT_SERVICE._serialized_start=1810
  _JOBEVENT_SERVICE._serialized_end=1858
  _SESSIONEVENT._serialized_start=1861
  _SESSIONEVENT._serialized_end=2439
  _SESSIONEVENT_QUERYDETAIL._serialized_start=2065
  _SESSIONEVENT_QUERYDETAIL._serialized_end=2356
  _SESSIONEVENT_QUERYDETAIL_ENGINE._serialized_start=2295
  _SESSIONEVENT_QUERYDETAIL_ENGINE._serialized_end=2356
  _SESSIONEVENT_EVENTTYPE._serialized_start=2358
  _SESSIONEVENT_EVENTTYPE._serialized_end=2429
# @@protoc_insertion_point(module_scope)
