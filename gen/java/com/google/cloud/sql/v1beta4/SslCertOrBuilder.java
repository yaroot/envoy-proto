// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/sql/v1beta4/cloud_sql_resources.proto

package com.google.cloud.sql.v1beta4;

public interface SslCertOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.sql.v1beta4.SslCert)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is always `sql#sslCert`.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * This is always `sql#sslCert`.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * Serial number, as extracted from the certificate.
   * </pre>
   *
   * <code>string cert_serial_number = 2;</code>
   * @return The certSerialNumber.
   */
  java.lang.String getCertSerialNumber();
  /**
   * <pre>
   * Serial number, as extracted from the certificate.
   * </pre>
   *
   * <code>string cert_serial_number = 2;</code>
   * @return The bytes for certSerialNumber.
   */
  com.google.protobuf.ByteString
      getCertSerialNumberBytes();

  /**
   * <pre>
   * PEM representation.
   * </pre>
   *
   * <code>string cert = 3;</code>
   * @return The cert.
   */
  java.lang.String getCert();
  /**
   * <pre>
   * PEM representation.
   * </pre>
   *
   * <code>string cert = 3;</code>
   * @return The bytes for cert.
   */
  com.google.protobuf.ByteString
      getCertBytes();

  /**
   * <pre>
   * The time when the certificate was created in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * The time when the certificate was created in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * The time when the certificate was created in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * User supplied name.  Constrained to [a-zA-Z.-_ ]+.
   * </pre>
   *
   * <code>string common_name = 5;</code>
   * @return The commonName.
   */
  java.lang.String getCommonName();
  /**
   * <pre>
   * User supplied name.  Constrained to [a-zA-Z.-_ ]+.
   * </pre>
   *
   * <code>string common_name = 5;</code>
   * @return The bytes for commonName.
   */
  com.google.protobuf.ByteString
      getCommonNameBytes();

  /**
   * <pre>
   * The time when the certificate expires in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   * <pre>
   * The time when the certificate expires in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   * <pre>
   * The time when the certificate expires in
   * [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example
   * `2012-11-15T16:19:00.094Z`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   * <pre>
   * Sha1 Fingerprint.
   * </pre>
   *
   * <code>string sha1_fingerprint = 7;</code>
   * @return The sha1Fingerprint.
   */
  java.lang.String getSha1Fingerprint();
  /**
   * <pre>
   * Sha1 Fingerprint.
   * </pre>
   *
   * <code>string sha1_fingerprint = 7;</code>
   * @return The bytes for sha1Fingerprint.
   */
  com.google.protobuf.ByteString
      getSha1FingerprintBytes();

  /**
   * <pre>
   * Name of the database instance.
   * </pre>
   *
   * <code>string instance = 8;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * Name of the database instance.
   * </pre>
   *
   * <code>string instance = 8;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();

  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string self_link = 9;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * The URI of this resource.
   * </pre>
   *
   * <code>string self_link = 9;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();
}
