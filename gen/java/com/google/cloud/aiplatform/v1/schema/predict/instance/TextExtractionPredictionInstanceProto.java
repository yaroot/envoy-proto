// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/schema/predict/instance/text_extraction.proto

package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class TextExtractionPredictionInstanceProto {
  private TextExtractionPredictionInstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextExtractionPredictionInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextExtractionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/cloud/aiplatform/v1/schema/pred" +
      "ict/instance/text_extraction.proto\0222goog" +
      "le.cloud.aiplatform.v1.schema.predict.in" +
      "stance\"S\n TextExtractionPredictionInstan" +
      "ce\022\017\n\007content\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\022\013" +
      "\n\003key\030\003 \001(\tB\342\002\n6com.google.cloud.aiplatf" +
      "orm.v1.schema.predict.instanceB%TextExtr" +
      "actionPredictionInstanceProtoP\001ZZgoogle." +
      "golang.org/genproto/googleapis/cloud/aip" +
      "latform/v1/schema/predict/instance;insta" +
      "nce\252\0022Google.Cloud.AIPlatform.V1.Schema." +
      "Predict.Instance\312\0022Google\\Cloud\\AIPlatfo" +
      "rm\\V1\\Schema\\Predict\\Instance\352\0028Google::" +
      "Cloud::AIPlatform::V1::Schema::Predict::" +
      "Instanceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextExtractionPredictionInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextExtractionPredictionInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_schema_predict_instance_TextExtractionPredictionInstance_descriptor,
        new java.lang.String[] { "Content", "MimeType", "Key", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
