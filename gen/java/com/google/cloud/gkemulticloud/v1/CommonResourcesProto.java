// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/common_resources.proto

package com.google.cloud.gkemulticloud.v1;

public final class CommonResourcesProto {
  private CommonResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_NodeTaint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_NodeTaint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_Fleet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_Fleet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_MonitoringConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_MonitoringConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_gkemulticloud_v1_ManagedPrometheusConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkemulticloud_v1_ManagedPrometheusConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/gkemulticloud/v1/common_r" +
      "esources.proto\022\035google.cloud.gkemulticlo" +
      "ud.v1\032\037google/api/field_behavior.proto\032\037" +
      "google/protobuf/timestamp.proto\"^\n\026Workl" +
      "oadIdentityConfig\022\022\n\nissuer_uri\030\001 \001(\t\022\025\n" +
      "\rworkload_pool\030\002 \001(\t\022\031\n\021identity_provide" +
      "r\030\003 \001(\t\"3\n\021MaxPodsConstraint\022\036\n\021max_pods" +
      "_per_node\030\001 \001(\003B\003\340A\002\"\200\002\n\021OperationMetada" +
      "ta\0224\n\013create_time\030\001 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.goo" +
      "gle.protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 " +
      "\001(\tB\003\340A\003\022\032\n\rstatus_detail\030\004 \001(\tB\003\340A\003\022\031\n\014" +
      "error_detail\030\005 \001(\tB\003\340A\003\022\021\n\004verb\030\007 \001(\tB\003\340" +
      "A\003\022#\n\026requested_cancellation\030\006 \001(\010B\003\340A\003\"" +
      "\322\001\n\tNodeTaint\022\020\n\003key\030\001 \001(\tB\003\340A\002\022\022\n\005value" +
      "\030\002 \001(\tB\003\340A\002\022D\n\006effect\030\003 \001(\0162/.google.clo" +
      "ud.gkemulticloud.v1.NodeTaint.EffectB\003\340A" +
      "\002\"Y\n\006Effect\022\026\n\022EFFECT_UNSPECIFIED\020\000\022\017\n\013N" +
      "O_SCHEDULE\020\001\022\026\n\022PREFER_NO_SCHEDULE\020\002\022\016\n\n" +
      "NO_EXECUTE\020\003\"6\n\005Fleet\022\024\n\007project\030\001 \001(\tB\003" +
      "\340A\002\022\027\n\nmembership\030\002 \001(\tB\003\340A\003\"`\n\rLoggingC" +
      "onfig\022O\n\020component_config\030\001 \001(\01325.google" +
      ".cloud.gkemulticloud.v1.LoggingComponent" +
      "Config\"\302\001\n\026LoggingComponentConfig\022Z\n\021ena" +
      "ble_components\030\001 \003(\0162?.google.cloud.gkem" +
      "ulticloud.v1.LoggingComponentConfig.Comp" +
      "onent\"L\n\tComponent\022\031\n\025COMPONENT_UNSPECIF" +
      "IED\020\000\022\025\n\021SYSTEM_COMPONENTS\020\001\022\r\n\tWORKLOAD" +
      "S\020\002\"m\n\020MonitoringConfig\022Y\n\031managed_prome" +
      "theus_config\030\002 \001(\01326.google.cloud.gkemul" +
      "ticloud.v1.ManagedPrometheusConfig\"*\n\027Ma" +
      "nagedPrometheusConfig\022\017\n\007enabled\030\001 \001(\010B\352" +
      "\001\n!com.google.cloud.gkemulticloud.v1B\024Co" +
      "mmonResourcesProtoP\001ZJgoogle.golang.org/" +
      "genproto/googleapis/cloud/gkemulticloud/" +
      "v1;gkemulticloud\252\002\035Google.Cloud.GkeMulti" +
      "Cloud.V1\312\002\035Google\\Cloud\\GkeMultiCloud\\V1" +
      "\352\002 Google::Cloud::GkeMultiCloud::V1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_WorkloadIdentityConfig_descriptor,
        new java.lang.String[] { "IssuerUri", "WorkloadPool", "IdentityProvider", });
    internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_MaxPodsConstraint_descriptor,
        new java.lang.String[] { "MaxPodsPerNode", });
    internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "StatusDetail", "ErrorDetail", "Verb", "RequestedCancellation", });
    internal_static_google_cloud_gkemulticloud_v1_NodeTaint_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkemulticloud_v1_NodeTaint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_NodeTaint_descriptor,
        new java.lang.String[] { "Key", "Value", "Effect", });
    internal_static_google_cloud_gkemulticloud_v1_Fleet_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkemulticloud_v1_Fleet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_Fleet_descriptor,
        new java.lang.String[] { "Project", "Membership", });
    internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_LoggingConfig_descriptor,
        new java.lang.String[] { "ComponentConfig", });
    internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_LoggingComponentConfig_descriptor,
        new java.lang.String[] { "EnableComponents", });
    internal_static_google_cloud_gkemulticloud_v1_MonitoringConfig_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gkemulticloud_v1_MonitoringConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_MonitoringConfig_descriptor,
        new java.lang.String[] { "ManagedPrometheusConfig", });
    internal_static_google_cloud_gkemulticloud_v1_ManagedPrometheusConfig_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gkemulticloud_v1_ManagedPrometheusConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_gkemulticloud_v1_ManagedPrometheusConfig_descriptor,
        new java.lang.String[] { "Enabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}