// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storagetransfer/logging/transfer_activity_log.proto

package com.google.storagetransfer.logging;

public final class TransferActivityLogProto {
  private TransferActivityLogProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_AwsS3ObjectMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_AwsS3ObjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_GcsObjectMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_GcsObjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_GcsBucketMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_GcsBucketMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_AzureBlobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_AzureBlobMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_AzureBlobContainerMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_AzureBlobContainerMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_PosixFileMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_PosixFileMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_HttpFileMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_HttpFileMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_HttpManifestMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_HttpManifestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_ObjectMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_ObjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_ContainerMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_ContainerMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_TransferActivityLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_TransferActivityLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_storagetransfer_logging_TransferActivityLog_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_storagetransfer_logging_TransferActivityLog_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/storagetransfer/logging/transfe" +
      "r_activity_log.proto\022\036google.storagetran" +
      "sfer.logging\032\037google/api/field_behavior." +
      "proto\032\037google/protobuf/timestamp.proto\"\233" +
      "\001\n\023AwsS3ObjectMetadata\022\023\n\006bucket\030\001 \001(\tB\003" +
      "\340A\002\022\027\n\nobject_key\030\002 \001(\tB\003\340A\002\0226\n\022last_mod" +
      "ified_time\030\003 \001(\0132\032.google.protobuf.Times" +
      "tamp\022\013\n\003md5\030\004 \001(\t\022\021\n\004size\030\005 \001(\003B\003\340A\002\"8\n\023" +
      "AwsS3BucketMetadata\022\023\n\006bucket\030\001 \001(\tB\003\340A\002" +
      "\022\014\n\004path\030\002 \001(\t\"\251\001\n\021GcsObjectMetadata\022\023\n\006" +
      "bucket\030\001 \001(\tB\003\340A\002\022\027\n\nobject_key\030\002 \001(\tB\003\340" +
      "A\002\0226\n\022last_modified_time\030\003 \001(\0132\032.google." +
      "protobuf.Timestamp\022\013\n\003md5\030\004 \001(\t\022\016\n\006crc32" +
      "c\030\005 \001(\t\022\021\n\004size\030\006 \001(\003B\003\340A\002\"6\n\021GcsBucketM" +
      "etadata\022\023\n\006bucket\030\001 \001(\tB\003\340A\002\022\014\n\004path\030\002 \001" +
      "(\t\"\261\001\n\021AzureBlobMetadata\022\024\n\007account\030\001 \001(" +
      "\tB\003\340A\002\022\026\n\tcontainer\030\002 \001(\tB\003\340A\002\022\026\n\tblob_n" +
      "ame\030\003 \001(\tB\003\340A\002\0226\n\022last_modified_time\030\004 \001" +
      "(\0132\032.google.protobuf.Timestamp\022\013\n\003md5\030\005 " +
      "\001(\t\022\021\n\004size\030\006 \001(\003B\003\340A\002\"X\n\032AzureBlobConta" +
      "inerMetadata\022\024\n\007account\030\001 \001(\tB\003\340A\002\022\026\n\tco" +
      "ntainer\030\002 \001(\tB\003\340A\002\022\014\n\004path\030\003 \001(\t\"\201\001\n\021Pos" +
      "ixFileMetadata\022\021\n\004path\030\001 \001(\tB\003\340A\002\0226\n\022las" +
      "t_modified_time\030\002 \001(\0132\032.google.protobuf." +
      "Timestamp\022\016\n\006crc32c\030\003 \001(\t\022\021\n\004size\030\004 \001(\003B" +
      "\003\340A\002\"?\n\020HttpFileMetadata\022\020\n\003url\030\001 \001(\tB\003\340" +
      "A\002\022\013\n\003md5\030\002 \001(\t\022\014\n\004size\030\003 \001(\003\"(\n\024HttpMan" +
      "ifestMetadata\022\020\n\003url\030\001 \001(\tB\003\340A\002\"\322\003\n\016Obje" +
      "ctMetadata\022D\n\004type\030\001 \001(\01621.google.storag" +
      "etransfer.logging.StorageSystemTypeB\003\340A\002" +
      "\022L\n\raws_s3_object\030\003 \001(\01323.google.storage" +
      "transfer.logging.AwsS3ObjectMetadataH\000\022G" +
      "\n\nazure_blob\030\004 \001(\01321.google.storagetrans" +
      "fer.logging.AzureBlobMetadataH\000\022G\n\ngcs_o" +
      "bject\030\005 \001(\01321.google.storagetransfer.log" +
      "ging.GcsObjectMetadataH\000\022G\n\nposix_file\030\006" +
      " \001(\01321.google.storagetransfer.logging.Po" +
      "sixFileMetadataH\000\022E\n\thttp_file\030\007 \001(\01320.g" +
      "oogle.storagetransfer.logging.HttpFileMe" +
      "tadataH\000B\n\n\010metadata\"\365\003\n\021ContainerMetada" +
      "ta\022D\n\004type\030\001 \001(\01621.google.storagetransfe" +
      "r.logging.StorageSystemTypeB\003\340A\002\022L\n\raws_" +
      "s3_bucket\030\003 \001(\01323.google.storagetransfer" +
      ".logging.AwsS3BucketMetadataH\000\022Z\n\024azure_" +
      "blob_container\030\004 \001(\0132:.google.storagetra" +
      "nsfer.logging.AzureBlobContainerMetadata" +
      "H\000\022G\n\ngcs_bucket\030\005 \001(\01321.google.storaget" +
      "ransfer.logging.GcsBucketMetadataH\000\022L\n\017p" +
      "osix_directory\030\006 \001(\01321.google.storagetra" +
      "nsfer.logging.PosixFileMetadataH\000\022M\n\rhtt" +
      "p_manifest\030\007 \001(\01324.google.storagetransfe" +
      "r.logging.HttpManifestMetadataH\000B\n\n\010meta" +
      "data\"\312\005\n\023TransferActivityLog\022\026\n\toperatio" +
      "n\030\001 \001(\tB\003\340A\002\022O\n\006action\030\002 \001(\0162:.google.st" +
      "oragetransfer.logging.TransferActivityLo" +
      "g.ActionB\003\340A\002\022O\n\006status\030\003 \001(\0132:.google.s" +
      "toragetransfer.logging.TransferActivityL" +
      "og.StatusB\003\340A\002\022K\n\020source_container\030\004 \001(\013" +
      "21.google.storagetransfer.logging.Contai" +
      "nerMetadata\022P\n\025destination_container\030\005 \001" +
      "(\01321.google.storagetransfer.logging.Cont" +
      "ainerMetadata\022E\n\rsource_object\030\006 \001(\0132..g" +
      "oogle.storagetransfer.logging.ObjectMeta" +
      "data\022J\n\022destination_object\030\007 \001(\0132..googl" +
      "e.storagetransfer.logging.ObjectMetadata" +
      "\0226\n\rcomplete_time\030\010 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\002\032M\n\006Status\022\030\n\013status_cod" +
      "e\030\001 \001(\tB\003\340A\002\022\022\n\nerror_type\030\002 \001(\t\022\025\n\rerro" +
      "r_message\030\003 \001(\t\"@\n\006Action\022\026\n\022ACTION_UNSP" +
      "ECIFIED\020\000\022\010\n\004FIND\020\001\022\010\n\004COPY\020\002\022\n\n\006DELETE\020" +
      "\003*u\n\021StorageSystemType\022#\n\037STORAGE_SYSTEM" +
      "_TYPE_UNSPECIFIED\020\000\022\n\n\006AWS_S3\020\001\022\016\n\nAZURE" +
      "_BLOB\020\002\022\007\n\003GCS\020\003\022\014\n\010POSIX_FS\020\004\022\010\n\004HTTP\020\005" +
      "B\354\001\n\"com.google.storagetransfer.loggingB" +
      "\030TransferActivityLogProtoP\001ZEgoogle.gola" +
      "ng.org/genproto/googleapis/storagetransf" +
      "er/logging;logging\252\002\036Google.StorageTrans" +
      "fer.Logging\312\002\036Google\\StorageTransfer\\Log" +
      "ging\352\002 Google::StorageTransfer::Loggingb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_storagetransfer_logging_AwsS3ObjectMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_storagetransfer_logging_AwsS3ObjectMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_AwsS3ObjectMetadata_descriptor,
        new java.lang.String[] { "Bucket", "ObjectKey", "LastModifiedTime", "Md5", "Size", });
    internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_AwsS3BucketMetadata_descriptor,
        new java.lang.String[] { "Bucket", "Path", });
    internal_static_google_storagetransfer_logging_GcsObjectMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_storagetransfer_logging_GcsObjectMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_GcsObjectMetadata_descriptor,
        new java.lang.String[] { "Bucket", "ObjectKey", "LastModifiedTime", "Md5", "Crc32C", "Size", });
    internal_static_google_storagetransfer_logging_GcsBucketMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_storagetransfer_logging_GcsBucketMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_GcsBucketMetadata_descriptor,
        new java.lang.String[] { "Bucket", "Path", });
    internal_static_google_storagetransfer_logging_AzureBlobMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_storagetransfer_logging_AzureBlobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_AzureBlobMetadata_descriptor,
        new java.lang.String[] { "Account", "Container", "BlobName", "LastModifiedTime", "Md5", "Size", });
    internal_static_google_storagetransfer_logging_AzureBlobContainerMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_storagetransfer_logging_AzureBlobContainerMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_AzureBlobContainerMetadata_descriptor,
        new java.lang.String[] { "Account", "Container", "Path", });
    internal_static_google_storagetransfer_logging_PosixFileMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_storagetransfer_logging_PosixFileMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_PosixFileMetadata_descriptor,
        new java.lang.String[] { "Path", "LastModifiedTime", "Crc32C", "Size", });
    internal_static_google_storagetransfer_logging_HttpFileMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_storagetransfer_logging_HttpFileMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_HttpFileMetadata_descriptor,
        new java.lang.String[] { "Url", "Md5", "Size", });
    internal_static_google_storagetransfer_logging_HttpManifestMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_storagetransfer_logging_HttpManifestMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_HttpManifestMetadata_descriptor,
        new java.lang.String[] { "Url", });
    internal_static_google_storagetransfer_logging_ObjectMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_storagetransfer_logging_ObjectMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_ObjectMetadata_descriptor,
        new java.lang.String[] { "Type", "AwsS3Object", "AzureBlob", "GcsObject", "PosixFile", "HttpFile", "Metadata", });
    internal_static_google_storagetransfer_logging_ContainerMetadata_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_storagetransfer_logging_ContainerMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_ContainerMetadata_descriptor,
        new java.lang.String[] { "Type", "AwsS3Bucket", "AzureBlobContainer", "GcsBucket", "PosixDirectory", "HttpManifest", "Metadata", });
    internal_static_google_storagetransfer_logging_TransferActivityLog_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_storagetransfer_logging_TransferActivityLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_TransferActivityLog_descriptor,
        new java.lang.String[] { "Operation", "Action", "Status", "SourceContainer", "DestinationContainer", "SourceObject", "DestinationObject", "CompleteTime", });
    internal_static_google_storagetransfer_logging_TransferActivityLog_Status_descriptor =
      internal_static_google_storagetransfer_logging_TransferActivityLog_descriptor.getNestedTypes().get(0);
    internal_static_google_storagetransfer_logging_TransferActivityLog_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_storagetransfer_logging_TransferActivityLog_Status_descriptor,
        new java.lang.String[] { "StatusCode", "ErrorType", "ErrorMessage", });
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
