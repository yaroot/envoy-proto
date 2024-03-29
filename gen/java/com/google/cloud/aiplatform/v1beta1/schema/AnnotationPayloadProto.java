// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/annotation_payload.proto

package com.google.cloud.aiplatform.v1beta1.schema;

public final class AnnotationPayloadProto {
  private AnnotationPayloadProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageClassificationAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_MaskAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_MaskAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolygonAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolygonAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolylineAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolylineAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextClassificationAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_TextClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextExtractionAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_TextExtractionAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_TextSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextSentimentAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_TextSentimentAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoClassificationAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_VideoClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_TimeSegment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_TimeSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoObjectTrackingAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_VideoObjectTrackingAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/aiplatform/v1beta1/schema" +
      "/annotation_payload.proto\022&google.cloud." +
      "aiplatform.v1beta1.schema\032Bgoogle/cloud/" +
      "aiplatform/v1beta1/schema/annotation_spe" +
      "c_color.proto\0325google/cloud/aiplatform/v" +
      "1beta1/schema/geometry.proto\032\036google/pro" +
      "tobuf/duration.proto\"Q\n\035ImageClassificat" +
      "ionAnnotation\022\032\n\022annotation_spec_id\030\001 \001(" +
      "\t\022\024\n\014display_name\030\002 \001(\t\"\212\001\n\032ImageBoundin" +
      "gBoxAnnotation\022\032\n\022annotation_spec_id\030\001 \001" +
      "(\t\022\024\n\014display_name\030\002 \001(\t\022\r\n\005x_min\030\003 \001(\001\022" +
      "\r\n\005x_max\030\004 \001(\001\022\r\n\005y_min\030\005 \001(\001\022\r\n\005y_max\030\006" +
      " \001(\001\"\241\006\n\033ImageSegmentationAnnotation\022m\n\017" +
      "mask_annotation\030\003 \001(\0132R.google.cloud.aip" +
      "latform.v1beta1.schema.ImageSegmentation" +
      "Annotation.MaskAnnotationH\000\022s\n\022polygon_a" +
      "nnotation\030\004 \001(\0132U.google.cloud.aiplatfor" +
      "m.v1beta1.schema.ImageSegmentationAnnota" +
      "tion.PolygonAnnotationH\000\022u\n\023polyline_ann" +
      "otation\030\005 \001(\0132V.google.cloud.aiplatform." +
      "v1beta1.schema.ImageSegmentationAnnotati" +
      "on.PolylineAnnotationH\000\032\203\001\n\016MaskAnnotati" +
      "on\022\024\n\014mask_gcs_uri\030\001 \001(\t\022[\n\026annotation_s" +
      "pec_colors\030\002 \003(\0132;.google.cloud.aiplatfo" +
      "rm.v1beta1.schema.AnnotationSpecColor\032\207\001" +
      "\n\021PolygonAnnotation\022@\n\010vertexes\030\001 \003(\0132.." +
      "google.cloud.aiplatform.v1beta1.schema.V" +
      "ertex\022\032\n\022annotation_spec_id\030\002 \001(\t\022\024\n\014dis" +
      "play_name\030\003 \001(\t\032\210\001\n\022PolylineAnnotation\022@" +
      "\n\010vertexes\030\001 \003(\0132..google.cloud.aiplatfo" +
      "rm.v1beta1.schema.Vertex\022\032\n\022annotation_s" +
      "pec_id\030\002 \001(\t\022\024\n\014display_name\030\003 \001(\tB\014\n\nan" +
      "notation\"P\n\034TextClassificationAnnotation" +
      "\022\032\n\022annotation_spec_id\030\001 \001(\t\022\024\n\014display_" +
      "name\030\002 \001(\t\"\227\001\n\030TextExtractionAnnotation\022" +
      "I\n\014text_segment\030\001 \001(\01323.google.cloud.aip" +
      "latform.v1beta1.schema.TextSegment\022\032\n\022an" +
      "notation_spec_id\030\002 \001(\t\022\024\n\014display_name\030\003" +
      " \001(\t\"H\n\013TextSegment\022\024\n\014start_offset\030\001 \001(" +
      "\004\022\022\n\nend_offset\030\002 \001(\004\022\017\n\007content\030\003 \001(\t\"u" +
      "\n\027TextSentimentAnnotation\022\021\n\tsentiment\030\001" +
      " \001(\005\022\025\n\rsentiment_max\030\002 \001(\005\022\032\n\022annotatio" +
      "n_spec_id\030\003 \001(\t\022\024\n\014display_name\030\004 \001(\t\"\234\001" +
      "\n\035VideoClassificationAnnotation\022I\n\014time_" +
      "segment\030\001 \001(\01323.google.cloud.aiplatform." +
      "v1beta1.schema.TimeSegment\022\032\n\022annotation" +
      "_spec_id\030\002 \001(\t\022\024\n\014display_name\030\003 \001(\t\"w\n\013" +
      "TimeSegment\0224\n\021start_time_offset\030\001 \001(\0132\031" +
      ".google.protobuf.Duration\0222\n\017end_time_of" +
      "fset\030\002 \001(\0132\031.google.protobuf.Duration\"\322\001" +
      "\n\035VideoObjectTrackingAnnotation\022.\n\013time_" +
      "offset\030\001 \001(\0132\031.google.protobuf.Duration\022" +
      "\r\n\005x_min\030\002 \001(\001\022\r\n\005x_max\030\003 \001(\001\022\r\n\005y_min\030\004" +
      " \001(\001\022\r\n\005y_max\030\005 \001(\001\022\023\n\013instance_id\030\006 \001(\003" +
      "\022\032\n\022annotation_spec_id\030\007 \001(\t\022\024\n\014display_" +
      "name\030\010 \001(\t\"\237\001\n VideoActionRecognitionAnn" +
      "otation\022I\n\014time_segment\030\001 \001(\01323.google.c" +
      "loud.aiplatform.v1beta1.schema.TimeSegme" +
      "nt\022\032\n\022annotation_spec_id\030\002 \001(\t\022\024\n\014displa" +
      "y_name\030\003 \001(\tB\223\002\n*com.google.cloud.aiplat" +
      "form.v1beta1.schemaB\026AnnotationPayloadPr" +
      "otoP\001ZLgoogle.golang.org/genproto/google" +
      "apis/cloud/aiplatform/v1beta1/schema;sch" +
      "ema\252\002&Google.Cloud.AIPlatform.V1Beta1.Sc" +
      "hema\312\002&Google\\Cloud\\AIPlatform\\V1beta1\\S" +
      "chema\352\002*Google::Cloud::AIPlatform::V1bet" +
      "a1::Schemab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.schema.GeometryProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageClassificationAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageClassificationAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_ImageClassificationAnnotation_descriptor,
        new java.lang.String[] { "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_ImageBoundingBoxAnnotation_descriptor,
        new java.lang.String[] { "AnnotationSpecId", "DisplayName", "XMin", "XMax", "YMin", "YMax", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_descriptor,
        new java.lang.String[] { "MaskAnnotation", "PolygonAnnotation", "PolylineAnnotation", "Annotation", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_MaskAnnotation_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_MaskAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_MaskAnnotation_descriptor,
        new java.lang.String[] { "MaskGcsUri", "AnnotationSpecColors", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolygonAnnotation_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolygonAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolygonAnnotation_descriptor,
        new java.lang.String[] { "Vertexes", "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolylineAnnotation_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolylineAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_ImageSegmentationAnnotation_PolylineAnnotation_descriptor,
        new java.lang.String[] { "Vertexes", "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextClassificationAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextClassificationAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_TextClassificationAnnotation_descriptor,
        new java.lang.String[] { "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextExtractionAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextExtractionAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_TextExtractionAnnotation_descriptor,
        new java.lang.String[] { "TextSegment", "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextSegment_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_TextSegment_descriptor,
        new java.lang.String[] { "StartOffset", "EndOffset", "Content", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextSentimentAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_schema_TextSentimentAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_TextSentimentAnnotation_descriptor,
        new java.lang.String[] { "Sentiment", "SentimentMax", "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoClassificationAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoClassificationAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_VideoClassificationAnnotation_descriptor,
        new java.lang.String[] { "TimeSegment", "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_TimeSegment_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_schema_TimeSegment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_TimeSegment_descriptor,
        new java.lang.String[] { "StartTimeOffset", "EndTimeOffset", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoObjectTrackingAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoObjectTrackingAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_VideoObjectTrackingAnnotation_descriptor,
        new java.lang.String[] { "TimeOffset", "XMin", "XMax", "YMin", "YMax", "InstanceId", "AnnotationSpecId", "DisplayName", });
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_VideoActionRecognitionAnnotation_descriptor,
        new java.lang.String[] { "TimeSegment", "AnnotationSpecId", "DisplayName", });
    com.google.cloud.aiplatform.v1beta1.schema.AnnotationSpecColorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.schema.GeometryProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
