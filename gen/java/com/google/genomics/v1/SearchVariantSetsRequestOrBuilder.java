// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface SearchVariantSetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchVariantSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Exactly one dataset ID must be provided here. Only variant sets which
   * belong to this dataset will be returned.
   * </pre>
   *
   * <code>repeated string dataset_ids = 1;</code>
   * @return A list containing the datasetIds.
   */
  java.util.List<java.lang.String>
      getDatasetIdsList();
  /**
   * <pre>
   * Exactly one dataset ID must be provided here. Only variant sets which
   * belong to this dataset will be returned.
   * </pre>
   *
   * <code>repeated string dataset_ids = 1;</code>
   * @return The count of datasetIds.
   */
  int getDatasetIdsCount();
  /**
   * <pre>
   * Exactly one dataset ID must be provided here. Only variant sets which
   * belong to this dataset will be returned.
   * </pre>
   *
   * <code>repeated string dataset_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The datasetIds at the given index.
   */
  java.lang.String getDatasetIds(int index);
  /**
   * <pre>
   * Exactly one dataset ID must be provided here. Only variant sets which
   * belong to this dataset will be returned.
   * </pre>
   *
   * <code>repeated string dataset_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the datasetIds at the given index.
   */
  com.google.protobuf.ByteString
      getDatasetIdsBytes(int index);

  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of results to return in a single page. If unspecified,
   * defaults to 1024.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();
}