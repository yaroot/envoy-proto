// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/params/image_segmentation.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.params;

public final class ImageSegmentationPredictionParamsProto {
  private ImageSegmentationPredictionParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageSegmentationPredictionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageSegmentationPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/params/image_segmentation.proto" +
      "\0225google.cloud.aiplatform.v1beta1.schema" +
      ".predict.params\"A\n!ImageSegmentationPred" +
      "ictionParams\022\034\n\024confidence_threshold\030\001 \001" +
      "(\002B\360\002\n9com.google.cloud.aiplatform.v1bet" +
      "a1.schema.predict.paramsB&ImageSegmentat" +
      "ionPredictionParamsProtoP\001Z[google.golan" +
      "g.org/genproto/googleapis/cloud/aiplatfo" +
      "rm/v1beta1/schema/predict/params;params\252" +
      "\0025Google.Cloud.AIPlatform.V1Beta1.Schema" +
      ".Predict.Params\312\0025Google\\Cloud\\AIPlatfor" +
      "m\\V1beta1\\Schema\\Predict\\Params\352\002;Google" +
      "::Cloud::AIPlatform::V1beta1::Schema::Pr" +
      "edict::Paramsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageSegmentationPredictionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageSegmentationPredictionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageSegmentationPredictionParams_descriptor,
        new java.lang.String[] { "ConfidenceThreshold", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
