# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/video_classification.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.protobuf import wrappers_pb2 as google_dot_protobuf_dot_wrappers__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\nTgoogle/cloud/aiplatform/v1beta1/schema/predict/prediction/video_classification.proto\x12\x39google.cloud.aiplatform.v1beta1.schema.predict.prediction\x1a\x1egoogle/protobuf/duration.proto\x1a\x1egoogle/protobuf/wrappers.proto\"\xf2\x01\n#VideoClassificationPredictionResult\x12\n\n\x02id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\x0c\n\x04type\x18\x03 \x01(\t\x12\x35\n\x12time_segment_start\x18\x04 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x33\n\x10time_segment_end\x18\x05 \x01(\x0b\x32\x19.google.protobuf.Duration\x12/\n\nconfidence\x18\x06 \x01(\x0b\x32\x1b.google.protobuf.FloatValueB\x8a\x03\n=com.google.cloud.aiplatform.v1beta1.schema.predict.predictionB(VideoClassificationPredictionResultProtoP\x01Zcgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/prediction;prediction\xaa\x02\x39Google.Cloud.AIPlatform.V1Beta1.Schema.Predict.Prediction\xca\x02\x39Google\\Cloud\\AIPlatform\\V1beta1\\Schema\\Predict\\Prediction\xea\x02?Google::Cloud::AIPlatform::V1beta1::Schema::Predict::Predictionb\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.schema.predict.prediction.video_classification_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n=com.google.cloud.aiplatform.v1beta1.schema.predict.predictionB(VideoClassificationPredictionResultProtoP\001Zcgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema/predict/prediction;prediction\252\0029Google.Cloud.AIPlatform.V1Beta1.Schema.Predict.Prediction\312\0029Google\\Cloud\\AIPlatform\\V1beta1\\Schema\\Predict\\Prediction\352\002?Google::Cloud::AIPlatform::V1beta1::Schema::Predict::Prediction'
  _VIDEOCLASSIFICATIONPREDICTIONRESULT._serialized_start=212
  _VIDEOCLASSIFICATIONPREDICTIONRESULT._serialized_end=454
# @@protoc_insertion_point(module_scope)