# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1/schema/predict/prediction/video_action_recognition.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nSgoogle/cloud/aiplatform/v1/schema/predict/prediction/video_action_recognition.proto\x12\x34google.cloud.aiplatform.v1.schema.predict.prediction\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xe7\x01\n&VideoActionRecognitionPredictionResult\x12\n\n\x02id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x35\n\x12time_segment_start\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x33\n\x10time_segment_end\x18\x05 \x01(\x0b\x32\x19.google.protobuf.Duration\x12/\n\nconfidence\x18\x06 \x01(\x0b\x32\x1b.google.protobuf.FloatValueB\xf4\x02\n8com.google.cloud.aiplatform.v1.schema.predict.predictionB+VideoActionRecognitionPredictionResultProtoP\x01Z^google.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/predict/prediction;prediction\xaa\x02\x34Google.Cloud.AIPlatform.V1.Schema.Predict.Prediction\xca\x02\x34Google\\Cloud\\AIPlatform\\V1\\Schema\\Predict\\Prediction\xea\x02:Google::Cloud::AIPlatform::V1::Schema::Predict::Predictionb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1.schema.predict.prediction.video_action_recognition_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n8com.google.cloud.aiplatform.v1.schema.predict.predictionB+VideoActionRecognitionPredictionResultProtoP\001Z^google.golang.org/genproto/googleapis/cloud/aiplatform/v1/schema/predict/prediction;prediction\252\0024Google.Cloud.AIPlatform.V1.Schema.Predict.Prediction\312\0024Google\\Cloud\\AIPlatform\\V1\\Schema\\Predict\\Prediction\352\002:Google::Cloud::AIPlatform::V1::Schema::Predict::Prediction'
  _VIDEOACTIONRECOGNITIONPREDICTIONRESULT._serialized_start=206
  _VIDEOACTIONRECOGNITIONPREDICTIONRESULT._serialized_end=437
# @@protoc_insertion_point(module_scope)
