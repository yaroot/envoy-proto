// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_connect.proto

package com.google.cloud.sql.v1beta4;

public interface GenerateEphemeralCertRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.GenerateEphemeralCertRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Cloud SQL instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 1;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Cloud SQL instance ID. This does not include the project ID.
   * </pre>
   *
   * <code>string instance = 1;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * Project ID of the project that contains the instance.
   * </pre>
   *
   * <code>string project = 2;</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID of the project that contains the instance.
   * </pre>
   *
   * <code>string project = 2;</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * PEM encoded public key to include in the signed certificate.
   * </pre>
   *
   * <code>string public_key = 3;</code>
   * @return The publicKey.
   */
  java.lang.String getPublicKey();
  /**
   * <pre>
   * PEM encoded public key to include in the signed certificate.
   * </pre>
   *
   * <code>string public_key = 3;</code>
   * @return The bytes for publicKey.
   */
  com.google.protobuf.ByteString
      getPublicKeyBytes();

  /**
   * <pre>
   * Optional. Access token to include in the signed certificate.
   * </pre>
   *
   * <code>string access_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <pre>
   * Optional. Access token to include in the signed certificate.
   * </pre>
   *
   * <code>string access_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <pre>
   * Optional. Optional snapshot read timestamp to trade freshness for performance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   * <pre>
   * Optional. Optional snapshot read timestamp to trade freshness for performance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   * <pre>
   * Optional. Optional snapshot read timestamp to trade freshness for performance.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   * <pre>
   * Optional. If set, it will contain the cert valid duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration valid_duration = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the validDuration field is set.
   */
  boolean hasValidDuration();
  /**
   * <pre>
   * Optional. If set, it will contain the cert valid duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration valid_duration = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validDuration.
   */
  com.google.protobuf.Duration getValidDuration();
  /**
   * <pre>
   * Optional. If set, it will contain the cert valid duration.
   * </pre>
   *
   * <code>.google.protobuf.Duration valid_duration = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.DurationOrBuilder getValidDurationOrBuilder();
}