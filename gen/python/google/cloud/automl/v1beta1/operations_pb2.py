# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1beta1/operations.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.automl.v1beta1 import io_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_io__pb2
from google.cloud.automl.v1beta1 import model_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_model__pb2
from google.cloud.automl.v1beta1 import model_evaluation_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_model__evaluation__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,google/cloud/automl/v1beta1/operations.proto\x12\x1bgoogle.cloud.automl.v1beta1\x1a$google/cloud/automl/v1beta1/io.proto\x1a\'google/cloud/automl/v1beta1/model.proto\x1a\x32google/cloud/automl/v1beta1/model_evaluation.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x8b\x08\n\x11OperationMetadata\x12N\n\x0e\x64\x65lete_details\x18\x08 \x01(\x0b\x32\x34.google.cloud.automl.v1beta1.DeleteOperationMetadataH\x00\x12Y\n\x14\x64\x65ploy_model_details\x18\x18 \x01(\x0b\x32\x39.google.cloud.automl.v1beta1.DeployModelOperationMetadataH\x00\x12]\n\x16undeploy_model_details\x18\x19 \x01(\x0b\x32;.google.cloud.automl.v1beta1.UndeployModelOperationMetadataH\x00\x12Y\n\x14\x63reate_model_details\x18\n \x01(\x0b\x32\x39.google.cloud.automl.v1beta1.CreateModelOperationMetadataH\x00\x12W\n\x13import_data_details\x18\x0f \x01(\x0b\x32\x38.google.cloud.automl.v1beta1.ImportDataOperationMetadataH\x00\x12[\n\x15\x62\x61tch_predict_details\x18\x10 \x01(\x0b\x32:.google.cloud.automl.v1beta1.BatchPredictOperationMetadataH\x00\x12W\n\x13\x65xport_data_details\x18\x15 \x01(\x0b\x32\x38.google.cloud.automl.v1beta1.ExportDataOperationMetadataH\x00\x12Y\n\x14\x65xport_model_details\x18\x16 \x01(\x0b\x32\x39.google.cloud.automl.v1beta1.ExportModelOperationMetadataH\x00\x12r\n!export_evaluated_examples_details\x18\x1a \x01(\x0b\x32\x45.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadataH\x00\x12\x18\n\x10progress_percent\x18\r \x01(\x05\x12,\n\x10partial_failures\x18\x02 \x03(\x0b\x32\x12.google.rpc.Status\x12/\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\t\n\x07\x64\x65tails\"\x19\n\x17\x44\x65leteOperationMetadata\"\x1e\n\x1c\x44\x65ployModelOperationMetadata\" \n\x1eUndeployModelOperationMetadata\"\x1e\n\x1c\x43reateModelOperationMetadata\"\x1d\n\x1bImportDataOperationMetadata\"\xef\x01\n\x1b\x45xportDataOperationMetadata\x12\x62\n\x0boutput_info\x18\x01 \x01(\x0b\x32M.google.cloud.automl.v1beta1.ExportDataOperationMetadata.ExportDataOutputInfo\x1al\n\x14\x45xportDataOutputInfo\x12\x1e\n\x14gcs_output_directory\x18\x01 \x01(\tH\x00\x12!\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tH\x00\x42\x11\n\x0foutput_location\"\xc3\x02\n\x1d\x42\x61tchPredictOperationMetadata\x12J\n\x0cinput_config\x18\x01 \x01(\x0b\x32\x34.google.cloud.automl.v1beta1.BatchPredictInputConfig\x12\x66\n\x0boutput_info\x18\x02 \x01(\x0b\x32Q.google.cloud.automl.v1beta1.BatchPredictOperationMetadata.BatchPredictOutputInfo\x1an\n\x16\x42\x61tchPredictOutputInfo\x12\x1e\n\x14gcs_output_directory\x18\x01 \x01(\tH\x00\x12!\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tH\x00\x42\x11\n\x0foutput_location\"\xbb\x01\n\x1c\x45xportModelOperationMetadata\x12\x64\n\x0boutput_info\x18\x02 \x01(\x0b\x32O.google.cloud.automl.v1beta1.ExportModelOperationMetadata.ExportModelOutputInfo\x1a\x35\n\x15\x45xportModelOutputInfo\x12\x1c\n\x14gcs_output_directory\x18\x01 \x01(\t\"\xee\x01\n(ExportEvaluatedExamplesOperationMetadata\x12|\n\x0boutput_info\x18\x02 \x01(\x0b\x32g.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo\x1a\x44\n!ExportEvaluatedExamplesOutputInfo\x12\x1f\n\x17\x62igquery_output_dataset\x18\x02 \x01(\tB\xa5\x01\n\x1f\x63om.google.cloud.automl.v1beta1P\x01ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\xca\x02\x1bGoogle\\Cloud\\AutoMl\\V1beta1\xea\x02\x1eGoogle::Cloud::AutoML::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.automl.v1beta1.operations_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.automl.v1beta1P\001ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1beta1'
  _OPERATIONMETADATA._serialized_start=267
  _OPERATIONMETADATA._serialized_end=1302
  _DELETEOPERATIONMETADATA._serialized_start=1304
  _DELETEOPERATIONMETADATA._serialized_end=1329
  _DEPLOYMODELOPERATIONMETADATA._serialized_start=1331
  _DEPLOYMODELOPERATIONMETADATA._serialized_end=1361
  _UNDEPLOYMODELOPERATIONMETADATA._serialized_start=1363
  _UNDEPLOYMODELOPERATIONMETADATA._serialized_end=1395
  _CREATEMODELOPERATIONMETADATA._serialized_start=1397
  _CREATEMODELOPERATIONMETADATA._serialized_end=1427
  _IMPORTDATAOPERATIONMETADATA._serialized_start=1429
  _IMPORTDATAOPERATIONMETADATA._serialized_end=1458
  _EXPORTDATAOPERATIONMETADATA._serialized_start=1461
  _EXPORTDATAOPERATIONMETADATA._serialized_end=1700
  _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO._serialized_start=1592
  _EXPORTDATAOPERATIONMETADATA_EXPORTDATAOUTPUTINFO._serialized_end=1700
  _BATCHPREDICTOPERATIONMETADATA._serialized_start=1703
  _BATCHPREDICTOPERATIONMETADATA._serialized_end=2026
  _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO._serialized_start=1916
  _BATCHPREDICTOPERATIONMETADATA_BATCHPREDICTOUTPUTINFO._serialized_end=2026
  _EXPORTMODELOPERATIONMETADATA._serialized_start=2029
  _EXPORTMODELOPERATIONMETADATA._serialized_end=2216
  _EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO._serialized_start=2163
  _EXPORTMODELOPERATIONMETADATA_EXPORTMODELOUTPUTINFO._serialized_end=2216
  _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA._serialized_start=2219
  _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA._serialized_end=2457
  _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO._serialized_start=2389
  _EXPORTEVALUATEDEXAMPLESOPERATIONMETADATA_EXPORTEVALUATEDEXAMPLESOUTPUTINFO._serialized_end=2457
# @@protoc_insertion_point(module_scope)
