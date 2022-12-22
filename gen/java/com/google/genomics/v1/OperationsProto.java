// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/operations.proto

package com.google.genomics.v1;

public final class OperationsProto {
  private OperationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_OperationMetadata_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_OperationMetadata_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_genomics_v1_OperationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_genomics_v1_OperationEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#google/genomics/v1/operations.proto\022\022g" +
      "oogle.genomics.v1\032\034google/api/annotation" +
      "s.proto\032\031google/protobuf/any.proto\032\037goog" +
      "le/protobuf/timestamp.proto\"\306\003\n\021Operatio" +
      "nMetadata\022\022\n\nproject_id\030\001 \001(\t\022/\n\013create_" +
      "time\030\002 \001(\0132\032.google.protobuf.Timestamp\022." +
      "\n\nstart_time\030\003 \001(\0132\032.google.protobuf.Tim" +
      "estamp\022,\n\010end_time\030\004 \001(\0132\032.google.protob" +
      "uf.Timestamp\022%\n\007request\030\005 \001(\0132\024.google.p" +
      "rotobuf.Any\0222\n\006events\030\006 \003(\0132\".google.gen" +
      "omics.v1.OperationEvent\022\021\n\tclient_id\030\007 \001" +
      "(\t\022.\n\020runtime_metadata\030\010 \001(\0132\024.google.pr" +
      "otobuf.Any\022A\n\006labels\030\t \003(\01321.google.geno" +
      "mics.v1.OperationMetadata.LabelsEntry\032-\n" +
      "\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      ":\0028\001\"\203\001\n\016OperationEvent\022.\n\nstart_time\030\001 " +
      "\001(\0132\032.google.protobuf.Timestamp\022,\n\010end_t" +
      "ime\030\002 \001(\0132\032.google.protobuf.Timestamp\022\023\n" +
      "\013description\030\003 \001(\tBj\n\026com.google.genomic" +
      "s.v1B\017OperationsProtoP\001Z:google.golang.o" +
      "rg/genproto/googleapis/genomics/v1;genom" +
      "ics\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_genomics_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_genomics_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "ProjectId", "CreateTime", "StartTime", "EndTime", "Request", "Events", "ClientId", "RuntimeMetadata", "Labels", });
    internal_static_google_genomics_v1_OperationMetadata_LabelsEntry_descriptor =
      internal_static_google_genomics_v1_OperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_genomics_v1_OperationMetadata_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_OperationMetadata_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_genomics_v1_OperationEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_genomics_v1_OperationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_genomics_v1_OperationEvent_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Description", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}