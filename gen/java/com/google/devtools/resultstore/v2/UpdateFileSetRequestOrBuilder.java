// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/resultstore/v2/resultstore_upload.proto

package com.google.devtools.resultstore.v2;

public interface UpdateFileSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.resultstore.v2.UpdateFileSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains the name and fields of the file set to be updated. The name format
   * must be: invocations/${INVOCATION_ID}/fileSets/${FILE_SET_ID}
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.FileSet file_set = 1;</code>
   * @return Whether the fileSet field is set.
   */
  boolean hasFileSet();
  /**
   * <pre>
   * Contains the name and fields of the file set to be updated. The name format
   * must be: invocations/${INVOCATION_ID}/fileSets/${FILE_SET_ID}
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.FileSet file_set = 1;</code>
   * @return The fileSet.
   */
  com.google.devtools.resultstore.v2.FileSet getFileSet();
  /**
   * <pre>
   * Contains the name and fields of the file set to be updated. The name format
   * must be: invocations/${INVOCATION_ID}/fileSets/${FILE_SET_ID}
   * </pre>
   *
   * <code>.google.devtools.resultstore.v2.FileSet file_set = 1;</code>
   */
  com.google.devtools.resultstore.v2.FileSetOrBuilder getFileSetOrBuilder();

  /**
   * <pre>
   * Indicates which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Indicates which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Indicates which fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * This is a token to authorize access to this invocation. It must be set to
   * the same value that was provided in the CreateInvocationRequest.
   * </pre>
   *
   * <code>string authorization_token = 3;</code>
   * @return The authorizationToken.
   */
  java.lang.String getAuthorizationToken();
  /**
   * <pre>
   * This is a token to authorize access to this invocation. It must be set to
   * the same value that was provided in the CreateInvocationRequest.
   * </pre>
   *
   * <code>string authorization_token = 3;</code>
   * @return The bytes for authorizationToken.
   */
  com.google.protobuf.ByteString
      getAuthorizationTokenBytes();

  /**
   * <pre>
   * If true then the Update operation will become a Create operation if the
   * FileSet is NOT_FOUND.
   * </pre>
   *
   * <code>bool create_if_not_found = 4;</code>
   * @return The createIfNotFound.
   */
  boolean getCreateIfNotFound();
}