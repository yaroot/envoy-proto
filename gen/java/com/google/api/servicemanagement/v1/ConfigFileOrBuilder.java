// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/servicemanagement/v1/resources.proto

package com.google.api.servicemanagement.v1;

public interface ConfigFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.servicemanagement.v1.ConfigFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The file name of the configuration file (full or relative path).
   * </pre>
   *
   * <code>string file_path = 1;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * The file name of the configuration file (full or relative path).
   * </pre>
   *
   * <code>string file_path = 1;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * The bytes that constitute the file.
   * </pre>
   *
   * <code>bytes file_contents = 3;</code>
   * @return The fileContents.
   */
  com.google.protobuf.ByteString getFileContents();

  /**
   * <pre>
   * The type of configuration file this represents.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
   * @return The enum numeric value on the wire for fileType.
   */
  int getFileTypeValue();
  /**
   * <pre>
   * The type of configuration file this represents.
   * </pre>
   *
   * <code>.google.api.servicemanagement.v1.ConfigFile.FileType file_type = 4;</code>
   * @return The fileType.
   */
  com.google.api.servicemanagement.v1.ConfigFile.FileType getFileType();
}