// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/testing/v1/test_execution.proto

package com.google.devtools.testing.v1;

public interface FileReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.testing.v1.FileReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A path to a file in Google Cloud Storage.
   * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
   * These paths are expected to be url encoded (percent encoding)
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return Whether the gcsPath field is set.
   */
  boolean hasGcsPath();
  /**
   * <pre>
   * A path to a file in Google Cloud Storage.
   * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
   * These paths are expected to be url encoded (percent encoding)
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return The gcsPath.
   */
  java.lang.String getGcsPath();
  /**
   * <pre>
   * A path to a file in Google Cloud Storage.
   * Example: gs://build-app-1414623860166/app%40debug-unaligned.apk
   * These paths are expected to be url encoded (percent encoding)
   * </pre>
   *
   * <code>string gcs_path = 1;</code>
   * @return The bytes for gcsPath.
   */
  com.google.protobuf.ByteString
      getGcsPathBytes();

  public com.google.devtools.testing.v1.FileReference.FileCase getFileCase();
}