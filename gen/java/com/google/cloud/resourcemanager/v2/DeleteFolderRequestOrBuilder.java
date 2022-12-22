// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v2/folders.proto

package com.google.cloud.resourcemanager.v2;

public interface DeleteFolderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v2.DeleteFolderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the Folder to be deleted.
   * Must be of the form `folders/{folder_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the Folder to be deleted.
   * Must be of the form `folders/{folder_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Instructs DeleteFolderAction to delete a folder even when the folder is not
   * empty.
   * </pre>
   *
   * <code>bool recursive_delete = 2;</code>
   * @return The recursiveDelete.
   */
  boolean getRecursiveDelete();
}