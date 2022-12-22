// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/conformance/v1alpha1/conformance_service.proto

package com.google.api.expr.conformance.v1alpha1;

public final class ConformanceServiceProto {
  private ConformanceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_ParseRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_ParseRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_ParseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_ParseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_CheckRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_CheckRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_CheckResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_CheckResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_BindingsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_BindingsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_EvalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_EvalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_conformance_v1alpha1_IssueDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_conformance_v1alpha1_IssueDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/api/expr/conformance/v1alpha1/c" +
      "onformance_service.proto\022$google.api.exp" +
      "r.conformance.v1alpha1\032&google/api/expr/" +
      "v1alpha1/checked.proto\032#google/api/expr/" +
      "v1alpha1/eval.proto\032%google/api/expr/v1a" +
      "lpha1/syntax.proto\032\027google/rpc/status.pr" +
      "oto\032\027google/api/client.proto\"k\n\014ParseReq" +
      "uest\022\022\n\ncel_source\030\001 \001(\t\022\026\n\016syntax_versi" +
      "on\030\002 \001(\t\022\027\n\017source_location\030\003 \001(\t\022\026\n\016dis" +
      "able_macros\030\004 \001(\010\"n\n\rParseResponse\0229\n\013pa" +
      "rsed_expr\030\001 \001(\0132$.google.api.expr.v1alph" +
      "a1.ParsedExpr\022\"\n\006issues\030\002 \003(\0132\022.google.r" +
      "pc.Status\"\242\001\n\014CheckRequest\0229\n\013parsed_exp" +
      "r\030\001 \001(\0132$.google.api.expr.v1alpha1.Parse" +
      "dExpr\0220\n\010type_env\030\002 \003(\0132\036.google.api.exp" +
      "r.v1alpha1.Decl\022\021\n\tcontainer\030\003 \001(\t\022\022\n\nno" +
      "_std_env\030\004 \001(\010\"p\n\rCheckResponse\022;\n\014check" +
      "ed_expr\030\001 \001(\0132%.google.api.expr.v1alpha1" +
      ".CheckedExpr\022\"\n\006issues\030\002 \003(\0132\022.google.rp" +
      "c.Status\"\322\002\n\013EvalRequest\022;\n\013parsed_expr\030" +
      "\001 \001(\0132$.google.api.expr.v1alpha1.ParsedE" +
      "xprH\000\022=\n\014checked_expr\030\002 \001(\0132%.google.api" +
      ".expr.v1alpha1.CheckedExprH\000\022Q\n\010bindings" +
      "\030\003 \003(\0132?.google.api.expr.conformance.v1a" +
      "lpha1.EvalRequest.BindingsEntry\022\021\n\tconta" +
      "iner\030\004 \001(\t\032T\n\rBindingsEntry\022\013\n\003key\030\001 \001(\t" +
      "\0222\n\005value\030\002 \001(\0132#.google.api.expr.v1alph" +
      "a1.ExprValue:\0028\001B\013\n\texpr_kind\"g\n\014EvalRes" +
      "ponse\0223\n\006result\030\001 \001(\0132#.google.api.expr." +
      "v1alpha1.ExprValue\022\"\n\006issues\030\002 \003(\0132\022.goo" +
      "gle.rpc.Status\"\364\001\n\014IssueDetails\022M\n\010sever" +
      "ity\030\001 \001(\0162;.google.api.expr.conformance." +
      "v1alpha1.IssueDetails.Severity\022:\n\010positi" +
      "on\030\002 \001(\0132(.google.api.expr.v1alpha1.Sour" +
      "cePosition\022\n\n\002id\030\003 \001(\003\"M\n\010Severity\022\030\n\024SE" +
      "VERITY_UNSPECIFIED\020\000\022\017\n\013DEPRECATION\020\001\022\013\n" +
      "\007WARNING\020\002\022\t\n\005ERROR\020\0032\204\003\n\022ConformanceSer" +
      "vice\022r\n\005Parse\0222.google.api.expr.conforma" +
      "nce.v1alpha1.ParseRequest\0323.google.api.e" +
      "xpr.conformance.v1alpha1.ParseResponse\"\000" +
      "\022r\n\005Check\0222.google.api.expr.conformance." +
      "v1alpha1.CheckRequest\0323.google.api.expr." +
      "conformance.v1alpha1.CheckResponse\"\000\022o\n\004" +
      "Eval\0221.google.api.expr.conformance.v1alp" +
      "ha1.EvalRequest\0322.google.api.expr.confor" +
      "mance.v1alpha1.EvalResponse\"\000\032\025\312A\022cel.go" +
      "ogleapis.comB\224\001\n(com.google.api.expr.con" +
      "formance.v1alpha1B\027ConformanceServicePro" +
      "toP\001ZJgoogle.golang.org/genproto/googlea" +
      "pis/api/expr/conformance/v1alpha1;confpb" +
      "\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.expr.v1alpha1.DeclProto.getDescriptor(),
          com.google.api.expr.v1alpha1.EvalProto.getDescriptor(),
          com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_api_expr_conformance_v1alpha1_ParseRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_expr_conformance_v1alpha1_ParseRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_ParseRequest_descriptor,
        new java.lang.String[] { "CelSource", "SyntaxVersion", "SourceLocation", "DisableMacros", });
    internal_static_google_api_expr_conformance_v1alpha1_ParseResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_expr_conformance_v1alpha1_ParseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_ParseResponse_descriptor,
        new java.lang.String[] { "ParsedExpr", "Issues", });
    internal_static_google_api_expr_conformance_v1alpha1_CheckRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_expr_conformance_v1alpha1_CheckRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_CheckRequest_descriptor,
        new java.lang.String[] { "ParsedExpr", "TypeEnv", "Container", "NoStdEnv", });
    internal_static_google_api_expr_conformance_v1alpha1_CheckResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_expr_conformance_v1alpha1_CheckResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_CheckResponse_descriptor,
        new java.lang.String[] { "CheckedExpr", "Issues", });
    internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_descriptor,
        new java.lang.String[] { "ParsedExpr", "CheckedExpr", "Bindings", "Container", "ExprKind", });
    internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_BindingsEntry_descriptor =
      internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_BindingsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_EvalRequest_BindingsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_expr_conformance_v1alpha1_EvalResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_api_expr_conformance_v1alpha1_EvalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_EvalResponse_descriptor,
        new java.lang.String[] { "Result", "Issues", });
    internal_static_google_api_expr_conformance_v1alpha1_IssueDetails_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_api_expr_conformance_v1alpha1_IssueDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_conformance_v1alpha1_IssueDetails_descriptor,
        new java.lang.String[] { "Severity", "Position", "Id", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.expr.v1alpha1.DeclProto.getDescriptor();
    com.google.api.expr.v1alpha1.EvalProto.getDescriptor();
    com.google.api.expr.v1alpha1.SyntaxProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}