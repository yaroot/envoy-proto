// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/audit_data.proto

package com.google.appengine.v1beta;

public final class AuditDataProto {
  private AuditDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_AuditData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_AuditData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_UpdateServiceMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_UpdateServiceMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_CreateVersionMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_CreateVersionMethod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/appengine/v1beta/audit_data.pro" +
      "to\022\027google.appengine.v1beta\032\'google/appe" +
      "ngine/v1beta/appengine.proto\"\245\001\n\tAuditDa" +
      "ta\022F\n\016update_service\030\001 \001(\0132,.google.appe" +
      "ngine.v1beta.UpdateServiceMethodH\000\022F\n\016cr" +
      "eate_version\030\002 \001(\0132,.google.appengine.v1" +
      "beta.CreateVersionMethodH\000B\010\n\006method\"U\n\023" +
      "UpdateServiceMethod\022>\n\007request\030\001 \001(\0132-.g" +
      "oogle.appengine.v1beta.UpdateServiceRequ" +
      "est\"U\n\023CreateVersionMethod\022>\n\007request\030\001 " +
      "\001(\0132-.google.appengine.v1beta.CreateVers" +
      "ionRequestB\324\001\n\033com.google.appengine.v1be" +
      "taB\016AuditDataProtoP\001Z@google.golang.org/" +
      "genproto/googleapis/appengine/v1beta;app" +
      "engine\252\002\035Google.Cloud.AppEngine.V1Beta\312\002" +
      "\035Google\\Cloud\\AppEngine\\V1beta\352\002 Google:" +
      ":Cloud::AppEngine::V1betab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.appengine.v1beta.AppengineProto.getDescriptor(),
        });
    internal_static_google_appengine_v1beta_AuditData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1beta_AuditData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_AuditData_descriptor,
        new java.lang.String[] { "UpdateService", "CreateVersion", "Method", });
    internal_static_google_appengine_v1beta_UpdateServiceMethod_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1beta_UpdateServiceMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_UpdateServiceMethod_descriptor,
        new java.lang.String[] { "Request", });
    internal_static_google_appengine_v1beta_CreateVersionMethod_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1beta_CreateVersionMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_CreateVersionMethod_descriptor,
        new java.lang.String[] { "Request", });
    com.google.appengine.v1beta.AppengineProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
