// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/syntax.proto

package com.google.api.expr.v1alpha1;

public final class SyntaxProto {
  private SyntaxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_ParsedExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_ParsedExpr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_Ident_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_Ident_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_Select_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_Select_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_Call_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_Call_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_CreateList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_CreateList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Expr_Comprehension_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Expr_Comprehension_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_Constant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_Constant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_SourceInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_SourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_SourceInfo_PositionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_SourceInfo_PositionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_SourceInfo_MacroCallsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_SourceInfo_MacroCallsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_expr_v1alpha1_SourcePosition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_expr_v1alpha1_SourcePosition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/api/expr/v1alpha1/syntax.proto\022" +
      "\030google.api.expr.v1alpha1\032\036google/protob" +
      "uf/duration.proto\032\034google/protobuf/struc" +
      "t.proto\032\037google/protobuf/timestamp.proto" +
      "\"u\n\nParsedExpr\022,\n\004expr\030\002 \001(\0132\036.google.ap" +
      "i.expr.v1alpha1.Expr\0229\n\013source_info\030\003 \001(" +
      "\0132$.google.api.expr.v1alpha1.SourceInfo\"" +
      "\367\n\n\004Expr\022\n\n\002id\030\002 \001(\003\0228\n\nconst_expr\030\003 \001(\013" +
      "2\".google.api.expr.v1alpha1.ConstantH\000\022:" +
      "\n\nident_expr\030\004 \001(\0132$.google.api.expr.v1a" +
      "lpha1.Expr.IdentH\000\022<\n\013select_expr\030\005 \001(\0132" +
      "%.google.api.expr.v1alpha1.Expr.SelectH\000" +
      "\0228\n\tcall_expr\030\006 \001(\0132#.google.api.expr.v1" +
      "alpha1.Expr.CallH\000\022>\n\tlist_expr\030\007 \001(\0132)." +
      "google.api.expr.v1alpha1.Expr.CreateList" +
      "H\000\022B\n\013struct_expr\030\010 \001(\0132+.google.api.exp" +
      "r.v1alpha1.Expr.CreateStructH\000\022J\n\022compre" +
      "hension_expr\030\t \001(\0132,.google.api.expr.v1a" +
      "lpha1.Expr.ComprehensionH\000\032\025\n\005Ident\022\014\n\004n" +
      "ame\030\001 \001(\t\032[\n\006Select\022/\n\007operand\030\001 \001(\0132\036.g" +
      "oogle.api.expr.v1alpha1.Expr\022\r\n\005field\030\002 " +
      "\001(\t\022\021\n\ttest_only\030\003 \001(\010\032v\n\004Call\022.\n\006target" +
      "\030\001 \001(\0132\036.google.api.expr.v1alpha1.Expr\022\020" +
      "\n\010function\030\002 \001(\t\022,\n\004args\030\003 \003(\0132\036.google." +
      "api.expr.v1alpha1.Expr\032X\n\nCreateList\0220\n\010" +
      "elements\030\001 \003(\0132\036.google.api.expr.v1alpha" +
      "1.Expr\022\030\n\020optional_indices\030\002 \003(\005\032\231\002\n\014Cre" +
      "ateStruct\022\024\n\014message_name\030\001 \001(\t\022B\n\007entri" +
      "es\030\002 \003(\01321.google.api.expr.v1alpha1.Expr" +
      ".CreateStruct.Entry\032\256\001\n\005Entry\022\n\n\002id\030\001 \001(" +
      "\003\022\023\n\tfield_key\030\002 \001(\tH\000\0221\n\007map_key\030\003 \001(\0132" +
      "\036.google.api.expr.v1alpha1.ExprH\000\022-\n\005val" +
      "ue\030\004 \001(\0132\036.google.api.expr.v1alpha1.Expr" +
      "\022\026\n\016optional_entry\030\005 \001(\010B\n\n\010key_kind\032\265\002\n" +
      "\rComprehension\022\020\n\010iter_var\030\001 \001(\t\0222\n\niter" +
      "_range\030\002 \001(\0132\036.google.api.expr.v1alpha1." +
      "Expr\022\020\n\010accu_var\030\003 \001(\t\0221\n\taccu_init\030\004 \001(" +
      "\0132\036.google.api.expr.v1alpha1.Expr\0226\n\016loo" +
      "p_condition\030\005 \001(\0132\036.google.api.expr.v1al" +
      "pha1.Expr\0221\n\tloop_step\030\006 \001(\0132\036.google.ap" +
      "i.expr.v1alpha1.Expr\022.\n\006result\030\007 \001(\0132\036.g" +
      "oogle.api.expr.v1alpha1.ExprB\013\n\texpr_kin" +
      "d\"\315\002\n\010Constant\0220\n\nnull_value\030\001 \001(\0162\032.goo" +
      "gle.protobuf.NullValueH\000\022\024\n\nbool_value\030\002" +
      " \001(\010H\000\022\025\n\013int64_value\030\003 \001(\003H\000\022\026\n\014uint64_" +
      "value\030\004 \001(\004H\000\022\026\n\014double_value\030\005 \001(\001H\000\022\026\n" +
      "\014string_value\030\006 \001(\tH\000\022\025\n\013bytes_value\030\007 \001" +
      "(\014H\000\0227\n\016duration_value\030\010 \001(\0132\031.google.pr" +
      "otobuf.DurationB\002\030\001H\000\0229\n\017timestamp_value" +
      "\030\t \001(\0132\032.google.protobuf.TimestampB\002\030\001H\000" +
      "B\017\n\rconstant_kind\"\344\002\n\nSourceInfo\022\026\n\016synt" +
      "ax_version\030\001 \001(\t\022\020\n\010location\030\002 \001(\t\022\024\n\014li" +
      "ne_offsets\030\003 \003(\005\022F\n\tpositions\030\004 \003(\01323.go" +
      "ogle.api.expr.v1alpha1.SourceInfo.Positi" +
      "onsEntry\022I\n\013macro_calls\030\005 \003(\01324.google.a" +
      "pi.expr.v1alpha1.SourceInfo.MacroCallsEn" +
      "try\0320\n\016PositionsEntry\022\013\n\003key\030\001 \001(\003\022\r\n\005va" +
      "lue\030\002 \001(\005:\0028\001\032Q\n\017MacroCallsEntry\022\013\n\003key\030" +
      "\001 \001(\003\022-\n\005value\030\002 \001(\0132\036.google.api.expr.v" +
      "1alpha1.Expr:\0028\001\"P\n\016SourcePosition\022\020\n\010lo" +
      "cation\030\001 \001(\t\022\016\n\006offset\030\002 \001(\005\022\014\n\004line\030\003 \001" +
      "(\005\022\016\n\006column\030\004 \001(\005Bn\n\034com.google.api.exp" +
      "r.v1alpha1B\013SyntaxProtoP\001Z<google.golang" +
      ".org/genproto/googleapis/api/expr/v1alph" +
      "a1;expr\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_api_expr_v1alpha1_ParsedExpr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_expr_v1alpha1_ParsedExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_ParsedExpr_descriptor,
        new java.lang.String[] { "Expr", "SourceInfo", });
    internal_static_google_api_expr_v1alpha1_Expr_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_expr_v1alpha1_Expr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_descriptor,
        new java.lang.String[] { "Id", "ConstExpr", "IdentExpr", "SelectExpr", "CallExpr", "ListExpr", "StructExpr", "ComprehensionExpr", "ExprKind", });
    internal_static_google_api_expr_v1alpha1_Expr_Ident_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_descriptor.getNestedTypes().get(0);
    internal_static_google_api_expr_v1alpha1_Expr_Ident_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_Ident_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_api_expr_v1alpha1_Expr_Select_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_descriptor.getNestedTypes().get(1);
    internal_static_google_api_expr_v1alpha1_Expr_Select_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_Select_descriptor,
        new java.lang.String[] { "Operand", "Field", "TestOnly", });
    internal_static_google_api_expr_v1alpha1_Expr_Call_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_descriptor.getNestedTypes().get(2);
    internal_static_google_api_expr_v1alpha1_Expr_Call_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_Call_descriptor,
        new java.lang.String[] { "Target", "Function", "Args", });
    internal_static_google_api_expr_v1alpha1_Expr_CreateList_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_descriptor.getNestedTypes().get(3);
    internal_static_google_api_expr_v1alpha1_Expr_CreateList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_CreateList_descriptor,
        new java.lang.String[] { "Elements", "OptionalIndices", });
    internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_descriptor.getNestedTypes().get(4);
    internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_descriptor,
        new java.lang.String[] { "MessageName", "Entries", });
    internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_Entry_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_descriptor.getNestedTypes().get(0);
    internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_CreateStruct_Entry_descriptor,
        new java.lang.String[] { "Id", "FieldKey", "MapKey", "Value", "OptionalEntry", "KeyKind", });
    internal_static_google_api_expr_v1alpha1_Expr_Comprehension_descriptor =
      internal_static_google_api_expr_v1alpha1_Expr_descriptor.getNestedTypes().get(5);
    internal_static_google_api_expr_v1alpha1_Expr_Comprehension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Expr_Comprehension_descriptor,
        new java.lang.String[] { "IterVar", "IterRange", "AccuVar", "AccuInit", "LoopCondition", "LoopStep", "Result", });
    internal_static_google_api_expr_v1alpha1_Constant_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_expr_v1alpha1_Constant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_Constant_descriptor,
        new java.lang.String[] { "NullValue", "BoolValue", "Int64Value", "Uint64Value", "DoubleValue", "StringValue", "BytesValue", "DurationValue", "TimestampValue", "ConstantKind", });
    internal_static_google_api_expr_v1alpha1_SourceInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_expr_v1alpha1_SourceInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_SourceInfo_descriptor,
        new java.lang.String[] { "SyntaxVersion", "Location", "LineOffsets", "Positions", "MacroCalls", });
    internal_static_google_api_expr_v1alpha1_SourceInfo_PositionsEntry_descriptor =
      internal_static_google_api_expr_v1alpha1_SourceInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_api_expr_v1alpha1_SourceInfo_PositionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_SourceInfo_PositionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_expr_v1alpha1_SourceInfo_MacroCallsEntry_descriptor =
      internal_static_google_api_expr_v1alpha1_SourceInfo_descriptor.getNestedTypes().get(1);
    internal_static_google_api_expr_v1alpha1_SourceInfo_MacroCallsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_SourceInfo_MacroCallsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_api_expr_v1alpha1_SourcePosition_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_expr_v1alpha1_SourcePosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_expr_v1alpha1_SourcePosition_descriptor,
        new java.lang.String[] { "Location", "Offset", "Line", "Column", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
