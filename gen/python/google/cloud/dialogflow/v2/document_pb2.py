# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2/document.proto
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
from google.cloud.dialogflow.v2 import gcs_pb2 as google_dot_cloud_dot_dialogflow_dot_v2_dot_gcs__pb2
from google.longrunning import operations_pb2 as google_dot_longrunning_dot_operations__pb2
from google.protobuf import field_mask_pb2 as google_dot_protobuf_dot_field__mask__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)google/cloud/dialogflow/v2/document.proto\x12\x1agoogle.cloud.dialogflow.v2\x1a\x1cgoogle/api/annotations.proto\x1a\x17google/api/client.proto\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a$google/cloud/dialogflow/v2/gcs.proto\x1a#google/longrunning/operations.proto\x1a google/protobuf/field_mask.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x17google/rpc/status.proto\"\xa6\x08\n\x08\x44ocument\x12\x11\n\x04name\x18\x01 \x01(\tB\x03\xe0\x41\x01\x12\x19\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x03\xe0\x41\x02\x12\x16\n\tmime_type\x18\x03 \x01(\tB\x03\xe0\x41\x02\x12P\n\x0fknowledge_types\x18\x04 \x03(\x0e\x32\x32.google.cloud.dialogflow.v2.Document.KnowledgeTypeB\x03\xe0\x41\x02\x12\x15\n\x0b\x63ontent_uri\x18\x05 \x01(\tH\x00\x12\x15\n\x0braw_content\x18\t \x01(\x0cH\x00\x12\x1f\n\x12\x65nable_auto_reload\x18\x0b \x01(\x08\x42\x03\xe0\x41\x01\x12T\n\x14latest_reload_status\x18\x0c \x01(\x0b\x32\x31.google.cloud.dialogflow.v2.Document.ReloadStatusB\x03\xe0\x41\x03\x12I\n\x08metadata\x18\x07 \x03(\x0b\x32\x32.google.cloud.dialogflow.v2.Document.MetadataEntryB\x03\xe0\x41\x01\x12>\n\x05state\x18\r \x01(\x0e\x32*.google.cloud.dialogflow.v2.Document.StateB\x03\xe0\x41\x03\x1a\\\n\x0cReloadStatus\x12(\n\x04time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\"\n\x06status\x18\x02 \x01(\x0b\x32\x12.google.rpc.Status\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"\x81\x01\n\rKnowledgeType\x12\x1e\n\x1aKNOWLEDGE_TYPE_UNSPECIFIED\x10\x00\x12\x07\n\x03\x46\x41Q\x10\x01\x12\x11\n\rEXTRACTIVE_QA\x10\x02\x12\x16\n\x12\x41RTICLE_SUGGESTION\x10\x03\x12\x1c\n\x18\x41GENT_FACING_SMART_REPLY\x10\x04\"c\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x43REATING\x10\x01\x12\n\n\x06\x41\x43TIVE\x10\x02\x12\x0c\n\x08UPDATING\x10\x03\x12\r\n\tRELOADING\x10\x04\x12\x0c\n\x08\x44\x45LETING\x10\x05:\xcf\x01\xea\x41\xcb\x01\n\"dialogflow.googleapis.com/Document\x12Gprojects/{project}/knowledgeBases/{knowledge_base}/documents/{document}\x12\\projects/{project}/locations/{location}/knowledgeBases/{knowledge_base}/documents/{document}B\x08\n\x06source\"N\n\x12GetDocumentRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"dialogflow.googleapis.com/Document\"\x89\x01\n\x14ListDocumentsRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\x12\"dialogflow.googleapis.com/Document\x12\x11\n\tpage_size\x18\x02 \x01(\x05\x12\x12\n\npage_token\x18\x03 \x01(\t\x12\x0e\n\x06\x66ilter\x18\x04 \x01(\t\"i\n\x15ListDocumentsResponse\x12\x37\n\tdocuments\x18\x01 \x03(\x0b\x32$.google.cloud.dialogflow.v2.Document\x12\x17\n\x0fnext_page_token\x18\x02 \x01(\t\"\x90\x01\n\x15\x43reateDocumentRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\x12\"dialogflow.googleapis.com/Document\x12;\n\x08\x64ocument\x18\x02 \x01(\x0b\x32$.google.cloud.dialogflow.v2.DocumentB\x03\xe0\x41\x02\"\x94\x02\n\x16ImportDocumentsRequest\x12:\n\x06parent\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\x12\"dialogflow.googleapis.com/Document\x12<\n\ngcs_source\x18\x02 \x01(\x0b\x32&.google.cloud.dialogflow.v2.GcsSourcesH\x00\x12R\n\x11\x64ocument_template\x18\x03 \x01(\x0b\x32\x32.google.cloud.dialogflow.v2.ImportDocumentTemplateB\x03\xe0\x41\x02\x12\"\n\x1aimport_gcs_custom_metadata\x18\x04 \x01(\x08\x42\x08\n\x06source\"\x87\x02\n\x16ImportDocumentTemplate\x12\x16\n\tmime_type\x18\x01 \x01(\tB\x03\xe0\x41\x02\x12P\n\x0fknowledge_types\x18\x02 \x03(\x0e\x32\x32.google.cloud.dialogflow.v2.Document.KnowledgeTypeB\x03\xe0\x41\x02\x12R\n\x08metadata\x18\x03 \x03(\x0b\x32@.google.cloud.dialogflow.v2.ImportDocumentTemplate.MetadataEntry\x1a/\n\rMetadataEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\"?\n\x17ImportDocumentsResponse\x12$\n\x08warnings\x18\x01 \x03(\x0b\x32\x12.google.rpc.Status\"Q\n\x15\x44\x65leteDocumentRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"dialogflow.googleapis.com/Document\"\x8a\x01\n\x15UpdateDocumentRequest\x12;\n\x08\x64ocument\x18\x01 \x01(\x0b\x32$.google.cloud.dialogflow.v2.DocumentB\x03\xe0\x41\x02\x12\x34\n\x0bupdate_mask\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.FieldMaskB\x03\xe0\x41\x01\"\xcd\x01\n\x15ReloadDocumentRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"dialogflow.googleapis.com/Document\x12\x1a\n\x0b\x63ontent_uri\x18\x03 \x01(\tB\x03\xe0\x41\x01H\x00\x12\'\n\x1aimport_gcs_custom_metadata\x18\x04 \x01(\x08\x42\x03\xe0\x41\x01\x12+\n\x1esmart_messaging_partial_update\x18\x05 \x01(\x08\x42\x03\xe0\x41\x01\x42\x08\n\x06source\"\xec\x01\n\x15\x45xportDocumentRequest\x12\x38\n\x04name\x18\x01 \x01(\tB*\xe0\x41\x02\xfa\x41$\n\"dialogflow.googleapis.com/Document\x12\x45\n\x0fgcs_destination\x18\x02 \x01(\x0b\x32*.google.cloud.dialogflow.v2.GcsDestinationH\x00\x12\x1b\n\x13\x65xport_full_content\x18\x03 \x01(\x08\x12&\n\x1esmart_messaging_partial_update\x18\x05 \x01(\x08\x42\r\n\x0b\x64\x65stination\"g\n\x17\x45xportOperationMetadata\x12L\n\x18\x65xported_gcs_destination\x18\x01 \x01(\x0b\x32*.google.cloud.dialogflow.v2.GcsDestination\"\xba\x02\n\x1aKnowledgeOperationMetadata\x12P\n\x05state\x18\x01 \x01(\x0e\x32<.google.cloud.dialogflow.v2.KnowledgeOperationMetadata.StateB\x03\xe0\x41\x03\x12\x16\n\x0eknowledge_base\x18\x03 \x01(\t\x12X\n\x19\x65xport_operation_metadata\x18\x04 \x01(\x0b\x32\x33.google.cloud.dialogflow.v2.ExportOperationMetadataH\x00\"B\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07PENDING\x10\x01\x12\x0b\n\x07RUNNING\x10\x02\x12\x08\n\x04\x44ONE\x10\x03\x42\x14\n\x12operation_metadata2\xac\x16\n\tDocuments\x12\xb9\x02\n\rListDocuments\x12\x30.google.cloud.dialogflow.v2.ListDocumentsRequest\x1a\x31.google.cloud.dialogflow.v2.ListDocumentsResponse\"\xc2\x01\x82\xd3\xe4\x93\x02\xb2\x01\x12\x32/v2/{parent=projects/*/knowledgeBases/*}/documentsZ@\x12>/v2/{parent=projects/*/locations/*/knowledgeBases/*}/documentsZ:\x12\x38/v2/{parent=projects/*/agent/knowledgeBases/*}/documents\xda\x41\x06parent\x12\xa6\x02\n\x0bGetDocument\x12..google.cloud.dialogflow.v2.GetDocumentRequest\x1a$.google.cloud.dialogflow.v2.Document\"\xc0\x01\x82\xd3\xe4\x93\x02\xb2\x01\x12\x32/v2/{name=projects/*/knowledgeBases/*/documents/*}Z@\x12>/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}Z:\x12\x38/v2/{name=projects/*/agent/knowledgeBases/*/documents/*}\xda\x41\x04name\x12\xf7\x02\n\x0e\x43reateDocument\x12\x31.google.cloud.dialogflow.v2.CreateDocumentRequest\x1a\x1d.google.longrunning.Operation\"\x92\x02\x82\xd3\xe4\x93\x02\xd0\x01\"2/v2/{parent=projects/*/knowledgeBases/*}/documents:\x08\x64ocumentZJ\">/v2/{parent=projects/*/locations/*/knowledgeBases/*}/documents:\x08\x64ocumentZD\"8/v2/{parent=projects/*/agent/knowledgeBases/*}/documents:\x08\x64ocument\xda\x41\x0fparent,document\xca\x41&\n\x08\x44ocument\x12\x1aKnowledgeOperationMetadata\x12\xb0\x02\n\x0fImportDocuments\x12\x32.google.cloud.dialogflow.v2.ImportDocumentsRequest\x1a\x1d.google.longrunning.Operation\"\xc9\x01\x82\xd3\xe4\x93\x02\x8a\x01\"9/v2/{parent=projects/*/knowledgeBases/*}/documents:import:\x01*ZJ\"E/v2/{parent=projects/*/locations/*/knowledgeBases/*}/documents:import:\x01*\xca\x41\x35\n\x17ImportDocumentsResponse\x12\x1aKnowledgeOperationMetadata\x12\xdb\x02\n\x0e\x44\x65leteDocument\x12\x31.google.cloud.dialogflow.v2.DeleteDocumentRequest\x1a\x1d.google.longrunning.Operation\"\xf6\x01\x82\xd3\xe4\x93\x02\xb2\x01*2/v2/{name=projects/*/knowledgeBases/*/documents/*}Z@*>/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}Z:*8/v2/{name=projects/*/agent/knowledgeBases/*/documents/*}\xda\x41\x04name\xca\x41\x33\n\x15google.protobuf.Empty\x12\x1aKnowledgeOperationMetadata\x12\x97\x03\n\x0eUpdateDocument\x12\x31.google.cloud.dialogflow.v2.UpdateDocumentRequest\x1a\x1d.google.longrunning.Operation\"\xb2\x02\x82\xd3\xe4\x93\x02\xeb\x01\x32;/v2/{document.name=projects/*/knowledgeBases/*/documents/*}:\x08\x64ocumentZS2G/v2/{document.name=projects/*/locations/*/knowledgeBases/*/documents/*}:\x08\x64ocumentZM2A/v2/{document.name=projects/*/agent/knowledgeBases/*/documents/*}:\x08\x64ocument\xda\x41\x14\x64ocument,update_mask\xca\x41&\n\x08\x44ocument\x12\x1aKnowledgeOperationMetadata\x12\xf8\x02\n\x0eReloadDocument\x12\x31.google.cloud.dialogflow.v2.ReloadDocumentRequest\x1a\x1d.google.longrunning.Operation\"\x93\x02\x82\xd3\xe4\x93\x02\xd0\x01\"9/v2/{name=projects/*/knowledgeBases/*/documents/*}:reload:\x01*ZJ\"E/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}:reload:\x01*ZD\"?/v2/{name=projects/*/agent/knowledgeBases/*/documents/*}:reload:\x01*\xda\x41\x10name,content_uri\xca\x41&\n\x08\x44ocument\x12\x1aKnowledgeOperationMetadata\x12\x9f\x02\n\x0e\x45xportDocument\x12\x31.google.cloud.dialogflow.v2.ExportDocumentRequest\x1a\x1d.google.longrunning.Operation\"\xba\x01\x82\xd3\xe4\x93\x02\x8a\x01\"9/v2/{name=projects/*/knowledgeBases/*/documents/*}:export:\x01*ZJ\"E/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}:export:\x01*\xca\x41&\n\x08\x44ocument\x12\x1aKnowledgeOperationMetadata\x1ax\xca\x41\x19\x64ialogflow.googleapis.com\xd2\x41Yhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\x9c\x01\n\x1e\x63om.google.cloud.dialogflow.v2B\rDocumentProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1aGoogle.Cloud.Dialogflow.V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2.document_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.dialogflow.v2B\rDocumentProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2'
  _DOCUMENT_METADATAENTRY._options = None
  _DOCUMENT_METADATAENTRY._serialized_options = b'8\001'
  _DOCUMENT.fields_by_name['name']._options = None
  _DOCUMENT.fields_by_name['name']._serialized_options = b'\340A\001'
  _DOCUMENT.fields_by_name['display_name']._options = None
  _DOCUMENT.fields_by_name['display_name']._serialized_options = b'\340A\002'
  _DOCUMENT.fields_by_name['mime_type']._options = None
  _DOCUMENT.fields_by_name['mime_type']._serialized_options = b'\340A\002'
  _DOCUMENT.fields_by_name['knowledge_types']._options = None
  _DOCUMENT.fields_by_name['knowledge_types']._serialized_options = b'\340A\002'
  _DOCUMENT.fields_by_name['enable_auto_reload']._options = None
  _DOCUMENT.fields_by_name['enable_auto_reload']._serialized_options = b'\340A\001'
  _DOCUMENT.fields_by_name['latest_reload_status']._options = None
  _DOCUMENT.fields_by_name['latest_reload_status']._serialized_options = b'\340A\003'
  _DOCUMENT.fields_by_name['metadata']._options = None
  _DOCUMENT.fields_by_name['metadata']._serialized_options = b'\340A\001'
  _DOCUMENT.fields_by_name['state']._options = None
  _DOCUMENT.fields_by_name['state']._serialized_options = b'\340A\003'
  _DOCUMENT._options = None
  _DOCUMENT._serialized_options = b'\352A\313\001\n\"dialogflow.googleapis.com/Document\022Gprojects/{project}/knowledgeBases/{knowledge_base}/documents/{document}\022\\projects/{project}/locations/{location}/knowledgeBases/{knowledge_base}/documents/{document}'
  _GETDOCUMENTREQUEST.fields_by_name['name']._options = None
  _GETDOCUMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"dialogflow.googleapis.com/Document'
  _LISTDOCUMENTSREQUEST.fields_by_name['parent']._options = None
  _LISTDOCUMENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\022\"dialogflow.googleapis.com/Document'
  _CREATEDOCUMENTREQUEST.fields_by_name['parent']._options = None
  _CREATEDOCUMENTREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\022\"dialogflow.googleapis.com/Document'
  _CREATEDOCUMENTREQUEST.fields_by_name['document']._options = None
  _CREATEDOCUMENTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _IMPORTDOCUMENTSREQUEST.fields_by_name['parent']._options = None
  _IMPORTDOCUMENTSREQUEST.fields_by_name['parent']._serialized_options = b'\340A\002\372A$\022\"dialogflow.googleapis.com/Document'
  _IMPORTDOCUMENTSREQUEST.fields_by_name['document_template']._options = None
  _IMPORTDOCUMENTSREQUEST.fields_by_name['document_template']._serialized_options = b'\340A\002'
  _IMPORTDOCUMENTTEMPLATE_METADATAENTRY._options = None
  _IMPORTDOCUMENTTEMPLATE_METADATAENTRY._serialized_options = b'8\001'
  _IMPORTDOCUMENTTEMPLATE.fields_by_name['mime_type']._options = None
  _IMPORTDOCUMENTTEMPLATE.fields_by_name['mime_type']._serialized_options = b'\340A\002'
  _IMPORTDOCUMENTTEMPLATE.fields_by_name['knowledge_types']._options = None
  _IMPORTDOCUMENTTEMPLATE.fields_by_name['knowledge_types']._serialized_options = b'\340A\002'
  _DELETEDOCUMENTREQUEST.fields_by_name['name']._options = None
  _DELETEDOCUMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"dialogflow.googleapis.com/Document'
  _UPDATEDOCUMENTREQUEST.fields_by_name['document']._options = None
  _UPDATEDOCUMENTREQUEST.fields_by_name['document']._serialized_options = b'\340A\002'
  _UPDATEDOCUMENTREQUEST.fields_by_name['update_mask']._options = None
  _UPDATEDOCUMENTREQUEST.fields_by_name['update_mask']._serialized_options = b'\340A\001'
  _RELOADDOCUMENTREQUEST.fields_by_name['name']._options = None
  _RELOADDOCUMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"dialogflow.googleapis.com/Document'
  _RELOADDOCUMENTREQUEST.fields_by_name['content_uri']._options = None
  _RELOADDOCUMENTREQUEST.fields_by_name['content_uri']._serialized_options = b'\340A\001'
  _RELOADDOCUMENTREQUEST.fields_by_name['import_gcs_custom_metadata']._options = None
  _RELOADDOCUMENTREQUEST.fields_by_name['import_gcs_custom_metadata']._serialized_options = b'\340A\001'
  _RELOADDOCUMENTREQUEST.fields_by_name['smart_messaging_partial_update']._options = None
  _RELOADDOCUMENTREQUEST.fields_by_name['smart_messaging_partial_update']._serialized_options = b'\340A\001'
  _EXPORTDOCUMENTREQUEST.fields_by_name['name']._options = None
  _EXPORTDOCUMENTREQUEST.fields_by_name['name']._serialized_options = b'\340A\002\372A$\n\"dialogflow.googleapis.com/Document'
  _KNOWLEDGEOPERATIONMETADATA.fields_by_name['state']._options = None
  _KNOWLEDGEOPERATIONMETADATA.fields_by_name['state']._serialized_options = b'\340A\003'
  _DOCUMENTS._options = None
  _DOCUMENTS._serialized_options = b'\312A\031dialogflow.googleapis.com\322AYhttps://www.googleapis.com/auth/cloud-platform,https://www.googleapis.com/auth/dialogflow'
  _DOCUMENTS.methods_by_name['ListDocuments']._options = None
  _DOCUMENTS.methods_by_name['ListDocuments']._serialized_options = b'\202\323\344\223\002\262\001\0222/v2/{parent=projects/*/knowledgeBases/*}/documentsZ@\022>/v2/{parent=projects/*/locations/*/knowledgeBases/*}/documentsZ:\0228/v2/{parent=projects/*/agent/knowledgeBases/*}/documents\332A\006parent'
  _DOCUMENTS.methods_by_name['GetDocument']._options = None
  _DOCUMENTS.methods_by_name['GetDocument']._serialized_options = b'\202\323\344\223\002\262\001\0222/v2/{name=projects/*/knowledgeBases/*/documents/*}Z@\022>/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}Z:\0228/v2/{name=projects/*/agent/knowledgeBases/*/documents/*}\332A\004name'
  _DOCUMENTS.methods_by_name['CreateDocument']._options = None
  _DOCUMENTS.methods_by_name['CreateDocument']._serialized_options = b'\202\323\344\223\002\320\001\"2/v2/{parent=projects/*/knowledgeBases/*}/documents:\010documentZJ\">/v2/{parent=projects/*/locations/*/knowledgeBases/*}/documents:\010documentZD\"8/v2/{parent=projects/*/agent/knowledgeBases/*}/documents:\010document\332A\017parent,document\312A&\n\010Document\022\032KnowledgeOperationMetadata'
  _DOCUMENTS.methods_by_name['ImportDocuments']._options = None
  _DOCUMENTS.methods_by_name['ImportDocuments']._serialized_options = b'\202\323\344\223\002\212\001\"9/v2/{parent=projects/*/knowledgeBases/*}/documents:import:\001*ZJ\"E/v2/{parent=projects/*/locations/*/knowledgeBases/*}/documents:import:\001*\312A5\n\027ImportDocumentsResponse\022\032KnowledgeOperationMetadata'
  _DOCUMENTS.methods_by_name['DeleteDocument']._options = None
  _DOCUMENTS.methods_by_name['DeleteDocument']._serialized_options = b'\202\323\344\223\002\262\001*2/v2/{name=projects/*/knowledgeBases/*/documents/*}Z@*>/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}Z:*8/v2/{name=projects/*/agent/knowledgeBases/*/documents/*}\332A\004name\312A3\n\025google.protobuf.Empty\022\032KnowledgeOperationMetadata'
  _DOCUMENTS.methods_by_name['UpdateDocument']._options = None
  _DOCUMENTS.methods_by_name['UpdateDocument']._serialized_options = b'\202\323\344\223\002\353\0012;/v2/{document.name=projects/*/knowledgeBases/*/documents/*}:\010documentZS2G/v2/{document.name=projects/*/locations/*/knowledgeBases/*/documents/*}:\010documentZM2A/v2/{document.name=projects/*/agent/knowledgeBases/*/documents/*}:\010document\332A\024document,update_mask\312A&\n\010Document\022\032KnowledgeOperationMetadata'
  _DOCUMENTS.methods_by_name['ReloadDocument']._options = None
  _DOCUMENTS.methods_by_name['ReloadDocument']._serialized_options = b'\202\323\344\223\002\320\001\"9/v2/{name=projects/*/knowledgeBases/*/documents/*}:reload:\001*ZJ\"E/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}:reload:\001*ZD\"?/v2/{name=projects/*/agent/knowledgeBases/*/documents/*}:reload:\001*\332A\020name,content_uri\312A&\n\010Document\022\032KnowledgeOperationMetadata'
  _DOCUMENTS.methods_by_name['ExportDocument']._options = None
  _DOCUMENTS.methods_by_name['ExportDocument']._serialized_options = b'\202\323\344\223\002\212\001\"9/v2/{name=projects/*/knowledgeBases/*/documents/*}:export:\001*ZJ\"E/v2/{name=projects/*/locations/*/knowledgeBases/*/documents/*}:export:\001*\312A&\n\010Document\022\032KnowledgeOperationMetadata'
  _DOCUMENT._serialized_start=356
  _DOCUMENT._serialized_end=1418
  _DOCUMENT_RELOADSTATUS._serialized_start=824
  _DOCUMENT_RELOADSTATUS._serialized_end=916
  _DOCUMENT_METADATAENTRY._serialized_start=918
  _DOCUMENT_METADATAENTRY._serialized_end=965
  _DOCUMENT_KNOWLEDGETYPE._serialized_start=968
  _DOCUMENT_KNOWLEDGETYPE._serialized_end=1097
  _DOCUMENT_STATE._serialized_start=1099
  _DOCUMENT_STATE._serialized_end=1198
  _GETDOCUMENTREQUEST._serialized_start=1420
  _GETDOCUMENTREQUEST._serialized_end=1498
  _LISTDOCUMENTSREQUEST._serialized_start=1501
  _LISTDOCUMENTSREQUEST._serialized_end=1638
  _LISTDOCUMENTSRESPONSE._serialized_start=1640
  _LISTDOCUMENTSRESPONSE._serialized_end=1745
  _CREATEDOCUMENTREQUEST._serialized_start=1748
  _CREATEDOCUMENTREQUEST._serialized_end=1892
  _IMPORTDOCUMENTSREQUEST._serialized_start=1895
  _IMPORTDOCUMENTSREQUEST._serialized_end=2171
  _IMPORTDOCUMENTTEMPLATE._serialized_start=2174
  _IMPORTDOCUMENTTEMPLATE._serialized_end=2437
  _IMPORTDOCUMENTTEMPLATE_METADATAENTRY._serialized_start=918
  _IMPORTDOCUMENTTEMPLATE_METADATAENTRY._serialized_end=965
  _IMPORTDOCUMENTSRESPONSE._serialized_start=2439
  _IMPORTDOCUMENTSRESPONSE._serialized_end=2502
  _DELETEDOCUMENTREQUEST._serialized_start=2504
  _DELETEDOCUMENTREQUEST._serialized_end=2585
  _UPDATEDOCUMENTREQUEST._serialized_start=2588
  _UPDATEDOCUMENTREQUEST._serialized_end=2726
  _RELOADDOCUMENTREQUEST._serialized_start=2729
  _RELOADDOCUMENTREQUEST._serialized_end=2934
  _EXPORTDOCUMENTREQUEST._serialized_start=2937
  _EXPORTDOCUMENTREQUEST._serialized_end=3173
  _EXPORTOPERATIONMETADATA._serialized_start=3175
  _EXPORTOPERATIONMETADATA._serialized_end=3278
  _KNOWLEDGEOPERATIONMETADATA._serialized_start=3281
  _KNOWLEDGEOPERATIONMETADATA._serialized_end=3595
  _KNOWLEDGEOPERATIONMETADATA_STATE._serialized_start=3507
  _KNOWLEDGEOPERATIONMETADATA_STATE._serialized_end=3573
  _DOCUMENTS._serialized_start=3598
  _DOCUMENTS._serialized_end=6458
# @@protoc_insertion_point(module_scope)
