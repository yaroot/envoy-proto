// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/actions/sdk/v2/actions_sdk.proto

package com.google.actions.sdk.v2;

public interface CreateVersionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.actions.sdk.v2.CreateVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent resource name in the format `projects/{project}`. The
   * `{project}` is the cloud project ID associated with the project.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent resource name in the format `projects/{project}`. The
   * `{project}` is the cloud project ID associated with the project.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. List of files sent to the server at a time. This is a list of config files
   * or data files.
   * 1. The first request must be a ConfigFiles.
   * 2. The first request must have a ConfigFile with 'settings'.
   * 3. The first request must have a ConfigFile with 'manifest'.
   * 4. The webhook ConfigFile corresponding to inline cloud function must be
   *    streamed before the DataFile corresponding to its source code.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.Files files = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the files field is set.
   */
  boolean hasFiles();
  /**
   * <pre>
   * Required. List of files sent to the server at a time. This is a list of config files
   * or data files.
   * 1. The first request must be a ConfigFiles.
   * 2. The first request must have a ConfigFile with 'settings'.
   * 3. The first request must have a ConfigFile with 'manifest'.
   * 4. The webhook ConfigFile corresponding to inline cloud function must be
   *    streamed before the DataFile corresponding to its source code.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.Files files = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The files.
   */
  com.google.actions.sdk.v2.Files getFiles();
  /**
   * <pre>
   * Required. List of files sent to the server at a time. This is a list of config files
   * or data files.
   * 1. The first request must be a ConfigFiles.
   * 2. The first request must have a ConfigFile with 'settings'.
   * 3. The first request must have a ConfigFile with 'manifest'.
   * 4. The webhook ConfigFile corresponding to inline cloud function must be
   *    streamed before the DataFile corresponding to its source code.
   * </pre>
   *
   * <code>.google.actions.sdk.v2.Files files = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.actions.sdk.v2.FilesOrBuilder getFilesOrBuilder();

  /**
   * <pre>
   * Optional. The release channel to deploy the version, if specified. The supported
   * built in release channels are actions.channels.Production,
   * actions.channels.ClosedBeta, actions.channels.Alpha.
   * .
   * </pre>
   *
   * <code>string release_channel = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The releaseChannel.
   */
  java.lang.String getReleaseChannel();
  /**
   * <pre>
   * Optional. The release channel to deploy the version, if specified. The supported
   * built in release channels are actions.channels.Production,
   * actions.channels.ClosedBeta, actions.channels.Alpha.
   * .
   * </pre>
   *
   * <code>string release_channel = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for releaseChannel.
   */
  com.google.protobuf.ByteString
      getReleaseChannelBytes();
}