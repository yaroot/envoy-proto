// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface DestinationConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.DestinationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Destination connection profile resource.
   * Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
   * </pre>
   *
   * <code>string destination_connection_profile = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The destinationConnectionProfile.
   */
  java.lang.String getDestinationConnectionProfile();
  /**
   * <pre>
   * Required. Destination connection profile resource.
   * Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
   * </pre>
   *
   * <code>string destination_connection_profile = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for destinationConnectionProfile.
   */
  com.google.protobuf.ByteString
      getDestinationConnectionProfileBytes();

  /**
   * <pre>
   * A configuration for how data should be loaded to Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.GcsDestinationConfig gcs_destination_config = 100;</code>
   * @return Whether the gcsDestinationConfig field is set.
   */
  boolean hasGcsDestinationConfig();
  /**
   * <pre>
   * A configuration for how data should be loaded to Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.GcsDestinationConfig gcs_destination_config = 100;</code>
   * @return The gcsDestinationConfig.
   */
  com.google.cloud.datastream.v1.GcsDestinationConfig getGcsDestinationConfig();
  /**
   * <pre>
   * A configuration for how data should be loaded to Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.GcsDestinationConfig gcs_destination_config = 100;</code>
   */
  com.google.cloud.datastream.v1.GcsDestinationConfigOrBuilder getGcsDestinationConfigOrBuilder();

  /**
   * <pre>
   * BigQuery destination configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BigQueryDestinationConfig bigquery_destination_config = 101;</code>
   * @return Whether the bigqueryDestinationConfig field is set.
   */
  boolean hasBigqueryDestinationConfig();
  /**
   * <pre>
   * BigQuery destination configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BigQueryDestinationConfig bigquery_destination_config = 101;</code>
   * @return The bigqueryDestinationConfig.
   */
  com.google.cloud.datastream.v1.BigQueryDestinationConfig getBigqueryDestinationConfig();
  /**
   * <pre>
   * BigQuery destination configuration.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.BigQueryDestinationConfig bigquery_destination_config = 101;</code>
   */
  com.google.cloud.datastream.v1.BigQueryDestinationConfigOrBuilder getBigqueryDestinationConfigOrBuilder();

  public com.google.cloud.datastream.v1.DestinationConfig.DestinationStreamConfigCase getDestinationStreamConfigCase();
}
