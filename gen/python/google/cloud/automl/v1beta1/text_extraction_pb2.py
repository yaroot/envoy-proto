# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/automl/v1beta1/text_extraction.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.automl.v1beta1 import text_segment_pb2 as google_dot_cloud_dot_automl_dot_v1beta1_dot_text__segment__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n1google/cloud/automl/v1beta1/text_extraction.proto\x12\x1bgoogle.cloud.automl.v1beta1\x1a.google/cloud/automl/v1beta1/text_segment.proto\x1a\x1cgoogle/api/annotations.proto\"y\n\x18TextExtractionAnnotation\x12@\n\x0ctext_segment\x18\x03 \x01(\x0b\x32(.google.cloud.automl.v1beta1.TextSegmentH\x00\x12\r\n\x05score\x18\x01 \x01(\x02\x42\x0c\n\nannotation\"\x97\x02\n\x1fTextExtractionEvaluationMetrics\x12\x0e\n\x06\x61u_prc\x18\x01 \x01(\x02\x12w\n\x1a\x63onfidence_metrics_entries\x18\x02 \x03(\x0b\x32S.google.cloud.automl.v1beta1.TextExtractionEvaluationMetrics.ConfidenceMetricsEntry\x1ak\n\x16\x43onfidenceMetricsEntry\x12\x1c\n\x14\x63onfidence_threshold\x18\x01 \x01(\x02\x12\x0e\n\x06recall\x18\x03 \x01(\x02\x12\x11\n\tprecision\x18\x04 \x01(\x02\x12\x10\n\x08\x66\x31_score\x18\x05 \x01(\x02\x42\xa5\x01\n\x1f\x63om.google.cloud.automl.v1beta1P\x01ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\xca\x02\x1bGoogle\\Cloud\\AutoMl\\V1beta1\xea\x02\x1eGoogle::Cloud::AutoML::V1beta1b\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.automl.v1beta1.text_extraction_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.google.cloud.automl.v1beta1P\001ZAgoogle.golang.org/genproto/googleapis/cloud/automl/v1beta1;automl\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::V1beta1'
  _TEXTEXTRACTIONANNOTATION._serialized_start=160
  _TEXTEXTRACTIONANNOTATION._serialized_end=281
  _TEXTEXTRACTIONEVALUATIONMETRICS._serialized_start=284
  _TEXTEXTRACTIONEVALUATIONMETRICS._serialized_end=563
  _TEXTEXTRACTIONEVALUATIONMETRICS_CONFIDENCEMETRICSENTRY._serialized_start=456
  _TEXTEXTRACTIONEVALUATIONMETRICS_CONFIDENCEMETRICSENTRY._serialized_end=563
# @@protoc_insertion_point(module_scope)
