# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dialogflow/v2/validation_result.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2google/cloud/dialogflow/v2/validation_result.proto\x12\x1agoogle.cloud.dialogflow.v2\"\xd7\x01\n\x0fValidationError\x12\x46\n\x08severity\x18\x01 \x01(\x0e\x32\x34.google.cloud.dialogflow.v2.ValidationError.Severity\x12\x0f\n\x07\x65ntries\x18\x03 \x03(\t\x12\x15\n\rerror_message\x18\x04 \x01(\t\"T\n\x08Severity\x12\x18\n\x14SEVERITY_UNSPECIFIED\x10\x00\x12\x08\n\x04INFO\x10\x01\x12\x0b\n\x07WARNING\x10\x02\x12\t\n\x05\x45RROR\x10\x03\x12\x0c\n\x08\x43RITICAL\x10\x04\"Z\n\x10ValidationResult\x12\x46\n\x11validation_errors\x18\x01 \x03(\x0b\x32+.google.cloud.dialogflow.v2.ValidationErrorB\xa4\x01\n\x1e\x63om.google.cloud.dialogflow.v2B\x15ValidationResultProtoP\x01ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2;dialogflow\xf8\x01\x01\xa2\x02\x02\x44\x46\xaa\x02\x1aGoogle.Cloud.Dialogflow.V2b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.dialogflow.v2.validation_result_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.google.cloud.dialogflow.v2B\025ValidationResultProtoP\001ZDgoogle.golang.org/genproto/googleapis/cloud/dialogflow/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2'
  _VALIDATIONERROR._serialized_start=83
  _VALIDATIONERROR._serialized_end=298
  _VALIDATIONERROR_SEVERITY._serialized_start=214
  _VALIDATIONERROR_SEVERITY._serialized_end=298
  _VALIDATIONRESULT._serialized_start=300
  _VALIDATIONRESULT._serialized_end=390
# @@protoc_insertion_point(module_scope)