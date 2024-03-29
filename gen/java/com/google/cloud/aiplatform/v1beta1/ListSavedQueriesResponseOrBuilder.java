// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ListSavedQueriesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListSavedQueriesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of SavedQueries that match the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SavedQuery saved_queries = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.SavedQuery> 
      getSavedQueriesList();
  /**
   * <pre>
   * A list of SavedQueries that match the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SavedQuery saved_queries = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SavedQuery getSavedQueries(int index);
  /**
   * <pre>
   * A list of SavedQueries that match the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SavedQuery saved_queries = 1;</code>
   */
  int getSavedQueriesCount();
  /**
   * <pre>
   * A list of SavedQueries that match the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SavedQuery saved_queries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.SavedQueryOrBuilder> 
      getSavedQueriesOrBuilderList();
  /**
   * <pre>
   * A list of SavedQueries that match the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.SavedQuery saved_queries = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SavedQueryOrBuilder getSavedQueriesOrBuilder(
      int index);

  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
