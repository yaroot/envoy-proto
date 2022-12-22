// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1beta1/eval.proto

package com.google.api.expr.v1beta1;

public final class EvalProto {
  private EvalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_EvalState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_EvalState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_EvalState_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_EvalState_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_ExprValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_ExprValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_ErrorSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_ErrorSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_UnknownSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_UnknownSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1beta1_IdRef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1beta1_IdRef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/api/expr/v1beta1/eval.proto\022\027go" +
      "ogle.api.expr.v1beta1\032#google/api/expr/v" +
      "1beta1/value.proto\032\027google/rpc/status.pr" +
      "oto\"\302\001\n\tEvalState\0222\n\006values\030\001 \003(\0132\".goog" +
      "le.api.expr.v1beta1.ExprValue\022:\n\007results" +
      "\030\003 \003(\0132).google.api.expr.v1beta1.EvalSta" +
      "te.Result\032E\n\006Result\022,\n\004expr\030\001 \001(\0132\036.goog" +
      "le.api.expr.v1beta1.IdRef\022\r\n\005value\030\002 \001(\005" +
      "\"\260\001\n\tExprValue\022/\n\005value\030\001 \001(\0132\036.google.a" +
      "pi.expr.v1beta1.ValueH\000\0222\n\005error\030\002 \001(\0132!" +
      ".google.api.expr.v1beta1.ErrorSetH\000\0226\n\007u" +
      "nknown\030\003 \001(\0132#.google.api.expr.v1beta1.U" +
      "nknownSetH\000B\006\n\004kind\".\n\010ErrorSet\022\"\n\006error" +
      "s\030\001 \003(\0132\022.google.rpc.Status\";\n\nUnknownSe" +
      "t\022-\n\005exprs\030\001 \003(\0132\036.google.api.expr.v1bet" +
      "a1.IdRef\"\023\n\005IdRef\022\n\n\002id\030\001 \001(\005Bj\n\033com.goo" +
      "gle.api.expr.v1beta1B\tEvalProtoP\001Z;googl" +
      "e.golang.org/genproto/googleapis/api/exp" +
      "r/v1beta1;expr\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.expr.v1beta1.ValueProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_api_expr_v1beta1_EvalState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_expr_v1beta1_EvalState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_EvalState_descriptor,
        new java.lang.String[] { "Values", "Results", });
    internal_static_google_api_expr_v1beta1_EvalState_Result_descriptor =
      internal_static_google_api_expr_v1beta1_EvalState_descriptor.getNestedTypes().get(0);
    internal_static_google_api_expr_v1beta1_EvalState_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_EvalState_Result_descriptor,
        new java.lang.String[] { "Expr", "Value", });
    internal_static_google_api_expr_v1beta1_ExprValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_expr_v1beta1_ExprValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_ExprValue_descriptor,
        new java.lang.String[] { "Value", "Error", "Unknown", "Kind", });
    internal_static_google_api_expr_v1beta1_ErrorSet_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_expr_v1beta1_ErrorSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_ErrorSet_descriptor,
        new java.lang.String[] { "Errors", });
    internal_static_google_api_expr_v1beta1_UnknownSet_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_expr_v1beta1_UnknownSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_UnknownSet_descriptor,
        new java.lang.String[] { "Exprs", });
    internal_static_google_api_expr_v1beta1_IdRef_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_expr_v1beta1_IdRef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1beta1_IdRef_descriptor,
        new java.lang.String[] { "Id", });
    com.google.api.expr.v1beta1.ValueProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}