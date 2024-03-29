// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/answer_record.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListAnswerRecordsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListAnswerRecordsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project to list all answer records for in reverse
   * chronological order. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project to list all answer records for in reverse
   * chronological order. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional. Filters to restrict results to specific answer records.
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   * @deprecated google.cloud.dialogflow.v2beta1.ListAnswerRecordsRequest.filter is deprecated.
   *     See google/cloud/dialogflow/v2beta1/answer_record.proto;l=286
   * @return The filter.
   */
  @java.lang.Deprecated java.lang.String getFilter();
  /**
   * <pre>
   * Optional. Filters to restrict results to specific answer records.
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 2 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];</code>
   * @deprecated google.cloud.dialogflow.v2beta1.ListAnswerRecordsRequest.filter is deprecated.
   *     See google/cloud/dialogflow/v2beta1/answer_record.proto;l=286
   * @return The bytes for filter.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Optional. The maximum number of records to return in a single page.
   * The server may return fewer records than this. If unspecified, we use 10.
   * The maximum is 100.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The
   * [ListAnswerRecordsResponse.next_page_token][google.cloud.dialogflow.v2beta1.ListAnswerRecordsResponse.next_page_token]
   * value returned from a previous list request used to continue listing on
   * the next page.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The
   * [ListAnswerRecordsResponse.next_page_token][google.cloud.dialogflow.v2beta1.ListAnswerRecordsResponse.next_page_token]
   * value returned from a previous list request used to continue listing on
   * the next page.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
