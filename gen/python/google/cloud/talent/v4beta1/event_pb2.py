# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/event.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'google/cloud/talent/v4beta1/event.proto\x12\x1bgoogle.cloud.talent.v4beta1\x1a\x1fgoogle/api/field_behavior.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xc8\x01\n\x0b\x43lientEvent\x12\x12\n\nrequest_id\x18\x01 \x01(\t\x12\x15\n\x08\x65vent_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x34\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x03\xe0\x41\x02\x12:\n\tjob_event\x18\x05 \x01(\x0b\x32%.google.cloud.talent.v4beta1.JobEventH\x00\x12\x13\n\x0b\x65vent_notes\x18\t \x01(\tB\x07\n\x05\x65vent\"\xf6\x03\n\x08JobEvent\x12\x45\n\x04type\x18\x01 \x01(\x0e\x32\x32.google.cloud.talent.v4beta1.JobEvent.JobEventTypeB\x03\xe0\x41\x02\x12\x11\n\x04jobs\x18\x02 \x03(\tB\x03\xe0\x41\x02\x12\x0f\n\x07profile\x18\x03 \x01(\t\"\xfe\x02\n\x0cJobEventType\x12\x1e\n\x1aJOB_EVENT_TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nIMPRESSION\x10\x01\x12\x08\n\x04VIEW\x10\x02\x12\x11\n\rVIEW_REDIRECT\x10\x03\x12\x15\n\x11\x41PPLICATION_START\x10\x04\x12\x16\n\x12\x41PPLICATION_FINISH\x10\x05\x12 \n\x1c\x41PPLICATION_QUICK_SUBMISSION\x10\x06\x12\x18\n\x14\x41PPLICATION_REDIRECT\x10\x07\x12!\n\x1d\x41PPLICATION_START_FROM_SEARCH\x10\x08\x12$\n APPLICATION_REDIRECT_FROM_SEARCH\x10\t\x12\x1e\n\x1a\x41PPLICATION_COMPANY_SUBMIT\x10\n\x12\x0c\n\x08\x42OOKMARK\x10\x0b\x12\x10\n\x0cNOTIFICATION\x10\x0c\x12\t\n\x05HIRED\x10\r\x12\x0b\n\x07SENT_CV\x10\x0e\x12\x15\n\x11INTERVIEW_GRANTED\x10\x0f\x42x\n\x1f\x63om.google.cloud.talent.v4beta1B\nEventProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\xa2\x02\x03\x43TSb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.talent.v4beta1.event_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.talent.v4beta1B\nEventProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/talent/v4beta1;talent\242\002\003CTS'
  _CLIENTEVENT.fields_by_name['event_id']._options = None
  _CLIENTEVENT.fields_by_name['event_id']._serialized_options = b'\340A\002'
  _CLIENTEVENT.fields_by_name['create_time']._options = None
  _CLIENTEVENT.fields_by_name['create_time']._serialized_options = b'\340A\002'
  _JOBEVENT.fields_by_name['type']._options = None
  _JOBEVENT.fields_by_name['type']._serialized_options = b'\340A\002'
  _JOBEVENT.fields_by_name['jobs']._options = None
  _JOBEVENT.fields_by_name['jobs']._serialized_options = b'\340A\002'
  _CLIENTEVENT._serialized_start=139
  _CLIENTEVENT._serialized_end=339
  _JOBEVENT._serialized_start=342
  _JOBEVENT._serialized_end=844
  _JOBEVENT_JOBEVENTTYPE._serialized_start=462
  _JOBEVENT_JOBEVENTTYPE._serialized_end=844
# @@protoc_insertion_point(module_scope)
