// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/searchads360/v0/services/search_ads360_service.proto

package com.google.ads.searchads360.v0.services;

public interface SearchSearchAds360StreamResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.searchads360.v0.services.SearchSearchAds360StreamResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.SearchAds360Row results = 1;</code>
   */
  java.util.List<com.google.ads.searchads360.v0.services.SearchAds360Row> 
      getResultsList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.SearchAds360Row results = 1;</code>
   */
  com.google.ads.searchads360.v0.services.SearchAds360Row getResults(int index);
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.SearchAds360Row results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.SearchAds360Row results = 1;</code>
   */
  java.util.List<? extends com.google.ads.searchads360.v0.services.SearchAds360RowOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * The list of rows that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.SearchAds360Row results = 1;</code>
   */
  com.google.ads.searchads360.v0.services.SearchAds360RowOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * FieldMask that represents what fields were requested by the user.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.services.SearchAds360Row summary_row = 3;</code>
   * @return Whether the summaryRow field is set.
   */
  boolean hasSummaryRow();
  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.services.SearchAds360Row summary_row = 3;</code>
   * @return The summaryRow.
   */
  com.google.ads.searchads360.v0.services.SearchAds360Row getSummaryRow();
  /**
   * <pre>
   * Summary row that contains summary of metrics in results.
   * Summary of metrics means aggregation of metrics across all results,
   * here aggregation could be sum, average, rate, etc.
   * </pre>
   *
   * <code>.google.ads.searchads360.v0.services.SearchAds360Row summary_row = 3;</code>
   */
  com.google.ads.searchads360.v0.services.SearchAds360RowOrBuilder getSummaryRowOrBuilder();

  /**
   * <pre>
   * The headers of the custom columns in the results.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.CustomColumnHeader custom_column_headers = 5;</code>
   */
  java.util.List<com.google.ads.searchads360.v0.services.CustomColumnHeader> 
      getCustomColumnHeadersList();
  /**
   * <pre>
   * The headers of the custom columns in the results.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.CustomColumnHeader custom_column_headers = 5;</code>
   */
  com.google.ads.searchads360.v0.services.CustomColumnHeader getCustomColumnHeaders(int index);
  /**
   * <pre>
   * The headers of the custom columns in the results.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.CustomColumnHeader custom_column_headers = 5;</code>
   */
  int getCustomColumnHeadersCount();
  /**
   * <pre>
   * The headers of the custom columns in the results.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.CustomColumnHeader custom_column_headers = 5;</code>
   */
  java.util.List<? extends com.google.ads.searchads360.v0.services.CustomColumnHeaderOrBuilder> 
      getCustomColumnHeadersOrBuilderList();
  /**
   * <pre>
   * The headers of the custom columns in the results.
   * </pre>
   *
   * <code>repeated .google.ads.searchads360.v0.services.CustomColumnHeader custom_column_headers = 5;</code>
   */
  com.google.ads.searchads360.v0.services.CustomColumnHeaderOrBuilder getCustomColumnHeadersOrBuilder(
      int index);

  /**
   * <pre>
   * The unique id of the request that is used for debugging purposes.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * The unique id of the request that is used for debugging purposes.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}