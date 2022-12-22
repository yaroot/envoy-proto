# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/memcache/v1beta2/cloud_memcache.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.api import client_pb2 as google_dot_api_dot_client__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.type import dayofweek_pb2 as google_dot_type_dot_dayofweek__pb2
from google.type import timeofday_pb2 as google_dot_type_dot_timeofday__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/cloud/memcache/v1beta2/cloud_memcache.proto\x12\x1dgoogle.cloud.memcache.v1beta2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a#google/longrunning/operations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1bgoogle/type/dayofweek.proto\x1a\x1bgoogle/type/timeofday.proto\"\xc6\x0e\n\x08Instance\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x43\n\x06labels\x18\x03 \x03(\x0b\x32\x33.google.cloud.memcache.v1beta2.Instance.LabelsEntry\x12\x1a\n\x12\x61uthorized_network\x18\x04 \x01(\t\x12\r\n\x05zones\x18\x05 \x03(\t\x12\x17\n\nnode_count\x18\x06 \x01(\x05\x42\x03\xe0\x41\x02\x12L\n\x0bnode_config\x18\x07 \x01(\x0b\x32\x32.google.cloud.memcache.v1beta2.Instance.NodeConfigB\x03\xe0\x41\x02\x12H\n\x10memcache_version\x18\t \x01(\x0e\x32..google.cloud.memcache.v1beta2.MemcacheVersion\x12\x45\n\nparameters\x18\x0b \x01(\x0b\x32\x31.google.cloud.memcache.v1beta2.MemcacheParameters\x12I\n\x0ememcache_nodes\x18\x0c \x03(\x0b\x32,.google.cloud.memcache.v1beta2.Instance.NodeB\x03\xe0\x41\x03\x12\x34\n\x0b\x63reate_time\x18\r \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x0e \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x41\n\x05state\x18\x0f \x01(\x0e\x32-.google.cloud.memcache.v1beta2.Instance.StateB\x03\xe0\x41\x03\x12\"\n\x15memcache_full_version\x18\x12 \x01(\tB\x03\xe0\x41\x03\x12R\n\x11instance_messages\x18\x13 \x03(\x0b\x32\x37.google.cloud.memcache.v1beta2.Instance.InstanceMessage\x12\x1f\n\x12\x64iscovery_endpoint\x18\x14 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10update_available\x18\x15 \x01(\x08\x42\x03\xe0\x41\x03\x12L\n\x12maintenance_policy\x18\x16 \x01(\x0b\x32\x30.google.cloud.memcache.v1beta2.MaintenancePolicy\x12U\n\x14maintenance_schedule\x18\x17 \x01(\x0b\x32\x32.google.cloud.memcache.v1beta2.MaintenanceScheduleB\x03\xe0\x41\x03\x1a\x41\n\nNodeConfig\x12\x16\n\tcpu_count\x18\x01 \x01(\x05\x42\x03\xe0\x41\x02\x12\x1b\n\x0ememory_size_mb\x18\x02 \x01(\x05\x42\x03\xe0\x41\x02\x1a\xd8\x02\n\x04Node\x12\x14\n\x07node_id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04zone\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x46\n\x05state\x18\x03 \x01(\x0e\x32\x32.google.cloud.memcache.v1beta2.Instance.Node.StateB\x03\xe0\x41\x03\x12\x11\n\x04host\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04port\x18\x05 \x01(\x05\x42\x03\xe0\x41\x03\x12\x45\n\nparameters\x18\x06 \x01(\x0b\x32\x31.google.cloud.memcache.v1beta2.MemcacheParameters\x12\x1d\n\x10update_available\x18\x07 \x01(\x08\x42\x03\xe0\x41\x03\"S\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02\x12\x0c\n\x08\x44\x45LETING\x10\x03\x12\x0c\n\x08UPDATING\x10\x04\x1a\xae\x01\n\x0fInstanceMessage\x12J\n\x04\x63ode\x18\x01 \x01(\x0e\x32<.google.cloud.memcache.v1beta2.Instance.InstanceMessage.Code\x12\x0f\n\x07message\x18\x02 \x01(\t\">\n\x04\x43ode\x12\x14\n\x10\x43ODE_UNSPECIFIED\x10\x00\x12 \n\x1cZONE_DISTRIBUTION_UNBALANCED\x10\x01\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"o\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\t\n\x05READY\x10\x02\x12\x0c\n\x08UPDATING\x10\x03\x12\x0c\n\x08\x44\x45LETING\x10\x04\x12\x1a\n\x16PERFORMING_MAINTENANCE\x10\x05:c\xea\x41`\n memcache.googleapis.com/Instance\x12<projects/{project}/locations/{location}/instances/{instance}\"\xf4\x01\n\x11MaintenancePolicy\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x34\n\x0bupdate_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12^\n\x19weekly_maintenance_window\x18\x04 \x03(\x0b\x32\x36.google.cloud.memcache.v1beta2.WeeklyMaintenanceWindowB\x03\xe0\x41\x02\"\xa6\x01\n\x17WeeklyMaintenanceWindow\x12(\n\x03\x64\x61y\x18\x01 \x01(\x0e\x32\x16.google.type.DayOfWeekB\x03\xe0\x41\x02\x12/\n\nstart_time\x18\x02 \x01(\x0b\x32\x16.google.type.TimeOfDayB\x03\xe0\x41\x02\x12\x30\n\x08\x64uration\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x03\xe0\x41\x02\"\xbe\x01\n\x13MaintenanceSchedule\x12\x33\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12?\n\x16schedule_deadline_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\"\x9a\x01\n\x14ListInstancesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x05 \x01(\t\"\x81\x01\n\x15ListInstancesResponse\x12:\n\tresources\x18\x01 \x03(\x0b\x32\'.google.cloud.memcache.v1beta2.Instance\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\x12\x13\n\x0bunreachable\x18\x03 \x03(\t\"L\n\x12GetInstanceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n memcache.googleapis.com/Instance\"\xac\x01\n\x15\x43reateInstanceRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x18\n\x0binstance_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12>\n\x08resource\x18\x03 \x01(\x0b\x32\'.google.cloud.memcache.v1beta2.InstanceB\x03\xe0\x41\x02\"\x8d\x01\n\x15UpdateInstanceRequest\x12\x34\n\x0bupdate_mask\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12>\n\x08resource\x18\x02 \x01(\x0b\x32\'.google.cloud.memcache.v1beta2.InstanceB\x03\xe0\x41\x02\"O\n\x15\x44\x65leteInstanceRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n memcache.googleapis.com/Instance\"\xe7\x02\n\x1cRescheduleMaintenanceRequest\x12:\n\x08instance\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n memcache.googleapis.com/Instance\x12h\n\x0freschedule_type\x18\x02 \x01(\x0e\x32J.google.cloud.memcache.v1beta2.RescheduleMaintenanceRequest.RescheduleTypeB\x03\xe0\x41\x02\x12\x31\n\rschedule_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"n\n\x0eRescheduleType\x12\x1f\n\x1bRESCHEDULE_TYPE_UNSPECIFIED\x10\x00\x12\r\n\tIMMEDIATE\x10\x01\x12\x19\n\x15NEXT_AVAILABLE_WINDOW\x10\x02\x12\x11\n\rSPECIFIC_TIME\x10\x03\"u\n\x16\x41pplyParametersRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n memcache.googleapis.com/Instance\x12\x10\n\x08node_ids\x18\x02 \x03(\t\x12\x11\n\tapply_all\x18\x03 \x01(\x08\"\xce\x01\n\x17UpdateParametersRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n memcache.googleapis.com/Instance\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\x12\x45\n\nparameters\x18\x03 \x01(\x0b\x32\x31.google.cloud.memcache.v1beta2.MemcacheParameters\"}\n\x1a\x41pplySoftwareUpdateRequest\x12:\n\x08instance\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n memcache.googleapis.com/Instance\x12\x10\n\x08node_ids\x18\x02 \x03(\t\x12\x11\n\tapply_all\x18\x03 \x01(\x08\"\xa3\x01\n\x12MemcacheParameters\x12\x0f\n\x02id\x18\x01 \x01(\tB\x03\xe0\x41\x03\x12M\n\x06params\x18\x03 \x03(\x0b\x32=.google.cloud.memcache.v1beta2.MemcacheParameters.ParamsEntry\x1a-\n\x0bParamsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xf9\x01\n\x11OperationMetadata\x12\x34\n\x0b\x63reate_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x31\n\x08\x65nd_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x03\x12\x13\n\x06target\x18\x03 \x01(\tB\x03\xe0\x41\x03\x12\x11\n\x04verb\x18\x04 \x01(\tB\x03\xe0\x41\x03\x12\x1a\n\rstatus_detail\x18\x05 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10\x63\x61ncel_requested\x18\x06 \x01(\x08\x42\x03\xe0\x41\x03\x12\x18\n\x0b\x61pi_version\x18\x07 \x01(\tB\x03\xe0\x41\x03\"\xd9\x01\n\x10LocationMetadata\x12\x61\n\x0f\x61vailable_zones\x18\x01 \x03(\x0b\x32\x43.google.cloud.memcache.v1beta2.LocationMetadata.AvailableZonesEntryB\x03\xe0\x41\x03\x1a\x62\n\x13\x41vailableZonesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12:\n\x05value\x18\x02 \x01(\x0b\x32+.google.cloud.memcache.v1beta2.ZoneMetadata:\x02\x38\x01\"\x0e\n\x0cZoneMetadata*E\n\x0fMemcacheVersion\x12 \n\x1cMEMCACHE_VERSION_UNSPECIFIED\x10\x00\x12\x10\n\x0cMEMCACHE_1_5\x10\x01\x32\x9a\x14\n\rCloudMemcache\x12\xbf\x01\n\rListInstances\x12\x33.google.cloud.memcache.v1beta2.ListInstancesRequest\x1a\x34.google.cloud.memcache.v1beta2.ListInstancesResponse\"C\x82\xd3\xe4\x93\x02\x34\x12\x32/v1beta2/{parent=projects/*/locations/*}/instances\xda\x41\x06parent\x12\xac\x01\n\x0bGetInstance\x12\x31.google.cloud.memcache.v1beta2.GetInstanceRequest\x1a\'.google.cloud.memcache.v1beta2.Instance\"A\x82\xd3\xe4\x93\x02\x34\x12\x32/v1beta2/{name=projects/*/locations/*/instances/*}\xda\x41\x04name\x12\xa6\x02\n\x0e\x43reateInstance\x12\x34.google.cloud.memcache.v1beta2.CreateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\xbe\x01\x82\xd3\xe4\x93\x02>\"2/v1beta2/{parent=projects/*/locations/*}/instances:\x08resource\xda\x41\x1bparent,instance_id,resource\xca\x41Y\n&google.cloud.memcache.v1beta2.Instance\x12/google.cloud.memcache.v1beta2.OperationMetadata\x12\xa8\x02\n\x0eUpdateInstance\x12\x34.google.cloud.memcache.v1beta2.UpdateInstanceRequest\x1a\x1d.google.longrunning.Operation\"\xc0\x01\x82\xd3\xe4\x93\x02G2;/v1beta2/{resource.name=projects/*/locations/*/instances/*}:\x08resource\xda\x41\x14update_mask,resource\xca\x41Y\n&google.cloud.memcache.v1beta2.Instance\x12/google.cloud.memcache.v1beta2.OperationMetadata\x12\xb4\x02\n\x10UpdateParameters\x12\x36.google.cloud.memcache.v1beta2.UpdateParametersRequest\x1a\x1d.google.longrunning.Operation\"\xc8\x01\x82\xd3\xe4\x93\x02H2C/v1beta2/{name=projects/*/locations/*/instances/*}:updateParameters:\x01*\xda\x41\x1bname,update_mask,parameters\xca\x41Y\n&google.cloud.memcache.v1beta2.Instance\x12/google.cloud.memcache.v1beta2.OperationMetadata\x12\xf4\x01\n\x0e\x44\x65leteInstance\x12\x34.google.cloud.memcache.v1beta2.DeleteInstanceRequest\x1a\x1d.google.longrunning.Operation\"\x8c\x01\x82\xd3\xe4\x93\x02\x34*2/v1beta2/{name=projects/*/locations/*/instances/*}\xda\x41\x04name\xca\x41H\n\x15google.protobuf.Empty\x12/google.cloud.memcache.v1beta2.OperationMetadata\x12\xad\x02\n\x0f\x41pplyParameters\x12\x35.google.cloud.memcache.v1beta2.ApplyParametersRequest\x1a\x1d.google.longrunning.Operation\"\xc3\x01\x82\xd3\xe4\x93\x02G\"B/v1beta2/{name=projects/*/locations/*/instances/*}:applyParameters:\x01*\xda\x41\x17name,node_ids,apply_all\xca\x41Y\n&google.cloud.memcache.v1beta2.Instance\x12/google.cloud.memcache.v1beta2.OperationMetadata\x12\xc1\x02\n\x13\x41pplySoftwareUpdate\x12\x39.google.cloud.memcache.v1beta2.ApplySoftwareUpdateRequest\x1a\x1d.google.longrunning.Operation\"\xcf\x01\x82\xd3\xe4\x93\x02O\"J/v1beta2/{instance=projects/*/locations/*/instances/*}:applySoftwareUpdate:\x01*\xda\x41\x1binstance,node_ids,apply_all\xca\x41Y\n&google.cloud.memcache.v1beta2.Instance\x12/google.cloud.memcache.v1beta2.OperationMetadata\x12\xd4\x02\n\x15RescheduleMaintenance\x12;.google.cloud.memcache.v1beta2.RescheduleMaintenanceRequest\x1a\x1d.google.longrunning.Operation\"\xde\x01\x82\xd3\xe4\x93\x02Q\"L/v1beta2/{instance=projects/*/locations/*/instances/*}:rescheduleMaintenance:\x01*\xda\x41(instance, reschedule_type, schedule_time\xca\x41Y\n&google.cloud.memcache.v1beta2.Instance\x12/google.cloud.memcache.v1beta2.OperationMetadata\x1aK\xca\x41\x17memcache.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\x80\x01\n!com.google.cloud.memcache.v1beta2B\x12\x43loudMemcacheProtoP\x01ZEgoogle.golang.org/genproto/googleapis/cloud/memcache/v1beta2;memcacheb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.memcache.v1beta2.cloud_memcache_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.google.cloud.memcache.v1beta2B\022CloudMemcacheProtoP\001ZEgoogle.golang.org/genproto/googleapis/cloud/memcache/v1beta2;memcache'
  _INSTANCE_NODECONFIG.fields_by_name['cpu_count']._options = None
  _INSTANCE_NODECONFIG.fields_by_name['cpu_count']._serialized_options = b'\340A\002'
  _INSTANCE_NODECONFIG.fields_by_name['memory_size_mb']._options = None
  _INSTANCE_NODECONFIG.fields_by_name['memory_size_mb']._serialized_options = b'\340A\002'
  _INSTANCE_NODE.fields_by_name['node_id']._options = None
  _INSTANCE_NODE.fields_by_name['node_id']._serialized_options = b'\340A\003'
  _INSTANCE_NODE.fields_by_name['zone']._options = None
  _INSTANCE_NODE.fields_by_name['zone']._serialized_options = b'\340A\003'
  _INSTANCE_NODE.fields_by_name['state']._options = None
  _INSTANCE_NODE.fields_by_name['state']._serialized_options = b'\340A\003'
  _INSTANCE_NODE.fields_by_name['host']._options = None
  _INSTANCE_NODE.fields_by_name['host']._serialized_options = b'\340A\003'
  _INSTANCE_NODE.fields_by_name['port']._options = None
  _INSTANCE_NODE.fields_by_name['port']._serialized_options = b'\340A\003'
  _INSTANCE_NODE.fields_by_name['update_available']._options = None
  _INSTANCE_NODE.fields_by_name['update_available']._serialized_options = b'\340A\003'
  _INSTANCE_LABELSENTRY._options = None
  _INSTANCE_LABELSENTRY._serialized_options = b'8\001'
  _INSTANCE.fields_by_name['name']._options = None
  _INSTANCE.fields_by_name['name']._serialized_options = b'\340A\002'
  _INSTANCE.fields_by_name['node_count']._options = None
  _INSTANCE.fields_by_name['node_count']._serialized_options = b'\340A\002'
  _INSTANCE.fields_by_name['node_config']._options = None
  _INSTANCE.fields_by_name['node_config']._serialized_options = b'\340A\002'
  _INSTANCE.fields_by_name['memcache_nodes']._options = None
  _INSTANCE.fields_by_name['memcache_nodes']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['create_time']._options = None
  _INSTANCE.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['update_time']._options = None
  _INSTANCE.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['state']._options = None
  _INSTANCE.fields_by_name['state']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['memcache_full_version']._options = None
  _INSTANCE.fields_by_name['memcache_full_version']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['discovery_endpoint']._options = None
  _INSTANCE.fields_by_name['discovery_endpoint']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['update_available']._options = None
  _INSTANCE.fields_by_name['update_available']._serialized_options = b'\340A\003'
  _INSTANCE.fields_by_name['maintenance_schedule']._options = None
  _INSTANCE.fields_by_name['maintenance_schedule']._serialized_options = b'\340A\003'
  _INSTANCE._options = None
  _INSTANCE._serialized_options = b'\352A`\n memcache.googleapis.com/Instance\022<projects/{project}/locations/{location}/instances/{instance}'
  _MAINTENANCEPOLICY.fields_by_name['create_time']._options = None
  _MAINTENANCEPOLICY.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _MAINTENANCEPOLICY.fields_by_name['update_time']._options = None
  _MAINTENANCEPOLICY.fields_by_name['update_time']._serialized_options = b'\340A\003'
  _MAINTENANCEPOLICY.fields_by_name['weekly_maintenance_window']._options = None
  _MAINTENANCEPOLICY.fields_by_name['weekly_maintenance_window']._serialized_options = b'\340A\002'
  _WEEKLYMAINTENANCEWINDOW.fields_by_name['day']._options = None
  _WEEKLYMAINTENANCEWINDOW.fields_by_name['day']._serialized_options = b'\340A\002'
  _WEEKLYMAINTENANCEWINDOW.fields_by_name['start_time']._options = None
  _WEEKLYMAINTENANCEWINDOW.fields_by_name['start_time']._serialized_options = b'\340A\002'
  _WEEKLYMAINTENANCEWINDOW.fields_by_name['duration']._options = None
  _WEEKLYMAINTENANCEWINDOW.fields_by_name['duration']._serialized_options = b'\340A\002'
  _MAINTENANCESCHEDULE.fields_by_name['start_time']._options = None
  _MAINTENANCESCHEDULE.fields_by_name['start_time']._serialized_options = b'\340A\003'
  _MAINTENANCESCHEDULE.fields_by_name['end_time']._options = None
  _MAINTENANCESCHEDULE.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _MAINTENANCESCHEDULE.fields_by_name['schedule_deadline_time']._options = None
  _MAINTENANCESCHEDULE.fields_by_name['schedule_deadline_time']._serialized_options = b'\340A\003'
  _LISTINSTANCESREQUEST.fields_by_name['parent']._options = None
  _LISTINSTANCESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _GETINSTANCEREQUEST.fields_by_name['name']._options = None
  _GETINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n memcache.googleapis.com/Instance'
  _CREATEINSTANCEREQUEST.fields_by_name['parent']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEINSTANCEREQUEST.fields_by_name['instance_id']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['instance_id']._serialized_options = b'\340A\002'
  _CREATEINSTANCEREQUEST.fields_by_name['resource']._options = None
  _CREATEINSTANCEREQUEST.fields_by_name['resource']._serialized_options = b'\340A\002'
  _UPDATEINSTANCEREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEINSTANCEREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATEINSTANCEREQUEST.fields_by_name['resource']._options = None
  _UPDATEINSTANCEREQUEST.fields_by_name['resource']._serialized_options = b'\340A\002'
  _DELETEINSTANCEREQUEST.fields_by_name['name']._options = None
  _DELETEINSTANCEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n memcache.googleapis.com/Instance'
  _RESCHEDULEMAINTENANCEREQUEST.fields_by_name['instance']._options = None
  _RESCHEDULEMAINTENANCEREQUEST.fields_by_name['instance']._serialized_options = b'\340A\002\372A\"\n memcache.googleapis.com/Instance'
  _RESCHEDULEMAINTENANCEREQUEST.fields_by_name['reschedule_type']._options = None
  _RESCHEDULEMAINTENANCEREQUEST.fields_by_name['reschedule_type']._serialized_options = b'\340A\002'
  _APPLYPARAMETERSREQUEST.fields_by_name['name']._options = None
  _APPLYPARAMETERSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n memcache.googleapis.com/Instance'
  _UPDATEPARAMETERSREQUEST.fields_by_name['name']._options = None
  _UPDATEPARAMETERSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n memcache.googleapis.com/Instance'
  _UPDATEPARAMETERSREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEPARAMETERSREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _APPLYSOFTWAREUPDATEREQUEST.fields_by_name['instance']._options = None
  _APPLYSOFTWAREUPDATEREQUEST.fields_by_name['instance']._serialized_options = b'\340A\002\372A\"\n memcache.googleapis.com/Instance'
  _MEMCACHEPARAMETERS_PARAMSENTRY._options = None
  _MEMCACHEPARAMETERS_PARAMSENTRY._serialized_options = b'8\001'
  _MEMCACHEPARAMETERS.fields_by_name['id']._options = None
  _MEMCACHEPARAMETERS.fields_by_name['id']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['create_time']._options = None
  _OPERATIONMETADATA.fields_by_name['create_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['end_time']._options = None
  _OPERATIONMETADATA.fields_by_name['end_time']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['target']._options = None
  _OPERATIONMETADATA.fields_by_name['target']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['verb']._options = None
  _OPERATIONMETADATA.fields_by_name['verb']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['status_detail']._options = None
  _OPERATIONMETADATA.fields_by_name['status_detail']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['cancel_requested']._options = None
  _OPERATIONMETADATA.fields_by_name['cancel_requested']._serialized_options = b'\340A\003'
  _OPERATIONMETADATA.fields_by_name['api_version']._options = None
  _OPERATIONMETADATA.fields_by_name['api_version']._serialized_options = b'\340A\003'
  _LOCATIONMETADATA_AVAILABLEZONESENTRY._options = None
  _LOCATIONMETADATA_AVAILABLEZONESENTRY._serialized_options = b'8\001'
  _LOCATIONMETADATA.fields_by_name['available_zones']._options = None
  _LOCATIONMETADATA.fields_by_name['available_zones']._serialized_options = b'\340A\003'
  _CLOUDMEMCACHE._options = None
  _CLOUDMEMCACHE._serialized_options = b'\312A\027memcache.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _CLOUDMEMCACHE.methods_by_name['ListInstances']._options = None
  _CLOUDMEMCACHE.methods_by_name['ListInstances']._serialized_options = b'\202\323\344\223\0024\0222/v1beta2/{parent=projects/*/locations/*}/instances\332A\006parent'
  _CLOUDMEMCACHE.methods_by_name['GetInstance']._options = None
  _CLOUDMEMCACHE.methods_by_name['GetInstance']._serialized_options = b'\202\323\344\223\0024\0222/v1beta2/{name=projects/*/locations/*/instances/*}\332A\004name'
  _CLOUDMEMCACHE.methods_by_name['CreateInstance']._options = None
  _CLOUDMEMCACHE.methods_by_name['CreateInstance']._serialized_options = b'\202\323\344\223\002>\"2/v1beta2/{parent=projects/*/locations/*}/instances:\010resource\332A\033parent,instance_id,resource\312AY\n&google.cloud.memcache.v1beta2.Instance\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _CLOUDMEMCACHE.methods_by_name['UpdateInstance']._options = None
  _CLOUDMEMCACHE.methods_by_name['UpdateInstance']._serialized_options = b'\202\323\344\223\002G2;/v1beta2/{resource.name=projects/*/locations/*/instances/*}:\010resource\332A\024update_mask,resource\312AY\n&google.cloud.memcache.v1beta2.Instance\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _CLOUDMEMCACHE.methods_by_name['UpdateParameters']._options = None
  _CLOUDMEMCACHE.methods_by_name['UpdateParameters']._serialized_options = b'\202\323\344\223\002H2C/v1beta2/{name=projects/*/locations/*/instances/*}:updateParameters:\001*\332A\033name,update_mask,parameters\312AY\n&google.cloud.memcache.v1beta2.Instance\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _CLOUDMEMCACHE.methods_by_name['DeleteInstance']._options = None
  _CLOUDMEMCACHE.methods_by_name['DeleteInstance']._serialized_options = b'\202\323\344\223\0024*2/v1beta2/{name=projects/*/locations/*/instances/*}\332A\004name\312AH\n\025google.protobuf.Empty\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _CLOUDMEMCACHE.methods_by_name['ApplyParameters']._options = None
  _CLOUDMEMCACHE.methods_by_name['ApplyParameters']._serialized_options = b'\202\323\344\223\002G\"B/v1beta2/{name=projects/*/locations/*/instances/*}:applyParameters:\001*\332A\027name,node_ids,apply_all\312AY\n&google.cloud.memcache.v1beta2.Instance\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _CLOUDMEMCACHE.methods_by_name['ApplySoftwareUpdate']._options = None
  _CLOUDMEMCACHE.methods_by_name['ApplySoftwareUpdate']._serialized_options = b'\202\323\344\223\002O\"J/v1beta2/{instance=projects/*/locations/*/instances/*}:applySoftwareUpdate:\001*\332A\033instance,node_ids,apply_all\312AY\n&google.cloud.memcache.v1beta2.Instance\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _CLOUDMEMCACHE.methods_by_name['RescheduleMaintenance']._options = None
  _CLOUDMEMCACHE.methods_by_name['RescheduleMaintenance']._serialized_options = b'\202\323\344\223\002Q\"L/v1beta2/{instance=projects/*/locations/*/instances/*}:rescheduleMaintenance:\001*\332A(instance, reschedule_type, schedule_time\312AY\n&google.cloud.memcache.v1beta2.Instance\022/google.cloud.memcache.v1beta2.OperationMetadata'
  _MEMCACHEVERSION._serialized_start=5106
  _MEMCACHEVERSION._serialized_end=5175
  _INSTANCE._serialized_start=395
  _INSTANCE._serialized_end=2257
  _INSTANCE_NODECONFIG._serialized_start=1407
  _INSTANCE_NODECONFIG._serialized_end=1472
  _INSTANCE_NODE._serialized_start=1475
  _INSTANCE_NODE._serialized_end=1819
  _INSTANCE_NODE_STATE._serialized_start=1736
  _INSTANCE_NODE_STATE._serialized_end=1819
  _INSTANCE_INSTANCEMESSAGE._serialized_start=1822
  _INSTANCE_INSTANCEMESSAGE._serialized_end=1996
  _INSTANCE_INSTANCEMESSAGE_CODE._serialized_start=1934
  _INSTANCE_INSTANCEMESSAGE_CODE._serialized_end=1996
  _INSTANCE_LABELSENTRY._serialized_start=1998
  _INSTANCE_LABELSENTRY._serialized_end=2043
  _INSTANCE_STATE._serialized_start=2045
  _INSTANCE_STATE._serialized_end=2156
  _MAINTENANCEPOLICY._serialized_start=2260
  _MAINTENANCEPOLICY._serialized_end=2504
  _WEEKLYMAINTENANCEWINDOW._serialized_start=2507
  _WEEKLYMAINTENANCEWINDOW._serialized_end=2673
  _MAINTENANCESCHEDULE._serialized_start=2676
  _MAINTENANCESCHEDULE._serialized_end=2866
  _LISTINSTANCESREQUEST._serialized_start=2869
  _LISTINSTANCESREQUEST._serialized_end=3023
  _LISTINSTANCESRESPONSE._serialized_start=3026
  _LISTINSTANCESRESPONSE._serialized_end=3155
  _GETINSTANCEREQUEST._serialized_start=3157
  _GETINSTANCEREQUEST._serialized_end=3233
  _CREATEINSTANCEREQUEST._serialized_start=3236
  _CREATEINSTANCEREQUEST._serialized_end=3408
  _UPDATEINSTANCEREQUEST._serialized_start=3411
  _UPDATEINSTANCEREQUEST._serialized_end=3552
  _DELETEINSTANCEREQUEST._serialized_start=3554
  _DELETEINSTANCEREQUEST._serialized_end=3633
  _RESCHEDULEMAINTENANCEREQUEST._serialized_start=3636
  _RESCHEDULEMAINTENANCEREQUEST._serialized_end=3995
  _RESCHEDULEMAINTENANCEREQUEST_RESCHEDULETYPE._serialized_start=3885
  _RESCHEDULEMAINTENANCEREQUEST_RESCHEDULETYPE._serialized_end=3995
  _APPLYPARAMETERSREQUEST._serialized_start=3997
  _APPLYPARAMETERSREQUEST._serialized_end=4114
  _UPDATEPARAMETERSREQUEST._serialized_start=4117
  _UPDATEPARAMETERSREQUEST._serialized_end=4323
  _APPLYSOFTWAREUPDATEREQUEST._serialized_start=4325
  _APPLYSOFTWAREUPDATEREQUEST._serialized_end=4450
  _MEMCACHEPARAMETERS._serialized_start=4453
  _MEMCACHEPARAMETERS._serialized_end=4616
  _MEMCACHEPARAMETERS_PARAMSENTRY._serialized_start=4571
  _MEMCACHEPARAMETERS_PARAMSENTRY._serialized_end=4616
  _OPERATIONMETADATA._serialized_start=4619
  _OPERATIONMETADATA._serialized_end=4868
  _LOCATIONMETADATA._serialized_start=4871
  _LOCATIONMETADATA._serialized_end=5088
  _LOCATIONMETADATA_AVAILABLEZONESENTRY._serialized_start=4990
  _LOCATIONMETADATA_AVAILABLEZONESENTRY._serialized_end=5088
  _ZONEMETADATA._serialized_start=5090
  _ZONEMETADATA._serialized_end=5104
  _CLOUDMEMCACHE._serialized_start=5178
  _CLOUDMEMCACHE._serialized_end=7764
# @@protoc_insertion_point(module_scope)