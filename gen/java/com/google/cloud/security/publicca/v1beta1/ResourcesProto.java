// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/security/publicca/v1beta1/resources.proto

package com.google.cloud.security.publicca.v1beta1;

public final class ResourcesProto {
  private ResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/security/publicca/v1beta1" +
      "/resources.proto\022&google.cloud.security." +
      "publicca.v1beta1\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\335\001\n" +
      "\022ExternalAccountKey\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\023" +
      "\n\006key_id\030\002 \001(\tB\003\340A\003\022\030\n\013b64_mac_key\030\003 \001(\014" +
      "B\003\340A\003:\204\001\352A\200\001\n*publicca.googleapis.com/Ex" +
      "ternalAccountKey\022Rprojects/{project}/loc" +
      "ations/{location}/externalAccountKeys/{e" +
      "xternal_account_key}B\220\002\n*com.google.clou" +
      "d.security.publicca.v1beta1B\016ResourcesPr" +
      "otoP\001ZNgoogle.golang.org/genproto/google" +
      "apis/cloud/security/publicca/v1beta1;pub" +
      "licca\370\001\001\252\002&Google.Cloud.Security.PublicC" +
      "A.V1Beta1\312\002&Google\\Cloud\\Security\\Public" +
      "CA\\V1beta1\352\002*Google::Cloud::Security::Pu" +
      "blicCA::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_security_publicca_v1beta1_ExternalAccountKey_descriptor,
        new java.lang.String[] { "Name", "KeyId", "B64MacKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}