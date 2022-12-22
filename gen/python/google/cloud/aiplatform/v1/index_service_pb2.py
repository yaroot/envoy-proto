# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/index_service.proto
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
from google.cloud.aiplatform.v1 import index_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_index__pb2
from google.cloud.aiplatform.v1 import operation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1_dot_operation__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.google/cloud/aiplatform/v1/index_service.proto\x12\x1agoogle.cloud.aiplatform.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a&google/cloud/aiplatform/v1/index.proto\x1a*google/cloud/aiplatform/v1/operation.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\"\x86\x01\n\x12\x43reateIndexRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x35\n\x05index\x18\x02 \x01(\x0b\x32!.google.cloud.aiplatform.v1.IndexB\x03\xe0\x41\x02\"\xe6\x01\n\x1c\x43reateIndexOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\x12v\n*nearest_neighbor_search_operation_metadata\x18\x02 \x01(\x0b\x32\x42.google.cloud.aiplatform.v1.NearestNeighborSearchOperationMetadata\"H\n\x0fGetIndexRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Index\"\xb5\x01\n\x12ListIndexesRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"b\n\x13ListIndexesResponse\x12\x32\n\x07indexes\x18\x01 \x03(\x0b\x32!.google.cloud.aiplatform.v1.Index\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"|\n\x12UpdateIndexRequest\x12\x35\n\x05index\x18\x01 \x01(\x0b\x32!.google.cloud.aiplatform.v1.IndexB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xe6\x01\n\x1cUpdateIndexOperationMetadata\x12N\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x34.google.cloud.aiplatform.v1.GenericOperationMetadata\x12v\n*nearest_neighbor_search_operation_metadata\x18\x02 \x01(\x0b\x32\x42.google.cloud.aiplatform.v1.NearestNeighborSearchOperationMetadata\"K\n\x12\x44\x65leteIndexRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Index\"\x91\x01\n\x17UpsertDatapointsRequest\x12\x36\n\x05index\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Index\x12>\n\ndatapoints\x18\x02 \x03(\x0b\x32*.google.cloud.aiplatform.v1.IndexDatapoint\"\x1a\n\x18UpsertDatapointsResponse\"h\n\x17RemoveDatapointsRequest\x12\x36\n\x05index\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Index\x12\x15\n\rdatapoint_ids\x18\x02 \x03(\t\"\x1a\n\x18RemoveDatapointsResponse\"\xc9\x06\n&NearestNeighborSearchOperationMetadata\x12{\n\x18\x63ontent_validation_stats\x18\x01 \x03(\x0b\x32Y.google.cloud.aiplatform.v1.NearestNeighborSearchOperationMetadata.ContentValidationStats\x12\x18\n\x10\x64\x61ta_bytes_count\x18\x02 \x01(\x03\x1a\xb2\x03\n\x0bRecordError\x12r\n\nerror_type\x18\x01 \x01(\x0e\x32^.google.cloud.aiplatform.v1.NearestNeighborSearchOperationMetadata.RecordError.RecordErrorType\x12\x15\n\rerror_message\x18\x02 \x01(\t\x12\x16\n\x0esource_gcs_uri\x18\x03 \x01(\t\x12\x14\n\x0c\x65mbedding_id\x18\x04 \x01(\t\x12\x12\n\nraw_record\x18\x05 \x01(\t\"\xd5\x01\n\x0fRecordErrorType\x12\x1a\n\x16\x45RROR_TYPE_UNSPECIFIED\x10\x00\x12\x0e\n\nEMPTY_LINE\x10\x01\x12\x17\n\x13INVALID_JSON_SYNTAX\x10\x02\x12\x16\n\x12INVALID_CSV_SYNTAX\x10\x03\x12\x17\n\x13INVALID_AVRO_SYNTAX\x10\x04\x12\x18\n\x14INVALID_EMBEDDING_ID\x10\x05\x12\x1b\n\x17\x45MBEDDING_SIZE_MISMATCH\x10\x06\x12\x15\n\x11NAMESPACE_MISSING\x10\x07\x1a\xd2\x01\n\x16\x43ontentValidationStats\x12\x16\n\x0esource_gcs_uri\x18\x01 \x01(\t\x12\x1a\n\x12valid_record_count\x18\x02 \x01(\x03\x12\x1c\n\x14invalid_record_count\x18\x03 \x01(\x03\x12\x66\n\x0epartial_errors\x18\x04 \x03(\x0b\x32N.google.cloud.aiplatform.v1.NearestNeighborSearchOperationMetadata.RecordError2\xb6\x0b\n\x0cIndexService\x12\xcf\x01\n\x0b\x43reateIndex\x12..google.cloud.aiplatform.v1.CreateIndexRequest\x1a\x1d.google.longrunning.Operation\"q\x82\xd3\xe4\x93\x02\x34\"+/v1/{parent=projects/*/locations/*}/indexes:\x05index\xda\x41\x0cparent,index\xca\x41%\n\x05Index\x12\x1c\x43reateIndexOperationMetadata\x12\x96\x01\n\x08GetIndex\x12+.google.cloud.aiplatform.v1.GetIndexRequest\x1a!.google.cloud.aiplatform.v1.Index\":\x82\xd3\xe4\x93\x02-\x12+/v1/{name=projects/*/locations/*/indexes/*}\xda\x41\x04name\x12\xac\x01\n\x0bListIndexes\x12..google.cloud.aiplatform.v1.ListIndexesRequest\x1a/.google.cloud.aiplatform.v1.ListIndexesResponse\"<\x82\xd3\xe4\x93\x02-\x12+/v1/{parent=projects/*/locations/*}/indexes\xda\x41\x06parent\x12\xda\x01\n\x0bUpdateIndex\x12..google.cloud.aiplatform.v1.UpdateIndexRequest\x1a\x1d.google.longrunning.Operation\"|\x82\xd3\xe4\x93\x02:21/v1/{index.name=projects/*/locations/*/indexes/*}:\x05index\xda\x41\x11index,update_mask\xca\x41%\n\x05Index\x12\x1cUpdateIndexOperationMetadata\x12\xcb\x01\n\x0b\x44\x65leteIndex\x12..google.cloud.aiplatform.v1.DeleteIndexRequest\x1a\x1d.google.longrunning.Operation\"m\x82\xd3\xe4\x93\x02-*+/v1/{name=projects/*/locations/*/indexes/*}\xda\x41\x04name\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\xc7\x01\n\x10UpsertDatapoints\x12\x33.google.cloud.aiplatform.v1.UpsertDatapointsRequest\x1a\x34.google.cloud.aiplatform.v1.UpsertDatapointsResponse\"H\x82\xd3\xe4\x93\x02\x42\"=/v1/{index=projects/*/locations/*/indexes/*}:upsertDatapoints:\x01*\x12\xc7\x01\n\x10RemoveDatapoints\x12\x33.google.cloud.aiplatform.v1.RemoveDatapointsRequest\x1a\x34.google.cloud.aiplatform.v1.RemoveDatapointsResponse\"H\x82\xd3\xe4\x93\x02\x42\"=/v1/{index=projects/*/locations/*/indexes/*}:removeDatapoints:\x01*\x1aM\xca\x41\x19\x61iplatform.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xd5\x01\n\x1e\x63om.google.cloud.aiplatform.v1B\x11IndexServiceProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\xaa\x02\x1aGoogle.Cloud.AIPlatform.V1\xca\x02\x1aGoogle\\Cloud\\AIPlatform\\V1\xea\x02\x1dGoogle::Cloud::AIPlatform::V1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.index_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.aiplatform.v1B\021IndexServiceProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1;aiplatform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1'
  _CREATEINDEXREQUEST.fields_by_name['parent']._options = None
  _CREATEINDEXREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEINDEXREQUEST.fields_by_name['index']._options = None
  _CREATEINDEXREQUEST.fields_by_name['index']._serialized_options = b'\340A\002'
  _GETINDEXREQUEST.fields_by_name['name']._options = None
  _GETINDEXREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Index'
  _LISTINDEXESREQUEST.fields_by_name['parent']._options = None
  _LISTINDEXESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _UPDATEINDEXREQUEST.fields_by_name['index']._options = None
  _UPDATEINDEXREQUEST.fields_by_name['index']._serialized_options = b'\340A\002'
  _DELETEINDEXREQUEST.fields_by_name['name']._options = None
  _DELETEINDEXREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Index'
  _UPSERTDATAPOINTSREQUEST.fields_by_name['index']._options = None
  _UPSERTDATAPOINTSREQUEST.fields_by_name['index']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Index'
  _REMOVEDATAPOINTSREQUEST.fields_by_name['index']._options = None
  _REMOVEDATAPOINTSREQUEST.fields_by_name['index']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Index'
  _INDEXSERVICE._options = None
  _INDEXSERVICE._serialized_options = b'\312A\031aiplatform.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _INDEXSERVICE.methods_by_name['CreateIndex']._options = None
  _INDEXSERVICE.methods_by_name['CreateIndex']._serialized_options = b'\202\323\344\223\0024\"+/v1/{parent=projects/*/locations/*}/indexes:\005index\332A\014parent,index\312A%\n\005Index\022\034CreateIndexOperationMetadata'
  _INDEXSERVICE.methods_by_name['GetIndex']._options = None
  _INDEXSERVICE.methods_by_name['GetIndex']._serialized_options = b'\202\323\344\223\002-\022+/v1/{name=projects/*/locations/*/indexes/*}\332A\004name'
  _INDEXSERVICE.methods_by_name['ListIndexes']._options = None
  _INDEXSERVICE.methods_by_name['ListIndexes']._serialized_options = b'\202\323\344\223\002-\022+/v1/{parent=projects/*/locations/*}/indexes\332A\006parent'
  _INDEXSERVICE.methods_by_name['UpdateIndex']._options = None
  _INDEXSERVICE.methods_by_name['UpdateIndex']._serialized_options = b'\202\323\344\223\002:21/v1/{index.name=projects/*/locations/*/indexes/*}:\005index\332A\021index,update_mask\312A%\n\005Index\022\034UpdateIndexOperationMetadata'
  _INDEXSERVICE.methods_by_name['DeleteIndex']._options = None
  _INDEXSERVICE.methods_by_name['DeleteIndex']._serialized_options = b'\202\323\344\223\002-*+/v1/{name=projects/*/locations/*/indexes/*}\332A\004name\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata'
  _INDEXSERVICE.methods_by_name['UpsertDatapoints']._options = None
  _INDEXSERVICE.methods_by_name['UpsertDatapoints']._serialized_options = b'\202\323\344\223\002B\"=/v1/{index=projects/*/locations/*/indexes/*}:upsertDatapoints:\001*'
  _INDEXSERVICE.methods_by_name['RemoveDatapoints']._options = None
  _INDEXSERVICE.methods_by_name['RemoveDatapoints']._serialized_options = b'\202\323\344\223\002B\"=/v1/{index=projects/*/locations/*/indexes/*}:removeDatapoints:\001*'
  _CREATEINDEXREQUEST._serialized_start=349
  _CREATEINDEXREQUEST._serialized_end=483
  _CREATEINDEXOPERATIONMETADATA._serialized_start=486
  _CREATEINDEXOPERATIONMETADATA._serialized_end=716
  _GETINDEXREQUEST._serialized_start=718
  _GETINDEXREQUEST._serialized_end=790
  _LISTINDEXESREQUEST._serialized_start=793
  _LISTINDEXESREQUEST._serialized_end=974
  _LISTINDEXESRESPONSE._serialized_start=976
  _LISTINDEXESRESPONSE._serialized_end=1074
  _UPDATEINDEXREQUEST._serialized_start=1076
  _UPDATEINDEXREQUEST._serialized_end=1200
  _UPDATEINDEXOPERATIONMETADATA._serialized_start=1203
  _UPDATEINDEXOPERATIONMETADATA._serialized_end=1433
  _DELETEINDEXREQUEST._serialized_start=1435
  _DELETEINDEXREQUEST._serialized_end=1510
  _UPSERTDATAPOINTSREQUEST._serialized_start=1513
  _UPSERTDATAPOINTSREQUEST._serialized_end=1658
  _UPSERTDATAPOINTSRESPONSE._serialized_start=1660
  _UPSERTDATAPOINTSRESPONSE._serialized_end=1686
  _REMOVEDATAPOINTSREQUEST._serialized_start=1688
  _REMOVEDATAPOINTSREQUEST._serialized_end=1792
  _REMOVEDATAPOINTSRESPONSE._serialized_start=1794
  _REMOVEDATAPOINTSRESPONSE._serialized_end=1820
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA._serialized_start=1823
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA._serialized_end=2664
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA_RECORDERROR._serialized_start=2017
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA_RECORDERROR._serialized_end=2451
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA_RECORDERROR_RECORDERRORTYPE._serialized_start=2238
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA_RECORDERROR_RECORDERRORTYPE._serialized_end=2451
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA_CONTENTVALIDATIONSTATS._serialized_start=2454
  _NEARESTNEIGHBORSEARCHOPERATIONMETADATA_CONTENTVALIDATIONSTATS._serialized_end=2664
  _INDEXSERVICE._serialized_start=2667
  _INDEXSERVICE._serialized_end=4129
# @@protoc_insertion_point(module_scope)