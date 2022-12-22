// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/dataexchange/v1beta1/dataexchange.proto

package com.google.cloud.bigquery.dataexchange.v1beta1;

public interface PublisherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.dataexchange.v1beta1.Publisher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Name of the listing publisher.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Optional. Name of the listing publisher.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Email or URL of the listing publisher.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The primaryContact.
   */
  java.lang.String getPrimaryContact();
  /**
   * <pre>
   * Optional. Email or URL of the listing publisher.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for primaryContact.
   */
  com.google.protobuf.ByteString
      getPrimaryContactBytes();
}
