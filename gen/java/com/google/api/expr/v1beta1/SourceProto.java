// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/source.proto

package com.google.api.expr.v1beta1;

public final class SourceProto {
  private SourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_SourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_SourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_SourceInfo_PositionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_SourceInfo_PositionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_SourcePosition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_SourcePosition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/api/expr/v1beta1/source.proto\022\027" +
      "google.api.expr.v1beta1\"\255\001\n\nSourceInfo\022\020" +
      "\n\010location\030\002 \001(\t\022\024\n\014line_offsets\030\003 \003(\005\022E" +
      "\n\tpositions\030\004 \003(\01322.google.api.expr.v1be" +
      "ta1.SourceInfo.PositionsEntry\0320\n\016Positio" +
      "nsEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001(\005:\0028\001\"" +
      "P\n\016SourcePosition\022\020\n\010location\030\001 \001(\t\022\016\n\006o" +
      "ffset\030\002 \001(\005\022\014\n\004line\030\003 \001(\005\022\016\n\006column\030\004 \001(" +
      "\005Bl\n\033com.google.api.expr.v1beta1B\013Source" +
      "ProtoP\001Z;google.golang.org/genproto/goog" +
      "leapis/api/expr/v1beta1;expr\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_api_expr_v1beta1_SourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_expr_v1beta1_SourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_SourceInfo_descriptor,
        new java.lang.String[] { "Location", "LineOffsets", "Positions", });
    internal_static_google_api_expr_v1beta1_SourceInfo_PositionsEntry_descriptor =
      internal_static_google_api_expr_v1beta1_SourceInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_api_expr_v1beta1_SourceInfo_PositionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_SourceInfo_PositionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_expr_v1beta1_SourcePosition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_expr_v1beta1_SourcePosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_SourcePosition_descriptor,
        new java.lang.String[] { "Location", "Offset", "Line", "Column", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}