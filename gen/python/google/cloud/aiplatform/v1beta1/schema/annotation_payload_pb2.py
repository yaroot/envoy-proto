# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/aiplatform/v1beta1/schema/annotation_payload.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.cloud.aiplatform.v1beta1.schema import annotation_spec_color_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_schema_dot_annotation__spec__color__pb2
from google.cloud.aiplatform.v1beta1.schema import geometry_pb2 as google_dot_cloud_dot_aiplatform_dot_v1beta1_dot_schema_dot_geometry__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n?google/cloud/aiplatform/v1beta1/schema/annotation_payload.proto\x12&google.cloud.aiplatform.v1beta1.schema\x1a\x42google/cloud/aiplatform/v1beta1/schema/annotation_spec_color.proto\x1a\x35google/cloud/aiplatform/v1beta1/schema/geometry.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x1cgoogle/api/annotations.proto\"Q\n\x1dImageClassificationAnnotation\x12\x1a\n\x12\x61nnotation_spec_id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\"\x8a\x01\n\x1aImageBoundingBoxAnnotation\x12\x1a\n\x12\x61nnotation_spec_id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\x12\r\n\x05x_min\x18\x03 \x01(\x01\x12\r\n\x05x_max\x18\x04 \x01(\x01\x12\r\n\x05y_min\x18\x05 \x01(\x01\x12\r\n\x05y_max\x18\x06 \x01(\x01\"\xa1\x06\n\x1bImageSegmentationAnnotation\x12m\n\x0fmask_annotation\x18\x03 \x01(\x0b\x32R.google.cloud.aiplatform.v1beta1.schema.ImageSegmentationAnnotation.MaskAnnotationH\x00\x12s\n\x12polygon_annotation\x18\x04 \x01(\x0b\x32U.google.cloud.aiplatform.v1beta1.schema.ImageSegmentationAnnotation.PolygonAnnotationH\x00\x12u\n\x13polyline_annotation\x18\x05 \x01(\x0b\x32V.google.cloud.aiplatform.v1beta1.schema.ImageSegmentationAnnotation.PolylineAnnotationH\x00\x1a\x83\x01\n\x0eMaskAnnotation\x12\x14\n\x0cmask_gcs_uri\x18\x01 \x01(\t\x12[\n\x16\x61nnotation_spec_colors\x18\x02 \x03(\x0b\x32;.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColor\x1a\x87\x01\n\x11PolygonAnnotation\x12@\n\x08vertexes\x18\x01 \x03(\x0b\x32..google.cloud.aiplatform.v1beta1.schema.Vertex\x12\x1a\n\x12\x61nnotation_spec_id\x18\x02 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\x1a\x88\x01\n\x12PolylineAnnotation\x12@\n\x08vertexes\x18\x01 \x03(\x0b\x32..google.cloud.aiplatform.v1beta1.schema.Vertex\x12\x1a\n\x12\x61nnotation_spec_id\x18\x02 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\tB\x0c\n\nannotation\"P\n\x1cTextClassificationAnnotation\x12\x1a\n\x12\x61nnotation_spec_id\x18\x01 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x02 \x01(\t\"\x97\x01\n\x18TextExtractionAnnotation\x12I\n\x0ctext_segment\x18\x01 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.schema.TextSegment\x12\x1a\n\x12\x61nnotation_spec_id\x18\x02 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\"H\n\x0bTextSegment\x12\x14\n\x0cstart_offset\x18\x01 \x01(\x04\x12\x12\n\nend_offset\x18\x02 \x01(\x04\x12\x0f\n\x07\x63ontent\x18\x03 \x01(\t\"u\n\x17TextSentimentAnnotation\x12\x11\n\tsentiment\x18\x01 \x01(\x05\x12\x15\n\rsentiment_max\x18\x02 \x01(\x05\x12\x1a\n\x12\x61nnotation_spec_id\x18\x03 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x04 \x01(\t\"\x9c\x01\n\x1dVideoClassificationAnnotation\x12I\n\x0ctime_segment\x18\x01 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.schema.TimeSegment\x12\x1a\n\x12\x61nnotation_spec_id\x18\x02 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\t\"w\n\x0bTimeSegment\x12\x34\n\x11start_time_offset\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\x32\n\x0f\x65nd_time_offset\x18\x02 \x01(\x0b\x32\x19.google.protobuf.Duration\"\xd2\x01\n\x1dVideoObjectTrackingAnnotation\x12.\n\x0btime_offset\x18\x01 \x01(\x0b\x32\x19.google.protobuf.Duration\x12\r\n\x05x_min\x18\x02 \x01(\x01\x12\r\n\x05x_max\x18\x03 \x01(\x01\x12\r\n\x05y_min\x18\x04 \x01(\x01\x12\r\n\x05y_max\x18\x05 \x01(\x01\x12\x13\n\x0binstance_id\x18\x06 \x01(\x03\x12\x1a\n\x12\x61nnotation_spec_id\x18\x07 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x08 \x01(\t\"\x9f\x01\n VideoActionRecognitionAnnotation\x12I\n\x0ctime_segment\x18\x01 \x01(\x0b\x32\x33.google.cloud.aiplatform.v1beta1.schema.TimeSegment\x12\x1a\n\x12\x61nnotation_spec_id\x18\x02 \x01(\t\x12\x14\n\x0c\x64isplay_name\x18\x03 \x01(\tB\x93\x02\n*com.google.cloud.aiplatform.v1beta1.schemaB\x16\x41nnotationPayloadProtoP\x01ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schema\xaa\x02&Google.Cloud.AIPlatform.V1Beta1.Schema\xca\x02&Google\\Cloud\\AIPlatform\\V1beta1\\Schema\xea\x02*Google::Cloud::AIPlatform::V1beta1::Schemab\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'google.cloud.aiplatform.v1beta1.schema.annotation_payload_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n*com.google.cloud.aiplatform.v1beta1.schemaB\026AnnotationPayloadProtoP\001ZLgoogle.golang.org/genproto/googleapis/cloud/aiplatform/v1beta1/schema;schema\252\002&Google.Cloud.AIPlatform.V1Beta1.Schema\312\002&Google\\Cloud\\AIPlatform\\V1beta1\\Schema\352\002*Google::Cloud::AIPlatform::V1beta1::Schema'
  _IMAGECLASSIFICATIONANNOTATION._serialized_start=292
  _IMAGECLASSIFICATIONANNOTATION._serialized_end=373
  _IMAGEBOUNDINGBOXANNOTATION._serialized_start=376
  _IMAGEBOUNDINGBOXANNOTATION._serialized_end=514
  _IMAGESEGMENTATIONANNOTATION._serialized_start=517
  _IMAGESEGMENTATIONANNOTATION._serialized_end=1318
  _IMAGESEGMENTATIONANNOTATION_MASKANNOTATION._serialized_start=896
  _IMAGESEGMENTATIONANNOTATION_MASKANNOTATION._serialized_end=1027
  _IMAGESEGMENTATIONANNOTATION_POLYGONANNOTATION._serialized_start=1030
  _IMAGESEGMENTATIONANNOTATION_POLYGONANNOTATION._serialized_end=1165
  _IMAGESEGMENTATIONANNOTATION_POLYLINEANNOTATION._serialized_start=1168
  _IMAGESEGMENTATIONANNOTATION_POLYLINEANNOTATION._serialized_end=1304
  _TEXTCLASSIFICATIONANNOTATION._serialized_start=1320
  _TEXTCLASSIFICATIONANNOTATION._serialized_end=1400
  _TEXTEXTRACTIONANNOTATION._serialized_start=1403
  _TEXTEXTRACTIONANNOTATION._serialized_end=1554
  _TEXTSEGMENT._serialized_start=1556
  _TEXTSEGMENT._serialized_end=1628
  _TEXTSENTIMENTANNOTATION._serialized_start=1630
  _TEXTSENTIMENTANNOTATION._serialized_end=1747
  _VIDEOCLASSIFICATIONANNOTATION._serialized_start=1750
  _VIDEOCLASSIFICATIONANNOTATION._serialized_end=1906
  _TIMESEGMENT._serialized_start=1908
  _TIMESEGMENT._serialized_end=2027
  _VIDEOOBJECTTRACKINGANNOTATION._serialized_start=2030
  _VIDEOOBJECTTRACKINGANNOTATION._serialized_end=2240
  _VIDEOACTIONRECOGNITIONANNOTATION._serialized_start=2243
  _VIDEOACTIONRECOGNITIONANNOTATION._serialized_end=2402
# @@protoc_insertion_point(module_scope)
