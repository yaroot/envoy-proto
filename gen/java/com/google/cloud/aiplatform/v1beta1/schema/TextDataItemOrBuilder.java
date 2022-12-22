// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/data_item_payload.proto

package com.google.cloud.aiplatform.v1beta1.schema;

public interface TextDataItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.TextDataItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Google Cloud Storage URI points to the original text in user's bucket.
   * The text file is up to 10MB in size.
   * </pre>
   *
   * <code>string gcs_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   * <pre>
   * Output only. Google Cloud Storage URI points to the original text in user's bucket.
   * The text file is up to 10MB in size.
   * </pre>
   *
   * <code>string gcs_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString
      getGcsUriBytes();
}