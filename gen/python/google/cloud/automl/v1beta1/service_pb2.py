# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1beta1/service.proto
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
from google.cloud.automl.v1beta1 import annotation_payload_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_annotation__payload__pb2
from google.cloud.automl.v1beta1 import annotation_spec_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_annotation__spec__pb2
from google.cloud.automl.v1beta1 import column_spec_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_column__spec__pb2
from google.cloud.automl.v1beta1 import dataset_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_dataset__pb2
from google.cloud.automl.v1beta1 import image_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_image__pb2
from google.cloud.automl.v1beta1 import io_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_io__pb2
from google.cloud.automl.v1beta1 import model_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_model__pb2
from google.cloud.automl.v1beta1 import model_evaluation_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_model__evaluation__pb2
from google.cloud.automl.v1beta1 import operations_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_operations__pb2
from google.cloud.automl.v1beta1 import table_spec_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_table__spec__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/cloud/automl/v1beta1/service.proto\x12\x1bgoogle.cloud.automl.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x34google/cloud/automl/v1beta1/annotation_payload.proto\x1a\x31google/cloud/automl/v1beta1/annotation_spec.proto\x1a-google/cloud/automl/v1beta1/column_spec.proto\x1a)google/cloud/automl/v1beta1/dataset.proto\x1a\'google/cloud/automl/v1beta1/image.proto\x1a$google/cloud/automl/v1beta1/io.proto\x1a\'google/cloud/automl/v1beta1/model.proto\x1a\x32google/cloud/automl/v1beta1/model_evaluation.proto\x1a,google/cloud/automl/v1beta1/operations.proto\x1a,google/cloud/automl/v1beta1/table_spec.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\"\x8d\x01\n\x14\x43reateDatasetRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12:\n\x07\x64\x61taset\x18\x02 \x01(\x0b\x32$.google.cloud.automl.v1beta1.DatasetB\x03\xe0\x41\x02\"H\n\x11GetDatasetRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1d\x61utoml.googleapis.com/Dataset\"\x87\x01\n\x13ListDatasetsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x06 \x01(\t\"g\n\x14ListDatasetsResponse\x12\x36\n\x08\x64\x61tasets\x18\x01 \x03(\x0b\x32$.google.cloud.automl.v1beta1.Dataset\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x83\x01\n\x14UpdateDatasetRequest\x12:\n\x07\x64\x61taset\x18\x01 \x01(\x0b\x32$.google.cloud.automl.v1beta1.DatasetB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"K\n\x14\x44\x65leteDatasetRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1d\x61utoml.googleapis.com/Dataset\"\x8d\x01\n\x11ImportDataRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1d\x61utoml.googleapis.com/Dataset\x12\x43\n\x0cinput_config\x18\x03 \x01(\x0b\x32(.google.cloud.automl.v1beta1.InputConfigB\x03\xe0\x41\x02\"\x8f\x01\n\x11\x45xportDataRequest\x12\x33\n\x04name\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1d\x61utoml.googleapis.com/Dataset\x12\x45\n\routput_config\x18\x03 \x01(\x0b\x32).google.cloud.automl.v1beta1.OutputConfigB\x03\xe0\x41\x02\"V\n\x18GetAnnotationSpecRequest\x12:\n\x04name\x18\x01 \x01(\tB,\xe0\x41\x02\xfa\x41&\n$automl.googleapis.com/AnnotationSpec\"|\n\x13GetTableSpecRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61utoml.googleapis.com/TableSpec\x12.\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xb5\x01\n\x15ListTableSpecsRequest\x12\x35\n\x06parent\x18\x01 \x01(\tB%\xe0\x41\x02\xfa\x41\x1f\n\x1d\x61utoml.googleapis.com/Dataset\x12.\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x06 \x01(\t\"n\n\x16ListTableSpecsResponse\x12;\n\x0btable_specs\x18\x01 \x03(\x0b\x32&.google.cloud.automl.v1beta1.TableSpec\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8a\x01\n\x16UpdateTableSpecRequest\x12?\n\ntable_spec\x18\x01 \x01(\x0b\x32&.google.cloud.automl.v1beta1.TableSpecB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"~\n\x14GetColumnSpecRequest\x12\x36\n\x04name\x18\x01 \x01(\tB(\xe0\x41\x02\xfa\x41\"\n automl.googleapis.com/ColumnSpec\x12.\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\xb8\x01\n\x16ListColumnSpecsRequest\x12\x37\n\x06parent\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61utoml.googleapis.com/TableSpec\x12.\n\nfield_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x06 \x01(\t\"q\n\x17ListColumnSpecsResponse\x12=\n\x0c\x63olumn_specs\x18\x01 \x03(\x0b\x32\'.google.cloud.automl.v1beta1.ColumnSpec\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x8d\x01\n\x17UpdateColumnSpecRequest\x12\x41\n\x0b\x63olumn_spec\x18\x01 \x01(\x0b\x32\'.google.cloud.automl.v1beta1.ColumnSpecB\x03\xe0\x41\x02\x12/\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x87\x01\n\x12\x43reateModelRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x36\n\x05model\x18\x04 \x01(\x0b\x32\".google.cloud.automl.v1beta1.ModelB\x03\xe0\x41\x02\"D\n\x0fGetModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\"\x85\x01\n\x11ListModelsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x06 \x01(\t\"`\n\x12ListModelsResponse\x12\x31\n\x05model\x18\x01 \x03(\x0b\x32\".google.cloud.automl.v1beta1.Model\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"G\n\x12\x44\x65leteModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\"\xef\x02\n\x12\x44\x65ployModelRequest\x12\x84\x01\n0image_object_detection_model_deployment_metadata\x18\x02 \x01(\x0b\x32H.google.cloud.automl.v1beta1.ImageObjectDetectionModelDeploymentMetadataH\x00\x12\x81\x01\n.image_classification_model_deployment_metadata\x18\x04 \x01(\x0b\x32G.google.cloud.automl.v1beta1.ImageClassificationModelDeploymentMetadataH\x00\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/ModelB\x1b\n\x19model_deployment_metadata\"I\n\x14UndeployModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\"\x99\x01\n\x12\x45xportModelRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\x12P\n\routput_config\x18\x03 \x01(\x0b\x32\x34.google.cloud.automl.v1beta1.ModelExportOutputConfigB\x03\xe0\x41\x02\"\xb1\x01\n\x1e\x45xportEvaluatedExamplesRequest\x12\x31\n\x04name\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\x12\\\n\routput_config\x18\x03 \x01(\x0b\x32@.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOutputConfigB\x03\xe0\x41\x02\"X\n\x19GetModelEvaluationRequest\x12;\n\x04name\x18\x01 \x01(\tB-\xe0\x41\x02\xfa\x41\'\n%automl.googleapis.com/ModelEvaluation\"\x89\x01\n\x1bListModelEvaluationsRequest\x12\x33\n\x06parent\x18\x01 \x01(\tB#\xe0\x41\x02\xfa\x41\x1d\n\x1b\x61utoml.googleapis.com/Model\x12\x0e\n\x06\x66ilter\x18\x03 \x01(\t\x12\x11\n\tpage_size\x18\x04 \x01(\x05\x12\x12\n\npage_token\x18\x06 \x01(\t\"\x7f\n\x1cListModelEvaluationsResponse\x12\x46\n\x10model_evaluation\x18\x01 \x03(\x0b\x32,.google.cloud.automl.v1beta1.ModelEvaluation\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xed\'\n\x06\x41utoMl\x12\xbd\x01\n\rCreateDataset\x12\x31.google.cloud.automl.v1beta1.CreateDatasetRequest\x1a$.google.cloud.automl.v1beta1.Dataset\"S\x82\xd3\xe4\x93\x02<\"1/v1beta1/{parent=projects/*/locations/*}/datasets:\x07\x64\x61taset\xda\x41\x0eparent,dataset\x12\xa4\x01\n\nGetDataset\x12..google.cloud.automl.v1beta1.GetDatasetRequest\x1a$.google.cloud.automl.v1beta1.Dataset\"@\x82\xd3\xe4\x93\x02\x33\x12\x31/v1beta1/{name=projects/*/locations/*/datasets/*}\xda\x41\x04name\x12\xb7\x01\n\x0cListDatasets\x12\x30.google.cloud.automl.v1beta1.ListDatasetsRequest\x1a\x31.google.cloud.automl.v1beta1.ListDatasetsResponse\"B\x82\xd3\xe4\x93\x02\x33\x12\x31/v1beta1/{parent=projects/*/locations/*}/datasets\xda\x41\x06parent\x12\xbe\x01\n\rUpdateDataset\x12\x31.google.cloud.automl.v1beta1.UpdateDatasetRequest\x1a$.google.cloud.automl.v1beta1.Dataset\"T\x82\xd3\xe4\x93\x02\x44\x32\x39/v1beta1/{dataset.name=projects/*/locations/*/datasets/*}:\x07\x64\x61taset\xda\x41\x07\x64\x61taset\x12\xd0\x01\n\rDeleteDataset\x12\x31.google.cloud.automl.v1beta1.DeleteDatasetRequest\x1a\x1d.google.longrunning.Operation\"m\x82\xd3\xe4\x93\x02\x33*1/v1beta1/{name=projects/*/locations/*/datasets/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xe6\x01\n\nImportData\x12..google.cloud.automl.v1beta1.ImportDataRequest\x1a\x1d.google.longrunning.Operation\"\x88\x01\x82\xd3\xe4\x93\x02\x41\"</v1beta1/{name=projects/*/locations/*/datasets/*}:importData:\x01*\xda\x41\x11name,input_config\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xe7\x01\n\nExportData\x12..google.cloud.automl.v1beta1.ExportDataRequest\x1a\x1d.google.longrunning.Operation\"\x89\x01\x82\xd3\xe4\x93\x02\x41\"</v1beta1/{name=projects/*/locations/*/datasets/*}:exportData:\x01*\xda\x41\x12name,output_config\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xcb\x01\n\x11GetAnnotationSpec\x12\x35.google.cloud.automl.v1beta1.GetAnnotationSpecRequest\x1a+.google.cloud.automl.v1beta1.AnnotationSpec\"R\x82\xd3\xe4\x93\x02\x45\x12\x43/v1beta1/{name=projects/*/locations/*/datasets/*/annotationSpecs/*}\xda\x41\x04name\x12\xb7\x01\n\x0cGetTableSpec\x12\x30.google.cloud.automl.v1beta1.GetTableSpecRequest\x1a&.google.cloud.automl.v1beta1.TableSpec\"M\x82\xd3\xe4\x93\x02@\x12>/v1beta1/{name=projects/*/locations/*/datasets/*/tableSpecs/*}\xda\x41\x04name\x12\xca\x01\n\x0eListTableSpecs\x12\x32.google.cloud.automl.v1beta1.ListTableSpecsRequest\x1a\x33.google.cloud.automl.v1beta1.ListTableSpecsResponse\"O\x82\xd3\xe4\x93\x02@\x12>/v1beta1/{parent=projects/*/locations/*/datasets/*}/tableSpecs\xda\x41\x06parent\x12\xda\x01\n\x0fUpdateTableSpec\x12\x33.google.cloud.automl.v1beta1.UpdateTableSpecRequest\x1a&.google.cloud.automl.v1beta1.TableSpec\"j\x82\xd3\xe4\x93\x02W2I/v1beta1/{table_spec.name=projects/*/locations/*/datasets/*/tableSpecs/*}:\ntable_spec\xda\x41\ntable_spec\x12\xc8\x01\n\rGetColumnSpec\x12\x31.google.cloud.automl.v1beta1.GetColumnSpecRequest\x1a\'.google.cloud.automl.v1beta1.ColumnSpec\"[\x82\xd3\xe4\x93\x02N\x12L/v1beta1/{name=projects/*/locations/*/datasets/*/tableSpecs/*/columnSpecs/*}\xda\x41\x04name\x12\xdb\x01\n\x0fListColumnSpecs\x12\x33.google.cloud.automl.v1beta1.ListColumnSpecsRequest\x1a\x34.google.cloud.automl.v1beta1.ListColumnSpecsResponse\"]\x82\xd3\xe4\x93\x02N\x12L/v1beta1/{parent=projects/*/locations/*/datasets/*/tableSpecs/*}/columnSpecs\xda\x41\x06parent\x12\xee\x01\n\x10UpdateColumnSpec\x12\x34.google.cloud.automl.v1beta1.UpdateColumnSpecRequest\x1a\'.google.cloud.automl.v1beta1.ColumnSpec\"{\x82\xd3\xe4\x93\x02g2X/v1beta1/{column_spec.name=projects/*/locations/*/datasets/*/tableSpecs/*/columnSpecs/*}:\x0b\x63olumn_spec\xda\x41\x0b\x63olumn_spec\x12\xc9\x01\n\x0b\x43reateModel\x12/.google.cloud.automl.v1beta1.CreateModelRequest\x1a\x1d.google.longrunning.Operation\"j\x82\xd3\xe4\x93\x02\x38\"//v1beta1/{parent=projects/*/locations/*}/models:\x05model\xda\x41\x0cparent,model\xca\x41\x1a\n\x05Model\x12\x11OperationMetadata\x12\x9c\x01\n\x08GetModel\x12,.google.cloud.automl.v1beta1.GetModelRequest\x1a\".google.cloud.automl.v1beta1.Model\">\x82\xd3\xe4\x93\x02\x31\x12//v1beta1/{name=projects/*/locations/*/models/*}\xda\x41\x04name\x12\xaf\x01\n\nListModels\x12..google.cloud.automl.v1beta1.ListModelsRequest\x1a/.google.cloud.automl.v1beta1.ListModelsResponse\"@\x82\xd3\xe4\x93\x02\x31\x12//v1beta1/{parent=projects/*/locations/*}/models\xda\x41\x06parent\x12\xca\x01\n\x0b\x44\x65leteModel\x12/.google.cloud.automl.v1beta1.DeleteModelRequest\x1a\x1d.google.longrunning.Operation\"k\x82\xd3\xe4\x93\x02\x31*//v1beta1/{name=projects/*/locations/*/models/*}\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xd4\x01\n\x0b\x44\x65ployModel\x12/.google.cloud.automl.v1beta1.DeployModelRequest\x1a\x1d.google.longrunning.Operation\"u\x82\xd3\xe4\x93\x02;\"6/v1beta1/{name=projects/*/locations/*/models/*}:deploy:\x01*\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xda\x01\n\rUndeployModel\x12\x31.google.cloud.automl.v1beta1.UndeployModelRequest\x1a\x1d.google.longrunning.Operation\"w\x82\xd3\xe4\x93\x02=\"8/v1beta1/{name=projects/*/locations/*/models/*}:undeploy:\x01*\xda\x41\x04name\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xe3\x01\n\x0b\x45xportModel\x12/.google.cloud.automl.v1beta1.ExportModelRequest\x1a\x1d.google.longrunning.Operation\"\x83\x01\x82\xd3\xe4\x93\x02;\"6/v1beta1/{name=projects/*/locations/*/models/*}:export:\x01*\xda\x41\x12name,output_config\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\x8c\x02\n\x17\x45xportEvaluatedExamples\x12;.google.cloud.automl.v1beta1.ExportEvaluatedExamplesRequest\x1a\x1d.google.longrunning.Operation\"\x94\x01\x82\xd3\xe4\x93\x02L\"G/v1beta1/{name=projects/*/locations/*/models/*}:exportEvaluatedExamples:\x01*\xda\x41\x12name,output_config\xca\x41*\n\x15google.protobuf.Empty\x12\x11OperationMetadata\x12\xcd\x01\n\x12GetModelEvaluation\x12\x36.google.cloud.automl.v1beta1.GetModelEvaluationRequest\x1a,.google.cloud.automl.v1beta1.ModelEvaluation\"Q\x82\xd3\xe4\x93\x02\x44\x12\x42/v1beta1/{name=projects/*/locations/*/models/*/modelEvaluations/*}\xda\x41\x04name\x12\xe0\x01\n\x14ListModelEvaluations\x12\x38.google.cloud.automl.v1beta1.ListModelEvaluationsRequest\x1a\x39.google.cloud.automl.v1beta1.ListModelEvaluationsResponse\"S\x82\xd3\xe4\x93\x02\x44\x12\x42/v1beta1/{parent=projects/*/locations/*/models/*}/modelEvaluations\xda\x41\x06parent\x1aI\xca\x41\x15\x61utoml.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xb2\x01\n\x1f\x63om.google.cloud.automl.v1beta1B\x0b\x41utoMlProtoP\x01ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\xca\x02\x1bGoogle\\Cloud\\AutoMl\\V1beta1\xea\x02\x1eGoogle::Cloud::AutoML::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.automl.v1beta1.service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.automl.v1beta1B\013AutoMlProtoP\001ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1beta1'
  _CREATEDATASETREQUEST.fields_by_name['parent']._options = None
  _CREATEDATASETREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEDATASETREQUEST.fields_by_name['dataset']._options = None
  _CREATEDATASETREQUEST.fields_by_name['dataset']._serialized_options = b'\340A\002'
  _GETDATASETREQUEST.fields_by_name['name']._options = None
  _GETDATASETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035automl.googleapis.com/Dataset'
  _LISTDATASETSREQUEST.fields_by_name['parent']._options = None
  _LISTDATASETSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _UPDATEDATASETREQUEST.fields_by_name['dataset']._options = None
  _UPDATEDATASETREQUEST.fields_by_name['dataset']._serialized_options = b'\340A\002'
  _DELETEDATASETREQUEST.fields_by_name['name']._options = None
  _DELETEDATASETREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035automl.googleapis.com/Dataset'
  _IMPORTDATAREQUEST.fields_by_name['name']._options = None
  _IMPORTDATAREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035automl.googleapis.com/Dataset'
  _IMPORTDATAREQUEST.fields_by_name['input_config']._options = None
  _IMPORTDATAREQUEST.fields_by_name['input_config']._serialized_options = b'\340A\002'
  _EXPORTDATAREQUEST.fields_by_name['name']._options = None
  _EXPORTDATAREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\037\n\035automl.googleapis.com/Dataset'
  _EXPORTDATAREQUEST.fields_by_name['output_config']._options = None
  _EXPORTDATAREQUEST.fields_by_name['output_config']._serialized_options = b'\340A\002'
  _GETANNOTATIONSPECREQUEST.fields_by_name['name']._options = None
  _GETANNOTATIONSPECREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A&\n$automl.googleapis.com/AnnotationSpec'
  _GETTABLESPECREQUEST.fields_by_name['name']._options = None
  _GETTABLESPECREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037automl.googleapis.com/TableSpec'
  _LISTTABLESPECSREQUEST.fields_by_name['parent']._options = None
  _LISTTABLESPECSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\037\n\035automl.googleapis.com/Dataset'
  _UPDATETABLESPECREQUEST.fields_by_name['table_spec']._options = None
  _UPDATETABLESPECREQUEST.fields_by_name['table_spec']._serialized_options = b'\340A\002'
  _GETCOLUMNSPECREQUEST.fields_by_name['name']._options = None
  _GETCOLUMNSPECREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\"\n automl.googleapis.com/ColumnSpec'
  _LISTCOLUMNSPECSREQUEST.fields_by_name['parent']._options = None
  _LISTCOLUMNSPECSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A!\n\037automl.googleapis.com/TableSpec'
  _UPDATECOLUMNSPECREQUEST.fields_by_name['column_spec']._options = None
  _UPDATECOLUMNSPECREQUEST.fields_by_name['column_spec']._serialized_options = b'\340A\002'
  _CREATEMODELREQUEST.fields_by_name['parent']._options = None
  _CREATEMODELREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _CREATEMODELREQUEST.fields_by_name['model']._options = None
  _CREATEMODELREQUEST.fields_by_name['model']._serialized_options = b'\340A\002'
  _GETMODELREQUEST.fields_by_name['name']._options = None
  _GETMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _LISTMODELSREQUEST.fields_by_name['parent']._options = None
  _LISTMODELSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _DELETEMODELREQUEST.fields_by_name['name']._options = None
  _DELETEMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _DEPLOYMODELREQUEST.fields_by_name['name']._options = None
  _DEPLOYMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _UNDEPLOYMODELREQUEST.fields_by_name['name']._options = None
  _UNDEPLOYMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _EXPORTMODELREQUEST.fields_by_name['name']._options = None
  _EXPORTMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _EXPORTMODELREQUEST.fields_by_name['output_config']._options = None
  _EXPORTMODELREQUEST.fields_by_name['output_config']._serialized_options = b'\340A\002'
  _EXPORTEVALUATEDEXAMPLESREQUEST.fields_by_name['name']._options = None
  _EXPORTEVALUATEDEXAMPLESREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _EXPORTEVALUATEDEXAMPLESREQUEST.fields_by_name['output_config']._options = None
  _EXPORTEVALUATEDEXAMPLESREQUEST.fields_by_name['output_config']._serialized_options = b'\340A\002'
  _GETMODELEVALUATIONREQUEST.fields_by_name['name']._options = None
  _GETMODELEVALUATIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\'\n%automl.googleapis.com/ModelEvaluation'
  _LISTMODELEVALUATIONSREQUEST.fields_by_name['parent']._options = None
  _LISTMODELEVALUATIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A\035\n\033automl.googleapis.com/Model'
  _AUTOML._options = None
  _AUTOML._serialized_options = b'\312A\025automl.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _AUTOML.methods_by_name['CreateDataset']._options = None
  _AUTOML.methods_by_name['CreateDataset']._serialized_options = b'\202\323\344\223\002<\"1/v1beta1/{parent=projects/*/locations/*}/datasets:\007dataset\332A\016parent,dataset'
  _AUTOML.methods_by_name['GetDataset']._options = None
  _AUTOML.methods_by_name['GetDataset']._serialized_options = b'\202\323\344\223\0023\0221/v1beta1/{name=projects/*/locations/*/datasets/*}\332A\004name'
  _AUTOML.methods_by_name['ListDatasets']._options = None
  _AUTOML.methods_by_name['ListDatasets']._serialized_options = b'\202\323\344\223\0023\0221/v1beta1/{parent=projects/*/locations/*}/datasets\332A\006parent'
  _AUTOML.methods_by_name['UpdateDataset']._options = None
  _AUTOML.methods_by_name['UpdateDataset']._serialized_options = b'\202\323\344\223\002D29/v1beta1/{dataset.name=projects/*/locations/*/datasets/*}:\007dataset\332A\007dataset'
  _AUTOML.methods_by_name['DeleteDataset']._options = None
  _AUTOML.methods_by_name['DeleteDataset']._serialized_options = b'\202\323\344\223\0023*1/v1beta1/{name=projects/*/locations/*/datasets/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['ImportData']._options = None
  _AUTOML.methods_by_name['ImportData']._serialized_options = b'\202\323\344\223\002A\"</v1beta1/{name=projects/*/locations/*/datasets/*}:importData:\001*\332A\021name,input_config\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['ExportData']._options = None
  _AUTOML.methods_by_name['ExportData']._serialized_options = b'\202\323\344\223\002A\"</v1beta1/{name=projects/*/locations/*/datasets/*}:exportData:\001*\332A\022name,output_config\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['GetAnnotationSpec']._options = None
  _AUTOML.methods_by_name['GetAnnotationSpec']._serialized_options = b'\202\323\344\223\002E\022C/v1beta1/{name=projects/*/locations/*/datasets/*/annotationSpecs/*}\332A\004name'
  _AUTOML.methods_by_name['GetTableSpec']._options = None
  _AUTOML.methods_by_name['GetTableSpec']._serialized_options = b'\202\323\344\223\002@\022>/v1beta1/{name=projects/*/locations/*/datasets/*/tableSpecs/*}\332A\004name'
  _AUTOML.methods_by_name['ListTableSpecs']._options = None
  _AUTOML.methods_by_name['ListTableSpecs']._serialized_options = b'\202\323\344\223\002@\022>/v1beta1/{parent=projects/*/locations/*/datasets/*}/tableSpecs\332A\006parent'
  _AUTOML.methods_by_name['UpdateTableSpec']._options = None
  _AUTOML.methods_by_name['UpdateTableSpec']._serialized_options = b'\202\323\344\223\002W2I/v1beta1/{table_spec.name=projects/*/locations/*/datasets/*/tableSpecs/*}:\ntable_spec\332A\ntable_spec'
  _AUTOML.methods_by_name['GetColumnSpec']._options = None
  _AUTOML.methods_by_name['GetColumnSpec']._serialized_options = b'\202\323\344\223\002N\022L/v1beta1/{name=projects/*/locations/*/datasets/*/tableSpecs/*/columnSpecs/*}\332A\004name'
  _AUTOML.methods_by_name['ListColumnSpecs']._options = None
  _AUTOML.methods_by_name['ListColumnSpecs']._serialized_options = b'\202\323\344\223\002N\022L/v1beta1/{parent=projects/*/locations/*/datasets/*/tableSpecs/*}/columnSpecs\332A\006parent'
  _AUTOML.methods_by_name['UpdateColumnSpec']._options = None
  _AUTOML.methods_by_name['UpdateColumnSpec']._serialized_options = b'\202\323\344\223\002g2X/v1beta1/{column_spec.name=projects/*/locations/*/datasets/*/tableSpecs/*/columnSpecs/*}:\013column_spec\332A\013column_spec'
  _AUTOML.methods_by_name['CreateModel']._options = None
  _AUTOML.methods_by_name['CreateModel']._serialized_options = b'\202\323\344\223\0028\"//v1beta1/{parent=projects/*/locations/*}/models:\005model\332A\014parent,model\312A\032\n\005Model\022\021OperationMetadata'
  _AUTOML.methods_by_name['GetModel']._options = None
  _AUTOML.methods_by_name['GetModel']._serialized_options = b'\202\323\344\223\0021\022//v1beta1/{name=projects/*/locations/*/models/*}\332A\004name'
  _AUTOML.methods_by_name['ListModels']._options = None
  _AUTOML.methods_by_name['ListModels']._serialized_options = b'\202\323\344\223\0021\022//v1beta1/{parent=projects/*/locations/*}/models\332A\006parent'
  _AUTOML.methods_by_name['DeleteModel']._options = None
  _AUTOML.methods_by_name['DeleteModel']._serialized_options = b'\202\323\344\223\0021*//v1beta1/{name=projects/*/locations/*/models/*}\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['DeployModel']._options = None
  _AUTOML.methods_by_name['DeployModel']._serialized_options = b'\202\323\344\223\002;\"6/v1beta1/{name=projects/*/locations/*/models/*}:deploy:\001*\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['UndeployModel']._options = None
  _AUTOML.methods_by_name['UndeployModel']._serialized_options = b'\202\323\344\223\002=\"8/v1beta1/{name=projects/*/locations/*/models/*}:undeploy:\001*\332A\004name\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['ExportModel']._options = None
  _AUTOML.methods_by_name['ExportModel']._serialized_options = b'\202\323\344\223\002;\"6/v1beta1/{name=projects/*/locations/*/models/*}:export:\001*\332A\022name,output_config\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['ExportEvaluatedExamples']._options = None
  _AUTOML.methods_by_name['ExportEvaluatedExamples']._serialized_options = b'\202\323\344\223\002L\"G/v1beta1/{name=projects/*/locations/*/models/*}:exportEvaluatedExamples:\001*\332A\022name,output_config\312A*\n\025google.protobuf.Empty\022\021OperationMetadata'
  _AUTOML.methods_by_name['GetModelEvaluation']._options = None
  _AUTOML.methods_by_name['GetModelEvaluation']._serialized_options = b'\202\323\344\223\002D\022B/v1beta1/{name=projects/*/locations/*/models/*/modelEvaluations/*}\332A\004name'
  _AUTOML.methods_by_name['ListModelEvaluations']._options = None
  _AUTOML.methods_by_name['ListModelEvaluations']._serialized_options = b'\202\323\344\223\002D\022B/v1beta1/{parent=projects/*/locations/*/models/*}/modelEvaluations\332A\006parent'
  _CREATEDATASETREQUEST._serialized_start=720
  _CREATEDATASETREQUEST._serialized_end=861
  _GETDATASETREQUEST._serialized_start=863
  _GETDATASETREQUEST._serialized_end=935
  _LISTDATASETSREQUEST._serialized_start=938
  _LISTDATASETSREQUEST._serialized_end=1073
  _LISTDATASETSRESPONSE._serialized_start=1075
  _LISTDATASETSRESPONSE._serialized_end=1178
  _UPDATEDATASETREQUEST._serialized_start=1181
  _UPDATEDATASETREQUEST._serialized_end=1312
  _DELETEDATASETREQUEST._serialized_start=1314
  _DELETEDATASETREQUEST._serialized_end=1389
  _IMPORTDATAREQUEST._serialized_start=1392
  _IMPORTDATAREQUEST._serialized_end=1533
  _EXPORTDATAREQUEST._serialized_start=1536
  _EXPORTDATAREQUEST._serialized_end=1679
  _GETANNOTATIONSPECREQUEST._serialized_start=1681
  _GETANNOTATIONSPECREQUEST._serialized_end=1767
  _GETTABLESPECREQUEST._serialized_start=1769
  _GETTABLESPECREQUEST._serialized_end=1893
  _LISTTABLESPECSREQUEST._serialized_start=1896
  _LISTTABLESPECSREQUEST._serialized_end=2077
  _LISTTABLESPECSRESPONSE._serialized_start=2079
  _LISTTABLESPECSRESPONSE._serialized_end=2189
  _UPDATETABLESPECREQUEST._serialized_start=2192
  _UPDATETABLESPECREQUEST._serialized_end=2330
  _GETCOLUMNSPECREQUEST._serialized_start=2332
  _GETCOLUMNSPECREQUEST._serialized_end=2458
  _LISTCOLUMNSPECSREQUEST._serialized_start=2461
  _LISTCOLUMNSPECSREQUEST._serialized_end=2645
  _LISTCOLUMNSPECSRESPONSE._serialized_start=2647
  _LISTCOLUMNSPECSRESPONSE._serialized_end=2760
  _UPDATECOLUMNSPECREQUEST._serialized_start=2763
  _UPDATECOLUMNSPECREQUEST._serialized_end=2904
  _CREATEMODELREQUEST._serialized_start=2907
  _CREATEMODELREQUEST._serialized_end=3042
  _GETMODELREQUEST._serialized_start=3044
  _GETMODELREQUEST._serialized_end=3112
  _LISTMODELSREQUEST._serialized_start=3115
  _LISTMODELSREQUEST._serialized_end=3248
  _LISTMODELSRESPONSE._serialized_start=3250
  _LISTMODELSRESPONSE._serialized_end=3346
  _DELETEMODELREQUEST._serialized_start=3348
  _DELETEMODELREQUEST._serialized_end=3419
  _DEPLOYMODELREQUEST._serialized_start=3422
  _DEPLOYMODELREQUEST._serialized_end=3789
  _UNDEPLOYMODELREQUEST._serialized_start=3791
  _UNDEPLOYMODELREQUEST._serialized_end=3864
  _EXPORTMODELREQUEST._serialized_start=3867
  _EXPORTMODELREQUEST._serialized_end=4020
  _EXPORTEVALUATEDEXAMPLESREQUEST._serialized_start=4023
  _EXPORTEVALUATEDEXAMPLESREQUEST._serialized_end=4200
  _GETMODELEVALUATIONREQUEST._serialized_start=4202
  _GETMODELEVALUATIONREQUEST._serialized_end=4290
  _LISTMODELEVALUATIONSREQUEST._serialized_start=4293
  _LISTMODELEVALUATIONSREQUEST._serialized_end=4430
  _LISTMODELEVALUATIONSRESPONSE._serialized_start=4432
  _LISTMODELEVALUATIONSRESPONSE._serialized_end=4559
  _AUTOML._serialized_start=4562
  _AUTOML._serialized_end=9663
# @@protoc_insertion_point(module_scope)