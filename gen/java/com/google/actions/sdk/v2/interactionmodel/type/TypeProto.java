// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/interactionmodel/type/type.proto

package com.google.actions.sdk.v2.interactionmodel.type;

public final class TypeProto {
  private TypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_actions_sdk_v2_interactionmodel_type_Type_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_actions_sdk_v2_interactionmodel_type_Type_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/actions/sdk/v2/interactionmodel" +
      "/type/type.proto\022+google.actions.sdk.v2." +
      "interactionmodel.type\032@google/actions/sd" +
      "k/v2/interactionmodel/type/free_text_typ" +
      "e.proto\032Igoogle/actions/sdk/v2/interacti" +
      "onmodel/type/regular_expression_type.pro" +
      "to\032>google/actions/sdk/v2/interactionmod" +
      "el/type/synonym_type.proto\"\245\002\n\004Type\022K\n\007s" +
      "ynonym\030\001 \001(\01328.google.actions.sdk.v2.int" +
      "eractionmodel.type.SynonymTypeH\000\022`\n\022regu" +
      "lar_expression\030\002 \001(\0132B.google.actions.sd" +
      "k.v2.interactionmodel.type.RegularExpres" +
      "sionTypeH\000\022N\n\tfree_text\030\003 \001(\01329.google.a" +
      "ctions.sdk.v2.interactionmodel.type.Free" +
      "TextTypeH\000\022\022\n\nexclusions\030\004 \003(\tB\n\n\010sub_ty" +
      "peB\212\001\n/com.google.actions.sdk.v2.interac" +
      "tionmodel.typeB\tTypeProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/actions/sdk/v" +
      "2/interactionmodel/typeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.getDescriptor(),
          com.google.actions.sdk.v2.interactionmodel.type.RegularExpressionTypeProto.getDescriptor(),
          com.google.actions.sdk.v2.interactionmodel.type.SynonymTypeProto.getDescriptor(),
        });
    internal_static_google_actions_sdk_v2_interactionmodel_type_Type_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_actions_sdk_v2_interactionmodel_type_Type_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_actions_sdk_v2_interactionmodel_type_Type_descriptor,
        new java.lang.String[] { "Synonym", "RegularExpression", "FreeText", "Exclusions", "SubType", });
    com.google.actions.sdk.v2.interactionmodel.type.FreeTextTypeProto.getDescriptor();
    com.google.actions.sdk.v2.interactionmodel.type.RegularExpressionTypeProto.getDescriptor();
    com.google.actions.sdk.v2.interactionmodel.type.SynonymTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}