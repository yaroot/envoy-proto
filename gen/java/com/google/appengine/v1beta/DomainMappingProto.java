// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/domain_mapping.proto

package com.google.appengine.v1beta;

public final class DomainMappingProto {
  private DomainMappingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_DomainMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_DomainMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_SslSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_SslSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_ResourceRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_ResourceRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/appengine/v1beta/domain_mapping" +
      ".proto\022\027google.appengine.v1beta\"\250\001\n\rDoma" +
      "inMapping\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022:\n\014s" +
      "sl_settings\030\003 \001(\0132$.google.appengine.v1b" +
      "eta.SslSettings\022A\n\020resource_records\030\004 \003(" +
      "\0132\'.google.appengine.v1beta.ResourceReco" +
      "rd\"\322\001\n\013SslSettings\022\026\n\016certificate_id\030\001 \001" +
      "(\t\022S\n\023ssl_management_type\030\003 \001(\01626.google" +
      ".appengine.v1beta.SslSettings.SslManagem" +
      "entType\022&\n\036pending_managed_certificate_i" +
      "d\030\004 \001(\t\".\n\021SslManagementType\022\r\n\tAUTOMATI" +
      "C\020\000\022\n\n\006MANUAL\020\001\"\232\001\n\016ResourceRecord\022\014\n\004na" +
      "me\030\001 \001(\t\022\016\n\006rrdata\030\002 \001(\t\022@\n\004type\030\003 \001(\01622" +
      ".google.appengine.v1beta.ResourceRecord." +
      "RecordType\"(\n\nRecordType\022\005\n\001A\020\000\022\010\n\004AAAA\020" +
      "\001\022\t\n\005CNAME\020\002B\330\001\n\033com.google.appengine.v1" +
      "betaB\022DomainMappingProtoP\001Z@google.golan" +
      "g.org/genproto/googleapis/appengine/v1be" +
      "ta;appengine\252\002\035Google.Cloud.AppEngine.V1" +
      "Beta\312\002\035Google\\Cloud\\AppEngine\\V1beta\352\002 G" +
      "oogle::Cloud::AppEngine::V1betab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_appengine_v1beta_DomainMapping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1beta_DomainMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_DomainMapping_descriptor,
        new java.lang.String[] { "Name", "Id", "SslSettings", "ResourceRecords", });
    internal_static_google_appengine_v1beta_SslSettings_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1beta_SslSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_SslSettings_descriptor,
        new java.lang.String[] { "CertificateId", "SslManagementType", "PendingManagedCertificateId", });
    internal_static_google_appengine_v1beta_ResourceRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1beta_ResourceRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_ResourceRecord_descriptor,
        new java.lang.String[] { "Name", "Rrdata", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}