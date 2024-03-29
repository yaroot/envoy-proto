# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/model_service.proto
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
from google.cloud.aiplatform.v1beta1 import explanation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_explanation__pb2
from google.cloud.aiplatform.v1beta1 import io_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_io__pb2
from google.cloud.aiplatform.v1beta1 import model_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_model__pb2
from google.cloud.aiplatform.v1beta1 import model_evaluation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_model__evaluation__pb2
from google.cloud.aiplatform.v1beta1 import model_evaluation_slice_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_model__evaluation__slice__pb2
from google.cloud.aiplatform.v1beta1 import operation_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_operation__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/aiplatform/v1beta1/model_service.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x31google/cloud/aiplatform/v1beta1/explanation.proto\x1a(google/cloud/aiplatform/v1beta1/io.proto\x1a+google/cloud/aiplatform/v1beta1/model.proto\x1a\x36google/cloud/aiplatform/v1beta1/model_evaluation.proto\x1a<google/cloud/aiplatform/v1beta1/model_evaluation_slice.proto\x1a/google/cloud/aiplatform/v1beta1/operation.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\"\xdb\x01\n\x12UploadModelRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x19\n\x0cparent_model\x18\x04 \x01(\tB\x03\xe0\x41\x01\x12\x15\n\x08model_id\x18\x05 \x01(\tB\x03\xe0\x41\x01\x12:\n\x05model\x18\x02 \x01(\x0b\x32&.google.cloud.aiplatform.v1beta1.ModelB\x03\xe0\x41\x02\x12\x1c\n\x0fservice_account\x18\x06 \x01(\tB\x03\xe0\x41\x01\"s\n\x1cUploadModelOperationMetadata\x12S\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x39.google.cloud.aiplatform.v1beta1.GenericOperationMetadata\"i\n\x13UploadModelResponse\x12\x33\n\x05model\x18\x01 \x01(\tB$\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\x1d\n\x10model_version_id\x18\x02 \x01(\tB\x03\xe0\x41\x03\"H\n\x0fGetModelRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\"\xb4\x01\n\x11ListModelsRequest\x12\x39\n\x06parent\x18\x01 \x01(\tB)\xe0\x41\x02\xfa\x41#\n!locations.googleapis.com/Location\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"e\n\x12ListModelsResponse\x12\x36\n\x06models\x18\x01 \x03(\x0b\x32&.google.cloud.aiplatform.v1beta1.Model\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\xb7\x01\n\x18ListModelVersionsRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"l\n\x19ListModelVersionsResponse\x12\x36\n\x06models\x18\x01 \x03(\x0b\x32&.google.cloud.aiplatform.v1beta1.Model\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x86\x01\n\x12UpdateModelRequest\x12:\n\x05model\x18\x01 \x01(\x0b\x32&.google.cloud.aiplatform.v1beta1.ModelB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x02\"\x96\x01\n\x1fUpdateExplanationDatasetRequest\x12\x36\n\x05model\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12;\n\x08\x65xamples\x18\x02 \x01(\x0b\x32).google.cloud.aiplatform.v1beta1.Examples\"\x80\x01\n)UpdateExplanationDatasetOperationMetadata\x12S\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x39.google.cloud.aiplatform.v1beta1.GenericOperationMetadata\"K\n\x12\x44\x65leteModelRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\"R\n\x19\x44\x65leteModelVersionRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\"q\n\x1aMergeVersionAliasesRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\x1c\n\x0fversion_aliases\x18\x02 \x03(\tB\x03\xe0\x41\x02\"\xfd\x02\n\x12\x45xportModelRequest\x12\x35\n\x04name\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\\\n\routput_config\x18\x02 \x01(\x0b\x32@.google.cloud.aiplatform.v1beta1.ExportModelRequest.OutputConfigB\x03\xe0\x41\x02\x1a\xd1\x01\n\x0cOutputConfig\x12\x18\n\x10\x65xport_format_id\x18\x01 \x01(\t\x12M\n\x14\x61rtifact_destination\x18\x03 \x01(\x0b\x32/.google.cloud.aiplatform.v1beta1.GcsDestination\x12X\n\x11image_destination\x18\x04 \x01(\x0b\x32=.google.cloud.aiplatform.v1beta1.ContainerRegistryDestination\"\xa6\x02\n\x1c\x45xportModelOperationMetadata\x12S\n\x10generic_metadata\x18\x01 \x01(\x0b\x32\x39.google.cloud.aiplatform.v1beta1.GenericOperationMetadata\x12\x62\n\x0boutput_info\x18\x02 \x01(\x0b\x32H.google.cloud.aiplatform.v1beta1.ExportModelOperationMetadata.OutputInfoB\x03\xe0\x41\x03\x1aM\n\nOutputInfo\x12 \n\x13\x61rtifact_output_uri\x18\x02 \x01(\tB\x03\xe0\x41\x03\x12\x1d\n\x10image_output_uri\x18\x03 \x01(\tB\x03\xe0\x41\x03\"\"\n UpdateExplanationDatasetResponse\"\x15\n\x13\x45xportModelResponse\"\xa8\x01\n\x1cImportModelEvaluationRequest\x12\x37\n\x06parent\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12O\n\x10model_evaluation\x18\x02 \x01(\x0b\x32\x30.google.cloud.aiplatform.v1beta1.ModelEvaluationB\x03\xe0\x41\x02\"\xc9\x01\n\'BatchImportModelEvaluationSlicesRequest\x12\x41\n\x06parent\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)aiplatform.googleapis.com/ModelEvaluation\x12[\n\x17model_evaluation_slices\x18\x02 \x03(\x0b\x32\x35.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceB\x03\xe0\x41\x02\"Y\n(BatchImportModelEvaluationSlicesResponse\x12-\n imported_model_evaluation_slices\x18\x01 \x03(\tB\x03\xe0\x41\x03\"\\\n\x19GetModelEvaluationRequest\x12?\n\x04name\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)aiplatform.googleapis.com/ModelEvaluation\"\xbc\x01\n\x1bListModelEvaluationsRequest\x12\x37\n\x06parent\x18\x01 \x01(\tB\'\xe0\x41\x02\xfa\x41!\n\x1f\x61iplatform.googleapis.com/Model\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x84\x01\n\x1cListModelEvaluationsResponse\x12K\n\x11model_evaluations\x18\x01 \x03(\x0b\x32\x30.google.cloud.aiplatform.v1beta1.ModelEvaluation\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"f\n\x1eGetModelEvaluationSliceRequest\x12\x44\n\x04name\x18\x01 \x01(\tB6\xe0\x41\x02\xfa\x41\x30\n.aiplatform.googleapis.com/ModelEvaluationSlice\"\xcb\x01\n ListModelEvaluationSlicesRequest\x12\x41\n\x06parent\x18\x01 \x01(\tB1\xe0\x41\x02\xfa\x41+\n)aiplatform.googleapis.com/ModelEvaluation\x12\x0e\n\x06\x66ilter\x18\x02 \x01(\t\x12\x11\n\tpage_size\x18\x03 \x01(\x05\x12\x12\n\npage_token\x18\x04 \x01(\t\x12-\n\tread_mask\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.FieldMask\"\x94\x01\n!ListModelEvaluationSlicesResponse\x12V\n\x17model_evaluation_slices\x18\x01 \x03(\x0b\x32\x35.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t2\xec\x1d\n\x0cModelService\x12\xea\x01\n\x0bUploadModel\x12\x33.google.cloud.aiplatform.v1beta1.UploadModelRequest\x1a\x1d.google.longrunning.Operation\"\x86\x01\x82\xd3\xe4\x93\x02;\"6/v1beta1/{parent=projects/*/locations/*}/models:upload:\x01*\xda\x41\x0cparent,model\xca\x41\x33\n\x13UploadModelResponse\x12\x1cUploadModelOperationMetadata\x12\xa4\x01\n\x08GetModel\x12\x30.google.cloud.aiplatform.v1beta1.GetModelRequest\x1a&.google.cloud.aiplatform.v1beta1.Model\">\x82\xd3\xe4\x93\x02\x31\x12//v1beta1/{name=projects/*/locations/*/models/*}\xda\x41\x04name\x12\xb7\x01\n\nListModels\x12\x32.google.cloud.aiplatform.v1beta1.ListModelsRequest\x1a\x33.google.cloud.aiplatform.v1beta1.ListModelsResponse\"@\x82\xd3\xe4\x93\x02\x31\x12//v1beta1/{parent=projects/*/locations/*}/models\xda\x41\x06parent\x12\xd7\x01\n\x11ListModelVersions\x12\x39.google.cloud.aiplatform.v1beta1.ListModelVersionsRequest\x1a:.google.cloud.aiplatform.v1beta1.ListModelVersionsResponse\"K\x82\xd3\xe4\x93\x02>\x12</v1beta1/{name=projects/*/locations/*/models/*}:listVersions\xda\x41\x04name\x12\xc4\x01\n\x0bUpdateModel\x12\x33.google.cloud.aiplatform.v1beta1.UpdateModelRequest\x1a&.google.cloud.aiplatform.v1beta1.Model\"X\x82\xd3\xe4\x93\x02>25/v1beta1/{model.name=projects/*/locations/*/models/*}:\x05model\xda\x41\x11model,update_mask\x12\xaa\x02\n\x18UpdateExplanationDataset\x12@.google.cloud.aiplatform.v1beta1.UpdateExplanationDatasetRequest\x1a\x1d.google.longrunning.Operation\"\xac\x01\x82\xd3\xe4\x93\x02N\"I/v1beta1/{model=projects/*/locations/*/models/*}:updateExplanationDataset:\x01*\xda\x41\x05model\xca\x41M\n UpdateExplanationDatasetResponse\x12)UpdateExplanationDatasetOperationMetadata\x12\xd4\x01\n\x0b\x44\x65leteModel\x12\x33.google.cloud.aiplatform.v1beta1.DeleteModelRequest\x1a\x1d.google.longrunning.Operation\"q\x82\xd3\xe4\x93\x02\x31*//v1beta1/{name=projects/*/locations/*/models/*}\xda\x41\x04name\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\xf0\x01\n\x12\x44\x65leteModelVersion\x12:.google.cloud.aiplatform.v1beta1.DeleteModelVersionRequest\x1a\x1d.google.longrunning.Operation\"\x7f\x82\xd3\xe4\x93\x02?*=/v1beta1/{name=projects/*/locations/*/models/*}:deleteVersion\xda\x41\x04name\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteOperationMetadata\x12\xe1\x01\n\x13MergeVersionAliases\x12;.google.cloud.aiplatform.v1beta1.MergeVersionAliasesRequest\x1a&.google.cloud.aiplatform.v1beta1.Model\"e\x82\xd3\xe4\x93\x02H\"C/v1beta1/{name=projects/*/locations/*/models/*}:mergeVersionAliases:\x01*\xda\x41\x14name,version_aliases\x12\xf0\x01\n\x0b\x45xportModel\x12\x33.google.cloud.aiplatform.v1beta1.ExportModelRequest\x1a\x1d.google.longrunning.Operation\"\x8c\x01\x82\xd3\xe4\x93\x02;\"6/v1beta1/{name=projects/*/locations/*/models/*}:export:\x01*\xda\x41\x12name,output_config\xca\x41\x33\n\x13\x45xportModelResponse\x12\x1c\x45xportModelOperationMetadata\x12\xf3\x01\n\x15ImportModelEvaluation\x12=.google.cloud.aiplatform.v1beta1.ImportModelEvaluationRequest\x1a\x30.google.cloud.aiplatform.v1beta1.ModelEvaluation\"i\x82\xd3\xe4\x93\x02I\"D/v1beta1/{parent=projects/*/locations/*/models/*}/evaluations:import:\x01*\xda\x41\x17parent,model_evaluation\x12\xb7\x02\n BatchImportModelEvaluationSlices\x12H.google.cloud.aiplatform.v1beta1.BatchImportModelEvaluationSlicesRequest\x1aI.google.cloud.aiplatform.v1beta1.BatchImportModelEvaluationSlicesResponse\"~\x82\xd3\xe4\x93\x02W\"R/v1beta1/{parent=projects/*/locations/*/models/*/evaluations/*}/slices:batchImport:\x01*\xda\x41\x1eparent,model_evaluation_slices\x12\xd0\x01\n\x12GetModelEvaluation\x12:.google.cloud.aiplatform.v1beta1.GetModelEvaluationRequest\x1a\x30.google.cloud.aiplatform.v1beta1.ModelEvaluation\"L\x82\xd3\xe4\x93\x02?\x12=/v1beta1/{name=projects/*/locations/*/models/*/evaluations/*}\xda\x41\x04name\x12\xe3\x01\n\x14ListModelEvaluations\x12<.google.cloud.aiplatform.v1beta1.ListModelEvaluationsRequest\x1a=.google.cloud.aiplatform.v1beta1.ListModelEvaluationsResponse\"N\x82\xd3\xe4\x93\x02?\x12=/v1beta1/{parent=projects/*/locations/*/models/*}/evaluations\xda\x41\x06parent\x12\xe8\x01\n\x17GetModelEvaluationSlice\x12?.google.cloud.aiplatform.v1beta1.GetModelEvaluationSliceRequest\x1a\x35.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice\"U\x82\xd3\xe4\x93\x02H\x12\x46/v1beta1/{name=projects/*/locations/*/models/*/evaluations/*/slices/*}\xda\x41\x04name\x12\xfb\x01\n\x19ListModelEvaluationSlices\x12\x41.google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesRequest\x1a\x42.google.cloud.aiplatform.v1beta1.ListModelEvaluationSlicesResponse\"W\x82\xd3\xe4\x93\x02H\x12\x46/v1beta1/{parent=projects/*/locations/*/models/*/evaluations/*}/slices\xda\x41\x06parent\x1aM\xca\x41\x19\x61iplatform.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xee\x01\n#com.google.cloud.aiplatform.v1beta1B\x11ModelServiceProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\xaa\x02\x1fGoogle.Cloud.AIPlatform.V1Beta1\xca\x02\x1fGoogle\\Cloud\\AIPlatform\\V1beta1\xea\x02\"Google::Cloud::AIPlatform::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.model_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.aiplatform.v1beta1B\021ModelServiceProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1'
  _UPLOADMODELREQUEST.fields_by_name['parent']._options = None
  _UPLOADMODELREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _UPLOADMODELREQUEST.fields_by_name['parent_model']._options = None
  _UPLOADMODELREQUEST.fields_by_name['parent_model']._serialized_options = b'\340A\001'
  _UPLOADMODELREQUEST.fields_by_name['model_id']._options = None
  _UPLOADMODELREQUEST.fields_by_name['model_id']._serialized_options = b'\340A\001'
  _UPLOADMODELREQUEST.fields_by_name['model']._options = None
  _UPLOADMODELREQUEST.fields_by_name['model']._serialized_options = b'\340A\002'
  _UPLOADMODELREQUEST.fields_by_name['service_account']._options = None
  _UPLOADMODELREQUEST.fields_by_name['service_account']._serialized_options = b'\340A\001'
  _UPLOADMODELRESPONSE.fields_by_name['model']._options = None
  _UPLOADMODELRESPONSE.fields_by_name['model']._serialized_options = b'\372A!\n\037aiplatform.googleapis.com/Model'
  _UPLOADMODELRESPONSE.fields_by_name['model_version_id']._options = None
  _UPLOADMODELRESPONSE.fields_by_name['model_version_id']._serialized_options = b'\340A\003'
  _GETMODELREQUEST.fields_by_name['name']._options = None
  _GETMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _LISTMODELSREQUEST.fields_by_name['parent']._options = None
  _LISTMODELSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A#\n!locations.googleapis.com/Location'
  _LISTMODELVERSIONSREQUEST.fields_by_name['name']._options = None
  _LISTMODELVERSIONSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _UPDATEMODELREQUEST.fields_by_name['model']._options = None
  _UPDATEMODELREQUEST.fields_by_name['model']._serialized_options = b'\340A\002'
  _UPDATEMODELREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEMODELREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\002'
  _UPDATEEXPLANATIONDATASETREQUEST.fields_by_name['model']._options = None
  _UPDATEEXPLANATIONDATASETREQUEST.fields_by_name['model']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _DELETEMODELREQUEST.fields_by_name['name']._options = None
  _DELETEMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _DELETEMODELVERSIONREQUEST.fields_by_name['name']._options = None
  _DELETEMODELVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _MERGEVERSIONALIASESREQUEST.fields_by_name['name']._options = None
  _MERGEVERSIONALIASESREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _MERGEVERSIONALIASESREQUEST.fields_by_name['version_aliases']._options = None
  _MERGEVERSIONALIASESREQUEST.fields_by_name['version_aliases']._serialized_options = b'\340A\002'
  _EXPORTMODELREQUEST.fields_by_name['name']._options = None
  _EXPORTMODELREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _EXPORTMODELREQUEST.fields_by_name['output_config']._options = None
  _EXPORTMODELREQUEST.fields_by_name['output_config']._serialized_options = b'\340A\002'
  _EXPORTMODELOPERATIONMETADATA_OUTPUTINFO.fields_by_name['artifact_output_uri']._options = None
  _EXPORTMODELOPERATIONMETADATA_OUTPUTINFO.fields_by_name['artifact_output_uri']._serialized_options = b'\340A\003'
  _EXPORTMODELOPERATIONMETADATA_OUTPUTINFO.fields_by_name['image_output_uri']._options = None
  _EXPORTMODELOPERATIONMETADATA_OUTPUTINFO.fields_by_name['image_output_uri']._serialized_options = b'\340A\003'
  _EXPORTMODELOPERATIONMETADATA.fields_by_name['output_info']._options = None
  _EXPORTMODELOPERATIONMETADATA.fields_by_name['output_info']._serialized_options = b'\340A\003'
  _IMPORTMODELEVALUATIONREQUEST.fields_by_name['parent']._options = None
  _IMPORTMODELEVALUATIONREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _IMPORTMODELEVALUATIONREQUEST.fields_by_name['model_evaluation']._options = None
  _IMPORTMODELEVALUATIONREQUEST.fields_by_name['model_evaluation']._serialized_options = b'\340A\002'
  _BATCHIMPORTMODELEVALUATIONSLICESREQUEST.fields_by_name['parent']._options = None
  _BATCHIMPORTMODELEVALUATIONSLICESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A+\n)aiplatform.googleapis.com/ModelEvaluation'
  _BATCHIMPORTMODELEVALUATIONSLICESREQUEST.fields_by_name['model_evaluation_slices']._options = None
  _BATCHIMPORTMODELEVALUATIONSLICESREQUEST.fields_by_name['model_evaluation_slices']._serialized_options = b'\340A\002'
  _BATCHIMPORTMODELEVALUATIONSLICESRESPONSE.fields_by_name['imported_model_evaluation_slices']._options = None
  _BATCHIMPORTMODELEVALUATIONSLICESRESPONSE.fields_by_name['imported_model_evaluation_slices']._serialized_options = b'\340A\003'
  _GETMODELEVALUATIONREQUEST.fields_by_name['name']._options = None
  _GETMODELEVALUATIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A+\n)aiplatform.googleapis.com/ModelEvaluation'
  _LISTMODELEVALUATIONSREQUEST.fields_by_name['parent']._options = None
  _LISTMODELEVALUATIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A!\n\037aiplatform.googleapis.com/Model'
  _GETMODELEVALUATIONSLICEREQUEST.fields_by_name['name']._options = None
  _GETMODELEVALUATIONSLICEREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A0\n.aiplatform.googleapis.com/ModelEvaluationSlice'
  _LISTMODELEVALUATIONSLICESREQUEST.fields_by_name['parent']._options = None
  _LISTMODELEVALUATIONSLICESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A+\n)aiplatform.googleapis.com/ModelEvaluation'
  _MODELSERVICE._options = None
  _MODELSERVICE._serialized_options = b'\312A\031aiplatform.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _MODELSERVICE.methods_by_name['UploadModel']._options = None
  _MODELSERVICE.methods_by_name['UploadModel']._serialized_options = b'\202\323\344\223\002;\"6/v1beta1/{parent=projects/*/locations/*}/models:upload:\001*\332A\014parent,model\312A3\n\023UploadModelResponse\022\034UploadModelOperationMetadata'
  _MODELSERVICE.methods_by_name['GetModel']._options = None
  _MODELSERVICE.methods_by_name['GetModel']._serialized_options = b'\202\323\344\223\0021\022//v1beta1/{name=projects/*/locations/*/models/*}\332A\004name'
  _MODELSERVICE.methods_by_name['ListModels']._options = None
  _MODELSERVICE.methods_by_name['ListModels']._serialized_options = b'\202\323\344\223\0021\022//v1beta1/{parent=projects/*/locations/*}/models\332A\006parent'
  _MODELSERVICE.methods_by_name['ListModelVersions']._options = None
  _MODELSERVICE.methods_by_name['ListModelVersions']._serialized_options = b'\202\323\344\223\002>\022</v1beta1/{name=projects/*/locations/*/models/*}:listVersions\332A\004name'
  _MODELSERVICE.methods_by_name['UpdateModel']._options = None
  _MODELSERVICE.methods_by_name['UpdateModel']._serialized_options = b'\202\323\344\223\002>25/v1beta1/{model.name=projects/*/locations/*/models/*}:\005model\332A\021model,update_mask'
  _MODELSERVICE.methods_by_name['UpdateExplanationDataset']._options = None
  _MODELSERVICE.methods_by_name['UpdateExplanationDataset']._serialized_options = b'\202\323\344\223\002N\"I/v1beta1/{model=projects/*/locations/*/models/*}:updateExplanationDataset:\001*\332A\005model\312AM\n UpdateExplanationDatasetResponse\022)UpdateExplanationDatasetOperationMetadata'
  _MODELSERVICE.methods_by_name['DeleteModel']._options = None
  _MODELSERVICE.methods_by_name['DeleteModel']._serialized_options = b'\202\323\344\223\0021*//v1beta1/{name=projects/*/locations/*/models/*}\332A\004name\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata'
  _MODELSERVICE.methods_by_name['DeleteModelVersion']._options = None
  _MODELSERVICE.methods_by_name['DeleteModelVersion']._serialized_options = b'\202\323\344\223\002?*=/v1beta1/{name=projects/*/locations/*/models/*}:deleteVersion\332A\004name\312A0\n\025google.protobuf.Empty\022\027DeleteOperationMetadata'
  _MODELSERVICE.methods_by_name['MergeVersionAliases']._options = None
  _MODELSERVICE.methods_by_name['MergeVersionAliases']._serialized_options = b'\202\323\344\223\002H\"C/v1beta1/{name=projects/*/locations/*/models/*}:mergeVersionAliases:\001*\332A\024name,version_aliases'
  _MODELSERVICE.methods_by_name['ExportModel']._options = None
  _MODELSERVICE.methods_by_name['ExportModel']._serialized_options = b'\202\323\344\223\002;\"6/v1beta1/{name=projects/*/locations/*/models/*}:export:\001*\332A\022name,output_config\312A3\n\023ExportModelResponse\022\034ExportModelOperationMetadata'
  _MODELSERVICE.methods_by_name['ImportModelEvaluation']._options = None
  _MODELSERVICE.methods_by_name['ImportModelEvaluation']._serialized_options = b'\202\323\344\223\002I\"D/v1beta1/{parent=projects/*/locations/*/models/*}/evaluations:import:\001*\332A\027parent,model_evaluation'
  _MODELSERVICE.methods_by_name['BatchImportModelEvaluationSlices']._options = None
  _MODELSERVICE.methods_by_name['BatchImportModelEvaluationSlices']._serialized_options = b'\202\323\344\223\002W\"R/v1beta1/{parent=projects/*/locations/*/models/*/evaluations/*}/slices:batchImport:\001*\332A\036parent,model_evaluation_slices'
  _MODELSERVICE.methods_by_name['GetModelEvaluation']._options = None
  _MODELSERVICE.methods_by_name['GetModelEvaluation']._serialized_options = b'\202\323\344\223\002?\022=/v1beta1/{name=projects/*/locations/*/models/*/evaluations/*}\332A\004name'
  _MODELSERVICE.methods_by_name['ListModelEvaluations']._options = None
  _MODELSERVICE.methods_by_name['ListModelEvaluations']._serialized_options = b'\202\323\344\223\002?\022=/v1beta1/{parent=projects/*/locations/*/models/*}/evaluations\332A\006parent'
  _MODELSERVICE.methods_by_name['GetModelEvaluationSlice']._options = None
  _MODELSERVICE.methods_by_name['GetModelEvaluationSlice']._serialized_options = b'\202\323\344\223\002H\022F/v1beta1/{name=projects/*/locations/*/models/*/evaluations/*/slices/*}\332A\004name'
  _MODELSERVICE.methods_by_name['ListModelEvaluationSlices']._options = None
  _MODELSERVICE.methods_by_name['ListModelEvaluationSlices']._serialized_options = b'\202\323\344\223\002H\022F/v1beta1/{parent=projects/*/locations/*/models/*/evaluations/*}/slices\332A\006parent'
  _UPLOADMODELREQUEST._serialized_start=580
  _UPLOADMODELREQUEST._serialized_end=799
  _UPLOADMODELOPERATIONMETADATA._serialized_start=801
  _UPLOADMODELOPERATIONMETADATA._serialized_end=916
  _UPLOADMODELRESPONSE._serialized_start=918
  _UPLOADMODELRESPONSE._serialized_end=1023
  _GETMODELREQUEST._serialized_start=1025
  _GETMODELREQUEST._serialized_end=1097
  _LISTMODELSREQUEST._serialized_start=1100
  _LISTMODELSREQUEST._serialized_end=1280
  _LISTMODELSRESPONSE._serialized_start=1282
  _LISTMODELSRESPONSE._serialized_end=1383
  _LISTMODELVERSIONSREQUEST._serialized_start=1386
  _LISTMODELVERSIONSREQUEST._serialized_end=1569
  _LISTMODELVERSIONSRESPONSE._serialized_start=1571
  _LISTMODELVERSIONSRESPONSE._serialized_end=1679
  _UPDATEMODELREQUEST._serialized_start=1682
  _UPDATEMODELREQUEST._serialized_end=1816
  _UPDATEEXPLANATIONDATASETREQUEST._serialized_start=1819
  _UPDATEEXPLANATIONDATASETREQUEST._serialized_end=1969
  _UPDATEEXPLANATIONDATASETOPERATIONMETADATA._serialized_start=1972
  _UPDATEEXPLANATIONDATASETOPERATIONMETADATA._serialized_end=2100
  _DELETEMODELREQUEST._serialized_start=2102
  _DELETEMODELREQUEST._serialized_end=2177
  _DELETEMODELVERSIONREQUEST._serialized_start=2179
  _DELETEMODELVERSIONREQUEST._serialized_end=2261
  _MERGEVERSIONALIASESREQUEST._serialized_start=2263
  _MERGEVERSIONALIASESREQUEST._serialized_end=2376
  _EXPORTMODELREQUEST._serialized_start=2379
  _EXPORTMODELREQUEST._serialized_end=2760
  _EXPORTMODELREQUEST_OUTPUTCONFIG._serialized_start=2551
  _EXPORTMODELREQUEST_OUTPUTCONFIG._serialized_end=2760
  _EXPORTMODELOPERATIONMETADATA._serialized_start=2763
  _EXPORTMODELOPERATIONMETADATA._serialized_end=3057
  _EXPORTMODELOPERATIONMETADATA_OUTPUTINFO._serialized_start=2980
  _EXPORTMODELOPERATIONMETADATA_OUTPUTINFO._serialized_end=3057
  _UPDATEEXPLANATIONDATASETRESPONSE._serialized_start=3059
  _UPDATEEXPLANATIONDATASETRESPONSE._serialized_end=3093
  _EXPORTMODELRESPONSE._serialized_start=3095
  _EXPORTMODELRESPONSE._serialized_end=3116
  _IMPORTMODELEVALUATIONREQUEST._serialized_start=3119
  _IMPORTMODELEVALUATIONREQUEST._serialized_end=3287
  _BATCHIMPORTMODELEVALUATIONSLICESREQUEST._serialized_start=3290
  _BATCHIMPORTMODELEVALUATIONSLICESREQUEST._serialized_end=3491
  _BATCHIMPORTMODELEVALUATIONSLICESRESPONSE._serialized_start=3493
  _BATCHIMPORTMODELEVALUATIONSLICESRESPONSE._serialized_end=3582
  _GETMODELEVALUATIONREQUEST._serialized_start=3584
  _GETMODELEVALUATIONREQUEST._serialized_end=3676
  _LISTMODELEVALUATIONSREQUEST._serialized_start=3679
  _LISTMODELEVALUATIONSREQUEST._serialized_end=3867
  _LISTMODELEVALUATIONSRESPONSE._serialized_start=3870
  _LISTMODELEVALUATIONSRESPONSE._serialized_end=4002
  _GETMODELEVALUATIONSLICEREQUEST._serialized_start=4004
  _GETMODELEVALUATIONSLICEREQUEST._serialized_end=4106
  _LISTMODELEVALUATIONSLICESREQUEST._serialized_start=4109
  _LISTMODELEVALUATIONSLICESREQUEST._serialized_end=4312
  _LISTMODELEVALUATIONSLICESRESPONSE._serialized_start=4315
  _LISTMODELEVALUATIONSLICESRESPONSE._serialized_end=4463
  _MODELSERVICE._serialized_start=4466
  _MODELSERVICE._serialized_end=8286
# @@protoc_insertion_point(module_scope)
