// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/market/v2/resources.proto

package com.google.ccc.hosted.marketplace.v2;

public interface CustomerLicenseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ccc.hosted.marketplace.v2.CustomerLicense)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of API resource. This is always appsmarket#customerLicense.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * The type of API resource. This is always appsmarket#customerLicense.
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * The customer's license status. One of:
   * - `ACTIVE`: The customer has a valid license.
   * - `UNLICENSED`: There is no license: either this customer has never
   * installed your application, or else has deleted it.
   * </pre>
   *
   * <code>string state = 2;</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <pre>
   * The customer's license status. One of:
   * - `ACTIVE`: The customer has a valid license.
   * - `UNLICENSED`: There is no license: either this customer has never
   * installed your application, or else has deleted it.
   * </pre>
   *
   * <code>string state = 2;</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <pre>
   * The ID of the application corresponding to this license query.
   * </pre>
   *
   * <code>string application_id = 3;</code>
   * @return The applicationId.
   */
  java.lang.String getApplicationId();
  /**
   * <pre>
   * The ID of the application corresponding to this license query.
   * </pre>
   *
   * <code>string application_id = 3;</code>
   * @return The bytes for applicationId.
   */
  com.google.protobuf.ByteString
      getApplicationIdBytes();

  /**
   * <pre>
   * (Deprecated)
   * </pre>
   *
   * <code>repeated .ccc.hosted.marketplace.v2.CustomerLicense.Editions editions = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<com.google.ccc.hosted.marketplace.v2.CustomerLicense.Editions> 
      getEditionsList();
  /**
   * <pre>
   * (Deprecated)
   * </pre>
   *
   * <code>repeated .ccc.hosted.marketplace.v2.CustomerLicense.Editions editions = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.ccc.hosted.marketplace.v2.CustomerLicense.Editions getEditions(int index);
  /**
   * <pre>
   * (Deprecated)
   * </pre>
   *
   * <code>repeated .ccc.hosted.marketplace.v2.CustomerLicense.Editions editions = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getEditionsCount();
  /**
   * <pre>
   * (Deprecated)
   * </pre>
   *
   * <code>repeated .ccc.hosted.marketplace.v2.CustomerLicense.Editions editions = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<? extends com.google.ccc.hosted.marketplace.v2.CustomerLicense.EditionsOrBuilder> 
      getEditionsOrBuilderList();
  /**
   * <pre>
   * (Deprecated)
   * </pre>
   *
   * <code>repeated .ccc.hosted.marketplace.v2.CustomerLicense.Editions editions = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.ccc.hosted.marketplace.v2.CustomerLicense.EditionsOrBuilder getEditionsOrBuilder(
      int index);

  /**
   * <pre>
   * The ID of the customer license.
   * </pre>
   *
   * <code>string id = 101;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the customer license.
   * </pre>
   *
   * <code>string id = 101;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The domain name of the customer.
   * </pre>
   *
   * <code>string customer_id = 102;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The domain name of the customer.
   * </pre>
   *
   * <code>string customer_id = 102;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();
}