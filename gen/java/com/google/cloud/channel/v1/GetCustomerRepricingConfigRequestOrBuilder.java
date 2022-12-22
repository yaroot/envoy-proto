// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface GetCustomerRepricingConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.GetCustomerRepricingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the CustomerRepricingConfig.
   * Format:
   * accounts/{account_id}/customers/{customer_id}/customerRepricingConfigs/{id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name of the CustomerRepricingConfig.
   * Format:
   * accounts/{account_id}/customers/{customer_id}/customerRepricingConfigs/{id}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}