// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storagetransfer/logging/transfer_activity_log.proto

package com.google.storagetransfer.logging;

public interface AzureBlobMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storagetransfer.logging.AzureBlobMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the Azure Blob storage account.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * Required. Name of the Azure Blob storage account.
   * </pre>
   *
   * <code>string account = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * Required. Name of the container.
   * </pre>
   *
   * <code>string container = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The container.
   */
  java.lang.String getContainer();
  /**
   * <pre>
   * Required. Name of the container.
   * </pre>
   *
   * <code>string container = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for container.
   */
  com.google.protobuf.ByteString
      getContainerBytes();

  /**
   * <pre>
   * Required. Name of the blob.
   * </pre>
   *
   * <code>string blob_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The blobName.
   */
  java.lang.String getBlobName();
  /**
   * <pre>
   * Required. Name of the blob.
   * </pre>
   *
   * <code>string blob_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for blobName.
   */
  com.google.protobuf.ByteString
      getBlobNameBytes();

  /**
   * <pre>
   * Last modified time of the blob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_time = 4;</code>
   * @return Whether the lastModifiedTime field is set.
   */
  boolean hasLastModifiedTime();
  /**
   * <pre>
   * Last modified time of the blob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_time = 4;</code>
   * @return The lastModifiedTime.
   */
  com.google.protobuf.Timestamp getLastModifiedTime();
  /**
   * <pre>
   * Last modified time of the blob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_modified_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastModifiedTimeOrBuilder();

  /**
   * <pre>
   * The MD5 checksum of the object's content.
   * </pre>
   *
   * <code>string md5 = 5;</code>
   * @return The md5.
   */
  java.lang.String getMd5();
  /**
   * <pre>
   * The MD5 checksum of the object's content.
   * </pre>
   *
   * <code>string md5 = 5;</code>
   * @return The bytes for md5.
   */
  com.google.protobuf.ByteString
      getMd5Bytes();

  /**
   * <pre>
   * Required. Size of the blob in bytes.
   * </pre>
   *
   * <code>int64 size = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The size.
   */
  long getSize();
}