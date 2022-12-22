# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/datalabeling/v1beta1/instruction.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.cloud.datalabeling.v1beta1 import dataset_pb2 as google_dot_cloud_dot_datalabeling_dot_v1beta1_dot_dataset__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n3google/cloud/datalabeling/v1beta1/instruction.proto\x12!google.cloud.datalabeling.v1beta1\x1a\x19google/api/resource.proto\x1a/google/cloud/datalabeling/v1beta1/dataset.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xfd\x03\n\x0bInstruction\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\x12/\n\x0b\x63reate_time\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12/\n\x0bupdate_time\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.Timestamp\x12>\n\tdata_type\x18\x06 \x01(\x0e\x32+.google.cloud.datalabeling.v1beta1.DataType\x12N\n\x0f\x63sv_instruction\x18\x07 \x01(\x0b\x32\x31.google.cloud.datalabeling.v1beta1.CsvInstructionB\x02\x18\x01\x12J\n\x0fpdf_instruction\x18\t \x01(\x0b\x32\x31.google.cloud.datalabeling.v1beta1.PdfInstruction\x12\x1a\n\x12\x62locking_resources\x18\n \x03(\t:[\xea\x41X\n\'datalabeling.googleapis.com/Instruction\x12-projects/{project}/instructions/{instruction}\"&\n\x0e\x43svInstruction\x12\x14\n\x0cgcs_file_uri\x18\x01 \x01(\t\"&\n\x0ePdfInstruction\x12\x14\n\x0cgcs_file_uri\x18\x01 \x01(\tB\xe7\x01\n%com.google.cloud.datalabeling.v1beta1P\x01ZMgoogle.golang.org/genproto/googleapis/cloud/datalabeling/v1beta1;datalabeling\xaa\x02!Google.Cloud.DataLabeling.V1Beta1\xca\x02!Google\\Cloud\\DataLabeling\\V1beta1\xea\x02$Google::Cloud::DataLabeling::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.datalabeling.v1beta1.instruction_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.google.cloud.datalabeling.v1beta1P\001ZMgoogle.golang.org/genproto/googleapis/cloud/datalabeling/v1beta1;datalabeling\252\002!Google.Cloud.DataLabeling.V1Beta1\312\002!Google\\Cloud\\DataLabeling\\V1beta1\352\002$Google::Cloud::DataLabeling::V1beta1'
  _INSTRUCTION.fields_by_name['csv_instruction']._options = None
  _INSTRUCTION.fields_by_name['csv_instruction']._serialized_options = b'\030\001'
  _INSTRUCTION._options = None
  _INSTRUCTION._serialized_options = b'\352AX\n\'datalabeling.googleapis.com/Instruction\022-projects/{project}/instructions/{instruction}'
  _INSTRUCTION._serialized_start=200
  _INSTRUCTION._serialized_end=709
  _CSVINSTRUCTION._serialized_start=711
  _CSVINSTRUCTION._serialized_end=749
  _PDFINSTRUCTION._serialized_start=751
  _PDFINSTRUCTION._serialized_end=789
# @@protoc_insertion_point(module_scope)
