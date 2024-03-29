// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

public interface AclEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.AclEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The allowlisted value for the access control list.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The allowlisted value for the access control list.
   * </pre>
   *
   * <code>string value = 1;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <pre>
   * The time when this access control entry expires in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   * <pre>
   * The time when this access control entry expires in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   * <pre>
   * The time when this access control entry expires in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   * <pre>
   * Optional. A label to identify this entry.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional. A label to identify this entry.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * This is always `sql#aclEntry`.
   * </pre>
   *
   * <code>string kind = 4;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * This is always `sql#aclEntry`.
   * </pre>
   *
   * <code>string kind = 4;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();
}
