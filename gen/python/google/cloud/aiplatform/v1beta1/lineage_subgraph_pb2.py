# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/lineage_subgraph.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.aiplatform.v1beta1 import artifact_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_artifact__pb2
from google.cloud.aiplatform.v1beta1 import event_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_event__pb2
from google.cloud.aiplatform.v1beta1 import execution_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_execution__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n6google/cloud/aiplatform/v1beta1/lineage_subgraph.proto\x12\x1fgoogle.cloud.aiplatform.v1beta1\x1a.google/cloud/aiplatform/v1beta1/artifact.proto\x1a+google/cloud/aiplatform/v1beta1/event.proto\x1a/google/cloud/aiplatform/v1beta1/execution.proto\"\xc7\x01\n\x0fLineageSubgraph\x12<\n\tartifacts\x18\x01 \x03(\x0b\x32).google.cloud.aiplatform.v1beta1.Artifact\x12>\n\nexecutions\x18\x02 \x03(\x0b\x32*.google.cloud.aiplatform.v1beta1.Execution\x12\x36\n\x06\x65vents\x18\x03 \x03(\x0b\x32&.google.cloud.aiplatform.v1beta1.EventB\xf1\x01\n#com.google.cloud.aiplatform.v1beta1B\x14LineageSubgraphProtoP\x01ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\xaa\x02\x1fGoogle.Cloud.AIPlatform.V1Beta1\xca\x02\x1fGoogle\\Cloud\\AIPlatform\\V1beta1\xea\x02\"Google::Cloud::AIPlatform::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.lineage_subgraph_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n#com.google.cloud.aiplatform.v1beta1B\024LineageSubgraphProtoP\001ZIgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1;aiplatform\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1'
  _LINEAGESUBGRAPH._serialized_start=234
  _LINEAGESUBGRAPH._serialized_end=433
# @@protoc_insertion_point(module_scope)
