// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1beta/network_settings.proto

package com.google.appengine.v1beta;

public final class NetworkSettingsProto {
  private NetworkSettingsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1beta_NetworkSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1beta_NetworkSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/appengine/v1beta/network_settin" +
      "gs.proto\022\027google.appengine.v1beta\"\256\002\n\017Ne" +
      "tworkSettings\022_\n\027ingress_traffic_allowed" +
      "\030\001 \001(\0162>.google.appengine.v1beta.Network" +
      "Settings.IngressTrafficAllowed\"\271\001\n\025Ingre" +
      "ssTrafficAllowed\022\'\n#INGRESS_TRAFFIC_ALLO" +
      "WED_UNSPECIFIED\020\000\022\037\n\033INGRESS_TRAFFIC_ALL" +
      "OWED_ALL\020\001\022)\n%INGRESS_TRAFFIC_ALLOWED_IN" +
      "TERNAL_ONLY\020\002\022+\n\'INGRESS_TRAFFIC_ALLOWED" +
      "_INTERNAL_AND_LB\020\003B\332\001\n\033com.google.appeng" +
      "ine.v1betaB\024NetworkSettingsProtoP\001Z@goog" +
      "le.golang.org/genproto/googleapis/appeng" +
      "ine/v1beta;appengine\252\002\035Google.Cloud.AppE" +
      "ngine.V1Beta\312\002\035Google\\Cloud\\AppEngine\\V1" +
      "beta\352\002 Google::Cloud::AppEngine::V1betab" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_appengine_v1beta_NetworkSettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1beta_NetworkSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1beta_NetworkSettings_descriptor,
        new java.lang.String[] { "IngressTrafficAllowed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}