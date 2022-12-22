// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/lva.proto

package com.google.cloud.visionai.v1;

public final class LvaProto {
  private LvaProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_StreamInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_StreamInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_EnvironmentVariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_EnvironmentVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_AttrsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_AttrsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1_AnalysisDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1_AnalysisDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/cloud/visionai/v1/lva.proto\022\030go" +
      "ogle.cloud.visionai.v1\"M\n\016AttributeValue" +
      "\022\013\n\001i\030\001 \001(\003H\000\022\013\n\001f\030\002 \001(\002H\000\022\013\n\001b\030\003 \001(\010H\000\022" +
      "\013\n\001s\030\004 \001(\014H\000B\007\n\005value\"\324\004\n\022AnalyzerDefini" +
      "tion\022\020\n\010analyzer\030\001 \001(\t\022\020\n\010operator\030\002 \001(\t" +
      "\022H\n\006inputs\030\003 \003(\01328.google.cloud.visionai" +
      ".v1.AnalyzerDefinition.StreamInput\022F\n\005at" +
      "trs\030\004 \003(\01327.google.cloud.visionai.v1.Ana" +
      "lyzerDefinition.AttrsEntry\022P\n\rdebug_opti" +
      "ons\030\005 \001(\01329.google.cloud.visionai.v1.Ana" +
      "lyzerDefinition.DebugOptions\032\034\n\013StreamIn" +
      "put\022\r\n\005input\030\001 \001(\t\032\277\001\n\014DebugOptions\022r\n\025e" +
      "nvironment_variables\030\001 \003(\0132S.google.clou" +
      "d.visionai.v1.AnalyzerDefinition.DebugOp" +
      "tions.EnvironmentVariablesEntry\032;\n\031Envir" +
      "onmentVariablesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val" +
      "ue\030\002 \001(\t:\0028\001\032V\n\nAttrsEntry\022\013\n\003key\030\001 \001(\t\022" +
      "7\n\005value\030\002 \001(\0132(.google.cloud.visionai.v" +
      "1.AttributeValue:\0028\001\"U\n\022AnalysisDefiniti" +
      "on\022?\n\tanalyzers\030\001 \003(\0132,.google.cloud.vis" +
      "ionai.v1.AnalyzerDefinitionB\300\001\n\034com.goog" +
      "le.cloud.visionai.v1B\010LvaProtoP\001Z@google" +
      ".golang.org/genproto/googleapis/cloud/vi" +
      "sionai/v1;visionai\252\002\030Google.Cloud.Vision" +
      "AI.V1\312\002\030Google\\Cloud\\VisionAI\\V1\352\002\033Googl" +
      "e::Cloud::VisionAI::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_visionai_v1_AttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_visionai_v1_AttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AttributeValue_descriptor,
        new java.lang.String[] { "I", "F", "B", "S", "Value", });
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AnalyzerDefinition_descriptor,
        new java.lang.String[] { "Analyzer", "Operator", "Inputs", "Attrs", "DebugOptions", });
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_StreamInput_descriptor =
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_StreamInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AnalyzerDefinition_StreamInput_descriptor,
        new java.lang.String[] { "Input", });
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_descriptor =
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_descriptor,
        new java.lang.String[] { "EnvironmentVariables", });
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_EnvironmentVariablesEntry_descriptor =
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_EnvironmentVariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AnalyzerDefinition_DebugOptions_EnvironmentVariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_AttrsEntry_descriptor =
      internal_static_google_cloud_visionai_v1_AnalyzerDefinition_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_visionai_v1_AnalyzerDefinition_AttrsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AnalyzerDefinition_AttrsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_visionai_v1_AnalysisDefinition_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_visionai_v1_AnalysisDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1_AnalysisDefinition_descriptor,
        new java.lang.String[] { "Analyzers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}