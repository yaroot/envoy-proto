// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/integrations/v1alpha/event_parameter.proto

package com.google.cloud.integrations.v1alpha;

public final class EventParameterProto {
  private EventParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_integrations_v1alpha_EventParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_integrations_v1alpha_EventParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/integrations/v1alpha/even" +
      "t_parameter.proto\022!google.cloud.integrat" +
      "ions.v1alpha\0322google/cloud/integrations/" +
      "v1alpha/value_type.proto\"Z\n\016EventParamet" +
      "er\022\013\n\003key\030\001 \001(\t\022;\n\005value\030\002 \001(\0132,.google." +
      "cloud.integrations.v1alpha.ValueTypeB\215\001\n" +
      "%com.google.cloud.integrations.v1alphaB\023" +
      "EventParameterProtoP\001ZMgoogle.golang.org" +
      "/genproto/googleapis/cloud/integrations/" +
      "v1alpha;integrationsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.integrations.v1alpha.ValueTypeProto.getDescriptor(),
        });
    internal_static_google_cloud_integrations_v1alpha_EventParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_integrations_v1alpha_EventParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_integrations_v1alpha_EventParameter_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.cloud.integrations.v1alpha.ValueTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}