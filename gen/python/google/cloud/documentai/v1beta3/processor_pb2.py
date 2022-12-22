# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1beta3/processor.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.documentai.v1beta3 import document_schema_pb2 as google_dot_cloud_dot_documentai_dot_v1beta3_dot_document__schema__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/google/cloud/documentai/v1beta3/processor.proto\x12\x1fgoogle.cloud.documentai.v1beta3\x1a\x1fgoogle/api/field_behavior.proto\x1a\x19google/api/resource.proto\x1a\x35google/cloud/documentai/v1beta3/document_schema.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xe4\x06\n\x10ProcessorVersion\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12H\n\x0f\x64ocument_schema\x18\x0c \x01(\x0b\x32/.google.cloud.documentai.v1beta3.DocumentSchema\x12\x46\n\x05state\x18\x06 \x01(\x0e\x32\x37.google.cloud.documentai.v1beta3.ProcessorVersion.State\x12/\n\x0b\x63reate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x14\n\x0ckms_key_name\x18\t \x01(\t\x12\x1c\n\x14kms_key_version_name\x18\n \x01(\t\x12\x16\n\x0egoogle_managed\x18\x0b \x01(\x08\x12[\n\x10\x64\x65precation_info\x18\r \x01(\x0b\x32\x41.google.cloud.documentai.v1beta3.ProcessorVersion.DeprecationInfo\x1a\x9f\x01\n\x0f\x44\x65precationInfo\x12\x34\n\x10\x64\x65precation_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12V\n\x1dreplacement_processor_version\x18\x02 \x01(\tB/\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\"\x84\x01\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x44\x45PLOYED\x10\x01\x12\r\n\tDEPLOYING\x10\x02\x12\x0e\n\nUNDEPLOYED\x10\x03\x12\x0f\n\x0bUNDEPLOYING\x10\x04\x12\x0c\n\x08\x43REATING\x10\x05\x12\x0c\n\x08\x44\x45LETING\x10\x06\x12\n\n\x06\x46\x41ILED\x10\x07:\x96\x01\xea\x41\x92\x01\n*documentai.googleapis.com/ProcessorVersion\x12\x64projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}\"\xb2\x04\n\tProcessor\x12\x14\n\x04name\x18\x01 \x01(\tB\x06\xe0\x41\x05\xe0\x41\x03\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x12\x44\n\x05state\x18\x04 \x01(\x0e\x32\x30.google.cloud.documentai.v1beta3.Processor.StateB\x03\xe0\x41\x03\x12R\n\x19\x64\x65\x66\x61ult_processor_version\x18\t \x01(\tB/\xfa\x41,\n*documentai.googleapis.com/ProcessorVersion\x12 \n\x10process_endpoint\x18\x06 \x01(\tB\x06\xe0\x41\x03\xe0\x41\x05\x12/\n\x0b\x63reate_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12\x14\n\x0ckms_key_name\x18\x08 \x01(\t\"~\n\x05State\x12\x15\n\x11STATE_UNSPECIFIED\x10\x00\x12\x0b\n\x07\x45NABLED\x10\x01\x12\x0c\n\x08\x44ISABLED\x10\x02\x12\x0c\n\x08\x45NABLING\x10\x03\x12\r\n\tDISABLING\x10\x04\x12\x0c\n\x08\x43REATING\x10\x05\x12\n\n\x06\x46\x41ILED\x10\x06\x12\x0c\n\x08\x44\x45LETING\x10\x07:h\xea\x41\x65\n#documentai.googleapis.com/Processor\x12>projects/{project}/locations/{location}/processors/{processor}B\xf0\x01\n#com.google.cloud.documentai.v1beta3B\x13\x44ocumentAiProcessorP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta3;documentai\xaa\x02\x1fGoogle.Cloud.DocumentAI.V1Beta3\xca\x02\x1fGoogle\\Cloud\\DocumentAI\\V1beta3\xea\x02\"Google::Cloud::DocumentAI::V1beta3b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.documentai.v1beta3.processor_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.documentai.v1beta3B\023DocumentAiProcessorP\001ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta3;documentai\252\002\037Google.Cloud.DocumentAI.V1Beta3\312\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"Google::Cloud::DocumentAI::V1beta3'
  _PROCESSORVERSION_DEPRECATIONINFO.fields_by_name['replacement_processor_version']._options = None
  _PROCESSORVERSION_DEPRECATIONINFO.fields_by_name['replacement_processor_version']._serialized_options = b'\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _PROCESSORVERSION._options = None
  _PROCESSORVERSION._serialized_options = b'\352A\222\001\n*documentai.googleapis.com/ProcessorVersion\022dprojects/{project}/locations/{location}/processors/{processor}/processorVersions/{processor_version}'
  _PROCESSOR.fields_by_name['name']._options = None
  _PROCESSOR.fields_by_name['name']._serialized_options = b'\340A\005\340A\003'
  _PROCESSOR.fields_by_name['state']._options = None
  _PROCESSOR.fields_by_name['state']._serialized_options = b'\340A\003'
  _PROCESSOR.fields_by_name['default_processor_version']._options = None
  _PROCESSOR.fields_by_name['default_processor_version']._serialized_options = b'\372A,\n*documentai.googleapis.com/ProcessorVersion'
  _PROCESSOR.fields_by_name['process_endpoint']._options = None
  _PROCESSOR.fields_by_name['process_endpoint']._serialized_options = b'\340A\003\340A\005'
  _PROCESSOR._options = None
  _PROCESSOR._serialized_options = b'\352Ae\n#documentai.googleapis.com/Processor\022>projects/{project}/locations/{location}/processors/{processor}'
  _PROCESSORVERSION._serialized_start=233
  _PROCESSORVERSION._serialized_end=1101
  _PROCESSORVERSION_DEPRECATIONINFO._serialized_start=654
  _PROCESSORVERSION_DEPRECATIONINFO._serialized_end=813
  _PROCESSORVERSION_STATE._serialized_start=816
  _PROCESSORVERSION_STATE._serialized_end=948
  _PROCESSOR._serialized_start=1104
  _PROCESSOR._serialized_end=1666
  _PROCESSOR_STATE._serialized_start=1434
  _PROCESSOR_STATE._serialized_end=1560
# @@protoc_insertion_point(module_scope)
