# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1/document_processor_service.proto
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
from google.cloud.documentai.v1 import document_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_document__pb2
from google.cloud.documentai.v1 import document_io_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_document__io__pb2
from google.cloud.documentai.v1 import document_schema_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_document__schema__pb2
from google.cloud.documentai.v1 import operation_metadata_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_operation__metadata__pb2
from google.cloud.documentai.v1 import processor_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_processor__pb2
from google.cloud.documentai.v1 import processor_type_pb2 as google_dot_cloud_dot_documentai_dot_v1_dot_processor__type__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n;google/cloud/documentai/v1/document_processor_service.proto\x12\x1agoogle.cloud.documentai.v1\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a)google/cloud/documentai/v1/document.proto\x1a,google/cloud/documentai/v1/document_io.proto\x1a\x30google/cloud/documentai/v1/document_schema.proto\x1a\x33google/cloud/documentai/v1/operation_metadata.proto\x1a*google/cloud/documentai/v1/processor.proto\x1a/google/cloud/documentai/v1/processor_type.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\x80\x02\n\x0eProcessRequest\x12?\n\x0finline_document\x18\x04 \x01(\x0b\x32$.google.cloud.documentai.v1.DocumentH\x00\x12?\n\x0craw_document\x18\x05 \x01(\x0b\x32\'.google.cloud.documentai.v1.RawDocumentH\x00\x12\x17\n\x04name\x18\x01 \x01(\tB\t\xe0\x41\x02\xfa\x41\x03\n\x01*\x12\x19\n\x11skip_human_review\x18\x03 \x01(\x08\x12.\n\nfield_mask\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x08\n\x06source\"\xee\x01\n\x11HumanReviewStatus\x12\x42\n\x05state\x18\x01 \x01(\x0e\x32\x33.google.cloud.documentai.v1.HumanReviewStatus.State\x12\x15\n\rstate_message\x18\x02 \x01(\t\x12\x1e\n\x16human_review_operation\x18\x03 \x01(\t\"^\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07SKIPPED\x10\x01\x12\x15\n\x11VALIDATION_PASSED\x10\x02\x12\x0f\n\x0bIN_PROGRESS\x10\x03\x12\t\n\x05\x45RROR\x10\x04\"\x95\x01\n\x0fProcessResponse\x12\x36\n\x08\x64ocument\x18\x01 \x01(\x0b\x32$.google.cloud.documentai.v1.Document\x12J\n\x13human_review_status\x18\x03 \x01(\x0b\x32-.google.cloud.documentai.v1.HumanReviewStatus\"\xeb\x01\n\x13\x42\x61tchProcessRequest\x12\x17\n\x04name\x18\x01 \x01(\tB\t\xe0\x41\x02\xfa\x41\x03\n\x01*\x12N\n\x0finput_documents\x18\x05 \x01(\x0b\x32\x35.google.cloud.documentai.v1.BatchDocumentsInputConfig\x12P\n\x16\x64ocument_output_config\x18\x06 \x01(\x0b\x32\x30.google.cloud.documentai.v1.DocumentOutputConfig\x12\x19\n\x11skip_human_review\x18\x04 \x01(\x08\"\x16\n\x14\x42\x61tchProcessResponse\"\xff\x04\n\x14\x42\x61tchProcessMetadata\x12\x45\n\x05state\x18\x01 \x01(\x0e\x32\x36.google.cloud.documentai.v1.BatchProcessMetadata.State\x12\x15\n\rstate_message\x18\x02 \x01(\t\x12/\n\x0b\x63reate_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12m\n\x1bindividual_process_statuses\x18\x05 \x03(\x0b\x32H.google.cloud.documentai.v1.BatchProcessMetadata.IndividualProcessStatus\x1a\xc3\x01\n\x17IndividualProcessStatus\x12\x18\n\x10input_gcs_source\x18\x01 \x01(\t\x12\"\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\x12\x1e\n\x16output_gcs_destination\x18\x03 \x01(\t\x12J\n\x13human_review_status\x18\x05 \x01(\x0b\x32-.google.cloud.documentai.v1.HumanReviewStatus\"r\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07WAITING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\r\n\tSUCCEEDED\x10\x03\x12\x0e\n\nCANCELLING\x10\x04\x12\r\n\tCANCELLED\x10\x05\x12\n\n\x06\x46\x41ILED\x10\x06\"]\n\x1a\x46\x65tchProcessorTypesRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\x12\'documentai.googleapis.com/ProcessorType\"a\n\x1b\x46\x65tchProcessorTypesResponse\x12\x42\n\x0fprocessor_types\x18\x01 \x03(\x0b\x32).google.cloud.documentai.v1.ProcessorType\"\x83\x01\n\x19ListProcessorTypesRequest\x12?\n\x06parent\x18\x01 \x01(\tB/\xe0\x41\x02\xfa\x41)\x12\'documentai.googleapis.com/ProcessorType\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"y\n\x1aListProcessorTypesResponse\x12\x42\n\x0fprocessor_types\x18\x01 \x03(\x0b\x32).google.cloud.documentai.v1.ProcessorType\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"{\n\x15ListProcessorsRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#documentai.googleapis.com/Processor\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"l\n\x16ListProcessorsResponse\x12\x39\n\nprocessors\x18\x01 \x03(\x0b\x32%.google.cloud.documentai.v1.Processor\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"P\n\x13GetProcessorRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#documentai.googleapis.com/Processor\"^\n\x1aGetProcessorVersionRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\"\x89\x01\n\x1cListProcessorVersionsRequest\x12\x42\n\x06parent\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\x12*documentai.googleapis.com/ProcessorVersion\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\"\x82\x01\n\x1dListProcessorVersionsResponse\x12H\n\x12processor_versions\x18\x01 \x03(\x0b\x32,.google.cloud.documentai.v1.ProcessorVersion\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"a\n\x1d\x44\x65leteProcessorVersionRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\"n\n\x1e\x44\x65leteProcessorVersionMetadata\x12L\n\x0f\x63ommon_metadata\x18\x01 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"a\n\x1d\x44\x65ployProcessorVersionRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\" \n\x1e\x44\x65ployProcessorVersionResponse\"n\n\x1e\x44\x65ployProcessorVersionMetadata\x12L\n\x0f\x63ommon_metadata\x18\x01 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"c\n\x1fUndeployProcessorVersionRequest\x12@\n\x04name\x18\x01 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\"\"\n UndeployProcessorVersionResponse\"p\n UndeployProcessorVersionMetadata\x12L\n\x0f\x63ommon_metadata\x18\x01 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"\x94\x01\n\x16\x43reateProcessorRequest\x12;\n\x06parent\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\x12#documentai.googleapis.com/Processor\x12=\n\tprocessor\x18\x02 \x01(\x0b\x32%.google.cloud.documentai.v1.ProcessorB\x03\xe0\x41\x02\"S\n\x16\x44\x65leteProcessorRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#documentai.googleapis.com/Processor\"g\n\x17\x44\x65leteProcessorMetadata\x12L\n\x0f\x63ommon_metadata\x18\x05 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"S\n\x16\x45nableProcessorRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#documentai.googleapis.com/Processor\"\x19\n\x17\x45nableProcessorResponse\"g\n\x17\x45nableProcessorMetadata\x12L\n\x0f\x63ommon_metadata\x18\x05 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"T\n\x17\x44isableProcessorRequest\x12\x39\n\x04name\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#documentai.googleapis.com/Processor\"\x1a\n\x18\x44isableProcessorResponse\"h\n\x18\x44isableProcessorMetadata\x12L\n\x0f\x63ommon_metadata\x18\x05 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"\xba\x01\n!SetDefaultProcessorVersionRequest\x12>\n\tprocessor\x18\x01 \x01(\tB+\xe0\x41\x02\xfa\x41%\n#documentai.googleapis.com/Processor\x12U\n\x19\x64\x65\x66\x61ult_processor_version\x18\x02 \x01(\tB2\xe0\x41\x02\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\"$\n\"SetDefaultProcessorVersionResponse\"r\n\"SetDefaultProcessorVersionMetadata\x12L\n\x0f\x63ommon_metadata\x18\x01 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\"\x8e\x03\n\x15ReviewDocumentRequest\x12?\n\x0finline_document\x18\x04 \x01(\x0b\x32$.google.cloud.documentai.v1.DocumentH\x00\x12P\n\x13human_review_config\x18\x01 \x01(\tB3\xe0\x41\x02\xfa\x41-\n+documentai.googleapis.com/HumanReviewConfig\x12 \n\x18\x65nable_schema_validation\x18\x03 \x01(\x08\x12L\n\x08priority\x18\x05 \x01(\x0e\x32:.google.cloud.documentai.v1.ReviewDocumentRequest.Priority\x12\x43\n\x0f\x64ocument_schema\x18\x06 \x01(\x0b\x32*.google.cloud.documentai.v1.DocumentSchema\"#\n\x08Priority\x12\x0b\n\x07\x44\x45\x46\x41ULT\x10\x00\x12\n\n\x06URGENT\x10\x01\x42\x08\n\x06source\"\xd1\x01\n\x16ReviewDocumentResponse\x12\x17\n\x0fgcs_destination\x18\x01 \x01(\t\x12G\n\x05state\x18\x02 \x01(\x0e\x32\x38.google.cloud.documentai.v1.ReviewDocumentResponse.State\x12\x18\n\x10rejection_reason\x18\x03 \x01(\t\";\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08REJECTED\x10\x01\x12\r\n\tSUCCEEDED\x10\x02\"\x84\x01\n\x1fReviewDocumentOperationMetadata\x12L\n\x0f\x63ommon_metadata\x18\x05 \x01(\x0b\x32\x33.google.cloud.documentai.v1.CommonOperationMetadata\x12\x13\n\x0bquestion_id\x18\x06 \x01(\t2\xc8 \n\x18\x44ocumentProcessorService\x12\x87\x02\n\x0fProcessDocument\x12*.google.cloud.documentai.v1.ProcessRequest\x1a+.google.cloud.documentai.v1.ProcessResponse\"\x9a\x01\x82\xd3\xe4\x93\x02\x8c\x01\"6/v1/{name=projects/*/locations/*/processors/*}:process:\x01*ZO\"J/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:process:\x01*\xda\x41\x04name\x12\xbd\x02\n\x15\x42\x61tchProcessDocuments\x12/.google.cloud.documentai.v1.BatchProcessRequest\x1a\x1d.google.longrunning.Operation\"\xd3\x01\x82\xd3\xe4\x93\x02\x96\x01\";/v1/{name=projects/*/locations/*/processors/*}:batchProcess:\x01*ZT\"O/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:batchProcess:\x01*\xda\x41\x04name\xca\x41,\n\x14\x42\x61tchProcessResponse\x12\x14\x42\x61tchProcessMetadata\x12\xd0\x01\n\x13\x46\x65tchProcessorTypes\x12\x36.google.cloud.documentai.v1.FetchProcessorTypesRequest\x1a\x37.google.cloud.documentai.v1.FetchProcessorTypesResponse\"H\x82\xd3\xe4\x93\x02\x39\x12\x37/v1/{parent=projects/*/locations/*}:fetchProcessorTypes\xda\x41\x06parent\x12\xc8\x01\n\x12ListProcessorTypes\x12\x35.google.cloud.documentai.v1.ListProcessorTypesRequest\x1a\x36.google.cloud.documentai.v1.ListProcessorTypesResponse\"C\x82\xd3\xe4\x93\x02\x34\x12\x32/v1/{parent=projects/*/locations/*}/processorTypes\xda\x41\x06parent\x12\xb8\x01\n\x0eListProcessors\x12\x31.google.cloud.documentai.v1.ListProcessorsRequest\x1a\x32.google.cloud.documentai.v1.ListProcessorsResponse\"?\x82\xd3\xe4\x93\x02\x30\x12./v1/{parent=projects/*/locations/*}/processors\xda\x41\x06parent\x12\xa5\x01\n\x0cGetProcessor\x12/.google.cloud.documentai.v1.GetProcessorRequest\x1a%.google.cloud.documentai.v1.Processor\"=\x82\xd3\xe4\x93\x02\x30\x12./v1/{name=projects/*/locations/*/processors/*}\xda\x41\x04name\x12\xce\x01\n\x13GetProcessorVersion\x12\x36.google.cloud.documentai.v1.GetProcessorVersionRequest\x1a,.google.cloud.documentai.v1.ProcessorVersion\"Q\x82\xd3\xe4\x93\x02\x44\x12\x42/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}\xda\x41\x04name\x12\xe1\x01\n\x15ListProcessorVersions\x12\x38.google.cloud.documentai.v1.ListProcessorVersionsRequest\x1a\x39.google.cloud.documentai.v1.ListProcessorVersionsResponse\"S\x82\xd3\xe4\x93\x02\x44\x12\x42/v1/{parent=projects/*/locations/*/processors/*}/processorVersions\xda\x41\x06parent\x12\x80\x02\n\x16\x44\x65leteProcessorVersion\x12\x39.google.cloud.documentai.v1.DeleteProcessorVersionRequest\x1a\x1d.google.longrunning.Operation\"\x8b\x01\x82\xd3\xe4\x93\x02\x44*B/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}\xda\x41\x04name\xca\x41\x37\n\x15google.protobuf.Empty\x12\x1e\x44\x65leteProcessorVersionMetadata\x12\x93\x02\n\x16\x44\x65ployProcessorVersion\x12\x39.google.cloud.documentai.v1.DeployProcessorVersionRequest\x1a\x1d.google.longrunning.Operation\"\x9e\x01\x82\xd3\xe4\x93\x02N\"I/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:deploy:\x01*\xda\x41\x04name\xca\x41@\n\x1e\x44\x65ployProcessorVersionResponse\x12\x1e\x44\x65ployProcessorVersionMetadata\x12\x9d\x02\n\x18UndeployProcessorVersion\x12;.google.cloud.documentai.v1.UndeployProcessorVersionRequest\x1a\x1d.google.longrunning.Operation\"\xa4\x01\x82\xd3\xe4\x93\x02P\"K/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:undeploy:\x01*\xda\x41\x04name\xca\x41\x44\n UndeployProcessorVersionResponse\x12 UndeployProcessorVersionMetadata\x12\xc2\x01\n\x0f\x43reateProcessor\x12\x32.google.cloud.documentai.v1.CreateProcessorRequest\x1a%.google.cloud.documentai.v1.Processor\"T\x82\xd3\xe4\x93\x02;\"./v1/{parent=projects/*/locations/*}/processors:\tprocessor\xda\x41\x10parent,processor\x12\xd6\x01\n\x0f\x44\x65leteProcessor\x12\x32.google.cloud.documentai.v1.DeleteProcessorRequest\x1a\x1d.google.longrunning.Operation\"p\x82\xd3\xe4\x93\x02\x30*./v1/{name=projects/*/locations/*/processors/*}\xda\x41\x04name\xca\x41\x30\n\x15google.protobuf.Empty\x12\x17\x44\x65leteProcessorMetadata\x12\xdb\x01\n\x0f\x45nableProcessor\x12\x32.google.cloud.documentai.v1.EnableProcessorRequest\x1a\x1d.google.longrunning.Operation\"u\x82\xd3\xe4\x93\x02:\"5/v1/{name=projects/*/locations/*/processors/*}:enable:\x01*\xca\x41\x32\n\x17\x45nableProcessorResponse\x12\x17\x45nableProcessorMetadata\x12\xe0\x01\n\x10\x44isableProcessor\x12\x33.google.cloud.documentai.v1.DisableProcessorRequest\x1a\x1d.google.longrunning.Operation\"x\x82\xd3\xe4\x93\x02;\"6/v1/{name=projects/*/locations/*/processors/*}:disable:\x01*\xca\x41\x34\n\x18\x44isableProcessorResponse\x12\x18\x44isableProcessorMetadata\x12\xa1\x02\n\x1aSetDefaultProcessorVersion\x12=.google.cloud.documentai.v1.SetDefaultProcessorVersionRequest\x1a\x1d.google.longrunning.Operation\"\xa4\x01\x82\xd3\xe4\x93\x02S\"N/v1/{processor=projects/*/locations/*/processors/*}:setDefaultProcessorVersion:\x01*\xca\x41H\n\"SetDefaultProcessorVersionResponse\x12\"SetDefaultProcessorVersionMetadata\x12\xa0\x02\n\x0eReviewDocument\x12\x31.google.cloud.documentai.v1.ReviewDocumentRequest\x1a\x1d.google.longrunning.Operation\"\xbb\x01\x82\xd3\xe4\x93\x02\x63\"^/v1/{human_review_config=projects/*/locations/*/processors/*/humanReviewConfig}:reviewDocument:\x01*\xda\x41\x13human_review_config\xca\x41\x39\n\x16ReviewDocumentResponse\x12\x1fReviewDocumentOperationMetadata\x1aM\xca\x41\x19\x64ocumentai.googleapis.com\xd2\x41.https://www.googleapis.com/auth/cloud-platformB\xb0\x03\n\x1e\x63om.google.cloud.documentai.v1B\x1a\x44ocumentAiProcessorServiceP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/documentai/v1;documentai\xaa\x02\x1aGoogle.Cloud.DocumentAI.V1\xca\x02\x1aGoogle\\Cloud\\DocumentAI\\V1\xea\x02\x1dGoogle::Cloud::DocumentAI::V1\xea\x41\x7f\n+documentai.googleapis.com/HumanReviewConfig\x12Pprojects/{project}/locations/{location}/processors/{processor}/humanReviewConfig\xea\x41M\n\"documentai.googleapis.com/Location\x12\'projects/{project}/locations/{location}b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.documentai.v1.document_processor_service_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.documentai.v1B\032DocumentAiProcessorServiceP\001ZDgoogle.golang.org/genproto/googleapis/cloud/documentai/v1;documentai\252\002\032Google.Cloud.DocumentAI.V1\312\002\032Google\\Cloud\\DocumentAI\\V1\352\002\035Google::Cloud::DocumentAI::V1\352A\177\n+documentai.googleapis.com/HumanReviewConfig\022Pprojects/{project}/locations/{location}/processors/{processor}/humanReviewConfig\352AM\n\"documentai.googleapis.com/Location\022\'projects/{project}/locations/{location}'
  _PROCESSREQUEST.fields_by_name['name']._options = None
  _PROCESSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\003\n\001*'
  _BATCHPROCESSREQUEST.fields_by_name['name']._options = None
  _BATCHPROCESSREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A\003\n\001*'
  _FETCHPROCESSORTYPESREQUEST.fields_by_name['parent']._options = None
  _FETCHPROCESSORTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\022\'documentai.googleapis.com/ProcessorType'
  _LISTPROCESSORTYPESREQUEST.fields_by_name['parent']._options = None
  _LISTPROCESSORTYPESREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A)\022\'documentai.googleapis.com/ProcessorType'
  _LISTPROCESSORSREQUEST.fields_by_name['parent']._options = None
  _LISTPROCESSORSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#documentai.googleapis.com/Processor'
  _GETPROCESSORREQUEST.fields_by_name['name']._options = None
  _GETPROCESSORREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#documentai.googleapis.com/Processor'
  _GETPROCESSORVERSIONREQUEST.fields_by_name['name']._options = None
  _GETPROCESSORVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _LISTPROCESSORVERSIONSREQUEST.fields_by_name['parent']._options = None
  _LISTPROCESSORVERSIONSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A,\022*documentai.googleapis.com/ProcessorVersion'
  _DELETEPROCESSORVERSIONREQUEST.fields_by_name['name']._options = None
  _DELETEPROCESSORVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _DEPLOYPROCESSORVERSIONREQUEST.fields_by_name['name']._options = None
  _DEPLOYPROCESSORVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _UNDEPLOYPROCESSORVERSIONREQUEST.fields_by_name['name']._options = None
  _UNDEPLOYPROCESSORVERSIONREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _CREATEPROCESSORREQUEST.fields_by_name['parent']._options = None
  _CREATEPROCESSORREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A%\022#documentai.googleapis.com/Processor'
  _CREATEPROCESSORREQUEST.fields_by_name['processor']._options = None
  _CREATEPROCESSORREQUEST.fields_by_name['processor']._serialized_options = b'\340A\002'
  _DELETEPROCESSORREQUEST.fields_by_name['name']._options = None
  _DELETEPROCESSORREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#documentai.googleapis.com/Processor'
  _ENABLEPROCESSORREQUEST.fields_by_name['name']._options = None
  _ENABLEPROCESSORREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#documentai.googleapis.com/Processor'
  _DISABLEPROCESSORREQUEST.fields_by_name['name']._options = None
  _DISABLEPROCESSORREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A%\n#documentai.googleapis.com/Processor'
  _SETDEFAULTPROCESSORVERSIONREQUEST.fields_by_name['processor']._options = None
  _SETDEFAULTPROCESSORVERSIONREQUEST.fields_by_name['processor']._serialized_options = b'\340A\002\372A%\n#documentai.googleapis.com/Processor'
  _SETDEFAULTPROCESSORVERSIONREQUEST.fields_by_name['default_processor_version']._options = None
  _SETDEFAULTPROCESSORVERSIONREQUEST.fields_by_name['default_processor_version']._serialized_options = b'\340A\002\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _REVIEWDOCUMENTREQUEST.fields_by_name['human_review_config']._options = None
  _REVIEWDOCUMENTREQUEST.fields_by_name['human_review_config']._serialized_options = b'\340A\002\372A-\n+documentai.googleapis.com/HumanReviewConfig'
  _DOCUMENTPROCESSORSERVICE._options = None
  _DOCUMENTPROCESSORSERVICE._serialized_options = b'\312A\031documentai.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platform'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ProcessDocument']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ProcessDocument']._serialized_options = b'\202\323\344\223\002\214\001\"6/v1/{name=projects/*/locations/*/processors/*}:process:\001*ZO\"J/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:process:\001*\332A\004name'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['BatchProcessDocuments']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['BatchProcessDocuments']._serialized_options = b'\202\323\344\223\002\226\001\";/v1/{name=projects/*/locations/*/processors/*}:batchProcess:\001*ZT\"O/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:batchProcess:\001*\332A\004name\312A,\n\024BatchProcessResponse\022\024BatchProcessMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['FetchProcessorTypes']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['FetchProcessorTypes']._serialized_options = b'\202\323\344\223\0029\0227/v1/{parent=projects/*/locations/*}:fetchProcessorTypes\332A\006parent'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ListProcessorTypes']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ListProcessorTypes']._serialized_options = b'\202\323\344\223\0024\0222/v1/{parent=projects/*/locations/*}/processorTypes\332A\006parent'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ListProcessors']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ListProcessors']._serialized_options = b'\202\323\344\223\0020\022./v1/{parent=projects/*/locations/*}/processors\332A\006parent'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['GetProcessor']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['GetProcessor']._serialized_options = b'\202\323\344\223\0020\022./v1/{name=projects/*/locations/*/processors/*}\332A\004name'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['GetProcessorVersion']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['GetProcessorVersion']._serialized_options = b'\202\323\344\223\002D\022B/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}\332A\004name'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ListProcessorVersions']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ListProcessorVersions']._serialized_options = b'\202\323\344\223\002D\022B/v1/{parent=projects/*/locations/*/processors/*}/processorVersions\332A\006parent'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DeleteProcessorVersion']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DeleteProcessorVersion']._serialized_options = b'\202\323\344\223\002D*B/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}\332A\004name\312A7\n\025google.protobuf.Empty\022\036DeleteProcessorVersionMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DeployProcessorVersion']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DeployProcessorVersion']._serialized_options = b'\202\323\344\223\002N\"I/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:deploy:\001*\332A\004name\312A@\n\036DeployProcessorVersionResponse\022\036DeployProcessorVersionMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['UndeployProcessorVersion']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['UndeployProcessorVersion']._serialized_options = b'\202\323\344\223\002P\"K/v1/{name=projects/*/locations/*/processors/*/processorVersions/*}:undeploy:\001*\332A\004name\312AD\n UndeployProcessorVersionResponse\022 UndeployProcessorVersionMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['CreateProcessor']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['CreateProcessor']._serialized_options = b'\202\323\344\223\002;\"./v1/{parent=projects/*/locations/*}/processors:\tprocessor\332A\020parent,processor'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DeleteProcessor']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DeleteProcessor']._serialized_options = b'\202\323\344\223\0020*./v1/{name=projects/*/locations/*/processors/*}\332A\004name\312A0\n\025google.protobuf.Empty\022\027DeleteProcessorMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['EnableProcessor']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['EnableProcessor']._serialized_options = b'\202\323\344\223\002:\"5/v1/{name=projects/*/locations/*/processors/*}:enable:\001*\312A2\n\027EnableProcessorResponse\022\027EnableProcessorMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DisableProcessor']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['DisableProcessor']._serialized_options = b'\202\323\344\223\002;\"6/v1/{name=projects/*/locations/*/processors/*}:disable:\001*\312A4\n\030DisableProcessorResponse\022\030DisableProcessorMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['SetDefaultProcessorVersion']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['SetDefaultProcessorVersion']._serialized_options = b'\202\323\344\223\002S\"N/v1/{processor=projects/*/locations/*/processors/*}:setDefaultProcessorVersion:\001*\312AH\n\"SetDefaultProcessorVersionResponse\022\"SetDefaultProcessorVersionMetadata'
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ReviewDocument']._options = None
  _DOCUMENTPROCESSORSERVICE.methods_by_name['ReviewDocument']._serialized_options = b'\202\323\344\223\002c\"^/v1/{human_review_config=projects/*/locations/*/processors/*/humanReviewConfig}:reviewDocument:\001*\332A\023human_review_config\312A9\n\026ReviewDocumentResponse\022\037ReviewDocumentOperationMetadata'
  _PROCESSREQUEST._serialized_start=621
  _PROCESSREQUEST._serialized_end=877
  _HUMANREVIEWSTATUS._serialized_start=880
  _HUMANREVIEWSTATUS._serialized_end=1118
  _HUMANREVIEWSTATUS_STATE._serialized_start=1024
  _HUMANREVIEWSTATUS_STATE._serialized_end=1118
  _PROCESSRESPONSE._serialized_start=1121
  _PROCESSRESPONSE._serialized_end=1270
  _BATCHPROCESSREQUEST._serialized_start=1273
  _BATCHPROCESSREQUEST._serialized_end=1508
  _BATCHPROCESSRESPONSE._serialized_start=1510
  _BATCHPROCESSRESPONSE._serialized_end=1532
  _BATCHPROCESSMETADATA._serialized_start=1535
  _BATCHPROCESSMETADATA._serialized_end=2174
  _BATCHPROCESSMETADATA_INDIVIDUALPROCESSSTATUS._serialized_start=1863
  _BATCHPROCESSMETADATA_INDIVIDUALPROCESSSTATUS._serialized_end=2058
  _BATCHPROCESSMETADATA_STATE._serialized_start=2060
  _BATCHPROCESSMETADATA_STATE._serialized_end=2174
  _FETCHPROCESSORTYPESREQUEST._serialized_start=2176
  _FETCHPROCESSORTYPESREQUEST._serialized_end=2269
  _FETCHPROCESSORTYPESRESPONSE._serialized_start=2271
  _FETCHPROCESSORTYPESRESPONSE._serialized_end=2368
  _LISTPROCESSORTYPESREQUEST._serialized_start=2371
  _LISTPROCESSORTYPESREQUEST._serialized_end=2502
  _LISTPROCESSORTYPESRESPONSE._serialized_start=2504
  _LISTPROCESSORTYPESRESPONSE._serialized_end=2625
  _LISTPROCESSORSREQUEST._serialized_start=2627
  _LISTPROCESSORSREQUEST._serialized_end=2750
  _LISTPROCESSORSRESPONSE._serialized_start=2752
  _LISTPROCESSORSRESPONSE._serialized_end=2860
  _GETPROCESSORREQUEST._serialized_start=2862
  _GETPROCESSORREQUEST._serialized_end=2942
  _GETPROCESSORVERSIONREQUEST._serialized_start=2944
  _GETPROCESSORVERSIONREQUEST._serialized_end=3038
  _LISTPROCESSORVERSIONSREQUEST._serialized_start=3041
  _LISTPROCESSORVERSIONSREQUEST._serialized_end=3178
  _LISTPROCESSORVERSIONSRESPONSE._serialized_start=3181
  _LISTPROCESSORVERSIONSRESPONSE._serialized_end=3311
  _DELETEPROCESSORVERSIONREQUEST._serialized_start=3313
  _DELETEPROCESSORVERSIONREQUEST._serialized_end=3410
  _DELETEPROCESSORVERSIONMETADATA._serialized_start=3412
  _DELETEPROCESSORVERSIONMETADATA._serialized_end=3522
  _DEPLOYPROCESSORVERSIONREQUEST._serialized_start=3524
  _DEPLOYPROCESSORVERSIONREQUEST._serialized_end=3621
  _DEPLOYPROCESSORVERSIONRESPONSE._serialized_start=3623
  _DEPLOYPROCESSORVERSIONRESPONSE._serialized_end=3655
  _DEPLOYPROCESSORVERSIONMETADATA._serialized_start=3657
  _DEPLOYPROCESSORVERSIONMETADATA._serialized_end=3767
  _UNDEPLOYPROCESSORVERSIONREQUEST._serialized_start=3769
  _UNDEPLOYPROCESSORVERSIONREQUEST._serialized_end=3868
  _UNDEPLOYPROCESSORVERSIONRESPONSE._serialized_start=3870
  _UNDEPLOYPROCESSORVERSIONRESPONSE._serialized_end=3904
  _UNDEPLOYPROCESSORVERSIONMETADATA._serialized_start=3906
  _UNDEPLOYPROCESSORVERSIONMETADATA._serialized_end=4018
  _CREATEPROCESSORREQUEST._serialized_start=4021
  _CREATEPROCESSORREQUEST._serialized_end=4169
  _DELETEPROCESSORREQUEST._serialized_start=4171
  _DELETEPROCESSORREQUEST._serialized_end=4254
  _DELETEPROCESSORMETADATA._serialized_start=4256
  _DELETEPROCESSORMETADATA._serialized_end=4359
  _ENABLEPROCESSORREQUEST._serialized_start=4361
  _ENABLEPROCESSORREQUEST._serialized_end=4444
  _ENABLEPROCESSORRESPONSE._serialized_start=4446
  _ENABLEPROCESSORRESPONSE._serialized_end=4471
  _ENABLEPROCESSORMETADATA._serialized_start=4473
  _ENABLEPROCESSORMETADATA._serialized_end=4576
  _DISABLEPROCESSORREQUEST._serialized_start=4578
  _DISABLEPROCESSORREQUEST._serialized_end=4662
  _DISABLEPROCESSORRESPONSE._serialized_start=4664
  _DISABLEPROCESSORRESPONSE._serialized_end=4690
  _DISABLEPROCESSORMETADATA._serialized_start=4692
  _DISABLEPROCESSORMETADATA._serialized_end=4796
  _SETDEFAULTPROCESSORVERSIONREQUEST._serialized_start=4799
  _SETDEFAULTPROCESSORVERSIONREQUEST._serialized_end=4985
  _SETDEFAULTPROCESSORVERSIONRESPONSE._serialized_start=4987
  _SETDEFAULTPROCESSORVERSIONRESPONSE._serialized_end=5023
  _SETDEFAULTPROCESSORVERSIONMETADATA._serialized_start=5025
  _SETDEFAULTPROCESSORVERSIONMETADATA._serialized_end=5139
  _REVIEWDOCUMENTREQUEST._serialized_start=5142
  _REVIEWDOCUMENTREQUEST._serialized_end=5540
  _REVIEWDOCUMENTREQUEST_PRIORITY._serialized_start=5495
  _REVIEWDOCUMENTREQUEST_PRIORITY._serialized_end=5530
  _REVIEWDOCUMENTRESPONSE._serialized_start=5543
  _REVIEWDOCUMENTRESPONSE._serialized_end=5752
  _REVIEWDOCUMENTRESPONSE_STATE._serialized_start=5693
  _REVIEWDOCUMENTRESPONSE_STATE._serialized_end=5752
  _REVIEWDOCUMENTOPERATIONMETADATA._serialized_start=5755
  _REVIEWDOCUMENTOPERATIONMETADATA._serialized_end=5887
  _DOCUMENTPROCESSORSERVICE._serialized_start=5890
  _DOCUMENTPROCESSORSERVICE._serialized_end=10058
# @@protoc_insertion_point(module_scope)
