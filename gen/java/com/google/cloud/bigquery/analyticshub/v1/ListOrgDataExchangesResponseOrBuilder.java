// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

package com.google.cloud.bigquery.analyticshub.v1;

public interface ListOrgDataExchangesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.ListOrgDataExchangesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchanges = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.analyticshub.v1.DataExchange> 
      getDataExchangesList();
  /**
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchanges = 1;</code>
   */
  com.google.cloud.bigquery.analyticshub.v1.DataExchange getDataExchanges(int index);
  /**
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchanges = 1;</code>
   */
  int getDataExchangesCount();
  /**
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchanges = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.analyticshub.v1.DataExchangeOrBuilder> 
      getDataExchangesOrBuilderList();
  /**
   * <pre>
   * The list of data exchanges.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchanges = 1;</code>
   */
  com.google.cloud.bigquery.analyticshub.v1.DataExchangeOrBuilder getDataExchangesOrBuilder(
      int index);

  /**
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token to request the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}