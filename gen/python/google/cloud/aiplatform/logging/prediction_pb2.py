# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/logging/prediction.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.rpc import status_pb2 as google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0google/cloud/aiplatform/logging/prediction.proto\x12\x1fgoogle.cloud.aiplatform.logging\x1a\x17google/rpc/status.proto\"\x9c\x01\n\x18OnlinePredictionLogEntry\x12\x10\n\x08\x65ndpoint\x18\x01 \x01(\t\x12\x19\n\x11\x64\x65ployed_model_id\x18\x02 \x01(\t\x12\x16\n\x0einstance_count\x18\x03 \x01(\x03\x12\x18\n\x10prediction_count\x18\x04 \x01(\x03\x12!\n\x05\x65rror\x18\x05 \x01(\x0b\x32\x12.google.rpc.StatusB\x80\x01\n#com.google.cloud.aiplatform.loggingB\x0fPredictionProtoP\x01ZFgoogle.golang.org/genproto/googleapis/cloud/aiplatform/logging;loggingb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.logging.prediction_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.aiplatform.loggingB\017PredictionProtoP\001ZFgoogle.golang.org/genproto/googleapis/cloud/aiplatform/logging;logging'
  _ONLINEPREDICTIONLOGENTRY._serialized_start=111
  _ONLINEPREDICTIONLOGENTRY._serialized_end=267
# @@protoc_insertion_point(module_scope)
