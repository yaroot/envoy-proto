# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/documentai/v1beta3/processor_type.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import launch_stage_pb2 as google_dot_api_dot_launch__stage__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n4google/cloud/documentai/v1beta3/processor_type.proto\x12\x1fgoogle.cloud.documentai.v1beta3\x1a\x1dgoogle/api/launch_stage.proto\x1a\x19google/api/resource.proto\"\x98\x03\n\rProcessorType\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x10\n\x08\x63\x61tegory\x18\x03 \x01(\t\x12X\n\x13\x61vailable_locations\x18\x04 \x03(\x0b\x32;.google.cloud.documentai.v1beta3.ProcessorType.LocationInfo\x12\x16\n\x0e\x61llow_creation\x18\x06 \x01(\x08\x12-\n\x0claunch_stage\x18\x08 \x01(\x0e\x32\x17.google.api.LaunchStage\x12\x1c\n\x14sample_document_uris\x18\t \x03(\t\x1a#\n\x0cLocationInfo\x12\x13\n\x0blocation_id\x18\x01 \x01(\t:u\xea\x41r\n\'documentai.googleapis.com/ProcessorType\x12Gprojects/{project}/locations/{location}/processorTypes/{processor_type}B\xf4\x01\n#com.google.cloud.documentai.v1beta3B\x17\x44ocumentAiProcessorTypeP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta3;documentai\xaa\x02\x1fGoogle.Cloud.DocumentAI.V1Beta3\xca\x02\x1fGoogle\\Cloud\\DocumentAI\\V1beta3\xea\x02\"Google::Cloud::DocumentAI::V1beta3b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.documentai.v1beta3.processor_type_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.documentai.v1beta3B\027DocumentAiProcessorTypeP\001ZIgoogle.golang.org/genproto/googleapis/cloud/documentai/v1beta3;documentai\252\002\037Google.Cloud.DocumentAI.V1Beta3\312\002\037Google\\Cloud\\DocumentAI\\V1beta3\352\002\"Google::Cloud::DocumentAI::V1beta3'
  _PROCESSORTYPE._options = None
  _PROCESSORTYPE._serialized_options = b'\352Ar\n\'documentai.googleapis.com/ProcessorType\022Gprojects/{project}/locations/{location}/processorTypes/{processor_type}'
  _PROCESSORTYPE._serialized_start=148
  _PROCESSORTYPE._serialized_end=556
  _PROCESSORTYPE_LOCATIONINFO._serialized_start=402
  _PROCESSORTYPE_LOCATIONINFO._serialized_end=437
# @@protoc_insertion_point(module_scope)