// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1/cloud_sql_ssl_certs.proto

package com.google.cloud.sql.v1;

public interface SslCertsInsertRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1.SslCertsInsertRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User supplied name.  Must be a distinct name from the other certificates
   * for this instance.
   * </pre>
   *
   * <code>string common_name = 1;</code>
   * @return The commonName.
   */
  java.lang.String getCommonName();
  /**
   * <pre>
   * User supplied name.  Must be a distinct name from the other certificates
   * for this instance.
   * </pre>
   *
   * <code>string common_name = 1;</code>
   * @return The bytes for commonName.
   */
  com.google.protobuf.ByteString
      getCommonNameBytes();
}
