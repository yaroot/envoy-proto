// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/env_var.proto

package com.google.cloud.aiplatform.v1;

public final class EnvVarProto {
  private EnvVarProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_EnvVar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_EnvVar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/env_var.pro" +
      "to\022\032google.cloud.aiplatform.v1\032\037google/a" +
      "pi/field_behavior.proto\"/\n\006EnvVar\022\021\n\004nam" +
      "e\030\001 \001(\tB\003\340A\002\022\022\n\005value\030\002 \001(\tB\003\340A\002B\317\001\n\036com" +
      ".google.cloud.aiplatform.v1B\013EnvVarProto" +
      "P\001ZDgoogle.golang.org/genproto/googleapi" +
      "s/cloud/aiplatform/v1;aiplatform\252\002\032Googl" +
      "e.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIP" +
      "latform\\V1\352\002\035Google::Cloud::AIPlatform::" +
      "V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_EnvVar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_EnvVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_EnvVar_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
