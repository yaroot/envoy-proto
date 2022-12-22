// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/data_file.proto

package com.google.actions.sdk.v2;

public interface DataFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.DataFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Relative path of the data file from the project root in the SDK file
   * structure.
   * Allowed file paths:
   *     - Images: `resources/images/{multiple
   *     directories}?/{ImageName}.{extension}`
   *     - Audio: `resources/audio/{multiple
   *     directories}?/{AudioFileName}.{extension}`
   *     - Inline Cloud Function Code: `webhooks/{WebhookName}.zip`
   * Allowed extensions:
   *     - Images: `png`, `jpg`, `jpeg`
   *     - Audio: `mp3`, `mpeg`
   *     - Inline Cloud Functions: `zip`
   * </pre>
   *
   * <code>string file_path = 1;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * Relative path of the data file from the project root in the SDK file
   * structure.
   * Allowed file paths:
   *     - Images: `resources/images/{multiple
   *     directories}?/{ImageName}.{extension}`
   *     - Audio: `resources/audio/{multiple
   *     directories}?/{AudioFileName}.{extension}`
   *     - Inline Cloud Function Code: `webhooks/{WebhookName}.zip`
   * Allowed extensions:
   *     - Images: `png`, `jpg`, `jpeg`
   *     - Audio: `mp3`, `mpeg`
   *     - Inline Cloud Functions: `zip`
   * </pre>
   *
   * <code>string file_path = 1;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * Required. The content type of this asset. Example: `text/html`. The content
   * type must comply with the specification
   * (http://www.w3.org/Protocols/rfc1341/4_Content-Type.html).
   * Cloud functions must be in zip format and the content type should
   * be `application/zip;zip_type=cloud_function`. The zip_type parameter
   * indicates that the zip is for a cloud function.
   * </pre>
   *
   * <code>string content_type = 2;</code>
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   * <pre>
   * Required. The content type of this asset. Example: `text/html`. The content
   * type must comply with the specification
   * (http://www.w3.org/Protocols/rfc1341/4_Content-Type.html).
   * Cloud functions must be in zip format and the content type should
   * be `application/zip;zip_type=cloud_function`. The zip_type parameter
   * indicates that the zip is for a cloud function.
   * </pre>
   *
   * <code>string content_type = 2;</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <pre>
   * Content of the data file. Examples would be raw bytes of images, audio
   * files, or cloud function zip format.
   * There is 10 MB strict limit on the payload size.
   * </pre>
   *
   * <code>bytes payload = 3;</code>
   * @return The payload.
   */
  com.google.protobuf.ByteString getPayload();
}