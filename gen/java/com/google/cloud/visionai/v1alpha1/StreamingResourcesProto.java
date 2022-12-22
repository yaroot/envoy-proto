// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1alpha1/streaming_resources.proto

package com.google.cloud.visionai.v1alpha1;

public final class StreamingResourcesProto {
  private StreamingResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_GstreamerBufferDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_GstreamerBufferDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_RawImageDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_RawImageDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_PacketType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_PacketType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_PacketType_TypeDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_PacketType_TypeDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_ServerMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_ServerMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_SeriesMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_SeriesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_PacketHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_PacketHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_visionai_v1alpha1_Packet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_visionai_v1alpha1_Packet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/visionai/v1alpha1/streami" +
      "ng_resources.proto\022\036google.cloud.visiona" +
      "i.v1alpha1\032\037google/api/field_behavior.pr" +
      "oto\032\031google/api/resource.proto\032\036google/p" +
      "rotobuf/duration.proto\032\034google/protobuf/" +
      "struct.proto\032\037google/protobuf/timestamp." +
      "proto\"\317\001\n\031GstreamerBufferDescriptor\022\023\n\013c" +
      "aps_string\030\001 \001(\t\022\024\n\014is_key_frame\030\002 \001(\010\022," +
      "\n\010pts_time\030\003 \001(\0132\032.google.protobuf.Times" +
      "tamp\022,\n\010dts_time\030\004 \001(\0132\032.google.protobuf" +
      ".Timestamp\022+\n\010duration\030\005 \001(\0132\031.google.pr" +
      "otobuf.Duration\"C\n\022RawImageDescriptor\022\016\n" +
      "\006format\030\001 \001(\t\022\016\n\006height\030\002 \001(\005\022\r\n\005width\030\003" +
      " \001(\005\"\333\002\n\nPacketType\022\022\n\ntype_class\030\001 \001(\t\022" +
      "R\n\017type_descriptor\030\002 \001(\01329.google.cloud." +
      "visionai.v1alpha1.PacketType.TypeDescrip" +
      "tor\032\344\001\n\016TypeDescriptor\022`\n\033gstreamer_buff" +
      "er_descriptor\030\002 \001(\01329.google.cloud.visio" +
      "nai.v1alpha1.GstreamerBufferDescriptorH\000" +
      "\022R\n\024raw_image_descriptor\030\003 \001(\01322.google." +
      "cloud.visionai.v1alpha1.RawImageDescript" +
      "orH\000\022\014\n\004type\030\001 \001(\tB\016\n\014type_details\"Q\n\016Se" +
      "rverMetadata\022\016\n\006offset\030\001 \001(\003\022/\n\013ingest_t" +
      "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\"E\n" +
      "\016SeriesMetadata\0223\n\006series\030\001 \001(\tB#\372A \n\036vi" +
      "sionai.googleapis.com/Series\"\206\003\n\014PacketH" +
      "eader\0225\n\014capture_time\030\001 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\004\022@\n\004type\030\002 \001(\0132*.goo" +
      "gle.cloud.visionai.v1alpha1.PacketTypeB\006" +
      "\340A\004\340A\005\022.\n\010metadata\030\003 \001(\0132\027.google.protob" +
      "uf.StructB\003\340A\004\022L\n\017server_metadata\030\004 \001(\0132" +
      "..google.cloud.visionai.v1alpha1.ServerM" +
      "etadataB\003\340A\003\022O\n\017series_metadata\030\005 \001(\0132.." +
      "google.cloud.visionai.v1alpha1.SeriesMet" +
      "adataB\006\340A\004\340A\005\022\022\n\005flags\030\006 \001(\005B\003\340A\005\022\032\n\rtra" +
      "ce_context\030\007 \001(\tB\003\340A\005\"W\n\006Packet\022<\n\006heade" +
      "r\030\001 \001(\0132,.google.cloud.visionai.v1alpha1" +
      ".PacketHeader\022\017\n\007payload\030\002 \001(\014B\355\001\n\"com.g" +
      "oogle.cloud.visionai.v1alpha1B\027Streaming" +
      "ResourcesProtoP\001ZFgoogle.golang.org/genp" +
      "roto/googleapis/cloud/visionai/v1alpha1;" +
      "visionai\252\002\036Google.Cloud.VisionAI.V1Alpha" +
      "1\312\002\036Google\\Cloud\\VisionAI\\V1alpha1\352\002!Goo" +
      "gle::Cloud::VisionAI::V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_visionai_v1alpha1_GstreamerBufferDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_visionai_v1alpha1_GstreamerBufferDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_GstreamerBufferDescriptor_descriptor,
        new java.lang.String[] { "CapsString", "IsKeyFrame", "PtsTime", "DtsTime", "Duration", });
    internal_static_google_cloud_visionai_v1alpha1_RawImageDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_visionai_v1alpha1_RawImageDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_RawImageDescriptor_descriptor,
        new java.lang.String[] { "Format", "Height", "Width", });
    internal_static_google_cloud_visionai_v1alpha1_PacketType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_visionai_v1alpha1_PacketType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_PacketType_descriptor,
        new java.lang.String[] { "TypeClass", "TypeDescriptor", });
    internal_static_google_cloud_visionai_v1alpha1_PacketType_TypeDescriptor_descriptor =
      internal_static_google_cloud_visionai_v1alpha1_PacketType_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_visionai_v1alpha1_PacketType_TypeDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_PacketType_TypeDescriptor_descriptor,
        new java.lang.String[] { "GstreamerBufferDescriptor", "RawImageDescriptor", "Type", "TypeDetails", });
    internal_static_google_cloud_visionai_v1alpha1_ServerMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_visionai_v1alpha1_ServerMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_ServerMetadata_descriptor,
        new java.lang.String[] { "Offset", "IngestTime", });
    internal_static_google_cloud_visionai_v1alpha1_SeriesMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_visionai_v1alpha1_SeriesMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_SeriesMetadata_descriptor,
        new java.lang.String[] { "Series", });
    internal_static_google_cloud_visionai_v1alpha1_PacketHeader_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_visionai_v1alpha1_PacketHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_PacketHeader_descriptor,
        new java.lang.String[] { "CaptureTime", "Type", "Metadata", "ServerMetadata", "SeriesMetadata", "Flags", "TraceContext", });
    internal_static_google_cloud_visionai_v1alpha1_Packet_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_visionai_v1alpha1_Packet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_visionai_v1alpha1_Packet_descriptor,
        new java.lang.String[] { "Header", "Payload", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}