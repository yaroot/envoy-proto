# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/firestore/v1/firestore.proto
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
from google.firestore.v1 import common_pb2 as google_dot_firestore_dot_v1_dot_common__pb2
from google.firestore.v1 import document_pb2 as google_dot_firestore_dot_v1_dot_document__pb2
from google.firestore.v1 import query_pb2 as google_dot_firestore_dot_v1_dot_query__pb2
from google.firestore.v1 import write_pb2 as google_dot_firestore_dot_v1_dot_write__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#google/firestore/v1/firestore.proto\x12\x13google.firestore.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a google/firestore/v1/common.proto\x1a\"google/firestore/v1/document.proto\x1a\x1fgoogle/firestore/v1/query.proto\x1a\x1fgoogle/firestore/v1/write.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xb8\x01\n\x12GetDocumentRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12/\n\x04mask\x18\x02 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\x12\x15\n\x0btransaction\x18\x03 \x01(\x0cH\x00\x12/\n\tread_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x16\n\x14\x63onsistency_selector\"\xa7\x02\n\x14ListDocumentsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\rcollection_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x10\n\x08order_by\x18\x06 \x01(\t\x12/\n\x04mask\x18\x07 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\x12\x15\n\x0btransaction\x18\x08 \x01(\x0cH\x00\x12/\n\tread_time\x18\n \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x12\x14\n\x0cshow_missing\x18\x0c \x01(\x08\x42\x16\n\x14\x63onsistency_selector\"b\n\x15ListDocumentsResponse\x12\x30\n\tdocuments\x18\x01 \x03(\x0b\x32\x1d.google.firestore.v1.Document\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xc4\x01\n\x15\x43reateDocumentRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x1a\n\rcollection_id\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x13\n\x0b\x64ocument_id\x18\x03 \x01(\t\x12\x34\n\x08\x64ocument\x18\x04 \x01(\x0b\x32\x1d.google.firestore.v1.DocumentB\x03\xe0\x41\x02\x12/\n\x04mask\x18\x05 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\"\xf3\x01\n\x15UpdateDocumentRequest\x12\x34\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\x1d.google.firestore.v1.DocumentB\x03\xe0\x41\x02\x12\x36\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\x12/\n\x04mask\x18\x03 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\x12;\n\x10\x63urrent_document\x18\x04 \x01(\x0b\x32!.google.firestore.v1.Precondition\"g\n\x15\x44\x65leteDocumentRequest\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12;\n\x10\x63urrent_document\x18\x02 \x01(\x0b\x32!.google.firestore.v1.Precondition\"\x99\x02\n\x18\x42\x61tchGetDocumentsRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tdocuments\x18\x02 \x03(\t\x12/\n\x04mask\x18\x03 \x01(\x0b\x32!.google.firestore.v1.DocumentMask\x12\x15\n\x0btransaction\x18\x04 \x01(\x0cH\x00\x12\x42\n\x0fnew_transaction\x18\x05 \x01(\x0b\x32\'.google.firestore.v1.TransactionOptionsH\x00\x12/\n\tread_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x16\n\x14\x63onsistency_selector\"\xac\x01\n\x19\x42\x61tchGetDocumentsResponse\x12.\n\x05\x66ound\x18\x01 \x01(\x0b\x32\x1d.google.firestore.v1.DocumentH\x00\x12\x11\n\x07missing\x18\x02 \x01(\tH\x00\x12\x13\n\x0btransaction\x18\x03 \x01(\x0c\x12-\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\n\x06result\"j\n\x17\x42\x65ginTransactionRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x38\n\x07options\x18\x02 \x01(\x0b\x32\'.google.firestore.v1.TransactionOptions\"/\n\x18\x42\x65ginTransactionResponse\x12\x13\n\x0btransaction\x18\x01 \x01(\x0c\"g\n\rCommitRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12*\n\x06writes\x18\x02 \x03(\x0b\x32\x1a.google.firestore.v1.Write\x12\x13\n\x0btransaction\x18\x03 \x01(\x0c\"z\n\x0e\x43ommitResponse\x12\x37\n\rwrite_results\x18\x01 \x03(\x0b\x32 .google.firestore.v1.WriteResult\x12/\n\x0b\x63ommit_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"B\n\x0fRollbackRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x18\n\x0btransaction\x18\x02 \x01(\x0c\x42\x03\xe0\x41\x02\"\x9a\x02\n\x0fRunQueryRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12@\n\x10structured_query\x18\x02 \x01(\x0b\x32$.google.firestore.v1.StructuredQueryH\x00\x12\x15\n\x0btransaction\x18\x05 \x01(\x0cH\x01\x12\x42\n\x0fnew_transaction\x18\x06 \x01(\x0b\x32\'.google.firestore.v1.TransactionOptionsH\x01\x12/\n\tread_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x01\x42\x0c\n\nquery_typeB\x16\n\x14\x63onsistency_selector\"\xc9\x01\n\x10RunQueryResponse\x12\x13\n\x0btransaction\x18\x02 \x01(\x0c\x12/\n\x08\x64ocument\x18\x01 \x01(\x0b\x32\x1d.google.firestore.v1.Document\x12-\n\tread_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x17\n\x0fskipped_results\x18\x04 \x01(\x05\x12\x0e\n\x04\x64one\x18\x06 \x01(\x08H\x00\x42\x17\n\x15\x63ontinuation_selector\"\x85\x02\n\x15PartitionQueryRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12@\n\x10structured_query\x18\x02 \x01(\x0b\x32$.google.firestore.v1.StructuredQueryH\x00\x12\x17\n\x0fpartition_count\x18\x03 \x01(\x03\x12\x12\n\npage_token\x18\x04 \x01(\t\x12\x11\n\tpage_size\x18\x05 \x01(\x05\x12/\n\tread_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x01\x42\x0c\n\nquery_typeB\x16\n\x14\x63onsistency_selector\"b\n\x16PartitionQueryResponse\x12/\n\npartitions\x18\x01 \x03(\x0b\x32\x1b.google.firestore.v1.Cursor\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xe8\x01\n\x0cWriteRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tstream_id\x18\x02 \x01(\t\x12*\n\x06writes\x18\x03 \x03(\x0b\x32\x1a.google.firestore.v1.Write\x12\x14\n\x0cstream_token\x18\x04 \x01(\x0c\x12=\n\x06labels\x18\x05 \x03(\x0b\x32-.google.firestore.v1.WriteRequest.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\xa2\x01\n\rWriteResponse\x12\x11\n\tstream_id\x18\x01 \x01(\t\x12\x14\n\x0cstream_token\x18\x02 \x01(\x0c\x12\x37\n\rwrite_results\x18\x03 \x03(\x0b\x32 .google.firestore.v1.WriteResult\x12/\n\x0b\x63ommit_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"\xf2\x01\n\rListenRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x31\n\nadd_target\x18\x02 \x01(\x0b\x32\x1b.google.firestore.v1.TargetH\x00\x12\x17\n\rremove_target\x18\x03 \x01(\x05H\x00\x12>\n\x06labels\x18\x04 \x03(\x0b\x32..google.firestore.v1.ListenRequest.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x42\x0f\n\rtarget_change\"\xd5\x02\n\x0eListenResponse\x12:\n\rtarget_change\x18\x02 \x01(\x0b\x32!.google.firestore.v1.TargetChangeH\x00\x12>\n\x0f\x64ocument_change\x18\x03 \x01(\x0b\x32#.google.firestore.v1.DocumentChangeH\x00\x12>\n\x0f\x64ocument_delete\x18\x04 \x01(\x0b\x32#.google.firestore.v1.DocumentDeleteH\x00\x12>\n\x0f\x64ocument_remove\x18\x06 \x01(\x0b\x32#.google.firestore.v1.DocumentRemoveH\x00\x12\x36\n\x06\x66ilter\x18\x05 \x01(\x0b\x32$.google.firestore.v1.ExistenceFilterH\x00\x42\x0f\n\rresponse_type\"\xa1\x03\n\x06Target\x12\x38\n\x05query\x18\x02 \x01(\x0b\x32\'.google.firestore.v1.Target.QueryTargetH\x00\x12@\n\tdocuments\x18\x03 \x01(\x0b\x32+.google.firestore.v1.Target.DocumentsTargetH\x00\x12\x16\n\x0cresume_token\x18\x04 \x01(\x0cH\x01\x12/\n\tread_time\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x01\x12\x11\n\ttarget_id\x18\x05 \x01(\x05\x12\x0c\n\x04once\x18\x06 \x01(\x08\x1a$\n\x0f\x44ocumentsTarget\x12\x11\n\tdocuments\x18\x02 \x03(\t\x1am\n\x0bQueryTarget\x12\x0e\n\x06parent\x18\x01 \x01(\t\x12@\n\x10structured_query\x18\x02 \x01(\x0b\x32$.google.firestore.v1.StructuredQueryH\x00\x42\x0c\n\nquery_typeB\r\n\x0btarget_typeB\r\n\x0bresume_type\"\xaa\x02\n\x0cTargetChange\x12N\n\x12target_change_type\x18\x01 \x01(\x0e\x32\x32.google.firestore.v1.TargetChange.TargetChangeType\x12\x12\n\ntarget_ids\x18\x02 \x03(\x05\x12!\n\x05\x63\x61use\x18\x03 \x01(\x0b\x32\x12.google.rpc.Status\x12\x14\n\x0cresume_token\x18\x04 \x01(\x0c\x12-\n\tread_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\"N\n\x10TargetChangeType\x12\r\n\tNO_CHANGE\x10\x00\x12\x07\n\x03\x41\x44\x44\x10\x01\x12\n\n\x06REMOVE\x10\x02\x12\x0b\n\x07\x43URRENT\x10\x03\x12\t\n\x05RESET\x10\x04\"\x9f\x01\n\x18ListCollectionIdsRequest\x12\x13\n\x06parent\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12/\n\tread_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampH\x00\x42\x16\n\x14\x63onsistency_selector\"L\n\x19ListCollectionIdsResponse\x12\x16\n\x0e\x63ollection_ids\x18\x01 \x03(\t\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xc9\x01\n\x11\x42\x61tchWriteRequest\x12\x15\n\x08\x64\x61tabase\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12*\n\x06writes\x18\x02 \x03(\x0b\x32\x1a.google.firestore.v1.Write\x12\x42\n\x06labels\x18\x03 \x03(\x0b\x32\x32.google.firestore.v1.BatchWriteRequest.LabelsEntry\x1a-\n\x0bLabelsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"q\n\x12\x42\x61tchWriteResponse\x12\x37\n\rwrite_results\x18\x01 \x03(\x0b\x32 .google.firestore.v1.WriteResult\x12\"\n\x06status\x18\x02 \x03(\x0b\x32\x12.google.rpc.Status2\xc0\x17\n\tFirestore\x12\x8f\x01\n\x0bGetDocument\x12\'.google.firestore.v1.GetDocumentRequest\x1a\x1d.google.firestore.v1.Document\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/v1/{name=projects/*/databases/*/documents/*/**}\x12\xf5\x01\n\rListDocuments\x12).google.firestore.v1.ListDocumentsRequest\x1a*.google.firestore.v1.ListDocumentsResponse\"\x8c\x01\x82\xd3\xe4\x93\x02\x85\x01\x12\x42/v1/{parent=projects/*/databases/*/documents/*/**}/{collection_id}Z?\x12=/v1/{parent=projects/*/databases/*/documents}/{collection_id}\x12\xbf\x01\n\x0eUpdateDocument\x12*.google.firestore.v1.UpdateDocumentRequest\x1a\x1d.google.firestore.v1.Document\"b\x82\xd3\xe4\x93\x02\x45\x32\x39/v1/{document.name=projects/*/databases/*/documents/*/**}:\x08\x64ocument\xda\x41\x14\x64ocument,update_mask\x12\x95\x01\n\x0e\x44\x65leteDocument\x12*.google.firestore.v1.DeleteDocumentRequest\x1a\x16.google.protobuf.Empty\"?\x82\xd3\xe4\x93\x02\x32*0/v1/{name=projects/*/databases/*/documents/*/**}\xda\x41\x04name\x12\xb9\x01\n\x11\x42\x61tchGetDocuments\x12-.google.firestore.v1.BatchGetDocumentsRequest\x1a..google.firestore.v1.BatchGetDocumentsResponse\"C\x82\xd3\xe4\x93\x02=\"8/v1/{database=projects/*/databases/*}/documents:batchGet:\x01*0\x01\x12\xc7\x01\n\x10\x42\x65ginTransaction\x12,.google.firestore.v1.BeginTransactionRequest\x1a-.google.firestore.v1.BeginTransactionResponse\"V\x82\xd3\xe4\x93\x02\x45\"@/v1/{database=projects/*/databases/*}/documents:beginTransaction:\x01*\xda\x41\x08\x64\x61tabase\x12\xa6\x01\n\x06\x43ommit\x12\".google.firestore.v1.CommitRequest\x1a#.google.firestore.v1.CommitResponse\"S\x82\xd3\xe4\x93\x02;\"6/v1/{database=projects/*/databases/*}/documents:commit:\x01*\xda\x41\x0f\x64\x61tabase,writes\x12\xa4\x01\n\x08Rollback\x12$.google.firestore.v1.RollbackRequest\x1a\x16.google.protobuf.Empty\"Z\x82\xd3\xe4\x93\x02=\"8/v1/{database=projects/*/databases/*}/documents:rollback:\x01*\xda\x41\x14\x64\x61tabase,transaction\x12\xdf\x01\n\x08RunQuery\x12$.google.firestore.v1.RunQueryRequest\x1a%.google.firestore.v1.RunQueryResponse\"\x83\x01\x82\xd3\xe4\x93\x02}\"6/v1/{parent=projects/*/databases/*/documents}:runQuery:\x01*Z@\";/v1/{parent=projects/*/databases/*/documents/*/**}:runQuery:\x01*0\x01\x12\xfc\x01\n\x0ePartitionQuery\x12*.google.firestore.v1.PartitionQueryRequest\x1a+.google.firestore.v1.PartitionQueryResponse\"\x90\x01\x82\xd3\xe4\x93\x02\x89\x01\"</v1/{parent=projects/*/databases/*/documents}:partitionQuery:\x01*ZF\"A/v1/{parent=projects/*/databases/*/documents/*/**}:partitionQuery:\x01*\x12\x94\x01\n\x05Write\x12!.google.firestore.v1.WriteRequest\x1a\".google.firestore.v1.WriteResponse\"@\x82\xd3\xe4\x93\x02:\"5/v1/{database=projects/*/databases/*}/documents:write:\x01*(\x01\x30\x01\x12\x98\x01\n\x06Listen\x12\".google.firestore.v1.ListenRequest\x1a#.google.firestore.v1.ListenResponse\"A\x82\xd3\xe4\x93\x02;\"6/v1/{database=projects/*/databases/*}/documents:listen:\x01*(\x01\x30\x01\x12\x94\x02\n\x11ListCollectionIds\x12-.google.firestore.v1.ListCollectionIdsRequest\x1a..google.firestore.v1.ListCollectionIdsResponse\"\x9f\x01\x82\xd3\xe4\x93\x02\x8f\x01\"?/v1/{parent=projects/*/databases/*/documents}:listCollectionIds:\x01*ZI\"D/v1/{parent=projects/*/databases/*/documents/*/**}:listCollectionIds:\x01*\xda\x41\x06parent\x12\xa4\x01\n\nBatchWrite\x12&.google.firestore.v1.BatchWriteRequest\x1a\'.google.firestore.v1.BatchWriteResponse\"E\x82\xd3\xe4\x93\x02?\":/v1/{database=projects/*/databases/*}/documents:batchWrite:\x01*\x12\xaf\x01\n\x0e\x43reateDocument\x12*.google.firestore.v1.CreateDocumentRequest\x1a\x1d.google.firestore.v1.Document\"R\x82\xd3\xe4\x93\x02L\"@/v1/{parent=projects/*/databases/*/documents/**}/{collection_id}:\x08\x64ocument\x1av\xca\x41\x18\x66irestore.googleapis.com\xd2\x41Xhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/datastoreB\xc0\x01\n\x17\x63om.google.firestore.v1B\x0e\x46irestoreProtoP\x01Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\xaa\x02\x19Google.Cloud.Firestore.V1\xca\x02\x19Google\\Cloud\\Firestore\\V1\xea\x02\x1cGoogle::Cloud::Firestore::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.firestore.v1.firestore_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.google.firestore.v1B\016FirestoreProtoP\001Z<google.golang.org/genproto/googleapis/firestore/v1;firestore\252\002\031Google.Cloud.Firestore.V1\312\002\031Google\\Cloud\\Firestore\\V1\352\002\034Google::Cloud::Firestore::V1'
  _GETDOCUMENTREQUEST.fields_by_name['name']._options = None
  _GETDOCUMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _LISTDOCUMENTSREQUEST.fields_by_name['parent']._options = None
  _LISTDOCUMENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _LISTDOCUMENTSREQUEST.fields_by_name['collection_id']._options = None
  _LISTDOCUMENTSREQUEST.fields_by_name['collection_id']._serialized_options = b'\340A\002'
  _CREATEDOCUMENTREQUEST.fields_by_name['parent']._options = None
  _CREATEDOCUMENTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _CREATEDOCUMENTREQUEST.fields_by_name['collection_id']._options = None
  _CREATEDOCUMENTREQUEST.fields_by_name['collection_id']._serialized_options = b'\340A\002'
  _CREATEDOCUMENTREQUEST.fields_by_name['document']._options = None
  _CREATEDOCUMENTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _UPDATEDOCUMENTREQUEST.fields_by_name['document']._options = None
  _UPDATEDOCUMENTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _DELETEDOCUMENTREQUEST.fields_by_name['name']._options = None
  _DELETEDOCUMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002'
  _BATCHGETDOCUMENTSREQUEST.fields_by_name['database']._options = None
  _BATCHGETDOCUMENTSREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _BEGINTRANSACTIONREQUEST.fields_by_name['database']._options = None
  _BEGINTRANSACTIONREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _COMMITREQUEST.fields_by_name['database']._options = None
  _COMMITREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _ROLLBACKREQUEST.fields_by_name['database']._options = None
  _ROLLBACKREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _ROLLBACKREQUEST.fields_by_name['transaction']._options = None
  _ROLLBACKREQUEST.fields_by_name['transaction']._serialized_options = b'\340A\002'
  _RUNQUERYREQUEST.fields_by_name['parent']._options = None
  _RUNQUERYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _PARTITIONQUERYREQUEST.fields_by_name['parent']._options = None
  _PARTITIONQUERYREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _WRITEREQUEST_LABELSENTRY._options = None
  _WRITEREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _WRITEREQUEST.fields_by_name['database']._options = None
  _WRITEREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _LISTENREQUEST_LABELSENTRY._options = None
  _LISTENREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _LISTENREQUEST.fields_by_name['database']._options = None
  _LISTENREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _LISTCOLLECTIONIDSREQUEST.fields_by_name['parent']._options = None
  _LISTCOLLECTIONIDSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002'
  _BATCHWRITEREQUEST_LABELSENTRY._options = None
  _BATCHWRITEREQUEST_LABELSENTRY._serialized_options = b'8\001'
  _BATCHWRITEREQUEST.fields_by_name['database']._options = None
  _BATCHWRITEREQUEST.fields_by_name['database']._serialized_options = b'\340A\002'
  _FIRESTORE._options = None
  _FIRESTORE._serialized_options = b'\312A\030firestore.googleapis.com\322AXhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/datastore'
  _FIRESTORE.methods_by_name['GetDocument']._options = None
  _FIRESTORE.methods_by_name['GetDocument']._serialized_options = b'\202\323\344\223\0022\0220/v1/{name=projects/*/databases/*/documents/*/**}'
  _FIRESTORE.methods_by_name['ListDocuments']._options = None
  _FIRESTORE.methods_by_name['ListDocuments']._serialized_options = b'\202\323\344\223\002\205\001\022B/v1/{parent=projects/*/databases/*/documents/*/**}/{collection_id}Z?\022=/v1/{parent=projects/*/databases/*/documents}/{collection_id}'
  _FIRESTORE.methods_by_name['UpdateDocument']._options = None
  _FIRESTORE.methods_by_name['UpdateDocument']._serialized_options = b'\202\323\344\223\002E29/v1/{document.name=projects/*/databases/*/documents/*/**}:\010document\332A\024document,update_mask'
  _FIRESTORE.methods_by_name['DeleteDocument']._options = None
  _FIRESTORE.methods_by_name['DeleteDocument']._serialized_options = b'\202\323\344\223\0022*0/v1/{name=projects/*/databases/*/documents/*/**}\332A\004name'
  _FIRESTORE.methods_by_name['BatchGetDocuments']._options = None
  _FIRESTORE.methods_by_name['BatchGetDocuments']._serialized_options = b'\202\323\344\223\002=\"8/v1/{database=projects/*/databases/*}/documents:batchGet:\001*'
  _FIRESTORE.methods_by_name['BeginTransaction']._options = None
  _FIRESTORE.methods_by_name['BeginTransaction']._serialized_options = b'\202\323\344\223\002E\"@/v1/{database=projects/*/databases/*}/documents:beginTransaction:\001*\332A\010database'
  _FIRESTORE.methods_by_name['Commit']._options = None
  _FIRESTORE.methods_by_name['Commit']._serialized_options = b'\202\323\344\223\002;\"6/v1/{database=projects/*/databases/*}/documents:commit:\001*\332A\017database,writes'
  _FIRESTORE.methods_by_name['Rollback']._options = None
  _FIRESTORE.methods_by_name['Rollback']._serialized_options = b'\202\323\344\223\002=\"8/v1/{database=projects/*/databases/*}/documents:rollback:\001*\332A\024database,transaction'
  _FIRESTORE.methods_by_name['RunQuery']._options = None
  _FIRESTORE.methods_by_name['RunQuery']._serialized_options = b'\202\323\344\223\002}\"6/v1/{parent=projects/*/databases/*/documents}:runQuery:\001*Z@\";/v1/{parent=projects/*/databases/*/documents/*/**}:runQuery:\001*'
  _FIRESTORE.methods_by_name['PartitionQuery']._options = None
  _FIRESTORE.methods_by_name['PartitionQuery']._serialized_options = b'\202\323\344\223\002\211\001\"</v1/{parent=projects/*/databases/*/documents}:partitionQuery:\001*ZF\"A/v1/{parent=projects/*/databases/*/documents/*/**}:partitionQuery:\001*'
  _FIRESTORE.methods_by_name['Write']._options = None
  _FIRESTORE.methods_by_name['Write']._serialized_options = b'\202\323\344\223\002:\"5/v1/{database=projects/*/databases/*}/documents:write:\001*'
  _FIRESTORE.methods_by_name['Listen']._options = None
  _FIRESTORE.methods_by_name['Listen']._serialized_options = b'\202\323\344\223\002;\"6/v1/{database=projects/*/databases/*}/documents:listen:\001*'
  _FIRESTORE.methods_by_name['ListCollectionIds']._options = None
  _FIRESTORE.methods_by_name['ListCollectionIds']._serialized_options = b'\202\323\344\223\002\217\001\"?/v1/{parent=projects/*/databases/*/documents}:listCollectionIds:\001*ZI\"D/v1/{parent=projects/*/databases/*/documents/*/**}:listCollectionIds:\001*\332A\006parent'
  _FIRESTORE.methods_by_name['BatchWrite']._options = None
  _FIRESTORE.methods_by_name['BatchWrite']._serialized_options = b'\202\323\344\223\002?\":/v1/{database=projects/*/databases/*}/documents:batchWrite:\001*'
  _FIRESTORE.methods_by_name['CreateDocument']._options = None
  _FIRESTORE.methods_by_name['CreateDocument']._serialized_options = b'\202\323\344\223\002L\"@/v1/{parent=projects/*/databases/*/documents/**}/{collection_id}:\010document'
  _GETDOCUMENTREQUEST._serialized_start=372
  _GETDOCUMENTREQUEST._serialized_end=556
  _LISTDOCUMENTSREQUEST._serialized_start=559
  _LISTDOCUMENTSREQUEST._serialized_end=854
  _LISTDOCUMENTSRESPONSE._serialized_start=856
  _LISTDOCUMENTSRESPONSE._serialized_end=954
  _CREATEDOCUMENTREQUEST._serialized_start=957
  _CREATEDOCUMENTREQUEST._serialized_end=1153
  _UPDATEDOCUMENTREQUEST._serialized_start=1156
  _UPDATEDOCUMENTREQUEST._serialized_end=1399
  _DELETEDOCUMENTREQUEST._serialized_start=1401
  _DELETEDOCUMENTREQUEST._serialized_end=1504
  _BATCHGETDOCUMENTSREQUEST._serialized_start=1507
  _BATCHGETDOCUMENTSREQUEST._serialized_end=1788
  _BATCHGETDOCUMENTSRESPONSE._serialized_start=1791
  _BATCHGETDOCUMENTSRESPONSE._serialized_end=1963
  _BEGINTRANSACTIONREQUEST._serialized_start=1965
  _BEGINTRANSACTIONREQUEST._serialized_end=2071
  _BEGINTRANSACTIONRESPONSE._serialized_start=2073
  _BEGINTRANSACTIONRESPONSE._serialized_end=2120
  _COMMITREQUEST._serialized_start=2122
  _COMMITREQUEST._serialized_end=2225
  _COMMITRESPONSE._serialized_start=2227
  _COMMITRESPONSE._serialized_end=2349
  _ROLLBACKREQUEST._serialized_start=2351
  _ROLLBACKREQUEST._serialized_end=2417
  _RUNQUERYREQUEST._serialized_start=2420
  _RUNQUERYREQUEST._serialized_end=2702
  _RUNQUERYRESPONSE._serialized_start=2705
  _RUNQUERYRESPONSE._serialized_end=2906
  _PARTITIONQUERYREQUEST._serialized_start=2909
  _PARTITIONQUERYREQUEST._serialized_end=3170
  _PARTITIONQUERYRESPONSE._serialized_start=3172
  _PARTITIONQUERYRESPONSE._serialized_end=3270
  _WRITEREQUEST._serialized_start=3273
  _WRITEREQUEST._serialized_end=3505
  _WRITEREQUEST_LABELSENTRY._serialized_start=3460
  _WRITEREQUEST_LABELSENTRY._serialized_end=3505
  _WRITERESPONSE._serialized_start=3508
  _WRITERESPONSE._serialized_end=3670
  _LISTENREQUEST._serialized_start=3673
  _LISTENREQUEST._serialized_end=3915
  _LISTENREQUEST_LABELSENTRY._serialized_start=3460
  _LISTENREQUEST_LABELSENTRY._serialized_end=3505
  _LISTENRESPONSE._serialized_start=3918
  _LISTENRESPONSE._serialized_end=4259
  _TARGET._serialized_start=4262
  _TARGET._serialized_end=4679
  _TARGET_DOCUMENTSTARGET._serialized_start=4502
  _TARGET_DOCUMENTSTARGET._serialized_end=4538
  _TARGET_QUERYTARGET._serialized_start=4540
  _TARGET_QUERYTARGET._serialized_end=4649
  _TARGETCHANGE._serialized_start=4682
  _TARGETCHANGE._serialized_end=4980
  _TARGETCHANGE_TARGETCHANGETYPE._serialized_start=4902
  _TARGETCHANGE_TARGETCHANGETYPE._serialized_end=4980
  _LISTCOLLECTIONIDSREQUEST._serialized_start=4983
  _LISTCOLLECTIONIDSREQUEST._serialized_end=5142
  _LISTCOLLECTIONIDSRESPONSE._serialized_start=5144
  _LISTCOLLECTIONIDSRESPONSE._serialized_end=5220
  _BATCHWRITEREQUEST._serialized_start=5223
  _BATCHWRITEREQUEST._serialized_end=5424
  _BATCHWRITEREQUEST_LABELSENTRY._serialized_start=3460
  _BATCHWRITEREQUEST_LABELSENTRY._serialized_end=3505
  _BATCHWRITERESPONSE._serialized_start=5426
  _BATCHWRITERESPONSE._serialized_end=5539
  _FIRESTORE._serialized_start=5542
  _FIRESTORE._serialized_end=8550
# @@protoc_insertion_point(module_scope)
