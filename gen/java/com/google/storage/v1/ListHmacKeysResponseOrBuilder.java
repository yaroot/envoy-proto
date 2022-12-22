// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage.proto

package com.google.storage.v1;

public interface ListHmacKeysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.storage.v1.ListHmacKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The continuation token, used to page through large result sets. Provide
   * this value in a subsequent request to return the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 1;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The continuation token, used to page through large result sets. Provide
   * this value in a subsequent request to return the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 1;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * The list of items.
   * </pre>
   *
   * <code>repeated .google.storage.v1.HmacKeyMetadata items = 2;</code>
   */
  java.util.List<com.google.storage.v1.HmacKeyMetadata> 
      getItemsList();
  /**
   * <pre>
   * The list of items.
   * </pre>
   *
   * <code>repeated .google.storage.v1.HmacKeyMetadata items = 2;</code>
   */
  com.google.storage.v1.HmacKeyMetadata getItems(int index);
  /**
   * <pre>
   * The list of items.
   * </pre>
   *
   * <code>repeated .google.storage.v1.HmacKeyMetadata items = 2;</code>
   */
  int getItemsCount();
  /**
   * <pre>
   * The list of items.
   * </pre>
   *
   * <code>repeated .google.storage.v1.HmacKeyMetadata items = 2;</code>
   */
  java.util.List<? extends com.google.storage.v1.HmacKeyMetadataOrBuilder> 
      getItemsOrBuilderList();
  /**
   * <pre>
   * The list of items.
   * </pre>
   *
   * <code>repeated .google.storage.v1.HmacKeyMetadata items = 2;</code>
   */
  com.google.storage.v1.HmacKeyMetadataOrBuilder getItemsOrBuilder(
      int index);
}