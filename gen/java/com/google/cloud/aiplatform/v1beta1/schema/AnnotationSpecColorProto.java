// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/annotation_spec_color.proto

package com.google.cloud.aiplatform.v1beta1.schema;

public final class AnnotationSpecColorProto {
  private AnnotationSpecColorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/aiplatform/v1beta1/schema" +
      "/annotation_spec_color.proto\022&google.clo" +
      "ud.aiplatform.v1beta1.schema\032\027google/typ" +
      "e/color.proto\"Z\n\023AnnotationSpecColor\022!\n\005" +
      "color\030\001 \001(\0132\022.google.type.Color\022\024\n\014displ" +
      "ay_name\030\002 \001(\t\022\n\n\002id\030\003 \001(\tB\225\002\n*com.google" +
      ".cloud.aiplatform.v1beta1.schemaB\030Annota" +
      "tionSpecColorProtoP\001ZLgoogle.golang.org/" +
      "genproto/googleapis/cloud/aiplatform/v1b" +
      "eta1/schema;schema\252\002&Google.Cloud.AIPlat" +
      "form.V1Beta1.Schema\312\002&Google\\Cloud\\AIPla" +
      "tform\\V1beta1\\Schema\352\002*Google::Cloud::AI" +
      "Platform::V1beta1::Schemab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.type.ColorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_AnnotationSpecColor_descriptor,
        new java.lang.String[] { "Color", "DisplayName", "Id", });
    com.google.type.ColorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
