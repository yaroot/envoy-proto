// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1beta1/location.proto

package com.google.firestore.admin.v1beta1;

public final class LocationProto {
  private LocationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_firestore_admin_v1beta1_LocationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_admin_v1beta1_LocationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/firestore/admin/v1beta1/locatio" +
      "n.proto\022\036google.firestore.admin.v1beta1\032" +
      "\030google/type/latlng.proto\032\034google/api/an" +
      "notations.proto\"\022\n\020LocationMetadataB\250\001\n\"" +
      "com.google.firestore.admin.v1beta1B\rLoca" +
      "tionProtoP\001ZCgoogle.golang.org/genproto/" +
      "googleapis/firestore/admin/v1beta1;admin" +
      "\242\002\004GCFS\252\002$Google.Cloud.Firestore.Admin.V" +
      "1Beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.type.LatLngProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_firestore_admin_v1beta1_LocationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_admin_v1beta1_LocationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_firestore_admin_v1beta1_LocationMetadata_descriptor,
        new java.lang.String[] { });
    com.google.type.LatLngProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}