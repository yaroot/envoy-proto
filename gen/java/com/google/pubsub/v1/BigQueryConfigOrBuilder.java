// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface BigQueryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.BigQueryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the table to which to write data, of the form
   * {projectId}:{datasetId}.{tableId}
   * </pre>
   *
   * <code>string table = 1;</code>
   * @return The table.
   */
  java.lang.String getTable();
  /**
   * <pre>
   * The name of the table to which to write data, of the form
   * {projectId}:{datasetId}.{tableId}
   * </pre>
   *
   * <code>string table = 1;</code>
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString
      getTableBytes();

  /**
   * <pre>
   * When true, use the topic's schema as the columns to write to in BigQuery,
   * if it exists.
   * </pre>
   *
   * <code>bool use_topic_schema = 2;</code>
   * @return The useTopicSchema.
   */
  boolean getUseTopicSchema();

  /**
   * <pre>
   * When true, write the subscription name, message_id, publish_time,
   * attributes, and ordering_key to additional columns in the table. The
   * subscription name, message_id, and publish_time fields are put in their own
   * columns while all other message properties (other than data) are written to
   * a JSON object in the attributes column.
   * </pre>
   *
   * <code>bool write_metadata = 3;</code>
   * @return The writeMetadata.
   */
  boolean getWriteMetadata();

  /**
   * <pre>
   * When true and use_topic_schema is true, any fields that are a part of the
   * topic schema that are not part of the BigQuery table schema are dropped
   * when writing to BigQuery. Otherwise, the schemas must be kept in sync and
   * any messages with extra fields are not written and remain in the
   * subscription's backlog.
   * </pre>
   *
   * <code>bool drop_unknown_fields = 4;</code>
   * @return The dropUnknownFields.
   */
  boolean getDropUnknownFields();

  /**
   * <pre>
   * Output only. An output-only field that indicates whether or not the
   * subscription can receive messages.
   * </pre>
   *
   * <code>.google.pubsub.v1.BigQueryConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. An output-only field that indicates whether or not the
   * subscription can receive messages.
   * </pre>
   *
   * <code>.google.pubsub.v1.BigQueryConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.pubsub.v1.BigQueryConfig.State getState();
}
