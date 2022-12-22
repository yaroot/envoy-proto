// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/common.proto

package com.google.cloud.visionai.v1alpha1;

public final class CommonProto {
  private CommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_Cluster_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_Cluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_Cluster_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_Cluster_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_Cluster_AnnotationsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_Cluster_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_GcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_GcsSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/visionai/v1alpha1/common." +
      "proto\022\036google.cloud.visionai.v1alpha1\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\032\037google/protobuf/times" +
      "tamp.proto\"\276\005\n\007Cluster\022\021\n\004name\030\001 \001(\tB\003\340A" +
      "\003\0224\n\013create_time\030\002 \001(\0132\032.google.protobuf" +
      ".TimestampB\003\340A\003\0224\n\013update_time\030\003 \001(\0132\032.g" +
      "oogle.protobuf.TimestampB\003\340A\003\022C\n\006labels\030" +
      "\004 \003(\01323.google.cloud.visionai.v1alpha1.C" +
      "luster.LabelsEntry\022M\n\013annotations\030\005 \003(\0132" +
      "8.google.cloud.visionai.v1alpha1.Cluster" +
      ".AnnotationsEntry\022\'\n\032dataplane_service_e" +
      "ndpoint\030\006 \001(\tB\003\340A\003\022A\n\005state\030\007 \001(\0162-.goog" +
      "le.cloud.visionai.v1alpha1.Cluster.State" +
      "B\003\340A\003\022\027\n\npsc_target\030\010 \001(\tB\003\340A\003\032-\n\013Labels" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0322\n" +
      "\020AnnotationsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030" +
      "\002 \001(\t:\0028\001\"V\n\005State\022\025\n\021STATE_UNSPECIFIED\020" +
      "\000\022\020\n\014PROVISIONING\020\001\022\013\n\007RUNNING\020\002\022\014\n\010STOP" +
      "PING\020\003\022\t\n\005ERROR\020\004:`\352A]\n\037visionai.googlea" +
      "pis.com/Cluster\022:projects/{project}/loca" +
      "tions/{location}/clusters/{cluster}\"\200\002\n\021" +
      "OperationMetadata\0224\n\013create_time\030\001 \001(\0132\032" +
      ".google.protobuf.TimestampB\003\340A\003\0221\n\010end_t" +
      "ime\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340" +
      "A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A\003\022#\n\026reque" +
      "sted_cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013api_vers" +
      "ion\030\007 \001(\tB\003\340A\003\"\036\n\tGcsSource\022\021\n\004uris\030\001 \003(" +
      "\tB\003\340A\002B\341\001\n\"com.google.cloud.visionai.v1a" +
      "lpha1B\013CommonProtoP\001ZFgoogle.golang.org/" +
      "genproto/googleapis/cloud/visionai/v1alp" +
      "ha1;visionai\252\002\036Google.Cloud.VisionAI.V1A" +
      "lpha1\312\002\036Google\\Cloud\\VisionAI\\V1alpha1\352\002" +
      "!Google::Cloud::VisionAI::V1alpha1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_visionai_v1alpha1_Cluster_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_visionai_v1alpha1_Cluster_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_Cluster_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Labels", "Annotations", "DataplaneServiceEndpoint", "State", "PscTarget", });
    internal_static_google_cloud_visionai_v1alpha1_Cluster_LabelsEntry_descriptor =
      internal_static_google_cloud_visionai_v1alpha1_Cluster_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_visionai_v1alpha1_Cluster_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_Cluster_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_visionai_v1alpha1_Cluster_AnnotationsEntry_descriptor =
      internal_static_google_cloud_visionai_v1alpha1_Cluster_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_visionai_v1alpha1_Cluster_AnnotationsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_Cluster_AnnotationsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_visionai_v1alpha1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_visionai_v1alpha1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusMessage", "RequestedCancellation", "ApiVersion", });
    internal_static_google_cloud_visionai_v1alpha1_GcsSource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_visionai_v1alpha1_GcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_GcsSource_descriptor,
        new java.lang.String[] { "Uris", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}