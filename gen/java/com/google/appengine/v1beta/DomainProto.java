// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/domain.proto

package com.google.appengine.v1beta;

public final class DomainProto {
  private DomainProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_AuthorizedDomain_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_AuthorizedDomain_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$google/appengine/v1beta/domain.proto\022\027" +
      "google.appengine.v1beta\",\n\020AuthorizedDom" +
      "ain\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\tB\321\001\n\033com.go" +
      "ogle.appengine.v1betaB\013DomainProtoP\001Z@go" +
      "ogle.golang.org/genproto/googleapis/appe" +
      "ngine/v1beta;appengine\252\002\035Google.Cloud.Ap" +
      "pEngine.V1Beta\312\002\035Google\\Cloud\\AppEngine\\" +
      "V1beta\352\002 Google::Cloud::AppEngine::V1bet" +
      "ab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_appengine_v1beta_AuthorizedDomain_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1beta_AuthorizedDomain_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_AuthorizedDomain_descriptor,
        new java.lang.String[] { "Name", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}