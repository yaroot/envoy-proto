# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/tasks/v2/queue.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.tasks.v2 import target_pb2 as google_dot_cloud_dot_tasks_dot_v2_dot_target__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!google/cloud/tasks/v2/queue.proto\x12\x15google.cloud.tasks.v2\x1a\x19google/api/resource.proto\x1a\"google/cloud/tasks/v2/target.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb2\x04\n\x05Queue\x12\x0c\n\x04name\x18\x01 \x01(\t\x12L\n\x1b\x61pp_engine_routing_override\x18\x02 \x01(\x0b\x32\'.google.cloud.tasks.v2.AppEngineRouting\x12\x36\n\x0brate_limits\x18\x03 \x01(\x0b\x32!.google.cloud.tasks.v2.RateLimits\x12\x38\n\x0cretry_config\x18\x04 \x01(\x0b\x32\".google.cloud.tasks.v2.RetryConfig\x12\x31\n\x05state\x18\x05 \x01(\x0e\x32\".google.cloud.tasks.v2.Queue.State\x12.\n\npurge_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12S\n\x1astackdriver_logging_config\x18\t \x01(\x0b\x32/.google.cloud.tasks.v2.StackdriverLoggingConfig\"E\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07RUNNING\x10\x01\x12\n\n\x06PAUSED\x10\x02\x12\x0c\n\x08\x44ISABLED\x10\x03:\\\xea\x41Y\n\x1f\x63loudtasks.googleapis.com/Queue\x12\x36projects/{project}/locations/{location}/queues/{queue}\"j\n\nRateLimits\x12!\n\x19max_dispatches_per_second\x18\x01 \x01(\x01\x12\x16\n\x0emax_burst_size\x18\x02 \x01(\x05\x12!\n\x19max_concurrent_dispatches\x18\x03 \x01(\x05\"\xd1\x01\n\x0bRetryConfig\x12\x14\n\x0cmax_attempts\x18\x01 \x01(\x05\x12\x35\n\x12max_retry_duration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\x12.\n\x0bmin_backoff\x18\x03 \x01(\x0b\x32\x19.google.protobuf.Duration\x12.\n\x0bmax_backoff\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x15\n\rmax_doublings\x18\x05 \x01(\x05\"2\n\x18StackdriverLoggingConfig\x12\x16\n\x0esampling_ratio\x18\x01 \x01(\x01\x42\x65\n\x19\x63om.google.cloud.tasks.v2B\nQueueProtoP\x01Z:google.golang.org/genproto/googleapis/cloud/tasks/v2;tasksb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.tasks.v2.queue_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.google.cloud.tasks.v2B\nQueueProtoP\001Z:google.golang.org/genproto/googleapis/cloud/tasks/v2;tasks'
  _QUEUE._options = None
  _QUEUE._serialized_options = b'\352AY\n\037cloudtasks.googleapis.com/Queue\0226projects/{project}/locations/{location}/queues/{queue}'
  _QUEUE._serialized_start=189
  _QUEUE._serialized_end=751
  _QUEUE_STATE._serialized_start=588
  _QUEUE_STATE._serialized_end=657
  _RATELIMITS._serialized_start=753
  _RATELIMITS._serialized_end=859
  _RETRYCONFIG._serialized_start=862
  _RETRYCONFIG._serialized_end=1071
  _STACKDRIVERLOGGINGCONFIG._serialized_start=1073
  _STACKDRIVERLOGGINGCONFIG._serialized_end=1123
# @@protoc_insertion_point(module_scope)
