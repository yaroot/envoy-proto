// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

package com.google.storage.v2;

public interface StartResumableWriteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.StartResumableWriteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The upload_id of the newly started resumable write operation. This
   * value should be copied into the `WriteObjectRequest.upload_id` field.
   * </pre>
   *
   * <code>string upload_id = 1;</code>
   * @return The uploadId.
   */
  java.lang.String getUploadId();
  /**
   * <pre>
   * The upload_id of the newly started resumable write operation. This
   * value should be copied into the `WriteObjectRequest.upload_id` field.
   * </pre>
   *
   * <code>string upload_id = 1;</code>
   * @return The bytes for uploadId.
   */
  com.google.protobuf.ByteString
      getUploadIdBytes();
}