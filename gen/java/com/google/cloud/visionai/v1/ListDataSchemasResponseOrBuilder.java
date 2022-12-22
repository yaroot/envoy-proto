// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/warehouse.proto

package com.google.cloud.visionai.v1;

public interface ListDataSchemasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ListDataSchemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The data schemas from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.DataSchema data_schemas = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.DataSchema> 
      getDataSchemasList();
  /**
   * <pre>
   * The data schemas from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.DataSchema data_schemas = 1;</code>
   */
  com.google.cloud.visionai.v1.DataSchema getDataSchemas(int index);
  /**
   * <pre>
   * The data schemas from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.DataSchema data_schemas = 1;</code>
   */
  int getDataSchemasCount();
  /**
   * <pre>
   * The data schemas from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.DataSchema data_schemas = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.DataSchemaOrBuilder> 
      getDataSchemasOrBuilderList();
  /**
   * <pre>
   * The data schemas from the specified corpus.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.DataSchema data_schemas = 1;</code>
   */
  com.google.cloud.visionai.v1.DataSchemaOrBuilder getDataSchemasOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}