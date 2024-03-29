# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/datastore/v1/datastore.proto
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
from google.datastore.v1 import aggregation_result_pb2 as google_dot_datastore_dot_v1_dot_aggregation__result__pb2
from google.datastore.v1 import entity_pb2 as google_dot_datastore_dot_v1_dot_entity__pb2
from google.datastore.v1 import query_pb2 as google_dot_datastore_dot_v1_dot_query__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/datastore/v1/datastore.proto\x12\x13google.datastore.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a,google/datastore/v1/aggregation_result.proto\x1a google/datastore/v1/entity.proto\x1a\x1fgoogle/datastore/v1/query.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa2\x01\n\rLookupRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12\x36\n\x0cread_options\x18\x01 \x01(\x0b\x32 .google.datastore.v1.ReadOptions\x12+\n\x04keys\x18\x03 \x03(\x0b\x32\x18.google.datastore.v1.KeyB\x03\xe0\x41\x02\"\xd1\x01\n\x0eLookupResponse\x12\x30\n\x05\x66ound\x18\x01 \x03(\x0b\x32!.google.datastore.v1.EntityResult\x12\x32\n\x07missing\x18\x02 \x03(\x0b\x32!.google.datastore.v1.EntityResult\x12*\n\x08\x64\x65\x66\x65rred\x18\x03 \x03(\x0b\x32\x18.google.datastore.v1.Key\x12-\n\tread_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\x9e\x02\n\x0fRunQueryRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12\x36\n\x0cpartition_id\x18\x02 \x01(\x0b\x32 .google.datastore.v1.PartitionId\x12\x36\n\x0cread_options\x18\x01 \x01(\x0b\x32 .google.datastore.v1.ReadOptions\x12+\n\x05query\x18\x03 \x01(\x0b\x32\x1a.google.datastore.v1.QueryH\x00\x12\x32\n\tgql_query\x18\x07 \x01(\x0b\x32\x1d.google.datastore.v1.GqlQueryH\x00\x42\x0c\n\nquery_type\"s\n\x10RunQueryResponse\x12\x34\n\x05\x62\x61tch\x18\x01 \x01(\x0b\x32%.google.datastore.v1.QueryResultBatch\x12)\n\x05query\x18\x02 \x01(\x0b\x32\x1a.google.datastore.v1.Query\"\xc0\x02\n\x1aRunAggregationQueryRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12\x36\n\x0cpartition_id\x18\x02 \x01(\x0b\x32 .google.datastore.v1.PartitionId\x12\x36\n\x0cread_options\x18\x01 \x01(\x0b\x32 .google.datastore.v1.ReadOptions\x12\x42\n\x11\x61ggregation_query\x18\x03 \x01(\x0b\x32%.google.datastore.v1.AggregationQueryH\x00\x12\x32\n\tgql_query\x18\x07 \x01(\x0b\x32\x1d.google.datastore.v1.GqlQueryH\x00\x42\x0c\n\nquery_type\"\x8f\x01\n\x1bRunAggregationQueryResponse\x12:\n\x05\x62\x61tch\x18\x01 \x01(\x0b\x32+.google.datastore.v1.AggregationResultBatch\x12\x34\n\x05query\x18\x02 \x01(\x0b\x32%.google.datastore.v1.AggregationQuery\"\x8d\x01\n\x17\x42\x65ginTransactionRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12\x44\n\x13transaction_options\x18\n \x01(\x0b\x32\'.google.datastore.v1.TransactionOptions\"/\n\x18\x42\x65ginTransactionResponse\x12\x13\n\x0btransaction\x18\x01 \x01(\x0c\"Y\n\x0fRollbackRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12\x18\n\x0btransaction\x18\x01 \x01(\x0c\x42\x03\xe0\x41\x02\"\x12\n\x10RollbackResponse\"\x9d\x02\n\rCommitRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12\x35\n\x04mode\x18\x05 \x01(\x0e\x32\'.google.datastore.v1.CommitRequest.Mode\x12\x15\n\x0btransaction\x18\x01 \x01(\x0cH\x00\x12\x30\n\tmutations\x18\x06 \x03(\x0b\x32\x1d.google.datastore.v1.Mutation\"F\n\x04Mode\x12\x14\n\x10MODE_UNSPECIFIED\x10\x00\x12\x11\n\rTRANSACTIONAL\x10\x01\x12\x15\n\x11NON_TRANSACTIONAL\x10\x02\x42\x16\n\x14transaction_selector\"\x97\x01\n\x0e\x43ommitResponse\x12=\n\x10mutation_results\x18\x03 \x03(\x0b\x32#.google.datastore.v1.MutationResult\x12\x15\n\rindex_updates\x18\x04 \x01(\x05\x12/\n\x0b\x63ommit_time\x18\x08 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"o\n\x12\x41llocateIdsRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12+\n\x04keys\x18\x01 \x03(\x0b\x32\x18.google.datastore.v1.KeyB\x03\xe0\x41\x02\"=\n\x13\x41llocateIdsResponse\x12&\n\x04keys\x18\x01 \x03(\x0b\x32\x18.google.datastore.v1.Key\"n\n\x11ReserveIdsRequest\x12\x17\n\nproject_id\x18\x08 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64\x61tabase_id\x18\t \x01(\t\x12+\n\x04keys\x18\x01 \x03(\x0b\x32\x18.google.datastore.v1.KeyB\x03\xe0\x41\x02\"\x14\n\x12ReserveIdsResponse\"\xba\x02\n\x08Mutation\x12-\n\x06insert\x18\x04 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12-\n\x06update\x18\x05 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12-\n\x06upsert\x18\x06 \x01(\x0b\x32\x1b.google.datastore.v1.EntityH\x00\x12*\n\x06\x64\x65lete\x18\x07 \x01(\x0b\x32\x18.google.datastore.v1.KeyH\x00\x12\x16\n\x0c\x62\x61se_version\x18\x08 \x01(\x03H\x01\x12\x31\n\x0bupdate_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x01\x42\x0b\n\toperationB\x1d\n\x1b\x63onflict_detection_strategy\"\x94\x01\n\x0eMutationResult\x12%\n\x03key\x18\x03 \x01(\x0b\x32\x18.google.datastore.v1.Key\x12\x0f\n\x07version\x18\x04 \x01(\x03\x12/\n\x0bupdate_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x19\n\x11\x63onflict_detected\x18\x05 \x01(\x08\"\x86\x02\n\x0bReadOptions\x12L\n\x10read_consistency\x18\x01 \x01(\x0e\x32\x30.google.datastore.v1.ReadOptions.ReadConsistencyH\x00\x12\x15\n\x0btransaction\x18\x02 \x01(\x0cH\x00\x12/\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\"M\n\x0fReadConsistency\x12 \n\x1cREAD_CONSISTENCY_UNSPECIFIED\x10\x00\x12\n\n\x06STRONG\x10\x01\x12\x0c\n\x08\x45VENTUAL\x10\x02\x42\x12\n\x10\x63onsistency_type\"\x92\x02\n\x12TransactionOptions\x12G\n\nread_write\x18\x01 \x01(\x0b\x32\x31.google.datastore.v1.TransactionOptions.ReadWriteH\x00\x12\x45\n\tread_only\x18\x02 \x01(\x0b\x32\x30.google.datastore.v1.TransactionOptions.ReadOnlyH\x00\x1a)\n\tReadWrite\x12\x1c\n\x14previous_transaction\x18\x01 \x01(\x0c\x1a\x39\n\x08ReadOnly\x12-\n\tread_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x06\n\x04mode2\xc8\x0b\n\tDatastore\x12\x9d\x01\n\x06Lookup\x12\".google.datastore.v1.LookupRequest\x1a#.google.datastore.v1.LookupResponse\"J\x82\xd3\xe4\x93\x02%\" /v1/projects/{project_id}:lookup:\x01*\xda\x41\x1cproject_id,read_options,keys\x12\x86\x01\n\x08RunQuery\x12$.google.datastore.v1.RunQueryRequest\x1a%.google.datastore.v1.RunQueryResponse\"-\x82\xd3\xe4\x93\x02\'\"\"/v1/projects/{project_id}:runQuery:\x01*\x12\xb2\x01\n\x13RunAggregationQuery\x12/.google.datastore.v1.RunAggregationQueryRequest\x1a\x30.google.datastore.v1.RunAggregationQueryResponse\"8\x82\xd3\xe4\x93\x02\x32\"-/v1/projects/{project_id}:runAggregationQuery:\x01*\x12\xb3\x01\n\x10\x42\x65ginTransaction\x12,.google.datastore.v1.BeginTransactionRequest\x1a-.google.datastore.v1.BeginTransactionResponse\"B\x82\xd3\xe4\x93\x02/\"*/v1/projects/{project_id}:beginTransaction:\x01*\xda\x41\nproject_id\x12\xc2\x01\n\x06\x43ommit\x12\".google.datastore.v1.CommitRequest\x1a#.google.datastore.v1.CommitResponse\"o\x82\xd3\xe4\x93\x02%\" /v1/projects/{project_id}:commit:\x01*\xda\x41%project_id,mode,transaction,mutations\xda\x41\x19project_id,mode,mutations\x12\x9f\x01\n\x08Rollback\x12$.google.datastore.v1.RollbackRequest\x1a%.google.datastore.v1.RollbackResponse\"F\x82\xd3\xe4\x93\x02\'\"\"/v1/projects/{project_id}:rollback:\x01*\xda\x41\x16project_id,transaction\x12\xa4\x01\n\x0b\x41llocateIds\x12\'.google.datastore.v1.AllocateIdsRequest\x1a(.google.datastore.v1.AllocateIdsResponse\"B\x82\xd3\xe4\x93\x02*\"%/v1/projects/{project_id}:allocateIds:\x01*\xda\x41\x0fproject_id,keys\x12\xa0\x01\n\nReserveIds\x12&.google.datastore.v1.ReserveIdsRequest\x1a\'.google.datastore.v1.ReserveIdsResponse\"A\x82\xd3\xe4\x93\x02)\"$/v1/projects/{project_id}:reserveIds:\x01*\xda\x41\x0fproject_id,keys\x1av\xca\x41\x18\x64\x61tastore.googleapis.com\xd2\x41Xhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/datastoreB\xc0\x01\n\x17\x63om.google.datastore.v1B\x0e\x44\x61tastoreProtoP\x01Z<google.golang.org/genproto/googleapis/datastore/v1;datastore\xaa\x02\x19Google.Cloud.Datastore.V1\xca\x02\x19Google\\Cloud\\Datastore\\V1\xea\x02\x1cGoogle::Cloud::Datastore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.datastore.v1.datastore_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.datastore.v1B\016DatastoreProtoP\001Z<google.golang.org/genproto/googleapis/datastore/v1;datastore\252\002\031Google.Cloud.Datastore.V1\312\002\031Google\\Cloud\\Datastore\\V1\352\002\034Google::Cloud::Datastore::V1'
  _LOOKUPREQUEST.fields_by_name['project_id']._options = None
  _LOOKUPREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _LOOKUPREQUEST.fields_by_name['keys']._options = None
  _LOOKUPREQUEST.fields_by_name['keys']._serialized_options = b'\340A\002'
  _RUNQUERYREQUEST.fields_by_name['project_id']._options = None
  _RUNQUERYREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _RUNAGGREGATIONQUERYREQUEST.fields_by_name['project_id']._options = None
  _RUNAGGREGATIONQUERYREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _BEGINTRANSACTIONREQUEST.fields_by_name['project_id']._options = None
  _BEGINTRANSACTIONREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _ROLLBACKREQUEST.fields_by_name['project_id']._options = None
  _ROLLBACKREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _ROLLBACKREQUEST.fields_by_name['transaction']._options = None
  _ROLLBACKREQUEST.fields_by_name['transaction']._serialized_options = b'\340A\002'
  _COMMITREQUEST.fields_by_name['project_id']._options = None
  _COMMITREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _ALLOCATEIDSREQUEST.fields_by_name['project_id']._options = None
  _ALLOCATEIDSREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _ALLOCATEIDSREQUEST.fields_by_name['keys']._options = None
  _ALLOCATEIDSREQUEST.fields_by_name['keys']._serialized_options = b'\340A\002'
  _RESERVEIDSREQUEST.fields_by_name['project_id']._options = None
  _RESERVEIDSREQUEST.fields_by_name['project_id']._serialized_options = b'\340A\002'
  _RESERVEIDSREQUEST.fields_by_name['keys']._options = None
  _RESERVEIDSREQUEST.fields_by_name['keys']._serialized_options = b'\340A\002'
  _DATASTORE._options = None
  _DATASTORE._serialized_options = b'\312A\030datastore.googleapis.com\322AXhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/datastore'
  _DATASTORE.methods_by_name['Lookup']._options = None
  _DATASTORE.methods_by_name['Lookup']._serialized_options = b'\202\323\344\223\002%\" /v1/projects/{project_id}:lookup:\001*\332A\034project_id,read_options,keys'
  _DATASTORE.methods_by_name['RunQuery']._options = None
  _DATASTORE.methods_by_name['RunQuery']._serialized_options = b'\202\323\344\223\002\'\"\"/v1/projects/{project_id}:runQuery:\001*'
  _DATASTORE.methods_by_name['RunAggregationQuery']._options = None
  _DATASTORE.methods_by_name['RunAggregationQuery']._serialized_options = b'\202\323\344\223\0022\"-/v1/projects/{project_id}:runAggregationQuery:\001*'
  _DATASTORE.methods_by_name['BeginTransaction']._options = None
  _DATASTORE.methods_by_name['BeginTransaction']._serialized_options = b'\202\323\344\223\002/\"*/v1/projects/{project_id}:beginTransaction:\001*\332A\nproject_id'
  _DATASTORE.methods_by_name['Commit']._options = None
  _DATASTORE.methods_by_name['Commit']._serialized_options = b'\202\323\344\223\002%\" /v1/projects/{project_id}:commit:\001*\332A%project_id,mode,transaction,mutations\332A\031project_id,mode,mutations'
  _DATASTORE.methods_by_name['Rollback']._options = None
  _DATASTORE.methods_by_name['Rollback']._serialized_options = b'\202\323\344\223\002\'\"\"/v1/projects/{project_id}:rollback:\001*\332A\026project_id,transaction'
  _DATASTORE.methods_by_name['AllocateIds']._options = None
  _DATASTORE.methods_by_name['AllocateIds']._serialized_options = b'\202\323\344\223\002*\"%/v1/projects/{project_id}:allocateIds:\001*\332A\017project_id,keys'
  _DATASTORE.methods_by_name['ReserveIds']._options = None
  _DATASTORE.methods_by_name['ReserveIds']._serialized_options = b'\202\323\344\223\002)\"$/v1/projects/{project_id}:reserveIds:\001*\332A\017project_id,keys'
  _LOOKUPREQUEST._serialized_start=295
  _LOOKUPREQUEST._serialized_end=457
  _LOOKUPRESPONSE._serialized_start=460
  _LOOKUPRESPONSE._serialized_end=669
  _RUNQUERYREQUEST._serialized_start=672
  _RUNQUERYREQUEST._serialized_end=958
  _RUNQUERYRESPONSE._serialized_start=960
  _RUNQUERYRESPONSE._serialized_end=1075
  _RUNAGGREGATIONQUERYREQUEST._serialized_start=1078
  _RUNAGGREGATIONQUERYREQUEST._serialized_end=1398
  _RUNAGGREGATIONQUERYRESPONSE._serialized_start=1401
  _RUNAGGREGATIONQUERYRESPONSE._serialized_end=1544
  _BEGINTRANSACTIONREQUEST._serialized_start=1547
  _BEGINTRANSACTIONREQUEST._serialized_end=1688
  _BEGINTRANSACTIONRESPONSE._serialized_start=1690
  _BEGINTRANSACTIONRESPONSE._serialized_end=1737
  _ROLLBACKREQUEST._serialized_start=1739
  _ROLLBACKREQUEST._serialized_end=1828
  _ROLLBACKRESPONSE._serialized_start=1830
  _ROLLBACKRESPONSE._serialized_end=1848
  _COMMITREQUEST._serialized_start=1851
  _COMMITREQUEST._serialized_end=2136
  _COMMITREQUEST_MODE._serialized_start=2042
  _COMMITREQUEST_MODE._serialized_end=2112
  _COMMITRESPONSE._serialized_start=2139
  _COMMITRESPONSE._serialized_end=2290
  _ALLOCATEIDSREQUEST._serialized_start=2292
  _ALLOCATEIDSREQUEST._serialized_end=2403
  _ALLOCATEIDSRESPONSE._serialized_start=2405
  _ALLOCATEIDSRESPONSE._serialized_end=2466
  _RESERVEIDSREQUEST._serialized_start=2468
  _RESERVEIDSREQUEST._serialized_end=2578
  _RESERVEIDSRESPONSE._serialized_start=2580
  _RESERVEIDSRESPONSE._serialized_end=2600
  _MUTATION._serialized_start=2603
  _MUTATION._serialized_end=2917
  _MUTATIONRESULT._serialized_start=2920
  _MUTATIONRESULT._serialized_end=3068
  _READOPTIONS._serialized_start=3071
  _READOPTIONS._serialized_end=3333
  _READOPTIONS_READCONSISTENCY._serialized_start=3236
  _READOPTIONS_READCONSISTENCY._serialized_end=3313
  _TRANSACTIONOPTIONS._serialized_start=3336
  _TRANSACTIONOPTIONS._serialized_end=3610
  _TRANSACTIONOPTIONS_READWRITE._serialized_start=3502
  _TRANSACTIONOPTIONS_READWRITE._serialized_end=3543
  _TRANSACTIONOPTIONS_READONLY._serialized_start=3545
  _TRANSACTIONOPTIONS_READONLY._serialized_end=3602
  _DATASTORE._serialized_start=3613
  _DATASTORE._serialized_end=5093
# @@protoc_insertion_point(module_scope)
