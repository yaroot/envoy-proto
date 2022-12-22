// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/data_item_payload.proto

package com.google.cloud.aiplatform.v1beta1.schema;

public interface ImageDataItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.ImageDataItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage URI points to the original image in user's bucket.
   * The image is up to 30MB in size.
   * </pre>
   *
   * <code>string gcs_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcsUri.
   */
  java.lang.String getGcsUri();
  /**
   * <pre>
   * Required. Google Cloud Storage URI points to the original image in user's bucket.
   * The image is up to 30MB in size.
   * </pre>
   *
   * <code>string gcs_uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for gcsUri.
   */
  com.google.protobuf.ByteString
      getGcsUriBytes();

  /**
   * <pre>
   * Output only. The mime type of the content of the image. Only the images in below listed
   * mime types are supported.
   * - image/jpeg
   * - image/gif
   * - image/png
   * - image/webp
   * - image/bmp
   * - image/tiff
   * - image/vnd.microsoft.icon
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   * <pre>
   * Output only. The mime type of the content of the image. Only the images in below listed
   * mime types are supported.
   * - image/jpeg
   * - image/gif
   * - image/png
   * - image/webp
   * - image/bmp
   * - image/tiff
   * - image/vnd.microsoft.icon
   * </pre>
   *
   * <code>string mime_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString
      getMimeTypeBytes();
}