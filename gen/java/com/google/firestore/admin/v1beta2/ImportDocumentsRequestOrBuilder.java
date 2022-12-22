// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1beta2/firestore_admin.proto

package com.google.firestore.admin.v1beta2;

public interface ImportDocumentsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.firestore.admin.v1beta2.ImportDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Database to import into. Should be of the form:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Database to import into. Should be of the form:
   * `projects/{project_id}/databases/{database_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   * @return A list containing the collectionIds.
   */
  java.util.List<java.lang.String>
      getCollectionIdsList();
  /**
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   * @return The count of collectionIds.
   */
  int getCollectionIdsCount();
  /**
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The collectionIds at the given index.
   */
  java.lang.String getCollectionIds(int index);
  /**
   * <pre>
   * Which collection ids to import. Unspecified means all collections included
   * in the import.
   * </pre>
   *
   * <code>repeated string collection_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the collectionIds at the given index.
   */
  com.google.protobuf.ByteString
      getCollectionIdsBytes(int index);

  /**
   * <pre>
   * Location of the exported files.
   * This must match the output_uri_prefix of an ExportDocumentsResponse from
   * an export that has completed successfully.
   * See:
   * [google.firestore.admin.v1beta2.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1beta2.ExportDocumentsResponse.output_uri_prefix].
   * </pre>
   *
   * <code>string input_uri_prefix = 3;</code>
   * @return The inputUriPrefix.
   */
  java.lang.String getInputUriPrefix();
  /**
   * <pre>
   * Location of the exported files.
   * This must match the output_uri_prefix of an ExportDocumentsResponse from
   * an export that has completed successfully.
   * See:
   * [google.firestore.admin.v1beta2.ExportDocumentsResponse.output_uri_prefix][google.firestore.admin.v1beta2.ExportDocumentsResponse.output_uri_prefix].
   * </pre>
   *
   * <code>string input_uri_prefix = 3;</code>
   * @return The bytes for inputUriPrefix.
   */
  com.google.protobuf.ByteString
      getInputUriPrefixBytes();
}