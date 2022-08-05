# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/run/v2/condition.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/cloud/run/v2/condition.proto\x12\x13google.cloud.run.v2\x1a\x1fgoogle/protobuf/timestamp.proto\"\xd5\x0b\n\tCondition\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x33\n\x05state\x18\x02 \x01(\x0e\x32$.google.cloud.run.v2.Condition.State\x12\x0f\n\x07message\x18\x03 \x01(\t\x12\x38\n\x14last_transition_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x39\n\x08severity\x18\x05 \x01(\x0e\x32\'.google.cloud.run.v2.Condition.Severity\x12=\n\x06reason\x18\x06 \x01(\x0e\x32+.google.cloud.run.v2.Condition.CommonReasonH\x00\x12H\n\x0frevision_reason\x18\t \x01(\x0e\x32-.google.cloud.run.v2.Condition.RevisionReasonH\x00\x12J\n\x10\x65xecution_reason\x18\x0b \x01(\x0e\x32..google.cloud.run.v2.Condition.ExecutionReasonH\x00\"\x7f\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x15\n\x11\x43ONDITION_PENDING\x10\x01\x12\x19\n\x15\x43ONDITION_RECONCILING\x10\x02\x12\x14\n\x10\x43ONDITION_FAILED\x10\x03\x12\x17\n\x13\x43ONDITION_SUCCEEDED\x10\x04\"F\n\x08Severity\x12\x18\n\x14SEVERITY_UNSPECIFIED\x10\x00\x12\t\n\x05\x45RROR\x10\x01\x12\x0b\n\x07WARNING\x10\x02\x12\x08\n\x04INFO\x10\x03\"\xb2\x03\n\x0c\x43ommonReason\x12\x1b\n\x17\x43OMMON_REASON_UNDEFINED\x10\x00\x12\x0b\n\x07UNKNOWN\x10\x01\x12\x13\n\x0fREVISION_FAILED\x10\x03\x12\x1e\n\x1aPROGRESS_DEADLINE_EXCEEDED\x10\x04\x12\x15\n\x11\x43ONTAINER_MISSING\x10\x06\x12\x1f\n\x1b\x43ONTAINER_PERMISSION_DENIED\x10\x07\x12 \n\x1c\x43ONTAINER_IMAGE_UNAUTHORIZED\x10\x08\x12.\n*CONTAINER_IMAGE_AUTHORIZATION_CHECK_FAILED\x10\t\x12$\n ENCRYPTION_KEY_PERMISSION_DENIED\x10\n\x12\x1f\n\x1b\x45NCRYPTION_KEY_CHECK_FAILED\x10\x0b\x12\x1f\n\x1bSECRETS_ACCESS_CHECK_FAILED\x10\x0c\x12\x19\n\x15WAITING_FOR_OPERATION\x10\r\x12\x13\n\x0fIMMEDIATE_RETRY\x10\x0e\x12\x13\n\x0fPOSTPONED_RETRY\x10\x0f\x12\x0c\n\x08INTERNAL\x10\x10\"\xaf\x02\n\x0eRevisionReason\x12\x1d\n\x19REVISION_REASON_UNDEFINED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0b\n\x07RESERVE\x10\x02\x12\x0b\n\x07RETIRED\x10\x03\x12\x0c\n\x08RETIRING\x10\x04\x12\x0e\n\nRECREATING\x10\x05\x12 \n\x1cHEALTH_CHECK_CONTAINER_ERROR\x10\x06\x12$\n CUSTOMIZED_PATH_RESPONSE_PENDING\x10\x07\x12!\n\x1dMIN_INSTANCES_NOT_PROVISIONED\x10\x08\x12!\n\x1d\x41\x43TIVE_REVISION_LIMIT_REACHED\x10\t\x12\x11\n\rNO_DEPLOYMENT\x10\n\x12\x18\n\x14HEALTH_CHECK_SKIPPED\x10\x0b\"o\n\x0f\x45xecutionReason\x12\x1e\n\x1a\x45XECUTION_REASON_UNDEFINED\x10\x00\x12$\n JOB_STATUS_SERVICE_POLLING_ERROR\x10\x01\x12\x16\n\x12NON_ZERO_EXIT_CODE\x10\x02\x42\t\n\x07reasonsBc\n\x17\x63om.google.cloud.run.v2B\x0e\x43onditionProtoP\x01Z6google.golang.org/genproto/googleapis/cloud/run/v2;runb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.run.v2.condition_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.cloud.run.v2B\016ConditionProtoP\001Z6google.golang.org/genproto/googleapis/cloud/run/v2;run'
  _CONDITION._serialized_start=94
  _CONDITION._serialized_end=1587
  _CONDITION_STATE._serialized_start=521
  _CONDITION_STATE._serialized_end=648
  _CONDITION_SEVERITY._serialized_start=650
  _CONDITION_SEVERITY._serialized_end=720
  _CONDITION_COMMONREASON._serialized_start=723
  _CONDITION_COMMONREASON._serialized_end=1157
  _CONDITION_REVISIONREASON._serialized_start=1160
  _CONDITION_REVISIONREASON._serialized_end=1463
  _CONDITION_EXECUTIONREASON._serialized_start=1465
  _CONDITION_EXECUTIONREASON._serialized_end=1576
# @@protoc_insertion_point(module_scope)
