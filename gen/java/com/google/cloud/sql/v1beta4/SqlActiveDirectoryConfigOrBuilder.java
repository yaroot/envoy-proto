// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

public interface SqlActiveDirectoryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.SqlActiveDirectoryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is always sql#activeDirectoryConfig.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * This is always sql#activeDirectoryConfig.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * The name of the domain (e.g., mydomain.com).
   * </pre>
   *
   * <code>string domain = 2;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * The name of the domain (e.g., mydomain.com).
   * </pre>
   *
   * <code>string domain = 2;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();
}